package utils;

import java.util.LinkedList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import method.MethodExecution;

/**
 * This class contains parameters for the learning process
 * 
 * @author fmolina
 */
public class EvoSpexParameters {

  // Randomized version
  // Only used for experimental purposes
  private boolean random = false;

  // Evolutionary process parameters
  private int populationSize;
  private int generations;
  private double mutationProb;
  private double crossoverProb;
  private long timeout;
  private boolean sizePenalty;
  private boolean mcaReward;

  // Chromosomes related parameters
  private int amountOfGenes;
  private int examplesConsideredForInitialChromosomesGeneration;
  private boolean initialChromosomesUnary;
  private boolean buildBigAndChromosome;

  // Expressions generation related parameters
  private boolean considerJoinedExpressions;
  private boolean considerJoinedExpressionsComparisons;
  private boolean considerIntEvaluations;
  private boolean considerCardinalityExpressions;
  private boolean considerSimpleClosuredExpressions;
  private boolean considerDoubleClosuredExpressions;

  // Instances file names (used when learning post conditions)
  private String inputsFilename;
  private String positivesFilename;
  private String negativesFilename;
  private String baseFolderName;
  private int argsNum;
  private int outputsNum;
  private boolean learnPre;
  public static boolean PC_WITH_RESULT; // The method for which we are learning the pc has a result
  public static boolean PC_WITH_ARGS; // The method for which we are learning the pc has at least
                                      // one argument
  public static Object RESULT_EXAMPLE; // A result example (only to be used when PC_WITH_RESULT is
                                       // true)
  public static List<Object> ARGS_EXAMPLES; // An example for each argument (used when PC_WITH_ARGS
                                            // holds)
  private List<MethodExecution> positives;
  private List<MethodExecution> negatives;

  /**
   * Constructor. Initialize the parameters with default value
   */
  public EvoSpexParameters() {

    // Evolutionary process parameters
    populationSize = 200;
    generations = 30;
    mutationProb = 0.3;
    crossoverProb = 0.35;
    timeout = 600; // 10 min by default
    sizePenalty = true;
    mcaReward = true;

    // Chromosomes related parameters
    amountOfGenes = 100;
    examplesConsideredForInitialChromosomesGeneration = 4;
    initialChromosomesUnary = true;
    buildBigAndChromosome = false;

    // Expressions generation related parameters
    considerJoinedExpressions = true;
    considerJoinedExpressionsComparisons = true;
    considerIntEvaluations = true;
    considerCardinalityExpressions = true;
    considerSimpleClosuredExpressions = true;
    considerDoubleClosuredExpressions = true;

    // Default values for fields related to post conditions learning
    learnPre = false;
  }

  /**
   * Get the number of generations
   */
  public int getNumberOfGenerations() {
    return generations;
  }

  /**
   * Set the number of generations
   */
  public void setNumberOfGenerations(int n) {
    if (n < 1)
      throw new IllegalArgumentException("The number of generations must be positive");
    generations = n;
  }

  /**
   * Get the amount of examples considered for the initial chromosomes generation
   */
  public int getAmountOfExamplesForInitialChromosomesGeneration() {
    return examplesConsideredForInitialChromosomesGeneration;
  }

  /**
   * Set the amount of examples considered for the initial chromosomes generation
   */
  public void setAmountOfExamplesForInitialChromosomesGeneration(int n) {
    if (n < 1 || n % 2 != 0)
      throw new IllegalArgumentException(
          "The amount of examples considered for the initial chromosomes generation must be a positive pair number");
    examplesConsideredForInitialChromosomesGeneration = n;
  }

  /**
   * Get initial chromosomes unary
   */
  public boolean getInitialChromosomesUnary() {
    return initialChromosomesUnary;
  }

  /**
   * Set initial chromosomes unary
   */
  public void setInitialChromosomesUnary(boolean b) {
    initialChromosomesUnary = b;
  }

  /**
   * Get the amount of genes
   */
  public int amountOfGenes() {
    return amountOfGenes;
  }

  /**
   * Get build big and chromosome
   */
  public boolean buildBigAndChromosome() {
    return buildBigAndChromosome;
  }

  /**
   * Set build big and chromosome
   */
  public void setBuildBigAndChromosome(boolean b) {
    buildBigAndChromosome = b;
  }

  /**
   * Get the population size
   */
  public int getPopulationSize() {
    return populationSize;
  }

