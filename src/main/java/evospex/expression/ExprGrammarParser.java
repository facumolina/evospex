// Generated from src/main/java/evospex/expression/ExprGrammar.g4 by ANTLR 4.7.1
package evospex.expression;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, ID=43, ID_START=44, ID_CHAR=45, 
		WS=46;
	public static final int
		RULE_parse = 0, RULE_expr = 1, RULE_qt_expr = 2, RULE_set_expr = 3, RULE_collection = 4, 
		RULE_num_binary_op = 5, RULE_binary_op = 6, RULE_set_binary_op = 7, RULE_compare_op = 8, 
		RULE_unary_op = 9, RULE_closure_op = 10, RULE_quantifier = 11, RULE_name = 12, 
		RULE_closure_field = 13, RULE_number = 14;
	public static final String[] ruleNames = {
		"parse", "expr", "qt_expr", "set_expr", "collection", "num_binary_op", 
		"binary_op", "set_binary_op", "compare_op", "unary_op", "closure_op", 
		"quantifier", "name", "closure_field", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "':'", "'.'", "').'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'||'", "'or'", "'&&'", "'and'", "'implies'", "'=>'", "'iff'", 
		"'xor'", "'&'", "'='", "'!='", "'in'", "'not in'", "'<'", "'>'", "'<='", 
		"'>='", "'!'", "'not'", "'no'", "'#'", "'^'", "'all'", "'some'", "'lone'", 
		"'one'", "'0'", "'1'", "'-1'", "'0.0'", "'1.0'", "'-1.0'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "ID", "ID_START", "ID_CHAR", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ExprGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprGrammarParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			expr(0);
			setState(31);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Qt_exprContext qt_expr() {
			return getRuleContext(Qt_exprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Binary_opContext binary_op() {
			return getRuleContext(Binary_opContext.class,0);
		}
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public List<Set_exprContext> set_expr() {
			return getRuleContexts(Set_exprContext.class);
		}
		public Set_exprContext set_expr(int i) {
			return getRuleContext(Set_exprContext.class,i);
		}
		public Set_binary_opContext set_binary_op() {
			return getRuleContext(Set_binary_opContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Num_binary_opContext num_binary_op() {
			return getRuleContext(Num_binary_opContext.class,0);
		}
		public Compare_opContext compare_op() {
			return getRuleContext(Compare_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(34);
				qt_expr();
				}
				break;
			case 2:
				{
				setState(35);
				match(T__0);
				setState(36);
				expr(0);
				setState(37);
				match(T__1);
				setState(38);
				binary_op();
				setState(39);
				match(T__0);
				setState(40);
				expr(0);
				setState(41);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(43);
				unary_op();
				setState(44);
				match(T__0);
				setState(45);
				expr(0);
				setState(46);
				match(T__1);
				}
				break;
			case 4:
				{
				setState(48);
				match(T__0);
				setState(49);
				set_expr();
				setState(50);
				match(T__1);
				setState(51);
				set_binary_op();
				setState(52);
				match(T__0);
				setState(53);
				set_expr();
				setState(54);
				match(T__1);
				}
				break;
			case 5:
				{
				setState(56);
				match(T__0);
				setState(57);
				expr(0);
				setState(58);
				match(T__1);
				}
				break;
			case 6:
				{
				setState(60);
				set_expr();
				}
				break;
			case 7:
				{
				setState(61);
				name();
				}
				break;
			case 8:
				{
				setState(62);
				number();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(65);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(66);
						num_binary_op();
						setState(67);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(70);
						compare_op();
						setState(71);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(73);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(74);
						binary_op();
						setState(75);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Qt_exprContext extends ParserRuleContext {
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Set_exprContext set_expr() {
			return getRuleContext(Set_exprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public Qt_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qt_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).enterQt_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).exitQt_expr(this);
		}
	}

	public final Qt_exprContext qt_expr() throws RecognitionException {
		Qt_exprContext _localctx = new Qt_exprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_qt_expr);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				quantifier();
				setState(83);
				name();
				setState(84);
				match(T__2);
				setState(85);
				set_expr();
				setState(86);
				match(T__2);
				setState(87);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				quantifier();
				setState(90);
				name();
				setState(91);
				match(T__2);
				setState(92);
				collection();
				setState(93);
				match(T__2);
				setState(94);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_exprContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Closure_opContext closure_op() {
			return getRuleContext(Closure_opContext.class,0);
		}
		public Closure_fieldContext closure_field() {
			return getRuleContext(Closure_fieldContext.class,0);
		}
		public Set_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).enterSet_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).exitSet_expr(this);
		}
	}

	public final Set_exprContext set_expr() throws RecognitionException {
		Set_exprContext _localctx = new Set_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_set_expr);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				name();
				setState(99);
				match(T__3);
				setState(100);
				closure_op();
				setState(101);
				match(T__0);
				setState(102);
				closure_field();
				setState(103);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				name();
				setState(106);
				match(T__3);
				setState(107);
				closure_op();
				setState(108);
				match(T__0);
				setState(109);
				closure_field();
				setState(110);
				match(T__4);
				setState(111);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).exitCollection(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_collection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_binary_opContext extends ParserRuleContext {
		public Num_binary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_binary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).enterNum_binary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).exitNum_binary_op(this);
		}
	}

	public final Num_binary_opContext num_binary_op() throws RecognitionException {
		Num_binary_opContext _localctx = new Num_binary_opContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_num_binary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_opContext extends ParserRuleContext {
		public Binary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).enterBinary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).exitBinary_op(this);
		}
	}

	public final Binary_opContext binary_op() throws RecognitionException {
		Binary_opContext _localctx = new Binary_opContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_binary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_binary_opContext extends ParserRuleContext {
		public Set_binary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_binary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).enterSet_binary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).exitSet_binary_op(this);
		}
	}

	public final Set_binary_opContext set_binary_op() throws RecognitionException {
		Set_binary_opContext _localctx = new Set_binary_opContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_set_binary_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compare_opContext extends ParserRuleContext {
		public Compare_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).enterCompare_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).exitCompare_op(this);
		}
	}

	public final Compare_opContext compare_op() throws RecognitionException {
		Compare_opContext _localctx = new Compare_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compare_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_opContext extends ParserRuleContext {
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).exitUnary_op(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closure_opContext extends ParserRuleContext {
		public Closure_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).enterClosure_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).exitClosure_op(this);
		}
	}

	public final Closure_opContext closure_op() throws RecognitionException {
		Closure_opContext _localctx = new Closure_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_closure_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__31) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifierContext extends ParserRuleContext {
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).exitQuantifier(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprGrammarParser.ID, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_name);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(ID);
				setState(133);
				match(T__3);
				setState(134);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closure_fieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprGrammarParser.ID, 0); }
		public Closure_fieldContext closure_field() {
			return getRuleContext(Closure_fieldContext.class,0);
		}
		public Closure_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).enterClosure_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).exitClosure_field(this);
		}
	}

	public final Closure_fieldContext closure_field() throws RecognitionException {
		Closure_fieldContext _localctx = new Closure_fieldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_closure_field);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(ID);
				setState(139);
				match(T__5);
				setState(140);
				closure_field();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarListener ) ((ExprGrammarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0094\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3P\n\3\f\3\16\3S\13\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4c\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5t\n\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5"+
		"\16\u008a\n\16\3\17\3\17\3\17\3\17\5\17\u0090\n\17\3\20\3\20\3\20\2\3"+
		"\4\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\t\3\2\b\f\3\2\r\24\3\2"+
		"\26\35\3\2\36!\4\2\n\n\"\"\4\2  #&\3\2\',\2\u0092\2 \3\2\2\2\4A\3\2\2"+
		"\2\6b\3\2\2\2\bs\3\2\2\2\nu\3\2\2\2\fw\3\2\2\2\16y\3\2\2\2\20{\3\2\2\2"+
		"\22}\3\2\2\2\24\177\3\2\2\2\26\u0081\3\2\2\2\30\u0083\3\2\2\2\32\u0089"+
		"\3\2\2\2\34\u008f\3\2\2\2\36\u0091\3\2\2\2 !\5\4\3\2!\"\7\2\2\3\"\3\3"+
		"\2\2\2#$\b\3\1\2$B\5\6\4\2%&\7\3\2\2&\'\5\4\3\2\'(\7\4\2\2()\5\16\b\2"+
		")*\7\3\2\2*+\5\4\3\2+,\7\4\2\2,B\3\2\2\2-.\5\24\13\2./\7\3\2\2/\60\5\4"+
		"\3\2\60\61\7\4\2\2\61B\3\2\2\2\62\63\7\3\2\2\63\64\5\b\5\2\64\65\7\4\2"+
		"\2\65\66\5\20\t\2\66\67\7\3\2\2\678\5\b\5\289\7\4\2\29B\3\2\2\2:;\7\3"+
		"\2\2;<\5\4\3\2<=\7\4\2\2=B\3\2\2\2>B\5\b\5\2?B\5\32\16\2@B\5\36\20\2A"+
		"#\3\2\2\2A%\3\2\2\2A-\3\2\2\2A\62\3\2\2\2A:\3\2\2\2A>\3\2\2\2A?\3\2\2"+
		"\2A@\3\2\2\2BQ\3\2\2\2CD\f\f\2\2DE\5\f\7\2EF\5\4\3\rFP\3\2\2\2GH\f\13"+
		"\2\2HI\5\22\n\2IJ\5\4\3\fJP\3\2\2\2KL\f\t\2\2LM\5\16\b\2MN\5\4\3\nNP\3"+
		"\2\2\2OC\3\2\2\2OG\3\2\2\2OK\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\5"+
		"\3\2\2\2SQ\3\2\2\2TU\5\30\r\2UV\5\32\16\2VW\7\5\2\2WX\5\b\5\2XY\7\5\2"+
		"\2YZ\5\4\3\2Zc\3\2\2\2[\\\5\30\r\2\\]\5\32\16\2]^\7\5\2\2^_\5\n\6\2_`"+
		"\7\5\2\2`a\5\4\3\2ac\3\2\2\2bT\3\2\2\2b[\3\2\2\2c\7\3\2\2\2de\5\32\16"+
		"\2ef\7\6\2\2fg\5\26\f\2gh\7\3\2\2hi\5\34\17\2ij\7\4\2\2jt\3\2\2\2kl\5"+
		"\32\16\2lm\7\6\2\2mn\5\26\f\2no\7\3\2\2op\5\34\17\2pq\7\7\2\2qr\5\32\16"+
		"\2rt\3\2\2\2sd\3\2\2\2sk\3\2\2\2t\t\3\2\2\2uv\5\32\16\2v\13\3\2\2\2wx"+
		"\t\2\2\2x\r\3\2\2\2yz\t\3\2\2z\17\3\2\2\2{|\7\25\2\2|\21\3\2\2\2}~\t\4"+
		"\2\2~\23\3\2\2\2\177\u0080\t\5\2\2\u0080\25\3\2\2\2\u0081\u0082\t\6\2"+
		"\2\u0082\27\3\2\2\2\u0083\u0084\t\7\2\2\u0084\31\3\2\2\2\u0085\u008a\7"+
		"-\2\2\u0086\u0087\7-\2\2\u0087\u0088\7\6\2\2\u0088\u008a\5\32\16\2\u0089"+
		"\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u008a\33\3\2\2\2\u008b\u0090\7-\2\2"+
		"\u008c\u008d\7-\2\2\u008d\u008e\7\b\2\2\u008e\u0090\5\34\17\2\u008f\u008b"+
		"\3\2\2\2\u008f\u008c\3\2\2\2\u0090\35\3\2\2\2\u0091\u0092\t\b\2\2\u0092"+
		"\37\3\2\2\2\tAOQbs\u0089\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}