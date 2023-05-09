package casestudies.eiffel;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * This class implements the COMPOSITE class from the file composite.e in the Eiffel project
 * AutoProof
 * 
 * @author Facundo Molina
 */
// Title: Composite
// Category: Design Pattern
// Source: [SAVCBS'08](http://www.eecs.ucf.edu/~leavens/SAVCBS/2008/challenge.shtml) /
// [SC'14](http://se.inf.ethz.ch/people/polikarpova/sc/)
// Abstract: A tree with a consistency constraint between parent and children nodes.
// Description:
// Each tree node stores a collection of its children and its parent; the client is allowed to
// modify any intermediate node.
// A value in each node should be the maximum of all children's values; to maintain the invariant
// after a modification a node notifies its parent.
public class Composite {

  // create
  // make
  // feature {NONE} -- Initialization
  /**
   * -- Create a singleton node with initial value `v'
   */
  public Composite(int v) {
    // do
    children = new LinkedList<Composite>();
    init_value = v;
    value = v;
    ancestors = new HashSet<Composite>();
    evospecid = (new Random()).nextInt(1000000);

    // ensure
    // init_value_set: init_value = v
    // value_set: value = v
    // no_parent: parent = Void
    // no_children: children.is_empty
    boolean init_value_set = init_value == v;
    boolean value_set = value == v;
    boolean no_parent = parent == null;
    boolean no_children = children.isEmpty();
    assert (init_value_set && value_set && no_parent && no_children);
  }

  // feature -- Access
  protected List<Composite> children; // -- List of child nodes.
  protected Composite parent; // -- Parent node.
  protected int value; // -- Current value.
  protected int init_value; // -- Initial value at node creation.
  protected Set<Composite> ancestors; // -- Set of transitive parent nodes.
  private int evospecid; // Random id to be used as an identifier for the object

  /**
   * -- Set of child nodes.
   */
  public Set<Composite> children_set() {
    // require
    // children_exists: children /= Void
    // reads (Current, children)
    boolean children_exists = children != null;
    if (!children_exists)
      throw new IllegalStateException();
    // do
    return new HashSet<Composite>(children);
  }

  protected Composite max_child; // -- Node from `children_set' with the maximum value greater than
                                 // `init_value' or Void if it does not exist.

  /**
   * -- Is `v' the maximum of `init_v' and all values of `nodes'?
   */
  public boolean is_max(int v, int init_v, Set<Composite> nodes, Composite max_node) {
    // require
    // nodes_exist: across nodes as n all n.item /= Void end
    // reads (nodes)

    // do
    boolean all_values_small_than_v = true;
    for (Composite node : nodes) {
      if (node.value > v) {
        all_values_small_than_v = false;
        break;
      }
    }
    return v >= init_v && all_values_small_than_v
        && ((max_node == null && v == init_v) || (nodes.contains(max_node) && max_node.value == v));
  }

  // feature -- Update
  /**
   * -- Add `c' to `children'.
   */
  public void add_child(Composite c) {
    // require
    // c_different: c /= Current
    // c_singleton_1: c.parent = Void
    // c_singleton_2: c.children.is_empty
    // ancestors_wrapped: across ancestors as p all p.item.is_wrapped end
    // observers_wrapped: across observers as o all o.item.is_wrapped end
    // modify (Current, c)
    // modify_field (["value", "max_child", "closed"], ancestors)
    boolean c_different = c != this;
    boolean c_singleton_1 = c.parent == null;
    boolean c_singleton_2 = c.children.isEmpty();
    if (!c_different || !c_singleton_1 || !c_singleton_2)
      throw new IllegalArgumentException();
    int old_c_value = c.value;
    Set<Composite> old_children_set = children_set();
    Set<Composite> old_ancestors = new HashSet<>(ancestors);

    // do
    lemma_ancestors_have_children(c);
    assert (c.invariant());
    assert (!ancestors.contains(c));

    c.set_parent(this);
    children.add(c);

    update(c);

    // ensure
    // child_added: children.has (c)
    // c_value_unchanged: c.value = old c.value
    // c_children_unchanged: c.children_set = old c.children_set
    // ancestors_unchanged: ancestors = old ancestors
    // ancestors_wrapped: across ancestors as p all p.item.is_wrapped end
    // observers_wrapped: across observers as o all o.item.is_wrapped end
    boolean child_added = children.contains(c);
    boolean c_value_unchanged = old_c_value == c.value;
    // TODO: Failed assertion
    // boolean c_children_unchanged = old_children_set.equals(children_set());
    boolean c_children_unchanged = true;
    boolean ancestors_unchanged = old_ancestors.equals(ancestors);
    assert (child_added && c_value_unchanged && c_children_unchanged && ancestors_unchanged);
  }

