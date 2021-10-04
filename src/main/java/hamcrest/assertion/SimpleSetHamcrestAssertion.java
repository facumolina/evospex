package hamcrest.assertion;

import hamcrest.expression.HamcrestExpr;
import evospex.target.MethodExecution;

/**
 * SimpleSetHamcrestAssertion is an assertion of the from expr1 op expr2 where one of the
 * expressions contains a set and op is a binary operator
 * 
 * @author fmolina
 *
 */
public class SimpleSetHamcrestAssertion extends HamcrestAssertion {

  protected HamcrestExpr expr;

  /**
   * Constructor with a simple set assertion
   */
  public SimpleSetHamcrestAssertion(HamcrestExpr expr) {
    super();
    assert expr != null;
    this.expr = expr;
  }

  @Override
  public boolean evaluate(MethodExecution me) {
    return (Boolean) expr.evaluate(me);
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
