package casestudies.cozy;

public class SynthesizedLitStorage implements java.io.Serializable {
  protected java.util.ArrayList<Record> _var990;
  protected Integer _var7003;
  protected java.util.HashMap<Integer, java.util.ArrayList<Record>> _var9464;
  protected java.util.HashMap<Integer, java.util.ArrayList<Integer>> _var11146;
  protected java.util.HashMap<Integer, java.util.ArrayList<org.sat4j.specs.IConstr>> _var12369;

  public SynthesizedLitStorage() {
    clear();
  }

  public SynthesizedLitStorage(java.util.ArrayList<Record> records) {
    _var990 = records;
    Integer _sum488728 = 0;
    for (Record __488730 : records) {
      {
        _sum488728 = (_sum488728 + 1);
      }
    }
    _var7003 = _sum488728;
    java.util.HashMap<Integer, java.util.ArrayList<Record>> _map488731 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
    for (Record _r488733 : records) {
      {
        Integer _var8471 = ((_r488733).getVal()).var;
        java.util.ArrayList<Record> _v488732 = _map488731.getOrDefault(_var8471,
            new java.util.ArrayList<Record>());
        java.util.ArrayList<Record> _var488734 = new java.util.ArrayList<Record>();
        for (Record _r488736 : records) {
          if ((java.util.Objects.equals(((_r488736).getVal()).var, _var8471))) {
            {
              _var488734.add(_r488736);
            }
          }
        }
        _v488732 = _var488734;
        _map488731.put(_var8471, _v488732);

      }
    }
    _var9464 = _map488731;
    java.util.HashMap<Integer, java.util.ArrayList<Integer>> _map488737 = new java.util.HashMap<Integer, java.util.ArrayList<Integer>>();
    for (Record _r488739 : records) {
      {
        Integer _var6859 = ((_r488739).getVal()).var;
        java.util.ArrayList<Integer> _v488738 = _map488737.getOrDefault(_var6859,
            new java.util.ArrayList<Integer>());
        java.util.ArrayList<Integer> _var488740 = new java.util.ArrayList<Integer>();
        for (Record _r488743 : records) {
          if ((java.util.Objects.equals(((_r488743).getVal()).var, _var6859))) {
            {
              {
                _var488740.add(((_r488743).getVal()).level);
              }
            }
          }
        }
        _v488738 = _var488740;
        _map488737.put(_var6859, _v488738);

      }
    }
    _var11146 = _map488737;
    java.util.HashMap<Integer, java.util.ArrayList<org.sat4j.specs.IConstr>> _map488744 = new java.util.HashMap<Integer, java.util.ArrayList<org.sat4j.specs.IConstr>>();
    for (Record _r488746 : records) {
      {
        Integer _var7614 = ((_r488746).getVal()).var;
        java.util.ArrayList<org.sat4j.specs.IConstr> _v488745 = _map488744.getOrDefault(_var7614,
            new java.util.ArrayList<org.sat4j.specs.IConstr>());
        java.util.ArrayList<org.sat4j.specs.IConstr> _var488747 = new java.util.ArrayList<org.sat4j.specs.IConstr>();
        for (Record _r488750 : records) {
          if ((java.util.Objects.equals(((_r488750).getVal()).var, _var7614))) {
            {
              {
                _var488747.add(((_r488750).getVal()).reason);
              }
            }
          }
        }
        _v488745 = _var488747;
        _map488744.put(_var7614, _v488745);

      }
    }
    _var12369 = _map488744;
  }

  public void clear() {
    _var990 = new java.util.ArrayList<Record>();
    Integer _sum488751 = 0;
    _var7003 = _sum488751;
    java.util.HashMap<Integer, java.util.ArrayList<Record>> _map488754 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
    _var9464 = _map488754;
    java.util.HashMap<Integer, java.util.ArrayList<Integer>> _map488760 = new java.util.HashMap<Integer, java.util.ArrayList<Integer>>();
    _var11146 = _map488760;
    java.util.HashMap<Integer, java.util.ArrayList<org.sat4j.specs.IConstr>> _map488767 = new java.util.HashMap<Integer, java.util.ArrayList<org.sat4j.specs.IConstr>>();
    _var12369 = _map488767;
  }

  public Integer size() {
    return _var7003;
  }

  public Record findRecord(Integer varId) {
    Record _v488774 = null;
    _label488775: do {
      for (Record _x488776 : _var9464.getOrDefault(varId, new java.util.ArrayList<Record>())) {
        _v488774 = _x488776;
        break _label488775;
      }
    } while (false);
    return _v488774;
  }

  public Boolean belongsToPool(Integer varId) {
    Boolean _v488777 = true;
    _label488778: do {
      for (Record _x488779 : _var9464.getOrDefault(varId, new java.util.ArrayList<Record>())) {
        _v488777 = false;
        break _label488778;
      }
    } while (false);
    return (!(_v488777));
  }

  public Integer getLevel(Integer varId) {
    Integer _v488780 = 0;
    _label488781: do {
      for (Integer _x488782 : _var11146.getOrDefault(varId, new java.util.ArrayList<Integer>())) {
        _v488780 = _x488782;
        break _label488781;
      }
    } while (false);
    return _v488780;
  }

  public org.sat4j.specs.IConstr getReason(Integer varId) {
    org.sat4j.specs.IConstr _v488783 = null;
    _label488784: do {
      for (org.sat4j.specs.IConstr _x488785 : _var12369.getOrDefault(varId,
          new java.util.ArrayList<org.sat4j.specs.IConstr>())) {
        _v488783 = _x488785;
        break _label488784;
      }
    } while (false);
    return _v488783;
  }

  public org.sat4j.specs.IVec<org.sat4j.minisat.core.Undoable> getUndos(Integer varId) {
    org.sat4j.specs.IVec<org.sat4j.minisat.core.Undoable> _v488786 = null;
    _label488787: do {
      for (Record _r488790 : _var990) {
        if ((java.util.Objects.equals(((_r488790).getVal()).var, varId))) {
          {
            {
              _v488786 = ((_r488790).getVal()).undos;
              break _label488787;
            }
          }
        }
      }
    } while (false);
    return _v488786;
  }

  public org.sat4j.specs.IVec<org.sat4j.minisat.core.Propagatable> getPosWatches(Integer varId) {
    org.sat4j.specs.IVec<org.sat4j.minisat.core.Propagatable> _v488791 = null;
    _label488792: do {
      for (Record _r488795 : _var990) {
        if ((java.util.Objects.equals(((_r488795).getVal()).var, varId))) {
          {
            {
              _v488791 = ((_r488795).getVal()).posWatches;
              break _label488792;
            }
          }
        }
      }
    } while (false);
    return _v488791;
  }

  public org.sat4j.specs.IVec<org.sat4j.minisat.core.Propagatable> getNegWatches(Integer varId) {
    org.sat4j.specs.IVec<org.sat4j.minisat.core.Propagatable> _v488796 = null;
    _label488797: do {
      for (Record _r488800 : _var990) {
        if ((java.util.Objects.equals(((_r488800).getVal()).var, varId))) {
          {
            {
              _v488796 = ((_r488800).getVal()).negWatches;
              break _label488797;
            }
          }
        }
      }
    } while (false);
    return _v488796;
  }

