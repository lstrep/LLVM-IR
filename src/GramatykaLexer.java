// Generated from C:/Users/�ukaszStrep/Desktop/PJATK/Project/src\Gramatyka.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, FOR=15, IF=16, WRITE=17, 
		READ=18, STRING=19, ID=20, NEWLINE=21, WS=22, EQ=23, DIV=24, MUL=25, ADD=26, 
		SUB=27, FLOAT=28, INT=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "FOR", "IF", "WRITE", "READ", 
			"STRING", "ID", "NEWLINE", "WS", "EQ", "DIV", "MUL", "ADD", "SUB", "FLOAT", 
			"INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'string'", "'{'", "'}'", "'func'", 
			"'=='", "'>'", "'<'", "'intArray'", "'floatArray'", "','", "'for'", "'if'", 
			"'write'", "'read'", null, null, null, null, "'='", "':'", "'*'", "'+'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "FOR", "IF", "WRITE", "READ", "STRING", "ID", "NEWLINE", 
			"WS", "EQ", "DIV", "MUL", "ADD", "SUB", "FLOAT", "INT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00be\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u0087\n\24\f\24\16\24\u008a\13"+
		"\24\3\24\3\24\3\25\6\25\u008f\n\25\r\25\16\25\u0090\3\26\5\26\u0094\n"+
		"\26\3\26\3\26\3\27\6\27\u0099\n\27\r\27\16\27\u009a\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\5\35\u00aa\n\35\3\35\6\35"+
		"\u00ad\n\35\r\35\16\35\u00ae\3\35\3\35\6\35\u00b3\n\35\r\35\16\35\u00b4"+
		"\3\36\5\36\u00b8\n\36\3\36\6\36\u00bb\n\36\r\36\16\36\u00bc\2\2\37\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2"+
		"\5\5\2\"\"C\\c|\4\2C\\c|\4\2\13\13\"\"\2\u00c6\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2"+
		"\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rL\3\2\2\2\17N\3\2\2\2\21P\3\2"+
		"\2\2\23U\3\2\2\2\25X\3\2\2\2\27Z\3\2\2\2\31\\\3\2\2\2\33e\3\2\2\2\35p"+
		"\3\2\2\2\37r\3\2\2\2!v\3\2\2\2#y\3\2\2\2%\177\3\2\2\2\'\u0084\3\2\2\2"+
		")\u008e\3\2\2\2+\u0093\3\2\2\2-\u0098\3\2\2\2/\u009e\3\2\2\2\61\u00a0"+
		"\3\2\2\2\63\u00a2\3\2\2\2\65\u00a4\3\2\2\2\67\u00a6\3\2\2\29\u00a9\3\2"+
		"\2\2;\u00b7\3\2\2\2=>\7*\2\2>\4\3\2\2\2?@\7+\2\2@\6\3\2\2\2AB\7]\2\2B"+
		"\b\3\2\2\2CD\7_\2\2D\n\3\2\2\2EF\7u\2\2FG\7v\2\2GH\7t\2\2HI\7k\2\2IJ\7"+
		"p\2\2JK\7i\2\2K\f\3\2\2\2LM\7}\2\2M\16\3\2\2\2NO\7\177\2\2O\20\3\2\2\2"+
		"PQ\7h\2\2QR\7w\2\2RS\7p\2\2ST\7e\2\2T\22\3\2\2\2UV\7?\2\2VW\7?\2\2W\24"+
		"\3\2\2\2XY\7@\2\2Y\26\3\2\2\2Z[\7>\2\2[\30\3\2\2\2\\]\7k\2\2]^\7p\2\2"+
		"^_\7v\2\2_`\7C\2\2`a\7t\2\2ab\7t\2\2bc\7c\2\2cd\7{\2\2d\32\3\2\2\2ef\7"+
		"h\2\2fg\7n\2\2gh\7q\2\2hi\7c\2\2ij\7v\2\2jk\7C\2\2kl\7t\2\2lm\7t\2\2m"+
		"n\7c\2\2no\7{\2\2o\34\3\2\2\2pq\7.\2\2q\36\3\2\2\2rs\7h\2\2st\7q\2\2t"+
		"u\7t\2\2u \3\2\2\2vw\7k\2\2wx\7h\2\2x\"\3\2\2\2yz\7y\2\2z{\7t\2\2{|\7"+
		"k\2\2|}\7v\2\2}~\7g\2\2~$\3\2\2\2\177\u0080\7t\2\2\u0080\u0081\7g\2\2"+
		"\u0081\u0082\7c\2\2\u0082\u0083\7f\2\2\u0083&\3\2\2\2\u0084\u0088\7$\2"+
		"\2\u0085\u0087\t\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7$\2\2\u008c(\3\2\2\2\u008d\u008f\t\3\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091*\3\2\2\2"+
		"\u0092\u0094\7\17\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0096\7\f\2\2\u0096,\3\2\2\2\u0097\u0099\t\4\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\27\2\2\u009d.\3\2\2\2\u009e\u009f"+
		"\7?\2\2\u009f\60\3\2\2\2\u00a0\u00a1\7<\2\2\u00a1\62\3\2\2\2\u00a2\u00a3"+
		"\7,\2\2\u00a3\64\3\2\2\2\u00a4\u00a5\7-\2\2\u00a5\66\3\2\2\2\u00a6\u00a7"+
		"\7/\2\2\u00a78\3\2\2\2\u00a8\u00aa\7/\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad\4\62;\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b2\7\60\2\2\u00b1\u00b3\4\62;\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5:\3\2\2\2"+
		"\u00b6\u00b8\7/\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba"+
		"\3\2\2\2\u00b9\u00bb\4\62;\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd<\3\2\2\2\f\2\u0088\u0090\u0093"+
		"\u009a\u00a9\u00ae\u00b4\u00b7\u00bc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}