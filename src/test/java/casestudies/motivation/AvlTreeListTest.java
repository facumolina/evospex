package casestudies.motivation;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AvlTreeListTest {

  @Test
  public void testAdd() {
    AvlTreeList<Integer> list = new AvlTreeList<>();
    boolean b1 = list.add(1);
    assertTrue(b1);
  }

  @Test
  public void testAdd2() {
    AvlTreeList<Integer> list = new AvlTreeList<>();
    boolean b2 = list.add(2);
    boolean b3 = list.add(3);
    assertTrue(b2);
    assertTrue(b3);
  }

  @Test
  public void testAdd3() {
    AvlTreeList<Integer> list = new AvlTreeList<>();
    boolean b4 = list.add(4);
    boolean b5 = list.add(5);
    boolean b6 = list.add(6);
    assertTrue(b4);
    assertTrue(b5);
    assertTrue(b6);
  }

}