  public void updateLevel(Record rec, Integer level) {
    java.util.ArrayList<Integer> _var488801 = new java.util.ArrayList<Integer>();
    java.util.HashMap<Integer, Integer> _histogram488803 = new java.util.HashMap<Integer, Integer>();
    java.util.HashSet<Integer> _distinct_elems488807 = new java.util.HashSet<Integer>();
    for (Record _r488808 : _var990) {
      Integer _conditional_result488809 = 0;
      if ((java.util.Objects.equals(_r488808, rec))) {
        _conditional_result488809 = ((rec).getVal()).var;
      } else {
        _conditional_result488809 = ((_r488808).getVal()).var;
      }
      {
        if ((!((_distinct_elems488807.contains(_conditional_result488809))))) {
          Integer _count488805 = _histogram488803.getOrDefault(_conditional_result488809, 0);
          _count488805 = (_count488805 + 1);
          _histogram488803.put(_conditional_result488809, _count488805);

          _distinct_elems488807.add(_conditional_result488809);
        }
      }
    }
    for (Integer _var488802 : (_var11146).keySet()) {
      if ((_histogram488803.getOrDefault(_var488802, 0) > 0)) {
        Integer _count488806 = _histogram488803.getOrDefault(_var488802, 0);
        _count488806 = (_count488806 - 1);
        _histogram488803.put(_var488802, _count488806);

      } else {
        _var488801.add(_var488802);
      }
    }
    java.util.ArrayList<Integer> _var488717 = _var488801;
    java.util.ArrayList<Integer> _var488810 = new java.util.ArrayList<Integer>();
    java.util.HashSet<Integer> _distinct_elems488849 = new java.util.HashSet<Integer>();
    for (Record _r488850 : _var990) {
      Integer _conditional_result488851 = 0;
      if ((java.util.Objects.equals(_r488850, rec))) {
        _conditional_result488851 = ((rec).getVal()).var;
      } else {
        _conditional_result488851 = ((_r488850).getVal()).var;
      }
      {
        if ((!((_distinct_elems488849.contains(_conditional_result488851))))) {
          Boolean _conditional_result488813 = false;
          Boolean _found488814 = false;
          _label488816: do {
            for (Record _r488817 : _var990) {
              {
                if ((java.util.Objects.equals(((_r488817).getVal()).var,
                    _conditional_result488851))) {
                  _found488814 = true;
                  break _label488816;
                }
              }
            }
          } while (false);
          if (_found488814) {
            Boolean _conditional_result488818 = false;
            Boolean _found488819 = false;
            _label488821: do {
              for (Record _r488822 : _var990) {
                Integer _conditional_result488823 = 0;
                if ((java.util.Objects.equals(_r488822, rec))) {
                  _conditional_result488823 = ((rec).getVal()).var;
                } else {
                  _conditional_result488823 = ((_r488822).getVal()).var;
                }
                {
                  if ((java.util.Objects.equals(_conditional_result488823,
                      _conditional_result488851))) {
                    _found488819 = true;
                    break _label488821;
                  }
                }
              }
            } while (false);
            if (_found488819) {
              java.util.ArrayList<Integer> _var488824 = new java.util.ArrayList<Integer>();
              for (Record _r488827 : _var990) {
                if ((java.util.Objects.equals(((_r488827).getVal()).var,
                    _conditional_result488851))) {
                  {
                    {
                      _var488824.add(((_r488827).getVal()).level);
                    }
                  }
                }
              }
              java.util.ArrayList<Integer> _var488828 = new java.util.ArrayList<Integer>();
              for (Record _r488832 : _var990) {
                Boolean _conditional_result488833 = false;
                if ((java.util.Objects.equals(_r488832, rec))) {
                  _conditional_result488833 = (java.util.Objects.equals(((rec).getVal()).var,
                      _conditional_result488851));
                } else {
                  _conditional_result488833 = (java.util.Objects.equals(((_r488832).getVal()).var,
                      _conditional_result488851));
                }
                if (_conditional_result488833) {
                  {
                    Integer _conditional_result488831 = 0;
                    if ((java.util.Objects.equals(_r488832, rec))) {
                      _conditional_result488831 = level;
                    } else {
                      _conditional_result488831 = ((_r488832).getVal()).level;
                    }
                    {
                      _var488828.add(_conditional_result488831);
                    }
                  }
                }
              }
              _conditional_result488818 = ((_var488824 == _var488828));
            } else {
              java.util.ArrayList<Integer> _var488834 = new java.util.ArrayList<Integer>();
              for (Record _r488837 : _var990) {
                if ((java.util.Objects.equals(((_r488837).getVal()).var,
                    _conditional_result488851))) {
                  {
                    {
                      _var488834.add(((_r488837).getVal()).level);
                    }
                  }
                }
              }
              _conditional_result488818 = ((_var488834 == new java.util.ArrayList<Integer>()));
            }
            _conditional_result488813 = _conditional_result488818;
          } else {
            Boolean _found488838 = false;
            _label488840: do {
              for (Record _r488841 : _var990) {
                Integer _conditional_result488842 = 0;
                if ((java.util.Objects.equals(_r488841, rec))) {
                  _conditional_result488842 = ((rec).getVal()).var;
                } else {
                  _conditional_result488842 = ((_r488841).getVal()).var;
                }
                {
                  if ((java.util.Objects.equals(_conditional_result488842,
                      _conditional_result488851))) {
                    _found488838 = true;
                    break _label488840;
                  }
                }
              }
            } while (false);
            java.util.ArrayList<Integer> _var488843 = new java.util.ArrayList<Integer>();
            for (Record _r488847 : _var990) {
              Boolean _conditional_result488848 = false;
              if ((java.util.Objects.equals(_r488847, rec))) {
                _conditional_result488848 = (java.util.Objects.equals(((rec).getVal()).var,
                    _conditional_result488851));
              } else {
                _conditional_result488848 = (java.util.Objects.equals(((_r488847).getVal()).var,
                    _conditional_result488851));
              }
              if (_conditional_result488848) {
                {
                  Integer _conditional_result488846 = 0;
                  if ((java.util.Objects.equals(_r488847, rec))) {
                    _conditional_result488846 = level;
                  } else {
                    _conditional_result488846 = ((_r488847).getVal()).level;
                  }
                  {
                    _var488843.add(_conditional_result488846);
                  }
                }
              }
            }
            Boolean _v488939;
            if ((!(_found488838))) {
              _v488939 = true;
            } else {
              _v488939 = ((new java.util.ArrayList<Integer>() == _var488843));
            }
            _conditional_result488813 = _v488939;
          }
          Boolean _v488940;
          if ((!(_var11146.containsKey(_conditional_result488851)))) {
            _v488940 = true;
          } else {
            _v488940 = (!(_conditional_result488813));
          }
          if (_v488940) {
            {
              _var488810.add(_conditional_result488851);
            }
          }
          _distinct_elems488849.add(_conditional_result488851);
        }
      }
    }
    java.util.ArrayList<Integer> _var488718 = _var488810;
    for (Integer _var139016 : _var488717) {
      _var11146.remove(_var139016);
    }
    for (Integer _var139016 : _var488718) {
      java.util.ArrayList<Integer> _var139017 = _var11146.getOrDefault(_var139016,
          new java.util.ArrayList<Integer>());
      Boolean _found488852 = false;
      _label488854: do {
        for (Record _r488855 : _var990) {
          {
            if ((java.util.Objects.equals(((_r488855).getVal()).var, _var139016))) {
              _found488852 = true;
              break _label488854;
            }
          }
        }
      } while (false);
      if (_found488852) {
        Boolean _found488856 = false;
        _label488858: do {
          for (Record _r488859 : _var990) {
            Integer _conditional_result488860 = 0;
            if ((java.util.Objects.equals(_r488859, rec))) {
              _conditional_result488860 = ((rec).getVal()).var;
            } else {
              _conditional_result488860 = ((_r488859).getVal()).var;
            }
            {
              if ((java.util.Objects.equals(_conditional_result488860, _var139016))) {
                _found488856 = true;
                break _label488858;
              }
            }
          }
        } while (false);
        if (_found488856) {
          java.util.HashMap<Integer, Integer> _histogram488861 = new java.util.HashMap<Integer, Integer>();
          for (Record _r488867 : _var990) {
            Boolean _conditional_result488868 = false;
            if ((java.util.Objects.equals(_r488867, rec))) {
              _conditional_result488868 = (java.util.Objects.equals(((rec).getVal()).var,
                  _var139016));
            } else {
              _conditional_result488868 = (java.util.Objects.equals(((_r488867).getVal()).var,
                  _var139016));
            }
            if (_conditional_result488868) {
              {
                Integer _conditional_result488866 = 0;
                if ((java.util.Objects.equals(_r488867, rec))) {
                  _conditional_result488866 = level;
                } else {
                  _conditional_result488866 = ((_r488867).getVal()).level;
                }
                {
                  Integer _count488863 = _histogram488861.getOrDefault(_conditional_result488866,
                      0);
                  _count488863 = (_count488863 + 1);
                  _histogram488861.put(_conditional_result488866, _count488863);

                }
              }
            }
          }
          for (Record _r488870 : _var990) {
            if ((java.util.Objects.equals(((_r488870).getVal()).var, _var139016))) {
              {
                {
                  Integer _var147751 = ((_r488870).getVal()).level;
                  if ((_histogram488861.getOrDefault(_var147751, 0) > 0)) {
                    Integer _count488864 = _histogram488861.getOrDefault(_var147751, 0);
                    _count488864 = (_count488864 - 1);
                    _histogram488861.put(_var147751, _count488864);

                  } else {
                    _var139017.remove(_var147751);
                  }
                }
              }
            }
          }
        } else {
          java.util.HashMap<Integer, Integer> _histogram488871 = new java.util.HashMap<Integer, Integer>();
          for (Record _r488876 : _var990) {
            if ((java.util.Objects.equals(((_r488876).getVal()).var, _var139016))) {
              {
                {
                  Integer _var147751 = ((_r488876).getVal()).level;
                  if ((_histogram488871.getOrDefault(_var147751, 0) > 0)) {
                    Integer _count488874 = _histogram488871.getOrDefault(_var147751, 0);
                    _count488874 = (_count488874 - 1);
                    _histogram488871.put(_var147751, _count488874);

                  } else {
                    _var139017.remove(_var147751);
                  }
                }
              }
            }
          }
        }
      } else {
        Boolean _found488877 = false;
        _label488879: do {
          for (Record _r488880 : _var990) {
            Integer _conditional_result488881 = 0;
            if ((java.util.Objects.equals(_r488880, rec))) {
              _conditional_result488881 = ((rec).getVal()).var;
            } else {
              _conditional_result488881 = ((_r488880).getVal()).var;
            }
            {
              if ((java.util.Objects.equals(_conditional_result488881, _var139016))) {
                _found488877 = true;
                break _label488879;
              }
            }
          }
        } while (false);
        if (_found488877) {
          java.util.HashMap<Integer, Integer> _histogram488882 = new java.util.HashMap<Integer, Integer>();
          for (Record _r488888 : _var990) {
            Boolean _conditional_result488889 = false;
            if ((java.util.Objects.equals(_r488888, rec))) {
              _conditional_result488889 = (java.util.Objects.equals(((rec).getVal()).var,
                  _var139016));
            } else {
              _conditional_result488889 = (java.util.Objects.equals(((_r488888).getVal()).var,
                  _var139016));
            }
            if (_conditional_result488889) {
              {
                Integer _conditional_result488887 = 0;
                if ((java.util.Objects.equals(_r488888, rec))) {
                  _conditional_result488887 = level;
                } else {
                  _conditional_result488887 = ((_r488888).getVal()).level;
                }
                {
                  Integer _count488884 = _histogram488882.getOrDefault(_conditional_result488887,
                      0);
                  _count488884 = (_count488884 + 1);
                  _histogram488882.put(_conditional_result488887, _count488884);

                }
              }
            }
          }
        } else {
          java.util.HashMap<Integer, Integer> _histogram488890 = new java.util.HashMap<Integer, Integer>();
        }
      }
      Boolean _found488894 = false;
      _label488896: do {
        for (Record _r488897 : _var990) {
          Integer _conditional_result488898 = 0;
          if ((java.util.Objects.equals(_r488897, rec))) {
            _conditional_result488898 = ((rec).getVal()).var;
          } else {
            _conditional_result488898 = ((_r488897).getVal()).var;
          }
          {
            if ((java.util.Objects.equals(_conditional_result488898, _var139016))) {
              _found488894 = true;
              break _label488896;
            }
          }
        }
      } while (false);
      if (_found488894) {
        Boolean _found488899 = false;
        _label488901: do {
          for (Record _r488902 : _var990) {
            {
              if ((java.util.Objects.equals(((_r488902).getVal()).var, _var139016))) {
                _found488899 = true;
                break _label488901;
              }
            }
          }
        } while (false);
        if (_found488899) {
          java.util.HashMap<Integer, Integer> _histogram488903 = new java.util.HashMap<Integer, Integer>();
          for (Record _r488908 : _var990) {
            if ((java.util.Objects.equals(((_r488908).getVal()).var, _var139016))) {
              {
                {
                  Integer _count488905 = _histogram488903.getOrDefault(((_r488908).getVal()).level,
                      0);
                  _count488905 = (_count488905 + 1);
                  _histogram488903.put(((_r488908).getVal()).level, _count488905);

                }
              }
            }
          }
          for (Record _r488911 : _var990) {
            Boolean _conditional_result488912 = false;
            if ((java.util.Objects.equals(_r488911, rec))) {
              _conditional_result488912 = (java.util.Objects.equals(((rec).getVal()).var,
                  _var139016));
            } else {
              _conditional_result488912 = (java.util.Objects.equals(((_r488911).getVal()).var,
                  _var139016));
            }
            if (_conditional_result488912) {
              {
                Integer _conditional_result488910 = 0;
                if ((java.util.Objects.equals(_r488911, rec))) {
                  _conditional_result488910 = level;
                } else {
                  _conditional_result488910 = ((_r488911).getVal()).level;
                }
                {
                  if ((_histogram488903.getOrDefault(_conditional_result488910, 0) > 0)) {
                    Integer _count488906 = _histogram488903.getOrDefault(_conditional_result488910,
                        0);
                    _count488906 = (_count488906 - 1);
                    _histogram488903.put(_conditional_result488910, _count488906);

                  } else {
                    _var139017.add(_conditional_result488910);
                  }
                }
              }
            }
          }
        } else {
          java.util.HashMap<Integer, Integer> _histogram488913 = new java.util.HashMap<Integer, Integer>();
          for (Record _r488919 : _var990) {
            Boolean _conditional_result488920 = false;
            if ((java.util.Objects.equals(_r488919, rec))) {
              _conditional_result488920 = (java.util.Objects.equals(((rec).getVal()).var,
                  _var139016));
            } else {
              _conditional_result488920 = (java.util.Objects.equals(((_r488919).getVal()).var,
                  _var139016));
            }
            if (_conditional_result488920) {
              {
                Integer _conditional_result488918 = 0;
                if ((java.util.Objects.equals(_r488919, rec))) {
                  _conditional_result488918 = level;
                } else {
                  _conditional_result488918 = ((_r488919).getVal()).level;
                }
                {
                  if ((_histogram488913.getOrDefault(_conditional_result488918, 0) > 0)) {
                    Integer _count488916 = _histogram488913.getOrDefault(_conditional_result488918,
                        0);
                    _count488916 = (_count488916 - 1);
                    _histogram488913.put(_conditional_result488918, _count488916);

                  } else {
                    _var139017.add(_conditional_result488918);
                  }
                }
              }
            }
          }
        }
      } else {
        Boolean _found488921 = false;
        _label488923: do {
          for (Record _r488924 : _var990) {
            {
              if ((java.util.Objects.equals(((_r488924).getVal()).var, _var139016))) {
                _found488921 = true;
                break _label488923;
              }
            }
          }
        } while (false);
        if (_found488921) {
          java.util.HashMap<Integer, Integer> _histogram488925 = new java.util.HashMap<Integer, Integer>();
          for (Record _r488930 : _var990) {
            if ((java.util.Objects.equals(((_r488930).getVal()).var, _var139016))) {
              {
                {
                  Integer _count488927 = _histogram488925.getOrDefault(((_r488930).getVal()).level,
                      0);
                  _count488927 = (_count488927 + 1);
                  _histogram488925.put(((_r488930).getVal()).level, _count488927);

                }
              }
            }
          }
        } else {
          java.util.HashMap<Integer, Integer> _histogram488931 = new java.util.HashMap<Integer, Integer>();
        }
      }
      _var11146.put(_var139016, _var139017);

    }
    java.util.HashSet<Record> _distinct_elems488937 = new java.util.HashSet<Record>();
    for (Record __var1769488938 : _var990) {
      {
        if ((!((_distinct_elems488937.contains(__var1769488938))))) {
          Boolean _v488941;
          if ((!((java.util.Objects.equals(__var1769488938, rec))))) {
            _v488941 = true;
          } else {
            _v488941 = (java.util.Objects.equals((__var1769488938).getVal(),
                new _Type488726(((rec).getVal()).var, level, ((rec).getVal()).reason,
                    ((rec).getVal()).posWatches, ((rec).getVal()).negWatches,
                    ((rec).getVal()).undos)));
          }
          if ((!(_v488941))) {
            {
              Integer _conditional_result488936 = 0;
              _conditional_result488936 = level;
              ((__var1769488938).getVal()).level = _conditional_result488936;
            }
          }
          _distinct_elems488937.add(__var1769488938);
        }
      }
    }
    {
      if ((!((_distinct_elems488937.contains(rec))))) {
        Boolean _v488942;
        if ((!((java.util.Objects.equals(rec, rec))))) {
          _v488942 = true;
        } else {
          _v488942 = (java.util.Objects.equals((rec).getVal(),
              new _Type488726(((rec).getVal()).var, level, ((rec).getVal()).reason,
                  ((rec).getVal()).posWatches, ((rec).getVal()).negWatches,
                  ((rec).getVal()).undos)));
        }
        if ((!(_v488942))) {
          {
            Integer _conditional_result488936 = 0;
            _conditional_result488936 = level;
            ((rec).getVal()).level = _conditional_result488936;
          }
        }
        _distinct_elems488937.add(rec);
      }
    }
  }

