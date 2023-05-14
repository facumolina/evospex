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
import evospex.utils.TargetInformation;

import java.util.Collection;

/**
 * This class represents a QuantificationDoubleValueGene. A quantification double value gene is a gene which value is
 * a quantified expression qt n : decl : body, where the body is a predicate over two values (n.v=v0 OP n.g.v=v0).
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class QuantificationDoubleValueGene extends ExprGene {

  public QuantificationDoubleValueGene(Configuration a_conf, ExprGeneValue value, TargetInformation info) throws InvalidConfigurationException {
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
      newExpr.setClassOfValues(expr.classOfValues());
      value.setExpression(newExpr, false);
      return this;
    } else if (ExprGeneMutations.REPLACE_VALUE.equals(mutationToApply)){
      if (body.binary_op()!=null) {
        ExprGrammarParser.ExprContext left = body.expr().get(0);
        ExprGrammarParser.ExprContext right = body.expr().get(1);

        Object randomValue = targetInfo.randomValueForType(expr.classOfValues());
        String newBodyStr;

        // Use the value on the right of the body
        if (right.compare_op()==null) {
          if (right.unary_op()!=null && ExprOperator.NOT_1.equals(right.unary_op().getText())) {
            ExprGrammarParser.ExprContext negatedExpr = right.expr().get(0);
            if (negatedExpr.compare_op()==null) throw new IllegalStateException("Compare op can't be null on REPLACE_VALUE mutation on expression "+expr);
            ExprGrammarParser.ExprContext right2 = negatedExpr.expr().get(1);
            Expr newRight = ExprBuilder.toExpr(ExprOperator.NOT_1 + ExprDelimiter.LP + randomValue + " " + negatedExpr.compare_op().getText() + " " + right2.getText() + ExprDelimiter.RP, Boolean.class);
            newBodyStr = left.getText() + " " + body.binary_op().getText() + " " + newRight;
          } else {
            throw new IllegalStateException("Compare op can't be null on REPLACE_VALUE mutation on expression "+expr);
          }
        } else {
          ExprGrammarParser.ExprContext right2 = right.expr().get(1);
          Expr newRight = ExprBuilder.toExpr(randomValue + " " + right.compare_op().getText() + " " + right2.getText(), Boolean.class);
          newBodyStr = left.getText() + " " + body.binary_op().getText() + " " + newRight;
        }

        Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
        newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
        newExpr.setClassOfValues(expr.classOfValues());
        value.setExpression(newExpr, false);
        return this;
      } else {
        throw new IllegalStateException("Can't perform REPLACE_VALUE mutation on expression: "+expr);
      }
    } else if (ExprGeneMutations.NEGATE_RIGHT_EQUALITY.equals(mutationToApply)) {
      if (body.binary_op()!=null) {
        ExprGrammarParser.ExprContext left = body.expr().get(0);
        ExprGrammarParser.ExprContext right = body.expr().get(1);
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
        return this;
      } else {
        throw new IllegalStateException("Can't perform NEGATE_RIGHT_EQUALITY mutation on expression: "+expr);
      }
    } else if (ExprGeneMutations.REPLACE_OP.equals(mutationToApply)) {
      if (body.binary_op()!=null) {
        ExprGrammarParser.ExprContext left = body.expr().get(0);
        ExprGrammarParser.ExprContext right = body.expr().get(1);
        Expr newRight;
        if (right.compare_op()==null) {
          if (right.unary_op()!=null && ExprOperator.NOT_1.equals(right.unary_op().getText())) {
            ExprGrammarParser.ExprContext negatedExpr = right.expr().get(0);
            ExprGrammarParser.ExprContext left2 = negatedExpr.expr().get(0);
            ExprGrammarParser.ExprContext right2 = negatedExpr.expr().get(1);
            String newOp = ExprGeneMutations.getRandomBinaryOperator();
            newRight = ExprBuilder.toExpr(ExprOperator.NOT_1 + ExprDelimiter.LP + left2.getText() + " " + newOp + " " + right2.getText() + ExprDelimiter.RP, Boolean.class);
          } else {
            throw new IllegalStateException("Compare op can't be null on REPLACE_OP mutation on expression " + expr);
          }
        } else {
          ExprGrammarParser.ExprContext left2 = right.expr().get(0);
          ExprGrammarParser.ExprContext right2 = right.expr().get(1);
          String newOp = ExprGeneMutations.getRandomBinaryOperator();
          newRight = ExprBuilder.toExpr(left2.getText() + " " + newOp + " " + right2.getText(), Boolean.class);
        }
        String newBodyStr = left.getText() + " " + body.binary_op().getText() + " " + newRight;
        Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
        newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
        newExpr.setClassOfValues(expr.classOfValues());
        value.setExpression(newExpr, false);
        return this;
      } else {
        throw new IllegalStateException("Can't perform REPLACE_OP mutation on expression: "+expr);
      }
    } else if (ExprGeneMutations.TO_TRUE.equals(mutationToApply)) {
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
      return new QuantificationDoubleValueGene(getConfiguration(), value.clone(), targetInfo);
    } catch (InvalidConfigurationException ex) {
      throw new IllegalStateException(ex.getMessage());
    }
  }

  @Override
  public void applyMutation(int i, double v) { }

}
