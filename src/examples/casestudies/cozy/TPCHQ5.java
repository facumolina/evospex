package casestudies.cozy;

public class TPCHQ5 implements java.io.Serializable {
  protected java.util.ArrayList<Lineitem> _var5716;
  protected java.util.ArrayList<Integer> _var15722;
  protected java.util.HashMap<Integer, Boolean> _var38683;

  public TPCHQ5() {
    clear();
  }

  public TPCHQ5(java.util.ArrayList<Lineitem> lineitems) {
    _var5716 = lineitems;
    java.util.ArrayList<Integer> _var292573 = new java.util.ArrayList<Integer>();
    java.util.HashSet<Integer> _distinct_elems292575 = new java.util.HashSet<Integer>();
    for (Lineitem _i292576 : lineitems) {
      {
        Integer _var292574 = ((((((_i292576).getVal()).supplier).getVal()).nation).getVal()).id;
        if ((!((_distinct_elems292575.contains(_var292574))))) {
          _var292573.add(_var292574);
          _distinct_elems292575.add(_var292574);
        }
      }
    }
    _var15722 = _var292573;
    java.util.HashMap<Integer, Boolean> _map292577 = new java.util.HashMap<Integer, Boolean>();
    java.util.HashSet<Integer> _distinct_elems292579 = new java.util.HashSet<Integer>();
    for (Lineitem __var19064292580 : lineitems) {
      {
        Integer _var38492 = ((((((__var19064292580).getVal()).supplier).getVal()).nation)
            .getVal()).id;
        if ((!((_distinct_elems292579.contains(_var38492))))) {
          Boolean _v292578 = _map292577.getOrDefault(_var38492, false);
          _v292578 = true;
          _map292577.put(_var38492, _v292578);

          _distinct_elems292579.add(_var38492);
        }
      }
    }
    _var38683 = _map292577;
  }

  public void clear() {
    _var5716 = new java.util.ArrayList<Lineitem>();
    java.util.ArrayList<Integer> _var292581 = new java.util.ArrayList<Integer>();
    java.util.HashSet<Integer> _distinct_elems292583 = new java.util.HashSet<Integer>();
    _var15722 = _var292581;
    java.util.HashMap<Integer, Boolean> _map292585 = new java.util.HashMap<Integer, Boolean>();
    java.util.HashSet<Integer> _distinct_elems292587 = new java.util.HashSet<Integer>();
    _var38683 = _map292585;
  }

