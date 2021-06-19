package hamcrest.assertion;

import hamcrest.expression.HamcrestExpr;
import method.MethodExecution;

/**
 * SimpleHamcrestAssertion is an assertion of the from o.f = v where o is an object, f is a field
 * and v a possible value for that field
 * 
 * @author fmolina
 *
 */
public class SimpleHamcrestAssertion extends HamcrestAssertion {

  protected HamcrestExpr expr;

  /**
   * Constructor with a simple assertion
   */
  public SimpleHamcrestAssertion(HamcrestExpr expr) {
    super();
    assert expr != null;
    this.expr = expr;
  }

  @Override
  public boolean evaluate(MethodExecution me) {
    return (Boolean) expr.evaluate(me);
  }

  public String exprString() {
    return expr.toString();
  }

  @Override
  public String toString() {
    if (expr.isPartOfSet() || expr.toString().contains("evaluateSetMembership")) {
      return expr.toString();
    } else {
      return expr.toString().replace(" . ", ".");
    }
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
