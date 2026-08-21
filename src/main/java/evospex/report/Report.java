package evospex.report;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;

import evospex.expression.Expr;
import evospex.EvoSpexParameters;
import evospex.utils.ParameterNameResolver;
import me.tongfei.progressbar.ProgressBar;

/**
 * Report GA executions
 * 
 * @author fmolina
 */
public class Report {

  public static ProgressBar pb;

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
  public static void finalReport(EvoSpexParameters parameters) {
    System.out.println();
    System.out.println("------------- Execution finished -----------");
    long seconds = (Stats.FITNESS_CALCULATION_TIME / 1000);
    System.out.println("Time spent: " + seconds + " (sec)");
    System.out.println("Total fitness executions: " + Stats.FITNESS_FUNCTION_EXECUTIONS);
    System.out.println("Best individual found: " + Stats.FITEST_CHROMOSOME_FV);
    System.out.println();
    System.out.println("Postcondition Assertions: ");
    List<Expr> assertions = Stats.FITEST_CHROMOSOME.toExprList();
    System.out.println("\tassert(");
    for (int i = 0; i < assertions.size() - 1; i++) {
      System.out.println("\t" + ParameterNameResolver.render(assertions.get(i)) + " &&");
    }
    System.out.println("\t" + ParameterNameResolver.render(assertions.get(assertions.size() - 1)));
    System.out.println("\t);");
    System.out.println();
    /*System.out.println("Discovered valid assertions:");
    for (SpecChromosome chromosome : Stats.discovered_properties) {
      List<Expr> chromosomeAssertions = chromosome.toExprList();
      for (int i = 0; i < chromosomeAssertions.size(); i++) {
        System.out.println("\t" + chromosomeAssertions.get(i));
      }
    }*/
    System.out.println("--------------------------------------------");
    saveAssertions(parameters.getBaseFolderName(), assertions);
  }

  /**
   * Save the inferred assertions to an assertions.txt file, one per line, in the output/
   * folder mirroring the states/ folder the states were read from.
   */
  private static void saveAssertions(String baseFolderName, List<Expr> assertions) {
    String outputDir = baseFolderName.startsWith("states/")
        ? "output/" + baseFolderName.substring("states/".length())
        : "output/" + baseFolderName;
    try {
      File f = new File(outputDir, "assertions.txt");
      f.getParentFile().mkdirs();
      PrintWriter pw = new PrintWriter(f);
      for (Expr expr : assertions) {
        pw.println(ParameterNameResolver.render(expr));
      }
      pw.close();
      System.out.println("assertions saved: " + f.getPath());
    } catch (Exception e) {
      System.out.println("Error saving assertions to " + outputDir);
    }
  }

}
