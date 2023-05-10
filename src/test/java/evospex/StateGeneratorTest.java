package evospex;

import evospex.state.StateSerializer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.util.List;

public class StateGeneratorTest {

  @Test
  public void testCollectedObjects() {
    StateGenerator stateGenerator = new StateGenerator("casestudies.motivation.AvlTreeListTest");
    try {
      stateGenerator.generatePositiveStates();
      List<Object> inputs = StateSerializer.inputs;
      List<Object> outputs = StateSerializer.outputs;
      assertEquals(6, inputs.size());
      assertEquals(6, outputs.size());
    } catch (Exception e) {
      assert false;
    }
  }
}
