package utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import evospex.expression.ExprBuilder;
import evospex.expression.ExprGrammarParser.ExprContext;
import evospex.expression.ExprName;
import evospex.target.TypeGraph;
import evospex.target.TypeGraphEdge;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import rfm.dynalloy.ConstList;
import rfm.dynalloy.Err;
import rfm.dynalloy.SafeList;
import rfm.dynalloyCompiler.ast.Command;
import rfm.dynalloyCompiler.ast.Decl;
import rfm.dynalloyCompiler.ast.Expr;
import rfm.dynalloyCompiler.ast.ExprBinary;
import rfm.dynalloyCompiler.ast.ExprConstant;
import rfm.dynalloyCompiler.ast.ExprUnary;
import rfm.dynalloyCompiler.ast.ExprVar;
import rfm.dynalloyCompiler.ast.Sig;
import rfm.dynalloyCompiler.ast.Sig.PrimSig;
import rfm.dynalloyCompiler.ast.Type;
import rfm.dynalloyCompiler.translator.A4Solution;

/**
 * This class keeps some useful information regarding the target class and method.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class TargetInformation {

  private Class<?> cut; // The current cut
  private TypeGraph typeGraph; // Current cut type graph
  private DirectedGraph<String, DefaultEdge> structureGraph; // Graph maintaining the current target class relations

  private Map<String, LinkedList<Expr>> commandExpressions; // Commands.
  private Map<String, LinkedList<Expr>> expressionsByEvaluationValue; // Contains expressions grouped by its evaluation results.
  private final int scope; // Scope (defined in the alloy file)

  // Structures handling expressions extracted by traversing the type graph
  private List<ExprContext> joinedExpressions; // Contains expressions of the form e.f
  private List<ExprContext> joinedExpressionsOfTypeInt;// Contains int/Integer expressions build from target
  private static List<ExprContext> allIntExpressions; // Contains all int/Integer expressions (target and vars and results)
  private static List<ExprContext> simpleClosuredExpressions; // Contains expressions of the form e.*f
  private static List<ExprContext> doubleClosuredExpressions; // Contains expressions of the from e.*(f+g)
  private static Map<Class<?>, Set<String>> joineableExpressionsByType; // Joineable expressions for each type
  private static Map<String, Set<Expr>> collectionsByType; // Data structure collections by type

  public static Sig nullSig; // Null signature

  private Map<String, ExprContext> relationsForEvaluation; // Target relations with expressions
  private Map<String, Class<?>> structureRelations; // Target relations with types
  private static List<Sig> structureSignatures; // All signatures
  private List<Sig> signaturesUsedInRecursiveRelations; // Signatures used in recursive relations
  private static List<Sig> unarySignatures; // Unary signatures
  private static Map<Type, List<Expr>> signatureEvaluations; // Map types to values seen during expresion evaluations.\

  private Map<String, Set<String>> methodVarsByType; // Variables names grouped by type
  private Map<String, String> methodVarsType; // Variables names and their types



  /**
   * Constructor from a given target class
   * @param targetClass is the current class under analysis
   */
  public TargetInformation(Class<?> targetClass) {
    // Build the type graph
    cut = targetClass;
    typeGraph = new TypeGraph(targetClass);

    // Build the structure relations and the set of initial expressions to evaluate
    structureRelations = new HashMap<>();
    relationsForEvaluation = new HashMap<>();
    structureRelations.put(ExprName.THIS, targetClass);
    relationsForEvaluation.put(ExprName.THIS, ExprBuilder.toExprContext(ExprName.THIS));
    allIntExpressions = new LinkedList<>();
    buildBaseExpressions(cut, new HashSet<>());
    scope = 3;
    buildInitialExpressions();

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
          relationsForEvaluation.put(edge.getLabel(), ExprBuilder.toExprContext(edge.getLabel()));
          buildBaseExpressions(targetVertex, visited);
        }
      }
  }

  /**
   * Build the initial expressions by traversing the type graph
   * Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
   */
  private void buildInitialExpressions() {
    joinedExpressions = new LinkedList<>();
    joinedExpressionsOfTypeInt = new LinkedList<>();
    simpleClosuredExpressions = new LinkedList<>();
    doubleClosuredExpressions = new LinkedList<>();
    joineableExpressionsByType = new HashMap<>();
    collectionsByType = new HashMap<>();

    //if (structureRelations.keySet().contains("thizPre")) {
      // Shoudl be present when learning post conditions
      //ExprVar thizPreExpr = ExprVar.make(null, "thizPre", structureRelations.get("thizPre"));
      //buildAllExpressions(thizPreExpr, "thizPre", scope);
    //}
    buildInitialExpressionsRec(ExprName.THIS, relationsForEvaluation.get(ExprName.THIS), cut, scope);
  }

  /**
   * Build all the initial expressions recursively
   */
  private void buildInitialExpressionsRec(String currStrExpr, ExprContext currExpr, Class<?> vertex, int k) {
    System.out.println("Expr "+currStrExpr+" of class "+vertex.getSimpleName());
    if (!currStrExpr.equals(ExprName.THIS)) {
      joinedExpressions.add(currExpr);
      if (vertex.equals(Integer.class) || vertex.equals(int.class)) {
        joinedExpressionsOfTypeInt.add(currExpr);
        allIntExpressions.add(currExpr);
      }
    }
    if (k > 0) {
      Set<TypeGraphEdge> outgoingEdges = typeGraph.getOutgoingEdges(vertex);
      List<String> adjacentClosuredExpressionsStr = new LinkedList<>();
      for (TypeGraphEdge edge : outgoingEdges) {
        Class<?> targetVertex = typeGraph.getTargetVertex(edge);
        String adjacentExprStr = edge.getLabel();

        if (!joineableExpressionsByType.containsKey(targetVertex))
          joineableExpressionsByType.put(targetVertex, new HashSet<>());
        joineableExpressionsByType.get(targetVertex).add(adjacentExprStr);

        String newStrExpr = ExprBuilder.join(currStrExpr, adjacentExprStr);
        ExprContext newExpr = ExprBuilder.toExprContext(newStrExpr);
        buildInitialExpressionsRec(newStrExpr, newExpr, targetVertex, k - 1);

        if (vertex.equals(targetVertex) && !currStrExpr.contains(adjacentExprStr)) {
          // The current adjacent expression is closable
          // And the adjacent expression is not contained in the current expression
          adjacentClosuredExpressionsStr.add(adjacentExprStr);
          String newRClosureExpr = ExprBuilder.joinWithRClosure(currStrExpr, adjacentExprStr);
          System.out.println("Expr "+ newRClosureExpr + " is set of "+targetVertex.getSimpleName());
          ExprContext closured = ExprBuilder.toExprContext(newRClosureExpr);
          simpleClosuredExpressions.add(closured);
        }

      }

      for (int i = 0; i < adjacentClosuredExpressionsStr.size() - 1; i++) {
        for (int j = i + 1; j < adjacentClosuredExpressionsStr.size(); j++) {
          String fst = adjacentClosuredExpressionsStr.get(i);
          String snd = adjacentClosuredExpressionsStr.get(j);
          String newRClosureExpr = ExprBuilder.joinWithRClosure(currStrExpr, fst, snd);
          System.out.println("Expr "+ newRClosureExpr);
          ExprContext closured = ExprBuilder.toExprContext(newRClosureExpr);
          doubleClosuredExpressions.add(closured);
        }
      }
    }
  }

  /**
   * Constructor from Alloy
   * @param decls is the parameter declarations of the data structure
   * @param commands are the commands to be executed
   * @throws Err
   */
  public TargetInformation(ConstList<Decl> decls, ConstList<Command> commands) throws Err {
    structureRelations = new HashMap<>();
    expressionsByEvaluationValue = new HashMap<>();
    relationsForEvaluation = new HashMap<>();
    methodVarsByType = new HashMap<>();
    methodVarsType = new HashMap<>();
    allIntExpressions = new LinkedList<>();

    for (Decl decl : decls) {
      // Get each attribute with the respective type from the specification (RepOK parameters)
      Type declType = decl.expr.type();
      for (int i = 0; i < decl.names.size(); i++) {
        //relationsForEvaluation.add(decl.names.get(i));
        String name = decl.names.get(i).label;
        //structureRelations.put(name, declType);
      }
    }
    if (commands.size() > 0)
      scope = commands.get(0).overall;
    else
      scope = 3;
    buildGraph();
    buildExpressions();
    buildExpressionsForCommands(commands);
    buildCollections();
  }

  /**
   * Create all the collections
   */
  private void buildCollections() {
    if (doubleClosuredExpressions.isEmpty()) {
      // Create collections for simple closured expressions only when there are no double cloured
      // expressions
      //for (Expr e : simpleClosuredExpressions) {
        // if (e.toString().contains("thizPre"))
        // continue;
      //  createCollections(e);
      //}
    } else {
      // Create collections for double closured expressions
      //for (Expr e : doubleClosuredExpressions) {
        // if (e.toString().contains("thizPre"))
        // continue;
      //  createCollections(e);
      //}
    }
  }

  /**
   * Save signatures information
   */
  public void saveSignaturesInformation(A4Solution example) {
    SafeList<Sig> signatureList = example.getAllReachableSigs();

    Sig nullSignature = signatureList.get(5);
    TargetInformation.nullSig = nullSignature;
    structureSignatures = new LinkedList<Sig>();
    unarySignatures = new LinkedList<Sig>();
    signaturesUsedInRecursiveRelations = new LinkedList<Sig>();
    signatureEvaluations = new HashMap<Type, List<Expr>>();
    // Iterate over all the signatures, and save those that are used in recursive relations.
    for (Sig signature : signatureList) {
      structureSignatures.add(signature);
      boolean found = false;
      for (ExprVar skolem : example.getAllSkolems()) {
        List<List<PrimSig>> foldedType = skolem.type().fold();
        for (List<PrimSig> fold : foldedType) {
          if (fold.size() == 2) {
            if (fold.get(0).equals(signature) && fold.get(0).equals(fold.get(1))) {
              signaturesUsedInRecursiveRelations.add(signature);
              found = true;
            }
          }
          if (found)
            break;
        }
        if (found)
          break;
      }
      if (signature.decl.expr.toString().contains("one ") && !signature.toString().contains("univ")
          && !signature.toString().contains("Int") && !signature.toString().contains("String")
          && !signature.toString().contains("none") && signature.isTopLevel()
          && signature.isAbstract == null) {
        unarySignatures.add(signature);
      }
    }

  }

  /**
   * Build a graph where the vertex set is the set of declaration names of the data structure and
   * there is an edge between a vertex v1 and a vertex v2 iff the type of the declaration v1 can be
   * joined with the type of the declaration v2.
   */
  private void buildGraph() {
    // Generate each node from the keys
    structureGraph = new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);
    for (String node : structureRelations.keySet()) {
      structureGraph.addVertex(node);
    }
    // Generate each edge from the key types
    for (String sourceKey : structureRelations.keySet()) {
      for (String targetKey : structureRelations.keySet()) {
        //Type sourceType = structureRelations.get(sourceKey);
        //Type targetType = structureRelations.get(targetKey);
        //if (DynAlloyRunner.joinableTypes(sourceType, targetType)) {
          structureGraph.addEdge(sourceKey, targetKey);
        //}
      }
    }
  }

  /**
   * Get evaluable expressions
   */
  public List<ExprContext> getEvaluableExpressions() {
    List<ExprContext> expressionsList = new LinkedList<>();
    expressionsList.addAll(allIntExpressions);
    return expressionsList;
  }

  /**
   * Get int evaluable expressions
   */
  public List<ExprContext> getIntEvaluableExpressions() {
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
   * @param evaluableExpr
   *          is the expression which evaluation is value
   * @param value
   */
  public void addEvaluationToValue(Expr evaluableExpr, String value) {
    if (!expressionsByEvaluationValue.containsKey(value)) {
      expressionsByEvaluationValue.put(value, new LinkedList<Expr>());
    }
    expressionsByEvaluationValue.get(value).add(evaluableExpr);
  }

  /**
   * Add the possible evaluation to the given type
   */
  public void addEvaluationToSignature(Type type, Expr evaluation) {
    if (!signatureEvaluations.containsKey(type))
      signatureEvaluations.put(type, new LinkedList<Expr>());
    // Add the evaluation if it not exists
    boolean found = false;
    for (Expr expr : signatureEvaluations.get(type)) {
      if (expr.toString().equals(evaluation.toString())) {
        found = true;
        break;
      }
    }
    if (!found && !evaluation.toString().equalsIgnoreCase("none")) {
      signatureEvaluations.get(type).add(evaluation);
    }
  }

  /**
   * Translate all the joined expressions
   */
  public List<Expr> getCommandJoinedExpressions(Iterable<ExprVar> skolems) {
    //return translateExpressions(joinedExpressions, skolems);
    return new LinkedList<>();
  }

  /**
   * Translate all the joined expressions of type int
   */
  public List<Expr> getCommandJoinedExpressionsInt(Iterable<ExprVar> skolems) {
    //return translateExpressions(joinedExpressionsOfTypeInt, skolems);
    return new LinkedList<>();
  }

  /**
   * Translate all the simple closured expressions
   */
  public List<Expr> getCommandSimpleClosuredExpressions(Iterable<ExprVar> skolems) {
    //return translateExpressions(simpleClosuredExpressions, skolems);
    return new LinkedList<>();
  }

  /**
   * Translate all the double closured expressions
   */
  public List<Expr> getCommandDoubleClosuredExpressions(Iterable<ExprVar> skolems) {
    //return translateExpressions(doubleClosuredExpressions, skolems);
    return new LinkedList<>();
  }

  /**
   * Translates all the given expressions
   */
  private List<Expr> translateExpressions(List<Expr> expressions, Iterable<ExprVar> skolems) {
    List<Expr> translatedExpressions = new LinkedList<Expr>();
    for (Expr expr : expressions) {
      translatedExpressions.add(translateExpression(skolems, expr));
    }
    return translatedExpressions;
  }

  /**
   * Given an expression translates to an equivalent expression but with the expression names
   * present in the skolems.
   * 
   * @param skolems
   *          list of expression with correct names
   * @param expr
   *          is the expression to translate
   * @return the equivalent translated expression
   */
  private Expr translateExpression(Iterable<ExprVar> skolems, Expr expr) {
    if (expr instanceof ExprVar) {
      // The expression is a expr var
      return getExpression(skolems, ((ExprVar) expr).label);
    } else {
      if (expr instanceof ExprUnary) {
        // The expression is closure
        Expr subExpr = ((ExprUnary) expr).sub;
        Expr newSubExpr = translateExpression(skolems, subExpr);
        return ExprUnary.Op.RCLOSURE.make(null, newSubExpr);
      } else {
        // The expression is a joined expr
        Expr leftExpr = ((ExprBinary) expr).left;
        Expr rightExpr = ((ExprBinary) expr).right;

        Expr newLeftExpr = translateExpression(skolems, leftExpr);
        Expr newRightExpr = translateExpression(skolems, rightExpr);
        return ((ExprBinary) expr).op.make(null, null, newLeftExpr, newRightExpr);
      }
    }
  }

  /**
   * Returns the expression with the given name and present in the skolems
   * 
   * @param skolems
   *          is a list of expressions
   * @param name
   *          is the name of the expression to search
   * @return the expression with the given name
   */
  private Expr getExpression(Iterable<ExprVar> skolems, String name) {
    Iterator<ExprVar> skolemsIterator = skolems.iterator();
    while (skolemsIterator.hasNext()) {
      ExprVar skolem = skolemsIterator.next();
      if (skolem.label.endsWith(name)) {
        return skolem;
      }
    }
    return null;
  }

  /**
   * Build expressions from graph
   * 
   * @throws Err
   */
  private void buildExpressions() throws Err {
    //joinedExpressions = new LinkedList<Expr>();
    //joinedExpressionsOfTypeInt = new LinkedList<Expr>();
    //simpleClosuredExpressions = new LinkedList<Expr>();
    //doubleClosuredExpressions = new LinkedList<Expr>();
    //joineableExpressionsByType = new HashMap<Type, Set<Expr>>();
    collectionsByType = new HashMap<String, Set<Expr>>();

    if (structureRelations.keySet().contains("thizPre")) {
      // Shoudl be present when learning post conditions
      //ExprVar thizPreExpr = ExprVar.make(null, "thizPre", structureRelations.get("thizPre"));
      //buildAllExpressions(thizPreExpr, "thizPre", scope);
    }

    //ExprVar thizExpr = ExprVar.make(null, "thiz", structureRelations.get("thiz"));
    //buildAllExpressions(thizExpr, "thiz", scope);

  }

  private void buildAllExpressions(Expr expr, String vertex, int currScope) throws Err {
    if (DynAlloyExpressionsUtils.isNumeric(expr.type())) {
      //joinedExpressionsOfTypeInt.add(expr);
      //allIntExpressions.add(expr);
    } else {
      if (!vertex.equals("thiz") && !vertex.equals("thizPre")) {
        //joinedExpressions.add(expr);
        Type exprType = expr.type();
        if (exprType.toString().contains("this/Collection")) {
          if (!collectionsByType.containsKey(exprType.toString()))
            collectionsByType.put(exprType.toString(), new HashSet<Expr>());
          collectionsByType.get(exprType.toString()).add(expr);
          //allIntExpressions.add(ExprVar.make(null, expr.toString() + " . size"));
        }
        if (exprType.toString().contains("this/Map_")) {
          // Type of key
          String keyTypeStr = exprType.toString().replace("{this/Map_", "").split("_")[0];
          Sig keySig = keyTypeStr.equals("Integer") || keyTypeStr.equals("String")
              ? new PrimSig("Collection_" + keyTypeStr)
              : null;
          if (keySig == null)
            throw new IllegalStateException("Type " + keyTypeStr + "is not supported");
          Type keyType = keySig.type();
          if (!collectionsByType.containsKey(keyType.toString()))
            collectionsByType.put(keyType.toString(), new HashSet<Expr>());
          collectionsByType.get(keyType.toString()).add(expr.join(ExprVar.make(null, "keySet")));
        }
      }
    }
    if (currScope > 0) {
      Set<DefaultEdge> outgoingEdges = structureGraph.outgoingEdgesOf(vertex);
      List<Expr> adjacentClosuredExpressions = new LinkedList<Expr>();
      for (DefaultEdge edge : outgoingEdges) {

        String targetVertex = structureGraph.getEdgeTarget(edge);
        if (vertex.equals(targetVertex))
          continue;
        //ExprVar adjacentExpr = ExprVar.make(null, targetVertex,
        //    structureRelations.get(targetVertex));

        // if (!expr.type().equals(expr.join(adjacentExpr).type())) {
        //if (!joineableExpressionsByType.containsKey(expr.type()))
        //  joineableExpressionsByType.put(expr.type(), new HashSet<Expr>());
        //joineableExpressionsByType.get(expr.type())
        //    .add(getCorrespondingEvaluableExpression(targetVertex));
        // }

        // if (!isClosure(targetVertex)) {
        // Just join with non closured expressions
        // Expr newExpr = expr.join(adjacentExpr);
        //buildAllExpressions(newExpr, targetVertex, currScope - 1);
        // }
        if (isClosure(targetVertex) && (!isClosure(vertex))) {
         // adjacentClosuredExpressions.add(adjacentExpr);
          //Expr closured = expr.join(ExprUnary.Op.RCLOSURE.make(null, adjacentExpr));
          //simpleClosuredExpressions.add(closured);
        }
      }

      for (int i = 0; i < adjacentClosuredExpressions.size() - 1; i++) {
        for (int j = i + 1; j < adjacentClosuredExpressions.size(); j++) {
          Expr closured = expr.join(ExprUnary.Op.RCLOSURE.make(null, ExprBinary.Op.PLUS.make(null,
              null, adjacentClosuredExpressions.get(i), adjacentClosuredExpressions.get(j))));
          //doubleClosuredExpressions.add(closured);
        }
      }

    }
  }

  /**
   * Create collections from the given closured expression
   */
  private void createCollections(Expr closured) {
    Set<Expr> joinableExpressions = getJoineableExpressionsOfCurrentType(
        DynAlloyExpressionsUtils.getTypeOfElementsInSet(closured));
    for (Expr e : joinableExpressions) {
      // For every expression that can be joined to the closured expression, create
      // the corresponding collection
      Expr collection = closured.join(e);
      Type collectionType = getReturnType(
          DynAlloyExpressionsUtils.getTypeOfElementsInSet(collection));
      // collectionType.
      if (!collectionsByType.containsKey(collectionType.toString()))
        collectionsByType.put(collectionType.toString(), new HashSet<Expr>());
      collectionsByType.get(collectionType.toString()).add(collection);
    }
  }

  /**
   * Given an expression of type int determine if can be used in cardinality expressions An
   * expressions e.f of type int can used in cardinality expressions if and only if e: A -> B and A
   * & B = empty. That is, e cannot be closured
   */
  private boolean allowToCreateCardinalityExpr(Expr intExpr) {
    ExprBinary binary = (ExprBinary) intExpr;
    if (binary.left instanceof ExprVar)
      return true;

    if (binary.left instanceof ExprBinary) {
      Expr rightExpr = ((ExprBinary) binary.left).right;
      List<List<PrimSig>> folded = rightExpr.type().fold();
      boolean allow = true;
      int i = 0;
      while (allow && i < folded.size()) {
        List<PrimSig> list = folded.get(i);
        if (list.get(0).type().intersects(list.get(1).type())) {
          allow = false;
        }
        i++;
      }
      return allow;
    }

    return false;
  }

  /**
   * Get corresponding evaluable expression according to name
   */
  private Expr getCorrespondingEvaluableExpression(String exprName) {
    //for (Expr expr : relationsForEvaluation) {
    //  if (exprName.equals(((ExprHasName) expr).label)) {
    //    return expr;
    //  }
    //}
    return null;
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
   * Build the expressions that can be evaluated for a list of commands
   * 
   * @param commands
   */
  private void buildExpressionsForCommands(ConstList<Command> commands) {
    commandExpressions = new HashMap<String, LinkedList<Expr>>();
    for (Command cmd : commands) {
      commandExpressions.put(cmd.label, new LinkedList<Expr>());
      //commandExpressions.get(cmd.label).addAll(buildExpressionsForCommand(cmd, joinedExpressions));
      //commandExpressions.get(cmd.label)
      //    .addAll(buildExpressionsForCommand(cmd, simpleClosuredExpressions));
      //commandExpressions.get(cmd.label)
      //    .addAll(buildExpressionsForCommand(cmd, doubleClosuredExpressions));
    }
  }

  /**
   * Returns all the given expression according to the given command
   */
  private List<Expr> buildExpressionsForCommand(Command cmd, List<Expr> expressions) {
    List<Expr> expressionsForCommand = new LinkedList<Expr>();
    for (Expr expr : expressions) {
      expressionsForCommand.add(renameExprAccordingToCommand(cmd.label, expr));
    }
    return expressionsForCommand;
  }

  /**
   * Rename a expressions for make it evaluable according to a command label
   * 
   * @param cmdLabel
   *          is the command label
   * @param expr
   *          is the expression to be renamed
   * @return a expression with a new name
   */
  private Expr renameExprAccordingToCommand(String cmdLabel, Expr expr) {
    if (expr instanceof ExprVar) {
      // The expression is a expr var
      String currentLabel = ((ExprVar) expr).label;
      String newLabel = "$" + cmdLabel + "_" + currentLabel;
      return ExprVar.make(null, newLabel, expr.type());
    } else {
      if (expr instanceof ExprUnary) {
        // The expression is closure
        Expr subExpr = ((ExprUnary) expr).sub;
        Expr newSubExpr = renameExprAccordingToCommand(cmdLabel, subExpr);
        return ExprUnary.Op.RCLOSURE.make(null, newSubExpr);
      } else {
        // The expression is a joined expr
        Expr leftExpr = ((ExprBinary) expr).left;
        Expr rightExpr = ((ExprBinary) expr).right;

        Expr newLeftExpr = renameExprAccordingToCommand(cmdLabel, leftExpr);
        Expr newRightExpr = renameExprAccordingToCommand(cmdLabel, rightExpr);
        return newLeftExpr.join(newRightExpr);
      }
    }
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
    if (evaluableExpr instanceof ExprVar) {
      return false;
    } else if (evaluableExpr instanceof ExprUnary) {
      if (((ExprUnary) evaluableExpr).op.equals(ExprUnary.Op.RCLOSURE)) {
        return true;
      } else {
        return false;
      }
    } else {
      ExprBinary binary = (ExprBinary) evaluableExpr;
      return hasClosuredExpr(binary.left) || hasClosuredExpr(binary.right);
    }
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
    Set<String> types = collectionsByType.keySet();
    LinkedList<Expr> allCollections = new LinkedList<Expr>();
    for (String t : types) {
      allCollections.addAll(collectionsByType.get(t));
    }
    return allCollections;
  }

  /**
   * Returns the collection attributes which type is the given type
   */
  public static List<Expr> getCollectionsOfType(String typeStr) {
    Set<String> types = collectionsByType.keySet();
    List<Expr> allCollections = new LinkedList<Expr>();
    for (String t : types) {
      if (t.contains("Collection_" + typeStr)) {
        allCollections.addAll(collectionsByType.get(t));
        break;
      }
    }
    if ("Integer".equals(typeStr)) {
      for (String t : types) {
        if (t.contains("Int") || t.contains("this/NodeValue")) {
          allCollections.addAll(collectionsByType.get(t));
        }
      }
    }
    return allCollections;
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
    if (expr instanceof ExprVar) {
      // Check is the label is the same that the expression
      ExprVar exprVar = (ExprVar) expr;
      if (exprVar.label.contains(expression)) {
        return 1;
      }
    } else if (expr instanceof ExprUnary) {
      // Count the ocurrences in the subexpression
      ExprUnary exprUnary = (ExprUnary) expr;
      if (exprUnary.op.equals(ExprUnary.Op.RCLOSURE)) {
        if (expression.charAt(0) == '*') {
          return getTotalOcurrences(expression.substring(1, expression.length()), exprUnary.sub);
        } else {
          return 0;
        }
      } else {
        return getTotalOcurrences(expression, exprUnary.sub);
      }
    } else if (expr instanceof ExprBinary) {
      ExprBinary exprBinary = (ExprBinary) expr;
      return getTotalOcurrences(expression, exprBinary.left)
          + getTotalOcurrences(expression, exprBinary.right);
    }
    return 0;
  }

  /**
   * Returns true if exists some binary relation r : type -> type + something
   */
  public boolean typeUsedInRecursiveRelation(Type type) {
    for (List<PrimSig> primSigList : type.fold()) {
      for (PrimSig primSig : primSigList) {
        if (signaturesUsedInRecursiveRelations.contains(primSig))
          return true;
      }
    }
    return false;
  }

  /**
   * Returns all the expression that can be joined with an expression of the given type. That is
   * expressions of the form: type -> AnotherType
   */
  public Set<Expr> getJoineableExpressionsOfCurrentType(Type type) {
    //if (joineableExpressionsByType.containsKey(type))
      //return joineableExpressionsByType.get(type);
    return new HashSet<>();
  }

  /**
   * Returns all the expression that can be joined with an expression of the given type, but keeping
   * the return type. That is an expression of the form type -> type + something
   */
  public List<Expr> getJoineableExpressionsOfCurrentTypeMaintinigReturnType(Expr expr) {
    Type type = expr.type();
    if (joineableExpressionsByType.containsKey(type)) {
      //Set<Expr> joineableToType = joineableExpressionsByType.get(type);
      List<Expr> sameReturnType = new LinkedList<Expr>();
      //for (Expr joineable : joineableToType) {
        //Type returnType = getReturnType(joineable.type());
       // if (type.intersects(returnType) && !expr.toString().contains(joineable.toString()))
       //   sameReturnType.add(joineable);
     // }
      //return sameReturnType;
    }
    return new LinkedList<>();
  }

  /**
   * Returns some possible value for the given type
   */
  public Expr getSomeValueForType(Type type) {
    Expr expr = signatureEvaluations.get(type).iterator().next();
    if (expr instanceof ExprVar) {
      return getCorrespondingSignature((ExprVar) expr);
    } else {
      return expr;
    }
  }

  /**
   * Returns some possible value for the given type
   */
  public static Expr getRandomValueForType(Type type) {
    Random random = new Random();
    List<Expr> evaluationsForType = signatureEvaluations.get(type);
    if (evaluationsForType != null && evaluationsForType.size() > 0) {
      int randomNumber = random.nextInt(evaluationsForType.size());
      Expr expr = signatureEvaluations.get(type).get(randomNumber);
      if (expr instanceof ExprVar) {
        return getCorrespondingSignature((ExprVar) expr);
      } else {
        return expr;
      }
    }
    return null;
  }

  /**
   * Returns some possible value for the given type
   */
  public static Expr getUnarySigForType(Type type) {
    Random random = new Random();
    List<Sig> sigs = new LinkedList<Sig>();
    for (Sig s : unarySignatures) {
      if (s.type().intersects(type))
        sigs.add(s);
    }
    if (sigs.size() > 0) {
      int randomNumber = random.nextInt(sigs.size());
      return sigs.get(randomNumber);
    }
    return null;
  }

  /**
   * Returns some possible expression of the given type
   */
  public Expr getRandomIntExpr() {
    Random random = new Random();
    if (allIntExpressions.isEmpty())
      return ExprConstant.ZERO;
    int randomNumber = random.nextInt(allIntExpressions.size());
    Expr expr = (Expr) allIntExpressions.toArray()[randomNumber];
    return expr;
  }

  /**
   * Returns a non-null return type for the given type.
   */
  public Type getReturnType(Type type) {
    // Get the first resulting non-null type
    Type t = null;
    for (List<PrimSig> primSigList : type.fold()) {
      if (primSigList.size() == 2) {
        t = primSigList.get(1).type();
        break;
      }
    }
    return t;
  }

  /**
   * Returns true if the type1 contains the type2
   */
  public boolean typeContains(Type type1, Type type2) {
    List<PrimSig> sigsType2 = type2.fold().get(0);
    for (List<PrimSig> primSigList : type1.fold()) {
      if (sigsType2.equals(primSigList))
        return true;
    }
    return false;
  }

  /**
   * Given an expr var, returns the corresponding signature. If is not found, then return the null
   * signature
   */
  public static Sig getCorrespondingSignature(ExprVar var) {
    String sigName = "this/" + var.label.substring(0, var.label.length() - 2);
    for (Sig signature : structureSignatures) {
      if (signature.label.equals(sigName))
        return signature;
    }
    return nullSig;
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
  public void addVariableForType(String typeName, String varName) {
    methodVarsType.put(varName, typeName);
    if (!methodVarsByType.containsKey(typeName))
      methodVarsByType.put(typeName, new HashSet<String>());
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
