package casestudies.commonscollections;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NodeCachingLinkedListadd24Suite8 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test001"); }


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
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test002"); }


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
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test003"); }


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
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test004"); }


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
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test005"); }


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
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test006"); }


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
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test007"); }


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
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test008"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
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

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test009"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
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

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test010"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
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

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test011"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(0);
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

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test012"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
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

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test013"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
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

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test014"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
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

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test015"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
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

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test016"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(0);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
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

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test017"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
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

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test018"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
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

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test019"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
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

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test020"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
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

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test021"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(0);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
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

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test022"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
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

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test023"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
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

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test024"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
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

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test025"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
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

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test026"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(0);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
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

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test027"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
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

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test028"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
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

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test029"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
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

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test030"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
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

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test031"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(0);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
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

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test032"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
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

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test033"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test034"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test035"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test036"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(0);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    nodecachinglinkedlist_i1.add(2, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test037"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    nodecachinglinkedlist_i0.add(2, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test038"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
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

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test039"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
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

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test040"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
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

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test041"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
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

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test042"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
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

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test043"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
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

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test044"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
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

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test045"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i7 = nodecachinglinkedlist_i1.remove(1);
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
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 3+ "'", i7.equals(3));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test046"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i7 = nodecachinglinkedlist_i1.remove(1);
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
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 3+ "'", i7.equals(3));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test047"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i7 = nodecachinglinkedlist_i1.remove(1);
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
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 3+ "'", i7.equals(3));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test048"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i6 = nodecachinglinkedlist_i0.remove(1);
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
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 3+ "'", i6.equals(3));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test049"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i7 = nodecachinglinkedlist_i1.remove(1);
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
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 3+ "'", i7.equals(3));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test050"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i7 = nodecachinglinkedlist_i1.remove(1);
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
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 3+ "'", i7.equals(3));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test051"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)2);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i7 = nodecachinglinkedlist_i1.remove(1);
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
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 3+ "'", i7.equals(3));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test052"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)2);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i6 = nodecachinglinkedlist_i0.remove(1);
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
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 3+ "'", i6.equals(3));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test053"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i7 = nodecachinglinkedlist_i1.remove(1);
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
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 3+ "'", i7.equals(3));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test054"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i7 = nodecachinglinkedlist_i1.remove(1);
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
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 3+ "'", i7.equals(3));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test055"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)1);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i7 = nodecachinglinkedlist_i1.remove(1);
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
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 3+ "'", i7.equals(3));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test056"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)1);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i6 = nodecachinglinkedlist_i0.remove(1);
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
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 3+ "'", i6.equals(3));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test057"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i7 = nodecachinglinkedlist_i1.remove(1);
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
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 3+ "'", i7.equals(3));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test058"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i7 = nodecachinglinkedlist_i1.remove(1);
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
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 3+ "'", i7.equals(3));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test059"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i7 = nodecachinglinkedlist_i1.remove(1);
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
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 3+ "'", i7.equals(3));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test060"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    java.lang.Integer i6 = nodecachinglinkedlist_i0.remove(1);
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
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 3+ "'", i6.equals(3));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test061"); }


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
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test062"); }


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
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test063"); }


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
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test064"); }


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
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test065"); }


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
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test066"); }


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
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test067"); }


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
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test068"); }


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
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test069"); }


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
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test070"); }


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
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test071"); }


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
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test072"); }


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
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test073"); }


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
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test074"); }


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
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test075"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
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

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test076"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
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

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test077"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
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

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test078"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(0);
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

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test079"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
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

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test080"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    nodecachinglinkedlist_i1.add(1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test081"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    nodecachinglinkedlist_i1.add(1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test082"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    nodecachinglinkedlist_i1.add(1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test083"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(0);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    nodecachinglinkedlist_i1.add(1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test084"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    nodecachinglinkedlist_i0.add(1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test085"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
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

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test086"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
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

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test087"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
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

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test088"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
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

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test089"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
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

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test090"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
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

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test091"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
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

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test092"); }


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
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test093"); }


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
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test094"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    boolean b10 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    nodecachinglinkedlist_i1.add(1, (java.lang.Integer)0);
    
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
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test095"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    boolean b9 = nodecachinglinkedlist_i0.add((java.lang.Integer)0);
    nodecachinglinkedlist_i0.add(1, (java.lang.Integer)0);
    
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
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test096"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)0);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    java.lang.Integer i9 = nodecachinglinkedlist_i1.remove(2);
    java.lang.Integer i11 = nodecachinglinkedlist_i1.remove(1);
    nodecachinglinkedlist_i1.add(1, (java.lang.Integer)0);
    
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
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test097"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    nodecachinglinkedlist_i1.add(0, (java.lang.Integer)0);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test098"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    nodecachinglinkedlist_i1.add(0, (java.lang.Integer)0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test099"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(1);
    nodecachinglinkedlist_i1.add(0, (java.lang.Integer)0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test100"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(0);
    nodecachinglinkedlist_i1.add(0, (java.lang.Integer)0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test101"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    nodecachinglinkedlist_i0.add(0, (java.lang.Integer)0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test102"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    nodecachinglinkedlist_i1.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test103"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(2);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    nodecachinglinkedlist_i1.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test104"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    nodecachinglinkedlist_i0.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test105"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i1 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>(3);
    boolean b3 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b5 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    boolean b7 = nodecachinglinkedlist_i1.add((java.lang.Integer)3);
    nodecachinglinkedlist_i1.clear();
    nodecachinglinkedlist_i1.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NodeCachingLinkedListadd24Suite8.test106"); }


    casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer> nodecachinglinkedlist_i0 = new casestudies.commonscollections.NodeCachingLinkedList<java.lang.Integer>();
    boolean b2 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b4 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    boolean b6 = nodecachinglinkedlist_i0.add((java.lang.Integer)3);
    nodecachinglinkedlist_i0.clear();
    nodecachinglinkedlist_i0.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

}
