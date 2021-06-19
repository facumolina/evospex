package casestudies.cozy;

public class Map implements java.io.Serializable {
  protected java.util.ArrayList<Integer> _var29;
  protected java.util.HashMap<Integer, java.util.ArrayList<Integer>> _var653;
  protected java.util.HashMap<Integer, Boolean> _var175912;
  protected java.util.HashMap<Integer, Boolean> _var190325;

  public Map() {
    clear();
  }

  public Map(java.util.ArrayList<Integer> xs) {
    _var29 = xs;
    java.util.HashMap<Integer, java.util.ArrayList<Integer>> _map285264 = new java.util.HashMap<Integer, java.util.ArrayList<Integer>>();
    for (Integer _x285266 : xs) {
      {
        java.util.ArrayList<Integer> _v285265 = _map285264.getOrDefault(_x285266,
            new java.util.ArrayList<Integer>());
        java.util.ArrayList<Integer> _var285267 = new java.util.ArrayList<Integer>();
        for (Integer _x285269 : xs) {
          if ((java.util.Objects.equals(_x285269, _x285266))) {
            {
              _var285267.add(_x285269);
            }
          }
        }
        _v285265 = _var285267;
        _map285264.put(_x285266, _v285265);

      }
    }
    _var653 = _map285264;
    java.util.HashMap<Integer, Boolean> _map285270 = new java.util.HashMap<Integer, Boolean>();
    for (Integer _var174737 : xs) {
      Boolean _v285271 = _map285270.getOrDefault(_var174737, false);
      Integer _sum285272 = 0;
      for (Integer __var174738285275 : xs) {
        if ((java.util.Objects.equals(_var174737, __var174738285275))) {
          {
            {
              _sum285272 = (_sum285272 + 1);
            }
          }
        }
      }
      _v285271 = (_sum285272 > 1);
      _map285270.put(_var174737, _v285271);

    }
    _var175912 = _map285270;
    java.util.HashMap<Integer, Boolean> _map285276 = new java.util.HashMap<Integer, Boolean>();
    for (Integer _var190280 : xs) {
      Boolean _v285277 = _map285276.getOrDefault(_var190280, false);
      _v285277 = true;
      _map285276.put(_var190280, _v285277);

    }
    _var190325 = _map285276;
  }

  public void clear() {
    _var29 = new java.util.ArrayList<Integer>();
    java.util.HashMap<Integer, java.util.ArrayList<Integer>> _map285278 = new java.util.HashMap<Integer, java.util.ArrayList<Integer>>();
    _var653 = _map285278;
    java.util.HashMap<Integer, Boolean> _map285284 = new java.util.HashMap<Integer, Boolean>();
    _var175912 = _map285284;
    java.util.HashMap<Integer, Boolean> _map285286 = new java.util.HashMap<Integer, Boolean>();
    _var190325 = _map285286;
  }

  public void a(Integer z, java.util.function.Consumer<Integer> _callback) {
    for (Integer _x285288 : _var653.getOrDefault(z, new java.util.ArrayList<Integer>())) {
      _callback.accept(_x285288);
    }
  }

