package evospex.ga.operator;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import evospex.expression.ExprBuilder;
import evospex.ga.chromosome.gene.ExprGeneType;
import evospex.ga.chromosome.SpecChromosome;
import org.jgap.BaseGeneticOperator;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.IGeneticOperatorConstraint;
import org.jgap.InvalidConfigurationException;
import org.jgap.Population;
import org.jgap.RandomGenerator;
import org.jgap.data.config.Configurable;

import evospex.ga.chromosome.gene.ExprGene;
import evospex.ga.chromosome.gene.ExprGeneValue;
import evospex.report.Stats;
import rfm.dynalloyCompiler.ast.ExprConstant;
import evospex.EvoSpexParameters;

/**
 * Mutation operator
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ExprGeneMutationOperator extends BaseGeneticOperator implements Configurable {

  private double mutationProb;
  private EvoSpexParameters params;

  /**
   * Constructor
   * 
   * @param a_configuration
   * @throws InvalidConfigurationException
   */
  public ExprGeneMutationOperator(Configuration a_configuration, EvoSpexParameters parameters)
      throws InvalidConfigurationException {
    super(a_configuration);
    params = parameters;
  }

  public void setMutationProb(double mProb) {
    if (mProb < 0 || mProb > 1)
      throw new IllegalArgumentException("Invalid probabilty");

    mutationProb = mProb;
  }

  public void operate(Population a_population, List a_candidateChromosomes) {
    if (a_population == null || a_candidateChromosomes == null) {
      // Population or candidate chromosomes list empty:
      // nothing to do.
      // -----------------------------------------------
      return;
    }

    int size = a_population.size();
    IGeneticOperatorConstraint constraint = getConfiguration().getJGAPFactory()
        .getGeneticOperatorConstraint();
    Stats.CHROMOSOMES_BEFORE_MUTATION = a_candidateChromosomes.size();
    Stats.MUTATIONS_PERFORMED = 0;
    Stats.UNARY_CHROMOSOMES_FROM_MUTATION = 0;
    RandomGenerator generator = getConfiguration().getRandomGenerator();
    for (int i = 0; i < size; i++) {
      SpecChromosome chrom = (SpecChromosome) a_population.getChromosome(i);
      Gene[] genes = chrom.getGenes();
      // SpecChromosome copyOfChromosome = null;
      // For each Chromosome in the population...

      // Get the positions with active genes (genes which expression is not true)
      List<Integer> activeGenesPositions = getActivePositions(genes);
      boolean mutate = false;

      for (int j = 0; j < activeGenesPositions.size(); j++) {
        mutate = (generator.nextDouble() <= mutationProb);
        if (mutate) {
          SpecChromosome copyOfChromosome = null;
          Stats.MUTATIONS_PERFORMED++;
          int positionToMutate = activeGenesPositions.get(j);
          if (constraint != null) {
            List v = new Vector();
            v.add(chrom);
            if (!constraint.isValid(a_population, v, this)) {
              continue;
            }
          }
          if (copyOfChromosome == null) {
            // ...take a copy of it...
            copyOfChromosome = (SpecChromosome) chrom.clone();
            // ...add it to the candidate pool...
            a_candidateChromosomes.add(copyOfChromosome);

            genes = copyOfChromosome.getGenes();
          }

          // Set the new chromosome with fitness -1 so it will be recalculated
          copyOfChromosome.setFitnessValueDirectly(-1);

          // if (chrom.getAmountOfCounterexamples().compareTo(new Double(0))==0) {
          // try {
          // genes[positionToMutate] = new ExprGene(chrom.getConfiguration(),new
          // ExprGeneValue(ExprConstant.TRUE),null);
          // } catch (InvalidConfigurationException e) {
          // e.printStackTrace();
          // }
          // } else {
          ExprGene toMutate = (ExprGene) genes[positionToMutate];
          toMutate.setAmountOfGenesInChromosome(chrom.getAmountOfActiveGenes());
          toMutate.setIsPartOfSolution(chrom.getAmountOfNegativeCounterexamples() == 0);
          mutateGene(toMutate, generator);
          // }

          if (activeGenesPositions.size() > 1) {
            // The cloned chromosome has more than one gene. So create one new chromosome that
            // contains just the new gene
            try {
              ExprGeneValue geneValue = (ExprGeneValue) genes[positionToMutate].getAllele();
              if (!geneValue.getExpression().equals(ExprConstant.TRUE)) {
                ExprGene newGene = new ExprGene(copyOfChromosome.getConfiguration(),
                    geneValue.clone(),
                    ((ExprGene) genes[positionToMutate]).getTargetInformation());
                Gene[] newGenes = new Gene[genes.length];
                newGenes[0] = newGene;
                for (int k = 1; k < newGenes.length; k++) {
                  newGenes[k] = new ExprGene(copyOfChromosome.getConfiguration(), new ExprGeneValue(ExprBuilder.TRUE, ExprGeneType.CONSTANT), null);
                }
                SpecChromosome newUnitaryChromosome = new SpecChromosome(
                    copyOfChromosome.getConfiguration(), newGenes);
                newUnitaryChromosome.setFitnessValueDirectly(-1);
                a_candidateChromosomes.add(newUnitaryChromosome);
                Stats.UNARY_CHROMOSOMES_FROM_MUTATION++;
                try {
                  if (newGene.getValue().getGeneType()
                      .equals(ExprGeneType.FORALL_VAR_VALUES_DOUBLE_INT_COMPARISON)) {
                  }
                } catch (Exception e) {
                  e.printStackTrace();
                }
              }
            } catch (Exception e) {
              e.printStackTrace();
            }
          }
        }
      }
    }
    Stats.CHROMOSOMES_AFTER_MUTATION = a_candidateChromosomes.size();
    Stats.printMutationReport();
  }

  /**
   * Print all the chromosomes
   */
  private void printChromosomes(List a_candidateChromosomes) {
    System.out.println("Total: " + a_candidateChromosomes.size());
    for (int i = 0; i < a_candidateChromosomes.size(); i++) {
      Object o = a_candidateChromosomes.get(i);
      System.out.println("Pos" + i + " " + o.toString());
    }
  }

  /**
   * Returns all the positions of the genes array in which the expression is not true
   * 
   * @param genes
   * @return
   */
  private List<Integer> getActivePositions(Gene[] genes) {
    LinkedList<Integer> activePositions = new LinkedList<Integer>();
    for (int j = 0; j < genes.length; j++) {
      ExprGene gene = (ExprGene) genes[j];
      if (!gene.getValue().getExpression().equals(ExprConstant.TRUE)) {
        activePositions.add(j);
      }
    }
    return activePositions;
  }

  private void mutateGene(final Gene a_gene, final RandomGenerator a_generator) {
    for (int k = 0; k < a_gene.size(); k++) {
      // Retrieve value between 0 and 1 (not included) from generator.
      // Then map this value to range -1 and 1 (-1 included, 1 not).
      // -------------------------------------------------------------
      double percentage = -1 + a_generator.nextDouble() * 2;
      // Mutate atomic element by calculated percentage.
      // -----------------------------------------------
      a_gene.applyMutation(k, percentage);
    }
  }

  public int compareTo(Object arg0) {
    // TODO Auto-generated method stub
    return 0;
  }

}