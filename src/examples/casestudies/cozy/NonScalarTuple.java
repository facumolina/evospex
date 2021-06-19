package casestudies.cozy;

public class NonScalarTuple implements java.io.Serializable {
  protected java.util.ArrayList<Clz> _var97;

  public NonScalarTuple() {
    clear();
  }

  public NonScalarTuple(java.util.ArrayList<Clz> classes) {
    _var97 = classes;
  }

  public void clear() {
    _var97 = new java.util.ArrayList<Clz>();
  }

  public void selectClzMembers(java.util.function.Consumer<_Type308> _callback) {
    for (Clz _c310 : _var97) {
      java.util.ArrayList<Integer> _var311 = new java.util.ArrayList<Integer>();
      for (Member _m314 : ((_c310).getVal()).members) {
        if (((_m314).id > 10)) {
          {
            {
              _var311.add((_m314).id);
            }
          }
        }
      }
      {
        _callback.accept(new _Type308(_c310, _var311));
      }
    }
  }

  public static class Member implements java.io.Serializable {
    private Integer id;
    private String name;

    public Integer getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public Member(Integer id, String name) {
      this.id = id;
      this.name = name;
    }

    @Override
    public int hashCode() {
      int _hash_code315 = 0;
      _hash_code315 = (_hash_code315 * 31) ^ ((id).hashCode());
      _hash_code315 = (_hash_code315 * 31) ^ ((name).hashCode());
      return _hash_code315;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof Member))
        return false;
      Member o = (Member) other;
      Boolean _v316;
      if ((java.util.Objects.equals(this.id, o.id))) {
        _v316 = (java.util.Objects.equals(this.name, o.name));
      } else {
        _v316 = false;
      }
      return _v316;
    }
  }

  public static class _Type306 implements java.io.Serializable {
    private Integer id;
    private java.util.ArrayList<Member> members;

    public Integer getId() {
      return id;
    }

    public java.util.ArrayList<Member> getMembers() {
      return members;
    }

    public _Type306(Integer id, java.util.ArrayList<Member> members) {
      this.id = id;
      this.members = members;
    }

    @Override
    public int hashCode() {
      int _hash_code317 = 0;
      _hash_code317 = (_hash_code317 * 31) ^ ((id).hashCode());
      _hash_code317 = (_hash_code317 * 31) ^ ((members).hashCode());
      return _hash_code317;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type306))
        return false;
      _Type306 o = (_Type306) other;
      Boolean _v318;
      if ((java.util.Objects.equals(this.id, o.id))) {
        _v318 = ((this.members == o.members));
      } else {
        _v318 = false;
      }
      return _v318;
    }
  }

  public static class Clz extends _Type306 implements java.io.Serializable {
    public _Type306 getVal() {
      return this;
    }

    public Clz(Integer _v319, java.util.ArrayList<Member> _v320) {
      super(_v319, _v320);
    }
  }

  public static class _Type308 implements java.io.Serializable {
    private Clz _0;
    private java.util.ArrayList<Integer> _1;

    public Clz get_0() {
      return _0;
    }

    public java.util.ArrayList<Integer> get_1() {
      return _1;
    }

    public _Type308(Clz _0, java.util.ArrayList<Integer> _1) {
      this._0 = _0;
      this._1 = _1;
    }

    @Override
    public int hashCode() {
      int _hash_code321 = 0;
      _hash_code321 = (_hash_code321 * 31) ^ ((_0).hashCode());
      _hash_code321 = (_hash_code321 * 31) ^ ((_1).hashCode());
      return _hash_code321;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type308))
        return false;
      _Type308 o = (_Type308) other;
      Boolean _v322;
      if ((java.util.Objects.equals(this._0, o._0))) {
        _v322 = ((this._1 == o._1));
      } else {
        _v322 = false;
      }
      return _v322;
    }
  }
}
