package casestudies.motivation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AvlTreeListTest {

  @Test
  public void testAdd() {
    AvlTreeList<Integer> list = new AvlTreeList<>();
    boolean b1 = list.add(1);
    int size = list.size();
    assertTrue(b1);
    assertEquals(1, size);
  }

  @Test
  public void testAdd2() {
    AvlTreeList<Integer> list = new AvlTreeList<>();
    boolean b2 = list.add(2);
    boolean b3 = list.add(3);
    int size = list.size();
    assertTrue(b2);
    assertTrue(b3);
    assertEquals(2, size);
  }

  @Test
  public void testAdd3() {
    AvlTreeList<Integer> list = new AvlTreeList<>();
    boolean b4 = list.add(4);
    boolean b5 = list.add(5);
    boolean b6 = list.add(6);
    int size = list.size();
    assertTrue(b4);
    assertTrue(b5);
    assertTrue(b6);
    assertEquals(3, size);
  }

}
