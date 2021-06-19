package casestudies.cozy;

public class Basic implements java.io.Serializable {
  protected java.util.ArrayList<Integer> _var23;
  protected java.util.HashMap<Integer, Boolean> _var444;
  protected java.util.HashMap<Integer, Boolean> _var10459;

  public Basic() {
    clear();
  }

  public Basic(java.util.ArrayList<Integer> l) {
    _var23 = l;
    java.util.HashMap<Integer, Boolean> _map528246 = new java.util.HashMap<Integer, Boolean>();
    for (Integer _var427 : l) {
      Boolean _v528247 = _map528246.getOrDefault(_var427, false);
      _v528247 = true;
      _map528246.put(_var427, _v528247);

    }
    _var444 = _map528246;
    java.util.HashMap<Integer, Boolean> _map528248 = new java.util.HashMap<Integer, Boolean>();
    for (Integer _var2962 : l) {
      Boolean _v528249 = _map528248.getOrDefault(_var2962, false);
      Integer _sum528250 = 0;
      for (Integer __var2963528253 : l) {
        if ((java.util.Objects.equals(_var2962, __var2963528253))) {
          {
            {
              _sum528250 = (_sum528250 + 1);
            }
          }
        }
      }
      _v528249 = (_sum528250 <= 1);
      _map528248.put(_var2962, _v528249);

    }
    _var10459 = _map528248;
  }

  public void clear() {
    _var23 = new java.util.ArrayList<Integer>();
    java.util.HashMap<Integer, Boolean> _map528254 = new java.util.HashMap<Integer, Boolean>();
    _var444 = _map528254;
    java.util.HashMap<Integer, Boolean> _map528256 = new java.util.HashMap<Integer, Boolean>();
    _var10459 = _map528256;
  }

  /*
  public void elems(java.util.function.Consumer<Integer> _callback) {
    for (Integer _x528258 : _var23) {
      _callback.accept(_x528258);
    }
  }
  */

  public void add(Integer n) {
    java.util.ArrayList<Integer> _conditional_result528259 = new java.util.ArrayList<Integer>();
    if (_var444.containsKey(n)) {
      _conditional_result528259 = new java.util.ArrayList<Integer>();
    } else {
      java.util.ArrayList<Integer> _singleton528298 = new java.util.ArrayList<Integer>();
      _singleton528298.add(n);
      _conditional_result528259 = _singleton528298;
    }
    java.util.ArrayList<Integer> _var528241 = _conditional_result528259;
    java.util.ArrayList<Integer> _var528260 = new java.util.ArrayList<Integer>();
    java.util.HashMap<Integer, Boolean> _map528288 = new java.util.HashMap<Integer, Boolean>();
    for (Integer _var2962 : _var23) {
      Boolean _v528289 = _map528288.getOrDefault(_var2962, false);
      Integer _sum528290 = 0;
      for (Integer __var2963528293 : _var23) {
        if ((java.util.Objects.equals(_var2962, __var2963528293))) {
          {
            {
              _sum528290 = (_sum528290 + 1);
            }
          }
        }
      }
      {
        if ((java.util.Objects.equals(_var2962, n))) {
          {
            {
              _sum528290 = (_sum528290 + 1);
            }
          }
        }
      }
      _v528289 = (_sum528290 <= 1);
      _map528288.put(_var2962, _v528289);

    }
    {
      Boolean _v528289 = _map528288.getOrDefault(n, false);
      Integer _sum528294 = 0;
      for (Integer __var2963528297 : _var23) {
        if ((java.util.Objects.equals(n, __var2963528297))) {
          {
            {
              _sum528294 = (_sum528294 + 1);
            }
          }
        }
      }
      {
        if ((java.util.Objects.equals(n, n))) {
          {
            {
              _sum528294 = (_sum528294 + 1);
            }
          }
        }
      }
      _v528289 = (_sum528294 <= 1);
      _map528288.put(n, _v528289);

    }
    for (Integer __var12110528262 : (_map528288).keySet()) {
      Boolean _conditional_result528263 = false;
      if (_var10459.containsKey(__var12110528262)) {
        Integer _sum528264 = 0;
        for (Integer __var2963528267 : _var23) {
          if ((java.util.Objects.equals(__var12110528262, __var2963528267))) {
            {
              {
                _sum528264 = (_sum528264 + 1);
              }
            }
          }
        }
        java.util.HashMap<Integer, Boolean> _map528268 = new java.util.HashMap<Integer, Boolean>();
        for (Integer _var2962 : _var23) {
          Boolean _v528269 = _map528268.getOrDefault(_var2962, false);
          Integer _sum528270 = 0;
          for (Integer __var2963528273 : _var23) {
            if ((java.util.Objects.equals(_var2962, __var2963528273))) {
              {
                {
                  _sum528270 = (_sum528270 + 1);
                }
              }
            }
          }
          {
            if ((java.util.Objects.equals(_var2962, n))) {
              {
                {
                  _sum528270 = (_sum528270 + 1);
                }
              }
            }
          }
          _v528269 = (_sum528270 <= 1);
          _map528268.put(_var2962, _v528269);

        }
        {
          Boolean _v528269 = _map528268.getOrDefault(n, false);
          Integer _sum528274 = 0;
          for (Integer __var2963528277 : _var23) {
            if ((java.util.Objects.equals(n, __var2963528277))) {
              {
                {
                  _sum528274 = (_sum528274 + 1);
                }
              }
            }
          }
          {
            if ((java.util.Objects.equals(n, n))) {
              {
                {
                  _sum528274 = (_sum528274 + 1);
                }
              }
            }
          }
          _v528269 = (_sum528274 <= 1);
          _map528268.put(n, _v528269);

        }
        _conditional_result528263 = (java.util.Objects.equals((_sum528264 <= 1),
            _map528268.getOrDefault(__var12110528262, false)));
      } else {
        java.util.HashMap<Integer, Boolean> _map528278 = new java.util.HashMap<Integer, Boolean>();
        for (Integer _var2962 : _var23) {
          Boolean _v528279 = _map528278.getOrDefault(_var2962, false);
          Integer _sum528280 = 0;
          for (Integer __var2963528283 : _var23) {
            if ((java.util.Objects.equals(_var2962, __var2963528283))) {
              {
                {
                  _sum528280 = (_sum528280 + 1);
                }
              }
            }
          }
          {
            if ((java.util.Objects.equals(_var2962, n))) {
              {
                {
                  _sum528280 = (_sum528280 + 1);
                }
              }
            }
          }
          _v528279 = (_sum528280 <= 1);
          _map528278.put(_var2962, _v528279);

        }
        {
          Boolean _v528279 = _map528278.getOrDefault(n, false);
          Integer _sum528284 = 0;
          for (Integer __var2963528287 : _var23) {
            if ((java.util.Objects.equals(n, __var2963528287))) {
              {
                {
                  _sum528284 = (_sum528284 + 1);
                }
              }
            }
          }
          {
            if ((java.util.Objects.equals(n, n))) {
              {
                {
                  _sum528284 = (_sum528284 + 1);
                }
              }
            }
          }
          _v528279 = (_sum528284 <= 1);
          _map528278.put(n, _v528279);

        }
        _conditional_result528263 = (java.util.Objects.equals(false,
            _map528278.getOrDefault(__var12110528262, false)));
      }
      Boolean _v528299;
      if ((!(_var10459.containsKey(__var12110528262)))) {
        _v528299 = true;
      } else {
        _v528299 = (!(_conditional_result528263));
      }
      if (_v528299) {
        {
          _var528260.add(__var12110528262);
        }
      }
    }
    java.util.ArrayList<Integer> _var528242 = _var528260;
    for (Integer _var12110 : _var528242) {
      Boolean _var12111 = _var10459.getOrDefault(_var12110, false);
      _var12111 = (!(_var12111));
      _var10459.put(_var12110, _var12111);

    }
    {
      _var23.add(n);
    }
    for (Integer _var528 : _var528241) {
      Boolean _var529 = _var444.getOrDefault(_var528, false);
      _var529 = true;
      _var444.put(_var528, _var529);

    }
  }

