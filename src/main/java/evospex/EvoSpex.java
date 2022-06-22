package evospex;

import evospex.ga.EvoSpexGA;
import org.jgap.InvalidConfigurationException;

/**
 * Class main.EvoSpex is the main class of the system. It allows to start the evolutionary process
 * from a given target class that has only one method with the statement assert(true); denoting the
 * place in which the inferred postcondition it is supposed to be produced.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
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
            "Error: correct usage is ./evospex.sh class_name method_name methods_object_folder ['popSize=n' 'gens=g' 'mp=m' 'cp=c' 'to=sec']");
        System.out.println();
        System.out.println("Example: ./evospex.sh casestudies.motivation.AvlTreeList clear src/test/resources/objects/AvlTreeList/clear\\\\\\(\\\\\\)/3/");
      } else {
        String fqname = args[0];
        String baseFolder = args[1];
        int numArgs = Integer.parseInt(args[2]);
        int numOutputs = Integer.parseInt(args[3]);
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
        processClass(fqname, params);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Process the given file and attempt to learn the postcondition of the given method
   * 
   * @throws InvalidConfigurationException
   */
  public static int processClass(String className, String baseFolder, int numArgs, int numOutputs)
      throws Exception {
    String filePath = "src/test/resources/specs/" + className + ".als";
    System.out.println("Starting learning process for: " + filePath);
    EvoSpexParameters params = new EvoSpexParameters();
    params.setBaseFolderName(baseFolder);
    params.setArgumentsNumber(numArgs);
    params.setOutputsNumber(numOutputs);
    params.setPopulationSize(200);
    params.setBuildBigAndChromosome(false);
    //EvoSpexGA learner = new EvoSpexGA(filePath, "", params);
    //learner.learnPostCondition();
    return 1;
  }

  /**
   * Process the given file and attempt to learn the postcondition of the given method
   * 
   * @throws InvalidConfigurationException
   */
  public static int processClass(String targetClassName, EvoSpexParameters params) throws Exception {
    System.out.println("EvoSpex 1.0.0");
    Class<?> targetClass = getTargetClass(targetClassName);

    if (targetClass==null) {
      System.out.println("The target class " + targetClassName + " can't be loaded. Is it in the classpath?");
      return 0;
    }

    System.out.println("target class: " + targetClass.getName());
    System.out.println("target method states: "+params.getBaseFolderName());
    EvoSpexGA learner = new EvoSpexGA(targetClass, "", params);
    learner.learnPostCondition();
    return 1;
  }

  /**
   * Load and return the target class or null if can't be loaded
   */
  private static Class<?> getTargetClass(String targetClassName) {
    try {
      return Class.forName(targetClassName);
    } catch (ClassNotFoundException e) {
      return null;
    }
  }

}
