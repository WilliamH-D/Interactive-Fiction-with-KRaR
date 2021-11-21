// Generated from D:/Documents/University/Part II Project/Interactive Fiction with KRaR/src/ProcessInput\EditorGrammar.g4 by ANTLR 4.9.2
package ProcessInput.GrammarFiles;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EditorGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALPHA=1, NUMERIC=2, ALPHANUMERIC=3, WHITESPACE=4, COLON=5, SEMICOLON=6, 
		LB_SQUARE=7, RB_SQUARE=8, LB_SHARP=9, RB_SHARP=10, LB_CURLY=11, RB_CURLY=12, 
		LB_ROUND=13, RB_ROUND=14, QUOTES=15, UNDERSCORE=16, COMMA=17, DOT=18, 
		PLUS=19, MINUS=20, BAR=21, ANDPERSAND=22, TRUE=23, FALSE=24, AND=25, OR=26, 
		NOT=27, STRING=28, ID=29, OBJECT_TAG=30, ROOM_TAG=31, ACTION_TAG=32, FLAG_TAG=33, 
		COND_TAG=34, EFFECT_TAG=35, ID_KEY=36, LOC_KEY=37, NAME_KEY=38, DESC_KEY=39, 
		FLAGS_KEY=40, FLAG_KEY=41, VALUES_KEY=42, VALUE_KEY=43, DIR_KEY=44, ACTION_KEY=45, 
		PRSA_COND=46, PRSO_COND=47, PRSI_COND=48, HERE_COND=49, ANDFLAGS_COND=50, 
		ORFLAGS_COND=51, HAVEITEM_COND=52, HAVEITEMS_COND=53, EQUALS_COND=54, 
		GT_COND=55, LT_COND=56, TELL_EFF=57, GOTO_EFF=58, SETFLAG_EFF=59, REMFLAG_EFF=60, 
		TAKE_EFF=61, PLACE_EFF=62, SET_EFF=63;
	public static final int
		RULE_alpha_numeric = 0, RULE_num_int = 1, RULE_num_float = 2, RULE_number = 3, 
		RULE_bool = 4, RULE_var = 5, RULE_value = 6, RULE_flag = 7, RULE_id_entry = 8, 
		RULE_loc_entry = 9, RULE_name_entry = 10, RULE_desc_entry = 11, RULE_flags_entry = 12, 
		RULE_values_entry = 13, RULE_dir_entry = 14, RULE_action_entry = 15, RULE_global_flag_entry = 16, 
		RULE_flag_val_entry = 17, RULE_object = 18, RULE_room = 19, RULE_action = 20, 
		RULE_global_flag = 21, RULE_action_block = 22, RULE_conditional = 23, 
		RULE_conditions = 24, RULE_effects = 25, RULE_effect_aux = 26, RULE_condition_aux = 27, 
		RULE_prsa_cond = 28, RULE_prso_cond = 29, RULE_prsi_cond = 30, RULE_here_cond = 31, 
		RULE_andflags_cond = 32, RULE_orflags_cond = 33, RULE_haveitem_cond = 34, 
		RULE_haveitems_cond = 35, RULE_equals_cond = 36, RULE_gt_cond = 37, RULE_lt_cond = 38, 
		RULE_condition = 39, RULE_tell_eff = 40, RULE_goto_eff = 41, RULE_setflag_eff = 42, 
		RULE_remflag_eff = 43, RULE_take_eff = 44, RULE_place_eff = 45, RULE_set_eff = 46, 
		RULE_effect = 47, RULE_game_grammar = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"alpha_numeric", "num_int", "num_float", "number", "bool", "var", "value", 
			"flag", "id_entry", "loc_entry", "name_entry", "desc_entry", "flags_entry", 
			"values_entry", "dir_entry", "action_entry", "global_flag_entry", "flag_val_entry", 
			"object", "room", "action", "global_flag", "action_block", "conditional", 
			"conditions", "effects", "effect_aux", "condition_aux", "prsa_cond", 
			"prso_cond", "prsi_cond", "here_cond", "andflags_cond", "orflags_cond", 
			"haveitem_cond", "haveitems_cond", "equals_cond", "gt_cond", "lt_cond", 
			"condition", "tell_eff", "goto_eff", "setflag_eff", "remflag_eff", "take_eff", 
			"place_eff", "set_eff", "effect", "game_grammar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "':'", "';'", "'['", "']'", "'<'", "'>'", 
			"'{'", "'}'", "'('", "')'", "'\"'", "'_'", "','", "'.'", "'+'", "'-'", 
			"'|'", "'&'", "'TRUE'", "'FALSE'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALPHA", "NUMERIC", "ALPHANUMERIC", "WHITESPACE", "COLON", "SEMICOLON", 
			"LB_SQUARE", "RB_SQUARE", "LB_SHARP", "RB_SHARP", "LB_CURLY", "RB_CURLY", 
			"LB_ROUND", "RB_ROUND", "QUOTES", "UNDERSCORE", "COMMA", "DOT", "PLUS", 
			"MINUS", "BAR", "ANDPERSAND", "TRUE", "FALSE", "AND", "OR", "NOT", "STRING", 
			"ID", "OBJECT_TAG", "ROOM_TAG", "ACTION_TAG", "FLAG_TAG", "COND_TAG", 
			"EFFECT_TAG", "ID_KEY", "LOC_KEY", "NAME_KEY", "DESC_KEY", "FLAGS_KEY", 
			"FLAG_KEY", "VALUES_KEY", "VALUE_KEY", "DIR_KEY", "ACTION_KEY", "PRSA_COND", 
			"PRSO_COND", "PRSI_COND", "HERE_COND", "ANDFLAGS_COND", "ORFLAGS_COND", 
			"HAVEITEM_COND", "HAVEITEMS_COND", "EQUALS_COND", "GT_COND", "LT_COND", 
			"TELL_EFF", "GOTO_EFF", "SETFLAG_EFF", "REMFLAG_EFF", "TAKE_EFF", "PLACE_EFF", 
			"SET_EFF"
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
	public String getGrammarFileName() { return "EditorGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EditorGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Alpha_numericContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(EditorGrammarParser.ALPHA, 0); }
		public TerminalNode NUMERIC() { return getToken(EditorGrammarParser.NUMERIC, 0); }
		public TerminalNode ALPHANUMERIC() { return getToken(EditorGrammarParser.ALPHANUMERIC, 0); }
		public Alpha_numericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha_numeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterAlpha_numeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitAlpha_numeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitAlpha_numeric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alpha_numericContext alpha_numeric() throws RecognitionException {
		Alpha_numericContext _localctx = new Alpha_numericContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_alpha_numeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA) | (1L << NUMERIC) | (1L << ALPHANUMERIC))) != 0)) ) {
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

	public static class Num_intContext extends ParserRuleContext {
		public TerminalNode NUMERIC() { return getToken(EditorGrammarParser.NUMERIC, 0); }
		public Num_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterNum_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitNum_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitNum_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_intContext num_int() throws RecognitionException {
		Num_intContext _localctx = new Num_intContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_num_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(NUMERIC);
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

	public static class Num_floatContext extends ParserRuleContext {
		public List<TerminalNode> NUMERIC() { return getTokens(EditorGrammarParser.NUMERIC); }
		public TerminalNode NUMERIC(int i) {
			return getToken(EditorGrammarParser.NUMERIC, i);
		}
		public TerminalNode DOT() { return getToken(EditorGrammarParser.DOT, 0); }
		public Num_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterNum_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitNum_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitNum_float(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_floatContext num_float() throws RecognitionException {
		Num_floatContext _localctx = new Num_floatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_num_float);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(NUMERIC);
				setState(103);
				match(DOT);
				setState(104);
				match(NUMERIC);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(DOT);
				setState(106);
				match(NUMERIC);
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

	public static class NumberContext extends ParserRuleContext {
		public Num_intContext num_int() {
			return getRuleContext(Num_intContext.class,0);
		}
		public Num_floatContext num_float() {
			return getRuleContext(Num_floatContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_number);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				num_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				num_float();
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(EditorGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(EditorGrammarParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class VarContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(EditorGrammarParser.STRING, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC:
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				bool();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode LB_ROUND() { return getToken(EditorGrammarParser.LB_ROUND, 0); }
		public Alpha_numericContext alpha_numeric() {
			return getRuleContext(Alpha_numericContext.class,0);
		}
		public TerminalNode COLON() { return getToken(EditorGrammarParser.COLON, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode RB_ROUND() { return getToken(EditorGrammarParser.RB_ROUND, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(LB_ROUND);
			setState(121);
			alpha_numeric();
			setState(122);
			match(COLON);
			setState(123);
			var();
			setState(124);
			match(RB_ROUND);
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

	public static class FlagContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(EditorGrammarParser.UNDERSCORE, 0); }
		public Alpha_numericContext alpha_numeric() {
			return getRuleContext(Alpha_numericContext.class,0);
		}
		public FlagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterFlag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitFlag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitFlag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlagContext flag() throws RecognitionException {
		FlagContext _localctx = new FlagContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(UNDERSCORE);
			setState(127);
			alpha_numeric();
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

	public static class Id_entryContext extends ParserRuleContext {
		public TerminalNode ID_KEY() { return getToken(EditorGrammarParser.ID_KEY, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Id_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterId_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitId_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitId_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_entryContext id_entry() throws RecognitionException {
		Id_entryContext _localctx = new Id_entryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_id_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(ID_KEY);
			setState(130);
			match(ID);
			setState(131);
			match(SEMICOLON);
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

	public static class Loc_entryContext extends ParserRuleContext {
		public TerminalNode LOC_KEY() { return getToken(EditorGrammarParser.LOC_KEY, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Loc_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loc_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterLoc_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitLoc_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitLoc_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loc_entryContext loc_entry() throws RecognitionException {
		Loc_entryContext _localctx = new Loc_entryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_loc_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(LOC_KEY);
			setState(134);
			match(ID);
			setState(135);
			match(SEMICOLON);
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

	public static class Name_entryContext extends ParserRuleContext {
		public TerminalNode NAME_KEY() { return getToken(EditorGrammarParser.NAME_KEY, 0); }
		public TerminalNode STRING() { return getToken(EditorGrammarParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Name_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterName_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitName_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitName_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_entryContext name_entry() throws RecognitionException {
		Name_entryContext _localctx = new Name_entryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_name_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(NAME_KEY);
			setState(138);
			match(STRING);
			setState(139);
			match(SEMICOLON);
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

	public static class Desc_entryContext extends ParserRuleContext {
		public TerminalNode DESC_KEY() { return getToken(EditorGrammarParser.DESC_KEY, 0); }
		public TerminalNode STRING() { return getToken(EditorGrammarParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Desc_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterDesc_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitDesc_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitDesc_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Desc_entryContext desc_entry() throws RecognitionException {
		Desc_entryContext _localctx = new Desc_entryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_desc_entry);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESC_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(DESC_KEY);
				setState(142);
				match(STRING);
				setState(143);
				match(SEMICOLON);
				}
				break;
			case RB_CURLY:
			case FLAGS_KEY:
			case VALUES_KEY:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Flags_entryContext extends ParserRuleContext {
		public TerminalNode FLAGS_KEY() { return getToken(EditorGrammarParser.FLAGS_KEY, 0); }
		public List<FlagContext> flag() {
			return getRuleContexts(FlagContext.class);
		}
		public FlagContext flag(int i) {
			return getRuleContext(FlagContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Flags_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flags_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterFlags_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitFlags_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitFlags_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flags_entryContext flags_entry() throws RecognitionException {
		Flags_entryContext _localctx = new Flags_entryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_flags_entry);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLAGS_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(FLAGS_KEY);
				setState(148);
				flag();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(149);
					match(COMMA);
					setState(150);
					flag();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(SEMICOLON);
				}
				break;
			case RB_CURLY:
			case VALUES_KEY:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Values_entryContext extends ParserRuleContext {
		public TerminalNode VALUES_KEY() { return getToken(EditorGrammarParser.VALUES_KEY, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Values_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterValues_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitValues_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitValues_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Values_entryContext values_entry() throws RecognitionException {
		Values_entryContext _localctx = new Values_entryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_values_entry);
		int _la;
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(VALUES_KEY);
				setState(162);
				value();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(163);
					match(COMMA);
					setState(164);
					value();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170);
				match(SEMICOLON);
				}
				break;
			case RB_CURLY:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Dir_entryContext extends ParserRuleContext {
		public List<TerminalNode> DIR_KEY() { return getTokens(EditorGrammarParser.DIR_KEY); }
		public TerminalNode DIR_KEY(int i) {
			return getToken(EditorGrammarParser.DIR_KEY, i);
		}
		public List<TerminalNode> ID() { return getTokens(EditorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EditorGrammarParser.ID, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(EditorGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(EditorGrammarParser.SEMICOLON, i);
		}
		public Dir_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dir_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterDir_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitDir_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitDir_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dir_entryContext dir_entry() throws RecognitionException {
		Dir_entryContext _localctx = new Dir_entryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dir_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(DIR_KEY);
			setState(176);
			match(ID);
			setState(177);
			match(SEMICOLON);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIR_KEY) {
				{
				{
				setState(178);
				match(DIR_KEY);
				setState(179);
				match(ID);
				setState(180);
				match(SEMICOLON);
				}
				}
				setState(185);
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

	public static class Action_entryContext extends ParserRuleContext {
		public TerminalNode ACTION_KEY() { return getToken(EditorGrammarParser.ACTION_KEY, 0); }
		public Action_blockContext action_block() {
			return getRuleContext(Action_blockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Action_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterAction_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitAction_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitAction_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_entryContext action_entry() throws RecognitionException {
		Action_entryContext _localctx = new Action_entryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_action_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ACTION_KEY);
			setState(187);
			action_block();
			setState(188);
			match(SEMICOLON);
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

	public static class Global_flag_entryContext extends ParserRuleContext {
		public TerminalNode FLAG_KEY() { return getToken(EditorGrammarParser.FLAG_KEY, 0); }
		public FlagContext flag() {
			return getRuleContext(FlagContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Global_flag_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_flag_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterGlobal_flag_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitGlobal_flag_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitGlobal_flag_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_flag_entryContext global_flag_entry() throws RecognitionException {
		Global_flag_entryContext _localctx = new Global_flag_entryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_global_flag_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(FLAG_KEY);
			setState(191);
			flag();
			setState(192);
			match(SEMICOLON);
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

	public static class Flag_val_entryContext extends ParserRuleContext {
		public TerminalNode VALUE_KEY() { return getToken(EditorGrammarParser.VALUE_KEY, 0); }
		public Num_intContext num_int() {
			return getRuleContext(Num_intContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Flag_val_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flag_val_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterFlag_val_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitFlag_val_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitFlag_val_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flag_val_entryContext flag_val_entry() throws RecognitionException {
		Flag_val_entryContext _localctx = new Flag_val_entryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_flag_val_entry);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(VALUE_KEY);
				setState(195);
				num_int();
				setState(196);
				match(SEMICOLON);
				}
				break;
			case RB_CURLY:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode OBJECT_TAG() { return getToken(EditorGrammarParser.OBJECT_TAG, 0); }
		public TerminalNode LB_CURLY() { return getToken(EditorGrammarParser.LB_CURLY, 0); }
		public Id_entryContext id_entry() {
			return getRuleContext(Id_entryContext.class,0);
		}
		public Loc_entryContext loc_entry() {
			return getRuleContext(Loc_entryContext.class,0);
		}
		public Name_entryContext name_entry() {
			return getRuleContext(Name_entryContext.class,0);
		}
		public Desc_entryContext desc_entry() {
			return getRuleContext(Desc_entryContext.class,0);
		}
		public Flags_entryContext flags_entry() {
			return getRuleContext(Flags_entryContext.class,0);
		}
		public Values_entryContext values_entry() {
			return getRuleContext(Values_entryContext.class,0);
		}
		public TerminalNode RB_CURLY() { return getToken(EditorGrammarParser.RB_CURLY, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(OBJECT_TAG);
			setState(202);
			match(LB_CURLY);
			setState(203);
			id_entry();
			setState(204);
			loc_entry();
			setState(205);
			name_entry();
			setState(206);
			desc_entry();
			setState(207);
			flags_entry();
			setState(208);
			values_entry();
			setState(209);
			match(RB_CURLY);
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

	public static class RoomContext extends ParserRuleContext {
		public TerminalNode ROOM_TAG() { return getToken(EditorGrammarParser.ROOM_TAG, 0); }
		public TerminalNode LB_CURLY() { return getToken(EditorGrammarParser.LB_CURLY, 0); }
		public Id_entryContext id_entry() {
			return getRuleContext(Id_entryContext.class,0);
		}
		public Dir_entryContext dir_entry() {
			return getRuleContext(Dir_entryContext.class,0);
		}
		public Name_entryContext name_entry() {
			return getRuleContext(Name_entryContext.class,0);
		}
		public Desc_entryContext desc_entry() {
			return getRuleContext(Desc_entryContext.class,0);
		}
		public TerminalNode RB_CURLY() { return getToken(EditorGrammarParser.RB_CURLY, 0); }
		public RoomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_room; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterRoom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitRoom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitRoom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomContext room() throws RecognitionException {
		RoomContext _localctx = new RoomContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_room);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(ROOM_TAG);
			setState(212);
			match(LB_CURLY);
			setState(213);
			id_entry();
			setState(214);
			dir_entry();
			setState(215);
			name_entry();
			setState(216);
			desc_entry();
			setState(217);
			match(RB_CURLY);
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

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode ACTION_TAG() { return getToken(EditorGrammarParser.ACTION_TAG, 0); }
		public TerminalNode LB_CURLY() { return getToken(EditorGrammarParser.LB_CURLY, 0); }
		public Id_entryContext id_entry() {
			return getRuleContext(Id_entryContext.class,0);
		}
		public Action_entryContext action_entry() {
			return getRuleContext(Action_entryContext.class,0);
		}
		public TerminalNode RB_CURLY() { return getToken(EditorGrammarParser.RB_CURLY, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(ACTION_TAG);
			setState(220);
			match(LB_CURLY);
			setState(221);
			id_entry();
			setState(222);
			action_entry();
			setState(223);
			match(RB_CURLY);
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

	public static class Global_flagContext extends ParserRuleContext {
		public TerminalNode FLAG_TAG() { return getToken(EditorGrammarParser.FLAG_TAG, 0); }
		public TerminalNode LB_CURLY() { return getToken(EditorGrammarParser.LB_CURLY, 0); }
		public Global_flag_entryContext global_flag_entry() {
			return getRuleContext(Global_flag_entryContext.class,0);
		}
		public Flag_val_entryContext flag_val_entry() {
			return getRuleContext(Flag_val_entryContext.class,0);
		}
		public TerminalNode RB_CURLY() { return getToken(EditorGrammarParser.RB_CURLY, 0); }
		public Global_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterGlobal_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitGlobal_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitGlobal_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_flagContext global_flag() throws RecognitionException {
		Global_flagContext _localctx = new Global_flagContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_global_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(FLAG_TAG);
			setState(226);
			match(LB_CURLY);
			setState(227);
			global_flag_entry();
			setState(228);
			flag_val_entry();
			setState(229);
			match(RB_CURLY);
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

	public static class Action_blockContext extends ParserRuleContext {
		public EffectsContext effects() {
			return getRuleContext(EffectsContext.class,0);
		}
		public Action_blockContext action_block() {
			return getRuleContext(Action_blockContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Action_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterAction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitAction_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitAction_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_blockContext action_block() throws RecognitionException {
		Action_blockContext _localctx = new Action_blockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_action_block);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				effects();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				effects();
				setState(233);
				action_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				conditional();
				setState(237);
				action_block();
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode COND_TAG() { return getToken(EditorGrammarParser.COND_TAG, 0); }
		public TerminalNode LB_SHARP() { return getToken(EditorGrammarParser.LB_SHARP, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode RB_SHARP() { return getToken(EditorGrammarParser.RB_SHARP, 0); }
		public TerminalNode LB_CURLY() { return getToken(EditorGrammarParser.LB_CURLY, 0); }
		public Action_blockContext action_block() {
			return getRuleContext(Action_blockContext.class,0);
		}
		public TerminalNode RB_CURLY() { return getToken(EditorGrammarParser.RB_CURLY, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(COND_TAG);
			setState(242);
			match(LB_SHARP);
			setState(243);
			conditions();
			setState(244);
			match(RB_SHARP);
			setState(245);
			match(LB_CURLY);
			setState(246);
			action_block();
			setState(247);
			match(RB_CURLY);
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

	public static class ConditionsContext extends ParserRuleContext {
		public Condition_auxContext condition_aux() {
			return getRuleContext(Condition_auxContext.class,0);
		}
		public TerminalNode AND() { return getToken(EditorGrammarParser.AND, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode OR() { return getToken(EditorGrammarParser.OR, 0); }
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conditions);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				condition_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				condition_aux();
				setState(251);
				match(AND);
				setState(252);
				conditions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				condition_aux();
				setState(255);
				match(OR);
				setState(256);
				conditions();
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

	public static class EffectsContext extends ParserRuleContext {
		public Effect_auxContext effect_aux() {
			return getRuleContext(Effect_auxContext.class,0);
		}
		public EffectsContext effects() {
			return getRuleContext(EffectsContext.class,0);
		}
		public EffectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterEffects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitEffects(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitEffects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectsContext effects() throws RecognitionException {
		EffectsContext _localctx = new EffectsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_effects);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				effect_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				effect_aux();
				setState(262);
				effects();
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

	public static class Effect_auxContext extends ParserRuleContext {
		public TerminalNode EFFECT_TAG() { return getToken(EditorGrammarParser.EFFECT_TAG, 0); }
		public TerminalNode LB_SHARP() { return getToken(EditorGrammarParser.LB_SHARP, 0); }
		public EffectContext effect() {
			return getRuleContext(EffectContext.class,0);
		}
		public TerminalNode RB_SHARP() { return getToken(EditorGrammarParser.RB_SHARP, 0); }
		public Effect_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterEffect_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitEffect_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitEffect_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Effect_auxContext effect_aux() throws RecognitionException {
		Effect_auxContext _localctx = new Effect_auxContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_effect_aux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(EFFECT_TAG);
			setState(267);
			match(LB_SHARP);
			setState(268);
			effect();
			setState(269);
			match(RB_SHARP);
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

	public static class Condition_auxContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(EditorGrammarParser.NOT, 0); }
		public Condition_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterCondition_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitCondition_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitCondition_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_auxContext condition_aux() throws RecognitionException {
		Condition_auxContext _localctx = new Condition_auxContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condition_aux);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRSA_COND:
			case PRSO_COND:
			case PRSI_COND:
			case HERE_COND:
			case ANDFLAGS_COND:
			case ORFLAGS_COND:
			case HAVEITEM_COND:
			case HAVEITEMS_COND:
			case EQUALS_COND:
			case GT_COND:
			case LT_COND:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				condition();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(NOT);
				setState(273);
				condition();
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

	public static class Prsa_condContext extends ParserRuleContext {
		public TerminalNode PRSA_COND() { return getToken(EditorGrammarParser.PRSA_COND, 0); }
		public List<TerminalNode> ALPHA() { return getTokens(EditorGrammarParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(EditorGrammarParser.ALPHA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Prsa_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prsa_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterPrsa_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitPrsa_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitPrsa_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prsa_condContext prsa_cond() throws RecognitionException {
		Prsa_condContext _localctx = new Prsa_condContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_prsa_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(PRSA_COND);
			setState(277);
			match(ALPHA);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(278);
				match(COMMA);
				setState(279);
				match(ALPHA);
				}
				}
				setState(284);
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

	public static class Prso_condContext extends ParserRuleContext {
		public TerminalNode PRSO_COND() { return getToken(EditorGrammarParser.PRSO_COND, 0); }
		public List<TerminalNode> ID() { return getTokens(EditorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EditorGrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Prso_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prso_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterPrso_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitPrso_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitPrso_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prso_condContext prso_cond() throws RecognitionException {
		Prso_condContext _localctx = new Prso_condContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_prso_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(PRSO_COND);
			setState(286);
			match(ID);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(287);
				match(COMMA);
				setState(288);
				match(ID);
				}
				}
				setState(293);
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

	public static class Prsi_condContext extends ParserRuleContext {
		public TerminalNode PRSI_COND() { return getToken(EditorGrammarParser.PRSI_COND, 0); }
		public List<TerminalNode> ID() { return getTokens(EditorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EditorGrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Prsi_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prsi_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterPrsi_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitPrsi_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitPrsi_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prsi_condContext prsi_cond() throws RecognitionException {
		Prsi_condContext _localctx = new Prsi_condContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_prsi_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(PRSI_COND);
			setState(295);
			match(ID);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(296);
				match(COMMA);
				setState(297);
				match(ID);
				}
				}
				setState(302);
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

	public static class Here_condContext extends ParserRuleContext {
		public TerminalNode HERE_COND() { return getToken(EditorGrammarParser.HERE_COND, 0); }
		public List<TerminalNode> ID() { return getTokens(EditorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EditorGrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Here_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_here_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterHere_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitHere_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitHere_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Here_condContext here_cond() throws RecognitionException {
		Here_condContext _localctx = new Here_condContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_here_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(HERE_COND);
			setState(304);
			match(ID);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(305);
				match(COMMA);
				setState(306);
				match(ID);
				}
				}
				setState(311);
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

	public static class Andflags_condContext extends ParserRuleContext {
		public TerminalNode ANDFLAGS_COND() { return getToken(EditorGrammarParser.ANDFLAGS_COND, 0); }
		public List<FlagContext> flag() {
			return getRuleContexts(FlagContext.class);
		}
		public FlagContext flag(int i) {
			return getRuleContext(FlagContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Andflags_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andflags_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterAndflags_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitAndflags_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitAndflags_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Andflags_condContext andflags_cond() throws RecognitionException {
		Andflags_condContext _localctx = new Andflags_condContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_andflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(ANDFLAGS_COND);
			setState(313);
			flag();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(314);
				match(COMMA);
				setState(315);
				flag();
				}
				}
				setState(320);
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

	public static class Orflags_condContext extends ParserRuleContext {
		public TerminalNode ORFLAGS_COND() { return getToken(EditorGrammarParser.ORFLAGS_COND, 0); }
		public List<FlagContext> flag() {
			return getRuleContexts(FlagContext.class);
		}
		public FlagContext flag(int i) {
			return getRuleContext(FlagContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Orflags_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orflags_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterOrflags_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitOrflags_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitOrflags_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orflags_condContext orflags_cond() throws RecognitionException {
		Orflags_condContext _localctx = new Orflags_condContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_orflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(ORFLAGS_COND);
			setState(322);
			flag();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(323);
				match(COMMA);
				setState(324);
				flag();
				}
				}
				setState(329);
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

	public static class Haveitem_condContext extends ParserRuleContext {
		public TerminalNode HAVEITEM_COND() { return getToken(EditorGrammarParser.HAVEITEM_COND, 0); }
		public List<TerminalNode> ID() { return getTokens(EditorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EditorGrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Haveitem_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haveitem_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterHaveitem_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitHaveitem_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitHaveitem_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Haveitem_condContext haveitem_cond() throws RecognitionException {
		Haveitem_condContext _localctx = new Haveitem_condContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_haveitem_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(HAVEITEM_COND);
			setState(331);
			match(ID);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(332);
				match(COMMA);
				setState(333);
				match(ID);
				}
				}
				setState(338);
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

	public static class Haveitems_condContext extends ParserRuleContext {
		public TerminalNode HAVEITEMS_COND() { return getToken(EditorGrammarParser.HAVEITEMS_COND, 0); }
		public List<TerminalNode> ID() { return getTokens(EditorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EditorGrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Haveitems_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haveitems_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterHaveitems_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitHaveitems_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitHaveitems_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Haveitems_condContext haveitems_cond() throws RecognitionException {
		Haveitems_condContext _localctx = new Haveitems_condContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_haveitems_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(HAVEITEMS_COND);
			setState(340);
			match(ID);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(341);
				match(COMMA);
				setState(342);
				match(ID);
				}
				}
				setState(347);
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

	public static class Equals_condContext extends ParserRuleContext {
		public TerminalNode EQUALS_COND() { return getToken(EditorGrammarParser.EQUALS_COND, 0); }
		public List<Alpha_numericContext> alpha_numeric() {
			return getRuleContexts(Alpha_numericContext.class);
		}
		public Alpha_numericContext alpha_numeric(int i) {
			return getRuleContext(Alpha_numericContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(EditorGrammarParser.COMMA, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Equals_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterEquals_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitEquals_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitEquals_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equals_condContext equals_cond() throws RecognitionException {
		Equals_condContext _localctx = new Equals_condContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_equals_cond);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(EQUALS_COND);
				setState(349);
				alpha_numeric();
				setState(350);
				match(COMMA);
				setState(351);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(EQUALS_COND);
				setState(354);
				alpha_numeric();
				setState(355);
				match(COMMA);
				setState(356);
				alpha_numeric();
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

	public static class Gt_condContext extends ParserRuleContext {
		public TerminalNode GT_COND() { return getToken(EditorGrammarParser.GT_COND, 0); }
		public List<Alpha_numericContext> alpha_numeric() {
			return getRuleContexts(Alpha_numericContext.class);
		}
		public Alpha_numericContext alpha_numeric(int i) {
			return getRuleContext(Alpha_numericContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(EditorGrammarParser.COMMA, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Gt_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gt_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterGt_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitGt_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitGt_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gt_condContext gt_cond() throws RecognitionException {
		Gt_condContext _localctx = new Gt_condContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_gt_cond);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(GT_COND);
				setState(361);
				alpha_numeric();
				setState(362);
				match(COMMA);
				setState(363);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(GT_COND);
				setState(366);
				alpha_numeric();
				setState(367);
				match(COMMA);
				setState(368);
				alpha_numeric();
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

	public static class Lt_condContext extends ParserRuleContext {
		public TerminalNode LT_COND() { return getToken(EditorGrammarParser.LT_COND, 0); }
		public List<Alpha_numericContext> alpha_numeric() {
			return getRuleContexts(Alpha_numericContext.class);
		}
		public Alpha_numericContext alpha_numeric(int i) {
			return getRuleContext(Alpha_numericContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(EditorGrammarParser.COMMA, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Lt_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lt_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterLt_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitLt_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitLt_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lt_condContext lt_cond() throws RecognitionException {
		Lt_condContext _localctx = new Lt_condContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_lt_cond);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(LT_COND);
				setState(373);
				alpha_numeric();
				setState(374);
				match(COMMA);
				setState(375);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(LT_COND);
				setState(378);
				alpha_numeric();
				setState(379);
				match(COMMA);
				setState(380);
				alpha_numeric();
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

	public static class ConditionContext extends ParserRuleContext {
		public Prsa_condContext prsa_cond() {
			return getRuleContext(Prsa_condContext.class,0);
		}
		public Prso_condContext prso_cond() {
			return getRuleContext(Prso_condContext.class,0);
		}
		public Prsi_condContext prsi_cond() {
			return getRuleContext(Prsi_condContext.class,0);
		}
		public Here_condContext here_cond() {
			return getRuleContext(Here_condContext.class,0);
		}
		public Andflags_condContext andflags_cond() {
			return getRuleContext(Andflags_condContext.class,0);
		}
		public Orflags_condContext orflags_cond() {
			return getRuleContext(Orflags_condContext.class,0);
		}
		public Haveitem_condContext haveitem_cond() {
			return getRuleContext(Haveitem_condContext.class,0);
		}
		public Haveitems_condContext haveitems_cond() {
			return getRuleContext(Haveitems_condContext.class,0);
		}
		public Equals_condContext equals_cond() {
			return getRuleContext(Equals_condContext.class,0);
		}
		public Gt_condContext gt_cond() {
			return getRuleContext(Gt_condContext.class,0);
		}
		public Lt_condContext lt_cond() {
			return getRuleContext(Lt_condContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_condition);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRSA_COND:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				prsa_cond();
				}
				break;
			case PRSO_COND:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				prso_cond();
				}
				break;
			case PRSI_COND:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				prsi_cond();
				}
				break;
			case HERE_COND:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				here_cond();
				}
				break;
			case ANDFLAGS_COND:
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				andflags_cond();
				}
				break;
			case ORFLAGS_COND:
				enterOuterAlt(_localctx, 6);
				{
				setState(389);
				orflags_cond();
				}
				break;
			case HAVEITEM_COND:
				enterOuterAlt(_localctx, 7);
				{
				setState(390);
				haveitem_cond();
				}
				break;
			case HAVEITEMS_COND:
				enterOuterAlt(_localctx, 8);
				{
				setState(391);
				haveitems_cond();
				}
				break;
			case EQUALS_COND:
				enterOuterAlt(_localctx, 9);
				{
				setState(392);
				equals_cond();
				}
				break;
			case GT_COND:
				enterOuterAlt(_localctx, 10);
				{
				setState(393);
				gt_cond();
				}
				break;
			case LT_COND:
				enterOuterAlt(_localctx, 11);
				{
				setState(394);
				lt_cond();
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

	public static class Tell_effContext extends ParserRuleContext {
		public TerminalNode TELL_EFF() { return getToken(EditorGrammarParser.TELL_EFF, 0); }
		public TerminalNode STRING() { return getToken(EditorGrammarParser.STRING, 0); }
		public Tell_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tell_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterTell_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitTell_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitTell_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tell_effContext tell_eff() throws RecognitionException {
		Tell_effContext _localctx = new Tell_effContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tell_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(TELL_EFF);
			setState(398);
			match(STRING);
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

	public static class Goto_effContext extends ParserRuleContext {
		public TerminalNode GOTO_EFF() { return getToken(EditorGrammarParser.GOTO_EFF, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public Goto_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterGoto_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitGoto_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitGoto_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Goto_effContext goto_eff() throws RecognitionException {
		Goto_effContext _localctx = new Goto_effContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_goto_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(GOTO_EFF);
			setState(401);
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

	public static class Setflag_effContext extends ParserRuleContext {
		public TerminalNode SETFLAG_EFF() { return getToken(EditorGrammarParser.SETFLAG_EFF, 0); }
		public FlagContext flag() {
			return getRuleContext(FlagContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(EditorGrammarParser.COMMA, 0); }
		public Num_intContext num_int() {
			return getRuleContext(Num_intContext.class,0);
		}
		public Setflag_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setflag_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterSetflag_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitSetflag_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitSetflag_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setflag_effContext setflag_eff() throws RecognitionException {
		Setflag_effContext _localctx = new Setflag_effContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_setflag_eff);
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(SETFLAG_EFF);
				setState(404);
				flag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(SETFLAG_EFF);
				setState(406);
				flag();
				setState(407);
				match(COMMA);
				setState(408);
				num_int();
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

	public static class Remflag_effContext extends ParserRuleContext {
		public TerminalNode REMFLAG_EFF() { return getToken(EditorGrammarParser.REMFLAG_EFF, 0); }
		public FlagContext flag() {
			return getRuleContext(FlagContext.class,0);
		}
		public Remflag_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remflag_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterRemflag_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitRemflag_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitRemflag_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Remflag_effContext remflag_eff() throws RecognitionException {
		Remflag_effContext _localctx = new Remflag_effContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_remflag_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(REMFLAG_EFF);
			setState(413);
			flag();
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

	public static class Take_effContext extends ParserRuleContext {
		public TerminalNode TAKE_EFF() { return getToken(EditorGrammarParser.TAKE_EFF, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public Take_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_take_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterTake_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitTake_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitTake_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Take_effContext take_eff() throws RecognitionException {
		Take_effContext _localctx = new Take_effContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_take_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(TAKE_EFF);
			setState(416);
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

	public static class Place_effContext extends ParserRuleContext {
		public TerminalNode PLACE_EFF() { return getToken(EditorGrammarParser.PLACE_EFF, 0); }
		public List<TerminalNode> ID() { return getTokens(EditorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EditorGrammarParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(EditorGrammarParser.COMMA, 0); }
		public Place_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_place_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterPlace_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitPlace_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitPlace_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Place_effContext place_eff() throws RecognitionException {
		Place_effContext _localctx = new Place_effContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_place_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(PLACE_EFF);
			setState(419);
			match(ID);
			setState(420);
			match(COMMA);
			setState(421);
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

	public static class Set_effContext extends ParserRuleContext {
		public TerminalNode SET_EFF() { return getToken(EditorGrammarParser.SET_EFF, 0); }
		public Alpha_numericContext alpha_numeric() {
			return getRuleContext(Alpha_numericContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(EditorGrammarParser.COMMA, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Set_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterSet_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitSet_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitSet_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_effContext set_eff() throws RecognitionException {
		Set_effContext _localctx = new Set_effContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_set_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(SET_EFF);
			setState(424);
			alpha_numeric();
			setState(425);
			match(COMMA);
			setState(426);
			var();
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

	public static class EffectContext extends ParserRuleContext {
		public Tell_effContext tell_eff() {
			return getRuleContext(Tell_effContext.class,0);
		}
		public Goto_effContext goto_eff() {
			return getRuleContext(Goto_effContext.class,0);
		}
		public Setflag_effContext setflag_eff() {
			return getRuleContext(Setflag_effContext.class,0);
		}
		public Remflag_effContext remflag_eff() {
			return getRuleContext(Remflag_effContext.class,0);
		}
		public Take_effContext take_eff() {
			return getRuleContext(Take_effContext.class,0);
		}
		public Place_effContext place_eff() {
			return getRuleContext(Place_effContext.class,0);
		}
		public Set_effContext set_eff() {
			return getRuleContext(Set_effContext.class,0);
		}
		public EffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectContext effect() throws RecognitionException {
		EffectContext _localctx = new EffectContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_effect);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TELL_EFF:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				tell_eff();
				}
				break;
			case GOTO_EFF:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				goto_eff();
				}
				break;
			case SETFLAG_EFF:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				setflag_eff();
				}
				break;
			case REMFLAG_EFF:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				remflag_eff();
				}
				break;
			case TAKE_EFF:
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				take_eff();
				}
				break;
			case PLACE_EFF:
				enterOuterAlt(_localctx, 6);
				{
				setState(433);
				place_eff();
				}
				break;
			case SET_EFF:
				enterOuterAlt(_localctx, 7);
				{
				setState(434);
				set_eff();
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

	public static class Game_grammarContext extends ParserRuleContext {
		public List<RoomContext> room() {
			return getRuleContexts(RoomContext.class);
		}
		public RoomContext room(int i) {
			return getRuleContext(RoomContext.class,i);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public List<Global_flagContext> global_flag() {
			return getRuleContexts(Global_flagContext.class);
		}
		public Global_flagContext global_flag(int i) {
			return getRuleContext(Global_flagContext.class,i);
		}
		public Game_grammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_game_grammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterGame_grammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitGame_grammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitGame_grammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Game_grammarContext game_grammar() throws RecognitionException {
		Game_grammarContext _localctx = new Game_grammarContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_game_grammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			room();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECT_TAG) | (1L << ROOM_TAG) | (1L << ACTION_TAG) | (1L << FLAG_TAG))) != 0)) {
				{
				setState(442);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ROOM_TAG:
					{
					setState(438);
					room();
					}
					break;
				case OBJECT_TAG:
					{
					setState(439);
					object();
					}
					break;
				case ACTION_TAG:
					{
					setState(440);
					action();
					}
					break;
				case FLAG_TAG:
					{
					setState(441);
					global_flag();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(446);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u01c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\5\5r\n\5\3\6\3\6\3\7\3\7\3\7\5\7y"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0094\n\r\3\16\3\16\3\16\3\16"+
		"\7\16\u009a\n\16\f\16\16\16\u009d\13\16\3\16\3\16\3\16\5\16\u00a2\n\16"+
		"\3\17\3\17\3\17\3\17\7\17\u00a8\n\17\f\17\16\17\u00ab\13\17\3\17\3\17"+
		"\3\17\5\17\u00b0\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00b8\n\20\f"+
		"\20\16\20\u00bb\13\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00ca\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u00f2\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0105\n\32\3\33\3\33\3\33"+
		"\3\33\5\33\u010b\n\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\5\35\u0115"+
		"\n\35\3\36\3\36\3\36\3\36\7\36\u011b\n\36\f\36\16\36\u011e\13\36\3\37"+
		"\3\37\3\37\3\37\7\37\u0124\n\37\f\37\16\37\u0127\13\37\3 \3 \3 \3 \7 "+
		"\u012d\n \f \16 \u0130\13 \3!\3!\3!\3!\7!\u0136\n!\f!\16!\u0139\13!\3"+
		"\"\3\"\3\"\3\"\7\"\u013f\n\"\f\"\16\"\u0142\13\"\3#\3#\3#\3#\7#\u0148"+
		"\n#\f#\16#\u014b\13#\3$\3$\3$\3$\7$\u0151\n$\f$\16$\u0154\13$\3%\3%\3"+
		"%\3%\7%\u015a\n%\f%\16%\u015d\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0169"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0175\n\'\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\5(\u0181\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u018e"+
		"\n)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\5,\u019d\n,\3-\3-\3-\3.\3."+
		"\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\5\61\u01b6\n\61\3\62\3\62\3\62\3\62\3\62\7\62\u01bd\n\62\f\62"+
		"\16\62\u01c0\13\62\3\62\2\2\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\4\3\2\3\5\3\2\31\32\2\u01c2"+
		"\2d\3\2\2\2\4f\3\2\2\2\6m\3\2\2\2\bq\3\2\2\2\ns\3\2\2\2\fx\3\2\2\2\16"+
		"z\3\2\2\2\20\u0080\3\2\2\2\22\u0083\3\2\2\2\24\u0087\3\2\2\2\26\u008b"+
		"\3\2\2\2\30\u0093\3\2\2\2\32\u00a1\3\2\2\2\34\u00af\3\2\2\2\36\u00b1\3"+
		"\2\2\2 \u00bc\3\2\2\2\"\u00c0\3\2\2\2$\u00c9\3\2\2\2&\u00cb\3\2\2\2(\u00d5"+
		"\3\2\2\2*\u00dd\3\2\2\2,\u00e3\3\2\2\2.\u00f1\3\2\2\2\60\u00f3\3\2\2\2"+
		"\62\u0104\3\2\2\2\64\u010a\3\2\2\2\66\u010c\3\2\2\28\u0114\3\2\2\2:\u0116"+
		"\3\2\2\2<\u011f\3\2\2\2>\u0128\3\2\2\2@\u0131\3\2\2\2B\u013a\3\2\2\2D"+
		"\u0143\3\2\2\2F\u014c\3\2\2\2H\u0155\3\2\2\2J\u0168\3\2\2\2L\u0174\3\2"+
		"\2\2N\u0180\3\2\2\2P\u018d\3\2\2\2R\u018f\3\2\2\2T\u0192\3\2\2\2V\u019c"+
		"\3\2\2\2X\u019e\3\2\2\2Z\u01a1\3\2\2\2\\\u01a4\3\2\2\2^\u01a9\3\2\2\2"+
		"`\u01b5\3\2\2\2b\u01b7\3\2\2\2de\t\2\2\2e\3\3\2\2\2fg\7\4\2\2g\5\3\2\2"+
		"\2hi\7\4\2\2ij\7\24\2\2jn\7\4\2\2kl\7\24\2\2ln\7\4\2\2mh\3\2\2\2mk\3\2"+
		"\2\2n\7\3\2\2\2or\5\4\3\2pr\5\6\4\2qo\3\2\2\2qp\3\2\2\2r\t\3\2\2\2st\t"+
		"\3\2\2t\13\3\2\2\2uy\5\b\5\2vy\7\36\2\2wy\5\n\6\2xu\3\2\2\2xv\3\2\2\2"+
		"xw\3\2\2\2y\r\3\2\2\2z{\7\17\2\2{|\5\2\2\2|}\7\7\2\2}~\5\f\7\2~\177\7"+
		"\20\2\2\177\17\3\2\2\2\u0080\u0081\7\22\2\2\u0081\u0082\5\2\2\2\u0082"+
		"\21\3\2\2\2\u0083\u0084\7&\2\2\u0084\u0085\7\37\2\2\u0085\u0086\7\b\2"+
		"\2\u0086\23\3\2\2\2\u0087\u0088\7\'\2\2\u0088\u0089\7\37\2\2\u0089\u008a"+
		"\7\b\2\2\u008a\25\3\2\2\2\u008b\u008c\7(\2\2\u008c\u008d\7\36\2\2\u008d"+
		"\u008e\7\b\2\2\u008e\27\3\2\2\2\u008f\u0090\7)\2\2\u0090\u0091\7\36\2"+
		"\2\u0091\u0094\7\b\2\2\u0092\u0094\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0092"+
		"\3\2\2\2\u0094\31\3\2\2\2\u0095\u0096\7*\2\2\u0096\u009b\5\20\t\2\u0097"+
		"\u0098\7\23\2\2\u0098\u009a\5\20\t\2\u0099\u0097\3\2\2\2\u009a\u009d\3"+
		"\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u009f\7\b\2\2\u009f\u00a2\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u0095\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\33\3\2\2\2\u00a3\u00a4"+
		"\7,\2\2\u00a4\u00a9\5\16\b\2\u00a5\u00a6\7\23\2\2\u00a6\u00a8\5\16\b\2"+
		"\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\b\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00a3\3\2\2\2\u00af\u00ae\3\2"+
		"\2\2\u00b0\35\3\2\2\2\u00b1\u00b2\7.\2\2\u00b2\u00b3\7\37\2\2\u00b3\u00b9"+
		"\7\b\2\2\u00b4\u00b5\7.\2\2\u00b5\u00b6\7\37\2\2\u00b6\u00b8\7\b\2\2\u00b7"+
		"\u00b4\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\37\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd\u00be"+
		"\5.\30\2\u00be\u00bf\7\b\2\2\u00bf!\3\2\2\2\u00c0\u00c1\7+\2\2\u00c1\u00c2"+
		"\5\20\t\2\u00c2\u00c3\7\b\2\2\u00c3#\3\2\2\2\u00c4\u00c5\7-\2\2\u00c5"+
		"\u00c6\5\4\3\2\u00c6\u00c7\7\b\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00ca\3\2"+
		"\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca%\3\2\2\2\u00cb\u00cc"+
		"\7 \2\2\u00cc\u00cd\7\r\2\2\u00cd\u00ce\5\22\n\2\u00ce\u00cf\5\24\13\2"+
		"\u00cf\u00d0\5\26\f\2\u00d0\u00d1\5\30\r\2\u00d1\u00d2\5\32\16\2\u00d2"+
		"\u00d3\5\34\17\2\u00d3\u00d4\7\16\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\7!\2"+
		"\2\u00d6\u00d7\7\r\2\2\u00d7\u00d8\5\22\n\2\u00d8\u00d9\5\36\20\2\u00d9"+
		"\u00da\5\26\f\2\u00da\u00db\5\30\r\2\u00db\u00dc\7\16\2\2\u00dc)\3\2\2"+
		"\2\u00dd\u00de\7\"\2\2\u00de\u00df\7\r\2\2\u00df\u00e0\5\22\n\2\u00e0"+
		"\u00e1\5 \21\2\u00e1\u00e2\7\16\2\2\u00e2+\3\2\2\2\u00e3\u00e4\7#\2\2"+
		"\u00e4\u00e5\7\r\2\2\u00e5\u00e6\5\"\22\2\u00e6\u00e7\5$\23\2\u00e7\u00e8"+
		"\7\16\2\2\u00e8-\3\2\2\2\u00e9\u00f2\5\64\33\2\u00ea\u00eb\5\64\33\2\u00eb"+
		"\u00ec\5.\30\2\u00ec\u00f2\3\2\2\2\u00ed\u00f2\5\60\31\2\u00ee\u00ef\5"+
		"\60\31\2\u00ef\u00f0\5.\30\2\u00f0\u00f2\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1"+
		"\u00ea\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2/\3\2\2\2"+
		"\u00f3\u00f4\7$\2\2\u00f4\u00f5\7\13\2\2\u00f5\u00f6\5\62\32\2\u00f6\u00f7"+
		"\7\f\2\2\u00f7\u00f8\7\r\2\2\u00f8\u00f9\5.\30\2\u00f9\u00fa\7\16\2\2"+
		"\u00fa\61\3\2\2\2\u00fb\u0105\58\35\2\u00fc\u00fd\58\35\2\u00fd\u00fe"+
		"\7\33\2\2\u00fe\u00ff\5\62\32\2\u00ff\u0105\3\2\2\2\u0100\u0101\58\35"+
		"\2\u0101\u0102\7\34\2\2\u0102\u0103\5\62\32\2\u0103\u0105\3\2\2\2\u0104"+
		"\u00fb\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u0100\3\2\2\2\u0105\63\3\2\2"+
		"\2\u0106\u010b\5\66\34\2\u0107\u0108\5\66\34\2\u0108\u0109\5\64\33\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0106\3\2\2\2\u010a\u0107\3\2\2\2\u010b\65\3\2\2"+
		"\2\u010c\u010d\7%\2\2\u010d\u010e\7\13\2\2\u010e\u010f\5`\61\2\u010f\u0110"+
		"\7\f\2\2\u0110\67\3\2\2\2\u0111\u0115\5P)\2\u0112\u0113\7\35\2\2\u0113"+
		"\u0115\5P)\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u01159\3\2\2\2\u0116"+
		"\u0117\7\60\2\2\u0117\u011c\7\3\2\2\u0118\u0119\7\23\2\2\u0119\u011b\7"+
		"\3\2\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d;\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7\61\2\2"+
		"\u0120\u0125\7\37\2\2\u0121\u0122\7\23\2\2\u0122\u0124\7\37\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126=\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7\62\2\2\u0129\u012e"+
		"\7\37\2\2\u012a\u012b\7\23\2\2\u012b\u012d\7\37\2\2\u012c\u012a\3\2\2"+
		"\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f?"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7\63\2\2\u0132\u0137\7\37\2\2"+
		"\u0133\u0134\7\23\2\2\u0134\u0136\7\37\2\2\u0135\u0133\3\2\2\2\u0136\u0139"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138A\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013b\7\64\2\2\u013b\u0140\5\20\t\2\u013c\u013d\7"+
		"\23\2\2\u013d\u013f\5\20\t\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141C\3\2\2\2\u0142\u0140\3\2\2\2"+
		"\u0143\u0144\7\65\2\2\u0144\u0149\5\20\t\2\u0145\u0146\7\23\2\2\u0146"+
		"\u0148\5\20\t\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3"+
		"\2\2\2\u0149\u014a\3\2\2\2\u014aE\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d"+
		"\7\66\2\2\u014d\u0152\7\37\2\2\u014e\u014f\7\23\2\2\u014f\u0151\7\37\2"+
		"\2\u0150\u014e\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153G\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7\67\2\2\u0156"+
		"\u015b\7\37\2\2\u0157\u0158\7\23\2\2\u0158\u015a\7\37\2\2\u0159\u0157"+
		"\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"I\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\78\2\2\u015f\u0160\5\2\2\2\u0160"+
		"\u0161\7\23\2\2\u0161\u0162\5\16\b\2\u0162\u0169\3\2\2\2\u0163\u0164\7"+
		"8\2\2\u0164\u0165\5\2\2\2\u0165\u0166\7\23\2\2\u0166\u0167\5\2\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u015e\3\2\2\2\u0168\u0163\3\2\2\2\u0169K\3\2\2\2"+
		"\u016a\u016b\79\2\2\u016b\u016c\5\2\2\2\u016c\u016d\7\23\2\2\u016d\u016e"+
		"\5\16\b\2\u016e\u0175\3\2\2\2\u016f\u0170\79\2\2\u0170\u0171\5\2\2\2\u0171"+
		"\u0172\7\23\2\2\u0172\u0173\5\2\2\2\u0173\u0175\3\2\2\2\u0174\u016a\3"+
		"\2\2\2\u0174\u016f\3\2\2\2\u0175M\3\2\2\2\u0176\u0177\7:\2\2\u0177\u0178"+
		"\5\2\2\2\u0178\u0179\7\23\2\2\u0179\u017a\5\16\b\2\u017a\u0181\3\2\2\2"+
		"\u017b\u017c\7:\2\2\u017c\u017d\5\2\2\2\u017d\u017e\7\23\2\2\u017e\u017f"+
		"\5\2\2\2\u017f\u0181\3\2\2\2\u0180\u0176\3\2\2\2\u0180\u017b\3\2\2\2\u0181"+
		"O\3\2\2\2\u0182\u018e\5:\36\2\u0183\u018e\5<\37\2\u0184\u018e\5> \2\u0185"+
		"\u018e\5@!\2\u0186\u018e\5B\"\2\u0187\u018e\5D#\2\u0188\u018e\5F$\2\u0189"+
		"\u018e\5H%\2\u018a\u018e\5J&\2\u018b\u018e\5L\'\2\u018c\u018e\5N(\2\u018d"+
		"\u0182\3\2\2\2\u018d\u0183\3\2\2\2\u018d\u0184\3\2\2\2\u018d\u0185\3\2"+
		"\2\2\u018d\u0186\3\2\2\2\u018d\u0187\3\2\2\2\u018d\u0188\3\2\2\2\u018d"+
		"\u0189\3\2\2\2\u018d\u018a\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2"+
		"\2\2\u018eQ\3\2\2\2\u018f\u0190\7;\2\2\u0190\u0191\7\36\2\2\u0191S\3\2"+
		"\2\2\u0192\u0193\7<\2\2\u0193\u0194\7\37\2\2\u0194U\3\2\2\2\u0195\u0196"+
		"\7=\2\2\u0196\u019d\5\20\t\2\u0197\u0198\7=\2\2\u0198\u0199\5\20\t\2\u0199"+
		"\u019a\7\23\2\2\u019a\u019b\5\4\3\2\u019b\u019d\3\2\2\2\u019c\u0195\3"+
		"\2\2\2\u019c\u0197\3\2\2\2\u019dW\3\2\2\2\u019e\u019f\7>\2\2\u019f\u01a0"+
		"\5\20\t\2\u01a0Y\3\2\2\2\u01a1\u01a2\7?\2\2\u01a2\u01a3\7\37\2\2\u01a3"+
		"[\3\2\2\2\u01a4\u01a5\7@\2\2\u01a5\u01a6\7\37\2\2\u01a6\u01a7\7\23\2\2"+
		"\u01a7\u01a8\7\37\2\2\u01a8]\3\2\2\2\u01a9\u01aa\7A\2\2\u01aa\u01ab\5"+
		"\2\2\2\u01ab\u01ac\7\23\2\2\u01ac\u01ad\5\f\7\2\u01ad_\3\2\2\2\u01ae\u01b6"+
		"\5R*\2\u01af\u01b6\5T+\2\u01b0\u01b6\5V,\2\u01b1\u01b6\5X-\2\u01b2\u01b6"+
		"\5Z.\2\u01b3\u01b6\5\\/\2\u01b4\u01b6\5^\60\2\u01b5\u01ae\3\2\2\2\u01b5"+
		"\u01af\3\2\2\2\u01b5\u01b0\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b5\u01b2\3\2"+
		"\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6a\3\2\2\2\u01b7\u01be"+
		"\5(\25\2\u01b8\u01bd\5(\25\2\u01b9\u01bd\5&\24\2\u01ba\u01bd\5*\26\2\u01bb"+
		"\u01bd\5,\27\2\u01bc\u01b8\3\2\2\2\u01bc\u01b9\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bfc\3\2\2\2\u01c0\u01be\3\2\2\2 mqx\u0093\u009b\u00a1"+
		"\u00a9\u00af\u00b9\u00c9\u00f1\u0104\u010a\u0114\u011c\u0125\u012e\u0137"+
		"\u0140\u0149\u0152\u015b\u0168\u0174\u0180\u018d\u019c\u01b5\u01bc\u01be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}