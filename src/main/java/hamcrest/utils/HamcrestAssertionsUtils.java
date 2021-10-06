package hamcrest.utils;

import java.util.ArrayList;
import java.util.List;

import org.jgap.Gene;
import org.jgap.impl.IntegerGene;

import evospex.ga.chromosome.ExprGene;
import evospex.ga.chromosome.ExprGeneValue;
import evospex.ga.chromosome.SpecChromosome;
import hamcrest.assertion.HamcrestAssertion;
import hamcrest.assertion.QuantifiedHamcrestAssertion;
import hamcrest.assertion.SimpleHamcrestAssertion;
import hamcrest.assertion.SimpleSetHamcrestAssertion;
import hamcrest.expression.BinaryHamcrestExpr;
import hamcrest.expression.HamcrestExpr;
import hamcrest.expression.QuantifiedHamcrestExpr;
import hamcrest.expression.SetHamcrestExpr;
import hamcrest.expression.SimpleHamcrestExpr;
import hamcrest.expression.UnaryHamcrestExpr;
import rfm.dynalloyCompiler.ast.Decl;
import rfm.dynalloyCompiler.ast.Expr;
import rfm.dynalloyCompiler.ast.ExprBinary;
import rfm.dynalloyCompiler.ast.ExprBinary.Op;
import rfm.dynalloyCompiler.ast.ExprCall;
import rfm.dynalloyCompiler.ast.ExprConstant;
import rfm.dynalloyCompiler.ast.ExprList;
import rfm.dynalloyCompiler.ast.ExprQt;
import rfm.dynalloyCompiler.ast.ExprUnary;
import rfm.dynalloyCompiler.ast.ExprVar;
import rfm.dynalloyCompiler.ast.Func;
import rfm.dynalloyCompiler.ast.Sig.PrimSig;
import utils.TargetInformation;

/**
 * Utils to generate Hamcrest assertions from chromosomes containing Alloy specifications
 * 
 * @author fmolina
 *
 */
public class HamcrestAssertionsUtils {

  /**
   * Generate the hamcrest assertion equivalent to alloy expression represented by the given
   * chromosome
   * 
   * @param chromosome
   */
  public static List<HamcrestAssertion> generateHamcrestAssertions(SpecChromosome chromosome) {

    // Validate the genes
    Gene[] genes = chromosome.getGenes();
    if (genes[0] instanceof IntegerGene) {
      throw new IllegalStateException("Integer genes not supported for tranlsation");
    }

    // Extract the alloy expression from each gene, and then convert it to the corresponding
    // Hamcrest expression
    List<HamcrestAssertion> hamcrestAssertions = new ArrayList<HamcrestAssertion>();
    for (int i = 0; i < genes.length; i++) {
      ExprGene gene = (ExprGene) genes[i];
      Expr alloyExpr = ((ExprGeneValue) gene.getInternalValue()).getExpression();
      if (alloyExpr != ExprConstant.TRUE) {
        if (alloyExpr instanceof ExprQt) {
          // Quantified expression
          hamcrestAssertions.add(alloyQt2HamcrestAssertion((ExprQt) alloyExpr));
        } else {
          if (alloyExpr instanceof ExprCall) {
            // Expression call, e.g., integer/eq[exp1,exp2]
            ExprCall call = (ExprCall) alloyExpr;
            // If neither exp1 nor exp2 contains a set, then it should be handled like a simple
            // assertion
            if (containsSet(call)) {
              hamcrestAssertions.add(alloyCall2HamcrestAssertion(call));
            } else {
              throw new IllegalArgumentException("Implement this case!!!");
            }
          } else {
            HamcrestExpr hamcrestExpr = alloyExpr2HamcrestExpr(alloyExpr);
            hamcrestAssertions.add(new SimpleHamcrestAssertion(hamcrestExpr));
          }
        }
      }
    }
    return hamcrestAssertions;

  }

