package casestudies.motivation;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * This class implements sorted list of integers using a singly linked list with a sentintel node.
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class SortedList implements Serializable {

  static final long serialVersionUID = 20200617L;

  private int x;
  private SortedList next;
  private static final int SENTINEL = Integer.MAX_VALUE;

  private SortedList(int x, SortedList next) {
    this.x = x;
    this.next = next;
  }

  public SortedList() {
    this(SENTINEL, null);
  }

  /**
   * Inserts the given element in the list
   */
  public void insert(int data) {
    if (data > this.x) {
      next.insert(data);
    } else {
      next = new SortedList(x, next);
      x = data;
    }
  }

  /**
   * Clear the list
   */
  public void clear() {
    x = SENTINEL;
    next = null;
  }

  /**
   * Representation invariant
   */
  public boolean repOk() {
    Set<SortedList> visited = new HashSet<SortedList>();
    SortedList curr = this;
    while (curr.x != SENTINEL) {
      // The list should acyclic
      if (!visited.add(curr))
        return false;
      // The list should be sorted
      SortedList curr_next = curr.next;
      if (curr.x > curr_next.x)
        return false;

      curr = curr_next;
    }
    return true;
  }

  /**
   * Checks weather the list is acyclic
   */
  public boolean isAcyclic() {
    Set<SortedList> visited = new HashSet<>();
    SortedList curr = this;
    while (curr.x != SENTINEL) {
      // The list should acyclic
      if (!visited.add(curr))
        return false;
      curr = curr.next;
    }
    return true;
  }

  @Override
  public String toString() {
    if (x == SENTINEL) {
      return "null";
    } else {
      return x + ", " + next.toString();
    }
  }

}
