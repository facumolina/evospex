package evospex.ga.operator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import evospex.expression.ExprBuilder;
import evospex.ga.chromosome.SpecChromosome;
import evospex.ga.chromosome.gene.ExprGeneImpl;
import evospex.ga.chromosome.gene.ExprGeneType;
import evospex.ga.chromosome.gene.ExprGeneValue;
import org.jgap.BaseGeneticOperator;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.IUniversalRateCalculator;
import org.jgap.InvalidConfigurationException;
import org.jgap.Population;
import org.jgap.RandomGenerator;

import evospex.ga.chromosome.gene.ExprGene;
import evospex.report.Stats;
import utils.TargetInformation;
import evospex.EvoSpexParameters;

public class ChromosomeCrossoverOperator extends BaseGeneticOperator implements Comparable {

  /**
   * The current crossover rate used by this crossover operator (mutual exclusive to
   * m_crossoverRatePercent and m_crossoverRateCalc).
   */
  private double m_crossoverRate;

  /**
   * Crossover rate in percentage of population size (mutual exclusive to m_crossoverRate and
   * m_crossoverRateCalc).
   */
  private double m_crossoverRatePercent;

  /**
   * Calculator for dynamically determining the crossover rate (mutual exclusive to m_crossoverRate
   * and m_crossoverRatePercent)
   */
  private IUniversalRateCalculator m_crossoverRateCalc;

  /**
   * true: x-over before and after a randomly chosen x-over point false: only x-over after the
   * chosen point.
   */
  private boolean m_allowFullCrossOver;

  /**
   * true: also x-over chromosomes with age of zero (newly created chromosomes)
   */
  private boolean m_xoverNewAge;

  /**
   * In each generation contains the pair of chromosomes crossovered
   */
  private Set<String> crossoveredChromosomes;

  /**
   * true: the big and chromosome must be created
   */
  private boolean buildBigAnd;

  public ChromosomeCrossoverOperator() throws InvalidConfigurationException {
    super(Genotype.getStaticConfiguration());
    init();
  }

  public ChromosomeCrossoverOperator(final Configuration a_configuration,
      EvoSpexParameters params) throws InvalidConfigurationException {
    super(a_configuration);
    this.buildBigAnd = params.buildBigAndChromosome();
    init();
  }

  /**
   * Initializes certain parameters.
   */
  protected void init() {
    // Set the default crossoverRate.
    // ------------------------------
    m_crossoverRate = 6;
    m_crossoverRatePercent = -1;
    setCrossoverRateCalc(null);
    setAllowFullCrossOver(true);
    setXoverNewAge(true);
  }

