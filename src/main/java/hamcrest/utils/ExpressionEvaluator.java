package hamcrest.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import hamcrest.expression.SetHamcrestExpr;
import hamcrest.expression.SimpleHamcrestExpr;
import method.MethodExecutionContext;

/**
 * Provide methods to evaluate complex expressions (such as the ones involving closure operators) in
 * objects
 * 
 * @author fmolina
 *
 */
public class ExpressionEvaluator {

  /**
   * Evaluate set
   */
  public static Set<Object> evaluateSet(String setStrExpr, Object o) {
    SetHamcrestExpr setExpr = new SetHamcrestExpr(setStrExpr);
    MethodExecutionContext mec1 = new MethodExecutionContext();
    mec1.setValue("o", o);
    return (Set<Object>) setExpr.evaluate(mec1);
  }

  /**
   * Evaluate set size
   */
  public static int evaluateSetSize(String setStrExpr, Object o) {
    SetHamcrestExpr setExpr = new SetHamcrestExpr(setStrExpr);
    MethodExecutionContext mec1 = new MethodExecutionContext();
    mec1.setValue("o", o);
    Set<Object> set = (Set<Object>) setExpr.evaluate(mec1);
    return set.size();
  }

  /**
   * Evaluate set membership. Returns true iff the object o belongs to the set computed from the
   * object o1 applying the expression setStrExpr
   */
  public static boolean evaluateSetMembership(Object o, String setStrExpr, Object o1) {
    SetHamcrestExpr setExpr = new SetHamcrestExpr(setStrExpr);
    MethodExecutionContext mec1 = new MethodExecutionContext();
    mec1.setValue("o", o1);
    Object set_eval = setExpr.evaluate(mec1);
    Set<Object> set;
    if (set_eval instanceof Set)
      set = (Set<Object>) setExpr.evaluate(mec1);
    else
      set = new HashSet<Object>((Collection) set_eval);
    for (Object inset : set) {
      if ((o != null && o.equals(inset)) || (o == null && inset == null))
        return true;
    }
    return false;
  }

