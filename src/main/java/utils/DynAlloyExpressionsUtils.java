package utils;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;

import org.jgap.Chromosome;

import rfm.dynalloy.Err;
import rfm.dynalloyCompiler.ast.Decl;
import rfm.dynalloyCompiler.ast.Expr;
import rfm.dynalloyCompiler.ast.ExprBinary;
import rfm.dynalloyCompiler.ast.ExprCall;
import rfm.dynalloyCompiler.ast.ExprConstant;
import rfm.dynalloyCompiler.ast.ExprHasName;
import rfm.dynalloyCompiler.ast.ExprList;
import rfm.dynalloyCompiler.ast.ExprQt;
import rfm.dynalloyCompiler.ast.ExprUnary;
import rfm.dynalloyCompiler.ast.ExprVar;
import rfm.dynalloyCompiler.ast.Func;
import rfm.dynalloyCompiler.ast.Sig;
import rfm.dynalloyCompiler.ast.Type;

/**
 * This class provides utilities for the DynAlloy expressions management
 * 
 * @author fmolina
 */
public class DynAlloyExpressionsUtils {

  public static void printList(List<Chromosome> chromosomes)
      throws FileNotFoundException, UnsupportedEncodingException {
    PrintWriter writer = new PrintWriter("/home/koodu/facu/machinelearningspec/chromosomes.txt",
        "UTF-8");
    writer.println("CHROMOSOMES");
    writer.println();
    for (Chromosome c : chromosomes) {
      writer.println(c.toString());
      writer.println();
    }
    writer.close();
  }

  /**
   * Given a simple closured expression e.*f and a quantification operator creates the expression op
   * n : e.*f : n != n.f
   */
  public static Expr createsQuantifiedExpressionCurrentAndNextNotEquals(Expr closuredExpression,
      ExprQt.Op op) {
    // Create n
    ExprVar n = ExprVar.make(null, "n", closuredExpression.type());
    List<ExprHasName> names = new LinkedList<ExprHasName>();
    names.add(n);
    // Create declarations
    Decl decl = new Decl(null, null, null, names, closuredExpression);
    List<Decl> decls = new LinkedList<Decl>();
    decls.add(decl);

    // Create body
    Expr f = getExpressionAfterClosure(closuredExpression);
    Expr njoinf = ExprBinary.Op.JOIN.make(null, null, n, f);
    Expr body = ExprBinary.Op.NOT_EQUALS.make(null, null, n, njoinf);

    // Create expression
    ExprQt qtExpr = (ExprQt) op.make(null, null, decls, body);
    return qtExpr;
  }

  /**
   * Given a double closured expression e.*(f+g), a quantification operator and an int i creates the
   * expression: - op n : e.*(f+g) : n != n.f if i = 1 - op n : e.*(f+g) : n != n.g if i = 2 - op n
   * : e.*(f+g) : n.f != n.g if i = 3
   */
  public static Expr createsQuantifiedExpressionCurrentAndNextNotEquals(Expr closuredExpression,
      ExprQt.Op op, int i) {
    // Create n
    ExprVar n = ExprVar.make(null, "n", closuredExpression.type());
    List<ExprHasName> names = new LinkedList<ExprHasName>();
    names.add(n);
    // Create declarations
    Decl decl = new Decl(null, null, null, names, closuredExpression);
    List<Decl> decls = new LinkedList<Decl>();
    decls.add(decl);

    // Create body
    Expr body;
    if (i == 1 || i == 2) {
      Expr e = getExpressionAfterClosure(closuredExpression, i);
      Expr njoine = ExprBinary.Op.JOIN.make(null, null, n, e);
      body = ExprBinary.Op.NOT_EQUALS.make(null, null, n, njoine);
    } else {
      if (i == 3) {
        Expr f = getExpressionAfterClosure(closuredExpression, 1);
        Expr g = getExpressionAfterClosure(closuredExpression, 2);
        Expr njoinf = ExprBinary.Op.JOIN.make(null, null, n, f);
        Expr njoing = ExprBinary.Op.JOIN.make(null, null, n, g);
        body = ExprBinary.Op.NOT_EQUALS.make(null, null, njoinf, njoing);
      } else {
        Expr f = getExpressionAfterClosure(closuredExpression, 1);
        Expr g = getExpressionAfterClosure(closuredExpression, 2);
        Expr njoinf = ExprBinary.Op.JOIN.make(null, null, n, f);
        Expr njoinfjoing = ExprBinary.Op.JOIN.make(null, null, njoinf, g);
        body = ExprBinary.Op.EQUALS.make(null, null, n, njoinfjoing);
      }
    }

    // Create expression
    ExprQt qtExpr = (ExprQt) op.make(null, null, decls, body);
    return qtExpr;
  }

