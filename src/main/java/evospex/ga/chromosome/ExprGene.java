package evospex.ga.chromosome;

import java.util.List;
import java.util.Random;
import java.util.Set;

import evospex.ga.operator.GASpecLearnerMutations;
import org.jgap.BaseGene;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import org.jgap.RandomGenerator;
import org.jgap.UnsupportedRepresentationException;

import rfm.dynalloy.Err;
import rfm.dynalloyCompiler.ast.Expr;
import rfm.dynalloyCompiler.ast.ExprBinary;
import rfm.dynalloyCompiler.ast.ExprBinary.Op;
import rfm.dynalloyCompiler.ast.ExprCall;
import rfm.dynalloyCompiler.ast.ExprConstant;
import rfm.dynalloyCompiler.ast.ExprList;
import rfm.dynalloyCompiler.ast.ExprQt;
import rfm.dynalloyCompiler.ast.ExprUnary;
import rfm.dynalloyCompiler.ast.ExprVar;
import rfm.dynalloyCompiler.ast.Sig.PrimSig;
import rfm.dynalloyCompiler.ast.Type;
import utils.TargetInformation;
import utils.DynAlloyExpressionsUtils;

/**
 * This class represents a gene. A gene is the basic structure used to build chromosomes. A gene
 * basically contains a value, which will contain the Alloy expression represented by the gene.
 * 
 * @author fmolina
 */
public class ExprGene extends BaseGene implements Gene, java.io.Serializable {

  private ExprGeneValue value;
  private TargetInformation contextInfo;
  private int amountOfGenesInChromosome = 0;
  private boolean isPartOfSolution;

  /**
   * Default constructor with default value (true)
   * 
   * @param a_conf
   * @throws InvalidConfigurationException
   */
  public ExprGene(Configuration a_conf, TargetInformation info)
      throws InvalidConfigurationException {
    super(a_conf);
    this.value = new ExprGeneValue();
    this.contextInfo = info;
    isPartOfSolution = false;
  }

  /**
   * Constructor with a given value
   * 
   * @param a_conf
   * @throws InvalidConfigurationException
   */
  public ExprGene(Configuration a_conf, ExprGeneValue value, TargetInformation info)
      throws InvalidConfigurationException {
    super(a_conf);
    this.value = value;
    this.contextInfo = info;
    isPartOfSolution = false;
  }

