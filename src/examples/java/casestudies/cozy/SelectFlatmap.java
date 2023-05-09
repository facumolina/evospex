package casestudies.cozy;

public class SelectFlatmap implements java.io.Serializable {
  protected java.util.ArrayList<R> _var79;
  protected java.util.ArrayList<W> _var80;
  protected java.util.ArrayList<W> _var81;
  protected java.util.ArrayList<W> _var82;

  public SelectFlatmap() {
    clear();
  }

  public SelectFlatmap(java.util.ArrayList<R> Rs, java.util.ArrayList<W> Ss,
      java.util.ArrayList<W> Qs, java.util.ArrayList<W> Ws) {
    _var79 = Rs;
    _var80 = Ss;
    _var81 = Qs;
    _var82 = Ws;
  }

  public void clear() {
    _var79 = new java.util.ArrayList<R>();
    _var80 = new java.util.ArrayList<W>();
    _var81 = new java.util.ArrayList<W>();
    _var82 = new java.util.ArrayList<W>();
  }

  public void q(java.util.function.Consumer<_Type1611> _callback) {
    for (R _r1613 : _var79) {
      for (W _s1614 : _var80) {
        for (W _q1615 : _var81) {
          for (W _w1617 : _var82) {
            Boolean _v1618;
            if ((java.util.Objects.equals((_q1615).B, (_w1617).B))) {
              _v1618 = (java.util.Objects.equals((_r1613).A, 15));
            } else {
              _v1618 = false;
            }
            if (_v1618) {
              {
                {
                  _callback.accept(new _Type1611((_r1613).A, (_s1614).C, (_q1615).B, (_w1617).C));
                }
              }
            }
          }
        }
      }
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
      int _hash_code1619 = 0;
      _hash_code1619 = (_hash_code1619 * 31) ^ ((A).hashCode());
      _hash_code1619 = (_hash_code1619 * 31) ^ ((B).hashCode());
      return _hash_code1619;
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
      Boolean _v1620;
      if ((java.util.Objects.equals(this.A, o.A))) {
        _v1620 = (java.util.Objects.equals(this.B, o.B));
      } else {
        _v1620 = false;
      }
      return _v1620;
    }
  }

  public static class W implements java.io.Serializable {
    private String B;
    private Integer C;

    public String getB() {
      return B;
    }

    public Integer getC() {
      return C;
    }

    public W(String B, Integer C) {
      this.B = B;
      this.C = C;
    }

    @Override
    public int hashCode() {
      int _hash_code1621 = 0;
      _hash_code1621 = (_hash_code1621 * 31) ^ ((B).hashCode());
      _hash_code1621 = (_hash_code1621 * 31) ^ ((C).hashCode());
      return _hash_code1621;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof W))
        return false;
      W o = (W) other;
      Boolean _v1622;
      if ((java.util.Objects.equals(this.B, o.B))) {
        _v1622 = (java.util.Objects.equals(this.C, o.C));
      } else {
        _v1622 = false;
      }
      return _v1622;
    }
  }

  public static class _Type1611 implements java.io.Serializable {
    private Integer _0;
    private Integer _1;
    private String _2;
    private Integer _3;

    public Integer get_0() {
      return _0;
    }

    public Integer get_1() {
      return _1;
    }

    public String get_2() {
      return _2;
    }

    public Integer get_3() {
      return _3;
    }

    public _Type1611(Integer _0, Integer _1, String _2, Integer _3) {
      this._0 = _0;
      this._1 = _1;
      this._2 = _2;
      this._3 = _3;
    }

    @Override
    public int hashCode() {
      int _hash_code1623 = 0;
      _hash_code1623 = (_hash_code1623 * 31) ^ ((_0).hashCode());
      _hash_code1623 = (_hash_code1623 * 31) ^ ((_1).hashCode());
      _hash_code1623 = (_hash_code1623 * 31) ^ ((_2).hashCode());
      _hash_code1623 = (_hash_code1623 * 31) ^ ((_3).hashCode());
      return _hash_code1623;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type1611))
        return false;
      _Type1611 o = (_Type1611) other;
      Boolean _v1624;
      Boolean _v1625;
      if ((java.util.Objects.equals(this._0, o._0))) {
        _v1625 = (java.util.Objects.equals(this._1, o._1));
      } else {
        _v1625 = false;
      }
      if (_v1625) {
        Boolean _v1626;
        if ((java.util.Objects.equals(this._2, o._2))) {
          _v1626 = (java.util.Objects.equals(this._3, o._3));
        } else {
          _v1626 = false;
        }
        _v1624 = _v1626;
      } else {
        _v1624 = false;
      }
      return _v1624;
    }
  }
}
