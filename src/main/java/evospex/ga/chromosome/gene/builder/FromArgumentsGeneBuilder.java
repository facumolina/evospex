package evospex.ga.chromosome.gene.builder;

import evospex.EvoSpexParameters;
import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.symbol.ExprName;
import evospex.ga.chromosome.gene.ExprGene;
import evospex.ga.chromosome.gene.ExprGeneType;
import evospex.ga.chromosome.gene.ExprGeneValue;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import sun.awt.image.ImageWatched;
import utils.TargetInformation;

import java.util.LinkedList;
import java.util.List;

public class FromArgumentsGeneBuilder extends GeneBuilder {

  /**
   * Constructor
   */
  public FromArgumentsGeneBuilder(Configuration conf, TargetInformation info, EvoSpexParameters params) {
    super(conf, info, params);
  }
  @Override
  public List<Gene> build() throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    List<Object> argsExamples = EvoSpexParameters.ARGS_EXAMPLES;
    if (argsExamples == null)
      return genes;
    int argPos = 0;
    for (Object arg : argsExamples) {
      String argLabel = ExprName.getArgLabel(argPos);
      genes.addAll(createGenesFromArgValue(arg, argLabel));
      argPos++;
    }
    return genes;
  }

  /**
   * Create a set of genes using from a method's argument value
   * @param argValue is a possible value for the argument
   * @param argLabel is a label identifying the argument
   * @throws InvalidConfigurationException
   */
  public List<Gene> createGenesFromArgValue(Object argValue, String argLabel) throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    if (argValue != null) {
      // argLabel = #(e) where e is a closured expression
      Expr argExpr = ExprBuilder.toExpr(argLabel, argValue.getClass());
      targetInfo.addVariableForType(argValue.getClass(), argLabel);
      if (argValue instanceof Integer) {
        // The value is an instance of an integer, thus for the argument argLabel we can create genes with expressions such as:
        // argLabel = e where e is an integer expression.
        for (Expr expr : targetInfo.getIntEvaluableExpressions()) {
          ExprGeneValue newValue = new ExprGeneValue(ExprBuilder.eq(argExpr, expr), ExprGeneType.NUMERIC_COMPARISON);
          genes.add(new ExprGene(conf, newValue, targetInfo));
        }
      } else {
        // The value is a reference
        List<Expr> evaluable = targetInfo.getEvaluableExpressionsOfType(argValue.getClass());
        for (Expr expr : evaluable) {
          Expr geneExpr = ExprBuilder.eq(ExprBuilder.toExpr(argLabel,argValue.getClass()), expr);
          System.out.println("Created eq expr for arg: "+geneExpr);
          ExprGeneValue newValue = new ExprGeneValue(geneExpr, ExprGeneType.EQUALITY);
          genes.add(new ExprGene(conf, newValue, targetInfo));
        }
      }

      // Create more genes using the argument expression and the closured expressions
      genes.addAll(createGenesFromArgumentAndSets(argExpr));

      // Create more genes using the argument expression and collections
      genes.addAll(addAssertionsConsideringCollections(argLabel, argExpr));
    } else {
      throw new UnsupportedOperationException("Decide what to do when arg is null");
    }
    return genes;
  }

  /**
   * Create genes from arguments and sets.
   * For each set expression s containing elems of the same type as the argument, a gene with
   * the following expression will be created:
   * - argExpr in s
   * @param argExpr is the argument expression
   * @return a list of genes combining the given argument with sets of the same type
   */
  private List<Gene> createGenesFromArgumentAndSets(Expr argExpr) {
    List<Gene> genes = new LinkedList<>();
    List<Expr> setsOfType = targetInfo.getSetsOfType(argExpr.type());
    setsOfType.forEach(set -> {
      if (!set.isPreState() || parameters.learnPre()) {
        try {
          Expr inExpr = ExprBuilder.in(argExpr, set);
          ExprGeneValue geneValue = new ExprGeneValue(inExpr, ExprGeneType.INCLUSION);
          genes.add(new ExprGene(conf, geneValue, targetInfo));
        } catch (InvalidConfigurationException e) {
          throw new IllegalStateException("Invalid config exception when adding considering expr: " + set);
        }
      }
    });
    return genes;
  }

  /**
   * Add assertions combining the argument with the given level with Collections
   */
  private List<Gene> addAssertionsConsideringCollections(String argLabel, Expr argExpr) throws InvalidConfigurationException {
    List<Gene> genes = new LinkedList<>();
    if (targetInfo.existsSetOfType(argExpr.type())) {
      List<Expr> collections = targetInfo.getSetsOfType(argExpr.type());
      for (Expr expr : collections) {
        // Create a gene with the expression argLabel in collection
        Expr geneExpr = ExprBuilder.in(ExprBuilder.toExpr(argLabel, expr.type()), expr);
        ExprGeneValue geneValue = new ExprGeneValue(geneExpr, ExprGeneType.INCLUSION);
        genes.add(new ExprGene(conf, geneValue, targetInfo));
      }
    }
    return genes;
  }

}
