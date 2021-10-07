package evospex.expression.evaluator;

import java.util.Collection;

import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.ExprGrammarParser.Unary_opContext;

/**
 * This class provides methods to evaluate comparison expressions.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class UnaryExpressionEvaluator {

  private static final String CARDINALITY = "#";
  private static final String NOT = "!";

  /**
   * Evaluate the given unary expression
   * 
   */
  public static Object eval(Unary_opContext unary_op, ExprContext expr) {
    Object o1 = ExpressionEvaluator.eval(expr);
    return eval(unary_op.getText(), o1);
  }

  private static Object eval(String op, Object o) {
    switch (op) {
    case CARDINALITY:
      if (o == null)
        return 0;
      assert (o instanceof Collection);
      Collection<Object> set = (Collection<Object>) o;
      return set.size();
    }
    throw new IllegalArgumentException(
        "Operator " + op + " is not supported for unary expressions");
  }
}
