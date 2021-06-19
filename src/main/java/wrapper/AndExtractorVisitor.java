package wrapper;

import java.util.ArrayList;

import rfm.dynalloy.Err;
import rfm.dynalloyCompiler.ast.Expr;
import rfm.dynalloyCompiler.ast.ExprBinary;
import rfm.dynalloyCompiler.ast.ExprBinary.Op;
import rfm.dynalloyCompiler.ast.ExprCall;
import rfm.dynalloyCompiler.ast.ExprConstant;
import rfm.dynalloyCompiler.ast.ExprITE;
import rfm.dynalloyCompiler.ast.ExprLet;
import rfm.dynalloyCompiler.ast.ExprList;
import rfm.dynalloyCompiler.ast.ExprQt;
import rfm.dynalloyCompiler.ast.ExprUnary;
import rfm.dynalloyCompiler.ast.ExprVar;
import rfm.dynalloyCompiler.ast.Sig;
import rfm.dynalloyCompiler.ast.Sig.Field;
import rfm.dynalloyCompiler.ast.VisitReturn;


/**
 * 
 * @author gregis
 */

public class AndExtractorVisitor extends VisitReturn<Expr> {
	ArrayList<Expr> elements;
	
	public AndExtractorVisitor(ArrayList<Expr> elements){
		this.elements=elements;		
	}

	@Override
	public Expr visit(ExprBinary x) throws Err {
		if (x.op == Op.AND){
			x.left.accept(this);
			x.right.accept(this);
		}
		else elements.add(x);
		return x;
	}

	@Override
	public Expr visit(ExprList x) throws Err {
		if (x.op == ExprList.Op.AND )
			for (Expr expr:x.args){
				expr.accept(this);
			}
		else elements.add(x);
		return x;
	}

	@Override
	public Expr visit(ExprCall x) throws Err {
		elements.add(x);
		return x;
	}

	@Override
	public Expr visit(ExprConstant x) throws Err {
		return x;
	}

	@Override
	public Expr visit(ExprITE x) throws Err {
		elements.add(x);
		return x;
	}

	@Override
	public Expr visit(ExprLet x) throws Err {
		elements.add(x);
		return x;
	}

	@Override
	public Expr visit(ExprQt x) throws Err {
		elements.add(x);
		return x;
	}

	@Override
	public Expr visit(ExprUnary x) throws Err {
		if (x.op == ExprUnary.Op.NOOP) {
			x.sub.accept(this);
		}
		else
			elements.add(x);
		return x;
	}

	@Override
	public Expr visit(ExprVar x) throws Err {
		return x;
	}

	@Override
	public Expr visit(Sig x) throws Err {
		return x;
	}

	@Override
	public Expr visit(Field x) throws Err {
		return x;
	} 
	
}
