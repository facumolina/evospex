package casestudies.cozy;

import java.util.Random;

public class MinFinder implements java.io.Serializable {
  protected java.util.ArrayList<T> _var88;
  protected T _var811;

  public MinFinder() {
    clear();
  }

  public void add(T x) {
    _var88.add(x);

    T _min293242 = null;
    Boolean _first293243 = true;
    for (T _x293244 : _var88) {
      Boolean _v293245;
      if (_first293243) {
        _v293245 = true;
      } else {
        _v293245 = ((_x293244).getVal() < (_min293242).getVal());
      }
      if (_v293245) {
        _first293243 = false;
        _min293242 = _x293244;
      }
    }
    _var811 = _min293242;
  }

  public MinFinder(java.util.ArrayList<T> xs) {
    _var88 = xs;
    T _min293242 = null;
    Boolean _first293243 = true;
    for (T _x293244 : xs) {
      Boolean _v293245;
      if (_first293243) {
        _v293245 = true;
      } else {
        _v293245 = ((_x293244).getVal() < (_min293242).getVal());
      }
      if (_v293245) {
        _first293243 = false;
        _min293242 = _x293244;
      }
    }
    _var811 = _min293242;
  }

  public void clear() {
    _var88 = new java.util.ArrayList<T>();
    T _min293246 = null;
    Boolean _first293247 = true;
    _var811 = _min293246;
  }

  public T findmin() {
    return _var811;
  }

  public void chval(T x, int nv) {
    T _min293249 = null;
    Boolean _first293250 = true;
    for (T _x293251 : _var88) {
      int _conditional_result293252 = 0;
      if ((java.util.Objects.equals(_x293251, x))) {
        _conditional_result293252 = nv;
      } else {
        _conditional_result293252 = (_x293251).getVal();
      }
      int _conditional_result293253 = 0;
      if ((java.util.Objects.equals(_min293249, x))) {
        _conditional_result293253 = nv;
      } else {
        _conditional_result293253 = (_min293249).getVal();
      }
      Boolean _v293254;
      if (_first293250) {
        _v293254 = true;
      } else {
        _v293254 = (_conditional_result293252 < _conditional_result293253);
      }
      if (_v293254) {
        _first293250 = false;
        _min293249 = _x293251;
      }
    }
    _var811 = _min293249;
    {
      // (x).getVal() = nv;
    }
  }

  public static class T implements java.io.Serializable {
    private int val;
    private int evospecid; // Random id to be used as an identifier for the object

    public int getVal() {
      return val;
    }

    public T(int _v293255) {
      this.val = _v293255;
      evospecid = (new Random()).nextInt(1000000);
    }

    @Override
    public boolean equals(Object other) {
      if (!(other instanceof T))
        return false;
      T o = (T) other;
      return evospecid == o.evospecid;
    }

    @Override
    public int hashCode() {
      return evospecid;
    }

  }
}
