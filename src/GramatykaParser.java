// Generated from C:/Users/£ukaszStrep/Desktop/PJATK/Project/src\Gramatyka.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramatykaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, FOR=15, IF=16, WRITE=17, 
		READ=18, STRING=19, ID=20, NEWLINE=21, WS=22, EQ=23, DIV=24, MUL=25, ADD=26, 
		SUB=27, FLOAT=28, INT=29;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_function = 2, RULE_fparam = 3, RULE_blockfunction = 4, 
		RULE_repetitions = 5, RULE_insideIf = 6, RULE_ifStart = 7, RULE_ifEnd = 8, 
		RULE_blockfor = 9, RULE_blockif = 10, RULE_statementIf = 11, RULE_wrongStatement = 12, 
		RULE_someValues = 13, RULE_someValues2 = 14, RULE_value = 15, RULE_typeArray = 16, 
		RULE_arrayDeclaration = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "function", "fparam", "blockfunction", "repetitions", 
			"insideIf", "ifStart", "ifEnd", "blockfor", "blockif", "statementIf", 
			"wrongStatement", "someValues", "someValues2", "value", "typeArray", 
			"arrayDeclaration"
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

	@Override
	public String getGrammarFileName() { return "Gramatyka.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramatykaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(GramatykaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramatykaParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << FOR) | (1L << IF) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << NEWLINE) | (1L << EQ) | (1L << DIV) | (1L << MUL) | (1L << ADD) | (1L << SUB) | (1L << FLOAT) | (1L << INT))) != 0)) {
				{
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case T__11:
				case T__12:
				case FOR:
				case IF:
				case WRITE:
				case READ:
				case ID:
				case EQ:
				case DIV:
				case MUL:
				case ADD:
				case SUB:
				case FLOAT:
				case INT:
					{
					setState(36);
					stat();
					}
					break;
				case T__7:
				case NEWLINE:
					{
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(37);
						function();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(42);
				match(NEWLINE);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends StatContext {
		public TerminalNode ID() { return getToken(GramatykaParser.ID, 0); }
		public CallContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WrongStatContext extends StatContext {
		public WrongStatementContext wrongStatement() {
			return getRuleContext(WrongStatementContext.class,0);
		}
		public WrongStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterWrongStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitWrongStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitWrongStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadContext extends StatContext {
		public TerminalNode READ() { return getToken(GramatykaParser.READ, 0); }
		public TerminalNode ID() { return getToken(GramatykaParser.ID, 0); }
		public ReadContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopContext extends StatContext {
		public TerminalNode FOR() { return getToken(GramatykaParser.FOR, 0); }
		public RepetitionsContext repetitions() {
			return getRuleContext(RepetitionsContext.class,0);
		}
		public BlockforContext blockfor() {
			return getRuleContext(BlockforContext.class,0);
		}
		public LoopContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteArrayAtContext extends StatContext {
		public TerminalNode WRITE() { return getToken(GramatykaParser.WRITE, 0); }
		public TerminalNode ID() { return getToken(GramatykaParser.ID, 0); }
		public TerminalNode INT() { return getToken(GramatykaParser.INT, 0); }
		public WriteArrayAtContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterWriteArrayAt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitWriteArrayAt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitWriteArrayAt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteContext extends StatContext {
		public TerminalNode WRITE() { return getToken(GramatykaParser.WRITE, 0); }
		public TerminalNode ID() { return getToken(GramatykaParser.ID, 0); }
		public WriteContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteStringContext extends StatContext {
		public TerminalNode WRITE() { return getToken(GramatykaParser.WRITE, 0); }
		public TerminalNode STRING() { return getToken(GramatykaParser.STRING, 0); }
		public WriteStringContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterWriteString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitWriteString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitWriteString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatContext {
		public TerminalNode IF() { return getToken(GramatykaParser.IF, 0); }
		public StatementIfContext statementIf() {
			return getRuleContext(StatementIfContext.class,0);
		}
		public IfStartContext ifStart() {
			return getRuleContext(IfStartContext.class,0);
		}
		public InsideIfContext insideIf() {
			return getRuleContext(InsideIfContext.class,0);
		}
		public IfEndContext ifEnd() {
			return getRuleContext(IfEndContext.class,0);
		}
		public IfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(GramatykaParser.ID, 0); }
		public TerminalNode EQ() { return getToken(GramatykaParser.EQ, 0); }
		public SomeValuesContext someValues() {
			return getRuleContext(SomeValuesContext.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareArrayContext extends StatContext {
		public TypeArrayContext typeArray() {
			return getRuleContext(TypeArrayContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramatykaParser.ID, 0); }
		public TerminalNode EQ() { return getToken(GramatykaParser.EQ, 0); }
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public DeclareArrayContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterDeclareArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitDeclareArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitDeclareArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewStringContext extends StatContext {
		public TerminalNode ID() { return getToken(GramatykaParser.ID, 0); }
		public TerminalNode EQ() { return getToken(GramatykaParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(GramatykaParser.STRING, 0); }
		public NewStringContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterNewString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitNewString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitNewString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(WRITE);
				setState(49);
				match(ID);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(ID);
				setState(51);
				match(EQ);
				setState(52);
				someValues();
				}
				break;
			case 3:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(READ);
				setState(54);
				match(ID);
				}
				break;
			case 4:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				match(ID);
				setState(56);
				match(T__0);
				setState(57);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new WrongStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				wrongStatement();
				}
				break;
			case 6:
				_localctx = new DeclareArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				typeArray();
				setState(60);
				match(ID);
				setState(61);
				match(EQ);
				setState(62);
				match(T__2);
				setState(63);
				arrayDeclaration();
				setState(64);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new WriteArrayAtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				match(WRITE);
				setState(67);
				match(ID);
				setState(68);
				match(T__2);
				setState(69);
				match(INT);
				setState(70);
				match(T__3);
				}
				break;
			case 8:
				_localctx = new NewStringContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				match(T__4);
				setState(72);
				match(ID);
				setState(73);
				match(EQ);
				setState(74);
				match(STRING);
				}
				break;
			case 9:
				_localctx = new WriteStringContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(75);
				match(WRITE);
				setState(76);
				match(STRING);
				}
				break;
			case 10:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(77);
				match(IF);
				setState(78);
				match(T__0);
				setState(79);
				statementIf();
				setState(80);
				match(T__1);
				setState(81);
				ifStart();
				setState(82);
				insideIf();
				setState(83);
				ifEnd();
				}
				break;
			case 11:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(85);
				match(FOR);
				setState(86);
				repetitions();
				setState(87);
				match(T__5);
				setState(88);
				blockfor();
				setState(89);
				match(T__6);
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

	public static class FunctionContext extends ParserRuleContext {
		public FparamContext fparam() {
			return getRuleContext(FparamContext.class,0);
		}
		public BlockfunctionContext blockfunction() {
			return getRuleContext(BlockfunctionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__7);
			setState(94);
			fparam();
			setState(95);
			match(T__5);
			setState(96);
			blockfunction();
			setState(97);
			match(T__6);
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

	public static class FparamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramatykaParser.ID, 0); }
		public FparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterFparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitFparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitFparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FparamContext fparam() throws RecognitionException {
		FparamContext _localctx = new FparamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
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

	public static class BlockfunctionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(GramatykaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramatykaParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterBlockfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitBlockfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitBlockfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockfunctionContext blockfunction() throws RecognitionException {
		BlockfunctionContext _localctx = new BlockfunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blockfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << FOR) | (1L << IF) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << NEWLINE) | (1L << EQ) | (1L << DIV) | (1L << MUL) | (1L << ADD) | (1L << SUB) | (1L << FLOAT) | (1L << INT))) != 0)) {
				{
				{
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << FOR) | (1L << IF) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << EQ) | (1L << DIV) | (1L << MUL) | (1L << ADD) | (1L << SUB) | (1L << FLOAT) | (1L << INT))) != 0)) {
					{
					setState(101);
					stat();
					}
				}

				setState(104);
				match(NEWLINE);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RepetitionsContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public RepetitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterRepetitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitRepetitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitRepetitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetitionsContext repetitions() throws RecognitionException {
		RepetitionsContext _localctx = new RepetitionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_repetitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			value();
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

	public static class InsideIfContext extends ParserRuleContext {
		public BlockifContext blockif() {
			return getRuleContext(BlockifContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GramatykaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramatykaParser.NEWLINE, i);
		}
		public InsideIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insideIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterInsideIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitInsideIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitInsideIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsideIfContext insideIf() throws RecognitionException {
		InsideIfContext _localctx = new InsideIfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_insideIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(112);
				match(NEWLINE);
				}
				break;
			}
			setState(115);
			blockif();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(116);
				match(NEWLINE);
				}
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

	public static class IfStartContext extends ParserRuleContext {
		public IfStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterIfStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitIfStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitIfStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStartContext ifStart() throws RecognitionException {
		IfStartContext _localctx = new IfStartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__5);
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

	public static class IfEndContext extends ParserRuleContext {
		public IfEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterIfEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitIfEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitIfEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfEndContext ifEnd() throws RecognitionException {
		IfEndContext _localctx = new IfEndContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__6);
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

	public static class BlockforContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(GramatykaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramatykaParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterBlockfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitBlockfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitBlockfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockforContext blockfor() throws RecognitionException {
		BlockforContext _localctx = new BlockforContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << FOR) | (1L << IF) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << NEWLINE) | (1L << EQ) | (1L << DIV) | (1L << MUL) | (1L << ADD) | (1L << SUB) | (1L << FLOAT) | (1L << INT))) != 0)) {
				{
				{
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << FOR) | (1L << IF) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << EQ) | (1L << DIV) | (1L << MUL) | (1L << ADD) | (1L << SUB) | (1L << FLOAT) | (1L << INT))) != 0)) {
					{
					setState(123);
					stat();
					}
				}

				setState(126);
				match(NEWLINE);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BlockifContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(GramatykaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramatykaParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterBlockif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitBlockif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitBlockif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockifContext blockif() throws RecognitionException {
		BlockifContext _localctx = new BlockifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockif);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << FOR) | (1L << IF) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << EQ) | (1L << DIV) | (1L << MUL) | (1L << ADD) | (1L << SUB) | (1L << FLOAT) | (1L << INT))) != 0)) {
						{
						setState(132);
						stat();
						}
					}

					setState(135);
					match(NEWLINE);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class StatementIfContext extends ParserRuleContext {
		public StatementIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementIf; }
	 
		public StatementIfContext() { }
		public void copyFrom(StatementIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IsSmallerIfContext extends StatementIfContext {
		public TerminalNode ID() { return getToken(GramatykaParser.ID, 0); }
		public TerminalNode INT() { return getToken(GramatykaParser.INT, 0); }
		public IsSmallerIfContext(StatementIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterIsSmallerIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitIsSmallerIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitIsSmallerIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsIfContext extends StatementIfContext {
		public TerminalNode ID() { return getToken(GramatykaParser.ID, 0); }
		public TerminalNode INT() { return getToken(GramatykaParser.INT, 0); }
		public EqualsIfContext(StatementIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterEqualsIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitEqualsIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitEqualsIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsBiggerIfContext extends StatementIfContext {
		public TerminalNode ID() { return getToken(GramatykaParser.ID, 0); }
		public TerminalNode INT() { return getToken(GramatykaParser.INT, 0); }
		public IsBiggerIfContext(StatementIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterIsBiggerIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitIsBiggerIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitIsBiggerIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementIfContext statementIf() throws RecognitionException {
		StatementIfContext _localctx = new StatementIfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementIf);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new EqualsIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(ID);
				setState(142);
				match(T__8);
				setState(143);
				match(INT);
				}
				break;
			case 2:
				_localctx = new IsBiggerIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(ID);
				setState(145);
				match(T__9);
				setState(146);
				match(INT);
				}
				break;
			case 3:
				_localctx = new IsSmallerIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(ID);
				setState(148);
				match(T__10);
				setState(149);
				match(INT);
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

	public static class WrongStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramatykaParser.ID, 0); }
		public TerminalNode EQ() { return getToken(GramatykaParser.EQ, 0); }
		public TerminalNode ADD() { return getToken(GramatykaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GramatykaParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(GramatykaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GramatykaParser.DIV, 0); }
		public TerminalNode FLOAT() { return getToken(GramatykaParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(GramatykaParser.INT, 0); }
		public WrongStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrongStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterWrongStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitWrongStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitWrongStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WrongStatementContext wrongStatement() throws RecognitionException {
		WrongStatementContext _localctx = new WrongStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_wrongStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << EQ) | (1L << DIV) | (1L << MUL) | (1L << ADD) | (1L << SUB) | (1L << FLOAT) | (1L << INT))) != 0)) ) {
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

	public static class SomeValuesContext extends ParserRuleContext {
		public SomeValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someValues; }
	 
		public SomeValuesContext() { }
		public void copyFrom(SomeValuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SomevaluesDefaultContext extends SomeValuesContext {
		public SomeValues2Context someValues2() {
			return getRuleContext(SomeValues2Context.class,0);
		}
		public SomevaluesDefaultContext(SomeValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterSomevaluesDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitSomevaluesDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitSomevaluesDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomevaluesSubContext extends SomeValuesContext {
		public SomeValues2Context someValues2() {
			return getRuleContext(SomeValues2Context.class,0);
		}
		public TerminalNode SUB() { return getToken(GramatykaParser.SUB, 0); }
		public SomeValuesContext someValues() {
			return getRuleContext(SomeValuesContext.class,0);
		}
		public SomevaluesSubContext(SomeValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterSomevaluesSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitSomevaluesSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitSomevaluesSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomevaluesAddContext extends SomeValuesContext {
		public SomeValues2Context someValues2() {
			return getRuleContext(SomeValues2Context.class,0);
		}
		public TerminalNode ADD() { return getToken(GramatykaParser.ADD, 0); }
		public SomeValuesContext someValues() {
			return getRuleContext(SomeValuesContext.class,0);
		}
		public SomevaluesAddContext(SomeValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterSomevaluesAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitSomevaluesAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitSomevaluesAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomeValuesContext someValues() throws RecognitionException {
		SomeValuesContext _localctx = new SomeValuesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_someValues);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new SomevaluesDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				someValues2();
				}
				break;
			case 2:
				_localctx = new SomevaluesAddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				someValues2();
				setState(156);
				match(ADD);
				setState(157);
				someValues();
				}
				break;
			case 3:
				_localctx = new SomevaluesSubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				someValues2();
				setState(160);
				match(SUB);
				setState(161);
				someValues();
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

	public static class SomeValues2Context extends ParserRuleContext {
		public SomeValues2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someValues2; }
	 
		public SomeValues2Context() { }
		public void copyFrom(SomeValues2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Somevalues2DefaultContext extends SomeValues2Context {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Somevalues2DefaultContext(SomeValues2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterSomevalues2Default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitSomevalues2Default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitSomevalues2Default(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomevaluesMulContext extends SomeValues2Context {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode MUL() { return getToken(GramatykaParser.MUL, 0); }
		public SomeValues2Context someValues2() {
			return getRuleContext(SomeValues2Context.class,0);
		}
		public SomevaluesMulContext(SomeValues2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterSomevaluesMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitSomevaluesMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitSomevaluesMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomevaluesDivContext extends SomeValues2Context {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode DIV() { return getToken(GramatykaParser.DIV, 0); }
		public SomeValues2Context someValues2() {
			return getRuleContext(SomeValues2Context.class,0);
		}
		public SomevaluesDivContext(SomeValues2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterSomevaluesDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitSomevaluesDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitSomevaluesDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomeValues2Context someValues2() throws RecognitionException {
		SomeValues2Context _localctx = new SomeValues2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_someValues2);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new Somevalues2DefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				value();
				}
				break;
			case 2:
				_localctx = new SomevaluesMulContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				value();
				setState(167);
				match(MUL);
				setState(168);
				someValues2();
				}
				break;
			case 3:
				_localctx = new SomevaluesDivContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				value();
				setState(171);
				match(DIV);
				setState(172);
				someValues2();
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueIDContext extends ValueContext {
		public TerminalNode ID() { return getToken(GramatykaParser.ID, 0); }
		public ValueIDContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterValueID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitValueID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitValueID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueBracketsContext extends ValueContext {
		public SomeValuesContext someValues() {
			return getRuleContext(SomeValuesContext.class,0);
		}
		public ValueBracketsContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterValueBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitValueBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitValueBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueIntContext extends ValueContext {
		public TerminalNode INT() { return getToken(GramatykaParser.INT, 0); }
		public ValueIntContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterValueInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitValueInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitValueInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueFloatContext extends ValueContext {
		public TerminalNode FLOAT() { return getToken(GramatykaParser.FLOAT, 0); }
		public ValueFloatContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterValueFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitValueFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitValueFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new ValueIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new ValueFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(FLOAT);
				}
				break;
			case ID:
				_localctx = new ValueIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(ID);
				}
				break;
			case T__0:
				_localctx = new ValueBracketsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				match(T__0);
				setState(180);
				someValues();
				setState(181);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeArrayContext extends ParserRuleContext {
		public TypeArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArray; }
	 
		public TypeArrayContext() { }
		public void copyFrom(TypeArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatArrayContext extends TypeArrayContext {
		public FloatArrayContext(TypeArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterFloatArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitFloatArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitFloatArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntArrayContext extends TypeArrayContext {
		public IntArrayContext(TypeArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterIntArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitIntArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitIntArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArrayContext typeArray() throws RecognitionException {
		TypeArrayContext _localctx = new TypeArrayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeArray);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new IntArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new FloatArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
	 
		public ArrayDeclarationContext() { }
		public void copyFrom(ArrayDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayValueFloatContext extends ArrayDeclarationContext {
		public List<TerminalNode> FLOAT() { return getTokens(GramatykaParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(GramatykaParser.FLOAT, i);
		}
		public ArrayValueFloatContext(ArrayDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterArrayValueFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitArrayValueFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitArrayValueFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayValueIntContext extends ArrayDeclarationContext {
		public List<TerminalNode> INT() { return getTokens(GramatykaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GramatykaParser.INT, i);
		}
		public ArrayValueIntContext(ArrayDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).enterArrayValueInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatykaListener ) ((GramatykaListener)listener).exitArrayValueInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatykaVisitor ) return ((GramatykaVisitor<? extends T>)visitor).visitArrayValueInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayDeclaration);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new ArrayValueIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(INT);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(190);
					match(T__13);
					setState(191);
					match(INT);
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FLOAT:
				_localctx = new ArrayValueFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(FLOAT);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(198);
					match(T__13);
					setState(199);
					match(FLOAT);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00d2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\5\2)\n\2\5\2+\n\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3^\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\5\6i\n\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\7\3\7\3\b\5\bt\n\b\3\b\3\b"+
		"\5\bx\n\b\3\t\3\t\3\n\3\n\3\13\5\13\177\n\13\3\13\7\13\u0082\n\13\f\13"+
		"\16\13\u0085\13\13\3\f\5\f\u0088\n\f\3\f\7\f\u008b\n\f\f\f\16\f\u008e"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0099\n\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a6\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b1\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00ba\n\21\3\22\3\22\5\22\u00be\n\22\3\23\3\23\3\23\7"+
		"\23\u00c3\n\23\f\23\16\23\u00c6\13\23\3\23\3\23\3\23\7\23\u00cb\n\23\f"+
		"\23\16\23\u00ce\13\23\5\23\u00d0\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$\2\3\4\2\26\26\31\37\2\u00e1\2/\3\2\2\2\4]\3\2\2"+
		"\2\6_\3\2\2\2\be\3\2\2\2\nm\3\2\2\2\fp\3\2\2\2\16s\3\2\2\2\20y\3\2\2\2"+
		"\22{\3\2\2\2\24\u0083\3\2\2\2\26\u008c\3\2\2\2\30\u0098\3\2\2\2\32\u009a"+
		"\3\2\2\2\34\u00a5\3\2\2\2\36\u00b0\3\2\2\2 \u00b9\3\2\2\2\"\u00bd\3\2"+
		"\2\2$\u00cf\3\2\2\2&+\5\4\3\2\')\5\6\4\2(\'\3\2\2\2()\3\2\2\2)+\3\2\2"+
		"\2*&\3\2\2\2*(\3\2\2\2+,\3\2\2\2,.\7\27\2\2-*\3\2\2\2.\61\3\2\2\2/-\3"+
		"\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61/\3\2\2\2\62\63\7\23\2\2\63^\7\26\2"+
		"\2\64\65\7\26\2\2\65\66\7\31\2\2\66^\5\34\17\2\678\7\24\2\28^\7\26\2\2"+
		"9:\7\26\2\2:;\7\3\2\2;^\7\4\2\2<^\5\32\16\2=>\5\"\22\2>?\7\26\2\2?@\7"+
		"\31\2\2@A\7\5\2\2AB\5$\23\2BC\7\6\2\2C^\3\2\2\2DE\7\23\2\2EF\7\26\2\2"+
		"FG\7\5\2\2GH\7\37\2\2H^\7\6\2\2IJ\7\7\2\2JK\7\26\2\2KL\7\31\2\2L^\7\25"+
		"\2\2MN\7\23\2\2N^\7\25\2\2OP\7\22\2\2PQ\7\3\2\2QR\5\30\r\2RS\7\4\2\2S"+
		"T\5\20\t\2TU\5\16\b\2UV\5\22\n\2V^\3\2\2\2WX\7\21\2\2XY\5\f\7\2YZ\7\b"+
		"\2\2Z[\5\24\13\2[\\\7\t\2\2\\^\3\2\2\2]\62\3\2\2\2]\64\3\2\2\2]\67\3\2"+
		"\2\2]9\3\2\2\2]<\3\2\2\2]=\3\2\2\2]D\3\2\2\2]I\3\2\2\2]M\3\2\2\2]O\3\2"+
		"\2\2]W\3\2\2\2^\5\3\2\2\2_`\7\n\2\2`a\5\b\5\2ab\7\b\2\2bc\5\n\6\2cd\7"+
		"\t\2\2d\7\3\2\2\2ef\7\26\2\2f\t\3\2\2\2gi\5\4\3\2hg\3\2\2\2hi\3\2\2\2"+
		"ij\3\2\2\2jl\7\27\2\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\13\3\2"+
		"\2\2om\3\2\2\2pq\5 \21\2q\r\3\2\2\2rt\7\27\2\2sr\3\2\2\2st\3\2\2\2tu\3"+
		"\2\2\2uw\5\26\f\2vx\7\27\2\2wv\3\2\2\2wx\3\2\2\2x\17\3\2\2\2yz\7\b\2\2"+
		"z\21\3\2\2\2{|\7\t\2\2|\23\3\2\2\2}\177\5\4\3\2~}\3\2\2\2~\177\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0082\7\27\2\2\u0081~\3\2\2\2\u0082\u0085\3\2"+
		"\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\25\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u0088\5\4\3\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008b\7\27\2\2\u008a\u0087\3\2\2\2\u008b\u008e\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\27\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\7\26\2\2\u0090\u0091\7\13\2\2\u0091\u0099\7"+
		"\37\2\2\u0092\u0093\7\26\2\2\u0093\u0094\7\f\2\2\u0094\u0099\7\37\2\2"+
		"\u0095\u0096\7\26\2\2\u0096\u0097\7\r\2\2\u0097\u0099\7\37\2\2\u0098\u008f"+
		"\3\2\2\2\u0098\u0092\3\2\2\2\u0098\u0095\3\2\2\2\u0099\31\3\2\2\2\u009a"+
		"\u009b\t\2\2\2\u009b\33\3\2\2\2\u009c\u00a6\5\36\20\2\u009d\u009e\5\36"+
		"\20\2\u009e\u009f\7\34\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a6\3\2\2\2\u00a1"+
		"\u00a2\5\36\20\2\u00a2\u00a3\7\35\2\2\u00a3\u00a4\5\34\17\2\u00a4\u00a6"+
		"\3\2\2\2\u00a5\u009c\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6"+
		"\35\3\2\2\2\u00a7\u00b1\5 \21\2\u00a8\u00a9\5 \21\2\u00a9\u00aa\7\33\2"+
		"\2\u00aa\u00ab\5\36\20\2\u00ab\u00b1\3\2\2\2\u00ac\u00ad\5 \21\2\u00ad"+
		"\u00ae\7\32\2\2\u00ae\u00af\5\36\20\2\u00af\u00b1\3\2\2\2\u00b0\u00a7"+
		"\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1\37\3\2\2\2\u00b2"+
		"\u00ba\7\37\2\2\u00b3\u00ba\7\36\2\2\u00b4\u00ba\7\26\2\2\u00b5\u00b6"+
		"\7\3\2\2\u00b6\u00b7\5\34\17\2\u00b7\u00b8\7\4\2\2\u00b8\u00ba\3\2\2\2"+
		"\u00b9\u00b2\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5"+
		"\3\2\2\2\u00ba!\3\2\2\2\u00bb\u00be\7\16\2\2\u00bc\u00be\7\17\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be#\3\2\2\2\u00bf\u00c4\7\37\2\2"+
		"\u00c0\u00c1\7\20\2\2\u00c1\u00c3\7\37\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00d0\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00cc\7\36\2\2\u00c8\u00c9\7\20\2\2\u00c9\u00cb\7"+
		"\36\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00bf\3\2"+
		"\2\2\u00cf\u00c7\3\2\2\2\u00d0%\3\2\2\2\26(*/]hmsw~\u0083\u0087\u008c"+
		"\u0098\u00a5\u00b0\u00b9\u00bd\u00c4\u00cc\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}