package evospex.expression;

import evospex.expression.ExprGrammarParser.ExprContext;

/**
 * Expr class captures an expression, which is composed of an ExprContext (the actual expression)
 * and a class, which represent the expression type.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class Expr {

  private ExprContext exprContext; // Actual expression
  private Class<?> type; // The expression type

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
    return exprContext.getText();
  }

}
