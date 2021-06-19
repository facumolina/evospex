package casestudies.motivation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AvlTreeListadd24Suite1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test001"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test002"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test003"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test004"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test005"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test006"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test007"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test008"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test009"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test010"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test011"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test012"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test013"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test014"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test015"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test016"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test017"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test018"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test019"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test020"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test021"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test022"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test023"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test024"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test025"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test026"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test027"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test028"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test029"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test030"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test031"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test032"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test033"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test034"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test035"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test036"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test037"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test038"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test039"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test040"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test041"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test042"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test043"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)2);
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
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test044"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(2, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test045"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(2, (java.lang.Integer)2);
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
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test046"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(2, (java.lang.Integer)2);
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
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test047"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(2, (java.lang.Integer)2);
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
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test048"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(2, (java.lang.Integer)2);
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
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test049"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(2, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test050"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(2, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test051"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(2, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test052"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(2, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test053"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(2, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test054"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(2, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test055"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(2, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test056"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(2, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test057"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(2, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test058"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(1, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test059"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(1, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test060"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(1, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test061"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(1, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test062"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(1, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test063"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(1, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test064"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(1, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test065"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(1, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test066"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(1, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test067"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(1, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test068"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(1, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test069"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    avltreelist_i0.add(0, (java.lang.Integer)2);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test070"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test071"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test072"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test073"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test074"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test075"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test076"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test077"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test078"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test079"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test080"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test081"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test082"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test083"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test084"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test085"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test086"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test087"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test088"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test089"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test090"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test091"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test092"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test093"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test094"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test095"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test096"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test097"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test098"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test099"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test100"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test101"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test102"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test103"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test104"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test105"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test106"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test107"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test108"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test109"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test110"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test111"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test112"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test113"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test114"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)1);
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
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test115"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test116"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(2, (java.lang.Integer)1);
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
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test117"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(2, (java.lang.Integer)1);
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
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test118"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(2, (java.lang.Integer)1);
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
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test119"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(2, (java.lang.Integer)1);
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
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test120"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(2, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test121"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(2, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test122"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(2, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test123"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(2, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test124"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(1, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test125"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(1, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test126"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(1, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test127"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(1, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test128"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(1, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test129"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(1, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test130"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(1, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test131"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    avltreelist_i0.add(0, (java.lang.Integer)1);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test132"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test133"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test134"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test135"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test136"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test137"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test138"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test139"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test140"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test141"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test142"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test143"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test144"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test145"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test146"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test147"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test148"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test149"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test150"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test151"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test152"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test153"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test154"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test155"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test156"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test157"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test158"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test159"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test160"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test161"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test162"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test163"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test164"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test165"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test166"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test167"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test168"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test169"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test170"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test171"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test172"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test173"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(3, (java.lang.Integer)0);
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
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test174"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test175"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(2, (java.lang.Integer)0);
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
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test176"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(2, (java.lang.Integer)0);
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
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test177"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(2, (java.lang.Integer)0);
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
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test178"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(2, (java.lang.Integer)0);
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
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test179"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(2, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test180"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    avltreelist_i0.add(1, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test181"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test182"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test183"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test184"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test185"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    avltreelist_i0.add(0, (java.lang.Integer)0);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test186"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)3);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test187"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test188"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd24Suite1.test189"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

}
