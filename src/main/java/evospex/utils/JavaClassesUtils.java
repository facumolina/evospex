package evospex.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * This class provides utilities for handling Java classes
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar></>
 */
public class JavaClassesUtils {

  /**
   * Guess type of collection object
   */
  public static Class<?> guessElementType(Collection<?> collection) {
    Class<?> guess = null;
    for (Object o : collection) {
      if (o != null) {
        if (guess == null) {
          guess = o.getClass();
        } else if (guess != o.getClass()) {
          guess = JavaClassesUtils.lowestCommonSuper(guess, o.getClass());
        }
      }
    }
    return guess;
  }

  private static Set<Class<?>> supers(Class<?> c) {
    if (c == null)
      return new HashSet<>();
    Set<Class<?>> s = supers(c.getSuperclass());
    s.add(c);
    return s;
  }

  public static Class<?> lowestCommonSuper(Class<?> a, Class<?> b) {
    Set<Class<?>> aSupers = supers(a);
    while (!aSupers.contains(b)) {
      b = b.getSuperclass();
    }
    return b;
  }

  /**
   * Check if the given class is a numeric class
   * @param cl is the given class
   * @return true iff cl is a numeric class
   */
  public static boolean isNumber(Class<?> cl) {
    if (cl == null) throw new IllegalArgumentException();
    return Number.class.isAssignableFrom(cl);
  }

}
