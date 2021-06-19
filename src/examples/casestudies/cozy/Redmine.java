package casestudies.cozy;

public class Redmine implements java.io.Serializable {
  protected java.util.ArrayList<Issue> _var2673;
  protected java.util.ArrayList<Project> _var5390;
  protected java.util.HashMap<Integer, java.util.ArrayList<Project>> _var22777;

  public Redmine() {
    clear();
  }

  public Redmine(java.util.ArrayList<Issue> issues, java.util.ArrayList<Project> projects) {
    _var2673 = issues;
    _var5390 = projects;
    java.util.HashMap<Integer, java.util.ArrayList<Project>> _map110922 = new java.util.HashMap<Integer, java.util.ArrayList<Project>>();
    for (Project _p110924 : projects) {
      {
        Integer _var22244 = ((_p110924).getVal()).id;
        java.util.ArrayList<Project> _v110923 = _map110922.getOrDefault(_var22244,
            new java.util.ArrayList<Project>());
        java.util.ArrayList<Project> _var110925 = new java.util.ArrayList<Project>();
        for (Project _p110927 : projects) {
          if ((java.util.Objects.equals(((_p110927).getVal()).id, _var22244))) {
            {
              _var110925.add(_p110927);
            }
          }
        }
        _v110923 = _var110925;
        _map110922.put(_var22244, _v110923);

      }
    }
    _var22777 = _map110922;
  }

  public void clear() {
    _var2673 = new java.util.ArrayList<Issue>();
    _var5390 = new java.util.ArrayList<Project>();
    java.util.HashMap<Integer, java.util.ArrayList<Project>> _map110928 = new java.util.HashMap<Integer, java.util.ArrayList<Project>>();
    _var22777 = _map110928;
  }

  public Integer countIssues(Integer p1) {
    Integer _sum110934 = 0;
    for (Issue _i110938 : _var2673) {
      Boolean _v110939 = true;
      _label110940: do {
        for (IssueStatus _s110943 : ((_i110938).getVal()).statuses) {
          if ((java.util.Objects.equals(((_s110943).getVal()).is_closed, false))) {
            {
              {
                _v110939 = false;
                break _label110940;
              }
            }
          }
        }
      } while (false);
      Boolean _v110944 = true;
      _label110945: do {
        for (ProjectModule _m110948 : ((((_i110938).getVal()).project).getVal()).modules) {
          if ((((((_m110948).getVal()).name) == "issue_tracking"))) {
            {
              {
                _v110944 = false;
                break _label110945;
              }
            }
          }
        }
      } while (false);
      Boolean _v110949;
      Boolean _v110950;
      Boolean _v110951;
      if ((!(_v110939))) {
        _v110951 = (java.util.Objects.equals(((_i110938).getVal()).assigned_to, p1));
      } else {
        _v110951 = false;
      }
      if (_v110951) {
        _v110950 = (!(_v110944));
      } else {
        _v110950 = false;
      }
      if (_v110950) {
        _v110949 = (!((java.util.Objects.equals(((((_i110938).getVal()).project).getVal()).status,
            9))));
      } else {
        _v110949 = false;
      }
      if (_v110949) {
        {
          {
            {
              _sum110934 = (_sum110934 + 1);
            }
          }
        }
      }
    }
    return _sum110934;
  }

  public Project getProjectById(Integer id) {
    Project _v110952 = null;
    _label110953: do {
      for (Project _x110954 : _var22777.getOrDefault(id, new java.util.ArrayList<Project>())) {
        _v110952 = _x110954;
        break _label110953;
      }
    } while (false);
    return _v110952;
  }

