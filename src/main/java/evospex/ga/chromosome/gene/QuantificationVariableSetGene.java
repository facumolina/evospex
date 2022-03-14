package evospex.ga.chromosome.gene;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.ExprGrammarParser;
import evospex.expression.symbol.ExprDelimiter;
import evospex.expression.symbol.ExprName;
import evospex.expression.symbol.ExprOperator;
import evospex.ga.chromosome.gene.value.ExprGeneValue;
import evospex.ga.operator.ExprGeneMutations;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import utils.TargetInformation;

import java.util.Collection;

/**
 * This class represents a QuantificationVariableSetGene. A quantification variable set gene is a gene which value is
 * a quantified expression qt n : decl : body, where the body is a predicate over one variable and a set (n OP n.*e).
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class QuantificationVariableSetGene extends ExprGene {

  public QuantificationVariableSetGene(Configuration a_conf, ExprGeneValue value, TargetInformation info) throws InvalidConfigurationException {
    super(a_conf, value, info);
  }


  @Override
  public ExprGene mutate() throws InvalidConfigurationException {
    updatePreviousExpression(value.clone());
    Expr expr = value.getExpression();
    String mutationToApply = getSomeApplicableMutation();
    ExprGrammarParser.Qt_exprContext qt_expr = expr.exprCtx().qt_expr();
    if (qt_expr == null)
      throw new IllegalStateException("The current expression is not a quantified expression");
    ExprGrammarParser.ExprContext body = qt_expr.expr();
    ExprGrammarParser.Set_exprContext set =  qt_expr.set_expr();
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

  @Override
  protected Gene newGeneInternal() {
    try {
      return new QuantificationVariableSetGene(getConfiguration(), value.clone(), targetInfo);
    } catch (InvalidConfigurationException ex) {
      throw new IllegalStateException(ex.getMessage());
    }
  }

  @Override
  public void applyMutation(int i, double v) { }

}
