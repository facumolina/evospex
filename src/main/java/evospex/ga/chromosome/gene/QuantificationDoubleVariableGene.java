package evospex.ga.chromosome.gene;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.ExprGrammarParser;
import evospex.expression.symbol.ExprDelimiter;
import evospex.expression.symbol.ExprOperator;
import evospex.ga.chromosome.gene.value.ExprGeneValue;
import evospex.ga.operator.ExprGeneMutations;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import utils.TargetInformation;

import java.util.Collection;
import java.util.List;

/**
 * This class represents a QuantificationDoubleVariableGene. A quantification double variable genegene is a gene which value is
 * a quantified expression qt n : decl : body, where the body is a predicate over two variables (n OP n.f).
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class QuantificationDoubleVariableGene extends ExprGene {

  public QuantificationDoubleVariableGene(Configuration a_conf, ExprGeneValue value, TargetInformation info) throws InvalidConfigurationException {
    super(a_conf, value, info);
  }

  @Override
  public ExprGene mutate() throws InvalidConfigurationException {
    updatePreviousExpression(value.clone());
    String mutationToApply = getSomeApplicableMutation();
    Expr expr = value.getExpression();
    ExprGrammarParser.Qt_exprContext qt_expr = expr.exprCtx().qt_expr();
    if (qt_expr == null)
      throw new IllegalStateException("The current expression is not a quantified expression");
    ExprGrammarParser.ExprContext body = qt_expr.expr();
    ExprGrammarParser.Set_exprContext set =  qt_expr.set_expr();
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
      return this;
    } else if (ExprGeneMutations.JOIN_COMPATIBLE_EXPR.equals(mutationToApply)) {
      // Append a compatible expression in the right side of the body
      List<ExprGrammarParser.ExprContext> expressions = body.expr();
      ExprGrammarParser.Compare_opContext op = body.compare_op();
      if (expressions.size()!=2) {
        ExprGrammarParser.Unary_opContext unary = body.unary_op();
        if (unary == null || expressions.size()!=1 || expressions.get(0).expr().size()!=2)
          throw new IllegalStateException("Invalid quantified expression body: "+body.getText());
        ExprGrammarParser.ExprContext e = expressions.get(0);
        op = e.compare_op(); // The op now is the op that is in the
        ExprGrammarParser.ExprContext leftExpr = e.expr(0);
        ExprGrammarParser.ExprContext rightExpr = e.expr(1);
        List<Expr> joineableExprs = targetInfo.getJoineableExpressionsOfCurrentTypeMaintainigReturnType(rightExpr);
        if (joineableExprs.size() > 0) {
          Expr joineableExpr = joineableExprs.get(0);
          String newBodyStr = leftExpr.getText() + " " + op.getText() + " " + rightExpr.getText() + ExprOperator.JOIN + joineableExpr.toString();
          newBodyStr = unary.getText() + ExprDelimiter.LP + newBodyStr +  ExprDelimiter.RP;
          Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
          newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
          value.setExpression(newExpr, false);
        }
        return this;
      } else {
        ExprGrammarParser.ExprContext leftExpr = expressions.get(0);
        ExprGrammarParser.ExprContext rightExpr = expressions.get(1);
        List<Expr> joineableExprs = targetInfo
                .getJoineableExpressionsOfCurrentTypeMaintainigReturnType(rightExpr);
        if (joineableExprs.size() > 0) {
          Expr joineableExpr = joineableExprs.get(0);
          String newBodyStr = leftExpr.getText() + " " + op.getText() + " " + rightExpr.getText() + ExprOperator.JOIN + joineableExpr.toString();
          Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
          newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
          value.setExpression(newExpr, false);
        }
        return this;
      }
    } else if (ExprGeneMutations.TO_SOME.equals(mutationToApply)) {
      // Create a new expression with the some quantifier
      throw new UnsupportedOperationException("implement this");
    } else if (ExprGeneMutations.TO_TRUE.equals(mutationToApply)) {
      // Set the expression to true
      ConstantGene trueGene = new ConstantGene(getConfiguration(), targetInfo);
      trueGene.updatePreviousExpression(value);
      return trueGene;
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: "+mutationToApply);
    }
  }

  @Override
  protected Gene newGeneInternal() {
    try {
      return new QuantificationDoubleVariableGene(getConfiguration(), value.clone(), targetInfo);
    } catch (InvalidConfigurationException ex) {
      throw new IllegalStateException(ex.getMessage());
    }
  }

  @Override
  public void applyMutation(int i, double v) {

  }
}
