package casestudies.eiffel;

import org.junit.Test;

//Test harness.
public class CompositeTest {

  @Test
  // -- Using composites.
  public void test_composite() throws Exception {
    Composite c1 = new Composite(1);
    Composite c2 = new Composite(2);
    Composite c3 = new Composite(0);

    c1.add_child(c2);
    assert (c1.invariant());
    assert (c2.invariant());
    assert (c1.value >= c2.value);

    c2.add_child(c3);
    assert (c1.invariant());
    assert (c2.invariant());
    assert (c3.invariant());
    assert (c2.value >= c3.value);
  }
}
