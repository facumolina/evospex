package evospex;

import evospex.state.instrumentation.BytecodeUtils;
import org.junit.Test;
import soot.*;
import soot.jimple.InvokeExpr;
import soot.jimple.InvokeStmt;
import soot.jimple.Jimple;
import soot.options.Options;

import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * StateGenerator class: allows to serialize states from a given JUnit suite
 */
public class StateGenerator {

  private final String testSuiteClassName;
  private final String targetMethodName;

  private Class<?> TEST_CLASS;
  private SootClass SOOT_TEST_CLASS;

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
    this.testSuiteClassName = testSuiteClassName;
    targetMethodName = "add";
    // Load the test suite
    try {
      // Load the test class
      TEST_CLASS = Class.forName(testSuiteClassName);
      setupSoot();
      // Load the Soot class
      SOOT_TEST_CLASS = Scene.v().loadClassAndSupport(testSuiteClassName);
      Scene.v().loadClassAndSupport("evospex.state.StateSerializer");
      SOOT_TEST_CLASS.setApplicationClass();
      Scene.v().loadNecessaryClasses();
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
    List<InvokeStmt> unitsToInstrument = new ArrayList<>();
    for (Unit unit : methodBody.getUnits()) {
      if (unit instanceof InvokeStmt) {
        InvokeStmt invokeStmt = (InvokeStmt)unit;
        boolean methodMatch = invokeStmt.getInvokeExpr().getMethod().getName().equals(targetMethodName);
        if (methodMatch) {
          unitsToInstrument.add(invokeStmt);
        }
      }
    }
    // Instrument the units
    boolean instrumented = unitsToInstrument.size() > 0;
    for (InvokeStmt invokeStmt : unitsToInstrument) {
      appendCallSaveInputState(methodBody.getUnits(), invokeStmt);
    }

    if (instrumented) {
      System.out.println("=====================================");
      System.out.println("Method: " + method.getName() + " has been instrumented");
      System.out.println(methodBody);
      System.out.println("=====================================");
    }
  }

  private void appendCallSaveInputState(UnitPatchingChain chain, InvokeStmt invokeStmt) {
    InvokeExpr invokeExpr = invokeStmt.getInvokeExpr();
    SootMethod saveInputStateMethod = Scene.v().getMethod("<evospex.state.StateSerializer: void serializeInput(java.lang.Object)>");
    InvokeExpr invocation = Jimple.v().newStaticInvokeExpr(saveInputStateMethod.makeRef(), invokeExpr.getArg(0));
    Unit newUnit = Jimple.v().newInvokeStmt(invocation);
    chain.insertBefore(newUnit, invokeStmt);
  }

  /**
   * Generate the states
   */
  public void generateStates() throws InstantiationException, IllegalAccessException, FileNotFoundException, ClassNotFoundException {
    // Get the list of test methods
    Class<?> instrumentedClass = BytecodeUtils.loadAsClass(SOOT_TEST_CLASS);
    List<Method> testMethods = getRunnableTests(instrumentedClass);
    Object testObject = instrumentedClass.newInstance();

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
      sg.generateStates();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}