  public void insertIssue(Issue i) {
    java.util.ArrayList<Issue> _var110955 = new java.util.ArrayList<Issue>();
    java.util.HashMap<Issue, Integer> _histogram110957 = new java.util.HashMap<Issue, Integer>();
    for (Issue _x110958 : _var2673) {
      Integer _count110959 = _histogram110957.getOrDefault(_x110958, 0);
      _count110959 = (_count110959 + 1);
      _histogram110957.put(_x110958, _count110959);

    }
    {
      Integer _count110959 = _histogram110957.getOrDefault(i, 0);
      _count110959 = (_count110959 + 1);
      _histogram110957.put(i, _count110959);

    }
    for (Issue _var110956 : _var2673) {
      if ((_histogram110957.getOrDefault(_var110956, 0) > 0)) {
        Integer _count110960 = _histogram110957.getOrDefault(_var110956, 0);
        _count110960 = (_count110960 - 1);
        _histogram110957.put(_var110956, _count110960);

      } else {
        _var110955.add(_var110956);
      }
    }
    java.util.ArrayList<Issue> _var110908 = _var110955;
    java.util.ArrayList<Issue> _var110961 = new java.util.ArrayList<Issue>();
    java.util.HashMap<Issue, Integer> _histogram110963 = new java.util.HashMap<Issue, Integer>();
    for (Issue _x110964 : _var2673) {
      Integer _count110965 = _histogram110963.getOrDefault(_x110964, 0);
      _count110965 = (_count110965 + 1);
      _histogram110963.put(_x110964, _count110965);

    }
    for (Issue _var110962 : _var2673) {
      if ((_histogram110963.getOrDefault(_var110962, 0) > 0)) {
        Integer _count110966 = _histogram110963.getOrDefault(_var110962, 0);
        _count110966 = (_count110966 - 1);
        _histogram110963.put(_var110962, _count110966);

      } else {
        _var110961.add(_var110962);
      }
    }
    {
      if ((_histogram110963.getOrDefault(i, 0) > 0)) {
        Integer _count110966 = _histogram110963.getOrDefault(i, 0);
        _count110966 = (_count110966 - 1);
        _histogram110963.put(i, _count110966);

      } else {
        _var110961.add(i);
      }
    }
    java.util.ArrayList<Issue> _var110909 = _var110961;
    for (Issue _var3074 : _var110908) {
      _var2673.remove(_var3074);
    }
    for (Issue _var3074 : _var110909) {
      _var2673.add(_var3074);
    }
  }

