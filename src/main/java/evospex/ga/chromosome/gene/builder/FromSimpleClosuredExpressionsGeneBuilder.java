package evospex.ga.chromosome.gene.builder;

import evospex.EvoSpexParameters;
import evospex.expression.Expr;
import evospex.expression.symbol.ExprName;
import evospex.expression.symbol.ExprOperator;
import evospex.ga.chromosome.gene.ExprGene;
import evospex.ga.chromosome.gene.ExprGeneValue;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import utils.TargetInformation;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FromSimpleClosuredExpressionsGeneBuilder extends GeneBuilder {

  /**
   * Constructor
   */
  public FromSimpleClosuredExpressionsGeneBuilder(Configuration conf, TargetInformation info, EvoSpexParameters params) {
    super(conf, info, params);
  }

  @Override
  public List<Gene> build() throws InvalidConfigurationException {
    List<Expr> simpleClosuredExpressions = targetInfo.getSimpleClosuredExpressions();
    List<Gene> genes = new LinkedList<>();
    for (int j = 0; j < simpleClosuredExpressions.size(); j++) {
      Expr evaluableExpr = simpleClosuredExpressions.get(j);
      if (evaluableExpr.toString().contains(ExprName.THIS_PRE) && !parameters.learnPre())
        continue;

      // Create genes with expressions which body is a predicate about shapes
      genes.addAll(createsGenesFromSimpleClosuredExpressionsForShape(evaluableExpr));

      // Create genes with expressions which body is a predicate about values
      genes.addAll(createsGenesFromSimpleClosuredExpressionsForValues(evaluableExpr));

    }
    System.out.println("Genes: "+genes);
    return genes;
  }

  /**
   * Creates genes from simple closured expressions. Given a simple closured expression e.*f creates
   * genes with the following expressions:
   * - all n : e.*f : n != null
   * - all n : e.*f : n.f != null
   * - all n : e.*f : n != n.f
   * - all n : e.*f : n in n.^f
   */
  private List<Gene> createsGenesFromSimpleClosuredExpressionsForShape(Expr simpleClosuredExpr) throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    ExprGeneValue geneValue;

    // (all + some) n : e.*f : n != null
    // geneValue = ChromosomeGenesFactory.createsQtExpressionVarPredicate(correctedEvaluableExpr,"all");

    // (all + some) n : e.*f : n.f != null
    // geneValue = ChromosomeGenesFactory.createsQtExpressionNextVarPredicate(correctedEvaluableExpr,"all");

    // (all + some) n : e.*f : n != n.f
    geneValue = GeneValuesBuilder.createsQtExpressionVarVarPredicate(simpleClosuredExpr, ExprOperator.ALL);
    genes.add(new ExprGene(conf, geneValue, targetInfo));

    // (all + some) n : e.*f : n in n.^f
    geneValue = GeneValuesBuilder.createsQtExpressionVarSetPredicate(simpleClosuredExpr, ExprOperator.ALL);
    genes.add(new ExprGene(conf, geneValue, targetInfo));

    return genes;
  }

  /**
   * Creates genes from simple closured expressions for values. If the type of the variable n is T,
   * then for each var r : T -> AnotherType creates the following quantified expressions:
   *
   * - all n: e.*f : n.r != null
   * - all n: e.*f : n.f!=null => n.r op n.f.r
   * - all n: e.*f : (n.r = v) => (n.f.r = v)
   * - all n: e.*f : n.r in n.^f.r
   */
  private List<Gene> createsGenesFromSimpleClosuredExpressionsForValues(Expr simpleClosuredExpr) throws InvalidConfigurationException {

    Set<Expr> joineableExpressions = targetInfo.getJoineableExpressionsOfCurrentType(simpleClosuredExpr.classOfElemsInSet());
    List<Gene> genes = new LinkedList<>();
    ExprGeneValue geneValue;
    Class<?> typeElemsInSet = simpleClosuredExpr.classOfElemsInSet();

    // For each joineable expr generate the quantified expressions
    for (Expr joineableExpr : joineableExpressions) {
      if (typeElemsInSet.equals(joineableExpr.type()))
        continue;
      if (Number.class.isAssignableFrom(joineableExpr.type())) {
        // Values are numeric
        // all n: e.*f : (n.f != null) => n.r op n.f.r
        geneValue = GeneValuesBuilder.singleQtTwoVarValuesComparison(simpleClosuredExpr, joineableExpr, ExprOperator.ALL);
        genes.add(new ExprGene(conf, geneValue, targetInfo));
      } else if (Boolean.class.isAssignableFrom(joineableExpr.type())) {
        // Values are booleans
        throw new UnsupportedOperationException("Handle boolean value properly");
      } else {
        // Values are objects
        // all n: e.*(f+g) : (n.r != null)
        geneValue = GeneValuesBuilder.qtSingleValueComparison(simpleClosuredExpr, joineableExpr, ExprOperator.ALL);
        genes.add(new ExprGene(conf, geneValue, targetInfo));
      }
      // TODO think about formulas such as all n: e.*(f+g) : (n.r = v) => (n.f.r = v)
    }
    return genes;

  }

}
