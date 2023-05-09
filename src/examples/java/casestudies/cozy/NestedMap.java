package casestudies.cozy;

public class NestedMap implements java.io.Serializable {
  protected java.util.HashMap<Integer, java.util.ArrayList<Elem>> _var352;

  public NestedMap() {
    clear();
  }

  public NestedMap(java.util.ArrayList<Elem> xs) {
    java.util.HashMap<Integer, java.util.ArrayList<Elem>> _map73458 = new java.util.HashMap<Integer, java.util.ArrayList<Elem>>();
    for (Elem _x73460 : xs) {
      {
        Integer _var236 = ((_x73460).getVal())._1;
        java.util.ArrayList<Elem> _v73459 = _map73458.getOrDefault(_var236,
            new java.util.ArrayList<Elem>());
        java.util.ArrayList<Elem> _var73461 = new java.util.ArrayList<Elem>();
        for (Elem _x73463 : xs) {
          if ((java.util.Objects.equals(((_x73463).getVal())._1, _var236))) {
            {
              _var73461.add(_x73463);
            }
          }
        }
        _v73459 = _var73461;
        _map73458.put(_var236, _v73459);

      }
    }
    _var352 = _map73458;
  }

  public void clear() {
    java.util.HashMap<Integer, java.util.ArrayList<Elem>> _map73464 = new java.util.HashMap<Integer, java.util.ArrayList<Elem>>();
    _var352 = _map73464;
  }

  public void a(Integer st, Integer ed, java.util.function.Consumer<Elem> _callback) {
    for (Elem _x73471 : _var352.getOrDefault(ed, new java.util.ArrayList<Elem>())) {
      if ((java.util.Objects.equals(((_x73471).getVal())._0, st))) {
        {
          _callback.accept(_x73471);
        }
      }
    }
  }

  public static class _Type73456 implements java.io.Serializable {
    private Integer _0;
    private Integer _1;

    public Integer get_0() {
      return _0;
    }

    public Integer get_1() {
      return _1;
    }

    public _Type73456(Integer _0, Integer _1) {
      this._0 = _0;
      this._1 = _1;
    }

    @Override
    public int hashCode() {
      int _hash_code73472 = 0;
      _hash_code73472 = (_hash_code73472 * 31) ^ ((_0).hashCode());
      _hash_code73472 = (_hash_code73472 * 31) ^ ((_1).hashCode());
      return _hash_code73472;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type73456))
        return false;
      _Type73456 o = (_Type73456) other;
      Boolean _v73473;
      if ((java.util.Objects.equals(this._0, o._0))) {
        _v73473 = (java.util.Objects.equals(this._1, o._1));
      } else {
        _v73473 = false;
      }
      return _v73473;
    }
  }

  public static class Elem implements java.io.Serializable {
    private _Type73456 val;

    public _Type73456 getVal() {
      return val;
    }

    public Elem(Integer _v73474, Integer _v73475) {
      this.val = new _Type73456(_v73474, _v73475);
    }
  }
}
