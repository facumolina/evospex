package evospex.ga.chromosome.gene.builder;

import evospex.EvoSpexParameters;
import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.evaluator.ExpressionEvaluator;
import evospex.expression.evaluator.NonEvaluableExpressionException;
import evospex.expression.symbol.ExprName;
import evospex.expression.symbol.ExprOperator;
import evospex.ga.chromosome.gene.*;
import evospex.ga.chromosome.gene.type.ExprGeneType;
import evospex.ga.chromosome.gene.value.ExprGeneValue;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import evospex.utils.JavaClassesUtils;
import evospex.utils.TargetInformation;

import java.util.LinkedList;
import java.util.List;

/**
 * FromJoinedExpressionsGeneBuilder class: allows to build genes from joined expressions.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class FromJoinedExpressionsGeneBuilder extends GeneBuilder {

  private Object o;
  private boolean isPositive;

  /**
   * Constructor
   */
  public FromJoinedExpressionsGeneBuilder(Configuration conf, TargetInformation info, EvoSpexParameters params) {
    super(conf, info, params);
  }

  /**
   * Set the object from which the genes will be built
   */
  public void setObject(Object o, boolean isPositive) { this.o = o; this.isPositive = isPositive;}

  @Override
  public List<Gene> build() throws InvalidConfigurationException {
    // Get the evaluable expressions for the current example
    List<Expr> evaluableJoinedExpressions = targetInfo.getJoinedExpressions();
    List<Gene> genes = new LinkedList<>();
    for (Expr expr : evaluableJoinedExpressions) {
      try {
        String name = expr.toString().startsWith(ExprName.THIS_PRE)? ExprName.THIS_PRE : ExprName.THIS;
        Object result = ExpressionEvaluator.evalAnyExpr(expr.exprCtx(), name, o);
        genes.add(buildExprGeneFromEval(expr, result, isPositive));
      } catch (NonEvaluableExpressionException e) {
        // The evaluation result is empty
      }
    }
    return genes;
  }

  /**
   * Given an evaluated expression and the evaluation result, build a new expr gene which expression
   * is expr = result if the evaluation comes from a positive example or expr != result if the evaluation
   * comes from a negative example
   *
   * @param expr is the evaluated expression
   * @param result is the result of evaluating expr
   * @param isPositive indicates if the evaluation comes from a positive example or not
   * @return a new gene
   */
  private Gene buildExprGeneFromEval(Expr expr, Object result, boolean isPositive) throws InvalidConfigurationException {
    String opStr = isPositive ? ExprOperator.EQ : ExprOperator.NOT_EQ;
    if (result != null && JavaClassesUtils.isNumber(expr.type())) {
      targetInfo.updateEvaluationValueInfo(result,expr);
      Expr newExpr = ExprBuilder.applyOp(expr, opStr, ExprBuilder.toExpr(result.toString(), result.getClass()), Boolean.class);
      ExprGeneValue newValue = new ExprGeneValue(newExpr, ExprGeneType.EQUALITY);
      return new EqualityGene(conf, newValue, targetInfo);
    } else {
      // The result is not a number, then compare with null
      targetInfo.updateEvaluationValueInfo(ExprBuilder.NULL, expr);
      Expr newExpr = ExprBuilder.applyOp(expr, opStr, ExprBuilder.NULL, Boolean.class);
      ExprGeneValue newValue = new ExprGeneValue(newExpr, ExprGeneType.EQUALITY);
      return new EqualityGene(conf, newValue, targetInfo);
    }
  }
}
