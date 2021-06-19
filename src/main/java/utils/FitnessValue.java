package utils;

/**
 * Fitness Value util used to store the fitness of a Chromosome in order the fitness value
 * computation of equal individuals
 * 
 * @author fmolina
 */
public class FitnessValue {

  private Double posCounterexamples;
  private Double negCounterexamples;
  private String counterexamplesMutationStr;
  private Double fitnessValue;

  /**
   * Constructor
   */
  public FitnessValue(Double p, Double n, Double v, String str) {
    assert p >= 0 && n >= 0 && v > 0;
    posCounterexamples = p;
    negCounterexamples = n;
    fitnessValue = v;
    counterexamplesMutationStr = str;
  }

  /**
   * Get amount of positive counterexamples
   */
  public Double positiveCounterexamples() {
    return posCounterexamples;
  }

  /**
   * Get the amount of negative counterexamples
   */
  public Double negativeCounterexamples() {
    return negCounterexamples;
  }

  /**
   * Fitness value
   */
  public Double getFitnessValue() {
    return fitnessValue;
  }

  /**
   * Get counterexamples mutations str
   */
  public String counterexamplesMutationsStr() {
    return counterexamplesMutationStr;
  }

}
