package casestudies.eiffel;

import java.util.Random;

/**
 * This class implements the NODE class from the file node.e in the Eiffel project AutoProof
 * 
 * @author Facundo Molina
 */
// Title: Doubly-Linked-List
// Category: Data Structure
// Source: [ECOOP'04](http://research.microsoft.com/en-us/um/people/leino/papers/krml132.pdf) /
// [SC'14](http://se.inf.ethz.ch/people/polikarpova/sc/)
// Abstract: Implementation of a linked list with links to left and right neighbours.
// Description: A node in a (circular) doubly-linked list with a structural invariant that its left
// and right links are consistent with its neighbours.
public class DoublyLinkedListNode {

  // feature -- Access
  protected DoublyLinkedListNode left; // -- Left neighbor.
  protected DoublyLinkedListNode right; // -- Right neighbor.
  private int evospecid; // Random id to be used as an identifier for the object

  // create
  // make
  // feature {NONE} -- Initialization
  /**
   * -- Create a singleton node.
   */
  public DoublyLinkedListNode() {
    // do
    left = this;
    right = this;
    evospecid = (new Random()).nextInt(1000000);

    // ensure
    // singleton: left = Current
    boolean singleton = left == this;
    assert (singleton);
  }

  // feature -- Modification
  /**
   * -- Insert node `n' to the right of the current node.
   */
  public void insert_right(DoublyLinkedListNode n) {
    // require
    // n_singleton: n.left = n
    // right_wrapped: right.is_wrapped
    // modify (Current, right, n)
    boolean n_singleton = n.left == n;
    if (!n_singleton) {
      throw new IllegalArgumentException();
    }

    // do
    DoublyLinkedListNode r = right;
    n.setRight(r);
    n.setLeft(this);
    r.setLeft(n);
    setRight(n);

    // ensure
    // n_left_set: right = n
    // n_right_set: n.right = old right
    boolean n_left_set = right == n;
    boolean n_right_set = n.right == r;
    assert (n_left_set && n_right_set);
  }

  /**
   * -- Remove the current node from the list.
   */
  public void remove() {
    // require
    // left_wrapped: left.is_wrapped
    // right_wrapped: right.is_wrapped
    // modify (Current, left, right)

    // do
    DoublyLinkedListNode l = left;
    DoublyLinkedListNode r = right;
    setLeft(this);
    setRight(this);
    l.setRight(r);
    r.setLeft(l);

    // ensure
    // singleton: right = Current
    // old_left_wrapped: (old left).is_wrapped
    // old_right_wrapped: (old right).is_wrapped
    // neighbors_connected: (old left).right = old right
    boolean singleton = right == this;
    boolean neighbors_connected = l.right == r;
    assert (singleton && neighbors_connected);
  }

  // feature {NODE} -- Implementation
  /**
   * -- Set left neighbor to `n'.
   */
  private void setLeft(DoublyLinkedListNode n) {
    left = n; // -- preserves `right'
    assert (left == n);
  }

  /**
   * -- Set right neighbor to `n'.
   */
  private void setRight(DoublyLinkedListNode n) {
    right = n; // -- preserves `left'
    assert (right == n);
  }

  // feature -- Specification
  /**
   * Is `o' different from `left'?
   */
  public boolean not_left(DoublyLinkedListNode o) {
    return o != left;
  }

  /**
   * Is `o' different from `right'?
   */
  public boolean not_right(DoublyLinkedListNode o) {
    return o != right;
  }

  /**
   * Class invariant
   */
  public boolean invariant() {
    // left_exists: left /= Void
    // right_exists: right /= Void
    // subjects_structure: subjects = [ left, right ]
    // observers_structure: observers = [ left, right ]
    // left_consistent: left.right = Current
    // right_consistent: right.left = Current
    boolean left_exists = left != null;
    boolean right_exists = right != null;
    boolean left_consistent = left.right == this;
    boolean right_consistent = right.left == this;
    return left_exists && right_exists && left_consistent && right_consistent;
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof DoublyLinkedListNode))
      return false;
    DoublyLinkedListNode o = (DoublyLinkedListNode) other;
    return evospecid == o.evospecid;
  }

  @Override
  public int hashCode() {
    return evospecid;
  }
}
