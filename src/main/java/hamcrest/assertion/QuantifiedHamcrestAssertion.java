package hamcrest.assertion;

import hamcrest.expression.HamcrestExpr;
import hamcrest.expression.QuantifiedHamcrestExpr;
import method.MethodExecution;

/**
 * SimpleHamcrestAssertion is an assertion that evaluates an expression of the from op : set | expr
 * where op is a quantified operator, and set is a set of objects over which expr is evaluated
 * 
 * @author fmolina
 *
 */
public class QuantifiedHamcrestAssertion extends HamcrestAssertion {

  protected QuantifiedHamcrestExpr expr;

  /**
   * Constructor
   */
  public QuantifiedHamcrestAssertion(QuantifiedHamcrestExpr expr) {
    super();
    assert expr != null;
    this.expr = expr;
  }

  @Override
  public boolean evaluate(MethodExecution me) {
    return expr.evaluate(me);
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

  @Override
  public String toString() {
    return expr.toString();
  }

}
