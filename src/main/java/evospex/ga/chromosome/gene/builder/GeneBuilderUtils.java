package evospex.ga.chromosome.gene.builder;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.ga.chromosome.gene.ExprGeneType;
import evospex.ga.chromosome.gene.ExprGeneValue;

public class GeneBuilderUtils {

  /**
   * Given a closured expression e.*f and an expression i of type int creates a gene value with
   * the following expression:
   * - #(e.*f) = i
   */
  public static ExprGeneValue createsCardinalityExpression(Expr closuredExpression, Expr intExpr) {
    Expr qtExpr = ExprBuilder.cardinalityExpr(closuredExpression, intExpr);
    return new ExprGeneValue(qtExpr, ExprGeneType.CARDINALITY);
  }

  /**
   * Creates the gene with expression e = null
   */
  public static ExprGeneValue createsGeneExprEqualToNull(Expr e) {
    Expr geneExpr = ExprBuilder.eq(e, ExprBuilder.NULL);
    return new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
  }

  /**
   * Returns true if two joined expressions are over different fields
   */
  public static boolean differentFields(Expr expr1, Expr expr2) {
    String strExpr1 = expr1.toString();
    String strExpr2 = expr2.toString();
    int lastJoinIdx1 = strExpr1.lastIndexOf(".");
    int lastJoinIdx2 = strExpr2.lastIndexOf(".");
    if (lastJoinIdx1==-1 || lastJoinIdx2==-1)
      return true;
    return !strExpr1.substring(lastJoinIdx1).equals(strExpr2.substring(lastJoinIdx2));
  }

}
