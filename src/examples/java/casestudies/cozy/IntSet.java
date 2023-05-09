package casestudies.cozy;

public class IntSet implements java.io.Serializable {
  protected Integer _var529;
  protected java.util.HashMap<Integer, Boolean> _var532;

  public IntSet() {
    clear();
  }

  public IntSet(java.util.ArrayList<Integer> ints) {
    Integer _sum463591 = 0;
    for (Integer _x463593 : ints) {
      {
        _sum463591 = (_sum463591 + 1);
      }
    }
    _var529 = _sum463591;
    java.util.HashMap<Integer, Boolean> _map463594 = new java.util.HashMap<Integer, Boolean>();
    for (Integer _var461 : ints) {
      Boolean _v463595 = _map463594.getOrDefault(_var461, false);
      _v463595 = true;
      _map463594.put(_var461, _v463595);

    }
    _var532 = _map463594;
  }

  public void clear() {
    Integer _sum463596 = 0;
    _var529 = _sum463596;
    java.util.HashMap<Integer, Boolean> _map463599 = new java.util.HashMap<Integer, Boolean>();
    _var532 = _map463599;
  }

  public Boolean contains(Integer i) {
    return _var532.containsKey(i);
  }

  public Integer size() {
    return _var529;
  }

  public void add(Integer i) {
    Integer _var463588 = (_var529 + 1);
    _var529 = _var463588;
    {
      Boolean _var1176 = _var532.getOrDefault(i, false);
      _var1176 = true;
      _var532.put(i, _var1176);

    }
  }

  public void remove(Integer i) {
    Integer _conditional_result463601 = 0;
    if (_var532.containsKey(i)) {
      _conditional_result463601 = 1;
    } else {
      _conditional_result463601 = 0;
    }
    Integer _var463589 = (_var529 - _conditional_result463601);
    java.util.ArrayList<Integer> _conditional_result463602 = new java.util.ArrayList<Integer>();
    if (_var532.containsKey(i)) {
      java.util.ArrayList<Integer> _singleton463603 = new java.util.ArrayList<Integer>();
      _singleton463603.add(i);
      _conditional_result463602 = _singleton463603;
    } else {
      _conditional_result463602 = new java.util.ArrayList<Integer>();
    }
    java.util.ArrayList<Integer> _var463590 = _conditional_result463602;
    _var529 = _var463589;
    for (Integer _var3890 : _var463590) {
      _var532.remove(_var3890);
    }
  }
}
