package casestudies.eiffel;

import org.junit.Test;

// Test harness
public class RingBufferTest {

  @Test
  public void test_ring_buffer_pass1() {
    RingBuffer<Integer> b = new RingBuffer<Integer>(10);
    assert (b.capacity() == 10);
    assert (b.count() == 0);
    assert (b.is_empty());

    Integer five = new Integer(5);
    Integer eight = new Integer(8);

    b.extend(five);
    b.extend(eight);
    assert (b.capacity() == 10);
    assert (b.count() == 2);
    assert (b.item() == five);

    b.remove();
    assert (b.capacity() == 10);
    assert (b.item() == eight);

    b.remove();
    assert (b.capacity() == 10);
    assert (b.is_empty());
  }

  @Test
  public void test_ring_buffer_pass2() {
    RingBuffer<Integer> b = new RingBuffer<Integer>(2);
    assert (b.capacity() == 2);
    assert (b.count() == 0);
    assert (b.is_empty());

    Integer minus_four = new Integer(-4);
    Integer nineteen = new Integer(19);
    b.extend(minus_four);
    b.extend(nineteen);
    assert (b.capacity() == 2);
    assert (b.count() == 2);
    assert (b.item() == minus_four);
    assert (b.is_full());

    b.remove();
    assert (b.capacity() == 2);
    assert (b.count() == 1);
    assert (b.item() == nineteen);
    assert (!b.is_full());
    assert (!b.is_empty());

    Integer thirty_six = new Integer(36);
    b.extend(thirty_six);
    assert (b.capacity() == 2);
    assert (b.count() == 2);
    assert (b.item() == nineteen);
    assert (b.is_full());
    assert (!b.is_empty());
  }

  @Test
  public void test_ring_buffer_pass3() {
    RingBuffer<Integer> b = new RingBuffer<Integer>(2);
    b.extend(25);
    b.extend(43);
    assert (!b.is_empty());

    b.wipe_out();
    assert (b.is_empty());
  }

  @Test(expected = IllegalArgumentException.class)
  public void test_ring_buffer_fail1_a() {
    RingBuffer<Integer> b = new RingBuffer<Integer>(0);
  }

  @Test(expected = AssertionError.class)
  public void test_ring_buffer_fail1_b() {
    RingBuffer<Integer> b = new RingBuffer<Integer>(1);
    b.remove();
  }

  @Test(expected = AssertionError.class)
  public void test_ring_buffer_fail1_c() {
    RingBuffer<Integer> b = new RingBuffer<Integer>(4);
    b.item();
  }

  @Test(expected = AssertionError.class)
  public void test_ring_buffer_fail2_a() {
    RingBuffer<Integer> b = new RingBuffer<Integer>(1);
    b.extend(4);
    b.extend(5);
  }

  @Test(expected = AssertionError.class)
  public void test_ring_buffer_fail2_b() {
    RingBuffer<Integer> b = new RingBuffer<Integer>(1);
    b.extend(6);
    assert (!b.is_full());
  }

  @Test(expected = AssertionError.class)
  public void test_ring_buffer_fail2_c() {
    RingBuffer<Integer> b = new RingBuffer<Integer>(1);
    b.extend(7);
    b.remove();
    assert (!b.is_empty());
  }

}
