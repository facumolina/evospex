package casestudies.cozy;

import com.google.common.collect.Iterators;
import com.google.common.collect.TreeMultiset;

public class LSort implements java.io.Serializable {
  protected TreeMultiset<Float> _var801 = TreeMultiset.create();
  protected TreeMultiset<Float> _var802 = TreeMultiset.create();

  public LSort() {
    clear();
  }

  public LSort(java.util.ArrayList<Float> l) {
    TreeMultiset<Float> _var15810 = TreeMultiset.create();
    for (Float _x15811 : l) {
      _var15810.add(_x15811);
    }
    _var801 = _var15810;
    TreeMultiset<Float> _var15812 = TreeMultiset.create();
    for (Float _x15813 : l) {
      _var15812.add(_x15813);
    }
    _var802 = _var15812;
  }

  public void clear() {
    TreeMultiset<Float> _var15810 = TreeMultiset.create();
    _var801 = _var15810;
    TreeMultiset<Float> _var15812 = TreeMultiset.create();
    _var802 = _var15812;
  }

  public void get_sorted(Boolean asc, java.util.function.Consumer<Float> _callback) {
    if (asc) {
      java.util.ArrayList<Float> _var15800 = new java.util.ArrayList<Float>();
      for (Float _x15801 : _var801) {
        _var15800.add(_x15801);
      }
      for (Float _x15814 : _var15800) {
        _callback.accept(_x15814);
      }
    } else {
      java.util.ArrayList<Float> _var15802 = new java.util.ArrayList<Float>();
      for (Float _x15803 : _var802) {
        _var15802.add(_x15803);
      }
      for (Float _x15814 : _var15802) {
        _callback.accept(_x15814);
      }
    }
  }

  public Float get_ith(Boolean asc, Integer i) {
    Float _conditional_result15815 = 0f;
    if (asc) {
      Float _v15816;
      if ((i < (_var801.size()))) {
        _v15816 = (Iterators.get(_var801.iterator(), i));
      } else {
        _v15816 = 0f;
      }
      Float _var15804 = _v15816;
      _conditional_result15815 = _var15804;
    } else {
      Float _v15817;
      if ((i < (_var802.size()))) {
        _v15817 = (Iterators.get(_var802.iterator(), i));
      } else {
        _v15817 = 0f;
      }
      Float _var15805 = _v15817;
      _conditional_result15815 = _var15805;
    }
    return _conditional_result15815;
  }

  public void add(Float v) {
    {
      _var801.add(v);
    }
    {
      _var802.add(v);
    }
  }

  public void remove(Float v) {
    {
      _var801.remove(v);
    }
    {
      _var802.remove(v);
    }
  }
}