  /**
   * Translate the given alloyExpr to Hamcrest (not ExprQt)
   */
  private static String alloy2HamcrestExprString(Expr alloyExpr) {
    assert !(alloyExpr instanceof ExprQt);
    if (alloyExpr == TargetInformation.nullSig) {
      // Null constant
      return "null";
    }
    if (alloyExpr instanceof PrimSig) {
      if (alloyExpr.toString().equals("this/true"))
        return "true";
      if (alloyExpr.toString().equals("this/false"))
        return "false";
      throw new IllegalArgumentException(
          "Alloy expression not allowed for translation: " + alloyExpr.toString());
    }
    if (alloyExpr instanceof ExprConstant) {
      ExprConstant constant = (ExprConstant) alloyExpr;
      return constant.toString();
    }
    if (alloyExpr instanceof ExprVar) {
      // Var
      ExprVar var = (ExprVar) alloyExpr;
      return var.toString();
    }
    if (alloyExpr instanceof ExprUnary) {
      // Unary expression
      ExprUnary unary = (ExprUnary) alloyExpr;
      if (unary.op.toString().equals("int->Int") || unary.op.toString().equals("NOOP")
          || unary.op.toString().equals("Int->int"))
        return alloy2HamcrestExprString(unary.sub);
      else
        return unary.op.toString() + " " + alloy2HamcrestExprString(unary.sub);
    }
    if (alloyExpr instanceof ExprBinary) {
      // Binary expression
      ExprBinary bin = (ExprBinary) alloyExpr;
      return alloy2HamcrestExprString(bin.left) + " " + bin.op.toString() + " "
          + alloy2HamcrestExprString(bin.right);
    }
    if (alloyExpr instanceof ExprCall) {
      // Call
      ExprCall call = (ExprCall) alloyExpr;
      Op op = getBinaryOpFromBinaryFuncCall(call.fun);
      assert call.args.size() == 2 : "Only two arguments are allowed in a call";
      return op.toString() + " " + alloy2HamcrestExprString(call.args.get(0)) + " "
          + alloy2HamcrestExprString(call.args.get(1));
    }
    throw new IllegalArgumentException(
        "Alloy expression not allowed for translation: " + alloyExpr.toString());
  }

  /**
   * Returns true if the given ExprCall contains a set in at least one expression
   */
  private static boolean containsSet(Expr call) {
    return call.toString().contains("*") || call.toString().contains("^");
  }

  /**
   * Translate the given alloy ExprCall to a Hamcrest assertion
   */
  private static HamcrestAssertion alloyCall2HamcrestAssertion(ExprCall call) {
    assert call.args.size() == 2 : "Only two arguments are allowed in a call";
    Expr left = call.args.get(0);
    Expr right = call.args.get(1);
    HamcrestExpr expr1 = alloyExpr2HamcrestExpr(left);
    HamcrestExpr expr2 = alloyExpr2HamcrestExpr(right);
    BinaryHamcrestExpr binaryExpr = new BinaryHamcrestExpr(expr1,
        getBinaryOpFromBinaryFuncCall(call.fun), expr2);
    return new SimpleSetHamcrestAssertion(binaryExpr);
  }

