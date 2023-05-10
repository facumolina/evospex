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
      // Asserts for input this
      assertEquals(6, StateSerializer.inputsThis.size()); // There should be 6 'this' objects
      // Assert for input arguments
      assertEquals(1, StateSerializer.inputsArgs.size()); // There should be 1 list of arguments
      assertEquals(6, StateSerializer.inputsArgs.get(0).size()); // The first and unique list should have 6 arguments
      // Asserts for output this
      assertEquals(6, StateSerializer.outputsThis.size()); // There should be 6 'this' objects
      // Assert for output arguments
      assertEquals(1, StateSerializer.outputsArgs.size()); // There should be 1 list of arguments
      assertEquals(6, StateSerializer.outputsArgs.get(0).size()); // The first and unique list should have 6 arguments
      // Assert for output result
      //assertEquals(6, StateSerializer.outputsResult.size()); // There should be 6 results
    } catch (Exception e) {
      assert false;
    }
  }
}
