package casestudies.eiffel;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class implements the RING_BUFFER [G] class from the file ring_buffer.e in the Eiffel project
 * AutoProof
 * 
 * @author Facundo Molina
 */
// Title: Ring buffer
// Category: Data Structure
// Source: [VSTTE'12](https://sites.google.com/site/vstte2012/compet)
// Abstract: A bounded queue implemented using a circular array.
// Description: A bounded queue is implemented using a circular array. The goal is to verify
// functional correctness of various operations on the queue and client code using the queue.
public class RingBuffer<G> {

  // feature {NONE} -- Initialization
  /**
   * -- Initialize empty buffer with capacity `n'.
   */
  public RingBuffer(int n) {
    // require
    // n_positive: n > 0
    boolean n_positive = n > 0;
    if (!n_positive)
      throw new IllegalArgumentException();

    // do
    data = new ArrayList<G>(n + 1);
    data.add(null); // Dummy position
    start = 1;
    free = 1;
    capacity_ = n;
    evospecid = (new Random()).nextInt(1000000);

    // ensure
    // empty_buffer: is_empty
    // capacity_set: capacity = n
    boolean empty_buffer = is_empty();
    boolean capacity_set = capacity() == n;
    assert (empty_buffer && capacity_set);
  }

  // feature -- Access
  /**
   * -- Current item of buffer.
   */
  public Object item() {
    // require
    // not_empty: not is_empty
    boolean not_empty = !is_empty();
    assert (not_empty);

    // do
    Object result = data.get(start);

    // ensure
    // definition: Result = sequence.first
    assert (result == data.get(start));
    return result;
  }

  /**
   * -- Number of items in buffer.
   */
  public int count() {
    // do
    if (free > start)
      return free - start;
    else
      return data_size() - start + free;
    // ensure
    // definition: Result = sequence.count
  }

  private int data_size() {
    return data.size() - 1;
  }

  private int data_count() {
    return capacity_ + 1;
  }

  /**
   * -- Maximum capacity of buffer.
   */
  public int capacity() {
    // do
    return capacity_;
    // ensure
    // definition: Result = capacity_
  }

  // feature -- Status report
  /**
   * -- Is buffer empty?
   */
  public boolean is_empty() {
    // do
    return start == free;
    // ensure
    // definition: Result = sequence.is_empty
  }

  /**
   * -- Is buffer full?
   */
  public boolean is_full() {
    // do
    boolean result;
    if (start == 1)
      result = free == data_count();
    else
      result = free == start - 1;
    // ensure
    // definition: Result = (count = capacity)
    assert (result == (count() == capacity()));
    return result;
  }

  // feature -- Element change
  /**
   * -- Add `a_value' to end of buffer.
   */
  public void extend(G a_value) {
    // require
    // not_full: not is_full
    // modify_model ("sequence", Current)
    boolean not_full = !is_full();
    assert (not_full);

    // do
    data.add(a_value);
    if (free == data_count())
      free = 1;
    else
      free = free + 1;
    // ensure
    // definition: sequence = old sequence.extended (a_value)
    assert (data.contains(a_value));
  }

  /**
   * -- Remove current item from buffer.
   */
  public void remove() {
    // require
    // not_empty: not is_empty
    // modify_model ("sequence", Current)
    boolean not_empty = !is_empty();
    assert (not_empty);

    // do
    if (start == data_count())
      start = 1;
    else
      start++;

    // ensure
    // definition: sequence = old sequence.but_first

  }

  /**
   * -- Remove all elements from buffer.
   */
  public void wipe_out() {
    // require
    // modify_model ("sequence", Current)

    // do
    start = free;

    // ensure
    // empty: is_empty
    boolean empty = is_empty();
    assert (empty);
  }

  // feature -- Model

  // feature {NONE} -- Implementation
  private ArrayList<G> data; // -- Array used to store data.
  private int start; // -- Index of first element.
  private int free; // -- Index of next free position.
  private int capacity_; // -- Capacity
  private int evospecid; // Random id to be used as an identifier for the object

  /**
   * Class invariant
   */
  public boolean invariant() {
    // data_not_void: data /= Void
    // owns_definition: owns = [data]

    // free_in_bounds: 1 <= free and free <= data.count
    // start_in_bounds: 1 <= start and start <= data.count

    // sequence_definition:
    // sequence = if free < start
    // then data.sequence.tail (start) + data.sequence.front (free - 1)
    // else data.sequence.interval (start, free - 1) end
    // capacity_definition: capacity_ = data.count - 1
    // capacity_positive: capacity_ > 0
    boolean data_not_void = data != null;
    boolean free_in_bounds = 1 <= free && free <= data_size();
    boolean start_in_bounds = 1 <= start && start <= data_size();
    return data_not_void && free_in_bounds && start_in_bounds;
  }

}
