package evospex.ga.chromosome.gene.builder;

import evospex.EvoSpexParameters;
import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.symbol.ExprName;
import evospex.ga.chromosome.gene.ExprGene;
import evospex.ga.chromosome.gene.ExprGeneType;
import evospex.ga.chromosome.gene.ExprGeneValue;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import utils.JavaClassesUtils;
import utils.TargetInformation;

import java.util.LinkedList;
import java.util.List;

/**
 * FromJoinedExpressionsComparisonsGeneBuilder class: allows to build genes by comparing joined expressions.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class FromJoinedExpressionsComparisonsGeneBuilder extends GeneBuilder {

  /**
   * Constructor
   */
  public FromJoinedExpressionsComparisonsGeneBuilder(Configuration conf, TargetInformation info, EvoSpexParameters params) {
    super(conf, info, params);
  }

  @Override
  public List<Gene> build() throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    // Get the evaluable expressions for the current target
    List<Expr> evaluableJoinedExpressions = targetInfo.getJoinedExpressions();
    // Create the genes comparing joined expressions of the this object
    genes.addAll(createsGenesComparingEvaluableExpressions());
    // Create the genes comparing joined expressions of the this object with the this_pre object (if possible)
    genes.addAll(createGenesComparingJoinedExpressionsDifferentObjects(evaluableJoinedExpressions));
    return genes;
  }

  /**
   * Creates genes according to the equality or inequality between the values of each pair of
   * expressions only if the intersection between the types of the expressions being compared is not
   * empty. Given the expressions e and f, creates genes with the following expressions:
   *
   * - e = f
   *
   * - e!= f
   */
  private List<Gene> createsGenesComparingEvaluableExpressions()
          throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    Object[] values = targetInfo.getExpressionsByEvaluationValue().keySet().toArray();
    for (int j = 0; j < values.length; j++) {
      List<Expr> expressionsThatEvaluateToValue = targetInfo.getExpressionsByEvaluationValue().get(values[j]);
      // Add a equality gene for each pair of expressions that evaluate to the same value
      for (int k = 0; k < expressionsThatEvaluateToValue.size() - 1; k++) {
        Expr leftExpression = expressionsThatEvaluateToValue.get(k);
        for (int l = k + 1; l < expressionsThatEvaluateToValue.size(); l++) {
          Expr rightExpression = expressionsThatEvaluateToValue.get(l);
          if (!leftExpression.type().isAssignableFrom(rightExpression.type())
                  || leftExpression.toString().equals(rightExpression.toString()))
            continue;
          if (GeneBuilderUtils.differentFields(leftExpression, rightExpression))
            continue;
          ExprGeneType geneType = JavaClassesUtils.isNumber(leftExpression.type())?ExprGeneType.NUMERIC_COMPARISON:ExprGeneType.EQUALITY;
          Expr geneExpr = ExprBuilder.eq(leftExpression, rightExpression);
          ExprGeneValue newValue = new ExprGeneValue(geneExpr, geneType);
          genes.add(new ExprGene(conf, newValue, targetInfo));
        }
      }

      // Add an equality gene for each of pair in which the left side expression evaluates to the
      // current value and the right side expression evaluates to some other value
      for (Expr leftExpression : expressionsThatEvaluateToValue) {
        for (int k = j + 1; k < values.length; k++) {
          List<Expr> rightExpressions = targetInfo.getExpressionsByEvaluationValue().get(values[k]);
          for (Expr rightExpression : rightExpressions) {
            if (!leftExpression.type().isAssignableFrom(rightExpression.type())
                    && !leftExpression.toString().equals(rightExpression.toString()))
              continue;
            if (GeneBuilderUtils.differentFields(leftExpression, rightExpression))
              continue;
            ExprGeneType geneType = JavaClassesUtils.isNumber(leftExpression.type())?ExprGeneType.NUMERIC_COMPARISON:ExprGeneType.EQUALITY;
            Expr geneExpr = ExprBuilder.neq(leftExpression, rightExpression);
            ExprGeneValue newValue = new ExprGeneValue(geneExpr, geneType);
            genes.add(new ExprGene(conf, newValue, targetInfo));
          }
        }
      }
    }
    return genes;
  }

  /**
   * Creates genes comparing evaluable expressions over this and this_pre
   */
  public List<Gene> createGenesComparingJoinedExpressionsDifferentObjects(List<Expr> evaluableJoinedExpressions) throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    for (int j = 0; j < evaluableJoinedExpressions.size() - 1; j++) {
      Expr leftExpr = evaluableJoinedExpressions.get(j);
      for (int k = j + 1; k < evaluableJoinedExpressions.size(); k++) {
        Expr rightExpr = evaluableJoinedExpressions.get(k);
        if (rightExpr.toString().contains(ExprName.THIS_PRE))
          continue;
        if (leftExpr.type().equals(rightExpr.type())) {
          if (JavaClassesUtils.isNumber(leftExpr.type())) {
            // We are comparing numeric expressions
            Expr geneExpression = ExprBuilder.eq(leftExpr, rightExpr);
            ExprGeneValue newValue = new ExprGeneValue(geneExpression, ExprGeneType.NUMERIC_COMPARISON);
            genes.add(new ExprGene(conf, newValue, targetInfo));
          } else {
            Expr geneExpression = ExprBuilder.eq(leftExpr, rightExpr);
            ExprGeneValue newValue = new ExprGeneValue(geneExpression, ExprGeneType.EQUALITY);
            genes.add(new ExprGene(conf, newValue, targetInfo));
          }
        }
      }
    }
    return genes;
  }



}