  /**
   * Given a double closured expression e.*(f+g), a joinable expression r, a possible value for r, a
   * quantification operator and an int i creates the expression:
   * 
   * - op n : e.*(f+g) : n.r=v => n.f.r=v if i = 1
   * 
   * - op n : e.*(f+g) : n.r=v => n.g.r=v if i = 2
   * 
   * - op n : e.*(f+g) : n.r=v => n.f.r=v and n.g.r=v if i = 3
   */
  public static Expr createsQuantifiedExpressionCurrentValueImpliesNextValueEqual(
      Expr closuredExpression, Expr joinableExpr, Type joinableExprReturnType, Expr value,
      ExprQt.Op op, int i) throws Err {
    // Create n
    ExprVar n = ExprVar.make(null, "n", closuredExpression.type());
    List<ExprHasName> names = new LinkedList<ExprHasName>();
    names.add(n);
    // Create declarations
    Decl decl = new Decl(null, null, null, names, closuredExpression);
    List<Decl> decls = new LinkedList<Decl>();
    decls.add(decl);

    Expr body;
    if (isNumeric(joinableExprReturnType)) {
      // Creates body with expr calls for int evaluation

      // Left equality. n.joinableExpr = value
      Expr leftSideFirst = ExprBinary.Op.JOIN.make(null, null, ExprUnary.Op.NOOP.make(null, n),
          ExprUnary.Op.NOOP.make(null, joinableExpr));
      Expr leftSideSecond = ExprUnary.Op.CAST2SIGINT.make(null, value);
      // Creates args
      List<Expr> args = createsArgsForBinaryIntegerExprCall(leftSideFirst, leftSideSecond);
      // Creates Func
      ExprVar n1 = ExprVar.make(null, "n1", Sig.SIGINT.type());
      ExprVar n2 = ExprVar.make(null, "n2", Sig.SIGINT.type());
      Func fun = createsFunForIntegerComparisonExprCall(n1, n2, ExprBinary.Op.EQUALS);

      Expr exprCall = ExprCall.make(null, null, fun, args, 0);

      // Right equality. n.f.joinableExpr = value
      Expr e = getExpressionAfterClosure(closuredExpression, i);
      Expr njoine = ExprBinary.Op.JOIN.make(null, null, n, e);
      Expr rightSideFirst = ExprBinary.Op.JOIN.make(null, null, njoine, joinableExpr);
      Expr rightSideSecond = ExprUnary.Op.CAST2SIGINT.make(null, value);
      // Creates args
      List<Expr> args2 = createsArgsForBinaryIntegerExprCall(rightSideFirst, rightSideSecond);
      // Creates Func
      ExprVar n12 = ExprVar.make(null, "n1", Sig.SIGINT.type());
      ExprVar n22 = ExprVar.make(null, "n2", Sig.SIGINT.type());
      Func fun2 = createsFunForIntegerComparisonExprCall(n12, n22, ExprBinary.Op.EQUALS);

      Expr exprCall2 = ExprCall.make(null, null, fun2, args2, 0);

      body = ExprBinary.Op.IMPLIES.make(null, null, exprCall, exprCall2);

    } else {
      // Creates body

      // Left implication side
      // n.r=v
      Expr nUnary = ExprUnary.Op.NOOP.make(null, n);
      Expr joinableExprUnary = ExprUnary.Op.NOOP.make(null, joinableExpr);
      Expr njoinexpr = ExprBinary.Op.JOIN.make(null, null, nUnary, joinableExprUnary);
      Expr valueUnary = ExprUnary.Op.NOOP.make(null, value);
      Expr njoinexpreqvalue = ExprBinary.Op.EQUALS.make(null, null, njoinexpr, valueUnary);

      if (i == 1 || i == 2) {

        // Right implication side
        // n.e.r=v
        Expr e = getExpressionAfterClosure(closuredExpression, i);
        Expr njoine = ExprBinary.Op.JOIN.make(null, null, n, e);
        Expr njoinejoinexpreqvalue = ExprBinary.Op.EQUALS.make(null, null,
            ExprBinary.Op.JOIN.make(null, null, njoine, joinableExpr), value);

        body = ExprBinary.Op.IMPLIES.make(null, null, njoinexpreqvalue, njoinejoinexpreqvalue);

      } else {

        // Right implication side
        // n.f.r=v
        Expr f = getExpressionAfterClosure(closuredExpression, 1);
        Expr njoinf = ExprBinary.Op.JOIN.make(null, null, n, f);
        Expr njoinfjoinexpreqvalue = ExprBinary.Op.EQUALS.make(null, null,
            ExprBinary.Op.JOIN.make(null, null, njoinf, joinableExpr), value);

        // n.g.r=v
        Expr g = getExpressionAfterClosure(closuredExpression, 2);
        Expr njoing = ExprBinary.Op.JOIN.make(null, null, n, g);
        Expr njoingjoinexpreqvalue = ExprBinary.Op.EQUALS.make(null, null,
            ExprBinary.Op.JOIN.make(null, null, njoing, joinableExpr), value);

        // n.r=v => n.f.r=v and n.g.r=v
        body = ExprBinary.Op.IMPLIES.make(null, null, njoinexpreqvalue,
            ExprBinary.Op.AND.make(null, null, njoinfjoinexpreqvalue, njoingjoinexpreqvalue));
      }
    }
    // Create expression
    ExprQt qtExpr = (ExprQt) op.make(null, null, decls, body);
    return qtExpr;
  }

  /**
   * Given a double closured expression e.*(f+g), a joinable expression r, a possible value for r, a
   * quantification operator and an int i creates the expression:
   * 
   * - op n : e.*(f+g) : n.r=v => n.f != null if i = 1
   * 
   * - op n : e.*(f+g) : n.r=v => n.g != null if i = 2
   */
  public static Expr createsQuantifiedExpressionCurrentValueImpliesNextNotNull(
      Expr closuredExpression, Expr joinableExpr, Type joinableExprReturnType, Expr value,
      ExprQt.Op op, Sig nullSig, int i) throws Err {
    // Create n
    ExprVar n = ExprVar.make(null, "n", closuredExpression.type());
    List<ExprHasName> names = new LinkedList<ExprHasName>();
    names.add(n);
    // Create declarations
    Decl decl = new Decl(null, null, null, names, closuredExpression);
    List<Decl> decls = new LinkedList<Decl>();
    decls.add(decl);

    // Creates body
    // Left implication side
    // n.r=v
    Expr nUnary = ExprUnary.Op.NOOP.make(null, n);
    Expr joinableExprUnary = ExprUnary.Op.NOOP.make(null, joinableExpr);
    Expr njoinexpr = ExprBinary.Op.JOIN.make(null, null, nUnary, joinableExprUnary);
    Expr valueUnary = ExprUnary.Op.NOOP.make(null, value);
    Expr njoinexpreqvalue = ExprBinary.Op.EQUALS.make(null, null, njoinexpr, valueUnary);

    // Right implication side
    // n.e != null
    Expr e = getExpressionAfterClosure(closuredExpression, i);
    Expr njoine = ExprBinary.Op.JOIN.make(null, null, n, e);
    Expr njoinenotnull = ExprBinary.Op.NOT_EQUALS.make(null, null, njoine, nullSig);

    Expr body = ExprBinary.Op.IMPLIES.make(null, null, njoinexpreqvalue, njoinenotnull);

    // Create expression
    ExprQt qtExpr = (ExprQt) op.make(null, null, decls, body);
    return qtExpr;
  }

  /**
   * Given a simple closured expression e.*f, an expression r and a quantification operator creates
   * a gene value with expression
   * 
   * - op n : e.*f : n.r != null
   */
  public static Expr createsQuantifiedExpressionCurrentValueNotNull(Expr closuredExpression,
      Expr joinableExpr, ExprQt.Op op, Sig nullSig) throws Err {
    // Create n
    ExprVar n = ExprVar.make(null, "n", closuredExpression.type());
    List<ExprHasName> names = new LinkedList<ExprHasName>();
    names.add(n);
    // Create declarations
    Decl decl = new Decl(null, null, null, names, closuredExpression);
    List<Decl> decls = new LinkedList<Decl>();
    decls.add(decl);
    // Left part n.r
    Expr nJoinJoinableExpr = ExprBinary.Op.JOIN.make(null, null, ExprUnary.Op.NOOP.make(null, n),
        ExprUnary.Op.NOOP.make(null, joinableExpr));
    // Creates the body
    Expr body = ExprBinary.Op.NOT_EQUALS.make(null, null, nJoinJoinableExpr, nullSig);
    // Create expression
    ExprQt qtExpr = (ExprQt) op.make(null, null, decls, body);
    return qtExpr;
  }

