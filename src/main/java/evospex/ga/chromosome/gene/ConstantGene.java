package evospex.ga.chromosome.gene;

import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import utils.TargetInformation;

import java.util.Random;

/**
 * This class represents a constant gene. A constant gene is a gene which value is a constant expression, such as true.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ConstantGene extends ExprGene {

  public ConstantGene(Configuration a_conf, TargetInformation info) throws InvalidConfigurationException {
    super(a_conf, new ExprGeneValue(), info);
  }

  @Override
  protected Gene newGeneInternal() {
    try {
      return new ConstantGene(getConfiguration(), targetInfo);
    } catch (InvalidConfigurationException ex) {
      throw new IllegalStateException(ex.getMessage());
    }
  }

  @Override
  public void applyMutation(int i, double v) {
    String mutationToApply = getSomeApplicableMutation();
    if (mutationToApply.equals("Previous")) {
      // Get some previous expression
      Random random = new Random();
      int randomNumber = random.nextInt(1);
      value = value.getPrevious();
    }
  }
}
