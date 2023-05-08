package evospex.ga.chromosome.gene.builder;

import evospex.EvoSpexParameters;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import evospex.utils.TargetInformation;

import java.util.List;

/**
 * This class represents a Gene Builder, which provides mechanism to create specific genes to be part
 * of the chromosomes.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public abstract class GeneBuilder {

  protected Configuration conf;
  protected final TargetInformation targetInfo;
  protected EvoSpexParameters parameters;

  /**
   * Constructor
   */
  public GeneBuilder(Configuration conf, TargetInformation info, EvoSpexParameters params) {
    this.conf = conf;
    targetInfo = info;
    parameters = params;
  }

  /**
   * Returns a list of genes to be part of the chromosomes
   */
  public abstract List<Gene> build() throws InvalidConfigurationException;

}
