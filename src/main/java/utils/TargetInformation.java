package utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.symbol.ExprName;
import evospex.expression.symbol.ExprOperator;
import evospex.target.TypeGraph;
import evospex.target.TypeGraphEdge;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;

/**
 * This class keeps some useful information regarding the target class and method.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class TargetInformation {

  private Class<?> cut; // The current cut
  private TypeGraph typeGraph; // Current cut type graph
  private DirectedGraph<String, DefaultEdge> structureGraph; // Graph maintaining the current target class relations

  private Map<String, LinkedList<Expr>> expressionsByEvaluationValue; // Contains expressions grouped by its evaluation results.
  private final int scope; // Scope (defined in the alloy file)

  // Structures handling expressions extracted by traversing the type graph
  private List<Expr> joinedExpressions; // Contains expressions of the form e.f
  private List<Expr> joinedExpressionsOfTypeInt;// Contains int/Integer expressions build from target
  private static List<Expr> allIntExpressions; // Contains all int/Integer expressions (target and vars and results)
  private static List<Expr> simpleClosuredExpressions; // Contains expressions of the form e.*f
  private static List<Expr> doubleClosuredExpressions; // Contains expressions of the from e.*(f+g)
  private static Map<Class<?>, Set<Expr>> joineableExpressionsByType; // Joineable expressions for each type
  private static Map<String, Set<Expr>> collectionsByType; // Data structure collections by type

  private Map<String, Expr> relationsForEvaluation; // Target relations with expressions
  private Map<String, Class<?>> structureRelations; // Target relations with types

  private Map<String, Set<String>> methodVarsByType; // Variables names grouped by type
  private Map<String, String> methodVarsType; // Variables names and their types

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
    collectionsByType = new HashMap<>();

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
    System.out.println("Expr "+currExpr.exprCtx().getText()+" of class "+vertex.getSimpleName());
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

        Expr newExpr = ExprBuilder.join(currExpr, ExprBuilder.toExpr(adjacentExprStr, targetVertex));
        buildInitialExpressionsRec(newExpr, targetVertex, k - 1);

        if (vertex.equals(targetVertex) && !currExpr.toString().contains(adjacentExprStr)) {
          // The current adjacent expression is closable
          // And the adjacent expression is not contained in the current expression
          adjacentClosuredExpressions.add(ExprBuilder.toExpr(adjacentExprStr, targetVertex));
          Expr closured = ExprBuilder.joinWithRClosure(currExpr, adjacentExprStr);
          System.out.println("Expr "+ closured + " is set of "+targetVertex.getSimpleName());
          closured.setClassOfElemsInSet(targetVertex);
          simpleClosuredExpressions.add(closured);
        }

      }

      for (int i = 0; i < adjacentClosuredExpressions.size() - 1; i++) {
        for (int j = i + 1; j < adjacentClosuredExpressions.size(); j++) {
          Expr fst = adjacentClosuredExpressions.get(i);
          Expr snd = adjacentClosuredExpressions.get(j);
          Expr closured = ExprBuilder.joinWithRClosure(currExpr, fst.toString(), snd.toString());
          System.out.println("Double closured expr "+ closured);
          closured.setClassOfElemsInSet(fst.type());
          doubleClosuredExpressions.add(closured);
        }
      }
    }
  }

  /**
   * Get evaluable expressions
   */
  public List<Expr> getEvaluableExpressions() {
    List<Expr> expressionsList = new LinkedList<>();
    expressionsList.addAll(allIntExpressions);
    return expressionsList;
  }

  /**
   * Get int evaluable expressions
   */
  public List<Expr> getIntEvaluableExpressions() {
    return allIntExpressions;
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
   * Adds evaluation to value
   * 
   * @param expr is the evaluation expression
   * @param value is the evaluation value
   */
  public void addEvaluationToValue(Expr expr, String value) {
    if (!expressionsByEvaluationValue.containsKey(value)) {
      expressionsByEvaluationValue.put(value, new LinkedList<>());
    }
    expressionsByEvaluationValue.get(value).add(expr);
  }

  /**
   * Get all the joined expressions
   */
  public List<Expr> getJoinedExpressions() {
    return joinedExpressions;
  }

  /**
   * Get all the joined expressions of type int
   */
  public List<Expr> getJoinedExpressionsOfTypeInt() {
    return joinedExpressionsOfTypeInt;
  }

  /**
   * Get all the simple closured expressions
   */
  public List<Expr> getSimpleClosuredExpressions() {
    return simpleClosuredExpressions;
  }

  /**
   * Get all the double closured expressions
   */
  public List<Expr> getDoubleClosuredExpressions() {
    return doubleClosuredExpressions;
  }

  /**
   * Create collections from the given closured expression
   */
  private void createCollections(Expr closured) {
    throw new UnsupportedOperationException("Implement this");
  }

  /**
   * Builds all the expressions of a given length
   *
   * @param vertex
   *          is the current vertex being
   * @param scope
   *          is the length of expressions to be builded
   * @return a list of expressions
   */
  private List<Expr> buildExpressionsOfLength(String vertex, int scope) {
    //ExprVar currentExpr = ExprVar.make(null, vertex, structureRelations.get(vertex));
    if (scope == 0) {
      LinkedList<Expr> exprList = new LinkedList<Expr>();
      //exprList.add(currentExpr);
      if (isClosure(vertex)) {
        //exprList.add(ExprUnary.Op.RCLOSURE.make(null, currentExpr));
      }
      return exprList;
    } else {
      Set<DefaultEdge> outgoingEdges = structureGraph.outgoingEdgesOf(vertex);
      List<Expr> adjacentExpressions = new LinkedList<Expr>();
      for (DefaultEdge edge : outgoingEdges) {
        // For each adjacent vertex creates all the expressions starting from that vertex and of
        // length
        // scope-1
        String targetVertex = structureGraph.getEdgeTarget(edge);
        adjacentExpressions.addAll(buildExpressionsOfLength(targetVertex, scope - 1));
      }

      List<Expr> resultingExpressions = new LinkedList<Expr>();
      for (Expr expr : adjacentExpressions) {
        // For each adjacent expression, join it with the current expression. If the current
        // expression
        // can be closured, also join the closured current expression with the adjacent.
        //resultingExpressions.add(currentExpr.join(expr));
        if (isClosure(vertex)) {
          //resultingExpressions.add(ExprUnary.Op.RCLOSURE.make(null, currentExpr).join(expr));
        }
      }
      return resultingExpressions;
    }
  }

  /**
   * Returns true if the current vertex generates an expression than can be closure
   * @param vertex
   * @return
   */
  private boolean isClosure(String vertex) {
    Set<DefaultEdge> outgoingEdges = structureGraph.outgoingEdgesOf(vertex);
    for (DefaultEdge edge : outgoingEdges) {
      // For each adjacent vertex create an expression, join it with the current expression
      // and try to add it to the expression list
      String targetVertex = structureGraph.getEdgeTarget(edge);
      if (vertex.equals(targetVertex)) {
        return true;
      }
    }
    return false;
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
   * Returns true if the given expression has a closured subexpression
   * 
   * @param evaluableExpr
   * @return
   */
  public boolean hasClosuredExpr(Expr evaluableExpr) {
    throw new UnsupportedOperationException("Implement this");
  }

  /**
   * Returns true iff there is some collection attribute in the current context
   */
  public static boolean hasCollections() {
    return collectionsByType.keySet().size() > 0;
  }

  /**
   * Returns true iff there is some collection attribute containing objects of the given type
   */
  public static boolean hasCollectionsOfType(String typeStr) {
    Set<String> types = collectionsByType.keySet();
    for (String t : types) {
      if (t.contains("Collection_" + typeStr))
        return true;
    }
    return false;
  }

  /**
   * Returns the all collection attributes
   */
  public static List<Expr> getCollections() {
    throw new UnsupportedOperationException("Implements this");
  }

  /**
   * Returns the collection attributes which type is the given type
   */
  public static List<Expr> getCollectionsOfType(String typeStr) {
    throw new UnsupportedOperationException("Implement this");
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
   * Counts the amount of times that the expression appears in the currentExpr
   */
  public int getTotalOcurrences(String expression, Expr expr) {
    throw new UnsupportedOperationException("implement this");
  }

  /**
   * Returns all the expression that can be joined with an expression of the given type. That is
   * expressions of the form: type -> AnotherType
   */
  public Set<Expr> getJoineableExpressionsOfCurrentType(Class<?> type) {
    System.out.println("getJoineableExpressionsOfCurrentType: "+type.getSimpleName());
    if (joineableExpressionsByType.containsKey(type)) {
      System.out.println("exprs are: "+joineableExpressionsByType.get(type));
      return joineableExpressionsByType.get(type);
    }
    System.out.println("no exprs");
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
   * Returns some possible value for the given type
   */
  public static Expr getUnarySigForType(Class<?> cl) {
    throw new UnsupportedOperationException("Implement this");
  }

  /**
   * Returns some possible expression of the given type
   */
  public ExprContext getRandomIntExpr() {
    throw new UnsupportedOperationException("Implement this");
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
  public Set<String> getVariablesOfType(String typeName) {
    return methodVarsByType.get(typeName);
  }

  /**
   * Add var to type
   */
  public void addVariableForType(Class<?> type, String varName) {
    String typeName = type.getSimpleName();
    methodVarsType.put(varName, typeName);
    if (!methodVarsByType.containsKey(typeName))
      methodVarsByType.put(typeName, new HashSet<>());
    if (methodVarsByType.get(typeName).add(varName)) {
      //if (typeName.contains("Integer"))
        //allIntExpressions.add(ExprVar.make(null, varName));
    }
  }

  /**
   * Get var type
   */
  public String getVarType(String varName) {
    return methodVarsType.get(varName);
  }

}