package evospex.expression;

import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.symbol.ExprName;
import evospex.expression.symbol.ExprOperator;

import java.util.List;

/**
 * Expr class captures an expression, which is composed of an ExprContext (the actual expression)
 * and a class, which represent the expression type.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class Expr {

  private final ExprContext exprContext; // Actual expression
  private final Class<?> type; // The expression type
  private Class<?> classOfElemsInSet ; // Class of elements in set (only for quantified expressions)
  private Class<?> classOfValues; // Class of values being compared (only for quantified expressions)

  /**
   * Constructor
   */
  public Expr(ExprContext exprCtx, Class<?> c) {
    if (exprCtx==null || c==null)
      throw new IllegalArgumentException("Neither the expression nor the class can be null");
    exprContext = exprCtx;
    type = c;
    classOfElemsInSet = null;
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

  /**
   * Returns the class of the elements of the set being quantified
   */
  public Class<?> classOfElemsInSet() { return classOfElemsInSet; }

  /**
   * Set the class of the elements of the set being quantified
   * @param cl is the class of the elements
   */
  public void setClassOfElemsInSet(Class<?> cl) {
    if (cl == null) throw new IllegalArgumentException();
    classOfElemsInSet = cl;
  }

  /**
   * Return the class of the values being compared in a quantified expression
   */
  public Class<?> classOfValues() { return classOfValues; }

  /**
   * Set the class of the values being compared
   * @param cl is the class of the values
   */
  public void setClassOfValues(Class<?> cl) {
    if (cl == null) throw new IllegalArgumentException();
    classOfValues = cl;
  }

  /**
   * Returns true iff the current expression is about a pre state
   */
  public boolean isPreState() { return toString().contains(ExprName.THIS_PRE); }

  @Override
  public String toString() {
    String str =  exprContext.getText();

    ExprGrammarParser.Qt_exprContext qt_expr_ctx = exprContext.qt_expr();
    if (qt_expr_ctx != null) {
      if (str.startsWith(ExprOperator.ALL + ExprName.QT_VAR + ":")) {
        str = str.replace(ExprOperator.ALL + ExprName.QT_VAR + ":", ExprOperator.ALL + " " + ExprName.QT_VAR + ":");
      } else if (str.startsWith(ExprOperator.SOME + ExprName.QT_VAR + ":")) {
        str = str.replace(ExprOperator.SOME + ExprName.QT_VAR + ":", ExprOperator.SOME + " " + ExprName.QT_VAR + ":");
      }
      ExprContext body = qt_expr_ctx.expr();
      if (body.getText().contains(ExprOperator.IMPLIES_1)) {
        str = str.replace(ExprOperator.IMPLIES_1, " " + ExprOperator.IMPLIES_1 + " ");
      }
    }

    if (str.contains(ExprName.QT_VAR + ExprOperator.IN + ExprName.QT_VAR))
      str = str.replace(ExprName.QT_VAR + ExprOperator.IN + ExprName.QT_VAR, ExprName.QT_VAR + " " + ExprOperator.IN + " " + ExprName.QT_VAR);

    ExprGrammarParser.Compare_opContext cmp_op = exprContext.compare_op();
    if (cmp_op != null && ExprOperator.IN.equals(cmp_op.getText())) {
      // The operator is in
      List<ExprContext> exprs = exprContext.expr();
      str = exprs.get(0).getText() + " " + ExprOperator.IN + " " + exprs.get(1).getText();
    }
    if (cmp_op != null && ExprOperator.NOT_IN.equals(cmp_op.getText())) {
      // The operator is not in
      List<ExprContext> exprs = exprContext.expr();
      str = exprs.get(0).getText() + " " + ExprOperator.NOT_IN + " " + exprs.get(1).getText();
    }

    ExprGrammarParser.Binary_opContext bin_op = exprContext.binary_op();
    if (bin_op != null && ExprOperator.IMPLIES_1.equals(bin_op.getText())) {
      // The operator is implies
      List<ExprContext> exprs = exprContext.expr();
      str = exprs.get(0).getText() + " " + ExprOperator.IMPLIES_1 + " " + exprs.get(1).getText();
    }
    return str;
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof Expr))
      return false;
    return exprContext.getText().equals(((Expr)other).exprContext.getText());
  }

  @Override
  public int hashCode() {
    return exprContext.getText().hashCode();
  }

  @Override
  public Expr clone() {
    Expr e = ExprBuilder.toExpr(toString(), type());
    e.classOfElemsInSet = this.classOfElemsInSet;
    e.classOfValues = this.classOfValues;
    return e;
  }

}