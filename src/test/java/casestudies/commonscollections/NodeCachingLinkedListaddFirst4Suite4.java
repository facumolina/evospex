package casestudies.commonscollections;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NodeCachingLinkedListaddFirst4Suite4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test001"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test002"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test003"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(1, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test004"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(1, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test005"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test006"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test007"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test008"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test009"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test010"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test011"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test012"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test013"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test014"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test015"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test016"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test017"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test018"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test019"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test020"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test021"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test022"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test023"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test024"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test025"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test026"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test027"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test028"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test029"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test030"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test031"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test032"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test033"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test034"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test035"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test036"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test037"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test038"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test039"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test040"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test041"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test042"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test043"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test044"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test045"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test046"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test047"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test048"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test049"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test050"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test051"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test052"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test053"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test054"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test055"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test056"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test057"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test058"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test059"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test060"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test061"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test062"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test063"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test064"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test065"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test066"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test067"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test068"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test069"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test070"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test071"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test072"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test073"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(1, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test074"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(1, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test075"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test076"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test077"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test078"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test079"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test080"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test081"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test082"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test083"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test084"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test085"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test086"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test087"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test088"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test089"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test090"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test091"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test092"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test093"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test094"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test095"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test096"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test097"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test098"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test099"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test100"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test101"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test102"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test103"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test104"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test105"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test106"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test107"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test108"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test109"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test110"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test111"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test112"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test113"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test114"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test115"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test116"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test117"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test118"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test119"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test120"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test121"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test122"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test123"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test124"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test125"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test126"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test127"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test128"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test129"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test130"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test131"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test132"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test133"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test134"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test135"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test136"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test137"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test138"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test139"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test140"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test141"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test142"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test143"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(1, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test144"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(1, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test145"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test146"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test147"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test148"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test149"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test150"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test151"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test152"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test153"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test154"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test155"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test156"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test157"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test158"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test159"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test160"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test161"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test162"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test163"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test164"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test165"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test166"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test167"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test168"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test169"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test170"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test171"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test172"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test173"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test174"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test175"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test176"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test177"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test178"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test179"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test180"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test181"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test182"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test183"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test184"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test185"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test186"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test187"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test188"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test189"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test190"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test191"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test192"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test193"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test194"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test195"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test196"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test197"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test198"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test199"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test200"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test201"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test202"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test203"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test204"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test205"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test206"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test207"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test208"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test209"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test210"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test211"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test212"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test213"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(1, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test214"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(1, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test215"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test216"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i9 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test217"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test218"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test219"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test220"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test221"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test222"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test223"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test224"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test225"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test226"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test227"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test228"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test229"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test230"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test231"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test232"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test233"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test234"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test235"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test236"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test237"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test238"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test239"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test240"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test241"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test242"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test243"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test244"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test245"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test246"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test247"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test248"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test249"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test250"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test251"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test252"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test253"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test254"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test255"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test256"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test257"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test258"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test259"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test260"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test261"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test262"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test263"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test264"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test265"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test266"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test267"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test268"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test269"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test270"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test271"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test272"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test273"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test274"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test275"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test276"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test277"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test278"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test279"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test280"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test281"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test282"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i9 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test283"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test284"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test285"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test286"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test287"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test288"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test289"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test290"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test291"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test292"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test293"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test294"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test295"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test296"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test297"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test298"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test299"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test300"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test301"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test302"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test303"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test304"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test305"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test306"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test307"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test308"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test309"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test310"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test311"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test312"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test313"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test314"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test315"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test316"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test317"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test318"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test319"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test320"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test321"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test322"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test323"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test324"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test325"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test326"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test327"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test328"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test329"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test330"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test331"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test332"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test333"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test334"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test335"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test336"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test337"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test338"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test339"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test340"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test341"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test342"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test343"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test344"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test345"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test346"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i8 = nodecachinglinkedlist_i0.remove(2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test347"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i1.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test348"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i9 = nodecachinglinkedlist_i0.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test349"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test350"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test351"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test352"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test353"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodecachinglinkedlist_i1.remove(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test354"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i9 = nodecachinglinkedlist_i0.remove(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test355"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i9 = nodecachinglinkedlist_i1.removeFirst();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test356"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i8 = nodecachinglinkedlist_i0.removeFirst();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test357"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i9 = nodecachinglinkedlist_i1.removeLast();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test358"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i8 = nodecachinglinkedlist_i0.removeLast();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test359"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test360"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test361"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test362"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test363"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test364"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test365"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test366"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test367"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test368"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test369"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test370"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test371"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test372"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test373"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test374"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test375"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test376"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test377"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test378"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test379"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test380"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test381"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test382"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test383"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test384"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test385"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test386"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test387"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test388"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test389"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test390"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test391"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test392"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test393"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test394"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test395"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test396"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test397"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test398"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test399"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test400"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test401"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test402"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test403"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test404"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test405"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test406"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test407"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test408"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test409"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test410"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test411"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test412"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test413"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test414"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test415"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test416"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test417"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test418"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test419"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test420"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test421"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test422"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test423"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test424"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test425"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test426"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test427"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test428"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test429"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test430"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test431"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test432"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test433"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test434"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test435"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test436"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test437"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test438"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test439"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test440"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test441"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test442"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test443"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test444"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test445"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test446"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test447"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test448"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test449"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test450"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test451"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test452"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test453"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test454"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test455"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test456"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test457"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test458"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test459"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test460"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test461"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test462"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test463"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test464"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test465"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test466"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodecachinglinkedlist_i1.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test467"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test468"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test469"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test470"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test471"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test472"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test473"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test474"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test475"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test476"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test477"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test478"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodecachinglinkedlist_i1.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test479"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodecachinglinkedlist_i1.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test480"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i0.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test481"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodecachinglinkedlist_i1.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test482"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i0.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test483"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodecachinglinkedlist_i1.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test484"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i0.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test485"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodecachinglinkedlist_i1.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test486"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodecachinglinkedlist_i0.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test487"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodecachinglinkedlist_i1.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test488"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodecachinglinkedlist_i1.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test489"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodecachinglinkedlist_i1.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test490"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodecachinglinkedlist_i1.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 3+ "'", i9.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 3+ "'", i11.equals(3));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test491"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.addFirst((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test492"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.addFirst((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test493"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.addFirst((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test494"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(0);
    boolean b3 = nodecachinglinkedlist_i1.addFirst((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test495"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.addFirst((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test496"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.addFirst((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test497"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.addFirst((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test498"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.addFirst((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test499"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(0);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.addFirst((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListaddFirst4Suite4.test500"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.addFirst((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

}