  /**
   * Given a simple closured expression e.*f, an expression r and a quantification operator creates
   * a gene value with expression - op n : e.*f : (n.f!=Null) => n.r = n.f.r
   */
  public static Expr createsQuantifiedExpressionCurrentValueOpNextValue(Expr closuredExpression,
      Expr joinableExpr, ExprQt.Op op, Sig nullSig) throws Err {
    // Create n
    ExprVar n = ExprVar.make(null, "n", closuredExpression.type());
    List<ExprHasName> names = new LinkedList<ExprHasName>();
    names.add(n);
    // Create declarations
    Decl decl = new Decl(null, null, null, names, closuredExpression);
    List<Decl> decls = new LinkedList<Decl>();
    decls.add(decl);

    Expr body;
    // Assume that the expression type is int.
    // Creates the body

    // Left equality. n.joinableExpr
    Expr nJoinJoinableExpr = ExprBinary.Op.JOIN.make(null, null, ExprUnary.Op.NOOP.make(null, n),
        ExprUnary.Op.NOOP.make(null, joinableExpr));

    // Right equality n.f.joinableExpr
    Expr f = getExpressionAfterClosure(closuredExpression);
    Expr njoinf = ExprBinary.Op.JOIN.make(null, null, n, f);
    Expr njoinfjoinjoinabkeExpr = ExprBinary.Op.JOIN.make(null, null,
        ExprUnary.Op.NOOP.make(null, njoinf), ExprUnary.Op.NOOP.make(null, joinableExpr));

    // Creates args
    List<Expr> args = createsArgsForBinaryIntegerExprCall(nJoinJoinableExpr,
        njoinfjoinjoinabkeExpr);

    // Creates Func
    ExprVar n1 = ExprVar.make(null, "n1", Sig.SIGINT.type());
    ExprVar n2 = ExprVar.make(null, "n2", Sig.SIGINT.type());
    Func fun = createsFunForIntegerComparisonExprCall(n1, n2, ExprBinary.Op.EQUALS);

    Expr exprCall = ExprCall.make(null, null, fun, args, 0);

    body = ExprBinary.Op.IMPLIES.make(null, null,
        ExprBinary.Op.NOT_EQUALS.make(null, null, njoinf, nullSig), exprCall);

    // Create expression
    ExprQt qtExpr = (ExprQt) op.make(null, null, decls, body);
    return qtExpr;

  }

  /**
   * Given a double closured expression e.*(f+g), an expression r and a quantification operator
   * creates a gene value with expression:
   * 
   * - op n : e.*(f+g) | (n.f!=Null)=> n.r = n.f.r if i==1
   * 
   * - op n : e.*(f+g) | (n.g!=Null)=> n.r = n.g.r if i==2
   */
  public static Expr createsQuantifiedExpressionCurrentValueOpFstNextValueCurrentValueOpSndNextValue(
      Expr closuredExpression, Expr joinableExpr, ExprQt.Op op, Sig nullSig, int i) throws Err {
    // Create n
    ExprVar n = ExprVar.make(null, "n", closuredExpression.type());
    List<ExprHasName> names = new LinkedList<ExprHasName>();
    names.add(n);
    // Create declarations
    Decl decl = new Decl(null, null, null, names, closuredExpression);
    List<Decl> decls = new LinkedList<Decl>();
    decls.add(decl);

    // Assume that the expression type is int.
    // Creates the body

    // n.joinableExpr
    Expr nJoinJoinableExpr = ExprBinary.Op.JOIN.make(null, null, ExprUnary.Op.NOOP.make(null, n),
        ExprUnary.Op.NOOP.make(null, joinableExpr));

    if (i == 1) {
      // First equality n.f.joinableExpr
      Expr f = getExpressionAfterClosure(closuredExpression, 1);
      Expr njoinf = ExprBinary.Op.JOIN.make(null, null, n, f);
      Expr njoinfjoinjoinabkeExpr = ExprBinary.Op.JOIN.make(null, null,
          ExprUnary.Op.NOOP.make(null, njoinf), ExprUnary.Op.NOOP.make(null, joinableExpr));

      // Creates args
      List<Expr> args = createsArgsForBinaryIntegerExprCall(nJoinJoinableExpr,
          njoinfjoinjoinabkeExpr);

      // Creates Func
      ExprVar n1 = ExprVar.make(null, "n1", Sig.SIGINT.type());
      ExprVar n2 = ExprVar.make(null, "n2", Sig.SIGINT.type());
      Func fun = createsFunForIntegerComparisonExprCall(n1, n2, ExprBinary.Op.EQUALS);

      Expr exprCall = ExprCall.make(null, null, fun, args, 0);

      Expr body = ExprBinary.Op.IMPLIES.make(null, null,
          ExprBinary.Op.NOT_EQUALS.make(null, null, njoinf, nullSig), exprCall);

      // Create expression
      ExprQt qtExpr = (ExprQt) op.make(null, null, decls, body);
      return qtExpr;
    } else if (i == 2) {
      // Second equality n.g.joinableExpr
      Expr g = getExpressionAfterClosure(closuredExpression, 2);
      Expr njoing = ExprBinary.Op.JOIN.make(null, null, n, g);
      Expr njoingjoinjoinabkeExpr = ExprBinary.Op.JOIN.make(null, null,
          ExprUnary.Op.NOOP.make(null, njoing), ExprUnary.Op.NOOP.make(null, joinableExpr));

      // Creates args
      List<Expr> args2 = createsArgsForBinaryIntegerExprCall(nJoinJoinableExpr,
          njoingjoinjoinabkeExpr);

      // Creates Func
      ExprVar n12 = ExprVar.make(null, "n1", Sig.SIGINT.type());
      ExprVar n22 = ExprVar.make(null, "n2", Sig.SIGINT.type());
      Func fun2 = createsFunForIntegerComparisonExprCall(n12, n22, ExprBinary.Op.EQUALS);

      Expr exprCall2 = ExprCall.make(null, null, fun2, args2, 0);

      Expr body = ExprBinary.Op.IMPLIES.make(null, null,
          ExprBinary.Op.NOT_EQUALS.make(null, null, njoing, nullSig), exprCall2);

      // Create expression
      ExprQt qtExpr = (ExprQt) op.make(null, null, decls, body);
      return qtExpr;
    } else {
      return createsQuantifiedExpressionCurrentValueOpFstNextValueCurrentValueOpSndNextValue(
          closuredExpression, joinableExpr, op, nullSig);
    }

  }

