package evospex.ga.chromosome;

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
import evospex.ga.operator.GASpecLearnerMutations;
import org.jgap.BaseGene;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import org.jgap.RandomGenerator;
import org.jgap.UnsupportedRepresentationException;
import org.jgap.gp.function.Exp;
import rfm.dynalloy.Err;
import utils.TargetInformation;

/**
 * This class represents a gene. A gene is the basic structure used to build chromosomes. A gene
 * contains a value, which essentially contains the expression represented by the gene.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ExprGene extends BaseGene implements Gene, java.io.Serializable {

  private ExprGeneValue value;
  private TargetInformation contextInfo;
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
    this.contextInfo = info;
    isPartOfSolution = false;
  }

  /**
   * Constructor with a given value
   * @param a_conf is the configuration object
   * @param value is the given expression value to be part of this gene
   * @para info is the target information object
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
   * Get the target information
   */
  public TargetInformation getTargetInformation() {
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

  @Override
  protected Gene newGeneInternal() {
    try {
      return new ExprGene(getConfiguration(), this.value.clone(), this.contextInfo);
    } catch (InvalidConfigurationException ex) {
      throw new IllegalStateException(ex.getMessage());
    }
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
  private void updatePreviousExpression(ExprGeneValue newValue) {
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
  private void applyForAllVarVarMutation() {
    String mutationToApply = getSomeApplicableMutation();
    Expr expr = value.getExpression();
    Qt_exprContext qt_expr = expr.exprCtx().qt_expr();
    if (qt_expr == null)
      throw new IllegalStateException("The current expression is not a quantified expression");
    ExprContext body = qt_expr.expr();
    Set_exprContext set =  qt_expr.set_expr();
    if (GASpecLearnerMutations.NEGATE_BODY.equals(mutationToApply)) {
      // Create the for all expression with the negated body
      String newBodyStr = ExprOperator.NOT_1 + ExprDelimiter.LP + body.getText() + ExprDelimiter.RP;
      if (body.unary_op()!=null && ExprOperator.NOT_1.equals(body.unary_op().getText())) {
        // The body is already negated, so just remove the negation operation
        newBodyStr = body.expr().get(0).getText();
      }
      Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
      value.setExpression(newExpr, false);
    } else if (GASpecLearnerMutations.JOIN_COMPATIBLE_EXPR.equals(mutationToApply)) {
      // Append a compatible expression in the right side of the body
      List<ExprContext> expressions = body.expr();
      Compare_opContext op = body.compare_op();
      if (expressions.size()!=2) {
        Unary_opContext unary = body.unary_op();
        if (unary == null || expressions.size()!=1 || expressions.get(0).expr().size()!=2)
          throw new IllegalStateException("Invalid quantified expression body: "+body.getText());
        ExprContext e = expressions.get(0);
        op = e.compare_op(); // The op now is the op that is in the
        ExprContext leftExpr = e.expr(0);
        ExprContext rightExpr = e.expr(1);
        List<Expr> joineableExprs = contextInfo.getJoineableExpressionsOfCurrentTypeMaintainigReturnType(rightExpr);
        if (joineableExprs.size() > 0) {
          Expr joineableExpr = joineableExprs.get(0);
          String newBodyStr = leftExpr.getText() + " " + op.getText() + " " + rightExpr.getText() + ExprOperator.JOIN + joineableExpr.toString();
          newBodyStr = unary.getText() + ExprDelimiter.LP + newBodyStr +  ExprDelimiter.RP;
          Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
          value.setExpression(newExpr, false);
        }
      } else {
        ExprContext leftExpr = expressions.get(0);
        ExprContext rightExpr = expressions.get(1);
        List<Expr> joineableExprs = contextInfo
                .getJoineableExpressionsOfCurrentTypeMaintainigReturnType(rightExpr);
        if (joineableExprs.size() > 0) {
          Expr joineableExpr = joineableExprs.get(0);
          String newBodyStr = leftExpr.getText() + " " + op.getText() + " " + rightExpr.getText() + ExprOperator.JOIN + joineableExpr.toString();
          Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
          value.setExpression(newExpr, false);
        }
      }
    } else if (GASpecLearnerMutations.TO_SOME.equals(mutationToApply)) {
      // Create a new expression with the some quantifier
      throw new UnsupportedOperationException("implement this");
    } else if (GASpecLearnerMutations.TO_TRUE.equals(mutationToApply)) {
      // Set the expression to true
      value.setExpression(ExprBuilder.TRUE, false);
      value.setGeneType(ExprGeneType.CONSTANT);
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: "+mutationToApply);
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
    Expr expr = value.getExpression();
    String mutationToApply = getSomeApplicableMutation();
    Qt_exprContext qt_expr = expr.exprCtx().qt_expr();
    if (qt_expr == null)
      throw new IllegalStateException("The current expression is not a quantified expression");
    ExprContext body = qt_expr.expr();
    Set_exprContext set =  qt_expr.set_expr();
    if (mutationToApply.equals(GASpecLearnerMutations.NEGATE_BODY)) {
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
    } else if (mutationToApply.equals(GASpecLearnerMutations.TO_SOME)) {
      // Create a new expression with the some quantifier
      throw new UnsupportedOperationException("implement this");
    } else if (mutationToApply.equals(GASpecLearnerMutations.TO_TRUE)) {
      // Set the expression to true
      value.setExpression(ExprBuilder.TRUE, false);
      value.setGeneType(ExprGeneType.CONSTANT);
    } else {
      throw new UnsupportedOperationException("implement this");
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
    Expr expr  = value.getExpression();
    List<ExprContext> expressions = expr.exprCtx().expr();
    if (expressions.size() != 2)
      throw new IllegalStateException("The expression "+expr+" should only have two expressions");
    ExprContext left = expressions.get(0);
    ExprContext right = expressions.get(1);
    if (GASpecLearnerMutations.NEGATE.equals(mutationToApply)) {
      System.out.println("--------------");
      System.out.println("Negating inclusion");
      System.out.println("Original: " + expr);
      Compare_opContext op = expr.exprCtx().compare_op();
      if (!op.getText().equals(ExprOperator.IN) && !op.getText().equals(ExprOperator.NOT_IN))
        throw new IllegalStateException("Can't negate inclusion with operator " + op.getText());
      String newOp = op.getText().equals(ExprOperator.IN) ? ExprOperator.NOT_IN : ExprOperator.IN;
      Expr newExpr = ExprBuilder.toExpr(left.getText() + " " + newOp + " " + right.getText(), Boolean.class);
      System.out.println("Mutated: " + newExpr);
      value.setExpression(newExpr, false);
    } else if (GASpecLearnerMutations.REPLACE_INCLUDED.equals(mutationToApply)) {
        throw new UnsupportedOperationException("implement this");
    } else if (GASpecLearnerMutations.REPLACE_SET.equals(mutationToApply)) {
      System.out.println("--------------");
      System.out.println("Replacing set");
      System.out.println("Original: " + expr);
      System.out.println("Elems in set: " + expr.classOfElemsInSet());
      Set<Expr> possibleCollections = TargetInformation.getCollectionsOfType(expr.classOfElemsInSet());
      if (possibleCollections!=null && possibleCollections.size() > 0) {
        throw new UnsupportedOperationException("implement this");
      }
    } else if (GASpecLearnerMutations.TO_TRUE.equals(mutationToApply)) {
      value.setExpression(ExprBuilder.TRUE, false);
      value.setGeneType(ExprGeneType.CONSTANT);
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: " + mutationToApply);
    }
  }

  /**
   * Apply mutation when the gene expression is equal or not equal
   */
  private void applyEqualityMutation() {
    String mutationToApply = getSomeApplicableMutation();
    Expr expr = value.getExpression();

    // Check the expression is adequate
    Compare_opContext cmp_op = expr.exprCtx().compare_op();
    if (cmp_op==null)
      throw new IllegalStateException("The expression "+expr+" should be a comparison with = or !=");
    List<ExprContext> expressions = expr.exprCtx().expr();
    if (expressions.size() != 2)
      throw new IllegalStateException("The expression "+expr+" should only have two expressions");

    if (mutationToApply.equals(GASpecLearnerMutations.NEGATE)) {
      ExprContext left = expressions.get(0);
      ExprContext right = expressions.get(1);
      String new_op = cmp_op.getText().equals(ExprOperator.EQ)?ExprOperator.NOT_EQ:ExprOperator.EQ;
      Expr mutatedExpr = ExprBuilder.toExpr(left.getText() + " " + new_op + " " + right.getText(), Boolean.class);
      value.setExpression(mutatedExpr, false);
    } else if (mutationToApply.equals(GASpecLearnerMutations.TO_TRUE)){
      value.setExpression(ExprBuilder.TRUE, false);
      value.setGeneType(ExprGeneType.CONSTANT);
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: " + mutationToApply);
    }
  }

  /**
   * Apply mutation when the gene expression is an int comparison ( int [=,<>,<,>,<=,>=] int)
   * 
   * @throws Err
   */
  private void applyIntComparisonMutation() throws Err {
    String mutationToApply = getSomeApplicableMutation();
    Expr expr = value.getExpression();
    Expr newExpr;
    List<ExprContext> exprs = expr.exprCtx().expr();
    if (exprs.size() != 2)
      throw new IllegalStateException("The expression is not a numeric comparison: "+expr);
    String op = expr.exprCtx().compare_op().getText();
    ExprContext left = exprs.get(0);
    ExprContext right = exprs.get(1);
    switch (mutationToApply) {
    case GASpecLearnerMutations.NEGATE:
      System.out.println("-------------");
      System.out.println("Negating op");
      System.out.println("Original: "+expr);
      newExpr = ExprBuilder.toExpr(ExprOperator.NOT_1 + ExprDelimiter.LP + expr.exprCtx().getText() + ExprDelimiter.RP, Boolean.class);
      System.out.println("Mutated: "+newExpr);
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.INT_COMPARISON);
      break;
    case GASpecLearnerMutations.ADD_ONE:
      // Add one at the right expression
      System.out.println("-------------");
      System.out.println("Add one");
      System.out.println("Original: "+expr);
      newExpr = ExprBuilder.toExpr(left.getText() + " " + op + " " + right.getText() + " "
              + ExprOperator.PLUS + " " + ExprBuilder.ONE, Boolean.class);
      System.out.println("Mutated: "+newExpr);
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.INT_COMPARISON);
      break;
    case GASpecLearnerMutations.SUB_ONE:
      // Subtract one at the right expression
      System.out.println("-------------");
      System.out.println("Sub one");
      System.out.println("Original: "+expr);
      newExpr = ExprBuilder.toExpr(left.getText() + " " + op + " " + right.getText() + " "
              + ExprOperator.MINUS + " " + ExprBuilder.ONE, Boolean.class);
      System.out.println("Mutated: "+newExpr);
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.INT_COMPARISON);
    case GASpecLearnerMutations.ADD_EXPR:
      // Add a random integer expression to the right expression
      Expr exprToAdd = contextInfo.getRandomIntExpr();
      System.out.println("-------------");
      System.out.println("Add expr");
      System.out.println("Original: "+expr);
      newExpr = ExprBuilder.toExpr(left.getText() + " " + op + " " + right.getText() + " "
              + ExprOperator.PLUS + " " + exprToAdd.exprCtx().getText(), Boolean.class);
      System.out.println("Mutated: "+newExpr);
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.INT_COMPARISON);
      break;
    case GASpecLearnerMutations.SUB_EXPR:
      // Subtract a random integer expression to the right expression
      Expr exprToSub = contextInfo.getRandomIntExpr();
      System.out.println("-------------");
      System.out.println("Sub expr");
      System.out.println("Original: "+expr);
      newExpr = ExprBuilder.toExpr(left.getText() + " " + op + " " + right.getText() + " "
              + ExprOperator.MINUS + " " + exprToSub.exprCtx().getText(), Boolean.class);
      System.out.println("Mutated: "+newExpr);
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.INT_COMPARISON);
      break;
    case GASpecLearnerMutations.REPLACE_RIGHT:
      // Replace the right expression
      Expr replacementExpr = contextInfo.getRandomIntExpr();
      System.out.println("-------------");
      System.out.println("Replace right");
      System.out.println("Original: "+expr);
      newExpr = ExprBuilder.toExpr(left.getText() + " " + op + " " + replacementExpr.exprCtx().getText(), Boolean.class);
      System.out.println("Mutated: "+newExpr);
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.INT_COMPARISON);
      break;
    case GASpecLearnerMutations.REPLACE_OP:
      System.out.println("-------------");
      System.out.println("Replacing op");
      System.out.println("Original: "+expr);
      String newOp = ExprOperator.getRandomNumericCmpOp();
      newExpr = ExprBuilder.toExpr(left.getText() + " " + newOp + " " + right.getText(), Boolean.class);
      System.out.println("Mutated: "+newExpr);
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.INT_COMPARISON);
      break;
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
    Expr expr = value.getExpression();
    // Check the expression is adequate
    Compare_opContext cmp_op = expr.exprCtx().compare_op();
    if (cmp_op==null)
      throw new IllegalStateException("The expression "+expr+" should be a comparison with = or !=");
    List<ExprContext> expressions = expr.exprCtx().expr();
    if (expressions.size() != 2)
      throw new IllegalStateException("The expression "+expr+" should only have two expressions");

    ExprContext left = expressions.get(0);
    ExprContext right = expressions.get(1);

    if (mutationToApply.equals(GASpecLearnerMutations.ADD_ONE)) {
      // Add one at the right expression
      String exprStr = left.getText() + " " + cmp_op.getText() + " " + right.getText()
              + " " + ExprOperator.PLUS + " " + ExprName.ONE;
      Expr newExpr = ExprBuilder.toExpr(exprStr, Boolean.class);
      value.setExpression(newExpr, false);
    } else if (mutationToApply.equals(GASpecLearnerMutations.SUB_ONE)) {
      // Subtract one at the right expression
      String exprStr = left.getText() + " " + cmp_op.getText() + " " + right.getText()
              + " " + ExprOperator.MINUS + " " + ExprName.ONE;
      Expr newExpr = ExprBuilder.toExpr(exprStr, Boolean.class);
      value.setExpression(newExpr, false);
    } else if (mutationToApply.equals(GASpecLearnerMutations.TO_TRUE)){
      // Set the expression to true
      value.setExpression(ExprBuilder.TRUE, false);
      value.setGeneType(ExprGeneType.CONSTANT);
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: "+mutationToApply);
    }
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
