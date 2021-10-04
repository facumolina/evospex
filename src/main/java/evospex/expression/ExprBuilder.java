package evospex.expression;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.ExprGrammarParser.ParseContext;
import rfm.dynalloyCompiler.ast.Expr;

/**
 * ExprBuilder class allows to build expressions from their string representation
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ExprBuilder {

  private static ExprGrammarParser parser; // Expressions Parser

  /**
   * Setup the parser
   */
  private static void setup(String str_expr) {
    ExprGrammarLexer lexer = new ExprGrammarLexer(CharStreams.fromString(str_expr));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    parser = new ExprGrammarParser(tokens);
  }

  /**
   * Returns the ExprContext representing the given string expression
   */
  public static ExprContext toExprContext(String str_expr) {
    setup(str_expr);
    ParseTree tree = parser.parse();
    if (parser.getNumberOfSyntaxErrors() > 0)
      throw new IllegalArgumentException("The given expression contains syntax errors");
    ParseContext ctx = (ParseContext) tree;
    return ctx.expr();
  }

  /**
   * Join the two given expressions
   * @param expr1 is the first expression
   * @param expr2 is the second expression
   * @return the expression expr1.expr2
   */
  public static String join(String expr1, String expr2) {
    return expr1 + ExprOperator.JOIN + expr2;
  }

  /**
   * Join the two given expressions by applying the reflexive closure to the second
   * @param expr1 is the first expression
   * @param expr2 is the second expression
   * @return the expression expr1.*(expr2)
   */
  public static String joinWithRClosure(String expr1, String expr2) {
    return expr1 + ExprOperator.JOIN + ExprOperator.R_CLOSURE + "(" + expr2 + ")";
  }

  /**
   * Join the three given expressions by applying the reflexive closure to the second + the third
   * @param expr1 is the first expression
   * @param expr2 is the second expression
   * @param expr3 is the third expression
   * @return the expression expr1.*(expr2+expr3)
   */
  public static String joinWithRClosure(String expr1, String expr2, String expr3) {
    return expr1 + ExprOperator.JOIN + ExprOperator.R_CLOSURE + "(" + expr2 + "+" + expr3 + ")";
  }

}
