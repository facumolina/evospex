package casestudies.antlr;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CommonTreedeleteChild4Suite3 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test01"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test02"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test03"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test04"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test05"); }


    casestudies.antlr.CommonTree commonTree0 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree2 = new casestudies.antlr.CommonTree(3);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree2);
    casestudies.antlr.CommonTree commonTree5 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree7 = new casestudies.antlr.CommonTree(3);
    commonTree5.setParent((casestudies.antlr.Tree)commonTree7);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree5);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj22 = commonTree0.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test06"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test07"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test08"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test09"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test10"); }


    casestudies.antlr.CommonTree commonTree0 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree2 = new casestudies.antlr.CommonTree(3);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree2);
    casestudies.antlr.CommonTree commonTree5 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree7 = new casestudies.antlr.CommonTree(3);
    commonTree5.setParent((casestudies.antlr.Tree)commonTree7);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree5);
    casestudies.antlr.CommonTree commonTree10 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(3);
    commonTree10.setParent((casestudies.antlr.Tree)commonTree12);
    casestudies.antlr.CommonTree commonTree15 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    commonTree15.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree10.setParent((casestudies.antlr.Tree)commonTree15);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree10);
    java.lang.Object obj21 = commonTree0.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test11"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test12"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test13"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test14"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test15"); }


    casestudies.antlr.CommonTree commonTree0 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree2 = new casestudies.antlr.CommonTree(3);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree2);
    casestudies.antlr.CommonTree commonTree5 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree7 = new casestudies.antlr.CommonTree(3);
    commonTree5.setParent((casestudies.antlr.Tree)commonTree7);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree5);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj22 = commonTree0.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test16"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test17"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test18"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test19"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test20"); }


    casestudies.antlr.CommonTree commonTree0 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree2 = new casestudies.antlr.CommonTree(3);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree2);
    casestudies.antlr.CommonTree commonTree5 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree7 = new casestudies.antlr.CommonTree(3);
    commonTree5.setParent((casestudies.antlr.Tree)commonTree7);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree5);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj22 = commonTree0.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test21"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test22"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test23"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test24"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test25"); }


    casestudies.antlr.CommonTree commonTree0 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree2 = new casestudies.antlr.CommonTree(3);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree2);
    casestudies.antlr.CommonTree commonTree5 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree7 = new casestudies.antlr.CommonTree(3);
    commonTree5.setParent((casestudies.antlr.Tree)commonTree7);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree5);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj22 = commonTree0.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test26"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test27"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test28"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test29"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree18 = new casestudies.antlr.CommonTree();
    commonTree17.setParent((casestudies.antlr.Tree)commonTree18);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj23 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test30"); }


    casestudies.antlr.CommonTree commonTree0 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree2 = new casestudies.antlr.CommonTree(3);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree2);
    casestudies.antlr.CommonTree commonTree5 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree7 = new casestudies.antlr.CommonTree(3);
    commonTree5.setParent((casestudies.antlr.Tree)commonTree7);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree5);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj22 = commonTree0.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test31"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test32"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test33"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test34"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test35"); }


    casestudies.antlr.CommonTree commonTree0 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree2 = new casestudies.antlr.CommonTree(3);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree2);
    casestudies.antlr.CommonTree commonTree5 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree7 = new casestudies.antlr.CommonTree(3);
    commonTree5.setParent((casestudies.antlr.Tree)commonTree7);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree5);
    casestudies.antlr.CommonTree commonTree10 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(3);
    commonTree10.setParent((casestudies.antlr.Tree)commonTree12);
    casestudies.antlr.CommonTree commonTree15 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    commonTree15.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree10.setParent((casestudies.antlr.Tree)commonTree15);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree10);
    java.lang.Object obj21 = commonTree0.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test36"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test37"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test38"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test39"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test40"); }


    casestudies.antlr.CommonTree commonTree0 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree2 = new casestudies.antlr.CommonTree(3);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree2);
    casestudies.antlr.CommonTree commonTree5 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree7 = new casestudies.antlr.CommonTree(3);
    commonTree5.setParent((casestudies.antlr.Tree)commonTree7);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree5);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree15 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    commonTree15.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree15);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj21 = commonTree0.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test41"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test42"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test43"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test44"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test45"); }


    casestudies.antlr.CommonTree commonTree0 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree2 = new casestudies.antlr.CommonTree(3);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree2);
    casestudies.antlr.CommonTree commonTree5 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree7 = new casestudies.antlr.CommonTree(3);
    commonTree5.setParent((casestudies.antlr.Tree)commonTree7);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree5);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree15 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    commonTree15.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree15);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj21 = commonTree0.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test46"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test47"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test48"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test49"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test50"); }


    casestudies.antlr.CommonTree commonTree0 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree2 = new casestudies.antlr.CommonTree(3);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree2);
    casestudies.antlr.CommonTree commonTree5 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree7 = new casestudies.antlr.CommonTree(3);
    commonTree5.setParent((casestudies.antlr.Tree)commonTree7);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree5);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree15 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    commonTree15.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree15);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj21 = commonTree0.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test51"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test52"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test53"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test54"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree(3);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree14);
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree17 = new casestudies.antlr.CommonTree();
    commonTree16.setParent((casestudies.antlr.Tree)commonTree17);
    commonTree12.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree12);
    java.lang.Object obj22 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test55"); }


    casestudies.antlr.CommonTree commonTree0 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree2 = new casestudies.antlr.CommonTree(3);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree2);
    casestudies.antlr.CommonTree commonTree5 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree7 = new casestudies.antlr.CommonTree(3);
    commonTree5.setParent((casestudies.antlr.Tree)commonTree7);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree5);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree15 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    commonTree15.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree15);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj21 = commonTree0.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test56"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree15 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    commonTree15.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree15);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj21 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test57"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(2);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree15 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    commonTree15.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree15);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj21 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test58"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(1);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree15 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    commonTree15.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree15);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj21 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test59"); }


    casestudies.antlr.CommonTree commonTree1 = new casestudies.antlr.CommonTree(0);
    casestudies.antlr.CommonTree commonTree3 = new casestudies.antlr.CommonTree(3);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree3);
    casestudies.antlr.CommonTree commonTree6 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree8 = new casestudies.antlr.CommonTree(3);
    commonTree6.setParent((casestudies.antlr.Tree)commonTree8);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree6);
    casestudies.antlr.CommonTree commonTree11 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree13 = new casestudies.antlr.CommonTree(3);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree13);
    casestudies.antlr.CommonTree commonTree15 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree16 = new casestudies.antlr.CommonTree();
    commonTree15.setParent((casestudies.antlr.Tree)commonTree16);
    commonTree11.setParent((casestudies.antlr.Tree)commonTree15);
    commonTree1.setParent((casestudies.antlr.Tree)commonTree11);
    java.lang.Object obj21 = commonTree1.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","CommonTreedeleteChild4Suite3.test60"); }


    casestudies.antlr.CommonTree commonTree0 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree2 = new casestudies.antlr.CommonTree(3);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree2);
    casestudies.antlr.CommonTree commonTree5 = new casestudies.antlr.CommonTree(3);
    casestudies.antlr.CommonTree commonTree7 = new casestudies.antlr.CommonTree(3);
    commonTree5.setParent((casestudies.antlr.Tree)commonTree7);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree5);
    casestudies.antlr.CommonTree commonTree10 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree12 = new casestudies.antlr.CommonTree(3);
    commonTree10.setParent((casestudies.antlr.Tree)commonTree12);
    casestudies.antlr.CommonTree commonTree14 = new casestudies.antlr.CommonTree();
    casestudies.antlr.CommonTree commonTree15 = new casestudies.antlr.CommonTree();
    commonTree14.setParent((casestudies.antlr.Tree)commonTree15);
    commonTree10.setParent((casestudies.antlr.Tree)commonTree14);
    commonTree0.setParent((casestudies.antlr.Tree)commonTree10);
    java.lang.Object obj20 = commonTree0.deleteChild(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);

  }

}
