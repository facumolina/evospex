package evospex.ga.chromosome.gene.builder;

import evospex.EvoSpexParameters;
import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.symbol.ExprName;
import evospex.ga.chromosome.gene.*;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import utils.JavaClassesUtils;
import utils.TargetInformation;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * FromMapsGeneBuilder class: allows to build genes using the result of the target method
 * as building blocks of the gene's expressions.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class FromResultObjectGeneBuilder extends GeneBuilder {

  /**
   * Constructor
   */
  public FromResultObjectGeneBuilder(Configuration conf, TargetInformation info, EvoSpexParameters params) {
    super(conf, info, params);
  }

  @Override
  public List<Gene> build() throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    Object resultExample = EvoSpexParameters.RESULT_EXAMPLE;
    if (resultExample == null)
      return genes;
    Expr resultExpr = ExprBuilder.getResult(resultExample.getClass());
    if (resultExample instanceof Boolean) {
      // The result is boolean, add it directly
      targetInfo.addVariableForType(Boolean.class, ExprName.RESULT);
      Expr geneExpr = ExprBuilder.eq(resultExpr, (Boolean) resultExample ? ExprBuilder.TRUE : ExprBuilder.FALSE);
      ExprGeneValue newValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
      genes.add(new ExprGeneImpl(conf, newValue, targetInfo));
    } else if (Number.class.isAssignableFrom(resultExample.getClass())) {
      // The result is a numeric type, thus compare it with expressions of the same type
      targetInfo.addVariableForType(resultExample.getClass(), ExprName.RESULT);
      List<Expr> exprsOfType = targetInfo.getEvaluableExpressionsOfType(resultExample.getClass());
      for (Expr expr : exprsOfType) {
        Expr geneExpr = ExprBuilder.eq(resultExpr, expr);
        ExprGeneValue newValue = new ExprGeneValue(geneExpr, ExprGeneType.NUMERIC_COMPARISON);
        genes.add(new ExprGeneImpl(conf, newValue, targetInfo));
      }
      if (targetInfo.hasSets()) {
        List<Expr> sets = targetInfo.getSets();
        for (Expr setExpr : sets) {
          ExprGeneValue newValue = GeneBuilderUtils.createsCardinalityExpression(setExpr, resultExpr);
          genes.add(new CardinalityGene(conf, newValue, targetInfo));
        }
      }
    } else if (resultExample instanceof String) {
      // Equal to null
      targetInfo.addVariableForType(resultExample.getClass(), ExprName.RESULT);
      ExprGeneValue newValue = GeneBuilderUtils.createsGeneExprEqualToNull(resultExpr);
      genes.add(new ExprGeneImpl(conf, newValue, targetInfo));
      // Equal to vars of same type
      /*for (Expr e : contextInfo.getEvaluableExpressions()) {
        if (e.type().toString().contains(resultExample.getClass().getSimpleName())
            && !e.type().toString().contains("Collection")) {
          Expr geneExpr = ExprBinary.Op.EQUALS.make(null, null, resultVar, e);
          ExprGeneValue geneValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
          genes.add(new ExprGene(conf, geneValue, contextInfo));
        }
      }*/
    } else {
      if (resultExample instanceof Collection) {
        collectionsEqualities((Collection) resultExample, resultExpr, genes);
      }
      // Equal to null
      targetInfo.addVariableForType(resultExample.getClass(), ExprName.RESULT);
      ExprGeneValue newValue = GeneBuilderUtils.createsGeneExprEqualToNull(resultExpr);
      genes.add(new ExprGeneImpl(conf, newValue, targetInfo));
      // Equal to vars of same type
      /*for (Expr e : contextInfo.getEvaluableExpressions()) {
        if (e.type().toString().contains("this/" + resultExample.getClass().getSimpleName())) {
          Expr geneExpr = ExprBinary.Op.EQUALS.make(null, null, resultVar, e);
          ExprGeneValue geneValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
          genes.add(new ExprGene(conf, geneValue, contextInfo));
        }
      }*/
    }

    return genes;
  }

  /**
   * Equality with other Collections of same type
   */
  private void collectionsEqualities(Collection c, Expr collection_expr, List<Gene> genes) throws InvalidConfigurationException {
    Class<?> collection_type = JavaClassesUtils.guessElementType(c);
    if (collection_type != null) {
      List<Expr> collections = targetInfo.getSetsOfType(collection_type);
      for (Expr collection : collections) {
        Expr geneExpr = ExprBuilder.eq(collection_expr, collection);
        ExprGeneValue geneValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
        genes.add(new ExprGeneImpl(conf, geneValue, targetInfo));
      }
    }
  }
}
