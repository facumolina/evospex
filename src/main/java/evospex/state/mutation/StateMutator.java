package evospex.state.mutation;

import com.thoughtworks.xstream.XStream;
import evospex.expression.Expr;
import evospex.expression.evaluator.ExpressionEvaluator;
import evospex.expression.symbol.ExprName;
import evospex.utils.TargetInformation;
import soot.SootMethod;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * StateMutator class: perform mutations on states.
 * @author Facundo Molina
 */
public class StateMutator {

  private static String lastMutation = "";

  private static TargetInformation targetInformation;

  private static XStream xstream = new XStream();

  /**
   * Setup the mutator from the target class.
   * @param cl the target class.
   */
  private static void setup(Class<?> cl) {
    targetInformation = new TargetInformation(cl, false);
  }

  /**
   * Mutate the ith state from the given list of states.
   * @param method is the target method
   * @param states is the list of states
   * @param position is the position of the state to mutate
   * @return the mutated state
   */
  public static Object mutateState(SootMethod method, List<Object> states, int position) {
    boolean fieldMutationAllowed = false;
    Object toMutate = states.get(position);

    // If the object to mutate is an instance of the target class, then the field mutation is allowed
    if (toMutate.getClass().getName().equals(method.getDeclaringClass().getName())) {
      fieldMutationAllowed = true;
    }
    if (fieldMutationAllowed) {
      // Choose between field mutation and swap
      Random rnd = new Random();
      int random = rnd.nextInt(2);
      if (random == 0) {
        return performFieldMutation(toMutate);
      } else {
        return performSwap(states, position);
      }
    } else {
      return performSwap(states, position);
    }
  }

  /**
   * Mutate the given object by performing a 'field mutation'.
   * @param object is the object to mutate
   * @return the mutated object
   */
  private static Object performFieldMutation(Object object) {
    if (object == null) throw new IllegalArgumentException("Object to mutate cannot be null");
    if (targetInformation == null) setup(object.getClass());

    Object copy = xstream.fromXML(xstream.toXML(object));

    List<Expr> exprs = getEvaluableExpressions(copy);
    // Choose a random expression
    Random rnd = new Random();
    int random = rnd.nextInt(exprs.size());
    Expr expr = exprs.get(random);
    // Choose a random value for the expression
    Object value = FieldMutator.mutateField(expr, copy);
    lastMutation = "[Field Mutation] " + expr.exprCtx().getText() + " --> " + value;
    return object;
  }

  /**
   * Get the list of expressions that can be evaluated on the given object.
   * @param object is the object to evaluate.
   * @return the list of expressions that can be evaluated.
   */
  private static List<Expr> getEvaluableExpressions(Object object) {
    List<Expr> evaluable = new ArrayList<>();
    for (Expr expr : targetInformation.getEvaluableExpressions()) {
      try {
        ExpressionEvaluator.evalAnyExpr(expr.exprCtx(), ExprName.THIS, object);
        evaluable.add(expr);
      } catch (Exception e) {
      }
    }
    return evaluable;
  }

  /**
   * Mutate the ith state from the given list of states by performing a 'swap' with a another random state.
   */
  private static Object performSwap(List<Object> states, int position) {
    // Create a random set of integers from 0 to states.size() - 1
    // and remove the position from the set
    Set<Integer> positions = IntStream.rangeClosed(0, states.size()-1).boxed().collect(Collectors.toSet());
    positions.remove(position);
    // Choose a random position from the set
    Random rnd = new Random();
    int randomPosition = rnd.nextInt(positions.size()+1);
    // Update the last mutation
    lastMutation = "[Swap Mutation] Object in position " + position + " replaced by the one in position " + randomPosition;
    // Get the state from the random position
    return states.get(randomPosition);
  }

  /**
   * Get the last applied mutation
   */
  public static String getLastMutation() {
    return lastMutation;
  }

}
