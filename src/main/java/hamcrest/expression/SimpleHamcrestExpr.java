package hamcrest.expression;

import method.MethodExecution;
import method.MethodExecutionContext;

/**
 * This class represents a simple Hamcrest expression, i.e., an expression of the form o.f where o
 * is an object and f a field
 * 
 * @author fmolina
 */
public class SimpleHamcrestExpr extends HamcrestExpr {

  private String exprString;

  /**
   * Constructor
   */
  public SimpleHamcrestExpr(String exprstring) {
    assert exprstring != null;
    this.exprString = exprstring;
  }

  @Override
  public Object evaluate(MethodExecution me) {
    return evaluate(new MethodExecutionContext(me));
  }

  @Override
  public Object evaluate(MethodExecutionContext mec) {
    if (exprString.equals("null"))
      return null;
    if (exprString.equals("true"))
      return true;
    if (exprString.equals("false"))
      return false;
    if (isInteger(exprString))
      return Integer.parseInt(exprString);

    // Prepare string for evaluation
    String str = evaluableString();
    // Now evaluate the expression, getting the result
    return evaluateWithReflection(str, mec);
  }

  /**
   * Get string to evaluate it in objects
   */
  private String evaluableString() {
    String str = exprString.replace("thiz", "o").replace("thizPre", "oPre").replace(" n ", " o ")
        .replace("n ", "o ").replace(" = ", " == ");
    if (str.startsWith(" o ")) {
      str = str.replace(" o ", "o ");
    }
    if (str.length() == 1)
      str = str.replace("n", "o");

    // if (str.contains("size"))
    // str = str.replace("size", "getSizeField()");

    // Only for Schedule case
    if (str.contains("prioQueue1"))
      str = str.replace("prioQueue1", "prioQueue[1]");
    if (str.contains("prioQueue2"))
      str = str.replace("prioQueue2", "prioQueue[2]");
    if (str.contains("prioQueue3"))
      str = str.replace("prioQueue3", "prioQueue[3]");
    // Only for AvlTreeList case
    if (str.contains("EMPTY_LEAF"))
      str = str.replace("EMPTY_LEAF", "o.EMPTY_LEAF");
    // Only for CommonTree case
    if (str.contains("childreo"))
      str = str.replace("childreo", "children");
    // Only for IntTreeSet case
    if (str.contains("mio"))
      str = str.replace("mio", "min");
    // Only for TreeList case
    if (str.contains("relativePositioo"))
      str = str.replace("relativePositioo", "relativePosition");
    // Added to allow evaluation over hash maps
    if (str.contains("keySet"))
      str = str.replace("keySet", "keySet()");
    return str;
  }

  private boolean isInteger(String s) {
    return isInteger(s, 10);
  }

  private boolean isInteger(String s, int radix) {
    if (s.isEmpty())
      return false;
    for (int i = 0; i < s.length(); i++) {
      if (i == 0 && s.charAt(i) == '-') {
        if (s.length() == 1)
          return false;
        else
          continue;
      }
      if (Character.digit(s.charAt(i), radix) < 0)
        return false;
    }
    return true;
  }

  @Override
  public String toString() {
    String str = exprString;
    if (str.contains("getValueOfKey")) {
      String[] parts = str.split("getValueOfKey");
      str = parts[0] + "get(" + parts[1].substring(3) + ")";
    }
    return str.replace("thizPre", "old_this").replace("thiz", "this")
        .replace("prioQueue1", "prioQueue[1]").replace("prioQueue2", "prioQueue[2]")
        .replace("prioQueue3", "prioQueue[3]");
  }
}
