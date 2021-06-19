package casestudies.cozy;

public class Graph implements java.io.Serializable {
  protected java.util.HashMap<Integer, Integer> _var2957;

  public Graph() {
    clear();
  }

  public Graph(java.util.ArrayList<Node> nodes, java.util.ArrayList<Edge> edges) {
    java.util.HashMap<Integer, Integer> _map276489 = new java.util.HashMap<Integer, Integer>();
    for (Edge _e276491 : edges) {
      {
        Integer _var1769 = ((_e276491).getVal()).src;
        Integer _v276490 = _map276489.getOrDefault(_var1769, 0);
        Integer _sum276492 = 0;
        for (Edge _e276495 : edges) {
          if ((java.util.Objects.equals(((_e276495).getVal()).src, _var1769))) {
            {
              {
                _sum276492 = (_sum276492 + 1);
              }
            }
          }
        }
        _v276490 = _sum276492;
        _map276489.put(_var1769, _v276490);

      }
    }
    _var2957 = _map276489;
  }

  public void clear() {
    java.util.HashMap<Integer, Integer> _map276496 = new java.util.HashMap<Integer, Integer>();
    _var2957 = _map276496;
  }

  public Integer out_degree(Integer nodeId) {
    return _var2957.getOrDefault(nodeId, 0);
  }

  public void addNode(Node n) {
  }

  public void addEdge(Edge e) {
    {
      Integer _var12266 = _var2957.getOrDefault(((e).getVal()).src, 0);
      _var12266 = (_var12266 + 1);
      _var2957.put(((e).getVal()).src, _var12266);

    }
  }

  public static class _Type276485 implements java.io.Serializable {
    private Integer id;

    public Integer getId() {
      return id;
    }

    public _Type276485(Integer id) {
      this.id = id;
    }

    @Override
    public int hashCode() {
      int _hash_code276503 = 0;
      _hash_code276503 = (_hash_code276503 * 31) ^ ((id).hashCode());
      return _hash_code276503;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type276485))
        return false;
      _Type276485 o = (_Type276485) other;
      return (java.util.Objects.equals(this.id, o.id));
    }
  }

  public static class Node extends _Type276485 implements java.io.Serializable {
    public _Type276485 getVal() {
      return this;
    }

    public Node(Integer _v276504) {
      super(_v276504);
    }
  }

  public static class _Type276487 implements java.io.Serializable {
    private Integer src;
    private Integer dst;

    public Integer getSrc() {
      return src;
    }

    public Integer getDst() {
      return dst;
    }

    public _Type276487(Integer src, Integer dst) {
      this.src = src;
      this.dst = dst;
    }

    @Override
    public int hashCode() {
      int _hash_code276505 = 0;
      _hash_code276505 = (_hash_code276505 * 31) ^ ((src).hashCode());
      _hash_code276505 = (_hash_code276505 * 31) ^ ((dst).hashCode());
      return _hash_code276505;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type276487))
        return false;
      _Type276487 o = (_Type276487) other;
      Boolean _v276506;
      if ((java.util.Objects.equals(this.src, o.src))) {
        _v276506 = (java.util.Objects.equals(this.dst, o.dst));
      } else {
        _v276506 = false;
      }
      return _v276506;
    }
  }

  public static class Edge extends _Type276487 implements java.io.Serializable {
    public _Type276487 getVal() {
      return this;
    }

    public Edge(Integer _v276507, Integer _v276508) {
      super(_v276507, _v276508);
    }
  }
}
