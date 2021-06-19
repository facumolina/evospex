package casestudies.eiffel;

import org.junit.Test;

//Test harness.
public class MapTest {

  @Test
  // -- Using Map.
  public void test_map() throws Exception {
    Map<Integer, String> m = new Map<Integer, String>();
    assert (m.invariant());

    m.extend(1, "Value1");
    m.extend(2, "Value2");
    assert (m.invariant());
    assert (m.count() == 2);

    m.remove(1);
    assert (!m.has_key(1));
    assert (m.count() == 1);
    assert (m.invariant());
  }
}
