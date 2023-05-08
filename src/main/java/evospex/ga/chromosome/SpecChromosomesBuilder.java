package evospex.ga.chromosome;

import evospex.expression.symbol.ExprName;
import evospex.ga.chromosome.gene.*;
import evospex.ga.chromosome.gene.builder.*;
import evospex.target.MethodExecution;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import org.jgap.RandomGenerator;
import evospex.EvoSpexParameters;
import evospex.utils.TargetInformation;

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
  private List<GeneBuilder> geneBuilders;

  /**
   * Constructor
   */
  public SpecChromosomesBuilder(Configuration conf, int genes, TargetInformation info, EvoSpexParameters params) {
    this.conf = conf;
    genes_num = genes;
    targetInfo = info;
    parameters = params;
    setUpGeneBuilders();
  }

  /**
   * Set up the gene builders;
   */
  private void setUpGeneBuilders() {
    geneBuilders = new LinkedList<>();
    if (parameters.getConsiderJoinedExpressions())
      geneBuilders.add(new FromJoinedExpressionsGeneBuilder(conf, targetInfo, parameters));
    if (parameters.getConsiderJoinedExpressionsComparisons()) {
      geneBuilders.add(new FromJoinedExpressionsComparisonsGeneBuilder(conf, targetInfo, parameters));
    }
    if (parameters.getConsiderSimpleClosuredExpressions())
      geneBuilders.add(new FromSimpleClosuredExpressionsGeneBuilder(conf, targetInfo, parameters));
    if (parameters.getConsiderDoubleClosuredExpressions())
      geneBuilders.add(new FromDoubleClosuredExpressionsGeneBuilder(conf, targetInfo, parameters));

    geneBuilders.add(new FromResultObjectGeneBuilder(conf, targetInfo, parameters));
    geneBuilders.add(new FromArgumentsGeneBuilder(conf, targetInfo, parameters));
    geneBuilders.add(new FromMapsGeneBuilder(conf, targetInfo, parameters));
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

    List<MethodExecution> allPositives = parameters.getPositiveObjects();
    List<MethodExecution> allNegatives = parameters.getNegativeObjects();

    Random r = new Random();
    while (examplesConsidered < parameters.getAmountOfExamplesForInitialChromosomesGeneration()) {
      // Get a random positive and negative objects
      MethodExecution pos = allPositives.get(r.nextInt(allPositives.size()));
      MethodExecution neg = allNegatives.get(r.nextInt(allNegatives.size()));

      try {
        chromosomes.addAll(generateChromosomesFromObject(pos.getObjectFinalState(), true));
        chromosomes.addAll(generateChromosomesFromObject(neg.getObjectFinalState(), false));
      } catch (Exception e) {
        e.printStackTrace();
      }

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
   * @return a list of individuals computed from the given arguments
   */
  public List<SpecChromosome> generateChromosomesFromObject(Object o, boolean isPositive) throws InvalidConfigurationException {
    List<SpecChromosome> chromosomes = new LinkedList<>();

    List<Gene> genes = buildGenesFromObject(o, isPositive);

    if (parameters.getInitialChromosomesUnary()) {
      // For each gene create one chromosome that contains just one gene at the first position:
      // [gene, true, true, ... , true]
      for (int i = 0; i < genes.size(); i++) {
        Gene[] new_genes = new Gene[genes_num];
        ExprGene exprGene = (ExprGene) genes.get(i);
        Gene newExprGene = exprGene.newGene();
        // Always the gene must be in the first position
        new_genes[0] = newExprGene;
        // The rest of the genes vales is : true
        for (int j = 1; j < new_genes.length; j++) {
          new_genes[j] = new ConstantGene(conf, targetInfo);
        }
        SpecChromosome chromosome = new SpecChromosome(conf, new_genes);
        chromosome.setFitnessValueDirectly(-1);
        chromosomes.add(chromosome);
      }
    } else {
      // Create chromosomes with each gene randomly picked.
      genes.add(new ConstantGene(conf, targetInfo));
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
            new_genes[j] = genes.get(r).newGene();
        }
        for (int j = genes_to_fill; j < genes_num; j++) {
          new_genes[j] = new ConstantGene(conf, targetInfo);
        }
        SpecChromosome chromosome = new SpecChromosome(conf, new_genes);
        chromosome.setFitnessValueDirectly(-1);
        chromosomes.add(chromosome);
      }
    }
    return chromosomes;
  }

  /**
   * Build genes using the gene builders
   */
  private List<Gene> buildGenesFromObject(Object o, boolean isPositive) throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    for (GeneBuilder builder : geneBuilders) {
      if (builder instanceof FromJoinedExpressionsGeneBuilder) {
        FromJoinedExpressionsGeneBuilder fromJoinedExpressionsGeneBuilder = (FromJoinedExpressionsGeneBuilder) builder;
        fromJoinedExpressionsGeneBuilder.setObject(o, isPositive);
      }
      genes.addAll(builder.build());
    }
    return genes;
  }

}
