package evospex.state.instrumentation;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JAssignStmt;
import soot.jimple.internal.JInvokeStmt;
import soot.jimple.internal.JVirtualInvokeExpr;

/**
 * Instrumenter class: Instrument the target methods to collect inputs and outputs
 * @author Facundo Molina
 */
public class Instrumenter {

  private static InvokeExpr getCorrespondingInvokeExpr(Stmt stmt) {
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
  public static void insertCallsToSaveInputState(UnitPatchingChain chain, Stmt stmt) {
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
  public static void insertCallsToSaveOutputState(SootMethod method, UnitPatchingChain chain, Stmt stmt) {
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

}
