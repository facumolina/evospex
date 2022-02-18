package evospex.ga.chromosome;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;

/**
 * This class represents a gene's value.
 * 
 * @author fmolina
 */
public class ExprGeneValue {

  private Expr expression;
  private ExprGeneType geneType;
  private ExprGeneValue previous;

  /**
   * Default Constructor
   */
  public ExprGeneValue() {
    expression = ExprBuilder.TRUE;
    geneType = ExprGeneType.CONSTANT;
    previous = null;
  }

  /**
   * Constructor from an expression
   * @param expr is the expression
   */
  public ExprGeneValue(Expr expr) {
    this.expression = expr;
    this.geneType = getGeneTypeFromExpression(expr);
    this.previous = null;
  }

  /**
   * Constructor from an expression and a gene type
   * @param expr is the expression
   * @param geneType is the gene type associated with the given expression
   */
  public ExprGeneValue(Expr expr, ExprGeneType geneType) {
    this.expression = expr;
    this.geneType = geneType;
    this.previous = null;
  }

  /**
   * Constructor from an expression, a gene type and a previous value
   * 
   * @param expr is the expression
   * @param geneType is the gene type associated with the given expression
   * @param previous is the previous gene value from which the current was evolved
   */
  public ExprGeneValue(Expr expr, ExprGeneType geneType, ExprGeneValue previous) {
    this.expression = expr;
    this.geneType = geneType;
    this.previous = previous;
  }

  /**
   * Get the expression
   */
  public Expr getExpression() {
    return expression;
  }

  /**
   * Set the expression
   */
  public void setExpression(Expr newExpression, boolean calculateGeneType) {
    expression = newExpression;
    if (calculateGeneType) {
      geneType = getGeneTypeFromExpression(expression);
    }
  }

  /**
   * Get the gene type
   */
  public ExprGeneType getGeneType() {
    return geneType;
  }

  /**
   * Set the gene type
   */
  public void setGeneType(ExprGeneType exprGeneType) {
    geneType = exprGeneType;
  }

  /**
   * Get the gene type for the given expr
   */
  private ExprGeneType getGeneTypeFromExpression(Expr expr) {
    throw new IllegalStateException(
        "ExprGeneType can't be computed for the given expression: " + expr
    );
  }

  /**
   * Determine the gene type of a quantified expression which operator is all and the body is the
   * given expression
   */
  private ExprGeneType determineGeneTypeOfAllExpressionFromTheBody(Expr body) {
    throw new UnsupportedOperationException("");
  }

  /**
   * Determine the gene type of a quantified expression which operator is some and the body is the
   * given expression
   */
  private ExprGeneType determineGeneTypeOfSomeExpressionFromTheBody(Expr body) {
    throw new UnsupportedOperationException("imeplement this");
  }

  /**
   * Get the previous value
   */
  public ExprGeneValue getPrevious() {
    return previous;
  }

  /**
   * Sets the previous expr gene
   * @param exprGeneValue is the previous value to set
   */
  public void setPrevious(ExprGeneValue exprGeneValue) {
    this.previous = exprGeneValue;
  }

  @Override
  public String toString() {
    return expression.toString();
  }

  @Override
  public ExprGeneValue clone() {
    if (previous == null) {
      return new ExprGeneValue(expression.clone(), geneType);
    } else {
      return new ExprGeneValue(expression.clone(), geneType, previous.clone());
    }
  }

  /**
   * Returns the complexity of this gene value
   * 
   * The complexity of a gene value is given by the type of expression it contains. The complexity
   * values are the following: EQUALITY = 1 FOR_ALL* = 3
   */
  public double getComplexity() {
    switch (geneType) {
    case EQUALITY:
      return 1;
    case NUMERIC_COMPARISON:
      // TODO re implement this as originally
      return 1;
    case EMPTYNESS:
      return 1;
    case NEGATION:
      return 1;
    case NO:
      return 1;
    case INCLUSION:
      return 2;
    case CARDINALITY:
      return 2;
    case FORALL:
      return 3;
    case FORALL_VAR_VALUE:
      return 3;
    case FORALL_VAR_VAR:
      return 3;
    case FORALL_VAR_SET:
      return 3;
    case FORALL_SET_SET:
      return 3;
    case FORALL_VAR_VALUE_VAR_VALUE:
      return 3.2;
    case FORALL_VAR_VALUES_DOUBLE_INT_COMPARISON:
      return 3.6;
    case FORALL_VAR_VALUES_DOUBLE_QT_INT_COMPARISON:
      return 3.8;
    case SOME:
      return 3;
    default:
      throw new IllegalStateException("Complexity can't be calculated:" + geneType);
    }
  }
}