package evospex.expression.evaluator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import evospex.expression.ExprGrammarParser.Closure_fieldContext;
import evospex.expression.ExprGrammarParser.Closure_opContext;
import evospex.expression.ExprGrammarParser.CollectionContext;
import evospex.expression.ExprGrammarParser.NameContext;
import evospex.expression.ExprGrammarParser.Set_exprContext;

/**
 * This class provides methods to evaluate set expressions.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class SetExpressionEvaluator {

  /**
   * Evaluate the given set context on the given object
   */
  public static Set<Object> eval(Set_exprContext set_expr_ctx) {
    // Get the base part (left to closure operator)
    // Name at 0 is the part of the expression that starts from the object
    NameContext left_part = set_expr_ctx.name(0);
    verifyTypes(left_part, null);

    // Get closure and fields
    Closure_opContext closure_op = set_expr_ctx.closure_op();
    Closure_fieldContext field = set_expr_ctx.closure_field();

    // Start exploring applying the fields as indicated by the closure operation
    Object base_object = NameExpressionEvaluator.eval(left_part, null);
    Set<Object> set = new HashSet<Object>();

    if (base_object!=null) {
      if (closure_op.getText().equals("*"))
        set.add(base_object);
      Closure_fieldContext extraField = field.closure_field();
      if (extraField==null)
        closureFromField(base_object, field, set);
      else
        closureFromTwoFields(base_object, field, extraField, set);
    }

    NameContext after_closure = set_expr_ctx.name(1);
    // If the name after closure is null, then the set has been computed
    if (after_closure==null)
      return set;

    Set<Object> after_closure_set = new HashSet<>();
    set.forEach(elem -> {
      after_closure_set.add(NameExpressionEvaluator.eval(after_closure, elem));
    });

    return after_closure_set;
  }

  /**
   * Evaluate the given collection context on the given object
   */
  public static Set<Object> eval(CollectionContext collection_ctx) {
    // Get the name
    NameContext set_expr = collection_ctx.name();
    Object set_field_res = NameExpressionEvaluator.eval(set_expr, null);
    if (set_field_res==null)
      return new HashSet<>();
    assert (set_field_res instanceof Collection);
    Collection<?> col = (Collection<?>) set_field_res;
    return new HashSet<>(col);
  }

  /**
   * Recursively apply the field in order to compute a set
   */
  private static void closureFromField(Object base, Closure_fieldContext field,
      Set<Object> visited) {
    Object curr = NameExpressionEvaluator.eval(field.ID(), base);
    if (curr != null) {
      if (visited.add(curr))
        closureFromField(curr, field, visited);
    }
  }

  /**
   * Recursively apply two fields in order to compute a set
   */
  private static void closureFromTwoFields(Object base, Closure_fieldContext field_one, Closure_fieldContext field_two, Set<Object> visited) {
    Object curr = NameExpressionEvaluator.eval(field_one.ID(), base);
    if (curr != null) {
      if (visited.add(curr))
        closureFromTwoFields(curr, field_one, field_two, visited);
    }
    curr = NameExpressionEvaluator.eval(field_two.ID(), base);
    if (curr != null) {
      if (visited.add(curr))
        closureFromTwoFields(curr, field_one, field_two, visited);
    }
  }

  /**
   * Verify if the given name can be computed on the object
   */
  private static void verifyTypes(NameContext name, Object o) {
    if (o != null) {
      if (!name.getText().contains(o.getClass().getSimpleName())
          && !name.getText().equals(QuantifiedExpressionEvaluator.QT_VAR_NAME))
        throw new IllegalArgumentException("Object class " + o.getClass().getSimpleName()
            + " is not compatible with name " + name.getText());
    }

  }
}