  public void updateReason(Record rec, org.sat4j.specs.IConstr reason) {
    java.util.ArrayList<Integer> _var488943 = new java.util.ArrayList<Integer>();
    java.util.HashMap<Integer, Integer> _histogram488945 = new java.util.HashMap<Integer, Integer>();
    java.util.HashSet<Integer> _distinct_elems488949 = new java.util.HashSet<Integer>();
    for (Record _r488950 : _var990) {
      Integer _conditional_result488951 = 0;
      if ((java.util.Objects.equals(_r488950, rec))) {
        _conditional_result488951 = ((rec).getVal()).var;
      } else {
        _conditional_result488951 = ((_r488950).getVal()).var;
      }
      {
        if ((!((_distinct_elems488949.contains(_conditional_result488951))))) {
          Integer _count488947 = _histogram488945.getOrDefault(_conditional_result488951, 0);
          _count488947 = (_count488947 + 1);
          _histogram488945.put(_conditional_result488951, _count488947);

          _distinct_elems488949.add(_conditional_result488951);
        }
      }
    }
    for (Integer _var488944 : (_var12369).keySet()) {
      if ((_histogram488945.getOrDefault(_var488944, 0) > 0)) {
        Integer _count488948 = _histogram488945.getOrDefault(_var488944, 0);
        _count488948 = (_count488948 - 1);
        _histogram488945.put(_var488944, _count488948);

      } else {
        _var488943.add(_var488944);
      }
    }
    java.util.ArrayList<Integer> _var488719 = _var488943;
    java.util.ArrayList<Integer> _var488952 = new java.util.ArrayList<Integer>();
    java.util.HashSet<Integer> _distinct_elems488991 = new java.util.HashSet<Integer>();
    for (Record _r488992 : _var990) {
      Integer _conditional_result488993 = 0;
      if ((java.util.Objects.equals(_r488992, rec))) {
        _conditional_result488993 = ((rec).getVal()).var;
      } else {
        _conditional_result488993 = ((_r488992).getVal()).var;
      }
      {
        if ((!((_distinct_elems488991.contains(_conditional_result488993))))) {
          Boolean _conditional_result488955 = false;
          Boolean _found488956 = false;
          _label488958: do {
            for (Record _r488959 : _var990) {
              {
                if ((java.util.Objects.equals(((_r488959).getVal()).var,
                    _conditional_result488993))) {
                  _found488956 = true;
                  break _label488958;
                }
              }
            }
          } while (false);
          if (_found488956) {
            Boolean _conditional_result488960 = false;
            Boolean _found488961 = false;
            _label488963: do {
              for (Record _r488964 : _var990) {
                Integer _conditional_result488965 = 0;
                if ((java.util.Objects.equals(_r488964, rec))) {
                  _conditional_result488965 = ((rec).getVal()).var;
                } else {
                  _conditional_result488965 = ((_r488964).getVal()).var;
                }
                {
                  if ((java.util.Objects.equals(_conditional_result488965,
                      _conditional_result488993))) {
                    _found488961 = true;
                    break _label488963;
                  }
                }
              }
            } while (false);
            if (_found488961) {
              java.util.ArrayList<org.sat4j.specs.IConstr> _var488966 = new java.util.ArrayList<org.sat4j.specs.IConstr>();
              for (Record _r488969 : _var990) {
                if ((java.util.Objects.equals(((_r488969).getVal()).var,
                    _conditional_result488993))) {
                  {
                    {
                      _var488966.add(((_r488969).getVal()).reason);
                    }
                  }
                }
              }
              java.util.ArrayList<org.sat4j.specs.IConstr> _var488970 = new java.util.ArrayList<org.sat4j.specs.IConstr>();
              for (Record _r488974 : _var990) {
                Boolean _conditional_result488975 = false;
                if ((java.util.Objects.equals(_r488974, rec))) {
                  _conditional_result488975 = (java.util.Objects.equals(((rec).getVal()).var,
                      _conditional_result488993));
                } else {
                  _conditional_result488975 = (java.util.Objects.equals(((_r488974).getVal()).var,
                      _conditional_result488993));
                }
                if (_conditional_result488975) {
                  {
                    org.sat4j.specs.IConstr _conditional_result488973 = null;
                    if ((java.util.Objects.equals(_r488974, rec))) {
                      _conditional_result488973 = reason;
                    } else {
                      _conditional_result488973 = ((_r488974).getVal()).reason;
                    }
                    {
                      _var488970.add(_conditional_result488973);
                    }
                  }
                }
              }
              _conditional_result488960 = ((_var488966 == _var488970));
            } else {
              java.util.ArrayList<org.sat4j.specs.IConstr> _var488976 = new java.util.ArrayList<org.sat4j.specs.IConstr>();
              for (Record _r488979 : _var990) {
                if ((java.util.Objects.equals(((_r488979).getVal()).var,
                    _conditional_result488993))) {
                  {
                    {
                      _var488976.add(((_r488979).getVal()).reason);
                    }
                  }
                }
              }
              _conditional_result488960 = ((_var488976 == new java.util.ArrayList<org.sat4j.specs.IConstr>()));
            }
            _conditional_result488955 = _conditional_result488960;
          } else {
            Boolean _found488980 = false;
            _label488982: do {
              for (Record _r488983 : _var990) {
                Integer _conditional_result488984 = 0;
                if ((java.util.Objects.equals(_r488983, rec))) {
                  _conditional_result488984 = ((rec).getVal()).var;
                } else {
                  _conditional_result488984 = ((_r488983).getVal()).var;
                }
                {
                  if ((java.util.Objects.equals(_conditional_result488984,
                      _conditional_result488993))) {
                    _found488980 = true;
                    break _label488982;
                  }
                }
              }
            } while (false);
            java.util.ArrayList<org.sat4j.specs.IConstr> _var488985 = new java.util.ArrayList<org.sat4j.specs.IConstr>();
            for (Record _r488989 : _var990) {
              Boolean _conditional_result488990 = false;
              if ((java.util.Objects.equals(_r488989, rec))) {
                _conditional_result488990 = (java.util.Objects.equals(((rec).getVal()).var,
                    _conditional_result488993));
              } else {
                _conditional_result488990 = (java.util.Objects.equals(((_r488989).getVal()).var,
                    _conditional_result488993));
              }
              if (_conditional_result488990) {
                {
                  org.sat4j.specs.IConstr _conditional_result488988 = null;
                  if ((java.util.Objects.equals(_r488989, rec))) {
                    _conditional_result488988 = reason;
                  } else {
                    _conditional_result488988 = ((_r488989).getVal()).reason;
                  }
                  {
                    _var488985.add(_conditional_result488988);
                  }
                }
              }
            }
            Boolean _v489081;
            if ((!(_found488980))) {
              _v489081 = true;
            } else {
              _v489081 = ((new java.util.ArrayList<org.sat4j.specs.IConstr>() == _var488985));
            }
            _conditional_result488955 = _v489081;
          }
          Boolean _v489082;
          if ((!(_var12369.containsKey(_conditional_result488993)))) {
            _v489082 = true;
          } else {
            _v489082 = (!(_conditional_result488955));
          }
          if (_v489082) {
            {
              _var488952.add(_conditional_result488993);
            }
          }
          _distinct_elems488991.add(_conditional_result488993);
        }
      }
    }
    java.util.ArrayList<Integer> _var488720 = _var488952;
    for (Integer _var318665 : _var488719) {
      _var12369.remove(_var318665);
    }
    for (Integer _var318665 : _var488720) {
      java.util.ArrayList<org.sat4j.specs.IConstr> _var318686 = _var12369.getOrDefault(_var318665,
          new java.util.ArrayList<org.sat4j.specs.IConstr>());
      Boolean _found488994 = false;
      _label488996: do {
        for (Record _r488997 : _var990) {
          {
            if ((java.util.Objects.equals(((_r488997).getVal()).var, _var318665))) {
              _found488994 = true;
              break _label488996;
            }
          }
        }
      } while (false);
      if (_found488994) {
        Boolean _found488998 = false;
        _label489000: do {
          for (Record _r489001 : _var990) {
            Integer _conditional_result489002 = 0;
            if ((java.util.Objects.equals(_r489001, rec))) {
              _conditional_result489002 = ((rec).getVal()).var;
            } else {
              _conditional_result489002 = ((_r489001).getVal()).var;
            }
            {
              if ((java.util.Objects.equals(_conditional_result489002, _var318665))) {
                _found488998 = true;
                break _label489000;
              }
            }
          }
        } while (false);
        if (_found488998) {
          java.util.HashMap<org.sat4j.specs.IConstr, Integer> _histogram489003 = new java.util.HashMap<org.sat4j.specs.IConstr, Integer>();
          for (Record _r489009 : _var990) {
            Boolean _conditional_result489010 = false;
            if ((java.util.Objects.equals(_r489009, rec))) {
              _conditional_result489010 = (java.util.Objects.equals(((rec).getVal()).var,
                  _var318665));
            } else {
              _conditional_result489010 = (java.util.Objects.equals(((_r489009).getVal()).var,
                  _var318665));
            }
            if (_conditional_result489010) {
              {
                org.sat4j.specs.IConstr _conditional_result489008 = null;
                if ((java.util.Objects.equals(_r489009, rec))) {
                  _conditional_result489008 = reason;
                } else {
                  _conditional_result489008 = ((_r489009).getVal()).reason;
                }
                {
                  Integer _count489005 = _histogram489003.getOrDefault(_conditional_result489008,
                      0);
                  _count489005 = (_count489005 + 1);
                  _histogram489003.put(_conditional_result489008, _count489005);

                }
              }
            }
          }
          for (Record _r489012 : _var990) {
            if ((java.util.Objects.equals(((_r489012).getVal()).var, _var318665))) {
              {
                {
                  org.sat4j.specs.IConstr _var326252 = ((_r489012).getVal()).reason;
                  if ((_histogram489003.getOrDefault(_var326252, 0) > 0)) {
                    Integer _count489006 = _histogram489003.getOrDefault(_var326252, 0);
                    _count489006 = (_count489006 - 1);
                    _histogram489003.put(_var326252, _count489006);

                  } else {
                    _var318686.remove(_var326252);
                  }
                }
              }
            }
          }
        } else {
          java.util.HashMap<org.sat4j.specs.IConstr, Integer> _histogram489013 = new java.util.HashMap<org.sat4j.specs.IConstr, Integer>();
          for (Record _r489018 : _var990) {
            if ((java.util.Objects.equals(((_r489018).getVal()).var, _var318665))) {
              {
                {
                  org.sat4j.specs.IConstr _var326252 = ((_r489018).getVal()).reason;
                  if ((_histogram489013.getOrDefault(_var326252, 0) > 0)) {
                    Integer _count489016 = _histogram489013.getOrDefault(_var326252, 0);
                    _count489016 = (_count489016 - 1);
                    _histogram489013.put(_var326252, _count489016);

                  } else {
                    _var318686.remove(_var326252);
                  }
                }
              }
            }
          }
        }
      } else {
        Boolean _found489019 = false;
        _label489021: do {
          for (Record _r489022 : _var990) {
            Integer _conditional_result489023 = 0;
            if ((java.util.Objects.equals(_r489022, rec))) {
              _conditional_result489023 = ((rec).getVal()).var;
            } else {
              _conditional_result489023 = ((_r489022).getVal()).var;
            }
            {
              if ((java.util.Objects.equals(_conditional_result489023, _var318665))) {
                _found489019 = true;
                break _label489021;
              }
            }
          }
        } while (false);
        if (_found489019) {
          java.util.HashMap<org.sat4j.specs.IConstr, Integer> _histogram489024 = new java.util.HashMap<org.sat4j.specs.IConstr, Integer>();
          for (Record _r489030 : _var990) {
            Boolean _conditional_result489031 = false;
            if ((java.util.Objects.equals(_r489030, rec))) {
              _conditional_result489031 = (java.util.Objects.equals(((rec).getVal()).var,
                  _var318665));
            } else {
              _conditional_result489031 = (java.util.Objects.equals(((_r489030).getVal()).var,
                  _var318665));
            }
            if (_conditional_result489031) {
              {
                org.sat4j.specs.IConstr _conditional_result489029 = null;
                if ((java.util.Objects.equals(_r489030, rec))) {
                  _conditional_result489029 = reason;
                } else {
                  _conditional_result489029 = ((_r489030).getVal()).reason;
                }
                {
                  Integer _count489026 = _histogram489024.getOrDefault(_conditional_result489029,
                      0);
                  _count489026 = (_count489026 + 1);
                  _histogram489024.put(_conditional_result489029, _count489026);

                }
              }
            }
          }
        } else {
          java.util.HashMap<org.sat4j.specs.IConstr, Integer> _histogram489032 = new java.util.HashMap<org.sat4j.specs.IConstr, Integer>();
        }
      }
      Boolean _found489036 = false;
      _label489038: do {
        for (Record _r489039 : _var990) {
          Integer _conditional_result489040 = 0;
          if ((java.util.Objects.equals(_r489039, rec))) {
            _conditional_result489040 = ((rec).getVal()).var;
          } else {
            _conditional_result489040 = ((_r489039).getVal()).var;
          }
          {
            if ((java.util.Objects.equals(_conditional_result489040, _var318665))) {
              _found489036 = true;
              break _label489038;
            }
          }
        }
      } while (false);
      if (_found489036) {
        Boolean _found489041 = false;
        _label489043: do {
          for (Record _r489044 : _var990) {
            {
              if ((java.util.Objects.equals(((_r489044).getVal()).var, _var318665))) {
                _found489041 = true;
                break _label489043;
              }
            }
          }
        } while (false);
        if (_found489041) {
          java.util.HashMap<org.sat4j.specs.IConstr, Integer> _histogram489045 = new java.util.HashMap<org.sat4j.specs.IConstr, Integer>();
          for (Record _r489050 : _var990) {
            if ((java.util.Objects.equals(((_r489050).getVal()).var, _var318665))) {
              {
                {
                  Integer _count489047 = _histogram489045.getOrDefault(((_r489050).getVal()).reason,
                      0);
                  _count489047 = (_count489047 + 1);
                  _histogram489045.put(((_r489050).getVal()).reason, _count489047);

                }
              }
            }
          }
          for (Record _r489053 : _var990) {
            Boolean _conditional_result489054 = false;
            if ((java.util.Objects.equals(_r489053, rec))) {
              _conditional_result489054 = (java.util.Objects.equals(((rec).getVal()).var,
                  _var318665));
            } else {
              _conditional_result489054 = (java.util.Objects.equals(((_r489053).getVal()).var,
                  _var318665));
            }
            if (_conditional_result489054) {
              {
                org.sat4j.specs.IConstr _conditional_result489052 = null;
                if ((java.util.Objects.equals(_r489053, rec))) {
                  _conditional_result489052 = reason;
                } else {
                  _conditional_result489052 = ((_r489053).getVal()).reason;
                }
                {
                  if ((_histogram489045.getOrDefault(_conditional_result489052, 0) > 0)) {
                    Integer _count489048 = _histogram489045.getOrDefault(_conditional_result489052,
                        0);
                    _count489048 = (_count489048 - 1);
                    _histogram489045.put(_conditional_result489052, _count489048);

                  } else {
                    _var318686.add(_conditional_result489052);
                  }
                }
              }
            }
          }
        } else {
          java.util.HashMap<org.sat4j.specs.IConstr, Integer> _histogram489055 = new java.util.HashMap<org.sat4j.specs.IConstr, Integer>();
          for (Record _r489061 : _var990) {
            Boolean _conditional_result489062 = false;
            if ((java.util.Objects.equals(_r489061, rec))) {
              _conditional_result489062 = (java.util.Objects.equals(((rec).getVal()).var,
                  _var318665));
            } else {
              _conditional_result489062 = (java.util.Objects.equals(((_r489061).getVal()).var,
                  _var318665));
            }
            if (_conditional_result489062) {
              {
                org.sat4j.specs.IConstr _conditional_result489060 = null;
                if ((java.util.Objects.equals(_r489061, rec))) {
                  _conditional_result489060 = reason;
                } else {
                  _conditional_result489060 = ((_r489061).getVal()).reason;
                }
                {
                  if ((_histogram489055.getOrDefault(_conditional_result489060, 0) > 0)) {
                    Integer _count489058 = _histogram489055.getOrDefault(_conditional_result489060,
                        0);
                    _count489058 = (_count489058 - 1);
                    _histogram489055.put(_conditional_result489060, _count489058);

                  } else {
                    _var318686.add(_conditional_result489060);
                  }
                }
              }
            }
          }
        }
      } else {
        Boolean _found489063 = false;
        _label489065: do {
          for (Record _r489066 : _var990) {
            {
              if ((java.util.Objects.equals(((_r489066).getVal()).var, _var318665))) {
                _found489063 = true;
                break _label489065;
              }
            }
          }
        } while (false);
        if (_found489063) {
          java.util.HashMap<org.sat4j.specs.IConstr, Integer> _histogram489067 = new java.util.HashMap<org.sat4j.specs.IConstr, Integer>();
          for (Record _r489072 : _var990) {
            if ((java.util.Objects.equals(((_r489072).getVal()).var, _var318665))) {
              {
                {
                  Integer _count489069 = _histogram489067.getOrDefault(((_r489072).getVal()).reason,
                      0);
                  _count489069 = (_count489069 + 1);
                  _histogram489067.put(((_r489072).getVal()).reason, _count489069);

                }
              }
            }
          }
        } else {
          java.util.HashMap<org.sat4j.specs.IConstr, Integer> _histogram489073 = new java.util.HashMap<org.sat4j.specs.IConstr, Integer>();
        }
      }
      _var12369.put(_var318665, _var318686);

    }
    java.util.HashSet<Record> _distinct_elems489079 = new java.util.HashSet<Record>();
    for (Record __var2655489080 : _var990) {
      {
        if ((!((_distinct_elems489079.contains(__var2655489080))))) {
          Boolean _v489083;
          if ((!((java.util.Objects.equals(__var2655489080, rec))))) {
            _v489083 = true;
          } else {
            _v489083 = (java.util.Objects.equals((__var2655489080).getVal(),
                new _Type488726(((rec).getVal()).var, ((rec).getVal()).level, reason,
                    ((rec).getVal()).posWatches, ((rec).getVal()).negWatches,
                    ((rec).getVal()).undos)));
          }
          if ((!(_v489083))) {
            {
              org.sat4j.specs.IConstr _conditional_result489078 = null;
              if ((java.util.Objects.equals(__var2655489080, rec))) {
                _conditional_result489078 = reason;
              } else {
                _conditional_result489078 = ((__var2655489080).getVal()).reason;
              }
              ((__var2655489080).getVal()).reason = _conditional_result489078;
            }
          }
          _distinct_elems489079.add(__var2655489080);
        }
      }
    }
    {
      if ((!((_distinct_elems489079.contains(rec))))) {
        Boolean _v489084;
        if ((!((java.util.Objects.equals(rec, rec))))) {
          _v489084 = true;
        } else {
          _v489084 = (java.util.Objects.equals((rec).getVal(),
              new _Type488726(((rec).getVal()).var, ((rec).getVal()).level, reason,
                  ((rec).getVal()).posWatches, ((rec).getVal()).negWatches,
                  ((rec).getVal()).undos)));
        }
        if ((!(_v489084))) {
          {
            org.sat4j.specs.IConstr _conditional_result489078 = null;
            if ((java.util.Objects.equals(rec, rec))) {
              _conditional_result489078 = reason;
            } else {
              _conditional_result489078 = ((rec).getVal()).reason;
            }
            ((rec).getVal()).reason = _conditional_result489078;
          }
        }
        _distinct_elems489079.add(rec);
      }
    }
  }

