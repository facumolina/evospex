package geneticalgorithm.chromosome;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import org.jgap.RandomGenerator;
import org.jgap.impl.IntegerGene;

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
 * Class to create the initial population of Chromosomes
 * 
 * @author fmolina
 *
 */
public class ChromosomeGenesFactory {

  private Configuration conf;
  private DynAlloyRunner runner;
  private int genes_num;
  private TargetInformation contextInfo;
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
   * Get the initial chromosomes using an alloy spec
   */
  public List<SpecChromosome> getInitialChromosomesFromAlloy()
      throws InvalidConfigurationException {
    LinkedList<SpecChromosome> chromosomes = new LinkedList<SpecChromosome>();
      // The initial specification is empty
      A4Solution positiveExample = runner.generateExample(true);
      A4Solution negativeExample = runner.generateExample(false);
      // Save the null signature
      contextInfo.saveSignaturesInformation(positiveExample);
      int examplesConsidered = 0;
      while (examplesConsidered < parameters.getAmountOfExamplesForInitialChromosomesGeneration()) {
        if (positiveExample.satisfiable() && negativeExample.satisfiable()) {
          try {
            chromosomes
                .addAll(generateChromosomesFromExample(positiveExample, true, null, null, true));
            chromosomes
                .addAll(generateChromosomesFromExample(negativeExample, false, null, null, true));
            positiveExample = positiveExample.next();
            negativeExample = negativeExample.next();
            examplesConsidered += 2;
          } catch (Err e) {
            e.printStackTrace();
          }
        } else {
          break;
        }
      }

    return chromosomes;
  }

  /**
   * Get the initial chromosomes using an alloy spec
   */
  public List<SpecChromosome> getInitialChromosomesForPCs(Object resultExample,
      List<Object> argsExample) throws InvalidConfigurationException {
    LinkedList<SpecChromosome> chromosomes = new LinkedList<SpecChromosome>();

      // The initial specification is empty
      A4Solution positiveExample = runner.generateExample(true);
      A4Solution negativeExample = runner.generateExample(false);
      // Save the null signature
      contextInfo.saveSignaturesInformation(positiveExample);
      int examplesConsidered = 0;
      boolean addComplex = true; // Add complex formulas (comparisons, qantifications, result, args)
      while (examplesConsidered < parameters.getAmountOfExamplesForInitialChromosomesGeneration()) {
        if (positiveExample.satisfiable() && negativeExample.satisfiable()) {
          try {
            chromosomes.addAll(generateChromosomesFromExample(positiveExample, true, resultExample,
                argsExample, addComplex));
            chromosomes.addAll(generateChromosomesFromExample(negativeExample, false, resultExample,
                argsExample, addComplex));
            positiveExample = positiveExample.next();
            negativeExample = negativeExample.next();
            addComplex = false; // Only once
            examplesConsidered += 2;
          } catch (Err e) {
            e.printStackTrace();
          }
        } else {
          break;
        }
      }
      if (resultExample != null
          && (resultExample instanceof Integer || resultExample instanceof Double)) {
        contextInfo.addVariableForType(Integer.class.getSimpleName(), "result");
      }

    return chromosomes;
  }