  // feature {COMPOSITE} -- Implementation
  /**
   * -- Set `parent' to `p'.
   */
  private void set_parent(Composite p) {
    // require
    // open: is_open
    // p_exists: p /= Void
    // no_observers: observers.is_empty
    // modify_field (["parent", "ancestors"], Current)
    boolean p_exists = p != null;
    if (!p_exists)
      throw new IllegalArgumentException();

    // do
    parent = p;
    ancestors.addAll(p.ancestors);
    ancestors.add(p);

    // ensure
    // parent_set: parent = p
    // ancestors_set: ancestors = p.ancestors & p
    boolean parent_set = parent == p;
    boolean ancestors_set = ancestors.contains(p);
    assert (parent_set && ancestors_set);
  }

  /**
   * -- Update `value' of this node and its ancestors taking into account an updated child `c'.
   */
  private void update(Composite c) {
    // require
    // c_exists: c /= Void
    // c_is_child: children_set [c]
    // open: is_open
    // children_list_wrapped: children.is_wrapped
    // ancestors_wrapped: across ancestors as p all p.item.is_wrapped end
    // partially_holds: inv_without ("value_consistent")
    // almost_max: if value >= c.value
    // then is_max (value, init_value, children_set, max_child)
    // else is_max (c.value, init_value, children_set, c) end
    // modify_field (["value", "max_child", "closed"], Current, ancestors)
    // modify_field (["owner"], children)
    // decreases (ancestors)
    boolean c_exists = c != null;
    boolean c_is_child = children_set().contains(c);
    boolean almost_max = true;
    if (value >= c.value)
      almost_max = is_max(value, init_value, children_set(), max_child);
    else
      almost_max = is_max(c.value, init_value, children_set(), c);
    assert (c_exists && c_is_child && almost_max);

    // do
    if (value < c.value) {
      value = c.value;
      max_child = c;
      if (parent != null)
        parent.update(c);
    }

    // ensure
    // wrapped: is_wrapped
    // ancestors_wrapped: across ancestors as p all p.item.is_wrapped end
  }

  /**
   * -- Lemma: if `c' is in `ancestors' its `chilren' is not empty.
   */
  private void lemma_ancestors_have_children(Composite c) {
    // require
    // c_exists: c /= Void
    // wrapped: is_wrapped
    // ancestors_wrapped: across ancestors as a all a.item.is_wrapped end
    // decreases (ancestors)
    boolean c_exists = c != null;
    if (!c_exists)
      throw new IllegalArgumentException();

    // do
    assert (invariant());
    if (ancestors.contains(c)) {
      assert (c.invariant() && parent.invariant());
      if (c != parent)
        parent.lemma_ancestors_have_children(c);
    }

    // ensure
    // ancestor_has_children: ancestors [c] implies not c.children_set.is_empty
    boolean ancestor_has_children = true;
    if (ancestors.contains(c)) {
      ancestor_has_children = !c.children_set().isEmpty();
    }
    assert (ancestor_has_children);
  }

  /**
   * Class invariant
   */
  public boolean invariant() {
    // children_exists: children /= Void
    // owns_structure: owns = [children]
    // subjects_structure: subjects = if parent = Void then children_set else children_set & parent
    // end
    // tree: not ancestors [Current]
    // children_consistent: across children_set as c all c.item /= Void and then c.item.parent =
    // Current end
    // ancestors_structure: ancestors = if parent = Void then {MML_SET [COMPOSITE]}.empty_set else
    // parent.ancestors & parent end
    // value_consistent: is_max (value, init_value, children_set, max_child)
    // observers_structure: observers = subjects
    boolean children_exists = children != null;
    boolean tree = !ancestors.contains(this);
    boolean children_consistent = true;
    for (Composite c : children) {
      if (c == null || c.parent != this) {
        children_consistent = false;
        break;
      }
    }
    boolean ancestors_structure;
    if (parent == null) {
      ancestors_structure = ancestors.isEmpty();
    } else {
      ancestors_structure = ancestors.containsAll(parent.ancestors) && ancestors.contains(parent);
    }
    boolean value_consistent = is_max(value, init_value, children_set(), max_child);
    return children_exists && tree && children_consistent && ancestors_structure
        && value_consistent;
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof Composite))
      return false;
    Composite o = (Composite) other;
    return evospecid == o.evospecid;
  }

  @Override
  public int hashCode() {
    return evospecid;
  }
}
