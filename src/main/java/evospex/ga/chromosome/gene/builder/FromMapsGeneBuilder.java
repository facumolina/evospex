package evospex.ga.chromosome.gene.builder;

import evospex.EvoSpexParameters;
import evospex.expression.Expr;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import utils.TargetInformation;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FromMapsGeneBuilder extends GeneBuilder {

  /**
   * Constructor
   */
  public FromMapsGeneBuilder(Configuration conf, TargetInformation info, EvoSpexParameters params) {
    super(conf, info, params);
  }

  @Override
  public List<Gene> build() throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    List<Expr> evaluable = targetInfo.getEvaluableExpressions();
    for (Expr expr : evaluable) {
      if (Map.class.isAssignableFrom(expr.type())) {
        // The expression denotes a Map
        // TODO consider if the key type is integer, create random expressions of the form expr[int] for integer
        // TODO consider if the map values are integer
        // TODO consider if the map values are booleans
        // TODO consider if the map values are objects
        throw new UnsupportedOperationException("Implement genes creation using Maps!");
      }
    }
    return genes;
  }

}
