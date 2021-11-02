package evospex.ga.operator;

import java.util.Random;

import rfm.dynalloyCompiler.ast.ExprBinary.Op;

/**
 * This class contains all the possible mutations identifiers
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class GASpecLearnerMutations {

  // Common mutations
  public static final String TO_TRUE = "ToTrue";

  // Constant mutations
  public static final String PREVIOUS = "Previous";

  // Cardinality expressions mutations | Int comparisons
  public static final String ADD_ONE = "AddOne";
  public static final String SUB_ONE = "SubOne";
  public static final String ADD_EXPR = "AddExpr";
  public static final String SUB_EXPR = "SubExpr";
  public static final String REPLACE_RIGHT = "ReplaceRight";
  public static final String EQ_SUB_ONE = "EqSubOne";
  public static final String REPLACE_OP = "ReplaceOp";
  public static final Op[] BIN_OPERATORS = { Op.EQUALS, Op.GT, Op.GTE, Op.LT, Op.LTE };

  // Inclusion expression mutations
  public static final String REPLACE_INCLUDED = "ReplaceIncluded";
  public static final String REPLACE_SET = "ReplaceSet";

  // Unary expressions mutations
  public static final String SOME = "Some";
  public static final String EMPTYNESS = "Emptyness";

  // Binary expressions mutations
  public static final String JOIN_COMPATIBLE_EXPR = "JoinCompatibleExpr";

  // Unary and binary expressions mutations
  public static final String NEGATE = "Negate";

  // Quantified expressions mutations
  public static final String NEGATE_BODY = "NegateBody";
  public static final String TO_ALL = "ToAll";
  public static final String TO_SOME = "ToSome";
  public static final String INTERSECTION_NULL = "IntersectionNull";

  // Quantified expressions which bodies predicates with values
  public static final String REPLACE_VALUE = "ReplaceValue";
  public static final String NEGATE_RIGHT_EQUALITY = "NegateRightEquality";

  // Quantified expressions which bodies predicates with int values | Int comparisons
  public static final String OP_EQ = "OperatorEqual";
  public static final String OP_NOT_EQ = "OperatorNotEqual";
  public static final String OP_LTE = "OperatorLessThanOrEqual";
  public static final String OP_LT = "OperatorLessThan";
  public static final String OP_GTE = "OperatorGreaterThanOrEqual";
  public static final String OP_GT = "OperatorGreaterThan";

  public static final String CHANGE_IMPLIES = "ChangeImpliesValue";

  public static Op getRandomBinaryOperator() {
    Random r = new Random();
    return BIN_OPERATORS[r.nextInt(BIN_OPERATORS.length)];
  }
}
