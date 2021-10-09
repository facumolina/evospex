package evospex.ga.chromosome;

import evospex.expression.ExprBuilder;
import evospex.expression.ExprGrammarParser.ExprContext;
import rfm.dynalloyCompiler.ast.Decl;
import rfm.dynalloyCompiler.ast.Expr;
import rfm.dynalloyCompiler.ast.ExprBinary;
import rfm.dynalloyCompiler.ast.ExprCall;
import rfm.dynalloyCompiler.ast.ExprConstant;
import rfm.dynalloyCompiler.ast.ExprList;
import rfm.dynalloyCompiler.ast.ExprQt;
import rfm.dynalloyCompiler.ast.ExprUnary;
import rfm.dynalloyCompiler.ast.ExprVar;
import rfm.dynalloyCompiler.ast.Sig;
import utils.DynAlloyExpressionsUtils;

/**
 * This class represents a gene's value.
 * 
 * @author fmolina
 */
public class ExprGeneValue {

  private ExprContext expression;
  private ExprGeneType geneType;
  private ExprGeneValue previous;

  /**
   * Default Constructor
   */
  public ExprGeneValue() {
    expression = ExprBuilder.toExprContext("true");
    geneType = ExprGeneType.CONSTANT;
    previous = null;
  }

  /**
   * Constructor from an expression
   * @param expr is the expression
   */
  public ExprGeneValue(ExprContext expr) {
    this.expression = expr;
    this.geneType = getGeneTypeFromExpression(expr);
    this.previous = null;
  }

  /**
   * Constructor from an expression and a gene type
   * @param expr is the expression
   * @param geneType is the gene type associated with the given expression
   */
  public ExprGeneValue(ExprContext expr, ExprGeneType geneType) {
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
  public ExprGeneValue(ExprContext expr, ExprGeneType geneType, ExprGeneValue previous) {
    this.expression = expr;
    this.geneType = geneType;
    this.previous = previous;
  }

  /**
   * Get the expression
   */
  public ExprContext getExpression() {
    return expression;
  }

  /**
   * Set the expression
   */
  public void setExpression(ExprContext newExpression, boolean calculateGeneType) {
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
  private ExprGeneType getGeneTypeFromExpression(ExprContext expr) {
    throw new IllegalStateException(
        "ExprGeneType can't be computed for the given expression: " + expr.getText()
    );
  }

  /**
   * Determine the gene type of a quantified expression which operator is all and the body is the
   * given expression
   */
  private ExprGeneType determineGeneTypeOfAllExpressionFromTheBody(Expr body) {
    if (body instanceof ExprUnary) {
      ExprUnary unaryBody = (ExprUnary) body;
      if (unaryBody.sub instanceof ExprUnary) {
        return ExprGeneType.FORALL;
      } else {
        return determineGeneTypeOfAllExpressionFromTheBody(unaryBody.sub);
      }
    } else if (body instanceof ExprBinary) {
      ExprBinary binaryBody = (ExprBinary) body;
      boolean leftClosured = DynAlloyExpressionsUtils.hasClosuredExpr(binaryBody.left);
      boolean rightClosured = DynAlloyExpressionsUtils.hasClosuredExpr(binaryBody.right);
      if (leftClosured) {
        if (rightClosured) {
          return ExprGeneType.FORALL_SET_SET;
        } else {
          if (binaryBody.right instanceof Sig && ((Sig) binaryBody.right).label.contains("Null")) {
            return determineGeneTypeOfAllExpressionFromTheBody(binaryBody.left);
          } else {
            return ExprGeneType.FORALL_VAR_SET;
          }
        }
      } else {
        if (rightClosured) {
          return ExprGeneType.FORALL_VAR_SET;
        } else {
          if (binaryBody.left instanceof ExprCall) {
            return ExprGeneType.FORALL_VAR_VALUE_VAR_VALUE;
          } else {
            if (binaryBody.left instanceof ExprBinary) {
              if (((ExprBinary) binaryBody).right.toString().contains("Null")) {
                return ExprGeneType.FORALL_VAR_VALUE;
              }
              if (((ExprBinary) binaryBody.left).right instanceof ExprUnary) {
                return ExprGeneType.FORALL_VAR_VALUE_VAR_VALUE;
              }
              if (binaryBody.right instanceof ExprCall) {
                ExprCall call = (ExprCall) binaryBody.right;
                if (call.fun.label.contains("integer")) {
                  return ExprGeneType.FORALL_VAR_VALUE_VAR_VALUE_INT_COMPARISON;
                }
              }
            }
            return ExprGeneType.FORALL_VAR_VAR;
          }
        }
      }
    } else if (body instanceof ExprCall) {
      ExprCall exprCall = (ExprCall) body;
      return ExprGeneType.FORALL_VAR_VALUE_VAR_VALUE;
    } else if (body instanceof ExprList) {
      ExprList exprList = (ExprList) body;
      if (exprList.args.get(0) instanceof ExprQt)
        return ExprGeneType.FORALL_VAR_VALUES_DOUBLE_QT_INT_COMPARISON;
      return ExprGeneType.FORALL_VAR_VALUES_DOUBLE_INT_COMPARISON;
    }
    System.out.println("Error calculating gene type of expression: " + this.expression.toString());
    return null;
  }

  /**
   * Determine the gene type of a quantified expression which operator is some and the body is the
   * given expression
   */
  private ExprGeneType determineGeneTypeOfSomeExpressionFromTheBody(Expr body) {
    if (body instanceof ExprUnary) {
      ExprUnary unaryBody = (ExprUnary) body;
      if (unaryBody.sub instanceof ExprUnary) {
        return ExprGeneType.SOMEQT;
      } else {
        return determineGeneTypeOfAllExpressionFromTheBody(unaryBody.sub);
      }
    } else if (body instanceof ExprBinary) {
      ExprBinary binaryBody = (ExprBinary) body;
      boolean leftClosured = DynAlloyExpressionsUtils.hasClosuredExpr(binaryBody.left);
      boolean rightClosured = DynAlloyExpressionsUtils.hasClosuredExpr(binaryBody.right);
      if (leftClosured) {
        if (rightClosured) {
          return ExprGeneType.SOME_SET_SET;
        } else {
          if (binaryBody.right instanceof Sig && ((Sig) binaryBody.right).label.contains("Null")) {
            return determineGeneTypeOfSomeExpressionFromTheBody(binaryBody.left);
          } else {
            return ExprGeneType.SOME_VAR_SET;
          }
        }
      } else {
        if (rightClosured) {
          return ExprGeneType.SOME_VAR_SET;
        } else {
          return ExprGeneType.SOME_VAR_VAR;
        }
      }
    } else {
      return null;
    }
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
    return "don't know how to print this new genes";
  }

  @Override
  public ExprGeneValue clone() {
    if (previous == null) {
      return new ExprGeneValue(cloneExpression(expression), getGeneTypeFromExpression(expression));
    } else {
      return new ExprGeneValue(cloneExpression(expression), getGeneTypeFromExpression(expression),
          previous.clone());
    }

  }

  /**
   * Clone the given expression
   * @param expr is the expression to clone
   * @return
   */
  private ExprContext cloneExpression(ExprContext expr) {
    return ExprBuilder.toExprContext(expr.getText());
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
    case INT_COMPARISON:
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
    case FORALL_VAR_VALUE_VAR_VALUE_INT_COMPARISON:
      return 3.4;
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