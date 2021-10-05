package evospex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Random;

import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.InvalidConfigurationException;
import org.jgap.impl.IntegerGene;

import geneticalgorithm.chromosome.ChromosomeGenesFactory;
import geneticalgorithm.chromosome.ExprGene;
import geneticalgorithm.chromosome.ExprGeneValueCloneHandler;
import geneticalgorithm.chromosome.SpecChromosome;
import geneticalgorithm.fitnessfunction.DynAlloyEquivalenceSpecCounter;
import geneticalgorithm.fitnessfunction.DynAlloyPassingAssertionsCounter;
import geneticalgorithm.fitnessfunction.PostConditionSpecEvaluator;
import geneticalgorithm.operator.ChromosomeCrossoverOperator;
import geneticalgorithm.operator.ExprGeneMutationOperator;
import geneticalgorithm.operator.SpecChromosomeNaturalSelector;
import report.Report;
import report.Stats;
import rfm.dynalloy.Err;
import rfm.dynalloyCompiler.ast.ExprConstant;
import utils.TargetInformation;
import utils.EvoSpexParameters;
import wrapper.DynAlloyRunner;

/**
 * This class represents the EvoSpex's Genetic Algorithm.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class EvoSpexGA {

  private Configuration conf = new CustomConfiguration();
  private DynAlloyRunner runner;
  private int genes_num;
  private SpecChromosome foundChromosome = null;
  private TargetInformation targetInformation; // Contains information regarding the target and method
  private Class<?> targetClass; // Target class under analysis
  private EvoSpexParameters parameters; // Evolutionary process arguments
  private ChromosomeGenesFactory cgfactory;

  /**
   * Constructor
   * 
   * @param filePath
   * @throws InvalidConfigurationException
   * @throws Err
   */
  public EvoSpexGA(String filePath) throws InvalidConfigurationException, Err {
    // DefaultConfiguration.reset();
    CustomConfiguration.reset();
    File f = new File(filePath);
    if (!f.exists() || f.isDirectory())
      throw new IllegalArgumentException();
    // setup a DynAlloyRunner with the file and the default "repOK" name
    runner = new DynAlloyRunner(f, "catalog", "repOK");
    setUpFile(f);
    targetInformation = runner.getStructureInformation();
    updateParametersAccordingToDataStructureInformation();
    setUpGeneticAlgorithm();
  }

  /**
   * Constructor with parameters
   * 
   * @throws Err
   */
  public EvoSpexGA(String filePath, EvoSpexParameters parameters)
      throws InvalidConfigurationException, Err {
    if (parameters == null)
      throw new IllegalArgumentException("The parameters cannot be null");
    // DefaultConfiguration.reset();
    CustomConfiguration.reset();
    File f = new File(filePath);
    if (!f.exists() || f.isDirectory())
      throw new IllegalArgumentException();
    this.parameters = parameters;
    // setup a DynAlloyRunner for the .als files
    if (filePath.endsWith(".als")) {
      runner = new DynAlloyRunner(f, "catalog", "repOK");
      setUpFile(f);
      targetInformation = runner.getStructureInformation();
    } else if (filePath.endsWith(".java")) {
      throw new IllegalArgumentException("Not implemented!");
    } else {
      throw new IllegalArgumentException("Invalid input file");
    }
    updateParametersAccordingToDataStructureInformation();
    setUpGeneticAlgorithm();
  }

  /**
   * Constructor with the method name for which we want to infer the postcondition
   */
  public EvoSpexGA(Class<?> targetClass, String methodName, EvoSpexParameters parameters)
      throws InvalidConfigurationException {
    if (parameters == null || targetClass == null)
      throw new IllegalArgumentException("Neither the target class nor the parameters can be null!");
    CustomConfiguration.reset();
    this.parameters = parameters;
    this.targetClass = targetClass;
    extractDataStructureInformation(targetClass);
    updateParametersAccordingToDataStructureInformation();
    setUpGeneticAlgorithm();
    parameters.readMethodsFolder();
  }

  /**
   * Extract the data structure information for the current target class
   */
  private void extractDataStructureInformation(Class<?> targetClass) {
    targetInformation = new TargetInformation(targetClass);
  }

  /**
   * Update the parameters according to the data structure information
   */
  private void updateParametersAccordingToDataStructureInformation() {
    if (targetInformation.getAmountOfDoubleClosuredExpressions() > 0)
      parameters.setConsiderSimpleClosuredExpressions(false);
  }

  /**
   * Set up file
   */
  private void setUpFile(File f) {
    // The file will be placed in the adequate location for the field exhaustive technique
    // And for the output file
    File destFieldExhaustive = new File(
        ConfigurationProperties.getFieldExhaustiveDirectory() + "/learning-spec/" + f.getName());
    File dest = new File(ConfigurationProperties.getOutputFileLocation() + "/" + f.getName());
    try {
      copyFileUsingStream(f, destFieldExhaustive);
      copyFileUsingStream(f, dest);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Copy the content of the source file to the dest file.
   */
  private static void copyFileUsingStream(File source, File dest) throws IOException {
    InputStream is = null;
    OutputStream os = null;
    try {
      is = new FileInputStream(source);
      os = new FileOutputStream(dest);
      byte[] buffer = new byte[1024];
      int length;
      while ((length = is.read(buffer)) > 0) {
        os.write(buffer, 0, length);
      }
    } finally {
      is.close();
      os.close();
    }
  }

  /**
   * Set up the Genetic Algorithm
   * @throws InvalidConfigurationException
   */
  private void setUpGeneticAlgorithm() throws InvalidConfigurationException {
    // Build sample genes and chromosome
    genes_num = parameters.amountOfGenes();
    Gene[] sampleGenes = new Gene[genes_num];
    for (int i = 0; i < genes_num; i++) {
      sampleGenes[i] = new ExprGene(conf, targetInformation);
    }
    SpecChromosome sampleChromosome = new SpecChromosome(conf, sampleGenes);
    // Set up the configuration
    conf.setSampleChromosome(sampleChromosome);
    conf.setKeepPopulationSizeConstant(false);
    conf.setPreservFittestIndividual(true);
    cgfactory = new ChromosomeGenesFactory(conf, runner, genes_num, targetInformation,
        parameters, empty_spec);
  }

  /**
   * Set parameters
   */
  public void setParameters(EvoSpexParameters parameters) {
    this.parameters = parameters;
  }

  /**
   * Determines the amount of genes to be used in the chromosomes
   */
  private int determineAmountOfGenes() {
    int amountOfEvaluableExpressions = parameters.getConsiderJoinedExpressions()
        ? targetInformation.getAmountOfNonClosuredExpressions() : 0;
    int cardinalityExpr = parameters.getConsiderCardinalityExpressions()
        ? targetInformation.calculateAmountCardinalityExpressions() : 0;
    int amountOfQuantifiedExpressions = (parameters.getConsiderSimpleClosuredExpressions()
        ? targetInformation.getAmountOfSimpleClosuredExpressions() * 2 : 0)
        + (parameters.getConsiderDoubleClosuredExpressions()
            ? targetInformation.getAmountOfDoubleClosuredExpressions() * 2 : 0);
    int n = amountOfEvaluableExpressions + amountOfQuantifiedExpressions + cardinalityExpr;
    return n * 2;
  }

  /**
   * Learns the specification
   * 
   * @throws InvalidConfigurationException
   */
  public void learnSpec() throws InvalidConfigurationException {
    conf.setFitnessFunction(new DynAlloyPassingAssertionsCounter(runner));
    List<SpecChromosome> initialChromosomes = cgfactory.getInitialChromosomesFromAlloy();
    conf.setPopulationSize(initialChromosomes.size());

    Genotype population = Genotype.randomInitialGenotype(conf);
    population.getPopulation().setChromosomes(initialChromosomes);

    double current = 0;
    int iterations = 30;
    int i = 0;
    // evolve and end if reach max iterations or max value found (all assert pass)
    while ((i < iterations) && (current < runner.getNumberOfAssertions())) {
      population.evolve();
      current = conf.getFitnessFunction().getFitnessValue(population.getFittestChromosome());
      System.out.println("Fittest Chromosome value: " + current);
      i++;
    }
    ;
    System.out.println("SPECIFICATION LEARNED");
    foundChromosome = (SpecChromosome) population.getFittestChromosome();
  }

  /**
   * Learns a more friendly specification from a set of propositions, equivalent to a given
   * specification
   * 
   * @throws InvalidConfigurationException
   */
  public void learnSpecFromSpec() throws InvalidConfigurationException {

    conf.setFitnessFunction(new DynAlloyEquivalenceSpecCounter(runner, genes_num, empty_spec));
    List<SpecChromosome> initialChromosomes = cgfactory.getInitialChromosomesFromAlloy();
    conf.setPopulationSize(parameters.getPopulationSize());

    Genotype population = Genotype.randomInitialGenotype(conf);
    population.getPopulation().setChromosomes(initialChromosomes);
    SpecChromosome bestChromosome = null;

    double current = 0;
    // int iterations = 100;
    System.out.println("Max iterarations: " + parameters.getNumberOfGenerations());
    System.out
        .println("Amount of genes per Chromosome: " + initialChromosomes.get(0).getGenes().length);
    System.out.println("Initial population size: " + initialChromosomes.size());
    System.out.println("Total population size: " + conf.getPopulationSize());

    int i = 0;
    double bestSolution = 0;
    // int minimumSolutionValue =
    // ((DynAlloyEquivalenceSpecCounter)conf.getFitnessFunction()).minimumSolutionValue();
    // System.out.println("Minimum solution value "+minimumSolutionValue);
    System.out.println();
    // Evolve and end if reach max iterations or max value found (all assert pass)
    while (i < parameters.getNumberOfGenerations()) {
      /*
       * population.evolve();
       * current=conf.getFitnessFunction().getFitnessValue(population.getFittestChromosome());
       * foundChromosome = (InvariantChromosome)population.getFittestChromosome(); i++; if
       * (current>=minimumSolutionValue) { if (current>bestSolution) { bestSolution=current;
       * bestChromosome=(InvariantChromosome)foundChromosome.clone();
       * System.out.println("A best solution was found with value "+bestSolution+" in generation "+i
       * ); System.out.println(learnedSpec()); } else {
       * System.out.println("The solution is the same as before with value "
       * +current+" in generation "+i); } } else {
       * System.out.println("Fittest Chromosome value: "+current+" generation "+i) ; }
       */
      System.out.println("GENERATION " + (i + 1) + "/" + parameters.getNumberOfGenerations());
      population.evolve();
      current = conf.getFitnessFunction().getFitnessValue(population.getFittestChromosome());
      foundChromosome = (SpecChromosome) population.getFittestChromosome();
      i++;
      if (foundChromosome.getAmountOfNegativeCounterexamples().compareTo(new Double(0)) == 0) {
        if (current > bestSolution) {
          bestSolution = current;
          bestChromosome = (SpecChromosome) foundChromosome.clone();
        }
        if (ConfigurationProperties.getStopCriterion().equals("first")) {
          System.out.println();
          System.out.println("FIRST INVARIANT FOUND");
          break;
        }
      } else {
        System.out.println();
        System.out.println("BEST CHROMOSOME FITNESS: " + current);
        // foundChromosome.printGenes();
        System.out.println(learnedSpec());
        System.out.println();
      }
      System.out.println();
    }
    ;
    System.out.println("Done!");
    foundChromosome = bestChromosome;

  }

  /**
   * Adding custom genetic operators
   */
  private void addCustomGeneticOperators() throws InvalidConfigurationException {
    conf.getGeneticOperators().remove(1); // Delete mutation
    conf.getGeneticOperators().remove(0); // Delete crossover
    ExprGeneMutationOperator mutationOp = new ExprGeneMutationOperator(conf, parameters);
    mutationOp.setMutationProb(parameters.getMutationProbability());
    conf.getGeneticOperators().add(0, mutationOp);
    ChromosomeCrossoverOperator crossoverOp = new ChromosomeCrossoverOperator(conf, parameters);
    crossoverOp.setCrossOverRate(parameters.getCrossoverProbability());
    conf.getGeneticOperators().add(crossoverOp);
    conf.removeNaturalSelectors(false);
    conf.addNaturalSelector(new SpecChromosomeNaturalSelector(conf), false);
    conf.getJGAPFactory().registerCloneHandler(new ExprGeneValueCloneHandler());
  }

  /**
   * Learns a specification from an empty set of propositions, equivalent to a given specification
   * 
   * @return
   */
  public void learnSpecFromEmptySpec() throws InvalidConfigurationException {
    // Add the custom genetic operators
    addCustomGeneticOperators();
    // Add the fitness function
    conf.setFitnessFunction(new DynAlloyEquivalenceSpecCounter(runner, genes_num, empty_spec));
    // Initial chromosomes
    List<SpecChromosome> initialChromosomes = cgfactory.getInitialChromosomesFromAlloy();
    System.out
        .println("Amount of genes per Chromosome: " + initialChromosomes.get(0).getGenes().length);
    conf.setPopulationSize(parameters.getPopulationSize());
    System.out.println("Initial population size: " + initialChromosomes.size());
    System.out.println("Total population size: " + conf.getPopulationSize());
    Genotype population = Genotype.randomInitialGenotype(conf);
    population.getPopulation().setChromosomes(initialChromosomes);

    SpecChromosome bestChromosome = null;

    double current = 0;
    int i = 0;
    double bestSolution = 0;
    System.out.println();
    // Evolve and end if reach max iterations or max value found (all assert pass)
    long itime = System.currentTimeMillis();
    while (i < parameters.getNumberOfGenerations()) {
      System.out.println("GENERATION " + (i + 1) + "/" + parameters.getNumberOfGenerations());
      population.evolve();
      current = conf.getFitnessFunction().getFitnessValue(population.getFittestChromosome());
      foundChromosome = (SpecChromosome) population.getFittestChromosome();
      i++;
      if (foundChromosome.getAmountOfNegativeCounterexamples().compareTo(new Double(0)) == 0) {
        if (current > bestSolution) {
          bestSolution = current;
          bestChromosome = (SpecChromosome) foundChromosome.clone();
        }
        if ("first".equals(ConfigurationProperties.getStopCriterion())) {
          System.out.println();
          System.out.println("FIRST INVARIANT FOUND");
          break;
        }
      } else {
        System.out.println();
        System.out.println("BEST CHROMOSOME FITNESS: " + current);
        foundChromosome.printGenes();
        System.out.println();
      }
      System.out.println();
    }
    ;
    int totalTime = (int) (System.currentTimeMillis() - itime) / 1000;
    if (bestSolution == 0) {
      System.out.println("SPECIFICATION NOT LEARNED");
    }
  }

  /**
   * Learns a post condition from an empty set of propositions
   */
  public void learnPostCondition() throws InvalidConfigurationException {
    // Add the custom genetic operators
    addCustomGeneticOperators();
    conf.setFitnessFunction(new PostConditionSpecEvaluator(genes_num, parameters));

    // Initial chromosomes
    List<SpecChromosome> initialChromosomes = cgfactory.getInitialChromosomesForPCs(
        EvoSpexParameters.RESULT_EXAMPLE, EvoSpexParameters.ARGS_EXAMPLES);
    conf.setPopulationSize(parameters.getPopulationSize());

    // cgfactory.getInitialChromosomesFromJavaObjects();

    // Initial report
    Report.initialReport(initialChromosomes.get(0).getGenes().length, initialChromosomes.size(),
        parameters);

    Genotype population = Genotype.randomInitialGenotype(conf);
    population.getPopulation().setChromosomes(initialChromosomes);

    if (parameters.randomSearch()) {
      // Randomized search. Only get the best individual in the initial random population
      long initGATime = System.currentTimeMillis();
      System.out.println("\nRANDOMIZED SEARCH");
      Random rand = new Random();
      double current = 0;
      for (int i = 0; i < parameters.getPopulationSize(); i++) {
        int r = rand.nextInt(initialChromosomes.size());
        SpecChromosome randomChrom = initialChromosomes.get(r);
        double randomChromFitness = conf.getFitnessFunction().getFitnessValue(randomChrom);
        if (randomChromFitness > current) {
          foundChromosome = (SpecChromosome) randomChrom;
          current = randomChromFitness;
        }
      }

      Stats.FITEST_CHROMOSOME_FV = current;
      Stats.FITEST_CHROMOSOME = foundChromosome;

      Stats.GENERATION_TIME = System.currentTimeMillis() - initGATime;
      Stats.CURRENT_ALGORITHM_TIME = System.currentTimeMillis() - initGATime;
      System.out.println();
      Stats.printFitnessFunctionReport();
      System.out.println();
      Stats.printGlobalCounters();

      Report.finalReport();

    } else {
      // Normal Evolutionary Search
      SpecChromosome bestChromosome = null;
      double current = 0;
      int i = 0;
      double bestSolution = 0;
      System.out.println();
      // Evolve and end if reach max iterations or max value found (all assert pass)
      long initGATime = System.currentTimeMillis();
      while (i < parameters.getNumberOfGenerations() && !timeoutReached()) {
        long initGenTime = System.currentTimeMillis();
        System.out.println("GENERATION " + (i + 1) + "/" + parameters.getNumberOfGenerations());
        population.evolve();
        current = conf.getFitnessFunction().getFitnessValue(population.getFittestChromosome());
        foundChromosome = (SpecChromosome) population.getFittestChromosome();
        i++;

        if (foundChromosome.getAmountOfNegativeCounterexamples().compareTo(new Double(0)) == 0) {
          if (current > bestSolution) {
            bestSolution = current;
            bestChromosome = (SpecChromosome) foundChromosome.clone();
          }
        }

        Stats.FITEST_CHROMOSOME_FV = current;
        Stats.FITEST_CHROMOSOME = foundChromosome;

        Stats.GENERATION_TIME = System.currentTimeMillis() - initGenTime;
        Stats.CURRENT_ALGORITHM_TIME = System.currentTimeMillis() - initGATime;
        System.out.println();
        Stats.printFitnessFunctionReport();
        System.out.println();
        Stats.printGlobalCounters();
      }

      Report.finalReport();
    }
  }

  /**
   * Returns true if the current timeout has been reached
   */
  private boolean timeoutReached() {
    long currentSeconds = Stats.CURRENT_ALGORITHM_TIME / 1000;
    return currentSeconds > parameters.getTimeOut();
  }

  /**
   * Get the learned specification.
   * 
   * @return
   */
  public String learnedSpec() {
    if (foundChromosome != null) {
      Gene[] genes = foundChromosome.getGenes();
      int[] res = new int[foundChromosome.size()];
      for (int i = 0; i < res.length; i++) {
        res[i] = ((IntegerGene) genes[i]).intValue();
      }
      String genesString = "";
      for (int i = 0; i < res.length; i++) {
        if (res[i] == 1) {
          genesString += getGenesDescription()[i] + " AND \n";
        }
        if (res[i] == 0) {
          genesString += "NOT " + getGenesDescription()[i] + " AND \n";
        }
      }
      return genesString;
    }
    return "Invariant not learned";
  }

  /**
   * Get the learned specification from an empty spec.
   * 
   * @return
   */
  public String learnedSpecFromEmptySpec() {
    Gene[] genes = foundChromosome.getGenes();
    String[] res = new String[foundChromosome.size()];
    String stringExpr = "";
    for (int i = 0; i < res.length; i++) {
      if (!((ExprGene) genes[i]).getValue().getExpression().equals(ExprConstant.TRUE)) {
        stringExpr += ((ExprGene) genes[i]).getInternalValue().toString();
        if (i < res.length - 1) {
          stringExpr += "\n AND \n";
        }
      }
      res[i] = ((ExprGene) genes[i]).getInternalValue().toString();
    }
    return stringExpr;
  }

  // --- Rerport support
  public String[] getGenesDescription() {
    return runner.getRepOkElementsAsString();
  }

}
