package evospex.ga.chromosome;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import cucumber.api.java.lv.Un;
import evospex.expression.ExprBuilder;
import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.ExprName;
import evospex.expression.ExprOperator;
import evospex.expression.evaluator.ExpressionEvaluator;
import evospex.expression.evaluator.NonEvaluableExpressionException;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import org.jgap.RandomGenerator;

import evospex.ConfigurationProperties;
import evospex.target.MethodExecution;
import rfm.dynalloy.Err;
import rfm.dynalloy.SafeList;
import rfm.dynalloyCompiler.ast.Expr;
import rfm.dynalloyCompiler.ast.ExprBinary;
import rfm.dynalloyCompiler.ast.ExprCall;
import rfm.dynalloyCompiler.ast.ExprConstant;
import rfm.dynalloyCompiler.ast.ExprQt;
import rfm.dynalloyCompiler.ast.ExprUnary;
import rfm.dynalloyCompiler.ast.ExprVar;
import rfm.dynalloyCompiler.ast.Sig;
import rfm.dynalloyCompiler.ast.Type;
import rfm.dynalloyCompiler.translator.A4Solution;
import rfm.dynalloyCompiler.translator.A4Tuple;
import rfm.dynalloyCompiler.translator.A4TupleSet;
import utils.TargetInformation;
import utils.DynAlloyExpressionsUtils;
import utils.EvoSpexParameters;
import wrapper.DynAlloyRunner;

