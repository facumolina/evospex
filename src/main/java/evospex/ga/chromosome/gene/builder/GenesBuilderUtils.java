package evospex.ga.chromosome.gene.builder;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.ga.chromosome.gene.ExprGeneType;
import evospex.ga.chromosome.gene.ExprGeneValue;
import org.jgap.InvalidConfigurationException;

public class GenesBuilderUtils {

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
  public static ExprGeneValue createsGeneExprEqualToNull(Expr e) throws InvalidConfigurationException {
    Expr geneExpr = ExprBuilder.eq(e, ExprBuilder.NULL);
    ExprGeneValue geneValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
    return geneValue;
  }

}