  /**
   * Given a double closured expression e.*(f+g), an expression r and a quantification operator
   * creates a gene value with expression - op n : e.*(f+g) | ((n.f!=Null)=> n.r = n.f.r) AND
   * ((n.g!=Null)=> n.r = n.g.r)
   */
  public static Expr createsQuantifiedExpressionCurrentValueOpFstNextValueCurrentValueOpSndNextValue(
      Expr closuredExpression, Expr joinableExpr, ExprQt.Op op, Sig nullSig) throws Err {
    // Create n
    ExprVar n = ExprVar.make(null, "n", closuredExpression.type());
    List<ExprHasName> names = new LinkedList<ExprHasName>();
    names.add(n);
    // Create declarations
    Decl decl = new Decl(null, null, null, names, closuredExpression);
    List<Decl> decls = new LinkedList<Decl>();
    decls.add(decl);

    // Assume that the expression type is int.
    // Creates the body

    // n.joinableExpr
    Expr nJoinJoinableExpr = ExprBinary.Op.JOIN.make(null, null, ExprUnary.Op.NOOP.make(null, n),
        ExprUnary.Op.NOOP.make(null, joinableExpr));

    // First equality n.f.joinableExpr
    Expr f = getExpressionAfterClosure(closuredExpression, 1);
    Expr njoinf = ExprBinary.Op.JOIN.make(null, null, n, f);
    Expr njoinfjoinjoinabkeExpr = ExprBinary.Op.JOIN.make(null, null,
        ExprUnary.Op.NOOP.make(null, njoinf), ExprUnary.Op.NOOP.make(null, joinableExpr));

    // Creates args
    List<Expr> args = createsArgsForBinaryIntegerExprCall(nJoinJoinableExpr,
        njoinfjoinjoinabkeExpr);

    // Creates Func
    ExprVar n1 = ExprVar.make(null, "n1", Sig.SIGINT.type());
    ExprVar n2 = ExprVar.make(null, "n2", Sig.SIGINT.type());
    Func fun = createsFunForIntegerComparisonExprCall(n1, n2, ExprBinary.Op.EQUALS);

    Expr exprCall = ExprCall.make(null, null, fun, args, 0);

    Expr binaryLeft = ExprBinary.Op.IMPLIES.make(null, null,
        ExprBinary.Op.NOT_EQUALS.make(null, null, njoinf, nullSig), exprCall);

    // Second equality n.g.joinableExpr
    Expr g = getExpressionAfterClosure(closuredExpression, 2);
    Expr njoing = ExprBinary.Op.JOIN.make(null, null, n, g);
    Expr njoingjoinjoinabkeExpr = ExprBinary.Op.JOIN.make(null, null,
        ExprUnary.Op.NOOP.make(null, njoing), ExprUnary.Op.NOOP.make(null, joinableExpr));

    // Creates args
    List<Expr> args2 = createsArgsForBinaryIntegerExprCall(nJoinJoinableExpr,
        njoingjoinjoinabkeExpr);

    // Creates Func
    ExprVar n12 = ExprVar.make(null, "n1", Sig.SIGINT.type());
    ExprVar n22 = ExprVar.make(null, "n2", Sig.SIGINT.type());
    Func fun2 = createsFunForIntegerComparisonExprCall(n12, n22, ExprBinary.Op.EQUALS);

    Expr exprCall2 = ExprCall.make(null, null, fun2, args2, 0);

    Expr binaryRight = ExprBinary.Op.IMPLIES.make(null, null,
        ExprBinary.Op.NOT_EQUALS.make(null, null, njoing, nullSig), exprCall2);

    Expr body = ExprBinary.Op.AND.make(null, null, binaryLeft, binaryRight);

    // Create expression
    ExprQt qtExpr = (ExprQt) op.make(null, null, decls, body);
    return qtExpr;

  }

  /**
   * Given a double closured expression e.*(f+g), an expression r and a quantification operator
   * creates a gene value with expression - op n : e.*(f+g) | (op m: n.f.*(f+g)-Null : n.r=m.r) AND
   * (op m: n.g.*(f+g)-Null : n.r=m.r)
   */
  public static Expr createsQuantifiedExpressionQtCurrentValueOpFstNextValueQtCurrentValueOpSndNextValue(
      Expr closuredExpression, Expr joinableExpr, ExprQt.Op op, Sig nullSig) throws Err {

    // Create n
    ExprVar n = ExprVar.make(null, "n", closuredExpression.type());
    List<ExprHasName> names = new LinkedList<ExprHasName>();
    names.add(n);
    // Create declarations
    Decl decl = new Decl(null, null, null, names, closuredExpression);
    List<Decl> decls = new LinkedList<Decl>();
    decls.add(decl);

    // Construct the expressions n.f.*(f+g)-Null and n.g.*(f+g)-Null
    ExprBinary plusexpr = (ExprBinary) getExpressionAfterClosure(closuredExpression);
    Expr leftQtDomain = ExprBinary.Op.MINUS.make(null,
        null, ExprBinary.Op.JOIN.make(null, null, n, ExprBinary.Op.JOIN.make(null, null,
            plusexpr.left, ExprUnary.Op.RCLOSURE.make(null, plusexpr))),
        TargetInformation.nullSig);
    Expr rightQtDomain = ExprBinary.Op.MINUS.make(null,
        null, ExprBinary.Op.JOIN.make(null, null, n, ExprBinary.Op.JOIN.make(null, null,
            plusexpr.right, ExprUnary.Op.RCLOSURE.make(null, plusexpr))),
        TargetInformation.nullSig);

    // Creates the body
    // n.joinableExpr
    Expr nJoinJoinableExpr = ExprBinary.Op.JOIN.make(null, null, ExprUnary.Op.NOOP.make(null, n),
        ExprUnary.Op.NOOP.make(null, joinableExpr));

    // Creates the left side quantification
    // Create m
    ExprVar m = ExprVar.make(null, "m", leftQtDomain.type());
    List<ExprHasName> namesLeftQt = new LinkedList<ExprHasName>();
    namesLeftQt.add(m);
    // Create declarations
    Decl declQtLeft = new Decl(null, null, null, namesLeftQt, leftQtDomain);
    List<Decl> declsQtLeft = new LinkedList<Decl>();
    declsQtLeft.add(declQtLeft);

    // m.joinableExpr
    Expr mJoinJoinableExpr = ExprBinary.Op.JOIN.make(null, null, ExprUnary.Op.NOOP.make(null, m),
        ExprUnary.Op.NOOP.make(null, joinableExpr));

    // Creates left quantification body
    List<Expr> args = createsArgsForBinaryIntegerExprCall(mJoinJoinableExpr, nJoinJoinableExpr);
    ExprVar n1 = ExprVar.make(null, "n1", Sig.SIGINT.type());
    ExprVar n2 = ExprVar.make(null, "n2", Sig.SIGINT.type());
    Func fun = createsFunForIntegerComparisonExprCall(n1, n2, ExprBinary.Op.LT);
    Expr exprCall = ExprCall.make(null, null, fun, args, 0);

    // Create expression
    ExprQt leftQtExpr = (ExprQt) op.make(null, null, declsQtLeft, exprCall);

    // Creates the right side quantification
    // Create m
    ExprVar o = ExprVar.make(null, "o", rightQtDomain.type());
    List<ExprHasName> namesRightQt = new LinkedList<ExprHasName>();
    namesRightQt.add(o);
    // Create declarations
    Decl declQtRight = new Decl(null, null, null, namesRightQt, rightQtDomain);
    List<Decl> declsQtRight = new LinkedList<Decl>();
    declsQtRight.add(declQtRight);

    // m.joinableExpr
    Expr oJoinJoinableExpr = ExprBinary.Op.JOIN.make(null, null, ExprUnary.Op.NOOP.make(null, o),
        ExprUnary.Op.NOOP.make(null, joinableExpr));

    // Creates right quantification body
    List<Expr> args2 = createsArgsForBinaryIntegerExprCall(oJoinJoinableExpr, nJoinJoinableExpr);
    ExprVar n12 = ExprVar.make(null, "n12", Sig.SIGINT.type());
    ExprVar n22 = ExprVar.make(null, "n22", Sig.SIGINT.type());
    Func fun2 = createsFunForIntegerComparisonExprCall(n12, n22, ExprBinary.Op.GTE);
    Expr exprCall2 = ExprCall.make(null, null, fun2, args2, 0);

    // Create expression
    ExprQt rightQtExpr = (ExprQt) op.make(null, null, declsQtRight, exprCall2);

    // Quantification body
    Expr body = ExprBinary.Op.AND.make(null, null, leftQtExpr, rightQtExpr);

    // Create expression
    ExprQt qtExpr = (ExprQt) op.make(null, null, decls, body);
    return qtExpr;

  }

