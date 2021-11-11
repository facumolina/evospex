package utils;

/**
 * This class provides utilities for handling Java classes
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar></>
 */
public class JavaClassesUtils {

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
