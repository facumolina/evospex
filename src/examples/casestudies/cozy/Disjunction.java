package casestudies.cozy;

public class Disjunction implements java.io.Serializable {
  protected java.util.HashMap<Integer, java.util.ArrayList<Elem>> _var1082;
  protected java.util.HashMap<Integer, java.util.ArrayList<Elem>> _var1083;

  public Disjunction() {
    clear();
  }

  public Disjunction(java.util.ArrayList<Elem> xs) {
    java.util.HashMap<Integer, java.util.ArrayList<Elem>> _map256747 = new java.util.HashMap<Integer, java.util.ArrayList<Elem>>();
    for (Elem _x256749 : xs) {
      {
        Integer _var871 = ((_x256749).getVal())._0;
        java.util.ArrayList<Elem> _v256748 = _map256747.getOrDefault(_var871,
            new java.util.ArrayList<Elem>());
        java.util.ArrayList<Elem> _var256750 = new java.util.ArrayList<Elem>();
        for (Elem _x256752 : xs) {
          if ((java.util.Objects.equals(((_x256752).getVal())._0, _var871))) {
            {
              _var256750.add(_x256752);
            }
          }
        }
        _v256748 = _var256750;
        _map256747.put(_var871, _v256748);

      }
    }
    _var1082 = _map256747;
    java.util.HashMap<Integer, java.util.ArrayList<Elem>> _map256753 = new java.util.HashMap<Integer, java.util.ArrayList<Elem>>();
    for (Elem _x256755 : xs) {
      {
        Integer _var872 = ((_x256755).getVal())._1;
        java.util.ArrayList<Elem> _v256754 = _map256753.getOrDefault(_var872,
            new java.util.ArrayList<Elem>());
        java.util.ArrayList<Elem> _var256756 = new java.util.ArrayList<Elem>();
        for (Elem _x256758 : xs) {
          if ((java.util.Objects.equals(((_x256758).getVal())._1, _var872))) {
            {
              _var256756.add(_x256758);
            }
          }
        }
        _v256754 = _var256756;
        _map256753.put(_var872, _v256754);

      }
    }
    _var1083 = _map256753;
  }

  public void clear() {
    java.util.HashMap<Integer, java.util.ArrayList<Elem>> _map256759 = new java.util.HashMap<Integer, java.util.ArrayList<Elem>>();
    _var1082 = _map256759;
    java.util.HashMap<Integer, java.util.ArrayList<Elem>> _map256765 = new java.util.HashMap<Integer, java.util.ArrayList<Elem>>();
    _var1083 = _map256765;
  }

  public void a(Integer st, Integer ed, java.util.function.Consumer<Elem> _callback) {
    for (Elem _x256771 : _var1082.getOrDefault(st, new java.util.ArrayList<Elem>())) {
      _callback.accept(_x256771);
    }
    for (Elem _x256772 : _var1083.getOrDefault(ed, new java.util.ArrayList<Elem>())) {
      if ((!((java.util.Objects.equals(((_x256772).getVal())._0, st))))) {
        {
          _callback.accept(_x256772);
        }
      }
    }
  }

  public void add(Elem e) {
    {
      java.util.ArrayList<Elem> _var1473 = _var1082.getOrDefault(((e).getVal())._0,
          new java.util.ArrayList<Elem>());
      {
        _var1473.add(e);
      }
      _var1082.put(((e).getVal())._0, _var1473);

    }
    {
      java.util.ArrayList<Elem> _var4740 = _var1083.getOrDefault(((e).getVal())._1,
          new java.util.ArrayList<Elem>());
      {
        _var4740.add(e);
      }
      _var1083.put(((e).getVal())._1, _var4740);

    }
  }

  public static class _Type256745 implements java.io.Serializable {
    private Integer _0;
    private Integer _1;

    public Integer get_0() {
      return _0;
    }

    public Integer get_1() {
      return _1;
    }

    public _Type256745(Integer _0, Integer _1) {
      this._0 = _0;
      this._1 = _1;
    }

    @Override
    public int hashCode() {
      int _hash_code256773 = 0;
      _hash_code256773 = (_hash_code256773 * 31) ^ ((_0).hashCode());
      _hash_code256773 = (_hash_code256773 * 31) ^ ((_1).hashCode());
      return _hash_code256773;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type256745))
        return false;
      _Type256745 o = (_Type256745) other;
      Boolean _v256774;
      if ((java.util.Objects.equals(this._0, o._0))) {
        _v256774 = (java.util.Objects.equals(this._1, o._1));
      } else {
        _v256774 = false;
      }
      return _v256774;
    }
  }

  public static class Elem implements java.io.Serializable {
    private _Type256745 val;

    public _Type256745 getVal() {
      return val;
    }

    public Elem(Integer _v256775, Integer _v256776) {
      this.val = new _Type256745(_v256775, _v256776);
    }
  }
}
