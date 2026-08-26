package evospex.utils;

import java.util.*;

import evospex.expression.Expr;
import evospex.expression.ExprBuilder;
import evospex.expression.ExprGrammarConstantSymbols;
import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.symbol.ExprName;
import evospex.expression.symbol.ExprOperator;
import evospex.target.TypeGraph;
import evospex.target.TypeGraphEdge;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DirectedPseudograph;
import soot.*;
import soot.jimple.*;
import soot.options.Options;

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
  private List<Expr> joinedExpressionsOfTypeDouble;// Contains double/Double expressions build from target
  private List<Expr> allDoubleExpressions; // Contains all double/Double expressions (target and vars and results)
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
    allDoubleExpressions = new LinkedList<>();
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
   */
  private void buildInitialExpressions(boolean considerPreState) {
    joinedExpressions = new LinkedList<>();
    joinedExpressionsOfTypeInt = new LinkedList<>();
    joinedExpressionsOfTypeDouble = new LinkedList<>();
    simpleClosuredExpressions = new LinkedList<>();
    doubleClosuredExpressions = new LinkedList<>();
    joineableExpressionsByType = new HashMap<>();
    setsByType = new HashMap<>();

    if (considerPreState) {
      // Pre state expression are also considered
      buildInitialExpressionsRec(relationsForEvaluation.get(ExprName.THIS_PRE), cut, scope);
    }

    buildInitialExpressionsRec(relationsForEvaluation.get(ExprName.THIS), cut, scope);
    extractIntExpressionsFromCode(cut);
  }

  /**
   * Log the int/double expressions collected so far. Method arguments and the result are only
   * added to allIntExpressions/allDoubleExpressions once genes have been built from an example
   * (see addVariableForType), so this should be called after that has happened to report an
   * accurate count.
   */
  public void logCollectedIntExpressions() {
    System.out.println("--> int expressions collected (used to build genes): " + allIntExpressions.size());
    for (Expr expr : allIntExpressions) {
      System.out.println("  " + expr);
    }
    System.out.println("--> double expressions collected (used to build genes): " + allDoubleExpressions.size());
    for (Expr expr : allDoubleExpressions) {
      System.out.println("  " + expr);
    }
  }

  /**
   * Extract integer arithmetic expressions from the target class bytecode using Soot.
   * Discovered expressions are added to joinedExpressionsOfTypeInt and allIntExpressions.
   */
  private void extractIntExpressionsFromCode(Class<?> targetClass) {
    try {
      G.reset();
      Options.v().set_prepend_classpath(true);
      Options.v().set_allow_phantom_refs(true);
      Options.v().set_soot_classpath(System.getProperty("java.class.path"));
      SootClass sootClass = Scene.v().loadClassAndSupport(targetClass.getName());
      sootClass.setApplicationClass();
      Scene.v().loadNecessaryClasses();
      Set<String> knownExprStrings = new HashSet<>();
      joinedExpressionsOfTypeInt.forEach(e -> knownExprStrings.add(e.toString()));
      for (SootMethod method : sootClass.getMethods()) {
        if (!method.isConcrete()) continue;
        try {
          extractIntExpressionsFromBody(method.retrieveActiveBody(), knownExprStrings);
        } catch (Exception ignored) {}
      }
    } catch (Exception e) {
      System.err.println("Warning: could not extract int expressions via Soot: " + e.getMessage());
    }
  }

  /**
   * Extract integer arithmetic expressions from a single Soot method body.
   */
  private void extractIntExpressionsFromBody(Body body, Set<String> knownExprStrings) {
    Map<String, String> localToExpr = new HashMap<>();
    // First pass: map locals to this-rooted expression strings via field accesses
    for (Unit unit : body.getUnits()) {
      if (unit instanceof IdentityStmt) {
        IdentityStmt id = (IdentityStmt) unit;
        if (id.getRightOp() instanceof ThisRef) {
          localToExpr.put(id.getLeftOp().toString(), ExprName.THIS);
        }
      } else if (unit instanceof AssignStmt) {
        AssignStmt assign = (AssignStmt) unit;
        if (!(assign.getLeftOp() instanceof Local)) continue;
        String lhs = assign.getLeftOp().toString();
        Value rhs = assign.getRightOp();
        if (rhs instanceof InstanceFieldRef) {
          InstanceFieldRef fr = (InstanceFieldRef) rhs;
          String base = fr.getBase().toString();
          if (localToExpr.containsKey(base)) {
            localToExpr.put(lhs, localToExpr.get(base) + "." + fr.getField().getName());
          }
        }
      }
    }
    // Second pass: find binary arithmetic expressions of int type
    for (Unit unit : body.getUnits()) {
      if (!(unit instanceof AssignStmt)) continue;
      Value rhs = ((AssignStmt) unit).getRightOp();
      if (!(rhs instanceof BinopExpr)) continue;
      BinopExpr binop = (BinopExpr) rhs;
      if (!(binop.getType() instanceof IntType)) continue;
      String symbol = arithmeticSymbol(binop);
      if (symbol == null) continue;
      String op1 = resolveToExprStr(binop.getOp1(), localToExpr);
      String op2 = resolveToExprStr(binop.getOp2(), localToExpr);
      if (op1 == null || op2 == null) continue;
      String exprStr = op1 + " " + symbol + " " + op2;
      if (knownExprStrings.add(exprStr)) {
        try {
          Expr newExpr = ExprBuilder.toExpr(exprStr, int.class);
          joinedExpressionsOfTypeInt.add(newExpr);
          allIntExpressions.add(newExpr);
        } catch (Exception ignored) {}
      }
    }
  }

  /**
   * Resolves a Soot Value to an EvoSpex expression string, or returns null if not resolvable.
   */
  private String resolveToExprStr(Value v, Map<String, String> localToExpr) {
    if (v instanceof Local && localToExpr.containsKey(v.toString()))
      return localToExpr.get(v.toString());
    if (v instanceof IntConstant)
      return String.valueOf(((IntConstant) v).value);
    return null;
  }

  /**
   * Returns the arithmetic symbol for a BinopExpr, or null if not an arithmetic operator.
   */
  private String arithmeticSymbol(BinopExpr expr) {
    if (expr instanceof AddExpr) return "+";
    if (expr instanceof SubExpr) return "-";
    if (expr instanceof MulExpr) return "*";
    if (expr instanceof DivExpr) return "/";
    if (expr instanceof RemExpr) return "%";
    return null;
  }

  /**
   * Build all the initial expressions recursively
   */
  private void buildInitialExpressionsRec(Expr currExpr, Class<?> vertex, int k) {
    // The bare 'this' identity expression is excluded here (only its field-chains are useful
    // gene candidates) - 'this_pre' needs the same treatment, but the check below only compared
    // against ExprName.THIS, so the bare 'this_pre' root (considerPreState's very first call)
    // always slipped through. For a static target method (no receiver) 'this_pre' is null, and
    // evaluating this now-included bare candidate against it crashed evalAnyExpr's own
    // null-object check - excluding it here is correct for any target class, not just that case.
    if (!currExpr.toString().equals(ExprName.THIS) && !currExpr.toString().equals(ExprName.THIS_PRE)) {
      joinedExpressions.add(currExpr);
      if (vertex.equals(Integer.class) || vertex.equals(int.class)) {
        joinedExpressionsOfTypeInt.add(currExpr);
        allIntExpressions.add(currExpr);
      } else if (vertex.equals(Double.class) || vertex.equals(double.class)) {
        joinedExpressionsOfTypeDouble.add(currExpr);
        allDoubleExpressions.add(currExpr);
      }
    }
    if (k > 0) {
      Set<TypeGraphEdge> outgoingEdges = typeGraph.getOutgoingEdges(vertex);
      List<Expr> adjacentClosuredExpressions = new LinkedList<>();
      for (TypeGraphEdge edge : outgoingEdges) {
        Class<?> targetVertex = typeGraph.getTargetVertex(edge);
        String adjacentExprStr = edge.getLabel();

        if (Collection.class.isAssignableFrom(targetVertex)) {
          // Collection-typed fields aren't graph-traversal targets (their own fields can't be
          // reached this way, and createCollections() below is unimplemented), but the field
          // itself is a legitimate "set of <element type>" - register it via the same
          // setsByType mechanism already used for closured/reachability sets, so
          // FromArgumentsGeneBuilder's createGenesFromArgumentAndSets can propose membership
          // genes (e.g. "r in this._var49") for it.
          Class<?> elemType = resolveCollectionElementType(vertex, adjacentExprStr);
          if (elemType != null) {
            Expr setExpr = ExprBuilder.join(currExpr, ExprBuilder.toExpr(adjacentExprStr, targetVertex));
            setExpr.setClassOfElemsInSet(elemType);
            createSets(setExpr, elemType);
          }
          continue;
        }

        if (Map.class.isAssignableFrom(targetVertex)) {
          // A Map field isn't a graph-traversal target either (same reasoning as Collection
          // above - nothing downstream can use a bare Map value directly), but its key set and
          // value collection are each a legitimate "set of <type>" - register both via the same
          // setsByType mechanism, so membership genes like "x in this._var721.keySet" become
          // available. NameExpressionEvaluator already special-cases the bare "keySet"/"values"
          // identifiers to mean the corresponding Map accessor method when evaluating an
          // expression whose base is a Map.
          Class<?>[] keyValueTypes = resolveMapTypeArguments(vertex, adjacentExprStr);
          if (keyValueTypes != null) {
            Expr mapExpr = ExprBuilder.join(currExpr, ExprBuilder.toExpr(adjacentExprStr, targetVertex));
            Expr keySetExpr = ExprBuilder.join(mapExpr, ExprBuilder.toExpr(ExprGrammarConstantSymbols.MAP_KEY_SET, keyValueTypes[0]));
            keySetExpr.setClassOfElemsInSet(keyValueTypes[0]);
            createSets(keySetExpr, keyValueTypes[0]);
            Expr valuesExpr = ExprBuilder.join(mapExpr, ExprBuilder.toExpr(ExprGrammarConstantSymbols.MAP_VALUES, keyValueTypes[1]));
            valuesExpr.setClassOfElemsInSet(keyValueTypes[1]);
            createSets(valuesExpr, keyValueTypes[1]);
          }
          continue;
        }

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
   * Recovers a Collection field's element type via its generic signature (TypeGraph erases
   * generics when building the type graph, e.g. ArrayList<R> becomes a raw ArrayList.class
   * vertex, so the element type has to be recovered separately here). Walks up the class
   * hierarchy in case the field is inherited. Returns null (leaving the field unregistered as
   * a set, same as before this method existed) for a raw/non-parameterized Collection type.
   */
  private static Class<?> resolveCollectionElementType(Class<?> declaringClass, String fieldName) {
    for (Class<?> c = declaringClass; c != null && c != Object.class; c = c.getSuperclass()) {
      try {
        java.lang.reflect.Type genericType = c.getDeclaredField(fieldName).getGenericType();
        if (genericType instanceof java.lang.reflect.ParameterizedType) {
          java.lang.reflect.Type[] args = ((java.lang.reflect.ParameterizedType) genericType).getActualTypeArguments();
          if (args.length == 1 && args[0] instanceof Class)
            return (Class<?>) args[0];
        }
        return null;
      } catch (NoSuchFieldException ignored) {
        // keep walking up the hierarchy
      }
    }
    return null;
  }

  /**
   * Recovers a Map field's key/value types via its generic signature, the same way
   * resolveCollectionElementType does for a single-type-arg Collection (a Map's
   * ParameterizedType carries two type arguments instead of one). Returns null (leaving the
   * field unregistered, same as an unresolvable Collection) for a raw/non-parameterized Map
   * type.
   */
  private static Class<?>[] resolveMapTypeArguments(Class<?> declaringClass, String fieldName) {
    for (Class<?> c = declaringClass; c != null && c != Object.class; c = c.getSuperclass()) {
      try {
        java.lang.reflect.Type genericType = c.getDeclaredField(fieldName).getGenericType();
        if (genericType instanceof java.lang.reflect.ParameterizedType) {
          java.lang.reflect.Type[] args = ((java.lang.reflect.ParameterizedType) genericType).getActualTypeArguments();
          if (args.length == 2 && args[0] instanceof Class && args[1] instanceof Class)
            return new Class<?>[] { (Class<?>) args[0], (Class<?>) args[1] };
        }
        return null;
      } catch (NoSuchFieldException ignored) {
        // keep walking up the hierarchy
      }
    }
    return null;
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
    // (elemsType may not be a graph vertex at all - e.g. a Collection field's element type,
    // recovered via reflection rather than graph traversal - in which case there's nothing
    // further to expand, just the registration above).
    if (!elemsType.isPrimitive() && typeGraph.containsVertex(elemsType)) {
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
   * Get double evaluable expressions
   */
  public List<Expr> getDoubleEvaluableExpressions() {
    return allDoubleExpressions;
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
   * Get all the joined expressions of type double
   */
  public List<Expr> getJoinedExpressionsOfTypeDouble() { return joinedExpressionsOfTypeDouble; }

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
   * Returns some possible expression of type double
   */
  public Expr getRandomDoubleExpr() {
    Random random = new Random();
    if (allDoubleExpressions.isEmpty())
      return ExprBuilder.ZERO;
    int randomNumber = random.nextInt(allDoubleExpressions.size());
    return (Expr) allDoubleExpressions.toArray()[randomNumber];
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
      if (type.equals(Integer.class) || type.equals(int.class)) {
        allIntExpressions.add(ExprBuilder.toExpr(varName, type));
      } else if (type.equals(Double.class) || type.equals(double.class)) {
        allDoubleExpressions.add(ExprBuilder.toExpr(varName, type));
      }
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