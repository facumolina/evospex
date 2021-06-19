package report;

import geneticalgorithm.chromosome.SpecChromosome;

/**
 * Class containing statistics and numbers collected during the GA execution
 * 
 * @author fmolina
 */
public class Stats {

  // Initial report numbers
  public static int POSITIVE_CE;
  public static int NEGATIVE_CE;

  // Global counters
  public static long GENERATION_TIME;
  public static long CURRENT_ALGORITHM_TIME;

  // Generation specific counters regarding mutation
  public static int CHROMOSOMES_BEFORE_MUTATION;
  public static int MUTATIONS_PERFORMED;
  public static int UNARY_CHROMOSOMES_FROM_MUTATION;
  public static int CHROMOSOMES_AFTER_MUTATION;

  // Generation specific counters regarding crossover
  public static int CHROMOSOMES_BEFORE_CROSSOVER;
  public static int NUMBER_OF_CROSSOVERS;
  public static int VALID_CHROMOSOMES;
  public static int CHROMOSOMES_AFTER_CROSSOVER;

  // Generation specific counters regarding selection
  public static int CHROMOSOMES_BEFORE_SELECTION;
  public static int SELECTED_BY_FITNESS;
  public static int ACTUAL_VALID_INDIVIDUALS;
  public static int UNARY_INVALID_PRESERVED;
  public static int UNARY_VALID_PRESERVED;
  public static int MOVED_TO_NEXT_GEN;

  // Counters regarding fitness function execution
  public static long FITNESS_CALCULATION_TIME;
  public static int FITNESS_FUNCTION_EXECUTIONS;
  public static int FITNESS_COMPUTATION_AVOIDED;
  public static SpecChromosome FITEST_CHROMOSOME;
  public static double FITEST_CHROMOSOME_FV;

  /**
   * Print the mutation report
   */
  public static void printMutationReport() {
    System.out.println();
    System.out.println("------------- Mutation operator ------------");
    System.out.println("Chromosomes before mutation: " + CHROMOSOMES_BEFORE_MUTATION);
    System.out.println("Number of mutations: " + MUTATIONS_PERFORMED);
    System.out.println("New unary chromosomes: " + UNARY_CHROMOSOMES_FROM_MUTATION);
    System.out.println("Chromosomes after mutation: " + CHROMOSOMES_AFTER_MUTATION);
    System.out.println("--------------------------------------------");
  }

  /**
   * Print the crossover report
   */
  public static void printCrossoverReport() {
    System.out.println();
    System.out.println("------------ Crossover operator ------------");
    System.out.println("Chromosomes before crossover: " + CHROMOSOMES_BEFORE_CROSSOVER);
    System.out.println("Number of crossovers: " + NUMBER_OF_CROSSOVERS);
    System.out.println("Valid chromosomes: " + VALID_CHROMOSOMES);
    System.out.println("Chromosomes after crossover: " + CHROMOSOMES_AFTER_CROSSOVER);
    System.out.println("--------------------------------------------");
  }

  /**
   * Print the selection report
   */
  public static void printSelectionReport() {
    System.out.println();
    System.out.println("------------- Selection process ------------");
    System.out.println("Chromosomes before selection: " + CHROMOSOMES_BEFORE_SELECTION);
    System.out.println("Selected by fitness order: " + SELECTED_BY_FITNESS + " (valid: "
        + ACTUAL_VALID_INDIVIDUALS + ")");
    System.out.println("Unary invalid preserved: " + UNARY_INVALID_PRESERVED);
    System.out.println("Extra valid preserved: " + UNARY_VALID_PRESERVED);
    System.out.println("Total chromosomes to next generation: " + MOVED_TO_NEXT_GEN);
    System.out.println("--------------------------------------------");
  }

  /**
   * Print the fitness function report
   */
  public static void printFitnessFunctionReport() {
    System.out.println();
    System.out.println("------------- FITNESS FUNCTION -------------");
    System.out.println("Time spent so far: " + (FITNESS_CALCULATION_TIME / 1000) + " (sec)");
    System.out.println("Total executions: " + FITNESS_FUNCTION_EXECUTIONS);
    System.out.println("Avoided executions: " + FITNESS_COMPUTATION_AVOIDED);
    System.out.println("Best individual so far: " + FITEST_CHROMOSOME_FV);
    System.out.println();
    FITEST_CHROMOSOME.printGenes();
    System.out.println("--------------------------------------------");
  }

  /**
   * Print global counters
   */
  public static void printGlobalCounters() {
    System.out.println();
    System.out.println("Current generation time: " + (GENERATION_TIME / 1000) + " (sec)");
    System.out.println();
  }

}
