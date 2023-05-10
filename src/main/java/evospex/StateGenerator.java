package evospex;

import evospex.state.StateSerializer;
import evospex.state.instrumentation.BytecodeUtils;
import org.junit.Test;
import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JAssignStmt;
import soot.jimple.internal.JInvokeStmt;
import soot.jimple.internal.JVirtualInvokeExpr;
import soot.options.Options;

import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * StateGenerator class: allows to serialize states from a given JUnit suite
 */
public class StateGenerator {

  private final String targetMethodName;

  private SootClass SOOT_TEST_CLASS;
  private SootMethod SOOT_TARGET_METHOD;

  /**
   * Setup all the necessary for Soot
   */
  private void setupSoot() {
    // Setup Soot
    G.reset();
    Options.v().set_prepend_classpath(true);
    Options.v().set_allow_phantom_refs(true);
    Options.v().set_soot_classpath(System.getProperty("java.class.path"));
  }

  /**
   * Constructor
   */
  public StateGenerator(String testSuiteClassName) {
    targetMethodName = "add";
    String targetMethodSignature = "<casestudies.motivation.AvlTreeList: boolean add(java.lang.Object)>";
    // Load the test suite
    try {
      // Load the test class
      Class.forName(testSuiteClassName);
      setupSoot();
      // Load the Soot class
      SOOT_TEST_CLASS = Scene.v().loadClassAndSupport(testSuiteClassName);
      Scene.v().loadClassAndSupport("evospex.state.StateSerializer");
      SOOT_TEST_CLASS.setApplicationClass();
      Scene.v().loadNecessaryClasses();
      SOOT_TARGET_METHOD = Scene.v().getMethod(targetMethodSignature);
      // Instrument the invocations to the target method
      instrumentInvocationsToTargetMethod();
    } catch (ClassNotFoundException e) {
      System.err.println("The test suite class " + testSuiteClassName + " can't be loaded. Is it in the classpath?");
      System.exit(1);
    }
  }

  /**
   * Instrument all the invocations to the target method within the test class
   */
  private void instrumentInvocationsToTargetMethod() {
    for (SootMethod method : SOOT_TEST_CLASS.getMethods()) {
      performInstrumentation(method);
    }
  }

  /**
   * Perform the instrumentation of the given method
   */
  private void performInstrumentation(SootMethod method) {
    // Inspect each unit within the method
    Body methodBody = method.retrieveActiveBody();
    List<Stmt> unitsToInstrument = new ArrayList<>();
    for (Unit unit : methodBody.getUnits()) {
      if (unit instanceof InvokeStmt) {
        InvokeStmt invokeStmt = (InvokeStmt)unit;
        boolean methodMatch = invokeStmt.getInvokeExpr().getMethod().getName().equals(targetMethodName);
        if (methodMatch) {
          unitsToInstrument.add(invokeStmt);
        }
      }
      if (unit instanceof AssignStmt) {
        AssignStmt assignStmt = (AssignStmt)unit;
        boolean methodMatch = assignStmt.getRightOp() instanceof InvokeExpr && ((InvokeExpr)assignStmt.getRightOp()).getMethod().getName().equals(targetMethodName);
        if (methodMatch) {
          unitsToInstrument.add(assignStmt);
        }
      }
    }
    // Check if target method has a return value
    boolean instrumented = unitsToInstrument.size() > 0;

    for (Stmt stmt : unitsToInstrument) {
      // Check if the invoke stmt has a return value
      insertCallsToSaveInputState(methodBody.getUnits(), stmt);
      insertCallsToSaveOutputState(method, methodBody.getUnits(), stmt);
    }

    if (instrumented) {
      System.out.println("=====================================");
      System.out.println("Instrumented test method --> : " + method.getName());
      System.out.println(methodBody);
      System.out.println("=====================================");
    }
  }

  private InvokeExpr getCorrespondingInvokeExpr(Stmt stmt) {
    InvokeExpr invokeExpr;
    if (stmt instanceof JInvokeStmt) {
      InvokeStmt invokeStmt = (InvokeStmt) stmt;
      invokeExpr = invokeStmt.getInvokeExpr();
    } else if (stmt instanceof JAssignStmt){
      AssignStmt assignStmt = (AssignStmt) stmt;
      invokeExpr = (InvokeExpr) assignStmt.getRightOp();
    } else {
      throw new IllegalArgumentException("The given statement is not an invocation statement");
    }
    return invokeExpr;
  }

  /**
   * Insert calls to serialize the target method inputs: the 'this' object, and the method arguments
   * @param chain the unit chain in which the call will be inserted
   * @param stmt the new call will be inserted before this statement
   */
  private void insertCallsToSaveInputState(UnitPatchingChain chain, Stmt stmt) {
    InvokeExpr invokeExpr = getCorrespondingInvokeExpr(stmt);
    SootMethod saveInputStateMethod = Scene.v().getMethod("<evospex.state.StateSerializer: void serializeInput(int,java.lang.Object)>");
    // Insert the call to serialize the 'this' object
    JVirtualInvokeExpr virtualInvokeExpr = (JVirtualInvokeExpr) invokeExpr;
    InvokeExpr invocation = Jimple.v().newStaticInvokeExpr(saveInputStateMethod.makeRef(), IntConstant.v(0), virtualInvokeExpr.getBase());
    Unit newUnit = Jimple.v().newInvokeStmt(invocation);
    chain.insertBefore(newUnit, stmt);
    // Insert the call to serialize the method arguments
    for (int i = 0; i < invokeExpr.getArgCount(); i++) {
      Value arg = invokeExpr.getArg(i);
      invocation = Jimple.v().newStaticInvokeExpr(saveInputStateMethod.makeRef(), IntConstant.v(i + 1), arg);
      newUnit = Jimple.v().newInvokeStmt(invocation);
      chain.insertBefore(newUnit, stmt);
    }
  }

