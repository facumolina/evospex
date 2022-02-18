package evospex.ga.chromosome;

import java.util.*;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.ga.chromosome.gene.ExprGene;
import org.jgap.BaseChromosome;
import org.jgap.Configuration;
import org.jgap.FitnessEvaluator;
import org.jgap.FitnessFunction;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.IChromosomePool;
import org.jgap.ICloneHandler;
import org.jgap.IGeneConstraintChecker;
import org.jgap.IJGAPFactory;
import org.jgap.InvalidConfigurationException;
import org.jgap.RandomGenerator;
import org.jgap.impl.IntegerGene;

/**
 * This class represents the chromosomes. Each chromosome defines a representation invariant.
 * 
 * @author fmolina
 */
public class SpecChromosome extends BaseChromosome {

  private boolean m_alwaysCalculate;

  protected double m_fitnessValue = FitnessFunction.NO_FITNESS_VALUE;

  /**
   * Keeps track of whether or not this Chromosome has been selected by the natural selector to move
   * on to the next generation.
   */
  private boolean m_isSelectedForNextGeneration;

  /**
   * Holds multiobjective values.
   */
  private List m_multiObjective;

  /**
   * Optional helper class for checking if a given allele value to be set for a given gene is valid.
   * If not, the allele value may not be set for the gene or the gene type (e.g. IntegerGene) is not
   * allowed in general!
   */
  private IGeneConstraintChecker m_geneAlleleChecker;

  private boolean m_compareAppData;

  private Object m_applicationData;

  /**
   * Holds the counter examples of the specification represented by this chromosome
   */
  private Set<String> counterexamples;

  /**
   * Positive and negative counterexamples
   */
  private Double positiveCounterexamples;
  private Double negativeCounterexamples;
  private String counterexamplesMutationsStr;

  private boolean resultOfCrossoverOfEmtpyIntersectionChromosomes;

  /**
   * Default constructor
   * 
   * @throws InvalidConfigurationException
   */
  public SpecChromosome() throws InvalidConfigurationException {
    this(Genotype.getStaticConfiguration());
    counterexamples = new HashSet<String>();
    positiveCounterexamples = new Double(-1);
    negativeCounterexamples = new Double(-1);
    resultOfCrossoverOfEmtpyIntersectionChromosomes = true;
  }

  /**
   * Constructor with a configuration
   * 
   * @throws InvalidConfigurationException
   */
  public SpecChromosome(final Configuration a_configuration) throws InvalidConfigurationException {
    super(a_configuration);
    m_alwaysCalculate = a_configuration.isAlwaysCalculateFitness();
    counterexamples = new HashSet<String>();
    positiveCounterexamples = new Double(-1);
    negativeCounterexamples = new Double(-1);
    resultOfCrossoverOfEmtpyIntersectionChromosomes = true;
  }

  /**
   * Constructor for specifying the number of genes.
   */
  public SpecChromosome(final Configuration a_configuration, final int a_desiredSize)
      throws InvalidConfigurationException {
    this(a_configuration);
    if (a_desiredSize <= 0) {
      throw new IllegalArgumentException("Chromosome size must be greater than zero");
    }
    setGenes(new Gene[a_desiredSize]);
    counterexamples = new HashSet<String>();
    positiveCounterexamples = new Double(-1);
    negativeCounterexamples = new Double(-1);
    resultOfCrossoverOfEmtpyIntersectionChromosomes = true;
  }

  /**
   * Constructs a Chromosome separate from any specific Configuration. This can be useful for
   * constructing sample chromosomes that are to be used to setup a Configuration object.
   */
  public SpecChromosome(final Configuration a_configuration, Gene[] a_initialGenes)
      throws InvalidConfigurationException {
    this(a_configuration, a_initialGenes == null ? 0 : a_initialGenes.length);
    setGenes(a_initialGenes);
    counterexamples = new HashSet<String>();
    resultOfCrossoverOfEmtpyIntersectionChromosomes = true;
  }

  @Override
  public void setFitnessValue(double a_newFitnessValue) {
    if (a_newFitnessValue >= 0 && Math.abs(m_fitnessValue - a_newFitnessValue) > 0.0000001) {
      m_fitnessValue = a_newFitnessValue;
    }
  }

  @Override
  public void setFitnessValueDirectly(double a_newFitnessValue) {
    m_fitnessValue = a_newFitnessValue;
  }

