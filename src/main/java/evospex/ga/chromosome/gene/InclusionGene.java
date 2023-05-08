package evospex.ga.chromosome.gene;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.ExprGrammarParser;
import evospex.expression.symbol.ExprOperator;
import evospex.ga.chromosome.gene.type.ExprGeneType;
import evospex.ga.chromosome.gene.value.ExprGeneValue;
import evospex.ga.operator.ExprGeneMutations;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import evospex.utils.TargetInformation;

import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * This class represents an inclusion gene. An inclusion gene is a gene which value is an expression
 * of the form e (in | !in) f.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class InclusionGene extends ExprGene {

  public InclusionGene(Configuration a_conf, ExprGeneValue value, TargetInformation info) throws InvalidConfigurationException {
    super(a_conf, value, info);
  }

  @Override
  public ExprGene mutate() throws InvalidConfigurationException {
    updatePreviousExpression(value.clone());
    String mutationToApply = getSomeApplicableMutation();
    Expr expr  = value.getExpression();
    List<ExprGrammarParser.ExprContext> expressions = expr.exprCtx().expr();
    if (expressions.size() != 2)
      throw new IllegalStateException("The expression "+expr+" should only have two expressions");
    ExprGrammarParser.ExprContext left = expressions.get(0);
    ExprGrammarParser.ExprContext right = expressions.get(1);
    ExprGrammarParser.Compare_opContext op = expr.exprCtx().compare_op();
    if (ExprGeneMutations.NEGATE.equals(mutationToApply)) {
      if (!op.getText().equals(ExprOperator.IN) && !op.getText().equals(ExprOperator.NOT_IN))
        throw new IllegalStateException("Can't negate inclusion with operator " + op.getText());
      String newOp = op.getText().equals(ExprOperator.IN) ? ExprOperator.NOT_IN : ExprOperator.IN;
      Expr newExpr = ExprBuilder.toExpr(left.getText() + " " + newOp + " " + right.getText(), Boolean.class);
      newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
      value.setExpression(newExpr, false);
      return this;
    } else if (ExprGeneMutations.REPLACE_INCLUDED.equals(mutationToApply)) {
      Set<String> sameTypeVars = targetInfo.getVariablesOfType(expr.classOfElemsInSet());
      Random random = new Random();
      int randomNumber = random.nextInt(sameTypeVars.size());
      String newVarName = (String) sameTypeVars.toArray()[randomNumber];
      Expr newExpr = ExprBuilder.toExpr(newVarName + " " + expr.exprCtx().compare_op().getText() + " " + right.getText(), Boolean.class);
      newExpr.setClassOfElemsInSet(expr.classOfElemsInSet());
      value.setExpression(newExpr, false);
      value.setGeneType(ExprGeneType.INCLUSION);
      return this;
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
      return this;
    } else if (ExprGeneMutations.TO_TRUE.equals(mutationToApply)) {
      ConstantGene trueGene = new ConstantGene(getConfiguration(), targetInfo);
      trueGene.updatePreviousExpression(value);
      return trueGene;
    } else {
      throw new UnsupportedOperationException("Unsupported mutation: " + mutationToApply);
    }
  }

  @Override
  protected Gene newGeneInternal() {
    try {
      return new InclusionGene(getConfiguration(), value.clone(), targetInfo);
    } catch (InvalidConfigurationException ex) {
      throw new IllegalStateException(ex.getMessage());
    }
  }

  @Override
  public void applyMutation(int i, double v) { }
}
