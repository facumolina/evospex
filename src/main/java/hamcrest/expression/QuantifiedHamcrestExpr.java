package hamcrest.expression;

import java.util.Set;

import method.MethodExecution;
import method.MethodExecutionContext;
import rfm.dynalloyCompiler.ast.ExprQt.Op;

/**
 * This class represents a quantified Hamcrest expression
 * 
 * @author fmolina
 *
 */
public class QuantifiedHamcrestExpr extends HamcrestExpr {

  protected SetHamcrestExpr setExpr;
  protected HamcrestExpr expr;
  protected Op quantifier;

  /**
   * Constructor
   */
  public QuantifiedHamcrestExpr(SetHamcrestExpr setExpr, HamcrestExpr expr, Op op) {
    assert setExpr != null && expr != null && op != null;
    this.setExpr = setExpr;
    this.setExpr.partOfSet = true;
    this.expr = expr;
    this.expr.partOfSet = true;
    this.quantifier = op;
  }

  @Override
  public Boolean evaluate(MethodExecution me) throws NonEvaluableExpressionException {
    return evaluate(new MethodExecutionContext(me));
  }

  @SuppressWarnings("unchecked")
  @Override
  public Boolean evaluate(MethodExecutionContext mec) {
    // Evaluate the set hamcrest expression over the given object
    Object o1 = setExpr.evaluate(mec);
    assert o1 instanceof Set : "The evaluation of the set expression of a quantified expression should return a set";
    return evalBodyExpr((Set<Object>) o1);
  }

  /**
   * Evaluate the body expression over the given set
   */
  private boolean evalBodyExpr(Set<Object> set) {
    switch (quantifier) {
    case ALL:
      return allObjectsSatisfiesExpr(set);
    case SOME:
      return someObjectSatisfiesExpr(set);
    default:
      throw new IllegalStateException(quantifier.toString() + " not supported!!");
    }
  }

  /**
   * Verifies that all the objects in the given set satisfies the current hamcrest expression
   */
  private boolean allObjectsSatisfiesExpr(Set<Object> set) {
    for (Object o : set) {
      MethodExecutionContext mec = new MethodExecutionContext();
      mec.setValue("o", o);
      if (!(Boolean) expr.evaluate(mec))
        return false;
    }
    return true;
  }

  /**
   * Verifies that some object in the given set satisfies the current hamcrest expression
   */
  private boolean someObjectSatisfiesExpr(Set<Object> set) {
    for (Object o : set) {
      MethodExecutionContext mec = new MethodExecutionContext();
      mec.setValue("o", o);
      if ((Boolean) expr.evaluate(mec))
        return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return "ExpressionEvaluator.evaluateQuantifiedExpression(\"" + quantifier.toString() + "\",\""
        + setExpr.toString() + "\",\"" + expr.toString() + "\",this)";
  }

}