  /**
   * Given a simple closured expression e.*f and a quantification operator creates the expression op
   * n : e.*f : n in n.^f
   */
  public static Expr createsQuantifiedExpressionVarInSet(Expr closuredExpression, ExprQt.Op op) {
    // Create variables
    ExprVar n = ExprVar.make(null, "n", closuredExpression.type());
    List<ExprHasName> names = new LinkedList<ExprHasName>();
    names.add(n);
    // Create declarations
    Decl decl = new Decl(null, null, null, names, closuredExpression);
    List<Decl> decls = new LinkedList<Decl>();
    decls.add(decl);

    // Creates in body
    Expr body = createsInBody(n, closuredExpression);

    // Create expression
    ExprQt qtExpr = (ExprQt) op.make(null, null, decls, body);
    return qtExpr;
  }

  /**
   * Given a double closured expression e.*(f+g), a quantification operator and an int i creates the
   * expression : - op n : e.*f : n in n.^f if i=1 - op n : e.*f : n in n.^g if i=2
   */
  public static Expr createsQuantifiedExpressionVarInSet(Expr closuredExpression, ExprQt.Op op,
      int i) {
    // Create variables
    ExprVar n = ExprVar.make(null, "n", closuredExpression.type());
    List<ExprHasName> names = new LinkedList<ExprHasName>();
    names.add(n);
    // Create declarations
    Decl decl = new Decl(null, null, null, names, closuredExpression);
    List<Decl> decls = new LinkedList<Decl>();
    decls.add(decl);
    // Creates in body
    Expr body = createsInBody(n, closuredExpression, i);

    // Create expression
    ExprQt qtExpr = (ExprQt) op.make(null, null, decls, body);
    return qtExpr;
  }

  /**
   * Given a double closured expression e.*(f+g) and a quantification operator creates the
   * expression op n : e.*(f+g) : e.f.*(f+g) != e.g.*(f+g)
   */
  public static Expr createsQuantifiedtExpressionSetNotEqualSet(Expr closuredExpression,
      ExprQt.Op op) {
    // Create variables
    ExprVar n = ExprVar.make(null, "n", closuredExpression.type());
    List<ExprHasName> names = new LinkedList<ExprHasName>();
    names.add(n);
    // Create declarations
    Decl decl = new Decl(null, null, null, names, closuredExpression);
    List<Decl> decls = new LinkedList<Decl>();
    decls.add(decl);

    // Creates not equals sets body
    Expr body = createsNotEqualsSetsBody(n, closuredExpression);

    // Create expression
    ExprQt qtExpr = (ExprQt) op.make(null, null, decls, body);
    return qtExpr;
  }

  /**
   * Creates the expression intExpr = # (closuredExpression - Null)
   */
  public static Expr createsCardinalitySetEqualsToIntExpr(Expr closuredExpr, Expr intExpr)
      throws Err {
    Expr cardinality = ExprUnary.Op.CAST2SIGINT.make(null, ExprUnary.Op.CARDINALITY.make(null,
        ExprBinary.Op.MINUS.make(null, null, closuredExpr, TargetInformation.nullSig)));

    // Creates args
    List<Expr> args = createsArgsForBinaryIntegerExprCall(intExpr, cardinality);

    // Creates Func
    ExprVar n1 = ExprVar.make(null, "n1", Sig.SIGINT.type());
    ExprVar n2 = ExprVar.make(null, "n2", Sig.SIGINT.type());
    Func fun = createsFunForIntegerComparisonExprCall(n1, n2, ExprBinary.Op.EQUALS);

    Expr exprCall = ExprCall.make(null, null, fun, args, 0);
    return exprCall;
  }

  /**
   * Creates args that will be arguments of a binary expression between the given integer
   * expressions
   */
  private static List<Expr> createsArgsForBinaryIntegerExprCall(Expr left, Expr right) {
    List<Expr> args = new LinkedList<Expr>();
    args.add(left);
    args.add(right);
    return args;
  }

  /**
   * Creates a fun for allow to compare by op two expressions of type Int
   */
  private static Func createsFunForIntegerComparisonExprCall(ExprVar n1, ExprVar n2,
      ExprBinary.Op op) throws Err {

    // Creates body
    Expr left = ExprUnary.Op.CAST2SIGINT.make(null,
        ExprUnary.Op.CAST2INT.make(null, ExprUnary.Op.NOOP.make(null, n1)));
    Expr right = ExprUnary.Op.CAST2SIGINT.make(null,
        ExprUnary.Op.CAST2INT.make(null, ExprUnary.Op.NOOP.make(null, n2)));
    Expr body = ExprUnary.Op.NOOP.make(null, op.make(null, null, left, right));

    // Creates decl
    List<ExprHasName> names = new LinkedList<ExprHasName>();
    names.add(n1);
    names.add(n2);
    Expr declExpr = ExprUnary.Op.NOOP.make(null, Sig.SIGINT);
    Decl decl = new Decl(null, null, null, names, declExpr);
    List<Decl> decls = new LinkedList<Decl>();
    decls.add(decl);

    return new Func(null, getLabelForBinaryIntegerExpression(op), decls, ExprConstant.FALSE, body);
  }

  /**
   * Get label for integer binary expression
   */
  private static String getLabelForBinaryIntegerExpression(ExprBinary.Op op) {
    switch (op) {
    case EQUALS:
      return "integer/eq";
    case NOT_EQUALS:
      return "integer/neq";
    case LT:
      return "integer/lt";
    case LTE:
      return "integer/lte";
    case GT:
      return "integer/gt";
    case GTE:
      return "integer/gte";
    default:
      return "";
    }
  }

