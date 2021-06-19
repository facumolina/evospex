package casestudies.motivation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AvlTreeListadd13Suite0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test01"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test02"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test03"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test04"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test05"); }


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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test06"); }


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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test07"); }


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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test08"); }


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
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test09"); }


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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test10"); }


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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test11"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i2 = avltreelist_i0.remove(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test12"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i2 = avltreelist_i0.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test13"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i2 = avltreelist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test14"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test15"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test16"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test17"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test18"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test19"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test20"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test21"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test22"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test23"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test24"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test25"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test26"); }


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
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test27"); }


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
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test28"); }


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
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test29"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test30"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test31"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test32"); }


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
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test33"); }


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
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test34"); }


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
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test35"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test36"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test37"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test38"); }


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
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test39"); }


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
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test40"); }


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
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test41"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = avltreelist_i0.remove(1);
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
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test42"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = avltreelist_i0.remove(1);
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
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test43"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = avltreelist_i0.remove(1);
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
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test44"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = avltreelist_i0.remove(2);
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
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test45"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = avltreelist_i0.remove(2);
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
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test46"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = avltreelist_i0.remove(2);
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
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test47"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = avltreelist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test48"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = avltreelist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test49"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = avltreelist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test50"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = avltreelist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test51"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = avltreelist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test52"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = avltreelist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test53"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = avltreelist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test54"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = avltreelist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test55"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = avltreelist_i0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test56"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = avltreelist_i0.remove(2);
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
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test57"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = avltreelist_i0.remove(2);
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
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test58"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = avltreelist_i0.remove(2);
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
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test59"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = avltreelist_i0.remove(2);
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
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test60"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = avltreelist_i0.remove(2);
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
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test61"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = avltreelist_i0.remove(2);
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
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test62"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = avltreelist_i0.remove(2);
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
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test63"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = avltreelist_i0.remove(2);
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
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test64"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    avltreelist_i0.add(0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = avltreelist_i0.remove(2);
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
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test65"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test66"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test67"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test68"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test69"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test70"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test71"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test72"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test73"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test74"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test75"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)1);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd13Suite0.test76"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)2);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

}
