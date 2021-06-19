package casestudies.cozy;

public class ListComp02 implements java.io.Serializable {
  protected java.util.ArrayList<R> _var49;
  protected java.util.ArrayList<S> _var50;

  public ListComp02() {
    clear();
  }

  public ListComp02(java.util.ArrayList<R> Rs, java.util.ArrayList<S> Ss) {
    _var49 = Rs;
    _var50 = Ss;
  }

  public void clear() {
    _var49 = new java.util.ArrayList<R>();
    _var50 = new java.util.ArrayList<S>();
  }

  public Integer q() {
    Integer _sum159130 = 0;
    for (R _r159132 : _var49) {
      for (S _s159133 : _var50) {
        {
          _sum159130 = (_sum159130 + (((_r159132).A) * ((_s159133).C)));
        }
      }
    }
    return _sum159130;
  }

  public void insert_r(R r) {
    {
      _var49.add(r);
    }
  }

  public void insert_s(S s) {
    {
      _var50.add(s);
    }
  }

  public static class R implements java.io.Serializable {
    private Integer A;
    private String B;

    public Integer getA() {
      return A;
    }

    public String getB() {
      return B;
    }

    public R(Integer A, String B) {
      this.A = A;
      this.B = B;
    }

    @Override
    public int hashCode() {
      int _hash_code159134 = 0;
      _hash_code159134 = (_hash_code159134 * 31) ^ ((A).hashCode());
      _hash_code159134 = (_hash_code159134 * 31) ^ ((B).hashCode());
      return _hash_code159134;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof R))
        return false;
      R o = (R) other;
      Boolean _v159135;
      if ((java.util.Objects.equals(this.A, o.A))) {
        _v159135 = (java.util.Objects.equals(this.B, o.B));
      } else {
        _v159135 = false;
      }
      return _v159135;
    }
  }

  public static class S implements java.io.Serializable {
    private String B;
    private Integer C;

    public String getB() {
      return B;
    }

    public Integer getC() {
      return C;
    }

    public S(String B, Integer C) {
      this.B = B;
      this.C = C;
    }

    @Override
    public int hashCode() {
      int _hash_code159136 = 0;
      _hash_code159136 = (_hash_code159136 * 31) ^ ((B).hashCode());
      _hash_code159136 = (_hash_code159136 * 31) ^ ((C).hashCode());
      return _hash_code159136;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof S))
        return false;
      S o = (S) other;
      Boolean _v159137;
      if ((java.util.Objects.equals(this.B, o.B))) {
        _v159137 = (java.util.Objects.equals(this.C, o.C));
      } else {
        _v159137 = false;
      }
      return _v159137;
    }
  }
}
