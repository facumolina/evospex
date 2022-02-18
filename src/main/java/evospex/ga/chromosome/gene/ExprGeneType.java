package evospex.ga.chromosome.gene;

/**
 * This class represents the types of the gene's value depending which type of expression contains
 * the value.
 * 
 * @author fmolina
 */
public enum ExprGeneType {

  CARDINALITY, CONSTANT, EMPTYNESS, EQUALITY, NUMERIC_COMPARISON, FORALL_VAR_VALUE, FORALL_VAR_VAR, FORALL_VAR_VALUE_VAR_VALUE, FORALL_VAR_VALUES_DOUBLE_INT_COMPARISON, FORALL_VAR_VALUES_DOUBLE_QT_INT_COMPARISON, FORALL_VAR_SET, FORALL_SET_SET, SOME_VAR_VAR, SOME_VAR_SET, SOME_SET_SET, SOME_VAR_VALUE, SOME_VAR_VALUE_VAR_VALUE, FORALL, INCLUSION, NEGATION, NO, SOME, SOMEQT;

  @Override
  public String toString() {
    switch (this) {
    case CARDINALITY:
      return "CARDINALITY";
    case CONSTANT:
      return "CONSTANT";
    case EMPTYNESS:
      return "EMPTYNESS";
    case EQUALITY:
      return "EQUALITY";
    case NUMERIC_COMPARISON:
      return "NUMERIC_COMPARISON";
    case INCLUSION:
      return "INCLUSION";
    case FORALL:
      return "FORALL";
    case FORALL_VAR_VALUE:
      return "FORALL_VAR_VALUE";
    case FORALL_VAR_VAR:
      return "FORALL_VAR_VAR";
    case FORALL_VAR_VALUE_VAR_VALUE:
      return "FORALL_VAR_VALUE_VAR_VALUE";
    case FORALL_VAR_VALUES_DOUBLE_INT_COMPARISON:
      return "FORALL_VAR_VALUES_DOUBLE_INT_COMPARISON";
    case FORALL_VAR_SET:
      return "FORALL_VAR_SET";
    case FORALL_SET_SET:
      return "FORALL_SET_SET";
    case NEGATION:
      return "NEGATION";
    case NO:
      return "NO";
    case SOME:
      return "SOME";
    case SOME_VAR_VAR:
      return "SOME_VAR_VAR";
    case SOME_VAR_SET:
      return "SOME_VAR_SET";
    case SOME_SET_SET:
      return "SOME_SET_SET";
    case SOMEQT:
      return "SOMEQT";
    default:
      return "";
    }
  }

}