  /**
   * Set the population size
   */
  public void setPopulationSize(int n) {
    if (n < 1)
      throw new IllegalArgumentException("The population size must be a positive number");
    populationSize = n;
  }

  /**
   * Get consider joined expressions
   */
  public boolean getConsiderJoinedExpressions() {
    return considerJoinedExpressions;
  }

  /**
   * Set consider joined expressions value
   */
  public void setConsiderJoinedExpressions(boolean b) {
    considerJoinedExpressions = b;
  }

  /**
   * Get consider joined expressions comparisons
   */
  public boolean getConsiderJoinedExpressionsComparisons() {
    return considerJoinedExpressionsComparisons;
  }

  /**
   * Set consider joined expressions value
   */
  public void setConsiderJoinedExpressionsComparisons(boolean b) {
    considerJoinedExpressionsComparisons = b;
  }

  /**
   * Get consider int evaluations
   */
  public boolean getConsiderIntEvaluations() {
    return considerIntEvaluations;
  }

  /**
   * Set consider int evaluations
   */
  public void setConsiderIntEvaluations(boolean b) {
    considerIntEvaluations = b;
  }

  /**
   * Get consider cardinality expressions
   */
  public boolean getConsiderCardinalityExpressions() {
    return considerCardinalityExpressions;
  }

  /**
   * Set consider cardinality expressions
   */
  public void setConsiderCardinalityExpressions(boolean b) {
    considerCardinalityExpressions = b;
  }

  /**
   * Get consider simple closured expressions
   */
  public boolean getConsiderSimpleClosuredExpressions() {
    return considerSimpleClosuredExpressions;
  }

  /**
   * Set consider simple closured expressions
   */
  public void setConsiderSimpleClosuredExpressions(boolean b) {
    considerSimpleClosuredExpressions = b;
  }

  /**
   * Get consider double closured expressions
   */
  public boolean getConsiderDoubleClosuredExpressions() {
    return considerDoubleClosuredExpressions;
  }

  /**
   * Set consider double closured expressions
   */
  public void setConsiderDoubleClosuredExpressions(boolean b) {
    considerDoubleClosuredExpressions = b;
  }

  /**
   * Get the mutation probability
   */
  public double getMutationProbability() {
    return mutationProb;
  }

  /**
   * Set the mutation probability
   */
  public void setMutationProbabilty(double mProb) {
    if (mProb < 0 || mProb > 1)
      throw new IllegalArgumentException("Invalid probability");
    mutationProb = mProb;
  }

  /**
   * Get the crossover probability
   */
  public double getCrossoverProbability() {
    return crossoverProb;
  }

  /**
   * Set the crossover probability
   */
  public void setCrossoverProbability(double cProb) {
    if (cProb < 0 || cProb > 1)
      throw new IllegalArgumentException("Invalid probability");
    crossoverProb = cProb;
  }

  /**
   * Get the inputs filename
   */
  public String getInputsFilename() {
    return inputsFilename;
  }

  /**
   * Set the inputs filename
   */
  public void setInputsFilename(String filename) {
    inputsFilename = filename;
  }

  /**
   * Get the positives filename
   */
  public String getPositivesFilename() {
    return positivesFilename;
  }

  /**
   * Set the positives filename
   */
  public void setPositivesFilename(String filename) {
    positivesFilename = filename;
  }

  /**
   * Get the negatives filename
   */
  public String getNegativesFilename() {
    return negativesFilename;
  }

  /**
   * Set the negatives filename
   */
  public void setNegativesFilename(String filename) {
    negativesFilename = filename;
  }

  /**
   * Get the base folder bane
   */
  public String getBaseFolderName() {
    return baseFolderName;
  }

  /**
   * Set the negatives filename
   */
  public void setBaseFolderName(String foldername) {
    baseFolderName = foldername;
  }

  /**
   * Get the amount of arguments
   */
  public int getArgumentsNumber() {
    return argsNum;
  }

  /**
   * Set the amount of arguments
   */
  public void setArgumentsNumber(int argsNum) {
    assert argsNum >= 1;
    this.argsNum = argsNum;
  }

  /**
   * Get the amount of outputs
   */
  public int getOutputsNumber() {
    return outputsNum;
  }

  /**
   * Set the amount of outputs
   */
  public void setOutputsNumber(int outputsNum) {
    assert outputsNum >= 1;
    this.outputsNum = outputsNum;
  }

  /**
   * Learn pre conditions
   */
  public boolean learnPre() {
    return learnPre;
  }