/**
 * This class represents a Genes Factory, which allows to create the initial population of
 * Chromosomes as well as provides methods to create specific genes.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ChromosomeGenesFactory {

  private Configuration conf;
  private DynAlloyRunner runner;
  private int genes_num;
  private final TargetInformation contextInfo;
  private EvoSpexParameters parameters;

  /**
   * Constructor
   */
  public ChromosomeGenesFactory(Configuration conf, DynAlloyRunner runner, int genes,
                                TargetInformation info, EvoSpexParameters params) {
    this.conf = conf;
    this.runner = runner;
    genes_num = genes;
    contextInfo = info;
    parameters = params;
  }

  /**
   * Build the initial population of chromosomes
   * The initial population is built by the following process:
   * 1. Randomly obtain positive and negative example from the provided test suite
   * 2. For each example, use the information extracted from the target class and method
   * to evaluate a set of expressions on each example, and then creating candidate specs
   * from the evaluations results.
   * @return the initial population
   */
  public List<SpecChromosome> buildInitialPopulation() {
    LinkedList<SpecChromosome> chromosomes = new LinkedList<>();
    int examplesConsidered = 0;
    Object resultExample = EvoSpexParameters.RESULT_EXAMPLE;
    List<Object> argsExample = EvoSpexParameters.ARGS_EXAMPLES;
    List<MethodExecution> allPositives = parameters.getPositiveObjects();
    List<MethodExecution> allNegatives = parameters.getNegativeObjects();

    Random r = new Random();
    boolean addComplex = true; // Add complex formulas (comparisons, quantifications, result, args)
    while (examplesConsidered < parameters.getAmountOfExamplesForInitialChromosomesGeneration()) {
      // Get a random positive and negative objects
      MethodExecution pos = allPositives.get(r.nextInt(allPositives.size()));
      MethodExecution neg = allNegatives.get(r.nextInt(allNegatives.size()));

      try {
        chromosomes.addAll(generateChromosomesFromObject(pos.getObjectFinalState(), true,
            resultExample, argsExample, addComplex));
        chromosomes.addAll(generateChromosomesFromObject(neg.getObjectFinalState(), false,
            resultExample, argsExample, addComplex));
      } catch (Exception e) {
        e.printStackTrace();
      }

      addComplex = false; // Only once
      examplesConsidered += 2;

    }
    if (resultExample != null
        && (resultExample instanceof Integer || resultExample instanceof Double)) {
      contextInfo.addVariableForType(Integer.class.getSimpleName(), "result");
    }

    return chromosomes;
  }

  /**
   * Generates a list of individuals from an instance of the target class
   * @param o is an instance of the target class
   * @param isPositive indicates if belongs to a positive or negative example
   * @param resultExample is an example of a method execution result
   * @param argsExamples is an example of a method execution arguments
   * @param addComplex indicates if complex expressions (quantification, etc) must be computed from the example
   * @return a list of individuals computed from the given arguments
   */
  public List<SpecChromosome> generateChromosomesFromObject(Object o, boolean isPositive,
      Object resultExample, List<Object> argsExamples, boolean addComplex)
      throws InvalidConfigurationException, Err {
    List<SpecChromosome> chromosomes = new LinkedList<>();
    List<Gene> genes = createGenesFromObject(o, isPositive, resultExample, argsExamples,
        addComplex);

    if (parameters.getInitialChromosomesUnary()) {
      // For each gene create one chromosome that contains just one gene at the first position:
      // [gene, true, true, ... , true]
      for (int i = 0; i < genes.size(); i++) {
        Gene[] new_genes = new Gene[genes_num];
        ExprGene exprGene = (ExprGene) genes.get(i);
        ExprGene newExprGene = new ExprGene(conf, exprGene.getValue().clone(), contextInfo);
        ExprContext expr = exprGene.getValue().getExpression();
        if (!isPositive && expr.qt_expr() == null) {
          // Negate the expression
          throw new UnsupportedOperationException("negate the expression expr and set it the new expr gene");
        }
        // Always the gene must be in the first position
        new_genes[0] = newExprGene;
        // The rest of the genes vales is : true
        for (int j = 1; j < new_genes.length; j++) {
          new_genes[j] = new ExprGene(conf, new ExprGeneValue(ExprBuilder.toExprContext(ExprName.TRUE)), contextInfo);
        }
        SpecChromosome chromosome = new SpecChromosome(conf, new_genes);
        chromosome.setFitnessValueDirectly(-1);
        chromosomes.add(chromosome);
      }
    } else {
      // Create chromosomes with each gene randomly picked.
      genes.add(new ExprGene(conf, new ExprGeneValue(ExprBuilder.toExprContext(ExprName.TRUE)), contextInfo));
      int chromosomesToCreate = parameters.getPopulationSize()
          / parameters.getAmountOfExamplesForInitialChromosomesGeneration();
      for (int i = 0; i < chromosomesToCreate; i++) {
        Gene[] new_genes = new Gene[genes_num];
        int genes_to_fill = conf.getRandomGenerator().nextInt(genes_num);
        Set<Integer> usedGenes = new HashSet<>();
        for (int j = 0; j < genes_to_fill; j++) {
          RandomGenerator generator = conf.getRandomGenerator();
          int r = generator.nextInt(genes.size());
          if (usedGenes.add(r))
            new_genes[j] = genes.get(r);
          else
            new_genes[j] = ((ExprGene) genes.get(r)).clone();
        }
        for (int j = genes_to_fill; j < genes_num; j++) {
          new_genes[j] = new ExprGene(conf, new ExprGeneValue(ExprBuilder.toExprContext(ExprName.TRUE)), contextInfo);
        }
        SpecChromosome chromosome = new SpecChromosome(conf, new_genes);
        chromosome.setFitnessValueDirectly(-1);
        chromosomes.add(chromosome);
      }
    }
    return chromosomes;
  }

  /**
   * Generates a list of genes to be part of the chromosome built from an instance of the target class
   * @param o is an instance of the target class
   * @param isPositive indicates if belongs to a positive or negative example
   * @param resultExample is an example of a method execution result
   * @param argsExamples is an example of a method execution arguments
   * @param addComplex indicates if complex expressions (quantification, etc) must be computed from the example
   * @return a list of individuals computed from the given arguments
   */
  public List<Gene> createGenesFromObject(Object o, boolean isPositive, Object resultExample,
      List<Object> argsExamples, boolean addComplex) {
    // Get the evaluable expressions for the current example
    List<ExprContext> evaluableJoinedExpressions = contextInfo.getJoinedExpressions();
    List<ExprContext> evaluableJoinedExpressionsOfTypeInt = contextInfo.getJoinedExpressionsOfTypeInt();
    evaluableJoinedExpressions.addAll(evaluableJoinedExpressionsOfTypeInt);
    List<ExprContext> evaluableSimpleClosuredExpressions = contextInfo.getSimpleClosuredExpressions();
    List<ExprContext> evaluableDoubleClosuredExpressions = contextInfo.getDoubleClosuredExpressions();

    List<Gene> genes = new LinkedList<>();
    try {
      // Create the chromosome genes

      // Create the genes according to the evaluation of each evaluable expression
      if (parameters.getConsiderJoinedExpressions() && isPositive) {
        genes.addAll(createsGenesFromEvaluableJoinedExpressions(evaluableJoinedExpressions, o, isPositive));
      }

      if (parameters.getConsiderJoinedExpressionsComparisons()) {
        // Create the genes comparing joined expressions of the thiz object
        genes.addAll(createsGenesComparingEvaluableExpressions());
        // Create the genes comparing joined expressions of the thiz object with the thizPre object
        // (if possible)
        genes.addAll(createGenesComparingJoinedExpressionsDifferentObjects(evaluableJoinedExpressions));
      }

      if (addComplex) {
        // Create genes quantifying the simple closured expressions
        if (parameters.getConsiderSimpleClosuredExpressions())
          genes.addAll(createsGenesFromSimpleClosuredExpressionsAndIntExpressions(evaluableSimpleClosuredExpressions,
                  evaluableJoinedExpressionsOfTypeInt));

        // Create genes quantifying the double closured expressions
        if (parameters.getConsiderDoubleClosuredExpressions())
          genes.addAll(createsGenesFromDoubleClosuredExpressionsAndIntExpressions(evaluableDoubleClosuredExpressions, evaluableJoinedExpressionsOfTypeInt));

        // Create genes using the example result expression
        if (resultExample != null)
          genes.addAll(createGenesUsingTheResultObject(resultExample));

        // Create genes using the example arguments
        if (argsExamples != null) {
          int argPos = 0;
          for (Object arg : argsExamples) {
            String argLabel = "arg" + argPos;
            genes.addAll(createGenesUsingArguments(arg, argLabel, evaluableSimpleClosuredExpressions,
                    evaluableDoubleClosuredExpressions));
            argPos++;
          }
        }

        // Create genes using Maps
        genes.addAll(createGenesUsingMaps());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    contextInfo.clearExpressionsByEvaluationValue();
    return genes;
  }

  /**
   * Create genes using the result example
   * 
   * @throws InvalidConfigurationException
   */
  public List<Gene> createGenesUsingTheResultObject(Object resultExample)
      throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    Expr resultVar = ExprVar.make(null, "result");
    if (resultExample instanceof Boolean) {
      // The result is boolean, add it directly
      contextInfo.addVariableForType(Boolean.class.getSimpleName(), ExprName.RESULT);
      ExprContext geneExpr = ExprBuilder.eq(ExprBuilder.RESULT, (Boolean) resultExample ? ExprBuilder.TRUE : ExprBuilder.FALSE);
      ExprGeneValue newValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
      genes.add(new ExprGene(conf, newValue, contextInfo));
      //for (Expr e : contextInfo.getEvaluableExpressions()) {
      //  if (e.type().toString().contains("this/boolean")) {
      //    geneExpr = ExprBinary.Op.EQUALS.make(null, null, resultVar, e);
      //    ExprGeneValue geneValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
      //    genes.add(new ExprGene(conf, geneValue, contextInfo));
      //  }
      //}
    } else if (resultExample instanceof Integer || resultExample instanceof Double) {
      // The result is int or double, compare it with int expressions
      contextInfo.addVariableForType(resultExample.getClass().getSimpleName(), ExprName.RESULT);
      List<ExprContext> intExprs = contextInfo.getIntEvaluableExpressions();
      for (ExprContext intExpr : intExprs) {
        ExprContext geneExpr = ExprBuilder.eq(ExprBuilder.RESULT, intExpr);
        ExprGeneValue newValue = new ExprGeneValue(geneExpr, ExprGeneType.INT_COMPARISON);
        genes.add(new ExprGene(conf, newValue, contextInfo));
      }
      if (TargetInformation.hasCollections()) {
        List<ExprContext> collections = TargetInformation.getCollections();
        for (ExprContext collectionExpr : collections) {
          ExprContext geneExpr = ExprBuilder.eq(ExprBuilder.toExprContext(collectionExpr+".size"),ExprBuilder.RESULT);
          ExprGeneValue newValue = new ExprGeneValue(geneExpr, ExprGeneType.INT_COMPARISON);
          genes.add(new ExprGene(conf, newValue, contextInfo));
        }
      }
    } else if (resultExample instanceof String) {
      // Equal to null
      contextInfo.addVariableForType(resultExample.getClass().getSimpleName(), ExprName.RESULT);
      genes.add(create_gene_expr_equal_null(ExprBuilder.RESULT));
      // Equal to vars of same type
      /*for (Expr e : contextInfo.getEvaluableExpressions()) {
        if (e.type().toString().contains(resultExample.getClass().getSimpleName())
            && !e.type().toString().contains("Collection")) {
          Expr geneExpr = ExprBinary.Op.EQUALS.make(null, null, resultVar, e);
          ExprGeneValue geneValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
          genes.add(new ExprGene(conf, geneValue, contextInfo));
        }
      }*/
    } else {
      if (resultExample instanceof Collection) {
        collections_equalities((Collection) resultExample, ExprBuilder.RESULT, genes);
      }
      // Equal to null
      contextInfo.addVariableForType(resultExample.getClass().getSimpleName(), ExprName.RESULT);
      genes.add(create_gene_expr_equal_null(ExprBuilder.RESULT));
      // Equal to vars of same type
      /*for (Expr e : contextInfo.getEvaluableExpressions()) {
        if (e.type().toString().contains("this/" + resultExample.getClass().getSimpleName())) {
          Expr geneExpr = ExprBinary.Op.EQUALS.make(null, null, resultVar, e);
          ExprGeneValue geneValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
          genes.add(new ExprGene(conf, geneValue, contextInfo));
        }
      }*/
    }

    return genes;
  }

  /**
   * Equality with other Collections of same type
   * 
   * @throws InvalidConfigurationException
   */
  private void collections_equalities(Collection c, ExprContext collection_expr, List<Gene> genes)
      throws InvalidConfigurationException {
    Class<?> collection_type = guessElementType(c);
    if (collection_type != null) {
      List<ExprContext> collections = TargetInformation
          .getCollectionsOfType(collection_type.getSimpleName());
      for (ExprContext collection : collections) {
        ExprContext geneExpr = ExprBuilder.eq(collection_expr, collection);
        ExprGeneValue geneValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
        genes.add(new ExprGene(conf, geneValue, contextInfo));
      }
    }
  }

  /**
   * Creates the gene with expression e = null
   * 
   * @throws InvalidConfigurationException
   */
  private Gene create_gene_expr_equal_null(ExprContext e) throws InvalidConfigurationException {
    ExprContext geneExpr = ExprBuilder.eq(e, ExprBuilder.NULL);
    ExprGeneValue geneValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
    return new ExprGene(conf, geneValue, contextInfo);
  }

  private Set<Class<?>> supers(Class<?> c) {
    if (c == null)
      return new HashSet<Class<?>>();

    Set<Class<?>> s = supers(c.getSuperclass());
    s.add(c);
    return s;
  }

  private Class<?> lowestCommonSuper(Class<?> a, Class<?> b) {
    Set<Class<?>> aSupers = supers(a);
    while (!aSupers.contains(b)) {
      b = b.getSuperclass();
    }
    return b;
  }

  /**
   * Guess type of collection object
   */
  private Class<?> guessElementType(Collection<?> collection) {
    Class<?> guess = null;
    for (Object o : collection) {
      if (o != null) {
        if (guess == null) {
          guess = o.getClass();
        } else if (guess != o.getClass()) {
          guess = lowestCommonSuper(guess, o.getClass());
        }
      }
    }
    return guess;
  }

  /**
   * Create genes using the result example
   *
   * @throws InvalidConfigurationException
   */
  public List<Gene> createGenesUsingArguments(Object arg, String argLabel, List<ExprContext> simpleClosuredExprs,
                                        List<ExprContext> doubleClosuredExprs) throws InvalidConfigurationException {
    throw new UnsupportedOperationException("implement this");
  }

  /**
   * Create genes using the result example
   * 
   * @throws InvalidConfigurationException
   */
  public List<Gene> createGenesUsingArg(Object arg, String argLabel, List<ExprContext> simpleClosuredExprs,
      List<ExprContext> doubleClosuredExprs) throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    // if (arg instanceof Integer || arg instanceof Double) {
    if (arg instanceof Integer) {
      // Equality with other integer expressions
      // argLabel = e.f
      contextInfo.addVariableForType(Integer.class.getSimpleName(), argLabel);
      /*for (Expr expr : contextInfo.getIntEvaluableExpressions()) {
        Expr geneExpr = ExprBinary.Op.EQUALS.make(null, null,
            ExprVar.make(null, argLabel, Type.smallIntType()), expr);
        ExprGeneValue newValue = new ExprGeneValue(geneExpr, ExprGeneType.INT_COMPARISON);
        genes.add(new ExprGene(conf, newValue, contextInfo));
      }*/

      // Quantification stating that int arg belongs to int set
      // argLabel in e.*f
      for (int j = 0; j < simpleClosuredExprs.size(); j++) {
        ExprContext evaluableExpr = simpleClosuredExprs.get(j);
        if (evaluableExpr.toString().contains("thizPre") && !parameters.learnPre())
          continue;
        genes.addAll(createGeneFromIntArgumentAndClosuredExpr(ExprBuilder.toExprContext(argLabel),
                evaluableExpr, null));
      }
      // argLabel in e.*(f+g)
      for (int j = 0; j < doubleClosuredExprs.size(); j++) {
        ExprContext evaluableExpr = doubleClosuredExprs.get(j);
        if (evaluableExpr.toString().contains("thizPre") && !parameters.learnPre())
          continue;
        genes.addAll(createGeneFromIntArgumentAndClosuredExpr(ExprBuilder.toExprContext(argLabel),
            evaluableExpr, null));
      }
      // Inclusion in collection of same type than argument
      // argLabel in collection
      addAssertionsConsideringCollections(genes, argLabel, "Integer");
    } else if (arg instanceof Object || arg instanceof String) {
      // Equality with other expressions of same type
      // argLabel = e.f
      String argClass = arg.getClass().getSimpleName();
      contextInfo.addVariableForType(arg.getClass().getSimpleName(), argLabel);
      // Inclusion in collection of same type than argument
      // argLabel in collection
      addAssertionsConsideringCollections(genes, argLabel, argClass);
    }

    return genes;
  }

  /**
   * Add assertions combining the argument with the given level with Collections
   */
  private void addAssertionsConsideringCollections(List<Gene> genes, String argLabel,
      String argClass) throws InvalidConfigurationException {
    if (TargetInformation.hasCollectionsOfType(argClass)
        || "DoublyLinkedListNode".equals(argClass)) {
      List<ExprContext> evaluable = contextInfo.getEvaluableExpressions();
      for (ExprContext expr : evaluable) {
        if (expr != null)
          throw new UnsupportedOperationException("Check if expr is a collection");
        ExprContext geneExpr = ExprBuilder.eq(ExprBuilder.toExprContext(argLabel), expr);
        ExprGeneValue newValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
        genes.add(new ExprGene(conf, newValue, contextInfo));
      }
      List<ExprContext> collections = TargetInformation.getCollectionsOfType(argClass);
      for (ExprContext expr : collections) {
        // Create a gene with the expression argLabel in collection
        ExprContext geneExpr = ExprBuilder.in(ExprBuilder.toExprContext(argLabel), expr);
        ExprGeneValue geneValue = new ExprGeneValue(geneExpr, ExprGeneType.INCLUSION);
        genes.add(new ExprGene(conf, geneValue, contextInfo));
      }
    }
  }

  /**
   * Create expression for an argument with the given closured expression
   * 
   * @throws InvalidConfigurationException
   */
  private List<Gene> createGeneFromIntArgumentAndClosuredExpr(ExprContext argExpr, ExprContext closuredExpr,
      Type typeOfElementsInSet) throws InvalidConfigurationException {
    Set<ExprContext> joinableExpressions = contextInfo
        .getJoineableExpressionsOfCurrentType(typeOfElementsInSet);

    List<Gene> genes = new LinkedList<>();
    ExprGeneValue geneValue;

    // For each joineable expr generate the quantified expressions
    for (ExprContext joineableExpr : joinableExpressions) {

      Type returnType = contextInfo.getReturnType(joineableExpr);

      if (returnType.is_int() || returnType.toString().equals("{this/NodeValue}")) {

        if (ConfigurationProperties.getIntEvaluations()) {
          // Join the expression with the set
          // arg in set.joinExpr
          ExprContext setJoinExpr = ExprBuilder.join(closuredExpr, joineableExpr);
          ExprContext geneExpr = ExprBuilder.in(argExpr, setJoinExpr);
          geneValue = new ExprGeneValue(geneExpr,ExprGeneType.INCLUSION);
          genes.add(new ExprGene(conf, geneValue, contextInfo));

        }
      }
    }
    return genes;
  }

  /**
   * Create genes from Maps
   * 
   * @throws InvalidConfigurationException
   */
  private List<Gene> createGenesUsingMaps() throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<Gene>();
    List<ExprContext> evaluable = contextInfo.getEvaluableExpressions();
    for (ExprContext expr : evaluable) {
      Type exprType = Type.smallIntType();
      if (expr!=null)
        throw new UnsupportedOperationException("extract type from expr");
      if (exprType.toString().contains("Map_")) {
        // The expr is a Map
        String keyTypeStr = exprType.toString().replace("{this/Map_", "").split("_")[0];
        String valueTypeStr = exprType.toString().replace("{this/Map_", "").split("_")[1]
            .split(",")[0];
        if (keyTypeStr.equals("Integer")) {
          // The key type is integer, so create random expressions of the form expr[int] for integer
          // expressions
          ExprContext intExpr = contextInfo.getRandomIntExpr();
          ExprContext leftExpr = ExprBuilder.join(ExprBuilder.join(expr, ExprBuilder.toExprContext("getValueOfKey")),intExpr);
          ExprContext geneExpr;
          ExprGeneValue newValue;
          if (valueTypeStr.equals("Integer")) {
            // The map value is Integer
            geneExpr = ExprBuilder.eq(leftExpr, ExprBuilder.ZERO);
            newValue = new ExprGeneValue(geneExpr, ExprGeneType.INT_COMPARISON);
            genes.add(new ExprGene(conf, newValue, contextInfo));
            geneExpr = ExprBuilder.eq(leftExpr, ExprBuilder.ONE);
            newValue = new ExprGeneValue(geneExpr, ExprGeneType.INT_COMPARISON);
            genes.add(new ExprGene(conf, newValue, contextInfo));
          } else if (valueTypeStr.equals("Boolean")) {
            // The map value is Boolean
            geneExpr = ExprBuilder.eq(leftExpr, ExprBuilder.TRUE);
            newValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
            genes.add(new ExprGene(conf, newValue, contextInfo));
          } else {
            // The map value is Object
            geneExpr = ExprBuilder.neq(leftExpr, ExprBuilder.NULL);
            newValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
            genes.add(new ExprGene(conf, newValue, contextInfo));
          }

        }
      }
    }
    return genes;
  }

  /**
   * Creates genes from joined expressions and its evaluation result. Given an expression e, the
   * gene expression built from e can be:
   *
   * - e = null when the evaluation result is null
   *
   * - e != null when the evaluation result is not null
   *
   * - no e when the evaluation result is empty
   */
  public List<Gene> createsGenesFromEvaluableJoinedExpressions(
          List<ExprContext> evaluableJoinedExpressions, Object o, boolean isPositive)
          throws Exception {
    List<Gene> genes = new LinkedList<>();
    for (ExprContext expr : evaluableJoinedExpressions) {
      try {
        Object result = ExpressionEvaluator.evalAnyExpr(expr, o);
        String resultStr = result!=null?result.toString(): ExprName.NULL;
        String opStr = isPositive ? ExprOperator.EQ : ExprOperator.NOT_EQ;
        String newExprStr = expr.getText() + " " + opStr + " " + resultStr;

      } catch (NonEvaluableExpressionException e) {
      }

    }
    return null;
  }

  /**
   * Creates genes according to the equality or inequality between the values of each pair of
   * expressions only if the intersection between the types of the expressions being compared is not
   * empty. Given the expressions e and f, creates genes with the following expressions:
   * 
   * - e = f
   * 
   * - e!= f
   */
  public List<Gene> createsGenesComparingEvaluableExpressions()
      throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<Gene>();
    Object[] values = contextInfo.getExpressionsByEvaluationValue().keySet().toArray();
    for (int j = 0; j < values.length; j++) {
      List<ExprContext> expressionsThatEvaluateToValue = contextInfo.getExpressionsByEvaluationValue()
          .get(values[j]);
      // Add a equality gene for each pair of expressions that evaluate to the same value
      for (int k = 0; k < expressionsThatEvaluateToValue.size() - 1; k++) {
        ExprContext leftExpression = expressionsThatEvaluateToValue.get(k);
        for (int l = k + 1; l < expressionsThatEvaluateToValue.size(); l++) {
          ExprContext rightExpression = expressionsThatEvaluateToValue.get(l);
          if (rightExpression != null)
            throw new UnsupportedOperationException("Add proper checks here");
          ExprGeneType geneType = ExprGeneType.EQUALITY;
          ExprContext geneExpr = ExprBuilder.eq(leftExpression, rightExpression);
          ExprGeneValue newValue = new ExprGeneValue(geneExpr, geneType);
          genes.add(new ExprGene(conf, newValue, contextInfo));
        }
      }

      // Add an equality gene for each of pair in which the left side expression evaluates to the
      // current value
      // and the right side expression evaluates to some other value
      for (ExprContext leftExpression : expressionsThatEvaluateToValue) {
        for (int k = j + 1; k < values.length; k++) {
          List<ExprContext> rightExpressions = contextInfo.getExpressionsByEvaluationValue()
              .get(values[k]);
          for (ExprContext rightExpression : rightExpressions) {
              throw new UnsupportedOperationException("add proper checkings here ");
          }
        }
      }

    }
    return genes;
  }

  /**
   * Creates genes comparing evalable expressions over thiz and thizPre
   *
   * @throws InvalidConfigurationException
   */
  public List<Gene> createGenesComparingJoinedExpressionsDifferentObjects(List<ExprContext> evaluableJoinedExpressions) {
    return null;
  }

  /**
   * Creates genes comparing evalable expressions over thiz and thizPre
   * 
   * @throws InvalidConfigurationException
   */
  public List<Gene> createGenesComparingJoinedExpressionsDifferentObjs(
      List<ExprContext> evaluableJoinedExpressions) throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    for (int j = 0; j < evaluableJoinedExpressions.size() - 1; j++) {
      ExprContext leftExpr = evaluableJoinedExpressions.get(j);
      for (int k = j + 1; k < evaluableJoinedExpressions.size(); k++) {
        ExprContext rightExpr = evaluableJoinedExpressions.get(k);
        if (rightExpr.toString().contains("thizPre"))
          continue;
        throw new UnsupportedOperationException("Implement this properly");
      }
    }
    return genes;
  }

  /**
   * Returns true if both joined expressions are over the same field
   */
  private boolean sameField(ExprContext expr1, ExprContext expr2) {
    String strExpr1 = expr1.toString();
    String strExpr2 = expr2.toString();
    int lastJoinIdx1 = strExpr1.lastIndexOf(".");
    int lastJoinIdx2 = strExpr2.lastIndexOf(".");
    return strExpr1.substring(lastJoinIdx1).equals(strExpr2.substring(lastJoinIdx2));
  }

  /**
   * Creates genes from simple closured expressions considering: - Quantified expressions with body
   * predicating about shapes - Quantified expressions with body predicating about values
   */
  public List<Gene> createsGenesFromSimpleClosuredExpressionsAndIntExpressions(List<ExprContext> simpleClosuredExpressions, List<ExprContext> joinedExpressionsOfTypeInt) {
    return null;
  }

  /**
   * Creates genes from simple closured expressions considering: - Quantified expressions with body
   * predicating about shapes - Quantified expressions with body predicating about values
   */
  public List<Gene> createsGenesFromSimpleClosuredExpressions(List<Expr> simpleClosuredExpressions,
      List<Expr> joinedExpressionsOfTypeInt) throws InvalidConfigurationException, Err {
    List<Gene> genes = new LinkedList<Gene>();
    for (int j = 0; j < simpleClosuredExpressions.size(); j++) {
      Expr evaluableExpr = simpleClosuredExpressions.get(j);
      if (evaluableExpr.toString().contains("thizPre") && !parameters.learnPre())
        continue;
      Expr correctedEvaluableExpr = correctExpressionName(evaluableExpr);

      // Create genes with expressions which body is a predicate about shapes
      genes.addAll(createsGenesFromSimpleClosuredExpressionsForShape(correctedEvaluableExpr));

      // Create genes with expressions which body is a predicate about values
      genes.addAll(createsGenesFromSimpleClosuredExpressionsForValues(correctedEvaluableExpr));

      if (parameters.getConsiderCardinalityExpressions()) {
        // For each expression i of type int: #(e.*f)=i
        for (int k = 0; k < joinedExpressionsOfTypeInt.size(); k++) {

          Expr correctedIntExpr = correctExpressionName(joinedExpressionsOfTypeInt.get(k));
          ExprGeneValue geneValue = createsCardinalityExpression(correctedEvaluableExpr,
              correctedIntExpr);
          genes.add(new ExprGene(conf, geneValue, contextInfo));

        }
      }
    }
    return genes;
  }

  /**
   * Creates genes from simple closured expressions. Given a simple closured expression e.*f creates
   * genes with the following expressions:
   * 
   * - (all + some) n : e.*f : n != null
   * 
   * - (all + some) n : e.*f : n.f != null
   * 
   * - (all + some) n : e.*f : n != n.f
   * 
   * - (all + some) n : e.*f : n in n.^f
   * 
   * @throws InvalidConfigurationException
   */
  public List<Gene> createsGenesFromSimpleClosuredExpressionsForShape(Expr simpleClosuredExpr)
      throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<Gene>();
    ExprGeneValue geneValue;

    // (all + some) n : e.*f : n != null
    // geneValue =
    // ChromosomeGenesFactory.createsQtExpressionVarPredicate(correctedEvaluableExpr,"all");

    // (all + some) n : e.*f : n.f != null
    // geneValue =
    // ChromosomeGenesFactory.createsQtExpressionNextVarPredicate(correctedEvaluableExpr,"all");

    // (all + some) n : e.*f : n != n.f
    geneValue = ChromosomeGenesFactory.createsQtExpressionVarVarPredicate(simpleClosuredExpr,
        "all");
    genes.add(new ExprGene(conf, geneValue, contextInfo));

    // (all + some) n : e.*f : n in n.^f
    geneValue = ChromosomeGenesFactory.createsQtExpressionVarSetPredicate(simpleClosuredExpr,
        "all");
    genes.add(new ExprGene(conf, geneValue, contextInfo));

    return genes;
  }

  /**
   * Creates genes from simple closured expressions for values If the type of the variable n is T,
   * then for each relation r : T -> AnotherType creates the following quantified expressions:
   * 
   * - all n : e.*f : (n.next != Null) -> n.value = n.next.value
   */
  public List<Gene> createsGenesFromSimpleClosuredExpressionsForValues(Expr simpleClosuredExpr)
      throws InvalidConfigurationException, Err {

    Type typeOfElementsInSet = DynAlloyExpressionsUtils.getTypeOfElementsInSet(simpleClosuredExpr);
    Set<ExprContext> joinableExpressions = contextInfo
        .getJoineableExpressionsOfCurrentType(typeOfElementsInSet);

    List<Gene> genes = new LinkedList<Gene>();
    ExprGeneValue geneValue;

    // For each joineable expr generate the quantified expressions
    for (ExprContext joineableExpr : joinableExpressions) {
      throw new UnsupportedOperationException("imeplement this properly");
    }
    return genes;
  }

  /**
   * Creates genes from double closured expressions considering: - Quantified expressions with body
   * predicating about shapes - Quantified expressions with body predicating about values
   */
  public List<Gene> createsGenesFromDoubleClosuredExpressionsAndIntExpressions(List<ExprContext> doubleClosuredExpressions,
                                                              List<ExprContext> joinedExpressionsOfIntType) throws InvalidConfigurationException, Err {
    return null;
  }

  /**
   * Creates genes from double closured expressions considering: - Quantified expressions with body
   * predicating about shapes - Quantified expressions with body predicating about values
   */
  public List<Gene> createsGenesFromDoubleClosuredExpressions(List<Expr> doubleClosuredExpressions,
      List<Expr> joinedExpressionsOfIntType) throws InvalidConfigurationException, Err {
    List<Gene> genes = new LinkedList<Gene>();
    for (int j = 0; j < doubleClosuredExpressions.size(); j++) {
      Expr evaluableExpr = doubleClosuredExpressions.get(j);
      if (evaluableExpr.toString().contains("thizPre") && !parameters.learnPre())
        continue;
      Expr correctedEvaluableExpr = correctExpressionName(evaluableExpr);

      // Create genes with expressions which body is a predicate about shapes
      genes.addAll(createsGenesFromDoubleClosuredExpressionsForShape(correctedEvaluableExpr));

      // Create genes with expressions which body is a predicate about values
      genes.addAll(createsGenesFromDoubleClosuredExpressionsForValues(correctedEvaluableExpr));

      if (parameters.getConsiderCardinalityExpressions()) {
        // For each expression i of type int: #(e.*f)=i
        for (int k = 0; k < joinedExpressionsOfIntType.size(); k++) {
          Expr correctedIntExpr = correctExpressionName(joinedExpressionsOfIntType.get(k));
          ExprGeneValue geneValue = createsCardinalityExpression(correctedEvaluableExpr,
              correctedIntExpr);
          genes.add(new ExprGene(conf, geneValue, contextInfo));
        }
      }
    }
    return genes;
  }

  /**
   * Creates genes from double closured expressions for shape
   * 
   * - all n: e.*(f+g) : n != null
   * 
   * - all n:e.*(f+g) : n.f != null
   * 
   * - all n: e.*(f+g) : n.g != null
   * 
   * - all n: e.*(f+g) : n != n.f
   * 
   * - all n:e.*(f+g) : n != n.g
   * 
   * - all n: e.*(f+g) : n.f != n.g
   * 
   * - all n: e.*(f+g) : n in n.^f
   * 
   * - all n: e.*(f+g) : n in n.^g
   * 
   * - all n: e.*(f+g) : n in n.^(f+g)
   * 
   * - all n: e.*(f+g) : n.f.*(f+g) in n.g.*(f+g)
   */
  public List<Gene> createsGenesFromDoubleClosuredExpressionsForShape(Expr doubleClosuredExpr)
      throws InvalidConfigurationException, Err {
    List<Gene> genes = new LinkedList<Gene>();
    ExprGeneValue geneValue;

    // (all + some) n: e.*(f+g) : n != null
    // geneValue = createsQtExpressionVarPredicate(correctedEvaluableExpr, "all");
    // (all + some) n: e.*(f+g) : n.f != null
    // (all + some) n: e.*(f+g) : n.g != null

    // (all + some) n: e.*(f+g) : n != n.f
    geneValue = ChromosomeGenesFactory.createsQtExpressionVarVarPredicate(doubleClosuredExpr, "all",
        1);
    genes.add(new ExprGene(conf, geneValue, contextInfo));
    // (all + some) n: e.*(f+g) : n != n.g
    geneValue = ChromosomeGenesFactory.createsQtExpressionVarVarPredicate(doubleClosuredExpr, "all",
        2);
    genes.add(new ExprGene(conf, geneValue, contextInfo));

    /*
     * (all + some) n: e.*(f+g) : n.f != n.g geneValue =
     * createsQtExpressionVarVarPredicate(doubleClosuredExpr, "all",3); genes.add(new
     * ExprGene(conf,geneValue));
     */
    // (all + some) n : e.*(f+g) : n = n.f.g
    geneValue = ChromosomeGenesFactory.createsQtExpressionVarVarPredicate(doubleClosuredExpr, "all",
        4);
    genes.add(new ExprGene(conf, geneValue, contextInfo));

    // (all + some) n: e.*(f+g) : n in n.^f
    geneValue = createsQtExpressionVarSetPredicate(doubleClosuredExpr, "all", 1);
    genes.add(new ExprGene(conf, geneValue, contextInfo));
    // (all + some) n: e.*(f+g) : n in n.^g
    geneValue = createsQtExpressionVarSetPredicate(doubleClosuredExpr, "all", 2);
    genes.add(new ExprGene(conf, geneValue, contextInfo));

    // (all + some) n: e.*(f+g) : n in n.^(f+g)
    geneValue = ChromosomeGenesFactory.createsQtExpressionVarSetPredicate(doubleClosuredExpr,
        "all");
    genes.add(new ExprGene(conf, geneValue, contextInfo));

    // geneValue =
    // ChromosomeGenesFactory.createsQtExpressionVarSetPredicate(correctedEvaluableExpr,"some");
    // genes.add(new ExprGene(conf,geneValue));

    // all n: e.*(f+g) : n.f.*(f+g) != n.g.*(f+g)
    geneValue = ChromosomeGenesFactory.createsQtExpressionSetSetPredicate(doubleClosuredExpr,
        "all");
    genes.add(new ExprGene(conf, geneValue, contextInfo));

    return genes;
  }

  /**
   * Creates genes from double closured expressions for values If the type of the variable n is T,
   * then for each relation r : T -> AnotherType creates the following quantified expressions
   * 
   * - all n: e.*(f+g) : n.r != null
   * 
   * - all n: e.*(f+g) : n.r != n.f.r
   * 
   * - all n: e.*(f+g) : n.r != n.g.r
   * 
   * - all n: e.*(f+g) : n.f.r != n.g.r
   * 
   * - all n: e.*(f+g) : (n.r = v) => (n.f.r = v)
   * 
   * - all n: e.*(f+g) : (n.r = v) => (n.g.r = v)
   * 
   * - all n: e.*(f+g) : n.r in n.^f.r
   * 
   * - all n: e.*(f+g) : n.r in n.^g.r
   * 
   * - all n: e.*(f+g) : n.r in n.^(f+g).r
   * 
   * - all n: e.*(f+g) : n.f.*(f+g).r in n.g.*(f+g).r
   */
  public List<Gene> createsGenesFromDoubleClosuredExpressionsForValues(Expr doubleClosuredExpr)
      throws InvalidConfigurationException, Err {

    Type typeOfElementsInSet = DynAlloyExpressionsUtils.getTypeOfElementsInSet(doubleClosuredExpr,
        1);
    Set<ExprContext> joinableExpressions = contextInfo
        .getJoineableExpressionsOfCurrentType(typeOfElementsInSet);

    List<Gene> genes = new LinkedList<Gene>();
    ExprGeneValue geneValue;

    // For each joineable expr generate the quantified expressions
    for (ExprContext joineableExpr : joinableExpressions) {
      throw new UnsupportedOperationException("implement this properly");
    }
    return genes;
  }

  /**
   * Given a closured expression e.*f and an expression i of type int creates the gene value with
   * the expression #(e.*f) = i
   */
  public ExprGeneValue createsCardinalityExpression(Expr closuredExpression, Expr intExpr)
      throws Err {
    throw new UnsupportedOperationException("Implement this!");
  }

  /**
   * Given a simple closured expression e.*f, an expression r and a quantification operator creates
   * a gene value with expression - op n : e.*f : n.r = n.f.r
   */
  public static ExprGeneValue createsSimpleQtExpressionVarValueVarValueComparisonPredicate(
      ExprContext closuredExpr, ExprContext toJoinWithVarExpr, Type returnTypeExpr, ExprQt.Op op) throws Err {
    throw new UnsupportedOperationException("Implement this!!");
  }

  /**
   * Given an evaluable closured expression e.*f and a quantification operator creates the gene
   * value op n : e.*f : n in n.^f
   */
  public static ExprGeneValue createsQtExpressionVarSetPredicate(Expr closuredExpression,
      String op) {
    throw new UnsupportedOperationException("Implement thiss!");
  }

  /**
   * Given an evaluable closured expression e.*(f+g), a quantification operator and an int i creates
   * a gene value with the expression : - op n : e.*f : n in n.^f if i=1 - op n : e.*f : n in n.^g
   * if i=2
   */
  public static ExprGeneValue createsQtExpressionVarSetPredicate(Expr closuredExpression, String op,
      int i) {
    throw new UnsupportedOperationException("Implement this!");
  }

  /**
   * Given a double closured expression e.*(f+g) and a quantification operator creates the
   * expression op n : e.*(f+g) : e.f.*(f+g) != e.g.*(f+g)
   */
  public static ExprGeneValue createsQtExpressionSetSetPredicate(Expr closuredExpression,
      String op) {
    throw new UnsupportedOperationException("Implement this!");
  }

  /**
   * Given a closured expression e.*f and a quantification operator creates the expression op n :
   * e.*f : n != null
   */
  public static ExprGeneValue createsQtExpressionVarPredicate(Expr closuredExpression, String op) {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Given a closured expression e.*f and a quantification operator creates the expression op n :
   * e.*f : n.f != null
   */
  public static ExprGeneValue createsQtExpressionNextVarPredicate(Expr closuredExpression,
      String op) {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Given a closured expression e.*f and a quantification operator creates the gene value with the
   * expression op n : e.*f : n != n.f
   */
  public static ExprGeneValue createsQtExpressionVarVarPredicate(Expr closuredExpression,
      String op) {
    throw new UnsupportedOperationException("Implement this!");
  }

  /**
   * Given a closured expression e.*(f+g), a quantification operator and an int i creates a gene
   * value with expression:
   * 
   * - op n : e.*(f+g) : n != n.f if i = 1
   * 
   * - op n : e.*(f+g) : n != n.g if i = 2
   * 
   * - op n : e.*(f+g) : n.f != n.g if i = 3
   * 
   * - op n : e.*(f+g) : n = n.f.g if i = 4
   */
  public static ExprGeneValue createsQtExpressionVarVarPredicate(Expr closuredExpression, String op,
      int i) {
    throw new UnsupportedOperationException("Implement this!");
  }

  /**
   * Given a closured expression e.*(f+g), an expression r, a quantification operator and an int i
   * creates a gene value with expression - op n : e.*(f+g) : n.r = v => n.f.r = v if i = 1 - op n :
   * e.*(f+g) : n.r = v => n.g.r = v if i = 2 where v is possiblev value for an expression like r
   */
  public static ExprGeneValue createsQtExpressionVarValueVarValuePredicate(Expr closuredExpression,
      Expr toJoinWithVarExpr, Type returnTypeExpr, Expr value, String op, int i) throws Err {
    throw new UnsupportedOperationException("Implement this!");
  }

  /**
   * Given a closured expression e.*(f+g), an expression r, a quantification operator and an int i
   * creates a gene value with expression - op n : e.*(f+g) : n.r = v => n.f != null if i = 1 - op n
   * : e.*(f+g) : n.r = v => n.g != null if i = 2 where v is possiblev value for an expression like
   * r
   */
  public static ExprGeneValue createsQtExpressionVarValueVarPredicate(Expr closuredExpression,
      Expr toJoinWithVarExpr, Type returnTypeExpr, Expr value, String op, int i) throws Err {
    throw new UnsupportedOperationException("Implement this!");
  }

  /**
   * Given a double closured expression e.*(f+g), an expression r and a quantification operator
   * creates a gene value with the expression
   * 
   * - op n : e.*(f+g) | n.r != Null
   */
  public static ExprGeneValue createsDoubleQtExpressionVarValue(Expr closuredExpr,
      Expr toJoinWithVarExpr, ExprQt.Op op) throws Err {
    throw new UnsupportedOperationException("Implement this!");
  }

  /**
   * Given an evaluated expression and the evaluation result, build a new expr gene which expression
   * is expr = result if the evaluation comes from a positive example or expr != result if the evaluation
   * comes from a negative example
   *
   * @param expr is the evaluated expression
   * @param result is the result of evaluating expr
   * @param isPositive indicates if the evaluation comes from a positive example or not
   * @return a new gene
   */
  public Gene buildExprGeneFromEval(ExprContext expr, Object result, boolean isPositive) throws InvalidConfigurationException{
    return null;
  }

  /**
   * Get the correct expression from a evaluation
   * 
   * @param example
   *          is the example in which the evaluation was performed
   * @param evaluation
   *          is the evaluation performed
   * @return the expression corresponding to the evaluation result
   */
  private static Expr evaluationToExpression(A4Solution example, A4TupleSet evaluation) {
    if (evaluation.iterator().hasNext()) {
      A4Tuple firstEval = evaluation.iterator().next();
      Expr expr = ExprConstant.TRUE;
      if (firstEval.type().toString().equals("{seq/Int}")
          || firstEval.type().toString().equals("{Int}")) {
        // The evaluation is of type int
        expr = ExprConstant.makeNUMBER(Integer.parseInt(firstEval.toString()));
      } else {
        for (ExprVar e : example.getAllAtoms()) {
          if (e.toString().equals(firstEval.toString())) {
            expr = e;
            break;
          }
        }
      }
      return expr;
    } else {
      return ExprConstant.EMPTYNESS;
    }

  }

  /**
   * Corrects the expression name of the given expression for allow to evaluate it
   * 
   * @param expression
   * @return the same expression with a evaluable name
   */
  private Expr correctExpressionName(Expr expression) {
    if (expression instanceof ExprVar) {
      return runner.translateExpression((ExprVar) expression);
    } else {
      if (expression instanceof ExprUnary) {
        // The expression is closure
        ExprUnary closure = ((ExprUnary) expression);
        return closure.op.make(null, correctExpressionName(closure.sub));
      } else {
        // The expression is a joined expr
        Expr leftExpr = ((ExprBinary) expression).left;
        Expr rightExpr = ((ExprBinary) expression).right;

        Expr newLeftExpr = correctExpressionName(leftExpr);
        Expr newRightExpr = correctExpressionName(rightExpr);
        return ((ExprBinary) expression).op.make(null, null, newLeftExpr, newRightExpr);
      }

    }
  }

}