  /**
   * Does the crossing over.
   *
   * @param a_population
   *          the population of chromosomes from the current evolution prior to exposure to crossing
   *          over
   * @param a_candidateChromosomes
   *          the pool of chromosomes that have been selected for the next evolved population
   */
  @SuppressWarnings("unchecked")
  public void operate(final Population a_population, final List a_candidateChromosomes) {
    // Work out the number of crossovers that should be performed.
    // -----------------------------------------------------------
    crossoveredChromosomes = new HashSet<String>();

    int size = Math.min(getConfiguration().getPopulationSize(), a_population.size());
    if (a_population.size() > size)
      size = a_population.size();
    int numCrossovers = 0;
    if (m_crossoverRate >= 0) {
      Double d = (Double.valueOf(size) / m_crossoverRate);
      numCrossovers = d.intValue();
    } else if (m_crossoverRateCalc != null) {
      numCrossovers = size / m_crossoverRateCalc.calculateCurrentRate();
    } else {
      numCrossovers = (int) (size * m_crossoverRatePercent);
    }

    Stats.CHROMOSOMES_BEFORE_CROSSOVER = a_candidateChromosomes.size();
    Stats.NUMBER_OF_CROSSOVERS = numCrossovers;
    RandomGenerator generator = getConfiguration().getRandomGenerator();

    List<SpecChromosome> valid = getValidChromosomes(a_population.getChromosomes());
    if (valid.size() == 0) {
      // There are no valid individuals, then use the whole population
      valid = a_population.getChromosomes();
    }
    Stats.VALID_CHROMOSOMES = valid.size();
    size = valid.size();
    // Choose the two chromosomes randomly
    int i = 0;
    int index1, index2;
    while (i < numCrossovers) {

      index1 = generator.nextInt(size);
      index2 = generator.nextInt(size);

      // SpecChromosome chrom1 = (SpecChromosome) a_population.getChromosome(index1);
      SpecChromosome chrom1 = valid.get(index1);
      // SpecChromosome chrom2 = (SpecChromosome) a_population.getChromosome(index2);
      SpecChromosome chrom2 = valid.get(index2);
      if (chrom1.getFitnessValue() >= 0 && chrom2.getFitnessValue() >= 0) {

        IChromosome firstMate = (IChromosome) chrom1.clone();
        IChromosome secondMate = (IChromosome) chrom2.clone();
        // Cross over the chromosomes.
        // ---------------------------
        doCrossover(firstMate, secondMate, a_candidateChromosomes, generator);
        i++;
      }
    }
    Stats.CHROMOSOMES_AFTER_CROSSOVER = a_candidateChromosomes.size();
    Stats.printCrossoverReport();
    if (buildBigAnd) {
      // Creates one particular individual which is formed by the union of the valid unary
      // chromosomes
      try {
        i = 0;
        Set<String> usedChromosomes = new HashSet<String>();
        int genesSize = a_population.getChromosome(0).getGenes().length;
        Gene[] genes = new Gene[genesSize];
        initializeGenes(genes, this.getConfiguration(),
            ((ExprGene) a_population.getChromosome(i).getGenes()[0]).getTargetInformation());
        int currentAmountOfGenes = 0;
        while (i < size) {
          SpecChromosome chromosome = (SpecChromosome) a_population.getChromosome(i);
          if (chromosome.isUnaryAndValid() && !usedChromosomes.contains(chromosome.toString())) {
            usedChromosomes.add(chromosome.toString());
            ExprGene currentGene = (ExprGene) chromosome.getGenes()[0];
            if (currentAmountOfGenes < genesSize) {
              //genes[currentAmountOfGenes] = new ExprGene(currentGene.getConfiguration(),
              //    currentGene.getValue().clone(), currentGene.getTargetInformation());
              genes[currentAmountOfGenes] = currentGene.newGene();
              currentAmountOfGenes++;
            }
            if (currentAmountOfGenes == genesSize) {
              SpecChromosome newChromosome = (SpecChromosome) chromosome.clone();
              newChromosome.setGenes(genes);
              newChromosome.setFitnessValueDirectly(-1);
              a_candidateChromosomes.add(newChromosome);
              System.out.println();
              System.out.println("Total unary and valid individuals combined in one chromosome:  "
                  + currentAmountOfGenes);
              System.out.println();
              currentAmountOfGenes = 0;
              genes = new Gene[genesSize];
              initializeGenes(genes, this.getConfiguration(),
                  currentGene.getTargetInformation());
            }
          }
          i++;
        }
        if (currentAmountOfGenes > 0 && currentAmountOfGenes < genesSize) {
          SpecChromosome newChromosome = (SpecChromosome) a_population.getChromosome(0).clone();
          newChromosome.setGenes(genes);
          newChromosome.setFitnessValueDirectly(-1);
          a_candidateChromosomes.add(newChromosome);
          System.out.println();
          System.out.println("Total unary and valid individuals combined in one chromosome:  "
              + currentAmountOfGenes);
          System.out.println();
        }

      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * Returns true if the two chromosomes are adequate for crossover
   */
  private boolean canPerformCrossover(SpecChromosome chrom1, SpecChromosome chrom2) {
    // if (chrom1.getCounterexamplesType() == 0 && chrom2.getCounterexamplesType() == 0 &&
    if (chrom1.getFitnessValueDirectly() > 0 && chrom2.getFitnessValueDirectly() > 0
        && !alreadyCrossovered(chrom1, chrom2)) {
      crossoveredChromosomes.add(chrom1.toString() + "-" + chrom2.toString());
      crossoveredChromosomes.add(chrom2.toString() + "-" + chrom1.toString());
      Set<String> intersection = getIntersection(chrom1.counterexamplesToStringSet(),
          chrom2.counterexamplesToStringSet());
      return intersection.size() == 0;
    }

    return false;
  }

  /**
   * Returns true if the two current was crossovered previously
   */
  private boolean alreadyCrossovered(SpecChromosome chrom1, SpecChromosome chrom2) {
    return crossoveredChromosomes.contains(chrom1.toString() + "-" + chrom2.toString());
  }

  /**
   * Gets the intersection between two sets
   */
  private Set<String> getIntersection(Set<String> s1, Set<String> s2) {
    boolean set1IsLarger = s1.size() > s1.size();
    Set<String> intersection = new HashSet<String>(set1IsLarger ? s2 : s1);
    intersection.retainAll(set1IsLarger ? s1 : s2);
    return intersection;
  }

  protected void doCrossover(IChromosome firstMate, IChromosome secondMate,
      List a_candidateChromosomes, RandomGenerator generator) {
    Gene[] firstGenes = firstMate.getGenes();
    Gene[] secondGenes = secondMate.getGenes();

    boolean useUnion = true;
    if (useUnion) {
      Gene[] union = union(firstGenes, secondGenes, firstMate.getConfiguration());
      try {
        firstMate.setGenes(union);
        firstMate.setFitnessValueDirectly(-1);
        a_candidateChromosomes.add(firstMate);
      } catch (InvalidConfigurationException e) {

      }
    } else {

      boolean firstFilledGenes = filledGenes((SpecChromosome) firstMate);
      boolean secondFilledGenes = filledGenes((SpecChromosome) secondMate);

      int locus = generator.nextInt(firstGenes.length);
      boolean allTrueAtRightFirstMate = allTrueAtRight(locus, firstMate);
      boolean allTrueAtRightSecondMate = allTrueAtRight(locus, secondMate);

      if (!firstFilledGenes && !secondFilledGenes) {
        // Do the crossover combining:
        // firstMate left side and secondMate left side
        int i = 0;
        for (int j = 0; j < firstGenes.length; j++) {
          ExprGene gene = (ExprGene) firstGenes[j];
          if (gene.getValue().getExpression().equals(ExprBuilder.TRUE)) {
            gene.setAllele(secondGenes[i].getAllele());
            i++;
          }
        }
        firstMate.setFitnessValueDirectly(-1);
        a_candidateChromosomes.add(firstMate);
      } else {
        // Do the crossover combining:
        // firstMate left side and secondMate right side
        // secondMate left side and firstMate right side
        Gene[] firstLeftSecondRightGenes = new Gene[firstGenes.length];
        Gene[] secondLeftFirstRightGenes = new Gene[firstGenes.length];
        initializeGenes(firstLeftSecondRightGenes, firstMate.getConfiguration(),
            ((ExprGene) firstGenes[0]).getTargetInformation());
        initializeGenes(secondLeftFirstRightGenes, firstMate.getConfiguration(),
            ((ExprGene) firstGenes[0]).getTargetInformation());

        ExprGene gene1;
        ExprGene gene2;
        for (int j = 0; j < firstGenes.length; j++) {
          // Take one gene from each chromosome
          gene1 = (ExprGene) firstGenes[j];
          gene2 = (ExprGene) secondGenes[j];

          if (j >= locus) {
            addGene(firstLeftSecondRightGenes, gene2);
            addGene(secondLeftFirstRightGenes, gene1);
          } else {
            firstLeftSecondRightGenes[j] = gene1;
            secondLeftFirstRightGenes[j] = gene2;
          }

        }
        // Add the modified chromosomes to the candidate pool
        try {
          firstMate.setGenes(firstLeftSecondRightGenes);
          secondMate.setGenes(secondLeftFirstRightGenes);
        } catch (InvalidConfigurationException e) {
          e.printStackTrace();
        }
        firstMate.setFitnessValueDirectly(-1);
        secondMate.setFitnessValueDirectly(-1);
        a_candidateChromosomes.add(firstMate);
        a_candidateChromosomes.add(secondMate);
      }
    }
  }

  /**
   * Perform the union of the genes
   */
  private Gene[] union(Gene[] firstGenes, Gene[] secondGenes, Configuration conf) {
    Gene[] union = new Gene[firstGenes.length];
    initializeGenes(union, conf, ((ExprGene) firstGenes[0]).getTargetInformation());
    int firstPosition = 0;
    int secondPosition = 0;
    int addedGenes = 0;
    Set<String> setGenes = new HashSet<String>();
    while (addedGenes < union.length) {
      Gene geneFirst = getFirstNonTrivialGene(firstGenes, firstPosition);
      if (geneFirst != null) {
        if (setGenes.add(geneFirst.toString())) {
          union[addedGenes] = geneFirst;
          addedGenes++;
        }
        firstPosition++;
      }
      if (addedGenes < union.length) {
        Gene geneSecond = getFirstNonTrivialGene(secondGenes, secondPosition);
        if (geneSecond != null) {
          if (setGenes.add(geneSecond.toString())) {
            union[addedGenes] = geneSecond;
            addedGenes++;
          }
          secondPosition++;
        }
        if (geneFirst == null && geneSecond == null) {
          break;
        }
      }
    }
    return union;
  }

  /**
   * Returns the first non trivial gene (different from true) in the given array starting from the
   * given position
   */
  private Gene getFirstNonTrivialGene(Gene[] genes, int position) {

      for (int i = position; i < genes.length; i++) {
        ExprGene currentGene = (ExprGene) genes[i];
        if ((currentGene != null)
            && !currentGene.getValue().getExpression().equals(ExprBuilder.TRUE)) {
          return currentGene.newGene();
        }
      }
    return null;
  }

  /**
   * Initialize a genes array with true expressions
   */
  private void initializeGenes(Gene[] genesArray, Configuration conf, TargetInformation dsi) {
    try {
      for (int i = 0; i < genesArray.length; i++) {
        genesArray[i] = new ExprGeneImpl(conf, new ExprGeneValue(ExprBuilder.TRUE, ExprGeneType.CONSTANT), dsi);
      }
    } catch (InvalidConfigurationException e) {
      e.printStackTrace();
      throw new IllegalArgumentException("The configuration is invalid");
    }
  }

  /**
   * Add gene in the genes array in the first true position found from left to right
   */
  private void addGene(Gene[] genesArray, Gene gene) {
    int positionToAdd = -1;
    for (int i = 0; i < genesArray.length && positionToAdd < 0; i++) {
      ExprGene currentGene = (ExprGene) genesArray[i];
      if ((currentGene == null)
          || currentGene.getValue().getExpression().equals(ExprBuilder.TRUE)) {
        positionToAdd = i;
      }
    }
    if (positionToAdd >= 0) {
      // There is a free position
      genesArray[positionToAdd] = gene;
    }
  }

  /**
   * Returns true if all the genes at right of position are true genes
   * 
   * @param position
   * @param mate
   */
  private boolean allTrueAtRight(int position, IChromosome mate) {
    Gene[] genes = mate.getGenes();
    for (int i = position; i < genes.length; i++) {
      ExprGene exprGene = (ExprGene) genes[i];
      if (!exprGene.isDefault()) {
        return false;
      }
    }
    return true;
  }

  /**
   * Returns true if all the genes are not the true expression
   */
  private boolean filledGenes(SpecChromosome chromosome) {
    Gene[] genes = chromosome.getGenes();
    for (int i = 0; i < genes.length; i++) {
      ExprGene exprGene = (ExprGene) genes[i];
      if (exprGene.isDefault())
        return false;
    }
    return true;
  }

  /**
   * Sets the crossover rate calculator.
   *
   * @param a_crossoverRateCalculator
   *          the new calculator
   */
  private void setCrossoverRateCalc(final IUniversalRateCalculator a_crossoverRateCalculator) {
    m_crossoverRateCalc = a_crossoverRateCalculator;
    if (a_crossoverRateCalculator != null) {
      m_crossoverRate = -1;
      m_crossoverRatePercent = -1d;
    }
  }

  /**
   * Compares the given object to this one.
   *
   * @param a_other
   *          the instance against which to compare this instance
   * @return a negative number if this instance is "less than" the given instance, zero if they are
   *         equal to each other, and a positive number if this is "greater than" the given instance
   */
  public int compareTo(final Object a_other) {
    /** @todo consider Configuration */
    if (a_other == null) {
      return 1;
    }
    ChromosomeCrossoverOperator op = (ChromosomeCrossoverOperator) a_other;
    if (m_crossoverRateCalc == null) {
      if (op.m_crossoverRateCalc != null) {
        return -1;
      }
    } else {
      if (op.m_crossoverRateCalc == null) {
        return 1;
      }
    }
    if (m_crossoverRate != op.m_crossoverRate) {
      if (m_crossoverRate > op.m_crossoverRate) {
        return 1;
      } else {
        return -1;
      }
    }
    if (m_allowFullCrossOver != op.m_allowFullCrossOver) {
      if (m_allowFullCrossOver) {
        return 1;
      } else {
        return -1;
      }
    }
    if (m_xoverNewAge != op.m_xoverNewAge) {
      if (m_xoverNewAge) {
        return 1;
      } else {
        return -1;
      }
    }
    // Everything is equal. Return zero.
    // ---------------------------------
    return 0;
  }

  /**
   * @param a_allowFullXOver
   *          x-over before and after a randomly chosen point
   */
  public void setAllowFullCrossOver(boolean a_allowFullXOver) {
    m_allowFullCrossOver = a_allowFullXOver;
  }

  /**
   * @return x-over before and after a randomly chosen x-over point
   */
  public boolean isAllowFullCrossOver() {
    return m_allowFullCrossOver;
  }

  /**
   * @return the crossover rate set
   */
  public double getCrossOverRate() {
    return m_crossoverRate;
  }

  /**
   * @return set the crossover rate
   */
  public void setCrossOverRate(double prob) {
    m_crossoverRate = new Double(1 / prob);
  }

  /**
   * @return the crossover rate set
   */
  public double getCrossOverRatePercent() {
    return m_crossoverRatePercent;
  }

  /**
   * @param a_xoverNewAge
   *          true: also x-over chromosomes with age of zero (newly created chromosomes)
   */
  public void setXoverNewAge(boolean a_xoverNewAge) {
    m_xoverNewAge = a_xoverNewAge;
  }

  /**
   * @return a_xoverNewAge true: also x-over chromosomes with age of zero (newly created
   *         chromosomes)
   */
  public boolean isXoverNewAge() {
    return m_xoverNewAge;
  }

  /**
   * Get the list of valid chromosomes
   */
  private List<SpecChromosome> getValidChromosomes(List<SpecChromosome> chromosomes) {
    List<SpecChromosome> validChromosomes = new ArrayList<SpecChromosome>();
    for (int i = 0; i < chromosomes.size(); i++) {
      SpecChromosome sc = chromosomes.get(i);
      if (sc.getAmountOfPositiveCounterexamples() == 0)
        validChromosomes.add(sc);
    }
    return validChromosomes;
  }
}
