package hamcrest.expression;

import java.util.Set;

import evospex.target.MethodExecution;
import evospex.target.MethodExecutionContext;
import rfm.dynalloyCompiler.ast.ExprUnary.Op;

/**
 * This class represents a unary Hamcrest expression, i.e., an expression of the form op expr where
 * op is a unary operator and expr is a Hamcrest expression
 * 
 * @author fmolina
 */
public class UnaryHamcrestExpr extends HamcrestExpr {

  protected HamcrestExpr expr;
  protected Op unary;

  /**
   * Constructor
   */
  public UnaryHamcrestExpr(Op op, HamcrestExpr expr) {
    assert expr != null && op != null;
    this.expr = expr;
    this.unary = op;
  }

  @Override
  public Object evaluate(MethodExecution me) throws NonEvaluableExpressionException {
    return evaluate(new MethodExecutionContext(me));
  }

  @SuppressWarnings("unchecked")
  @Override
  public Object evaluate(MethodExecutionContext mec) {
    // Evaluate the expression
    Object v = expr.evaluate(mec);
    // Apply the unary operation
    switch (unary) {
    case CARDINALITY:
      assert v instanceof Set;
      Set<Object> set = (Set<Object>) v;
      return set.size();
    case NOT:
      assert v instanceof Boolean;
      return !(Boolean) v;
    case SOME:
      return v != null;
    case NO:
      return v == null;
    default:
      throw new IllegalStateException("Unary operator " + unary.name() + " not supported");
    }
  }

  @Override
  public String toString() {
    switch (unary) {
    case CARDINALITY:
      return "ExpressionEvaluator.evaluateSetSize(\"" + expr.toString() + "\",this)";
    case NOT:
      return "!(" + expr.toString() + ")";
    case SOME:
      return "ExpressionEvaluator.exists(\"" + expr.toString() + "\",this)";
    case NO:
      return "ExpressionEvaluator.empty(\"" + expr.toString() + "\",this)";
    default:
      throw new IllegalStateException("String for operator " + unary.name() + " not supported");
    }
  }

}
