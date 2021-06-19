package casestudies.commonscollections;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NodeCachingLinkedListclear4Suite5 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListclear4Suite5.test1"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListclear4Suite5.test2"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListclear4Suite5.test3"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListclear4Suite5.test4"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

}