  public void remove(Integer n) {
    java.util.ArrayList<Integer> _var528300 = new java.util.ArrayList<Integer>();
    for (Integer __var2961528303 : (_var444).keySet()) {
      if ((java.util.Objects.equals(__var2961528303, n))) {
        {
          if (_var10459.getOrDefault(__var2961528303, false)) {
            {
              _var528300.add(__var2961528303);
            }
          }
        }
      }
    }
    java.util.ArrayList<Integer> _var528243 = _var528300;
    java.util.ArrayList<Integer> _var528304 = new java.util.ArrayList<Integer>();
    java.util.ArrayList<Integer> _var528341 = new java.util.ArrayList<Integer>();
    java.util.HashMap<Integer, Integer> _histogram528343 = new java.util.HashMap<Integer, Integer>();
    {
      Integer _count528345 = _histogram528343.getOrDefault(n, 0);
      _count528345 = (_count528345 + 1);
      _histogram528343.put(n, _count528345);

    }
    for (Integer _var528342 : _var23) {
      if ((_histogram528343.getOrDefault(_var528342, 0) > 0)) {
        Integer _count528346 = _histogram528343.getOrDefault(_var528342, 0);
        _count528346 = (_count528346 - 1);
        _histogram528343.put(_var528342, _count528346);

      } else {
        _var528341.add(_var528342);
      }
    }
    java.util.ArrayList<Integer> __var19827528347 = _var528341;
    java.util.HashMap<Integer, Boolean> _map528348 = new java.util.HashMap<Integer, Boolean>();
    for (Integer _var2962 : __var19827528347) {
      Boolean _v528349 = _map528348.getOrDefault(_var2962, false);
      Integer _sum528350 = 0;
      for (Integer __var2963528353 : __var19827528347) {
        if ((java.util.Objects.equals(_var2962, __var2963528353))) {
          {
            {
              _sum528350 = (_sum528350 + 1);
            }
          }
        }
      }
      _v528349 = (_sum528350 <= 1);
      _map528348.put(_var2962, _v528349);

    }
    for (Integer __var16433528306 : (_map528348).keySet()) {
      Boolean _conditional_result528307 = false;
      Boolean _found528308 = false;
      _label528310: do {
        for (Integer _x528309 : _var23) {
          if ((java.util.Objects.equals(_x528309, __var16433528306))) {
            _found528308 = true;
            break _label528310;
          }
        }
      } while (false);
      if (_found528308) {
        Integer _sum528311 = 0;
        for (Integer __var2963528314 : _var23) {
          if ((java.util.Objects.equals(__var16433528306, __var2963528314))) {
            {
              {
                _sum528311 = (_sum528311 + 1);
              }
            }
          }
        }
        java.util.ArrayList<Integer> _var528315 = new java.util.ArrayList<Integer>();
        java.util.HashMap<Integer, Integer> _histogram528317 = new java.util.HashMap<Integer, Integer>();
        {
          Integer _count528319 = _histogram528317.getOrDefault(n, 0);
          _count528319 = (_count528319 + 1);
          _histogram528317.put(n, _count528319);

        }
        for (Integer _var528316 : _var23) {
          if ((_histogram528317.getOrDefault(_var528316, 0) > 0)) {
            Integer _count528320 = _histogram528317.getOrDefault(_var528316, 0);
            _count528320 = (_count528320 - 1);
            _histogram528317.put(_var528316, _count528320);

          } else {
            _var528315.add(_var528316);
          }
        }
        java.util.ArrayList<Integer> __var19833528321 = _var528315;
        java.util.HashMap<Integer, Boolean> _map528322 = new java.util.HashMap<Integer, Boolean>();
        for (Integer _var2962 : __var19833528321) {
          Boolean _v528323 = _map528322.getOrDefault(_var2962, false);
          Integer _sum528324 = 0;
          for (Integer __var2963528327 : __var19833528321) {
            if ((java.util.Objects.equals(_var2962, __var2963528327))) {
              {
                {
                  _sum528324 = (_sum528324 + 1);
                }
              }
            }
          }
          _v528323 = (_sum528324 <= 1);
          _map528322.put(_var2962, _v528323);

        }
        _conditional_result528307 = (java.util.Objects.equals((_sum528311 <= 1),
            _map528322.getOrDefault(__var16433528306, false)));
      } else {
        java.util.ArrayList<Integer> _var528328 = new java.util.ArrayList<Integer>();
        java.util.HashMap<Integer, Integer> _histogram528330 = new java.util.HashMap<Integer, Integer>();
        {
          Integer _count528332 = _histogram528330.getOrDefault(n, 0);
          _count528332 = (_count528332 + 1);
          _histogram528330.put(n, _count528332);

        }
        for (Integer _var528329 : _var23) {
          if ((_histogram528330.getOrDefault(_var528329, 0) > 0)) {
            Integer _count528333 = _histogram528330.getOrDefault(_var528329, 0);
            _count528333 = (_count528333 - 1);
            _histogram528330.put(_var528329, _count528333);

          } else {
            _var528328.add(_var528329);
          }
        }
        java.util.ArrayList<Integer> __var19833528334 = _var528328;
        java.util.HashMap<Integer, Boolean> _map528335 = new java.util.HashMap<Integer, Boolean>();
        for (Integer _var2962 : __var19833528334) {
          Boolean _v528336 = _map528335.getOrDefault(_var2962, false);
          Integer _sum528337 = 0;
          for (Integer __var2963528340 : __var19833528334) {
            if ((java.util.Objects.equals(_var2962, __var2963528340))) {
              {
                {
                  _sum528337 = (_sum528337 + 1);
                }
              }
            }
          }
          _v528336 = (_sum528337 <= 1);
          _map528335.put(_var2962, _v528336);

        }
        _conditional_result528307 = (java.util.Objects.equals(false,
            _map528335.getOrDefault(__var16433528306, false)));
      }
      Boolean _v528358;
      if ((!(_var10459.containsKey(__var16433528306)))) {
        _v528358 = true;
      } else {
        _v528358 = (!(_conditional_result528307));
      }
      if (_v528358) {
        {
          _var528304.add(__var16433528306);
        }
      }
    }
    java.util.ArrayList<Integer> _var528244 = _var528304;
    java.util.ArrayList<Integer> _var528354 = new java.util.ArrayList<Integer>();
    for (Integer __var2961528357 : (_var444).keySet()) {
      if ((java.util.Objects.equals(__var2961528357, n))) {
        {
          if (_var10459.getOrDefault(__var2961528357, false)) {
            {
              _var528354.add(__var2961528357);
            }
          }
        }
      }
    }
    java.util.ArrayList<Integer> _var528245 = _var528354;
    for (Integer _var16433 : _var528243) {
      _var10459.remove(_var16433);
    }
    for (Integer _var16433 : _var528244) {
      Boolean _var16434 = _var10459.getOrDefault(_var16433, false);
      _var16434 = true;
      _var10459.put(_var16433, _var16434);

    }
    if (_var444.containsKey(n)) {
      {
        _var23.remove(n);
      }
    }
    for (Integer _var916 : _var528245) {
      _var444.remove(_var916);
    }
  }
}
