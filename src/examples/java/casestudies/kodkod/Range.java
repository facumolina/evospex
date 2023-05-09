package casestudies.kodkod;

/**
 * A range of integers in an int set.
 * 
 * @specfield min: int
 * @specfield max: int
 * @invariant min <= max
 * @invariant max = key
 * @author Emina Torlak
 */
public final class Range extends IntTree.Node<Range> implements Cloneable {
  public int min;

  Range(int min, int max) {
    super(max);
    this.min = min;
  }

  protected Range clone() throws CloneNotSupportedException {
    return (Range) super.clone();
  }

  // Added for evaluation
  @Override
  public boolean equals(Object other) {
    try {
      if (other == null)
        return false;
      Range o = (Range) other;
      return min == o.min && color == o.color && key == o.key && parent == o.parent
          && left == o.left && right == o.right;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
}
