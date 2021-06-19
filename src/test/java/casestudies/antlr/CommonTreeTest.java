package casestudies.antlr;

import org.junit.Test;

import hamcrest.utils.ExpressionEvaluator;

public class CommonTreeTest {

  @Test
  public void test0() {
    CommonTree c = new CommonTree();
    c.setParent(c);
    c.addChild(c);
    assert (ExpressionEvaluator.evaluateQuantifiedExpression("all", "this . * parent",
        "n !in n . ^ parent", c));
  }
}
