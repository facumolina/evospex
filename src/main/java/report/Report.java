package report;

import java.util.List;

import evospex.expression.Expr;
import utils.EvoSpexParameters;

/**
 * Report GA executions
 * 
 * @author fmolina
 */
public class Report {

  /**
   * Print initial report
   */
  public static void initialReport(int genes, int initPopSize, EvoSpexParameters params) {
    System.out.println("Amount of genes per Chromosome: " + genes);
    System.out.println("Initial population size: " + initPopSize);
    System.out.println("Total population size: " + params.getPopulationSize());
    System.out.println("Unary initial chromosomes: " + params.getInitialChromosomesUnary());
    System.out.println("Size penalty enabled: " + params.considerSizePenalty());
    System.out.println("Mca reward enabled: " + params.considerMcaReward());
    System.out.println("Generations: " + params.getNumberOfGenerations());
    System.out.println("Mutation probability: " + params.getMutationProbability());
    System.out.println("Crossover probability: " + params.getCrossoverProbability());
    System.out.println("Seconds timeout: " + params.getTimeOut());
    System.out.println("Positive counterexamples: " + Stats.POSITIVE_CE);
    System.out.println("Negative counterexamples: " + Stats.NEGATIVE_CE);
  }

  /**
   * Print final report
   */
  public static void finalReport() {
    System.out.println();
    System.out.println("------------- Execution finished -----------");
    long seconds = (Stats.FITNESS_CALCULATION_TIME / 1000);
    System.out.println("Time spent: " + seconds + " (sec)");
    System.out.println("Total fitness executions: " + Stats.FITNESS_FUNCTION_EXECUTIONS);
    System.out.println("Best individual found: " + Stats.FITEST_CHROMOSOME_FV);
    System.out.println();
    System.out.println("Assertions: ");
    List<Expr> assertions = Stats.FITEST_CHROMOSOME.toExprList();
    System.out.println("\tassert(");
    for (int i = 0; i < assertions.size() - 1; i++) {
      System.out.println("\t" + assertions.get(i) + " &&");
    }
    System.out.println("\t" + assertions.get(assertions.size() - 1));
    System.out.println("\t);");
    System.out.println("--------------------------------------------");
    System.out.println();
    System.out.println("CSV line for experimental purposes: ");
    System.out.println(
        seconds + "," + Stats.FITEST_CHROMOSOME.getAmountOfPositiveCounterexamples().intValue()
            + "," + Stats.FITEST_CHROMOSOME.getAmountOfNegativeCounterexamples().intValue() + ","
            + assertions.size());

  }

  /**
   * Animate
   */
  private static byte anim;

  public static void animate(String line) {
    switch (anim) {
    case 1:
      print("[ \\ ] " + line);
      break;
    case 2:
      print("[ | ] " + line);
      break;
    case 3:
      print("[ / ] " + line);
      break;
    default:
      anim = 0;
      print("[ - ] " + line);
    }
    anim++;
  }

  private static String lastLine = "";

  private static void print(String line) {
    // clear the last line if longer
    if (lastLine.length() > line.length()) {
      String temp = "";
      for (int i = 0; i < lastLine.length(); i++) {
        temp += " ";
      }
      if (temp.length() > 1)
        System.out.print("\r" + temp);
    }
    System.out.print("\r" + line);
    lastLine = line;
  }

}