  /**
   * Retrieves the fitness value of this Chromosome, as determined by the active fitness function.
   */
  public double getFitnessValue() {
    if (m_fitnessValue >= 0.000d && !m_alwaysCalculate) {
      return m_fitnessValue;
    } else {
      return calcFitnessValue();
    }
  }

  /**
   * @return fitness value of this chromosome determined via the registered fitness function
   */
  protected double calcFitnessValue() {
    if (getConfiguration() != null) {
      FitnessFunction normalFitnessFunction = getConfiguration().getFitnessFunction();
      if (normalFitnessFunction != null) {
        // Grab the "normal" fitness function and ask it to calculate our
        // fitness value.
        // --------------------------------------------------------------
        m_fitnessValue = normalFitnessFunction.getFitnessValue(this);
      }
    }
    return m_fitnessValue;
  }

  @Override
  public double getFitnessValueDirectly() {
    return m_fitnessValue;
  }

  @Override
  public void setIsSelectedForNextGeneration(boolean a_isSelected) {
    m_isSelectedForNextGeneration = a_isSelected;
  }

  @Override
  public boolean isSelectedForNextGeneration() {
    return m_isSelectedForNextGeneration;
  }

  @Override
  public void setConstraintChecker(IGeneConstraintChecker a_constraintChecker)
      throws InvalidConfigurationException {
    verify(a_constraintChecker);
    m_geneAlleleChecker = a_constraintChecker;
  }

  @Override
  public void setApplicationData(Object a_newData) {
    m_applicationData = a_newData;
  }

  @Override
  public Object getApplicationData() {
    return m_applicationData;
  }

  /**
   * Invoked when this Chromosome is no longer needed and should perform any necessary cleanup.
   */
  public void cleanup() {
    if (getConfiguration() == null) {
      throw new IllegalStateException("The active Configuration object must be set on this "
          + "Chromosome prior to invocation of the cleanup() method.");
    }
    // First, reset our internal state.
    // --------------------------------
    m_fitnessValue = getConfiguration().getFitnessFunction().NO_FITNESS_VALUE;
    m_isSelectedForNextGeneration = false;
    // Next we want to try to release this Chromosome to a ChromosomePool
    // if one has been setup so that we can save a little time and memory
    // next time a Chromosome is needed.
    // ------------------------------------------------------------------
    // Now fetch the active ChromosomePool from the Configuration object
    // and, if the pool exists, release this Chromosome to it.
    // -----------------------------------------------------------------
    IChromosomePool pool = getConfiguration().getChromosomePool();
    if (pool != null) {
      // Note that the pool will take care of any gene cleanup for us,
      // so we don't need to worry about it here.
      // -------------------------------------------------------------
      pool.releaseChromosome(this);
    } else {
      // No pool is available, so we need to finish cleaning up, which
      // basically entails requesting each of our genes to clean
      // themselves up as well.
      // -------------------------------------------------------------
      for (int i = 0; i < size(); i++) {
        getGene(i).cleanup();
      }
    }
  }

  @Override
  public int compareTo(Object other) {
    // First, if the other Chromosome is null, then this chromosome is
    // automatically the "greater" Chromosome.
    // ---------------------------------------------------------------
    if (other == null) {
      return 1;
    }
    int size = size();
    IChromosome otherChromosome = (IChromosome) other;
    Gene[] otherGenes = otherChromosome.getGenes();
    // If the other Chromosome doesn't have the same number of genes,
    // then whichever has more is the "greater" Chromosome.
    // --------------------------------------------------------------
    if (otherChromosome.size() != size) {
      return size() - otherChromosome.size();
    }
    // Next, compare the gene values (alleles) for differences. If
    // one of the genes is not equal, then we return the result of its
    // comparison.
    // ---------------------------------------------------------------
    for (int i = 0; i < size; i++) {
      int comparison = getGene(i).compareTo(otherGenes[i]);
      if (comparison != 0) {
        return comparison;
      }
    }
    // Compare current fitness value.
    // ------------------------------
    if (m_fitnessValue != otherChromosome.getFitnessValueDirectly()) {
      FitnessEvaluator eval = getConfiguration().getFitnessEvaluator();
      if (eval != null) {
        if (eval.isFitter(m_fitnessValue, otherChromosome.getFitnessValueDirectly())) {
          return 1;
        } else {
          return -1;
        }
      } else {
        // undetermined order, but unequal!
        // --------------------------------
        return -1;
      }
    }
    if (m_compareAppData) {
      // Compare application data.
      // -------------------------
      if (getApplicationData() == null) {
        if (otherChromosome.getApplicationData() != null) {
          return -1;
        }
      } else if (otherChromosome.getApplicationData() == null) {
        return 1;
      } else {
        if (getApplicationData() instanceof Comparable) {
          try {
            return ((Comparable) getApplicationData())
                .compareTo(otherChromosome.getApplicationData());
          } catch (ClassCastException cex) {
            /** @todo improve */
            return -1;
          }
        } else {
          return getApplicationData().getClass().getName()
              .compareTo(otherChromosome.getApplicationData().getClass().getName());
        }
      }
    }
    // Everything is equal. Return zero.
    // ---------------------------------
    return 0;
  }

