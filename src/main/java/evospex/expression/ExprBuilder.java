package evospex.expression;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import evospex.expression.ExprGrammarParser.ParseContext;

import java.util.Collection;

/**
 * ExprBuilder class allows to build expressions from their string representation
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ExprBuilder {

  private static ExprGrammarParser parser; // Expressions Parser

  public static final Expr TRUE = toExpr(ExprName.TRUE, Boolean.class);
  public static final Expr FALSE = toExpr(ExprName.FALSE, Boolean.class);
  public static final Expr RESULT = toExpr(ExprName.RESULT, Object.class);
  public static final Expr NULL = toExpr(ExprName.NULL, Object.class);
  public static final Expr ZERO = toExpr(ExprName.ZERO, Number.class);
  public static final Expr ONE = toExpr(ExprName.ONE, Number.class);

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
  public static Expr toExpr(String str_expr,Class<?> c) {
    setup(str_expr);
    ParseTree tree = parser.parse();
    if (parser.getNumberOfSyntaxErrors() > 0)
      throw new IllegalArgumentException("The given expression contains syntax errors");
    ParseContext ctx = (ParseContext) tree;
    return new Expr(ctx.expr(),c);
  }

  /**
   * Join the two given expressions
   * @param expr1 is the first expression
   * @param expr2 is the second expression
   * @return the expression expr1.expr2
   */
  public static Expr join(Expr expr1, Expr expr2) {
    return toExpr(expr1.exprCtx().getText() + ExprOperator.JOIN  + expr2.exprCtx().getText(), expr2.type());
  }

  /**
   * Compare the two given expressions with the eq operator
   * @param expr1 is the first expression
   * @param expr2 is the second expression
   * @return the expression expr1 = expr2
   */
  public static Expr eq(Expr expr1, Expr expr2) {
    return toExpr(expr1.exprCtx().getText() + " " + ExprOperator.EQ + " " + expr2.exprCtx().getText(), Boolean.class);
  }

  /**
   * Compare the two given expressions with the not eq operator
   * @param expr1 is the first expression
   * @param expr2 is the second expression
   * @return the expression expr1 != expr2
   */
  public static Expr neq(Expr expr1, Expr expr2) {
    return toExpr(expr1.exprCtx().getText() + " " + ExprOperator.NOT_EQ + " " + expr2.exprCtx().getText(), Boolean.class);
  }

  /**
   * Apply the two given expressions with the given operator
   * @param expr1 is the first expression
   * @param expr2 is the second expression
   * @return the expression expr1 op expr2
   */
  public static Expr applyOp(Expr expr1, String op, Expr expr2, Class<?> cl) {
    return toExpr(expr1.exprCtx().getText() + " " + op + " " + expr2.exprCtx().getText(), cl);
  }

  /**
   * Compare the two given expressions with the in operator
   * @param expr1 is the first expression
   * @param expr2 is the second expression
   * @return the expression expr1 in expr2
   */
  public static Expr in(Expr expr1, Expr expr2) {
    return toExpr(expr1.toString() + " " + ExprOperator.IN + " " + expr2.toString(), Boolean.class);
  }

  /**
   * Join the two given expressions by applying the reflexive closure to the second
   * @param expr1 is the first expression
   * @param expr2 is the second expression
   * @return the expression expr1.*(expr2)
   */
  public static Expr joinWithRClosure(Expr expr1, String expr2) {
    return toExpr(expr1.toString() + ExprOperator.JOIN + ExprOperator.R_CLOSURE + "(" + expr2 + ")", Collection.class);
  }

  /**
   * Join the three given expressions by applying the reflexive closure to the second + the third
   * @param expr1 is the first expression
   * @param expr2 is the second expression
   * @param expr3 is the third expression
   * @return the expression expr1.*(expr2+expr3)
   */
  public static Expr joinWithRClosure(Expr expr1, String expr2, String expr3) {
    return toExpr(expr1 + ExprOperator.JOIN + ExprOperator.R_CLOSURE + "(" + expr2 + "+" + expr3 + ")", Collection.class);
  }

}
