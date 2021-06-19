package casestudies.schedule;

//----- ----- Class 3: List ----- -----

/**
 * doubly linked list
 */
public class List {

  private Job first;

  private Job last;

  /**
   * member count
   */
  private int memCount;

  public List() {
    first = null;
    last = null;
    memCount = 0;
  }

  public Job getFirst() {
    return first;
  }

  public Job setFirst(Job newFirst) {
    first = newFirst;
    return first;
  }

  public Job getLast() {
    return last;
  }

  public Job setLast(Job newLast) {
    last = newLast;
    return last;
  }

  public int getMemCount() {
    return memCount;
  }

  public int setMemCount(int newMemCount) {
    memCount = newMemCount;
    return memCount;
  }

  // Added for evaluation
  @Override
  public boolean equals(Object other) {
    if (other == null)
      return false;
    List o = (List) other;
    return memCount == o.memCount && first == o.first && last == o.last;
  }
}