  @Override
  public boolean isHandlerFor(Object a_obj, Class a_class) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Object perform(Object a_obj, Class a_class, Object a_params) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Returns a copy of this Chromosome. The returned instance can evolve independently of this
   * instance. Note that, if possible, this method will first attempt to acquire a Chromosome
   * instance from the active ChromosomePool (if any) and set its value appropriately before
   * returning it. If that is not possible, then a new Chromosome instance will be constructed and
   * its value set appropriately before returning.
   */
  public synchronized Object clone() {
    // Before doing anything, make sure that a Configuration object
    // has been set on this Chromosome. If not, then throw an
    // IllegalStateException.
    // ------------------------------------------------------------
    if (getConfiguration() == null) {
      throw new IllegalStateException("The active Configuration object must be set on this "
          + "Chromosome prior to invocation of the clone() method.");
    }
    SpecChromosome copy = null;
    // Now, first see if we can pull a Chromosome from the pool and just
    // set its gene values (alleles) appropriately.
    // ------------------------------------------------------------
    IChromosomePool pool = getConfiguration().getChromosomePool();
    if (pool != null) {
      copy = (SpecChromosome) pool.acquireChromosome();
      if (copy != null) {
        Gene[] genes = copy.getGenes();
        for (int i = 0; i < size(); i++) {
          genes[i].setAllele(getGene(i).getAllele());
        }
      }
    }
    try {
      if (copy == null) {
        // We couldn't fetch a Chromosome from the pool, so we need to create
        // a new one. First we make a copy of each of the Genes. We explicity
        // use the Gene at each respective gene location (locus) to create the
        // new Gene that is to occupy that same locus in the new Chromosome.
        // -------------------------------------------------------------------
        int size = size();
        if (size > 0) {
          Gene[] copyOfGenes = new Gene[size];
          for (int i = 0; i < copyOfGenes.length; i++) {
            copyOfGenes[i] = getGene(i).newGene();
            Object allele = getGene(i).getAllele();
            if (allele != null) {
              IJGAPFactory factory = getConfiguration().getJGAPFactory();
              if (factory != null) {
                ICloneHandler cloner = factory.getCloneHandlerFor(allele, allele.getClass());
                if (cloner != null) {
                  try {
                    allele = cloner.perform(allele, null, this);
                  } catch (Exception ex) {
                    throw new RuntimeException(ex);
                  }
                }
              }
            }
            copyOfGenes[i].setAllele(allele);
          }
          // Now construct a new Chromosome with the copies of the genes and
          // return it. Also clone the IApplicationData object later on.
          // ---------------------------------------------------------------
          if (getClass() == SpecChromosome.class) {
            copy = new SpecChromosome(getConfiguration(), copyOfGenes);
          } else {
            copy = (SpecChromosome) getConfiguration().getSampleChromosome().clone();
            copy.setGenes(copyOfGenes);
          }
        } else {
          if (getClass() == SpecChromosome.class) {
            copy = new SpecChromosome(getConfiguration());
          } else {
            copy = (SpecChromosome) getConfiguration().getSampleChromosome().clone();
          }
        }
      }
      copy.setFitnessValue(m_fitnessValue);
      // Clone constraint checker.
      // -------------------------
      copy.setConstraintChecker(getConstraintChecker());
      // Clone counterexamples
      copy.setCounterexamples(getCounterexamples());
    } catch (InvalidConfigurationException iex) {
      throw new IllegalStateException(iex.getMessage());
    }
    // Also clone the IApplicationData object.
    // ---------------------------------------
    try {
      copy.setApplicationData(cloneObject(getApplicationData()));
    } catch (Exception ex) {
      throw new IllegalStateException(ex.getMessage());
    }
    // Clone multi-objective object if necessary and possible.
    // -------------------------------------------------------
    if (m_multiObjective != null) {
      if (getClass() == SpecChromosome.class) {
        try {
          ((SpecChromosome) copy).setMultiObjectives((List) cloneObject(m_multiObjective));
        } catch (Exception ex) {
          throw new IllegalStateException(ex.getMessage());
        }
      }
    }
    return copy;
  }

