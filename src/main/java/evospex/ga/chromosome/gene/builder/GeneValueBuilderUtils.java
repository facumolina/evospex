package evospex.ga.chromosome.gene.builder;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.symbol.ExprOperator;
import evospex.ga.chromosome.gene.ExprGeneType;
import evospex.ga.chromosome.gene.ExprGeneValue;

/**
 * This class represents a Gene Values Builder, which allows to build specific gene values.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class GeneValuesBuilder {

  /**
   * Given a closured expression e.*f and a quantification operator creates the gene value with the
   * expression:
   * - op n : e.*f : n != n.f
   */
  public static ExprGeneValue createsQtExpressionVarVarPredicate(Expr closuredExpression, String op) {
    Expr qtExpr = ExprBuilder.qtExprTwoVars(op, closuredExpression);
    ExprGeneType geneType = op.equals(ExprOperator.ALL) ? ExprGeneType.FORALL_VAR_VAR : ExprGeneType.SOME_VAR_VAR;
    return new ExprGeneValue(qtExpr, geneType);
  }

  /**
   * Given a closured expression e.*(f+g), a quantification operator and an int i creates a gene
   * value with expression:
   * - op n : e.*(f+g) : n != n.f if i = 1
   * - op n : e.*(f+g) : n != n.g if i = 2
   * - op n : e.*(f+g) : n.f != n.g if i = 3
   * - op n : e.*(f+g) : n = n.f.g if i = 4
   */
  public static ExprGeneValue createsQtExpressionVarVarPredicate(Expr closuredExpression, String op, int i) {
    Expr qtExpr = ExprBuilder.qtExprTwoVars(op, closuredExpression, i);
    ExprGeneType geneType = op.equals(ExprOperator.ALL) ? ExprGeneType.FORALL_VAR_VAR : ExprGeneType.SOME_VAR_VAR;
    return new ExprGeneValue(qtExpr, geneType);
  }

  /**
   * Given an evaluable closured expression e.*f and a quantification operator creates a gene
   * value with the following expression:
   * - op n : e.*f : n in n.^f
   */
  public static ExprGeneValue createsQtExpressionVarSetPredicate(Expr closuredExpression, String op) {
    Expr qtExpr = ExprBuilder.qtExprVarSet(op, closuredExpression, 1);
    ExprGeneType geneType = op.equals(ExprOperator.ALL) ? ExprGeneType.FORALL_VAR_SET : ExprGeneType.SOME_VAR_SET;
    return new ExprGeneValue(qtExpr, geneType);
  }

  /**
   * Given a single closured expression e.*f, an expression r and a quantification operator op
   * creates a gene value with the following expression:
   * - op n : e.*(f) | (n.f!=null) => n.r = n.f.r
   */
  public static ExprGeneValue singleQtTwoVarValuesComparison(Expr closured, Expr toJoinWithVarExpr, String op) {
    Expr qtExpr = ExprBuilder.qtExprTwoVarValuesComparison(closured, toJoinWithVarExpr, op, 1);
    ExprGeneType geneType = op.equals(ExprOperator.ALL) ? ExprGeneType.FORALL_VAR_VALUE_VAR_VALUE : ExprGeneType.SOME_VAR_VALUE_VAR_VALUE;
    return new ExprGeneValue(qtExpr, geneType);
  }

  /**
   * Given a double closured expression e.*(f+g), a quantification operator and an int i creates
   * a gene value with the following expressions:
   * - op n : e.*(f+g) : n in n.^f if i=1
   * - op n : e.*(f+g) : n in n.^g if i=2
   */
  public static ExprGeneValue createsQtExpressionVarSetPredicate(Expr closuredExpression, String op, int i) {
    Expr qtExpr = ExprBuilder.qtExprVarSet(op, closuredExpression, i);
    ExprGeneType geneType = op.equals(ExprOperator.ALL) ? ExprGeneType.FORALL_VAR_SET : ExprGeneType.SOME_VAR_SET;
    return new ExprGeneValue(qtExpr, geneType);
  }

  /**
   * Given a double closured expression e.*(f+g) and a quantification operator creates a gene value
   * with the following expression:
   * - op n : e.*(f+g) : n.f.*(f+g) != n.g.*(f+g)
   */
  public static ExprGeneValue createsQtExpressionSetSetPredicate(Expr closuredExpression, String op) {
    Expr qtExpr = ExprBuilder.qtExprSetSet(op, closuredExpression);
    ExprGeneType geneType = op.equals(ExprOperator.ALL) ? ExprGeneType.FORALL_VAR_SET : ExprGeneType.SOME_VAR_SET;
    return new ExprGeneValue(qtExpr, geneType);
  }

  /**
   * Given a closured expression e.*(f), an expression r and a quantification operator
   * creates a gene value with the expression
   * - op n : e.*(f) | n.r != null
   */
  public static ExprGeneValue qtSingleValueComparison(Expr closured, Expr toJoinWithVarExpr, String op) {
    Expr qtExpr = ExprBuilder.qtExprOneVarValueComparison(closured, toJoinWithVarExpr, ExprBuilder.NULL, op);
    ExprGeneType geneType = op.equals(ExprOperator.ALL) ? ExprGeneType.FORALL_VAR_VALUE : ExprGeneType.SOME_VAR_VALUE;
    return new ExprGeneValue(qtExpr, geneType);
  }

  /**
   * Given a double closured expression e.*(f+g), an expression r and a quantification operator op
   * creates a gene value with one of the following expression:
   * - op n : e.*(f+g) | (n.f!=null)=> n.r = n.f.r if code==1
   * - op n : e.*(f+g) | (n.g!=null)=> n.r = n.g.r if code==2
   */
  public static ExprGeneValue doubleQtTwoVarValuesComparison(Expr closured, Expr toJoinWithVarExpr, String op, int code) {
    Expr qtExpr = ExprBuilder.qtExprTwoVarValuesComparison(closured, toJoinWithVarExpr, op, code);
    ExprGeneType geneType = op.equals(ExprOperator.ALL) ? ExprGeneType.FORALL_VAR_VALUE_VAR_VALUE : ExprGeneType.SOME_VAR_VALUE_VAR_VALUE;
    return new ExprGeneValue(qtExpr, geneType);
  }

}
