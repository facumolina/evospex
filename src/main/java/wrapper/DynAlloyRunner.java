package wrapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import evospex.ConfigurationProperties;
import rfm.dynalloy.A4Reporter;
import rfm.dynalloy.ConstList;
import rfm.dynalloy.Err;
import rfm.dynalloy.Pos;
import rfm.dynalloyCompiler.ast.Command;
import rfm.dynalloyCompiler.ast.Decl;
import rfm.dynalloyCompiler.ast.Expr;
import rfm.dynalloyCompiler.ast.ExprBinary;
import rfm.dynalloyCompiler.ast.ExprCall;
import rfm.dynalloyCompiler.ast.ExprConstant;
import rfm.dynalloyCompiler.ast.ExprHasName;
import rfm.dynalloyCompiler.ast.ExprList;
import rfm.dynalloyCompiler.ast.ExprList.Op;
import rfm.dynalloyCompiler.ast.ExprQt;
import rfm.dynalloyCompiler.ast.ExprUnary;
import rfm.dynalloyCompiler.ast.ExprVar;
import rfm.dynalloyCompiler.ast.Func;
import rfm.dynalloyCompiler.ast.Sig.PrimSig;
import rfm.dynalloyCompiler.ast.Type;
import rfm.dynalloyCompiler.parser.CompModule;
import rfm.dynalloyCompiler.parser.CompUtil;
import rfm.dynalloyCompiler.translator.A4Options;
import rfm.dynalloyCompiler.translator.A4Solution;
import rfm.dynalloyCompiler.translator.TranslateAlloyToKodkod;
import utils.TargetInformation;
import utils.DynAlloyExpressionsUtils;

/**
 * Class used as intermediate to connect with Dynalloy
 * 
 * @author gregis
 */
public class DynAlloyRunner extends Runner {

  private String catalogName;
  private String repOkname;
  private Func repOK;
  private Func catalog;
  private CompModule ast;
  private ArrayList<Expr> elements;
  private ConstList<Decl> decls;
  private ConstList<Command> commands;
  public static final double maxCounterexamplesAllowed = 60;
  private int assertnum;
  private int currentRepOkSize;
  private int currentRepOKLine;

  /**
   * Creates a DynAlloy runner object, associated to the provided file. repOK predicate name is
   * simply repOK.
   **/
  public DynAlloyRunner(File file) {
    super(file);
    currentRepOKLine = getCurrentRepOKLineAccordingToFile();
  }

  /**
   * Creates a DynAlloy runner object, associated to the provided file, and a user provided
   * predicate to be analyzed.
   * @param repOkName
   *          is the name of the predicate for analysis (predicate containing) the invariant to be
   *          analyzed.
   * @throws IOException
   * @throws FileNotFoundException
   */
  public DynAlloyRunner(File file, String catalogName, String repOkName) {
    super(file);
    this.catalogName = "this/" + catalogName;
    this.repOkname = "this/" + repOkName;
    currentRepOKLine = getCurrentRepOKLineAccordingToFile(file);
    setUp();
  }

  /**
   * @return ordered set of elements (starting with and's operands ) present in the repOK predicate
   */
  public ArrayList<Expr> getRepOkElements() {
    return elements;
  }

  /**
   * @return ordered set of elements (starting with and's operands ) present in the repOK predicate
   *         as String
   */
  public String[] getRepOkElementsAsString() {
    String[] res = new String[elements.size()];
    for (int i = 0; i < elements.size(); i++) {
      res[i] = elements.get(i).toString();
    }
    return res;
  }

  /**
   * Returns the maximum number of counterexamples allowed
   */
  public double getNumberOfCounterexamplesAllowed() {
    return maxCounterexamplesAllowed;
  }

