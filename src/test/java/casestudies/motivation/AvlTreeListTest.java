package casestudies.motivation;

import org.junit.Test;

public class AvlTreeListTest {

  @Test
  public void testAdd() {
    AvlTreeList<Integer> list = new AvlTreeList<>();
    boolean b1 = list.add(1);
    assert b1;
  }

  @Test
  public void testAdd2() {
    AvlTreeList<Integer> list = new AvlTreeList<>();
    boolean b2 = list.add(2);
    boolean b3 = list.add(3);
    assert b2;
    assert b3;
  }

  @Test
  public void testAdd3() {
    AvlTreeList<Integer> list = new AvlTreeList<>();
    boolean b4 = list.add(4);
    boolean b5 = list.add(5);
    boolean b6 = list.add(6);
    assert b4;
    assert b5;
    assert b6;
  }

}
