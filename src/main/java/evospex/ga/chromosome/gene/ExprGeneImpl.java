package evospex.ga.chromosome.gene;

import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import utils.TargetInformation;

public class ExprGeneImpl extends ExprGene {

  public ExprGeneImpl(Configuration a_conf, ExprGeneValue value, TargetInformation info)
          throws InvalidConfigurationException {
    super(a_conf, value, info);
  }

  @Override
  protected Gene newGeneInternal() {
    try {
      return new ExprGeneImpl(getConfiguration(), value.clone(), targetInfo);
    } catch (InvalidConfigurationException ex) {
      throw new IllegalStateException(ex.getMessage());
    }
  }

  /**
   * Apply mutation according to the gene type
   */
  public void applyMutation(int index, double a_percentage) {
    try {
      updatePreviousExpression(value.clone());
      switch (value.getGeneType()) {
        case CARDINALITY:
          applyCardinalityMutation();
          break;
        case CONSTANT:
          applyConstantMutation();
          break;
        case EMPTYNESS:
          applyEmptynessMutation();
          break;
        case EQUALITY:
          applyEqualityMutation();
          break;
        case NUMERIC_COMPARISON:
          applyIntComparisonMutation();
          break;
        case NEGATION:
          applyNegationMutation();
          break;
        case INCLUSION:
          applyInclusionMutation();
          break;
        case FORALL:
          applyForAllMutation();
          break;
        case FORALL_VAR_VALUE:
          applyForAllVarValueMutation();
          break;
        case FORALL_VAR_VAR:
          applyForAllVarVarMutation();
          break;
        case FORALL_VAR_VALUE_VAR_VALUE:
          applyForAllVarValueVarValueMutation();
          break;
        case FORALL_VAR_VALUES_DOUBLE_INT_COMPARISON:
          applyForAllVarValuesDoubleIntComparisonMutation();
          break;
        case FORALL_VAR_VALUES_DOUBLE_QT_INT_COMPARISON:
          applyForAllVarValuesDoubleQuantificationIntComparisonMutation();
          break;
        case FORALL_VAR_SET:
          applyForAllVarSetMutation();
          break;
        case FORALL_SET_SET:
          applyForAllSetSetMutation();
          break;
        case SOME:
          applySomeMutation();
          break;
        case SOME_VAR_VAR:
          applySomeVarVarMutation();
          break;
        case SOME_VAR_SET:
          applySomeVarSetMutation();
          break;
        case SOME_SET_SET:
          applySomeSetSetMutation();
          break;
        case SOMEQT:
          applySomeQuantifierMutation();
          break;
        case NO:
          applyNoMutation();
          break;
        default:
          applyDefaultMutation();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  protected ExprGeneImpl clone() {
    try {
      return new ExprGeneImpl(getConfiguration(), value.clone(), targetInfo);
    } catch (InvalidConfigurationException ex) {
      throw new IllegalStateException(ex.getMessage());
    }
  }

}