  /**
   * Set the body of the repOK predicate as a conjunction of elements which position is true in the
   * parameter.
   * 
   * @param useElements:
   *          int array indicating if the element with index position will be present in the
   *          predicate body as an AND operand.
   */
  public void setRepOKbody(int[] useElements) {
    ArrayList<Expr> list = new ArrayList<Expr>();
    // Ignore the position at text.
    Pos nowhere = new Pos(catalog.pos.filename, catalog.pos.x, catalog.pos.y);
    int i = 0;
    for (Expr expr : elements) {
      if (useElements[i] == 0) {
        // The gene is false, so add the negation of the expression
        list.add(ExprUnary.Op.NOT.make(nowhere, expr));
      } else if (useElements[i] == 1) {
        // The gene is true, so add the expression
        list.add(expr);
      }
      i++;
    }
    currentRepOkSize = list.size();
    // Generate the new repOK body as chromosome indicates
    ExprList newbody = ExprList.make(nowhere, nowhere, Op.AND, list);
    try {
      catalog.setBody(newbody);
    } catch (Err e) {
      System.out.print(e.msg);
    }
  }

  /**
   * Get a default alloy pos
   * 
   * @return
   */
  public Pos getDefaultPos() {
    return new Pos(repOK.pos.filename, repOK.pos.x, repOK.pos.y);
  }

  public void setRepOkbodyFromExpressionList(List<Expr> expressionList) {
    // Ignore the position at text.
    elements = new ArrayList<Expr>();
    elements.addAll(expressionList);
    Pos nowhere = new Pos(repOK.pos.filename, repOK.pos.x, repOK.pos.y);
    ExprList newbody = ExprList.make(nowhere, nowhere, Op.AND, expressionList);
    try {
      repOK.setBody(newbody);
    } catch (Err e) {
      System.out.print(e.msg);
    }
  }

  /**
   * Set the body of the repOK predicate with a simple expression.
   */
  public void setRepOKbody(Expr Element) {
    // Ignore the position at text.
    try {
      repOK.setBody(Element);
    } catch (Err e) {
      System.out.print(e.msg);
    }
  }

  /**
   * Get the current repOK body
   */
  public Expr getRepOKBody() {
    return catalog == null ? repOK.getBody() : catalog.getBody();
  }

  /**
   * Run all check present in the file and returns if each one ends as expected
   * 
   * @return boolean array reporting the result as expected
   * @throws Err
   */
  public boolean[] checkAsserts() {
    boolean[] res = new boolean[assertnum];
    // Report and options to execute commands
    A4Options options = new A4Options();
    // Set the SatSolver
    options.solver = A4Options.SatSolver.SAT4J;
    A4Reporter rep = new A4Reporter();
    int i = 0;
    for (Command cmd : commands) {
      // Execute the command
      try {
        A4Solution ans = TranslateAlloyToKodkod.execute_command(rep, ast.getAllReachableSigs(), cmd,
            options);
        // all command treated as check (if not so see cmd.check attribute)
        // set each result if ends as exprected
        res[i] = (cmd.expects == 1 && ans.satisfiable())
            || (cmd.expects == 0 && !ans.satisfiable());
        i++;
      } catch (Err e) {
        System.out.print(e.msg);
      }
    }
    return res;
  }

  /**
   * Given an assert (index), calculate the percent of the elements that the assert holds
   * 
   * @return percent
   * @throws Err
   */
  public double checkFailPercent(int assertnum1) {
    double res = 0.0;
    // Report and options to execute commands
    A4Options options = new A4Options();
    // Set the SatSolver
    options.solver = A4Options.SatSolver.SAT4J;
    A4Reporter rep = new A4Reporter();
    Command cmd = commands.get(assertnum1);
    for (Expr elm : elements) {
      // Execute the command with only one element
      try {
        setRepOKbody(elm);
        A4Solution ans = TranslateAlloyToKodkod.execute_command(rep, ast.getAllReachableSigs(), cmd,
            options);
        if ((cmd.expects == 1 && ans.satisfiable()) || (cmd.expects == 0 && !ans.satisfiable()))
          res++;
      } catch (Err e) {
        System.out.print(e.msg);
      }
    }
    return res / elements.size(); // return the percent as decimal
  }

