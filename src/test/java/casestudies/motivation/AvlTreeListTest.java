package casestudies.motivation;

import org.junit.Test;

public class AvlTreeListTest {

  @Test
  public void test0() {
    AvlTreeList<String> avl = new AvlTreeList<String>();
    avl.add(0, "0");
    avl.add(1, "0");
    avl.add(2, "0");
    assert (0 == avl.root.left.height);
  }
}
