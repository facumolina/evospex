package evospex.state.mutation;

import evospex.expression.Expr;
import evospex.expression.ExprGrammarParser.NameContext;
import evospex.expression.evaluator.NameExpressionEvaluator;

import java.lang.reflect.Field;
import java.util.*;

/**
 * FieldMutator class: perform mutations on fields.
 * @author Facundo Molina <facundo.molina@imdea.org>
 */
public class FieldMutator {

  /**
   * Mutate the given field (denoted by a 'chained' expression) on the given object.
   * @param expr is the expression that denotes the field
   * @param object is the object to mutate
   */
  public static void mutateField(Expr expr, Object object) {
    if (expr == null) throw new IllegalArgumentException("Expression cannot be null");
    if (object == null) throw new IllegalArgumentException("Object to mutate cannot be null");
    NameContext nameCtx = expr.exprCtx().name();
    if (nameCtx == null) throw new IllegalArgumentException("NameContext within the expression context cannot be null");
    NameContext nextField = nameCtx.name();
    Object current = object;
    while(true) {
      String fieldName = nextField.ID().getText();
      if (nextField.name()==null) {
        // This is the last field to evaluate
        mutateField(fieldName, current, expr);
        return;
      } else {
        // This is not the last field to evaluate, thus we need to get the next field
        nextField = nextField.name();
        current = NameExpressionEvaluator.eval(fieldName, current);
      }
    }
  }

  /**
   * Mutate the given field on the given object.
   * @param fieldName is the name of the field to mutate
   * @param object is the object to mutate
   * @param expr is the expression that denotes the field
   */
  public static void mutateField(String fieldName, Object object, Expr expr) {
    if (fieldName == null) throw new IllegalArgumentException("Field name cannot be null");
    if (object == null) throw new IllegalArgumentException("Object to mutate cannot be null");
    if (expr == null) throw new IllegalArgumentException("Expression cannot be null");


    System.out.println("Mutating field " + fieldName + " of type " + expr.type());
    Object newValue = getNewValue(expr.type(), object);
    System.out.println("new value: " + newValue);

    Class<?> clazz = object.getClass();
    List<Field> fields = getAllFields(new ArrayList<>(),clazz);
    for (Field field : fields) {
      if (field.getName().equals(fieldName)) {
        try {
          field.setAccessible(true);
          field.set(object, newValue);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
          e.printStackTrace();
        }
      }
    }
  }


  private static Object getNewValue(Class<?> type, Object currentObject) {
    if (type.equals(Integer.class)) {
      return getRandomInt();
    } else if (type.equals(Boolean.class)) {
      return getRandomBoolean();
    } else if (type.equals(Double.class)) {
      return getRandomDouble();
    } else if (type.equals(String.class)) {
      return getRandomString();
    } else if (type.equals(Set.class)) {
      return getRandomSet();
    } else if (type.equals(Object.class)) {
      return getRandomInt();
    } else {
      // It is a reference to another object, thus search for an object of the same type
      // that is reachable from the current object
      return getRandomObject(type, currentObject);
    }
  }

  private static Integer getRandomInt() {
    Random r = new Random();
    return r.nextInt(100);
  }

  private static Boolean getRandomBoolean() {
    Random r = new Random();
    return r.nextBoolean();
  }

  private static Double getRandomDouble() {
    Random r = new Random();
    return r.nextDouble();
  }

  private static String getRandomString() {
    Random r = new Random();
    return "randomString" + r.nextInt(100);
  }

  private static Set<Object> getRandomSet() {
    Set<Object> set = new HashSet<>();
    set.add(getRandomInt());
    set.add(getRandomBoolean());
    set.add(getRandomDouble());
    set.add(getRandomString());
    return set;
  }

  private static Object getRandomObject(Class<?> type, Object currentObject) {
    // Find an object of the given type that is reachable from the current object
    return null;
  }

  /**
   * Get all fields from the given clazz (even the inherited ones)
   */
  private static List<Field> getAllFields(List<Field> fields, Class<?> clazz) {
    fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
    if (clazz.getSuperclass() != null) {
      getAllFields(fields, clazz.getSuperclass());
    }
    return fields;
  }

}
