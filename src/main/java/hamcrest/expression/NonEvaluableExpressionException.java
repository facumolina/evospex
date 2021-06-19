package hamcrest.expression;

/**
 * This class represents exceptions to be used wheh a HamcrestExpr cannot be evaluated since the
 * expression cannot be resolved to a concrete value
 * 
 * @author fmolina
 */
public class NonEvaluableExpressionException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public NonEvaluableExpressionException(String msg) {
    super(msg);
  }

}
