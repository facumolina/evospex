package evospex.expression.evaluator;

import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.ExprGrammarParser.Num_binary_opContext;
import evospex.expression.ExprOperator;

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
    assert (o1 instanceof Number);
    assert (o2 instanceof Number);
    Number n1 = (Number) o1;
    Number n2 = (Number) o2;
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

}