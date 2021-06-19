package hamcrest.expression;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import method.MethodExecution;
import method.MethodExecutionContext;
import rfm.dynalloyCompiler.ast.ExprBinary.Op;

/**
 * This class represents a binary Hamcrest expression, i.e., an expression of the form expr1 op
 * expr2 where op is a binary operator and expr1,expr2 are Hamcrest expressions
 * 
 * @author fmolina
 */
public class BinaryHamcrestExpr extends HamcrestExpr {

  HamcrestExpr expr1;
  HamcrestExpr expr2;
  Op binary;

  /**
   * Constructor
   */
  public BinaryHamcrestExpr(HamcrestExpr expr1, Op op, HamcrestExpr expr2) {
    assert expr1 != null && op != null && expr2 != null;
    this.expr1 = expr1;
    this.binary = op;
    this.expr2 = expr2;
  }

  @Override
  public Object evaluate(MethodExecution me) throws NonEvaluableExpressionException {
    Object v1 = expr1.evaluate(me);
    Object v2 = expr2.evaluate(me);
    if (v1 instanceof Double && v2 instanceof Integer) {
      v2 = Double.parseDouble(v2.toString());
    }
    if (v1 instanceof Integer && v2 instanceof Double) {
      v1 = Double.parseDouble(v1.toString());
    }
    if (v1 instanceof Float && v2 instanceof Integer) {
      v2 = Float.parseFloat(v2.toString());
    }
    if (v1 instanceof Integer && v2 instanceof Float) {
      v1 = Float.parseFloat(v1.toString());
    }
    if (v1 instanceof Float && v2 instanceof Long) {
      v2 = Float.parseFloat(v2.toString());
    }
    if (v1 instanceof Long && v2 instanceof Float) {
      v1 = Float.parseFloat(v1.toString());
    }
    return evalOp(v1, v2);
  }

  @Override
  public Object evaluate(MethodExecutionContext mec) {
    Object v1 = expr1.evaluate(mec);
    if (binary.equals(Op.IMPLIES) && v1 instanceof Boolean && ((Boolean) v1) == false)
      return true;
    Object v2 = expr2.evaluate(mec);
    return evalOp(v1, v2);
  }

  /**
   * Evaluate the expression operator in the two given values
   */
  @SuppressWarnings("unchecked")
  private Object evalOp(Object v1, Object v2) {
    switch (binary) {
    case EQUALS:
      return (v1 == null && v2 == null) || (v1 != null && v1.equals(v2));
    case NOT_EQUALS:
      return !(v1 == null && v2 == null) && !(v1 != null && v1.equals(v2));
    case LT:
      return v1 != null && v2 != null && v1 instanceof Integer && v2 instanceof Integer
          && (Integer) v1 < (Integer) v2;
    case LTE:
      return v1 != null && v2 != null && v1 instanceof Integer && v2 instanceof Integer
          && (Integer) v1 <= (Integer) v2;
    case GT:
      return v1 != null && v2 != null && v1 instanceof Integer && v2 instanceof Integer
          && (Integer) v1 > (Integer) v2;
    case GTE:
      return v1 != null && v2 != null && v1 instanceof Integer && v2 instanceof Integer
          && (Integer) v1 >= (Integer) v2;
    case IN:
      if (!(v2 instanceof Set) && v2 instanceof Collection) {
        Set<Object> set1 = new HashSet<Object>((Collection<Object>) v2);
        return set1.contains(v1);
      } else if (v2 instanceof Set) {
        Set<Object> set = (Set<Object>) v2;
        return set.contains(v1);
      } else if (v2 == null && expr2.toString().equals("null")) {
        // The expr2 was is the null signature
        assert v1 instanceof Set;
        return ((Set<Object>) v1).size() == 0;
      } else if (v2 == null && v1 != null) {
        // value in null should return false
        return false;
      }
    case NOT_IN:
      if (!(v2 instanceof Set) && v2 instanceof Collection) {
        Set<Object> set1 = new HashSet<Object>((Collection<Object>) v2);
        return !set1.contains(v1);
      } else {
        if (v2 == null)
          throw new NonEvaluableExpressionException("");
        assert v2 instanceof Set;
        Set<Object> set1;
        if (v2.getClass().isArray()) {
          set1 = new HashSet<Object>(Arrays.asList(v2));
        } else {
          set1 = (Set<Object>) v2;
        }
        return !set1.contains(v1);
      }
    case MINUS:
      if (v1 instanceof Set) {
        Set<Object> set2 = (Set<Object>) v1;
        set2.remove(null);
        return set2;
      }
      if (v1 instanceof Integer && v2 instanceof Integer) {
        return (Integer) v1 - (Integer) v2;
      }
      if (v1 instanceof Double && v2 instanceof Double) {
        return (Double) v1 - (Double) v2;
      }
      if (v1 instanceof Long && v2 instanceof Long) {
        return (Long) v1 - (Long) v2;
      }
      if (v1 instanceof Float && v2 instanceof Float) {
        return (Float) v1 - (Float) v2;
      }
    case PLUS:

      assert ((v1 == null || v1 instanceof Integer) && (v2 == null || v2 instanceof Integer))
          || ((v1 == null || v1 instanceof Double) && (v2 == null || v2 instanceof Double));

      if (v1 == null)
        return v2 == null ? 0 : v2;
      if (v2 == null)
        return v1 == null ? 0 : v1;

      if (!(v1 instanceof Number) || !(v2 instanceof Number))
        throw new NonEvaluableExpressionException("");

      Number n1 = (Number) v1;
      Number n2 = (Number) v2;

      return evalAdd(n1, n2);

    case INTERSECT:
      assert v1 instanceof Set && v2 instanceof Set;
      Set<Object> set3 = (Set<Object>) v1;
      Set<Object> set4 = (Set<Object>) v2;
      set3.retainAll(set4);
      return set3;
    case AND:
      assert v1 instanceof Boolean && v2 instanceof Boolean;
      return (Boolean) v1 && (Boolean) v2;
    case IMPLIES:
      assert v1 instanceof Boolean && v2 instanceof Boolean;
      return !(Boolean) v1 || (Boolean) v2; // A -> B = not A or B
    default:
      throw new IllegalStateException("Binary operator " + binary.name() + " not supported");
    }
  }

