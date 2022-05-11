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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, WRITE=9, 
		READ=10, STRING=11, ID=12, NEWLINE=13, WS=14, EQ=15, DIV=16, MUL=17, ADD=18, 
		SUB=19, FLOAT=20, INT=21;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_wrongStatement = 2, RULE_someValues = 3, 
		RULE_someValues2 = 4, RULE_value = 5, RULE_typeArray = 6, RULE_arrayDeclaration = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "wrongStatement", "someValues", "someValues2", "value", 
			"typeArray", "arrayDeclaration"
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
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << NEWLINE) | (1L << EQ) | (1L << DIV) | (1L << MUL) | (1L << ADD) | (1L << SUB) | (1L << FLOAT) | (1L << INT))) != 0)) {
				{
				{
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << EQ) | (1L << DIV) | (1L << MUL) | (1L << ADD) | (1L << SUB) | (1L << FLOAT) | (1L << INT))) != 0)) {
					{
					setState(16);
					stat();
					}
				}

				setState(19);
				match(NEWLINE);
				}
				}
				setState(24);
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
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(WRITE);
				setState(26);
				match(ID);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(ID);
				setState(28);
				match(EQ);
				setState(29);
				someValues();
				}
				break;
			case 3:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(READ);
				setState(31);
				match(ID);
				}
				break;
			case 4:
				_localctx = new WrongStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				wrongStatement();
				}
				break;
			case 5:
				_localctx = new DeclareArrayContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				typeArray();
				setState(34);
				match(ID);
				setState(35);
				match(EQ);
				setState(36);
				match(T__0);
				setState(37);
				arrayDeclaration();
				setState(38);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new WriteArrayAtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				match(WRITE);
				setState(41);
				match(ID);
				setState(42);
				match(T__0);
				setState(43);
				match(INT);
				setState(44);
				match(T__1);
				}
				break;
			case 7:
				_localctx = new NewStringContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(45);
				match(T__2);
				setState(46);
				match(ID);
				setState(47);
				match(EQ);
				setState(48);
				match(STRING);
				}
				break;
			case 8:
				_localctx = new WriteStringContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(49);
				match(WRITE);
				setState(50);
				match(STRING);
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
		enterRule(_localctx, 4, RULE_wrongStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
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
		enterRule(_localctx, 6, RULE_someValues);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new SomevaluesDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				someValues2();
				}
				break;
			case 2:
				_localctx = new SomevaluesAddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				someValues2();
				setState(57);
				match(ADD);
				setState(58);
				someValues();
				}
				break;
			case 3:
				_localctx = new SomevaluesSubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				someValues2();
				setState(61);
				match(SUB);
				setState(62);
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
		enterRule(_localctx, 8, RULE_someValues2);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Somevalues2DefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				value();
				}
				break;
			case 2:
				_localctx = new SomevaluesMulContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				value();
				setState(68);
				match(MUL);
				setState(69);
				someValues2();
				}
				break;
			case 3:
				_localctx = new SomevaluesDivContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				value();
				setState(72);
				match(DIV);
				setState(73);
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
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new ValueIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new ValueFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(FLOAT);
				}
				break;
			case ID:
				_localctx = new ValueIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(ID);
				}
				break;
			case T__3:
				_localctx = new ValueBracketsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(T__3);
				setState(81);
				someValues();
				setState(82);
				match(T__4);
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
		enterRule(_localctx, 12, RULE_typeArray);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new IntArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new FloatArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__6);
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
		enterRule(_localctx, 14, RULE_arrayDeclaration);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new ArrayValueIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(INT);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(91);
					match(T__7);
					setState(92);
					match(INT);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FLOAT:
				_localctx = new ArrayValueFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(FLOAT);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(99);
					match(T__7);
					setState(100);
					match(FLOAT);
					}
					}
					setState(105);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27o\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\5\2\24\n\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\66"+
		"\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7W\n\7"+
		"\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\7\t`\n\t\f\t\16\tc\13\t\3\t\3\t\3\t\7\t"+
		"h\n\t\f\t\16\tk\13\t\5\tm\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\4\2\16\16"+
		"\21\27\2z\2\30\3\2\2\2\4\65\3\2\2\2\6\67\3\2\2\2\bB\3\2\2\2\nM\3\2\2\2"+
		"\fV\3\2\2\2\16Z\3\2\2\2\20l\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\23\24"+
		"\3\2\2\2\24\25\3\2\2\2\25\27\7\17\2\2\26\23\3\2\2\2\27\32\3\2\2\2\30\26"+
		"\3\2\2\2\30\31\3\2\2\2\31\3\3\2\2\2\32\30\3\2\2\2\33\34\7\13\2\2\34\66"+
		"\7\16\2\2\35\36\7\16\2\2\36\37\7\21\2\2\37\66\5\b\5\2 !\7\f\2\2!\66\7"+
		"\16\2\2\"\66\5\6\4\2#$\5\16\b\2$%\7\16\2\2%&\7\21\2\2&\'\7\3\2\2\'(\5"+
		"\20\t\2()\7\4\2\2)\66\3\2\2\2*+\7\13\2\2+,\7\16\2\2,-\7\3\2\2-.\7\27\2"+
		"\2.\66\7\4\2\2/\60\7\5\2\2\60\61\7\16\2\2\61\62\7\21\2\2\62\66\7\r\2\2"+
		"\63\64\7\13\2\2\64\66\7\r\2\2\65\33\3\2\2\2\65\35\3\2\2\2\65 \3\2\2\2"+
		"\65\"\3\2\2\2\65#\3\2\2\2\65*\3\2\2\2\65/\3\2\2\2\65\63\3\2\2\2\66\5\3"+
		"\2\2\2\678\t\2\2\28\7\3\2\2\29C\5\n\6\2:;\5\n\6\2;<\7\24\2\2<=\5\b\5\2"+
		"=C\3\2\2\2>?\5\n\6\2?@\7\25\2\2@A\5\b\5\2AC\3\2\2\2B9\3\2\2\2B:\3\2\2"+
		"\2B>\3\2\2\2C\t\3\2\2\2DN\5\f\7\2EF\5\f\7\2FG\7\23\2\2GH\5\n\6\2HN\3\2"+
		"\2\2IJ\5\f\7\2JK\7\22\2\2KL\5\n\6\2LN\3\2\2\2MD\3\2\2\2ME\3\2\2\2MI\3"+
		"\2\2\2N\13\3\2\2\2OW\7\27\2\2PW\7\26\2\2QW\7\16\2\2RS\7\6\2\2ST\5\b\5"+
		"\2TU\7\7\2\2UW\3\2\2\2VO\3\2\2\2VP\3\2\2\2VQ\3\2\2\2VR\3\2\2\2W\r\3\2"+
		"\2\2X[\7\b\2\2Y[\7\t\2\2ZX\3\2\2\2ZY\3\2\2\2[\17\3\2\2\2\\a\7\27\2\2]"+
		"^\7\n\2\2^`\7\27\2\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bm\3\2\2\2"+
		"ca\3\2\2\2di\7\26\2\2ef\7\n\2\2fh\7\26\2\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2"+
		"\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2l\\\3\2\2\2ld\3\2\2\2m\21\3\2\2\2\f\23"+
		"\30\65BMVZail";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}