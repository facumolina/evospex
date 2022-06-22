package casestudies.kodkod;

import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.evaluator.ExpressionEvaluator;
import evospex.expression.symbol.ExprName;
import evospex.expression.util.ExprUtils;
import org.junit.Test;

public class IntTreeSetTest {

  @Test
  public void test1() {
    IntTreeSet its = new IntTreeSet();
    its.add(1);
    its.ceil(1);
    ExprContext expr = ExprUtils.getExprContext("all n: this.tree.root.*(parent+right):(!(n.parent != null) || n.key != n.parent.key) && (!(n.right != null) || n.key != n.right.key)");
    assert ((Boolean)ExpressionEvaluator.evalAnyExpr(expr, ExprName.THIS, its));
  }
}
