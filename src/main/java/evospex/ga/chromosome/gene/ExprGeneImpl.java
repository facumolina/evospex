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

  @Override
  public ExprGene mutate() throws InvalidConfigurationException {
    try {
      updatePreviousExpression(value.clone());
      switch (value.getGeneType()) {
        case CARDINALITY:
          return applyCardinalityMutation();
        case CONSTANT:
          return applyConstantMutation();
        case EMPTYNESS:
          return applyEmptynessMutation();
        case EQUALITY:
          return applyEqualityMutation();
        case NUMERIC_COMPARISON:
          return applyIntComparisonMutation();
        case NEGATION:
          return applyNegationMutation();
        case INCLUSION:
          return applyInclusionMutation();
        case FORALL:
          return applyForAllMutation();
        case FORALL_VAR_VALUE:
          return applyForAllVarValueMutation();
        case FORALL_VAR_VAR:
          return applyForAllVarVarMutation();
        case FORALL_VAR_VALUE_VAR_VALUE:
          return applyForAllVarValueVarValueMutation();
        case FORALL_VAR_VALUES_DOUBLE_INT_COMPARISON:
          return applyForAllVarValuesDoubleIntComparisonMutation();
        case FORALL_VAR_VALUES_DOUBLE_QT_INT_COMPARISON:
          return applyForAllVarValuesDoubleQuantificationIntComparisonMutation();
        case FORALL_VAR_SET:
          return applyForAllVarSetMutation();
        case FORALL_SET_SET:
          return applyForAllSetSetMutation();
        case SOME:
          return applySomeMutation();
        case SOME_VAR_VAR:
          return applySomeVarVarMutation();
        case SOME_VAR_SET:
          return applySomeVarSetMutation();
        case SOME_SET_SET:
          return applySomeSetSetMutation();
        case SOMEQT:
          return applySomeQuantifierMutation();
        case NO:
          return applyNoMutation();
        default:
          return applyDefaultMutation();
      }
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    }
  }

  /**
   * Apply mutation according to the gene type
   */
  public void applyMutation(int index, double a_percentage) { }

  @Override
  protected ExprGeneImpl clone() {
    try {
      return new ExprGeneImpl(getConfiguration(), value.clone(), targetInfo);
    } catch (InvalidConfigurationException ex) {
      throw new IllegalStateException(ex.getMessage());
    }
  }

}