package evospex.target;

import java.util.HashMap;
import java.util.Map;

/**
 * This class contains the method execution context. Used by the expression evaluation mechanism to
 * obtain the objects to be evaluated
 *
 * @author fmolina
 */
public class MethodExecutionContext {

  Map<String, Object> context;

  /**
   * Default constructor
   */
  public MethodExecutionContext() {
    context = new HashMap<String, Object>();
  }

  /**
   * Constructor from MethodExecution
   */
  public MethodExecutionContext(MethodExecution me) {
    context = new HashMap<String, Object>();
    if (me.getObjectFrom() != null)
      context.put("oPre", me.getObjectFrom());
    if (me.getResult() != null)
      context.put("result", me.getResult());
    if (me.getMethodArguments() != null)
      setArgumentsToContext(me);
    context.put("o", me.getObjectFinalState());
  }

  /**
   * Get value
   */
  public Object getValue(String objectName) {
    return context.get(objectName);
  }

  /**
   * Set value
   */
  public void setValue(String objectName, Object object) {
    context.put(objectName, object);
  }

  /**
   * Set arguments to context
   */
  private void setArgumentsToContext(MethodExecution me) {
    if (me.getMethodArguments().size() > 0) {
      int argPos = 0;
      for (Object arg : me.getMethodArguments()) {
        context.put("arg" + argPos, arg);
        argPos++;
      }
    }
  }
}