  public void insertProject(Project p) {
    java.util.ArrayList<Integer> _var110967 = new java.util.ArrayList<Integer>();
    java.util.HashMap<Integer, Integer> _histogram110969 = new java.util.HashMap<Integer, Integer>();
    java.util.ArrayList<Project> _var110973 = new java.util.ArrayList<Project>();
    for (Project _var110974 : _var5390) {
      _var110973.add(_var110974);
    }
    {
      _var110973.add(p);
    }
    java.util.ArrayList<Project> __var50947110975 = _var110973;
    java.util.HashMap<Integer, java.util.ArrayList<Project>> _map110976 = new java.util.HashMap<Integer, java.util.ArrayList<Project>>();
    for (Project __var50948110978 : __var50947110975) {
      {
        Integer _var22244 = ((__var50948110978).getVal()).id;
        java.util.ArrayList<Project> _v110977 = _map110976.getOrDefault(_var22244,
            new java.util.ArrayList<Project>());
        java.util.ArrayList<Project> _var110979 = new java.util.ArrayList<Project>();
        for (Project __var50949110981 : __var50947110975) {
          if ((java.util.Objects.equals(((__var50949110981).getVal()).id, _var22244))) {
            {
              _var110979.add(__var50949110981);
            }
          }
        }
        _v110977 = _var110979;
        _map110976.put(_var22244, _v110977);

      }
    }
    for (Integer _x110970 : (_map110976).keySet()) {
      Integer _count110971 = _histogram110969.getOrDefault(_x110970, 0);
      _count110971 = (_count110971 + 1);
      _histogram110969.put(_x110970, _count110971);

    }
    for (Integer _var110968 : (_var22777).keySet()) {
      if ((_histogram110969.getOrDefault(_var110968, 0) > 0)) {
        Integer _count110972 = _histogram110969.getOrDefault(_var110968, 0);
        _count110972 = (_count110972 - 1);
        _histogram110969.put(_var110968, _count110972);

      } else {
        _var110967.add(_var110968);
      }
    }
    java.util.ArrayList<Integer> _var110910 = _var110967;
    java.util.ArrayList<Integer> _var110982 = new java.util.ArrayList<Integer>();
    java.util.ArrayList<Project> _var111011 = new java.util.ArrayList<Project>();
    for (Project _var111012 : _var5390) {
      _var111011.add(_var111012);
    }
    {
      _var111011.add(p);
    }
    java.util.ArrayList<Project> __var97217111013 = _var111011;
    java.util.HashMap<Integer, java.util.ArrayList<Project>> _map111014 = new java.util.HashMap<Integer, java.util.ArrayList<Project>>();
    for (Project __var97219111016 : __var97217111013) {
      {
        Integer _var22244 = ((__var97219111016).getVal()).id;
        java.util.ArrayList<Project> _v111015 = _map111014.getOrDefault(_var22244,
            new java.util.ArrayList<Project>());
        java.util.ArrayList<Project> _var111017 = new java.util.ArrayList<Project>();
        for (Project __var97222111019 : __var97217111013) {
          if ((java.util.Objects.equals(((__var97222111019).getVal()).id, _var22244))) {
            {
              _var111017.add(__var97222111019);
            }
          }
        }
        _v111015 = _var111017;
        _map111014.put(_var22244, _v111015);

      }
    }
    for (Integer __var36405110984 : (_map111014).keySet()) {
      Boolean _conditional_result110985 = false;
      Boolean _found110986 = false;
      _label110988: do {
        for (Project __var97225110989 : _var5390) {
          {
            if ((java.util.Objects.equals(((__var97225110989).getVal()).id, __var36405110984))) {
              _found110986 = true;
              break _label110988;
            }
          }
        }
      } while (false);
      if (_found110986) {
        java.util.ArrayList<Project> _var110990 = new java.util.ArrayList<Project>();
        for (Project __var97226110992 : _var5390) {
          if ((java.util.Objects.equals(((__var97226110992).getVal()).id, __var36405110984))) {
            {
              _var110990.add(__var97226110992);
            }
          }
        }
        java.util.ArrayList<Project> _var110993 = new java.util.ArrayList<Project>();
        for (Project _var110994 : _var5390) {
          _var110993.add(_var110994);
        }
        {
          _var110993.add(p);
        }
        java.util.ArrayList<Project> __var97227110995 = _var110993;
        java.util.HashMap<Integer, java.util.ArrayList<Project>> _map110996 = new java.util.HashMap<Integer, java.util.ArrayList<Project>>();
        for (Project __var97228110998 : __var97227110995) {
          {
            Integer _var22244 = ((__var97228110998).getVal()).id;
            java.util.ArrayList<Project> _v110997 = _map110996.getOrDefault(_var22244,
                new java.util.ArrayList<Project>());
            java.util.ArrayList<Project> _var110999 = new java.util.ArrayList<Project>();
            for (Project __var97229111001 : __var97227110995) {
              if ((java.util.Objects.equals(((__var97229111001).getVal()).id, _var22244))) {
                {
                  _var110999.add(__var97229111001);
                }
              }
            }
            _v110997 = _var110999;
            _map110996.put(_var22244, _v110997);

          }
        }
        _conditional_result110985 = ((_var110990 == _map110996.getOrDefault(__var36405110984,
            new java.util.ArrayList<Project>())));
      } else {
        java.util.ArrayList<Project> _var111002 = new java.util.ArrayList<Project>();
        for (Project _var111003 : _var5390) {
          _var111002.add(_var111003);
        }
        {
          _var111002.add(p);
        }
        java.util.ArrayList<Project> __var97227111004 = _var111002;
        java.util.HashMap<Integer, java.util.ArrayList<Project>> _map111005 = new java.util.HashMap<Integer, java.util.ArrayList<Project>>();
        for (Project __var97228111007 : __var97227111004) {
          {
            Integer _var22244 = ((__var97228111007).getVal()).id;
            java.util.ArrayList<Project> _v111006 = _map111005.getOrDefault(_var22244,
                new java.util.ArrayList<Project>());
            java.util.ArrayList<Project> _var111008 = new java.util.ArrayList<Project>();
            for (Project __var97229111010 : __var97227111004) {
              if ((java.util.Objects.equals(((__var97229111010).getVal()).id, _var22244))) {
                {
                  _var111008.add(__var97229111010);
                }
              }
            }
            _v111006 = _var111008;
            _map111005.put(_var22244, _v111006);

          }
        }
        _conditional_result110985 = ((new java.util.ArrayList<Project>() == _map111005
            .getOrDefault(__var36405110984, new java.util.ArrayList<Project>())));
      }
      Boolean _v111094;
      if ((!(_var22777.containsKey(__var36405110984)))) {
        _v111094 = true;
      } else {
        _v111094 = (!(_conditional_result110985));
      }
      if (_v111094) {
        {
          _var110982.add(__var36405110984);
        }
      }
    }
    java.util.ArrayList<Integer> _var110911 = _var110982;
    java.util.ArrayList<Project> _var111020 = new java.util.ArrayList<Project>();
    java.util.HashMap<Project, Integer> _histogram111022 = new java.util.HashMap<Project, Integer>();
    for (Project _x111023 : _var5390) {
      Integer _count111024 = _histogram111022.getOrDefault(_x111023, 0);
      _count111024 = (_count111024 + 1);
      _histogram111022.put(_x111023, _count111024);

    }
    {
      Integer _count111024 = _histogram111022.getOrDefault(p, 0);
      _count111024 = (_count111024 + 1);
      _histogram111022.put(p, _count111024);

    }
    for (Project _var111021 : _var5390) {
      if ((_histogram111022.getOrDefault(_var111021, 0) > 0)) {
        Integer _count111025 = _histogram111022.getOrDefault(_var111021, 0);
        _count111025 = (_count111025 - 1);
        _histogram111022.put(_var111021, _count111025);

      } else {
        _var111020.add(_var111021);
      }
    }
    java.util.ArrayList<Project> _var110912 = _var111020;
    java.util.ArrayList<Project> _var111026 = new java.util.ArrayList<Project>();
    java.util.HashMap<Project, Integer> _histogram111028 = new java.util.HashMap<Project, Integer>();
    for (Project _x111029 : _var5390) {
      Integer _count111030 = _histogram111028.getOrDefault(_x111029, 0);
      _count111030 = (_count111030 + 1);
      _histogram111028.put(_x111029, _count111030);

    }
    for (Project _var111027 : _var5390) {
      if ((_histogram111028.getOrDefault(_var111027, 0) > 0)) {
        Integer _count111031 = _histogram111028.getOrDefault(_var111027, 0);
        _count111031 = (_count111031 - 1);
        _histogram111028.put(_var111027, _count111031);

      } else {
        _var111026.add(_var111027);
      }
    }
    {
      if ((_histogram111028.getOrDefault(p, 0) > 0)) {
        Integer _count111031 = _histogram111028.getOrDefault(p, 0);
        _count111031 = (_count111031 - 1);
        _histogram111028.put(p, _count111031);

      } else {
        _var111026.add(p);
      }
    }
    java.util.ArrayList<Project> _var110913 = _var111026;
    for (Integer _var36405 : _var110910) {
      _var22777.remove(_var36405);
    }
    for (Integer _var36405 : _var110911) {
      java.util.ArrayList<Project> _var36406 = _var22777.getOrDefault(_var36405,
          new java.util.ArrayList<Project>());
      Boolean _found111032 = false;
      _label111034: do {
        for (Project __var79728111035 : _var5390) {
          {
            if ((java.util.Objects.equals(((__var79728111035).getVal()).id, _var36405))) {
              _found111032 = true;
              break _label111034;
            }
          }
        }
      } while (false);
      if (_found111032) {
        java.util.HashMap<Project, Integer> _histogram111036 = new java.util.HashMap<Project, Integer>();
        java.util.ArrayList<Project> _var111040 = new java.util.ArrayList<Project>();
        for (Project _var111041 : _var5390) {
          _var111040.add(_var111041);
        }
        {
          _var111040.add(p);
        }
        java.util.ArrayList<Project> __var79730111042 = _var111040;
        java.util.HashMap<Integer, java.util.ArrayList<Project>> _map111043 = new java.util.HashMap<Integer, java.util.ArrayList<Project>>();
        for (Project __var79731111045 : __var79730111042) {
          {
            Integer _var22244 = ((__var79731111045).getVal()).id;
            java.util.ArrayList<Project> _v111044 = _map111043.getOrDefault(_var22244,
                new java.util.ArrayList<Project>());
            java.util.ArrayList<Project> _var111046 = new java.util.ArrayList<Project>();
            for (Project __var79732111048 : __var79730111042) {
              if ((java.util.Objects.equals(((__var79732111048).getVal()).id, _var22244))) {
                {
                  _var111046.add(__var79732111048);
                }
              }
            }
            _v111044 = _var111046;
            _map111043.put(_var22244, _v111044);

          }
        }
        for (Project _x111037 : _map111043.getOrDefault(_var36405,
            new java.util.ArrayList<Project>())) {
          Integer _count111038 = _histogram111036.getOrDefault(_x111037, 0);
          _count111038 = (_count111038 + 1);
          _histogram111036.put(_x111037, _count111038);

        }
        for (Project __var79729111049 : _var5390) {
          if ((java.util.Objects.equals(((__var79729111049).getVal()).id, _var36405))) {
            {
              if ((_histogram111036.getOrDefault(__var79729111049, 0) > 0)) {
                Integer _count111039 = _histogram111036.getOrDefault(__var79729111049, 0);
                _count111039 = (_count111039 - 1);
                _histogram111036.put(__var79729111049, _count111039);

              } else {
                _var36406.remove(__var79729111049);
              }
            }
          }
        }
      } else {
        java.util.HashMap<Project, Integer> _histogram111050 = new java.util.HashMap<Project, Integer>();
        java.util.ArrayList<Project> _var111054 = new java.util.ArrayList<Project>();
        for (Project _var111055 : _var5390) {
          _var111054.add(_var111055);
        }
        {
          _var111054.add(p);
        }
        java.util.ArrayList<Project> __var79730111056 = _var111054;
        java.util.HashMap<Integer, java.util.ArrayList<Project>> _map111057 = new java.util.HashMap<Integer, java.util.ArrayList<Project>>();
        for (Project __var79731111059 : __var79730111056) {
          {
            Integer _var22244 = ((__var79731111059).getVal()).id;
            java.util.ArrayList<Project> _v111058 = _map111057.getOrDefault(_var22244,
                new java.util.ArrayList<Project>());
            java.util.ArrayList<Project> _var111060 = new java.util.ArrayList<Project>();
            for (Project __var79732111062 : __var79730111056) {
              if ((java.util.Objects.equals(((__var79732111062).getVal()).id, _var22244))) {
                {
                  _var111060.add(__var79732111062);
                }
              }
            }
            _v111058 = _var111060;
            _map111057.put(_var22244, _v111058);

          }
        }
        for (Project _x111051 : _map111057.getOrDefault(_var36405,
            new java.util.ArrayList<Project>())) {
          Integer _count111052 = _histogram111050.getOrDefault(_x111051, 0);
          _count111052 = (_count111052 + 1);
          _histogram111050.put(_x111051, _count111052);

        }
      }
      Boolean _found111063 = false;
      _label111065: do {
        for (Project __var64835111066 : _var5390) {
          {
            if ((java.util.Objects.equals(((__var64835111066).getVal()).id, _var36405))) {
              _found111063 = true;
              break _label111065;
            }
          }
        }
      } while (false);
      if (_found111063) {
        java.util.HashMap<Project, Integer> _histogram111067 = new java.util.HashMap<Project, Integer>();
        for (Project __var64836111071 : _var5390) {
          if ((java.util.Objects.equals(((__var64836111071).getVal()).id, _var36405))) {
            {
              Integer _count111069 = _histogram111067.getOrDefault(__var64836111071, 0);
              _count111069 = (_count111069 + 1);
              _histogram111067.put(__var64836111071, _count111069);

            }
          }
        }
        java.util.ArrayList<Project> _var111072 = new java.util.ArrayList<Project>();
        for (Project _var111073 : _var5390) {
          _var111072.add(_var111073);
        }
        {
          _var111072.add(p);
        }
        java.util.ArrayList<Project> __var64832111074 = _var111072;
        java.util.HashMap<Integer, java.util.ArrayList<Project>> _map111075 = new java.util.HashMap<Integer, java.util.ArrayList<Project>>();
        for (Project __var64833111077 : __var64832111074) {
          {
            Integer _var22244 = ((__var64833111077).getVal()).id;
            java.util.ArrayList<Project> _v111076 = _map111075.getOrDefault(_var22244,
                new java.util.ArrayList<Project>());
            java.util.ArrayList<Project> _var111078 = new java.util.ArrayList<Project>();
            for (Project __var64834111080 : __var64832111074) {
              if ((java.util.Objects.equals(((__var64834111080).getVal()).id, _var22244))) {
                {
                  _var111078.add(__var64834111080);
                }
              }
            }
            _v111076 = _var111078;
            _map111075.put(_var22244, _v111076);

          }
        }
        for (Project _var41542 : _map111075.getOrDefault(_var36405,
            new java.util.ArrayList<Project>())) {
          if ((_histogram111067.getOrDefault(_var41542, 0) > 0)) {
            Integer _count111070 = _histogram111067.getOrDefault(_var41542, 0);
            _count111070 = (_count111070 - 1);
            _histogram111067.put(_var41542, _count111070);

          } else {
            _var36406.add(_var41542);
          }
        }
      } else {
        java.util.HashMap<Project, Integer> _histogram111081 = new java.util.HashMap<Project, Integer>();
        java.util.ArrayList<Project> _var111085 = new java.util.ArrayList<Project>();
        for (Project _var111086 : _var5390) {
          _var111085.add(_var111086);
        }
        {
          _var111085.add(p);
        }
        java.util.ArrayList<Project> __var64832111087 = _var111085;
        java.util.HashMap<Integer, java.util.ArrayList<Project>> _map111088 = new java.util.HashMap<Integer, java.util.ArrayList<Project>>();
        for (Project __var64833111090 : __var64832111087) {
          {
            Integer _var22244 = ((__var64833111090).getVal()).id;
            java.util.ArrayList<Project> _v111089 = _map111088.getOrDefault(_var22244,
                new java.util.ArrayList<Project>());
            java.util.ArrayList<Project> _var111091 = new java.util.ArrayList<Project>();
            for (Project __var64834111093 : __var64832111087) {
              if ((java.util.Objects.equals(((__var64834111093).getVal()).id, _var22244))) {
                {
                  _var111091.add(__var64834111093);
                }
              }
            }
            _v111089 = _var111091;
            _map111088.put(_var22244, _v111089);

          }
        }
        for (Project _var41542 : _map111088.getOrDefault(_var36405,
            new java.util.ArrayList<Project>())) {
          if ((_histogram111081.getOrDefault(_var41542, 0) > 0)) {
            Integer _count111084 = _histogram111081.getOrDefault(_var41542, 0);
            _count111084 = (_count111084 - 1);
            _histogram111081.put(_var41542, _count111084);

          } else {
            _var36406.add(_var41542);
          }
        }
      }
      _var22777.put(_var36405, _var36406);

    }
    for (Project _var6166 : _var110912) {
      _var5390.remove(_var6166);
    }
    for (Project _var6166 : _var110913) {
      _var5390.add(_var6166);
    }
  }

