package casestudies.cozy;

public class ReadAfterWrite implements java.io.Serializable {
  protected Integer _var24;
  protected java.util.ArrayList<Integer> _var38;

  public ReadAfterWrite() {
    clear();
  }

  public ReadAfterWrite(Integer x, java.util.ArrayList<Integer> l) {
    _var24 = x;
    _var38 = l;
  }

  public void clear() {
    _var24 = 0;
    _var38 = new java.util.ArrayList<Integer>();
  }

  public Integer getx() {
    return _var24;
  }

  public void elems(java.util.function.Consumer<Integer> _callback) {
    for (Integer _x294889 : _var38) {
      _callback.accept(_x294889);
    }
  }

  public void do_thing(Integer n) {
    Integer _var294888 = (_var24 + n);
    {
      _var38.add((_var24 + n));
    }
    _var24 = _var294888;
  }
}
