package evospex.state.mutation;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * StateMutator class: perform mutations on states.
 * @author Facundo Molina
 */
public class StateMutator {

  /**
   * Mutate the ith state from the given list of states.
   * @param states is the list of states
   * @param position is the position of the state to mutate
   * @return the mutated state
   */
  public static Object mutateState(List<Object> states, int position) {
    // Create a random set of integers from 0 to states.size() - 1
    // and remove the position from the set
    Set<Integer> positions = IntStream.rangeClosed(0, states.size()-1).boxed().collect(Collectors.toSet());
    positions.remove(position);
    // Choose a random position from the set
    Random rnd = new Random();
    int randomPosition = rnd.nextInt(positions.size()+1);
    // Get the state from the random position
    return states.get(randomPosition);
  }

}
