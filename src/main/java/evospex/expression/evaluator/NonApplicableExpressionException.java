package expression;

/**
 * This class represents the NonApplicableExpressionException, which is thrown when an expression is
 * not applicable for a particular class.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class NonApplicableExpressionException extends RuntimeException {

  public NonApplicableExpressionException(String errorMessage) {
    super(errorMessage);
  }

}
