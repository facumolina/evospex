package evospex.expression;

import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.symbol.ExprName;
import evospex.expression.symbol.ExprOperator;

/**
 * Expr class captures an expression, which is composed of an ExprContext (the actual expression)
 * and a class, which represent the expression type.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class Expr {

  private final ExprContext exprContext; // Actual expression
  private final Class<?> type; // The expression type

  /**
   * Constructor
   */
  public Expr(ExprContext exprCtx, Class<?> c) {
    if (exprCtx==null || c==null)
      throw new IllegalArgumentException("Neither the expression nor the class can be null");
    exprContext = exprCtx;
    type = c;
  }

  /**
   * Get the expression
   */
  public ExprContext exprCtx() {
    return exprContext;
  }

  /**
   * Get the type
   */
  public Class<?> type() {
    return type;
  }

  /**
   * Returns true iff the current expression is a quantified one
   */
  public boolean isQuantified() { return exprContext.qt_expr() != null; }

  @Override
  public String toString() {
    String str =  exprContext.getText();
    if (str.startsWith(ExprOperator.ALL + ExprName.QT_VAR + ":")) {
     return str.replace(ExprOperator.ALL + ExprName.QT_VAR + ":",ExprOperator.ALL + " " + ExprName.QT_VAR + ":");
    }
    if (str.startsWith(ExprOperator.SOME + ExprName.QT_VAR + ":")) {
      return str.replace(ExprOperator.SOME + ExprName.QT_VAR + ":",ExprOperator.SOME + " " + ExprName.QT_VAR + ":");
    }
    return str;
  }

}
