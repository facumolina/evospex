package evospex.ga.chromosome.gene;

import java.util.List;
import java.util.Random;
import evospex.expression.ExprBuilder;
import evospex.ga.chromosome.gene.value.ExprGeneValue;
import evospex.ga.operator.ExprGeneMutationHelper;
import org.jgap.BaseGene;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import org.jgap.RandomGenerator;
import org.jgap.UnsupportedRepresentationException;
import utils.TargetInformation;

/**
 * This class represents a gene. A gene is the basic structure used to build chromosomes. A gene
 * contains a value, which essentially contains the expression represented by the gene.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public abstract class ExprGene extends BaseGene implements Gene, java.io.Serializable {

  protected ExprGeneValue value;
  protected final TargetInformation targetInfo;
  private int amountOfGenesInChromosome = 0;
  private boolean isPartOfSolution;

  /**
   * Default constructor with a default value (true)
   * @param a_conf is the configuration object
   * @param info is the target information object
   */
  public ExprGene(Configuration a_conf, TargetInformation info) throws InvalidConfigurationException {
    super(a_conf);
    this.value = new ExprGeneValue();
    this.targetInfo = info;
    isPartOfSolution = false;
  }

  /**
   * Constructor with a given value
   * @param a_conf is the configuration object
   * @param value is the given expression value to be part of this gene
   * @param info is the target information object
   */
  public ExprGene(Configuration a_conf, ExprGeneValue value, TargetInformation info)
      throws InvalidConfigurationException {
    super(a_conf);
    this.value = value;
    this.targetInfo = info;
    isPartOfSolution = false;
  }

  /**
   * Get the target information
   */
  public TargetInformation getTargetInformation() {
    return targetInfo;
  }

  /**
   * Get the amount of genes in the chromosome that contains this gene
   */
  public int getAmountOfGenesInChromosome() {
    return amountOfGenesInChromosome;
  }

  /**
   * Set the amount of genes in the chromosome that contains this gene
   */
  public void setAmountOfGenesInChromosome(int n) {
    amountOfGenesInChromosome = n;
  }

  /**
   * Returns true if this gene is part of a solution
   */
  public boolean isPartOfSolution() {
    return isPartOfSolution;
  }

  /**
   * Set is part of solution
   */
  public void setIsPartOfSolution(boolean partOfSolution) {
    this.isPartOfSolution = partOfSolution;
  }

  /**
   * Sets the given expression value as the new value for this gene
   */
  public void setAllele(Object newExprGeneValue) {
    value = (ExprGeneValue) newExprGeneValue;
  }

  /**
   * Update the previous expression
   */
  public void updatePreviousExpression(ExprGeneValue newValue) {
    if (this.value.getPrevious() == null || !newValue.getExpression().equals(ExprBuilder.TRUE)) {
      this.value.setPrevious(newValue);
    }
  }

  /**
   * Returns the expression value represented by this gene
   */
  public Object getAllele() {
    return value;
  }

  /**
   * Set value
   */
  public void setValue(ExprGeneValue newValue) {
    updatePreviousExpression(value.clone());
    value = newValue;
  }

  /**
   * Sets the value of this gene to a random legal value
   */
  public void setToRandomValue(RandomGenerator a_numberGenerator) {
    value = new ExprGeneValue();
  }

  /**
   * Retrieves a string representation of the value of this Gene instance
   */
  public String getPersistentRepresentation() throws UnsupportedOperationException {
    return value.toString();
  }

  /**
   * Sets the value and internal state of this Gene from the string representation returned by a
   * previous invocation of the getPersistentRepresentation() method.
   */
  public void setValueFromPersistentRepresentation(String a_representation)
      throws UnsupportedOperationException, UnsupportedRepresentationException {
    // TODO Auto-generated method stub
  }

  /**
   * Compares this Gene with the specified object for order.
   */
  public int compareTo(Object otherExprGene) {
    return value.toString().compareTo(((ExprGene) otherExprGene).getValue().toString());
  }

  /**
   * Gets the value
   */
  public ExprGeneValue getValue() {
    return value;
  }

  @Override
  public Gene newGene() {
    Gene result = this.newGeneInternal();
    result.setConstraintChecker(this.getConstraintChecker());
    result.setEnergy(this.getEnergy());
    result.setApplicationData(this.getApplicationData());
    return result;
  }

  /**
   * Return a mutated gene from this gene
   * We will use this method for mutations since in certain situations a mutation may return a different type of gene.
   */
  public abstract ExprGene mutate() throws org.jgap.InvalidConfigurationException;

  /**
   * Gets randomly an applicable mutation for the current gene type
   */
  protected String getSomeApplicableMutation() {
    List<String> mutations = ExprGeneMutationHelper.getApplicableMutations(this);
    if (mutations.size() > 0) {
      Random random = new Random();
      int randomNumber = random.nextInt(mutations.size());
      return mutations.get(randomNumber);
    }
    throw new IllegalStateException("Can't find mutations for gene: "+this);
  }

  @Override
  public Object getInternalValue() {
    return value;
  }

  /**
   * Returns true if this gene has the default value true.
   */
  public boolean isDefault() {
    return value.getExpression().equals(ExprBuilder.TRUE);
  }

  /**
   * Retrieves a string representation of the Expr Gene
   */
  @Override
  public String toString() {
    String representation;
    if (getInternalValue() == null) {
      representation = "null";
    } else {
      representation = getInternalValue().toString() + " - " + this.getClass().getSimpleName();
    }
    return representation;
  }

}