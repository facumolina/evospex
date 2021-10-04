package evospex.target;

import java.util.List;

/**
 * This class represents a particular method execution. A method execution has the components o,
 * o_f, args and r where:
 * 
 * - o is the object from which the method was invoked
 * 
 * - o_f is the final state of the object from which the method was invoked
 * 
 * - args are the method arguments and,
 * 
 * - r is the method execution result
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class MethodExecution {

  private Object o;
  private Object o_f;
  private List<Object> args;
  private Object r;
  private String mutation;
  private int mutationPosition;
  private boolean isPositive;

  /**
   * Constructor with object states only
   */
  public MethodExecution(Object objectInitialState, Object objectFinalState, boolean isPos) {
    assert objectFinalState != null;
    this.o = objectInitialState;
    this.o_f = objectFinalState;
    isPositive = isPos;
  }

  /**
   * Constructor with result
   */
  public MethodExecution(Object objectInitialState, Object objectFinalState, Object result,
      boolean isPos) {
    this(objectInitialState, objectFinalState, isPos);
    this.r = result;
  }

  /**
   * Constructor with arguments and result
   */
  public MethodExecution(Object objectInitialState, Object objectFinalState, List<Object> arguments,
      Object result, boolean isPos) {
    this(objectInitialState, objectFinalState, isPos);
    this.args = arguments;
    this.r = result;
  }

  /**
   * Get the object from which the method was invoked
   */
  public Object getObjectFrom() {
    return o;
  }

  /**
   * Get the final state of the object from which the method was invoked
   */
  public Object getObjectFinalState() {
    return o_f;
  }

  /**
   * Get the method execution arguments
   */
  public List<Object> getMethodArguments() {
    return args;
  }

  /**
   * Get the method execution result
   */
  public Object getResult() {
    return r;
  }

  /**
   * Return true if this is a positive method execution
   */
  public boolean isPositive() {
    return isPositive;
  }

  /**
   * Set the mutation that leads to this object (only for negatives)
   */
  public void setMutation(String str, int k) {
    assert str != null && !isPositive;
    this.mutation = str;
    mutationPosition = k;
  }

  /**
   * Get the mutation that leads to this object
   */
  public String getMutation() {
    return mutation + "- POS: " + mutationPosition;
  }

  @Override
  public String toString() {
    return "ME [o_f=" + (o_f != null) + ", result=" + (r != null) + "]";
  }
}