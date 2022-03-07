package evospex.ga;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Random;

import evospex.ConfigurationProperties;
import evospex.CustomConfiguration;
import evospex.expression.ExprBuilder;
import evospex.ga.chromosome.SpecChromosomesBuilder;
import evospex.ga.chromosome.gene.*;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.InvalidConfigurationException;

import evospex.ga.chromosome.SpecChromosome;
import evospex.ga.fitnessfunction.PostConditionSpecEvaluator;
import evospex.ga.operator.ChromosomeCrossoverOperator;
import evospex.ga.operator.ExprGeneMutationOperator;
import evospex.ga.operator.SpecChromosomeNaturalSelector;
import evospex.report.Report;
import evospex.report.Stats;
import utils.TargetInformation;
import evospex.EvoSpexParameters;


/**
 * This class represents the EvoSpex's Genetic Algorithm.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class EvoSpexGA {

  private Configuration conf = new CustomConfiguration();
  private int genes_num;
  private SpecChromosome foundChromosome = null;
  private TargetInformation targetInformation; // Contains information regarding the target and method
  private Class<?> targetClass; // Target class under analysis
  private EvoSpexParameters parameters; // Evolutionary process arguments
  private SpecChromosomesBuilder scbuilder;

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
    targetInformation = new TargetInformation(targetClass, parameters.learnPre());
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
      sampleGenes[i] = new ExprGeneImpl(conf, new ExprGeneValue(ExprBuilder.TRUE, ExprGeneType.CONSTANT), targetInformation);
    }
    SpecChromosome sampleChromosome = new SpecChromosome(conf, sampleGenes);
    // Set up the configuration
    conf.setSampleChromosome(sampleChromosome);
    conf.setKeepPopulationSizeConstant(false);
    conf.setPreservFittestIndividual(true);
    scbuilder = new SpecChromosomesBuilder(conf, genes_num, targetInformation, parameters);
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
   * Learns a post condition from an empty set of propositions
   */
  public void learnPostCondition() throws InvalidConfigurationException {
    // Add the custom genetic operators
    addCustomGeneticOperators();
    conf.setFitnessFunction(new PostConditionSpecEvaluator(genes_num, parameters));

    // Initial chromosomes
    List<SpecChromosome> initialPopulation = scbuilder.buildInitialPopulation();
    conf.setPopulationSize(parameters.getPopulationSize());

    // Initial report
    Report.initialReport(initialPopulation.get(0).getGenes().length, initialPopulation.size(),
        parameters);

    Genotype population = Genotype.randomInitialGenotype(conf);
    population.getPopulation().setChromosomes(initialPopulation);

    if (parameters.randomSearch()) {
      // Randomized search. Only get the best individual in the initial random population
      long initGATime = System.currentTimeMillis();
      System.out.println("\nRANDOMIZED SEARCH");
      Random rand = new Random();
      double current = 0;
      for (int i = 0; i < parameters.getPopulationSize(); i++) {
        int r = rand.nextInt(initialPopulation.size());
        SpecChromosome randomChrom = initialPopulation.get(r);
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

}
