package evospex.expression.evaluator;

import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.ExprGrammarParser.Num_binary_opContext;
import evospex.expression.symbol.ExprOperator;

/**
 * This class provides methods to evaluate binary expressions that evaluate to a number.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class NumericBinaryExpressionEvaluator {

  /**
   * Evaluate the given comparison
   * 
   */
  public static Number eval(ExprContext expr1, Num_binary_opContext num_binary_op,
      ExprContext expr2) {
    Object o1 = ExpressionEvaluator.eval(expr1);
    Object o2 = ExpressionEvaluator.eval(expr2);
    return eval(o1, num_binary_op.getText(), o2);
  }

  private static Number eval(Object o1, String op, Object o2) {
    // A heterogeneously-typed Object parameter (e.g. push(Object)) can hold a non-Number value
    // (a reference type, or null) on some recorded examples. `assert` is a no-op here (Java
    // assertions are disabled by default at runtime, unlike in the injected subject code, which
    // always runs with them on), so this was previously falling through to an unchecked cast
    // below and crashing with ClassCastException instead of being treated as a non-evaluable
    // candidate for this example (the same graceful-skip mechanism already used for
    // division-by-zero, see NonEvaluableExpressionException below).
    if (!(o1 instanceof Number) || !(o2 instanceof Number))
      throw new NonEvaluableExpressionException("Non-numeric operand");
    Number n1 = widen((Number) o1);
    Number n2 = widen((Number) o2);
    // An expression can combine two independently-sampled examples of a heterogeneously-typed
    // Object parameter (e.g. push(Object), fed Integer/Long/Float/Double/... across different
    // recorded calls) - their boxed types don't always match. Rather than crash with a
    // ClassCastException from blindly casting n2 to n1's type below, defer to the same
    // "this example doesn't support this candidate expression" mechanism already used for
    // division-by-zero (NonEvaluableExpressionException, caught by the GA's fitness evaluator).
    if (n1.getClass() != n2.getClass())
      throw new NonEvaluableExpressionException("Mismatched numeric types: "
          + n1.getClass().getSimpleName() + " vs " + n2.getClass().getSimpleName());
    switch (op) {
    case ExprOperator.PLUS:
      return evalPlus(n1, n2);
    case ExprOperator.MINUS:
      return evalMinus(n1, n2);
    case ExprOperator.MULT:
      return evalMultiply(n1, n2);
    case ExprOperator.DIV:
      return evalDivide(n1, n2);
    case ExprOperator.MOD:
      return evalModulo(n1 , n2);
    }
    throw new IllegalArgumentException("Binary operator " + op + " still not implemented");
  }

  /**
   * Evaluate addition
   */
  private static Number evalPlus(Number n1, Number n2) {
    if (n1 instanceof Integer)
      return (Integer) n1 + (Integer) n2;
    if (n1 instanceof Long)
      return (Long) n1 + (Long) n2;
    if (n1 instanceof Float)
      return (Float) n1 + (Float) n2;
    if (n1 instanceof Double)
      return (Double) n1 + (Double) n2;
    throw new IllegalArgumentException("Unsupported numeric type");
  }

  /**
   * Evaluate subtraction
   */
  private static Number evalMinus(Number n1, Number n2) {
    if (n1 instanceof Integer)
      return (Integer) n1 - (Integer) n2;
    if (n1 instanceof Long)
      return (Long) n1 - (Long) n2;
    if (n1 instanceof Float)
      return (Float) n1 - (Float) n2;
    if (n1 instanceof Double)
      return (Double) n1 - (Double) n2;
    throw new IllegalArgumentException("Unsupported numeric type");
  }

  /**
   * Evaluate multiplication
   */
  private static Number evalMultiply(Number n1, Number n2) {
    if (n1 instanceof Integer)
      return (Integer) n1 * (Integer) n2;
    if (n1 instanceof Long)
      return (Long) n1 * (Long) n2;
    if (n1 instanceof Float)
      return (Float) n1 * (Float) n2;
    if (n1 instanceof Double)
      return (Double) n1 * (Double) n2;
    throw new IllegalArgumentException("Unsupported numeric type");
  }

  /**
   * Evaluate division
   */
  private static Number evalDivide(Number n1, Number n2) {
    if (isZero(n2))
      throw new NonEvaluableExpressionException("Division by Zero");
    if (n1 instanceof Integer)
      return (Integer) n1 / (Integer) n2;
    if (n1 instanceof Long)
      return (Long) n1 / (Long) n2;
    if (n1 instanceof Float)
      return (Float) n1 / (Float) n2;
    if (n1 instanceof Double)
      return (Double) n1 / (Double) n2;
    throw new IllegalArgumentException("Unsupported numeric type");
  }

  /**
   * Evaluate modulo
   */
  private static Number evalModulo(Number n1, Number n2) {
    if (isZero(n2))
      throw new NonEvaluableExpressionException("Division by Zero");
    if (n1 instanceof Integer)
      return (Integer) n1 % (Integer) n2;
    if (n1 instanceof Long)
      return (Long) n1 % (Long) n2;
    if (n1 instanceof Float)
      return (Float) n1 % (Float) n2;
    if (n1 instanceof Double)
      return (Double) n1 % (Double) n2;
    throw new IllegalArgumentException("Unsupported numeric type");
  }

  /**
   * Returns true iff the given number is zero
   */
  private static boolean isZero(Number n) {
    if (n instanceof Integer && (Integer)n==0)
      return true;
    if (n instanceof Long && (Long)n==0)
      return true;
    if (n instanceof Float && (Float)n==0)
      return true;
    if (n instanceof Double && (Double)n==0)
      return true;
    return false;
  }

  /**
   * Java always promotes byte/short to int for arithmetic (there's no such thing as "byte
   * arithmetic" in the language) - the eval*() methods below only handle Integer/Long/Float/
   * Double, so a Byte/Short observation (e.g. push((Object)(byte)100)) needs the same promotion
   * here, rather than hitting their "Unsupported numeric type" fallback.
   */
  static Number widen(Number n) {
    if (n instanceof Byte || n instanceof Short)
      return n.intValue();
    return n;
  }

}