  public void updateProjectStatus(Project p, Integer status) {
    java.util.HashSet<Project> _distinct_elems111097 = new java.util.HashSet<Project>();
    for (Issue __var11482111098 : _var2673) {
      {
        Project __var11911111095 = ((__var11482111098).getVal()).project;
        if ((!((_distinct_elems111097.contains(__var11911111095))))) {
          Boolean _v111100;
          if ((!((java.util.Objects.equals(__var11911111095, p))))) {
            _v111100 = true;
          } else {
            _v111100 = (((__var11911111095).getVal() == new _Type110916(((p).getVal()).id, status,
                ((p).getVal()).modules)));
          }
          if ((!(_v111100))) {
            {
              Integer _conditional_result111096 = 0;
              if ((java.util.Objects.equals(__var11911111095, p))) {
                _conditional_result111096 = status;
              } else {
                _conditional_result111096 = ((__var11911111095).getVal()).status;
              }
              ((__var11911111095).getVal()).status = _conditional_result111096;
            }
          }
          _distinct_elems111097.add(__var11911111095);
        }
      }
    }
    for (Project __var11485111099 : _var5390) {
      {
        if ((!((_distinct_elems111097.contains(__var11485111099))))) {
          Boolean _v111101;
          if ((!((java.util.Objects.equals(__var11485111099, p))))) {
            _v111101 = true;
          } else {
            _v111101 = (((__var11485111099).getVal() == new _Type110916(((p).getVal()).id, status,
                ((p).getVal()).modules)));
          }
          if ((!(_v111101))) {
            {
              Integer _conditional_result111096 = 0;
              if ((java.util.Objects.equals(__var11485111099, p))) {
                _conditional_result111096 = status;
              } else {
                _conditional_result111096 = ((__var11485111099).getVal()).status;
              }
              ((__var11485111099).getVal()).status = _conditional_result111096;
            }
          }
          _distinct_elems111097.add(__var11485111099);
        }
      }
    }
    {
      if ((!((_distinct_elems111097.contains(p))))) {
        Boolean _v111102;
        if ((!((java.util.Objects.equals(p, p))))) {
          _v111102 = true;
        } else {
          _v111102 = (((p).getVal() == new _Type110916(((p).getVal()).id, status,
              ((p).getVal()).modules)));
        }
        if ((!(_v111102))) {
          {
            Integer _conditional_result111096 = 0;
            if ((java.util.Objects.equals(p, p))) {
              _conditional_result111096 = status;
            } else {
              _conditional_result111096 = ((p).getVal()).status;
            }
            ((p).getVal()).status = _conditional_result111096;
          }
        }
        _distinct_elems111097.add(p);
      }
    }
  }

