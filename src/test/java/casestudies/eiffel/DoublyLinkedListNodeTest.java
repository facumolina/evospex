package casestudies.eiffel;

import org.junit.Test;

//Test harness.
public class DoublyLinkedListNodeTest {

  @Test
  // -- Using doubly-linked list nodes.
  public void test_dll() throws Exception {
    DoublyLinkedListNode n1 = new DoublyLinkedListNode();
    assert (n1.left == n1 && n1.invariant());

    n1.insert_right(n1);
    assert (n1.left == n1 && n1.invariant());

    DoublyLinkedListNode n2 = new DoublyLinkedListNode();
    n1.insert_right(n2);
    assert (n1.left == n2 && n2.left == n1 && n1.invariant() && n2.invariant());

    n2.remove();
    assert (n2.left == n2 && n2.invariant());
    assert (n1.left == n1 && n1.invariant());
  }
}
