package casestudies.eiffel;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

/**
 * This class implements the MAP [K, V] class from the file map.e in the Eiffel project AutoProof
 * 
 * @author Facundo Molina
 */
// Title: Map ADT
// Category: Data Structure
// Source: [VSI'08](http://web.cse.ohio-state.edu/~weide/rsrg/documents/2008/08WSHABBHKF.pdf)
// Abstract: Generic map ADT with layered data.
// Description: Implementation of a generic Map ADT based on two lists that contain the keys and
// values. Operations are implemented by doing linear search on the lists.
public class Map<K, V> {

  // feature {NONE} -- Initialization
  /**
   * -- Initialize empty map.
   */
  public Map() {
    keys = new LinkedList<K>();
    data = new LinkedList<V>();
    evospecid = (new Random()).nextInt(1000000);
  }

  // feature -- Access
  /**
   * -- Element with key `k'.
   */
  public V item(K k) {
    // require
    // has_key (k)
    boolean has_key = keys.contains(k);
    assert (has_key);

    // do
    int i = keys.indexOf(k);
    assert (0 <= i && i <= keys.size() - 1);
    V result = data.get(i);

    // ensure
    // across keys.sequence.domain as j some
    // k = keys.sequence[j.item] and Result = data.sequence[j.item]
    // end
    boolean exists_k = keys.contains(k);
    boolean result_ok = result == data.get(keys.indexOf(k));
    assert (exists_k && result_ok);
    return result;
  }

  /**
   * -- Number of elements in map.
   */
  public int count() {
    // do
    int result = keys.size();

    // ensure
    // Result = keys.sequence.count
    assert (result == keys.size());
    return result;
  }

  // feature -- Status report
  /**
   * -- Is there a key `k' in the map?
   */
  public boolean has_key(K k) {
    // do
    boolean result = keys.indexOf(k) >= 0;

    // ensure
    // Result = keys.sequence.has (k)
    assert (result == keys.contains(k));

    return result;
  }

  /**
   * -- Is there a value `v' in the map?
   */
  public boolean has_value(V v) {
    // do
    int i = 0;
    boolean result = false;
    while (i < data.size() && !result) {
      result = data.get(i) == v;
      i++;
    }

    // ensure
    // Result = data.sequence.has (v)
    assert (result == data.contains(v));

    return result;
  }

  // feature -- Element change
  /**
   * -- Extend map with key `k' mapped to `v'. Returns index of key `k' (ghost value).
   */
  public int extend(K k, V v) {
    // require
    // modify (current)

    // do
    int result = index_of_key(k);
    if (result >= 0) {
      data.set(result, v);
    } else {
      keys.add(k);
      data.add(v);
      result = keys.size() - 1;
    }

    // ensure
    // key_set: keys.sequence[Result] = k
    // data_set: data.sequence[Result] = v
    // other_keys_unchanged: keys.sequence.interval (1, Result-1) = old keys.sequence.interval (1,
    // Result-1)
    // other_keys_unchanged: keys.sequence.interval (Result+1, keys.sequence.count) = old
    // keys.sequence.interval (Result+1, keys.sequence.count)
    // other_data_unchanged: data.sequence.interval (1, Result-1) = old data.sequence.interval (1,
    // Result-1)
    // other_data_unchanged: data.sequence.interval (Result+1, data.sequence.count) = old
    // data.sequence.interval (Result+1, data.sequence.count)
    boolean key_set = keys.get(result) == k;
    boolean data_set = data.get(result) == v;
    assert (key_set && data_set);
    return result;
  }

  /**
   * -- Remove element mapped to `k'. Returns index of removed key `k' (ghost value).
   */
  public int remove(K k) {
    // require
    // has_key (k)
    // not_empty: count > 0
    // modify (Current)
    boolean has_key = has_key(k);
    boolean not_empty = count() > 0;
    if (!has_key)
      throw new IllegalArgumentException();
    if (!not_empty)
      throw new IllegalStateException();

    // do
    int result = index_of_key(k);
    keys.remove(result);
    data.remove(result);

    // ensure
    // result_is_index: old keys.sequence[Result] = k
    // key_removed: not keys.sequence.has (k)
    // other_keys_unchanged: keys.sequence.interval (1, Result-1) = old keys.sequence.interval (1,
    // Result-1)
    // other_keys_unchanged: keys.sequence.interval (Result, keys.sequence.count) = old
    // keys.sequence.interval (Result+1, keys.sequence.count+1)
    // other_data_unchanged: data.sequence.interval (1, Result-1) = old data.sequence.interval (1,
    // Result-1)
    // other_data_unchanged: data.sequence.interval (Result, data.sequence.count) = old
    // data.sequence.interval (Result+1, data.sequence.count+1)
    boolean key_removed = !keys.contains(k);
    assert (key_removed);
    return result;
  }

  // feature == Implementation
  /**
   * -- Index of key `k'.
   */
  public int index_of_key(K k) {
    // require

    // do
    int result = keys.indexOf(k);

    // ensure
    // 0 <= Result and Result <= count
    // Result > 0 implies keys.sequence[Result] = k
    // Result > 0 implies keys.sequence.to_bag.occurrences (k) = 1
    // Result = 0 implies not keys.sequence.has (k)
    // Result = 0 implies keys.sequence.to_bag.occurrences (k) = 0
    assert (-1 <= result && result < keys.size() && (result <= 0 || keys.get(result) == k)
        && (result != -1 || !keys.contains(k)));
    return result;
  }

  private LinkedList<K> keys; // -- Keys of this map.
  private LinkedList<V> data; // -- Values of this map.
  private int evospecid; // Random id to be used as an identifier for the object

  /**
   * Class invariant
   */
  public boolean invariant() {
    // keys /= Void and data /= Void and keys /= data
    // owns = [keys, data]
    // key_data_sync: keys.sequence.count = data.sequence.count
    // no_duplicates: keys.sequence.to_bag.is_constant (1)
    boolean keys_and_data_ok = keys != null && data != null && keys != data;
    boolean key_data_sync = keys.size() == data.size();
    Set<K> keys_set = new HashSet<>(keys);
    boolean no_duplicates = keys.size() == keys_set.size();
    return keys_and_data_ok && key_data_sync && no_duplicates;
  }

}
