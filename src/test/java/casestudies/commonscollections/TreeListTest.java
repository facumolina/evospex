package casestudies.commonscollections;

import org.junit.Test;

import casestudies.commonscollections.TreeList.AVLNode;

public class TreeListTest {

  @Test
  public void test0() {
    TreeList<String> treeListGA0 = new TreeList<String>();
    treeListGA0.add(0, "a");
    treeListGA0.add(0, "b");
    treeListGA0.add(1, "c");
    treeListGA0.add(0, "d");
    treeListGA0.add(1, "e");
    treeListGA0.add(0, "f");
    treeListGA0.add(1, "g");
    int h = treeListGA0.root.right.height;
    AVLNode<String> oldroot = treeListGA0.root;
    boolean b = treeListGA0.root.leftIsPrevious;
    boolean res = treeListGA0.remove("g");
    assert (treeListGA0.root.relativePosition > h);
  }

}
