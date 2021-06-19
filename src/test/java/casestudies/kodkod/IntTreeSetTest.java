package casestudies.kodkod;

import org.junit.Test;

import hamcrest.utils.ExpressionEvaluator;

public class IntTreeSetTest {

  @Test
  public void test1() {
    IntTreeSet its = new IntTreeSet();
    its.add(1);
    its.ceil(1);
    assert (ExpressionEvaluator.evaluateQuantifiedExpression("all",
        "this . tree . root . * parent + right",
        "(!(n . parent != null) || n . key != n . parent . key) && (!(n . right != null) || n . key != n . right . key)",
        its));
  }
}
