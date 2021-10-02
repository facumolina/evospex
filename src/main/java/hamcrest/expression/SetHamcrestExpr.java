package hamcrest.expression;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.jexl3.JexlException;

import evospex.target.MethodExecution;
import evospex.target.MethodExecutionContext;

/**
 * This class represents a set Hamcrest expression. A set hamcrest expression is an expression that
 * denotes a set, for example, thiz.header.*next
 * 
 * @author fmolina
 *
 */
public class SetHamcrestExpr extends HamcrestExpr {

  private String exprString;

  /**
   * Constructor
   */
  public SetHamcrestExpr(String exprString) {
    assert exprString != null;
    this.exprString = exprString.replace("this", "o");
  }

  @Override
  public Object evaluate(MethodExecution me) throws NonEvaluableExpressionException {
    return evaluate(new MethodExecutionContext(me));
  }

  @Override
  public Object evaluate(MethodExecutionContext mec) {
    if (exprString.startsWith("#")) {
      // It is a cardinality expression, an integer must be returned
      Set<Object> set = computeSet(exprString.replace("# ", ""), mec);
      return set.size();
    } else if (exprString.startsWith("+") && exprString.contains("#")) {
      // It is an addition operation including the set cardinality
      return null;
    } else if (exprString.startsWith("-") && exprString.contains("#")) {
      // Is is a subtraction operation including the set cardinality
      return null;
    } else if (exprString.contains("*") || exprString.contains("^")) {
      // Compute a set
      return computeSet(exprString, mec);
    } else {
      // Attempt to evaluate it as a simple expr
      SimpleHamcrestExpr simple = new SimpleHamcrestExpr(exprString);
      Object res = simple.evaluate(mec);
      if (res instanceof Collection)
        return res;
    }
    throw new IllegalStateException(exprString + " not supported for evaluation!");
  }

  /**
   * Compute the set
   */
  private Set<Object> computeSet(String exprStr, MethodExecutionContext mec) {
    Set<Object> set = new HashSet<Object>();
    Set<Object> realValues = new HashSet<Object>();
    boolean hasValues = false;
    if (exprStr.contains("*")) {
      int asterisk = exprStr.indexOf("*");
      // We are in the case expr1.*expr2
      String expr1String = exprStr.substring(0, asterisk - 2);
      String expr2String = exprStr.substring(asterisk + 2, exprStr.length());
      // Evaluate expr1 and add the object to the set
      expr1String = evaluableString(expr1String);
      // JexlExpression e = jexl.createExpression(expr1String);

      if (!expr2String.contains(".")) {
        // Expr of tpye e.*f
        // Object o1 = e.evaluate(jc);
        Object o1 = evaluateWithReflection(expr1String, mec);
        if (o1 != null) {
          set.add(o1);
          // Start applying expr2 until all the reachable objects are visited
          String[] fields = expr2String.split("\\+");
          if (fields.length == 2 && fields[1].contains(" - null")) {
            fields[1] = fields[1].replace(" - null", "");
          }
          MethodExecutionContext mec1 = new MethodExecutionContext();
          mec1.setValue("o", o1);
          recursiveEvaluation(set, null, mec1, Arrays.asList(fields), null, false);
        }
      } else {
        // Expr of type e.*f.g, split second expr in .
        String[] both = expr2String.split("\\.");
        String closure = both[0];
        String toeval = both[1];
        // Object o1 = e.evaluate(jc);
        Object o1 = evaluateWithReflection(expr1String, mec);
        if (o1 != null) {
          // e = jexl.createExpression(evaluableString(expr1String + " . " + toeval));
          // Object value = e.evaluate(jc);
          Object value = evaluateWithReflection(expr1String + " . " + toeval, mec);
          set.add(o1);
          hasValues = true;
          realValues.add(value);
          String[] fields = closure.split("\\+");
          MethodExecutionContext mec1 = new MethodExecutionContext();
          mec1.setValue("o", o1);
          recursiveEvaluation(set, realValues, mec1, Arrays.asList(fields), toeval, false);
        }
      }
    } else if (exprStr.contains("^")) {
      // Do not consider the reflexivity
      int transitive = exprStr.indexOf("^");
      // We are in the case expr1.^expr2
      String expr1String = exprStr.substring(0, transitive - 2);
      String expr2String = exprStr.substring(transitive + 2, exprString.length());
      String[] fields = expr2String.split("\\+");
      recursiveEvaluation(set, null, mec, Arrays.asList(fields), null, false);
    }
    if (hasValues)
      return realValues;
    return set;
  }

  /**
   * Recursive evaluation of closured expression
   */
  private void recursiveEvaluation(Set<Object> visitedObjects, Set<Object> realValues,
      MethodExecutionContext mec, List<String> fieldsToApply, String toEvalAfterField,
      boolean includeNull) {
    for (String field : fieldsToApply) {
      try {
        // JexlExpression e = jexl.createExpression("o." + field);
        // Object next = e.evaluate(jc);
        Object next = evaluateWithReflection("o . " + field, mec);
        if ((next != null || includeNull) && visitedObjects.add(next)) {
          MethodExecutionContext mec1 = new MethodExecutionContext();
          mec1.setValue("o", next);
          if (toEvalAfterField != null) {
            // e = jexl.createExpression(evaluableString("o . " + toEvalAfterField));
            // Object value = e.evaluate(jc1);
            Object value = evaluateWithReflection(evaluableString("o . " + toEvalAfterField), mec1);
            realValues.add(value);
          }
          recursiveEvaluation(visitedObjects, realValues, mec1, fieldsToApply, toEvalAfterField,
              includeNull);
        }
      } catch (JexlException ex) {
        ex.printStackTrace();
      }
    }
  }

  /**
   * Get string to evaluate it in objects
   */
  private String evaluableString(String str) {
    String res = str.replace("thiz", "o").replace("thizPre", "o").replace(" n ", " o ")
        .replace("n ", "o ");
    if (res.contains("size"))
      res = str.replace("size", "getSizeField()");
    // Only for Schedule case
    if (res.contains("prioQueue1"))
      res = res.replace("prioQueue1", "prioQueue[1]");
    if (res.contains("prioQueue2"))
      res = res.replace("prioQueue2", "prioQueue[2]");
    if (res.contains("prioQueue3"))
      res = res.replace("prioQueue3", "prioQueue[3]");
    // Only for CommonTree case
    if (res.contains("childreo"))
      res = res.replace("childreo", "children");
    return res;
  }

  @Override
  public String toString() {
    return exprString.replace("thiz", "this").replace("thizPre", "old_this")
        .replace("prioQueue1", "prioQueue[1]").replace("prioQueue2", "prioQueue[2]")
        .replace("prioQueue3", "prioQueue[3]");
  }
}
