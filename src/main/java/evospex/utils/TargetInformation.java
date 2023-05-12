package evospex.utils;

import java.util.*;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.symbol.ExprName;
import evospex.expression.symbol.ExprOperator;
import evospex.target.TypeGraph;
import evospex.target.TypeGraphEdge;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DirectedPseudograph;

/**
 * This class keeps some useful information regarding the target class and method.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class TargetInformation {

  private Class<?> cut; // The current cut
  private TypeGraph typeGraph; // Current cut type graph
  private DirectedPseudograph<String, DefaultEdge> structureGraph; // Graph maintaining the current target class relations


  private final int scope; // Scope (defined in the alloy file)

  // Structures handling expressions extracted by traversing the type graph
  private List<Expr> joinedExpressions; // Contains expressions of the form e.f
  private List<Expr> joinedExpressionsOfTypeInt;// Contains int/Integer expressions build from target
  private List<Expr> allIntExpressions; // Contains all int/Integer expressions (target and vars and results)
  private List<Expr> simpleClosuredExpressions; // Contains expressions of the form e.*f
  private List<Expr> doubleClosuredExpressions; // Contains expressions of the from e.*(f+g)
  private Map<Class<?>, Set<Expr>> joineableExpressionsByType; // Joineable expressions for each type
  private Map<Class<?>, List<Expr>> setsByType; // Expressions denoting sets grouped by type

  // Evaluation related structures
  private Map<Class<?>, List<Object>> typeEvaluations; // Types and evaluation values
  private Map<String, LinkedList<Expr>> expressionsByEvaluationValue; // Contains expressions grouped by its evaluation results.
  private Map<String, Expr> relationsForEvaluation; // Target relations with expressions
  private Map<String, Class<?>> structureRelations; // Target relations with types

  // Method variables
  private Map<Class<?>, Set<String>> methodVarsByType; // Variables names grouped by type
  private Map<String, Class<?>> methodVarsType; // Variables names and their types

  /**
   * Constructor from a given target class
   * @param targetClass is the current class under analysis
   * @param considerPreState determines if the pre states of the target must be considered
   */
  public TargetInformation(Class<?> targetClass, boolean considerPreState) {
    // Build the type graph
    cut = targetClass;
    typeGraph = new TypeGraph(targetClass);

    // Build the structure relations and the set of initial expressions to evaluate
    structureRelations = new HashMap<>();
    relationsForEvaluation = new HashMap<>();
    structureRelations.put(ExprName.THIS, targetClass);
    structureRelations.put(ExprName.THIS_PRE, targetClass);
    relationsForEvaluation.put(ExprName.THIS, ExprBuilder.toExpr(ExprName.THIS, targetClass));
    relationsForEvaluation.put(ExprName.THIS_PRE, ExprBuilder.toExpr(ExprName.THIS_PRE, targetClass));
    allIntExpressions = new LinkedList<>();
    scope = 3;

    buildBaseExpressions(cut, new HashSet<>());
    buildInitialExpressions(considerPreState);

    typeEvaluations = new HashMap<>();
    expressionsByEvaluationValue = new HashMap<>();
    methodVarsByType = new HashMap<>();
    methodVarsType = new HashMap<>();
  }

  /**
   * Build the base expressions from the current cut
   */
  private void buildBaseExpressions(Class<?> vertex, Set<String> visited) {
      Set<TypeGraphEdge> outgoingEdges = typeGraph.getOutgoingEdges(vertex);
      for (TypeGraphEdge edge : outgoingEdges) {
        if (visited.add(edge.getLabel())) {
          Class<?> targetVertex = typeGraph.getTargetVertex(edge);
          structureRelations.put(edge.getLabel(), targetVertex);
          relationsForEvaluation.put(edge.getLabel(), ExprBuilder.toExpr(edge.getLabel(), targetVertex));
          buildBaseExpressions(targetVertex, visited);
        }
      }
  }

  /**
   * Build the initial expressions by traversing the type graph
   * @param considerPreState determines if the pre states must be considered when building expressions
   * Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
   */
  private void buildInitialExpressions(boolean considerPreState) {
    joinedExpressions = new LinkedList<>();
    joinedExpressionsOfTypeInt = new LinkedList<>();
    simpleClosuredExpressions = new LinkedList<>();
    doubleClosuredExpressions = new LinkedList<>();
    joineableExpressionsByType = new HashMap<>();
    setsByType = new HashMap<>();

    if (considerPreState) {
      // Pre state expression are also considered
      buildInitialExpressionsRec(relationsForEvaluation.get(ExprName.THIS_PRE), cut, scope);
    }

    buildInitialExpressionsRec(relationsForEvaluation.get(ExprName.THIS), cut, scope);
  }

  /**
   * Build all the initial expressions recursively
   */
  private void buildInitialExpressionsRec(Expr currExpr, Class<?> vertex, int k) {
    if (!currExpr.toString().equals(ExprName.THIS)) {
      joinedExpressions.add(currExpr);
      if (vertex.equals(Integer.class) || vertex.equals(int.class)) {
        joinedExpressionsOfTypeInt.add(currExpr);
        allIntExpressions.add(currExpr);
      }
    }
    if (k > 0) {
      Set<TypeGraphEdge> outgoingEdges = typeGraph.getOutgoingEdges(vertex);
      List<Expr> adjacentClosuredExpressions = new LinkedList<>();
      for (TypeGraphEdge edge : outgoingEdges) {
        Class<?> targetVertex = typeGraph.getTargetVertex(edge);
        String adjacentExprStr = edge.getLabel();

        if (!joineableExpressionsByType.containsKey(vertex))
          joineableExpressionsByType.put(vertex, new HashSet<>());
        joineableExpressionsByType.get(vertex).add(ExprBuilder.toExpr(adjacentExprStr, targetVertex));

        if (Collection.class.isAssignableFrom(targetVertex))
          throw new UnsupportedOperationException("Handle collections properly");

        Expr newExpr = ExprBuilder.join(currExpr, ExprBuilder.toExpr(adjacentExprStr, targetVertex));
        buildInitialExpressionsRec(newExpr, targetVertex, k - 1);

        if (vertex.equals(targetVertex) && !currExpr.toString().contains(adjacentExprStr)) {
          // The current adjacent expression is closable
          // And the adjacent expression is not contained in the current expression
          adjacentClosuredExpressions.add(ExprBuilder.toExpr(adjacentExprStr, targetVertex));
          Expr closured = ExprBuilder.joinWithRClosure(currExpr, adjacentExprStr);
          closured.setClassOfElemsInSet(targetVertex);
          simpleClosuredExpressions.add(closured);
          createSets(closured, targetVertex);
        }

      }

      for (int i = 0; i < adjacentClosuredExpressions.size() - 1; i++) {
        for (int j = i + 1; j < adjacentClosuredExpressions.size(); j++) {
          Expr fst = adjacentClosuredExpressions.get(i);
          Expr snd = adjacentClosuredExpressions.get(j);
          Expr closured = ExprBuilder.joinWithRClosure(currExpr, fst.toString(), snd.toString());
          closured.setClassOfElemsInSet(fst.type());
          doubleClosuredExpressions.add(closured);
          createSets(closured, fst.type());
        }
      }
    }
  }

  /**
   * Create sets a given closured expression
   */
  private void createSets(Expr closured, Class<?> elemsType) {
    // Add the given set expression to its type
    if (!setsByType.containsKey(elemsType))
      setsByType.put(elemsType, new LinkedList<>());
    setsByType.get(elemsType).add(closured);
    // If the class is not a primitive type, create the sets which closured expression is the base
    if (!elemsType.isPrimitive()) {
      Set<TypeGraphEdge> outgoingEdges = typeGraph.getOutgoingEdges(elemsType);
      for (TypeGraphEdge edge : outgoingEdges) {
        Class<?> v = typeGraph.getTargetVertex(edge);
        String adjacentExprStr = edge.getLabel();
        if (!setsByType.containsKey(v))
          setsByType.put(v, new LinkedList<>());
        Expr newSetExpr = ExprBuilder.join(closured, ExprBuilder.toExpr(adjacentExprStr, v));
        newSetExpr.setClassOfElemsInSet(v);
        setsByType.get(v).add(newSetExpr);
      }
    }
  }

  /**
   * Get all the evaluable expressions
   */
  public List<Expr> getEvaluableExpressions() { return joinedExpressions; }

  /**
   * Get int evaluable expressions
   */
  public List<Expr> getIntEvaluableExpressions() {
    return allIntExpressions;
  }

  /**
   * Get the evaluable expressions of the given type
   */
  public List<Expr> getEvaluableExpressionsOfType(Class<?> type) {
    List<Expr> exprsOfType = new LinkedList<>();
    joinedExpressions.forEach(e -> {
      if (e.type().equals(type))
        exprsOfType.add(e);
    });
    return exprsOfType;
  }

  /**
   * Returns the evaluable expressions grouped by the evaluation value
   */
  public Map<String, LinkedList<Expr>> getExpressionsByEvaluationValue() {
    return expressionsByEvaluationValue;
  }

  /**
   * Clear the expression by value map
   */
  public void clearExpressionsByEvaluationValue() {
    expressionsByEvaluationValue.clear();
  }

  /**
   * Updates the information related to a value obtained by evaluating an expression
   * The update performs two tasks:
   * 1. It adds the given expression to the list of expressions that have evaluated to value.
   * 2. It adds the value as a possible one for the expression type.
   * @param expr is the expression that evaluated to the given value.
   * @param value is the evaluation value.
   */
  public void updateEvaluationValueInfo(Object value, Expr expr) {
    // 1. Add the expression to list of expressions that evaluates to the given value
    String valueStr = value==null?ExprName.NULL:value.toString();
    if (!expressionsByEvaluationValue.containsKey(valueStr)) {
      expressionsByEvaluationValue.put(valueStr, new LinkedList<>());
    }
    expressionsByEvaluationValue.get(valueStr).add(expr);
    // 2. Add the value as an option for the expression type
    Class<?> type = expr.type();
    if (!typeEvaluations.containsKey(type))
      typeEvaluations.put(type, new LinkedList<>());

    if (!typeEvaluations.get(type).contains(valueStr)) typeEvaluations.get(type).add(valueStr);
  }

  /**
   * Get all the joined expressions
   */
  public List<Expr> getJoinedExpressions() { return joinedExpressions; }

  /**
   * Get all the joined expressions of type int
   */
  public List<Expr> getJoinedExpressionsOfTypeInt() { return joinedExpressionsOfTypeInt; }

  /**
   * Get all the simple closured expressions
   */
  public List<Expr> getSimpleClosuredExpressions() { return simpleClosuredExpressions; }

  /**
   * Get all the double closured expressions
   */
  public List<Expr> getDoubleClosuredExpressions() { return doubleClosuredExpressions; }

  /**
   * Create collections from the given closured expression
   */
  private void createCollections(Expr closured) {
    throw new UnsupportedOperationException("Implement this");
  }

  /**
   * Calculates all the possible comparisons between expressions (only those expressions which types
   * are not disjoint)
   */
  public int calculatePossibleComparisonsBetweenExpressions() {
    int possibleComparisons = 0;
    for (int i = 0; i < joinedExpressions.size() - 1; i++) {
      for (int j = i + 1; j < joinedExpressions.size(); j++) {
        //if (joinedExpressions.get(i).type().intersects(joinedExpressions.get(j).type())) {
          // The i-th expression can be compared with the j-th expression
          possibleComparisons++;
        //}
      }
    }
    return possibleComparisons;
  }

  public int calculateAmountCardinalityExpressions() {
    return joinedExpressionsOfTypeInt.size()
        * (simpleClosuredExpressions.size() + doubleClosuredExpressions.size());
  }

  /**
   * Returns true iff there is some set expression in the current context
   */
  public boolean hasSets() {
    return setsByType.keySet().size() > 0;
  }

  /**
   * Returns true iff there is some set expression containing objects of the given type
   */
  public boolean existsSetOfType(Class<?> type) {
    Set<Class<?>> types = setsByType.keySet();
    return types.contains(type);
  }

  /**
   * Returns the all the set expressions. This includes all the simple closured expressions, all the double closured expressions
   * and all the expressions denoting attributes which type is Collection.
   */
  public List<Expr> getSets() {
    List<Expr> allSets = new LinkedList<>();
    allSets.addAll(simpleClosuredExpressions);
    allSets.addAll(doubleClosuredExpressions);
    // TODO Collection attributes should also be added here
    return allSets;
  }

  /**
   * Returns the expressions denoting sets of the given type
   */
  public List<Expr> getSetsOfType(Class<?> type) {
    List<Expr> exprSets = setsByType.get(type);
    List<Expr> sets = new LinkedList<>();
    if (exprSets!=null)
      sets = new LinkedList<>(exprSets);
    // Additionally, sets of objects should be returned, since they are possible sets for any given type
    if (setsByType.containsKey(Object.class))
      sets.addAll(setsByType.get(Object.class));
    return sets;
  }

  /**
   * Returns the amount of simple closured expressions
   */
  public int getAmountOfSimpleClosuredExpressions() {
    return simpleClosuredExpressions.size();
  }

  /**
   * Returns the amount of double closured expressions
   */
  public int getAmountOfDoubleClosuredExpressions() {
    return doubleClosuredExpressions.size();
  }

  /**
   * Returns the amount of closured expressions
   */
  public int getAmountOfClosuredExpressions() {
    return simpleClosuredExpressions.size() + doubleClosuredExpressions.size();
  }

  /**
   * Returns the amount of non closured expresssions
   * 
   * @return
   */
  public int getAmountOfNonClosuredExpressions() {
    return joinedExpressions.size() + joinedExpressionsOfTypeInt.size();
  }

  /**
   * Returns all the expression that can be joined with an expression of the given type. That is
   * expressions of the form: type -> AnotherType
   */
  public Set<Expr> getJoineableExpressionsOfCurrentType(Class<?> type) {
    if (joineableExpressionsByType.containsKey(type)) {
      return joineableExpressionsByType.get(type);
    }
    return new HashSet<>();
  }

  /**
   * Returns all the expression that can be joined with an expression of the given type, but keeping
   * the return type. That is an expression of the form type -> type + something
   */
  public List<Expr> getJoineableExpressionsOfCurrentTypeMaintainigReturnType(ExprContext expr) {
    String exprStr = expr.getText();
    if (exprStr.contains(ExprOperator.JOIN)) {
      exprStr = exprStr.substring(exprStr.lastIndexOf(ExprOperator.JOIN) + 1);
    }
    TypeGraphEdge correspondingEdge = typeGraph.getEdgeFromLabel(exprStr);
    Class<?> c = typeGraph.getTargetVertex(correspondingEdge);
    if (joineableExpressionsByType.containsKey(c)) {
      Set<Expr> joineableToType = joineableExpressionsByType.get(c);
      List<Expr> sameReturnType = new LinkedList<>();
      for (Expr joineable : joineableToType) {
        if (c.isAssignableFrom(joineable.type()) && !exprStr.equals(joineable.toString())) {
          sameReturnType.add(joineable);
        }
      }
      return sameReturnType;
    } else {
      System.out.println("No joineable expressions for type: "+c.getSimpleName());
      return new LinkedList<>();
    }

  }

  /**
   * Returns some possible expression of the given type
   */
  public Expr getRandomIntExpr() {
    Random random = new Random();
    if (allIntExpressions.isEmpty())
      return ExprBuilder.ZERO;
    int randomNumber = random.nextInt(allIntExpressions.size());
    return (Expr) allIntExpressions.toArray()[randomNumber];
  }

  /**
   * Returns a non-null return type for the given type.
   */
  public Class<?> getReturnType(ExprContext expr) {
    throw new UnsupportedOperationException("implement this");
  }

  /**
   * Return vars of a given type name
   */
  public Set<String> getVariablesOfType(Class<?> cl) {
    if (Object.class.equals(cl)) {
      // The given class is object, so return all variables
      Set<String> vars = new HashSet<>();
      for (Class<?> t : methodVarsByType.keySet()) {
        vars.addAll(methodVarsByType.get(t));
      }
      return vars;
    }
    return methodVarsByType.get(cl);
  }

  /**
   * Add var to type
   */
  public void addVariableForType(Class<?> type, String varName) {
    methodVarsType.put(varName, type);
    if (!methodVarsByType.containsKey(type))
      methodVarsByType.put(type, new HashSet<>());
    if (methodVarsByType.get(type).add(varName)) {
      //if (typeName.contains("Integer"))
        //allIntExpressions.add(ExprVar.make(null, varName));
    }
  }

  /**
   * Returns a random value for the given class
   */
  public Object randomValueForType(Class<?> cl) {
    if (cl == null) throw new IllegalArgumentException();
    Random random = new Random();
    if (!typeEvaluations.containsKey(cl))
      throw new IllegalArgumentException("Don't know how to get a random value for class: "+cl.getSimpleName());
    List<Object> evaluationsForType = typeEvaluations.get(cl);
    int randomNumber = random.nextInt(evaluationsForType.size());
    Object value = evaluationsForType.get(randomNumber);
    return value;
  }

}