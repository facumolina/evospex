package evospex.ga.operator;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import evospex.ga.chromosome.SpecChromosome;
import org.jgap.Configuration;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.InvalidConfigurationException;
import org.jgap.NaturalSelector;
import org.jgap.Population;

import evospex.report.Stats;

/**
 * The InvariantChromosomeNaturalSelector implements a NaturalSelector. This selector ensure that
 * the best chromosomes and the best unary chromosomes (those of size one) are preserved in the
 * population for the next generation
 * 
 * @author fmolina
 */
public class SpecChromosomeNaturalSelector extends NaturalSelector {

  /**
   * Stores the chromosomes to be taken into account for selection
   */
  private Population m_chromosomes;

  /**
   * Comparator that is concerned about both age and fitness values
   */
  private Comparator m_fitnessValueComparator;

  /**
   * Set of already added unary chromosomes
   */
  private Set<String> addedChromosomes;

  /**
   * Default constructor.
   * 
   * @throws InvalidConfigurationException
   */
  public SpecChromosomeNaturalSelector() throws InvalidConfigurationException {
    this(Genotype.getStaticConfiguration());
  }

  public SpecChromosomeNaturalSelector(final Configuration a_config)
      throws InvalidConfigurationException {
    super(a_config);
    m_chromosomes = new Population(a_config);
    m_fitnessValueComparator = new FitnessAgeValueComparator();
    addedChromosomes = new HashSet<String>();
  }

  @Override
  public void select(int a_howManyToSelect, Population a_from_population,
      Population a_to_population) {
    int validToSelect;
    int unaryToSelect;
    m_chromosomes = a_from_population;
    int chromsSize = m_chromosomes.size();
    if (a_howManyToSelect > chromsSize) {
      validToSelect = chromsSize;
    } else {
      validToSelect = a_howManyToSelect;
    }
    unaryToSelect = validToSelect / 2;
    validToSelect = validToSelect / 2;

    // Sort the collection of chromosomes previously added for evaluation.
    // Only do this if necessary.
    Stats.CHROMOSOMES_BEFORE_SELECTION = a_from_population.size();
    Collections.sort(m_chromosomes.getChromosomes(), m_fitnessValueComparator);

    // To select a chromosome, we just go thru the sorted list.
    SpecChromosome selectedChromosome;
    Set<String> unarySelectedGenes = new HashSet<String>();

    int validAdded = 0;
    for (int i = 0; i < validToSelect; i++) {
      selectedChromosome = (SpecChromosome) m_chromosomes.getChromosome(i);
      selectedChromosome.setIsSelectedForNextGeneration(true);
      a_to_population.addChromosome(selectedChromosome);
      if (selectedChromosome.isUnary()) {
        unarySelectedGenes.add(selectedChromosome.getGenes()[0].toString());
      }
      if (selectedChromosome.getAmountOfPositiveCounterexamples() == 0) {
        validAdded++;
      }
    }
    Stats.SELECTED_BY_FITNESS = a_to_population.size();
    Stats.ACTUAL_VALID_INDIVIDUALS = validAdded;

    // Also keep in the population the unary chromosomes
    int i = validToSelect;
    int unarySelected = 0;
    int extraUnaryValid = 0;
    while (i < chromsSize && unarySelected < unaryToSelect
        && a_to_population.size() < m_config.getPopulationSize()) {
      selectedChromosome = (SpecChromosome) m_chromosomes.getChromosome(i);
      if (selectedChromosome.isUnary()
          && !unarySelectedGenes.contains(selectedChromosome.getGenes()[0].toString())) {
        // && !addedChromosome(selectedChromosome)
        // )) {
        selectedChromosome.setIsSelectedForNextGeneration(true);
        a_to_population.addChromosome(selectedChromosome);
        unarySelectedGenes.add(selectedChromosome.getGenes()[0].toString());
        if (!(selectedChromosome.getAmountOfPositiveCounterexamples() == 0)) {
          unarySelected++;
        } else {
          extraUnaryValid++;
        }

      }
      i++;
    }
    // Finally, keep in the population those individuals which amount of positive counterexamples is
    // equal
    // to the maximum possible, since their negation may be useful

    Stats.UNARY_VALID_PRESERVED = extraUnaryValid;
    Stats.UNARY_INVALID_PRESERVED = unarySelected;
    Stats.MOVED_TO_NEXT_GEN = a_to_population.size();
    Stats.printSelectionReport();
  }

  /**
   * Returns true if the given chromosome already was added in a previous selection
   */
  private boolean addedChromosome(SpecChromosome iChromosome) {
    String stringGene = iChromosome.getGenes()[0].toString();
    if (addedChromosomes.contains(stringGene))
      return true;
    addedChromosomes.add(stringGene);
    return false;
  }

  @Override
  public void empty() {
    // Clear the list of chromosomes
    m_chromosomes.getChromosomes().clear();
  }

  @Override
  public boolean returnsUniqueChromosomes() {
    return true;
  }

  @Override
  protected void add(IChromosome a_chromosomeToAdd) {
    // Check if chromosome already added
    if (m_chromosomes.getChromosomes().contains(a_chromosomeToAdd)) {
      return;
    }
    // New chromosome, insert it into the sorted collection of chromosomes
    a_chromosomeToAdd.setIsSelectedForNextGeneration(false);
    m_chromosomes.addChromosome(a_chromosomeToAdd);
    // Indicate that the list of chromosomes to add needs sorting.
  }

}
