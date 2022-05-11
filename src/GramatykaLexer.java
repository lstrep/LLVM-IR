// Generated from C:/Users/£ukaszStrep/Desktop/PJATK/Project/src\Gramatyka.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramatykaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, WRITE=9, 
		READ=10, STRING=11, ID=12, NEWLINE=13, WS=14, EQ=15, DIV=16, MUL=17, ADD=18, 
		SUB=19, FLOAT=20, INT=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "WRITE", 
			"READ", "STRING", "ID", "NEWLINE", "WS", "EQ", "DIV", "MUL", "ADD", "SUB", 
			"FLOAT", "INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'string'", "'('", "')'", "'intArray'", "'floatArray'", 
			"','", "'write'", "'read'", null, null, null, null, "'='", "':'", "'*'", 
			"'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "WRITE", "READ", 
			"STRING", "ID", "NEWLINE", "WS", "EQ", "DIV", "MUL", "ADD", "SUB", "FLOAT", 
			"INT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GramatykaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatyka.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7\f`\n\f\f\f\16\fc\13\f\3\f"+
		"\3\f\3\r\6\rh\n\r\r\r\16\ri\3\16\5\16m\n\16\3\16\3\16\3\17\6\17r\n\17"+
		"\r\17\16\17s\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\5\25\u0083\n\25\3\25\6\25\u0086\n\25\r\25\16\25\u0087\3\25\3"+
		"\25\6\25\u008c\n\25\r\25\16\25\u008d\3\26\5\26\u0091\n\26\3\26\6\26\u0094"+
		"\n\26\r\26\16\26\u0095\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\5\5\2"+
		"\"\"C\\c|\4\2C\\c|\4\2\13\13\"\"\2\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t8\3\2\2\2\13:"+
		"\3\2\2\2\r<\3\2\2\2\17E\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25X\3\2\2\2\27"+
		"]\3\2\2\2\31g\3\2\2\2\33l\3\2\2\2\35q\3\2\2\2\37w\3\2\2\2!y\3\2\2\2#{"+
		"\3\2\2\2%}\3\2\2\2\'\177\3\2\2\2)\u0082\3\2\2\2+\u0090\3\2\2\2-.\7]\2"+
		"\2.\4\3\2\2\2/\60\7_\2\2\60\6\3\2\2\2\61\62\7u\2\2\62\63\7v\2\2\63\64"+
		"\7t\2\2\64\65\7k\2\2\65\66\7p\2\2\66\67\7i\2\2\67\b\3\2\2\289\7*\2\29"+
		"\n\3\2\2\2:;\7+\2\2;\f\3\2\2\2<=\7k\2\2=>\7p\2\2>?\7v\2\2?@\7C\2\2@A\7"+
		"t\2\2AB\7t\2\2BC\7c\2\2CD\7{\2\2D\16\3\2\2\2EF\7h\2\2FG\7n\2\2GH\7q\2"+
		"\2HI\7c\2\2IJ\7v\2\2JK\7C\2\2KL\7t\2\2LM\7t\2\2MN\7c\2\2NO\7{\2\2O\20"+
		"\3\2\2\2PQ\7.\2\2Q\22\3\2\2\2RS\7y\2\2ST\7t\2\2TU\7k\2\2UV\7v\2\2VW\7"+
		"g\2\2W\24\3\2\2\2XY\7t\2\2YZ\7g\2\2Z[\7c\2\2[\\\7f\2\2\\\26\3\2\2\2]a"+
		"\7$\2\2^`\t\2\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca"+
		"\3\2\2\2de\7$\2\2e\30\3\2\2\2fh\t\3\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2"+
		"ij\3\2\2\2j\32\3\2\2\2km\7\17\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\f"+
		"\2\2o\34\3\2\2\2pr\t\4\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3"+
		"\2\2\2uv\b\17\2\2v\36\3\2\2\2wx\7?\2\2x \3\2\2\2yz\7<\2\2z\"\3\2\2\2{"+
		"|\7,\2\2|$\3\2\2\2}~\7-\2\2~&\3\2\2\2\177\u0080\7/\2\2\u0080(\3\2\2\2"+
		"\u0081\u0083\7/\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085"+
		"\3\2\2\2\u0084\u0086\4\62;\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\7\60"+
		"\2\2\u008a\u008c\4\62;\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e*\3\2\2\2\u008f\u0091\7/\2\2\u0090"+
		"\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0094\4\62"+
		";\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096,\3\2\2\2\f\2ails\u0082\u0087\u008d\u0090\u0095\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}