  /**
   * Clones an object by using clone handlers. If no deep cloning possible, then return the
   * reference.
   */
  protected Object cloneObject(Object a_object) throws Exception {
    if (a_object == null) {
      return null;
    }
    // Try to clone via a registered clone handler.
    // --------------------------------------------
    ICloneHandler cloner = getConfiguration().getJGAPFactory().getCloneHandlerFor(a_object,
        a_object.getClass());
    if (cloner != null) {
      return cloner.perform(a_object, null, this);
    } else {
      // No cloning supported, so just return the reference.
      // ---------------------------------------------------
      return a_object;
    }
  }

  /**
   * IGeneConstraintChecker the constraint checker to be used whenever method setGenes(Gene[]) is
   * called.
   *
   */
  public IGeneConstraintChecker getConstraintChecker() {
    return m_geneAlleleChecker;
  }

  /**
   * Sets the genes for the chromosome.
   */
  public void setGenes(Gene[] a_genes) throws InvalidConfigurationException {
    super.setGenes(a_genes);
    verify(getConstraintChecker());
  }

  /**
   * Should we also consider the application data when comparing? Default is "false" as "true" means
   * a Chromosome is losing its identity when application data is set differently!
   */
  public void setCompareApplicationData(boolean a_doCompare) {
    m_compareAppData = a_doCompare;
  }

  /**
   * @return should we also consider the application data when comparing?
   */
  public boolean isCompareApplicationData() {
    return m_compareAppData;
  }

  /**
   * Verifies the state of the chromosome. Especially takes care of the given constraint checker.
   */
  protected void verify(IGeneConstraintChecker a_constraintChecker)
      throws InvalidConfigurationException {
    if (a_constraintChecker != null && getGenes() != null) {
      int len = getGenes().length;
      for (int i = 0; i < len; i++) {
        Gene gene = getGene(i);
        if (!a_constraintChecker.verify(gene, null, this, i)) {
          throw new InvalidConfigurationException("The gene type " + gene.getClass().getName()
              + " is not allowed to be used in the chromosome due to the"
              + " constraint checker used.");
        }
      }
    }
  }

  /**
   * @return a string representation of this Chromosome, useful for display purposes
   */
  public String toString() {
    StringBuffer representation = new StringBuffer();
    representation.append("/[" + S_SIZE + ":" + size());
    // Don't use getFitnessValue() here as it would then be initialized if
    // it was not. We want to capture the current state here!
    // -------------------------------------------------------------------
    representation.append(", " + S_FITNESS_VALUE + ":" + m_fitnessValue);
    representation.append(", " + S_ALLELES + ":");
    representation.append("[");
    // Append the representations of each of the genes' alleles.
    // ---------------------------------------------------------
    int size = size();
    for (int i = 0; i < size; i++) {
      if (getGene(i) == null) {
        representation.append("null");
      } else {
        Gene gene = getGene(i);
        if (gene instanceof ExprGene) {
          ExprGene exprGene = (ExprGene) getGene(i);
          if (!exprGene.getValue().getExpression().equals(ExprBuilder.TRUE)) {
            if (i > 0) {
              representation.append(", ");
            }
            representation.append(getGene(i).toString());
          }
        } else {
          if (i > 0) {
            representation.append(", ");
          }
          representation.append(getGene(i).toString());
        }
      }
    }
    // representation.append("], Counterexamples: " + negativeCounterexamples);
    representation.append("]");
    representation.append("]/");
    return representation.toString();
  }