  /**
   * Define if the algorithm must generate formulas over the pre states when learning a post
   * condition
   */
  public void setLearnPre(boolean b) {
    learnPre = b;
  }

  /**
   * Set the timeout
   */
  public void setTimeOut(Integer sec) {
    assert (sec >= 0) : "Invalid timeout value";
    timeout = sec;
  }

  /**
   * Get the timeout
   */
  public long getTimeOut() {
    return timeout;
  }

  /**
   * Returns true if the size penalty must be considered when evaluating individuals
   */
  public boolean considerSizePenalty() {
    return sizePenalty;
  }

  /**
   * Set value for considering the size penalty when evaluating individuals
   */
  public void setConsiderSizePenalty(boolean considerSizePenalty) {
    sizePenalty = considerSizePenalty;
  }

  /**
   * Returns true if the method component assertions must be rewarded when evaluating individuals
   */
  public boolean considerMcaReward() {
    return mcaReward;
  }

  /**
   * Set value for considering the method component assertions when evaluating individuals
   */
  public void setConsiderMcaReward(boolean considerMcaReward) {
    mcaReward = considerMcaReward;
  }

  /**
   * Returns true if the search must be performed randomly Only defined for experimental purposes
   * When returns true, the algorithm will only create a random population an obtain the best
   * individual from there.
   */
  public boolean randomSearch() {
    return random;
  }

  /**
   * Set the value for random search
   */
  public void setRandomSearch(boolean useRandomVersion) {
    this.random = useRandomVersion;
  }

  /**
   * Get the list of loaded positive objects
   */
  public List<MethodExecution> getPositiveObjects() {
    return positives;
  }

  /**
   * Get the list of loaded positive objects
   */
  public List<MethodExecution> getNegativeObjects() {
    return negatives;
  }

  /**
   * Initialize fields by reading the method folder
   */
  public void readMethodsFolder() {
    PC_WITH_RESULT = outputsNum > argsNum;
    PC_WITH_ARGS = argsNum > 1;

    // Load objects from files
    List<Object> neg = XStreamDeserializer.deserialize(baseFolderName + "mut0.xml");
    List<String> mutations = XStreamDeserializer.readStringsFile(baseFolderName + "mutations0.txt");
    List<Object> resultNeg = new LinkedList<Object>();
    if (PC_WITH_RESULT)
      resultNeg = XStreamDeserializer
          .deserialize(baseFolderName + "mut" + (outputsNum - 1) + ".xml");

    XStream xstream = new XStream();
    xstream.allowTypesByRegExp(new String[] { ".*" });
    int k = 0;
    ObjectsTupleReader inObjsreader = new ObjectsTupleReader(xstream,
        baseFolderName.substring(0, baseFolderName.length() - 1), "in", ".xml", argsNum);
    ObjectsTupleReader outObjsreader = new ObjectsTupleReader(xstream,
        baseFolderName.substring(0, baseFolderName.length() - 1), "out", ".xml", outputsNum);

    // Build method execution objects
    positives = new LinkedList<MethodExecution>();
    negatives = new LinkedList<MethodExecution>();
    while (true) {
      List<Object> inObjs = inObjsreader.readTuple();
      List<Object> outObjs = outObjsreader.readTuple();
      if (inObjs == null) {
        if (outObjs != null)
          throw new Error("There are more inputs than outputs");
        break;
      }
      Object i = inObjs.get(0);
      Object p = outObjs.get(0);
      Object r = null;
      Object rMut = null;
      List<Object> args = new LinkedList<Object>();
      if (PC_WITH_RESULT) {
        r = outObjs.get(outputsNum - 1);
        rMut = resultNeg.get(k);
        if (RESULT_EXAMPLE == null)
          RESULT_EXAMPLE = r;
      }
      if (PC_WITH_ARGS) {
        for (int l = 1; l < argsNum; l++) {
          Object argL = inObjs.get(l);
          args.add(argL);
        }
        if (ARGS_EXAMPLES == null && args.size() > 0)
          ARGS_EXAMPLES = args;
      }
      MethodExecution positive = new MethodExecution(i, p, args, r, true);
      positives.add(positive);
      Object n = neg.get(k);
      String mutation = mutations.get(k);
      MethodExecution negative = new MethodExecution(i, n, args, rMut, false);

      negative.setMutation(mutation, k);
      negatives.add(negative);
      k++;
    }

  }
}