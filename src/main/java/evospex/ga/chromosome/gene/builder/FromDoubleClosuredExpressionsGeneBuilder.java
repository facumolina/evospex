package evospex.ga.chromosome.gene.builder;

import evospex.EvoSpexParameters;
import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.symbol.ExprName;
import evospex.expression.symbol.ExprOperator;
import evospex.ga.chromosome.gene.CardinalityGene;
import evospex.ga.chromosome.gene.ExprGeneImpl;
import evospex.ga.chromosome.gene.QuantificationDoubleValueGene;
import evospex.ga.chromosome.gene.QuantificationSingleValueGene;
import evospex.ga.chromosome.gene.value.ExprGeneValue;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import utils.TargetInformation;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * FromDoubleClosuredExpressionsGeneBuilder class: allows to build genes from double closured expressions.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class FromDoubleClosuredExpressionsGeneBuilder extends GeneBuilder {

  /**
   * Constructor
   */
  public FromDoubleClosuredExpressionsGeneBuilder(Configuration conf, TargetInformation info, EvoSpexParameters params) {
    super(conf, info, params);
  }

  @Override
  public List<Gene> build() throws InvalidConfigurationException {
    List<Expr> doubleClosuredExpressions = targetInfo.getDoubleClosuredExpressions();
    List<Gene> genes = new LinkedList<>();
    for (Expr evaluableExpr : doubleClosuredExpressions) {
      if (evaluableExpr.toString().contains(ExprName.THIS_PRE) && !parameters.learnPre())
        continue;

      // Create genes with expressions which body is a predicate about shapes
      genes.addAll(createsGenesFromDoubleClosuredExpressionsForShape(evaluableExpr));

      // Create genes with expressions which body is a predicate about values
      genes.addAll(createsGenesFromDoubleClosuredExpressionsForValues(evaluableExpr));

      // Create genes with cardinality expressions
      if (parameters.getConsiderCardinalityExpressions()) {
        List<Expr> joinedExpressionsOfIntType = targetInfo.getJoinedExpressionsOfTypeInt();
        // For each expression i of type int: #(e.*(f+g)) = i
        for (Expr intExpression : joinedExpressionsOfIntType) {
          ExprGeneValue geneValue = GeneBuilderUtils.createsCardinalityExpression(evaluableExpr, intExpression);
          genes.add(new CardinalityGene(conf, geneValue, targetInfo));
        }
      }
    }
    return genes;
  }

  /**
   * Creates genes from double closured expressions for shape
   * - all n: e.*(f+g) : n != null
   * - all n: e.*(f+g) : n.f != null
   * - all n: e.*(f+g) : n.g != null
   * - all n: e.*(f+g) : n != n.f
   * - all n:e.*(f+g) : n != n.g
   * - all n: e.*(f+g) : n.f != n.g
   * - all n: e.*(f+g) : n in n.^f
   * - all n: e.*(f+g) : n in n.^g
   * - all n: e.*(f+g) : n in n.^(f+g)
   * - all n: e.*(f+g) : n.f.*(f+g) in n.g.*(f+g)
   */
  private List<Gene> createsGenesFromDoubleClosuredExpressionsForShape(Expr doubleClosuredExpr)
          throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    ExprGeneValue geneValue;

    // (all + some) n: e.*(f+g) : n != n.f
    geneValue = GeneValueBuilderUtils.createsQtExpressionVarVarPredicate(doubleClosuredExpr, ExprOperator.ALL, 1);
    genes.add(new ExprGeneImpl(conf, geneValue, targetInfo));

    // (all + some) n: e.*(f+g) : n != n.g
    geneValue = GeneValueBuilderUtils.createsQtExpressionVarVarPredicate(doubleClosuredExpr, ExprOperator.ALL, 2);
    genes.add(new ExprGeneImpl(conf, geneValue, targetInfo));

    // (all + some) n : e.*(f+g) : n = n.f.g
    geneValue = GeneValueBuilderUtils.createsQtExpressionVarVarPredicate(doubleClosuredExpr, ExprOperator.ALL, 4);
    genes.add(new ExprGeneImpl(conf, geneValue, targetInfo));

    // (all + some) n: e.*(f+g) : n in n.^f
    geneValue = GeneValueBuilderUtils.createsQtExpressionVarSetPredicate(doubleClosuredExpr, ExprOperator.ALL, 1);
    genes.add(new ExprGeneImpl(conf, geneValue, targetInfo));
    // (all + some) n: e.*(f+g) : n in n.^g
    geneValue = GeneValueBuilderUtils.createsQtExpressionVarSetPredicate(doubleClosuredExpr, ExprOperator.ALL, 2);
    genes.add(new ExprGeneImpl(conf, geneValue, targetInfo));

    // (all + some) n: e.*(f+g) : n in n.^(f+g)
    geneValue = GeneValueBuilderUtils.createsQtExpressionVarSetPredicate(doubleClosuredExpr, ExprOperator.ALL);
    genes.add(new ExprGeneImpl(conf, geneValue, targetInfo));

    // all n: e.*(f+g) : n.f.*(f+g) != n.g.*(f+g)
    geneValue = GeneValueBuilderUtils.createsQtExpressionSetSetPredicate(doubleClosuredExpr, ExprOperator.ALL);
    genes.add(new ExprGeneImpl(conf, geneValue, targetInfo));

    return genes;
  }

  /**
   * Creates genes from double closured expressions for values If the type of the variable n is T,
   * then for each var r : T -> AnotherType creates the following quantified expressions:
   *
   * - all n: e.*(f+g) : n.r != null
   * - all n: e.*(f+g) : n.r != n.f.r
   * - all n: e.*(f+g) : n.r != n.g.r
   * - all n: e.*(f+g) : n.f.r != n.g.r
   * - all n: e.*(f+g) : (n.r = v) => (n.f.r = v)
   * - all n: e.*(f+g) : (n.r = v) => (n.g.r = v)
   * - all n: e.*(f+g) : n.r in n.^f.r
   * - all n: e.*(f+g) : n.r in n.^g.r
   * - all n: e.*(f+g) : n.r in n.^(f+g).r
   * - all n: e.*(f+g) : n.f.*(f+g).r in n.g.*(f+g).r
   */
  private List<Gene> createsGenesFromDoubleClosuredExpressionsForValues(Expr doubleClosuredExpr)
          throws InvalidConfigurationException {
    Set<Expr> joineableExpressions = targetInfo.getJoineableExpressionsOfCurrentType(doubleClosuredExpr.classOfElemsInSet());
    List<Gene> genes = new LinkedList<>();
    ExprGeneValue geneValue;
    Class<?> typeElemsInSet = doubleClosuredExpr.classOfElemsInSet();

    // For each joineable expr generate the quantified expressions
    for (Expr joineableExpr : joineableExpressions) {
      if (typeElemsInSet.equals(joineableExpr.type()))
        continue;
      if (Number.class.isAssignableFrom(joineableExpr.type())) {
        // Values are numeric
        // all n: e.*(f+g) : (n.f != null) => n.r op n.f.r
        geneValue = GeneValueBuilderUtils.doubleQtTwoVarValuesComparison(doubleClosuredExpr, joineableExpr, ExprOperator.ALL, 1);
        genes.add(new QuantificationDoubleValueGene(conf, geneValue, targetInfo));
        // all n: e.*(f+g) : (n.g != Null) => n.r op n.g.r
        geneValue = GeneValueBuilderUtils.doubleQtTwoVarValuesComparison(doubleClosuredExpr, joineableExpr, ExprOperator.ALL, 2);
        genes.add(new QuantificationDoubleValueGene(conf, geneValue, targetInfo));
      } else if (Boolean.class.isAssignableFrom(joineableExpr.type())) {
        // Values are booleans
        throw new UnsupportedOperationException("Handle boolean value properly");
      } else {
        // Values are objects
        // all n: e.*(f+g) : (n.r != null)
        geneValue = GeneValueBuilderUtils.qtSingleValueComparison(doubleClosuredExpr, joineableExpr, ExprBuilder.NULL, ExprOperator.ALL);
        genes.add(new QuantificationSingleValueGene(conf, geneValue, targetInfo));
      }
      // TODO think about formulas such as all n: e.*(f+g) : (n.r = v) => (n.f.r = v)
    }
    return genes;
  }

}