  public static class _Type110914 implements java.io.Serializable {
    private Integer id;
    private String name;

    public Integer getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public _Type110914(Integer id, String name) {
      this.id = id;
      this.name = name;
    }

    @Override
    public int hashCode() {
      int _hash_code111103 = 0;
      _hash_code111103 = (_hash_code111103 * 31) ^ ((id).hashCode());
      _hash_code111103 = (_hash_code111103 * 31) ^ ((name).hashCode());
      return _hash_code111103;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type110914))
        return false;
      _Type110914 o = (_Type110914) other;
      Boolean _v111104;
      if ((java.util.Objects.equals(this.id, o.id))) {
        _v111104 = (java.util.Objects.equals(this.name, o.name));
      } else {
        _v111104 = false;
      }
      return _v111104;
    }
  }

  public static class ProjectModule extends _Type110914 implements java.io.Serializable {
    public _Type110914 getVal() {
      return this;
    }

    public ProjectModule(Integer _v111105, String _v111106) {
      super(_v111105, _v111106);
    }
  }

  public static class _Type110916 implements java.io.Serializable {
    private Integer id;
    private Integer status;
    private java.util.ArrayList<ProjectModule> modules;

    public Integer getId() {
      return id;
    }

    public Integer getStatus() {
      return status;
    }

    public java.util.ArrayList<ProjectModule> getModules() {
      return modules;
    }

    public _Type110916(Integer id, Integer status, java.util.ArrayList<ProjectModule> modules) {
      this.id = id;
      this.status = status;
      this.modules = modules;
    }

    @Override
    public int hashCode() {
      int _hash_code111107 = 0;
      _hash_code111107 = (_hash_code111107 * 31) ^ ((id).hashCode());
      _hash_code111107 = (_hash_code111107 * 31) ^ ((status).hashCode());
      _hash_code111107 = (_hash_code111107 * 31) ^ ((modules).hashCode());
      return _hash_code111107;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type110916))
        return false;
      _Type110916 o = (_Type110916) other;
      Boolean _v111108;
      if ((java.util.Objects.equals(this.id, o.id))) {
        Boolean _v111109;
        if ((java.util.Objects.equals(this.status, o.status))) {
          _v111109 = ((this.modules == o.modules));
        } else {
          _v111109 = false;
        }
        _v111108 = _v111109;
      } else {
        _v111108 = false;
      }
      return _v111108;
    }
  }

  public static class Project extends _Type110916 implements java.io.Serializable {
    public _Type110916 getVal() {
      return this;
    }

    public Project(Integer _v111110, Integer _v111111,
        java.util.ArrayList<ProjectModule> _v111112) {
      super(_v111110, _v111111, _v111112);
    }
  }

  public static class _Type110918 implements java.io.Serializable {
    private Integer id;
    private Boolean is_closed;

    public Integer getId() {
      return id;
    }

    public Boolean getIs_closed() {
      return is_closed;
    }

    public _Type110918(Integer id, Boolean is_closed) {
      this.id = id;
      this.is_closed = is_closed;
    }

    @Override
    public int hashCode() {
      int _hash_code111113 = 0;
      _hash_code111113 = (_hash_code111113 * 31) ^ ((id).hashCode());
      _hash_code111113 = (_hash_code111113 * 31) ^ ((is_closed).hashCode());
      return _hash_code111113;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type110918))
        return false;
      _Type110918 o = (_Type110918) other;
      Boolean _v111114;
      if ((java.util.Objects.equals(this.id, o.id))) {
        _v111114 = (java.util.Objects.equals(this.is_closed, o.is_closed));
      } else {
        _v111114 = false;
      }
      return _v111114;
    }
  }

  public static class IssueStatus extends _Type110918 implements java.io.Serializable {
    public _Type110918 getVal() {
      return this;
    }

    public IssueStatus(Integer _v111115, Boolean _v111116) {
      super(_v111115, _v111116);
    }
  }

  public static class _Type110920 implements java.io.Serializable {
    private Integer id;
    private Integer author_id;
    private Project project;
    private java.util.ArrayList<IssueStatus> statuses;
    private Integer assigned_to;

    public Integer getId() {
      return id;
    }

    public Integer getAuthor_id() {
      return author_id;
    }

    public Project getProject() {
      return project;
    }

    public java.util.ArrayList<IssueStatus> getStatuses() {
      return statuses;
    }

    public Integer getAssigned_to() {
      return assigned_to;
    }

    public _Type110920(Integer id, Integer author_id, Project project,
        java.util.ArrayList<IssueStatus> statuses, Integer assigned_to) {
      this.id = id;
      this.author_id = author_id;
      this.project = project;
      this.statuses = statuses;
      this.assigned_to = assigned_to;
    }

    @Override
    public int hashCode() {
      int _hash_code111117 = 0;
      _hash_code111117 = (_hash_code111117 * 31) ^ ((id).hashCode());
      _hash_code111117 = (_hash_code111117 * 31) ^ ((author_id).hashCode());
      _hash_code111117 = (_hash_code111117 * 31) ^ ((project).hashCode());
      _hash_code111117 = (_hash_code111117 * 31) ^ ((statuses).hashCode());
      _hash_code111117 = (_hash_code111117 * 31) ^ ((assigned_to).hashCode());
      return _hash_code111117;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type110920))
        return false;
      _Type110920 o = (_Type110920) other;
      Boolean _v111118;
      Boolean _v111119;
      if ((java.util.Objects.equals(this.id, o.id))) {
        _v111119 = (java.util.Objects.equals(this.author_id, o.author_id));
      } else {
        _v111119 = false;
      }
      if (_v111119) {
        Boolean _v111120;
        if ((java.util.Objects.equals(this.project, o.project))) {
          Boolean _v111121;
          if (((this.statuses == o.statuses))) {
            _v111121 = (java.util.Objects.equals(this.assigned_to, o.assigned_to));
          } else {
            _v111121 = false;
          }
          _v111120 = _v111121;
        } else {
          _v111120 = false;
        }
        _v111118 = _v111120;
      } else {
        _v111118 = false;
      }
      return _v111118;
    }
  }

  public static class Issue extends _Type110920 implements java.io.Serializable {
    public _Type110920 getVal() {
      return this;
    }

    public Issue(Integer _v111122, Integer _v111123, Project _v111124,
        java.util.ArrayList<IssueStatus> _v111125, Integer _v111126) {
      super(_v111122, _v111123, _v111124, _v111125, _v111126);
    }
  }
}