  public void selectLineitems(String p1, Integer p2, Integer p3,
      java.util.function.Consumer<Float> _callback) {
    for (Integer _id292590 : _var15722) {
      Float _sum292591 = 0f;
      for (Lineitem _i292598 : _var5716) {
        if ((((((_i292598).getVal()).order).getVal()).orderdate <= p3)) {
          {
            if ((((((_i292598).getVal()).order).getVal()).orderdate >= p2)) {
              {
                if ((java.util.Objects.equals(
                    ((((((((_i292598).getVal()).order).getVal()).customer).getVal()).nation)
                        .getVal()).id,
                    ((((((_i292598).getVal()).supplier).getVal()).nation).getVal()).id))) {
                  {
                    if ((java.util.Objects.equals(
                        ((((((((_i292598).getVal()).supplier).getVal()).nation).getVal()).region)
                            .getVal()).name,
                        p1))) {
                      {
                        if ((java.util.Objects.equals(
                            ((((((_i292598).getVal()).supplier).getVal()).nation).getVal()).id,
                            _id292590))) {
                          {
                            {
                              _sum292591 = (_sum292591 + ((((_i292598).getVal()).extendedprice)
                                  * ((1.0f - ((_i292598).getVal()).discount))));
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      {
        _callback.accept(_sum292591);
      }
    }
  }

  public void insertLineitem(Lineitem i) {
    java.util.ArrayList<Integer> _conditional_result292599 = new java.util.ArrayList<Integer>();
    if (_var38683.containsKey(((((((i).getVal()).supplier).getVal()).nation).getVal()).id)) {
      _conditional_result292599 = new java.util.ArrayList<Integer>();
    } else {
      java.util.ArrayList<Integer> _singleton292600 = new java.util.ArrayList<Integer>();
      _singleton292600.add(((((((i).getVal()).supplier).getVal()).nation).getVal()).id);
      _conditional_result292599 = _singleton292600;
    }
    java.util.ArrayList<Integer> _var292561 = _conditional_result292599;
    {
      _var5716.add(i);
    }
    if (_var38683.containsKey(((((((i).getVal()).supplier).getVal()).nation).getVal()).id)) {
    } else {
      {
        _var15722.add(((((((i).getVal()).supplier).getVal()).nation).getVal()).id);
      }
    }
    for (Integer _var39435 : _var292561) {
      Boolean _var39436 = _var38683.getOrDefault(_var39435, false);
      _var39436 = true;
      _var38683.put(_var39435, _var39436);

    }
  }

  public static class _Type292562 implements java.io.Serializable {
    private Integer id;
    private String name;

    public Integer getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public _Type292562(Integer id, String name) {
      this.id = id;
      this.name = name;
    }

    @Override
    public int hashCode() {
      int _hash_code292601 = 0;
      _hash_code292601 = (_hash_code292601 * 31) ^ ((id).hashCode());
      _hash_code292601 = (_hash_code292601 * 31) ^ ((name).hashCode());
      return _hash_code292601;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type292562))
        return false;
      _Type292562 o = (_Type292562) other;
      Boolean _v292602;
      if ((java.util.Objects.equals(this.id, o.id))) {
        _v292602 = (java.util.Objects.equals(this.name, o.name));
      } else {
        _v292602 = false;
      }
      return _v292602;
    }
  }

  public static class Region extends _Type292562 implements java.io.Serializable {
    public _Type292562 getVal() {
      return this;
    }

    public Region(Integer _v292603, String _v292604) {
      super(_v292603, _v292604);
    }
  }

  public static class _Type292564 implements java.io.Serializable {
    private Integer id;
    private Region region;

    public Integer getId() {
      return id;
    }

    public Region getRegion() {
      return region;
    }

    public _Type292564(Integer id, Region region) {
      this.id = id;
      this.region = region;
    }

    @Override
    public int hashCode() {
      int _hash_code292605 = 0;
      _hash_code292605 = (_hash_code292605 * 31) ^ ((id).hashCode());
      _hash_code292605 = (_hash_code292605 * 31) ^ ((region).hashCode());
      return _hash_code292605;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type292564))
        return false;
      _Type292564 o = (_Type292564) other;
      Boolean _v292606;
      if ((java.util.Objects.equals(this.id, o.id))) {
        _v292606 = (java.util.Objects.equals(this.region, o.region));
      } else {
        _v292606 = false;
      }
      return _v292606;
    }
  }

  public static class Nation extends _Type292564 implements java.io.Serializable {
    public _Type292564 getVal() {
      return this;
    }

    public Nation(Integer _v292607, Region _v292608) {
      super(_v292607, _v292608);
    }
  }

  public static class _Type292566 implements java.io.Serializable {
    private Integer id;
    private Nation nation;

    public Integer getId() {
      return id;
    }

    public Nation getNation() {
      return nation;
    }

    public _Type292566(Integer id, Nation nation) {
      this.id = id;
      this.nation = nation;
    }

    @Override
    public int hashCode() {
      int _hash_code292609 = 0;
      _hash_code292609 = (_hash_code292609 * 31) ^ ((id).hashCode());
      _hash_code292609 = (_hash_code292609 * 31) ^ ((nation).hashCode());
      return _hash_code292609;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type292566))
        return false;
      _Type292566 o = (_Type292566) other;
      Boolean _v292610;
      if ((java.util.Objects.equals(this.id, o.id))) {
        _v292610 = (java.util.Objects.equals(this.nation, o.nation));
      } else {
        _v292610 = false;
      }
      return _v292610;
    }
  }

  public static class Supplier extends _Type292566 implements java.io.Serializable {
    public _Type292566 getVal() {
      return this;
    }

    public Supplier(Integer _v292611, Nation _v292612) {
      super(_v292611, _v292612);
    }
  }

  public static class Customer extends _Type292566 implements java.io.Serializable {
    public _Type292566 getVal() {
      return this;
    }

    public Customer(Integer _v292613, Nation _v292614) {
      super(_v292613, _v292614);
    }
  }

  public static class _Type292569 implements java.io.Serializable {
    private Integer id;
    private Integer orderdate;
    private Customer customer;

    public Integer getId() {
      return id;
    }

    public Integer getOrderdate() {
      return orderdate;
    }

    public Customer getCustomer() {
      return customer;
    }

    public _Type292569(Integer id, Integer orderdate, Customer customer) {
      this.id = id;
      this.orderdate = orderdate;
      this.customer = customer;
    }

    @Override
    public int hashCode() {
      int _hash_code292615 = 0;
      _hash_code292615 = (_hash_code292615 * 31) ^ ((id).hashCode());
      _hash_code292615 = (_hash_code292615 * 31) ^ ((orderdate).hashCode());
      _hash_code292615 = (_hash_code292615 * 31) ^ ((customer).hashCode());
      return _hash_code292615;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type292569))
        return false;
      _Type292569 o = (_Type292569) other;
      Boolean _v292616;
      if ((java.util.Objects.equals(this.id, o.id))) {
        Boolean _v292617;
        if ((java.util.Objects.equals(this.orderdate, o.orderdate))) {
          _v292617 = (java.util.Objects.equals(this.customer, o.customer));
        } else {
          _v292617 = false;
        }
        _v292616 = _v292617;
      } else {
        _v292616 = false;
      }
      return _v292616;
    }
  }

  public static class Order extends _Type292569 implements java.io.Serializable {
    public _Type292569 getVal() {
      return this;
    }

    public Order(Integer _v292618, Integer _v292619, Customer _v292620) {
      super(_v292618, _v292619, _v292620);
    }
  }

  public static class _Type292571 implements java.io.Serializable {
    private Integer id;
    private Float extendedprice;
    private Float discount;
    private Supplier supplier;
    private Order order;

    public Integer getId() {
      return id;
    }

    public Float getExtendedprice() {
      return extendedprice;
    }

    public Float getDiscount() {
      return discount;
    }

    public Supplier getSupplier() {
      return supplier;
    }

    public Order getOrder() {
      return order;
    }

    public _Type292571(Integer id, Float extendedprice, Float discount, Supplier supplier,
        Order order) {
      this.id = id;
      this.extendedprice = extendedprice;
      this.discount = discount;
      this.supplier = supplier;
      this.order = order;
    }

    @Override
    public int hashCode() {
      int _hash_code292621 = 0;
      _hash_code292621 = (_hash_code292621 * 31) ^ ((id).hashCode());
      _hash_code292621 = (_hash_code292621 * 31) ^ ((extendedprice).hashCode());
      _hash_code292621 = (_hash_code292621 * 31) ^ ((discount).hashCode());
      _hash_code292621 = (_hash_code292621 * 31) ^ ((supplier).hashCode());
      _hash_code292621 = (_hash_code292621 * 31) ^ ((order).hashCode());
      return _hash_code292621;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type292571))
        return false;
      _Type292571 o = (_Type292571) other;
      Boolean _v292622;
      Boolean _v292623;
      if ((java.util.Objects.equals(this.id, o.id))) {
        _v292623 = (java.util.Objects.equals(this.extendedprice, o.extendedprice));
      } else {
        _v292623 = false;
      }
      if (_v292623) {
        Boolean _v292624;
        if ((java.util.Objects.equals(this.discount, o.discount))) {
          Boolean _v292625;
          if ((java.util.Objects.equals(this.supplier, o.supplier))) {
            _v292625 = (java.util.Objects.equals(this.order, o.order));
          } else {
            _v292625 = false;
          }
          _v292624 = _v292625;
        } else {
          _v292624 = false;
        }
        _v292622 = _v292624;
      } else {
        _v292622 = false;
      }
      return _v292622;
    }
  }

  public static class Lineitem extends _Type292571 implements java.io.Serializable {
    public _Type292571 getVal() {
      return this;
    }

    public Lineitem(Integer _v292626, Float _v292627, Float _v292628, Supplier _v292629,
        Order _v292630) {
      super(_v292626, _v292627, _v292628, _v292629, _v292630);
    }
  }
}
