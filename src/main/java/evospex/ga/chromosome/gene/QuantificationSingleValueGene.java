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
 * This class represents a QuantificationSingleValueGene. A quantification single value  gene is a gene which value is
 * a quantified expression qt n : decl : body, where the body is a predicate over a single value (n, n.f, n.e, etc).
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class QuantificationSingleValueGene extends ExprGene {

  public QuantificationSingleValueGene(Configuration a_conf, ExprGeneValue value, TargetInformation info) throws InvalidConfigurationException {
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
      value.setExpression(newExpr, false);
      return this;
    } else if (ExprGeneMutations.REPLACE_OP.equals(mutationToApply)) {
      if (body.compare_op() != null) {
        ExprGrammarParser.ExprContext left = body.expr().get(0);
        ExprGrammarParser.ExprContext right = body.expr().get(1);
        String newOp = ExprGeneMutations.getRandomBinaryOperator();
        String newBodyStr = left.getText() + " " + newOp + " " + right.getText();
        Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
        newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
        newExpr.setClassOfValues(expr.classOfValues());
        value.setExpression(newExpr, false);
        return this;
      } else {
        throw new IllegalStateException("Can't perform REPLACE_OP mutation on expression: "+expr);
      }
    } else if (ExprGeneMutations.REPLACE_VALUE.equals(mutationToApply)){
      if (body.compare_op() != null) {
        ExprGrammarParser.ExprContext left = body.expr().get(0);
        Object randomValue = targetInfo.randomValueForType(expr.classOfValues());
        String newBodyStr = left.getText() + " " + body.compare_op().getText() + " " + randomValue;
        Expr newExpr = ExprBuilder.qtExpr(ExprOperator.ALL, ExprBuilder.toExpr(set.getText(), Collection.class), newBodyStr);
        newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
        newExpr.setClassOfValues(expr.classOfValues());
        value.setExpression(newExpr, false);
        return this;
      } else {
        throw new IllegalStateException("Can't perform REPLACE_VALUE mutation on expression: "+expr);
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
      return new QuantificationSingleValueGene(getConfiguration(), value.clone(), targetInfo);
    } catch (InvalidConfigurationException ex) {
      throw new IllegalStateException(ex.getMessage());
    }
  }

  @Override
  public void applyMutation(int i, double v) { }

}
