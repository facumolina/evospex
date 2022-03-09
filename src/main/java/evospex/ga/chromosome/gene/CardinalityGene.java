package evospex.ga.chromosome.gene;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.ExprGrammarParser;
import evospex.expression.symbol.ExprName;
import evospex.expression.symbol.ExprOperator;
import evospex.ga.operator.ExprGeneMutationHelper;
import evospex.ga.operator.ExprGeneMutations;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import utils.TargetInformation;

import java.util.List;

/**
 * This class represents a cardinality gene. A cardinality gene is a gene which value is an expression
 * of the form #(e) op f, where f is an integer expression.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class CardinalityGene extends ExprGene {

  public CardinalityGene(Configuration a_conf, ExprGeneValue value, TargetInformation info) throws InvalidConfigurationException {
    super(a_conf, value, info);
  }

  @Override
  protected Gene newGeneInternal() {
    try {
      return new CardinalityGene(getConfiguration(), value.clone(), targetInfo);
    } catch (InvalidConfigurationException ex) {
      throw new IllegalStateException(ex.getMessage());
    }
  }

  public void applyMutation(int index, double a_percentage) {
    try {
      updatePreviousExpression(value.clone());
      String mutationToApply = getSomeApplicableMutation();
      Expr expr = value.getExpression();
      // Check the expression is adequate
      ExprGrammarParser.Compare_opContext cmp_op = expr.exprCtx().compare_op();
      if (cmp_op==null)
        throw new IllegalStateException("The expression "+expr+" should be a comparison with = or !=");
      List<ExprGrammarParser.ExprContext> expressions = expr.exprCtx().expr();
      if (expressions.size() != 2)
        throw new IllegalStateException("The expression "+expr+" should only have two expressions");

      ExprGrammarParser.ExprContext left = expressions.get(0);
      ExprGrammarParser.ExprContext right = expressions.get(1);

      if (mutationToApply.equals(ExprGeneMutations.ADD_ONE)) {
        // Add one at the right expression
        String exprStr = left.getText() + " " + cmp_op.getText() + " " + right.getText()
                + " " + ExprOperator.PLUS + " " + ExprName.ONE;
        Expr newExpr = ExprBuilder.toExpr(exprStr, Boolean.class);
        value.setExpression(newExpr, false);
      } else if (mutationToApply.equals(ExprGeneMutations.SUB_ONE)) {
        // Subtract one at the right expression
        String exprStr = left.getText() + " " + cmp_op.getText() + " " + right.getText()
                + " " + ExprOperator.MINUS + " " + ExprName.ONE;
        Expr newExpr = ExprBuilder.toExpr(exprStr, Boolean.class);
        value.setExpression(newExpr, false);
      } else if (mutationToApply.equals(ExprGeneMutations.TO_TRUE)){
        // Set the expression to true
        ExprGeneMutationHelper.toTrue(value);
      } else {
        throw new UnsupportedOperationException("Unsupported mutation: "+mutationToApply);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
