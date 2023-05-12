// Generated from src/main/java/evospex/expression/ExprGrammar.g4 by ANTLR 4.7.1
package evospex.expression;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, UNSIGNED_NUMBER=38, 
		ID=39, ID_START=40, ID_CHAR=41, WS=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "UNSIGNED_NUMBER", "ID", "ID_START", 
		"ID_CHAR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "':'", "'.'", "').'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'||'", "'or'", "'&&'", "'and'", "'implies'", "'=>'", "'iff'", 
		"'xor'", "'&'", "'='", "'!='", "'in'", "'not in'", "'<'", "'>'", "'<='", 
		"'>='", "'!'", "'not'", "'no'", "'#'", "'^'", "'all'", "'some'", "'lone'", 
		"'one'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "UNSIGNED_NUMBER", "ID", "ID_START", "ID_CHAR", "WS"
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


	public ExprGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExprGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u00ea\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"&\3&\3\'\6\'\u00ca\n\'\r\'\16\'\u00cb\3\'\3\'\6\'\u00d0\n\'\r\'\16\'\u00d1"+
		"\5\'\u00d4\n\'\3(\3(\7(\u00d8\n(\f(\16(\u00db\13(\3)\5)\u00de\n)\3*\3"+
		"*\5*\u00e2\n*\3+\6+\u00e5\n+\r+\16+\u00e6\3+\3+\2\2,\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,\3\2\5\5\2C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u00ef\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\3W\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\rb\3\2\2\2"+
		"\17d\3\2\2\2\21f\3\2\2\2\23h\3\2\2\2\25j\3\2\2\2\27l\3\2\2\2\31o\3\2\2"+
		"\2\33r\3\2\2\2\35u\3\2\2\2\37y\3\2\2\2!\u0081\3\2\2\2#\u0084\3\2\2\2%"+
		"\u0088\3\2\2\2\'\u008c\3\2\2\2)\u008e\3\2\2\2+\u0090\3\2\2\2-\u0093\3"+
		"\2\2\2/\u0096\3\2\2\2\61\u009d\3\2\2\2\63\u009f\3\2\2\2\65\u00a1\3\2\2"+
		"\2\67\u00a4\3\2\2\29\u00a7\3\2\2\2;\u00a9\3\2\2\2=\u00ad\3\2\2\2?\u00b0"+
		"\3\2\2\2A\u00b2\3\2\2\2C\u00b4\3\2\2\2E\u00b8\3\2\2\2G\u00bd\3\2\2\2I"+
		"\u00c2\3\2\2\2K\u00c6\3\2\2\2M\u00c9\3\2\2\2O\u00d5\3\2\2\2Q\u00dd\3\2"+
		"\2\2S\u00e1\3\2\2\2U\u00e4\3\2\2\2WX\7*\2\2X\4\3\2\2\2YZ\7+\2\2Z\6\3\2"+
		"\2\2[\\\7<\2\2\\\b\3\2\2\2]^\7\60\2\2^\n\3\2\2\2_`\7+\2\2`a\7\60\2\2a"+
		"\f\3\2\2\2bc\7-\2\2c\16\3\2\2\2de\7/\2\2e\20\3\2\2\2fg\7,\2\2g\22\3\2"+
		"\2\2hi\7\61\2\2i\24\3\2\2\2jk\7\'\2\2k\26\3\2\2\2lm\7~\2\2mn\7~\2\2n\30"+
		"\3\2\2\2op\7q\2\2pq\7t\2\2q\32\3\2\2\2rs\7(\2\2st\7(\2\2t\34\3\2\2\2u"+
		"v\7c\2\2vw\7p\2\2wx\7f\2\2x\36\3\2\2\2yz\7k\2\2z{\7o\2\2{|\7r\2\2|}\7"+
		"n\2\2}~\7k\2\2~\177\7g\2\2\177\u0080\7u\2\2\u0080 \3\2\2\2\u0081\u0082"+
		"\7?\2\2\u0082\u0083\7@\2\2\u0083\"\3\2\2\2\u0084\u0085\7k\2\2\u0085\u0086"+
		"\7h\2\2\u0086\u0087\7h\2\2\u0087$\3\2\2\2\u0088\u0089\7z\2\2\u0089\u008a"+
		"\7q\2\2\u008a\u008b\7t\2\2\u008b&\3\2\2\2\u008c\u008d\7(\2\2\u008d(\3"+
		"\2\2\2\u008e\u008f\7?\2\2\u008f*\3\2\2\2\u0090\u0091\7#\2\2\u0091\u0092"+
		"\7?\2\2\u0092,\3\2\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095.\3"+
		"\2\2\2\u0096\u0097\7p\2\2\u0097\u0098\7q\2\2\u0098\u0099\7v\2\2\u0099"+
		"\u009a\7\"\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\60\3\2\2\2"+
		"\u009d\u009e\7>\2\2\u009e\62\3\2\2\2\u009f\u00a0\7@\2\2\u00a0\64\3\2\2"+
		"\2\u00a1\u00a2\7>\2\2\u00a2\u00a3\7?\2\2\u00a3\66\3\2\2\2\u00a4\u00a5"+
		"\7@\2\2\u00a5\u00a6\7?\2\2\u00a68\3\2\2\2\u00a7\u00a8\7#\2\2\u00a8:\3"+
		"\2\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"<\3\2\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7q\2\2\u00af>\3\2\2\2\u00b0\u00b1"+
		"\7%\2\2\u00b1@\3\2\2\2\u00b2\u00b3\7`\2\2\u00b3B\3\2\2\2\u00b4\u00b5\7"+
		"c\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7n\2\2\u00b7D\3\2\2\2\u00b8\u00b9"+
		"\7u\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc\7g\2\2\u00bc"+
		"F\3\2\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7p\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1H\3\2\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7p\2\2\u00c4"+
		"\u00c5\7g\2\2\u00c5J\3\2\2\2\u00c6\u00c7\7B\2\2\u00c7L\3\2\2\2\u00c8\u00ca"+
		"\4\62;\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00d3\3\2\2\2\u00cd\u00cf\7\60\2\2\u00ce\u00d0\4"+
		"\62;\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4N\3\2\2\2\u00d5\u00d9\5Q)\2\u00d6\u00d8\5S*\2\u00d7\u00d6\3"+
		"\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"P\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de\t\2\2\2\u00dd\u00dc\3\2\2\2"+
		"\u00deR\3\2\2\2\u00df\u00e2\5Q)\2\u00e0\u00e2\t\3\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e0\3\2\2\2\u00e2T\3\2\2\2\u00e3\u00e5\t\4\2\2\u00e4\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\b+\2\2\u00e9V\3\2\2\2\n\2\u00cb\u00d1\u00d3"+
		"\u00d9\u00dd\u00e1\u00e6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}