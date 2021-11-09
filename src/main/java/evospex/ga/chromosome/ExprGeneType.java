package evospex.ga.chromosome;

import java.util.LinkedList;
import java.util.List;

import evospex.ga.operator.ExprGeneMutations;

/**
 * This class represents the types of the gene's value depending which type of expression contains
 * the value.
 * 
 * @author fmolina
 */
public enum ExprGeneType {

  CARDINALITY, CONSTANT, EMPTYNESS, EQUALITY, INT_COMPARISON, FORALL_VAR_VALUE, FORALL_VAR_VAR, FORALL_VAR_VALUE_VAR_VALUE, FORALL_VAR_VALUE_VAR_VALUE_INT_COMPARISON, FORALL_VAR_VALUES_DOUBLE_INT_COMPARISON, FORALL_VAR_VALUES_DOUBLE_QT_INT_COMPARISON, FORALL_VAR_SET, FORALL_SET_SET, SOME_VAR_VAR, SOME_VAR_SET, SOME_SET_SET, SOME_VAR_VALUE, SOME_VAR_VALUE_VAR_VALUE, FORALL, INCLUSION, NEGATION, NO, SOME, SOMEQT;

  /**
   * Returns the list of applicable mutations to the expr gene type
   */
  public List<String> getApplicableMutations(int amountOfGenes, boolean isPartSolution) {
    LinkedList<String> applicableMutations = new LinkedList<>();

    if (isPartSolution) {
      // When the gene is part of a solution then just consider the mutation true
      applicableMutations.add(ExprGeneMutations.TO_TRUE);
      return applicableMutations;
    }

    boolean addTrueMutation = false;
    switch (this) {
    case CARDINALITY:
      applicableMutations.add(ExprGeneMutations.ADD_ONE);
      applicableMutations.add(ExprGeneMutations.SUB_ONE);
      addTrueMutation = true;
      break;
    case CONSTANT:
      applicableMutations.add(ExprGeneMutations.PREVIOUS);
      addTrueMutation = true;
      break;
    case EMPTYNESS:
      applicableMutations.add(ExprGeneMutations.SOME);
      addTrueMutation = true;
      break;
    case EQUALITY:
      applicableMutations.add(ExprGeneMutations.NEGATE);
      addTrueMutation = true;
      break;
    case INT_COMPARISON:
      // applicableMutations.add(GASpecLearnerMutations.NEGATE);
      applicableMutations.add(ExprGeneMutations.ADD_ONE);
      applicableMutations.add(ExprGeneMutations.SUB_ONE);
      applicableMutations.add(ExprGeneMutations.ADD_EXPR);
      applicableMutations.add(ExprGeneMutations.SUB_EXPR);
      applicableMutations.add(ExprGeneMutations.REPLACE_RIGHT);
      // applicableMutations.add(GASpecLearnerMutations.EQ_SUB_ONE);
      // applicableMutations.add(GASpecLearnerMutations.OP_EQ);
      // applicableMutations.add(GASpecLearnerMutations.OP_LT);
      // applicableMutations.add(GASpecLearnerMutations.OP_LTE);
      // applicableMutations.add(GASpecLearnerMutations.OP_GT);
      // applicableMutations.add(GASpecLearnerMutations.OP_GTE);
      applicableMutations.add(ExprGeneMutations.REPLACE_OP);
      addTrueMutation = true;
      break;
    case INCLUSION:
      applicableMutations.add(ExprGeneMutations.NEGATE);
      applicableMutations.add(ExprGeneMutations.REPLACE_INCLUDED);
      // if (ContextInformation.hasCollections()) {
      applicableMutations.add(ExprGeneMutations.REPLACE_SET);
      // }
      addTrueMutation = true;
      break;
    case FORALL:
      applicableMutations.add(ExprGeneMutations.NEGATE_BODY);
      applicableMutations.add(ExprGeneMutations.TO_SOME);
      addTrueMutation = true;
      break;
    case FORALL_VAR_VALUE:
      applicableMutations.add(ExprGeneMutations.NEGATE_BODY);
      // applicableMutations.add(DynAlloySpecLearnerMutations.TO_SOME);
      addTrueMutation = true;
      break;
    case FORALL_VAR_VAR:
      applicableMutations.add(ExprGeneMutations.NEGATE_BODY);
      applicableMutations.add(ExprGeneMutations.JOIN_COMPATIBLE_EXPR);
      addTrueMutation = true;
      break;
    case FORALL_VAR_VALUE_VAR_VALUE:
      // applicableMutations.add(DynAlloySpecLearnerMutations.NEGATE_BODY);
      applicableMutations.add(ExprGeneMutations.REPLACE_VALUE);
      applicableMutations.add(ExprGeneMutations.NEGATE_RIGHT_EQUALITY);
      addTrueMutation = true;
      break;
    case FORALL_VAR_VALUE_VAR_VALUE_INT_COMPARISON:
      applicableMutations.add(ExprGeneMutations.OP_NOT_EQ);
      applicableMutations.add(ExprGeneMutations.OP_LTE);
      applicableMutations.add(ExprGeneMutations.OP_LT);
      applicableMutations.add(ExprGeneMutations.OP_GTE);
      applicableMutations.add(ExprGeneMutations.OP_GT);
      // applicableMutations.add(GASpecLearnerMutations.CHANGE_IMPLIES);
      addTrueMutation = true;
      break;
    case FORALL_VAR_VALUES_DOUBLE_INT_COMPARISON:
      applicableMutations.add(ExprGeneMutations.OP_NOT_EQ);
      applicableMutations.add(ExprGeneMutations.OP_LTE);
      applicableMutations.add(ExprGeneMutations.OP_LT);
      applicableMutations.add(ExprGeneMutations.OP_GTE);
      applicableMutations.add(ExprGeneMutations.OP_GT);
      // applicableMutations.add(GASpecLearnerMutations.CHANGE_IMPLIES);
      addTrueMutation = true;
      break;
    case FORALL_VAR_VALUES_DOUBLE_QT_INT_COMPARISON:
      addTrueMutation = true;
      break;
    case FORALL_VAR_SET:
      applicableMutations.add(ExprGeneMutations.NEGATE_BODY);
      addTrueMutation = true;
      break;
    case FORALL_SET_SET:
      applicableMutations.add(ExprGeneMutations.INTERSECTION_NULL);
      applicableMutations.add(ExprGeneMutations.NEGATE_BODY);
      addTrueMutation = true;
      break;
    case NEGATION:
      applicableMutations.add(ExprGeneMutations.NEGATE);
      addTrueMutation = true;
      break;
    case NO:
      applicableMutations.add(ExprGeneMutations.TO_SOME);
      addTrueMutation = true;
      break;
    case SOME:
      applicableMutations.add(ExprGeneMutations.EMPTYNESS);
      addTrueMutation = true;
      break;
    case SOMEQT:
      applicableMutations.add(ExprGeneMutations.NEGATE_BODY);
      applicableMutations.add(ExprGeneMutations.TO_ALL);
      addTrueMutation = true;
      break;
    case SOME_VAR_VAR:
      applicableMutations.add(ExprGeneMutations.NEGATE_BODY);
      applicableMutations.add(ExprGeneMutations.TO_ALL);
      addTrueMutation = true;
      break;
    case SOME_VAR_SET:
      applicableMutations.add(ExprGeneMutations.NEGATE_BODY);
      applicableMutations.add(ExprGeneMutations.TO_ALL);
      addTrueMutation = true;
      break;
    case SOME_SET_SET:
      applicableMutations.add(ExprGeneMutations.NEGATE_BODY);
      applicableMutations.add(ExprGeneMutations.INTERSECTION_NULL);
      applicableMutations.add(ExprGeneMutations.TO_ALL);
      addTrueMutation = true;
      break;
    default:
      return applicableMutations;
    }
    if (addTrueMutation && amountOfGenes > 1)
      applicableMutations.add(ExprGeneMutations.TO_TRUE);

    return applicableMutations;
  }

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
    case INT_COMPARISON:
      return "INT_COMPARISON";
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
    case FORALL_VAR_VALUE_VAR_VALUE_INT_COMPARISON:
      return "FORALL_VAR_VALUE_VAR_VALUE_INT_COMPARISON";
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