  /**
   * Get the Data Structure Information
   */
  public TargetInformation getDataStructureInformation() {
    return contextInfo;
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
   * Returns true if the gene is part of a solution
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

  @Override
  protected Gene newGeneInternal() {
    try {
      return new ExprGene(getConfiguration(), this.value.clone(), this.contextInfo);
    } catch (InvalidConfigurationException ex) {
      throw new IllegalStateException(ex.getMessage());
    }
  }

  /**
   * Sets the value of the gene to the newExprGene
   */
  public void setAllele(Object newExprGeneValue) {
    value = (ExprGeneValue) newExprGeneValue;
  }

  /**
   * Update the previous expression
   */
  private void updatePreviousExpression(ExprGeneValue newValue) {
    if (this.value.getPrevious() == null || !newValue.getExpression().equals(ExprConstant.TRUE)) {
      this.value.setPrevious(newValue);
    }
  }

  /**
   * Retrieves the value represented by this gene
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

  /**
   * Apply mutation according to the gene type
   */
  public void applyMutation(int index, double a_percentage) {
    try {
      updatePreviousExpression(value.clone());
      switch (value.getGeneType()) {
      case CARDINALITY:
        applyCardinalityMutation();
        break;
      case CONSTANT:
        applyConstantMutation();
        break;
      case EMPTYNESS:
        applyEmptynessMutation();
        break;
      case EQUALITY:
        applyEqualityMutation();
        break;
      case INT_COMPARISON:
        applyIntComparisonMutation();
        break;
      case NEGATION:
        applyNegationMutation();
        break;
      case INCLUSION:
        applyInclusionMutation();
        break;
      case FORALL:
        applyForAllMutation();
        break;
      case FORALL_VAR_VALUE:
        applyForAllMutation();
        break;
      case FORALL_VAR_VAR:
        applyForAllVarVarMutation();
        break;
      case FORALL_VAR_VALUE_VAR_VALUE:
        try {
          applyForAllVarValueVarValueMutation();
        } catch (NullPointerException e) {
          e.printStackTrace();
        }
        break;
      case FORALL_VAR_VALUE_VAR_VALUE_INT_COMPARISON:
        applyForAllVarValueVarValueIntComparisonMutation();
        break;
      case FORALL_VAR_VALUES_DOUBLE_INT_COMPARISON:
        applyForAllVarValuesDoubleIntComparisonMutation();
        break;
      case FORALL_VAR_VALUES_DOUBLE_QT_INT_COMPARISON:
        applyForAllVarValuesDoubleQuantificationIntComparisonMutation();
        break;
      case FORALL_VAR_SET:
        applyForAllVarSetMutation();
        break;
      case FORALL_SET_SET:
        applyForAllSetSetMutation();
        break;
      case SOME:
        applySomeMutation();
        break;
      case SOME_VAR_VAR:
        applySomeVarVarMutation();
        break;
      case SOME_VAR_SET:
        applySomeVarSetMutation();
        break;
      case SOME_SET_SET:
        applySomeSetSetMutation();
        break;
      case SOMEQT:
        applySomeQuantifierMutation();
        break;
      case NO:
        applyNoMutation();
        break;
      default:
        applyDefaultMutation();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Apply some quantifier mutation
   */
  private void applySomeQuantifierMutation() throws Err {
    String mutationToApply = getSomeApplicableMutation();

    switch (mutationToApply) {
    case GASpecLearnerMutations.NEGATE_BODY:
      // Negate the body
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.TO_ALL:
      // Create a new expression with the all quantifier
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.TO_TRUE:
      // Set the expression to true
      throw new UnsupportedOperationException("implement this");
    default:
      break;
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator some and the body
   * is a predicate about two variables
   */
  private void applySomeVarVarMutation() throws Err {
    String mutationToApply = getSomeApplicableMutation();
    switch (mutationToApply) {
    case GASpecLearnerMutations.NEGATE_BODY:
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.TO_ALL:
      // Create a new expression with the all quantifier
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.TO_TRUE:
      // Set the expression to true
      throw new UnsupportedOperationException("implement this");
    default:
      break;
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator some and the body
   * is a predicate about two variables
   */
  private void applySomeVarSetMutation() throws Err {
    String mutationToApply = getSomeApplicableMutation();
    if (mutationToApply.equals(GASpecLearnerMutations.NEGATE_BODY)) {
      throw new UnsupportedOperationException("implement this");
    } else {
      if (mutationToApply.equals(GASpecLearnerMutations.TO_ALL)) {
        // Create a new expression with the all quantifier
        throw new UnsupportedOperationException("implement this");
      } else {
        // Set the expression to true
        throw new UnsupportedOperationException("implement this");
      }
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator some and the body
   * is a predicate about two sets
   */
  private void applySomeSetSetMutation() throws Err {
    String mutationToApply = getSomeApplicableMutation();
    switch (mutationToApply) {
    case GASpecLearnerMutations.NEGATE_BODY:
      // Negate the body
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.INTERSECTION_NULL:
      // Take the set s1 and s2 from the body of the expression, and create
      // the body s1 & s2 in Null
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.TO_ALL:
      // Create a new expression with the all quantifier
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.TO_TRUE:
      // Set the expression to true
      throw new UnsupportedOperationException("implement this");
    default:
    }
  }

  /**
   * Apply emptyness mutation
   */
  private void applyEmptynessMutation() {
    String mutationToApply = getSomeApplicableMutation();
    if (mutationToApply.equals(GASpecLearnerMutations.SOME)) {
      // Change some expr to no expr
      throw new UnsupportedOperationException("implement this");
    } else {
      // Set the expression to true
      throw new UnsupportedOperationException("implement this");
    }
  }

  /**
   * Apply default mutation
   */
  private void applyDefaultMutation() {
    // TODO Auto-generated method stub
  }

  /**
   * Apply mutation when the gene expression is some
   */
  private void applySomeMutation() {
    String mutationToApply = getSomeApplicableMutation();
    if (mutationToApply.equals(GASpecLearnerMutations.EMPTYNESS)) {
      // Change some expr to no expr
      throw new UnsupportedOperationException("implement this");
    } else {
      // Set the expression to true
      throw new UnsupportedOperationException("implement this");
    }
  }

  /**
   * Apply mutation when the gene expression is no and set the expression to some
   */
  private void applyNoMutation() {
    String mutationToApply = getSomeApplicableMutation();
    if (mutationToApply.equals(GASpecLearnerMutations.TO_SOME)) {
      // Change no expr to some expr
      throw new UnsupportedOperationException("implement this");
    } else {
      // Set the expression to true
      throw new UnsupportedOperationException("implement this");
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all
   */
  private void applyForAllMutation() throws Err {
    String mutationToApply = getSomeApplicableMutation();
    if (mutationToApply.equals(GASpecLearnerMutations.NEGATE_BODY)) {
      // Create the for all expression with the negated body
      throw new UnsupportedOperationException("implement this");
    } else {
      if (mutationToApply.equals(GASpecLearnerMutations.TO_SOME)) {
        // Create a new expression with the some quantifier
        throw new UnsupportedOperationException("implement this");
      } else {
        // Set the expression to true
        throw new UnsupportedOperationException("implement this");
      }
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about two variables
   */
  private void applyForAllVarVarMutation() throws Err {
    String mutationToApply = getSomeApplicableMutation();
    switch (mutationToApply) {
    case GASpecLearnerMutations.NEGATE_BODY:
      // Create the for all expression with the negated body
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.JOIN_COMPATIBLE_EXPR:
      // Append a compatible expression in the right side of the body
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.TO_SOME:
      // Create a new expression with the some quantifier
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.TO_TRUE:
      // Set the expression to true
      throw new UnsupportedOperationException("implement this");
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about some relation of two variables n.value=v0 OP n.g.value=v0
   */
  private void applyForAllVarValueVarValueMutation() throws Err {
    String mutationToApply = getSomeApplicableMutation();
    switch (mutationToApply) {
    case GASpecLearnerMutations.NEGATE_BODY:
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.REPLACE_VALUE:
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.NEGATE_RIGHT_EQUALITY:
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.TO_TRUE:
      // Set the expression to true
      throw new UnsupportedOperationException("implement this");
    }

  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about some relation of two variables values of int type op [n.value,n.g.value]
   */
  private void applyForAllVarValueVarValueIntComparisonMutation() throws Err {
    String mutationToApply = getSomeApplicableMutation();
    Expr expr;
    Expr newBody;
    switch (mutationToApply) {
    case GASpecLearnerMutations.OP_NOT_EQ:
      // Change the operator to !=
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.OP_LT:
      // Change the operator to <
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.OP_LTE:
      // Change the operator to <=
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.OP_GT:
      // Change the operator to >
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.OP_GTE:
      // Change the operator to >=
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.CHANGE_IMPLIES:
      // Change implies equality
      throw new UnsupportedOperationException("implement this");
    }

  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about some relation like op[n.value,n.f.value] AND op[n.value,n.g.value]
   */
  private void applyForAllVarValuesDoubleIntComparisonMutation() throws Err {
    String mutationToApply = getSomeApplicableMutation();
    Expr newLeft;
    Expr newRight;
    Expr exprR1;
    Expr exprR2;
    Expr newBody;
    switch (mutationToApply) {
    case GASpecLearnerMutations.OP_NOT_EQ:
      // Change the operator to != in the left
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.OP_LT:
      // Change the operator to < in the left
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.OP_LTE:
      // Change the operator to <= in the left
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.OP_GT:
      // Change the operator to > in the left
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.OP_GTE:
      // Change the operator to >= in the left
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.CHANGE_IMPLIES:
      // Change implies equality
      throw new UnsupportedOperationException("implement this");
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all
   */
  private void applyForAllVarValuesDoubleQuantificationIntComparisonMutation() throws Err {
    String mutationToApply = getSomeApplicableMutation();
    if (GASpecLearnerMutations.TO_TRUE.equals(mutationToApply)) {
      throw new UnsupportedOperationException("implement this");
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about a variable and a set
   */
  private void applyForAllVarSetMutation() throws Err {
    String mutationToApply = getSomeApplicableMutation();
    if (mutationToApply.equals(GASpecLearnerMutations.NEGATE_BODY)) {
      // Create the for all expression with the negated body
      throw new UnsupportedOperationException("implement this");
    } else {
      if (mutationToApply.equals(GASpecLearnerMutations.TO_SOME)) {
        // Create a new expression with the some quantifier
        throw new UnsupportedOperationException("implement this");
      } else {
        // Set the expression to true
        throw new UnsupportedOperationException("implement this");
      }
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about two sets
   */
  private void applyForAllSetSetMutation() throws Err {
    String mutationToApply = getSomeApplicableMutation();

    switch (mutationToApply) {
    case GASpecLearnerMutations.NEGATE_BODY:
      // Negate the body just if gene expression is not the intersection in null
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.INTERSECTION_NULL:
      // Take the set s1 and s2 from the body of the expression, and create
      // the body s1 & s2 in Null
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.TO_SOME:
      // Create a new expression with the some quantifier
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.TO_TRUE:
      // Set the expression to true
      throw new UnsupportedOperationException("implement this");
    default:
    }
  }

  /**
   * Apply mutation when the gene expression is in
   */
  private void applyInclusionMutation() {
    String mutationToApply = getSomeApplicableMutation();
    switch (mutationToApply) {
    case GASpecLearnerMutations.NEGATE:
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.REPLACE_INCLUDED:
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.REPLACE_SET:
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.TO_TRUE:
      throw new UnsupportedOperationException("implement this");
    default:
    }
  }

  /**
   * Apply mutation when the gene expression is equal or not equal
   */
  private void applyEqualityMutation() {
    throw new UnsupportedOperationException("implement this");
  }

  /**
   * Apply mutation when the gene expression is an int comparison ( int [=,<>,<,>,<=,>=] int)
   * 
   * @throws Err
   */
  private void applyIntComparisonMutation() throws Err {
    String mutationToApply = getSomeApplicableMutation();
    switch (mutationToApply) {
    case GASpecLearnerMutations.NEGATE:
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.ADD_ONE:
      // Add one at the right expression
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.SUB_ONE:
      // Subtract one at the right expression
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.ADD_EXPR:
      // Add a random integer expression to the right expression
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.SUB_EXPR:
      // Subtract a random integer expression to the right expression
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.REPLACE_RIGHT:
      // Replace the right expression
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.REPLACE_OP:
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.EQ_SUB_ONE:
      // Create eq expression and subtract one at the right expression
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.OP_EQ:
      // Now the operator will be =
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.OP_LT:
      // Now the operator will be <
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.OP_LTE:
      // Now the operator will be <=
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.OP_GT:
      // Now the operator will be >
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.OP_GTE:
      // Now the operator will be >=
      throw new UnsupportedOperationException("implement this");
    case GASpecLearnerMutations.TO_TRUE:
      // Set the expression to true
      throw new UnsupportedOperationException("implement this");
    default:
      throw new IllegalStateException("Mutation " + mutationToApply + " not implemented!");
    }
  }

  /**
   * Gets randomly an applicable mutation for the current gene type
   */
  private String getSomeApplicableMutation() {
    List<String> mutations = value.getGeneType().getApplicableMutations(amountOfGenesInChromosome,
        isPartOfSolution);
    if (mutations.size() > 0) {
      Random random = new Random();
      int randomNumber = random.nextInt(mutations.size());
      return mutations.get(randomNumber);
    }
    return "";
  }

  /**
   * Apply mutation when the gene expression is not
   */
  private void applyNegationMutation() {
    String mutationToApply = getSomeApplicableMutation();
    if (mutationToApply.equals("Negate")) {
      // Negate the expression, that is remove the not operator
      throw new UnsupportedOperationException("implement this");
    } else {
      // Set the expression to true
      throw new UnsupportedOperationException("implement this");
    }
  }

  /**
   * Apply mutation when the gene expression is constant
   */
  private void applyConstantMutation() {
    String mutationToApply = getSomeApplicableMutation();
    if (mutationToApply.equals("Previous")) {
      // Get some previous expression
      Random random = new Random();
      int randomNumber = random.nextInt(1);
      value = value.getPrevious();
    }
  }

  /**
   * Apply mutation when the gene expression is cardinality
   */
  private void applyCardinalityMutation() throws Err {
    String mutationToApply = getSomeApplicableMutation();
    if (mutationToApply.equals(GASpecLearnerMutations.ADD_ONE)) {
      // Add one at the right expression
      throw new UnsupportedOperationException("implement this");

    } else if (mutationToApply.equals(GASpecLearnerMutations.SUB_ONE)) {
      // Subtract one at the right expression
      throw new UnsupportedOperationException("implement this");
    } else {
      // Set the expression to true
      throw new UnsupportedOperationException("implement this");
    }
  }

  @Override
  public Object getInternalValue() {
    return (ExprGeneValue) value;
  }

  public int compareTo(ExprGene other) {
    if (value.getExpression().equals(other.getValue().getExpression())) {
      return 0;
    } else {
      return 1;
    }
  }

  /**
   * Returns true if this gene has the default value true.
   */
  public boolean isDefault() {
    return value.getExpression().equals(ExprConstant.TRUE);
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
      representation = getInternalValue().toString();
    }
    return representation;
  }

  public ExprGene clone() {
    try {
      return new ExprGene(getConfiguration(), this.value.clone(), this.contextInfo);
    } catch (InvalidConfigurationException ex) {
      throw new IllegalStateException(ex.getMessage());
    }
  }

}
