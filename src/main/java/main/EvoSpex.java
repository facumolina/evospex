package main;

import org.jgap.InvalidConfigurationException;

import utils.EvoSpexParameters;

/**
 * Main class with the main methods. It takes an Alloy file containing a repOKOK pred which is a
 * representation invariant of some data structure, and also contains a repOK pred which is empty
 * and will be filled with a representation invariant equivalent to the repOKOK.
 * 
 * @author fmolina
 */
public class EvoSpex {

  private static class ARGS {
    static String POP_SIZE = "popSize";
    static String GENS = "gens";
    static String MUTATION_PROB = "mp";
    static String CROSSOVER_PROB = "cp";
    static String TIMEOUT = "to";
    static String USE_UNARY = "unary";
    static String SIZE_PENALTY = "sizePenalty";
    static String MCA_REWARD = "mcaReward";
    static String RANDOM = "random";
  }

  public static void main(String[] args) {
    try {
      if (args.length < 4) {
        System.out.println(
            "Error: correct usage is ./evospex.sh file.als methodObjsFolder numArgs numOutputs ['popSize=n' 'gens=g' 'mp=m' 'cp=c' 'to=sec']");
      } else {
        String className = args[0];
        String baseFolder = args[1];
        int numArgs = Integer.parseInt(args[2]);
        int numOutputs = Integer.parseInt(args[3]);
        ConfigurationProperties.loadFile("alearning.properties");
        EvoSpexParameters params = new EvoSpexParameters();
        if (args.length > 4) {
          for (int i = 4; i < args.length; i++) {
            if (args[i].startsWith(ARGS.POP_SIZE + "=")) {
              params.setPopulationSize(Integer.parseInt(args[i].replace(ARGS.POP_SIZE + "=", "")));
            } else if (args[i].startsWith(ARGS.GENS + "=")) {
              params.setNumberOfGenerations(Integer.parseInt(args[i].replace(ARGS.GENS + "=", "")));
            } else if (args[i].startsWith(ARGS.MUTATION_PROB + "=")) {
              params.setMutationProbabilty(
                  Double.parseDouble(args[i].replace(ARGS.MUTATION_PROB + "=", "")));
            } else if (args[i].startsWith(ARGS.CROSSOVER_PROB + "=")) {
              params.setCrossoverProbability(
                  Double.parseDouble(args[i].replace(ARGS.CROSSOVER_PROB + "=", "")));
            } else if (args[i].startsWith(ARGS.TIMEOUT + "=")) {
              params.setTimeOut(Integer.parseInt(args[i].replace(ARGS.TIMEOUT + "=", "")));
            } else if (args[i].startsWith(ARGS.USE_UNARY + "=")) {
              params.setInitialChromosomesUnary(
                  Boolean.parseBoolean(args[i].replace(ARGS.USE_UNARY + "=", "")));
            } else if (args[i].startsWith(ARGS.SIZE_PENALTY + "=")) {
              params.setConsiderSizePenalty(
                  Boolean.parseBoolean(args[i].replace(ARGS.SIZE_PENALTY + "=", "")));
            } else if (args[i].startsWith(ARGS.MCA_REWARD + "=")) {
              params.setConsiderMcaReward(
                  Boolean.parseBoolean(args[i].replace(ARGS.MCA_REWARD + "=", "")));
            } else if (args[i].startsWith(ARGS.RANDOM + "=")) {
              params.setRandomSearch(Boolean.parseBoolean(args[i].replace(ARGS.RANDOM + "=", "")));
            }
          }
        }
        params.setBaseFolderName(baseFolder);
        params.setArgumentsNumber(numArgs);
        params.setOutputsNumber(numOutputs);
        params.setBuildBigAndChromosome(false);
        processFile(className, params);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Process the given file
   */
  public static int processFile(String filePath) throws Exception {
    System.out.println("Starting learning process for: " + filePath);
    EvoSpexParameters params = new EvoSpexParameters();
    EvoSpexGA learner = new EvoSpexGA(filePath, params);
    learner.learnSpecFromEmptySpec();
    return 1;
  }

  /**
   * Process the given file and attempt to learn the postcondition of the given method
   * 
   * @throws InvalidConfigurationException
   */
  public static int processFile(String filePath, String inputsFile, String positivesFile,
      String negativesFile) throws Exception {
    System.out.println("Starting learning process for: " + filePath);
    EvoSpexParameters params = new EvoSpexParameters();
    params.setInputsFilename(inputsFile);
    params.setPositivesFilename(positivesFile);
    params.setNegativesFilename(negativesFile);
    EvoSpexGA learner = new EvoSpexGA(filePath, params);
    learner.learnPostCondition();
    return 1;
  }

  /**
   * Process the given file and attempt to learn the postcondition of the given method
   * 
   * @throws InvalidConfigurationException
   */
  public static int processFile(String className, String baseFolder, int numArgs, int numOutputs)
      throws Exception {
    String filePath = "src/test/resources/specs/" + className + ".als";
    System.out.println("Starting learning process for: " + filePath);
    EvoSpexParameters params = new EvoSpexParameters();
    params.setBaseFolderName(baseFolder);
    params.setArgumentsNumber(numArgs);
    params.setOutputsNumber(numOutputs);
    params.setPopulationSize(200);
    params.setBuildBigAndChromosome(false);
    EvoSpexGA learner = new EvoSpexGA(filePath, "", params);
    learner.learnPostCondition();
    return 1;
  }

  /**
   * Process the given file and attempt to learn the postcondition of the given method
   * 
   * @throws InvalidConfigurationException
   */
  public static int processFile(String filePath, EvoSpexParameters params) throws Exception {
    System.out.println("Starting learning process for: " + filePath);
    EvoSpexGA learner = new EvoSpexGA(filePath, "", params);
    learner.learnPostCondition();
    return 1;
  }
}
