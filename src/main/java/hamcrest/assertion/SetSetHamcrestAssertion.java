package hamcrest.assertion;

import hamcrest.expression.HamcrestExpr;
import method.MethodExecution;

/**
 * SetSetHamcrestAssertion is an assertion of the from set1 op set2 where both expressions contains
 * a set and op is a binary operator
 * 
 * @author fmolina
 *
 */
public class SetSetHamcrestAssertion extends HamcrestAssertion {

  protected HamcrestExpr expr;

  /**
   * Constructor with a simple set assertion
   */
  public SetSetHamcrestAssertion(HamcrestExpr expr) {
    super();
    assert expr != null;
    this.expr = expr;
  }

  @Override
  public boolean evaluate(MethodExecution me) {
    throw new IllegalArgumentException("IMPLEMENT THIS!!");
  }

  @Override
  public String toString() {
    return expr.toString();
  }

  @Override
  public HamcrestExpr getExpr() {
    return expr;
  }

  @Override
  public boolean evaluableInNegatives() {
    return !expr.toString().contains("thizPre")
        || (expr.toString().indexOf("thizPre") != expr.toString().lastIndexOf("thiz")
            || expr.toString().indexOf("thiz") != expr.toString().indexOf("thizPre"));
  }
}
