package evospex.expression.util;

import evospex.expression.Expr;
import evospex.expression.ExprGrammarParser.Set_exprContext;

import java.util.List;

/**
 * ExprUtil class provides utilities for expressions
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ExprUtils {

  /**
   * Returns the set expression that is part of the given closured expression
   * @param expr is the given closured expression
   * @return the set present in expr
   */
  public static Set_exprContext getClosuredExprSet(Expr expr) {
    List<Set_exprContext> l = expr.exprCtx().set_expr();
    if (l.size() != 1)
      throw new IllegalStateException("Invalid closured expression: "+expr);
    return l.get(0);
  }

}
