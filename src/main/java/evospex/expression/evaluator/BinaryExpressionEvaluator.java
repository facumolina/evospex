package evospex.expression.evaluator;

import evospex.expression.ExprGrammarParser.Binary_opContext;
import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.symbol.ExprOperator;

/**
 * This class provides methods to evaluate binary expressions.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class BinaryExpressionEvaluator {

  /**
   * Evaluate the given operation
   */
  public static boolean eval(ExprContext expr1, Binary_opContext binary_op, ExprContext expr2) {
    Object o1 = ExpressionEvaluator.eval(expr1);
    Object o2 = ExpressionEvaluator.eval(expr2);
    return eval(o1, binary_op.getText(), o2);
  }

  private static boolean eval(Object o1, String op, Object o2) {
    assert (o1 instanceof Boolean);
    assert (o2 instanceof Boolean);
    Boolean b1 = (Boolean) o1;
    Boolean b2 = (Boolean) o2;
    switch (op) {
    case (ExprOperator.AND_1):
      return b1 && b2;
    case (ExprOperator.AND_2):
      return b1 && b2;
    case (ExprOperator.OR_1):
      return b1 || b2;
    case (ExprOperator.OR_2):
      return b1 || b2;
    case (ExprOperator.IMPLIES_1):
      return !b1 || b2;
    case (ExprOperator.IMPLIES_2):
      return !b1 || b2;
    case (ExprOperator.IFF):
      return b1 == b2;
    case (ExprOperator.XOR):
      return b1 != b2;
    }
    throw new IllegalArgumentException("Binary operator " + op + " still not implemented");
  }
}
