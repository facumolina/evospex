package evospex.ga.operator;

import evospex.expression.ExprBuilder;
import evospex.ga.chromosome.gene.ExprGene;
import evospex.ga.chromosome.gene.ExprGeneType;
import evospex.ga.chromosome.gene.ExprGeneValue;

import java.util.LinkedList;
import java.util.List;

/**
 * Helper providing methods to perform actual mutations of gene expressions
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ExprGeneMutationHelper {

  /**
   * Returns a list of applicable mutations for the given gene expression
   * The list of mutations to apply basically depends on the gene type
   */
  public static List<String> getApplicableMutations(ExprGene gene) {
    ExprGeneType type = gene.getValue().getGeneType();
    LinkedList<String> applicableMutations = new LinkedList<>();

    if (gene.isPartOfSolution()) {
      // When the gene is part of a solution then just consider the mutation true
      applicableMutations.add(ExprGeneMutations.TO_TRUE);
      return applicableMutations;
    }

    boolean addTrueMutation = false;
    switch (type) {
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
      case NUMERIC_COMPARISON:
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
        applicableMutations.add(ExprGeneMutations.REPLACE_VALUE);
        applicableMutations.add(ExprGeneMutations.NEGATE_BODY);
        if (Number.class.isAssignableFrom(gene.getValue().getExpression().classOfValues())) {
          applicableMutations.add(ExprGeneMutations.REPLACE_OP);
        }
        // applicableMutations.add(DynAlloySpecLearnerMutations.TO_SOME);
        addTrueMutation = true;
        break;
      case FORALL_VAR_VAR:
        applicableMutations.add(ExprGeneMutations.NEGATE_BODY);
        applicableMutations.add(ExprGeneMutations.JOIN_COMPATIBLE_EXPR);
        addTrueMutation = true;
        break;
      case FORALL_VAR_VALUE_VAR_VALUE:
        applicableMutations.add(ExprGeneMutations.REPLACE_VALUE);
        applicableMutations.add(ExprGeneMutations.NEGATE_RIGHT_EQUALITY);
        if (Number.class.isAssignableFrom(gene.getValue().getExpression().classOfValues())) {
          applicableMutations.add(ExprGeneMutations.REPLACE_OP);
        }
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
    if (addTrueMutation && gene.getAmountOfGenesInChromosome() > 1)
      applicableMutations.add(ExprGeneMutations.TO_TRUE);

    return applicableMutations;
  }

  /**
   * Given a gene value, replace it's expression by true
   * @param geneValue is the gene value which expression is going to be changed.
   */
  public static void toTrue(ExprGeneValue geneValue) {
    if (geneValue==null) throw new IllegalArgumentException("The gene value can't be null");
    geneValue.setExpression(ExprBuilder.TRUE, false);
    geneValue.setGeneType(ExprGeneType.CONSTANT);
  }

}
