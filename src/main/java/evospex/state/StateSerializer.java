package evospex.state;

import com.thoughtworks.xstream.XStream;
import soot.SootClass;
import soot.SootMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * StateSerializer class: serializes inputs and outputs of a test case
 * @author Facundo Molina
 */
public class StateSerializer {


  // List of inputs and outputs
  public static List<Object> inputsThis = new ArrayList<>();
  public static List<List<Object>> inputsArgs = new ArrayList<>();

  public static List<Object> outputsThis = new ArrayList<>();
  public static List<List<Object>> outputsArgs = new ArrayList<>();
  public static List<Object> outputsResult = new ArrayList<>();

  // Some auxiliary variables
  private static int arguments = 0;

  // Actual serializer
  private static XStream xstream = new XStream();

  /**
   * Setup the serializer from the target method.
   * @param targetMethod the target method.
   */
  public static void setup(SootMethod targetMethod) {
    arguments = targetMethod.getParameterCount();
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
    Object toPreserve = xstream.toXML(input);
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
    Object toPreserve = xstream.toXML(output);
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
}
