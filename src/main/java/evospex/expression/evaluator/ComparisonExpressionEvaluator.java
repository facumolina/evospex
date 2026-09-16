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
    case ExprOperator.LT: {
      requireBothNumbers(o1, o2);
      Number[] p = promote(NumericBinaryExpressionEvaluator.widen((Number) o1),
          NumericBinaryExpressionEvaluator.widen((Number) o2));
      return evalLT(p[0], p[1]);
    }
    case ExprOperator.GT: {
      requireBothNumbers(o1, o2);
      Number[] p = promote(NumericBinaryExpressionEvaluator.widen((Number) o1),
          NumericBinaryExpressionEvaluator.widen((Number) o2));
      return evalGT(p[0], p[1]);
    }
    case ExprOperator.LTE: {
      requireBothNumbers(o1, o2);
      Number[] p = promote(NumericBinaryExpressionEvaluator.widen((Number) o1),
          NumericBinaryExpressionEvaluator.widen((Number) o2));
      return evalLTE(p[0], p[1]);
    }
    case ExprOperator.GTE: {
      requireBothNumbers(o1, o2);
      Number[] p = promote(NumericBinaryExpressionEvaluator.widen((Number) o1),
          NumericBinaryExpressionEvaluator.widen((Number) o2));
      return evalGTE(p[0], p[1]);
    }
    }
    return false;
  }

  /**
   * Promotes a pair of already-unary-widened operands to a common numeric type (JLS 5.6.2)
   * when their boxed types differ - e.g. an Integer-typed candidate compared against a
   * Long-typed one - rather than rejecting the pair outright. Delegates to
   * NumericBinaryExpressionEvaluator.promote, which throws NonEvaluableExpressionException
   * (caught by the GA's fitness evaluator) only if no common numeric type exists, which
   * shouldn't happen for any pair of actual Number values.
   */
  private static Number[] promote(Number n1, Number n2) {
    return n1.getClass() == n2.getClass() ? new Number[] { n1, n2 }
        : NumericBinaryExpressionEvaluator.promote(n1, n2);
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

  /**
   * A heterogeneously-typed Object parameter (e.g. push(Object)) can hold a non-Number value (a
   * reference type, or null) on some recorded examples. The former `assert isNumber(...)` checks
   * here were no-ops at runtime (Java assertions are disabled by default, unlike in the injected
   * subject code, which always runs with them on), silently falling through to an unchecked
   * (Number) cast and crashing with ClassCastException. Throw the same
   * NonEvaluableExpressionException already used for division-by-zero instead, so the GA's
   * fitness evaluator treats this example as simply not supporting this candidate expression.
   */
  private static void requireBothNumbers(Object o1, Object o2) {
    if (!isNumber(o1) || !isNumber(o2))
      throw new NonEvaluableExpressionException("Non-numeric operand");
  }
}
