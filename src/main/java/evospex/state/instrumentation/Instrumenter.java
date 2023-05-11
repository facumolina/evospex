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

  private static final String INPUT_SERIALIZATION_METHOD_SIGNATURE = "<evospex.state.StateSerializer: void serializeInput(int,java.lang.Object)>";
  private static final String OUTPUT_SERIALIZATION_METHOD_SIGNATURE = "<evospex.state.StateSerializer: void serializeOutput(int,java.lang.Object)>";

  /**
   * Get the corresponding invoke expression from a statement
   * @param stmt the statement
   * @return the corresponding invoke expression
   */
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
  public static void insertCallsToSaveInputState(SootMethod method, UnitPatchingChain chain, Stmt stmt) {
    InvokeExpr invokeExpr = getCorrespondingInvokeExpr(stmt);
    SootMethod saveInputStateMethod = Scene.v().getMethod(INPUT_SERIALIZATION_METHOD_SIGNATURE);
    // Insert the call to serialize the 'this' object
    JVirtualInvokeExpr virtualInvokeExpr = (JVirtualInvokeExpr) invokeExpr;
    insertInvocationBefore(chain, saveInputStateMethod, 0, virtualInvokeExpr.getBase(), stmt);
    // Insert the call to serialize the method arguments
    for (int i = 0; i < invokeExpr.getArgCount(); i++) {
      Value arg = invokeExpr.getArg(i);
      Type argType = arg.getType();
      if (argType instanceof PrimType) {
        AssignStmt valueOfAssign = insertInvocationToWrapPrimitiveValue(method, chain, argType, arg, stmt, false);
        insertInvocationBefore(chain, saveInputStateMethod, i + 1, valueOfAssign.getLeftOp(), stmt);
      } else {
        insertInvocationBefore(chain, saveInputStateMethod, i + 1, arg, stmt);
      }
    }
  }

  /**
   * Insert calls to serialize the target method outputs: the 'this' object, the method arguments and the return value (if any)
   * @param chain the unit chain in which the call will be inserted
   * @param stmt the new call will be inserted after this statement
   */
  public static void insertCallsToSaveOutputState(SootMethod method, UnitPatchingChain chain, Stmt stmt) {
    InvokeExpr invokeExpr = getCorrespondingInvokeExpr(stmt);
    SootMethod saveOutputStateMethod = Scene.v().getMethod(OUTPUT_SERIALIZATION_METHOD_SIGNATURE);
    // Insert the call to serialize the 'this' object
    JVirtualInvokeExpr virtualInvokeExpr = (JVirtualInvokeExpr) invokeExpr;
    insertInvocationAfter(chain, saveOutputStateMethod, 0, virtualInvokeExpr.getBase(), stmt);
    // Insert the call to serialize the method arguments
    for (int i = 0; i < invokeExpr.getArgCount(); i++) {
      Value arg = invokeExpr.getArg(i);
      Type argType = arg.getType();
      if (argType instanceof PrimType) {
        AssignStmt valueOfAssign = insertInvocationToWrapPrimitiveValue(method, chain, argType, arg, stmt, true);
        insertInvocationAfter(chain, saveOutputStateMethod, i + 1, valueOfAssign.getLeftOp(), valueOfAssign);
      } else {
        insertInvocationAfter(chain, saveOutputStateMethod, i + 1, arg, stmt);
      }
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
          Type resultType = invokeExpr.getMethod().getReturnType();
          // Insert a call that transforms the boolean value to the Boolean object, and assign it to a new local variable
          AssignStmt valueOfAssign = insertInvocationToWrapPrimitiveValue(method, chain, resultType, invocationResult, stmt, true);
          // Insert the call to serialize the return value
          insertInvocationAfter(chain, saveOutputStateMethod, invokeExpr.getArgCount() + 1, valueOfAssign.getLeftOp(), valueOfAssign);
        }
      }
    }
  }

  /**
   * Insert a call to the given method, which parameters are position and value, right after the given statement in
   * the given unit chain.
   * @param chain the unit chain in which the call will be inserted
   * @param sootMethod the method to call
   * @param position the position of the value in the state
   * @param value the value to serialize
   * @param stmt the new call will be inserted after this statement
   */
  private static void insertInvocationBefore(UnitPatchingChain chain, SootMethod sootMethod, int position, Value value, Stmt stmt) {
    InvokeExpr invocation = Jimple.v().newStaticInvokeExpr(sootMethod.makeRef(), IntConstant.v(position), value);
    Unit newUnit = Jimple.v().newInvokeStmt(invocation);
    chain.insertBefore(newUnit, stmt);
  }

  /**
   * Insert a call to the given method, which parameters are position and value, right after the given statement in
   * the given unit chain.
   * @param chain the unit chain in which the call will be inserted
   * @param sootMethod the method to call
   * @param position the position of the value in the state
   * @param value the value to serialize
   * @param stmt the new call will be inserted after this statement
   */
  private static void insertInvocationAfter(UnitPatchingChain chain, SootMethod sootMethod, int position, Value value, Stmt stmt) {
    InvokeExpr invocation = Jimple.v().newStaticInvokeExpr(sootMethod.makeRef(), IntConstant.v(position), value);
    Unit newUnit = Jimple.v().newInvokeStmt(invocation);
    chain.insertAfter(newUnit, stmt);
  }

  /**
   * Insert a call to wrap a primitive value into an object, right after the given statement in the given unit chain.
   * @param method the method in which the call will be inserted
   * @param chain the unit chain in which the call will be inserted
   * @param value the value to wrap
   * @param stmt the new call will be inserted after this statement
   * @return the assign statement that wraps the primitive value into an object
   */
  private static AssignStmt insertInvocationToWrapPrimitiveValue(SootMethod method, UnitPatchingChain chain, Type resultType, Value value, Stmt stmt, boolean after) {
    Local local = getCorrespondingLocalForPrimitiveType(resultType);
    // Add the local if it does not exist
    if (!method.getActiveBody().getLocals().contains(local)) {
      method.getActiveBody().getLocals().add(local);
    }
    SootMethod valueOfMethod = getCorrespondingMethodToWrapPrimitiveValue(resultType);
    InvokeExpr valueOfInvocation = Jimple.v().newStaticInvokeExpr(valueOfMethod.makeRef(), value);
    AssignStmt valueOfAssign = Jimple.v().newAssignStmt(local, valueOfInvocation);
    if (after) {
      chain.insertAfter(valueOfAssign, stmt);
    } else {
      chain.insertBefore(valueOfAssign, stmt);
    }
    return valueOfAssign;
  }

  /**
   * Get the corresponding local variable for the given primitive type
   * @param type the primitive type
   * @return the corresponding local variable
   */
  private static Local getCorrespondingLocalForPrimitiveType(Type type) {
    if (type instanceof BooleanType) {
      return Jimple.v().newLocal("local_boolean", RefType.v("java.lang.Boolean"));
    }
    if (type instanceof ByteType) {
      return Jimple.v().newLocal("local_byte", RefType.v("java.lang.Byte"));
    }
    if (type instanceof CharType) {
      return Jimple.v().newLocal("local_character", RefType.v("java.lang.Character"));
    }
    if (type instanceof DoubleType) {
      return Jimple.v().newLocal("local_double", RefType.v("java.lang.Double"));
    }
    if (type instanceof FloatType) {
      return Jimple.v().newLocal("local_float", RefType.v("java.lang.Float"));
    }
    if (type instanceof IntType) {
      return Jimple.v().newLocal("local_int", RefType.v("java.lang.Integer"));
    }
    if (type instanceof LongType) {
      return Jimple.v().newLocal("local_long", RefType.v("java.lang.Long"));
    }
    if (type instanceof ShortType) {
      return Jimple.v().newLocal("local_short", RefType.v("java.lang.Short"));
    }
    throw new RuntimeException("Type not supported: " + type);
  }

  /**
   * Get the corresponding method to wrap the given primitive value into an object.
   * @param type the primitive type
   * @return the corresponding method to call
   */
  private static SootMethod getCorrespondingMethodToWrapPrimitiveValue(Type type) {
    if (type instanceof BooleanType) {
      return Scene.v().getMethod("<java.lang.Boolean: java.lang.Boolean valueOf(boolean)>");
    }
    if (type instanceof ByteType) {
      return Scene.v().getMethod("<java.lang.Byte: java.lang.Byte valueOf(byte)>");
    }
    if (type instanceof CharType) {
      return Scene.v().getMethod("<java.lang.Character: java.lang.Character valueOf(char)>");
    }
    if (type instanceof DoubleType) {
      return Scene.v().getMethod("<java.lang.Double: java.lang.Double valueOf(double)>");
    }
    if (type instanceof FloatType) {
      return Scene.v().getMethod("<java.lang.Float: java.lang.Float valueOf(float)>");
    }
    if (type instanceof IntType) {
      return Scene.v().getMethod("<java.lang.Integer: java.lang.Integer valueOf(int)>");
    }
    if (type instanceof LongType) {
      return Scene.v().getMethod("<java.lang.Long: java.lang.Long valueOf(long)>");
    }
    if (type instanceof ShortType) {
      return Scene.v().getMethod("<java.lang.Short: java.lang.Short valueOf(short)>");
    }
    throw new RuntimeException("Type not supported: " + type);
  }
}
