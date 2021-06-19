package hamcrest.assertion;

import hamcrest.expression.HamcrestExpr;
import method.MethodExecution;

/**
 * This class represents a Hamcrest assertion
 * 
 * @author fmolina
 *
 */
public abstract class HamcrestAssertion {

  /**
   * Evaluate the assertion in the given object
   * 
   * @return true iff the assertion is consistent with the given object
   */
  public abstract boolean evaluate(MethodExecution me);

  /**
   * Get the expression
   */
  public abstract HamcrestExpr getExpr();

  /**
   * Returns true if the assertion can be evaluated in negative objects
   * 
   * An assertion can be evaluated in a negative object only if the expressions represents a
   * property about the final state of the object invoking the method
   */
  public abstract boolean evaluableInNegatives();

}