  /**
   * Given an equality between two int expressions e = f creates the expression e = f + 1 if add is
   * true or the expression e = f - 1 if add is false
   */
  public static Expr addOrSubtractOneToIntComparison(ExprBinary intComparisonExpr, boolean add)
      throws Err {
    try {
      assert DynAlloyExpressionsUtils.isNumeric(intComparisonExpr.left.type());
    } catch (AssertionError e) {
      e.printStackTrace();
    }
    // Get expression e
    Expr eExpr = intComparisonExpr.left;

    // Creates the expression f op 1
    Expr fExpr = intComparisonExpr.right;

    // Add if possible
    Expr fOp1Expr;
    if (fExpr instanceof ExprConstant) {
      fOp1Expr = addSubConstants((ExprConstant) fExpr, false, (ExprConstant) ExprConstant.ONE, add);
    } else {
      if (fExpr instanceof ExprBinary && ((ExprBinary) fExpr).right instanceof ExprConstant) {
        ExprBinary bin = (ExprBinary) fExpr;
        Expr addedSub = addSubConstants((ExprConstant) bin.right,
            bin.op.equals(ExprBinary.Op.MINUS), (ExprConstant) ExprConstant.ONE, add);
        if (ExprConstant.ZERO.equals(addedSub))
          fOp1Expr = bin.left;
        else
          fOp1Expr = bin.op.make(null, null, bin.left, addedSub);
      } else {
        if (add)
          fOp1Expr = ExprBinary.Op.PLUS.make(null, null, fExpr, ExprConstant.ONE);
        else
          fOp1Expr = ExprBinary.Op.MINUS.make(null, null, fExpr, ExprConstant.ONE);
      }
    }

    // Return a new binary expression
    return intComparisonExpr.op.make(null, null, eExpr, fOp1Expr);
  }

  /**
   * Add two expr constants
   */
  private static Expr addSubConstants(ExprConstant expr1, boolean isneg, ExprConstant expr2,
      boolean add) {
    int fst = expr1.num;
    if (isneg)
      fst = fst * -1;
    int val = add ? fst + expr2.num : fst - expr2.num;
    return ExprConstant.makeNUMBER(val);
  }

  /**
   * Given an equality between two int expressions e = f creates the expression e = f + 1 if add is
   * true or the expression e = f - 1 if add is false
   */
  public static Expr addOrSubtractOneToIntComparissonFromCall(ExprCall intComparissonExpr,
      boolean add) throws Err {

    // Creates the expression f op 1
    Expr fExpr = intComparissonExpr.args.get(1);
    Expr fOp1Expr = createsAddSubtractExprCall(fExpr, add);

    // New arguments
    List<Expr> newArgs = new LinkedList<Expr>();
    newArgs.add(intComparissonExpr.args.get(0));
    newArgs.add(fOp1Expr);

    Expr newExpr = ExprCall.make(null, null, intComparissonExpr.fun, newArgs, 0);
    return newExpr;

  }

  /**
   * Given an equality between two int expressions e op f and a new operator op', creates the
   * expression e op' f.
   */
  public static Expr changeOperatorInIntComparison(ExprCall intComparissonExpr, ExprBinary.Op op)
      throws Err {
    ExprVar n1 = ExprVar.make(null, "n1", Sig.SIGINT.type());
    ExprVar n2 = ExprVar.make(null, "n2", Sig.SIGINT.type());

    Func fun = createsFunForIntegerComparisonExprCall(n1, n2, op);

    return ExprCall.make(null, null, fun, intComparissonExpr.args, 0);
  }

  /**
   * Creates the expr call e + 1 or e - 1 according to the value of add
   */
  private static ExprCall createsAddSubtractExprCall(Expr e, boolean add) throws Err {

    // Creates args
    Expr one = ExprUnary.Op.CAST2SIGINT.make(null, ExprConstant.ONE);
    List<Expr> args = createsArgsForBinaryIntegerExprCall(e, one);

    Func fun = createsFunForIntegerAdditionSubtractionExprCall(add);

    return (ExprCall) ExprCall.make(null, null, fun, args, 0);
  }

  /**
   * Creates a fun for allow to add or subtract two int expressions
   */
  private static Func createsFunForIntegerAdditionSubtractionExprCall(boolean add) throws Err {
    ExprVar n1 = ExprVar.make(null, "n1", Sig.SIGINT.type());
    ExprVar n2 = ExprVar.make(null, "n2", Sig.SIGINT.type());

    // Creates body
    Expr funBody = createsFunBodyForIntegerAdditionSubtraction(n1, n2, add);

    // Creates decl
    List<ExprHasName> names = new LinkedList<ExprHasName>();
    names.add(n1);
    names.add(n2);
    Expr declExpr = ExprUnary.Op.NOOP.make(null, Sig.SIGINT);
    Decl decl = new Decl(null, null, null, names, declExpr);
    List<Decl> decls = new LinkedList<Decl>();
    decls.add(decl);

    // Creates return decl
    Expr returnDecl = ExprUnary.Op.ONEOF.make(null, ExprUnary.Op.NOOP.make(null, Sig.SIGINT));

    String label;
    if (add) {
      label = "integer/add";
    } else {
      label = "integer/sub";
    }

    return new Func(null, label, decls, returnDecl, funBody);

  }

  /**
   * Creates a fun body for an integer addition/subtraction
   */
  private static ExprCall createsFunBodyForIntegerAdditionSubtraction(ExprVar n1, ExprVar n2,
      boolean add) throws Err {

    // Creates args
    List<Expr> args = createsArgsForBinaryIntegerExprCall(ExprUnary.Op.NOOP.make(null, n1),
        ExprUnary.Op.NOOP.make(null, n2));

    // Creates fun
    ExprVar funBodyn1 = ExprVar.make(null, "n1", Sig.SIGINT.type());
    ExprVar funBodyn2 = ExprVar.make(null, "n2", Sig.SIGINT.type());

    // body
    Expr left = ExprUnary.Op.CAST2INT.make(null, ExprUnary.Op.NOOP.make(null, funBodyn1));
    Expr right = ExprUnary.Op.CAST2INT.make(null, ExprUnary.Op.NOOP.make(null, funBodyn2));
    Expr binaryAddition;
    if (add) {
      binaryAddition = ExprBinary.Op.IPLUS.make(null, null, left, right);
    } else {
      binaryAddition = ExprBinary.Op.IMINUS.make(null, null, left, right);
    }
    Expr body = ExprUnary.Op.CAST2SIGINT.make(null, ExprUnary.Op.NOOP.make(null, binaryAddition));
    // decls
    List<ExprHasName> names = new LinkedList<ExprHasName>();
    names.add(funBodyn1);
    names.add(funBodyn2);
    Expr declExpr = ExprUnary.Op.NOOP.make(null, Sig.SIGINT);
    Decl decl = new Decl(null, null, null, names, declExpr);
    List<Decl> decls = new LinkedList<Decl>();
    decls.add(decl);
    // return decl
    Expr funReturnDecl = ExprUnary.Op.ONEOF.make(null, ExprUnary.Op.NOOP.make(null, Sig.SIGINT));
    String label;
    if (add) {
      label = "integer/plus";
    } else {
      label = "integer/sub";
    }
    Func fun = new Func(null, label, decls, funReturnDecl, body);

    // Creates expr call
    return (ExprCall) ExprCall.make(null, null, fun, args, 0);

  }

