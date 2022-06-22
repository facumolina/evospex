package evospex.expression.util;

import evospex.expression.Expr;
import evospex.expression.ExprGrammarLexer;
import evospex.expression.ExprGrammarParser;
import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.ExprGrammarParser.Set_exprContext;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

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

  /**
   * Build an ExprContext expression from a given string
   */
  public static ExprContext getExprContext(String strExpr) {
    ExprGrammarLexer lexer = new ExprGrammarLexer(CharStreams.fromString(strExpr));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ExprGrammarParser parser = new ExprGrammarParser(tokens);
    ParseTree tree = parser.parse();
    ExprGrammarParser.ParseContext ctx = (ExprGrammarParser.ParseContext) tree;
    return ctx.expr();
  }

}
