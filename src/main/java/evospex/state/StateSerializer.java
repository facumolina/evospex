package evospex.state;

import com.thoughtworks.xstream.XStream;
import soot.SootMethod;

import java.io.File;
import java.io.ObjectOutputStream;
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

  // Some auxiliary variables
  private static int arguments = 0;

  // Actual serializer
  private static final XStream xstream = new XStream();

  // Serialization
  private static final String BASE_OUTPUT_FOLDER = "states";
  private static final String INPUTS_FILE_BASE_NAME = "in";
  private static final String OUTPUTS_FILE_BASE_NAME = "out";

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
  }

  /**
   * Serializes a target method input.
   * @param position the position of the input in the method signature: 0 for the 'this' object, 1 for the first parameter, etc.
   * @param input the input to serialize
   */
  public static void serializeInput(int position, Object input) {
    System.out.println("--> Serializing input");
    System.out.println("position: " + position);
    System.out.println("object: " + input);
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
    System.out.println("--> Serializing output");
    System.out.println("position: " + position);
    System.out.println("object: "+output);
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
   * Saves the serialization to a file.
   */
  public static void saveSerialization() {
    System.out.println("--> Saving serialization");
    String folder = formatFolderName(targetMethodSignature);
    System.out.println("> output folder: " + folder);
    // Save inputs objects
    String inputsThisFile = folder + "/" + INPUTS_FILE_BASE_NAME + "0.xml";
    saveObjects(inputsThisFile, inputsThis);
    System.out.println("> saved: "+inputsThisFile);
    // Save the input arguments objects (if any)
    if (inputsArgs.size() > 0) {
      for (int i = 0; i < inputsArgs.size(); i++) {
        String inputsArgsFile = folder + "/" + INPUTS_FILE_BASE_NAME + (i + 1) + ".xml";
        saveObjects(inputsArgsFile, inputsArgs.get(i));
        System.out.println("> saved: "+inputsArgsFile);
      }
    }
    // Save outputs objects
    String outputsThisFile = folder + "/" + OUTPUTS_FILE_BASE_NAME + "0.xml";
    saveObjects(outputsThisFile, outputsThis);
    System.out.println("> saved: "+outputsThisFile);
    // Save the output arguments objects (if any)
    if (outputsArgs.size() > 0) {
      for (int i = 0; i < outputsArgs.size(); i++) {
        String outputsArgsFile = folder + "/" + OUTPUTS_FILE_BASE_NAME + (i + 1) + ".xml";
        saveObjects(outputsArgsFile, outputsArgs.get(i));
        System.out.println("> saved: "+outputsArgsFile);
      }
    }
    // Save the result object (if any)
    if (outputsResult.size() > 0) {
      String outputsResultFile = folder + "/" + OUTPUTS_FILE_BASE_NAME + (arguments + 1) + ".xml";
      saveObjects(outputsResultFile, outputsResult);
      System.out.println("> saved: "+outputsResultFile);
    }
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
   * Format folder name for a target method.
   * @param targetMethodSignature the target method signature.
   */
  public static String formatFolderName(String targetMethodSignature) {
    String formattedFolderName = targetMethodSignature.replace("<", "").replace(">", "").replace(":", "").replace(" ", "_");
    formattedFolderName = formattedFolderName.replace(targetClassName,"");
    return BASE_OUTPUT_FOLDER + "/" + targetClassName + "/" + formattedFolderName;
  }

}