  public void add(Integer x) {
    java.util.ArrayList<Integer> _var285289 = new java.util.ArrayList<Integer>();
    java.util.ArrayList<Integer> _var285318 = new java.util.ArrayList<Integer>();
    for (Integer _var285319 : _var29) {
      _var285318.add(_var285319);
    }
    {
      _var285318.add(x);
    }
    java.util.ArrayList<Integer> __var180454285320 = _var285318;
    java.util.HashMap<Integer, Boolean> _map285321 = new java.util.HashMap<Integer, Boolean>();
    for (Integer _var174737 : __var180454285320) {
      Boolean _v285322 = _map285321.getOrDefault(_var174737, false);
      Integer _sum285323 = 0;
      for (Integer __var174738285326 : __var180454285320) {
        if ((java.util.Objects.equals(_var174737, __var174738285326))) {
          {
            {
              _sum285323 = (_sum285323 + 1);
            }
          }
        }
      }
      _v285322 = (_sum285323 > 1);
      _map285321.put(_var174737, _v285322);

    }
    for (Integer __var178812285291 : (_map285321).keySet()) {
      Boolean _conditional_result285292 = false;
      Boolean _found285293 = false;
      _label285295: do {
        for (Integer _x285294 : _var29) {
          if ((java.util.Objects.equals(_x285294, __var178812285291))) {
            _found285293 = true;
            break _label285295;
          }
        }
      } while (false);
      if (_found285293) {
        Integer _sum285296 = 0;
        for (Integer __var174738285299 : _var29) {
          if ((java.util.Objects.equals(__var178812285291, __var174738285299))) {
            {
              {
                _sum285296 = (_sum285296 + 1);
              }
            }
          }
        }
        java.util.ArrayList<Integer> _var285300 = new java.util.ArrayList<Integer>();
        for (Integer _var285301 : _var29) {
          _var285300.add(_var285301);
        }
        {
          _var285300.add(x);
        }
        java.util.ArrayList<Integer> __var180457285302 = _var285300;
        java.util.HashMap<Integer, Boolean> _map285303 = new java.util.HashMap<Integer, Boolean>();
        for (Integer _var174737 : __var180457285302) {
          Boolean _v285304 = _map285303.getOrDefault(_var174737, false);
          Integer _sum285305 = 0;
          for (Integer __var174738285308 : __var180457285302) {
            if ((java.util.Objects.equals(_var174737, __var174738285308))) {
              {
                {
                  _sum285305 = (_sum285305 + 1);
                }
              }
            }
          }
          _v285304 = (_sum285305 > 1);
          _map285303.put(_var174737, _v285304);

        }
        _conditional_result285292 = (java.util.Objects.equals((_sum285296 > 1),
            _map285303.getOrDefault(__var178812285291, false)));
      } else {
        java.util.ArrayList<Integer> _var285309 = new java.util.ArrayList<Integer>();
        for (Integer _var285310 : _var29) {
          _var285309.add(_var285310);
        }
        {
          _var285309.add(x);
        }
        java.util.ArrayList<Integer> __var180457285311 = _var285309;
        java.util.HashMap<Integer, Boolean> _map285312 = new java.util.HashMap<Integer, Boolean>();
        for (Integer _var174737 : __var180457285311) {
          Boolean _v285313 = _map285312.getOrDefault(_var174737, false);
          Integer _sum285314 = 0;
          for (Integer __var174738285317 : __var180457285311) {
            if ((java.util.Objects.equals(_var174737, __var174738285317))) {
              {
                {
                  _sum285314 = (_sum285314 + 1);
                }
              }
            }
          }
          _v285313 = (_sum285314 > 1);
          _map285312.put(_var174737, _v285313);

        }
        _conditional_result285292 = (java.util.Objects.equals(false,
            _map285312.getOrDefault(__var178812285291, false)));
      }
      Boolean _v285342;
      if ((!(_var175912.containsKey(__var178812285291)))) {
        _v285342 = true;
      } else {
        _v285342 = (!(_conditional_result285292));
      }
      if (_v285342) {
        {
          _var285289.add(__var178812285291);
        }
      }
    }
    java.util.ArrayList<Integer> _var285260 = _var285289;
    java.util.ArrayList<Integer> _var285327 = new java.util.ArrayList<Integer>();
    java.util.HashSet<Integer> _distinct_elems285341 = new java.util.HashSet<Integer>();
    for (Integer __var191658285329 : _var29) {
      if ((!((_distinct_elems285341.contains(__var191658285329))))) {
        Boolean _conditional_result285330 = false;
        Boolean _found285331 = false;
        _label285333: do {
          for (Integer _x285332 : _var29) {
            if ((java.util.Objects.equals(_x285332, __var191658285329))) {
              _found285331 = true;
              break _label285333;
            }
          }
        } while (false);
        if (_found285331) {
          Boolean _conditional_result285334 = false;
          Boolean _found285335 = false;
          _label285337: do {
            {
              if ((java.util.Objects.equals(x, __var191658285329))) {
                _found285335 = true;
                break _label285337;
              }
            }
          } while (false);
          if (true) {
            _conditional_result285334 = true;
          } else {
            _conditional_result285334 = (java.util.Objects.equals(true, false));
          }
          _conditional_result285330 = _conditional_result285334;
        } else {
          Boolean _found285338 = false;
          _label285340: do {
            {
              if ((java.util.Objects.equals(x, __var191658285329))) {
                _found285338 = true;
                break _label285340;
              }
            }
          } while (false);
          Boolean _v285343;
          if ((!(_found285338))) {
            _v285343 = true;
          } else {
            _v285343 = (java.util.Objects.equals(false, true));
          }
          _conditional_result285330 = _v285343;
        }
        Boolean _v285344;
        if ((!(_var190325.containsKey(__var191658285329)))) {
          _v285344 = true;
        } else {
          _v285344 = (!(_conditional_result285330));
        }
        if (_v285344) {
          {
            _var285327.add(__var191658285329);
          }
        }
        _distinct_elems285341.add(__var191658285329);
      }
    }
    {
      if ((!((_distinct_elems285341.contains(x))))) {
        Boolean _conditional_result285330 = false;
        Boolean _found285331 = false;
        _label285333: do {
          for (Integer _x285332 : _var29) {
            if ((java.util.Objects.equals(_x285332, x))) {
              _found285331 = true;
              break _label285333;
            }
          }
        } while (false);
        if (_found285331) {
          Boolean _conditional_result285334 = false;
          Boolean _found285335 = false;
          _label285337: do {
            {
              if ((java.util.Objects.equals(x, x))) {
                _found285335 = true;
                break _label285337;
              }
            }
          } while (false);
          if (true) {
            _conditional_result285334 = true;
          } else {
            _conditional_result285334 = (java.util.Objects.equals(true, false));
          }
          _conditional_result285330 = _conditional_result285334;
        } else {
          Boolean _found285338 = false;
          _label285340: do {
            {
              if ((java.util.Objects.equals(x, x))) {
                _found285338 = true;
                break _label285340;
              }
            }
          } while (false);
          Boolean _v285345;
          if ((!(_found285338))) {
            _v285345 = true;
          } else {
            _v285345 = (java.util.Objects.equals(false, true));
          }
          _conditional_result285330 = _v285345;
        }
        Boolean _v285346;
        if ((!(_var190325.containsKey(x)))) {
          _v285346 = true;
        } else {
          _v285346 = (!(_conditional_result285330));
        }
        if (_v285346) {
          {
            _var285327.add(x);
          }
        }
        _distinct_elems285341.add(x);
      }
    }
    java.util.ArrayList<Integer> _var285261 = _var285327;
    {
      java.util.ArrayList<Integer> _var962 = _var653.getOrDefault(x,
          new java.util.ArrayList<Integer>());
      {
        _var962.add(x);
      }
      _var653.put(x, _var962);

    }
    for (Integer _var191658 : _var285261) {
      Boolean _var191659 = _var190325.getOrDefault(_var191658, false);
      _var191659 = true;
      _var190325.put(_var191658, _var191659);

    }
    for (Integer _var178812 : _var285260) {
      Boolean _var178813 = _var175912.getOrDefault(_var178812, false);
      _var178813 = _var190325.containsKey(_var178812);
      _var175912.put(_var178812, _var178813);

    }
    {
      _var29.add(x);
    }
  }

