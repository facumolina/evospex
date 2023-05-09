package casestudies.cozy;

public class In implements java.io.Serializable {
  protected java.util.HashMap<Integer, Boolean> _var390;

  public In() {
    clear();
  }

  public In(java.util.ArrayList<Integer> xs, java.util.ArrayList<Integer> ys) {
    java.util.HashMap<Integer, Boolean> _map213818 = new java.util.HashMap<Integer, Boolean>();
    for (Integer _var367 : ys) {
      Boolean _v213819 = _map213818.getOrDefault(_var367, false);
      _v213819 = true;
      _map213818.put(_var367, _v213819);

    }
    _var390 = _map213818;
  }

  public void clear() {
    java.util.HashMap<Integer, Boolean> _map213820 = new java.util.HashMap<Integer, Boolean>();
    _var390 = _map213820;
  }

  public Boolean a(Integer z) {
    return _var390.containsKey(z);
  }

  public void addX(Integer x) {
  }

  public void addY(Integer y) {
    java.util.ArrayList<Integer> _conditional_result213822 = new java.util.ArrayList<Integer>();
    if (_var390.containsKey(y)) {
      _conditional_result213822 = new java.util.ArrayList<Integer>();
    } else {
      java.util.ArrayList<Integer> _singleton213823 = new java.util.ArrayList<Integer>();
      _singleton213823.add(y);
      _conditional_result213822 = _singleton213823;
    }
    java.util.ArrayList<Integer> _var213817 = _conditional_result213822;
    for (Integer _var562 : _var213817) {
      Boolean _var563 = _var390.getOrDefault(_var562, false);
      _var563 = true;
      _var390.put(_var562, _var563);

    }
  }
}
