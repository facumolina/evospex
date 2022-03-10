package evospex.ga.chromosome.gene;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.ExprGrammarParser;
import evospex.expression.symbol.ExprDelimiter;
import evospex.expression.symbol.ExprOperator;
import evospex.ga.operator.ExprGeneMutations;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import utils.TargetInformation;

import java.util.List;

/**
 * This class represents a numeric comparison gene. A numeric comparison  gene is a gene which value is an expression
 * of the form e op f, where e and f are numeric expressions.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class NumericComparisonGene extends ExprGene {

  public NumericComparisonGene(Configuration a_conf, ExprGeneValue value, TargetInformation info) throws InvalidConfigurationException {
    super(a_conf, value, info);
  }

  @Override
  public ExprGene mutate() throws InvalidConfigurationException {
    updatePreviousExpression(value.clone());
    String mutationToApply = getSomeApplicableMutation();
    Expr expr = value.getExpression();
    Expr newExpr;
    List<ExprGrammarParser.ExprContext> exprs = expr.exprCtx().expr();
    if (exprs.size() != 2)
      throw new IllegalStateException("The expression is not a numeric comparison: "+expr);
    String op = expr.exprCtx().compare_op().getText();
    ExprGrammarParser.ExprContext left = exprs.get(0);
    ExprGrammarParser.ExprContext right = exprs.get(1);
    switch (mutationToApply) {
      case ExprGeneMutations.NEGATE:
        newExpr = ExprBuilder.toExpr(ExprOperator.NOT_1 + ExprDelimiter.LP + expr.exprCtx().getText() + ExprDelimiter.RP, Boolean.class);
        value.setExpression(newExpr, false);
        return this;
      case ExprGeneMutations.ADD_ONE:
        // Add one at the right expression
        newExpr = ExprBuilder.toExpr(left.getText() + " " + op + " " + right.getText() + " "
                + ExprOperator.PLUS + " " + ExprBuilder.ONE, Boolean.class);
        value.setExpression(newExpr, false);
        return this;
      case ExprGeneMutations.SUB_ONE:
        // Subtract one at the right expression
        newExpr = ExprBuilder.toExpr(left.getText() + " " + op + " " + right.getText() + " "
                + ExprOperator.MINUS + " " + ExprBuilder.ONE, Boolean.class);
        value.setExpression(newExpr, false);
        return this;
      case ExprGeneMutations.ADD_EXPR:
        // Add a random integer expression to the right expression
        Expr exprToAdd = targetInfo.getRandomIntExpr();
        newExpr = ExprBuilder.toExpr(left.getText() + " " + op + " " + right.getText() + " "
                + ExprOperator.PLUS + " " + exprToAdd.exprCtx().getText(), Boolean.class);
        value.setExpression(newExpr, false);
        return this;
      case ExprGeneMutations.SUB_EXPR:
        // Subtract a random integer expression to the right expression
        Expr exprToSub = targetInfo.getRandomIntExpr();
        newExpr = ExprBuilder.toExpr(left.getText() + " " + op + " " + right.getText() + " "
                + ExprOperator.MINUS + " " + exprToSub.exprCtx().getText(), Boolean.class);
        value.setExpression(newExpr, false);
        return this;
      case ExprGeneMutations.REPLACE_RIGHT:
        // Replace the right expression
        Expr replacementExpr = targetInfo.getRandomIntExpr();
        newExpr = ExprBuilder.toExpr(left.getText() + " " + op + " " + replacementExpr.exprCtx().getText(), Boolean.class);
        value.setExpression(newExpr, false);
        return this;
      case ExprGeneMutations.REPLACE_OP:
        String newOp = ExprOperator.getRandomNumericCmpOp();
        newExpr = ExprBuilder.toExpr(left.getText() + " " + newOp + " " + right.getText(), Boolean.class);
        value.setExpression(newExpr, false);
        return this;
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
        ConstantGene trueGene = new ConstantGene(getConfiguration(), targetInfo);
        trueGene.updatePreviousExpression(value);
        return trueGene;
      default:
        throw new IllegalStateException("Mutation " + mutationToApply + " not implemented!");
    }
  }

  @Override
  protected Gene newGeneInternal() {
    try {
      return new NumericComparisonGene(getConfiguration(), value.clone(), targetInfo);
    } catch (InvalidConfigurationException ex) {
      throw new IllegalStateException(ex.getMessage());
    }
  }

  @Override
  public void applyMutation(int i, double v) { }
}