  /**
   * Insert calls to serialize the target method outputs: the 'this' object, the method arguments and the return value (if any)
   * @param chain the unit chain in which the call will be inserted
   * @param stmt the new call will be inserted after this statement
   */
  private void insertCallsToSaveOutputState(SootMethod method, UnitPatchingChain chain, Stmt stmt) {
    InvokeExpr invokeExpr = getCorrespondingInvokeExpr(stmt);
    SootMethod saveOutputStateMethod = Scene.v().getMethod("<evospex.state.StateSerializer: void serializeOutput(int,java.lang.Object)>");
    // Insert the call to serialize the 'this' object
    JVirtualInvokeExpr virtualInvokeExpr = (JVirtualInvokeExpr) invokeExpr;
    InvokeExpr invocation = Jimple.v().newStaticInvokeExpr(saveOutputStateMethod.makeRef(), IntConstant.v(0), virtualInvokeExpr.getBase());
    Unit newUnit = Jimple.v().newInvokeStmt(invocation);
    chain.insertAfter(newUnit, stmt);
    // Insert the call to serialize the method arguments
    for (int i = 0; i < invokeExpr.getArgCount(); i++) {
      Value arg = invokeExpr.getArg(i);
      invocation = Jimple.v().newStaticInvokeExpr(saveOutputStateMethod.makeRef(), IntConstant.v(i + 1), arg);
      newUnit = Jimple.v().newInvokeStmt(invocation);
      chain.insertAfter(newUnit, stmt);
    }
    // Insert the call to serialize the return value (if any)
    if (invokeExpr.getMethod().getReturnType() != VoidType.v()) {
      if (stmt instanceof JInvokeStmt) {
        System.out.println("How to get values from alone invoke statements?");
      }
      if (stmt instanceof JAssignStmt) {
        JAssignStmt assignStmt = (JAssignStmt) stmt;
        // Check if the return type is primitive
        if (invokeExpr.getMethod().getReturnType() instanceof PrimType) {
          Value invocationResult = assignStmt.getLeftOp();
          // If it is boolean
          if (invokeExpr.getMethod().getReturnType() instanceof BooleanType) {
            // Insert a call that transforms the boolean value to the Boolean object, and assign it to a new local variable
            Local local = Jimple.v().newLocal("local0", RefType.v("java.lang.Boolean"));
            // Add the local if it does not exist
            if (!method.getActiveBody().getLocals().contains(local)) {
              method.getActiveBody().getLocals().add(local);
            }
            SootMethod valueOfMethod = Scene.v().getMethod("<java.lang.Boolean: java.lang.Boolean valueOf(boolean)>");
            InvokeExpr valueOfInvocation = Jimple.v().newStaticInvokeExpr(valueOfMethod.makeRef(), invocationResult);
            AssignStmt valueOfAssign = Jimple.v().newAssignStmt(local, valueOfInvocation);
            chain.insertAfter(valueOfAssign, stmt);
            // Insert the call to serialize the return value
            invocation = Jimple.v().newStaticInvokeExpr(saveOutputStateMethod.makeRef(), IntConstant.v(invokeExpr.getArgCount() + 1), local);
            newUnit = Jimple.v().newInvokeStmt(invocation);
            chain.insertAfter(newUnit, valueOfAssign);
          }
        }
      }
    }
  }

  /**
   * Setup the StateSerializer before performing the instrumentation
   */
  private void setupSerializer() {
    StateSerializer.setup(SOOT_TARGET_METHOD);
  }

  /**
   * Generate the positive states
   * The positive states are generated by running the test suite and serializing objects
   * before and after the invocation of the target method.
   */
  public void generatePositiveStates() throws InstantiationException, IllegalAccessException, FileNotFoundException, ClassNotFoundException {
    // Get the list of test methods
    Class<?> instrumentedClass = BytecodeUtils.loadAsClass(SOOT_TEST_CLASS);
    List<Method> testMethods = getRunnableTests(instrumentedClass);
    Object testObject = instrumentedClass.newInstance();

    // Setup serializer
    setupSerializer();

    for (Method testMethod : testMethods) {
      System.out.println("Running test: " + testMethod.getName());
      // Run the test method and collect the created objects
      try {
        Object result = testMethod.invoke(testObject);
      } catch (Exception e) {
        System.err.println("Error running test: " + testMethod.getName());
        e.printStackTrace();
      }
    }
  }

  /**
   * Get the list of runnable tests in the given test class
   * A test method is runnable if it is annotated with @Test.
   * @param clazz the test class
   * @return the list of methods corresponding to runnable tests
   */
  private List<Method> getRunnableTests(Class<?> clazz) {
    // Use reflection to find all the JUnit tests in the class
    ArrayList<Method> testMethods = new ArrayList<>();
    for (Method method : clazz.getDeclaredMethods()) {
      if (method.isAnnotationPresent(Test.class)) {
        testMethods.add(method);
      }
    }
    return testMethods;
  }

  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Usage: java -cp <cp> evospex.StateGenerator <testSuiteClassName>");
      System.exit(1);
    }
    StateGenerator sg = new StateGenerator(args[0]);
    try {
      sg.generatePositiveStates();
      // TODO: generate negative states
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}