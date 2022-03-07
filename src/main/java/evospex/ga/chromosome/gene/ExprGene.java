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
  protected void updatePreviousExpression(ExprGeneValue newValue) {
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
   * Apply some quantifier mutation
   */
  protected void applySomeQuantifierMutation() {
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
      throw new UnsupportedOperationException("implement this");
    default:
      break;
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator some and the body
   * is a predicate about two variables
   */
  protected void applySomeVarVarMutation() {
    String mutationToApply = getSomeApplicableMutation();
    switch (mutationToApply) {
    case ExprGeneMutations.NEGATE_BODY:
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.TO_ALL:
      // Create a new expression with the all quantifier
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.TO_TRUE:
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
  protected void applySomeVarSetMutation() {
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
  protected void applySomeSetSetMutation() {
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
      ExprGeneMutationHelper.toTrue(value);
      break;
    default:
      throw new UnsupportedOperationException("implement this");
    }
  }

  /**
   * Apply emptyness mutation
   */
  protected void applyEmptynessMutation() {
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
  protected void applyDefaultMutation() {
    // TODO Auto-generated method stub
  }

  /**
   * Apply mutation when the gene expression is some
   */
  protected void applySomeMutation() {
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
  protected void applyNoMutation() {
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
  protected void applyForAllMutation() {
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
    } else if (ExprGeneMutations.TO_SOME.equals(mutationToApply)) {
      // Create a new expression with the some quantifier
      throw new UnsupportedOperationException("implement this");
    } else if (ExprGeneMutations.TO_TRUE.equals(mutationToApply)) {
      // Set the expression to true
      ExprGeneMutationHelper.toTrue(value);
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: "+mutationToApply);
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and
   * the body is about one value
   */
  protected void applyForAllVarValueMutation() {
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
    } else if (ExprGeneMutations.REPLACE_OP.equals(mutationToApply)) {
      if (body.compare_op() != null) {
        ExprContext left = body.expr().get(0);
        ExprContext right = body.expr().get(1);
        String newOp = ExprGeneMutations.getRandomBinaryOperator();
        String newBodyStr = left.getText() + " " + newOp + " " + right.getText();
        Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
        newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
        newExpr.setClassOfValues(expr.classOfValues());
        value.setExpression(newExpr, false);
      } else {
        throw new IllegalStateException("Can't perform REPLACE_OP mutation on expression: "+expr);
      }
    } else if (ExprGeneMutations.REPLACE_VALUE.equals(mutationToApply)){
      if (body.compare_op() != null) {
        ExprContext left = body.expr().get(0);
        Object randomValue = targetInfo.randomValueForType(expr.classOfValues());
        String newBodyStr = left.getText() + " " + body.compare_op().getText() + " " + randomValue;
        Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
        newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
        newExpr.setClassOfValues(expr.classOfValues());
        value.setExpression(newExpr, false);
      } else {
        throw new IllegalStateException("Can't perform REPLACE_VALUE mutation on expression: "+expr);
      }
    } else if (ExprGeneMutations.TO_SOME.equals(mutationToApply)) {
      // Create a new expression with the some quantifier
      throw new UnsupportedOperationException("implement this");
    } else if (ExprGeneMutations.TO_TRUE.equals(mutationToApply)) {
      // Set the expression to true
      ExprGeneMutationHelper.toTrue(value);
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: "+mutationToApply);
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about two variables
   */
  protected void applyForAllVarVarMutation() {
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
      newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
      value.setExpression(newExpr, false);
    } else if (ExprGeneMutations.JOIN_COMPATIBLE_EXPR.equals(mutationToApply)) {
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
        List<Expr> joineableExprs = targetInfo.getJoineableExpressionsOfCurrentTypeMaintainigReturnType(rightExpr);
        if (joineableExprs.size() > 0) {
          Expr joineableExpr = joineableExprs.get(0);
          String newBodyStr = leftExpr.getText() + " " + op.getText() + " " + rightExpr.getText() + ExprOperator.JOIN + joineableExpr.toString();
          newBodyStr = unary.getText() + ExprDelimiter.LP + newBodyStr +  ExprDelimiter.RP;
          Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
          newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
          value.setExpression(newExpr, false);
        }
      } else {
        ExprContext leftExpr = expressions.get(0);
        ExprContext rightExpr = expressions.get(1);
        List<Expr> joineableExprs = targetInfo
                .getJoineableExpressionsOfCurrentTypeMaintainigReturnType(rightExpr);
        if (joineableExprs.size() > 0) {
          Expr joineableExpr = joineableExprs.get(0);
          String newBodyStr = leftExpr.getText() + " " + op.getText() + " " + rightExpr.getText() + ExprOperator.JOIN + joineableExpr.toString();
          Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
          newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
          value.setExpression(newExpr, false);
        }
      }
    } else if (ExprGeneMutations.TO_SOME.equals(mutationToApply)) {
      // Create a new expression with the some quantifier
      throw new UnsupportedOperationException("implement this");
    } else if (ExprGeneMutations.TO_TRUE.equals(mutationToApply)) {
      // Set the expression to true
      ExprGeneMutationHelper.toTrue(value);
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: "+mutationToApply);
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about some relation of two variables n.value=v0 OP n.g.value=v0
   */
  protected void applyForAllVarValueVarValueMutation() {
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
      newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
      newExpr.setClassOfValues(expr.classOfValues());
      value.setExpression(newExpr, false);
    } else if (ExprGeneMutations.REPLACE_VALUE.equals(mutationToApply)){
      if (body.binary_op()!=null) {
        ExprContext left = body.expr().get(0);
        ExprContext right = body.expr().get(1);

        Object randomValue = targetInfo.randomValueForType(expr.classOfValues());
        String newBodyStr;

        // Use the value on the right of the body
        if (right.compare_op()==null) {
          if (right.unary_op()!=null && ExprOperator.NOT_1.equals(right.unary_op().getText())) {
            ExprContext negatedExpr = right.expr().get(0);
            if (negatedExpr.compare_op()==null) throw new IllegalStateException("Compare op can't be null on REPLACE_VALUE mutation on expression "+expr);
            ExprContext right2 = negatedExpr.expr().get(1);
            Expr newRight = ExprBuilder.toExpr(ExprOperator.NOT_1 + ExprDelimiter.LP + randomValue + " " + negatedExpr.compare_op().getText() + " " + right2.getText() + ExprDelimiter.RP, Boolean.class);
            newBodyStr = left.getText() + " " + body.binary_op().getText() + " " + newRight;
          } else {
            throw new IllegalStateException("Compare op can't be null on REPLACE_VALUE mutation on expression "+expr);
          }
        } else {
          ExprContext right2 = right.expr().get(1);
          Expr newRight = ExprBuilder.toExpr(randomValue + " " + right.compare_op().getText() + " " + right2.getText(), Boolean.class);
          newBodyStr = left.getText() + " " + body.binary_op().getText() + " " + newRight;
        }

        Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
        newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
        newExpr.setClassOfValues(expr.classOfValues());
        value.setExpression(newExpr, false);
      } else {
        throw new IllegalStateException("Can't perform REPLACE_VALUE mutation on expression: "+expr);
      }
    } else if (ExprGeneMutations.NEGATE_RIGHT_EQUALITY.equals(mutationToApply)) {
      if (body.binary_op()!=null) {
        ExprContext left = body.expr().get(0);
        ExprContext right = body.expr().get(1);
        // Create the for all expression with the negated body
        String newRightStr = ExprOperator.NOT_1 + ExprDelimiter.LP + right.getText() + ExprDelimiter.RP;
        if (right.unary_op()!=null && ExprOperator.NOT_1.equals(right.unary_op().getText())) {
          // The body is already negated, so just remove the negation operation
          newRightStr = right.expr().get(0).getText();
        }
        String newBodyStr = left.getText() + " " + body.binary_op().getText() + " " + newRightStr;
        Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
        newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
        newExpr.setClassOfValues(expr.classOfValues());
        value.setExpression(newExpr, false);
      } else {
        throw new IllegalStateException("Can't perform NEGATE_RIGHT_EQUALITY mutation on expression: "+expr);
      }
    } else if (ExprGeneMutations.REPLACE_OP.equals(mutationToApply)) {
      if (body.binary_op()!=null) {
        ExprContext left = body.expr().get(0);
        ExprContext right = body.expr().get(1);
        Expr newRight;
        if (right.compare_op()==null) {
          if (right.unary_op()!=null && ExprOperator.NOT_1.equals(right.unary_op().getText())) {
            ExprContext negatedExpr = right.expr().get(0);
            ExprContext left2 = negatedExpr.expr().get(0);
            ExprContext right2 = negatedExpr.expr().get(1);
            String newOp = ExprGeneMutations.getRandomBinaryOperator();
            newRight = ExprBuilder.toExpr(ExprOperator.NOT_1 + ExprDelimiter.LP + left2.getText() + " " + newOp + " " + right2.getText() + ExprDelimiter.RP, Boolean.class);
          } else {
            throw new IllegalStateException("Compare op can't be null on REPLACE_OP mutation on expression " + expr);
          }
        } else {
          ExprContext left2 = right.expr().get(0);
          ExprContext right2 = right.expr().get(1);
          String newOp = ExprGeneMutations.getRandomBinaryOperator();
          newRight = ExprBuilder.toExpr(left2.getText() + " " + newOp + " " + right2.getText(), Boolean.class);
        }
        String newBodyStr = left.getText() + " " + body.binary_op().getText() + " " + newRight;
        Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
        newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
        newExpr.setClassOfValues(expr.classOfValues());
        value.setExpression(newExpr, false);
      } else {
        throw new IllegalStateException("Can't perform REPLACE_OP mutation on expression: "+expr);
      }
    } else if (ExprGeneMutations.TO_TRUE.equals(mutationToApply)) {
      ExprGeneMutationHelper.toTrue(value);
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: "+mutationToApply);
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about some relation like op[n.value,n.f.value] AND op[n.value,n.g.value]
   */
  protected void applyForAllVarValuesDoubleIntComparisonMutation() {
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
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all
   */
  protected void applyForAllVarValuesDoubleQuantificationIntComparisonMutation() {
    String mutationToApply = getSomeApplicableMutation();
    if (ExprGeneMutations.TO_TRUE.equals(mutationToApply)) {
      ExprGeneMutationHelper.toTrue(value);
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: "+mutationToApply);
    }
  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about a variable and a set
   */
  protected void applyForAllVarSetMutation() {
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
    } else if (mutationToApply.equals(ExprGeneMutations.TO_SOME)) {
      // Create a new expression with the some quantifier
      throw new UnsupportedOperationException("implement this");
    } else if (mutationToApply.equals(ExprGeneMutations.TO_TRUE)) {
      // Set the expression to true
      ExprGeneMutationHelper.toTrue(value);
    } else {
      throw new UnsupportedOperationException("implement this");
    }

  }

  /**
   * Apply mutation when the gene expression is a quantification with the operator all and the body
   * is a predicate about two sets
   */
  protected void applyForAllSetSetMutation() {
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
      ExprGeneMutationHelper.toTrue(value);
      break;
    default:
      throw new UnsupportedOperationException("implement this");
    }
  }

  /**
   * Apply mutation when the gene expression is in
   */
  protected void applyInclusionMutation() {
    String mutationToApply = getSomeApplicableMutation();
    Expr expr  = value.getExpression();
    List<ExprContext> expressions = expr.exprCtx().expr();
    if (expressions.size() != 2)
      throw new IllegalStateException("The expression "+expr+" should only have two expressions");
    ExprContext left = expressions.get(0);
    ExprContext right = expressions.get(1);
    Compare_opContext op = expr.exprCtx().compare_op();
    if (ExprGeneMutations.NEGATE.equals(mutationToApply)) {
      if (!op.getText().equals(ExprOperator.IN) && !op.getText().equals(ExprOperator.NOT_IN))
        throw new IllegalStateException("Can't negate inclusion with operator " + op.getText());
      String newOp = op.getText().equals(ExprOperator.IN) ? ExprOperator.NOT_IN : ExprOperator.IN;
      Expr newExpr = ExprBuilder.toExpr(left.getText() + " " + newOp + " " + right.getText(), Boolean.class);
      newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
      value.setExpression(newExpr, false);
    } else if (ExprGeneMutations.REPLACE_INCLUDED.equals(mutationToApply)) {
      Set<String> sameTypeVars = targetInfo.getVariablesOfType(expr.classOfElemsInSet());
      Random random = new Random();
      int randomNumber = random.nextInt(sameTypeVars.size());
      String newVarName = (String) sameTypeVars.toArray()[randomNumber];
      Expr newExpr = ExprBuilder.toExpr(newVarName + " " + expr.exprCtx().compare_op().getText() + " " + right.getText(), Boolean.class);
      newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.INCLUSION);
    } else if (ExprGeneMutations.REPLACE_SET.equals(mutationToApply)) {
      List<Expr> possibleCollections = targetInfo.getSetsOfType(expr.classOfElemsInSet());
      if (possibleCollections.size() > 0) {
        Random r = new Random();
        int rN = r.nextInt(possibleCollections.size());
        Expr newRight = possibleCollections.get(rN);
        Expr newExpr = ExprBuilder.toExpr(left.getText() + " " + op.getText() + " " + newRight.exprCtx().getText(), Boolean.class);
        newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
        value.setExpression(newExpr, false);
        value.setGeneType(ExprGeneType.INCLUSION);
      }
    } else if (ExprGeneMutations.TO_TRUE.equals(mutationToApply)) {
      ExprGeneMutationHelper.toTrue(value);
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: " + mutationToApply);
    }
  }

  /**
   * Apply mutation when the gene expression is equal or not equal
   */
  protected void applyEqualityMutation() {
    String mutationToApply = getSomeApplicableMutation();
    Expr expr = value.getExpression();

    // Check the expression is adequate
    Compare_opContext cmp_op = expr.exprCtx().compare_op();
    if (cmp_op==null)
      throw new IllegalStateException("The expression "+expr+" should be a comparison with = or !=");
    List<ExprContext> expressions = expr.exprCtx().expr();
    if (expressions.size() != 2)
      throw new IllegalStateException("The expression "+expr+" should only have two expressions");

    if (mutationToApply.equals(ExprGeneMutations.NEGATE)) {
      ExprContext left = expressions.get(0);
      ExprContext right = expressions.get(1);
      String new_op = cmp_op.getText().equals(ExprOperator.EQ)?ExprOperator.NOT_EQ:ExprOperator.EQ;
      Expr mutatedExpr = ExprBuilder.toExpr(left.getText() + " " + new_op + " " + right.getText(), Boolean.class);
      value.setExpression(mutatedExpr, false);
    } else if (mutationToApply.equals(ExprGeneMutations.TO_TRUE)){
      ExprGeneMutationHelper.toTrue(value);
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: " + mutationToApply);
    }
  }

  /**
   * Apply mutation when the gene expression is an int comparison ( int [=,<>,<,>,<=,>=] int)
   *
   */
  protected void applyIntComparisonMutation() {
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
    case ExprGeneMutations.NEGATE:
      newExpr = ExprBuilder.toExpr(ExprOperator.NOT_1 + ExprDelimiter.LP + expr.exprCtx().getText() + ExprDelimiter.RP, Boolean.class);
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.NUMERIC_COMPARISON);
      break;
    case ExprGeneMutations.ADD_ONE:
      // Add one at the right expression
      newExpr = ExprBuilder.toExpr(left.getText() + " " + op + " " + right.getText() + " "
              + ExprOperator.PLUS + " " + ExprBuilder.ONE, Boolean.class);
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.NUMERIC_COMPARISON);
      break;
    case ExprGeneMutations.SUB_ONE:
      // Subtract one at the right expression
      newExpr = ExprBuilder.toExpr(left.getText() + " " + op + " " + right.getText() + " "
              + ExprOperator.MINUS + " " + ExprBuilder.ONE, Boolean.class);
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.NUMERIC_COMPARISON);
    case ExprGeneMutations.ADD_EXPR:
      // Add a random integer expression to the right expression
      Expr exprToAdd = targetInfo.getRandomIntExpr();
      newExpr = ExprBuilder.toExpr(left.getText() + " " + op + " " + right.getText() + " "
              + ExprOperator.PLUS + " " + exprToAdd.exprCtx().getText(), Boolean.class);
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.NUMERIC_COMPARISON);
      break;
    case ExprGeneMutations.SUB_EXPR:
      // Subtract a random integer expression to the right expression
      Expr exprToSub = targetInfo.getRandomIntExpr();
      newExpr = ExprBuilder.toExpr(left.getText() + " " + op + " " + right.getText() + " "
              + ExprOperator.MINUS + " " + exprToSub.exprCtx().getText(), Boolean.class);
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.NUMERIC_COMPARISON);
      break;
    case ExprGeneMutations.REPLACE_RIGHT:
      // Replace the right expression
      Expr replacementExpr = targetInfo.getRandomIntExpr();
      newExpr = ExprBuilder.toExpr(left.getText() + " " + op + " " + replacementExpr.exprCtx().getText(), Boolean.class);
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.NUMERIC_COMPARISON);
      break;
    case ExprGeneMutations.REPLACE_OP:
      String newOp = ExprOperator.getRandomNumericCmpOp();
      newExpr = ExprBuilder.toExpr(left.getText() + " " + newOp + " " + right.getText(), Boolean.class);
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.NUMERIC_COMPARISON);
      break;
    case ExprGeneMutations.EQ_SUB_ONE:
      // Create eq expression and subtract one at the right expression
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.OP_EQ:
      // Now the operator will be =
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.OP_LT:
      // Now the operator will be <
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.OP_LTE:
      // Now the operator will be <=
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.OP_GT:
      // Now the operator will be >
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.OP_GTE:
      // Now the operator will be >=
      throw new UnsupportedOperationException("implement this");
    case ExprGeneMutations.TO_TRUE:
      // Set the expression to true
      ExprGeneMutationHelper.toTrue(value);
      break;
    default:
      throw new IllegalStateException("Mutation " + mutationToApply + " not implemented!");
    }
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
  protected void applyNegationMutation() {
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
  protected void applyConstantMutation() {
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
  protected void applyCardinalityMutation() {
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
