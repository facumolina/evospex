package hamcrest.utils;

import java.util.LinkedList;

import org.junit.Test;

import casestudies.commonscollections.NodeCachingLinkedList;
import casestudies.commonscollections.TreeList;
import casestudies.kodkod.IntTreeSet;
import casestudies.motivation.AvlTreeList;
import casestudies.simpleexample.Container;

public class TestExpressionEvaluator {

  @Test
  public void testStr0() throws Exception {
    AvlTreeList<Integer> avl = new AvlTreeList<Integer>();
    boolean b = ExpressionEvaluator.evaluateQuantifiedExpression("all",
        "thiz . root . * left + right", "n . size == 0", avl);
    assert (b);
  }

  @Test
  public void testStr1() throws Exception {
    AvlTreeList<Integer> avl = new AvlTreeList<Integer>();
    avl.add(1);
    boolean b = ExpressionEvaluator.evaluateQuantifiedExpression("all",
        "thiz . root . * left + right", "n . size == 0", avl);
    assert (!b);
  }

  @Test
  public void testStr2() throws Exception {
    AvlTreeList<Integer> avl = new AvlTreeList<Integer>();
    avl.add(1);
    boolean b = ExpressionEvaluator.evaluateBooleanExpression("thiz . root . size > 0", avl);
    assert (b);
  }

  @Test
  public void testStr3() throws Exception {
    AvlTreeList<Integer> avl = new AvlTreeList<Integer>();
    avl.add(1);
    boolean b = ExpressionEvaluator.evaluateBooleanExpression("thiz . root . size == 0", avl);
    assert (!b);
  }

  @Test
  public void testStr4() throws Exception {
    AvlTreeList<Integer> avl = new AvlTreeList<Integer>();
    avl.add(1);
    boolean b = ExpressionEvaluator.evaluateBooleanExpression("thiz . root . size < 0", avl);
    assert (!b);
  }

