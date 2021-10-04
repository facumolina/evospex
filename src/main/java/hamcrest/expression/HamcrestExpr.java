package hamcrest.expression;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

import evospex.target.MethodExecution;
import evospex.target.MethodExecutionContext;

/**
 * This class represents a Hamcrest expression
 * 
 * @author fmolina
 *
 */
public abstract class HamcrestExpr {

  protected boolean partOfSet = false;

  /**
   * Constructor
   */
  public HamcrestExpr() {
  }

  /**
   * Evaluate the hamcrest expression in the method execution
   */
  public abstract Object evaluate(MethodExecution me) throws NonEvaluableExpressionException;

  /**
   * Evaluate the hamcrest expression in the given context
   */
  public abstract Object evaluate(MethodExecutionContext mec);

  /**
   * Evaluate the given string expression in the current context
   * 
   * @throws InvocationTargetException
   */
  public Object evaluateWithReflection(String strExpr, MethodExecutionContext mec) {
    try {
      String[] fields = strExpr.split(" . ");
      Object curr = mec.getValue(fields[0].replace(" ", ""));
      int i = 1;
      // Navigate through the object by applying the fields
      while (i < fields.length && curr != null) {
        // Move to the next field (field str should not have spaces)
        String fieldStr = fields[i].replace(" ", "");
        if (fieldStr.contains("[")) {
          // The field is an array
          curr = navigateThroughArray(curr, fieldStr);
        } else {
          if (fieldStr.contains("(")) {
            // Actually it is a method call
            try {
              Method m = getMethod(curr.getClass(), fieldStr.replaceAll("\\(\\)", ""));
              curr = m.invoke(curr);
            } catch (InvocationTargetException e) {
              // The evaluation method can't be evaluated
              throw new NonEvaluableExpressionException(
                  "The expression " + strExpr + " can't be evaluated");
            }
          } else {
            if (fieldStr.equals("getValueOfKey")) {
              // Actually we are accessing a map key
              assert curr instanceof Map;
              Map map = (Map) curr;
              Object value = map
                  .get(evaluateWithReflection(getRemainingExpression(fields, i + 1), mec));
              return value;
            } else {
              Field field = getField(curr.getClass(), fieldStr);
              field.setAccessible(true);
              curr = field.get(curr);
            }

          }
        }
        i++;
      }
      if (curr == null && i < fields.length) {
        // The evaluation returned null and some fields still needs to be evaluated
        throw new NonEvaluableExpressionException(
            "The expression " + strExpr + " can't be evaluated");
      }
      return curr;
    } catch (RuntimeException | IllegalAccessException e) {
      // e.printStackTrace();
      throw new NonEvaluableExpressionException("The expression " + strExpr
          + " can't be evaluated due to a RuntimeException or IllegalAccessException: "
          + e.getMessage());
    }
  }

  /**
   * Navigate through array field
   * 
   * @throws IllegalAccessException
   * @throws IllegalArgumentException
   */
  private Object navigateThroughArray(Object obj, String arrayFieldStr)
      throws IllegalArgumentException, IllegalAccessException {
    // The field is an array
    String[] arrayField = arrayFieldStr.split("\\[");
    Field field = getField(obj.getClass(), arrayField[0]);
    field.setAccessible(true);
    Object[] arrayObj = (Object[]) field.get(obj);
    // Apply position
    String strNum = arrayField[1].replaceAll("\\]", "");
    int pos = Integer.parseInt(strNum);
    return arrayObj[pos];
  }

  /**
   * Search for the field fieldName even in the superclass
   */
  private Field getField(Class<?> clazz, String fieldName) {
    Class<?> tmpClass = clazz;
    do {
      try {
        Field f = tmpClass.getDeclaredField(fieldName);
        return f;
      } catch (NoSuchFieldException e) {
        tmpClass = tmpClass.getSuperclass();
      }
    } while (tmpClass != null && tmpClass != Object.class);

    throw new RuntimeException("Field '" + fieldName + "' not found on class " + clazz);
  }

  /**
   * Search for the method methodName even in the superclass
   */
  private Method getMethod(Class<?> clazz, String methodName) {
    Class<?> tmpClass = clazz;
    do {
      try {
        Method m = tmpClass.getDeclaredMethod(methodName);
        return m;
      } catch (NoSuchMethodException e) {
        tmpClass = tmpClass.getSuperclass();
      }
    } while (tmpClass != null && tmpClass != Object.class);

    throw new RuntimeException("Method '" + methodName + "' not found on class " + clazz);
  }

  /**
   * Returns true if the current Hamcrest Expression is part of a set
   */
  public boolean isPartOfSet() {
    return partOfSet;
  }

  /**
   * Get the remaining expression in the fields array starting from position i
   */
  private String getRemainingExpression(String[] fields, int pos) {
    String expr = fields[pos];
    for (int i = pos + 1; i < fields.length; i++) {
      expr += " . " + fields[i];
    }
    return expr;
  }

}
