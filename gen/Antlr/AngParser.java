// Generated from C:/Users/DELL/Desktop/compiler_new/angularcompiler/src/Antlr/AngParser.g4 by ANTLR 4.13.2
package Antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NGIF=1, NGFOR=2, COMMA=3, OPEN_SQUARE=4, CLOSE_SQUARE=5, OPEN_BRACE=6, 
		CLOSE_BRACE=7, OPEN_PAREN=8, CLOSE_PAREN=9, AT=10, THIS=11, COLON=12, 
		DOT=13, ARROW=14, EQUAL=15, MINUS=16, NEQUAL=17, NOT=18, OR=19, AND=20, 
		PLUS=21, PLE=22, PLPL=23, QUESTION=24, SIME=25, DOLLAR=26, MULTI=27, SQ=28, 
		S_C=29, D_C=30, B_C=31, PX=32, HUN=33, SRC=34, EXPENSES=35, ENUM=36, COMPONENT=37, 
		DIRECTIVE=38, CONST=39, FUNCTION=40, RETURN=41, PRIVATE=42, PUBLIC=43, 
		INJECTABLE=44, IF=45, ELSE=46, NEW=47, FOR=48, WHILE=49, CLASS=50, VAR=51, 
		NULL=52, LET=53, EXPORT=54, DEFAULT=55, IMPORT=56, DOCUMNET=57, FROM=58, 
		ASYNC=59, AWAIT=60, JSX_OPEN=61, JSX_CLOSE=62, JSX_SLASH=63, WS=64, COMMENT=65, 
		TYPE=66, INTERFACE=67, DATATYPE_=68, SIGNAL=69, RESOURCE=70, IMPLEMENT=71, 
		EXTEND=72, STYLE=73, TEMPLATE=74, TEMPLATEURL=75, STYLES=76, SELECTOR=77, 
		PROVIDEDIN=78, PROVIDED_IN_ROOT=79, PROVIDED_IN_PLATFORM=80, PROVIDED_IN_ANY=81, 
		STYLEURL=82, CONSTRUCTOR=83, CONSOLE_=84, LOG_=85, INPUT_=86, ONCHANGE_=87, 
		VALUE_=88, PLACEHOLDER_=89, DISABLED_=90, ONFOCUS_=91, ONCLICK_=92, CLICKK=93, 
		HEIGHT=94, WIDTH=95, BUTTON_=96, MAP_=97, OPERATION=98, SYNTAX=99, NUMBER=100, 
		STRING=101, HEX_NUMBER=102, DECIMEL=103, SingleLineString=104, MultiLineString=105, 
		ID=106;
	public static final int
		RULE_app = 0, RULE_importR = 1, RULE_exports = 2, RULE_classBody = 3, 
		RULE_decorater = 4, RULE_componentConfig = 5, RULE_directiveConfig = 6, 
		RULE_injectableConfig = 7, RULE_selector = 8, RULE_templateUrl = 9, RULE_template = 10, 
		RULE_styleUrls = 11, RULE_map = 12, RULE_value = 13, RULE_array = 14, 
		RULE_subValue = 15, RULE_variable = 16, RULE_variableValue = 17, RULE_constructor = 18, 
		RULE_vv = 19, RULE_function = 20, RULE_function2 = 21, RULE_dd = 22, RULE_functionParams = 23, 
		RULE_functionBody = 24, RULE_thisCall = 25, RULE_dotdot = 26, RULE_print = 27, 
		RULE_returnStatement = 28, RULE_html = 29, RULE_html_open = 30, RULE_html_close = 31, 
		RULE_html_single_line = 32, RULE_ngIf = 33, RULE_ngFor = 34, RULE_src = 35, 
		RULE_htmlClass = 36, RULE_click = 37, RULE_htmlDot = 38, RULE_htmlVar = 39, 
		RULE_htmlinside = 40, RULE_htmlID = 41, RULE_sy = 42, RULE_value2 = 43, 
		RULE_onClick = 44, RULE_attributeValue = 45, RULE_htmlBody = 46, RULE_hh = 47, 
		RULE_mapMethod2 = 48, RULE_mapParam = 49, RULE_callFun = 50, RULE_cssCode = 51, 
		RULE_cssKey = 52, RULE_cssInner = 53, RULE_enum = 54, RULE_interfaceCode = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"app", "importR", "exports", "classBody", "decorater", "componentConfig", 
			"directiveConfig", "injectableConfig", "selector", "templateUrl", "template", 
			"styleUrls", "map", "value", "array", "subValue", "variable", "variableValue", 
			"constructor", "vv", "function", "function2", "dd", "functionParams", 
			"functionBody", "thisCall", "dotdot", "print", "returnStatement", "html", 
			"html_open", "html_close", "html_single_line", "ngIf", "ngFor", "src", 
			"htmlClass", "click", "htmlDot", "htmlVar", "htmlinside", "htmlID", "sy", 
			"value2", "onClick", "attributeValue", "htmlBody", "hh", "mapMethod2", 
			"mapParam", "callFun", "cssCode", "cssKey", "cssInner", "enum", "interfaceCode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ngIf'", "'ngFor'", "','", "'['", "']'", "'{'", "'}'", "'('", 
			"')'", "'@'", "'this'", "':'", "'.'", "'=>'", "'='", "'-'", "'=!'", "'!'", 
			"'||'", "'&&'", "'+'", "'+='", "'++'", "'?'", "';'", "'$'", "'*'", "'#'", 
			"'''", "'\"'", "'`'", "'px'", "'%'", "'src'", "'expenses'", "'enum'", 
			"'Component'", "'Directive'", "'const'", "'function'", "'return'", "'private'", 
			"'public'", "'Injectable'", "'if'", "'else'", "'new'", "'for'", "'while'", 
			"'class'", "'var'", "'null'", "'let'", "'export'", "'default'", "'import'", 
			"'document'", "'from'", "'async'", "'await'", "'<'", "'>'", "'/'", null, 
			null, "'type'", "'interface'", null, "'Signal'", "'Resource'", "'implements '", 
			"'extend'", "'style'", "'template'", "'templateUrl'", "'styleUrls'", 
			"'selector'", "'providedIn'", "''root''", "''platform''", "''any''", 
			"'styleUrl'", "'constructor'", "'console'", "'log'", "'input'", "'onChange'", 
			"'value'", "'placeholder'", "'disabled '", "'onFocus'", "'onclick'", 
			"'click'", "'height'", "'width'", "'button'", "'map'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NGIF", "NGFOR", "COMMA", "OPEN_SQUARE", "CLOSE_SQUARE", "OPEN_BRACE", 
			"CLOSE_BRACE", "OPEN_PAREN", "CLOSE_PAREN", "AT", "THIS", "COLON", "DOT", 
			"ARROW", "EQUAL", "MINUS", "NEQUAL", "NOT", "OR", "AND", "PLUS", "PLE", 
			"PLPL", "QUESTION", "SIME", "DOLLAR", "MULTI", "SQ", "S_C", "D_C", "B_C", 
			"PX", "HUN", "SRC", "EXPENSES", "ENUM", "COMPONENT", "DIRECTIVE", "CONST", 
			"FUNCTION", "RETURN", "PRIVATE", "PUBLIC", "INJECTABLE", "IF", "ELSE", 
			"NEW", "FOR", "WHILE", "CLASS", "VAR", "NULL", "LET", "EXPORT", "DEFAULT", 
			"IMPORT", "DOCUMNET", "FROM", "ASYNC", "AWAIT", "JSX_OPEN", "JSX_CLOSE", 
			"JSX_SLASH", "WS", "COMMENT", "TYPE", "INTERFACE", "DATATYPE_", "SIGNAL", 
			"RESOURCE", "IMPLEMENT", "EXTEND", "STYLE", "TEMPLATE", "TEMPLATEURL", 
			"STYLES", "SELECTOR", "PROVIDEDIN", "PROVIDED_IN_ROOT", "PROVIDED_IN_PLATFORM", 
			"PROVIDED_IN_ANY", "STYLEURL", "CONSTRUCTOR", "CONSOLE_", "LOG_", "INPUT_", 
			"ONCHANGE_", "VALUE_", "PLACEHOLDER_", "DISABLED_", "ONFOCUS_", "ONCLICK_", 
			"CLICKK", "HEIGHT", "WIDTH", "BUTTON_", "MAP_", "OPERATION", "SYNTAX", 
			"NUMBER", "STRING", "HEX_NUMBER", "DECIMEL", "SingleLineString", "MultiLineString", 
			"ID"
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
	public String getGrammarFileName() { return "AngParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppContext extends ParserRuleContext {
		public List<ImportRContext> importR() {
			return getRuleContexts(ImportRContext.class);
		}
		public ImportRContext importR(int i) {
			return getRuleContext(ImportRContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<ExportsContext> exports() {
			return getRuleContexts(ExportsContext.class);
		}
		public ExportsContext exports(int i) {
			return getRuleContext(ExportsContext.class,i);
		}
		public List<EnumContext> enum_() {
			return getRuleContexts(EnumContext.class);
		}
		public EnumContext enum_(int i) {
			return getRuleContext(EnumContext.class,i);
		}
		public List<InterfaceCodeContext> interfaceCode() {
			return getRuleContexts(InterfaceCodeContext.class);
		}
		public InterfaceCodeContext interfaceCode(int i) {
			return getRuleContext(InterfaceCodeContext.class,i);
		}
		public AppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppContext app() throws RecognitionException {
		AppContext _localctx = new AppContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_app);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 101345903742289152L) != 0) || _la==INTERFACE || _la==ID) {
				{
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(112);
					importR();
					}
					break;
				case 2:
					{
					setState(113);
					variable();
					}
					break;
				case 3:
					{
					setState(114);
					function();
					}
					break;
				case 4:
					{
					setState(115);
					exports();
					}
					break;
				case 5:
					{
					setState(116);
					enum_();
					}
					break;
				case 6:
					{
					setState(117);
					interfaceCode();
					}
					break;
				}
				}
				setState(122);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportRContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngParser.IMPORT, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public TerminalNode FROM() { return getToken(AngParser.FROM, 0); }
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public TerminalNode SIGNAL() { return getToken(AngParser.SIGNAL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public ImportRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterImportR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitImportR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitImportR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportRContext importR() throws RecognitionException {
		ImportRContext _localctx = new ImportRContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importR);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IMPORT);
			setState(124);
			match(OPEN_BRACE);
			{
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(125);
					match(ID);
					}
					setState(127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(126);
						match(COMMA);
						}
						break;
					}
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGNAL) {
				{
				setState(134);
				match(SIGNAL);
				}
			}

			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(137);
				match(COMMA);
				}
			}

			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				{
				setState(140);
				match(ID);
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(141);
					match(COMMA);
					}
				}

				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(149);
			match(CLOSE_BRACE);
			setState(150);
			match(FROM);
			setState(151);
			match(SingleLineString);
			setState(152);
			match(SIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExportsContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(AngParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public List<DecoraterContext> decorater() {
			return getRuleContexts(DecoraterContext.class);
		}
		public DecoraterContext decorater(int i) {
			return getRuleContext(DecoraterContext.class,i);
		}
		public TerminalNode IMPLEMENT() { return getToken(AngParser.IMPLEMENT, 0); }
		public TerminalNode EXTEND() { return getToken(AngParser.EXTEND, 0); }
		public ExportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterExports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitExports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitExports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportsContext exports() throws RecognitionException {
		ExportsContext _localctx = new ExportsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(154);
				decorater();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(EXPORT);
			setState(161);
			match(CLASS);
			setState(162);
			match(ID);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENT || _la==EXTEND) {
				{
				setState(163);
				_la = _input.LA(1);
				if ( !(_la==IMPLEMENT || _la==EXTEND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(164);
				match(ID);
				}
			}

			setState(167);
			match(OPEN_BRACE);
			setState(168);
			classBody();
			setState(169);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<InterfaceCodeContext> interfaceCode() {
			return getRuleContexts(InterfaceCodeContext.class);
		}
		public InterfaceCodeContext interfaceCode(int i) {
			return getRuleContext(InterfaceCodeContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11273842475401472L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 549755879425L) != 0)) {
				{
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(171);
					constructor();
					}
					break;
				case 2:
					{
					setState(172);
					variable();
					}
					break;
				case 3:
					{
					setState(173);
					function();
					}
					break;
				case 4:
					{
					setState(174);
					interfaceCode();
					}
					break;
				}
				}
				setState(179);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecoraterContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AngParser.AT, 0); }
		public TerminalNode COMPONENT() { return getToken(AngParser.COMPONENT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public ComponentConfigContext componentConfig() {
			return getRuleContext(ComponentConfigContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode DIRECTIVE() { return getToken(AngParser.DIRECTIVE, 0); }
		public DirectiveConfigContext directiveConfig() {
			return getRuleContext(DirectiveConfigContext.class,0);
		}
		public TerminalNode INJECTABLE() { return getToken(AngParser.INJECTABLE, 0); }
		public InjectableConfigContext injectableConfig() {
			return getRuleContext(InjectableConfigContext.class,0);
		}
		public DecoraterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterDecorater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitDecorater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitDecorater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoraterContext decorater() throws RecognitionException {
		DecoraterContext _localctx = new DecoraterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decorater);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(AT);
				setState(181);
				match(COMPONENT);
				setState(182);
				match(OPEN_PAREN);
				setState(183);
				componentConfig();
				setState(184);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(AT);
				setState(187);
				match(DIRECTIVE);
				setState(188);
				match(OPEN_PAREN);
				setState(189);
				directiveConfig();
				setState(190);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(AT);
				setState(193);
				match(INJECTABLE);
				setState(194);
				match(OPEN_PAREN);
				setState(195);
				injectableConfig();
				setState(196);
				match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentConfigContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public TemplateUrlContext templateUrl() {
			return getRuleContext(TemplateUrlContext.class,0);
		}
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public StyleUrlsContext styleUrls() {
			return getRuleContext(StyleUrlsContext.class,0);
		}
		public ComponentConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterComponentConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitComponentConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitComponentConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentConfigContext componentConfig() throws RecognitionException {
		ComponentConfigContext _localctx = new ComponentConfigContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentConfig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(OPEN_BRACE);
			setState(201);
			selector();
			setState(202);
			match(COMMA);
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATEURL:
				{
				setState(203);
				templateUrl();
				}
				break;
			case TEMPLATE:
				{
				setState(204);
				template();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(207);
				match(COMMA);
				setState(208);
				styleUrls();
				}
			}

			setState(211);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveConfigContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public DirectiveConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterDirectiveConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitDirectiveConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitDirectiveConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveConfigContext directiveConfig() throws RecognitionException {
		DirectiveConfigContext _localctx = new DirectiveConfigContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_directiveConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(OPEN_BRACE);
			setState(214);
			selector();
			setState(215);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InjectableConfigContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode PROVIDEDIN() { return getToken(AngParser.PROVIDEDIN, 0); }
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public TerminalNode PROVIDED_IN_ROOT() { return getToken(AngParser.PROVIDED_IN_ROOT, 0); }
		public TerminalNode PROVIDED_IN_PLATFORM() { return getToken(AngParser.PROVIDED_IN_PLATFORM, 0); }
		public TerminalNode PROVIDED_IN_ANY() { return getToken(AngParser.PROVIDED_IN_ANY, 0); }
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public InjectableConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterInjectableConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitInjectableConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitInjectableConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableConfigContext injectableConfig() throws RecognitionException {
		InjectableConfigContext _localctx = new InjectableConfigContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_injectableConfig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(OPEN_BRACE);
			setState(218);
			match(PROVIDEDIN);
			setState(219);
			match(COLON);
			setState(220);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 33554439L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(221);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(AngParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(SELECTOR);
			setState(224);
			match(COLON);
			setState(225);
			match(SingleLineString);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateUrlContext extends ParserRuleContext {
		public TerminalNode TEMPLATEURL() { return getToken(AngParser.TEMPLATEURL, 0); }
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public TemplateUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterTemplateUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitTemplateUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitTemplateUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateUrlContext templateUrl() throws RecognitionException {
		TemplateUrlContext _localctx = new TemplateUrlContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_templateUrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(TEMPLATEURL);
			setState(228);
			match(COLON);
			setState(229);
			match(SingleLineString);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(AngParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(TEMPLATE);
			setState(232);
			match(COLON);
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(233);
				match(SingleLineString);
				}
				break;
			case 2:
				{
				setState(234);
				value();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlsContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode STYLES() { return getToken(AngParser.STYLES, 0); }
		public TerminalNode STYLE() { return getToken(AngParser.STYLE, 0); }
		public StyleUrlsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleUrls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterStyleUrls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitStyleUrls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitStyleUrls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleUrlsContext styleUrls() throws RecognitionException {
		StyleUrlsContext _localctx = new StyleUrlsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_styleUrls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==STYLE || _la==STYLES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(238);
			match(COLON);
			setState(239);
			array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(AngParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngParser.COLON, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(OPEN_BRACE);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				{
				{
				setState(242);
				match(ID);
				}
				setState(243);
				match(COLON);
				setState(244);
				value();
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(246);
					match(COMMA);
					}
				}

				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public SubValueContext subValue() {
			return getRuleContext(SubValueContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public List<TerminalNode> B_C() { return getTokens(AngParser.B_C); }
		public TerminalNode B_C(int i) {
			return getToken(AngParser.B_C, i);
		}
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				subValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(B_C);
				setState(259);
				html();
				setState(260);
				match(B_C);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(AngParser.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(AngParser.CLOSE_SQUARE, 0); }
		public List<SubValueContext> subValue() {
			return getRuleContexts(SubValueContext.class);
		}
		public SubValueContext subValue(int i) {
			return getRuleContext(SubValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(OPEN_SQUARE);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==B_C || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 11L) != 0)) {
				{
				{
				setState(265);
				subValue();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(266);
					match(COMMA);
					}
				}

				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(CLOSE_SQUARE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubValueContext extends ParserRuleContext {
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode DECIMEL() { return getToken(AngParser.DECIMEL, 0); }
		public List<TerminalNode> B_C() { return getTokens(AngParser.B_C); }
		public TerminalNode B_C(int i) {
			return getToken(AngParser.B_C, i);
		}
		public List<CssCodeContext> cssCode() {
			return getRuleContexts(CssCodeContext.class);
		}
		public CssCodeContext cssCode(int i) {
			return getRuleContext(CssCodeContext.class,i);
		}
		public SubValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterSubValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitSubValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitSubValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubValueContext subValue() throws RecognitionException {
		SubValueContext _localctx = new SubValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_subValue);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SingleLineString:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(SingleLineString);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(ID);
				}
				break;
			case DECIMEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(DECIMEL);
				}
				break;
			case B_C:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				match(B_C);
				setState(281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(280);
					cssCode();
					}
					}
					setState(283); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 268443712L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 2065L) != 0) );
				setState(285);
				match(B_C);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(AngParser.EQUAL, 0); }
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode LET() { return getToken(AngParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(AngParser.CONST, 0); }
		public TerminalNode PRIVATE() { return getToken(AngParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(AngParser.PUBLIC, 0); }
		public VvContext vv() {
			return getRuleContext(VvContext.class,0);
		}
		public List<TerminalNode> OPEN_SQUARE() { return getTokens(AngParser.OPEN_SQUARE); }
		public TerminalNode OPEN_SQUARE(int i) {
			return getToken(AngParser.OPEN_SQUARE, i);
		}
		public List<TerminalNode> CLOSE_SQUARE() { return getTokens(AngParser.CLOSE_SQUARE); }
		public TerminalNode CLOSE_SQUARE(int i) {
			return getToken(AngParser.CLOSE_SQUARE, i);
		}
		public TerminalNode DATATYPE_() { return getToken(AngParser.DATATYPE_, 0); }
		public List<DdContext> dd() {
			return getRuleContexts(DdContext.class);
		}
		public DdContext dd(int i) {
			return getRuleContext(DdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11259548824240128L) != 0)) {
				{
				setState(289);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 11259548824240128L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PUBLIC) {
				{
				setState(292);
				_la = _input.LA(1);
				if ( !(_la==PRIVATE || _la==PUBLIC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(295);
			match(ID);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(296);
				match(COLON);
				setState(312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DATATYPE_) {
						{
						setState(297);
						match(DATATYPE_);
						}
					}

					}
					break;
				case 2:
					{
					setState(300);
					vv();
					}
					break;
				case 3:
					{
					setState(301);
					match(OPEN_SQUARE);
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DATATYPE_) {
						{
						{
						setState(302);
						dd();
						setState(304);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(303);
							match(COMMA);
							}
						}

						}
						}
						setState(310);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(311);
					match(CLOSE_SQUARE);
					}
					break;
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_SQUARE) {
					{
					setState(314);
					match(OPEN_SQUARE);
					setState(315);
					match(CLOSE_SQUARE);
					}
				}

				}
			}

			setState(320);
			match(EQUAL);
			setState(321);
			variableValue();
			setState(322);
			match(SIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableValueContext extends ParserRuleContext {
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public TerminalNode DECIMEL() { return getToken(AngParser.DECIMEL, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ThisCallContext thisCall() {
			return getRuleContext(ThisCallContext.class,0);
		}
		public Function2Context function2() {
			return getRuleContext(Function2Context.class,0);
		}
		public CallFunContext callFun() {
			return getRuleContext(CallFunContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<TerminalNode> NEW() { return getTokens(AngParser.NEW); }
		public TerminalNode NEW(int i) {
			return getToken(AngParser.NEW, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitVariableValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitVariableValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(324);
				match(NEW);
				}
				break;
			}
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(327);
				match(SingleLineString);
				}
				break;
			case 2:
				{
				setState(328);
				match(DECIMEL);
				}
				break;
			case 3:
				{
				setState(329);
				match(ID);
				}
				break;
			case 4:
				{
				setState(330);
				array();
				}
				break;
			case 5:
				{
				setState(331);
				map();
				}
				break;
			case 6:
				{
				setState(332);
				thisCall();
				}
				break;
			case 7:
				{
				setState(333);
				function2();
				}
				break;
			case 8:
				{
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(334);
					match(NEW);
					}
				}

				setState(337);
				callFun();
				}
				break;
			case 9:
				{
				setState(338);
				function();
				}
				break;
			}
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(341);
				match(OPEN_PAREN);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(342);
					vv();
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				match(CLOSE_PAREN);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngParser.CONSTRUCTOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public List<TerminalNode> PRIVATE() { return getTokens(AngParser.PRIVATE); }
		public TerminalNode PRIVATE(int i) {
			return getToken(AngParser.PRIVATE, i);
		}
		public List<TerminalNode> PUBLIC() { return getTokens(AngParser.PUBLIC); }
		public TerminalNode PUBLIC(int i) {
			return getToken(AngParser.PUBLIC, i);
		}
		public List<TerminalNode> DATATYPE_() { return getTokens(AngParser.DATATYPE_); }
		public TerminalNode DATATYPE_(int i) {
			return getToken(AngParser.DATATYPE_, i);
		}
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(CONSTRUCTOR);
			setState(352);
			match(OPEN_PAREN);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIVATE || _la==PUBLIC || _la==ID) {
				{
				{
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE || _la==PUBLIC) {
					{
					setState(353);
					_la = _input.LA(1);
					if ( !(_la==PRIVATE || _la==PUBLIC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(356);
				vv();
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(357);
					match(COLON);
					setState(358);
					_la = _input.LA(1);
					if ( !(_la==DATATYPE_ || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(361);
					match(COMMA);
					}
				}

				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
			match(CLOSE_PAREN);
			setState(370);
			match(OPEN_BRACE);
			setState(371);
			functionBody();
			setState(372);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VvContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public VvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterVv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitVv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitVv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VvContext vv() throws RecognitionException {
		VvContext _localctx = new VvContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_vv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public TerminalNode FUNCTION() { return getToken(AngParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public List<FunctionParamsContext> functionParams() {
			return getRuleContexts(FunctionParamsContext.class);
		}
		public FunctionParamsContext functionParams(int i) {
			return getRuleContext(FunctionParamsContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode DATATYPE_() { return getToken(AngParser.DATATYPE_, 0); }
		public VvContext vv() {
			return getRuleContext(VvContext.class,0);
		}
		public List<TerminalNode> OPEN_SQUARE() { return getTokens(AngParser.OPEN_SQUARE); }
		public TerminalNode OPEN_SQUARE(int i) {
			return getToken(AngParser.OPEN_SQUARE, i);
		}
		public List<TerminalNode> CLOSE_SQUARE() { return getTokens(AngParser.CLOSE_SQUARE); }
		public TerminalNode CLOSE_SQUARE(int i) {
			return getToken(AngParser.CLOSE_SQUARE, i);
		}
		public List<DdContext> dd() {
			return getRuleContexts(DdContext.class);
		}
		public DdContext dd(int i) {
			return getRuleContext(DdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(376);
				match(FUNCTION);
				}
			}

			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(379);
				match(ID);
				}
			}

			setState(382);
			match(OPEN_PAREN);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(383);
				functionParams();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(CLOSE_PAREN);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(390);
				match(COLON);
				setState(404);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATATYPE_:
					{
					setState(391);
					match(DATATYPE_);
					}
					break;
				case ID:
					{
					setState(392);
					vv();
					}
					break;
				case OPEN_SQUARE:
					{
					setState(393);
					match(OPEN_SQUARE);
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DATATYPE_) {
						{
						{
						setState(394);
						dd();
						setState(396);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(395);
							match(COMMA);
							}
						}

						}
						}
						setState(402);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(403);
					match(CLOSE_SQUARE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_SQUARE) {
					{
					setState(406);
					match(OPEN_SQUARE);
					setState(407);
					match(CLOSE_SQUARE);
					}
				}

				}
			}

			setState(412);
			match(OPEN_BRACE);
			setState(413);
			functionBody();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023257616L) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 11L) != 0)) {
				{
				setState(414);
				returnStatement();
				}
			}

			setState(417);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function2Context extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(AngParser.ARROW, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<FunctionParamsContext> functionParams() {
			return getRuleContexts(FunctionParamsContext.class);
		}
		public FunctionParamsContext functionParams(int i) {
			return getRuleContext(FunctionParamsContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public TerminalNode DATATYPE_() { return getToken(AngParser.DATATYPE_, 0); }
		public VvContext vv() {
			return getRuleContext(VvContext.class,0);
		}
		public List<TerminalNode> OPEN_SQUARE() { return getTokens(AngParser.OPEN_SQUARE); }
		public TerminalNode OPEN_SQUARE(int i) {
			return getToken(AngParser.OPEN_SQUARE, i);
		}
		public List<TerminalNode> CLOSE_SQUARE() { return getTokens(AngParser.CLOSE_SQUARE); }
		public TerminalNode CLOSE_SQUARE(int i) {
			return getToken(AngParser.CLOSE_SQUARE, i);
		}
		public List<DdContext> dd() {
			return getRuleContexts(DdContext.class);
		}
		public DdContext dd(int i) {
			return getRuleContext(DdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public Function2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFunction2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFunction2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFunction2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function2Context function2() throws RecognitionException {
		Function2Context _localctx = new Function2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_function2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(OPEN_PAREN);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(420);
				functionParams();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			match(CLOSE_PAREN);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(427);
				match(COLON);
				setState(441);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATATYPE_:
					{
					setState(428);
					match(DATATYPE_);
					}
					break;
				case ID:
					{
					setState(429);
					vv();
					}
					break;
				case OPEN_SQUARE:
					{
					setState(430);
					match(OPEN_SQUARE);
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DATATYPE_) {
						{
						{
						setState(431);
						dd();
						setState(433);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(432);
							match(COMMA);
							}
						}

						}
						}
						setState(439);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(440);
					match(CLOSE_SQUARE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_SQUARE) {
					{
					setState(443);
					match(OPEN_SQUARE);
					setState(444);
					match(CLOSE_SQUARE);
					}
				}

				}
			}

			setState(449);
			match(ARROW);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(450);
				match(OPEN_BRACE);
				}
			}

			setState(453);
			functionBody();
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(454);
				returnStatement();
				}
				break;
			}
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(457);
				match(CLOSE_BRACE);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DdContext extends ParserRuleContext {
		public TerminalNode DATATYPE_() { return getToken(AngParser.DATATYPE_, 0); }
		public DdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterDd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitDd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitDd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdContext dd() throws RecognitionException {
		DdContext _localctx = new DdContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(DATATYPE_);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParamsContext extends ParserRuleContext {
		public VvContext vv() {
			return getRuleContext(VvContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(AngParser.COMMA, 0); }
		public TerminalNode DATATYPE_() { return getToken(AngParser.DATATYPE_, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public FunctionParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFunctionParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFunctionParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFunctionParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParamsContext functionParams() throws RecognitionException {
		FunctionParamsContext _localctx = new FunctionParamsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			vv();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(463);
				match(COLON);
				setState(464);
				_la = _input.LA(1);
				if ( !(_la==DATATYPE_ || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(467);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ThisCallContext> thisCall() {
			return getRuleContexts(ThisCallContext.class);
		}
		public ThisCallContext thisCall(int i) {
			return getRuleContext(ThisCallContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<CallFunContext> callFun() {
			return getRuleContexts(CallFunContext.class);
		}
		public CallFunContext callFun(int i) {
			return getRuleContext(CallFunContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(474);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						setState(470);
						variable();
						}
						break;
					case 2:
						{
						setState(471);
						thisCall();
						}
						break;
					case 3:
						{
						setState(472);
						print();
						}
						break;
					case 4:
						{
						setState(473);
						callFun();
						}
						break;
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThisCallContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(AngParser.THIS, 0); }
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public TerminalNode PLPL() { return getToken(AngParser.PLPL, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngParser.DOT, i);
		}
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public List<DotdotContext> dotdot() {
			return getRuleContexts(DotdotContext.class);
		}
		public DotdotContext dotdot(int i) {
			return getRuleContext(DotdotContext.class,i);
		}
		public ThisCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterThisCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitThisCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitThisCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisCallContext thisCall() throws RecognitionException {
		ThisCallContext _localctx = new ThisCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_thisCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !(_la==THIS || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(480);
					match(DOT);
					setState(481);
					match(ID);
					setState(483);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(482);
						match(DOT);
						}
						break;
					}
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(490);
				variableValue();
				}
				break;
			case 2:
				{
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(491);
						dotdot();
						}
						} 
					}
					setState(496);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(497);
				match(PLPL);
				}
				break;
			}
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(500);
				match(SIME);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DotdotContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode DOT() { return getToken(AngParser.DOT, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public List<TerminalNode> SingleLineString() { return getTokens(AngParser.SingleLineString); }
		public TerminalNode SingleLineString(int i) {
			return getToken(AngParser.SingleLineString, i);
		}
		public List<Function2Context> function2() {
			return getRuleContexts(Function2Context.class);
		}
		public Function2Context function2(int i) {
			return getRuleContext(Function2Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public DotdotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotdot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterDotdot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitDotdot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitDotdot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotdotContext dotdot() throws RecognitionException {
		DotdotContext _localctx = new DotdotContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dotdot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(503);
				match(DOT);
				setState(504);
				match(ID);
				}
			}

			{
			setState(507);
			match(OPEN_PAREN);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_PAREN || _la==SingleLineString || _la==ID) {
				{
				{
				setState(511);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(508);
					vv();
					}
					break;
				case SingleLineString:
					{
					setState(509);
					match(SingleLineString);
					}
					break;
				case OPEN_PAREN:
					{
					setState(510);
					function2();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(513);
					match(COMMA);
					}
				}

				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode CONSOLE_() { return getToken(AngParser.CONSOLE_, 0); }
		public TerminalNode DOT() { return getToken(AngParser.DOT, 0); }
		public TerminalNode LOG_() { return getToken(AngParser.LOG_, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public ThisCallContext thisCall() {
			return getRuleContext(ThisCallContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(CONSOLE_);
			setState(524);
			match(DOT);
			setState(525);
			match(LOG_);
			setState(526);
			match(OPEN_PAREN);
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SingleLineString:
				{
				setState(527);
				match(SingleLineString);
				}
				break;
			case THIS:
			case ID:
				{
				setState(528);
				thisCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(531);
			match(CLOSE_PAREN);
			setState(532);
			match(SIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ThisCallContext thisCall() {
			return getRuleContext(ThisCallContext.class,0);
		}
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public TerminalNode DECIMEL() { return getToken(AngParser.DECIMEL, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(AngParser.RETURN, 0); }
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(534);
				match(RETURN);
				}
			}

			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(537);
				thisCall();
				}
				break;
			case 2:
				{
				setState(538);
				match(SingleLineString);
				}
				break;
			case 3:
				{
				setState(539);
				match(DECIMEL);
				}
				break;
			case 4:
				{
				setState(540);
				match(ID);
				}
				break;
			case 5:
				{
				setState(541);
				array();
				}
				break;
			}
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(544);
				match(SIME);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends ParserRuleContext {
		public Html_openContext html_open() {
			return getRuleContext(Html_openContext.class,0);
		}
		public Html_closeContext html_close() {
			return getRuleContext(Html_closeContext.class,0);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(AngParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(AngParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(AngParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(AngParser.CLOSE_BRACE, i);
		}
		public List<HtmlContext> html() {
			return getRuleContexts(HtmlContext.class);
		}
		public HtmlContext html(int i) {
			return getRuleContext(HtmlContext.class,i);
		}
		public TerminalNode DOLLAR() { return getToken(AngParser.DOLLAR, 0); }
		public List<TerminalNode> SingleLineString() { return getTokens(AngParser.SingleLineString); }
		public TerminalNode SingleLineString(int i) {
			return getToken(AngParser.SingleLineString, i);
		}
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public ThisCallContext thisCall() {
			return getRuleContext(ThisCallContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(AngParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngParser.COLON, i);
		}
		public Html_single_lineContext html_single_line() {
			return getRuleContext(Html_single_lineContext.class,0);
		}
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_html);
		int _la;
		try {
			int _alt;
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(547);
				html_open();
				setState(578);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JSX_OPEN:
					{
					setState(551);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(548);
							html();
							}
							} 
						}
						setState(553);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
					}
					}
					break;
				case OPEN_BRACE:
				case SingleLineString:
				case ID:
					{
					{
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SingleLineString || _la==ID) {
						{
						setState(562);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SingleLineString:
							{
							setState(554);
							match(SingleLineString);
							setState(556);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==COLON) {
								{
								setState(555);
								match(COLON);
								}
							}

							}
							break;
						case ID:
							{
							setState(558);
							match(ID);
							setState(560);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==COLON) {
								{
								setState(559);
								match(COLON);
								}
							}

							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(566);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(567);
					match(OPEN_BRACE);
					setState(568);
					match(OPEN_BRACE);
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==THIS || _la==ID) {
						{
						setState(569);
						thisCall();
						}
					}

					setState(572);
					match(CLOSE_BRACE);
					setState(573);
					match(CLOSE_BRACE);
					}
					setState(576);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOLLAR) {
						{
						setState(575);
						match(DOLLAR);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(580);
				html_close();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(582);
				html_single_line();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_openContext extends ParserRuleContext {
		public TerminalNode JSX_OPEN() { return getToken(AngParser.JSX_OPEN, 0); }
		public TerminalNode SYNTAX() { return getToken(AngParser.SYNTAX, 0); }
		public TerminalNode JSX_CLOSE() { return getToken(AngParser.JSX_CLOSE, 0); }
		public List<HtmlClassContext> htmlClass() {
			return getRuleContexts(HtmlClassContext.class);
		}
		public HtmlClassContext htmlClass(int i) {
			return getRuleContext(HtmlClassContext.class,i);
		}
		public List<NgForContext> ngFor() {
			return getRuleContexts(NgForContext.class);
		}
		public NgForContext ngFor(int i) {
			return getRuleContext(NgForContext.class,i);
		}
		public List<NgIfContext> ngIf() {
			return getRuleContexts(NgIfContext.class);
		}
		public NgIfContext ngIf(int i) {
			return getRuleContext(NgIfContext.class,i);
		}
		public List<ClickContext> click() {
			return getRuleContexts(ClickContext.class);
		}
		public ClickContext click(int i) {
			return getRuleContext(ClickContext.class,i);
		}
		public Html_openContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_open; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtml_open(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtml_open(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtml_open(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_openContext html_open() throws RecognitionException {
		Html_openContext _localctx = new Html_openContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_html_open);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(JSX_OPEN);
			setState(586);
			match(SYNTAX);
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900041060608L) != 0) || _la==SingleLineString) {
				{
				setState(591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(587);
					htmlClass();
					}
					break;
				case 2:
					{
					setState(588);
					ngFor();
					}
					break;
				case 3:
					{
					setState(589);
					ngIf();
					}
					break;
				case 4:
					{
					setState(590);
					click();
					}
					break;
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
			match(JSX_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_closeContext extends ParserRuleContext {
		public TerminalNode JSX_OPEN() { return getToken(AngParser.JSX_OPEN, 0); }
		public TerminalNode JSX_SLASH() { return getToken(AngParser.JSX_SLASH, 0); }
		public TerminalNode SYNTAX() { return getToken(AngParser.SYNTAX, 0); }
		public TerminalNode JSX_CLOSE() { return getToken(AngParser.JSX_CLOSE, 0); }
		public Html_closeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_close; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtml_close(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtml_close(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtml_close(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_closeContext html_close() throws RecognitionException {
		Html_closeContext _localctx = new Html_closeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_html_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(JSX_OPEN);
			setState(599);
			match(JSX_SLASH);
			setState(600);
			match(SYNTAX);
			setState(601);
			match(JSX_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_single_lineContext extends ParserRuleContext {
		public TerminalNode JSX_OPEN() { return getToken(AngParser.JSX_OPEN, 0); }
		public TerminalNode SYNTAX() { return getToken(AngParser.SYNTAX, 0); }
		public TerminalNode JSX_SLASH() { return getToken(AngParser.JSX_SLASH, 0); }
		public TerminalNode JSX_CLOSE() { return getToken(AngParser.JSX_CLOSE, 0); }
		public List<HtmlClassContext> htmlClass() {
			return getRuleContexts(HtmlClassContext.class);
		}
		public HtmlClassContext htmlClass(int i) {
			return getRuleContext(HtmlClassContext.class,i);
		}
		public List<SrcContext> src() {
			return getRuleContexts(SrcContext.class);
		}
		public SrcContext src(int i) {
			return getRuleContext(SrcContext.class,i);
		}
		public Html_single_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_single_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtml_single_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtml_single_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtml_single_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_single_lineContext html_single_line() throws RecognitionException {
		Html_single_lineContext _localctx = new Html_single_lineContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_html_single_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(JSX_OPEN);
			setState(604);
			match(SYNTAX);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_SQUARE || _la==CLASS || _la==SingleLineString) {
				{
				setState(607);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
				case SingleLineString:
					{
					setState(605);
					htmlClass();
					}
					break;
				case OPEN_SQUARE:
					{
					setState(606);
					src();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(612);
			match(JSX_SLASH);
			setState(613);
			match(JSX_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NgIfContext extends ParserRuleContext {
		public TerminalNode MULTI() { return getToken(AngParser.MULTI, 0); }
		public TerminalNode NGIF() { return getToken(AngParser.NGIF, 0); }
		public TerminalNode EQUAL() { return getToken(AngParser.EQUAL, 0); }
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public NgIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterNgIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitNgIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitNgIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgIfContext ngIf() throws RecognitionException {
		NgIfContext _localctx = new NgIfContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ngIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(MULTI);
			setState(616);
			match(NGIF);
			setState(617);
			match(EQUAL);
			setState(618);
			match(SingleLineString);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NgForContext extends ParserRuleContext {
		public TerminalNode MULTI() { return getToken(AngParser.MULTI, 0); }
		public TerminalNode NGFOR() { return getToken(AngParser.NGFOR, 0); }
		public TerminalNode EQUAL() { return getToken(AngParser.EQUAL, 0); }
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public NgForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterNgFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitNgFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitNgFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgForContext ngFor() throws RecognitionException {
		NgForContext _localctx = new NgForContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ngFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(MULTI);
			setState(621);
			match(NGFOR);
			setState(622);
			match(EQUAL);
			setState(623);
			match(SingleLineString);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SrcContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(AngParser.OPEN_SQUARE, 0); }
		public TerminalNode SRC() { return getToken(AngParser.SRC, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(AngParser.CLOSE_SQUARE, 0); }
		public TerminalNode EQUAL() { return getToken(AngParser.EQUAL, 0); }
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public SrcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_src; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterSrc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitSrc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitSrc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SrcContext src() throws RecognitionException {
		SrcContext _localctx = new SrcContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_src);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(OPEN_SQUARE);
			setState(626);
			match(SRC);
			setState(627);
			match(CLOSE_SQUARE);
			setState(628);
			match(EQUAL);
			setState(629);
			match(SingleLineString);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlClassContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(AngParser.EQUAL, 0); }
		public Value2Context value2() {
			return getRuleContext(Value2Context.class,0);
		}
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public TerminalNode CLASS() { return getToken(AngParser.CLASS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public HtmlClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlClassContext htmlClass() throws RecognitionException {
		HtmlClassContext _localctx = new HtmlClassContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_htmlClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(631);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==SingleLineString) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(632);
			match(EQUAL);
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(633);
				match(OPEN_BRACE);
				}
				break;
			}
			setState(636);
			value2();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(637);
				match(CLOSE_BRACE);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClickContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLICKK() { return getToken(AngParser.CLICKK, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode EQUAL() { return getToken(AngParser.EQUAL, 0); }
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public ClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_click; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClickContext click() throws RecognitionException {
		ClickContext _localctx = new ClickContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_click);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(OPEN_PAREN);
			setState(641);
			match(CLICKK);
			setState(642);
			match(CLOSE_PAREN);
			setState(643);
			match(EQUAL);
			setState(644);
			match(SingleLineString);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDotContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(AngParser.DOT, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public HtmlDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDotContext htmlDot() throws RecognitionException {
		HtmlDotContext _localctx = new HtmlDotContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_htmlDot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(646);
				match(OPEN_BRACE);
				}
			}

			setState(649);
			match(ID);
			setState(650);
			match(DOT);
			setState(651);
			match(ID);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(652);
				match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlVarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public HtmlVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlVarContext htmlVar() throws RecognitionException {
		HtmlVarContext _localctx = new HtmlVarContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_htmlVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(655);
				match(OPEN_BRACE);
				}
			}

			setState(658);
			match(ID);
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(659);
				match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlinsideContext extends ParserRuleContext {
		public SyContext sy() {
			return getRuleContext(SyContext.class,0);
		}
		public List<HtmlIDContext> htmlID() {
			return getRuleContexts(HtmlIDContext.class);
		}
		public HtmlIDContext htmlID(int i) {
			return getRuleContext(HtmlIDContext.class,i);
		}
		public List<HtmlClassContext> htmlClass() {
			return getRuleContexts(HtmlClassContext.class);
		}
		public HtmlClassContext htmlClass(int i) {
			return getRuleContext(HtmlClassContext.class,i);
		}
		public HtmlinsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlinside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlinside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlinside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlinside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlinsideContext htmlinside() throws RecognitionException {
		HtmlinsideContext _localctx = new HtmlinsideContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_htmlinside);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(662);
				sy();
				}
				break;
			}
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTI || _la==CLASS || _la==SingleLineString || _la==ID) {
				{
				setState(667);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTI:
				case ID:
					{
					setState(665);
					htmlID();
					}
					break;
				case CLASS:
				case SingleLineString:
					{
					setState(666);
					htmlClass();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(671);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlIDContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(AngParser.EQUAL, 0); }
		public Value2Context value2() {
			return getRuleContext(Value2Context.class,0);
		}
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode MULTI() { return getToken(AngParser.MULTI, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public HtmlIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlIDContext htmlID() throws RecognitionException {
		HtmlIDContext _localctx = new HtmlIDContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_htmlID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTI) {
				{
				setState(672);
				match(MULTI);
				}
			}

			{
			setState(675);
			match(ID);
			}
			setState(676);
			match(EQUAL);
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(677);
				match(OPEN_BRACE);
				}
				break;
			}
			setState(680);
			value2();
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(681);
				match(CLOSE_BRACE);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public SyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterSy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitSy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitSy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyContext sy() throws RecognitionException {
		SyContext _localctx = new SyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Value2Context extends ParserRuleContext {
		public OnClickContext onClick() {
			return getRuleContext(OnClickContext.class,0);
		}
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(AngParser.DOT, 0); }
		public Value2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterValue2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitValue2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitValue2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value2Context value2() throws RecognitionException {
		Value2Context _localctx = new Value2Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_value2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(686);
				onClick();
				}
				break;
			case 2:
				{
				setState(687);
				attributeValue();
				}
				break;
			case 3:
				{
				setState(688);
				match(ID);
				setState(689);
				match(DOT);
				setState(690);
				match(ID);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class OnClickContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public Function2Context function2() {
			return getRuleContext(Function2Context.class,0);
		}
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public OnClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterOnClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitOnClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitOnClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnClickContext onClick() throws RecognitionException {
		OnClickContext _localctx = new OnClickContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_onClick);
		try {
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				match(OPEN_BRACE);
				{
				setState(694);
				function2();
				}
				setState(695);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				match(OPEN_BRACE);
				{
				setState(698);
				match(ID);
				}
				setState(699);
				match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public TerminalNode NUMBER() { return getToken(AngParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_attributeValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_la = _input.LA(1);
			if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 81L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public MapMethod2Context mapMethod2() {
			return getRuleContext(MapMethod2Context.class,0);
		}
		public HhContext hh() {
			return getRuleContext(HhContext.class,0);
		}
		public HtmlBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlBodyContext htmlBody() throws RecognitionException {
		HtmlBodyContext _localctx = new HtmlBodyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_htmlBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(OPEN_BRACE);
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(705);
				mapMethod2();
				}
				break;
			case 2:
				{
				setState(706);
				hh();
				}
				break;
			}
			setState(709);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HhContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode AND() { return getToken(AngParser.AND, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public HhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HhContext hh() throws RecognitionException {
		HhContext _localctx = new HhContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_hh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(ID);
			setState(712);
			match(AND);
			setState(713);
			match(OPEN_PAREN);
			setState(714);
			html();
			setState(715);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MapMethod2Context extends ParserRuleContext {
		public TerminalNode MAP_() { return getToken(AngParser.MAP_, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(AngParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(AngParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(AngParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(AngParser.CLOSE_PAREN, i);
		}
		public TerminalNode ARROW() { return getToken(AngParser.ARROW, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngParser.DOT, i);
		}
		public MapParamContext mapParam() {
			return getRuleContext(MapParamContext.class,0);
		}
		public MapMethod2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapMethod2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterMapMethod2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitMapMethod2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitMapMethod2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapMethod2Context mapMethod2() throws RecognitionException {
		MapMethod2Context _localctx = new MapMethod2Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_mapMethod2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(717);
				match(ID);
				setState(718);
				match(DOT);
				}
				}
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(724);
			match(MAP_);
			setState(725);
			match(OPEN_PAREN);
			setState(726);
			match(OPEN_PAREN);
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(727);
				mapParam();
				}
				break;
			}
			setState(730);
			match(CLOSE_PAREN);
			setState(731);
			match(ARROW);
			setState(732);
			match(OPEN_PAREN);
			setState(733);
			html();
			setState(734);
			match(CLOSE_PAREN);
			setState(735);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MapParamContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public MapParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterMapParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitMapParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitMapParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapParamContext mapParam() throws RecognitionException {
		MapParamContext _localctx = new MapParamContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_mapParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(737);
				match(ID);
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(738);
					match(COMMA);
					}
				}

				}
				}
				setState(745);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallFunContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(AngParser.DOT, 0); }
		public TerminalNode AWAIT() { return getToken(AngParser.AWAIT, 0); }
		public List<TerminalNode> SingleLineString() { return getTokens(AngParser.SingleLineString); }
		public TerminalNode SingleLineString(int i) {
			return getToken(AngParser.SingleLineString, i);
		}
		public List<MapContext> map() {
			return getRuleContexts(MapContext.class);
		}
		public MapContext map(int i) {
			return getRuleContext(MapContext.class,i);
		}
		public List<CallFunContext> callFun() {
			return getRuleContexts(CallFunContext.class);
		}
		public CallFunContext callFun(int i) {
			return getRuleContext(CallFunContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public CallFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterCallFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitCallFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitCallFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunContext callFun() throws RecognitionException {
		CallFunContext _localctx = new CallFunContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_callFun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AWAIT) {
				{
				setState(746);
				match(AWAIT);
				}
			}

			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(749);
				match(ID);
				}
				break;
			case 2:
				{
				setState(750);
				match(ID);
				setState(751);
				match(DOT);
				setState(752);
				match(ID);
				}
				break;
			}
			setState(755);
			match(OPEN_PAREN);
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACE || _la==AWAIT || _la==SingleLineString || _la==ID) {
				{
				{
				setState(760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(756);
					match(ID);
					}
					break;
				case 2:
					{
					setState(757);
					match(SingleLineString);
					}
					break;
				case 3:
					{
					setState(758);
					map();
					}
					break;
				case 4:
					{
					setState(759);
					callFun();
					}
					break;
				}
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(762);
					match(COMMA);
					}
				}

				}
				}
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(770);
			match(CLOSE_PAREN);
			setState(771);
			match(SIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssCodeContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public List<CssKeyContext> cssKey() {
			return getRuleContexts(CssKeyContext.class);
		}
		public CssKeyContext cssKey(int i) {
			return getRuleContext(CssKeyContext.class,i);
		}
		public List<CssInnerContext> cssInner() {
			return getRuleContexts(CssInnerContext.class);
		}
		public CssInnerContext cssInner(int i) {
			return getRuleContext(CssInnerContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngParser.DOT, i);
		}
		public List<TerminalNode> SQ() { return getTokens(AngParser.SQ); }
		public TerminalNode SQ(int i) {
			return getToken(AngParser.SQ, i);
		}
		public CssCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterCssCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitCssCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitCssCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssCodeContext cssCode() throws RecognitionException {
		CssCodeContext _localctx = new CssCodeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_cssCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==SQ || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 2065L) != 0)) {
				{
				{
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT || _la==SQ) {
					{
					setState(773);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==SQ) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(776);
				cssKey();
				}
				}
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(782);
			match(OPEN_BRACE);
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 2065L) != 0)) {
				{
				{
				setState(783);
				cssInner();
				}
				}
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(789);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssKeyContext extends ParserRuleContext {
		public List<SyContext> sy() {
			return getRuleContexts(SyContext.class);
		}
		public SyContext sy(int i) {
			return getRuleContext(SyContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(AngParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(AngParser.MINUS, i);
		}
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode WIDTH() { return getToken(AngParser.WIDTH, 0); }
		public TerminalNode SYNTAX() { return getToken(AngParser.SYNTAX, 0); }
		public CssKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterCssKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitCssKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitCssKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssKeyContext cssKey() throws RecognitionException {
		CssKeyContext _localctx = new CssKeyContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_cssKey);
		int _la;
		try {
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(791);
				sy();
				setState(794); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(792);
					match(MINUS);
					setState(793);
					sy();
					}
					}
					setState(796); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MINUS );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(799);
				match(WIDTH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(800);
				match(SYNTAX);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssInnerContext extends ParserRuleContext {
		public CssKeyContext cssKey() {
			return getRuleContext(CssKeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public CallFunContext callFun() {
			return getRuleContext(CallFunContext.class,0);
		}
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(AngParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AngParser.NUMBER, i);
		}
		public TerminalNode HUN() { return getToken(AngParser.HUN, 0); }
		public List<TerminalNode> PX() { return getTokens(AngParser.PX); }
		public TerminalNode PX(int i) {
			return getToken(AngParser.PX, i);
		}
		public CssInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssInner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterCssInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitCssInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitCssInner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssInnerContext cssInner() throws RecognitionException {
		CssInnerContext _localctx = new CssInnerContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_cssInner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			cssKey();
			setState(804);
			match(COLON);
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(805);
				match(ID);
				}
				break;
			case 2:
				{
				setState(810); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(806);
					match(NUMBER);
					setState(808);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PX) {
						{
						setState(807);
						match(PX);
						}
					}

					}
					}
					setState(812); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case 3:
				{
				{
				setState(814);
				match(NUMBER);
				setState(815);
				match(HUN);
				}
				}
				break;
			case 4:
				{
				setState(816);
				callFun();
				}
				break;
			}
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIME) {
				{
				setState(819);
				match(SIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(AngParser.ENUM, 0); }
		public SyContext sy() {
			return getRuleContext(SyContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public EnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumContext enum_() throws RecognitionException {
		EnumContext _localctx = new EnumContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(ENUM);
			setState(823);
			sy();
			setState(824);
			match(OPEN_BRACE);
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(825);
				match(ID);
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(826);
					match(COMMA);
					}
				}

				}
				}
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(834);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceCodeContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AngParser.INTERFACE, 0); }
		public SyContext sy() {
			return getRuleContext(SyContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngParser.COLON, i);
		}
		public List<TerminalNode> SIME() { return getTokens(AngParser.SIME); }
		public TerminalNode SIME(int i) {
			return getToken(AngParser.SIME, i);
		}
		public List<TerminalNode> DATATYPE_() { return getTokens(AngParser.DATATYPE_); }
		public TerminalNode DATATYPE_(int i) {
			return getToken(AngParser.DATATYPE_, i);
		}
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public InterfaceCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterInterfaceCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitInterfaceCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitInterfaceCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceCodeContext interfaceCode() throws RecognitionException {
		InterfaceCodeContext _localctx = new InterfaceCodeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_interfaceCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(INTERFACE);
			setState(837);
			sy();
			setState(838);
			match(OPEN_BRACE);
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(839);
				match(ID);
				setState(840);
				match(COLON);
				setState(843);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATATYPE_:
					{
					setState(841);
					match(DATATYPE_);
					}
					break;
				case ID:
					{
					setState(842);
					vv();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(845);
				match(SIME);
				}
				}
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(851);
			match(CLOSE_BRACE);
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
		"\u0004\u0001j\u0356\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000w\b\u0000\n\u0000\f\u0000z\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0080\b\u0001\u0005\u0001\u0082"+
		"\b\u0001\n\u0001\f\u0001\u0085\t\u0001\u0001\u0001\u0003\u0001\u0088\b"+
		"\u0001\u0001\u0001\u0003\u0001\u008b\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u008f\b\u0001\u0005\u0001\u0091\b\u0001\n\u0001\f\u0001\u0094\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0005\u0002\u009c\b\u0002\n\u0002\f\u0002\u009f\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a6\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u00b0\b\u0003\n\u0003\f\u0003\u00b3"+
		"\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00c7\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00ce\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00d2\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ec\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00f8\b\f\u0005\f\u00fa\b\f\n\f\f\f\u00fd\t\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0107"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u010c\b\u000e\u0005"+
		"\u000e\u010e\b\u000e\n\u000e\f\u000e\u0111\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f"+
		"\u011a\b\u000f\u000b\u000f\f\u000f\u011b\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0120\b\u000f\u0001\u0010\u0003\u0010\u0123\b\u0010\u0001\u0010"+
		"\u0003\u0010\u0126\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u012b\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0131\b\u0010\u0005\u0010\u0133\b\u0010\n\u0010\f\u0010\u0136\t\u0010"+
		"\u0001\u0010\u0003\u0010\u0139\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u013d\b\u0010\u0003\u0010\u013f\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0003\u0011\u0146\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0150\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0154"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0158\b\u0011\n\u0011\f\u0011"+
		"\u015b\t\u0011\u0001\u0011\u0003\u0011\u015e\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0163\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0168\b\u0012\u0001\u0012\u0003\u0012\u016b\b\u0012"+
		"\u0005\u0012\u016d\b\u0012\n\u0012\f\u0012\u0170\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0003\u0014\u017a\b\u0014\u0001\u0014\u0003\u0014\u017d\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0181\b\u0014\n\u0014\f\u0014\u0184"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u018d\b\u0014\u0005\u0014\u018f\b\u0014"+
		"\n\u0014\f\u0014\u0192\t\u0014\u0001\u0014\u0003\u0014\u0195\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0199\b\u0014\u0003\u0014\u019b\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01a0\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u01a6\b\u0015\n\u0015"+
		"\f\u0015\u01a9\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01b2\b\u0015\u0005\u0015"+
		"\u01b4\b\u0015\n\u0015\f\u0015\u01b7\t\u0015\u0001\u0015\u0003\u0015\u01ba"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01be\b\u0015\u0003\u0015"+
		"\u01c0\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01c4\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u01c8\b\u0015\u0001\u0015\u0003\u0015\u01cb"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01d2\b\u0017\u0001\u0017\u0003\u0017\u01d5\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01db\b\u0018\n\u0018"+
		"\f\u0018\u01de\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u01e4\b\u0019\u0005\u0019\u01e6\b\u0019\n\u0019\f\u0019\u01e9"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01ed\b\u0019\n\u0019\f\u0019"+
		"\u01f0\t\u0019\u0001\u0019\u0003\u0019\u01f3\b\u0019\u0001\u0019\u0003"+
		"\u0019\u01f6\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u01fa\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0200\b\u001a"+
		"\u0001\u001a\u0003\u001a\u0203\b\u001a\u0005\u001a\u0205\b\u001a\n\u001a"+
		"\f\u001a\u0208\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0212\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0003\u001c\u0218\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u021f\b\u001c\u0001\u001c\u0003\u001c\u0222\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u0226\b\u001d\n\u001d\f\u001d\u0229\t\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u022d\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0231\b\u001d\u0005\u001d\u0233\b\u001d\n\u001d\f\u001d\u0236\t\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u023b\b\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0241\b\u001d\u0003\u001d"+
		"\u0243\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0248\b"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0005\u001e\u0250\b\u001e\n\u001e\f\u001e\u0253\t\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0005 \u0260\b \n \f \u0263\t \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0003$\u027b\b$\u0001$\u0001$\u0003$\u027f\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001&\u0003&\u0288\b&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u028e\b&\u0001\'\u0003\'\u0291\b\'\u0001\'\u0001\'\u0003\'\u0295\b\'"+
		"\u0001(\u0003(\u0298\b(\u0001(\u0001(\u0005(\u029c\b(\n(\f(\u029f\t(\u0001"+
		")\u0003)\u02a2\b)\u0001)\u0001)\u0001)\u0003)\u02a7\b)\u0001)\u0001)\u0003"+
		")\u02ab\b)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u02b4"+
		"\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u02bd\b,\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0003.\u02c4\b.\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00050\u02d0\b0\n0\f0\u02d3"+
		"\t0\u00010\u00010\u00010\u00010\u00030\u02d9\b0\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00011\u00011\u00031\u02e4\b1\u00051\u02e6\b1\n"+
		"1\f1\u02e9\t1\u00012\u00032\u02ec\b2\u00012\u00012\u00012\u00012\u0003"+
		"2\u02f2\b2\u00012\u00012\u00012\u00012\u00012\u00032\u02f9\b2\u00012\u0003"+
		"2\u02fc\b2\u00052\u02fe\b2\n2\f2\u0301\t2\u00012\u00012\u00012\u00013"+
		"\u00033\u0307\b3\u00013\u00053\u030a\b3\n3\f3\u030d\t3\u00013\u00013\u0005"+
		"3\u0311\b3\n3\f3\u0314\t3\u00013\u00013\u00014\u00014\u00014\u00044\u031b"+
		"\b4\u000b4\f4\u031c\u00014\u00014\u00014\u00034\u0322\b4\u00015\u0001"+
		"5\u00015\u00015\u00015\u00035\u0329\b5\u00045\u032b\b5\u000b5\f5\u032c"+
		"\u00015\u00015\u00015\u00035\u0332\b5\u00015\u00035\u0335\b5\u00016\u0001"+
		"6\u00016\u00016\u00016\u00036\u033c\b6\u00056\u033e\b6\n6\f6\u0341\t6"+
		"\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0003"+
		"7\u034c\b7\u00017\u00057\u034f\b7\n7\f7\u0352\t7\u00017\u00017\u00017"+
		"\u0000\u00008\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjln\u0000"+
		"\n\u0001\u0000GH\u0002\u0000OQhh\u0002\u0000IILL\u0003\u0000\'\'3355\u0001"+
		"\u0000*+\u0002\u0000DDjj\u0002\u0000\u000b\u000bjj\u0002\u000022hh\u0003"+
		"\u0000ddhhjj\u0002\u0000\r\r\u001c\u001c\u03be\u0000x\u0001\u0000\u0000"+
		"\u0000\u0002{\u0001\u0000\u0000\u0000\u0004\u009d\u0001\u0000\u0000\u0000"+
		"\u0006\u00b1\u0001\u0000\u0000\u0000\b\u00c6\u0001\u0000\u0000\u0000\n"+
		"\u00c8\u0001\u0000\u0000\u0000\f\u00d5\u0001\u0000\u0000\u0000\u000e\u00d9"+
		"\u0001\u0000\u0000\u0000\u0010\u00df\u0001\u0000\u0000\u0000\u0012\u00e3"+
		"\u0001\u0000\u0000\u0000\u0014\u00e7\u0001\u0000\u0000\u0000\u0016\u00ed"+
		"\u0001\u0000\u0000\u0000\u0018\u00f1\u0001\u0000\u0000\u0000\u001a\u0106"+
		"\u0001\u0000\u0000\u0000\u001c\u0108\u0001\u0000\u0000\u0000\u001e\u011f"+
		"\u0001\u0000\u0000\u0000 \u0122\u0001\u0000\u0000\u0000\"\u0145\u0001"+
		"\u0000\u0000\u0000$\u015f\u0001\u0000\u0000\u0000&\u0176\u0001\u0000\u0000"+
		"\u0000(\u0179\u0001\u0000\u0000\u0000*\u01a3\u0001\u0000\u0000\u0000,"+
		"\u01cc\u0001\u0000\u0000\u0000.\u01ce\u0001\u0000\u0000\u00000\u01dc\u0001"+
		"\u0000\u0000\u00002\u01df\u0001\u0000\u0000\u00004\u01f9\u0001\u0000\u0000"+
		"\u00006\u020b\u0001\u0000\u0000\u00008\u0217\u0001\u0000\u0000\u0000:"+
		"\u0247\u0001\u0000\u0000\u0000<\u0249\u0001\u0000\u0000\u0000>\u0256\u0001"+
		"\u0000\u0000\u0000@\u025b\u0001\u0000\u0000\u0000B\u0267\u0001\u0000\u0000"+
		"\u0000D\u026c\u0001\u0000\u0000\u0000F\u0271\u0001\u0000\u0000\u0000H"+
		"\u0277\u0001\u0000\u0000\u0000J\u0280\u0001\u0000\u0000\u0000L\u0287\u0001"+
		"\u0000\u0000\u0000N\u0290\u0001\u0000\u0000\u0000P\u0297\u0001\u0000\u0000"+
		"\u0000R\u02a1\u0001\u0000\u0000\u0000T\u02ac\u0001\u0000\u0000\u0000V"+
		"\u02b3\u0001\u0000\u0000\u0000X\u02bc\u0001\u0000\u0000\u0000Z\u02be\u0001"+
		"\u0000\u0000\u0000\\\u02c0\u0001\u0000\u0000\u0000^\u02c7\u0001\u0000"+
		"\u0000\u0000`\u02d1\u0001\u0000\u0000\u0000b\u02e7\u0001\u0000\u0000\u0000"+
		"d\u02eb\u0001\u0000\u0000\u0000f\u030b\u0001\u0000\u0000\u0000h\u0321"+
		"\u0001\u0000\u0000\u0000j\u0323\u0001\u0000\u0000\u0000l\u0336\u0001\u0000"+
		"\u0000\u0000n\u0344\u0001\u0000\u0000\u0000pw\u0003\u0002\u0001\u0000"+
		"qw\u0003 \u0010\u0000rw\u0003(\u0014\u0000sw\u0003\u0004\u0002\u0000t"+
		"w\u0003l6\u0000uw\u0003n7\u0000vp\u0001\u0000\u0000\u0000vq\u0001\u0000"+
		"\u0000\u0000vr\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0001\u0001\u0000"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u00058\u0000\u0000|\u0083\u0005"+
		"\u0006\u0000\u0000}\u007f\u0005j\u0000\u0000~\u0080\u0005\u0003\u0000"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0082\u0001\u0000\u0000\u0000\u0081}\u0001\u0000\u0000\u0000\u0082"+
		"\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0086\u0088\u0005E\u0000\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a"+
		"\u0001\u0000\u0000\u0000\u0089\u008b\u0005\u0003\u0000\u0000\u008a\u0089"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0092"+
		"\u0001\u0000\u0000\u0000\u008c\u008e\u0005j\u0000\u0000\u008d\u008f\u0005"+
		"\u0003\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008c\u0001"+
		"\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\u0007\u0000\u0000\u0096\u0097\u0005:\u0000\u0000\u0097\u0098\u0005h\u0000"+
		"\u0000\u0098\u0099\u0005\u0019\u0000\u0000\u0099\u0003\u0001\u0000\u0000"+
		"\u0000\u009a\u009c\u0003\b\u0004\u0000\u009b\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u00056\u0000\u0000\u00a1"+
		"\u00a2\u00052\u0000\u0000\u00a2\u00a5\u0005j\u0000\u0000\u00a3\u00a4\u0007"+
		"\u0000\u0000\u0000\u00a4\u00a6\u0005j\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005\u0006\u0000\u0000\u00a8\u00a9\u0003\u0006"+
		"\u0003\u0000\u00a9\u00aa\u0005\u0007\u0000\u0000\u00aa\u0005\u0001\u0000"+
		"\u0000\u0000\u00ab\u00b0\u0003$\u0012\u0000\u00ac\u00b0\u0003 \u0010\u0000"+
		"\u00ad\u00b0\u0003(\u0014\u0000\u00ae\u00b0\u0003n7\u0000\u00af\u00ab"+
		"\u0001\u0000\u0000\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2\u0007\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\n\u0000\u0000\u00b5\u00b6\u0005"+
		"%\u0000\u0000\u00b6\u00b7\u0005\b\u0000\u0000\u00b7\u00b8\u0003\n\u0005"+
		"\u0000\u00b8\u00b9\u0005\t\u0000\u0000\u00b9\u00c7\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0005\n\u0000\u0000\u00bb\u00bc\u0005&\u0000\u0000\u00bc"+
		"\u00bd\u0005\b\u0000\u0000\u00bd\u00be\u0003\f\u0006\u0000\u00be\u00bf"+
		"\u0005\t\u0000\u0000\u00bf\u00c7\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005"+
		"\n\u0000\u0000\u00c1\u00c2\u0005,\u0000\u0000\u00c2\u00c3\u0005\b\u0000"+
		"\u0000\u00c3\u00c4\u0003\u000e\u0007\u0000\u00c4\u00c5\u0005\t\u0000\u0000"+
		"\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00c6\u00ba\u0001\u0000\u0000\u0000\u00c6\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c7\t\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0006\u0000\u0000\u00c9"+
		"\u00ca\u0003\u0010\b\u0000\u00ca\u00cd\u0005\u0003\u0000\u0000\u00cb\u00ce"+
		"\u0003\u0012\t\u0000\u00cc\u00ce\u0003\u0014\n\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0005\u0003\u0000\u0000\u00d0\u00d2\u0003"+
		"\u0016\u000b\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"\u0007\u0000\u0000\u00d4\u000b\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		"\u0006\u0000\u0000\u00d6\u00d7\u0003\u0010\b\u0000\u00d7\u00d8\u0005\u0007"+
		"\u0000\u0000\u00d8\r\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u0006\u0000"+
		"\u0000\u00da\u00db\u0005N\u0000\u0000\u00db\u00dc\u0005\f\u0000\u0000"+
		"\u00dc\u00dd\u0007\u0001\u0000\u0000\u00dd\u00de\u0005\u0007\u0000\u0000"+
		"\u00de\u000f\u0001\u0000\u0000\u0000\u00df\u00e0\u0005M\u0000\u0000\u00e0"+
		"\u00e1\u0005\f\u0000\u0000\u00e1\u00e2\u0005h\u0000\u0000\u00e2\u0011"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005K\u0000\u0000\u00e4\u00e5\u0005"+
		"\f\u0000\u0000\u00e5\u00e6\u0005h\u0000\u0000\u00e6\u0013\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0005J\u0000\u0000\u00e8\u00eb\u0005\f\u0000"+
		"\u0000\u00e9\u00ec\u0005h\u0000\u0000\u00ea\u00ec\u0003\u001a\r\u0000"+
		"\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ec\u0015\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007\u0002\u0000\u0000"+
		"\u00ee\u00ef\u0005\f\u0000\u0000\u00ef\u00f0\u0003\u001c\u000e\u0000\u00f0"+
		"\u0017\u0001\u0000\u0000\u0000\u00f1\u00fb\u0005\u0006\u0000\u0000\u00f2"+
		"\u00f3\u0005j\u0000\u0000\u00f3\u00f4\u0005\f\u0000\u0000\u00f4\u00f5"+
		"\u0003\u001a\r\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f8\u0005"+
		"\u0003\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f2\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005"+
		"\u0007\u0000\u0000\u00ff\u0019\u0001\u0000\u0000\u0000\u0100\u0107\u0003"+
		"\u001e\u000f\u0000\u0101\u0107\u0003\u001c\u000e\u0000\u0102\u0103\u0005"+
		"\u001f\u0000\u0000\u0103\u0104\u0003:\u001d\u0000\u0104\u0105\u0005\u001f"+
		"\u0000\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u0100\u0001\u0000"+
		"\u0000\u0000\u0106\u0101\u0001\u0000\u0000\u0000\u0106\u0102\u0001\u0000"+
		"\u0000\u0000\u0107\u001b\u0001\u0000\u0000\u0000\u0108\u010f\u0005\u0004"+
		"\u0000\u0000\u0109\u010b\u0003\u001e\u000f\u0000\u010a\u010c\u0005\u0003"+
		"\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u0109\u0001\u0000"+
		"\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u0005"+
		"\u0000\u0000\u0113\u001d\u0001\u0000\u0000\u0000\u0114\u0120\u0005h\u0000"+
		"\u0000\u0115\u0120\u0005j\u0000\u0000\u0116\u0120\u0005g\u0000\u0000\u0117"+
		"\u0119\u0005\u001f\u0000\u0000\u0118\u011a\u0003f3\u0000\u0119\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0005\u001f\u0000\u0000\u011e\u0120\u0001"+
		"\u0000\u0000\u0000\u011f\u0114\u0001\u0000\u0000\u0000\u011f\u0115\u0001"+
		"\u0000\u0000\u0000\u011f\u0116\u0001\u0000\u0000\u0000\u011f\u0117\u0001"+
		"\u0000\u0000\u0000\u0120\u001f\u0001\u0000\u0000\u0000\u0121\u0123\u0007"+
		"\u0003\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001"+
		"\u0000\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0126\u0007"+
		"\u0004\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u013e\u0005"+
		"j\u0000\u0000\u0128\u0138\u0005\f\u0000\u0000\u0129\u012b\u0005D\u0000"+
		"\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012b\u0139\u0001\u0000\u0000\u0000\u012c\u0139\u0003&\u0013\u0000"+
		"\u012d\u0134\u0005\u0004\u0000\u0000\u012e\u0130\u0003,\u0016\u0000\u012f"+
		"\u0131\u0005\u0003\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132"+
		"\u012e\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134"+
		"\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135"+
		"\u0137\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137"+
		"\u0139\u0005\u0005\u0000\u0000\u0138\u012a\u0001\u0000\u0000\u0000\u0138"+
		"\u012c\u0001\u0000\u0000\u0000\u0138\u012d\u0001\u0000\u0000\u0000\u0139"+
		"\u013c\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u0004\u0000\u0000\u013b"+
		"\u013d\u0005\u0005\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e"+
		"\u0128\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u000f\u0000\u0000\u0141"+
		"\u0142\u0003\"\u0011\u0000\u0142\u0143\u0005\u0019\u0000\u0000\u0143!"+
		"\u0001\u0000\u0000\u0000\u0144\u0146\u0005/\u0000\u0000\u0145\u0144\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0153\u0001"+
		"\u0000\u0000\u0000\u0147\u0154\u0005h\u0000\u0000\u0148\u0154\u0005g\u0000"+
		"\u0000\u0149\u0154\u0005j\u0000\u0000\u014a\u0154\u0003\u001c\u000e\u0000"+
		"\u014b\u0154\u0003\u0018\f\u0000\u014c\u0154\u00032\u0019\u0000\u014d"+
		"\u0154\u0003*\u0015\u0000\u014e\u0150\u0005/\u0000\u0000\u014f\u014e\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151\u0001"+
		"\u0000\u0000\u0000\u0151\u0154\u0003d2\u0000\u0152\u0154\u0003(\u0014"+
		"\u0000\u0153\u0147\u0001\u0000\u0000\u0000\u0153\u0148\u0001\u0000\u0000"+
		"\u0000\u0153\u0149\u0001\u0000\u0000\u0000\u0153\u014a\u0001\u0000\u0000"+
		"\u0000\u0153\u014b\u0001\u0000\u0000\u0000\u0153\u014c\u0001\u0000\u0000"+
		"\u0000\u0153\u014d\u0001\u0000\u0000\u0000\u0153\u014f\u0001\u0000\u0000"+
		"\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154\u015d\u0001\u0000\u0000"+
		"\u0000\u0155\u0159\u0005\b\u0000\u0000\u0156\u0158\u0003&\u0013\u0000"+
		"\u0157\u0156\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000"+
		"\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000"+
		"\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000"+
		"\u015c\u015e\u0005\t\u0000\u0000\u015d\u0155\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0001\u0000\u0000\u0000\u015e#\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0005S\u0000\u0000\u0160\u016e\u0005\b\u0000\u0000\u0161\u0163\u0007"+
		"\u0004\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0162\u0163\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0167\u0003"+
		"&\u0013\u0000\u0165\u0166\u0005\f\u0000\u0000\u0166\u0168\u0007\u0005"+
		"\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000"+
		"\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169\u016b\u0005\u0003"+
		"\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000"+
		"\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c\u0162\u0001\u0000"+
		"\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0171\u0001\u0000"+
		"\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171\u0172\u0005\t\u0000"+
		"\u0000\u0172\u0173\u0005\u0006\u0000\u0000\u0173\u0174\u00030\u0018\u0000"+
		"\u0174\u0175\u0005\u0007\u0000\u0000\u0175%\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0005j\u0000\u0000\u0177\'\u0001\u0000\u0000\u0000\u0178\u017a"+
		"\u0005(\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u0179\u017a\u0001"+
		"\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u017d\u0005"+
		"j\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0182\u0005\b\u0000"+
		"\u0000\u017f\u0181\u0003.\u0017\u0000\u0180\u017f\u0001\u0000\u0000\u0000"+
		"\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0185\u0001\u0000\u0000\u0000"+
		"\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u019a\u0005\t\u0000\u0000\u0186"+
		"\u0194\u0005\f\u0000\u0000\u0187\u0195\u0005D\u0000\u0000\u0188\u0195"+
		"\u0003&\u0013\u0000\u0189\u0190\u0005\u0004\u0000\u0000\u018a\u018c\u0003"+
		",\u0016\u0000\u018b\u018d\u0005\u0003\u0000\u0000\u018c\u018b\u0001\u0000"+
		"\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018f\u0001\u0000"+
		"\u0000\u0000\u018e\u018a\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000"+
		"\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000"+
		"\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000"+
		"\u0000\u0000\u0193\u0195\u0005\u0005\u0000\u0000\u0194\u0187\u0001\u0000"+
		"\u0000\u0000\u0194\u0188\u0001\u0000\u0000\u0000\u0194\u0189\u0001\u0000"+
		"\u0000\u0000\u0195\u0198\u0001\u0000\u0000\u0000\u0196\u0197\u0005\u0004"+
		"\u0000\u0000\u0197\u0199\u0005\u0005\u0000\u0000\u0198\u0196\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019b\u0001\u0000"+
		"\u0000\u0000\u019a\u0186\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0005\u0006"+
		"\u0000\u0000\u019d\u019f\u00030\u0018\u0000\u019e\u01a0\u00038\u001c\u0000"+
		"\u019f\u019e\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\u0007\u0000\u0000"+
		"\u01a2)\u0001\u0000\u0000\u0000\u01a3\u01a7\u0005\b\u0000\u0000\u01a4"+
		"\u01a6\u0003.\u0017\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a7"+
		"\u0001\u0000\u0000\u0000\u01aa\u01bf\u0005\t\u0000\u0000\u01ab\u01b9\u0005"+
		"\f\u0000\u0000\u01ac\u01ba\u0005D\u0000\u0000\u01ad\u01ba\u0003&\u0013"+
		"\u0000\u01ae\u01b5\u0005\u0004\u0000\u0000\u01af\u01b1\u0003,\u0016\u0000"+
		"\u01b0\u01b2\u0005\u0003\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b3\u01af\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b8\u01ba\u0005\u0005\u0000\u0000\u01b9\u01ac\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ad\u0001\u0000\u0000\u0000\u01b9\u01ae\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005\u0004\u0000\u0000"+
		"\u01bc\u01be\u0005\u0005\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01c0\u0001\u0000\u0000\u0000"+
		"\u01bf\u01ab\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c3\u0005\u000e\u0000\u0000"+
		"\u01c2\u01c4\u0005\u0006\u0000\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c7\u00030\u0018\u0000\u01c6\u01c8\u00038\u001c\u0000\u01c7\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01ca"+
		"\u0001\u0000\u0000\u0000\u01c9\u01cb\u0005\u0007\u0000\u0000\u01ca\u01c9"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb+\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cd\u0005D\u0000\u0000\u01cd-\u0001\u0000\u0000"+
		"\u0000\u01ce\u01d1\u0003&\u0013\u0000\u01cf\u01d0\u0005\f\u0000\u0000"+
		"\u01d0\u01d2\u0007\u0005\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d5\u0005\u0003\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5/\u0001\u0000\u0000\u0000\u01d6"+
		"\u01db\u0003 \u0010\u0000\u01d7\u01db\u00032\u0019\u0000\u01d8\u01db\u0003"+
		"6\u001b\u0000\u01d9\u01db\u0003d2\u0000\u01da\u01d6\u0001\u0000\u0000"+
		"\u0000\u01da\u01d7\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000"+
		"\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000"+
		"\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000"+
		"\u0000\u01dd1\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000"+
		"\u01df\u01e7\u0007\u0006\u0000\u0000\u01e0\u01e1\u0005\r\u0000\u0000\u01e1"+
		"\u01e3\u0005j\u0000\u0000\u01e2\u01e4\u0005\r\u0000\u0000\u01e3\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e0\u0001\u0000\u0000\u0000\u01e6\u01e9"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e8\u01f2\u0001\u0000\u0000\u0000\u01e9\u01e7"+
		"\u0001\u0000\u0000\u0000\u01ea\u01f3\u0003\"\u0011\u0000\u01eb\u01ed\u0003"+
		"4\u001a\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f3\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f3\u0005\u0017\u0000\u0000\u01f2\u01ea\u0001\u0000"+
		"\u0000\u0000\u01f2\u01ee\u0001\u0000\u0000\u0000\u01f2\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f5\u0001\u0000\u0000\u0000\u01f4\u01f6\u0005\u0019"+
		"\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f63\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005\r\u0000"+
		"\u0000\u01f8\u01fa\u0005j\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fb\u0206\u0005\b\u0000\u0000\u01fc\u0200\u0003&\u0013\u0000\u01fd"+
		"\u0200\u0005h\u0000\u0000\u01fe\u0200\u0003*\u0015\u0000\u01ff\u01fc\u0001"+
		"\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u01fe\u0001"+
		"\u0000\u0000\u0000\u0200\u0202\u0001\u0000\u0000\u0000\u0201\u0203\u0005"+
		"\u0003\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0202\u0203\u0001"+
		"\u0000\u0000\u0000\u0203\u0205\u0001\u0000\u0000\u0000\u0204\u01ff\u0001"+
		"\u0000\u0000\u0000\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0204\u0001"+
		"\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0209\u0001"+
		"\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u020a\u0005"+
		"\t\u0000\u0000\u020a5\u0001\u0000\u0000\u0000\u020b\u020c\u0005T\u0000"+
		"\u0000\u020c\u020d\u0005\r\u0000\u0000\u020d\u020e\u0005U\u0000\u0000"+
		"\u020e\u0211\u0005\b\u0000\u0000\u020f\u0212\u0005h\u0000\u0000\u0210"+
		"\u0212\u00032\u0019\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0210"+
		"\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0214"+
		"\u0005\t\u0000\u0000\u0214\u0215\u0005\u0019\u0000\u0000\u02157\u0001"+
		"\u0000\u0000\u0000\u0216\u0218\u0005)\u0000\u0000\u0217\u0216\u0001\u0000"+
		"\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u021e\u0001\u0000"+
		"\u0000\u0000\u0219\u021f\u00032\u0019\u0000\u021a\u021f\u0005h\u0000\u0000"+
		"\u021b\u021f\u0005g\u0000\u0000\u021c\u021f\u0005j\u0000\u0000\u021d\u021f"+
		"\u0003\u001c\u000e\u0000\u021e\u0219\u0001\u0000\u0000\u0000\u021e\u021a"+
		"\u0001\u0000\u0000\u0000\u021e\u021b\u0001\u0000\u0000\u0000\u021e\u021c"+
		"\u0001\u0000\u0000\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021f\u0221"+
		"\u0001\u0000\u0000\u0000\u0220\u0222\u0005\u0019\u0000\u0000\u0221\u0220"+
		"\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u02229\u0001"+
		"\u0000\u0000\u0000\u0223\u0242\u0003<\u001e\u0000\u0224\u0226\u0003:\u001d"+
		"\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0226\u0229\u0001\u0000\u0000"+
		"\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000"+
		"\u0000\u0228\u0243\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000"+
		"\u0000\u022a\u022c\u0005h\u0000\u0000\u022b\u022d\u0005\f\u0000\u0000"+
		"\u022c\u022b\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000"+
		"\u022d\u0233\u0001\u0000\u0000\u0000\u022e\u0230\u0005j\u0000\u0000\u022f"+
		"\u0231\u0005\f\u0000\u0000\u0230\u022f\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0001\u0000\u0000\u0000\u0231\u0233\u0001\u0000\u0000\u0000\u0232\u022a"+
		"\u0001\u0000\u0000\u0000\u0232\u022e\u0001\u0000\u0000\u0000\u0233\u0236"+
		"\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0234\u0235"+
		"\u0001\u0000\u0000\u0000\u0235\u0237\u0001\u0000\u0000\u0000\u0236\u0234"+
		"\u0001\u0000\u0000\u0000\u0237\u0238\u0005\u0006\u0000\u0000\u0238\u023a"+
		"\u0005\u0006\u0000\u0000\u0239\u023b\u00032\u0019\u0000\u023a\u0239\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u0001"+
		"\u0000\u0000\u0000\u023c\u023d\u0005\u0007\u0000\u0000\u023d\u023e\u0005"+
		"\u0007\u0000\u0000\u023e\u0240\u0001\u0000\u0000\u0000\u023f\u0241\u0005"+
		"\u001a\u0000\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0240\u0241\u0001"+
		"\u0000\u0000\u0000\u0241\u0243\u0001\u0000\u0000\u0000\u0242\u0227\u0001"+
		"\u0000\u0000\u0000\u0242\u0234\u0001\u0000\u0000\u0000\u0243\u0244\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0003>\u001f\u0000\u0245\u0248\u0001\u0000"+
		"\u0000\u0000\u0246\u0248\u0003@ \u0000\u0247\u0223\u0001\u0000\u0000\u0000"+
		"\u0247\u0246\u0001\u0000\u0000\u0000\u0248;\u0001\u0000\u0000\u0000\u0249"+
		"\u024a\u0005=\u0000\u0000\u024a\u0251\u0005c\u0000\u0000\u024b\u0250\u0003"+
		"H$\u0000\u024c\u0250\u0003D\"\u0000\u024d\u0250\u0003B!\u0000\u024e\u0250"+
		"\u0003J%\u0000\u024f\u024b\u0001\u0000\u0000\u0000\u024f\u024c\u0001\u0000"+
		"\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f\u024e\u0001\u0000"+
		"\u0000\u0000\u0250\u0253\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000"+
		"\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0254\u0001\u0000"+
		"\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0254\u0255\u0005>\u0000"+
		"\u0000\u0255=\u0001\u0000\u0000\u0000\u0256\u0257\u0005=\u0000\u0000\u0257"+
		"\u0258\u0005?\u0000\u0000\u0258\u0259\u0005c\u0000\u0000\u0259\u025a\u0005"+
		">\u0000\u0000\u025a?\u0001\u0000\u0000\u0000\u025b\u025c\u0005=\u0000"+
		"\u0000\u025c\u0261\u0005c\u0000\u0000\u025d\u0260\u0003H$\u0000\u025e"+
		"\u0260\u0003F#\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u025f\u025e\u0001"+
		"\u0000\u0000\u0000\u0260\u0263\u0001\u0000\u0000\u0000\u0261\u025f\u0001"+
		"\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0264\u0001"+
		"\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0264\u0265\u0005"+
		"?\u0000\u0000\u0265\u0266\u0005>\u0000\u0000\u0266A\u0001\u0000\u0000"+
		"\u0000\u0267\u0268\u0005\u001b\u0000\u0000\u0268\u0269\u0005\u0001\u0000"+
		"\u0000\u0269\u026a\u0005\u000f\u0000\u0000\u026a\u026b\u0005h\u0000\u0000"+
		"\u026bC\u0001\u0000\u0000\u0000\u026c\u026d\u0005\u001b\u0000\u0000\u026d"+
		"\u026e\u0005\u0002\u0000\u0000\u026e\u026f\u0005\u000f\u0000\u0000\u026f"+
		"\u0270\u0005h\u0000\u0000\u0270E\u0001\u0000\u0000\u0000\u0271\u0272\u0005"+
		"\u0004\u0000\u0000\u0272\u0273\u0005\"\u0000\u0000\u0273\u0274\u0005\u0005"+
		"\u0000\u0000\u0274\u0275\u0005\u000f\u0000\u0000\u0275\u0276\u0005h\u0000"+
		"\u0000\u0276G\u0001\u0000\u0000\u0000\u0277\u0278\u0007\u0007\u0000\u0000"+
		"\u0278\u027a\u0005\u000f\u0000\u0000\u0279\u027b\u0005\u0006\u0000\u0000"+
		"\u027a\u0279\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000"+
		"\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027e\u0003V+\u0000\u027d\u027f"+
		"\u0005\u0007\u0000\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027e\u027f"+
		"\u0001\u0000\u0000\u0000\u027fI\u0001\u0000\u0000\u0000\u0280\u0281\u0005"+
		"\b\u0000\u0000\u0281\u0282\u0005]\u0000\u0000\u0282\u0283\u0005\t\u0000"+
		"\u0000\u0283\u0284\u0005\u000f\u0000\u0000\u0284\u0285\u0005h\u0000\u0000"+
		"\u0285K\u0001\u0000\u0000\u0000\u0286\u0288\u0005\u0006\u0000\u0000\u0287"+
		"\u0286\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288"+
		"\u0289\u0001\u0000\u0000\u0000\u0289\u028a\u0005j\u0000\u0000\u028a\u028b"+
		"\u0005\r\u0000\u0000\u028b\u028d\u0005j\u0000\u0000\u028c\u028e\u0005"+
		"\u0007\u0000\u0000\u028d\u028c\u0001\u0000\u0000\u0000\u028d\u028e\u0001"+
		"\u0000\u0000\u0000\u028eM\u0001\u0000\u0000\u0000\u028f\u0291\u0005\u0006"+
		"\u0000\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000"+
		"\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0294\u0005j\u0000"+
		"\u0000\u0293\u0295\u0005\u0007\u0000\u0000\u0294\u0293\u0001\u0000\u0000"+
		"\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295O\u0001\u0000\u0000\u0000"+
		"\u0296\u0298\u0003T*\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0297\u0298"+
		"\u0001\u0000\u0000\u0000\u0298\u029d\u0001\u0000\u0000\u0000\u0299\u029c"+
		"\u0003R)\u0000\u029a\u029c\u0003H$\u0000\u029b\u0299\u0001\u0000\u0000"+
		"\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029c\u029f\u0001\u0000\u0000"+
		"\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000"+
		"\u0000\u029eQ\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000\u0000"+
		"\u02a0\u02a2\u0005\u001b\u0000\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000"+
		"\u02a3\u02a4\u0005j\u0000\u0000\u02a4\u02a6\u0005\u000f\u0000\u0000\u02a5"+
		"\u02a7\u0005\u0006\u0000\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a6"+
		"\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8"+
		"\u02aa\u0003V+\u0000\u02a9\u02ab\u0005\u0007\u0000\u0000\u02aa\u02a9\u0001"+
		"\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02abS\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ad\u0005j\u0000\u0000\u02adU\u0001\u0000\u0000\u0000"+
		"\u02ae\u02b4\u0003X,\u0000\u02af\u02b4\u0003Z-\u0000\u02b0\u02b1\u0005"+
		"j\u0000\u0000\u02b1\u02b2\u0005\r\u0000\u0000\u02b2\u02b4\u0005j\u0000"+
		"\u0000\u02b3\u02ae\u0001\u0000\u0000\u0000\u02b3\u02af\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b0\u0001\u0000\u0000\u0000\u02b4W\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b6\u0005\u0006\u0000\u0000\u02b6\u02b7\u0003*\u0015\u0000\u02b7"+
		"\u02b8\u0005\u0007\u0000\u0000\u02b8\u02bd\u0001\u0000\u0000\u0000\u02b9"+
		"\u02ba\u0005\u0006\u0000\u0000\u02ba\u02bb\u0005j\u0000\u0000\u02bb\u02bd"+
		"\u0005\u0007\u0000\u0000\u02bc\u02b5\u0001\u0000\u0000\u0000\u02bc\u02b9"+
		"\u0001\u0000\u0000\u0000\u02bdY\u0001\u0000\u0000\u0000\u02be\u02bf\u0007"+
		"\b\u0000\u0000\u02bf[\u0001\u0000\u0000\u0000\u02c0\u02c3\u0005\u0006"+
		"\u0000\u0000\u02c1\u02c4\u0003`0\u0000\u02c2\u02c4\u0003^/\u0000\u02c3"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c4"+
		"\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c6\u0005\u0007\u0000\u0000\u02c6"+
		"]\u0001\u0000\u0000\u0000\u02c7\u02c8\u0005j\u0000\u0000\u02c8\u02c9\u0005"+
		"\u0014\u0000\u0000\u02c9\u02ca\u0005\b\u0000\u0000\u02ca\u02cb\u0003:"+
		"\u001d\u0000\u02cb\u02cc\u0005\t\u0000\u0000\u02cc_\u0001\u0000\u0000"+
		"\u0000\u02cd\u02ce\u0005j\u0000\u0000\u02ce\u02d0\u0005\r\u0000\u0000"+
		"\u02cf\u02cd\u0001\u0000\u0000\u0000\u02d0\u02d3\u0001\u0000\u0000\u0000"+
		"\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000"+
		"\u02d2\u02d4\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d5\u0005a\u0000\u0000\u02d5\u02d6\u0005\b\u0000\u0000\u02d6"+
		"\u02d8\u0005\b\u0000\u0000\u02d7\u02d9\u0003b1\u0000\u02d8\u02d7\u0001"+
		"\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9\u02da\u0001"+
		"\u0000\u0000\u0000\u02da\u02db\u0005\t\u0000\u0000\u02db\u02dc\u0005\u000e"+
		"\u0000\u0000\u02dc\u02dd\u0005\b\u0000\u0000\u02dd\u02de\u0003:\u001d"+
		"\u0000\u02de\u02df\u0005\t\u0000\u0000\u02df\u02e0\u0005\t\u0000\u0000"+
		"\u02e0a\u0001\u0000\u0000\u0000\u02e1\u02e3\u0005j\u0000\u0000\u02e2\u02e4"+
		"\u0005\u0003\u0000\u0000\u02e3\u02e2\u0001\u0000\u0000\u0000\u02e3\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e6\u0001\u0000\u0000\u0000\u02e5\u02e1"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e9\u0001\u0000\u0000\u0000\u02e7\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8c\u0001"+
		"\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02ea\u02ec\u0005"+
		"<\u0000\u0000\u02eb\u02ea\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ec\u02f1\u0001\u0000\u0000\u0000\u02ed\u02f2\u0005j\u0000"+
		"\u0000\u02ee\u02ef\u0005j\u0000\u0000\u02ef\u02f0\u0005\r\u0000\u0000"+
		"\u02f0\u02f2\u0005j\u0000\u0000\u02f1\u02ed\u0001\u0000\u0000\u0000\u02f1"+
		"\u02ee\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3"+
		"\u02ff\u0005\b\u0000\u0000\u02f4\u02f9\u0005j\u0000\u0000\u02f5\u02f9"+
		"\u0005h\u0000\u0000\u02f6\u02f9\u0003\u0018\f\u0000\u02f7\u02f9\u0003"+
		"d2\u0000\u02f8\u02f4\u0001\u0000\u0000\u0000\u02f8\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f8\u02f6\u0001\u0000\u0000\u0000\u02f8\u02f7\u0001\u0000\u0000"+
		"\u0000\u02f9\u02fb\u0001\u0000\u0000\u0000\u02fa\u02fc\u0005\u0003\u0000"+
		"\u0000\u02fb\u02fa\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fe\u0001\u0000\u0000\u0000\u02fd\u02f8\u0001\u0000\u0000"+
		"\u0000\u02fe\u0301\u0001\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000"+
		"\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0302\u0001\u0000\u0000"+
		"\u0000\u0301\u02ff\u0001\u0000\u0000\u0000\u0302\u0303\u0005\t\u0000\u0000"+
		"\u0303\u0304\u0005\u0019\u0000\u0000\u0304e\u0001\u0000\u0000\u0000\u0305"+
		"\u0307\u0007\t\u0000\u0000\u0306\u0305\u0001\u0000\u0000\u0000\u0306\u0307"+
		"\u0001\u0000\u0000\u0000\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u030a"+
		"\u0003h4\u0000\u0309\u0306\u0001\u0000\u0000\u0000\u030a\u030d\u0001\u0000"+
		"\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000"+
		"\u0000\u0000\u030c\u030e\u0001\u0000\u0000\u0000\u030d\u030b\u0001\u0000"+
		"\u0000\u0000\u030e\u0312\u0005\u0006\u0000\u0000\u030f\u0311\u0003j5\u0000"+
		"\u0310\u030f\u0001\u0000\u0000\u0000\u0311\u0314\u0001\u0000\u0000\u0000"+
		"\u0312\u0310\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000"+
		"\u0313\u0315\u0001\u0000\u0000\u0000\u0314\u0312\u0001\u0000\u0000\u0000"+
		"\u0315\u0316\u0005\u0007\u0000\u0000\u0316g\u0001\u0000\u0000\u0000\u0317"+
		"\u031a\u0003T*\u0000\u0318\u0319\u0005\u0010\u0000\u0000\u0319\u031b\u0003"+
		"T*\u0000\u031a\u0318\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000"+
		"\u0000\u031c\u031a\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000"+
		"\u0000\u031d\u0322\u0001\u0000\u0000\u0000\u031e\u0322\u0005j\u0000\u0000"+
		"\u031f\u0322\u0005_\u0000\u0000\u0320\u0322\u0005c\u0000\u0000\u0321\u0317"+
		"\u0001\u0000\u0000\u0000\u0321\u031e\u0001\u0000\u0000\u0000\u0321\u031f"+
		"\u0001\u0000\u0000\u0000\u0321\u0320\u0001\u0000\u0000\u0000\u0322i\u0001"+
		"\u0000\u0000\u0000\u0323\u0324\u0003h4\u0000\u0324\u0331\u0005\f\u0000"+
		"\u0000\u0325\u0332\u0005j\u0000\u0000\u0326\u0328\u0005d\u0000\u0000\u0327"+
		"\u0329\u0005 \u0000\u0000\u0328\u0327\u0001\u0000\u0000\u0000\u0328\u0329"+
		"\u0001\u0000\u0000\u0000\u0329\u032b\u0001\u0000\u0000\u0000\u032a\u0326"+
		"\u0001\u0000\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000\u032c\u032a"+
		"\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000\u0000\u0000\u032d\u0332"+
		"\u0001\u0000\u0000\u0000\u032e\u032f\u0005d\u0000\u0000\u032f\u0332\u0005"+
		"!\u0000\u0000\u0330\u0332\u0003d2\u0000\u0331\u0325\u0001\u0000\u0000"+
		"\u0000\u0331\u032a\u0001\u0000\u0000\u0000\u0331\u032e\u0001\u0000\u0000"+
		"\u0000\u0331\u0330\u0001\u0000\u0000\u0000\u0332\u0334\u0001\u0000\u0000"+
		"\u0000\u0333\u0335\u0005\u0019\u0000\u0000\u0334\u0333\u0001\u0000\u0000"+
		"\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335k\u0001\u0000\u0000\u0000"+
		"\u0336\u0337\u0005$\u0000\u0000\u0337\u0338\u0003T*\u0000\u0338\u033f"+
		"\u0005\u0006\u0000\u0000\u0339\u033b\u0005j\u0000\u0000\u033a\u033c\u0005"+
		"\u0003\u0000\u0000\u033b\u033a\u0001\u0000\u0000\u0000\u033b\u033c\u0001"+
		"\u0000\u0000\u0000\u033c\u033e\u0001\u0000\u0000\u0000\u033d\u0339\u0001"+
		"\u0000\u0000\u0000\u033e\u0341\u0001\u0000\u0000\u0000\u033f\u033d\u0001"+
		"\u0000\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u0342\u0001"+
		"\u0000\u0000\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0342\u0343\u0005"+
		"\u0007\u0000\u0000\u0343m\u0001\u0000\u0000\u0000\u0344\u0345\u0005C\u0000"+
		"\u0000\u0345\u0346\u0003T*\u0000\u0346\u0350\u0005\u0006\u0000\u0000\u0347"+
		"\u0348\u0005j\u0000\u0000\u0348\u034b\u0005\f\u0000\u0000\u0349\u034c"+
		"\u0005D\u0000\u0000\u034a\u034c\u0003&\u0013\u0000\u034b\u0349\u0001\u0000"+
		"\u0000\u0000\u034b\u034a\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000"+
		"\u0000\u0000\u034d\u034f\u0005\u0019\u0000\u0000\u034e\u0347\u0001\u0000"+
		"\u0000\u0000\u034f\u0352\u0001\u0000\u0000\u0000\u0350\u034e\u0001\u0000"+
		"\u0000\u0000\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u0353\u0001\u0000"+
		"\u0000\u0000\u0352\u0350\u0001\u0000\u0000\u0000\u0353\u0354\u0005\u0007"+
		"\u0000\u0000\u0354o\u0001\u0000\u0000\u0000}vx\u007f\u0083\u0087\u008a"+
		"\u008e\u0092\u009d\u00a5\u00af\u00b1\u00c6\u00cd\u00d1\u00eb\u00f7\u00fb"+
		"\u0106\u010b\u010f\u011b\u011f\u0122\u0125\u012a\u0130\u0134\u0138\u013c"+
		"\u013e\u0145\u014f\u0153\u0159\u015d\u0162\u0167\u016a\u016e\u0179\u017c"+
		"\u0182\u018c\u0190\u0194\u0198\u019a\u019f\u01a7\u01b1\u01b5\u01b9\u01bd"+
		"\u01bf\u01c3\u01c7\u01ca\u01d1\u01d4\u01da\u01dc\u01e3\u01e7\u01ee\u01f2"+
		"\u01f5\u01f9\u01ff\u0202\u0206\u0211\u0217\u021e\u0221\u0227\u022c\u0230"+
		"\u0232\u0234\u023a\u0240\u0242\u0247\u024f\u0251\u025f\u0261\u027a\u027e"+
		"\u0287\u028d\u0290\u0294\u0297\u029b\u029d\u02a1\u02a6\u02aa\u02b3\u02bc"+
		"\u02c3\u02d1\u02d8\u02e3\u02e7\u02eb\u02f1\u02f8\u02fb\u02ff\u0306\u030b"+
		"\u0312\u031c\u0321\u0328\u032c\u0331\u0334\u033b\u033f\u034b\u0350";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}