  /**
   * Given a double closured expression e.*(f+g) and a var n, creates the expression n.f.*(f+g) !=
   * n.g.*(f+g)
   */
  private static Expr createsNotEqualsSetsBody(ExprVar n, Expr exprWithDoubleClosure) {
    // Search the expression (f+g) in exprWithDoubleClosure such that exprWithDoubleClosure has a
    // subexpression e.*(f+g)
    ExprBinary plusexpr = (ExprBinary) getExpressionAfterClosure(exprWithDoubleClosure);
    // Construct the expressions n.f.*(f+g) and n.g.*(f+g)
    Expr firstExpr = ExprBinary.Op.JOIN.make(null, null, n, ExprBinary.Op.JOIN.make(null, null,
        plusexpr.left, ExprUnary.Op.RCLOSURE.make(null, plusexpr)));
    Expr secondExpr = ExprBinary.Op.JOIN.make(null, null, n, ExprBinary.Op.JOIN.make(null, null,
        plusexpr.right, ExprUnary.Op.RCLOSURE.make(null, plusexpr)));
    // Construct the expression n.f.*(f+g) & n.g.*(f+g) in Null
    Expr notEqualSets = ExprBinary.Op.NOT_EQUALS.make(null, null, firstExpr, secondExpr);
    return notEqualSets;
  }

  /**
   * Creates an expression n in n.^expr where exprWithClosure = e.*expr. This expression will be
   * used in the body of a quantified expression
   * 
   * @param n
   * @param exprWithClosure
   * @return
   */
  private static Expr createsInBody(ExprVar n, Expr exprWithClosure) {
    // Search the expression expr in exprWithClosure such that exprWithClosure has a subexpression
    // e.*expr
    Expr expr = getExpressionAfterClosure(exprWithClosure);
    // Constructs the expression n.^expr
    Expr joinExpr = ExprBinary.Op.JOIN.make(null, null, n, ExprUnary.Op.CLOSURE.make(null, expr));
    // Constructs the expression n in n.^expr
    Expr inExpr = ExprBinary.Op.IN.make(null, null, n, joinExpr);
    return inExpr;
  }

  /**
   * Given a var n and a exprWithClosure = e.*(f+g) creates the expression - n in n.^f if i = 1 - n
   * in n.^g if i = 2
   */
  private static Expr createsInBody(ExprVar n, Expr exprWithClosure, int i) {
    // Search the expression in exprWithClosure
    Expr expr = getExpressionAfterClosure(exprWithClosure, i);
    // Constructs the expression n.^expr
    Expr joinExpr = ExprBinary.Op.JOIN.make(null, null, n, ExprUnary.Op.CLOSURE.make(null, expr));
    // Constructs the expression n in n.^expr
    Expr inExpr = ExprBinary.Op.IN.make(null, null, n, joinExpr);
    return inExpr;
  }

  /**
   * Returns the expression expr such that exprWithClosure = e.*expr
   */
  public static Expr getExpressionAfterClosure(Expr exprWithClosure) {
    if (exprWithClosure instanceof ExprUnary) {
      // Case exprWithClosure = *e
      return ((ExprUnary) exprWithClosure).sub;
    } else {
      // Case exprWithClosure = e.f
      ExprBinary binary = ((ExprBinary) exprWithClosure);
      if (hasClosuredExpr(binary.left)) {
        // The closure is in the left (e)
        return getExpressionAfterClosure(binary.left).join(binary.right);
      } else {
        // The closure is in the right (f)
        return getExpressionAfterClosure(binary.right);
      }
    }
  }

  /**
   * Given an expression e.*(f+g) and an int i, returns - f if i = 1 - g if i = 2
   */
  public static Expr getExpressionAfterClosure(Expr exprWithClosure, int i) {
    if (exprWithClosure instanceof ExprUnary) {
      // Case exprWithClosure = *(f+g)
      ExprBinary sub = (ExprBinary) ((ExprUnary) exprWithClosure).sub;
      if (i == 1) {
        return sub.left;
      } else {
        return sub.right;
      }
    } else {
      // Case exprWithClosure = e.f
      ExprBinary binary = ((ExprBinary) exprWithClosure);
      if (hasClosuredExpr(binary.left)) {
        // The closure is in the left (e)
        return getExpressionAfterClosure(binary.left, i).join(binary.right);
      } else {
        // The closure is in the right (f)
        return getExpressionAfterClosure(binary.right, i);
      }
    }
  }

  /**
   * Returns true if the given expression has a closured subexpression
   * 
   * @param evaluableExpr
   * @return
   */
  public static boolean hasClosuredExpr(Expr evaluableExpr) {
    if (evaluableExpr instanceof ExprVar) {
      return false;
    } else if (evaluableExpr instanceof ExprUnary) {
      if (((ExprUnary) evaluableExpr).op.equals(ExprUnary.Op.RCLOSURE)
          || ((ExprUnary) evaluableExpr).op.equals(ExprUnary.Op.CLOSURE)) {
        return true;
      } else {
        return false;
      }
    } else if (evaluableExpr instanceof ExprBinary) {
      ExprBinary binary = (ExprBinary) evaluableExpr;
      return hasClosuredExpr(binary.left) || hasClosuredExpr(binary.right);
    } else {
      return false;
    }
  }