  public void rm(Integer x) {
    java.util.ArrayList<Integer> _conditional_result285347 = new java.util.ArrayList<Integer>();
    if (_var175912.getOrDefault(x, false)) {
      _conditional_result285347 = new java.util.ArrayList<Integer>();
    } else {
      java.util.ArrayList<Integer> _singleton285404 = new java.util.ArrayList<Integer>();
      _singleton285404.add(x);
      _conditional_result285347 = _singleton285404;
    }
    java.util.ArrayList<Integer> _var285262 = _conditional_result285347;
    java.util.ArrayList<Integer> _var285348 = new java.util.ArrayList<Integer>();
    java.util.ArrayList<Integer> _var285385 = new java.util.ArrayList<Integer>();
    java.util.HashMap<Integer, Integer> _histogram285387 = new java.util.HashMap<Integer, Integer>();
    {
      Integer _count285389 = _histogram285387.getOrDefault(x, 0);
      _count285389 = (_count285389 + 1);
      _histogram285387.put(x, _count285389);

    }
    for (Integer _var285386 : _var29) {
      if ((_histogram285387.getOrDefault(_var285386, 0) > 0)) {
        Integer _count285390 = _histogram285387.getOrDefault(_var285386, 0);
        _count285390 = (_count285390 - 1);
        _histogram285387.put(_var285386, _count285390);

      } else {
        _var285385.add(_var285386);
      }
    }
    java.util.ArrayList<Integer> __var183811285391 = _var285385;
    java.util.HashMap<Integer, Boolean> _map285392 = new java.util.HashMap<Integer, Boolean>();
    for (Integer _var174737 : __var183811285391) {
      Boolean _v285393 = _map285392.getOrDefault(_var174737, false);
      Integer _sum285394 = 0;
      for (Integer __var174738285397 : __var183811285391) {
        if ((java.util.Objects.equals(_var174737, __var174738285397))) {
          {
            {
              _sum285394 = (_sum285394 + 1);
            }
          }
        }
      }
      _v285393 = (_sum285394 > 1);
      _map285392.put(_var174737, _v285393);

    }
    for (Integer __var181136285350 : (_map285392).keySet()) {
      Boolean _conditional_result285351 = false;
      Boolean _found285352 = false;
      _label285354: do {
        for (Integer _x285353 : _var29) {
          if ((java.util.Objects.equals(_x285353, __var181136285350))) {
            _found285352 = true;
            break _label285354;
          }
        }
      } while (false);
      if (_found285352) {
        Integer _sum285355 = 0;
        for (Integer __var174738285358 : _var29) {
          if ((java.util.Objects.equals(__var181136285350, __var174738285358))) {
            {
              {
                _sum285355 = (_sum285355 + 1);
              }
            }
          }
        }
        java.util.ArrayList<Integer> _var285359 = new java.util.ArrayList<Integer>();
        java.util.HashMap<Integer, Integer> _histogram285361 = new java.util.HashMap<Integer, Integer>();
        {
          Integer _count285363 = _histogram285361.getOrDefault(x, 0);
          _count285363 = (_count285363 + 1);
          _histogram285361.put(x, _count285363);

        }
        for (Integer _var285360 : _var29) {
          if ((_histogram285361.getOrDefault(_var285360, 0) > 0)) {
            Integer _count285364 = _histogram285361.getOrDefault(_var285360, 0);
            _count285364 = (_count285364 - 1);
            _histogram285361.put(_var285360, _count285364);

          } else {
            _var285359.add(_var285360);
          }
        }
        java.util.ArrayList<Integer> __var183812285365 = _var285359;
        java.util.HashMap<Integer, Boolean> _map285366 = new java.util.HashMap<Integer, Boolean>();
        for (Integer _var174737 : __var183812285365) {
          Boolean _v285367 = _map285366.getOrDefault(_var174737, false);
          Integer _sum285368 = 0;
          for (Integer __var174738285371 : __var183812285365) {
            if ((java.util.Objects.equals(_var174737, __var174738285371))) {
              {
                {
                  _sum285368 = (_sum285368 + 1);
                }
              }
            }
          }
          _v285367 = (_sum285368 > 1);
          _map285366.put(_var174737, _v285367);

        }
        _conditional_result285351 = (java.util.Objects.equals((_sum285355 > 1),
            _map285366.getOrDefault(__var181136285350, false)));
      } else {
        java.util.ArrayList<Integer> _var285372 = new java.util.ArrayList<Integer>();
        java.util.HashMap<Integer, Integer> _histogram285374 = new java.util.HashMap<Integer, Integer>();
        {
          Integer _count285376 = _histogram285374.getOrDefault(x, 0);
          _count285376 = (_count285376 + 1);
          _histogram285374.put(x, _count285376);

        }
        for (Integer _var285373 : _var29) {
          if ((_histogram285374.getOrDefault(_var285373, 0) > 0)) {
            Integer _count285377 = _histogram285374.getOrDefault(_var285373, 0);
            _count285377 = (_count285377 - 1);
            _histogram285374.put(_var285373, _count285377);

          } else {
            _var285372.add(_var285373);
          }
        }
        java.util.ArrayList<Integer> __var183812285378 = _var285372;
        java.util.HashMap<Integer, Boolean> _map285379 = new java.util.HashMap<Integer, Boolean>();
        for (Integer _var174737 : __var183812285378) {
          Boolean _v285380 = _map285379.getOrDefault(_var174737, false);
          Integer _sum285381 = 0;
          for (Integer __var174738285384 : __var183812285378) {
            if ((java.util.Objects.equals(_var174737, __var174738285384))) {
              {
                {
                  _sum285381 = (_sum285381 + 1);
                }
              }
            }
          }
          _v285380 = (_sum285381 > 1);
          _map285379.put(_var174737, _v285380);

        }
        _conditional_result285351 = (java.util.Objects.equals(false,
            _map285379.getOrDefault(__var181136285350, false)));
      }
      Boolean _v285405;
      if ((!(_var175912.containsKey(__var181136285350)))) {
        _v285405 = true;
      } else {
        _v285405 = (!(_conditional_result285351));
      }
      if (_v285405) {
        {
          _var285348.add(__var181136285350);
        }
      }
    }
    java.util.ArrayList<Integer> _var285263 = _var285348;
    if (_var175912.getOrDefault(x, false)) {
    } else {
      {
        _var653.remove(x);
      }
    }
    java.util.HashSet<Integer> _distinct_elems285399 = new java.util.HashSet<Integer>();
    java.util.HashMap<Integer, Integer> _histogram285400 = new java.util.HashMap<Integer, Integer>();
    {
      Integer _count285402 = _histogram285400.getOrDefault(x, 0);
      _count285402 = (_count285402 + 1);
      _histogram285400.put(x, _count285402);

    }
    for (Integer __var4079285398 : _var29) {
      if ((_histogram285400.getOrDefault(__var4079285398, 0) > 0)) {
        Integer _count285403 = _histogram285400.getOrDefault(__var4079285398, 0);
        _count285403 = (_count285403 - 1);
        _histogram285400.put(__var4079285398, _count285403);

      } else {
        if ((!((_distinct_elems285399.contains(__var4079285398))))) {
          if ((java.util.Objects.equals(x, __var4079285398))) {
            {
              java.util.ArrayList<Integer> _var4080 = _var653.getOrDefault(__var4079285398,
                  new java.util.ArrayList<Integer>());
              {
                _var4080.remove(x);
              }
              _var653.put(__var4079285398, _var4080);

            }
          }
          _distinct_elems285399.add(__var4079285398);
        }
      }
    }
    if (_var175912.getOrDefault(x, false)) {
    } else {
      {
        _var190325.remove(x);
      }
    }
    for (Integer _var181136 : _var285262) {
      _var175912.remove(_var181136);
    }
    for (Integer _var181136 : _var285263) {
      Boolean _var181137 = _var175912.getOrDefault(_var181136, false);
      _var181137 = false;
      _var175912.put(_var181136, _var181137);

    }
    {
      _var29.remove(x);
    }
  }
}