  /**
   * Convenience method that returns a new Chromosome instance with its genes values (alleles)
   * randomized.
   */
  public static IChromosome randomInitialChromosome(Configuration a_configuration)
      throws InvalidConfigurationException {
    // Sanity check: make sure the given configuration isn't null.
    // -----------------------------------------------------------
    if (a_configuration == null) {
      throw new IllegalArgumentException("Configuration instance must not be null");
    }
    // Lock the configuration settings so that they can't be changed
    // from now on.
    // -------------------------------------------------------------
    a_configuration.lockSettings();
    // First see if we can get a Chromosome instance from the pool.
    // If we can, we'll randomize its gene values (alleles) and then
    // return it.
    // -------------------------------------------------------------
    IChromosomePool pool = a_configuration.getChromosomePool();
    if (pool != null) {
      IChromosome randomChromosome = pool.acquireChromosome();
      if (randomChromosome != null) {
        Gene[] genes = randomChromosome.getGenes();
        RandomGenerator generator = a_configuration.getRandomGenerator();
        for (int i = 0; i < genes.length; i++) {
          genes[i].setToRandomValue(generator);
          /** @todo what about Gene's energy? */
        }
        randomChromosome.setFitnessValueDirectly(FitnessFunction.NO_FITNESS_VALUE);
        return randomChromosome;
      }
    }
    // We weren't able to get a Chromosome from the pool, so we have to
    // construct a new instance and build it from scratch.
    // ------------------------------------------------------------------
    IChromosome sampleChromosome = a_configuration.getSampleChromosome();
    sampleChromosome.setFitnessValue(FitnessFunction.NO_FITNESS_VALUE);
    Gene[] sampleGenes = sampleChromosome.getGenes();
    Gene[] newGenes = new Gene[sampleGenes.length];
    RandomGenerator generator = a_configuration.getRandomGenerator();
    for (int i = 0; i < newGenes.length; i++) {
      // We use the newGene() method on each of the genes in the
      // sample Chromosome to generate our new Gene instances for
      // the Chromosome we're returning. This guarantees that the
      // new Genes are setup with all of the correct internal state
      // for the respective gene position they're going to inhabit.
      // -----------------------------------------------------------
      newGenes[i] = sampleGenes[i].newGene();
      // Set the gene's value (allele) to a random value.
      // ------------------------------------------------
      newGenes[i].setToRandomValue(generator);
      /** @todo what about Gene's energy? */
    }
    // Finally, construct the new chromosome with the new random
    // genes values and return it.
    // ---------------------------------------------------------
    return new SpecChromosome(a_configuration, newGenes);
  }

  /**
   * Compares this Chromosome against the specified object. The result is true if and the argument
   * is an instance of the InvariantChromosome class and has a set of genes equal to this one.
   */
  public boolean equals(Object other) {
    try {
      return compareTo(other) == 0;
    } catch (ClassCastException cex) {
      return false;
    }
  }

  /**
   * Retrieve a hash code for this Chromosome. Does not considers the order of the Genes for all
   * cases (especially when gene is empty).
   */
  public int hashCode() {
    // Do what java.util.AbstractList does.
    // ------------------------------------
    int geneHashcode;
    int hashCode = 1;
    if (getGenes() != null) {
      int size = size();
      for (int i = 0; i < size; i++) {
        Gene gene = getGene(i);
        if (gene == null) {
          geneHashcode = -55;
        } else {
          geneHashcode = gene.hashCode();
        }
        hashCode = 31 * hashCode + geneHashcode;
      }
    }
    return hashCode;
  }

  // ----------------------------------
  // End of IInitializer implementation
  // ----------------------------------
  public void setMultiObjectives(List a_values) {
    if (m_multiObjective == null) {
      m_multiObjective = new Vector();
    }
    m_multiObjective.clear();
    m_multiObjective.addAll(a_values);
  }

  public List getMultiObjectives() {
    return m_multiObjective;
  }

  /**
   * Get the counterexamples
   * 
   * @return
   */
  public Set<String> getCounterexamples() {
    return counterexamples;
  }

  /**
   * Set the counterexamples
   */
  public void setCounterexamples(Set<String> counterexamples) {
    this.counterexamples = counterexamples;
  }

  /**
   * Set the amount of positive counterexamples
   */
  public void setAmountOfPositiveCounterexamples(Double amount) {
    if (amount < 0)
      throw new IllegalArgumentException();
    positiveCounterexamples = amount;
  }

  /**
   * Get the amount of negative counterexamples
   */
  public Double getAmountOfPositiveCounterexamples() {
    return positiveCounterexamples;
  }

