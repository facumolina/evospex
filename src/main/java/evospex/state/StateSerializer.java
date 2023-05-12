package evospex.state;

import com.thoughtworks.xstream.XStream;
import soot.SootMethod;

import java.io.File;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * StateSerializer class: serializes inputs and outputs of a test case
 * @author Facundo Molina
 */
public class StateSerializer {

  private static String targetClassName;
  private static String targetMethodSignature;

  // List of inputs and outputs
  public static List<Object> inputsThis = new ArrayList<>();
  public static List<List<Object>> inputsArgs = new ArrayList<>();

  public static List<Object> outputsThis = new ArrayList<>();
  public static List<List<Object>> outputsArgs = new ArrayList<>();
  public static List<Object> outputsResult = new ArrayList<>();

  public static List<Object> mutatedThis = new ArrayList<>();
  public static List<Object> mutatedResults = new ArrayList<>();
  public static List<String> mutationsApplied = new ArrayList<>();

  // Some auxiliary variables
  private static int arguments = 0;

  // Actual serializer
  private static final XStream xstream = new XStream();

  // Serialization
  private static final String BASE_OUTPUT_FOLDER = "states";
  private static final String INPUTS_FILE_BASE_NAME = "in";
  private static final String OUTPUTS_FILE_BASE_NAME = "out";
  private static final String MUTATED_FILE_BASE_NAME = "mut";
  private static final String MUTATIONS_APPLIED_FILE_BASE_NAME = "mutations";

  /**
   * Setup the serializer from the target method.
   * @param targetMethod the target method.
   */
  public static void setup(SootMethod targetMethod) {
    arguments = targetMethod.getParameterCount();
    targetClassName = targetMethod.getDeclaringClass().getName();
    targetMethodSignature = targetMethod.getSignature();
  }

  /**
   * Clear all the lists.
   */
  public static void clear() {
    inputsThis.clear();
    inputsArgs.clear();
    outputsThis.clear();
    outputsArgs.clear();
    outputsResult.clear();
    mutatedThis.clear();
    mutatedResults.clear();
    mutationsApplied.clear();
  }

  /**
   * Serializes a target method input.
   * @param position the position of the input in the method signature: 0 for the 'this' object, 1 for the first parameter, etc.
   * @param input the input to serialize
   */
  public static void serializeInput(int position, Object input) {
    Object toPreserve = xstream.fromXML(xstream.toXML(input));
    if (position == 0) {
      inputsThis.add(toPreserve);
    } else {
      if (inputsArgs.size() < position) {
        inputsArgs.add(new ArrayList<>());
      }
      inputsArgs.get(position - 1).add(toPreserve);
    }
  }

  /**
   * Serializes a target method output.
   * @param position the position of the output in the method signature: 0 for the 'this' object, 1 to n for the parameters, and n+1 for the result.
   * @param output the output to serialize.
   */
  public static void serializeOutput(int position, Object output) {
    Object toPreserve = xstream.fromXML(xstream.toXML(output));
    if (position == 0) {
      outputsThis.add(toPreserve);
    } else {
      if (position == arguments + 1) {
        outputsResult.add(toPreserve);
      } else {
        if (outputsArgs.size() < position) {
          outputsArgs.add(new ArrayList<>());
        }
        outputsArgs.get(position - 1).add(toPreserve);
      }
    }
  }

  /**
   * Serializes a mutated object.
   * @param position the position of the mutated object in the method signature: 0 for the 'this' object, 1 to n for the parameters, and n+1 for the result.
   * @param mutatedObject the mutated object to serialize.
   */
  public static void serializeMutatedObject(int position, Object mutatedObject, String mutationApplied) {
    Object toPreserve = xstream.fromXML(xstream.toXML(mutatedObject));
    if (position == 0) {
      mutatedThis.add(toPreserve);
    } else {
      mutatedResults.add(toPreserve);
    }
    if (mutationApplied != null) {
      mutationsApplied.add(mutationApplied);
    }
  }