  /**
   * Evaluate quantified expression in object
   */
  @SuppressWarnings("unchecked")
  public static boolean evaluateQuantifiedExpression(String qtOp, String setStrExpr,
      String bodyStrExpr, Object o) {
    SetHamcrestExpr setExpr = new SetHamcrestExpr(setStrExpr);
    MethodExecutionContext mec1 = new MethodExecutionContext();
    mec1.setValue("o", o);
    Set<Object> set = (Set<Object>) setExpr.evaluate(mec1);
    for (Object inset : set) {
      if (!evaluateBooleanExpression(bodyStrExpr, inset)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Evaluate boolean expression in object
   */
  public static boolean evaluateBooleanExpression(String str, Object o) {
    if (str.contains("=>")) {
      String[] sides = str.split("=> ");
      String left = sides[0];
      String right = sides[1];
      boolean b1 = evaluateBooleanExpression(left, o);
      boolean b2 = evaluateBooleanExpression(right, o);
      return !b1 || b2;
    }
    if (str.contains("&&")) {
      String[] sides = str.split("&&");
      boolean b1 = evaluateBooleanExpression(sides[0].substring(1, sides[0].length() - 2), o);
      boolean b2 = evaluateBooleanExpression(sides[1].substring(2, sides[1].length() - 1), o);
      return b1 && b2;
    }
    if (str.contains("||")) {
      String[] sides = str.split("\\|\\|");
      boolean b1 = evaluateBooleanExpression(sides[0], o);
      if (!b1)
        return evaluateBooleanExpression(sides[1], o);
      return b1;
    }
    if (str.startsWith("!(")) {
      boolean b = evaluateBooleanExpression(str.substring(2, str.length() - 2), o);
      return !b;
    }
    if (str.contains("!=")) {
      String[] sides = str.split("!= ");
      Object o1 = evaluateField(sides[0], o);
      Object o2 = evaluateField(sides[1], o);
      return evaluateBooleanBinaryExpression("!=", o1, o2);
    }
    if (str.contains(">")) {
      String[] sides;
      String op = ">";
      if (str.contains(">=")) {
        sides = str.split(">= ");
        op = ">=";
      } else {
        sides = str.split("> ");
      }
      Object o1 = evaluateField(sides[0], o);
      Object o2 = evaluateField(sides[1], o);
      return evaluateBooleanBinaryExpression(op, o1, o2);
    }
    if (str.contains("<")) {
      String[] sides;
      String op = "<";
      if (str.contains("<=")) {
        sides = str.split("<= ");
        op = "<=";
      } else {
        sides = str.split(" < ");
      }
      Object o1 = evaluateField(sides[0], o);
      Object o2 = evaluateField(sides[1], o);
      return evaluateBooleanBinaryExpression(op, o1, o2);
    }
    if (str.contains("==")) {
      String[] sides = str.split("== ");
      Object o1 = evaluateField(sides[0], o);
      Object o2 = evaluateField(sides[1], o);
      return evaluateBooleanBinaryExpression("==", o1, o2);
    }
    if (str.contains(" intersect ")) {
      String[] sides = str.split(" intersect ");
      SetHamcrestExpr leftSetExpr = new SetHamcrestExpr(sides[0]);
      MethodExecutionContext mec1 = new MethodExecutionContext();
      mec1.setValue("o", o);
      Set<Object> leftSet = (Set<Object>) leftSetExpr.evaluate(mec1);
      String[] rightSides = sides[1].split(" in ");
      SetHamcrestExpr rightSetExpr = new SetHamcrestExpr(rightSides[0]);
      Set<Object> rightSet = (Set<Object>) rightSetExpr.evaluate(mec1);
      leftSet.retainAll(rightSet);
      if (rightSides[1].contains("null")) {
        return leftSet.isEmpty();
      }
      throw new IllegalStateException(str);
    }
    if (str.contains(" in ")) {
      String[] sides = str.split(" in ");
      Object o1 = evaluateField(sides[0], o);
      SetHamcrestExpr setExpr = new SetHamcrestExpr(sides[1]);
      MethodExecutionContext mec1 = new MethodExecutionContext();
      mec1.setValue("o", o1);
      Set<Object> set = (Set<Object>) setExpr.evaluate(mec1);
      return evaluateBooleanBinaryExpression("in", o1, set);
    }
    if (str.contains(" !in ")) {
      String[] sides = str.split(" !in ");
      Object o1 = evaluateField(sides[0], o);
      SetHamcrestExpr setExpr = new SetHamcrestExpr(sides[1]);
      MethodExecutionContext mec1 = new MethodExecutionContext();
      mec1.setValue("o", o1);
      Set<Object> set = (Set<Object>) setExpr.evaluate(mec1);
      return evaluateBooleanBinaryExpression("!in", o1, set);
    }

    throw new IllegalArgumentException("Expr not supported: " + str);
  }

  public static Object evaluateField(String str, Object o) {
    SimpleHamcrestExpr he = new SimpleHamcrestExpr(str);
    MethodExecutionContext mec1 = new MethodExecutionContext();
    mec1.setValue("o", o);
    return he.evaluate(mec1);
  }

  /**
   * Evaluate the expression operator in the two given values
   */
  @SuppressWarnings("unchecked")
  public static boolean evaluateBooleanBinaryExpression(String op, Object v1, Object v2) {
    switch (op) {
    case "==":
      return (v1 == null && v2 == null) || (v1 != null && v1.equals(v2));
    case "!=":
      return !(v1 == null && v2 == null) && !(v1 != null && v1.equals(v2));
    case "<":
      return v1 != null && v2 != null && v1 instanceof Integer && v2 instanceof Integer
          && (Integer) v1 < (Integer) v2;
    case "<=":
      return v1 != null && v2 != null && v1 instanceof Integer && v2 instanceof Integer
          && (Integer) v1 <= (Integer) v2;
    case ">":
      return v1 != null && v2 != null && v1 instanceof Integer && v2 instanceof Integer
          && (Integer) v1 > (Integer) v2;
    case ">=":
      return v1 != null && v2 != null && v1 instanceof Integer && v2 instanceof Integer
          && (Integer) v1 >= (Integer) v2;
    case "in":
      if (v2 instanceof Set) {
        Set<Object> set = (Set<Object>) v2;
        return set.contains(v1);
      } else if (v2 == null) {
        // The expr2 was is the null signature
        assert v1 instanceof Set;
        return ((Set<Object>) v1).size() == 0;
      }
    case "!in":
      assert v2 instanceof Set;
      Set<Object> set1 = (Set<Object>) v2;
      return !set1.contains(v1);
    case "&&":
      assert v1 instanceof Boolean && v2 instanceof Boolean;
      return (Boolean) v1 && (Boolean) v2;
    case "->":
      assert v1 instanceof Boolean && v2 instanceof Boolean;
      return !(Boolean) v1 || (Boolean) v2; // A -> B = not A or B
    default:
      throw new IllegalStateException("Binary operator " + op + " not supported");
    }
  }

}