  /**
   * Set the amount of negative counterexamples
   */
  public void setAmountOfNegativeCounterexamples(Double amount) {
    if (amount < 0)
      throw new IllegalArgumentException();
    negativeCounterexamples = amount;
  }

  /**
   * Get the amount of negative counterexamples
   */
  public Double getAmountOfNegativeCounterexamples() {
    return negativeCounterexamples;
  }

  /**
   * Set is result of crossovoer of empty intersection chromosomes
   */
  public void setIsResultOfCrossoverOfEmptyIntersectionChromosomes(boolean b) {
    resultOfCrossoverOfEmtpyIntersectionChromosomes = b;
  }

  /**
   * Get is result of crossover of empty intersection chromosomes
   */
  public boolean getIsResultOfCrossoverOfEmptyIntersectionChromosomes() {
    return resultOfCrossoverOfEmtpyIntersectionChromosomes;
  }

  /**
   * Convert a set of A4Solution examples to a set of strings
   */
  public Set<String> counterexamplesToStringSet() {
    return counterexamples;
  }

  /**
   * Print chromosome as Alloy expression
   */
  public String toStringAsAlloyExpression() {
    String repOKString = "";

    for (int i = 0; i < getGenes().length; i++) {
      ExprGene gene = (ExprGene) getGenes()[i];
      if (!gene.isDefault()) {
        String currentExprString = gene.getValue().getExpression().toString();
        repOKString += "(" + currentExprString + ")";
        if (i < getGenes().length - 1)
          repOKString += " and ";
      }
    }
    return repOKString;
  }

  /**
   * Print the genes
   */
  public void printGenes() {
    System.out.print("\tGenes:");
    System.out.print("[\n");
    int size = getGenes().length;
    for (int i = 0; i < size; i++) {
      if (getGene(i) != null) {
        Gene gene = getGene(i);
        if (gene instanceof IntegerGene) {
          System.out.println("\t\t" + getGene(i).toString());
        } else {
          ExprGene exprGene = (ExprGene) getGene(i);
          if (!exprGene.getValue().getExpression().equals(ExprBuilder.TRUE)) {
            System.out.println("\t\t" + getGene(i).toString());
          }
        }
      }
    }
    System.out
        .println("\t]\n\tPos counterexamples: " + getAmountOfPositiveCounterexamples().intValue());
    System.out.println("\tNeg counterexamples: " + getAmountOfNegativeCounterexamples().intValue());

    if (counterexamplesMutationsStr != null && !counterexamplesMutationsStr.equals("")) {
      System.out.println("\tNeg counterexamples Mutations: {");
      System.out.println(counterexamplesMutationsStr);
      System.out.println("\t}");
    }
  }

  /**
   * Returns the amount of active genes, that is, genes that are not the true expression
   */
  public int getAmountOfActiveGenes() {
    int activeGenes = 0;
    int size = getGenes().length;
    for (int i = 0; i < size; i++) {
      if (getGene(i) != null) {
        ExprGene gene = (ExprGene) getGene(i);
        if (!gene.getValue().getExpression().equals(ExprBuilder.TRUE)) {
          activeGenes++;
        }
      }
    }
    return activeGenes;
  }

  /**
   * Returns the list of expressions that are part of this chromosome
   */
  public List<Expr> toExprList() {
    List<Expr> expressions = new LinkedList<>();
    int size = getGenes().length;
    for (int i = 0; i < size; i++) {
      if (getGene(i) != null) {
        ExprGene gene = (ExprGene) getGene(i);
        if (!gene.getValue().getExpression().equals(ExprBuilder.TRUE))
          expressions.add(gene.getValue().getExpression());
      }
    }
    return expressions;
  }

  /**
   * Returns true if the chromosome is unary (the amount of active genes is one) and is valid (the
   * amount of positive counterexamples is zero)
   */
  public boolean isUnaryAndValid() {
    return getAmountOfActiveGenes() == 1 && positiveCounterexamples == 0;
  }

  /**
   * Returns true if the chromosome is unary (the amount of active genes is one)
   */
  public boolean isUnary() {
    return getAmountOfActiveGenes() == 1;
  }

  /**
   * Set counterexamples mutations string
   */
  public void setCounterexamplesMutationsStr(String str) {
    counterexamplesMutationsStr = str;
  }

  /**
   * Get counterexamples mutations string
   */
  public String getCounterexamplesMutationsStr() {
    return counterexamplesMutationsStr;
  }

}
