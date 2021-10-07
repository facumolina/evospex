package evospex.expression.evaluator;

/**
 * This class represents exceptions to be used when an expression can't be evaluated since it cannot
 * be resolved to a concrete value
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class NonEvaluableExpressionException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public NonEvaluableExpressionException(String msg) {
    super(msg);
  }

}