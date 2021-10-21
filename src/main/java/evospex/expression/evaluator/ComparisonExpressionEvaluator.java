package evospex.expression.evaluator;

import java.util.Collection;

import evospex.expression.ExprGrammarParser.Compare_opContext;
import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.symbol.ExprOperator;

/**
 * This class provides methods to evaluate comparison expressions.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ComparisonExpressionEvaluator {

  /**
   * Evaluate the given comparison
   * 
   */
  public static boolean eval(ExprContext expr1, Compare_opContext cmp_op, ExprContext expr2) {
    Object o1 = ExpressionEvaluator.eval(expr1);
    Object o2 = ExpressionEvaluator.eval(expr2);
    return eval(o1, cmp_op.getText(), o2);
  }

  private static boolean eval(Object o1, String op, Object o2) {
    switch (op) {
    case ExprOperator.EQ:
      if (o1 == null)
        return o2 == null;
      return o1.equals(o2);
    case ExprOperator.NOT_EQ:
      if (o1 == null)
        return o2 != null;
      return !o1.equals(o2);
    case ExprOperator.IN:
      assert o2 instanceof Collection<?> : "When evaluating IN the second object should be a collection";
      Collection<Object> set_o2_in = (Collection<Object>) o2;
      if (o1 instanceof java.util.Collection)
        return set_o2_in.containsAll((java.util.Collection)o1);
      else
        return set_o2_in.contains(o1);
    case ExprOperator.NOT_IN:
      assert o2 instanceof Collection<?> : "When evaluating NOT IN the second object should be a collection";
      Collection<Object> set_o2_not_in = (Collection<Object>) o2;
      if (o1 instanceof Collection)
        return !set_o2_not_in.containsAll((java.util.Collection)o1);
      else
        return !set_o2_not_in.contains(o1);
    case ExprOperator.LT:
      assert isNumber(o1);
      assert isNumber(o2);
      Number n1_lt = (Number) o1;
      Number n2_lt = (Number) o2;
      return evalLT(n1_lt, n2_lt);
    case ExprOperator.GT:
      assert isNumber(o1);
      assert isNumber(o2);
      Number n1_gt = (Number) o1;
      Number n2_gt = (Number) o2;
      return evalGT(n1_gt, n2_gt);
    case ExprOperator.LTE:
      assert isNumber(o1);
      assert isNumber(o2);
      Number n1_lte = (Number) o1;
      Number n2_lte = (Number) o2;
      return evalLTE(n1_lte, n2_lte);
    case ExprOperator.GTE:
      assert isNumber(o1);
      assert isNumber(o2);
      Number n1_gte = (Number) o1;
      Number n2_gte = (Number) o2;
      return evalGTE(n1_gte, n2_gte);
    }
    return false;
  }

  /**
   * Evaluate LT operator
   */
  private static boolean evalLT(Number n1, Number n2) {
    if (n1 instanceof Integer)
      return (Integer) n1 < (Integer) n2;
    if (n1 instanceof Long)
      return (Long) n1 < (Long) n2;
    if (n1 instanceof Float)
      return (Float) n1 < (Float) n2;
    if (n1 instanceof Double)
      return (Double) n1 < (Double) n2;
    throw new IllegalArgumentException(
        "Objects must be of the same type when performing numeric comparison");
  }

  /**
   * Evaluate GT operator
   */
  private static boolean evalGT(Number n1, Number n2) {
    if (n1 instanceof Integer)
      return (Integer) n1 > (Integer) n2;
    if (n1 instanceof Long)
      return (Long) n1 > (Long) n2;
    if (n1 instanceof Float)
      return (Float) n1 > (Float) n2;
    if (n1 instanceof Double)
      return (Double) n1 > (Double) n2;
    throw new IllegalArgumentException(
        "Objects must be of the same type when performing numeric comparison");
  }

  /**
   * Evaluate LTE operator
   */
  private static boolean evalLTE(Number n1, Number n2) {
    if (n1 instanceof Integer)
      return (Integer) n1 <= (Integer) n2;
    if (n1 instanceof Long)
      return (Long) n1 <= (Long) n2;
    if (n1 instanceof Float)
      return (Float) n1 <= (Float) n2;
    if (n1 instanceof Double)
      return (Double) n1 <= (Double) n2;
    throw new IllegalArgumentException(
        "Objects must be of the same type when performing numeric comparison");
  }

  /**
   * Evaluate GTE operator
   */
  private static boolean evalGTE(Number n1, Number n2) {
    if (n1 instanceof Integer)
      return (Integer) n1 >= (Integer) n2;
    if (n1 instanceof Long)
      return (Long) n1 >= (Long) n2;
    if (n1 instanceof Float)
      return (Float) n1 >= (Float) n2;
    if (n1 instanceof Double)
      return (Double) n1 >= (Double) n2;
    throw new IllegalArgumentException(
        "Objects must be of the same type when performing numeric comparison");
  }

  /**
   * Returns true iff the given object is an instance of a numeric type
   */
  private static boolean isNumber(Object o) {
    return (o != null && o instanceof Number);
  }
}
