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
		COLON=1, SEMICOLON=2, LB_SQUARE=3, RB_SQUARE=4, LB_SHARP=5, RB_SHARP=6, 
		LB_CURLY=7, RB_CURLY=8, LB_ROUND=9, RB_ROUND=10, QUOTES=11, UNDERSCORE=12, 
		COMMA=13, DOT=14, PLUS=15, MINUS=16, BAR=17, ANDPERSAND=18, EQUALS=19, 
		TRUE=20, FALSE=21, AND=22, OR=23, NOT=24, COND_TAG=25, EFFECT_TAG=26, 
		ALPHA=27, NUMERIC=28, ALPHANUMERIC=29, WHITESPACE=30, STRING=31, ID=32, 
		OBJECT_TAG=33, ROOM_TAG=34, ACTION_TAG=35, FLAG_TAG=36, ID_KEY=37, LOC_KEY=38, 
		NAME_KEY=39, DESC_KEY=40, SYNS_KEY=41, FLAGS_KEY=42, FLAG_KEY=43, VALUES_KEY=44, 
		VALUE_KEY=45, NORTH_KEY=46, SOUTH_KEY=47, EAST_KEY=48, WEST_KEY=49, UP_KEY=50, 
		DOWN_KEY=51, NORTH_COND_KEY=52, SOUTH_COND_KEY=53, EAST_COND_KEY=54, WEST_COND_KEY=55, 
		UP_COND_KEY=56, DOWN_COND_KEY=57, ACTION_KEY=58, PRSA_COND=59, PRSO_COND=60, 
		PRSI_COND=61, HERE_COND=62, ANDFLAGS_COND=63, ORFLAGS_COND=64, FLAGVALUE_COND=65, 
		HAVEITEM_COND=66, HAVEITEMS_COND=67, EQUALS_COND=68, GT_COND=69, LT_COND=70, 
		TELL_EFF=71, GOTO_EFF=72, SETFLAG_EFF=73, REMFLAG_EFF=74, TAKE_EFF=75, 
		PLACE_EFF=76, SET_EFF=77;
	public static final int
		RULE_alpha_numeric = 0, RULE_num_int = 1, RULE_num_float = 2, RULE_number = 3, 
		RULE_bool = 4, RULE_var = 5, RULE_value = 6, RULE_flag = 7, RULE_id_entry = 8, 
		RULE_loc_entry = 9, RULE_name_entry = 10, RULE_desc_entry = 11, RULE_synonyms_entry = 12, 
		RULE_flags_entry = 13, RULE_values_entry = 14, RULE_north_entry = 15, 
		RULE_south_entry = 16, RULE_east_entry = 17, RULE_west_entry = 18, RULE_up_entry = 19, 
		RULE_down_entry = 20, RULE_action_entry = 21, RULE_global_flag_entry = 22, 
		RULE_flag_val_entry = 23, RULE_object = 24, RULE_room = 25, RULE_action = 26, 
		RULE_global_flag = 27, RULE_action_block = 28, RULE_conditional = 29, 
		RULE_conditions = 30, RULE_effect_aux = 31, RULE_condition_aux = 32, RULE_prsa_cond = 33, 
		RULE_prso_cond = 34, RULE_prsi_cond = 35, RULE_here_cond = 36, RULE_andflags_cond = 37, 
		RULE_orflags_cond = 38, RULE_flagvalue_cond = 39, RULE_haveitem_cond = 40, 
		RULE_haveitems_cond = 41, RULE_equals_cond = 42, RULE_gt_cond = 43, RULE_lt_cond = 44, 
		RULE_condition = 45, RULE_tell_eff = 46, RULE_goto_eff = 47, RULE_setflag_eff = 48, 
		RULE_remflag_eff = 49, RULE_take_eff = 50, RULE_place_eff = 51, RULE_set_eff = 52, 
		RULE_effect = 53, RULE_game_grammar = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"alpha_numeric", "num_int", "num_float", "number", "bool", "var", "value", 
			"flag", "id_entry", "loc_entry", "name_entry", "desc_entry", "synonyms_entry", 
			"flags_entry", "values_entry", "north_entry", "south_entry", "east_entry", 
			"west_entry", "up_entry", "down_entry", "action_entry", "global_flag_entry", 
			"flag_val_entry", "object", "room", "action", "global_flag", "action_block", 
			"conditional", "conditions", "effect_aux", "condition_aux", "prsa_cond", 
			"prso_cond", "prsi_cond", "here_cond", "andflags_cond", "orflags_cond", 
			"flagvalue_cond", "haveitem_cond", "haveitems_cond", "equals_cond", "gt_cond", 
			"lt_cond", "condition", "tell_eff", "goto_eff", "setflag_eff", "remflag_eff", 
			"take_eff", "place_eff", "set_eff", "effect", "game_grammar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'['", "']'", "'<'", "'>'", "'{'", "'}'", "'('", 
			"')'", "'\"'", "'_'", "','", "'.'", "'+'", "'-'", "'|'", "'&'", "'='", 
			"'TRUE'", "'FALSE'", null, null, "'!'", "'COND'", "'EFF'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "SEMICOLON", "LB_SQUARE", "RB_SQUARE", "LB_SHARP", "RB_SHARP", 
			"LB_CURLY", "RB_CURLY", "LB_ROUND", "RB_ROUND", "QUOTES", "UNDERSCORE", 
			"COMMA", "DOT", "PLUS", "MINUS", "BAR", "ANDPERSAND", "EQUALS", "TRUE", 
			"FALSE", "AND", "OR", "NOT", "COND_TAG", "EFFECT_TAG", "ALPHA", "NUMERIC", 
			"ALPHANUMERIC", "WHITESPACE", "STRING", "ID", "OBJECT_TAG", "ROOM_TAG", 
			"ACTION_TAG", "FLAG_TAG", "ID_KEY", "LOC_KEY", "NAME_KEY", "DESC_KEY", 
			"SYNS_KEY", "FLAGS_KEY", "FLAG_KEY", "VALUES_KEY", "VALUE_KEY", "NORTH_KEY", 
			"SOUTH_KEY", "EAST_KEY", "WEST_KEY", "UP_KEY", "DOWN_KEY", "NORTH_COND_KEY", 
			"SOUTH_COND_KEY", "EAST_COND_KEY", "WEST_COND_KEY", "UP_COND_KEY", "DOWN_COND_KEY", 
			"ACTION_KEY", "PRSA_COND", "PRSO_COND", "PRSI_COND", "HERE_COND", "ANDFLAGS_COND", 
			"ORFLAGS_COND", "FLAGVALUE_COND", "HAVEITEM_COND", "HAVEITEMS_COND", 
			"EQUALS_COND", "GT_COND", "LT_COND", "TELL_EFF", "GOTO_EFF", "SETFLAG_EFF", 
			"REMFLAG_EFF", "TAKE_EFF", "PLACE_EFF", "SET_EFF"
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
			setState(110);
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
			setState(112);
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(NUMERIC);
				setState(115);
				match(DOT);
				setState(116);
				match(NUMERIC);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(DOT);
				setState(118);
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				num_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
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
			setState(125);
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
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
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
			setState(132);
			match(LB_ROUND);
			setState(133);
			alpha_numeric();
			setState(134);
			match(COLON);
			setState(135);
			var();
			setState(136);
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
			setState(138);
			match(UNDERSCORE);
			setState(139);
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
			setState(141);
			match(ID_KEY);
			setState(142);
			match(ID);
			setState(143);
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
			setState(145);
			match(LOC_KEY);
			setState(146);
			match(ID);
			setState(147);
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
			setState(149);
			match(NAME_KEY);
			setState(150);
			match(STRING);
			setState(151);
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
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESC_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(DESC_KEY);
				setState(154);
				match(STRING);
				setState(155);
				match(SEMICOLON);
				}
				break;
			case RB_CURLY:
			case SYNS_KEY:
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

	public static class Synonyms_entryContext extends ParserRuleContext {
		public TerminalNode SYNS_KEY() { return getToken(EditorGrammarParser.SYNS_KEY, 0); }
		public List<TerminalNode> STRING() { return getTokens(EditorGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(EditorGrammarParser.STRING, i);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Synonyms_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synonyms_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterSynonyms_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitSynonyms_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitSynonyms_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Synonyms_entryContext synonyms_entry() throws RecognitionException {
		Synonyms_entryContext _localctx = new Synonyms_entryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_synonyms_entry);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNS_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(SYNS_KEY);
				setState(160);
				match(STRING);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(161);
					match(COMMA);
					setState(162);
					match(STRING);
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
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
		enterRule(_localctx, 26, RULE_flags_entry);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLAGS_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(FLAGS_KEY);
				setState(173);
				flag();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(174);
					match(COMMA);
					setState(175);
					flag();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
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
		enterRule(_localctx, 28, RULE_values_entry);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(VALUES_KEY);
				setState(187);
				value();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(188);
					match(COMMA);
					setState(189);
					value();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
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

	public static class North_entryContext extends ParserRuleContext {
		public TerminalNode NORTH_KEY() { return getToken(EditorGrammarParser.NORTH_KEY, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(EditorGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(EditorGrammarParser.SEMICOLON, i);
		}
		public TerminalNode NORTH_COND_KEY() { return getToken(EditorGrammarParser.NORTH_COND_KEY, 0); }
		public List<FlagContext> flag() {
			return getRuleContexts(FlagContext.class);
		}
		public FlagContext flag(int i) {
			return getRuleContext(FlagContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EditorGrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EditorGrammarParser.EQUALS, i);
		}
		public List<Num_intContext> num_int() {
			return getRuleContexts(Num_intContext.class);
		}
		public Num_intContext num_int(int i) {
			return getRuleContext(Num_intContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public North_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_north_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterNorth_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitNorth_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitNorth_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final North_entryContext north_entry() throws RecognitionException {
		North_entryContext _localctx = new North_entryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_north_entry);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORTH_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(NORTH_KEY);
				setState(201);
				match(ID);
				setState(202);
				match(SEMICOLON);
				setState(220);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NORTH_COND_KEY:
					{
					setState(203);
					match(NORTH_COND_KEY);
					setState(204);
					flag();
					setState(205);
					match(EQUALS);
					setState(206);
					num_int();
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(207);
						match(COMMA);
						setState(208);
						flag();
						setState(209);
						match(EQUALS);
						setState(210);
						num_int();
						}
						}
						setState(216);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(217);
					match(SEMICOLON);
					}
					break;
				case NAME_KEY:
				case SOUTH_KEY:
				case EAST_KEY:
				case WEST_KEY:
				case UP_KEY:
				case DOWN_KEY:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NAME_KEY:
			case SOUTH_KEY:
			case EAST_KEY:
			case WEST_KEY:
			case UP_KEY:
			case DOWN_KEY:
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

	public static class South_entryContext extends ParserRuleContext {
		public TerminalNode SOUTH_KEY() { return getToken(EditorGrammarParser.SOUTH_KEY, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(EditorGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(EditorGrammarParser.SEMICOLON, i);
		}
		public TerminalNode SOUTH_COND_KEY() { return getToken(EditorGrammarParser.SOUTH_COND_KEY, 0); }
		public List<FlagContext> flag() {
			return getRuleContexts(FlagContext.class);
		}
		public FlagContext flag(int i) {
			return getRuleContext(FlagContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EditorGrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EditorGrammarParser.EQUALS, i);
		}
		public List<Num_intContext> num_int() {
			return getRuleContexts(Num_intContext.class);
		}
		public Num_intContext num_int(int i) {
			return getRuleContext(Num_intContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public South_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_south_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterSouth_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitSouth_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitSouth_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final South_entryContext south_entry() throws RecognitionException {
		South_entryContext _localctx = new South_entryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_south_entry);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOUTH_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(SOUTH_KEY);
				setState(226);
				match(ID);
				setState(227);
				match(SEMICOLON);
				setState(245);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SOUTH_COND_KEY:
					{
					setState(228);
					match(SOUTH_COND_KEY);
					setState(229);
					flag();
					setState(230);
					match(EQUALS);
					setState(231);
					num_int();
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(232);
						match(COMMA);
						setState(233);
						flag();
						setState(234);
						match(EQUALS);
						setState(235);
						num_int();
						}
						}
						setState(241);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(242);
					match(SEMICOLON);
					}
					break;
				case NAME_KEY:
				case EAST_KEY:
				case WEST_KEY:
				case UP_KEY:
				case DOWN_KEY:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NAME_KEY:
			case EAST_KEY:
			case WEST_KEY:
			case UP_KEY:
			case DOWN_KEY:
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

	public static class East_entryContext extends ParserRuleContext {
		public TerminalNode EAST_KEY() { return getToken(EditorGrammarParser.EAST_KEY, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(EditorGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(EditorGrammarParser.SEMICOLON, i);
		}
		public TerminalNode EAST_COND_KEY() { return getToken(EditorGrammarParser.EAST_COND_KEY, 0); }
		public List<FlagContext> flag() {
			return getRuleContexts(FlagContext.class);
		}
		public FlagContext flag(int i) {
			return getRuleContext(FlagContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EditorGrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EditorGrammarParser.EQUALS, i);
		}
		public List<Num_intContext> num_int() {
			return getRuleContexts(Num_intContext.class);
		}
		public Num_intContext num_int(int i) {
			return getRuleContext(Num_intContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public East_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_east_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterEast_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitEast_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitEast_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final East_entryContext east_entry() throws RecognitionException {
		East_entryContext _localctx = new East_entryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_east_entry);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EAST_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(EAST_KEY);
				setState(251);
				match(ID);
				setState(252);
				match(SEMICOLON);
				setState(270);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EAST_COND_KEY:
					{
					setState(253);
					match(EAST_COND_KEY);
					setState(254);
					flag();
					setState(255);
					match(EQUALS);
					setState(256);
					num_int();
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(257);
						match(COMMA);
						setState(258);
						flag();
						setState(259);
						match(EQUALS);
						setState(260);
						num_int();
						}
						}
						setState(266);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(267);
					match(SEMICOLON);
					}
					break;
				case NAME_KEY:
				case WEST_KEY:
				case UP_KEY:
				case DOWN_KEY:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NAME_KEY:
			case WEST_KEY:
			case UP_KEY:
			case DOWN_KEY:
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

	public static class West_entryContext extends ParserRuleContext {
		public TerminalNode WEST_KEY() { return getToken(EditorGrammarParser.WEST_KEY, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(EditorGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(EditorGrammarParser.SEMICOLON, i);
		}
		public TerminalNode WEST_COND_KEY() { return getToken(EditorGrammarParser.WEST_COND_KEY, 0); }
		public List<FlagContext> flag() {
			return getRuleContexts(FlagContext.class);
		}
		public FlagContext flag(int i) {
			return getRuleContext(FlagContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EditorGrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EditorGrammarParser.EQUALS, i);
		}
		public List<Num_intContext> num_int() {
			return getRuleContexts(Num_intContext.class);
		}
		public Num_intContext num_int(int i) {
			return getRuleContext(Num_intContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public West_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_west_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterWest_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitWest_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitWest_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final West_entryContext west_entry() throws RecognitionException {
		West_entryContext _localctx = new West_entryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_west_entry);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WEST_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(WEST_KEY);
				setState(276);
				match(ID);
				setState(277);
				match(SEMICOLON);
				setState(295);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WEST_COND_KEY:
					{
					setState(278);
					match(WEST_COND_KEY);
					setState(279);
					flag();
					setState(280);
					match(EQUALS);
					setState(281);
					num_int();
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(282);
						match(COMMA);
						setState(283);
						flag();
						setState(284);
						match(EQUALS);
						setState(285);
						num_int();
						}
						}
						setState(291);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(292);
					match(SEMICOLON);
					}
					break;
				case NAME_KEY:
				case UP_KEY:
				case DOWN_KEY:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NAME_KEY:
			case UP_KEY:
			case DOWN_KEY:
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

	public static class Up_entryContext extends ParserRuleContext {
		public TerminalNode UP_KEY() { return getToken(EditorGrammarParser.UP_KEY, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(EditorGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(EditorGrammarParser.SEMICOLON, i);
		}
		public TerminalNode UP_COND_KEY() { return getToken(EditorGrammarParser.UP_COND_KEY, 0); }
		public List<FlagContext> flag() {
			return getRuleContexts(FlagContext.class);
		}
		public FlagContext flag(int i) {
			return getRuleContext(FlagContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EditorGrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EditorGrammarParser.EQUALS, i);
		}
		public List<Num_intContext> num_int() {
			return getRuleContexts(Num_intContext.class);
		}
		public Num_intContext num_int(int i) {
			return getRuleContext(Num_intContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Up_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_up_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterUp_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitUp_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitUp_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Up_entryContext up_entry() throws RecognitionException {
		Up_entryContext _localctx = new Up_entryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_up_entry);
		int _la;
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(UP_KEY);
				setState(301);
				match(ID);
				setState(302);
				match(SEMICOLON);
				setState(320);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UP_COND_KEY:
					{
					setState(303);
					match(UP_COND_KEY);
					setState(304);
					flag();
					setState(305);
					match(EQUALS);
					setState(306);
					num_int();
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(307);
						match(COMMA);
						setState(308);
						flag();
						setState(309);
						match(EQUALS);
						setState(310);
						num_int();
						}
						}
						setState(316);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(317);
					match(SEMICOLON);
					}
					break;
				case NAME_KEY:
				case DOWN_KEY:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NAME_KEY:
			case DOWN_KEY:
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

	public static class Down_entryContext extends ParserRuleContext {
		public TerminalNode DOWN_KEY() { return getToken(EditorGrammarParser.DOWN_KEY, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(EditorGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(EditorGrammarParser.SEMICOLON, i);
		}
		public TerminalNode DOWN_COND_KEY() { return getToken(EditorGrammarParser.DOWN_COND_KEY, 0); }
		public List<FlagContext> flag() {
			return getRuleContexts(FlagContext.class);
		}
		public FlagContext flag(int i) {
			return getRuleContext(FlagContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EditorGrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EditorGrammarParser.EQUALS, i);
		}
		public List<Num_intContext> num_int() {
			return getRuleContexts(Num_intContext.class);
		}
		public Num_intContext num_int(int i) {
			return getRuleContext(Num_intContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Down_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_down_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterDown_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitDown_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitDown_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Down_entryContext down_entry() throws RecognitionException {
		Down_entryContext _localctx = new Down_entryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_down_entry);
		int _la;
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOWN_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(DOWN_KEY);
				setState(326);
				match(ID);
				setState(327);
				match(SEMICOLON);
				setState(345);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOWN_COND_KEY:
					{
					setState(328);
					match(DOWN_COND_KEY);
					setState(329);
					flag();
					setState(330);
					match(EQUALS);
					setState(331);
					num_int();
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(332);
						match(COMMA);
						setState(333);
						flag();
						setState(334);
						match(EQUALS);
						setState(335);
						num_int();
						}
						}
						setState(341);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(342);
					match(SEMICOLON);
					}
					break;
				case NAME_KEY:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NAME_KEY:
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
		enterRule(_localctx, 42, RULE_action_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(ACTION_KEY);
			setState(351);
			action_block();
			setState(352);
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
		enterRule(_localctx, 44, RULE_global_flag_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(FLAG_KEY);
			setState(355);
			flag();
			setState(356);
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
		enterRule(_localctx, 46, RULE_flag_val_entry);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(VALUE_KEY);
				setState(359);
				num_int();
				setState(360);
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
		public Synonyms_entryContext synonyms_entry() {
			return getRuleContext(Synonyms_entryContext.class,0);
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
		enterRule(_localctx, 48, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(OBJECT_TAG);
			setState(366);
			match(LB_CURLY);
			setState(367);
			id_entry();
			setState(368);
			loc_entry();
			setState(369);
			name_entry();
			setState(370);
			desc_entry();
			setState(371);
			synonyms_entry();
			setState(372);
			flags_entry();
			setState(373);
			values_entry();
			setState(374);
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
		public North_entryContext north_entry() {
			return getRuleContext(North_entryContext.class,0);
		}
		public South_entryContext south_entry() {
			return getRuleContext(South_entryContext.class,0);
		}
		public East_entryContext east_entry() {
			return getRuleContext(East_entryContext.class,0);
		}
		public West_entryContext west_entry() {
			return getRuleContext(West_entryContext.class,0);
		}
		public Up_entryContext up_entry() {
			return getRuleContext(Up_entryContext.class,0);
		}
		public Down_entryContext down_entry() {
			return getRuleContext(Down_entryContext.class,0);
		}
		public Name_entryContext name_entry() {
			return getRuleContext(Name_entryContext.class,0);
		}
		public Desc_entryContext desc_entry() {
			return getRuleContext(Desc_entryContext.class,0);
		}
		public Synonyms_entryContext synonyms_entry() {
			return getRuleContext(Synonyms_entryContext.class,0);
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
		enterRule(_localctx, 50, RULE_room);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(ROOM_TAG);
			setState(377);
			match(LB_CURLY);
			setState(378);
			id_entry();
			setState(379);
			north_entry();
			setState(380);
			south_entry();
			setState(381);
			east_entry();
			setState(382);
			west_entry();
			setState(383);
			up_entry();
			setState(384);
			down_entry();
			setState(385);
			name_entry();
			setState(386);
			desc_entry();
			setState(387);
			synonyms_entry();
			setState(388);
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
		enterRule(_localctx, 52, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(ACTION_TAG);
			setState(391);
			match(LB_CURLY);
			setState(392);
			id_entry();
			setState(393);
			action_entry();
			setState(394);
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
		enterRule(_localctx, 54, RULE_global_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(FLAG_TAG);
			setState(397);
			match(LB_CURLY);
			setState(398);
			global_flag_entry();
			setState(399);
			flag_val_entry();
			setState(400);
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
		public Effect_auxContext effect_aux() {
			return getRuleContext(Effect_auxContext.class,0);
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
		enterRule(_localctx, 56, RULE_action_block);
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				effect_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				effect_aux();
				setState(404);
				action_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				conditional();
				setState(408);
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
		enterRule(_localctx, 58, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(COND_TAG);
			setState(413);
			match(LB_SHARP);
			setState(414);
			conditions();
			setState(415);
			match(RB_SHARP);
			setState(416);
			match(LB_CURLY);
			setState(417);
			action_block();
			setState(418);
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
		enterRule(_localctx, 60, RULE_conditions);
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				condition_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				condition_aux();
				setState(422);
				match(AND);
				setState(423);
				conditions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				condition_aux();
				setState(426);
				match(OR);
				setState(427);
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
		enterRule(_localctx, 62, RULE_effect_aux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(EFFECT_TAG);
			setState(432);
			match(LB_SHARP);
			setState(433);
			effect();
			setState(434);
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
		enterRule(_localctx, 64, RULE_condition_aux);
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRSA_COND:
			case PRSO_COND:
			case PRSI_COND:
			case HERE_COND:
			case ANDFLAGS_COND:
			case ORFLAGS_COND:
			case FLAGVALUE_COND:
			case HAVEITEM_COND:
			case HAVEITEMS_COND:
			case EQUALS_COND:
			case GT_COND:
			case LT_COND:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				condition();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(NOT);
				setState(438);
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
		enterRule(_localctx, 66, RULE_prsa_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(PRSA_COND);
			setState(442);
			match(ALPHA);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(443);
				match(COMMA);
				setState(444);
				match(ALPHA);
				}
				}
				setState(449);
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
		enterRule(_localctx, 68, RULE_prso_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(PRSO_COND);
			setState(451);
			match(ID);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(452);
				match(COMMA);
				setState(453);
				match(ID);
				}
				}
				setState(458);
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
		enterRule(_localctx, 70, RULE_prsi_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(PRSI_COND);
			setState(460);
			match(ID);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(461);
				match(COMMA);
				setState(462);
				match(ID);
				}
				}
				setState(467);
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
		enterRule(_localctx, 72, RULE_here_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(HERE_COND);
			setState(469);
			match(ID);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(470);
				match(COMMA);
				setState(471);
				match(ID);
				}
				}
				setState(476);
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
		enterRule(_localctx, 74, RULE_andflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(ANDFLAGS_COND);
			setState(478);
			flag();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(479);
				match(COMMA);
				setState(480);
				flag();
				}
				}
				setState(485);
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
		enterRule(_localctx, 76, RULE_orflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(ORFLAGS_COND);
			setState(487);
			flag();
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(488);
				match(COMMA);
				setState(489);
				flag();
				}
				}
				setState(494);
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

	public static class Flagvalue_condContext extends ParserRuleContext {
		public TerminalNode FLAGVALUE_COND() { return getToken(EditorGrammarParser.FLAGVALUE_COND, 0); }
		public FlagContext flag() {
			return getRuleContext(FlagContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(EditorGrammarParser.COMMA, 0); }
		public Num_intContext num_int() {
			return getRuleContext(Num_intContext.class,0);
		}
		public Flagvalue_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flagvalue_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterFlagvalue_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitFlagvalue_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitFlagvalue_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flagvalue_condContext flagvalue_cond() throws RecognitionException {
		Flagvalue_condContext _localctx = new Flagvalue_condContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_flagvalue_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(FLAGVALUE_COND);
			setState(496);
			flag();
			setState(497);
			match(COMMA);
			setState(498);
			num_int();
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
		enterRule(_localctx, 80, RULE_haveitem_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(HAVEITEM_COND);
			setState(501);
			match(ID);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(502);
				match(COMMA);
				setState(503);
				match(ID);
				}
				}
				setState(508);
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
		enterRule(_localctx, 82, RULE_haveitems_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(HAVEITEMS_COND);
			setState(510);
			match(ID);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(511);
				match(COMMA);
				setState(512);
				match(ID);
				}
				}
				setState(517);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
		enterRule(_localctx, 84, RULE_equals_cond);
		try {
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(EQUALS_COND);
				setState(519);
				alpha_numeric();
				setState(520);
				match(COMMA);
				setState(521);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				match(EQUALS_COND);
				setState(524);
				alpha_numeric();
				setState(525);
				match(COMMA);
				setState(526);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
		enterRule(_localctx, 86, RULE_gt_cond);
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				match(GT_COND);
				setState(531);
				alpha_numeric();
				setState(532);
				match(COMMA);
				setState(533);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				match(GT_COND);
				setState(536);
				alpha_numeric();
				setState(537);
				match(COMMA);
				setState(538);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
		enterRule(_localctx, 88, RULE_lt_cond);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				match(LT_COND);
				setState(543);
				alpha_numeric();
				setState(544);
				match(COMMA);
				setState(545);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(LT_COND);
				setState(548);
				alpha_numeric();
				setState(549);
				match(COMMA);
				setState(550);
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
		public Flagvalue_condContext flagvalue_cond() {
			return getRuleContext(Flagvalue_condContext.class,0);
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
		enterRule(_localctx, 90, RULE_condition);
		try {
			setState(566);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRSA_COND:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				prsa_cond();
				}
				break;
			case PRSO_COND:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				prso_cond();
				}
				break;
			case PRSI_COND:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				prsi_cond();
				}
				break;
			case HERE_COND:
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
				here_cond();
				}
				break;
			case ANDFLAGS_COND:
				enterOuterAlt(_localctx, 5);
				{
				setState(558);
				andflags_cond();
				}
				break;
			case ORFLAGS_COND:
				enterOuterAlt(_localctx, 6);
				{
				setState(559);
				orflags_cond();
				}
				break;
			case FLAGVALUE_COND:
				enterOuterAlt(_localctx, 7);
				{
				setState(560);
				flagvalue_cond();
				}
				break;
			case HAVEITEM_COND:
				enterOuterAlt(_localctx, 8);
				{
				setState(561);
				haveitem_cond();
				}
				break;
			case HAVEITEMS_COND:
				enterOuterAlt(_localctx, 9);
				{
				setState(562);
				haveitems_cond();
				}
				break;
			case EQUALS_COND:
				enterOuterAlt(_localctx, 10);
				{
				setState(563);
				equals_cond();
				}
				break;
			case GT_COND:
				enterOuterAlt(_localctx, 11);
				{
				setState(564);
				gt_cond();
				}
				break;
			case LT_COND:
				enterOuterAlt(_localctx, 12);
				{
				setState(565);
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
		enterRule(_localctx, 92, RULE_tell_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(TELL_EFF);
			setState(569);
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
		enterRule(_localctx, 94, RULE_goto_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(GOTO_EFF);
			setState(572);
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
		enterRule(_localctx, 96, RULE_setflag_eff);
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(SETFLAG_EFF);
				setState(575);
				flag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(SETFLAG_EFF);
				setState(577);
				flag();
				setState(578);
				match(COMMA);
				setState(579);
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
		enterRule(_localctx, 98, RULE_remflag_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(REMFLAG_EFF);
			setState(584);
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
		enterRule(_localctx, 100, RULE_take_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(TAKE_EFF);
			setState(587);
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
		enterRule(_localctx, 102, RULE_place_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(PLACE_EFF);
			setState(590);
			match(ID);
			setState(591);
			match(COMMA);
			setState(592);
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
		enterRule(_localctx, 104, RULE_set_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(SET_EFF);
			setState(595);
			alpha_numeric();
			setState(596);
			match(COMMA);
			setState(597);
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
		enterRule(_localctx, 106, RULE_effect);
		try {
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TELL_EFF:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				tell_eff();
				}
				break;
			case GOTO_EFF:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				goto_eff();
				}
				break;
			case SETFLAG_EFF:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				setflag_eff();
				}
				break;
			case REMFLAG_EFF:
				enterOuterAlt(_localctx, 4);
				{
				setState(602);
				remflag_eff();
				}
				break;
			case TAKE_EFF:
				enterOuterAlt(_localctx, 5);
				{
				setState(603);
				take_eff();
				}
				break;
			case PLACE_EFF:
				enterOuterAlt(_localctx, 6);
				{
				setState(604);
				place_eff();
				}
				break;
			case SET_EFF:
				enterOuterAlt(_localctx, 7);
				{
				setState(605);
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
		enterRule(_localctx, 108, RULE_game_grammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			room();
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECT_TAG) | (1L << ROOM_TAG) | (1L << ACTION_TAG) | (1L << FLAG_TAG))) != 0)) {
				{
				setState(613);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ROOM_TAG:
					{
					setState(609);
					room();
					}
					break;
				case OBJECT_TAG:
					{
					setState(610);
					object();
					}
					break;
				case ACTION_TAG:
					{
					setState(611);
					action();
					}
					break;
				case FLAG_TAG:
					{
					setState(612);
					global_flag();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(617);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u026d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\5\4z\n\4\3\5\3\5\5\5~\n\5\3\6\3\6\3\7\3\7\3\7\5\7\u0085\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00a0\n\r\3\16\3\16\3\16\3\16\7\16"+
		"\u00a6\n\16\f\16\16\16\u00a9\13\16\3\16\3\16\5\16\u00ad\n\16\3\17\3\17"+
		"\3\17\3\17\7\17\u00b3\n\17\f\17\16\17\u00b6\13\17\3\17\3\17\3\17\5\17"+
		"\u00bb\n\17\3\20\3\20\3\20\3\20\7\20\u00c1\n\20\f\20\16\20\u00c4\13\20"+
		"\3\20\3\20\3\20\5\20\u00c9\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u00d7\n\21\f\21\16\21\u00da\13\21\3\21\3\21"+
		"\3\21\5\21\u00df\n\21\3\21\5\21\u00e2\n\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f0\n\22\f\22\16\22\u00f3\13"+
		"\22\3\22\3\22\3\22\5\22\u00f8\n\22\3\22\5\22\u00fb\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0109\n\23\f\23\16"+
		"\23\u010c\13\23\3\23\3\23\3\23\5\23\u0111\n\23\3\23\5\23\u0114\n\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0122"+
		"\n\24\f\24\16\24\u0125\13\24\3\24\3\24\3\24\5\24\u012a\n\24\3\24\5\24"+
		"\u012d\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u013b\n\25\f\25\16\25\u013e\13\25\3\25\3\25\3\25\5\25\u0143\n\25"+
		"\3\25\5\25\u0146\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u0154\n\26\f\26\16\26\u0157\13\26\3\26\3\26\3\26\5\26"+
		"\u015c\n\26\3\26\5\26\u015f\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\5\31\u016e\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u019d"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \5 \u01b0\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\5\"\u01ba\n\"\3#\3#\3#\3#\7"+
		"#\u01c0\n#\f#\16#\u01c3\13#\3$\3$\3$\3$\7$\u01c9\n$\f$\16$\u01cc\13$\3"+
		"%\3%\3%\3%\7%\u01d2\n%\f%\16%\u01d5\13%\3&\3&\3&\3&\7&\u01db\n&\f&\16"+
		"&\u01de\13&\3\'\3\'\3\'\3\'\7\'\u01e4\n\'\f\'\16\'\u01e7\13\'\3(\3(\3"+
		"(\3(\7(\u01ed\n(\f(\16(\u01f0\13(\3)\3)\3)\3)\3)\3*\3*\3*\3*\7*\u01fb"+
		"\n*\f*\16*\u01fe\13*\3+\3+\3+\3+\7+\u0204\n+\f+\16+\u0207\13+\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\5,\u0213\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u021f"+
		"\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u022b\n.\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\5/\u0239\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u0248\n\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u0261\n\67\38\38\38\38\38\78\u0268\n8\f8\168\u026b\13"+
		"8\38\2\29\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\4\3\2\35\37\3\2\26\27\2\u027a\2p\3\2\2"+
		"\2\4r\3\2\2\2\6y\3\2\2\2\b}\3\2\2\2\n\177\3\2\2\2\f\u0084\3\2\2\2\16\u0086"+
		"\3\2\2\2\20\u008c\3\2\2\2\22\u008f\3\2\2\2\24\u0093\3\2\2\2\26\u0097\3"+
		"\2\2\2\30\u009f\3\2\2\2\32\u00ac\3\2\2\2\34\u00ba\3\2\2\2\36\u00c8\3\2"+
		"\2\2 \u00e1\3\2\2\2\"\u00fa\3\2\2\2$\u0113\3\2\2\2&\u012c\3\2\2\2(\u0145"+
		"\3\2\2\2*\u015e\3\2\2\2,\u0160\3\2\2\2.\u0164\3\2\2\2\60\u016d\3\2\2\2"+
		"\62\u016f\3\2\2\2\64\u017a\3\2\2\2\66\u0188\3\2\2\28\u018e\3\2\2\2:\u019c"+
		"\3\2\2\2<\u019e\3\2\2\2>\u01af\3\2\2\2@\u01b1\3\2\2\2B\u01b9\3\2\2\2D"+
		"\u01bb\3\2\2\2F\u01c4\3\2\2\2H\u01cd\3\2\2\2J\u01d6\3\2\2\2L\u01df\3\2"+
		"\2\2N\u01e8\3\2\2\2P\u01f1\3\2\2\2R\u01f6\3\2\2\2T\u01ff\3\2\2\2V\u0212"+
		"\3\2\2\2X\u021e\3\2\2\2Z\u022a\3\2\2\2\\\u0238\3\2\2\2^\u023a\3\2\2\2"+
		"`\u023d\3\2\2\2b\u0247\3\2\2\2d\u0249\3\2\2\2f\u024c\3\2\2\2h\u024f\3"+
		"\2\2\2j\u0254\3\2\2\2l\u0260\3\2\2\2n\u0262\3\2\2\2pq\t\2\2\2q\3\3\2\2"+
		"\2rs\7\36\2\2s\5\3\2\2\2tu\7\36\2\2uv\7\20\2\2vz\7\36\2\2wx\7\20\2\2x"+
		"z\7\36\2\2yt\3\2\2\2yw\3\2\2\2z\7\3\2\2\2{~\5\4\3\2|~\5\6\4\2}{\3\2\2"+
		"\2}|\3\2\2\2~\t\3\2\2\2\177\u0080\t\3\2\2\u0080\13\3\2\2\2\u0081\u0085"+
		"\5\b\5\2\u0082\u0085\7!\2\2\u0083\u0085\5\n\6\2\u0084\u0081\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\r\3\2\2\2\u0086\u0087\7\13\2"+
		"\2\u0087\u0088\5\2\2\2\u0088\u0089\7\3\2\2\u0089\u008a\5\f\7\2\u008a\u008b"+
		"\7\f\2\2\u008b\17\3\2\2\2\u008c\u008d\7\16\2\2\u008d\u008e\5\2\2\2\u008e"+
		"\21\3\2\2\2\u008f\u0090\7\'\2\2\u0090\u0091\7\"\2\2\u0091\u0092\7\4\2"+
		"\2\u0092\23\3\2\2\2\u0093\u0094\7(\2\2\u0094\u0095\7\"\2\2\u0095\u0096"+
		"\7\4\2\2\u0096\25\3\2\2\2\u0097\u0098\7)\2\2\u0098\u0099\7!\2\2\u0099"+
		"\u009a\7\4\2\2\u009a\27\3\2\2\2\u009b\u009c\7*\2\2\u009c\u009d\7!\2\2"+
		"\u009d\u00a0\7\4\2\2\u009e\u00a0\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\31\3\2\2\2\u00a1\u00a2\7+\2\2\u00a2\u00a7\7!\2\2\u00a3"+
		"\u00a4\7\17\2\2\u00a4\u00a6\7!\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ad\7\4\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a1\3\2"+
		"\2\2\u00ac\u00ab\3\2\2\2\u00ad\33\3\2\2\2\u00ae\u00af\7,\2\2\u00af\u00b4"+
		"\5\20\t\2\u00b0\u00b1\7\17\2\2\u00b1\u00b3\5\20\t\2\u00b2\u00b0\3\2\2"+
		"\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\4\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00ae\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\35\3\2\2"+
		"\2\u00bc\u00bd\7.\2\2\u00bd\u00c2\5\16\b\2\u00be\u00bf\7\17\2\2\u00bf"+
		"\u00c1\5\16\b\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c6\7\4\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00bc\3\2"+
		"\2\2\u00c8\u00c7\3\2\2\2\u00c9\37\3\2\2\2\u00ca\u00cb\7\60\2\2\u00cb\u00cc"+
		"\7\"\2\2\u00cc\u00de\7\4\2\2\u00cd\u00ce\7\66\2\2\u00ce\u00cf\5\20\t\2"+
		"\u00cf\u00d0\7\25\2\2\u00d0\u00d8\5\4\3\2\u00d1\u00d2\7\17\2\2\u00d2\u00d3"+
		"\5\20\t\2\u00d3\u00d4\7\25\2\2\u00d4\u00d5\5\4\3\2\u00d5\u00d7\3\2\2\2"+
		"\u00d6\u00d1\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\4\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00cd\3\2\2\2\u00de\u00dd\3\2"+
		"\2\2\u00df\u00e2\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00ca\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2!\3\2\2\2\u00e3\u00e4\7\61\2\2\u00e4\u00e5\7\"\2\2"+
		"\u00e5\u00f7\7\4\2\2\u00e6\u00e7\7\67\2\2\u00e7\u00e8\5\20\t\2\u00e8\u00e9"+
		"\7\25\2\2\u00e9\u00f1\5\4\3\2\u00ea\u00eb\7\17\2\2\u00eb\u00ec\5\20\t"+
		"\2\u00ec\u00ed\7\25\2\2\u00ed\u00ee\5\4\3\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00ea\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\4\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00e6\3\2\2\2\u00f7\u00f6\3\2"+
		"\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00e3\3\2\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb#\3\2\2\2\u00fc\u00fd\7\62\2\2\u00fd\u00fe\7\"\2\2"+
		"\u00fe\u0110\7\4\2\2\u00ff\u0100\78\2\2\u0100\u0101\5\20\t\2\u0101\u0102"+
		"\7\25\2\2\u0102\u010a\5\4\3\2\u0103\u0104\7\17\2\2\u0104\u0105\5\20\t"+
		"\2\u0105\u0106\7\25\2\2\u0106\u0107\5\4\3\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0103\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\4\2\2\u010e"+
		"\u0111\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u00ff\3\2\2\2\u0110\u010f\3\2"+
		"\2\2\u0111\u0114\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u00fc\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114%\3\2\2\2\u0115\u0116\7\63\2\2\u0116\u0117\7\"\2\2"+
		"\u0117\u0129\7\4\2\2\u0118\u0119\79\2\2\u0119\u011a\5\20\t\2\u011a\u011b"+
		"\7\25\2\2\u011b\u0123\5\4\3\2\u011c\u011d\7\17\2\2\u011d\u011e\5\20\t"+
		"\2\u011e\u011f\7\25\2\2\u011f\u0120\5\4\3\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011c\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\4\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0118\3\2\2\2\u0129\u0128\3\2"+
		"\2\2\u012a\u012d\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u0115\3\2\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\'\3\2\2\2\u012e\u012f\7\64\2\2\u012f\u0130\7\"\2"+
		"\2\u0130\u0142\7\4\2\2\u0131\u0132\7:\2\2\u0132\u0133\5\20\t\2\u0133\u0134"+
		"\7\25\2\2\u0134\u013c\5\4\3\2\u0135\u0136\7\17\2\2\u0136\u0137\5\20\t"+
		"\2\u0137\u0138\7\25\2\2\u0138\u0139\5\4\3\2\u0139\u013b\3\2\2\2\u013a"+
		"\u0135\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7\4\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0131\3\2\2\2\u0142\u0141\3\2"+
		"\2\2\u0143\u0146\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u012e\3\2\2\2\u0145"+
		"\u0144\3\2\2\2\u0146)\3\2\2\2\u0147\u0148\7\65\2\2\u0148\u0149\7\"\2\2"+
		"\u0149\u015b\7\4\2\2\u014a\u014b\7;\2\2\u014b\u014c\5\20\t\2\u014c\u014d"+
		"\7\25\2\2\u014d\u0155\5\4\3\2\u014e\u014f\7\17\2\2\u014f\u0150\5\20\t"+
		"\2\u0150\u0151\7\25\2\2\u0151\u0152\5\4\3\2\u0152\u0154\3\2\2\2\u0153"+
		"\u014e\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\4\2\2\u0159"+
		"\u015c\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u014a\3\2\2\2\u015b\u015a\3\2"+
		"\2\2\u015c\u015f\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u0147\3\2\2\2\u015e"+
		"\u015d\3\2\2\2\u015f+\3\2\2\2\u0160\u0161\7<\2\2\u0161\u0162\5:\36\2\u0162"+
		"\u0163\7\4\2\2\u0163-\3\2\2\2\u0164\u0165\7-\2\2\u0165\u0166\5\20\t\2"+
		"\u0166\u0167\7\4\2\2\u0167/\3\2\2\2\u0168\u0169\7/\2\2\u0169\u016a\5\4"+
		"\3\2\u016a\u016b\7\4\2\2\u016b\u016e\3\2\2\2\u016c\u016e\3\2\2\2\u016d"+
		"\u0168\3\2\2\2\u016d\u016c\3\2\2\2\u016e\61\3\2\2\2\u016f\u0170\7#\2\2"+
		"\u0170\u0171\7\t\2\2\u0171\u0172\5\22\n\2\u0172\u0173\5\24\13\2\u0173"+
		"\u0174\5\26\f\2\u0174\u0175\5\30\r\2\u0175\u0176\5\32\16\2\u0176\u0177"+
		"\5\34\17\2\u0177\u0178\5\36\20\2\u0178\u0179\7\n\2\2\u0179\63\3\2\2\2"+
		"\u017a\u017b\7$\2\2\u017b\u017c\7\t\2\2\u017c\u017d\5\22\n\2\u017d\u017e"+
		"\5 \21\2\u017e\u017f\5\"\22\2\u017f\u0180\5$\23\2\u0180\u0181\5&\24\2"+
		"\u0181\u0182\5(\25\2\u0182\u0183\5*\26\2\u0183\u0184\5\26\f\2\u0184\u0185"+
		"\5\30\r\2\u0185\u0186\5\32\16\2\u0186\u0187\7\n\2\2\u0187\65\3\2\2\2\u0188"+
		"\u0189\7%\2\2\u0189\u018a\7\t\2\2\u018a\u018b\5\22\n\2\u018b\u018c\5,"+
		"\27\2\u018c\u018d\7\n\2\2\u018d\67\3\2\2\2\u018e\u018f\7&\2\2\u018f\u0190"+
		"\7\t\2\2\u0190\u0191\5.\30\2\u0191\u0192\5\60\31\2\u0192\u0193\7\n\2\2"+
		"\u01939\3\2\2\2\u0194\u019d\5@!\2\u0195\u0196\5@!\2\u0196\u0197\5:\36"+
		"\2\u0197\u019d\3\2\2\2\u0198\u019d\5<\37\2\u0199\u019a\5<\37\2\u019a\u019b"+
		"\5:\36\2\u019b\u019d\3\2\2\2\u019c\u0194\3\2\2\2\u019c\u0195\3\2\2\2\u019c"+
		"\u0198\3\2\2\2\u019c\u0199\3\2\2\2\u019d;\3\2\2\2\u019e\u019f\7\33\2\2"+
		"\u019f\u01a0\7\7\2\2\u01a0\u01a1\5> \2\u01a1\u01a2\7\b\2\2\u01a2\u01a3"+
		"\7\t\2\2\u01a3\u01a4\5:\36\2\u01a4\u01a5\7\n\2\2\u01a5=\3\2\2\2\u01a6"+
		"\u01b0\5B\"\2\u01a7\u01a8\5B\"\2\u01a8\u01a9\7\30\2\2\u01a9\u01aa\5> "+
		"\2\u01aa\u01b0\3\2\2\2\u01ab\u01ac\5B\"\2\u01ac\u01ad\7\31\2\2\u01ad\u01ae"+
		"\5> \2\u01ae\u01b0\3\2\2\2\u01af\u01a6\3\2\2\2\u01af\u01a7\3\2\2\2\u01af"+
		"\u01ab\3\2\2\2\u01b0?\3\2\2\2\u01b1\u01b2\7\34\2\2\u01b2\u01b3\7\7\2\2"+
		"\u01b3\u01b4\5l\67\2\u01b4\u01b5\7\b\2\2\u01b5A\3\2\2\2\u01b6\u01ba\5"+
		"\\/\2\u01b7\u01b8\7\32\2\2\u01b8\u01ba\5\\/\2\u01b9\u01b6\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01baC\3\2\2\2\u01bb\u01bc\7=\2\2\u01bc\u01c1\7\35\2\2"+
		"\u01bd\u01be\7\17\2\2\u01be\u01c0\7\35\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3"+
		"\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2E\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c4\u01c5\7>\2\2\u01c5\u01ca\7\"\2\2\u01c6\u01c7\7\17"+
		"\2\2\u01c7\u01c9\7\"\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cbG\3\2\2\2\u01cc\u01ca\3\2\2\2"+
		"\u01cd\u01ce\7?\2\2\u01ce\u01d3\7\"\2\2\u01cf\u01d0\7\17\2\2\u01d0\u01d2"+
		"\7\"\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4I\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\7@\2\2\u01d7"+
		"\u01dc\7\"\2\2\u01d8\u01d9\7\17\2\2\u01d9\u01db\7\"\2\2\u01da\u01d8\3"+
		"\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"K\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\7A\2\2\u01e0\u01e5\5\20\t\2"+
		"\u01e1\u01e2\7\17\2\2\u01e2\u01e4\5\20\t\2\u01e3\u01e1\3\2\2\2\u01e4\u01e7"+
		"\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6M\3\2\2\2\u01e7"+
		"\u01e5\3\2\2\2\u01e8\u01e9\7B\2\2\u01e9\u01ee\5\20\t\2\u01ea\u01eb\7\17"+
		"\2\2\u01eb\u01ed\5\20\t\2\u01ec\u01ea\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01efO\3\2\2\2\u01f0\u01ee\3\2\2\2"+
		"\u01f1\u01f2\7C\2\2\u01f2\u01f3\5\20\t\2\u01f3\u01f4\7\17\2\2\u01f4\u01f5"+
		"\5\4\3\2\u01f5Q\3\2\2\2\u01f6\u01f7\7D\2\2\u01f7\u01fc\7\"\2\2\u01f8\u01f9"+
		"\7\17\2\2\u01f9\u01fb\7\"\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fe\3\2\2\2"+
		"\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fdS\3\2\2\2\u01fe\u01fc\3"+
		"\2\2\2\u01ff\u0200\7E\2\2\u0200\u0205\7\"\2\2\u0201\u0202\7\17\2\2\u0202"+
		"\u0204\7\"\2\2\u0203\u0201\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2"+
		"\2\2\u0205\u0206\3\2\2\2\u0206U\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0209"+
		"\7F\2\2\u0209\u020a\5\2\2\2\u020a\u020b\7\17\2\2\u020b\u020c\5\f\7\2\u020c"+
		"\u0213\3\2\2\2\u020d\u020e\7F\2\2\u020e\u020f\5\2\2\2\u020f\u0210\7\17"+
		"\2\2\u0210\u0211\5\2\2\2\u0211\u0213\3\2\2\2\u0212\u0208\3\2\2\2\u0212"+
		"\u020d\3\2\2\2\u0213W\3\2\2\2\u0214\u0215\7G\2\2\u0215\u0216\5\2\2\2\u0216"+
		"\u0217\7\17\2\2\u0217\u0218\5\f\7\2\u0218\u021f\3\2\2\2\u0219\u021a\7"+
		"G\2\2\u021a\u021b\5\2\2\2\u021b\u021c\7\17\2\2\u021c\u021d\5\2\2\2\u021d"+
		"\u021f\3\2\2\2\u021e\u0214\3\2\2\2\u021e\u0219\3\2\2\2\u021fY\3\2\2\2"+
		"\u0220\u0221\7H\2\2\u0221\u0222\5\2\2\2\u0222\u0223\7\17\2\2\u0223\u0224"+
		"\5\f\7\2\u0224\u022b\3\2\2\2\u0225\u0226\7H\2\2\u0226\u0227\5\2\2\2\u0227"+
		"\u0228\7\17\2\2\u0228\u0229\5\2\2\2\u0229\u022b\3\2\2\2\u022a\u0220\3"+
		"\2\2\2\u022a\u0225\3\2\2\2\u022b[\3\2\2\2\u022c\u0239\5D#\2\u022d\u0239"+
		"\5F$\2\u022e\u0239\5H%\2\u022f\u0239\5J&\2\u0230\u0239\5L\'\2\u0231\u0239"+
		"\5N(\2\u0232\u0239\5P)\2\u0233\u0239\5R*\2\u0234\u0239\5T+\2\u0235\u0239"+
		"\5V,\2\u0236\u0239\5X-\2\u0237\u0239\5Z.\2\u0238\u022c\3\2\2\2\u0238\u022d"+
		"\3\2\2\2\u0238\u022e\3\2\2\2\u0238\u022f\3\2\2\2\u0238\u0230\3\2\2\2\u0238"+
		"\u0231\3\2\2\2\u0238\u0232\3\2\2\2\u0238\u0233\3\2\2\2\u0238\u0234\3\2"+
		"\2\2\u0238\u0235\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0237\3\2\2\2\u0239"+
		"]\3\2\2\2\u023a\u023b\7I\2\2\u023b\u023c\7!\2\2\u023c_\3\2\2\2\u023d\u023e"+
		"\7J\2\2\u023e\u023f\7\"\2\2\u023fa\3\2\2\2\u0240\u0241\7K\2\2\u0241\u0248"+
		"\5\20\t\2\u0242\u0243\7K\2\2\u0243\u0244\5\20\t\2\u0244\u0245\7\17\2\2"+
		"\u0245\u0246\5\4\3\2\u0246\u0248\3\2\2\2\u0247\u0240\3\2\2\2\u0247\u0242"+
		"\3\2\2\2\u0248c\3\2\2\2\u0249\u024a\7L\2\2\u024a\u024b\5\20\t\2\u024b"+
		"e\3\2\2\2\u024c\u024d\7M\2\2\u024d\u024e\7\"\2\2\u024eg\3\2\2\2\u024f"+
		"\u0250\7N\2\2\u0250\u0251\7\"\2\2\u0251\u0252\7\17\2\2\u0252\u0253\7\""+
		"\2\2\u0253i\3\2\2\2\u0254\u0255\7O\2\2\u0255\u0256\5\2\2\2\u0256\u0257"+
		"\7\17\2\2\u0257\u0258\5\f\7\2\u0258k\3\2\2\2\u0259\u0261\5^\60\2\u025a"+
		"\u0261\5`\61\2\u025b\u0261\5b\62\2\u025c\u0261\5d\63\2\u025d\u0261\5f"+
		"\64\2\u025e\u0261\5h\65\2\u025f\u0261\5j\66\2\u0260\u0259\3\2\2\2\u0260"+
		"\u025a\3\2\2\2\u0260\u025b\3\2\2\2\u0260\u025c\3\2\2\2\u0260\u025d\3\2"+
		"\2\2\u0260\u025e\3\2\2\2\u0260\u025f\3\2\2\2\u0261m\3\2\2\2\u0262\u0269"+
		"\5\64\33\2\u0263\u0268\5\64\33\2\u0264\u0268\5\62\32\2\u0265\u0268\5\66"+
		"\34\2\u0266\u0268\58\35\2\u0267\u0263\3\2\2\2\u0267\u0264\3\2\2\2\u0267"+
		"\u0265\3\2\2\2\u0267\u0266\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2"+
		"\2\2\u0269\u026a\3\2\2\2\u026ao\3\2\2\2\u026b\u0269\3\2\2\2\62y}\u0084"+
		"\u009f\u00a7\u00ac\u00b4\u00ba\u00c2\u00c8\u00d8\u00de\u00e1\u00f1\u00f7"+
		"\u00fa\u010a\u0110\u0113\u0123\u0129\u012c\u013c\u0142\u0145\u0155\u015b"+
		"\u015e\u016d\u019c\u01af\u01b9\u01c1\u01ca\u01d3\u01dc\u01e5\u01ee\u01fc"+
		"\u0205\u0212\u021e\u022a\u0238\u0247\u0260\u0267\u0269";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}