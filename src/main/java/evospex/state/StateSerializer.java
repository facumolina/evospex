package evospex.state;

import com.thoughtworks.xstream.XStream;

import java.util.ArrayList;
import java.util.List;

/**
 * StateSerializer class: serializes inputs and outputs of a test case
 * @author Facundo Molina
 */
public class StateSerializer {

  // List of inputs and outputs
  public static List<Object> inputs = new ArrayList<>();
  public static List<Object> outputs = new ArrayList<>();

  // Actual serializer
  private static XStream xstream = new XStream();

  public static void serializeInput(Object input) {
    System.out.println("Serializing input");
    System.out.println(input);
    Object toPreserve = xstream.toXML(input);
    inputs.add(toPreserve);
  }

  public static void serializeOutput(Object output) {
    System.out.println("Serializing output");
    System.out.println(output);
    Object toPreserve = xstream.toXML(output);
    outputs.add(toPreserve);
  }

}
