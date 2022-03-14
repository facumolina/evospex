package evospex.ga.chromosome.gene;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.ExprGrammarParser.Unary_opContext;
import evospex.expression.ExprGrammarParser.Qt_exprContext;
import evospex.expression.ExprGrammarParser.Compare_opContext;
import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.ExprGrammarParser.Set_exprContext;

import evospex.expression.symbol.ExprDelimiter;
import evospex.expression.symbol.ExprName;
import evospex.expression.symbol.ExprOperator;
import evospex.ga.chromosome.gene.type.ExprGeneType;
import evospex.ga.chromosome.gene.value.ExprGeneValue;
import evospex.ga.operator.ExprGeneMutationHelper;
import evospex.ga.operator.ExprGeneMutations;
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
   * @throws InvalidConfigurationException
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
   * @throws InvalidConfigurationException
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
   * Apply some quantifier mutation
   */
  protected ExprGene applySomeQuantifierMutation() throws InvalidConfigurationException {
    String mutationToApply = getSomeApplicableMutation();

    switch (mutationToApply) {
    case ExprGeneMutations.NEGATE_BODY:
      // Negate the body
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.TO_ALL:
      // Create a new expression with the all quantifier
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.TO_TRUE:
      // Set the expression to true
      ConstantGene trueGene = new ConstantGene(getConfiguration(), targetInfo);
      trueGene.updatePreviousExpression(value);
      return trueGene;
    default:
      throw new UnsupportedOperationException("implement this");
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator some and the body
   * is a predicate about two variables
   */
  protected ExprGene applySomeVarVarMutation() throws InvalidConfigurationException {
    String mutationToApply = getSomeApplicableMutation();
    switch (mutationToApply) {
    case ExprGeneMutations.NEGATE_BODY:
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.TO_ALL:
      // Create a new expression with the all quantifier
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.TO_TRUE:
      // Set the expression to true
      ConstantGene trueGene = new ConstantGene(getConfiguration(), targetInfo);
      trueGene.updatePreviousExpression(value);
      return trueGene;
    default:
      throw new UnsupportedOperationException("implement this");
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator some and the body
   * is a predicate about two variables
   */
  protected ExprGene applySomeVarSetMutation() {
    String mutationToApply = getSomeApplicableMutation();
    if (mutationToApply.equals(ExprGeneMutations.NEGATE_BODY)) {
      throw new UnsupportedOperationException("implement this");
    } else {
      if (mutationToApply.equals(ExprGeneMutations.TO_ALL)) {
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
  protected ExprGene applySomeSetSetMutation() throws InvalidConfigurationException {
    String mutationToApply = getSomeApplicableMutation();
    switch (mutationToApply) {
    case ExprGeneMutations.NEGATE_BODY:
      // Negate the body
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.INTERSECTION_NULL:
      // Take the set s1 and s2 from the body of the expression, and create
      // the body s1 & s2 in Null
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.TO_ALL:
      // Create a new expression with the all quantifier
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.TO_TRUE:
      // Set the expression to true
      ConstantGene trueGene = new ConstantGene(getConfiguration(), targetInfo);
      trueGene.updatePreviousExpression(value);
      return trueGene;
    default:
      throw new UnsupportedOperationException("implement this");
    }
  }

  /**
   * Apply emptyness mutation
   */
  protected ExprGene applyEmptynessMutation() {
    String mutationToApply = getSomeApplicableMutation();
    if (mutationToApply.equals(ExprGeneMutations.SOME)) {
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
  protected ExprGene applyDefaultMutation() {
    throw new UnsupportedOperationException("implement this");
  }

  /**
   * Apply mutation when the gene expression is some
   */
  protected ExprGene applySomeMutation() {
    String mutationToApply = getSomeApplicableMutation();
    if (mutationToApply.equals(ExprGeneMutations.EMPTYNESS)) {
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
  protected ExprGene applyNoMutation() {
    String mutationToApply = getSomeApplicableMutation();
    if (mutationToApply.equals(ExprGeneMutations.TO_SOME)) {
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
  protected ExprGene applyForAllMutation() throws InvalidConfigurationException {
    String mutationToApply = getSomeApplicableMutation();
    Expr expr = value.getExpression();
    Qt_exprContext qt_expr = expr.exprCtx().qt_expr();
    if (qt_expr == null)
      throw new IllegalStateException("The current expression is not a quantified expression");
    ExprContext body = qt_expr.expr();
    Set_exprContext set =  qt_expr.set_expr();
    if (ExprGeneMutations.NEGATE_BODY.equals(mutationToApply)) {
      // Create the for all expression with the negated body
      String newBodyStr = ExprOperator.NOT_1 + ExprDelimiter.LP + body.getText() + ExprDelimiter.RP;
      if (body.unary_op()!=null && ExprOperator.NOT_1.equals(body.unary_op().getText())) {
        // The body is already negated, so just remove the negation operation
        newBodyStr = body.expr().get(0).getText();
      }
      Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
      value.setExpression(newExpr, false);
      return this;
    } else if (ExprGeneMutations.TO_SOME.equals(mutationToApply)) {
      // Create a new expression with the some quantifier
      throw new UnsupportedOperationException("implement this");
    } else if (ExprGeneMutations.TO_TRUE.equals(mutationToApply)) {
      ConstantGene trueGene = new ConstantGene(getConfiguration(), targetInfo);
      trueGene.updatePreviousExpression(value);
      return trueGene;
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: "+mutationToApply);
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and
   * the body is about one value
   */
  protected ExprGene applyForAllVarValueMutation() throws InvalidConfigurationException {
    throw new IllegalStateException("We should not be here!!!");
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about two variables
   */
  protected ExprGene applyForAllVarVarMutation() throws InvalidConfigurationException {
    throw new IllegalStateException("We should not be here!!!");
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about some relation of two variables n.value=v0 OP n.g.value=v0
   */
  protected ExprGene applyForAllVarValueVarValueMutation() throws InvalidConfigurationException {
    throw new IllegalStateException("We should not be here!!!");
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about some relation like op[n.value,n.f.value] AND op[n.value,n.g.value]
   */
  protected ExprGene applyForAllVarValuesDoubleIntComparisonMutation() {
    String mutationToApply = getSomeApplicableMutation();
    switch (mutationToApply) {
    case ExprGeneMutations.OP_NOT_EQ:
      // Change the operator to != in the left
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.OP_LT:
      // Change the operator to < in the left
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.OP_LTE:
      // Change the operator to <= in the left
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.OP_GT:
      // Change the operator to > in the left
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.OP_GTE:
      // Change the operator to >= in the left
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.CHANGE_IMPLIES:
      // Change implies equality
      throw new UnsupportedOperationException("implement this");
    }
    return this;
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all
   */
  protected ExprGene applyForAllVarValuesDoubleQuantificationIntComparisonMutation() throws InvalidConfigurationException {
    String mutationToApply = getSomeApplicableMutation();
    if (ExprGeneMutations.TO_TRUE.equals(mutationToApply)) {
      ConstantGene trueGene = new ConstantGene(getConfiguration(), targetInfo);
      trueGene.updatePreviousExpression(value);
      return trueGene;
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: "+mutationToApply);
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about a variable and a set
   */
  protected ExprGene applyForAllVarSetMutation() throws InvalidConfigurationException {
    Expr expr = value.getExpression();
    String mutationToApply = getSomeApplicableMutation();
    Qt_exprContext qt_expr = expr.exprCtx().qt_expr();
    if (qt_expr == null)
      throw new IllegalStateException("The current expression is not a quantified expression");
    ExprContext body = qt_expr.expr();
    Set_exprContext set =  qt_expr.set_expr();
    if (mutationToApply.equals(ExprGeneMutations.NEGATE_BODY)) {
      // Create the for all expression with the negated body
      String newBodyStr = ExprOperator.NOT_1 + ExprDelimiter.LP + body.getText() + ExprDelimiter.RP;
      if (ExprOperator.NOT_1.equals(body.unary_op())) {
        // The body is already negated, so just remove the negation operation
        newBodyStr = body.expr().get(0).getText();
      }
      if (newBodyStr.contains(ExprName.QT_VAR + ExprOperator.IN + ExprName.QT_VAR)) {
        newBodyStr = newBodyStr.replace(ExprName.QT_VAR + ExprOperator.IN + ExprName.QT_VAR,ExprName.QT_VAR + " " + ExprOperator.IN + " " + ExprName.QT_VAR);
      }
      Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
      value.setExpression(newExpr, false);
      return this;
    } else if (mutationToApply.equals(ExprGeneMutations.TO_SOME)) {
      // Create a new expression with the some quantifier
      throw new UnsupportedOperationException("implement this");
    } else if (mutationToApply.equals(ExprGeneMutations.TO_TRUE)) {
      // Set the expression to true
      ConstantGene trueGene = new ConstantGene(getConfiguration(), targetInfo);
      trueGene.updatePreviousExpression(value);
      return trueGene;
    } else {
      throw new UnsupportedOperationException("implement this");
    }

  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about two sets
   */
  protected ExprGene applyForAllSetSetMutation() throws InvalidConfigurationException {
    String mutationToApply = getSomeApplicableMutation();

    switch (mutationToApply) {
    case ExprGeneMutations.NEGATE_BODY:
      // Negate the body just if gene expression is not the intersection in null
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.INTERSECTION_NULL:
      // Take the set s1 and s2 from the body of the expression, and create
      // the body s1 & s2 in Null
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.TO_SOME:
      // Create a new expression with the some quantifier
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.TO_TRUE:
      // Set the expression to true
      ConstantGene trueGene = new ConstantGene(getConfiguration(), targetInfo);
      trueGene.updatePreviousExpression(value);
      return trueGene;
    default:
      throw new UnsupportedOperationException("implement this");
    }
  }

  /**
   * Apply mutation when the gene expression is in
   */
  protected ExprGene applyInclusionMutation() throws InvalidConfigurationException {
    throw new IllegalStateException("We should not be here!!!");
  }

  /**
   * Apply mutation when the gene expression is equal or not equal
   */
  protected ExprGene applyEqualityMutation() {
    throw new IllegalStateException("We should not be here!!!");
  }

  /**
   * Apply mutation when the gene expression is an int comparison ( int [=,<>,<,>,<=,>=] int)
   */
  protected ExprGene applyIntComparisonMutation() throws InvalidConfigurationException {
    throw new IllegalStateException("We should not be here!!!");
  }

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

  /**
   * Apply mutation when the gene expression is not
   */
  protected ExprGene applyNegationMutation() {
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
  protected ExprGene applyConstantMutation() {
    throw new IllegalStateException("We should not be here!!!");
  }

  /**
   * Apply mutation when the gene expression is cardinality
   */
  protected ExprGene applyCardinalityMutation() {
    throw new IllegalStateException("We should not be here!!!");
  }

  @Override
  public Object getInternalValue() {
    return value;
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
