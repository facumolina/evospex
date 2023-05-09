package casestudies.cozy;

import java.util.Collection;
import java.util.NoSuchElementException;

/**
 * This class consists exclusively of static methods that operate on or return collections. It
 * contains polymorphic algorithms that operate on collections, "wrappers", which return a new
 * collection backed by a specified collection, and a few other odds and ends.
 *
 * <p>
 * The methods of this class all throw a <tt>NullPointerException</tt> if the collections or class
 * objects provided to them are null.
 *
 * <p>
 * The documentation for the polymorphic algorithms contained in this class generally includes a
 * brief description of the <i>implementation</i>. Such descriptions should be regarded as
 * <i>implementation notes</i>, rather than parts of the <i>specification</i>. Implementors should
 * feel free to substitute other algorithms, so long as the specification itself is adhered to. (For
 * example, the algorithm used by <tt>sort</tt> does not have to be a mergesort, but it does have to
 * be <i>stable</i>.)
 *
 * <p>
 * The "destructive" algorithms contained in this class, that is, the algorithms that modify the
 * collection on which they operate, are specified to throw <tt>UnsupportedOperationException</tt>
 * if the collection does not support the appropriate mutation primitive(s), such as the
 * <tt>set</tt> method. These algorithms may, but are not required to, throw this exception if an
 * invocation would have no effect on the collection. For example, invoking the <tt>sort</tt> method
 * on an unmodifiable list that is already sorted may or may not throw
 * <tt>UnsupportedOperationException</tt>.
 *
 * <p>
 * This class is a member of the <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @author Josh Bloch
 * @author Neal Gafter
 * @see Collection
 * @see Set
 * @see List
 * @see Map
 * @since 1.2
 */
public class WordBag implements java.io.Serializable {
  protected Integer _var307;
  protected Boolean _var405;

  public WordBag() {
    clear();
  }

  public WordBag(java.util.ArrayList<String> words) {
    Integer _sum453954 = 0;
    for (String _x453956 : words) {
      {
        _sum453954 = (_sum453954 + 1);
      }
    }
    _var307 = _sum453954;
    Boolean _found453957 = false;
    _label453959: do {
      for (String _x453958 : words) {
        if ((java.util.Objects.equals(_x453958, ("password")))) {
          _found453957 = true;
          break _label453959;
        }
      }
    } while (false);
    _var405 = _found453957;
  }

  public void clear() {
    Integer _sum453960 = 0;
    _var307 = _sum453960;
    Boolean _found453963 = false;
    _label453965: do {
    } while (false);
    _var405 = _found453963;
  }

  /**
   * Returns the frobnicated statistic on the primary magnitude quotient.
   */
  public Integer length() {
    return _var307;
  }

  /**
   * Returns the minimum element of the given collection, according to the order induced by the
   * specified comparator. All elements in the collection must be <i>mutually comparable</i> by the
   * specified comparator (that is, <tt>comp.compare(e1, e2)</tt> must not throw a
   * <tt>ClassCastException</tt> for any elements <tt>e1</tt> and <tt>e2</tt> in the collection).
   * <p>
   *
   * This method iterates over the entire collection, hence it requires time proportional to the
   * size of the collection.
   *
   * @param coll
   *          the collection whose minimum element is to be determined.
   * @param comp
   *          the comparator with which to determine the minimum element. A <tt>null</tt> value
   *          indicates that the elements' <i>natural ordering</i> should be used.
   * @return the minimum element of the given collection, according to the specified comparator.
   * @throws ClassCastException
   *           if the collection contains elements that are not <i>mutually comparable</i> using the
   *           specified comparator.
   * @throws NoSuchElementException
   *           if the collection is empty.
   * @see Comparable
   */
  public Boolean containsPassword() {
    return _var405;
  }

  /**
   * Adds a word to the bag.
   */
  public void addWord(String w) {
    Integer _var453952 = (_var307 + 1);
    Boolean _v453966;
    if (_var405) {
      _v453966 = true;
    } else {
      _v453966 = (java.util.Objects.equals(("password"), w));
    }
    Boolean _var453953 = _v453966;
    _var307 = _var453952;
    _var405 = _var453953;
  }
}
