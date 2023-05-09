package evospex.expression.evaluator;

import casestudies.commonscollections.NodeCachingLinkedList;
import casestudies.kodkod.IntTreeSet;
import casestudies.motivation.AvlTreeList;
import evospex.expression.ExprGrammarParser;
import evospex.expression.symbol.ExprName;
import evospex.expression.util.ExprUtils;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.Set;

public class ExpressionEvaluatorTest {

  private boolean evalStrExpr(String strExpr, Object o) {
    ExprGrammarParser.ExprContext expr = ExprUtils.getExprContext(strExpr);
    return ((Boolean) ExpressionEvaluator.evalAnyExpr(expr, ExprName.THIS, o));
  }

  @Test
  public void testRefComparisonNoSpaces() {
    AvlTreeList<Integer> avl = new AvlTreeList();
    assertTrue(evalStrExpr("this.root.value=null",avl));
  }

  @Test
  public void testStr0() {
    AvlTreeList<Integer> avl = new AvlTreeList<>();
    assert (evalStrExpr("all n : this.root.*(left+right) : n.size=0",avl));
  }

  @Test
  public void testStr1() {
    AvlTreeList<Integer> avl = new AvlTreeList<>();
    avl.add(1);
    assert (!evalStrExpr("all n : this.root.*(left+right) : n.size=0",avl));
  }

  @Test
  public void testStr2() {
    AvlTreeList<Integer> avl = new AvlTreeList<>();
    avl.add(1);
    assert (evalStrExpr("this.root.size > 0",avl));
  }

  @Test
  public void testStr3() {
    AvlTreeList<Integer> avl = new AvlTreeList<>();
    avl.add(1);
    assert (!evalStrExpr("this.root.size = 0",avl));
  }

  @Test
  public void testStr4() {
    AvlTreeList<Integer> avl = new AvlTreeList<>();
    avl.add(1);
    assert (!evalStrExpr("this.root.size < 0",avl));
  }

  @Test
  public void testNCLLSetMembership0() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    assert (!evalStrExpr("4 in this.header.*(next).value",ncll));
  }

  @Test
  public void testNCLLSetMembership1() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    ncll.add(4);
    assert (evalStrExpr("4 in this.header.*(next).value",ncll));
  }

  @Test
  public void testNCLLSetMembership2() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    ncll.add(4);
    ncll.add(5);
    ncll.add(6);
    assert (evalStrExpr("6 in this.header.*(next).value",ncll));
  }

  @Test
  public void testNCLLSetMembership3() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    ncll.addLast(4);
    ExprGrammarParser.ExprContext expr = ExprUtils.getExprContext("this.header.*(next).value");
    Set<Object> set = (Set<Object>)ExpressionEvaluator.evalAnyExpr(expr, ExprName.THIS, ncll);
    assert (set!=null && set.contains(4));
  }

  @Test
  public void testNCLLQuantified0() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    assert (evalStrExpr("all n: this.header.*(next+previous): n.previous!=null",ncll));
  }

  @Test
  public void testNCLLQuantified1() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    ncll.add(2);
    assert (evalStrExpr("all n: this.header.*(next+previous): n.previous!=null",ncll));
  }

  @Test
  public void testNCLLQuantified2() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    ncll.add(2);
    ncll.add(4);
    ncll.add(1);
    assert (evalStrExpr("all n: this.header.*(next+previous): n.previous!=null",ncll));
  }

  @Test
  public void testNCLLQuantified3() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    assert (evalStrExpr("all n: this.header.*(next+previous): n = n.next.previous",ncll));
  }

  @Test
  public void testNCLLQuantified4() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    ncll.add(2);
    assert (evalStrExpr("all n: this.header.*(next+previous): n = n.next.previous",ncll));
  }

  @Test
  public void testNCLLQuantified5() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    ncll.add(2);
    ncll.add(4);
    ncll.add(1);
    assert (evalStrExpr("all n: this.header.*(next+previous): n = n.next.previous",ncll));
  }

  @Test
  public void testNCLLNotSetMembership0() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    ncll.add(2);
    assert (!evalStrExpr("2 in this.firstCachedNode.*(previous).value",ncll));
  }

  @Test
  public void testNCLLNotSetMembership1() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    ncll.add(2);
    ncll.add(3);
    ncll.add(4);
    assert (!evalStrExpr("2 in this.firstCachedNode.*(previous).value",ncll));
  }

  @Test
  public void testNCLLCacheListSize1() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    ncll.addLast(4);
    assert (evalStrExpr("0 = #(this.firstCachedNode.*(next+previous))",ncll));
  }

  @Test
  public void testNCLLCacheListSize2() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    ncll.addLast(4);
    ncll.removeFirst();
    assert (evalStrExpr("1 = #(this.firstCachedNode.*(next+previous))",ncll));
  }

  @Test
  public void test2() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    Integer integer0 = -1799;
    ncll.addLast(integer0);
    assert (evalStrExpr("all n: this.header.*(next+previous): n in n.^(previous)",ncll));
  }

  @Test
  public void test3() {
    NodeCachingLinkedList<Object> ncll = new NodeCachingLinkedList<>();
    Object object0 = new Object();
    ncll.addLast(null);
    ncll.addLast(object0);
    ncll.clear();
    ncll.addFirst("wZ}!_XR ");
    assert (evalStrExpr("all n: this.header.*(next+previous): n in n.^(next+previous)",ncll));
  }

  @Test
  public void test4() {
    IntTreeSet intTreeSetGA0 = new IntTreeSet();
    intTreeSetGA0.add(0);
    intTreeSetGA0.add(1);
    assert (evalStrExpr("0 in this.tree.root.*(left+right).min",intTreeSetGA0));
  }
}
