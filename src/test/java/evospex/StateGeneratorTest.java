package evospex;

import evospex.state.StateSerializer;
import org.junit.Test;

import java.util.List;

public class StateGeneratorTest {

  @Test
  public void test() {
    StateGenerator stateGenerator = new StateGenerator("casestudies.motivation.AvlTreeListTest");
    try {
      stateGenerator.generateStates();
      List<Object> inputs = StateSerializer.inputs;
      List<Object> outputs = StateSerializer.outputs;
      System.out.println("Inputs: " + inputs);
      System.out.println("Outputs: " + outputs);
    } catch (Exception e) {
      assert false;
    }
  }
}
