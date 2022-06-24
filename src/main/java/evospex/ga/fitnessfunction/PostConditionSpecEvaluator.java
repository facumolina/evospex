package evospex.ga.fitnessfunction;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.evaluator.ExpressionEvaluator;
import evospex.expression.evaluator.NonEvaluableExpressionException;
import evospex.expression.symbol.ExprName;
import evospex.ga.chromosome.gene.ExprGene;
import evospex.ga.chromosome.gene.value.ExprGeneValue;
import evospex.ga.chromosome.SpecChromosome;
import org.jgap.FitnessFunction;
import org.jgap.Gene;
import org.jgap.IChromosome;

import evospex.target.MethodExecution;
import evospex.report.Stats;
import evospex.report.Report;

import evospex.EvoSpexParameters;
import utils.FitnessValue;

/**
 * Fitness function that computes the fitness value of a postcondition according to the amount of
 * negative and positive counterexamples of the chromosome.
 * 
 * @author fmolina
 */
public class PostConditionSpecEvaluator extends FitnessFunction {

  private static final long serialVersionUID = 1L;

  private int amountOfGenes;
  private long itime;
  private double bestFitness;
  private double MAX;

  // Method execution objects
  private List<MethodExecution> positives;
  private List<MethodExecution> negatives;

  EvoSpexParameters params;

  private HashMap<String, FitnessValue> calculatedFitness;

  /**
   * Constructor
   */
  public PostConditionSpecEvaluator(int genes_num, EvoSpexParameters parameters) {
    amountOfGenes = genes_num;
    itime = System.currentTimeMillis();
    bestFitness = 0;
    params = parameters;
    // Initialize fitness calculation fields
    positives = params.getPositiveObjects();
    negatives = params.getNegativeObjects();
    MAX = positives.size() + negatives.size();
    Stats.POSITIVE_CE = positives.size();
    Stats.NEGATIVE_CE = negatives.size();
    calculatedFitness = new HashMap<>();
  }

  @Override
  protected double evaluate(IChromosome chromosome) {
    SpecChromosome specChromosome = (SpecChromosome) chromosome;
    if (Report.pb != null) Report.pb.step();

    // If the chromosome has not genes return 0
    if (specChromosome.toString().contains("Alleles:[]")) {
      return 0;
    }

    // If already calculated, return directly
    if (calculatedFitness.containsKey(specChromosome.toString())) {
      Stats.FITNESS_COMPUTATION_AVOIDED++;
      FitnessValue value = calculatedFitness.get(specChromosome.toString());
      specChromosome.setAmountOfPositiveCounterexamples(value.positiveCounterexamples());
      specChromosome.setAmountOfNegativeCounterexamples(value.negativeCounterexamples());
      specChromosome.setCounterexamplesMutationsStr(value.counterexamplesMutationsStr());
      return value.getFitnessValue();
    }

    long timeBeforeFitnessComputation = System.currentTimeMillis();

    // Get the expressions represented by the current chromosome
    List<Expr> expressions = specChromosome.toExprList();

    // Evaluate the assertion
    // If the assertions conjunction has at least one positive counterexample, then the fitness is 0
    double p = positiveCounterexamples(expressions);

    // Count the number of negative counterexamples and then compute the fitness value
    // Get the amount of negative counterexamples of the current assertion
    double n = negatives.size();
    if (p == 0) {
      n = negativeCounterexamples(expressions, specChromosome);
    }
    specChromosome.setAmountOfPositiveCounterexamples(p);
    specChromosome.setAmountOfNegativeCounterexamples(n);
    double a = expressions.size();
    double c = specComplexity(specChromosome);

    // No counterexamples + Less formulas, the better
    // double res = (MAX - (p + n)) + (1 / (a + c));

    // No counterexamples + Less formulas, the better + The more mca's, the better
    double mca = getMCA(expressions);
    double ac = a + c;
    double res = (MAX - (p + n));
    if (params.considerSizePenalty())
      res += (1 / ac);
    if (params.considerMcaReward())
      res += (mca / a) * (1 / Math.max(((a * a) - a), 1));

    if (a==1 && p==0)
      Stats.discovered_properties.add(specChromosome);

    // No counterexamples + The more formulas, the better + The less non_equiv genes, the better
    // double res (1000 - n) + (1 / amountOfGenes) * a + (1 / non_equiv(chrom))
    if (n == 0 && res > bestFitness) {
      bestFitness = res;
      int currentTime = (int) (System.currentTimeMillis() - itime) / 1000;
      System.out.println();
      System.out.println("POSTCONDITION ASSERTIONS LEARNED AT: " + currentTime + " seconds.");
      System.out.println("FITNESS: " + res);
      Stats.FITEST_CHROMOSOME = specChromosome;
      Stats.FITEST_CHROMOSOME_FV = res;
      specChromosome.printGenes();
      System.out.println();
    }
    calculatedFitness.put(specChromosome.toString(),
        new FitnessValue(p, n, res, specChromosome.getCounterexamplesMutationsStr()));
    Stats.FITNESS_CALCULATION_TIME += System.currentTimeMillis() - timeBeforeFitnessComputation;
    Stats.FITNESS_FUNCTION_EXECUTIONS++;
    return res;
  }