  @Test
  public void testNCLLSetMembership0() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    assert (!ExpressionEvaluator.evaluateSetMembership(4, "this . header . * next . value", ncll));
  }

  @Test
  public void testNCLLSetMembership1() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    ncll.add(4);
    assert (ExpressionEvaluator.evaluateSetMembership(4, "this . header . * next . value", ncll));
  }

  @Test
  public void testNCLLSetMembership2() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    ncll.add(4);
    ncll.add(5);
    ncll.add(6);
    assert (ExpressionEvaluator.evaluateSetMembership(6, "this . header . * next . value", ncll));
  }

  @Test
  public void testNCLLSetMembership3() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    ncll.addLast(4);
    assert (!ExpressionEvaluator.evaluateSetMembership(5, "this . header . * next . value", ncll));
  }

  @Test
  public void testNCLLQuantified0() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    assert (ExpressionEvaluator.evaluateQuantifiedExpression("all",
        "this . header . * next + previous", "n . previous != null", ncll));
  }

  @Test
  public void testNCLLQuantified1() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    ncll.add(2);
    assert (ExpressionEvaluator.evaluateQuantifiedExpression("all",
        "this . header . * next + previous", "n . previous != null", ncll));
  }

  @Test
  public void testNCLLQuantified2() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    ncll.add(2);
    ncll.add(4);
    ncll.add(1);
    assert (ExpressionEvaluator.evaluateQuantifiedExpression("all",
        "this . header . * next + previous", "n . previous != null", ncll));
  }

  @Test
  public void testNCLLQuantified3() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    assert (ExpressionEvaluator.evaluateQuantifiedExpression("all",
        "this . header . * next + previous", "n == n . next . previous", ncll));
  }

  @Test
  public void testNCLLQuantified4() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    ncll.add(2);
    assert (ExpressionEvaluator.evaluateQuantifiedExpression("all",
        "this . header . * next + previous", "n == n . next . previous", ncll));
  }

  @Test
  public void testNCLLQuantified5() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    ncll.add(2);
    ncll.add(4);
    ncll.add(1);
    assert (ExpressionEvaluator.evaluateQuantifiedExpression("all",
        "this . header . * next + previous", "n == n . next . previous", ncll));
  }

  @Test
  public void testNCLLNotSetMembership0() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    ncll.add(2);
    assert (!ExpressionEvaluator.evaluateSetMembership(2,
        "this . firstCachedNode . * previous . value", ncll));
  }

  @Test
  public void testNCLLNotSetMembership1() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    ncll.add(2);
    ncll.add(3);
    ncll.add(4);
    assert (!ExpressionEvaluator.evaluateSetMembership(2,
        "this . firstCachedNode . * previous . value", ncll));
  }

  @Test
  public void testNCLLNotSetMembership2() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    ncll.add(2);
    ncll.add(4);
    ncll.removeFirst();
    ncll.removeFirst();
    ncll.add(null);
    assert (ExpressionEvaluator.evaluateSetMembership(null,
        "this . firstCachedNode . * previous . value", ncll));
  }

  @Test
  public void testNCLLCacheListSize1() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    ncll.addLast(4);
    int cs = ExpressionEvaluator
        .evaluateSetSize("this . firstCachedNode . * next + previous - null", ncll);
    assert (ncll.getCacheSize() == cs);
    assert (cs == 0);
  }

  @Test
  public void testNCLLCacheListSize2() throws Exception {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    ncll.addLast(4);
    ncll.removeFirst();
    int cs = ExpressionEvaluator
        .evaluateSetSize("this . firstCachedNode . * next + previous - null", ncll);
    assert (ncll.getCacheSize() == cs);
    assert (cs == 1);
  }

  @Test
  public void test2() {
    NodeCachingLinkedList<Integer> nodeCachingLinkedListGA0 = new NodeCachingLinkedList<Integer>();
    Integer integer0 = new Integer((-1799));
    nodeCachingLinkedListGA0.addLast(integer0);
    assert (ExpressionEvaluator.evaluateQuantifiedExpression("all",
        "this . header . * next + previous", "n in n . ^ previous", nodeCachingLinkedListGA0));
  }

  @Test
  public void test3() {
    NodeCachingLinkedList<Object> nodeCachingLinkedListGA0 = new NodeCachingLinkedList<Object>();
    Object object0 = new Object();
    nodeCachingLinkedListGA0.addLast(null);
    nodeCachingLinkedListGA0.addLast(object0);
    nodeCachingLinkedListGA0.clear();
    nodeCachingLinkedListGA0.addFirst("wZ}!_XR ");
    assert (ExpressionEvaluator.evaluateQuantifiedExpression("all",
        "this . firstCachedNode . * next + previous", "n !in n . ^ next + previous",
        nodeCachingLinkedListGA0));
  }

  @Test
  public void test4() {
    IntTreeSet intTreeSetGA0 = new IntTreeSet();
    boolean boolean0 = intTreeSetGA0.add(0);
    boolean boolean1 = intTreeSetGA0.add(1);
    assert (!ExpressionEvaluator.evaluateSetMembership(1,
        "this . tree . root . * left + right . min", intTreeSetGA0));
  }

  @Test
  public void weirdTestSearchingForFNs() {
    NodeCachingLinkedList<Object> nodeCachingLinkedListGA0 = new NodeCachingLinkedList<Object>();
    int int0 = 2060;
    boolean boolean0 = nodeCachingLinkedListGA0.addFirst(nodeCachingLinkedListGA0);
    //nodeCachingLinkedListGA0.hashCode();
  }

  @Test
  public void test5() {
    TreeList<Integer> treeListGA0 = new TreeList<Integer>();
    int int0 = 0;
    Integer integer1 = null;
    treeListGA0.add(int0, integer1);
    Integer integer3 = new Integer(int0);
    treeListGA0.add(int0, integer3);
    String string2 = "`d";
    Integer integer6 = Integer.getInteger(string2);
    treeListGA0.add(int0, integer6);
    TreeList<Object> treeListGA2 = new TreeList<Object>();
    treeListGA2.add(string2);
    int int7 = 2;
    Object object0 = new Object();
    // treeListGA2.add(int7, object0);
    assert (ExpressionEvaluator.evaluateQuantifiedExpression("all", "this . root . * left + right",
        "(!(n . left != null) || n . height != n . left . height) && (!(n . right != null) || n . height != n . right . height)",
        treeListGA0));
  }

  @Test
  public void test6() {
    LinkedList<String> linkedList0 = new LinkedList<String>();
    String s0 = "s0";
    boolean boolean0 = linkedList0.add(s0);
    boolean boolean1 = linkedList0.add(s0);
    boolean boolean2 = linkedList0.add(s0);
    TreeList<String> treeListGA0 = new TreeList<String>(linkedList0);
    treeListGA0.add(0, s0);
    assert (ExpressionEvaluator.evaluateQuantifiedExpression("all", "this . root . * left + right",
        "(!(n . left != null) || n . height != n . left . height) && (!(n . right != null) || n . height != n . right . height)",
        treeListGA0));
  }

  @Test
  public void test7() {
    Container c = new Container();
    Integer m = Integer.MAX_VALUE;
    c.add(m);
    assert (ExpressionEvaluator.evaluateSetMembership(m, "this . subNodes", c));
  }
}
