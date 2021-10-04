package evospex.expression;

/**
 * This class all the expressions operators
 *
 * Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ExprOperator {

  // Unary operators
  public static String NOT_1 = "!";
  public static String NOT_2 = "not";
  public static String CARDINALITY = "#";

  // Comparison operators
  public static final String EQ = "=";
  public static final String NOT_EQ = "!=";
  public static final String IN = "in";
  public static final String NOT_IN = "not in";
  public static final String LESS = "<";
  public static final String LESS_EQ = "<=";
  public static final String GREAT = ">";
  public static final String GREAT_EQ = ">=";

  // Binary operators
  public static final String OR_1 = "||";
  public static final String OR_2 = "or";
  public static final String AND_1 = "&&";
  public static final String AND_2 = "and";
  public static final String IMPLIES_1 = "implies";
  public static final String IMPLIES_2 = "=>";
  public static final String IFF = "iff";
  public static final String XOR = "xor";
  public static final String INTERSECT = "&";
  public static final String JOIN = ".";

  // Binary numeric operators
  public static final String PLUS = "+";
  public static final String MINUS = "-";
  public static final String MULT = "*";
  public static final String DIV = "/";
  public static final String MOD = "%";

  // Closure operators
  public static final String R_CLOSURE = "*";
  public static final String RT_CLOSURE = "^";

  // Quantifiers
  public static final String ALL = "all";
  public static final String SOME = "some";
  public static final String LONE = "lone";
  public static final String ONE = "one";
  public static final String NO = "no";

}
