package evospex.expression;

import evospex.expression.symbol.ExprDelimiter;
import evospex.expression.symbol.ExprName;
import evospex.expression.symbol.ExprOperator;
import evospex.expression.util.ExprUtils;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import evospex.expression.ExprGrammarParser.Closure_fieldContext;
import evospex.expression.ExprGrammarParser.ParseContext;
import evospex.expression.ExprGrammarParser.Set_exprContext;

import java.util.Collection;

/**
 * ExprBuilder class allows to build expressions from their string representation
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ExprBuilder {

  private static ExprGrammarParser parser; // Expressions Parser

  public static final Expr TRUE = toExpr(ExprName.TRUE, Boolean.class);
  public static final Expr FALSE = toExpr(ExprName.FALSE, Boolean.class);
  public static final Expr NULL = toExpr(ExprName.NULL, Object.class);
  public static final Expr ZERO = toExpr(ExprName.ZERO, Number.class);
  public static final Expr ONE = toExpr(ExprName.ONE, Number.class);
  private static Expr RESULT;

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
      throw new IllegalArgumentException("The given expression contains syntax errors: "+str_expr);
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
   * Compare the two given expressions with the implies operator
   * @param expr1 is the first expression
   * @param expr2 is the second expression
   * @return the expression expr1 != expr2
   */
  public static Expr implies(Expr expr1, Expr expr2) {
    return toExpr(expr1.exprCtx().getText() + " " + ExprOperator.IMPLIES_1 + " " + expr2.exprCtx().getText(), Boolean.class);
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
    Expr e = toExpr(expr1.toString() + " " + ExprOperator.IN + " " + expr2.toString(), Boolean.class);
    if (expr1.type()==null || expr2.type()==null) throw new IllegalArgumentException("The expressions type can't be null");
    e.setClassOfElemsInSet(expr1.type());
    return e;
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

  /**
   * Quantify the given closured expression with the given operator. The quantified expression body will specify a property
   * involving two variables and it is the following expression:
   * - op n : e.*f : n != n.f
   */
  public static Expr qtExprTwoVars(String operator, Expr closuredExpr) {
    // Get the set expression
    Set_exprContext s = ExprUtils.getClosuredExprSet(closuredExpr);
    Closure_fieldContext field_1 = s.closure_field();
    String body = ExprName.QT_VAR + " " + ExprOperator.NOT_EQ + " " + ExprName.QT_VAR + ExprOperator.JOIN + field_1.ID();
    Expr e = toExpr(getDecl(operator, closuredExpr) + " : " + body, Boolean.class);
    e.setClassOfElemsInSet(closuredExpr.classOfElemsInSet());
    return e;
  }

  /**
   * Quantify the given closured expression with the given operator. The quantified expression body will specify a property
   * involving two variables and it is determined as follow:
   * - op n : e.*(f+g) : n != n.f if code = 1
   * - op n : e.*(f+g) : n != n.g if code = 2
   * - op n : e.*(f+g) : n.f != n.g if code = 3
   * - op n : e.*(f+g) : n = n.f.g if code = 4
   *
   * @param operator is the quantifier
   * @param closuredExpr is the closured expression
   * @param code the code determining the quantified expression body
   * @return the expression op n : closuredExpr : body
   */
  public static Expr qtExprTwoVars(String operator, Expr closuredExpr, int code) {
    // Get the set expression
    Set_exprContext s = ExprUtils.getClosuredExprSet(closuredExpr);
    Closure_fieldContext field_1 = s.closure_field();
    Closure_fieldContext field_2 = field_1.closure_field();

    if (field_2 == null && code != 1)
      throw new IllegalArgumentException("The closured expression is supposed to be double closured");

    // Build the quantified expression body depending on the provided code
    String body;
    switch (code) {
      case 1:
        body = ExprName.QT_VAR + " " + ExprOperator.NOT_EQ + " " + ExprName.QT_VAR + ExprOperator.JOIN + field_1.ID();
        break;
      case 2:
        body = ExprName.QT_VAR + " " + ExprOperator.NOT_EQ + " " + ExprName.QT_VAR + ExprOperator.JOIN + field_2.ID();
        break;
      case 4:
        body = ExprName.QT_VAR + " " + ExprOperator.EQ + " " + ExprName.QT_VAR + ExprOperator.JOIN + field_1.ID() + ExprOperator.JOIN + field_2.ID();
        break;
      default:
        throw new UnsupportedOperationException("Code still not supported: "+code);
    }

    Expr e = toExpr(getDecl(operator, closuredExpr) + " : " + body, Boolean.class);
    e.setClassOfElemsInSet(closuredExpr.classOfElemsInSet());
    return e;
  }

  /**
   * Quantify the given closured expression with the given operator. The quantified expression body will specify a property
   * involving one variable and a set and it is determined as follow:
   * - op n : e.*(f+g) : n in n.^f if code=1
   * - op n : e.*(f+g) : n in n.^g if code=2
   *
   * @param operator is the quantifier
   * @param closuredExpr is the closured expression
   * @param code the code determining the quantified expression body
   * @return a quantified expression comparing one variable and one set
   */
  public static Expr qtExprVarSet(String operator, Expr closuredExpr, int code) {
    // Get the set expression
    Set_exprContext s = ExprUtils.getClosuredExprSet(closuredExpr);
    Closure_fieldContext field_1 = s.closure_field();
    Closure_fieldContext field_2 = field_1.closure_field();

    // Build the quantified expression body depending on the provided code
    String body = "";
    if (code == 1) {
      body = ExprName.QT_VAR + " " + ExprOperator.IN + " " +
              ExprName.QT_VAR + ExprOperator.JOIN + ExprOperator.RT_CLOSURE + ExprDelimiter.LP + field_1.ID() + ExprDelimiter.RP;
    } else if (code == 2) {
      if (field_2 == null)
        throw new IllegalArgumentException("The closured expression is supposed to be double closured");
      body = ExprName.QT_VAR + " " + ExprOperator.IN + " " +
              ExprName.QT_VAR + ExprOperator.JOIN + ExprOperator.RT_CLOSURE + ExprDelimiter.LP + field_2.ID() + ExprDelimiter.RP;
    } else {
      throw new UnsupportedOperationException("Code still not supported: "+code);
    }

    Expr e =  toExpr(getDecl(operator, closuredExpr) + " : " + body, Boolean.class);
    e.setClassOfElemsInSet(closuredExpr.classOfElemsInSet());
    return e;
  }

  /**
   * Quantify the given double closured expression with the given operator. The quantified expression body will specify a property
   * involving two sets as follows:
   * - op n : e.*(f+g) : n.f.*(f+g) != n.g.*(f+g)
   *
   * @param operator is the quantifier
   * @param closuredExpr is the closured expression
   * @return a quantified expression comparing two sets
   */
  public static Expr qtExprSetSet(String operator, Expr closuredExpr) {
    // Get the set expression
    Set_exprContext s = ExprUtils.getClosuredExprSet(closuredExpr);
    Closure_fieldContext field_1 = s.closure_field();
    Closure_fieldContext field_2 = field_1.closure_field();

    if (field_2 == null)
      throw new IllegalArgumentException("The closured expression is supposed to be double closured");

    // Build the quantified expression body depending on the provided code
    String body_left = ExprName.QT_VAR + ExprOperator.JOIN + field_1.ID() + ExprOperator.JOIN + ExprOperator.R_CLOSURE +
            ExprDelimiter.LP + field_1.ID() + ExprOperator.PLUS + field_2.ID() + ExprDelimiter.RP;
    String body_right = ExprName.QT_VAR + ExprOperator.JOIN + field_2.ID() + ExprOperator.JOIN + ExprOperator.R_CLOSURE +
            ExprDelimiter.LP + field_1.ID() + ExprOperator.PLUS + field_2.ID() + ExprDelimiter.RP;

    Expr e = toExpr(getDecl(operator, closuredExpr) + " : " + body_left + " " +  ExprOperator.NOT_EQ + " " + body_right, Boolean.class);
    e.setClassOfElemsInSet(closuredExpr.classOfElemsInSet());
    return e;
  }

  /**
   * Given a closured expression e.*(f+g), an expression r, an expression e1 of the same type as r,
   * and a quantification operator, creates a gene value with expression:
   *
   * - op n : e.*(f+g) | n.r = e1
   */
  public static Expr qtExprOneVarValueComparison(Expr closured, Expr joineable, Expr toCmp, String op) {
    Expr joinField = toExpr(ExprName.QT_VAR + ExprOperator.JOIN + joineable, joineable.type());
    Expr cmp = eq(joinField, toCmp);
    Expr e = toExpr(getDecl(op, closured) + " : " + cmp, Boolean.class);
    e.setClassOfElemsInSet(closured.classOfElemsInSet());
    e.setClassOfValues(joineable.type());
    return e;
  }

  /**
   * Given a double closured expression e.*(f+g), an expression r and a quantification operator
   * creates a gene value with expression:
   *
   * - op n : e.*(f+g) | (n.f!=null)=> n.r = n.f.r if code==1
   * - op n : e.*(f+g) | (n.g!=null)=> n.r = n.g.r if code==2
   */
  public static Expr qtExprTwoVarValuesComparison(Expr closured, Expr joineable, String op, int code) {
    // Get the set expression
    Set_exprContext s = ExprUtils.getClosuredExprSet(closured);
    Closure_fieldContext field_1 = s.closure_field();
    Closure_fieldContext field_2 = field_1.closure_field();
    if (field_2 == null && code==2)
      throw new IllegalArgumentException("The closured expression is supposed to be double closured");

    Expr e;
    Expr joinValue = toExpr(ExprName.QT_VAR + ExprOperator.JOIN + joineable, joineable.type());
    if (code == 1) {
      // Prepare the body parts
      Expr joinField = toExpr(ExprName.QT_VAR + ExprOperator.JOIN + field_1.ID(), joineable.type());
      Expr joinFieldAndExpr = toExpr(ExprName.QT_VAR + ExprOperator.JOIN + field_1.ID() + ExprOperator.JOIN + joineable,  joineable.type());
      Expr cmp = eq(joinValue, joinFieldAndExpr);
      // Create the quantified expression
      String bodyStr = neq(joinField, ExprBuilder.NULL) + " " + ExprOperator.IMPLIES_1 + " " + cmp;
      e = toExpr(getDecl(op, closured) + " : " + bodyStr, Boolean.class);
    } else if (code == 2) {
      Expr joinField = toExpr(ExprName.QT_VAR + ExprOperator.JOIN + field_2.ID(), joineable.type());
      Expr joinFieldAndExpr = toExpr(ExprName.QT_VAR + ExprOperator.JOIN + field_2.ID() + ExprOperator.JOIN + joineable,  joineable.type());
      Expr cmp = eq(joinValue, joinFieldAndExpr);
      // Create the quantified expression
      String bodyStr = neq(joinField, ExprBuilder.NULL) + " " + ExprOperator.IMPLIES_1 + " " + cmp;
      e = toExpr(getDecl(op, closured) + " : " + bodyStr, Boolean.class);
    } else {
      throw new UnsupportedOperationException("code not supported");
    }
    e.setClassOfElemsInSet(closured.classOfElemsInSet());
    e.setClassOfValues(joineable.type());
    return e;
  }

  /**
   * Given a closured expression e and an integer expression i creates the cardinality expression #(e) = i
   * @param closuredExpr is the closured expressiion
   * @param intExpr is the integer expression
   * @return the cardinality expression #(closuredExpr) = intExpr
   */
  public static Expr cardinalityExpr(Expr closuredExpr, Expr intExpr) {
    if (intExpr==null || (!Integer.class.equals(intExpr.type()) && !int.class.equals(intExpr.type())))
      throw new IllegalArgumentException("Invalid integer expression: "+intExpr);

    // Get the set expression
    Expr card = toExpr(ExprOperator.CARDINALITY + ExprDelimiter.LP + closuredExpr.toString() + ExprDelimiter.RP, Integer.class);
    return eq(card, intExpr);
  }

  /**
   * Returns the declaration part for a future quantified expression
   */
  private static String getDecl(String operator, Expr closuredExpr) {
    return operator + " " + ExprName.QT_VAR + " : " + closuredExpr;
  }

  /**
   * Quantify the given closured expression with the given operator, and include the given body.
   * @param operator is the quantifier
   * @param closuredExpr is the closured expression
   * @param body is the quantified expression body
   * @return the expression op n : closuredExpr : body
   */
  public static Expr qtExpr(String operator, Expr closuredExpr, String body) {
    return toExpr(operator + " " + ExprName.QT_VAR + " : " + closuredExpr + " : " + body, Boolean.class);
  }

  /**
   * Returns the result expression
   */
  public static Expr getResult(Class<?> resultType) {
    if (RESULT==null)
      RESULT = toExpr(ExprName.RESULT,resultType);
    return RESULT;
  }

}
