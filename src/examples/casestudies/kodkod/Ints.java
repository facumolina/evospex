package casestudies.kodkod;

/**
 * Contains various utility methods for working with integers, {@link kodkod.util.ints.IntRange
 * IntRanges}, {@link kodkod.util.ints.IntSet IntSets}, and {@link kodkod.util.ints.SparseSequence
 * SparseSequences}.
 * 
 * <p>
 * The methods in this class all throw a NullPointerException if given a null reference unless
 * otherwise specified.
 * </p>
 * 
 * @author Emina Torlak
 */
public final class Ints {
  private static final int BITSET_CUTOFF = 1024;

  /**
   * Performs the bit avalanching step of Paul Hsieh's hashing function
   * (http://www.azillionmonkeys.com/qed/hash.html)
   * 
   * @return the bit avalanched version of the given hash value
   */
  public static int superFastHashAvalanche(int hash) {
    hash ^= hash << 3;
    hash += hash >> 5;
    hash ^= hash << 4;
    hash += hash >> 17;
    hash ^= hash << 25;
    hash += hash >> 6;
    return hash;
  }

  /**
   * Returns an integer whose value is the 16 low order bits of the given key.
   * 
   * @return key & 0x0000ffff
   */
  private static int low16(int key) {
    return key & 0x0000ffff;
  }

  /**
   * Returns an integer whose value is the 16 high order bits of the given key.
   * 
   * @return (key >>> 16) & 0x0000ffff
   */
  private static int high16(int key) {
    return low16(key >>> 16);
  }

  /**
   * Performs the hashing step of Paul Hsieh's hashing function, described at
   * http://www.azillionmonkeys.com/qed/hash.html. The method returns a 32 bit hash of the given
   * integer, starting with the given initial hash. <b>This method does not perform bit
   * avalanching.</b> To get the full hash, call {@linkplain #superFastHashAvalanche(int)} on the
   * value returned by this method.
   * 
   * @return a 32 bit hash of the given integer, based on the given hash
   */
  public static int superFastHashIncremental(int key, int hash) {

    hash += low16(key);
    final int tmp = (high16(key) << 11) ^ hash;
    hash = (hash << 16) ^ tmp;
    hash += hash >> 11;

    // no end cases since the key has exactly 4 bytes
    return hash;
  }

}
