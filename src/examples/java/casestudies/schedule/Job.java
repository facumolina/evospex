package casestudies.schedule;

//----- ----- Class 2: Job ----- -----

public class Job {

  /**
   * Next and Previous in job list.
   */
  private Job next;

  private Job prev;

  /**
   * Id-value of program.
   */
  private int val;

  /**
   * Its priority.
   */
  public int priority;

  public Job(int num) {
    next = null;
    prev = null;
    val = num;
  }

  public Job getNext() {
    return next;
  }

  public Job setNext(Job newNext) {
    next = newNext;
    return next;
  }

  public Job getPrev() {
    return prev;
  }

  public Job setPrev(Job newPrev) {
    prev = newPrev;
    return prev;
  }

  public int getVal() {
    return val;
  }

  public int setVal(int newVal) {
    val = newVal;
    return val;
  }

  public int getPriority() {
    return priority;
  }

  public int setPriority(int newPriority) {
    priority = newPriority;
    return priority;
  }

  // Added for evaluation
  @Override
  public boolean equals(Object other) {
    if (other == null)
      return false;
    Job o = (Job) other;
    return val == o.val && priority == o.priority && next == o.next && prev == o.prev;
  }

}