  /**
   * Negate the given expression
   */
  public static Expr negateExpression(Expr expr) throws Err {
    if (expr instanceof ExprUnary) {
      // The given expression is unary
      ExprUnary unary = (ExprUnary) expr;
      if (unary.op.equals(ExprUnary.Op.NOT)) {
        // unary : !e, so return e
        return unary.sub;
      } else if (unary.op.equals(ExprUnary.Op.NO)) {
        // unary : no e, so return some e
        return ExprUnary.Op.SOME.make(null, unary.sub);
      } else {
        // return !unary
        return ExprUnary.Op.NOT.make(null, unary);
      }
    } else if (expr instanceof ExprBinary) {
      // The given expression is binary
      ExprBinary binary = (ExprBinary) expr;
      if (binary.op.equals(ExprBinary.Op.EQUALS)) {
        // binary : e = f, so return e != f
        return ExprBinary.Op.NOT_EQUALS.make(null, null, binary.left, binary.right);
      } else if (binary.op.equals(ExprBinary.Op.NOT_EQUALS)) {
        // binary : e!=f, so return e = f
        return ExprBinary.Op.EQUALS.make(null, null, binary.left, binary.right);
      } else if (binary.op.equals(ExprBinary.Op.IN)) {
        // binary : e in f, so return e !in f
        return ExprBinary.Op.NOT_IN.make(null, null, binary.left, binary.right);
      } else if (binary.op.equals(ExprBinary.Op.NOT_IN)) {
        // binary : e !in f, so return e in f
        return ExprBinary.Op.IN.make(null, null, binary.left, binary.right);
      } else if (binary.op.equals(ExprBinary.Op.LT)) {
        return ExprBinary.Op.GTE.make(null, null, binary.left, binary.right);
      } else {
        // return ! binary
        return ExprUnary.Op.NOT.make(null, binary);
      }
    } else if (expr instanceof ExprQt) {
      // The given expression is quantified
      ExprQt qt = (ExprQt) expr;
      if (qt.op.equals(ExprQt.Op.ALL)) {
        // qt : all .. body, so return some .. ! body
        return ExprQt.Op.SOME.make(null, null, qt.decls, negateExpression(qt.sub));
      } else if (qt.op.equals(ExprQt.Op.SOME)) {
        // qt: some .. body, so return all .. !body
        return ExprQt.Op.ALL.make(null, null, qt.decls, negateExpression(qt.sub));
      } else {
        // return ! op .. body
        return ExprUnary.Op.NOT.make(null, qt);
      }
    } else if (expr instanceof ExprCall) {
      ExprCall call = (ExprCall) expr;
      ExprUnary body = (ExprUnary) call.fun.getBody();
      ExprBinary binaryBody = (ExprBinary) body.sub;
      if (binaryBody.op.equals(ExprBinary.Op.EQUALS)) {
        // The op is =, so the new op is !=
        return ExprUnary.Op.NOT.make(null, call);
      } else {
        // The op is !=, so the new op is =
        Expr newBody = ExprUnary.Op.NOOP.make(null,
            ExprBinary.Op.EQUALS.make(null, null, binaryBody.left, binaryBody.right));
        Func newFunc = new Func(null, "integer/eq", call.fun.decls, call.fun.returnDecl, newBody);
        return ExprCall.make(null, null, newFunc, call.args, 0);
      }
    } else {
      return null;
    }
  }

  /*
   * Translate an expression with correct alloy syntax
   */
  public static String getExpressionAsAlloyString(Expr expr) {
    if (expr instanceof Sig) {
      Sig sig = (Sig) expr;
      return sig.label.substring(5, sig.label.length());
    } else if (expr instanceof ExprConstant) {
      return expr.toString();
    } else if (expr instanceof ExprVar) {
      ExprVar exprVar = (ExprVar) expr;
      return exprVar.label;
    } else if (expr instanceof ExprUnary) {
      ExprUnary exprUnary = (ExprUnary) expr;
      if (exprUnary.op.equals(ExprUnary.Op.CAST2INT)
          || exprUnary.op.equals(ExprUnary.Op.CAST2SIGINT)
          || exprUnary.op.equals(ExprUnary.Op.NOOP)) {
        // Ignore castings and noop
        return getExpressionAsAlloyString(exprUnary.sub);
      } else {
        String op = exprUnary.op.toString().replaceAll("one of", "one");
        return op + "(" + getExpressionAsAlloyString(exprUnary.sub) + ")";
      }
    } else if (expr instanceof ExprBinary) {
      ExprBinary exprBinary = (ExprBinary) expr;
      String op = "";
      if (exprBinary.op.equals(ExprBinary.Op.INTERSECT)) {
        op = "\\&";
      } else {
        op = exprBinary.op.toString();
      }
      return "(" + getExpressionAsAlloyString(exprBinary.left) + ") " + op + " ("
          + getExpressionAsAlloyString(exprBinary.right) + ")";
    } else if (expr instanceof ExprCall) {
      ExprCall exprCall = (ExprCall) expr;
      String s = exprCall.fun.label.substring(8, exprCall.fun.label.length()) + "[";
      s += getExpressionAsAlloyString(exprCall.args.get(0)) + ",";
      s += getExpressionAsAlloyString(exprCall.args.get(1));
      s += "]";
      return s;
    } else if (expr instanceof ExprQt) {
      ExprQt exprQt = (ExprQt) expr;
      Decl decl = exprQt.decls.get(0);
      String s = exprQt.op.toString() + " " + decl.names.get(0).label + " : ";
      s += getExpressionAsAlloyString(decl.expr) + " | ";
      s += getExpressionAsAlloyString(exprQt.sub);
      return s;
    } else if (expr instanceof ExprList) {
      ExprList list = (ExprList) expr;
      String s = "(" + getExpressionAsAlloyString(list.args.get(0)) + ")";
      s += " and ";
      s += "(" + getExpressionAsAlloyString(list.args.get(1)) + ")";
      return s;
    }
    return "";
  }

  /**
   * Returns true if the given expression body is intersection in null
   */
  public static boolean isIntersectionInNullExpr(Expr expr) {
    if (expr instanceof ExprBinary) {
      ExprBinary binary = (ExprBinary) expr;
      if (binary.op.equals(ExprBinary.Op.IN)) {
        if (binary.left instanceof ExprBinary) {
          ExprBinary binaryLeft = (ExprBinary) binary.left;
          return binaryLeft.op.equals(ExprBinary.Op.INTERSECT);
        }
      }
    }
    return false;
  }

  /**
   * Given a simple closured expression return the type of the elements in the set
   */
  public static Type getTypeOfElementsInSet(Expr exprWithClosure) {
    ExprBinary binary = ((ExprBinary) exprWithClosure);
    if (hasClosuredExpr(binary.left)) {
      // The closure is in the left (e)
      return getExpressionAfterClosure(binary.left).join(binary.right).type();
    } else {
      // The closure is in the right (f)
      return binary.left.join(getExpressionAfterClosure(binary.right)).type();
    }
  }

  /**
   * Given a double closured expression return the type of the elements in the set
   */
  public static Type getTypeOfElementsInSet(Expr exprWithClosure, int i) {
    ExprBinary binary = ((ExprBinary) exprWithClosure);
    if (hasClosuredExpr(binary.left)) {
      // The closure is in the left (e)
      return getExpressionAfterClosure(binary.left, i).join(binary.right).type();
    } else {
      // The closure is in the right (f)
      return binary.left.join(getExpressionAfterClosure(binary.right, i)).type();
    }
  }

  /**
   * Returns true if the is a numeric one
   */
  public static boolean isNumeric(Type t) {
    return t.is_int() || t.toString().contains("Double");
  }
}