  /**
   * Compute the amount of method component assertions, i.e., the number of assertions that
   * represents properties about the arguments, the results, or comparisons between the initial and
   * final states
   */
  public double getMCA(List<Expr> expressions) {
    double mca = 0;
    for (Expr expr : expressions) {
      String str = expr.toString();
      if (str.contains("arg") || str.contains(ExprName.RESULT)
          || (str.contains(ExprName.THIS_PRE) && str.contains(" "+ExprName.THIS)))
        mca++;
    }
    return mca;
  }

  /**
   * Returns true if the conjunction of the given assertions has at least one positive
   * counterexample. That is, the conjunction returns false for at least one positive instance.
   */
  private boolean hasPositiveCounterexample(List<Expr> assertions) {
    for (MethodExecution positive : positives) {
      for (Expr expr : assertions) {
        if (!evaluate(expr, positive))
          return true;
      }
    }
    return false;
  }

  /**
   * Returns the amount of positive counterexamples, i.e., the positives instances for which the
   * given assertion returns true
   */
  private double positiveCounterexamples(List<Expr> expressions) {
    double counterexamples = 0;
    for (MethodExecution positive : positives) {
      for (Expr expr : expressions) {
        try {
          if (!evaluate(expr, positive)) {
            counterexamples++;
            break;
          }
        } catch (NonEvaluableExpressionException e) {
          // When the expression can't be evaluated, consider the method execution as a counterexample
          counterexamples++;
          break;
        }
      }
    }
    return counterexamples;
  }

  /**
   * Evaluates the given expression on the given method execution
   */
  private boolean evaluate(Expr expr, MethodExecution me) {
    HashMap<String, Object> current_vars = new HashMap<>();
    current_vars.put(ExprName.THIS_PRE, me.getObjectFrom());
    current_vars.put(ExprName.THIS, me.getObjectFinalState());
    current_vars.put(ExprName.RESULT, me.getResult());
    // Set the method arguments
    List<Object> currArgsValues = me.getMethodArguments();
    for (int i = 0 ; i < currArgsValues.size(); i++) {
      current_vars.put(ExprName.getArgLabel(i),currArgsValues.get(i));
    }
    return ExpressionEvaluator.eval(expr.exprCtx(), current_vars);
  }

  /**
   * Returns true if the expression can be evaluated in negative objects
   *
   * An expression can be evaluated in a negative object only if the expression represents a
   * property about the final state of the object invoking the method
   */
  public boolean evaluableInNegatives(Expr expr) {
    return !expr.toString().contains(ExprName.THIS_PRE)
            || (expr.toString().indexOf(ExprName.THIS_PRE) != expr.toString().lastIndexOf(ExprName.THIS)
            || expr.toString().indexOf(ExprName.THIS) != expr.toString().indexOf(ExprName.THIS_PRE));
  }

  /**
   * Returns the amount of negative counterexamples, i.e., the negative instances for which the
   * given assertion returns true
   */
  private double negativeCounterexamples(List<Expr> expressions, SpecChromosome chromosome) {
    double counterexamples = 0;
    Set<MethodExecution> ce = new HashSet<>();
    for (MethodExecution negative : negatives) {
      boolean iscounterexample = true;
      for (Expr expr : expressions) {
        try {
          if (!evaluableInNegatives(expr))
            continue;
          if (!evaluate(expr, negative)) {
            iscounterexample = false; // At least one assertion is violated
            break;
          }
        } catch (NonEvaluableExpressionException e) {
          // When the expression can't be evaluated, consider the method
          // execution as a counterexample
          break;
        }
      }
      if (iscounterexample) {
        counterexamples++;
        ce.add(negative);
      }
    }
    String meMutationsStrings = "";
    if (ce.size() <= 20) {
      for (MethodExecution me : ce) {
        meMutationsStrings += "\t\t" + prettify(me.getMutation()) + "\n";
      }
      chromosome.setCounterexamplesMutationsStr(meMutationsStrings);
    }
    return counterexamples;

  }

  /**
   * Computes the complexity of the given SpecChromosome. The complexity of a SpecChromosome is
   * given by the sum of the complexity of each gene
   */
  private double specComplexity(SpecChromosome specChromosome) {
    Gene[] genes = specChromosome.getGenes();
    double complexity = 0;
    for (int i = 0; i < genes.length; i++) {
      ExprGene gene = (ExprGene) genes[i];
      ExprGeneValue geneValue = (ExprGeneValue) gene.getInternalValue();
      if (!geneValue.getExpression().equals(ExprBuilder.TRUE)) {
        // The gene is not "empty"
        complexity += geneValue.getComplexity();
      }
    }
    return complexity;
  }

  private String prettify(String str) {
    return str.replaceAll("casestudies.commonscollections.AbstractLinkedList\\$", "")
        .replaceAll("casestudies.commonscollections.", "");
  }

}