  /**
   * Evaluate addition
   */
  private Number evalAdd(Number n1, Number n2) {
    if (n1 instanceof Long) {
      if (n2 instanceof Integer)
        n2 = new Long((Integer) n2);
      return (Long) n1 + (Long) n2;
    }
    if (n1 instanceof Integer) {
      if (n2 instanceof Long)
        n2 = (Integer) ((Long) n2).intValue();
      return (Integer) n1 + (Integer) n2;
    }
    if (n1 instanceof Float)
      return (Float) n1 + (Float) n2;
    if (n1 instanceof Double)
      return (Double) n1 + (Double) n2;
    throw new IllegalArgumentException(
        "Objects must be of the same type when performing numeric comparison");
  }

  @Override
  public String toString() {
    switch (binary) {
    case EQUALS:
      return expr1.toString() + " == " + expr2.toString();
    case NOT_EQUALS:
      return expr1.toString() + " != " + expr2.toString();
    case IN:
      if (isPartOfSet()) {
        return expr1.toString() + " in " + expr2.toString();
      } else {
        return "ExpressionEvaluator.evaluateSetMembership(" + expr1.toString() + ",\""
            + expr2.toString() + "\",this)";
      }
    case NOT_IN:
      if (isPartOfSet()) {
        return expr1.toString() + " !in " + expr2.toString();
      } else {
        return "!ExpressionEvaluator.evaluateSetMembership(" + expr1.toString() + ",\""
            + expr2.toString() + "\",this)";
      }
    case MINUS:
      return expr1.toString() + " - " + expr2.toString();
    case PLUS:
      return expr1.toString() + " + " + expr2.toString();
    case INTERSECT:
      return expr1.toString() + " intersect " + expr2.toString();
    case LT:
      return expr1.toString() + " < " + expr2.toString();
    case LTE:
      return expr1.toString() + " <= " + expr2.toString();
    case GT:
      return expr1.toString() + " > " + expr2.toString();
    case GTE:
      return expr1.toString() + " >= " + expr2.toString();
    case AND:
      return "(" + expr1.toString() + ") && (" + expr2.toString() + ")";
    case IMPLIES:
      return "!(" + expr1.toString() + ") || " + expr2.toString();
    default:
      throw new IllegalStateException("String for operator " + binary.name() + " not defined");
    }
  }

  /**
   * Return the default value for the current operator
   */
  private Object defaultValue() {
    switch (binary) {
    case EQUALS:
      return false;
    case NOT_EQUALS:
      return false;
    case IN:
      return false;
    case NOT_IN:
      return false;
    case MINUS:
      return null;
    case PLUS:
      return 0;
    case INTERSECT:
      return null;
    case LT:
      return false;
    case LTE:
      return false;
    case GT:
      return false;
    case GTE:
      return false;
    default:
      throw new IllegalStateException(
          "Default value for operator " + binary.name() + " not defined");
    }
  }
}