  /**
   * Get the initial chromosomes from previously created java objects
   */
  public List<SpecChromosome> getInitialChromosomesFromJavaObjects() {
    LinkedList<SpecChromosome> chromosomes = new LinkedList<SpecChromosome>();
    int examplesConsidered = 0;
    Object resultExample = EvoSpexParameters.RESULT_EXAMPLE;
    List<Object> argsExample = EvoSpexParameters.ARGS_EXAMPLES;
    List<MethodExecution> allPositives = parameters.getPositiveObjects();
    List<MethodExecution> allNegatives = parameters.getNegativeObjects();

    Random r = new Random();
    boolean addComplex = true; // Add complex formulas (comparisons, qantifications, result, args)
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
   * Generates a list of chromosomes from an object
   */
  public List<SpecChromosome> generateChromosomesFromObject(Object o, boolean isPositive,
      Object resultExample, List<Object> argsExamples, boolean addComplex)
      throws InvalidConfigurationException, Err {
    List<SpecChromosome> chromosomes = new LinkedList<SpecChromosome>();
    List<Gene> genes = createGenesFromObject(o, isPositive, resultExample, argsExamples,
        addComplex);

    if (parameters.getInitialChromosomesUnary()) {
      // For each gene create one chromosome that contains just one gene at the first position:
      // [gene, true, true, ... , true]
      for (int i = 0; i < genes.size(); i++) {
        Gene[] new_genes = new Gene[genes_num];
        ExprGene exprGene = (ExprGene) genes.get(i);
        ExprGene newExprGene = new ExprGene(conf, exprGene.getValue().clone(), contextInfo);
        if (!isPositive && !(exprGene.getValue().getExpression() instanceof ExprQt)
            && !(exprGene.getValue().getExpression() instanceof ExprCall)) {
          // Negate the expression
          newExprGene.getValue().setExpression(
              DynAlloyExpressionsUtils.negateExpression(newExprGene.getValue().getExpression()),
              true);
        }
        // Always the gene must be in the first position
        new_genes[0] = newExprGene;
        // The rest of the genes vales is : true
        for (int j = 1; j < new_genes.length; j++) {
          new_genes[j] = new ExprGene(conf, new ExprGeneValue(ExprConstant.TRUE), contextInfo);
        }
        SpecChromosome chromosome = new SpecChromosome(conf, new_genes);
        chromosome.setFitnessValueDirectly(-1);
        chromosomes.add(chromosome);
      }
    } else {
      // Create chromosomes with each gene randomly picked.
      genes.add(new ExprGene(conf, new ExprGeneValue(ExprConstant.TRUE), contextInfo));
      int chromosomesToCreate = parameters.getPopulationSize()
          / parameters.getAmountOfExamplesForInitialChromosomesGeneration();
      for (int i = 0; i < chromosomesToCreate; i++) {
        Gene[] new_genes = new Gene[genes_num];
        int genes_to_fill = conf.getRandomGenerator().nextInt(genes_num);
        Set<Integer> usedGenes = new HashSet<Integer>();
        for (int j = 0; j < genes_to_fill; j++) {
          RandomGenerator generator = conf.getRandomGenerator();
          int r = generator.nextInt(genes.size());
          if (usedGenes.add(r))
            new_genes[j] = genes.get(r);
          else
            new_genes[j] = ((ExprGene) genes.get(r)).clone();
        }
        for (int j = genes_to_fill; j < genes_num; j++) {
          new_genes[j] = new ExprGene(conf, new ExprGeneValue(ExprConstant.TRUE), contextInfo);
        }
        SpecChromosome chromosome = new SpecChromosome(conf, new_genes);
        chromosome.setFitnessValueDirectly(-1);
        chromosomes.add(chromosome);
      }
    }
    return chromosomes;
  }

  /**
   * Creates the genes that represents the object
   */
  public List<Gene> createGenesFromObject(Object o, boolean isPositive, Object resultExample,
      List<Object> argsExamples, boolean addComplex) {
    return null;
  }

  /**
   * Generates a list of chromosomes from an example
   * 
   * @param example
   *          is the structure example from which the chromosomes will be built
   * @param isPositive
   *          is true if the example is positive
   */
  public List<SpecChromosome> generateChromosomesFromExample(A4Solution example, boolean isPositive,
      Object resultExample, List<Object> argsExamples, boolean addComplex)
      throws InvalidConfigurationException, Err {
    LinkedList<SpecChromosome> chromosomes = new LinkedList<SpecChromosome>();
    List<Gene> genes = createGenesFromExample(example, isPositive, resultExample, argsExamples,
        addComplex);

    if (parameters.getInitialChromosomesUnary()) {
      // For each gene create one chromosome that contains just one gene at the first position:
      // [gene, true, true, ... , true]
      for (int i = 0; i < genes.size(); i++) {
        Gene[] new_genes = new Gene[genes_num];
        ExprGene exprGene = (ExprGene) genes.get(i);
        ExprGene newExprGene = new ExprGene(conf, exprGene.getValue().clone(), contextInfo);
        if (!isPositive && !(exprGene.getValue().getExpression() instanceof ExprQt)
            && !(exprGene.getValue().getExpression() instanceof ExprCall)) {
          // Negate the expression
          newExprGene.getValue().setExpression(
              DynAlloyExpressionsUtils.negateExpression(newExprGene.getValue().getExpression()),
              true);
        }
        // Always the gene must be in the first position
        new_genes[0] = newExprGene;
        // The rest of the genes vales is : true
        for (int j = 1; j < new_genes.length; j++) {
          new_genes[j] = new ExprGene(conf, new ExprGeneValue(ExprConstant.TRUE), contextInfo);
        }
        SpecChromosome chromosome = new SpecChromosome(conf, new_genes);
        chromosome.setFitnessValueDirectly(-1);
        chromosomes.add(chromosome);
      }
    } else {
      // Create chromosomes with each gene randomly picked.
      genes.add(new ExprGene(conf, new ExprGeneValue(ExprConstant.TRUE), contextInfo));
      int chromosomesToCreate = parameters.getPopulationSize()
          / parameters.getAmountOfExamplesForInitialChromosomesGeneration();
      for (int i = 0; i < chromosomesToCreate; i++) {
        Gene[] new_genes = new Gene[genes_num];
        int genes_to_fill = conf.getRandomGenerator().nextInt(genes_num);
        Set<Integer> usedGenes = new HashSet<Integer>();
        for (int j = 0; j < genes_to_fill; j++) {
          RandomGenerator generator = conf.getRandomGenerator();
          int r = generator.nextInt(genes.size());
          if (usedGenes.add(r))
            new_genes[j] = genes.get(r);
          else
            new_genes[j] = ((ExprGene) genes.get(r)).clone();
        }
        for (int j = genes_to_fill; j < genes_num; j++) {
          new_genes[j] = new ExprGene(conf, new ExprGeneValue(ExprConstant.TRUE), contextInfo);
        }
        SpecChromosome chromosome = new SpecChromosome(conf, new_genes);
        chromosome.setFitnessValueDirectly(-1);
        chromosomes.add(chromosome);
      }
    }
    return chromosomes;
  }

  /**
   * Creates the genes that represents the example
   */
  public List<Gene> createGenesFromExample(A4Solution example, boolean isPositive,
      Object resultExample, List<Object> argsExamples, boolean addComplex) {
    // Get the evaluable expressions for the current example
    List<Expr> evaluableJoinedExpressions = contextInfo
        .getCommandJoinedExpressions(example.getAllSkolems());
    List<Expr> evaluableJoinedExpressionsOfTypeInt = contextInfo
        .getCommandJoinedExpressionsInt(example.getAllSkolems());
    evaluableJoinedExpressions.addAll(evaluableJoinedExpressionsOfTypeInt);
    List<Expr> evaluableSimpleClosuredExpressions = contextInfo
        .getCommandSimpleClosuredExpressions(example.getAllSkolems());
    List<Expr> evaluableDoubleClosuredExpressions = contextInfo
        .getCommandDoubleClosuredExpressions(example.getAllSkolems());
    List<Gene> genes = new LinkedList<Gene>();
    try {
      // Create the chromosome genes

      // Create the genes according to the evaluation of each evaluable expression
      if (parameters.getConsiderJoinedExpressions() && isPositive) {
        genes.addAll(createsGenesFromEvaluableJoinedExpressions(evaluableJoinedExpressions, example,
            isPositive));
        genes.addAll(createsGenesFromEvaluableJoinedExpressions(evaluableJoinedExpressionsOfTypeInt,
            example, isPositive));
      }

      if (parameters.getConsiderJoinedExpressionsComparisons()) {
        // Create the genes comparing joined expressions of the thiz object
        genes.addAll(createsGenesComparingEvaluableExpressions());
        // Create the genes comparing joined expressions of the thiz object with the thizPre object
        // (if possible)
        genes
            .addAll(createGenesComparingJoinedExpressionsDifferentObjs(evaluableJoinedExpressions));
      }

      if (addComplex) {
        // Create genes quantifying the simple closured expressions
        if (parameters.getConsiderSimpleClosuredExpressions())
          genes.addAll(createsGenesFromSimpleClosuredExpressions(evaluableSimpleClosuredExpressions,
              evaluableJoinedExpressionsOfTypeInt));

        // Create genes quantifying the double closured expressions
        if (parameters.getConsiderDoubleClosuredExpressions())
          genes.addAll(createsGenesFromDoubleClosuredExpressions(evaluableDoubleClosuredExpressions,
              evaluableJoinedExpressionsOfTypeInt));

        // Create genes using the example result expression
        if (resultExample != null) {
          genes.addAll(createGenesUsingTheResultObject(resultExample));
        }

        // Create genes using the example arguments
        if (argsExamples != null) {
          int argPos = 0;
          for (Object arg : argsExamples) {
            String argLabel = "arg" + argPos;
            genes.addAll(createGenesUsingArg(arg, argLabel, evaluableSimpleClosuredExpressions,
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
    List<Gene> genes = new LinkedList<Gene>();
    Expr resultVar = ExprVar.make(null, "result");
    if (resultExample instanceof Boolean) {
      // The result is boolean, add it directly
      contextInfo.addVariableForType(Boolean.class.getSimpleName(), "result");
      Expr geneExpr = ExprBinary.Op.EQUALS.make(null, null, resultVar,
          (Boolean) resultExample ? ExprConstant.TRUE : ExprConstant.FALSE);
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
      resultVar = ExprVar.make(null, "result", Type.smallIntType());
      contextInfo.addVariableForType(resultExample.getClass().getSimpleName(), "result");
      //List<Expr> intExprs = contextInfo.getIntEvaluableExpressions();
      List<Expr> intExprs = new LinkedList<>();
      for (Expr intExpr : intExprs) {
        Expr geneExpr = ExprBinary.Op.EQUALS.make(null, null, resultVar, intExpr);
        ExprGeneValue newValue = new ExprGeneValue(geneExpr, ExprGeneType.INT_COMPARISON);
        genes.add(new ExprGene(conf, newValue, contextInfo));
      }
      if (TargetInformation.hasCollections()) {
        List<Expr> collections = TargetInformation.getCollections();
        for (Expr collectionExpr : collections) {
          ExprVar collectionSizeVar = ExprVar.make(null, collectionExpr.toString() + " . size");
          Expr geneExpr = ExprBinary.Op.EQUALS.make(null, null, collectionSizeVar, resultVar);
          ExprGeneValue newValue = new ExprGeneValue(geneExpr, ExprGeneType.INT_COMPARISON);
          genes.add(new ExprGene(conf, newValue, contextInfo));
        }
      }
    } else if (resultExample instanceof String) {
      // Equal to null
      contextInfo.addVariableForType(resultExample.getClass().getSimpleName(), "result");
      genes.add(create_gene_expr_equal_null(resultVar));
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
        collections_equalities((Collection) resultExample, resultVar, genes);
      }
      // Equal to null
      contextInfo.addVariableForType(resultExample.getClass().getSimpleName(), "result");
      genes.add(create_gene_expr_equal_null(resultVar));
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
      List<Expr> collections = TargetInformation
          .getCollectionsOfType(collection_type.getSimpleName());
      for (Expr collection : collections) {
        Expr geneExpr = ExprBinary.Op.EQUALS.make(null, null, collection_expr, collection);
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
  private Gene create_gene_expr_equal_null(Expr e) throws InvalidConfigurationException {
    Expr geneExpr = ExprBinary.Op.EQUALS.make(null, null, e, TargetInformation.nullSig);
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
  public List<Gene> createGenesUsingArg(Object arg, String argLabel, List<Expr> simpleClosuredExprs,
      List<Expr> doubleClosuredExprs) throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<Gene>();
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
        Expr evaluableExpr = simpleClosuredExprs.get(j);
        if (evaluableExpr.toString().contains("thizPre") && !parameters.learnPre())
          continue;
        Type typeOfElementsInSet = DynAlloyExpressionsUtils.getTypeOfElementsInSet(evaluableExpr);
        Expr correctedEvaluableExpr = correctExpressionName(evaluableExpr);
        genes.addAll(createGeneFromIntArgumentAndClosuredExpr(ExprVar.make(null, argLabel),
            correctedEvaluableExpr, typeOfElementsInSet));
      }
      // argLabel in e.*(f+g)
      for (int j = 0; j < doubleClosuredExprs.size(); j++) {
        Expr evaluableExpr = doubleClosuredExprs.get(j);
        if (evaluableExpr.toString().contains("thizPre") && !parameters.learnPre())
          continue;
        Type typeOfElementsInSet = DynAlloyExpressionsUtils.getTypeOfElementsInSet(evaluableExpr,
            1);
        Expr correctedEvaluableExpr = correctExpressionName(evaluableExpr);
        genes.addAll(createGeneFromIntArgumentAndClosuredExpr(ExprVar.make(null, argLabel),
            correctedEvaluableExpr, typeOfElementsInSet));
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
      //List<Expr> evaluable = contextInfo.getEvaluableExpressions();
      List<Expr> evaluable = new LinkedList<>();
      for (Expr expr : evaluable) {
        if (!expr.type().toString().contains("Collection_")
            && !expr.type().toString().contains("Map_")
            && expr.type().toString().contains(argClass)) {
          Expr geneExpr = ExprBinary.Op.EQUALS.make(null, null, ExprVar.make(null, argLabel), expr);
          ExprGeneValue newValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
          genes.add(new ExprGene(conf, newValue, contextInfo));
        }
      }
      List<Expr> collections = TargetInformation.getCollectionsOfType(argClass);
      for (Expr expr : collections) {
        // Create a gene with the expression argLabel in collection
        Expr geneExpr = ExprBinary.Op.IN.make(null, null, ExprVar.make(null, argLabel), expr);
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
  private List<Gene> createGeneFromIntArgumentAndClosuredExpr(Expr argExpr, Expr closuredExpr,
      Type typeOfElementsInSet) throws InvalidConfigurationException {
    Set<Expr> joinableExpressions = contextInfo
        .getJoineableExpressionsOfCurrentType(typeOfElementsInSet);

    List<Gene> genes = new LinkedList<Gene>();
    ExprGeneValue geneValue;

    // For each joineable expr generate the quantified expressions
    for (Expr joineableExpr : joinableExpressions) {

      Type returnType = contextInfo.getReturnType(joineableExpr.type());

      if (returnType.is_int() || returnType.toString().equals("{this/NodeValue}")) {

        if (ConfigurationProperties.getIntEvaluations()) {

          // Join the expression with the set
          // arg in set.joinExpr
          Expr setJoinExpr = ExprBinary.Op.JOIN.make(null, null, closuredExpr, joineableExpr);
          geneValue = new ExprGeneValue(ExprBinary.Op.IN.make(null, null, argExpr, setJoinExpr),
              ExprGeneType.INCLUSION);
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
    //List<Expr> evaluable = contextInfo.getEvaluableExpressions();
    List<Expr> evaluable = new LinkedList<>();
    for (Expr expr : evaluable) {
      Type exprType = expr.type();
      if (exprType.toString().contains("Map_")) {
        // The expr is a Map
        String keyTypeStr = exprType.toString().replace("{this/Map_", "").split("_")[0];
        String valueTypeStr = exprType.toString().replace("{this/Map_", "").split("_")[1]
            .split(",")[0];
        if (keyTypeStr.equals("Integer")) {
          // The key type is integer, so create random expressions of the form expr[int] for integer
          // expressions
          Expr intExpr = contextInfo.getRandomIntExpr();
          Expr leftExpr = expr.join(ExprVar.make(null, "getValueOfKey")).join(intExpr);
          Expr geneExpr;
          ExprGeneValue newValue;
          if (valueTypeStr.equals("Integer")) {
            // The map value is Integer
            geneExpr = ExprBinary.Op.EQUALS.make(null, null, leftExpr, ExprConstant.ZERO);
            newValue = new ExprGeneValue(geneExpr, ExprGeneType.INT_COMPARISON);
            genes.add(new ExprGene(conf, newValue, contextInfo));
            geneExpr = ExprBinary.Op.EQUALS.make(null, null, leftExpr, ExprConstant.ONE);
            newValue = new ExprGeneValue(geneExpr, ExprGeneType.INT_COMPARISON);
            genes.add(new ExprGene(conf, newValue, contextInfo));
          } else if (valueTypeStr.equals("Boolean")) {
            // The map value is Boolean
            geneExpr = ExprBinary.Op.EQUALS.make(null, null, leftExpr, ExprConstant.TRUE);
            newValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
            genes.add(new ExprGene(conf, newValue, contextInfo));
          } else {
            // The map value is Object
            geneExpr = ExprBinary.Op.NOT_EQUALS.make(null, null, leftExpr,
                TargetInformation.nullSig);
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
      List<Expr> evaluableJoinedExpressions, A4Solution example, boolean isPositive)
      throws Exception {
    List<Gene> genes = new LinkedList<Gene>();
    for (int j = 0; j < evaluableJoinedExpressions.size(); j++) {
      Expr evaluableExpr = evaluableJoinedExpressions.get(j);
      if (evaluableExpr.toString().contains("thizPre") && !parameters.learnPre())
        continue;
      A4TupleSet evaluation = (A4TupleSet) example.eval(evaluableExpr);
      Expr correctedExpr = correctExpressionName(evaluableExpr);
      genes.add(buildExprGeneFromEvaluation(example, correctedExpr, evaluation, isPositive));

      if (DynAlloyExpressionsUtils.isNumeric(correctedExpr.type())) {
        Expr geneExpression = ExprBinary.Op.EQUALS.make(null, null, correctedExpr,
            ExprConstant.ZERO);
        ExprGeneValue newValue = new ExprGeneValue(geneExpression, ExprGeneType.INT_COMPARISON);
        genes.add(new ExprGene(conf, newValue, contextInfo));
        geneExpression = ExprBinary.Op.EQUALS.make(null, null, correctedExpr, ExprConstant.ONE);
        newValue = new ExprGeneValue(geneExpression, ExprGeneType.INT_COMPARISON);
        genes.add(new ExprGene(conf, newValue, contextInfo));
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
    List<Gene> genes = new LinkedList<Gene>();
    Object[] values = contextInfo.getExpressionsByEvaluationValue().keySet().toArray();
    for (int j = 0; j < values.length; j++) {
      List<Expr> expressionsThatEvaluateToValue = contextInfo.getExpressionsByEvaluationValue()
          .get(values[j]);
      // Add a equality gene for each pair of expressions that evaluate to the same value
      for (int k = 0; k < expressionsThatEvaluateToValue.size() - 1; k++) {
        Expr leftExpression = expressionsThatEvaluateToValue.get(k);
        for (int l = k + 1; l < expressionsThatEvaluateToValue.size(); l++) {
          Expr rightExpression = expressionsThatEvaluateToValue.get(l);
          if (!leftExpression.type().isSubtypeOf(rightExpression.type())
              || leftExpression.toString().equals(rightExpression.toString()))
            continue;
          if (!sameField(leftExpression, rightExpression))
            continue;
          ExprGeneType geneType = DynAlloyExpressionsUtils.isNumeric(leftExpression.type())
              ? ExprGeneType.INT_COMPARISON
              : ExprGeneType.EQUALITY;
          Expr geneExpression = ExprBinary.Op.EQUALS.make(null, null, leftExpression,
              rightExpression);
          ExprGeneValue newValue = new ExprGeneValue(geneExpression, geneType);
          genes.add(new ExprGene(conf, newValue, contextInfo));
        }
      }

      // Add an equality gene for each of pair in which the left side expression evaluates to the
      // current value
      // and the right side expression evaluates to some other value
      for (Expr leftExpression : expressionsThatEvaluateToValue) {
        for (int k = j + 1; k < values.length; k++) {
          List<Expr> rightExpressions = contextInfo.getExpressionsByEvaluationValue()
              .get(values[k]);
          for (Expr rightExpression : rightExpressions) {
            if (leftExpression.type().isSubtypeOf(rightExpression.type())
                && !leftExpression.toString().equals(rightExpression.toString())) {
              if (!sameField(leftExpression, rightExpression))
                continue;
              Expr geneExpression;
              ExprGeneType geneType;
              if (DynAlloyExpressionsUtils.isNumeric(leftExpression.type())) {
                geneType = ExprGeneType.INT_COMPARISON;
                geneExpression = ExprBinary.Op.NOT_EQUALS.make(null, null, leftExpression,
                    rightExpression);
              } else {
                geneType = ExprGeneType.EQUALITY;
                geneExpression = ExprBinary.Op.NOT_EQUALS.make(null, null, leftExpression,
                    rightExpression);
              }
              ExprGeneValue newValue = new ExprGeneValue(geneExpression, geneType);
              genes.add(new ExprGene(conf, newValue, contextInfo));
            }
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
  public List<Gene> createGenesComparingJoinedExpressionsDifferentObjs(
      List<Expr> evaluableJoinedExpressions) throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<Gene>();
    for (int j = 0; j < evaluableJoinedExpressions.size() - 1; j++) {
      Expr leftExpr = correctExpressionName(evaluableJoinedExpressions.get(j));
      for (int k = j + 1; k < evaluableJoinedExpressions.size(); k++) {
        Expr rightExpr = correctExpressionName(evaluableJoinedExpressions.get(k));
        if (rightExpr.toString().contains("thizPre"))
          continue;
        if (leftExpr.type().isSubtypeOf(rightExpr.type()) && sameField(leftExpr, rightExpr)) {
          // The types match
          if (DynAlloyExpressionsUtils.isNumeric(leftExpr.type())) {
            // Int expressions
            Expr geneExpression = ExprBinary.Op.EQUALS.make(null, null, leftExpr, rightExpr);
            ExprGeneValue newValue = new ExprGeneValue(geneExpression, ExprGeneType.INT_COMPARISON);
            genes.add(new ExprGene(conf, newValue, contextInfo));
          } else {
            // Reference expressions
            Expr geneExpression = ExprBinary.Op.EQUALS.make(null, null, leftExpr, rightExpr);
            ExprGeneValue newValue = new ExprGeneValue(geneExpression, ExprGeneType.EQUALITY);
            genes.add(new ExprGene(conf, newValue, contextInfo));
          }
        }
      }
    }
    return genes;
  }

  /**
   * Returns true if both joined expressions are over the same field
   */
  private boolean sameField(Expr expr1, Expr expr2) {
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
    Set<Expr> joinableExpressions = contextInfo
        .getJoineableExpressionsOfCurrentType(typeOfElementsInSet);

    List<Gene> genes = new LinkedList<Gene>();
    ExprGeneValue geneValue;

    // For each joineable expr generate the quantified expressions
    for (Expr joineableExpr : joinableExpressions) {

      if (typeOfElementsInSet.equals(joineableExpr.type()))
        continue;

      Type returnType = contextInfo.getReturnType(joineableExpr.type());

      if (returnType.is_int()) {
        // The return type is int
        if (ConfigurationProperties.getIntEvaluations()) {
          // Generates expressions comparing the integer values
          geneValue = ChromosomeGenesFactory
              .createsSimpleQtExpressionVarValueVarValueComparisonPredicate(simpleClosuredExpr,
                  joineableExpr, returnType, ExprQt.Op.ALL);
          genes.add(new ExprGene(conf, geneValue, contextInfo));
        }
      } else {
        // The return type is not int
        // Expr value = DataStructureInformation.getRandomValueForType(returnType);
      }
    }
    return genes;
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
    Set<Expr> joinableExpressions = contextInfo
        .getJoineableExpressionsOfCurrentType(typeOfElementsInSet);

    List<Gene> genes = new LinkedList<Gene>();
    ExprGeneValue geneValue;

    // For each joineable expr generate the quantified expressions
    for (Expr joineableExpr : joinableExpressions) {

      Type returnType = contextInfo.getReturnType(joineableExpr.type());

      if (!returnType.is_int() && !returnType.toString().equals("{this/boolean}")) {
        // all n: e.*(f+g) : (n.r != Null)
        geneValue = ChromosomeGenesFactory.createsDoubleQtExpressionVarValue(doubleClosuredExpr,
            joineableExpr, ExprQt.Op.ALL);
        genes.add(new ExprGene(conf, geneValue, contextInfo));
      }

      if (contextInfo.typeContains(typeOfElementsInSet, returnType))
        continue;

      if (returnType.is_int()) {

        if (ConfigurationProperties.getIntEvaluations()) {
          // all n: e.*(f+g) : (n.f != Null) => n.r op n.f.r
          geneValue = ChromosomeGenesFactory
              .createsDoubleQtExpressionVarValueVarValueComparisonPredicate(doubleClosuredExpr,
                  joineableExpr, returnType, ExprQt.Op.ALL, 1);
          genes.add(new ExprGene(conf, geneValue, contextInfo));
          // all n: e.*(f+g) : (n.g != Null) => n.r op n.g.r
          geneValue = ChromosomeGenesFactory
              .createsDoubleQtExpressionVarValueVarValueComparisonPredicate(doubleClosuredExpr,
                  joineableExpr, returnType, ExprQt.Op.ALL, 2);
          genes.add(new ExprGene(conf, geneValue, contextInfo));
          // all n: e.*(f+g) : (n.f != Null) => (n.r = n.f.r) AND (n.g != Null) => n.r = n.g.r
          geneValue = ChromosomeGenesFactory
              .createsDoubleQtExpressionVarValueVarValueComparisonPredicate(doubleClosuredExpr,
                  joineableExpr, returnType, ExprQt.Op.ALL, 3);
          genes.add(new ExprGene(conf, geneValue, contextInfo));

          // all n: e.*(f+g) :
          // (all m: n.f.*(f+g)-Null : n.r = m.r)
          // and
          // (all m: n.g.*(f+g)-Null : n.r = m.r)
          // geneValue = ChromosomeGenesFactory
          // .createsDoubleQtExpressionWithTwoQuantificationsAboutValuesPredicate(
          // doubleClosuredExpr, joineableExpr, returnType, ExprQt.Op.ALL);
          // genes.add(new ExprGene(conf, geneValue, dataStructureInformation));
        }
      } else {
        Expr value = TargetInformation.getRandomValueForType(returnType);
        if (value != null) {
          // all n: e.*(f+g) : (n.r = v) => (n.f.r = v)
          geneValue = createsQtExpressionVarValueVarValuePredicate(doubleClosuredExpr,
              joineableExpr, returnType, value, "all", 1);
          genes.add(new ExprGene(conf, geneValue, contextInfo));

          // all n: e.*(f+g) : (n.r = v) => (n.g.r = v)
          geneValue = createsQtExpressionVarValueVarValuePredicate(doubleClosuredExpr,
              joineableExpr, returnType, value, "all", 2);
          genes.add(new ExprGene(conf, geneValue, contextInfo));

          // all n: e*(f+g) : (n.r = v) => n.f != null
          // geneValue = createsQtExpressionVarValueVarPredicate(doubleClosuredExpr, joineableExpr,
          // returnType, value, "all", 1);
          // genes.add(new ExprGene(conf, geneValue, contextInfo));

          // all n: e*(f+g) : (n.r = v) => n.g != null
          // geneValue = createsQtExpressionVarValueVarPredicate(doubleClosuredExpr, joineableExpr,
          // returnType, value, "all", 2);
          // genes.add(new ExprGene(conf, geneValue, contextInfo));

          // all n: e.*(f+g) : (n.r = v) => (n.f.r = v) and (n.g.r = v)
          geneValue = ChromosomeGenesFactory.createsQtExpressionVarValueVarValuePredicate(
              doubleClosuredExpr, joineableExpr, returnType, value, "all", 3);
          genes.add(new ExprGene(conf, geneValue, contextInfo));

        }

      }
    }
    return genes;
  }

  /**
   * Given a closured expression e.*f and an expression i of type int creates the gene value with
   * the expression #(e.*f) = i
   */
  public ExprGeneValue createsCardinalityExpression(Expr closuredExpression, Expr intExpr)
      throws Err {
    Expr cardinalityExpression = DynAlloyExpressionsUtils
        .createsCardinalitySetEqualsToIntExpr(closuredExpression, intExpr);
    return new ExprGeneValue(cardinalityExpression, ExprGeneType.CARDINALITY);
  }

  /**
   * Given a simple closured expression e.*f, an expression r and a quantification operator creates
   * a gene value with expression - op n : e.*f : n.r = n.f.r
   */
  public static ExprGeneValue createsSimpleQtExpressionVarValueVarValueComparisonPredicate(
      Expr closuredExpr, Expr toJoinWithVarExpr, Type returnTypeExpr, ExprQt.Op op) throws Err {

    Expr qtExpr = (ExprQt) DynAlloyExpressionsUtils
        .createsQuantifiedExpressionCurrentValueOpNextValue(closuredExpr, toJoinWithVarExpr, op,
            TargetInformation.nullSig);
    ExprGeneType geneType = ExprGeneType.FORALL_VAR_VALUE_VAR_VALUE_INT_COMPARISON;

    ExprGeneValue geneValue = new ExprGeneValue(qtExpr, geneType);
    return geneValue;
  }

  /**
   * Given an evaluable closured expression e.*f and a quantification operator creates the gene
   * value op n : e.*f : n in n.^f
   */
  public static ExprGeneValue createsQtExpressionVarSetPredicate(Expr closuredExpression,
      String op) {
    ExprQt qtExpr;
    ExprGeneType geneType;
    if (op.equals("all")) {
      qtExpr = (ExprQt) DynAlloyExpressionsUtils
          .createsQuantifiedExpressionVarInSet(closuredExpression, ExprQt.Op.ALL);
      geneType = ExprGeneType.FORALL_VAR_SET;
    } else {
      qtExpr = (ExprQt) DynAlloyExpressionsUtils
          .createsQuantifiedExpressionVarInSet(closuredExpression, ExprQt.Op.SOME);
      geneType = ExprGeneType.SOME_VAR_SET;
    }
    ExprGeneValue geneValue = new ExprGeneValue(qtExpr, geneType);
    return geneValue;
  }

  /**
   * Given an evaluable closured expression e.*(f+g), a quantification operator and an int i creates
   * a gene value with the expression : - op n : e.*f : n in n.^f if i=1 - op n : e.*f : n in n.^g
   * if i=2
   */
  public static ExprGeneValue createsQtExpressionVarSetPredicate(Expr closuredExpression, String op,
      int i) {
    // Create expression
    ExprQt qtExpr;
    ExprGeneType geneType;
    if (op.equals("all")) {
      qtExpr = (ExprQt) DynAlloyExpressionsUtils
          .createsQuantifiedExpressionVarInSet(closuredExpression, ExprQt.Op.ALL, i);
      geneType = ExprGeneType.FORALL_VAR_SET;
    } else {
      qtExpr = (ExprQt) DynAlloyExpressionsUtils
          .createsQuantifiedExpressionVarInSet(closuredExpression, ExprQt.Op.SOME, i);
      geneType = ExprGeneType.SOME_VAR_SET;
    }
    ExprGeneValue geneValue = new ExprGeneValue(qtExpr, geneType);
    return geneValue;
  }

  /**
   * Given a double closured expression e.*(f+g) and a quantification operator creates the
   * expression op n : e.*(f+g) : e.f.*(f+g) != e.g.*(f+g)
   */
  public static ExprGeneValue createsQtExpressionSetSetPredicate(Expr closuredExpression,
      String op) {
    ExprQt qtExpr;
    ExprGeneType geneType;
    if (op.equals("all")) {
      qtExpr = (ExprQt) DynAlloyExpressionsUtils
          .createsQuantifiedtExpressionSetNotEqualSet(closuredExpression, ExprQt.Op.ALL);
      geneType = ExprGeneType.FORALL_SET_SET;
    } else {
      qtExpr = (ExprQt) DynAlloyExpressionsUtils
          .createsQuantifiedtExpressionSetNotEqualSet(closuredExpression, ExprQt.Op.SOME);
      geneType = ExprGeneType.SOME_SET_SET;
    }
    ExprGeneValue geneValue = new ExprGeneValue(qtExpr, geneType);
    return geneValue;
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
    ExprQt qtExpr;
    ExprGeneType geneType;
    if (op.equals("all")) {
      qtExpr = (ExprQt) DynAlloyExpressionsUtils
          .createsQuantifiedExpressionCurrentAndNextNotEquals(closuredExpression, ExprQt.Op.ALL);
      geneType = ExprGeneType.FORALL_VAR_VAR;
    } else {
      qtExpr = (ExprQt) DynAlloyExpressionsUtils
          .createsQuantifiedExpressionCurrentAndNextNotEquals(closuredExpression, ExprQt.Op.SOME);
      geneType = ExprGeneType.SOME_VAR_VAR;
    }
    ExprGeneValue geneValue = new ExprGeneValue(qtExpr, geneType);
    return geneValue;
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
    ExprQt qtExpr;
    ExprGeneType geneType;
    if (op.equals("all")) {
      qtExpr = (ExprQt) DynAlloyExpressionsUtils
          .createsQuantifiedExpressionCurrentAndNextNotEquals(closuredExpression, ExprQt.Op.ALL, i);
      geneType = ExprGeneType.FORALL_VAR_VAR;
    } else {
      qtExpr = (ExprQt) DynAlloyExpressionsUtils.createsQuantifiedExpressionCurrentAndNextNotEquals(
          closuredExpression, ExprQt.Op.SOME, i);
      geneType = ExprGeneType.SOME_VAR_VAR;
    }
    ExprGeneValue geneValue = new ExprGeneValue(qtExpr, geneType);
    return geneValue;
  }

  /**
   * Given a closured expression e.*(f+g), an expression r, a quantification operator and an int i
   * creates a gene value with expression - op n : e.*(f+g) : n.r = v => n.f.r = v if i = 1 - op n :
   * e.*(f+g) : n.r = v => n.g.r = v if i = 2 where v is possiblev value for an expression like r
   */
  public static ExprGeneValue createsQtExpressionVarValueVarValuePredicate(Expr closuredExpression,
      Expr toJoinWithVarExpr, Type returnTypeExpr, Expr value, String op, int i) throws Err {
    ExprQt qtExpr;
    ExprGeneType geneType;
    if (op.equals("all")) {
      qtExpr = (ExprQt) DynAlloyExpressionsUtils
          .createsQuantifiedExpressionCurrentValueImpliesNextValueEqual(closuredExpression,
              toJoinWithVarExpr, returnTypeExpr, value, ExprQt.Op.ALL, i);
      geneType = ExprGeneType.FORALL_VAR_VALUE_VAR_VALUE;
    } else {
      throw new IllegalArgumentException(
          "Operator not support to create quantified expressions: " + op);
    }
    ExprGeneValue geneValue = new ExprGeneValue(qtExpr, geneType);
    return geneValue;
  }

  /**
   * Given a closured expression e.*(f+g), an expression r, a quantification operator and an int i
   * creates a gene value with expression - op n : e.*(f+g) : n.r = v => n.f != null if i = 1 - op n
   * : e.*(f+g) : n.r = v => n.g != null if i = 2 where v is possiblev value for an expression like
   * r
   */
  public static ExprGeneValue createsQtExpressionVarValueVarPredicate(Expr closuredExpression,
      Expr toJoinWithVarExpr, Type returnTypeExpr, Expr value, String op, int i) throws Err {
    ExprQt qtExpr;
    ExprGeneType geneType;
    if (op.equals("all")) {
      qtExpr = (ExprQt) DynAlloyExpressionsUtils
          .createsQuantifiedExpressionCurrentValueImpliesNextNotNull(closuredExpression,
              toJoinWithVarExpr, returnTypeExpr, value, ExprQt.Op.ALL, TargetInformation.nullSig,
              i);
      geneType = ExprGeneType.FORALL_VAR_VALUE_VAR_VALUE;
    } else {
      throw new IllegalArgumentException(
          "Operator not support to create quantified expressions: " + op);
    }
    ExprGeneValue geneValue = new ExprGeneValue(qtExpr, geneType);
    return geneValue;
  }

  /**
   * Given a double closured expression e.*(f+g), an expression r and a quantification operator
   * creates a gene value with the expression
   * 
   * - op n : e.*(f+g) | n.r != Null
   */
  public static ExprGeneValue createsDoubleQtExpressionVarValue(Expr closuredExpr,
      Expr toJoinWithVarExpr, ExprQt.Op op) throws Err {
    Expr qtExpr = (ExprQt) DynAlloyExpressionsUtils.createsQuantifiedExpressionCurrentValueNotNull(
        closuredExpr, toJoinWithVarExpr, op, TargetInformation.nullSig);
    ExprGeneType geneType = ExprGeneType.FORALL_VAR_VALUE;
    ExprGeneValue geneValue = new ExprGeneValue(qtExpr, geneType);
    return geneValue;
  }

  /**
   * Given a double closured expression e.*(f+g), an expression r and a quantification operator
   * creates a gene value with expression
   * 
   * - op n : e.*(f+g) | ((n.f!=Null)=> n.r = n.f.r) AND ((n.g!=Null)=> n.r = n.g.r)
   */
  public static ExprGeneValue createsDoubleQtExpressionVarValueVarValueComparisonPredicate(
      Expr closuredExpr, Expr toJoinWithVarExpr, Type returnTypeExpr, ExprQt.Op op, int i)
      throws Err {

    Expr qtExpr = (ExprQt) DynAlloyExpressionsUtils
        .createsQuantifiedExpressionCurrentValueOpFstNextValueCurrentValueOpSndNextValue(
            closuredExpr, toJoinWithVarExpr, op, TargetInformation.nullSig, i);
    ExprGeneType geneType = ExprGeneType.FORALL_VAR_VALUES_DOUBLE_INT_COMPARISON;

    ExprGeneValue geneValue = new ExprGeneValue(qtExpr, geneType);
    return geneValue;
  }

  /**
   * Given a double closured expression e.*(f+g), an expression r and a quantification operator
   * creates a gene value with expression - op n : e.*(f+g) | (op m: e.f.*(f+g)-Null : n.r=m.r) AND
   * (op m: e.g.*(f+g)-Null : n.r=m.r)
   */
  public static ExprGeneValue createsDoubleQtExpressionWithTwoQuantificationsAboutValuesPredicate(
      Expr closuredExpr, Expr toJoinWithVarExpr, Type returnTypeExpr, ExprQt.Op op) throws Err {
    Expr qtExpr = (ExprQt) DynAlloyExpressionsUtils
        .createsQuantifiedExpressionQtCurrentValueOpFstNextValueQtCurrentValueOpSndNextValue(
            closuredExpr, toJoinWithVarExpr, op, TargetInformation.nullSig);
    ExprGeneType geneType = ExprGeneType.FORALL_VAR_VALUES_DOUBLE_QT_INT_COMPARISON;

    ExprGeneValue geneValue = new ExprGeneValue(qtExpr, geneType);
    return geneValue;
  }

  /**
   * Given an evaluated expression and the evaluation result, build an exprgene which expression =
   * evaluatedExpression op null if the evaluation result is a value or expression = no
   * evaluatedExpression if the evaluation result is empty.
   *
   * @param evaluation
   * @param isPositive
   * @return
   */
  public Gene buildExprGeneFromEvaluation(A4Solution example, Expr evaluatedExpression,
      A4TupleSet evaluation, boolean isPositive) throws InvalidConfigurationException {
    ExprVar nullExpr = example.getAllAtoms().iterator().next();
    SafeList<Sig> signatureList = example.getAllReachableSigs();
    Sig nullSig = signatureList.get(5);

    Expr evaluationExpr = evaluationToExpression(example, evaluation);
    // Add the expression to the list of expressions which value is evaluationExpr
    contextInfo.addEvaluationToValue(evaluatedExpression, evaluationExpr.toString());
    // Add the possible evaluation to the current type
    contextInfo.addEvaluationToSignature(evaluatedExpression.type(), evaluationExpr);

    // Build the new gene
    Expr geneExpression;
    ExprGene exprGene = null;
    ExprGeneValue geneValue;

    if (DynAlloyExpressionsUtils.isNumeric(evaluatedExpression.type())) {
      // The evaluated expression type is int.
      if (evaluationExpr.equals(ExprConstant.EMPTYNESS)) {
        geneExpression = ExprBinary.Op.EQUALS.make(null, null, evaluatedExpression,
            ExprConstant.ZERO);
        geneValue = new ExprGeneValue(geneExpression, ExprGeneType.INT_COMPARISON);
        exprGene = new ExprGene(conf, geneValue, contextInfo);
      } else {
        geneExpression = ExprBinary.Op.EQUALS.make(null, null, evaluatedExpression, evaluationExpr);
        geneValue = new ExprGeneValue(geneExpression, ExprGeneType.INT_COMPARISON);
        exprGene = new ExprGene(conf, geneValue, contextInfo);
      }
    } else {
      if (evaluationExpr.equals(nullExpr)) {
        // The evaluation was null
        geneExpression = ExprBinary.Op.EQUALS.make(null, null, evaluatedExpression, nullSig);
        geneValue = new ExprGeneValue(geneExpression, ExprGeneType.EQUALITY);
        exprGene = new ExprGene(conf, geneValue, contextInfo);
      } else {
        if (evaluationExpr.equals(ExprConstant.EMPTYNESS)) {
          geneExpression = ExprUnary.Op.NO.make(null, evaluatedExpression);
          geneValue = new ExprGeneValue(geneExpression, ExprGeneType.EMPTYNESS);
          exprGene = new ExprGene(conf, geneValue, contextInfo);
        } else {
          if (evaluatedExpression.type().toString().equals("{this/boolean}")) {
            // Is boolean, use the value
            geneExpression = ExprBinary.Op.EQUALS.make(null, null, evaluatedExpression,
                TargetInformation.getCorrespondingSignature((ExprVar) evaluationExpr));
            geneValue = new ExprGeneValue(geneExpression, ExprGeneType.EQUALITY);
            exprGene = new ExprGene(conf, geneValue, contextInfo);
          } else {
            // if (dataStructureInformation.typeUsedInRecursiveRelation(evaluatedExpression.type()))
            // {
            // The evaluation type is used in some recursive relation
            geneExpression = ExprBinary.Op.NOT_EQUALS.make(null, null, evaluatedExpression,
                nullSig);
            geneValue = new ExprGeneValue(geneExpression, ExprGeneType.EQUALITY);
            exprGene = new ExprGene(conf, geneValue, contextInfo);
          }
          // } else {
          // geneExpression = ExprBinary.Op.EQUALS.make(null, null, evaluatedExpression,
          // DataStructureInformation.getCorrespondingSignature((ExprVar) evaluationExpr));
          // geneValue = new ExprGeneValue(geneExpression, ExprGeneType.EQUALITY);
          // exprGene = new ExprGene(conf, geneValue, dataStructureInformation);
          // }
        }
      }
    }
    return exprGene;

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
