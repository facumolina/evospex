package evospex.ga.chromosome;

import evospex.expression.ExprBuilder;
import evospex.expression.symbol.ExprName;
import evospex.ga.chromosome.gene.ExprGene;
import evospex.ga.chromosome.gene.ExprGeneType;
import evospex.ga.chromosome.gene.ExprGeneValue;
import evospex.ga.chromosome.gene.factory.GenesFactory;
import evospex.target.MethodExecution;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import org.jgap.RandomGenerator;
import evospex.EvoSpexParameters;
import utils.TargetInformation;

import java.util.*;

/**
 * This class represents a SpecChromosomes builder, which allows to create the chromosomes that
 * will be part of the initial population.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class SpecChromosomesBuilder {

  private final Configuration conf;
  private final int genes_num;
  private final TargetInformation targetInfo;
  private final EvoSpexParameters parameters;
  private final GenesFactory genesFactory;

  /**
   * Constructor
   */
  public SpecChromosomesBuilder(Configuration conf, int genes, TargetInformation info, EvoSpexParameters params) {
    this.conf = conf;
    genes_num = genes;
    targetInfo = info;
    parameters = params;
    genesFactory = new GenesFactory(conf, info, params);
  }

  /**
   * Build the initial population of chromosomes
   * The initial population is built by the following process:
   * 1. Randomly obtain positive and negative example from the provided test suite
   * 2. For each example, use the information extracted from the target class and method
   * to evaluate a set of expressions on each example, and then creating candidate specs
   * from the evaluations results.
   * @return the initial population
   */
  public List<SpecChromosome> buildInitialPopulation() {
    LinkedList<SpecChromosome> chromosomes = new LinkedList<>();
    int examplesConsidered = 0;
    Object resultExample = EvoSpexParameters.RESULT_EXAMPLE;
    List<Object> argsExample = EvoSpexParameters.ARGS_EXAMPLES;
    List<MethodExecution> allPositives = parameters.getPositiveObjects();
    List<MethodExecution> allNegatives = parameters.getNegativeObjects();

    Random r = new Random();
    boolean addComplex = true; // Add complex formulas (comparisons, quantification, result, args)
    while (examplesConsidered < parameters.getAmountOfExamplesForInitialChromosomesGeneration()) {
      // Get a random positive and negative objects
      MethodExecution pos = allPositives.get(r.nextInt(allPositives.size()));
      MethodExecution neg = allNegatives.get(r.nextInt(allNegatives.size()));

      try {
        chromosomes.addAll(generateChromosomesFromObject(pos.getObjectFinalState(), true,
                resultExample, argsExample, addComplex));
        chromosomes.addAll(generateChromosomesFromObject(neg.getObjectFinalState(), false,
                resultExample, argsExample, addComplex));
      } catch (Exception e) {
        e.printStackTrace();
      }

      addComplex = false; // Only once
      examplesConsidered += 2;

    }
    if (resultExample instanceof Integer || resultExample instanceof Double) {
      // TODO fix this
      targetInfo.addVariableForType(Integer.class, ExprName.RESULT);
    }

    return chromosomes;
  }

  /**
   * Generates a list of individuals from an instance of the target class
   * @param o is an instance of the target class
   * @param isPositive indicates if belongs to a positive or negative example
   * @param resultExample is an example of a method execution result
   * @param argsExamples is an example of a method execution arguments
   * @param addComplex indicates if complex expressions (quantification, etc) must be computed from the example
   * @return a list of individuals computed from the given arguments
   */
  public List<SpecChromosome> generateChromosomesFromObject(Object o, boolean isPositive,
                                                            Object resultExample, List<Object> argsExamples, boolean addComplex) throws InvalidConfigurationException {
    List<SpecChromosome> chromosomes = new LinkedList<>();
    List<Gene> genes = genesFactory.createGenesFromObject(o, isPositive, resultExample, argsExamples,
            addComplex);

    if (parameters.getInitialChromosomesUnary()) {
      // For each gene create one chromosome that contains just one gene at the first position:
      // [gene, true, true, ... , true]
      for (int i = 0; i < genes.size(); i++) {
        Gene[] new_genes = new Gene[genes_num];
        ExprGene exprGene = (ExprGene) genes.get(i);
        ExprGene newExprGene = new ExprGene(conf, exprGene.getValue().clone(), targetInfo);
        // Always the gene must be in the first position
        new_genes[0] = newExprGene;
        // The rest of the genes vales is : true
        for (int j = 1; j < new_genes.length; j++) {
          new_genes[j] = new ExprGene(conf, new ExprGeneValue(ExprBuilder.TRUE, ExprGeneType.CONSTANT), targetInfo);
        }
        SpecChromosome chromosome = new SpecChromosome(conf, new_genes);
        chromosome.setFitnessValueDirectly(-1);
        chromosomes.add(chromosome);
      }
    } else {
      // Create chromosomes with each gene randomly picked.
      genes.add(new ExprGene(conf, new ExprGeneValue(ExprBuilder.TRUE, ExprGeneType.CONSTANT), targetInfo));
      int chromosomesToCreate = parameters.getPopulationSize()
              / parameters.getAmountOfExamplesForInitialChromosomesGeneration();
      for (int i = 0; i < chromosomesToCreate; i++) {
        Gene[] new_genes = new Gene[genes_num];
        int genes_to_fill = conf.getRandomGenerator().nextInt(genes_num);
        Set<Integer> usedGenes = new HashSet<>();
        for (int j = 0; j < genes_to_fill; j++) {
          RandomGenerator generator = conf.getRandomGenerator();
          int r = generator.nextInt(genes.size());
          if (usedGenes.add(r))
            new_genes[j] = genes.get(r);
          else
            new_genes[j] = ((ExprGene) genes.get(r)).clone();
        }
        for (int j = genes_to_fill; j < genes_num; j++) {
          new_genes[j] = new ExprGene(conf, new ExprGeneValue(ExprBuilder.TRUE, ExprGeneType.CONSTANT), targetInfo);
        }
        SpecChromosome chromosome = new SpecChromosome(conf, new_genes);
        chromosome.setFitnessValueDirectly(-1);
        chromosomes.add(chromosome);
      }
    }
    return chromosomes;
  }

}