  /**
   * Alloy Expr to Hamcrest Expr
   */
  private static HamcrestExpr alloyExpr2HamcrestExpr(Expr expr) {
    if (expr == TargetInformation.nullSig) {
      return new SimpleHamcrestExpr("null");
    }
    if (expr instanceof PrimSig) {
      if (expr.toString().equals("this/true"))
        return new SimpleHamcrestExpr("true");
      if (expr.toString().equals("this/false"))
        return new SimpleHamcrestExpr("false");
      return new SimpleHamcrestExpr(((PrimSig) expr).label.replace("this/", ""));
    }
    if (expr instanceof ExprConstant) {
      return new SimpleHamcrestExpr(expr.toString());
    }
    if (expr instanceof ExprVar) {
      ExprVar var = (ExprVar) expr;
      if (var.toString().equals("thiz"))
        return new SimpleHamcrestExpr("this");
      else
        return new SimpleHamcrestExpr(var.toString());
    }
    if (expr instanceof ExprUnary) {
      ExprUnary unary = (ExprUnary) expr;
      if (unary.op.toString().equals("int->Int") || unary.op.toString().equals("NOOP")
          || unary.op.toString().equals("Int->int"))
        return alloyExpr2HamcrestExpr(unary.sub);
      else
        return new UnaryHamcrestExpr(unary.op, alloyExpr2HamcrestExpr(unary.sub));
    }
    if (expr instanceof ExprBinary) {
      ExprBinary binary = (ExprBinary) expr;
      boolean containsSet = containsSet(binary);
      if (binary.op.equals(Op.JOIN) && containsSet) {
        // Almost sure it is a set
        return new SetHamcrestExpr(alloy2HamcrestExprString(binary));
      }
      if (binary.op.equals(Op.JOIN) && !containsSet) {
        return new SimpleHamcrestExpr(alloy2HamcrestExprString(binary));
      } else {
        return new BinaryHamcrestExpr(alloyExpr2HamcrestExpr(binary.left), binary.op,
            alloyExpr2HamcrestExpr(binary.right));
      }
    }
    if (expr instanceof ExprCall) {
      ExprCall call = (ExprCall) expr;
      assert call.args.size() == 2 : "Only two arguments are allowed in a call";
      Expr left = call.args.get(0);
      Expr right = call.args.get(1);
      HamcrestExpr expr1 = alloyExpr2HamcrestExpr(left);
      HamcrestExpr expr2 = alloyExpr2HamcrestExpr(right);
      return new BinaryHamcrestExpr(expr1, getBinaryOpFromBinaryFuncCall(call.fun), expr2);
    }
    if (expr instanceof ExprList) {
      ExprList list = (ExprList) expr;
      assert list.args.size() == 2 : "Only two arguments are allowed in a list";
      Expr left = list.args.get(0);
      Expr right = list.args.get(1);
      HamcrestExpr expr1 = alloyExpr2HamcrestExpr(left);
      HamcrestExpr expr2 = alloyExpr2HamcrestExpr(right);
      assert list.op.toString().equals("AND") : "Operator " + list.op.toString()
          + " not supported in list";
      return new BinaryHamcrestExpr(expr1, ExprBinary.Op.AND, expr2);
    }
    throw new IllegalArgumentException(
        "Unable to represent expression " + expr.toString() + " as HamcrestExpr");
  }

  /**
   * Get binary op from func
   */
  private static Op getBinaryOpFromBinaryFuncCall(Func f) {
    if (f.label.equals("integer/eq"))
      return Op.EQUALS;
    if (f.label.equals("integer/add"))
      return Op.PLUS;
    if (f.label.equals("integer/sub"))
      return Op.MINUS;
    if (f.label.equals("integer/neq"))
      return Op.NOT_EQUALS;
    if (f.label.equals("integer/lt"))
      return Op.LT;
    if (f.label.equals("integer/lte"))
      return Op.LTE;
    if (f.label.equals("integer/gt"))
      return Op.GT;
    if (f.label.equals("integer/gte"))
      return Op.GTE;
    throw new IllegalArgumentException("Func " + f.label + " not allowed!");
  }

  /**
   * Translate the given alloy ExprQt to a Hamcrest assertion
   */
  private static HamcrestAssertion alloyQt2HamcrestAssertion(ExprQt exprQt) {
    // Get the set of the quantified expression
    if (exprQt.decls.size() != 1)
      throw new IllegalArgumentException(
          "Quantified expressions with more than one declaration are not allowed");
    Decl decl = exprQt.decls.get(0);
    String setExprStr = alloy2HamcrestExprString(decl.expr);
    SetHamcrestExpr setExpr = new SetHamcrestExpr(setExprStr);
    // Get the expression evaluated over the set
    HamcrestExpr hamcrestExpr = buildQtHamcrestExpressionBody(exprQt.sub);
    QuantifiedHamcrestExpr qtHamcrestExpr = new QuantifiedHamcrestExpr(setExpr, hamcrestExpr,
        exprQt.op);
    return new QuantifiedHamcrestAssertion(qtHamcrestExpr);
  }

  /**
   * Build the QT Hamcrest Expression body from the given expr (which is the body of some alloy
   * quantified expression)
   */
  private static HamcrestExpr buildQtHamcrestExpressionBody(Expr body) {
    if (body instanceof ExprQt)
      throw new IllegalArgumentException(
          "Quantified expressions are not allowed as part of the body of quantified expressions");
    return alloyExpr2HamcrestExpr(body);
  }

}