  /**
   * Checks assertions
   */
  public double checkAsserts2() {
    // Report and options to execute commands
    A4Options options = new A4Options();
    // Set the SatSolver
    options.solver = A4Options.SatSolver.SAT4J;
    A4Reporter rep = new A4Reporter();
    double d = 0;
    for (Command cmd : commands) {
      // Execute the command
      try {
        A4Solution ans = TranslateAlloyToKodkod.execute_command(rep, ast.getAllReachableSigs(), cmd,
            options);
        // all command treated as check (if not so see cmd.check attribute)
        // set each result if ends as exprected
        if (cmd.expects == 0) {
          // Positive assert
          if (!ans.satisfiable()) {
            d += 1;
          } else {
            // d =
          }
        } else {
          // Negative assert
          if (ans.satisfiable()) {
            d += 0.1;
          } else {
            // d =
          }
        }
      } catch (Err e) {
        System.out.print(e.msg);
      }
    }
    return d;
  }

  /**
   * Counts all the found counterexamples for all the asserts
   * 
   * @return the amount of found counterexamples
   */
  public double countCounterexamples() {
    A4Options options = new A4Options();
    // Set the SatSolver
    options.solver = A4Options.SatSolver.SAT4J;
    A4Reporter rep = new A4Reporter();
    double counterexamples = 0;
    for (Command cmd : commands) {
      // Execute the command
      try {
        A4Solution ans = TranslateAlloyToKodkod.execute_command(rep, ast.getAllReachableSigs(), cmd,
            options);
        if (ans.satisfiable() && (counterexamples < maxCounterexamplesAllowed)) {
          while (ans.satisfiable() && (counterexamples < maxCounterexamplesAllowed)) {
            counterexamples++;
            ans = ans.next();
          }
        }
      } catch (Err e) {
        System.out.print(e.msg);
      }
    }
    return counterexamples;
  }

  /**
   * Get the set of all the found counterexamples for all the asserts
   * 
   * @return the found counterexamples
   */
  public Set<A4Solution> getCounterexamples() {
    Set<A4Solution> counterexamples = new HashSet<A4Solution>();
    A4Options options = new A4Options();
    // Set the SatSolver
    options.solver = A4Options.SatSolver.SAT4J;
    A4Reporter rep = new A4Reporter();
    for (Command cmd : commands) {
      // Execute the command
      try {
        A4Solution ans = TranslateAlloyToKodkod.execute_command(rep, ast.getAllReachableSigs(), cmd,
            options);

        // Positive counter example and instance found.
        if (cmd.label.equals("PositiveCounterExample") && ans.satisfiable())
          return null;

        if (ans.satisfiable() && (counterexamples.size() < maxCounterexamplesAllowed)) {
          while (ans.satisfiable() && (counterexamples.size() < maxCounterexamplesAllowed)) {
            counterexamples.add(ans);
            ans = ans.next();
          }
        }
      } catch (Err e) {
        System.out.print(e.msg);
      }
    }
    return counterexamples;
  }

  /**
   * Returns true if the current repOK has at least one positive counterexample. That is, an example
   * that satisfies the specification being learned but do not satisfy the current repOK.
   */
  public boolean hasPositiveCounterexamples() {
    A4Options options = new A4Options();
    // Set the SatSolver
    options.solver = A4Options.SatSolver.SAT4J;
    A4Reporter rep = new A4Reporter();
    Command cmd = getPositiveCounterexamplesCommand();
    try {
      A4Solution ans = TranslateAlloyToKodkod.execute_command(rep, ast.getAllReachableSigs(), cmd,
          options);
      // Positive counter example found
      return (ans.satisfiable());
    } catch (Err e) {
      System.out.print(e.msg);
      return false;
    }

  }

