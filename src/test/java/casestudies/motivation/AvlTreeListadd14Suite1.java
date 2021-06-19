package casestudies.motivation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AvlTreeListadd14Suite1 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","AvlTreeListadd14Suite1.test1"); }


    casestudies.motivation.AvlTreeList<java.lang.Integer> avltreelist_i0 = new casestudies.motivation.AvlTreeList<java.lang.Integer>();
    boolean b2 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b4 = avltreelist_i0.add((java.lang.Integer)0);
    boolean b6 = avltreelist_i0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

}
