package evospex.ga.chromosome.gene.builder;

import evospex.EvoSpexParameters;
import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.symbol.ExprName;
import evospex.expression.symbol.ExprOperator;
import evospex.ga.chromosome.gene.ExprGeneImpl;
import evospex.ga.chromosome.gene.value.ExprGeneValue;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import utils.TargetInformation;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * FromSimpleClosuredExpressionsGeneBuilder class: allows to build genes from double closured expressions.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
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
    for (Expr evaluableExpr : simpleClosuredExpressions) {
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
    geneValue = GeneValueBuilderUtils.createsQtExpressionVarVarPredicate(simpleClosuredExpr, ExprOperator.ALL);
    genes.add(new ExprGeneImpl(conf, geneValue, targetInfo));

    // (all + some) n : e.*f : n in n.^f
    geneValue = GeneValueBuilderUtils.createsQtExpressionVarSetPredicate(simpleClosuredExpr, ExprOperator.ALL);
    genes.add(new ExprGeneImpl(conf, geneValue, targetInfo));

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
    Class<?> typeElemsInSet = simpleClosuredExpr.classOfElemsInSet();

    // For each joineable expr generate the quantified expressions
    for (Expr joineableExpr : joineableExpressions) {
      if (typeElemsInSet.equals(joineableExpr.type()))
        continue;
      genes.addAll(createsGenesFromSimpleClosuredExpressionOneValue(simpleClosuredExpr, joineableExpr));
      genes.addAll(createsGenesFromSimpleClosuredExpressionTwoValues(simpleClosuredExpr, joineableExpr));
    }
    return genes;

  }

  /**
   * Creates genes from a simple closured expressions and a joineable type for a single value. Given the expressions
   * e.*f with elements of type T and the expression r : T -> AnotherType, creates the following quantified expressions:
   * - all n: e.*f : n.r if r is boolean
   * - all n: e.*f : n.r op 0 if r is a numeric type
   * - all n: e.*f : n.r op null if r is a reference type
   */
  private List<Gene> createsGenesFromSimpleClosuredExpressionOneValue(Expr simpleClosuredExpr, Expr joineableExpr) throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    ExprGeneValue geneValue;
    if (Number.class.isAssignableFrom(joineableExpr.type())) {
      // all n: e.*f : n.r op 0
      geneValue = GeneValueBuilderUtils.qtSingleValueComparison(simpleClosuredExpr, joineableExpr, ExprBuilder.ZERO, ExprOperator.ALL);
      genes.add(new ExprGeneImpl(conf, geneValue, targetInfo));
    } else if (Boolean.class.isAssignableFrom(joineableExpr.type())) {
      // Values are booleans
      throw new UnsupportedOperationException("Handle boolean value properly");
    } else {
      // Values are objects
      // all n: e.*f : n.r op null
      geneValue = GeneValueBuilderUtils.qtSingleValueComparison(simpleClosuredExpr, joineableExpr, ExprBuilder.NULL, ExprOperator.ALL);
      genes.add(new ExprGeneImpl(conf, geneValue, targetInfo));
    }
    return genes;
  }


  /**
   * Creates genes from a simple closured expressions and a joineable type for a single value. Given the expressions
   * e.*f with elements of type T and the expression r : T -> AnotherType, creates the following quantified expressions:
   * - all n: e.*f : n.f!=null => n.r op n.f.r
   * - all n: e.*f : (n.r = v) => (n.f.r = v)
   */
  private List<Gene> createsGenesFromSimpleClosuredExpressionTwoValues(Expr simpleClosuredExpr, Expr joineableExpr) throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    ExprGeneValue geneValue;
    if (Number.class.isAssignableFrom(joineableExpr.type())) {
      // all n: e.*f : (n.f != null) => n.r op n.f.r
      geneValue = GeneValueBuilderUtils.singleQtTwoVarValuesComparison(simpleClosuredExpr, joineableExpr, ExprOperator.ALL);
      genes.add(new ExprGeneImpl(conf, geneValue, targetInfo));
    } else if (Boolean.class.isAssignableFrom(joineableExpr.type())) {
      // Values are booleans
      throw new UnsupportedOperationException("Handle boolean value properly");
    } else {
      // Values are objects
      throw new UnsupportedOperationException("Handle object value properly");
    }
    // TODO think about formulas such as all n: e.*(f+g) : (n.r = v) => (n.f.r = v)
    return genes;
  }
}
