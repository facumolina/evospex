package casestudies.commonscollections;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TreeListadd14Suite0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test001"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test002"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test003"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test004"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test005"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test006"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test007"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)3);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test008"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(1, (java.lang.Integer)3);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test009"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test010"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)2);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test011"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(1, (java.lang.Integer)2);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test012"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test013"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test014"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(1, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test015"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test016"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test017"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(1, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test018"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i2 = treelist_i0.remove(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test019"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i2 = treelist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test020"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i2 = treelist_i0.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test021"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i2 = treelist_i0.remove(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test022"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test023"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test024"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test025"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test026"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test027"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test028"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test029"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test030"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test031"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test032"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test033"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test034"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test035"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test036"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test037"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test038"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test039"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test040"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test041"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test042"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)3);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test043"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)3);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test044"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)3);
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
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test045"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)3);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test046"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test047"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test048"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test049"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test050"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test051"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test052"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test053"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test054"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)2);
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
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test055"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)2);
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
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test056"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)2);
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
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test057"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)2);
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
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test058"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test059"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test060"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test061"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test062"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test063"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test064"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test065"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test066"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)1);
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
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test067"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)1);
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
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test068"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)1);
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
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test069"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)1);
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
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test070"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test071"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test072"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test073"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test074"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test075"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test076"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test077"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test078"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)0);
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
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test079"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)0);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test080"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)0);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test081"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(2, (java.lang.Integer)0);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test082"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test083"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test084"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test085"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test086"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = treelist_i0.remove(3);
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
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test087"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = treelist_i0.remove(3);
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
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test088"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = treelist_i0.remove(3);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test089"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = treelist_i0.remove(3);
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
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test090"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = treelist_i0.remove(2);
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
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test091"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = treelist_i0.remove(2);
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
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test092"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = treelist_i0.remove(2);
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
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test093"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = treelist_i0.remove(2);
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
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test094"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = treelist_i0.remove(1);
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
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test095"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = treelist_i0.remove(1);
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
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test096"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = treelist_i0.remove(1);
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
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test097"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = treelist_i0.remove(1);
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
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test098"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test099"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test100"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test101"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test102"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test103"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test104"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test105"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test106"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test107"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test108"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test109"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test110"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test111"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test112"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test113"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test114"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test115"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test116"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test117"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test118"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test119"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test120"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test121"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test122"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test123"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test124"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test125"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test126"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test127"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test128"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test129"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test130"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test131"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test132"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test133"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test134"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test135"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test136"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test137"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test138"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test139"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test140"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test141"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test142"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test143"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test144"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test145"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test146"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test147"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test148"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test149"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test150"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test151"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test152"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test153"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test154"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test155"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test156"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test157"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test158"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test159"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test160"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test161"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test162"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test163"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test164"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test165"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test166"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test167"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test168"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test169"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test170"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test171"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test172"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test173"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test174"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test175"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test176"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test177"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test178"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test179"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test180"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test181"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test182"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test183"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test184"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test185"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test186"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test187"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test188"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test189"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test190"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test191"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test192"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test193"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)3);
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
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test194"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test195"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test196"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test197"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test198"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test199"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test200"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test201"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test202"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test203"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test204"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test205"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test206"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test207"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test208"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test209"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test210"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test211"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test212"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test213"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test214"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test215"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test216"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test217"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test218"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test219"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test220"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test221"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test222"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test223"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test224"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test225"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)2);
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
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test226"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test227"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test228"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test229"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test230"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test231"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test232"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test233"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test234"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test235"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test236"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test237"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test238"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test239"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test240"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test241"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test242"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test243"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test244"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test245"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test246"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test247"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test248"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test249"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test250"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test251"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test252"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test253"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test254"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test255"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test256"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test257"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)1);
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
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test258"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test259"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test260"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test261"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test262"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test263"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test264"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test265"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test266"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test267"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test268"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test269"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test270"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test271"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test272"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test273"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test274"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test275"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test276"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test277"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test278"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test279"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test280"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test281"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test282"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test283"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test284"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test285"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test286"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test287"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test288"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test289"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    treelist_i0.add(3, (java.lang.Integer)0);
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
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test290"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test291"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test292"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test293"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test294"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test295"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test296"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test297"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test298"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test299"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test300"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test301"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test302"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test303"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test304"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test305"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(3);
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
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test306"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test307"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test308"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test309"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test310"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test311"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test312"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test313"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test314"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test315"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test316"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test317"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test318"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test319"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test320"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test321"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(3);
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
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test322"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test323"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test324"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test325"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test326"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test327"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test328"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test329"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test330"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test331"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test332"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test333"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test334"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test335"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test336"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test337"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = treelist_i0.remove(2);
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
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test338"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test339"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test340"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test341"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test342"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test343"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test344"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test345"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test346"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test347"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test348"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test349"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test350"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test351"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test352"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test353"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    treelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = treelist_i0.remove(2);
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
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test354"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test355"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test356"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test357"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test358"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test359"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test360"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test361"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test362"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test363"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test364"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test365"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test366"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test367"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test368"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test369"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test370"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test371"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test372"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test373"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test374"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test375"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test376"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test377"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test378"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test379"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test380"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test381"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test382"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test383"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test384"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test385"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test386"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test387"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test388"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test389"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test390"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test391"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test392"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test393"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test394"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test395"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test396"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test397"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test398"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test399"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test400"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test401"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test402"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test403"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test404"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test405"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test406"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test407"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test408"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test409"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test410"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test411"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test412"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test413"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test414"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test415"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test416"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test417"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test418"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test419"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test420"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test421"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test422"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test423"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test424"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test425"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test426"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test427"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test428"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test429"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test430"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test431"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test432"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test433"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test434"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test435"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test436"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test437"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test438"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test439"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test440"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test441"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test442"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test443"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test444"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test445"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test446"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test447"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test448"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test449"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test450"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test451"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test452"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test453"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test454"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test455"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test456"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test457"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test458"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test459"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test460"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test461"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test462"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test463"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test464"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test465"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)1);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test466"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test467"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test468"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test469"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test470"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test471"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test472"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test473"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test474"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test475"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test476"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test477"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test478"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test479"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test480"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test481"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)0);
    boolean b8 = treelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test482"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test483"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test484"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test485"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test486"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test487"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test488"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test489"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)2);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test490"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test491"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test492"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test493"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)1);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test494"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test495"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test496"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test497"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)0);
    boolean b4 = treelist_i0.add((java.lang.Integer)0);
    boolean b6 = treelist_i0.add((java.lang.Integer)3);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test498"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)3);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test499"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)2);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","TreeListadd14Suite0.test500"); }


    casestudies.commonscollections.TreeList<java.lang.Integer> treelist_i0 = new casestudies.commonscollections.TreeList<java.lang.Integer>();
    boolean b2 = treelist_i0.add((java.lang.Integer)1);
    boolean b4 = treelist_i0.add((java.lang.Integer)3);
    boolean b6 = treelist_i0.add((java.lang.Integer)2);
    boolean b8 = treelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

}