  /**
   * Saves the serialization to a file.
   */
  public static void saveSerialization() {
    System.out.println("--> saving serialization");
    String folder = formatFolderName(targetMethodSignature);
    System.out.println("output folder: " + folder);
    // Save inputs objects
    String inputsThisFile = folder + "/" + INPUTS_FILE_BASE_NAME + "0.xml";
    saveObjects(inputsThisFile, inputsThis);
    System.out.println("inputs this object: " + inputsThis.size() + " - file: "+inputsThisFile);
    // Save the input arguments objects (if any)
    if (inputsArgs.size() > 0) {
      for (int i = 0; i < inputsArgs.size(); i++) {
        String inputsArgsFile = folder + "/" + INPUTS_FILE_BASE_NAME + (i + 1) + ".xml";
        saveObjects(inputsArgsFile, inputsArgs.get(i));
        System.out.println("inputs arg " + (i + 1) + ": " + inputsArgs.get(i).size() + " - file: "+inputsArgsFile);
      }
    }
    // Save outputs objects
    String outputsThisFile = folder + "/" + OUTPUTS_FILE_BASE_NAME + "0.xml";
    saveObjects(outputsThisFile, outputsThis);
    System.out.println("outputs this object: " + outputsThis.size() + " - file: "+outputsThisFile);
    // Save the output arguments objects (if any)
    if (outputsArgs.size() > 0) {
      for (int i = 0; i < outputsArgs.size(); i++) {
        String outputsArgsFile = folder + "/" + OUTPUTS_FILE_BASE_NAME + (i + 1) + ".xml";
        saveObjects(outputsArgsFile, outputsArgs.get(i));
        System.out.println("outputs arg " + (i + 1) + ": " + outputsArgs.get(i).size() + " - file: "+outputsArgsFile);
      }
    }
    // Save the result object (if any)
    if (outputsResult.size() > 0) {
      String outputsResultFile = folder + "/" + OUTPUTS_FILE_BASE_NAME + (arguments + 1) + ".xml";
      saveObjects(outputsResultFile, outputsResult);
      System.out.println("outputs result: " + outputsResult.size() + " - file: "+outputsResultFile);
    }
    // Save mutated objects
    String mutatedThisFile = folder + "/" + MUTATED_FILE_BASE_NAME + "0.xml";
    saveObjects(mutatedThisFile, mutatedThis);
    System.out.println("mutated this object: " + mutatedThis.size() + " - file: "+mutatedThisFile);
    if (outputsResult.size() > 0) {
      String mutatedResultsFile = folder + "/" + MUTATED_FILE_BASE_NAME + (arguments + 1) + ".xml";
      saveObjects(mutatedResultsFile, mutatedResults);
      System.out.println("mutated result: " + mutatedResults.size() + " - file: "+mutatedResultsFile);
    }
    // Save mutations applied
    String mutationsAppliedFile = folder + "/" + MUTATIONS_APPLIED_FILE_BASE_NAME + "0.txt";
    saveMutationsApplied(mutationsAppliedFile, mutationsApplied);
    System.out.println("mutations applied: " + mutationsApplied.size() + " - file: "+mutationsAppliedFile);
    System.out.println();
  }

  /**
   * Save the objects from the given list in the given file name
   */
  private static void saveObjects(String fileName, List<Object> objects) {
    try {
      File f = new File(fileName);
      f.getParentFile().mkdirs();
      ObjectOutputStream oos = xstream.createObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));
      for (Object o : objects) {
        oos.writeObject(o);
      }
      oos.close();
    } catch (Exception e) {
      System.out.println("Error saving " + fileName);
    }
  }

  /**
   * Save the mutations applied in the given file name
   * @param fileName the file name
   * @param mutationsApplied the mutations applied
   */
  private static void saveMutationsApplied(String fileName, List<String> mutationsApplied) {
    try {
      File f = new File(fileName);
      f.getParentFile().mkdirs();
      PrintWriter pw = new PrintWriter(f);
      for (String mutationApplied : mutationsApplied) {
        pw.println(mutationApplied);
      }
      pw.close();
    } catch (Exception e) {
      System.out.println("Error saving " + fileName);
    }
  }

  /**
   * Format folder name for a target method.
   * @param targetMethodSignature the target method signature.
   */
  public static String formatFolderName(String targetMethodSignature) {
    String formattedFolderName = targetMethodSignature.replace("<", "").replace(">", "").replace(":", "").replace(" ", "_");
    formattedFolderName = formattedFolderName.replace(targetClassName,"");
    return BASE_OUTPUT_FOLDER + "/" + targetClassName + "/" + formattedFolderName;
  }

}
