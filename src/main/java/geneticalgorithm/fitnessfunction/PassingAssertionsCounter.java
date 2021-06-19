package geneticalgorithm.fitnessfunction;

import org.jgap.FitnessFunction;
import org.jgap.Gene;
import org.jgap.IChromosome;
import org.jgap.impl.BooleanGene;

/**
 * Fitness function
 * @author fmolina
 */
public class PassingAssertionsCounter extends FitnessFunction {

	private final int targetNumberOfAssertions;

	/**
	 * Constructor
	 * @param targetNumberOfAssertions is the amount of assertions 
	 */
	public PassingAssertionsCounter(int targetNumberOfAssertions) {
		if (targetNumberOfAssertions < 0) {
			throw new IllegalArgumentException();
		}
		this.targetNumberOfAssertions = targetNumberOfAssertions;
	}
	
	@Override
	protected double evaluate(IChromosome arg0) {
		Gene[] genes = arg0.getGenes();
		double res = 0;
		for (int i = 0; i< genes.length; i++) {
			BooleanGene value = (BooleanGene) genes[i];
			switch (i) {
			case 0: if (value.booleanValue()) res+=2;
			else res-=2;
			break;
			case 1: if (value.booleanValue()) res-=2;
			else res+=2;
			break;
			case 2: if (value.booleanValue()) res+=2;
			else res+=2;
			break;
			case 3: if (value.booleanValue()) res+=2;
			else res+=2;
			break;
			case 4: if (value.booleanValue()) res+=0;
			else res+=0;
			break;
			case 5: if (value.booleanValue()) res+=0;
			else res+=0;
			break;
			case 6: if (value.booleanValue()) res+=0;
			else res+=0;
			break;
			case 7: if (value.booleanValue()) res+=0;
			else res+=2;
			break;
			case 8: if (value.booleanValue()) res-=2;
			else res+=2;
			case 9: if (value.booleanValue()) res+=0;
			else res+=0;
			break;
			case 10: if (value.booleanValue()) res+=4;
			else res-=4;
			break;
			}
		}
		return (res>=0?res:0);
	}

}
