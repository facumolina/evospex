package evospex.expression.evaluator;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import evospex.expression.ExprGrammarConstantSymbols;
import evospex.expression.ExprGrammarLexer;
import evospex.expression.ExprGrammarParser;
import evospex.expression.ExprGrammarParser.ParseContext;
import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.ExprGrammarParser.Qt_exprContext;
import evospex.expression.ExprGrammarParser.Num_binary_opContext;
import evospex.expression.ExprGrammarParser.Binary_opContext;
import evospex.expression.ExprGrammarParser.Set_binary_opContext;
import evospex.expression.ExprGrammarParser.Set_exprContext;
import evospex.expression.ExprGrammarParser.Compare_opContext;
import evospex.expression.ExprGrammarParser.Unary_opContext;
import evospex.expression.ExprGrammarParser.NameContext;

import evospex.expression.ExprName;
import evospex.expression.validator.ExpressionValidator;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * This class represents an Expression Evaluator. Provides a method that given a Java object and an
 * expression (satisfiying the expressions grammar ExprGrammar) evaluates the expression on the object.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ExpressionEvaluator {

  private static ExprGrammarParser parser; // Expressions parser

  protected static Map<String, Object> vars; // Map from var name to object

  /**
   * Setup the parser
   */
  private static void setup(ExprContext expr,Object o) {
    vars = new HashMap<>();
    vars.put(ExprName.THIS, o);
  }

  /**
   * Check the arguments for evaluation
   */
  private static void checkEvalArgs(ExprContext strExpr, Object base) {
    if (strExpr == null || base == null)
      throw new IllegalArgumentException("Neither the expression nor the object can be null.");
  }

  /**
   * Evaluate the given unary expression with the given object
   */
  public static boolean eval(ExprContext expr, Object o) {
    checkEvalArgs(expr, o);
    setup(expr, o);
    return eval(expr, o);
  }


  /**
   * Set the collection var
   */
  private static void set_collection_var(Object o) {
    if (vars.containsKey("Integer_Set_Variable_0"))
      throw new IllegalStateException("Variable value for collection class already inserted!");
    vars.put("Integer_Set_Variable_0", o);
    vars.put("Object_Set_Variable_0", o);
  }

  /**
   * Evaluate the given any expr (not necessarily boolean) on the given object
   */
  public static Object evalAnyExpr(ExprContext expr, Object o) throws NonEvaluableExpressionException {
    checkEvalArgs(expr, o);
    setup(expr, o);
    return eval(expr);
  }

  /**
   * Evaluate the given ParseTree on the given java Object
   */
  protected static Object eval(ExprContext ectx) {

    Qt_exprContext qt_expr_ctx = ectx.qt_expr();
    if (qt_expr_ctx != null)
      return QuantifiedExpressionEvaluator.eval(qt_expr_ctx);

    Num_binary_opContext num_binary_op = ectx.num_binary_op();
    if (num_binary_op != null) {
      // We have a numeric binary operator, i.e., + or -
      List<ExprContext> expressions = ectx.expr();
      assert (expressions.size() == 2);
      return NumericBinaryExpressionEvaluator.eval(expressions.get(0), num_binary_op, expressions.get(1));
    }

    Binary_opContext binary_op = ectx.binary_op();
    if (binary_op != null) {
      // The expression is a binary one
      List<ExprContext> exprs = ectx.expr();
      assert (exprs.size() == 2);
      return BinaryExpressionEvaluator.eval(exprs.get(0), binary_op, exprs.get(1));
    }

    Set_binary_opContext set_binary_op = ectx.set_binary_op();
    if (set_binary_op != null) {
      // The expression is a comparison between two sets
      List<Set_exprContext> set_exprs = ectx.set_expr();
      assert(set_exprs.size() == 2);
      return BinarySetExpressionEvaluator.eval(set_exprs.get(0), set_binary_op, set_exprs.get(1));
    }

    Compare_opContext cmp_op = ectx.compare_op();
    if (cmp_op != null) {
      // The expression is a comparison
      List<ExprContext> exprs = ectx.expr();
      assert (exprs.size() == 2);
      return ComparisonExpressionEvaluator.eval(exprs.get(0), cmp_op, exprs.get(1));
    }

    Unary_opContext unary_op = ectx.unary_op();
    if (unary_op != null) {
      // The expression is a unary one
      List<ExprContext> exprs = ectx.expr();
      assert (exprs.size() == 1);
      return UnaryExpressionEvaluator.eval(unary_op, exprs.get(0));
    }

    NameContext name_ctx = ectx.name();
    if (name_ctx != null) {
      // The expression is a name
      return NameExpressionEvaluator.eval(name_ctx, null);
    }

    List<Set_exprContext> set_exprs = ectx.set_expr();
    if (set_exprs != null && set_exprs.size()>0) {
      // The expression is a set
      return SetExpressionEvaluator.eval(set_exprs.get(0));
    }

    try {
      // Try to parse an Integer
      return Integer.parseInt(ectx.getText());
    } catch (NumberFormatException e) {
    }

    try {
      // Try to parse a Double
      return Double.parseDouble(ectx.getText());
    } catch (NumberFormatException e) {
    }

    throw new IllegalStateException("Unable to evaluate the expression: " + ectx.getText());
  }

}