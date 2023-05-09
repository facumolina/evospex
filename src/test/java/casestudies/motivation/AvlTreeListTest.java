package casestudies.motivation;

import org.junit.Test;

public class AvlTreeListTest {

  @Test
  public void testAdd() {
    AvlTreeList<Integer> list = new AvlTreeList<>();
    list.add(1);
  }

  @Test
  public void testAdd2() {
    AvlTreeList<Integer> list = new AvlTreeList<>();
    list.add(2);
    list.add(3);
  }

  @Test
  public void testAdd3() {
    AvlTreeList<Integer> list = new AvlTreeList<>();
    list.add(4);
    list.add(5);
    list.add(6);
  }

}
