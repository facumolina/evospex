package geneticalgorithm.fitnessfunction;

import org.jgap.FitnessFunction;
import org.jgap.Gene;
import org.jgap.IChromosome;
import org.jgap.impl.IntegerGene;

import wrapper.DynAlloyRunner;

/**
 * Fitness function
 * @author fmolina
 */
public class DynAlloyPassingAssertionsCounter extends FitnessFunction {

	private final DynAlloyRunner runner;
	
	/**
	 * Constructor
	 * @param targetNumberOfAssertions is the amount of assertions 
	 */
	public DynAlloyPassingAssertionsCounter(DynAlloyRunner runner) {
		if (runner.getNumberOfAssertions() == 0) {
			throw new IllegalArgumentException();
		}
		this.runner = runner;
	}
	
	@Override
	protected double evaluate(IChromosome arg0) {
		Gene[] genes = arg0.getGenes();
		int[] runnerParam = new int[genes.length];
		boolean[] out;
		double res = 0;
		double percent = 0;
		double trueGenes_num=0;
		for (int i = 0; i< genes.length; i++) {
			runnerParam[i] = ((IntegerGene) genes[i]).intValue();	
			if ((runnerParam[i]==1)||runnerParam[i]==0) trueGenes_num++;
		}
		runner.setRepOKbody(runnerParam);

		//prioritise amount of false genes
		res = res + (genes.length-trueGenes_num)/100;
		res += Math.max(runner.checkAsserts2(),0);
		return res+percent;
		
	}

}