  /**
   * Get the amount of counterexamples using the field exhaustive approach
   * 
   * @return the found counterexamples
   */
  public int getCounterexamplesFieldExhaustive() {
    try {
      // Executes the field exhaustive approach
      executeFieldExahustive();
      // Return the amount of obtained counterexamples
      return getAllObtainedCounterexamples();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return -1;
  }

  /**
   * Get all the found counterexamples using field exhaustive
   * 
   * @return the found counterexamples
   */
  public Set<String> getSetCounterexamplesFieldExhaustive() {
    try {
      // Execute the field exhaustive approach
      executeFieldExahustive();
      // Return the set of obtained counterexamples
      return getAllObtainedCounterexamplesAsStringSet();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * Executes the field exhaustive approach in order to count the instances that satisfies and not
   * the current repOK.
   */
  private void executeFieldExahustive() throws IOException, Err, InterruptedException {

    // Write the repOK of the current candidate.
    writeRepOkInFile(ConfigurationProperties.getFieldExhaustiveDirectory() + "/learning-spec/");

    // Clear the field exhaustive directory.
    clearFieldExhaustiveDir();

    // Go to the field exhaustive directory and then call the python script to compute the
    // instances.
    List<String> commands1 = new ArrayList<String>();
    commands1.add("/bin/sh");
    commands1.add("-c");
    commands1.add("cd " + ConfigurationProperties.getFieldExhaustiveDirectory()
        + "; python2.7 bottomup-save-instances.py learning-spec/" + this.filename);
    ProcessBuilder pb = new ProcessBuilder(commands1);
    Process process = pb.start();
    process.waitFor();
  }

  /**
   * Writes the repOk of the current candidate to the file being analyzed
   */
  public void writeRepOkInFile(String currentFile) {
    // Get the current repOK as string with valid Alloy syntax.
    try {
      String currentRepOkString = convertCurrentRepOkToString();

      // Write the current repOK in the Alloy file being analyzed
      List<String> commands1 = new ArrayList<String>();
      commands1.add("/bin/sh");
      commands1.add("-c");
      commands1.add(getSedCommand(currentRepOkString, currentFile + this.filename));
      ProcessBuilder pb = new ProcessBuilder(commands1);
      Process process = pb.start();
      process.waitFor();

      // Get the result of the execution (if any).
      InputStream is = process.getInputStream();
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader br = new BufferedReader(isr);
      String lineRead = "";
      while ((lineRead = br.readLine()) != null) {
        System.out.println(lineRead);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Clear the current field exhaustive directory in order to remove previous instances and results
   */
  private void clearFieldExhaustiveDir() throws IOException, InterruptedException {
    // Clear instances directory
    List<String> commands1 = new ArrayList<String>();
    commands1.add("/bin/sh");
    commands1.add("-c");
    commands1.add("rm " + ConfigurationProperties.getFieldExhaustiveDirectory() + "/instances/*");
    ProcessBuilder pb = new ProcessBuilder(commands1);
    Process process = pb.start();
    process.waitFor();
    // Clear results directory
    commands1 = new ArrayList<String>();
    commands1.add("/bin/sh");
    commands1.add("-c");
    commands1.add("rm " + ConfigurationProperties.getFieldExhaustiveDirectory() + "/results/*");
    pb = new ProcessBuilder(commands1);
    process = pb.start();
    process.waitFor();
  }

  /**
   * Get sed command according to the current operating system.
   */
  private String getSedCommand(String currentRepOkString, String currentFile) {
    String currentOS = System.getProperty("os.name");
    if (currentOS.startsWith("Mac"))
      return "sed -i '' -e '" + currentRepOKLine + "s/.*/" + currentRepOkString + "/' "
          + currentFile;

    return "sed -i '" + currentRepOKLine + "s/.*/" + currentRepOkString + "/' " + currentFile;
  }

  /**
   * Converts the current repOK to a string in a valid alloy syntax
   */
  private String convertCurrentRepOkToString() {
    String repOKString = "";

    ExprList currentRepOK;
    if (catalog != null) {
      currentRepOK = (ExprList) catalog.getBody();
    } else {
      currentRepOK = (ExprList) repOK.getBody();
    }

    for (int i = 0; i < currentRepOK.args.size(); i++) {
      Expr expr = currentRepOK.args.get(i);
      String currentExprString = DynAlloyExpressionsUtils.getExpressionAsAlloyString(expr);
      repOKString += "(" + currentExprString + ")";
      if (i < currentRepOK.args.size() - 1)
        repOKString += " and ";
    }

    return repOKString;
  }

  /**
   * Get the line in which the repOK body must be placed
   */
  private int getCurrentRepOKLineAccordingToFile() {
    if (this.filename.equals("SinglyLinkedListDYN3.als"))
      return 65;
    if (this.filename.equals("SinglyLinkedListDYN5.als"))
      return 105;
    if (this.filename.equals("SinglySortedLinkedListDYN3.als"))
      return 59;
    if (this.filename.equals("BinaryTreeDYN3.als"))
      return 27;
    if (this.filename.equals("BinaryTreeDYN5.als"))
      return 36;
    if (this.filename.equals("RedBlackTreeDYN5.als"))
      return 36;
    if (this.filename.equals("RedBlackTreeWithoutPathsPropertyDYN3.als"))
      return 32;
    if (this.filename.equals("RedBlackTreeWithoutPathsPropertyDYN5.als"))
      return 36;
    if (this.filename.equals("BinaryHeapDYN3.als"))
      return 41;
    if (this.filename.equals("BinaryHeapDYN5.als"))
      return 78;
    if (this.filename.equals("DagDYN3.als"))
      return 27;
    if (this.filename.equals("SinglyCircularListDYN3.als"))
      return 27;
    throw new IllegalStateException("Error getting the repOk body line in file " + this.filename);
  }

  /**
   * Get the line number in which the repOK body must be placed
   * 
   * @throws IOException
   * @throws FileNotFoundException
   */
  private int getCurrentRepOKLineAccordingToFile(File file) {
    int lineNumber = 0;
    boolean found = false;
    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      String line;
      while ((line = br.readLine()) != null && !found) {
        lineNumber++;
        if (line.startsWith("--repOKBody"))
          found = true;
      }
      br.close();
    } catch (Exception e) {
    }
    return lineNumber;
  }

  /**
   * Returns all the obtained counterexamples from the last field exhaustive execution
   */
  private int getAllObtainedCounterexamples() throws IOException {
    File instances = new File(System.getProperty("user.dir") + "/field-exhaustive-gen/instances/");
    return instances.listFiles().length;
  }

  /**
   * Returns all the obtained counterexamples from the last field exhaustive execution as string set
   */
  private Set<String> getAllObtainedCounterexamplesAsStringSet() throws IOException {
    Set<String> counterexamples = new HashSet<String>();
    File instances = new File(System.getProperty("user.dir") + "/field-exhaustive-gen/instances/");
    File[] listOfinstances = instances.listFiles();

    // Loop over all the instances and add it to the counterexamples set
    for (int i = 0; i < listOfinstances.length; i++) {
      Scanner sc = new Scanner(listOfinstances[i]);
      String instanceString = sc.useDelimiter("\\Z").next();
      counterexamples.add(instanceString);
      sc.close();
    }
    return counterexamples;
  }

  /**
   * Gets the positive counter examples command
   */
  private Command getPositiveCounterexamplesCommand() {
    for (Command cmd : commands) {
      if (cmd.label.equals("PositiveCounterExample"))
        return cmd;
    }
    return null;
  }

  /**
   * Generates a positive or negative example according to the being learned predicate
   * 
   * @param value
   *          indicates the example type that will be generated. True for positive examples and
   *          false for negative examples
   * @return the generated example
   */
  public A4Solution generateExample(boolean value) {
    Expr expr;
    if (value) {
      expr = ExprConstant.FALSE;
    } else {
      expr = ExprConstant.TRUE;
    }
    setRepOKbody(expr);
    // Report and options to execute commands
    A4Options options = new A4Options();
    // Set the SatSolver
    options.solver = A4Options.SatSolver.SAT4J;
    A4Reporter rep = new A4Reporter();
    for (Command cmd : commands) {
      // Execute the command
      try {
        if ((!value && cmd.label.equals("NegativeCounterExample"))
            || (value && cmd.label.equals("PositiveCounterExample"))) {
          A4Solution ans = TranslateAlloyToKodkod.execute_command(rep, ast.getAllReachableSigs(),
              cmd, options);
          if (ans.satisfiable()) {
            return ans;
          }
        }
      } catch (Err e) {
        System.out.print(e.msg);
      }
    }
    return null;
  }

  /**
   * Returns the number of assertions in the loaded (Dyn)Alloy model
   * 
   * @return the number of assertions in the DynAlloy model.
   */
  public int getNumberOfAssertions() {
    return assertnum;
  }

  /**
   * Parse the (Dyn)Alloy specification file getting the corresponding AST.
   */
  @Override
  protected void setUp() {
    // Parse the specification file
    A4Reporter rep = new A4Reporter();
    try {
      ast = CompUtil.parseEverything_fromFile(rep, null, filePath);
      assertnum = ast.getAllCommands().size();
      commands = ast.getAllCommands();
      // Get RepOK
      for (Func pred : ast.getAllFunc()) {
        if (pred.label.equals(repOkname)) {
          repOK = pred;
        }
        if (pred.label.equals(catalogName)) {
          catalog = pred;
          decls = pred.decls;
        }
      }
      // Get elements
      if (repOK == null) {
        System.out.print("No repOK Found.");
      }
      if (catalog == null) {
        decls = repOK.decls;
        Expr body = repOK.getBody();
        elements = new ArrayList<Expr>();
        AndExtractorVisitor visitor = new AndExtractorVisitor(elements);
        body.accept(visitor);
      } else {
        Expr body = catalog.getBody();
        elements = new ArrayList<Expr>();
        AndExtractorVisitor visitor = new AndExtractorVisitor(elements);
        body.accept(visitor);
      }
    } catch (Err e) {
      System.out.print(e.msg);
    }
  }

  /**
   * Get the data structure information
   * 
   * @return a new data structure information from the list of declarations in the main predicate
   * @throws Err
   */
  public TargetInformation getStructureInformation() throws Err {
    return new TargetInformation(decls, commands);
  }

  /**
   * Check when two given types can be joined
   * 
   * @return true iff the types match for build the expression type1.type2
   */
  public static boolean joinableTypes(Type type1, Type type2) {
    List<List<PrimSig>> foldedType1 = type1.fold();
    List<List<PrimSig>> foldedType2 = type2.fold();
    for (List<PrimSig> listType1 : foldedType1) {
      for (List<PrimSig> listType2 : foldedType2) {
        if (listType1.get(listType1.size() - 1).equals(listType2.get(0)) && listType2.size() > 1) {
          return true;
        }
      }
    }
    return false;
  }

  public Expr translateExpression(ExprVar expression) {
    for (Decl decl : decls) {
      for (ExprHasName expr : decl.names) {
        String declName = expr.label;
        String realExprName = expression.label.replace("$PositiveCounterExample_", "");
        realExprName = realExprName.replace("$NegativeCounterExample_", "");
        if (realExprName.equals(declName)) {
          return decl.names.get(0);
        }
      }
    }
    return null;
  }

  /**
   * Returns the total number of expressions in the repOk
   */
  public double totalExpressions() {
    return getRepOkElements().size();
  }

  /**
   * Returns the amount of true expressions in the repOk
   */
  public double totalTrueExpressions() {
    double trueExpressions = 0;
    for (Expr expr : elements) {
      if (expr.equals(ExprConstant.TRUE)) {
        trueExpressions++;
      }
    }
    return trueExpressions;
  }

  /**
   * Returns the amount of non true expressions
   */
  public double totalActiveExpressions() {
      return totalExpressions() - totalTrueExpressions();
  }

  /**
   * Counts the total amount of operators of the current repOk
   */
  public double countTotalOperators() {
    double r = 0;
    for (Expr expr : elements) {
      r += amountOfOperators(expr);
    }
    return r;
  }

  /**
   * Counts the amount of operators of the given expression
   */
  private double amountOfOperators(Expr expr) {
    if (expr instanceof ExprVar) {
      return 0;
    } else if (expr instanceof ExprUnary) {
      ExprUnary exprUnary = (ExprUnary) expr;
      return 1 + amountOfOperators(exprUnary.sub);
    } else if (expr instanceof ExprBinary) {
      ExprBinary exprBinary = (ExprBinary) expr;
      return 1 + amountOfOperators(exprBinary.left) + amountOfOperators(exprBinary.right);
    } else if (expr instanceof ExprQt) {
      ExprQt exprQt = (ExprQt) expr;
      double r = 1;
      for (Decl d : exprQt.decls) {
        r += amountOfOperators(d.expr);
      }
      r += amountOfOperators(exprQt.sub);
      return r;
    } else if (expr instanceof ExprCall) {
      ExprCall exprCall = (ExprCall) expr;
      return 1 + amountOfOperators(exprCall.fun.getBody());
    } else {
      return 0;
    }
  }
}