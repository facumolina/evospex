// Generated from src/main/java/evospex/expression/ExprGrammar.g4 by ANTLR 4.7.1
package evospex.expression;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprGrammarParser}.
 */
public interface ExprGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(ExprGrammarParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(ExprGrammarParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#qt_expr}.
	 * @param ctx the parse tree
	 */
	void enterQt_expr(ExprGrammarParser.Qt_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#qt_expr}.
	 * @param ctx the parse tree
	 */
	void exitQt_expr(ExprGrammarParser.Qt_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#set_expr}.
	 * @param ctx the parse tree
	 */
	void enterSet_expr(ExprGrammarParser.Set_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#set_expr}.
	 * @param ctx the parse tree
	 */
	void exitSet_expr(ExprGrammarParser.Set_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(ExprGrammarParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(ExprGrammarParser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#num_binary_op}.
	 * @param ctx the parse tree
	 */
	void enterNum_binary_op(ExprGrammarParser.Num_binary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#num_binary_op}.
	 * @param ctx the parse tree
	 */
	void exitNum_binary_op(ExprGrammarParser.Num_binary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void enterBinary_op(ExprGrammarParser.Binary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void exitBinary_op(ExprGrammarParser.Binary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#set_binary_op}.
	 * @param ctx the parse tree
	 */
	void enterSet_binary_op(ExprGrammarParser.Set_binary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#set_binary_op}.
	 * @param ctx the parse tree
	 */
	void exitSet_binary_op(ExprGrammarParser.Set_binary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterCompare_op(ExprGrammarParser.Compare_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitCompare_op(ExprGrammarParser.Compare_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(ExprGrammarParser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(ExprGrammarParser.Unary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#closure_op}.
	 * @param ctx the parse tree
	 */
	void enterClosure_op(ExprGrammarParser.Closure_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#closure_op}.
	 * @param ctx the parse tree
	 */
	void exitClosure_op(ExprGrammarParser.Closure_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(ExprGrammarParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(ExprGrammarParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ExprGrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ExprGrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#closure_field}.
	 * @param ctx the parse tree
	 */
	void enterClosure_field(ExprGrammarParser.Closure_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#closure_field}.
	 * @param ctx the parse tree
	 */
	void exitClosure_field(ExprGrammarParser.Closure_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ExprGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ExprGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(ExprGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(ExprGrammarParser.StringContext ctx);
}