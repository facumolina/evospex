package evospex.report;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

import evospex.expression.Expr;
import evospex.EvoSpexParameters;
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
   * @param argNames maps EvoSpex's internal "arg0", "arg1", ... labels to the target method's
   *                 real parameter names, for display purposes only; may be empty if they
   *                 couldn't be resolved, in which case the internal labels are shown as-is.
   */
  public static void finalReport(EvoSpexParameters parameters, Map<String, String> argNames) {
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
      System.out.println("\t" + render(assertions.get(i), argNames) + " &&");
    }
    System.out.println("\t" + render(assertions.get(assertions.size() - 1), argNames));
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
    saveAssertions(parameters.getBaseFolderName(), assertions, argNames);
  }

  /**
   * Renders an expression for display, substituting real parameter names for EvoSpex's internal
   * "arg0", "arg1", ... labels wherever a mapping is available.
   */
  private static String render(Expr expr, Map<String, String> argNames) {
    String text = expr.toString();
    for (Map.Entry<String, String> e : argNames.entrySet()) {
      text = text.replaceAll("\\b" + e.getKey() + "\\b", Matcher.quoteReplacement(e.getValue()));
    }
    return text;
  }

  /**
   * Save the inferred assertions to an assertions.txt file, one per line, in the output/
   * folder mirroring the states/ folder the states were read from.
   */
  private static void saveAssertions(String baseFolderName, List<Expr> assertions, Map<String, String> argNames) {
    String outputDir = baseFolderName.startsWith("states/")
        ? "output/" + baseFolderName.substring("states/".length())
        : "output/" + baseFolderName;
    try {
      File f = new File(outputDir, "assertions.txt");
      f.getParentFile().mkdirs();
      PrintWriter pw = new PrintWriter(f);
      for (Expr expr : assertions) {
        pw.println(render(expr, argNames));
      }
      pw.close();
      System.out.println("assertions saved: " + f.getPath());
    } catch (Exception e) {
      System.out.println("Error saving assertions to " + outputDir);
    }
  }

}
