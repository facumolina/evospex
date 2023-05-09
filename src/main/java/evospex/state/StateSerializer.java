package evospex.state;

import java.util.ArrayList;
import java.util.List;

public class StateSerializer {

  public static List<Object> inputs = new ArrayList<>();
  public static List<Object> outputs = new ArrayList<>();

  public static void serializeInput(Object input) {
    System.out.println("Serializing input");
    System.out.println(input);
    inputs.add(input);
  }

  public static void serializeOutput(Object output) {
    System.out.println("Serializing output");
    System.out.println(output);
    outputs.add(output);
  }

}
