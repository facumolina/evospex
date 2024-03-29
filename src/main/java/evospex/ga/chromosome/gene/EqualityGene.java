package evospex.ga.chromosome.gene;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.ExprGrammarParser;
import evospex.expression.symbol.ExprOperator;
import evospex.ga.chromosome.gene.value.ExprGeneValue;
import evospex.ga.operator.ExprGeneMutations;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import evospex.utils.TargetInformation;

import java.util.List;

/**
 * This class represents an equality gene. A equality gene is a gene which value is an expression
 * of the form e (= | !=) f, where e and f are non primitive expressions of the same type.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class EqualityGene extends ExprGene {

  public EqualityGene(Configuration a_conf, ExprGeneValue value, TargetInformation info) throws InvalidConfigurationException {
    super(a_conf, value, info);
  }

  @Override
  protected Gene newGeneInternal() {
    try {
      return new EqualityGene(getConfiguration(), value.clone(), targetInfo);
    } catch (InvalidConfigurationException ex) {
      throw new IllegalStateException(ex.getMessage());
    }
  }

  @Override
  public ExprGene mutate() throws InvalidConfigurationException {
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

    if (mutationToApply.equals(ExprGeneMutations.NEGATE)) {
      ExprGrammarParser.ExprContext left = expressions.get(0);
      ExprGrammarParser.ExprContext right = expressions.get(1);
      String new_op = cmp_op.getText().equals(ExprOperator.EQ)?ExprOperator.NOT_EQ:ExprOperator.EQ;
      Expr mutatedExpr = ExprBuilder.toExpr(left.getText() + " " + new_op + " " + right.getText(), Boolean.class);
      value.setExpression(mutatedExpr, false);
      return this;
    } else if (mutationToApply.equals(ExprGeneMutations.TO_TRUE)){
      ConstantGene trueGene = new ConstantGene(getConfiguration(), targetInfo);
      trueGene.updatePreviousExpression(value);
      return trueGene;
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: " + mutationToApply);
    }
  }

  @Override
  public void applyMutation(int i, double v) { }

}