  public void add(Record rec) {
    Integer _var488721 = (_var7003 + 1);
    java.util.ArrayList<Integer> _var489085 = new java.util.ArrayList<Integer>();
    java.util.HashMap<Integer, Integer> _histogram489087 = new java.util.HashMap<Integer, Integer>();
    java.util.ArrayList<Record> _var489091 = new java.util.ArrayList<Record>();
    for (Record _var489092 : _var990) {
      _var489091.add(_var489092);
    }
    {
      _var489091.add(rec);
    }
    java.util.ArrayList<Record> __var55799489093 = _var489091;
    java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489094 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
    for (Record _r489096 : __var55799489093) {
      {
        Integer _var8471 = ((_r489096).getVal()).var;
        java.util.ArrayList<Record> _v489095 = _map489094.getOrDefault(_var8471,
            new java.util.ArrayList<Record>());
        java.util.ArrayList<Record> _var489097 = new java.util.ArrayList<Record>();
        for (Record _r489099 : __var55799489093) {
          if ((java.util.Objects.equals(((_r489099).getVal()).var, _var8471))) {
            {
              _var489097.add(_r489099);
            }
          }
        }
        _v489095 = _var489097;
        _map489094.put(_var8471, _v489095);

      }
    }
    for (Integer _x489088 : (_map489094).keySet()) {
      Integer _count489089 = _histogram489087.getOrDefault(_x489088, 0);
      _count489089 = (_count489089 + 1);
      _histogram489087.put(_x489088, _count489089);

    }
    for (Integer _var489086 : (_var9464).keySet()) {
      if ((_histogram489087.getOrDefault(_var489086, 0) > 0)) {
        Integer _count489090 = _histogram489087.getOrDefault(_var489086, 0);
        _count489090 = (_count489090 - 1);
        _histogram489087.put(_var489086, _count489090);

      } else {
        _var489085.add(_var489086);
      }
    }
    java.util.ArrayList<Integer> _var488722 = _var489085;
    java.util.ArrayList<Integer> _var489100 = new java.util.ArrayList<Integer>();
    java.util.ArrayList<Record> _var489129 = new java.util.ArrayList<Record>();
    for (Record _var489130 : _var990) {
      _var489129.add(_var489130);
    }
    {
      _var489129.add(rec);
    }
    java.util.ArrayList<Record> __var94194489131 = _var489129;
    java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489132 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
    for (Record _r489134 : __var94194489131) {
      {
        Integer _var8471 = ((_r489134).getVal()).var;
        java.util.ArrayList<Record> _v489133 = _map489132.getOrDefault(_var8471,
            new java.util.ArrayList<Record>());
        java.util.ArrayList<Record> _var489135 = new java.util.ArrayList<Record>();
        for (Record _r489137 : __var94194489131) {
          if ((java.util.Objects.equals(((_r489137).getVal()).var, _var8471))) {
            {
              _var489135.add(_r489137);
            }
          }
        }
        _v489133 = _var489135;
        _map489132.put(_var8471, _v489133);

      }
    }
    for (Integer __var46838489102 : (_map489132).keySet()) {
      Boolean _conditional_result489103 = false;
      Boolean _found489104 = false;
      _label489106: do {
        for (Record _r489107 : _var990) {
          {
            if ((java.util.Objects.equals(((_r489107).getVal()).var, __var46838489102))) {
              _found489104 = true;
              break _label489106;
            }
          }
        }
      } while (false);
      if (_found489104) {
        java.util.ArrayList<Record> _var489108 = new java.util.ArrayList<Record>();
        for (Record _r489110 : _var990) {
          if ((java.util.Objects.equals(((_r489110).getVal()).var, __var46838489102))) {
            {
              _var489108.add(_r489110);
            }
          }
        }
        java.util.ArrayList<Record> _var489111 = new java.util.ArrayList<Record>();
        for (Record _var489112 : _var990) {
          _var489111.add(_var489112);
        }
        {
          _var489111.add(rec);
        }
        java.util.ArrayList<Record> __var94204489113 = _var489111;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489114 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489116 : __var94204489113) {
          {
            Integer _var8471 = ((_r489116).getVal()).var;
            java.util.ArrayList<Record> _v489115 = _map489114.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489117 = new java.util.ArrayList<Record>();
            for (Record _r489119 : __var94204489113) {
              if ((java.util.Objects.equals(((_r489119).getVal()).var, _var8471))) {
                {
                  _var489117.add(_r489119);
                }
              }
            }
            _v489115 = _var489117;
            _map489114.put(_var8471, _v489115);

          }
        }
        _conditional_result489103 = ((_var489108 == _map489114.getOrDefault(__var46838489102,
            new java.util.ArrayList<Record>())));
      } else {
        java.util.ArrayList<Record> _var489120 = new java.util.ArrayList<Record>();
        for (Record _var489121 : _var990) {
          _var489120.add(_var489121);
        }
        {
          _var489120.add(rec);
        }
        java.util.ArrayList<Record> __var94204489122 = _var489120;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489123 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489125 : __var94204489122) {
          {
            Integer _var8471 = ((_r489125).getVal()).var;
            java.util.ArrayList<Record> _v489124 = _map489123.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489126 = new java.util.ArrayList<Record>();
            for (Record _r489128 : __var94204489122) {
              if ((java.util.Objects.equals(((_r489128).getVal()).var, _var8471))) {
                {
                  _var489126.add(_r489128);
                }
              }
            }
            _v489124 = _var489126;
            _map489123.put(_var8471, _v489124);

          }
        }
        _conditional_result489103 = ((new java.util.ArrayList<Record>() == _map489123
            .getOrDefault(__var46838489102, new java.util.ArrayList<Record>())));
      }
      Boolean _v489434;
      if ((!(_var9464.containsKey(__var46838489102)))) {
        _v489434 = true;
      } else {
        _v489434 = (!(_conditional_result489103));
      }
      if (_v489434) {
        {
          _var489100.add(__var46838489102);
        }
      }
    }
    java.util.ArrayList<Integer> _var488723 = _var489100;
    _var7003 = _var488721;
    java.util.HashMap<Integer, Integer> _histogram489138 = new java.util.HashMap<Integer, Integer>();
    java.util.ArrayList<Record> _var489142 = new java.util.ArrayList<Record>();
    for (Record _var489143 : _var990) {
      _var489142.add(_var489143);
    }
    {
      _var489142.add(rec);
    }
    java.util.ArrayList<Record> __var55799489144 = _var489142;
    java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489145 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
    for (Record _r489147 : __var55799489144) {
      {
        Integer _var8471 = ((_r489147).getVal()).var;
        java.util.ArrayList<Record> _v489146 = _map489145.getOrDefault(_var8471,
            new java.util.ArrayList<Record>());
        java.util.ArrayList<Record> _var489148 = new java.util.ArrayList<Record>();
        for (Record _r489150 : __var55799489144) {
          if ((java.util.Objects.equals(((_r489150).getVal()).var, _var8471))) {
            {
              _var489148.add(_r489150);
            }
          }
        }
        _v489146 = _var489148;
        _map489145.put(_var8471, _v489146);

      }
    }
    for (Integer _x489139 : (_map489145).keySet()) {
      Integer _count489140 = _histogram489138.getOrDefault(_x489139, 0);
      _count489140 = (_count489140 + 1);
      _histogram489138.put(_x489139, _count489140);

    }
    for (Integer _var218600 : (_var9464).keySet()) {
      if ((_histogram489138.getOrDefault(_var218600, 0) > 0)) {
        Integer _count489141 = _histogram489138.getOrDefault(_var218600, 0);
        _count489141 = (_count489141 - 1);
        _histogram489138.put(_var218600, _count489141);

      } else {
        _var11146.remove(_var218600);
      }
    }
    java.util.ArrayList<Record> _var489246 = new java.util.ArrayList<Record>();
    for (Record _var489247 : _var990) {
      _var489246.add(_var489247);
    }
    {
      _var489246.add(rec);
    }
    java.util.ArrayList<Record> __var94194489248 = _var489246;
    java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489249 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
    for (Record _r489251 : __var94194489248) {
      {
        Integer _var8471 = ((_r489251).getVal()).var;
        java.util.ArrayList<Record> _v489250 = _map489249.getOrDefault(_var8471,
            new java.util.ArrayList<Record>());
        java.util.ArrayList<Record> _var489252 = new java.util.ArrayList<Record>();
        for (Record _r489254 : __var94194489248) {
          if ((java.util.Objects.equals(((_r489254).getVal()).var, _var8471))) {
            {
              _var489252.add(_r489254);
            }
          }
        }
        _v489250 = _var489252;
        _map489249.put(_var8471, _v489250);

      }
    }
    for (Integer __var46838489151 : (_map489249).keySet()) {
      Boolean _conditional_result489152 = false;
      Boolean _found489153 = false;
      _label489155: do {
        for (Record _r489156 : _var990) {
          {
            if ((java.util.Objects.equals(((_r489156).getVal()).var, __var46838489151))) {
              _found489153 = true;
              break _label489155;
            }
          }
        }
      } while (false);
      if (_found489153) {
        java.util.ArrayList<Record> _var489157 = new java.util.ArrayList<Record>();
        for (Record _r489159 : _var990) {
          if ((java.util.Objects.equals(((_r489159).getVal()).var, __var46838489151))) {
            {
              _var489157.add(_r489159);
            }
          }
        }
        java.util.ArrayList<Record> _var489160 = new java.util.ArrayList<Record>();
        for (Record _var489161 : _var990) {
          _var489160.add(_var489161);
        }
        {
          _var489160.add(rec);
        }
        java.util.ArrayList<Record> __var94204489162 = _var489160;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489163 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489165 : __var94204489162) {
          {
            Integer _var8471 = ((_r489165).getVal()).var;
            java.util.ArrayList<Record> _v489164 = _map489163.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489166 = new java.util.ArrayList<Record>();
            for (Record _r489168 : __var94204489162) {
              if ((java.util.Objects.equals(((_r489168).getVal()).var, _var8471))) {
                {
                  _var489166.add(_r489168);
                }
              }
            }
            _v489164 = _var489166;
            _map489163.put(_var8471, _v489164);

          }
        }
        _conditional_result489152 = ((_var489157 == _map489163.getOrDefault(__var46838489151,
            new java.util.ArrayList<Record>())));
      } else {
        java.util.ArrayList<Record> _var489169 = new java.util.ArrayList<Record>();
        for (Record _var489170 : _var990) {
          _var489169.add(_var489170);
        }
        {
          _var489169.add(rec);
        }
        java.util.ArrayList<Record> __var94204489171 = _var489169;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489172 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489174 : __var94204489171) {
          {
            Integer _var8471 = ((_r489174).getVal()).var;
            java.util.ArrayList<Record> _v489173 = _map489172.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489175 = new java.util.ArrayList<Record>();
            for (Record _r489177 : __var94204489171) {
              if ((java.util.Objects.equals(((_r489177).getVal()).var, _var8471))) {
                {
                  _var489175.add(_r489177);
                }
              }
            }
            _v489173 = _var489175;
            _map489172.put(_var8471, _v489173);

          }
        }
        _conditional_result489152 = ((new java.util.ArrayList<Record>() == _map489172
            .getOrDefault(__var46838489151, new java.util.ArrayList<Record>())));
      }
      Boolean _v489435;
      if ((!(_var9464.containsKey(__var46838489151)))) {
        _v489435 = true;
      } else {
        _v489435 = (!(_conditional_result489152));
      }
      if (_v489435) {
        {
          java.util.ArrayList<Integer> _var218601 = _var11146.getOrDefault(__var46838489151,
              new java.util.ArrayList<Integer>());
          Boolean _found489178 = false;
          _label489180: do {
            for (Record _r489181 : _var990) {
              {
                if ((java.util.Objects.equals(((_r489181).getVal()).var, __var46838489151))) {
                  _found489178 = true;
                  break _label489180;
                }
              }
            }
          } while (false);
          if (_found489178) {
            java.util.HashMap<Integer, Integer> _histogram489182 = new java.util.HashMap<Integer, Integer>();
            java.util.ArrayList<Record> _var489186 = new java.util.ArrayList<Record>();
            for (Record _var489187 : _var990) {
              _var489186.add(_var489187);
            }
            {
              _var489186.add(rec);
            }
            java.util.ArrayList<Record> __var246900489188 = _var489186;
            java.util.HashMap<Integer, java.util.ArrayList<Integer>> _map489189 = new java.util.HashMap<Integer, java.util.ArrayList<Integer>>();
            for (Record _r489191 : __var246900489188) {
              {
                Integer _var6859 = ((_r489191).getVal()).var;
                java.util.ArrayList<Integer> _v489190 = _map489189.getOrDefault(_var6859,
                    new java.util.ArrayList<Integer>());
                java.util.ArrayList<Integer> _var489192 = new java.util.ArrayList<Integer>();
                for (Record _r489195 : __var246900489188) {
                  if ((java.util.Objects.equals(((_r489195).getVal()).var, _var6859))) {
                    {
                      {
                        _var489192.add(((_r489195).getVal()).level);
                      }
                    }
                  }
                }
                _v489190 = _var489192;
                _map489189.put(_var6859, _v489190);

              }
            }
            for (Integer _x489183 : _map489189.getOrDefault(__var46838489151,
                new java.util.ArrayList<Integer>())) {
              Integer _count489184 = _histogram489182.getOrDefault(_x489183, 0);
              _count489184 = (_count489184 + 1);
              _histogram489182.put(_x489183, _count489184);

            }
            for (Record _r489197 : _var990) {
              if ((java.util.Objects.equals(((_r489197).getVal()).var, __var46838489151))) {
                {
                  {
                    Integer _var225801 = ((_r489197).getVal()).level;
                    if ((_histogram489182.getOrDefault(_var225801, 0) > 0)) {
                      Integer _count489185 = _histogram489182.getOrDefault(_var225801, 0);
                      _count489185 = (_count489185 - 1);
                      _histogram489182.put(_var225801, _count489185);

                    } else {
                      _var218601.remove(_var225801);
                    }
                  }
                }
              }
            }
          } else {
            java.util.HashMap<Integer, Integer> _histogram489198 = new java.util.HashMap<Integer, Integer>();
            java.util.ArrayList<Record> _var489202 = new java.util.ArrayList<Record>();
            for (Record _var489203 : _var990) {
              _var489202.add(_var489203);
            }
            {
              _var489202.add(rec);
            }
            java.util.ArrayList<Record> __var246900489204 = _var489202;
            java.util.HashMap<Integer, java.util.ArrayList<Integer>> _map489205 = new java.util.HashMap<Integer, java.util.ArrayList<Integer>>();
            for (Record _r489207 : __var246900489204) {
              {
                Integer _var6859 = ((_r489207).getVal()).var;
                java.util.ArrayList<Integer> _v489206 = _map489205.getOrDefault(_var6859,
                    new java.util.ArrayList<Integer>());
                java.util.ArrayList<Integer> _var489208 = new java.util.ArrayList<Integer>();
                for (Record _r489211 : __var246900489204) {
                  if ((java.util.Objects.equals(((_r489211).getVal()).var, _var6859))) {
                    {
                      {
                        _var489208.add(((_r489211).getVal()).level);
                      }
                    }
                  }
                }
                _v489206 = _var489208;
                _map489205.put(_var6859, _v489206);

              }
            }
            for (Integer _x489199 : _map489205.getOrDefault(__var46838489151,
                new java.util.ArrayList<Integer>())) {
              Integer _count489200 = _histogram489198.getOrDefault(_x489199, 0);
              _count489200 = (_count489200 + 1);
              _histogram489198.put(_x489199, _count489200);

            }
          }
          Boolean _found489212 = false;
          _label489214: do {
            for (Record _r489215 : _var990) {
              {
                if ((java.util.Objects.equals(((_r489215).getVal()).var, __var46838489151))) {
                  _found489212 = true;
                  break _label489214;
                }
              }
            }
          } while (false);
          if (_found489212) {
            java.util.HashMap<Integer, Integer> _histogram489216 = new java.util.HashMap<Integer, Integer>();
            for (Record _r489221 : _var990) {
              if ((java.util.Objects.equals(((_r489221).getVal()).var, __var46838489151))) {
                {
                  {
                    Integer _count489218 = _histogram489216
                        .getOrDefault(((_r489221).getVal()).level, 0);
                    _count489218 = (_count489218 + 1);
                    _histogram489216.put(((_r489221).getVal()).level, _count489218);

                  }
                }
              }
            }
            java.util.ArrayList<Record> _var489222 = new java.util.ArrayList<Record>();
            for (Record _var489223 : _var990) {
              _var489222.add(_var489223);
            }
            {
              _var489222.add(rec);
            }
            java.util.ArrayList<Record> __var239505489224 = _var489222;
            java.util.HashMap<Integer, java.util.ArrayList<Integer>> _map489225 = new java.util.HashMap<Integer, java.util.ArrayList<Integer>>();
            for (Record _r489227 : __var239505489224) {
              {
                Integer _var6859 = ((_r489227).getVal()).var;
                java.util.ArrayList<Integer> _v489226 = _map489225.getOrDefault(_var6859,
                    new java.util.ArrayList<Integer>());
                java.util.ArrayList<Integer> _var489228 = new java.util.ArrayList<Integer>();
                for (Record _r489231 : __var239505489224) {
                  if ((java.util.Objects.equals(((_r489231).getVal()).var, _var6859))) {
                    {
                      {
                        _var489228.add(((_r489231).getVal()).level);
                      }
                    }
                  }
                }
                _v489226 = _var489228;
                _map489225.put(_var6859, _v489226);

              }
            }
            for (Integer _var225801 : _map489225.getOrDefault(__var46838489151,
                new java.util.ArrayList<Integer>())) {
              if ((_histogram489216.getOrDefault(_var225801, 0) > 0)) {
                Integer _count489219 = _histogram489216.getOrDefault(_var225801, 0);
                _count489219 = (_count489219 - 1);
                _histogram489216.put(_var225801, _count489219);

              } else {
                _var218601.add(_var225801);
              }
            }
          } else {
            java.util.HashMap<Integer, Integer> _histogram489232 = new java.util.HashMap<Integer, Integer>();
            java.util.ArrayList<Record> _var489236 = new java.util.ArrayList<Record>();
            for (Record _var489237 : _var990) {
              _var489236.add(_var489237);
            }
            {
              _var489236.add(rec);
            }
            java.util.ArrayList<Record> __var239505489238 = _var489236;
            java.util.HashMap<Integer, java.util.ArrayList<Integer>> _map489239 = new java.util.HashMap<Integer, java.util.ArrayList<Integer>>();
            for (Record _r489241 : __var239505489238) {
              {
                Integer _var6859 = ((_r489241).getVal()).var;
                java.util.ArrayList<Integer> _v489240 = _map489239.getOrDefault(_var6859,
                    new java.util.ArrayList<Integer>());
                java.util.ArrayList<Integer> _var489242 = new java.util.ArrayList<Integer>();
                for (Record _r489245 : __var239505489238) {
                  if ((java.util.Objects.equals(((_r489245).getVal()).var, _var6859))) {
                    {
                      {
                        _var489242.add(((_r489245).getVal()).level);
                      }
                    }
                  }
                }
                _v489240 = _var489242;
                _map489239.put(_var6859, _v489240);

              }
            }
            for (Integer _var225801 : _map489239.getOrDefault(__var46838489151,
                new java.util.ArrayList<Integer>())) {
              if ((_histogram489232.getOrDefault(_var225801, 0) > 0)) {
                Integer _count489235 = _histogram489232.getOrDefault(_var225801, 0);
                _count489235 = (_count489235 - 1);
                _histogram489232.put(_var225801, _count489235);

              } else {
                _var218601.add(_var225801);
              }
            }
          }
          _var11146.put(__var46838489151, _var218601);

        }
      }
    }
    java.util.HashMap<Integer, Integer> _histogram489255 = new java.util.HashMap<Integer, Integer>();
    java.util.ArrayList<Record> _var489259 = new java.util.ArrayList<Record>();
    for (Record _var489260 : _var990) {
      _var489259.add(_var489260);
    }
    {
      _var489259.add(rec);
    }
    java.util.ArrayList<Record> __var55799489261 = _var489259;
    java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489262 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
    for (Record _r489264 : __var55799489261) {
      {
        Integer _var8471 = ((_r489264).getVal()).var;
        java.util.ArrayList<Record> _v489263 = _map489262.getOrDefault(_var8471,
            new java.util.ArrayList<Record>());
        java.util.ArrayList<Record> _var489265 = new java.util.ArrayList<Record>();
        for (Record _r489267 : __var55799489261) {
          if ((java.util.Objects.equals(((_r489267).getVal()).var, _var8471))) {
            {
              _var489265.add(_r489267);
            }
          }
        }
        _v489263 = _var489265;
        _map489262.put(_var8471, _v489263);

      }
    }
    for (Integer _x489256 : (_map489262).keySet()) {
      Integer _count489257 = _histogram489255.getOrDefault(_x489256, 0);
      _count489257 = (_count489257 + 1);
      _histogram489255.put(_x489256, _count489257);

    }
    for (Integer _var387529 : (_var9464).keySet()) {
      if ((_histogram489255.getOrDefault(_var387529, 0) > 0)) {
        Integer _count489258 = _histogram489255.getOrDefault(_var387529, 0);
        _count489258 = (_count489258 - 1);
        _histogram489255.put(_var387529, _count489258);

      } else {
        _var12369.remove(_var387529);
      }
    }
    java.util.ArrayList<Record> _var489363 = new java.util.ArrayList<Record>();
    for (Record _var489364 : _var990) {
      _var489363.add(_var489364);
    }
    {
      _var489363.add(rec);
    }
    java.util.ArrayList<Record> __var94194489365 = _var489363;
    java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489366 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
    for (Record _r489368 : __var94194489365) {
      {
        Integer _var8471 = ((_r489368).getVal()).var;
        java.util.ArrayList<Record> _v489367 = _map489366.getOrDefault(_var8471,
            new java.util.ArrayList<Record>());
        java.util.ArrayList<Record> _var489369 = new java.util.ArrayList<Record>();
        for (Record _r489371 : __var94194489365) {
          if ((java.util.Objects.equals(((_r489371).getVal()).var, _var8471))) {
            {
              _var489369.add(_r489371);
            }
          }
        }
        _v489367 = _var489369;
        _map489366.put(_var8471, _v489367);

      }
    }
    for (Integer __var46838489268 : (_map489366).keySet()) {
      Boolean _conditional_result489269 = false;
      Boolean _found489270 = false;
      _label489272: do {
        for (Record _r489273 : _var990) {
          {
            if ((java.util.Objects.equals(((_r489273).getVal()).var, __var46838489268))) {
              _found489270 = true;
              break _label489272;
            }
          }
        }
      } while (false);
      if (_found489270) {
        java.util.ArrayList<Record> _var489274 = new java.util.ArrayList<Record>();
        for (Record _r489276 : _var990) {
          if ((java.util.Objects.equals(((_r489276).getVal()).var, __var46838489268))) {
            {
              _var489274.add(_r489276);
            }
          }
        }
        java.util.ArrayList<Record> _var489277 = new java.util.ArrayList<Record>();
        for (Record _var489278 : _var990) {
          _var489277.add(_var489278);
        }
        {
          _var489277.add(rec);
        }
        java.util.ArrayList<Record> __var94204489279 = _var489277;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489280 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489282 : __var94204489279) {
          {
            Integer _var8471 = ((_r489282).getVal()).var;
            java.util.ArrayList<Record> _v489281 = _map489280.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489283 = new java.util.ArrayList<Record>();
            for (Record _r489285 : __var94204489279) {
              if ((java.util.Objects.equals(((_r489285).getVal()).var, _var8471))) {
                {
                  _var489283.add(_r489285);
                }
              }
            }
            _v489281 = _var489283;
            _map489280.put(_var8471, _v489281);

          }
        }
        _conditional_result489269 = ((_var489274 == _map489280.getOrDefault(__var46838489268,
            new java.util.ArrayList<Record>())));
      } else {
        java.util.ArrayList<Record> _var489286 = new java.util.ArrayList<Record>();
        for (Record _var489287 : _var990) {
          _var489286.add(_var489287);
        }
        {
          _var489286.add(rec);
        }
        java.util.ArrayList<Record> __var94204489288 = _var489286;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489289 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489291 : __var94204489288) {
          {
            Integer _var8471 = ((_r489291).getVal()).var;
            java.util.ArrayList<Record> _v489290 = _map489289.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489292 = new java.util.ArrayList<Record>();
            for (Record _r489294 : __var94204489288) {
              if ((java.util.Objects.equals(((_r489294).getVal()).var, _var8471))) {
                {
                  _var489292.add(_r489294);
                }
              }
            }
            _v489290 = _var489292;
            _map489289.put(_var8471, _v489290);

          }
        }
        _conditional_result489269 = ((new java.util.ArrayList<Record>() == _map489289
            .getOrDefault(__var46838489268, new java.util.ArrayList<Record>())));
      }
      Boolean _v489436;
      if ((!(_var9464.containsKey(__var46838489268)))) {
        _v489436 = true;
      } else {
        _v489436 = (!(_conditional_result489269));
      }
      if (_v489436) {
        {
          java.util.ArrayList<org.sat4j.specs.IConstr> _var387530 = _var12369
              .getOrDefault(__var46838489268, new java.util.ArrayList<org.sat4j.specs.IConstr>());
          Boolean _found489295 = false;
          _label489297: do {
            for (Record _r489298 : _var990) {
              {
                if ((java.util.Objects.equals(((_r489298).getVal()).var, __var46838489268))) {
                  _found489295 = true;
                  break _label489297;
                }
              }
            }
          } while (false);
          if (_found489295) {
            java.util.HashMap<org.sat4j.specs.IConstr, Integer> _histogram489299 = new java.util.HashMap<org.sat4j.specs.IConstr, Integer>();
            java.util.ArrayList<Record> _var489303 = new java.util.ArrayList<Record>();
            for (Record _var489304 : _var990) {
              _var489303.add(_var489304);
            }
            {
              _var489303.add(rec);
            }
            java.util.ArrayList<Record> __var419986489305 = _var489303;
            java.util.HashMap<Integer, java.util.ArrayList<org.sat4j.specs.IConstr>> _map489306 = new java.util.HashMap<Integer, java.util.ArrayList<org.sat4j.specs.IConstr>>();
            for (Record _r489308 : __var419986489305) {
              {
                Integer _var7614 = ((_r489308).getVal()).var;
                java.util.ArrayList<org.sat4j.specs.IConstr> _v489307 = _map489306
                    .getOrDefault(_var7614, new java.util.ArrayList<org.sat4j.specs.IConstr>());
                java.util.ArrayList<org.sat4j.specs.IConstr> _var489309 = new java.util.ArrayList<org.sat4j.specs.IConstr>();
                for (Record _r489312 : __var419986489305) {
                  if ((java.util.Objects.equals(((_r489312).getVal()).var, _var7614))) {
                    {
                      {
                        _var489309.add(((_r489312).getVal()).reason);
                      }
                    }
                  }
                }
                _v489307 = _var489309;
                _map489306.put(_var7614, _v489307);

              }
            }
            for (org.sat4j.specs.IConstr _x489300 : _map489306.getOrDefault(__var46838489268,
                new java.util.ArrayList<org.sat4j.specs.IConstr>())) {
              Integer _count489301 = _histogram489299.getOrDefault(_x489300, 0);
              _count489301 = (_count489301 + 1);
              _histogram489299.put(_x489300, _count489301);

            }
            for (Record _r489314 : _var990) {
              if ((java.util.Objects.equals(((_r489314).getVal()).var, __var46838489268))) {
                {
                  {
                    org.sat4j.specs.IConstr _var396257 = ((_r489314).getVal()).reason;
                    if ((_histogram489299.getOrDefault(_var396257, 0) > 0)) {
                      Integer _count489302 = _histogram489299.getOrDefault(_var396257, 0);
                      _count489302 = (_count489302 - 1);
                      _histogram489299.put(_var396257, _count489302);

                    } else {
                      _var387530.remove(_var396257);
                    }
                  }
                }
              }
            }
          } else {
            java.util.HashMap<org.sat4j.specs.IConstr, Integer> _histogram489315 = new java.util.HashMap<org.sat4j.specs.IConstr, Integer>();
            java.util.ArrayList<Record> _var489319 = new java.util.ArrayList<Record>();
            for (Record _var489320 : _var990) {
              _var489319.add(_var489320);
            }
            {
              _var489319.add(rec);
            }
            java.util.ArrayList<Record> __var419986489321 = _var489319;
            java.util.HashMap<Integer, java.util.ArrayList<org.sat4j.specs.IConstr>> _map489322 = new java.util.HashMap<Integer, java.util.ArrayList<org.sat4j.specs.IConstr>>();
            for (Record _r489324 : __var419986489321) {
              {
                Integer _var7614 = ((_r489324).getVal()).var;
                java.util.ArrayList<org.sat4j.specs.IConstr> _v489323 = _map489322
                    .getOrDefault(_var7614, new java.util.ArrayList<org.sat4j.specs.IConstr>());
                java.util.ArrayList<org.sat4j.specs.IConstr> _var489325 = new java.util.ArrayList<org.sat4j.specs.IConstr>();
                for (Record _r489328 : __var419986489321) {
                  if ((java.util.Objects.equals(((_r489328).getVal()).var, _var7614))) {
                    {
                      {
                        _var489325.add(((_r489328).getVal()).reason);
                      }
                    }
                  }
                }
                _v489323 = _var489325;
                _map489322.put(_var7614, _v489323);

              }
            }
            for (org.sat4j.specs.IConstr _x489316 : _map489322.getOrDefault(__var46838489268,
                new java.util.ArrayList<org.sat4j.specs.IConstr>())) {
              Integer _count489317 = _histogram489315.getOrDefault(_x489316, 0);
              _count489317 = (_count489317 + 1);
              _histogram489315.put(_x489316, _count489317);

            }
          }
          Boolean _found489329 = false;
          _label489331: do {
            for (Record _r489332 : _var990) {
              {
                if ((java.util.Objects.equals(((_r489332).getVal()).var, __var46838489268))) {
                  _found489329 = true;
                  break _label489331;
                }
              }
            }
          } while (false);
          if (_found489329) {
            java.util.HashMap<org.sat4j.specs.IConstr, Integer> _histogram489333 = new java.util.HashMap<org.sat4j.specs.IConstr, Integer>();
            for (Record _r489338 : _var990) {
              if ((java.util.Objects.equals(((_r489338).getVal()).var, __var46838489268))) {
                {
                  {
                    Integer _count489335 = _histogram489333
                        .getOrDefault(((_r489338).getVal()).reason, 0);
                    _count489335 = (_count489335 + 1);
                    _histogram489333.put(((_r489338).getVal()).reason, _count489335);

                  }
                }
              }
            }
            java.util.ArrayList<Record> _var489339 = new java.util.ArrayList<Record>();
            for (Record _var489340 : _var990) {
              _var489339.add(_var489340);
            }
            {
              _var489339.add(rec);
            }
            java.util.ArrayList<Record> __var410821489341 = _var489339;
            java.util.HashMap<Integer, java.util.ArrayList<org.sat4j.specs.IConstr>> _map489342 = new java.util.HashMap<Integer, java.util.ArrayList<org.sat4j.specs.IConstr>>();
            for (Record _r489344 : __var410821489341) {
              {
                Integer _var7614 = ((_r489344).getVal()).var;
                java.util.ArrayList<org.sat4j.specs.IConstr> _v489343 = _map489342
                    .getOrDefault(_var7614, new java.util.ArrayList<org.sat4j.specs.IConstr>());
                java.util.ArrayList<org.sat4j.specs.IConstr> _var489345 = new java.util.ArrayList<org.sat4j.specs.IConstr>();
                for (Record _r489348 : __var410821489341) {
                  if ((java.util.Objects.equals(((_r489348).getVal()).var, _var7614))) {
                    {
                      {
                        _var489345.add(((_r489348).getVal()).reason);
                      }
                    }
                  }
                }
                _v489343 = _var489345;
                _map489342.put(_var7614, _v489343);

              }
            }
            for (org.sat4j.specs.IConstr _var396257 : _map489342.getOrDefault(__var46838489268,
                new java.util.ArrayList<org.sat4j.specs.IConstr>())) {
              if ((_histogram489333.getOrDefault(_var396257, 0) > 0)) {
                Integer _count489336 = _histogram489333.getOrDefault(_var396257, 0);
                _count489336 = (_count489336 - 1);
                _histogram489333.put(_var396257, _count489336);

              } else {
                _var387530.add(_var396257);
              }
            }
          } else {
            java.util.HashMap<org.sat4j.specs.IConstr, Integer> _histogram489349 = new java.util.HashMap<org.sat4j.specs.IConstr, Integer>();
            java.util.ArrayList<Record> _var489353 = new java.util.ArrayList<Record>();
            for (Record _var489354 : _var990) {
              _var489353.add(_var489354);
            }
            {
              _var489353.add(rec);
            }
            java.util.ArrayList<Record> __var410821489355 = _var489353;
            java.util.HashMap<Integer, java.util.ArrayList<org.sat4j.specs.IConstr>> _map489356 = new java.util.HashMap<Integer, java.util.ArrayList<org.sat4j.specs.IConstr>>();
            for (Record _r489358 : __var410821489355) {
              {
                Integer _var7614 = ((_r489358).getVal()).var;
                java.util.ArrayList<org.sat4j.specs.IConstr> _v489357 = _map489356
                    .getOrDefault(_var7614, new java.util.ArrayList<org.sat4j.specs.IConstr>());
                java.util.ArrayList<org.sat4j.specs.IConstr> _var489359 = new java.util.ArrayList<org.sat4j.specs.IConstr>();
                for (Record _r489362 : __var410821489355) {
                  if ((java.util.Objects.equals(((_r489362).getVal()).var, _var7614))) {
                    {
                      {
                        _var489359.add(((_r489362).getVal()).reason);
                      }
                    }
                  }
                }
                _v489357 = _var489359;
                _map489356.put(_var7614, _v489357);

              }
            }
            for (org.sat4j.specs.IConstr _var396257 : _map489356.getOrDefault(__var46838489268,
                new java.util.ArrayList<org.sat4j.specs.IConstr>())) {
              if ((_histogram489349.getOrDefault(_var396257, 0) > 0)) {
                Integer _count489352 = _histogram489349.getOrDefault(_var396257, 0);
                _count489352 = (_count489352 - 1);
                _histogram489349.put(_var396257, _count489352);

              } else {
                _var387530.add(_var396257);
              }
            }
          }
          _var12369.put(__var46838489268, _var387530);

        }
      }
    }
    for (Integer _var46838 : _var488722) {
      _var9464.remove(_var46838);
    }
    for (Integer _var46838 : _var488723) {
      java.util.ArrayList<Record> _var46839 = _var9464.getOrDefault(_var46838,
          new java.util.ArrayList<Record>());
      Boolean _found489372 = false;
      _label489374: do {
        for (Record _r489375 : _var990) {
          {
            if ((java.util.Objects.equals(((_r489375).getVal()).var, _var46838))) {
              _found489372 = true;
              break _label489374;
            }
          }
        }
      } while (false);
      if (_found489372) {
        java.util.HashMap<Record, Integer> _histogram489376 = new java.util.HashMap<Record, Integer>();
        java.util.ArrayList<Record> _var489380 = new java.util.ArrayList<Record>();
        for (Record _var489381 : _var990) {
          _var489380.add(_var489381);
        }
        {
          _var489380.add(rec);
        }
        java.util.ArrayList<Record> __var73775489382 = _var489380;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489383 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489385 : __var73775489382) {
          {
            Integer _var8471 = ((_r489385).getVal()).var;
            java.util.ArrayList<Record> _v489384 = _map489383.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489386 = new java.util.ArrayList<Record>();
            for (Record _r489388 : __var73775489382) {
              if ((java.util.Objects.equals(((_r489388).getVal()).var, _var8471))) {
                {
                  _var489386.add(_r489388);
                }
              }
            }
            _v489384 = _var489386;
            _map489383.put(_var8471, _v489384);

          }
        }
        for (Record _x489377 : _map489383.getOrDefault(_var46838,
            new java.util.ArrayList<Record>())) {
          Integer _count489378 = _histogram489376.getOrDefault(_x489377, 0);
          _count489378 = (_count489378 + 1);
          _histogram489376.put(_x489377, _count489378);

        }
        for (Record _r489389 : _var990) {
          if ((java.util.Objects.equals(((_r489389).getVal()).var, _var46838))) {
            {
              if ((_histogram489376.getOrDefault(_r489389, 0) > 0)) {
                Integer _count489379 = _histogram489376.getOrDefault(_r489389, 0);
                _count489379 = (_count489379 - 1);
                _histogram489376.put(_r489389, _count489379);

              } else {
                _var46839.remove(_r489389);
              }
            }
          }
        }
      } else {
        java.util.HashMap<Record, Integer> _histogram489390 = new java.util.HashMap<Record, Integer>();
        java.util.ArrayList<Record> _var489394 = new java.util.ArrayList<Record>();
        for (Record _var489395 : _var990) {
          _var489394.add(_var489395);
        }
        {
          _var489394.add(rec);
        }
        java.util.ArrayList<Record> __var73775489396 = _var489394;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489397 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489399 : __var73775489396) {
          {
            Integer _var8471 = ((_r489399).getVal()).var;
            java.util.ArrayList<Record> _v489398 = _map489397.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489400 = new java.util.ArrayList<Record>();
            for (Record _r489402 : __var73775489396) {
              if ((java.util.Objects.equals(((_r489402).getVal()).var, _var8471))) {
                {
                  _var489400.add(_r489402);
                }
              }
            }
            _v489398 = _var489400;
            _map489397.put(_var8471, _v489398);

          }
        }
        for (Record _x489391 : _map489397.getOrDefault(_var46838,
            new java.util.ArrayList<Record>())) {
          Integer _count489392 = _histogram489390.getOrDefault(_x489391, 0);
          _count489392 = (_count489392 + 1);
          _histogram489390.put(_x489391, _count489392);

        }
      }
      Boolean _found489403 = false;
      _label489405: do {
        for (Record _r489406 : _var990) {
          {
            if ((java.util.Objects.equals(((_r489406).getVal()).var, _var46838))) {
              _found489403 = true;
              break _label489405;
            }
          }
        }
      } while (false);
      if (_found489403) {
        java.util.HashMap<Record, Integer> _histogram489407 = new java.util.HashMap<Record, Integer>();
        for (Record _r489411 : _var990) {
          if ((java.util.Objects.equals(((_r489411).getVal()).var, _var46838))) {
            {
              Integer _count489409 = _histogram489407.getOrDefault(_r489411, 0);
              _count489409 = (_count489409 + 1);
              _histogram489407.put(_r489411, _count489409);

            }
          }
        }
        java.util.ArrayList<Record> _var489412 = new java.util.ArrayList<Record>();
        for (Record _var489413 : _var990) {
          _var489412.add(_var489413);
        }
        {
          _var489412.add(rec);
        }
        java.util.ArrayList<Record> __var65059489414 = _var489412;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489415 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489417 : __var65059489414) {
          {
            Integer _var8471 = ((_r489417).getVal()).var;
            java.util.ArrayList<Record> _v489416 = _map489415.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489418 = new java.util.ArrayList<Record>();
            for (Record _r489420 : __var65059489414) {
              if ((java.util.Objects.equals(((_r489420).getVal()).var, _var8471))) {
                {
                  _var489418.add(_r489420);
                }
              }
            }
            _v489416 = _var489418;
            _map489415.put(_var8471, _v489416);

          }
        }
        for (Record _var54777 : _map489415.getOrDefault(_var46838,
            new java.util.ArrayList<Record>())) {
          if ((_histogram489407.getOrDefault(_var54777, 0) > 0)) {
            Integer _count489410 = _histogram489407.getOrDefault(_var54777, 0);
            _count489410 = (_count489410 - 1);
            _histogram489407.put(_var54777, _count489410);

          } else {
            _var46839.add(_var54777);
          }
        }
      } else {
        java.util.HashMap<Record, Integer> _histogram489421 = new java.util.HashMap<Record, Integer>();
        java.util.ArrayList<Record> _var489425 = new java.util.ArrayList<Record>();
        for (Record _var489426 : _var990) {
          _var489425.add(_var489426);
        }
        {
          _var489425.add(rec);
        }
        java.util.ArrayList<Record> __var65059489427 = _var489425;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489428 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489430 : __var65059489427) {
          {
            Integer _var8471 = ((_r489430).getVal()).var;
            java.util.ArrayList<Record> _v489429 = _map489428.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489431 = new java.util.ArrayList<Record>();
            for (Record _r489433 : __var65059489427) {
              if ((java.util.Objects.equals(((_r489433).getVal()).var, _var8471))) {
                {
                  _var489431.add(_r489433);
                }
              }
            }
            _v489429 = _var489431;
            _map489428.put(_var8471, _v489429);

          }
        }
        for (Record _var54777 : _map489428.getOrDefault(_var46838,
            new java.util.ArrayList<Record>())) {
          if ((_histogram489421.getOrDefault(_var54777, 0) > 0)) {
            Integer _count489424 = _histogram489421.getOrDefault(_var54777, 0);
            _count489424 = (_count489424 - 1);
            _histogram489421.put(_var54777, _count489424);

          } else {
            _var46839.add(_var54777);
          }
        }
      }
      _var9464.put(_var46838, _var46839);

    }
    {
      _var990.add(rec);
    }
  }

  public void remove(Record rec) {
    java.util.ArrayList<Integer> _var489437 = new java.util.ArrayList<Integer>();
    java.util.HashMap<Integer, Integer> _histogram489439 = new java.util.HashMap<Integer, Integer>();
    java.util.ArrayList<Record> _var489443 = new java.util.ArrayList<Record>();
    java.util.HashMap<Record, Integer> _histogram489445 = new java.util.HashMap<Record, Integer>();
    {
      Integer _count489447 = _histogram489445.getOrDefault(rec, 0);
      _count489447 = (_count489447 + 1);
      _histogram489445.put(rec, _count489447);

    }
    for (Record _var489444 : _var990) {
      if ((_histogram489445.getOrDefault(_var489444, 0) > 0)) {
        Integer _count489448 = _histogram489445.getOrDefault(_var489444, 0);
        _count489448 = (_count489448 - 1);
        _histogram489445.put(_var489444, _count489448);

      } else {
        _var489443.add(_var489444);
      }
    }
    java.util.ArrayList<Record> __var112738489449 = _var489443;
    java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489450 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
    for (Record _r489452 : __var112738489449) {
      {
        Integer _var8471 = ((_r489452).getVal()).var;
        java.util.ArrayList<Record> _v489451 = _map489450.getOrDefault(_var8471,
            new java.util.ArrayList<Record>());
        java.util.ArrayList<Record> _var489453 = new java.util.ArrayList<Record>();
        for (Record _r489455 : __var112738489449) {
          if ((java.util.Objects.equals(((_r489455).getVal()).var, _var8471))) {
            {
              _var489453.add(_r489455);
            }
          }
        }
        _v489451 = _var489453;
        _map489450.put(_var8471, _v489451);

      }
    }
    for (Integer _x489440 : (_map489450).keySet()) {
      Integer _count489441 = _histogram489439.getOrDefault(_x489440, 0);
      _count489441 = (_count489441 + 1);
      _histogram489439.put(_x489440, _count489441);

    }
    for (Integer _var489438 : (_var9464).keySet()) {
      if ((_histogram489439.getOrDefault(_var489438, 0) > 0)) {
        Integer _count489442 = _histogram489439.getOrDefault(_var489438, 0);
        _count489442 = (_count489442 - 1);
        _histogram489439.put(_var489438, _count489442);

      } else {
        _var489437.add(_var489438);
      }
    }
    java.util.ArrayList<Integer> _var488724 = _var489437;
    java.util.ArrayList<Integer> _var489456 = new java.util.ArrayList<Integer>();
    java.util.ArrayList<Record> _var489493 = new java.util.ArrayList<Record>();
    java.util.HashMap<Record, Integer> _histogram489495 = new java.util.HashMap<Record, Integer>();
    {
      Integer _count489497 = _histogram489495.getOrDefault(rec, 0);
      _count489497 = (_count489497 + 1);
      _histogram489495.put(rec, _count489497);

    }
    for (Record _var489494 : _var990) {
      if ((_histogram489495.getOrDefault(_var489494, 0) > 0)) {
        Integer _count489498 = _histogram489495.getOrDefault(_var489494, 0);
        _count489498 = (_count489498 - 1);
        _histogram489495.put(_var489494, _count489498);

      } else {
        _var489493.add(_var489494);
      }
    }
    java.util.ArrayList<Record> __var115138489499 = _var489493;
    java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489500 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
    for (Record _r489502 : __var115138489499) {
      {
        Integer _var8471 = ((_r489502).getVal()).var;
        java.util.ArrayList<Record> _v489501 = _map489500.getOrDefault(_var8471,
            new java.util.ArrayList<Record>());
        java.util.ArrayList<Record> _var489503 = new java.util.ArrayList<Record>();
        for (Record _r489505 : __var115138489499) {
          if ((java.util.Objects.equals(((_r489505).getVal()).var, _var8471))) {
            {
              _var489503.add(_r489505);
            }
          }
        }
        _v489501 = _var489503;
        _map489500.put(_var8471, _v489501);

      }
    }
    for (Integer __var104467489458 : (_map489500).keySet()) {
      Boolean _conditional_result489459 = false;
      Boolean _found489460 = false;
      _label489462: do {
        for (Record _r489463 : _var990) {
          {
            if ((java.util.Objects.equals(((_r489463).getVal()).var, __var104467489458))) {
              _found489460 = true;
              break _label489462;
            }
          }
        }
      } while (false);
      if (_found489460) {
        java.util.ArrayList<Record> _var489464 = new java.util.ArrayList<Record>();
        for (Record _r489466 : _var990) {
          if ((java.util.Objects.equals(((_r489466).getVal()).var, __var104467489458))) {
            {
              _var489464.add(_r489466);
            }
          }
        }
        java.util.ArrayList<Record> _var489467 = new java.util.ArrayList<Record>();
        java.util.HashMap<Record, Integer> _histogram489469 = new java.util.HashMap<Record, Integer>();
        {
          Integer _count489471 = _histogram489469.getOrDefault(rec, 0);
          _count489471 = (_count489471 + 1);
          _histogram489469.put(rec, _count489471);

        }
        for (Record _var489468 : _var990) {
          if ((_histogram489469.getOrDefault(_var489468, 0) > 0)) {
            Integer _count489472 = _histogram489469.getOrDefault(_var489468, 0);
            _count489472 = (_count489472 - 1);
            _histogram489469.put(_var489468, _count489472);

          } else {
            _var489467.add(_var489468);
          }
        }
        java.util.ArrayList<Record> __var115140489473 = _var489467;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489474 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489476 : __var115140489473) {
          {
            Integer _var8471 = ((_r489476).getVal()).var;
            java.util.ArrayList<Record> _v489475 = _map489474.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489477 = new java.util.ArrayList<Record>();
            for (Record _r489479 : __var115140489473) {
              if ((java.util.Objects.equals(((_r489479).getVal()).var, _var8471))) {
                {
                  _var489477.add(_r489479);
                }
              }
            }
            _v489475 = _var489477;
            _map489474.put(_var8471, _v489475);

          }
        }
        _conditional_result489459 = ((_var489464 == _map489474.getOrDefault(__var104467489458,
            new java.util.ArrayList<Record>())));
      } else {
        java.util.ArrayList<Record> _var489480 = new java.util.ArrayList<Record>();
        java.util.HashMap<Record, Integer> _histogram489482 = new java.util.HashMap<Record, Integer>();
        {
          Integer _count489484 = _histogram489482.getOrDefault(rec, 0);
          _count489484 = (_count489484 + 1);
          _histogram489482.put(rec, _count489484);

        }
        for (Record _var489481 : _var990) {
          if ((_histogram489482.getOrDefault(_var489481, 0) > 0)) {
            Integer _count489485 = _histogram489482.getOrDefault(_var489481, 0);
            _count489485 = (_count489485 - 1);
            _histogram489482.put(_var489481, _count489485);

          } else {
            _var489480.add(_var489481);
          }
        }
        java.util.ArrayList<Record> __var115140489486 = _var489480;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489487 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489489 : __var115140489486) {
          {
            Integer _var8471 = ((_r489489).getVal()).var;
            java.util.ArrayList<Record> _v489488 = _map489487.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489490 = new java.util.ArrayList<Record>();
            for (Record _r489492 : __var115140489486) {
              if ((java.util.Objects.equals(((_r489492).getVal()).var, _var8471))) {
                {
                  _var489490.add(_r489492);
                }
              }
            }
            _v489488 = _var489490;
            _map489487.put(_var8471, _v489488);

          }
        }
        _conditional_result489459 = ((new java.util.ArrayList<Record>() == _map489487
            .getOrDefault(__var104467489458, new java.util.ArrayList<Record>())));
      }
      Boolean _v489643;
      if ((!(_var9464.containsKey(__var104467489458)))) {
        _v489643 = true;
      } else {
        _v489643 = (!(_conditional_result489459));
      }
      if (_v489643) {
        {
          _var489456.add(__var104467489458);
        }
      }
    }
    java.util.ArrayList<Integer> _var488725 = _var489456;
    Integer _sum489506 = 0;
    java.util.HashMap<Record, Integer> _histogram489509 = new java.util.HashMap<Record, Integer>();
    {
      Integer _count489511 = _histogram489509.getOrDefault(rec, 0);
      _count489511 = (_count489511 + 1);
      _histogram489509.put(rec, _count489511);

    }
    for (Record __489508 : _var990) {
      if ((_histogram489509.getOrDefault(__489508, 0) > 0)) {
        Integer _count489512 = _histogram489509.getOrDefault(__489508, 0);
        _count489512 = (_count489512 - 1);
        _histogram489509.put(__489508, _count489512);

      } else {
        {
          _sum489506 = (_sum489506 + 1);
        }
      }
    }
    _var7003 = _sum489506;
    java.util.HashMap<Integer, Integer> _histogram489513 = new java.util.HashMap<Integer, Integer>();
    java.util.ArrayList<Record> _var489517 = new java.util.ArrayList<Record>();
    java.util.HashMap<Record, Integer> _histogram489519 = new java.util.HashMap<Record, Integer>();
    {
      Integer _count489521 = _histogram489519.getOrDefault(rec, 0);
      _count489521 = (_count489521 + 1);
      _histogram489519.put(rec, _count489521);

    }
    for (Record _var489518 : _var990) {
      if ((_histogram489519.getOrDefault(_var489518, 0) > 0)) {
        Integer _count489522 = _histogram489519.getOrDefault(_var489518, 0);
        _count489522 = (_count489522 - 1);
        _histogram489519.put(_var489518, _count489522);

      } else {
        _var489517.add(_var489518);
      }
    }
    java.util.ArrayList<Record> __var112738489523 = _var489517;
    java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489524 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
    for (Record _r489526 : __var112738489523) {
      {
        Integer _var8471 = ((_r489526).getVal()).var;
        java.util.ArrayList<Record> _v489525 = _map489524.getOrDefault(_var8471,
            new java.util.ArrayList<Record>());
        java.util.ArrayList<Record> _var489527 = new java.util.ArrayList<Record>();
        for (Record _r489529 : __var112738489523) {
          if ((java.util.Objects.equals(((_r489529).getVal()).var, _var8471))) {
            {
              _var489527.add(_r489529);
            }
          }
        }
        _v489525 = _var489527;
        _map489524.put(_var8471, _v489525);

      }
    }
    for (Integer _x489514 : (_map489524).keySet()) {
      Integer _count489515 = _histogram489513.getOrDefault(_x489514, 0);
      _count489515 = (_count489515 + 1);
      _histogram489513.put(_x489514, _count489515);

    }
    for (Integer _var285086 : (_var9464).keySet()) {
      if ((_histogram489513.getOrDefault(_var285086, 0) > 0)) {
        Integer _count489516 = _histogram489513.getOrDefault(_var285086, 0);
        _count489516 = (_count489516 - 1);
        _histogram489513.put(_var285086, _count489516);

      } else {
        _var11146.remove(_var285086);
      }
    }
    java.util.ArrayList<Record> _var489565 = new java.util.ArrayList<Record>();
    java.util.HashMap<Record, Integer> _histogram489567 = new java.util.HashMap<Record, Integer>();
    {
      Integer _count489569 = _histogram489567.getOrDefault(rec, 0);
      _count489569 = (_count489569 + 1);
      _histogram489567.put(rec, _count489569);

    }
    for (Record _var489566 : _var990) {
      if ((_histogram489567.getOrDefault(_var489566, 0) > 0)) {
        Integer _count489570 = _histogram489567.getOrDefault(_var489566, 0);
        _count489570 = (_count489570 - 1);
        _histogram489567.put(_var489566, _count489570);

      } else {
        _var489565.add(_var489566);
      }
    }
    java.util.ArrayList<Record> __var115138489571 = _var489565;
    java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489572 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
    for (Record _r489574 : __var115138489571) {
      {
        Integer _var8471 = ((_r489574).getVal()).var;
        java.util.ArrayList<Record> _v489573 = _map489572.getOrDefault(_var8471,
            new java.util.ArrayList<Record>());
        java.util.ArrayList<Record> _var489575 = new java.util.ArrayList<Record>();
        for (Record _r489577 : __var115138489571) {
          if ((java.util.Objects.equals(((_r489577).getVal()).var, _var8471))) {
            {
              _var489575.add(_r489577);
            }
          }
        }
        _v489573 = _var489575;
        _map489572.put(_var8471, _v489573);

      }
    }
    for (Integer __var104467489530 : (_map489572).keySet()) {
      Boolean _conditional_result489531 = false;
      Boolean _found489532 = false;
      _label489534: do {
        for (Record _r489535 : _var990) {
          {
            if ((java.util.Objects.equals(((_r489535).getVal()).var, __var104467489530))) {
              _found489532 = true;
              break _label489534;
            }
          }
        }
      } while (false);
      if (_found489532) {
        java.util.ArrayList<Record> _var489536 = new java.util.ArrayList<Record>();
        for (Record _r489538 : _var990) {
          if ((java.util.Objects.equals(((_r489538).getVal()).var, __var104467489530))) {
            {
              _var489536.add(_r489538);
            }
          }
        }
        java.util.ArrayList<Record> _var489539 = new java.util.ArrayList<Record>();
        java.util.HashMap<Record, Integer> _histogram489541 = new java.util.HashMap<Record, Integer>();
        {
          Integer _count489543 = _histogram489541.getOrDefault(rec, 0);
          _count489543 = (_count489543 + 1);
          _histogram489541.put(rec, _count489543);

        }
        for (Record _var489540 : _var990) {
          if ((_histogram489541.getOrDefault(_var489540, 0) > 0)) {
            Integer _count489544 = _histogram489541.getOrDefault(_var489540, 0);
            _count489544 = (_count489544 - 1);
            _histogram489541.put(_var489540, _count489544);

          } else {
            _var489539.add(_var489540);
          }
        }
        java.util.ArrayList<Record> __var115140489545 = _var489539;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489546 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489548 : __var115140489545) {
          {
            Integer _var8471 = ((_r489548).getVal()).var;
            java.util.ArrayList<Record> _v489547 = _map489546.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489549 = new java.util.ArrayList<Record>();
            for (Record _r489551 : __var115140489545) {
              if ((java.util.Objects.equals(((_r489551).getVal()).var, _var8471))) {
                {
                  _var489549.add(_r489551);
                }
              }
            }
            _v489547 = _var489549;
            _map489546.put(_var8471, _v489547);

          }
        }
        _conditional_result489531 = ((_var489536 == _map489546.getOrDefault(__var104467489530,
            new java.util.ArrayList<Record>())));
      } else {
        java.util.ArrayList<Record> _var489552 = new java.util.ArrayList<Record>();
        java.util.HashMap<Record, Integer> _histogram489554 = new java.util.HashMap<Record, Integer>();
        {
          Integer _count489556 = _histogram489554.getOrDefault(rec, 0);
          _count489556 = (_count489556 + 1);
          _histogram489554.put(rec, _count489556);

        }
        for (Record _var489553 : _var990) {
          if ((_histogram489554.getOrDefault(_var489553, 0) > 0)) {
            Integer _count489557 = _histogram489554.getOrDefault(_var489553, 0);
            _count489557 = (_count489557 - 1);
            _histogram489554.put(_var489553, _count489557);

          } else {
            _var489552.add(_var489553);
          }
        }
        java.util.ArrayList<Record> __var115140489558 = _var489552;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489559 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489561 : __var115140489558) {
          {
            Integer _var8471 = ((_r489561).getVal()).var;
            java.util.ArrayList<Record> _v489560 = _map489559.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489562 = new java.util.ArrayList<Record>();
            for (Record _r489564 : __var115140489558) {
              if ((java.util.Objects.equals(((_r489564).getVal()).var, _var8471))) {
                {
                  _var489562.add(_r489564);
                }
              }
            }
            _v489560 = _var489562;
            _map489559.put(_var8471, _v489560);

          }
        }
        _conditional_result489531 = ((new java.util.ArrayList<Record>() == _map489559
            .getOrDefault(__var104467489530, new java.util.ArrayList<Record>())));
      }
      Boolean _v489644;
      if ((!(_var9464.containsKey(__var104467489530)))) {
        _v489644 = true;
      } else {
        _v489644 = (!(_conditional_result489531));
      }
      if (_v489644) {
        {
        }
      }
    }
    java.util.HashMap<Integer, Integer> _histogram489578 = new java.util.HashMap<Integer, Integer>();
    java.util.ArrayList<Record> _var489582 = new java.util.ArrayList<Record>();
    java.util.HashMap<Record, Integer> _histogram489584 = new java.util.HashMap<Record, Integer>();
    {
      Integer _count489586 = _histogram489584.getOrDefault(rec, 0);
      _count489586 = (_count489586 + 1);
      _histogram489584.put(rec, _count489586);

    }
    for (Record _var489583 : _var990) {
      if ((_histogram489584.getOrDefault(_var489583, 0) > 0)) {
        Integer _count489587 = _histogram489584.getOrDefault(_var489583, 0);
        _count489587 = (_count489587 - 1);
        _histogram489584.put(_var489583, _count489587);

      } else {
        _var489582.add(_var489583);
      }
    }
    java.util.ArrayList<Record> __var112738489588 = _var489582;
    java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489589 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
    for (Record _r489591 : __var112738489588) {
      {
        Integer _var8471 = ((_r489591).getVal()).var;
        java.util.ArrayList<Record> _v489590 = _map489589.getOrDefault(_var8471,
            new java.util.ArrayList<Record>());
        java.util.ArrayList<Record> _var489592 = new java.util.ArrayList<Record>();
        for (Record _r489594 : __var112738489588) {
          if ((java.util.Objects.equals(((_r489594).getVal()).var, _var8471))) {
            {
              _var489592.add(_r489594);
            }
          }
        }
        _v489590 = _var489592;
        _map489589.put(_var8471, _v489590);

      }
    }
    for (Integer _x489579 : (_map489589).keySet()) {
      Integer _count489580 = _histogram489578.getOrDefault(_x489579, 0);
      _count489580 = (_count489580 + 1);
      _histogram489578.put(_x489579, _count489580);

    }
    for (Integer _var458880 : (_var9464).keySet()) {
      if ((_histogram489578.getOrDefault(_var458880, 0) > 0)) {
        Integer _count489581 = _histogram489578.getOrDefault(_var458880, 0);
        _count489581 = (_count489581 - 1);
        _histogram489578.put(_var458880, _count489581);

      } else {
        _var12369.remove(_var458880);
      }
    }
    java.util.ArrayList<Record> _var489630 = new java.util.ArrayList<Record>();
    java.util.HashMap<Record, Integer> _histogram489632 = new java.util.HashMap<Record, Integer>();
    {
      Integer _count489634 = _histogram489632.getOrDefault(rec, 0);
      _count489634 = (_count489634 + 1);
      _histogram489632.put(rec, _count489634);

    }
    for (Record _var489631 : _var990) {
      if ((_histogram489632.getOrDefault(_var489631, 0) > 0)) {
        Integer _count489635 = _histogram489632.getOrDefault(_var489631, 0);
        _count489635 = (_count489635 - 1);
        _histogram489632.put(_var489631, _count489635);

      } else {
        _var489630.add(_var489631);
      }
    }
    java.util.ArrayList<Record> __var115138489636 = _var489630;
    java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489637 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
    for (Record _r489639 : __var115138489636) {
      {
        Integer _var8471 = ((_r489639).getVal()).var;
        java.util.ArrayList<Record> _v489638 = _map489637.getOrDefault(_var8471,
            new java.util.ArrayList<Record>());
        java.util.ArrayList<Record> _var489640 = new java.util.ArrayList<Record>();
        for (Record _r489642 : __var115138489636) {
          if ((java.util.Objects.equals(((_r489642).getVal()).var, _var8471))) {
            {
              _var489640.add(_r489642);
            }
          }
        }
        _v489638 = _var489640;
        _map489637.put(_var8471, _v489638);

      }
    }
    for (Integer __var104467489595 : (_map489637).keySet()) {
      Boolean _conditional_result489596 = false;
      Boolean _found489597 = false;
      _label489599: do {
        for (Record _r489600 : _var990) {
          {
            if ((java.util.Objects.equals(((_r489600).getVal()).var, __var104467489595))) {
              _found489597 = true;
              break _label489599;
            }
          }
        }
      } while (false);
      if (_found489597) {
        java.util.ArrayList<Record> _var489601 = new java.util.ArrayList<Record>();
        for (Record _r489603 : _var990) {
          if ((java.util.Objects.equals(((_r489603).getVal()).var, __var104467489595))) {
            {
              _var489601.add(_r489603);
            }
          }
        }
        java.util.ArrayList<Record> _var489604 = new java.util.ArrayList<Record>();
        java.util.HashMap<Record, Integer> _histogram489606 = new java.util.HashMap<Record, Integer>();
        {
          Integer _count489608 = _histogram489606.getOrDefault(rec, 0);
          _count489608 = (_count489608 + 1);
          _histogram489606.put(rec, _count489608);

        }
        for (Record _var489605 : _var990) {
          if ((_histogram489606.getOrDefault(_var489605, 0) > 0)) {
            Integer _count489609 = _histogram489606.getOrDefault(_var489605, 0);
            _count489609 = (_count489609 - 1);
            _histogram489606.put(_var489605, _count489609);

          } else {
            _var489604.add(_var489605);
          }
        }
        java.util.ArrayList<Record> __var115140489610 = _var489604;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489611 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489613 : __var115140489610) {
          {
            Integer _var8471 = ((_r489613).getVal()).var;
            java.util.ArrayList<Record> _v489612 = _map489611.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489614 = new java.util.ArrayList<Record>();
            for (Record _r489616 : __var115140489610) {
              if ((java.util.Objects.equals(((_r489616).getVal()).var, _var8471))) {
                {
                  _var489614.add(_r489616);
                }
              }
            }
            _v489612 = _var489614;
            _map489611.put(_var8471, _v489612);

          }
        }
        _conditional_result489596 = ((_var489601 == _map489611.getOrDefault(__var104467489595,
            new java.util.ArrayList<Record>())));
      } else {
        java.util.ArrayList<Record> _var489617 = new java.util.ArrayList<Record>();
        java.util.HashMap<Record, Integer> _histogram489619 = new java.util.HashMap<Record, Integer>();
        {
          Integer _count489621 = _histogram489619.getOrDefault(rec, 0);
          _count489621 = (_count489621 + 1);
          _histogram489619.put(rec, _count489621);

        }
        for (Record _var489618 : _var990) {
          if ((_histogram489619.getOrDefault(_var489618, 0) > 0)) {
            Integer _count489622 = _histogram489619.getOrDefault(_var489618, 0);
            _count489622 = (_count489622 - 1);
            _histogram489619.put(_var489618, _count489622);

          } else {
            _var489617.add(_var489618);
          }
        }
        java.util.ArrayList<Record> __var115140489623 = _var489617;
        java.util.HashMap<Integer, java.util.ArrayList<Record>> _map489624 = new java.util.HashMap<Integer, java.util.ArrayList<Record>>();
        for (Record _r489626 : __var115140489623) {
          {
            Integer _var8471 = ((_r489626).getVal()).var;
            java.util.ArrayList<Record> _v489625 = _map489624.getOrDefault(_var8471,
                new java.util.ArrayList<Record>());
            java.util.ArrayList<Record> _var489627 = new java.util.ArrayList<Record>();
            for (Record _r489629 : __var115140489623) {
              if ((java.util.Objects.equals(((_r489629).getVal()).var, _var8471))) {
                {
                  _var489627.add(_r489629);
                }
              }
            }
            _v489625 = _var489627;
            _map489624.put(_var8471, _v489625);

          }
        }
        _conditional_result489596 = ((new java.util.ArrayList<Record>() == _map489624
            .getOrDefault(__var104467489595, new java.util.ArrayList<Record>())));
      }
      Boolean _v489645;
      if ((!(_var9464.containsKey(__var104467489595)))) {
        _v489645 = true;
      } else {
        _v489645 = (!(_conditional_result489596));
      }
      if (_v489645) {
        {
        }
      }
    }
    for (Integer _var104467 : _var488724) {
      _var9464.remove(_var104467);
    }
    for (Integer _var104467 : _var488725) {
    }
    {
      _var990.remove(rec);
    }
  }

  public static class _Type488726 implements java.io.Serializable {
    private Integer var;
    private Integer level;
    private org.sat4j.specs.IConstr reason;
    private org.sat4j.specs.IVec<org.sat4j.minisat.core.Propagatable> posWatches;
    private org.sat4j.specs.IVec<org.sat4j.minisat.core.Propagatable> negWatches;
    private org.sat4j.specs.IVec<org.sat4j.minisat.core.Undoable> undos;

    public Integer getVar() {
      return var;
    }

    public Integer getLevel() {
      return level;
    }

    public org.sat4j.specs.IConstr getReason() {
      return reason;
    }

    public org.sat4j.specs.IVec<org.sat4j.minisat.core.Propagatable> getPosWatches() {
      return posWatches;
    }

    public org.sat4j.specs.IVec<org.sat4j.minisat.core.Propagatable> getNegWatches() {
      return negWatches;
    }

    public org.sat4j.specs.IVec<org.sat4j.minisat.core.Undoable> getUndos() {
      return undos;
    }

    public _Type488726(Integer var, Integer level, org.sat4j.specs.IConstr reason,
        org.sat4j.specs.IVec<org.sat4j.minisat.core.Propagatable> posWatches,
        org.sat4j.specs.IVec<org.sat4j.minisat.core.Propagatable> negWatches,
        org.sat4j.specs.IVec<org.sat4j.minisat.core.Undoable> undos) {
      this.var = var;
      this.level = level;
      this.reason = reason;
      this.posWatches = posWatches;
      this.negWatches = negWatches;
      this.undos = undos;
    }

    @Override
    public int hashCode() {
      int _hash_code489646 = 0;
      _hash_code489646 = (_hash_code489646 * 31) ^ ((var).hashCode());
      _hash_code489646 = (_hash_code489646 * 31) ^ ((level).hashCode());
      _hash_code489646 = (_hash_code489646 * 31) ^ ((reason).hashCode());
      _hash_code489646 = (_hash_code489646 * 31) ^ ((posWatches).hashCode());
      _hash_code489646 = (_hash_code489646 * 31) ^ ((negWatches).hashCode());
      _hash_code489646 = (_hash_code489646 * 31) ^ ((undos).hashCode());
      return _hash_code489646;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type488726))
        return false;
      _Type488726 o = (_Type488726) other;
      Boolean _v489647;
      Boolean _v489648;
      if ((java.util.Objects.equals(this.var, o.var))) {
        Boolean _v489649;
        if ((java.util.Objects.equals(this.level, o.level))) {
          _v489649 = (java.util.Objects.equals(this.reason, o.reason));
        } else {
          _v489649 = false;
        }
        _v489648 = _v489649;
      } else {
        _v489648 = false;
      }
      if (_v489648) {
        Boolean _v489650;
        if ((java.util.Objects.equals(this.posWatches, o.posWatches))) {
          Boolean _v489651;
          if ((java.util.Objects.equals(this.negWatches, o.negWatches))) {
            _v489651 = (java.util.Objects.equals(this.undos, o.undos));
          } else {
            _v489651 = false;
          }
          _v489650 = _v489651;
        } else {
          _v489650 = false;
        }
        _v489647 = _v489650;
      } else {
        _v489647 = false;
      }
      return _v489647;
    }
  }

  public static class Record extends _Type488726 implements java.io.Serializable {
    public _Type488726 getVal() {
      return this;
    }

    public Record(Integer _v489652, Integer _v489653, org.sat4j.specs.IConstr _v489654,
        org.sat4j.specs.IVec<org.sat4j.minisat.core.Propagatable> _v489655,
        org.sat4j.specs.IVec<org.sat4j.minisat.core.Propagatable> _v489656,
        org.sat4j.specs.IVec<org.sat4j.minisat.core.Undoable> _v489657) {
      super(_v489652, _v489653, _v489654, _v489655, _v489656, _v489657);
    }
  }
}
