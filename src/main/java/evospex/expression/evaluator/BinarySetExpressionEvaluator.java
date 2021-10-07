package evospex.expression.evaluator;

import evospex.expression.ExprGrammarParser.Set_exprContext;
import evospex.expression.ExprGrammarParser.Set_binary_opContext;
import evospex.expression.ExprOperator;

import java.util.Set;

/**
 * This class provides methods to evaluate binary expressions over sets.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class BinarySetExpressionEvaluator {


  /**
   * Evaluate the given binary expression between sets
   */
  public static Set<Object> eval(Set_exprContext set_expr1, Set_binary_opContext set_binary_op, Set_exprContext set_expr2) {
    Object o1 = SetExpressionEvaluator.eval(set_expr1);
    Object o2 = SetExpressionEvaluator.eval(set_expr2);
    assert (o1 instanceof Set<?> && o2 instanceof Set<?>);
    return eval((Set<Object>)o1, set_binary_op.getText(), (Set<Object>)o2);
  }

  private static Set<Object> eval(Set<Object> s1, String op, Set<Object> s2) {
    switch (op) {
      case (ExprOperator.INTERSECT):
        s1.retainAll(s2);
        return s1;
    }
    throw new IllegalArgumentException("Binary set operator " + op + " still not implemented");
  }

}
