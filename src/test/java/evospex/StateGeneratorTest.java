package evospex;

import evospex.state.StateSerializer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StateGeneratorTest {

  @Before
  public void setUp() {
    StateSerializer.clear();
  }

  @Test
  public void testCollectedObjects_AvlTreeAdd_add() {
    String targetTestClass = "casestudies.motivation.AvlTreeListTest";
    String targetMethodSignature = "<casestudies.motivation.AvlTreeList: boolean add(java.lang.Object)>";
    StateGenerator stateGenerator = new StateGenerator(targetTestClass, targetMethodSignature);
    StateSerializer.setup(stateGenerator.getTargetMethod());
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
      assertEquals(6, StateSerializer.outputsResult.size()); // There should be 6 results
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  public void testCollectedObjects_AvlTreeAdd_size() {
    String targetTestClass = "casestudies.motivation.AvlTreeListTest";
    String targetMethodSignature = "<casestudies.motivation.AvlTreeList: int size()>";
    StateGenerator stateGenerator = new StateGenerator(targetTestClass, targetMethodSignature);
    StateSerializer.setup(stateGenerator.getTargetMethod());
    try {
      stateGenerator.generatePositiveStates();
      // Asserts for input this
      assertEquals(3, StateSerializer.inputsThis.size()); // There should be 3 'this' objects
      // Assert for input arguments
      assertEquals(0, StateSerializer.inputsArgs.size()); // There should be 0 list of arguments
      // Asserts for output this
      assertEquals(3, StateSerializer.outputsThis.size()); // There should be 3 'this' objects
      // Assert for output arguments
      assertEquals(0, StateSerializer.outputsArgs.size()); // There should be 0 list of arguments
      // Assert for output result
      assertEquals(3, StateSerializer.outputsResult.size()); // There should be 3 results
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  public void testCollectedObjects_AvlTreeAdd_remove() {
    String targetTestClass = "casestudies.motivation.AvlTreeListTest";
    String targetMethodSignature = "<casestudies.motivation.AvlTreeList: java.lang.Object remove(int)>";
    StateGenerator stateGenerator = new StateGenerator(targetTestClass, targetMethodSignature);
    StateSerializer.setup(stateGenerator.getTargetMethod());
    try {
      stateGenerator.generatePositiveStates();
      // Asserts for input this
      assertEquals(1, StateSerializer.inputsThis.size()); // There should be 3 'this' objects
      // Assert for input arguments
      assertEquals(1, StateSerializer.inputsArgs.size()); // There should be 0 list of arguments
      // Asserts for output this
      assertEquals(1, StateSerializer.outputsThis.size()); // There should be 3 'this' objects
      // Assert for output arguments
      assertEquals(1, StateSerializer.outputsArgs.size()); // There should be 0 list of arguments
      // Assert for output result
      assertEquals(1, StateSerializer.outputsResult.size()); // There should be 3 results
    } catch (Exception e) {
      assert false;
    }
  }
}
