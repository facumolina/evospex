package evospex.ga.chromosome;

import java.util.*;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.symbol.ExprName;
import evospex.expression.symbol.ExprOperator;
import evospex.expression.evaluator.ExpressionEvaluator;
import evospex.expression.evaluator.NonEvaluableExpressionException;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import org.jgap.RandomGenerator;

import evospex.target.MethodExecution;
import rfm.dynalloy.Err;

import rfm.dynalloyCompiler.ast.ExprQt;

import rfm.dynalloyCompiler.ast.Type;
import utils.JavaClassesUtils;
import utils.TargetInformation;
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
  private int genes_num;
  private final TargetInformation targetInfo;
  private EvoSpexParameters parameters;

  /**
   * Constructor
   */
  public ChromosomeGenesFactory(Configuration conf, DynAlloyRunner runner, int genes,
                                TargetInformation info, EvoSpexParameters params) {
    this.conf = conf;
    genes_num = genes;
    targetInfo = info;
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
      targetInfo.addVariableForType(Integer.class, ExprName.RESULT);
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
        ExprGene newExprGene = new ExprGene(conf, exprGene.getValue().clone(), targetInfo);
        // Always the gene must be in the first position
        new_genes[0] = newExprGene;
        // The rest of the genes vales is : true
        for (int j = 1; j < new_genes.length; j++) {
          new_genes[j] = new ExprGene(conf, new ExprGeneValue(ExprBuilder.TRUE, ExprGeneType.CONSTANT), targetInfo);
        }
        SpecChromosome chromosome = new SpecChromosome(conf, new_genes);
        chromosome.setFitnessValueDirectly(-1);
        chromosomes.add(chromosome);
      }
    } else {
      // Create chromosomes with each gene randomly picked.
      genes.add(new ExprGene(conf, new ExprGeneValue(ExprBuilder.TRUE, ExprGeneType.CONSTANT), targetInfo));
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
          new_genes[j] = new ExprGene(conf, new ExprGeneValue(ExprBuilder.TRUE, ExprGeneType.CONSTANT), targetInfo);
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
    List<Expr> evaluableJoinedExpressions = targetInfo.getJoinedExpressions();
    List<Expr> evaluableJoinedExpressionsOfTypeInt = targetInfo.getJoinedExpressionsOfTypeInt();
    evaluableJoinedExpressions.addAll(evaluableJoinedExpressionsOfTypeInt);
    List<Expr> evaluableSimpleClosuredExpressions = targetInfo.getSimpleClosuredExpressions();
    List<Expr> evaluableDoubleClosuredExpressions = targetInfo.getDoubleClosuredExpressions();

    List<Gene> genes = new LinkedList<>();
    try {
      // Create the chromosome genes

      // Create the genes according to the evaluation of each evaluable expression
      if (parameters.getConsiderJoinedExpressions()) {
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
            String argLabel = ExprName.getArgLabel(argPos);
            genes.addAll(createGenesFromArgValue(arg, argLabel, evaluableSimpleClosuredExpressions,
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
    targetInfo.clearExpressionsByEvaluationValue();
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
    if (resultExample instanceof Boolean) {
      // The result is boolean, add it directly
      targetInfo.addVariableForType(Boolean.class, ExprName.RESULT);
      Expr geneExpr = ExprBuilder.eq(ExprBuilder.RESULT, (Boolean) resultExample ? ExprBuilder.TRUE : ExprBuilder.FALSE);
      ExprGeneValue newValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
      genes.add(new ExprGene(conf, newValue, targetInfo));
      //for (Expr e : contextInfo.getEvaluableExpressions()) {
      //  if (e.type().toString().contains("this/boolean")) {
      //    geneExpr = ExprBinary.Op.EQUALS.make(null, null, resultVar, e);
      //    ExprGeneValue geneValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
      //    genes.add(new ExprGene(conf, geneValue, contextInfo));
      //  }
      //}
    } else if (resultExample instanceof Integer || resultExample instanceof Double) {
      // The result is int or double, compare it with int expressions
      targetInfo.addVariableForType(resultExample.getClass(), ExprName.RESULT);
      List<Expr> intExprs = targetInfo.getIntEvaluableExpressions();
      for (Expr intExpr : intExprs) {
        Expr geneExpr = ExprBuilder.eq(ExprBuilder.RESULT, intExpr);
        ExprGeneValue newValue = new ExprGeneValue(geneExpr, ExprGeneType.INT_COMPARISON);
        genes.add(new ExprGene(conf, newValue, targetInfo));
      }
      if (TargetInformation.hasCollections()) {
        List<Expr> collections = TargetInformation.getCollections();
        for (Expr collectionExpr : collections) {
          Expr geneExpr = ExprBuilder.eq(ExprBuilder.toExpr(collectionExpr+".size", Number.class),ExprBuilder.RESULT);
          ExprGeneValue newValue = new ExprGeneValue(geneExpr, ExprGeneType.INT_COMPARISON);
          genes.add(new ExprGene(conf, newValue, targetInfo));
        }
      }
    } else if (resultExample instanceof String) {
      // Equal to null
      targetInfo.addVariableForType(resultExample.getClass(), ExprName.RESULT);
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
      targetInfo.addVariableForType(resultExample.getClass(), ExprName.RESULT);
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
  private void collections_equalities(Collection c, Expr collection_expr, List<Gene> genes)
      throws InvalidConfigurationException {
    Class<?> collection_type = guessElementType(c);
    if (collection_type != null) {
      List<Expr> collections = TargetInformation.getSetsOfType(collection_type);
      for (Expr collection : collections) {
        Expr geneExpr = ExprBuilder.eq(collection_expr, collection);
        ExprGeneValue geneValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
        genes.add(new ExprGene(conf, geneValue, targetInfo));
      }
    }
  }

  /**
   * Creates the gene with expression e = null
   * 
   * @throws InvalidConfigurationException
   */
  private Gene create_gene_expr_equal_null(Expr e) throws InvalidConfigurationException {
    Expr geneExpr = ExprBuilder.eq(e, ExprBuilder.NULL);
    ExprGeneValue geneValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
    return new ExprGene(conf, geneValue, targetInfo);
  }

  private Set<Class<?>> supers(Class<?> c) {
    if (c == null)
      return new HashSet<>();

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
   * Create a set of genes using from a method's argument value
   * @param argValue is a possible value for the argument
   * @param argLabel is a label identifying the argument
   * @param simpleClosuredExprs are the current simple closured expressions
   * @param doubleClosuredExprs are the current double closured expressions
   * @throws InvalidConfigurationException
   */
  public List<Gene> createGenesFromArgValue(Object argValue, String argLabel, List<Expr> simpleClosuredExprs,
                                            List<Expr> doubleClosuredExprs) throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    if (argValue instanceof Integer) {
      // The value is an instance of an integer, thus for the argument argLabel we can create genes with expressions such as:
      // argLabel = e where e is an integer expression.
      // argLabel = #(e) where e is a closured expression
      targetInfo.addVariableForType(Integer.class, argLabel);
      Expr argExpr = ExprBuilder.toExpr(argLabel, Integer.class);
      for (Expr expr : targetInfo.getIntEvaluableExpressions()) {
        ExprGeneValue newValue = new ExprGeneValue(ExprBuilder.eq(argExpr, expr), ExprGeneType.INT_COMPARISON);
        genes.add(new ExprGene(conf, newValue, targetInfo));
      }

      // Create more genes using the argument expression and the closured expressions
      genes.addAll(createGenesFromIntArgumentAndClosuredExpressions(argExpr, simpleClosuredExprs));
      genes.addAll(createGenesFromIntArgumentAndClosuredExpressions(argExpr, doubleClosuredExprs));

      // Create more genes using the argument expression and collections
      genes.addAll(addAssertionsConsideringCollections(argLabel, argExpr));
    } else {
      // Get the evaluable expressions of the current class
      if (argValue != null) {
        List<Expr> evaluable = targetInfo.getEvaluableExpressionsOfType(argValue.getClass());
        for (Expr expr : evaluable) {
          Expr geneExpr = ExprBuilder.eq(ExprBuilder.toExpr(argLabel,argValue.getClass()), expr);
          System.out.println("Created eq expr for arg: "+geneExpr);
          ExprGeneValue newValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
          genes.add(new ExprGene(conf, newValue, targetInfo));
        }
      }
    }
    return genes;
  }

  /**
   * Add assertions combining the argument with the given level with Collections
   */
  private List<Gene> addAssertionsConsideringCollections(String argLabel, Expr argExpr) throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    if (TargetInformation.existsSetOfType(argExpr.type())) {
      List<Expr> collections = TargetInformation.getSetsOfType(argExpr.type());
      for (Expr expr : collections) {
        // Create a gene with the expression argLabel in collection
        Expr geneExpr = ExprBuilder.in(ExprBuilder.toExpr(argLabel, expr.type()), expr);
        ExprGeneValue geneValue = new ExprGeneValue(geneExpr, ExprGeneType.INCLUSION);
        genes.add(new ExprGene(conf, geneValue, targetInfo));
      }
    }
    return genes;
  }

  /**
   * Create genes for an int argument and the given list of closured expressions.
   * For each closured expression cl, a gene with the following expression will be created
   * for each expression e that can be joined to the closured one:
   * - argExpr in cl.e
   * @param argExpr is the argument expression
   * @param closuredExpressions is the list of closured expressions
   */
  private List<Gene> createGenesFromIntArgumentAndClosuredExpressions(Expr argExpr, List<Expr> closuredExpressions) {
    List<Gene> genes = new LinkedList<>();
    closuredExpressions.forEach(closuredExpr -> {
      if (!closuredExpr.isPreState() || parameters.learnPre()) {
        Set<Expr> joineableExpressions = targetInfo.getJoineableExpressionsOfCurrentType(closuredExpr.classOfElemsInSet());
        // For each joineable expr generate the quantified expressions
        for (Expr joineableExpr : joineableExpressions) {
          if (joineableExpr.type().equals(Integer.class)) {
            if (parameters.getConsiderIntEvaluations()) {
              // Join the expression with the set
              // argExpr in set.joinExpr
              try {
                Expr setJoinExpr = ExprBuilder.join(closuredExpr, joineableExpr);
                Expr inExpr = ExprBuilder.in(argExpr, setJoinExpr);
                ExprGeneValue geneValue = new ExprGeneValue(inExpr, ExprGeneType.INCLUSION);
                genes.add(new ExprGene(conf, geneValue, targetInfo));
              } catch (InvalidConfigurationException e) {
                throw new IllegalStateException("Invalid config exception when adding considering expr: " + joineableExpr);
              }
            }
          }
        }
      }
    });
    return genes;
  }

  /**
   * Create genes from Maps
   * 
   * @throws InvalidConfigurationException
   */
  private List<Gene> createGenesUsingMaps() throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    List<Expr> evaluable = targetInfo.getEvaluableExpressions();
    for (Expr expr : evaluable) {
      if (Map.class.isAssignableFrom(expr.type())) {
        // The expression denotes a Map
        // TODO consider if the key type is integer, create random expressions of the form expr[int] for integer
        // TODO consider if the map values are integer
        // TODO consider if the map values are booleans
        // TODO consider if the map values are objects
        throw new UnsupportedOperationException("Implement genes creation using Maps!");
      }
    }
    return genes;
  }

  /**
   * Creates genes from joined expressions and its evaluation result. Given an expression e, the
   * gene expression built from e can be:
   * - e = null, e != null or no e when the evaluation result is a reference
   * - e = result, e != result when the evaluation result is a primitive value
   */
  public List<Gene> createsGenesFromEvaluableJoinedExpressions(
          List<Expr> evaluableJoinedExpressions, Object o, boolean isPositive) throws Exception {
    List<Gene> genes = new LinkedList<>();
    for (Expr expr : evaluableJoinedExpressions) {
      try {
        String name = expr.toString().startsWith(ExprName.THIS_PRE)? ExprName.THIS_PRE : ExprName.THIS;
        Object result = ExpressionEvaluator.evalAnyExpr(expr.exprCtx(), name, o);
        genes.add(buildExprGeneFromEval(expr, result, isPositive));
      } catch (NonEvaluableExpressionException e) {
        // The evaluation result is empty
      }
    }
    return genes;
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
    List<Gene> genes = new LinkedList<>();
    Object[] values = targetInfo.getExpressionsByEvaluationValue().keySet().toArray();
    for (int j = 0; j < values.length; j++) {
      List<Expr> expressionsThatEvaluateToValue = targetInfo.getExpressionsByEvaluationValue()
          .get(values[j]);
      // Add a equality gene for each pair of expressions that evaluate to the same value
      for (int k = 0; k < expressionsThatEvaluateToValue.size() - 1; k++) {
        Expr leftExpression = expressionsThatEvaluateToValue.get(k);
        for (int l = k + 1; l < expressionsThatEvaluateToValue.size(); l++) {
          Expr rightExpression = expressionsThatEvaluateToValue.get(l);
          if (rightExpression != null)
            throw new UnsupportedOperationException("Add proper checks here");
          ExprGeneType geneType = ExprGeneType.EQUALITY;
          Expr geneExpr = ExprBuilder.eq(leftExpression, rightExpression);
          ExprGeneValue newValue = new ExprGeneValue(geneExpr, geneType);
          genes.add(new ExprGene(conf, newValue, targetInfo));
        }
      }

      // Add an equality gene for each of pair in which the left side expression evaluates to the
      // current value
      // and the right side expression evaluates to some other value
      for (Expr leftExpression : expressionsThatEvaluateToValue) {
        for (int k = j + 1; k < values.length; k++) {
          List<Expr> rightExpressions = targetInfo.getExpressionsByEvaluationValue()
              .get(values[k]);
          for (Expr rightExpression : rightExpressions) {
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
  public List<Gene> createGenesComparingJoinedExpressionsDifferentObjects(List<Expr> evaluableJoinedExpressions) throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    for (int j = 0; j < evaluableJoinedExpressions.size() - 1; j++) {
      Expr leftExpr = evaluableJoinedExpressions.get(j);
      for (int k = j + 1; k < evaluableJoinedExpressions.size(); k++) {
        Expr rightExpr = evaluableJoinedExpressions.get(k);
        if (rightExpr.toString().contains("thizPre"))
          continue;
        if (leftExpr.type().equals(rightExpr)) {
          if (JavaClassesUtils.isNumber(leftExpr.type())) {
            // We are comparing numeric expressions
            Expr geneExpression = ExprBuilder.eq(leftExpr, rightExpr);
            ExprGeneValue newValue = new ExprGeneValue(geneExpression, ExprGeneType.INT_COMPARISON);
            genes.add(new ExprGene(conf, newValue, targetInfo));
          } else {
            Expr geneExpression = ExprBuilder.eq(leftExpr, rightExpr);
            ExprGeneValue newValue = new ExprGeneValue(geneExpression, ExprGeneType.EQUALITY);
            genes.add(new ExprGene(conf, newValue, targetInfo));
          }
        }
      }
    }
    return genes;
  }

  /**
   * Creates genes comparing evaluable expressions over this and this_pre
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
  public List<Gene> createsGenesFromSimpleClosuredExpressionsAndIntExpressions(List<Expr> simpleClosuredExpressions, List<Expr> joinedExpressionsOfTypeInt) {
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
      Expr correctedEvaluableExpr = evaluableExpr;

      // Create genes with expressions which body is a predicate about shapes
      genes.addAll(createsGenesFromSimpleClosuredExpressionsForShape(correctedEvaluableExpr));

      // Create genes with expressions which body is a predicate about values
      genes.addAll(createsGenesFromSimpleClosuredExpressionsForValues(correctedEvaluableExpr));

      if (parameters.getConsiderCardinalityExpressions()) {
        // For each expression i of type int: #(e.*f)=i
        for (int k = 0; k < joinedExpressionsOfTypeInt.size(); k++) {
          Expr intExpression = joinedExpressionsOfTypeInt.get(k);
          ExprGeneValue geneValue = createsCardinalityExpression(correctedEvaluableExpr,intExpression);
          genes.add(new ExprGene(conf, geneValue, targetInfo));
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
    genes.add(new ExprGene(conf, geneValue, targetInfo));

    // (all + some) n : e.*f : n in n.^f
    geneValue = ChromosomeGenesFactory.createsQtExpressionVarSetPredicate(simpleClosuredExpr,
        "all");
    genes.add(new ExprGene(conf, geneValue, targetInfo));

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

    Class<?> typeOfElementsInSet = simpleClosuredExpr.type();
    Set<Expr> joinableExpressions = targetInfo
        .getJoineableExpressionsOfCurrentType(typeOfElementsInSet);

    List<Gene> genes = new LinkedList<>();
    ExprGeneValue geneValue;

    // For each joineable expr generate the quantified expressions
    for (Expr joineableExpr : joinableExpressions) {
      throw new UnsupportedOperationException("imeplement this properly");
    }
    return genes;
  }

  /**
   * Creates genes from double closured expressions considering:
   * - Quantified expressions with body predicating about shapes
   * - Quantified expressions with body predicating about values
   */
  public List<Gene> createsGenesFromDoubleClosuredExpressionsAndIntExpressions(List<Expr> doubleClosuredExpressions,
                                                              List<Expr> joinedExpressionsOfIntType) throws InvalidConfigurationException, Err {
    List<Gene> genes = new LinkedList<>();
    for (int j = 0; j < doubleClosuredExpressions.size(); j++) {
      Expr evaluableExpr = doubleClosuredExpressions.get(j);
      if (evaluableExpr.toString().contains("thizPre") && !parameters.learnPre())
        continue;

      // Create genes with expressions which body is a predicate about shapes
      genes.addAll(createsGenesFromDoubleClosuredExpressionsForShape(evaluableExpr));

      // Create genes with expressions which body is a predicate about values
      genes.addAll(createsGenesFromDoubleClosuredExpressionsForValues(evaluableExpr));

      if (parameters.getConsiderCardinalityExpressions()) {
        // For each expression i of type int: #(e.*f) = i
        for (int k = 0; k < joinedExpressionsOfIntType.size(); k++) {
          Expr intExpression = joinedExpressionsOfIntType.get(k);
          ExprGeneValue geneValue = createsCardinalityExpression(evaluableExpr,intExpression);
          genes.add(new ExprGene(conf, geneValue, targetInfo));
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
    geneValue = ChromosomeGenesFactory.createsQtExpressionVarVarPredicate(doubleClosuredExpr, ExprOperator.ALL,
        1);
    genes.add(new ExprGene(conf, geneValue, targetInfo));
    // (all + some) n: e.*(f+g) : n != n.g
    geneValue = ChromosomeGenesFactory.createsQtExpressionVarVarPredicate(doubleClosuredExpr, ExprOperator.ALL,
        2);
    genes.add(new ExprGene(conf, geneValue, targetInfo));

    /*
     * (all + some) n: e.*(f+g) : n.f != n.g geneValue =
     * createsQtExpressionVarVarPredicate(doubleClosuredExpr, "all",3); genes.add(new
     * ExprGene(conf,geneValue));
     */
    // (all + some) n : e.*(f+g) : n = n.f.g
    geneValue = ChromosomeGenesFactory.createsQtExpressionVarVarPredicate(doubleClosuredExpr, ExprOperator.ALL,
        4);
    genes.add(new ExprGene(conf, geneValue, targetInfo));

    // (all + some) n: e.*(f+g) : n in n.^f
    geneValue = createsQtExpressionVarSetPredicate(doubleClosuredExpr, ExprOperator.ALL, 1);
    genes.add(new ExprGene(conf, geneValue, targetInfo));
    // (all + some) n: e.*(f+g) : n in n.^g
    geneValue = createsQtExpressionVarSetPredicate(doubleClosuredExpr, ExprOperator.ALL, 2);
    genes.add(new ExprGene(conf, geneValue, targetInfo));

    // (all + some) n: e.*(f+g) : n in n.^(f+g)
    geneValue = ChromosomeGenesFactory.createsQtExpressionVarSetPredicate(doubleClosuredExpr,
            ExprOperator.ALL);
    genes.add(new ExprGene(conf, geneValue, targetInfo));

    // geneValue =
    // ChromosomeGenesFactory.createsQtExpressionVarSetPredicate(correctedEvaluableExpr,"some");
    // genes.add(new ExprGene(conf,geneValue));

    // all n: e.*(f+g) : n.f.*(f+g) != n.g.*(f+g)
    geneValue = ChromosomeGenesFactory.createsQtExpressionSetSetPredicate(doubleClosuredExpr,
            ExprOperator.ALL);
    genes.add(new ExprGene(conf, geneValue, targetInfo));

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

    Class<?> typeOfElementsInSet = doubleClosuredExpr.type();
    Set<Expr> joinableExpressions = targetInfo
        .getJoineableExpressionsOfCurrentType(typeOfElementsInSet);

    List<Gene> genes = new LinkedList<Gene>();
    ExprGeneValue geneValue;

    // For each joineable expr generate the quantified expressions
    for (Expr joineableExpr : joinableExpressions) {
      throw new UnsupportedOperationException("implement this properly");
    }
    return genes;
  }

  /**
   * Given a closured expression e.*f and an expression i of type int creates a gene value with
   * the following expression:
   * - #(e.*f) = i
   */
  public ExprGeneValue createsCardinalityExpression(Expr closuredExpression, Expr intExpr) {
    Expr qtExpr = ExprBuilder.cardinalityExpr(closuredExpression, intExpr);
    return new ExprGeneValue(qtExpr, ExprGeneType.CARDINALITY);
  }

  /**
   * Given a simple closured expression e.*f, an expression r and a quantification operator creates
   * a gene value with the following expression:
   * - op n : e.*f : n.r = n.f.r
   */
  public static ExprGeneValue createsSimpleQtExpressionVarValueVarValueComparisonPredicate(
      ExprContext closuredExpr, ExprContext toJoinWithVarExpr, Type returnTypeExpr, ExprQt.Op op) throws Err {
    throw new UnsupportedOperationException("Implement this!!");
  }

  /**
   * Given an evaluable closured expression e.*f and a quantification operator creates a gene
   * value with the following expression:
   * - op n : e.*f : n in n.^f
   */
  public static ExprGeneValue createsQtExpressionVarSetPredicate(Expr closuredExpression, String op) {
    Expr qtExpr = ExprBuilder.qtExprVarSet(op, closuredExpression, 1);
    ExprGeneType geneType = op.equals(ExprOperator.ALL) ? ExprGeneType.FORALL_VAR_SET : ExprGeneType.SOME_VAR_SET;
    return new ExprGeneValue(qtExpr, geneType);
  }

  /**
   * Given an evaluable closured expression e.*(f+g), a quantification operator and an int i creates
   * a gene value with the following expressions:
   * - op n : e.*(f+g) : n in n.^f if i=1
   * - op n : e.*(f+g) : n in n.^g if i=2
   */
  public static ExprGeneValue createsQtExpressionVarSetPredicate(Expr closuredExpression, String op, int i) {
    Expr qtExpr = ExprBuilder.qtExprVarSet(op, closuredExpression, i);
    ExprGeneType geneType = op.equals(ExprOperator.ALL) ? ExprGeneType.FORALL_VAR_SET : ExprGeneType.SOME_VAR_SET;
    return new ExprGeneValue(qtExpr, geneType);
  }

  /**
   * Given a double closured expression e.*(f+g) and a quantification operator creates  a gene value
   * with the following expression:
   * - op n : e.*(f+g) : n.f.*(f+g) != n.g.*(f+g)
   */
  public static ExprGeneValue createsQtExpressionSetSetPredicate(Expr closuredExpression, String op) {
    Expr qtExpr = ExprBuilder.qtExprSetSet(op, closuredExpression);
    ExprGeneType geneType = op.equals(ExprOperator.ALL) ? ExprGeneType.FORALL_VAR_SET : ExprGeneType.SOME_VAR_SET;
    return new ExprGeneValue(qtExpr, geneType);
  }

  /**
   * Given a closured expression e.*f and a quantification operator creates the expression op n :
   * e.*f : n != null
   */
  public static ExprGeneValue createsQtExpressionVarPredicate(Expr closuredExpression, String op) {
    throw new UnsupportedOperationException("Implement this!");
  }

  /**
   * Given a closured expression e.*f and a quantification operator creates the expression op n :
   * e.*f : n.f != null
   */
  public static ExprGeneValue createsQtExpressionNextVarPredicate(Expr closuredExpression,
      String op) {
    throw new UnsupportedOperationException("Implement this!");
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
   * - op n : e.*(f+g) : n != n.g if i = 2
   * - op n : e.*(f+g) : n.f != n.g if i = 3
   * - op n : e.*(f+g) : n = n.f.g if i = 4
   */
  public static ExprGeneValue createsQtExpressionVarVarPredicate(Expr closuredExpression, String op, int i) {
    Expr qtExpr = ExprBuilder.qtExprTwoVars(op, closuredExpression, i);
    ExprGeneType geneType = op.equals(ExprOperator.ALL) ? ExprGeneType.FORALL_VAR_VAR : ExprGeneType.SOME_VAR_VAR;
    return new ExprGeneValue(qtExpr, geneType);
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
  public Gene buildExprGeneFromEval(Expr expr, Object result, boolean isPositive) throws InvalidConfigurationException {
    String opStr = isPositive ? ExprOperator.EQ : ExprOperator.NOT_EQ;

    if (result != null && JavaClassesUtils.isNumber(expr.type())) {
      Expr newExpr = ExprBuilder.applyOp(expr, opStr, ExprBuilder.toExpr(result.toString(), result.getClass()), Boolean.class);
      ExprGeneValue newValue = new ExprGeneValue(newExpr, ExprGeneType.EQUALITY);
      return new ExprGene(conf, newValue, targetInfo);
    } else {
      // The result is not a number, then compare with null
      Expr newExpr = ExprBuilder.applyOp(expr, opStr, ExprBuilder.NULL, Boolean.class);
      ExprGeneValue newValue = new ExprGeneValue(newExpr, ExprGeneType.EQUALITY);
      return new ExprGene(conf, newValue, targetInfo);
    }

  }

}
