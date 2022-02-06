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
		IN_TAG=27, ON_TAG=28, UNDER_TAG=29, BLOCK_MESSAGE_TAG=30, ALPHA=31, NUMERIC=32, 
		ALPHANUMERIC=33, WHITESPACE=34, STRING=35, ID=36, OBJECT_TAG=37, ROOM_TAG=38, 
		ACTION_TAG=39, FLAG_TAG=40, ID_KEY=41, LOC_KEY=42, LOC_TYPE_KEY=43, NAME_KEY=44, 
		DESC_KEY=45, SYNS_KEY=46, PROPERTIES_KEY=47, FLAG_KEY=48, VALUES_KEY=49, 
		VALUE_KEY=50, NORTH_KEY=51, SOUTH_KEY=52, EAST_KEY=53, WEST_KEY=54, UP_KEY=55, 
		DOWN_KEY=56, NORTH_COND_KEY=57, SOUTH_COND_KEY=58, EAST_COND_KEY=59, WEST_COND_KEY=60, 
		UP_COND_KEY=61, DOWN_COND_KEY=62, NORTH_BLOCK_MESSAGE_KEY=63, SOUTH_BLOCK_MESSAGE_KEY=64, 
		EAST_BLOCK_MESSAGE_KEY=65, WEST_BLOCK_MESSAGE_KEY=66, UP_BLOCK_MESSAGE_KEY=67, 
		DOWN_BLOCK_MESSAGE_KEY=68, ACTION_KEY=69, DET_KEY=70, PRSA_COND=71, PRSA_AND_COND=72, 
		PRSO_COND=73, PRSI_COND=74, HERE_COND=75, INSCOPE_COND=76, ANDFLAGS_COND=77, 
		ORFLAGS_COND=78, ANDPROPERTIES_COND=79, ORPROPERTIES_COND=80, FLAGVALUE_COND=81, 
		HAVEITEM_COND=82, HAVEITEMS_COND=83, EQUALS_COND=84, GT_COND=85, LT_COND=86, 
		TELL_EFF=87, GOTO_EFF=88, SETFLAG_EFF=89, REMFLAG_EFF=90, TAKE_EFF=91, 
		PLACE_EFF=92, SET_VAR_EFF=93, INC_VAR_EFF=94, DEC_VAR_EFF=95;
	public static final int
		RULE_alpha_numeric = 0, RULE_num_int = 1, RULE_num_float = 2, RULE_number = 3, 
		RULE_bool = 4, RULE_var = 5, RULE_value = 6, RULE_flag = 7, RULE_id_entry = 8, 
		RULE_loc_entry = 9, RULE_loc_type_entry = 10, RULE_name_entry = 11, RULE_desc_entry = 12, 
		RULE_synonyms_entry = 13, RULE_properties_entry = 14, RULE_values_entry = 15, 
		RULE_north_entry = 16, RULE_south_entry = 17, RULE_east_entry = 18, RULE_west_entry = 19, 
		RULE_up_entry = 20, RULE_down_entry = 21, RULE_north_cond = 22, RULE_south_cond = 23, 
		RULE_east_cond = 24, RULE_west_cond = 25, RULE_up_cond = 26, RULE_down_cond = 27, 
		RULE_north_block_message = 28, RULE_south_block_message = 29, RULE_east_block_message = 30, 
		RULE_west_block_message = 31, RULE_up_block_message = 32, RULE_down_block_message = 33, 
		RULE_action_entry = 34, RULE_global_flag_entry = 35, RULE_flag_val_entry = 36, 
		RULE_det_entry = 37, RULE_object = 38, RULE_room = 39, RULE_action = 40, 
		RULE_global_flag = 41, RULE_action_block = 42, RULE_conditional = 43, 
		RULE_conditions = 44, RULE_effect_aux = 45, RULE_condition_aux = 46, RULE_prsa_cond = 47, 
		RULE_prsa_and_cond = 48, RULE_prso_cond = 49, RULE_prsi_cond = 50, RULE_here_cond = 51, 
		RULE_inscope_cond = 52, RULE_andflags_cond = 53, RULE_orflags_cond = 54, 
		RULE_andproperties_cond = 55, RULE_orproperties_cond = 56, RULE_flagvalue_cond = 57, 
		RULE_haveitem_cond = 58, RULE_haveitems_cond = 59, RULE_equals_cond = 60, 
		RULE_gt_cond = 61, RULE_lt_cond = 62, RULE_condition = 63, RULE_tell_eff = 64, 
		RULE_goto_eff = 65, RULE_setflag_eff = 66, RULE_remflag_eff = 67, RULE_take_eff = 68, 
		RULE_place_eff = 69, RULE_set_var_eff = 70, RULE_inc_var_eff = 71, RULE_dec_var_eff = 72, 
		RULE_effect = 73, RULE_game_grammar = 74;
	private static String[] makeRuleNames() {
		return new String[] {
			"alpha_numeric", "num_int", "num_float", "number", "bool", "var", "value", 
			"flag", "id_entry", "loc_entry", "loc_type_entry", "name_entry", "desc_entry", 
			"synonyms_entry", "properties_entry", "values_entry", "north_entry", 
			"south_entry", "east_entry", "west_entry", "up_entry", "down_entry", 
			"north_cond", "south_cond", "east_cond", "west_cond", "up_cond", "down_cond", 
			"north_block_message", "south_block_message", "east_block_message", "west_block_message", 
			"up_block_message", "down_block_message", "action_entry", "global_flag_entry", 
			"flag_val_entry", "det_entry", "object", "room", "action", "global_flag", 
			"action_block", "conditional", "conditions", "effect_aux", "condition_aux", 
			"prsa_cond", "prsa_and_cond", "prso_cond", "prsi_cond", "here_cond", 
			"inscope_cond", "andflags_cond", "orflags_cond", "andproperties_cond", 
			"orproperties_cond", "flagvalue_cond", "haveitem_cond", "haveitems_cond", 
			"equals_cond", "gt_cond", "lt_cond", "condition", "tell_eff", "goto_eff", 
			"setflag_eff", "remflag_eff", "take_eff", "place_eff", "set_var_eff", 
			"inc_var_eff", "dec_var_eff", "effect", "game_grammar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'['", "']'", "'<'", "'>'", "'{'", "'}'", "'('", 
			"')'", "'\"'", "'_'", "','", "'.'", "'+'", "'-'", "'|'", "'&'", "'='", 
			"'TRUE'", "'FALSE'", null, null, "'!'", "'COND'", "'EFF'", "'IN'", "'ON'", 
			"'UNDER'", "'BLOCKMESSAGE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "SEMICOLON", "LB_SQUARE", "RB_SQUARE", "LB_SHARP", "RB_SHARP", 
			"LB_CURLY", "RB_CURLY", "LB_ROUND", "RB_ROUND", "QUOTES", "UNDERSCORE", 
			"COMMA", "DOT", "PLUS", "MINUS", "BAR", "ANDPERSAND", "EQUALS", "TRUE", 
			"FALSE", "AND", "OR", "NOT", "COND_TAG", "EFFECT_TAG", "IN_TAG", "ON_TAG", 
			"UNDER_TAG", "BLOCK_MESSAGE_TAG", "ALPHA", "NUMERIC", "ALPHANUMERIC", 
			"WHITESPACE", "STRING", "ID", "OBJECT_TAG", "ROOM_TAG", "ACTION_TAG", 
			"FLAG_TAG", "ID_KEY", "LOC_KEY", "LOC_TYPE_KEY", "NAME_KEY", "DESC_KEY", 
			"SYNS_KEY", "PROPERTIES_KEY", "FLAG_KEY", "VALUES_KEY", "VALUE_KEY", 
			"NORTH_KEY", "SOUTH_KEY", "EAST_KEY", "WEST_KEY", "UP_KEY", "DOWN_KEY", 
			"NORTH_COND_KEY", "SOUTH_COND_KEY", "EAST_COND_KEY", "WEST_COND_KEY", 
			"UP_COND_KEY", "DOWN_COND_KEY", "NORTH_BLOCK_MESSAGE_KEY", "SOUTH_BLOCK_MESSAGE_KEY", 
			"EAST_BLOCK_MESSAGE_KEY", "WEST_BLOCK_MESSAGE_KEY", "UP_BLOCK_MESSAGE_KEY", 
			"DOWN_BLOCK_MESSAGE_KEY", "ACTION_KEY", "DET_KEY", "PRSA_COND", "PRSA_AND_COND", 
			"PRSO_COND", "PRSI_COND", "HERE_COND", "INSCOPE_COND", "ANDFLAGS_COND", 
			"ORFLAGS_COND", "ANDPROPERTIES_COND", "ORPROPERTIES_COND", "FLAGVALUE_COND", 
			"HAVEITEM_COND", "HAVEITEMS_COND", "EQUALS_COND", "GT_COND", "LT_COND", 
			"TELL_EFF", "GOTO_EFF", "SETFLAG_EFF", "REMFLAG_EFF", "TAKE_EFF", "PLACE_EFF", 
			"SET_VAR_EFF", "INC_VAR_EFF", "DEC_VAR_EFF"
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
			setState(150);
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
			setState(152);
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
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(NUMERIC);
				setState(155);
				match(DOT);
				setState(156);
				match(NUMERIC);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(DOT);
				setState(158);
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
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				num_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
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
			setState(165);
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
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
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
			setState(172);
			match(LB_ROUND);
			setState(173);
			alpha_numeric();
			setState(174);
			match(COLON);
			setState(175);
			var();
			setState(176);
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
			setState(178);
			match(UNDERSCORE);
			setState(179);
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
			setState(181);
			match(ID_KEY);
			setState(182);
			match(ID);
			setState(183);
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
			setState(185);
			match(LOC_KEY);
			setState(186);
			match(ID);
			setState(187);
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

	public static class Loc_type_entryContext extends ParserRuleContext {
		public TerminalNode LOC_TYPE_KEY() { return getToken(EditorGrammarParser.LOC_TYPE_KEY, 0); }
		public Num_intContext num_int() {
			return getRuleContext(Num_intContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Loc_type_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loc_type_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterLoc_type_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitLoc_type_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitLoc_type_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loc_type_entryContext loc_type_entry() throws RecognitionException {
		Loc_type_entryContext _localctx = new Loc_type_entryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loc_type_entry);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOC_TYPE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(LOC_TYPE_KEY);
				setState(190);
				num_int();
				setState(191);
				match(SEMICOLON);
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
		enterRule(_localctx, 22, RULE_name_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(NAME_KEY);
			setState(197);
			match(STRING);
			setState(198);
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
		enterRule(_localctx, 24, RULE_desc_entry);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESC_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(DESC_KEY);
				setState(201);
				match(STRING);
				setState(202);
				match(SEMICOLON);
				}
				break;
			case RB_CURLY:
			case SYNS_KEY:
			case PROPERTIES_KEY:
			case VALUES_KEY:
			case DET_KEY:
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
		enterRule(_localctx, 26, RULE_synonyms_entry);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNS_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(SYNS_KEY);
				setState(207);
				match(STRING);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(208);
					match(COMMA);
					setState(209);
					match(STRING);
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(SEMICOLON);
				}
				break;
			case RB_CURLY:
			case PROPERTIES_KEY:
			case VALUES_KEY:
			case DET_KEY:
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

	public static class Properties_entryContext extends ParserRuleContext {
		public TerminalNode PROPERTIES_KEY() { return getToken(EditorGrammarParser.PROPERTIES_KEY, 0); }
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
		public Properties_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterProperties_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitProperties_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitProperties_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Properties_entryContext properties_entry() throws RecognitionException {
		Properties_entryContext _localctx = new Properties_entryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_properties_entry);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROPERTIES_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(PROPERTIES_KEY);
				setState(220);
				flag();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(221);
					match(COMMA);
					setState(222);
					flag();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
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
		enterRule(_localctx, 30, RULE_values_entry);
		int _la;
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(VALUES_KEY);
				setState(234);
				value();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(235);
					match(COMMA);
					setState(236);
					value();
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
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public North_condContext north_cond() {
			return getRuleContext(North_condContext.class,0);
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
		enterRule(_localctx, 32, RULE_north_entry);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORTH_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(NORTH_KEY);
				setState(248);
				match(ID);
				setState(249);
				match(SEMICOLON);
				setState(250);
				north_cond();
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
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public South_condContext south_cond() {
			return getRuleContext(South_condContext.class,0);
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
		enterRule(_localctx, 34, RULE_south_entry);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOUTH_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(SOUTH_KEY);
				setState(255);
				match(ID);
				setState(256);
				match(SEMICOLON);
				setState(257);
				south_cond();
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
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public East_condContext east_cond() {
			return getRuleContext(East_condContext.class,0);
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
		enterRule(_localctx, 36, RULE_east_entry);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EAST_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(EAST_KEY);
				setState(262);
				match(ID);
				setState(263);
				match(SEMICOLON);
				setState(264);
				east_cond();
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
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public West_condContext west_cond() {
			return getRuleContext(West_condContext.class,0);
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
		enterRule(_localctx, 38, RULE_west_entry);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WEST_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(WEST_KEY);
				setState(269);
				match(ID);
				setState(270);
				match(SEMICOLON);
				setState(271);
				west_cond();
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
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Up_condContext up_cond() {
			return getRuleContext(Up_condContext.class,0);
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
		enterRule(_localctx, 40, RULE_up_entry);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(UP_KEY);
				setState(276);
				match(ID);
				setState(277);
				match(SEMICOLON);
				setState(278);
				up_cond();
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
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Down_condContext down_cond() {
			return getRuleContext(Down_condContext.class,0);
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
		enterRule(_localctx, 42, RULE_down_entry);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOWN_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(DOWN_KEY);
				setState(283);
				match(ID);
				setState(284);
				match(SEMICOLON);
				setState(285);
				down_cond();
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

	public static class North_condContext extends ParserRuleContext {
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
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public North_block_messageContext north_block_message() {
			return getRuleContext(North_block_messageContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public North_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_north_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterNorth_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitNorth_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitNorth_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final North_condContext north_cond() throws RecognitionException {
		North_condContext _localctx = new North_condContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_north_cond);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORTH_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(NORTH_COND_KEY);
				setState(290);
				flag();
				setState(291);
				match(EQUALS);
				setState(292);
				num_int();
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(293);
					match(COMMA);
					setState(294);
					flag();
					setState(295);
					match(EQUALS);
					setState(296);
					num_int();
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(303);
				match(SEMICOLON);
				setState(304);
				north_block_message();
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

	public static class South_condContext extends ParserRuleContext {
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
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public South_block_messageContext south_block_message() {
			return getRuleContext(South_block_messageContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public South_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_south_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterSouth_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitSouth_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitSouth_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final South_condContext south_cond() throws RecognitionException {
		South_condContext _localctx = new South_condContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_south_cond);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOUTH_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(SOUTH_COND_KEY);
				setState(310);
				flag();
				setState(311);
				match(EQUALS);
				setState(312);
				num_int();
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(313);
					match(COMMA);
					setState(314);
					flag();
					setState(315);
					match(EQUALS);
					setState(316);
					num_int();
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323);
				match(SEMICOLON);
				setState(324);
				south_block_message();
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

	public static class East_condContext extends ParserRuleContext {
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
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public East_block_messageContext east_block_message() {
			return getRuleContext(East_block_messageContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public East_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_east_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterEast_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitEast_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitEast_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final East_condContext east_cond() throws RecognitionException {
		East_condContext _localctx = new East_condContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_east_cond);
		int _la;
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EAST_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(EAST_COND_KEY);
				setState(330);
				flag();
				setState(331);
				match(EQUALS);
				setState(332);
				num_int();
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(333);
					match(COMMA);
					setState(334);
					flag();
					setState(335);
					match(EQUALS);
					setState(336);
					num_int();
					}
					}
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(343);
				match(SEMICOLON);
				setState(344);
				east_block_message();
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

	public static class West_condContext extends ParserRuleContext {
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
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public West_block_messageContext west_block_message() {
			return getRuleContext(West_block_messageContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public West_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_west_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterWest_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitWest_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitWest_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final West_condContext west_cond() throws RecognitionException {
		West_condContext _localctx = new West_condContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_west_cond);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WEST_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(WEST_COND_KEY);
				setState(350);
				flag();
				setState(351);
				match(EQUALS);
				setState(352);
				num_int();
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(353);
					match(COMMA);
					setState(354);
					flag();
					setState(355);
					match(EQUALS);
					setState(356);
					num_int();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				match(SEMICOLON);
				setState(364);
				west_block_message();
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

	public static class Up_condContext extends ParserRuleContext {
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
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Up_block_messageContext up_block_message() {
			return getRuleContext(Up_block_messageContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Up_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_up_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterUp_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitUp_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitUp_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Up_condContext up_cond() throws RecognitionException {
		Up_condContext _localctx = new Up_condContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_up_cond);
		int _la;
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(UP_COND_KEY);
				setState(370);
				flag();
				setState(371);
				match(EQUALS);
				setState(372);
				num_int();
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(373);
					match(COMMA);
					setState(374);
					flag();
					setState(375);
					match(EQUALS);
					setState(376);
					num_int();
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
				match(SEMICOLON);
				setState(384);
				up_block_message();
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

	public static class Down_condContext extends ParserRuleContext {
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
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Down_block_messageContext down_block_message() {
			return getRuleContext(Down_block_messageContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Down_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_down_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterDown_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitDown_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitDown_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Down_condContext down_cond() throws RecognitionException {
		Down_condContext _localctx = new Down_condContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_down_cond);
		int _la;
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOWN_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(DOWN_COND_KEY);
				setState(390);
				flag();
				setState(391);
				match(EQUALS);
				setState(392);
				num_int();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(393);
					match(COMMA);
					setState(394);
					flag();
					setState(395);
					match(EQUALS);
					setState(396);
					num_int();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				match(SEMICOLON);
				setState(404);
				down_block_message();
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

	public static class North_block_messageContext extends ParserRuleContext {
		public TerminalNode NORTH_BLOCK_MESSAGE_KEY() { return getToken(EditorGrammarParser.NORTH_BLOCK_MESSAGE_KEY, 0); }
		public TerminalNode STRING() { return getToken(EditorGrammarParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public North_block_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_north_block_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterNorth_block_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitNorth_block_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitNorth_block_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final North_block_messageContext north_block_message() throws RecognitionException {
		North_block_messageContext _localctx = new North_block_messageContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_north_block_message);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORTH_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(NORTH_BLOCK_MESSAGE_KEY);
				setState(410);
				match(STRING);
				setState(411);
				match(SEMICOLON);
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

	public static class South_block_messageContext extends ParserRuleContext {
		public TerminalNode SOUTH_BLOCK_MESSAGE_KEY() { return getToken(EditorGrammarParser.SOUTH_BLOCK_MESSAGE_KEY, 0); }
		public TerminalNode STRING() { return getToken(EditorGrammarParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public South_block_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_south_block_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterSouth_block_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitSouth_block_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitSouth_block_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final South_block_messageContext south_block_message() throws RecognitionException {
		South_block_messageContext _localctx = new South_block_messageContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_south_block_message);
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOUTH_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(SOUTH_BLOCK_MESSAGE_KEY);
				setState(416);
				match(STRING);
				setState(417);
				match(SEMICOLON);
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

	public static class East_block_messageContext extends ParserRuleContext {
		public TerminalNode EAST_BLOCK_MESSAGE_KEY() { return getToken(EditorGrammarParser.EAST_BLOCK_MESSAGE_KEY, 0); }
		public TerminalNode STRING() { return getToken(EditorGrammarParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public East_block_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_east_block_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterEast_block_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitEast_block_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitEast_block_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final East_block_messageContext east_block_message() throws RecognitionException {
		East_block_messageContext _localctx = new East_block_messageContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_east_block_message);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EAST_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(EAST_BLOCK_MESSAGE_KEY);
				setState(422);
				match(STRING);
				setState(423);
				match(SEMICOLON);
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

	public static class West_block_messageContext extends ParserRuleContext {
		public TerminalNode WEST_BLOCK_MESSAGE_KEY() { return getToken(EditorGrammarParser.WEST_BLOCK_MESSAGE_KEY, 0); }
		public TerminalNode STRING() { return getToken(EditorGrammarParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public West_block_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_west_block_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterWest_block_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitWest_block_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitWest_block_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final West_block_messageContext west_block_message() throws RecognitionException {
		West_block_messageContext _localctx = new West_block_messageContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_west_block_message);
		try {
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WEST_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(WEST_BLOCK_MESSAGE_KEY);
				setState(428);
				match(STRING);
				setState(429);
				match(SEMICOLON);
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

	public static class Up_block_messageContext extends ParserRuleContext {
		public TerminalNode UP_BLOCK_MESSAGE_KEY() { return getToken(EditorGrammarParser.UP_BLOCK_MESSAGE_KEY, 0); }
		public TerminalNode STRING() { return getToken(EditorGrammarParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Up_block_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_up_block_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterUp_block_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitUp_block_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitUp_block_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Up_block_messageContext up_block_message() throws RecognitionException {
		Up_block_messageContext _localctx = new Up_block_messageContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_up_block_message);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(UP_BLOCK_MESSAGE_KEY);
				setState(434);
				match(STRING);
				setState(435);
				match(SEMICOLON);
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

	public static class Down_block_messageContext extends ParserRuleContext {
		public TerminalNode DOWN_BLOCK_MESSAGE_KEY() { return getToken(EditorGrammarParser.DOWN_BLOCK_MESSAGE_KEY, 0); }
		public TerminalNode STRING() { return getToken(EditorGrammarParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Down_block_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_down_block_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterDown_block_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitDown_block_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitDown_block_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Down_block_messageContext down_block_message() throws RecognitionException {
		Down_block_messageContext _localctx = new Down_block_messageContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_down_block_message);
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOWN_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(DOWN_BLOCK_MESSAGE_KEY);
				setState(440);
				match(STRING);
				setState(441);
				match(SEMICOLON);
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
		enterRule(_localctx, 68, RULE_action_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(ACTION_KEY);
			setState(446);
			action_block();
			setState(447);
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
		enterRule(_localctx, 70, RULE_global_flag_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(FLAG_KEY);
			setState(450);
			flag();
			setState(451);
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
		enterRule(_localctx, 72, RULE_flag_val_entry);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(VALUE_KEY);
				setState(454);
				num_int();
				setState(455);
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

	public static class Det_entryContext extends ParserRuleContext {
		public TerminalNode DET_KEY() { return getToken(EditorGrammarParser.DET_KEY, 0); }
		public TerminalNode STRING() { return getToken(EditorGrammarParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Det_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_det_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterDet_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitDet_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitDet_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Det_entryContext det_entry() throws RecognitionException {
		Det_entryContext _localctx = new Det_entryContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_det_entry);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DET_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(DET_KEY);
				setState(461);
				match(STRING);
				setState(462);
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
		public Loc_type_entryContext loc_type_entry() {
			return getRuleContext(Loc_type_entryContext.class,0);
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
		public Properties_entryContext properties_entry() {
			return getRuleContext(Properties_entryContext.class,0);
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
		enterRule(_localctx, 76, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(OBJECT_TAG);
			setState(467);
			match(LB_CURLY);
			setState(468);
			id_entry();
			setState(469);
			loc_entry();
			setState(470);
			loc_type_entry();
			setState(471);
			name_entry();
			setState(472);
			desc_entry();
			setState(473);
			synonyms_entry();
			setState(474);
			properties_entry();
			setState(475);
			values_entry();
			setState(476);
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
		public Det_entryContext det_entry() {
			return getRuleContext(Det_entryContext.class,0);
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
		enterRule(_localctx, 78, RULE_room);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(ROOM_TAG);
			setState(479);
			match(LB_CURLY);
			setState(480);
			id_entry();
			setState(481);
			north_entry();
			setState(482);
			south_entry();
			setState(483);
			east_entry();
			setState(484);
			west_entry();
			setState(485);
			up_entry();
			setState(486);
			down_entry();
			setState(487);
			name_entry();
			setState(488);
			desc_entry();
			setState(489);
			synonyms_entry();
			setState(490);
			det_entry();
			setState(491);
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
		enterRule(_localctx, 80, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(ACTION_TAG);
			setState(494);
			match(LB_CURLY);
			setState(495);
			id_entry();
			setState(496);
			action_entry();
			setState(497);
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
		enterRule(_localctx, 82, RULE_global_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(FLAG_TAG);
			setState(500);
			match(LB_CURLY);
			setState(501);
			global_flag_entry();
			setState(502);
			flag_val_entry();
			setState(503);
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
		enterRule(_localctx, 84, RULE_action_block);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				effect_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				effect_aux();
				setState(507);
				action_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(510);
				conditional();
				setState(511);
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
		enterRule(_localctx, 86, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(COND_TAG);
			setState(516);
			match(LB_SHARP);
			setState(517);
			conditions();
			setState(518);
			match(RB_SHARP);
			setState(519);
			match(LB_CURLY);
			setState(520);
			action_block();
			setState(521);
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
		enterRule(_localctx, 88, RULE_conditions);
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				condition_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				condition_aux();
				setState(525);
				match(AND);
				setState(526);
				conditions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				condition_aux();
				setState(529);
				match(OR);
				setState(530);
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
		enterRule(_localctx, 90, RULE_effect_aux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(EFFECT_TAG);
			setState(535);
			match(LB_SHARP);
			setState(536);
			effect();
			setState(537);
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
		enterRule(_localctx, 92, RULE_condition_aux);
		try {
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRSA_COND:
			case PRSA_AND_COND:
			case PRSO_COND:
			case PRSI_COND:
			case HERE_COND:
			case INSCOPE_COND:
			case ANDFLAGS_COND:
			case ORFLAGS_COND:
			case ANDPROPERTIES_COND:
			case ORPROPERTIES_COND:
			case FLAGVALUE_COND:
			case HAVEITEM_COND:
			case HAVEITEMS_COND:
			case EQUALS_COND:
			case GT_COND:
			case LT_COND:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				condition();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				match(NOT);
				setState(541);
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
		public List<TerminalNode> IN_TAG() { return getTokens(EditorGrammarParser.IN_TAG); }
		public TerminalNode IN_TAG(int i) {
			return getToken(EditorGrammarParser.IN_TAG, i);
		}
		public List<TerminalNode> ON_TAG() { return getTokens(EditorGrammarParser.ON_TAG); }
		public TerminalNode ON_TAG(int i) {
			return getToken(EditorGrammarParser.ON_TAG, i);
		}
		public List<TerminalNode> UNDER_TAG() { return getTokens(EditorGrammarParser.UNDER_TAG); }
		public TerminalNode UNDER_TAG(int i) {
			return getToken(EditorGrammarParser.UNDER_TAG, i);
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
		enterRule(_localctx, 94, RULE_prsa_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(PRSA_COND);
			setState(545);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN_TAG) | (1L << ON_TAG) | (1L << UNDER_TAG) | (1L << ALPHA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(546);
				match(COMMA);
				setState(547);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN_TAG) | (1L << ON_TAG) | (1L << UNDER_TAG) | (1L << ALPHA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(552);
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

	public static class Prsa_and_condContext extends ParserRuleContext {
		public TerminalNode PRSA_AND_COND() { return getToken(EditorGrammarParser.PRSA_AND_COND, 0); }
		public List<TerminalNode> ALPHA() { return getTokens(EditorGrammarParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(EditorGrammarParser.ALPHA, i);
		}
		public List<TerminalNode> IN_TAG() { return getTokens(EditorGrammarParser.IN_TAG); }
		public TerminalNode IN_TAG(int i) {
			return getToken(EditorGrammarParser.IN_TAG, i);
		}
		public List<TerminalNode> ON_TAG() { return getTokens(EditorGrammarParser.ON_TAG); }
		public TerminalNode ON_TAG(int i) {
			return getToken(EditorGrammarParser.ON_TAG, i);
		}
		public List<TerminalNode> UNDER_TAG() { return getTokens(EditorGrammarParser.UNDER_TAG); }
		public TerminalNode UNDER_TAG(int i) {
			return getToken(EditorGrammarParser.UNDER_TAG, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Prsa_and_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prsa_and_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterPrsa_and_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitPrsa_and_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitPrsa_and_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prsa_and_condContext prsa_and_cond() throws RecognitionException {
		Prsa_and_condContext _localctx = new Prsa_and_condContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_prsa_and_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(PRSA_AND_COND);
			setState(554);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN_TAG) | (1L << ON_TAG) | (1L << UNDER_TAG) | (1L << ALPHA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(555);
				match(COMMA);
				setState(556);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN_TAG) | (1L << ON_TAG) | (1L << UNDER_TAG) | (1L << ALPHA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(561);
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
		enterRule(_localctx, 98, RULE_prso_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(PRSO_COND);
			setState(563);
			match(ID);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(564);
				match(COMMA);
				setState(565);
				match(ID);
				}
				}
				setState(570);
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
		enterRule(_localctx, 100, RULE_prsi_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(PRSI_COND);
			setState(572);
			match(ID);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(573);
				match(COMMA);
				setState(574);
				match(ID);
				}
				}
				setState(579);
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
		enterRule(_localctx, 102, RULE_here_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(HERE_COND);
			setState(581);
			match(ID);
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(582);
				match(COMMA);
				setState(583);
				match(ID);
				}
				}
				setState(588);
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

	public static class Inscope_condContext extends ParserRuleContext {
		public TerminalNode INSCOPE_COND() { return getToken(EditorGrammarParser.INSCOPE_COND, 0); }
		public List<TerminalNode> ID() { return getTokens(EditorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EditorGrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Inscope_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inscope_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterInscope_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitInscope_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitInscope_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inscope_condContext inscope_cond() throws RecognitionException {
		Inscope_condContext _localctx = new Inscope_condContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_inscope_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(INSCOPE_COND);
			setState(590);
			match(ID);
			setState(591);
			match(COMMA);
			setState(592);
			match(ID);
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(593);
				match(COMMA);
				setState(594);
				match(ID);
				}
				}
				setState(599);
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
		enterRule(_localctx, 106, RULE_andflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(ANDFLAGS_COND);
			setState(601);
			flag();
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(602);
				match(COMMA);
				setState(603);
				flag();
				}
				}
				setState(608);
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
		enterRule(_localctx, 108, RULE_orflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(ORFLAGS_COND);
			setState(610);
			flag();
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(611);
				match(COMMA);
				setState(612);
				flag();
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

	public static class Andproperties_condContext extends ParserRuleContext {
		public TerminalNode ANDPROPERTIES_COND() { return getToken(EditorGrammarParser.ANDPROPERTIES_COND, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public List<FlagContext> flag() {
			return getRuleContexts(FlagContext.class);
		}
		public FlagContext flag(int i) {
			return getRuleContext(FlagContext.class,i);
		}
		public Andproperties_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andproperties_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterAndproperties_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitAndproperties_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitAndproperties_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Andproperties_condContext andproperties_cond() throws RecognitionException {
		Andproperties_condContext _localctx = new Andproperties_condContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_andproperties_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(ANDPROPERTIES_COND);
			setState(619);
			match(ID);
			setState(620);
			match(COMMA);
			setState(621);
			flag();
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(622);
				match(COMMA);
				setState(623);
				flag();
				}
				}
				setState(628);
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

	public static class Orproperties_condContext extends ParserRuleContext {
		public TerminalNode ORPROPERTIES_COND() { return getToken(EditorGrammarParser.ORPROPERTIES_COND, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public List<FlagContext> flag() {
			return getRuleContexts(FlagContext.class);
		}
		public FlagContext flag(int i) {
			return getRuleContext(FlagContext.class,i);
		}
		public Orproperties_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orproperties_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterOrproperties_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitOrproperties_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitOrproperties_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orproperties_condContext orproperties_cond() throws RecognitionException {
		Orproperties_condContext _localctx = new Orproperties_condContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_orproperties_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(ORPROPERTIES_COND);
			setState(630);
			match(ID);
			setState(631);
			match(COMMA);
			setState(632);
			flag();
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(633);
				match(COMMA);
				setState(634);
				flag();
				}
				}
				setState(639);
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
		enterRule(_localctx, 114, RULE_flagvalue_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(FLAGVALUE_COND);
			setState(641);
			flag();
			setState(642);
			match(COMMA);
			setState(643);
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
		enterRule(_localctx, 116, RULE_haveitem_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(HAVEITEM_COND);
			setState(646);
			match(ID);
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(647);
				match(COMMA);
				setState(648);
				match(ID);
				}
				}
				setState(653);
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
		enterRule(_localctx, 118, RULE_haveitems_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(HAVEITEMS_COND);
			setState(655);
			match(ID);
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(656);
				match(COMMA);
				setState(657);
				match(ID);
				}
				}
				setState(662);
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
		public List<TerminalNode> ID() { return getTokens(EditorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EditorGrammarParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(EditorGrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(EditorGrammarParser.COLON, i);
		}
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
		enterRule(_localctx, 120, RULE_equals_cond);
		try {
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				match(EQUALS_COND);
				setState(664);
				match(ID);
				setState(665);
				match(COLON);
				setState(666);
				alpha_numeric();
				setState(667);
				match(COMMA);
				setState(668);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				match(EQUALS_COND);
				setState(671);
				match(ID);
				setState(672);
				match(COLON);
				setState(673);
				alpha_numeric();
				setState(674);
				match(COMMA);
				setState(675);
				match(ID);
				setState(676);
				match(COLON);
				setState(677);
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
		public List<TerminalNode> ID() { return getTokens(EditorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EditorGrammarParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(EditorGrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(EditorGrammarParser.COLON, i);
		}
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
		enterRule(_localctx, 122, RULE_gt_cond);
		try {
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				match(GT_COND);
				setState(682);
				match(ID);
				setState(683);
				match(COLON);
				setState(684);
				alpha_numeric();
				setState(685);
				match(COMMA);
				setState(686);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				match(GT_COND);
				setState(689);
				match(ID);
				setState(690);
				match(COLON);
				setState(691);
				alpha_numeric();
				setState(692);
				match(COMMA);
				setState(693);
				match(ID);
				setState(694);
				match(COLON);
				setState(695);
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
		public List<TerminalNode> ID() { return getTokens(EditorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EditorGrammarParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(EditorGrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(EditorGrammarParser.COLON, i);
		}
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
		enterRule(_localctx, 124, RULE_lt_cond);
		try {
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				match(LT_COND);
				setState(700);
				match(ID);
				setState(701);
				match(COLON);
				setState(702);
				alpha_numeric();
				setState(703);
				match(COMMA);
				setState(704);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				match(LT_COND);
				setState(707);
				match(ID);
				setState(708);
				match(COLON);
				setState(709);
				alpha_numeric();
				setState(710);
				match(COMMA);
				setState(711);
				match(ID);
				setState(712);
				match(COLON);
				setState(713);
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
		public Prsa_and_condContext prsa_and_cond() {
			return getRuleContext(Prsa_and_condContext.class,0);
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
		public Inscope_condContext inscope_cond() {
			return getRuleContext(Inscope_condContext.class,0);
		}
		public Andflags_condContext andflags_cond() {
			return getRuleContext(Andflags_condContext.class,0);
		}
		public Orflags_condContext orflags_cond() {
			return getRuleContext(Orflags_condContext.class,0);
		}
		public Andproperties_condContext andproperties_cond() {
			return getRuleContext(Andproperties_condContext.class,0);
		}
		public Orproperties_condContext orproperties_cond() {
			return getRuleContext(Orproperties_condContext.class,0);
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
		enterRule(_localctx, 126, RULE_condition);
		try {
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRSA_COND:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				prsa_cond();
				}
				break;
			case PRSA_AND_COND:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				prsa_and_cond();
				}
				break;
			case PRSO_COND:
				enterOuterAlt(_localctx, 3);
				{
				setState(719);
				prso_cond();
				}
				break;
			case PRSI_COND:
				enterOuterAlt(_localctx, 4);
				{
				setState(720);
				prsi_cond();
				}
				break;
			case HERE_COND:
				enterOuterAlt(_localctx, 5);
				{
				setState(721);
				here_cond();
				}
				break;
			case INSCOPE_COND:
				enterOuterAlt(_localctx, 6);
				{
				setState(722);
				inscope_cond();
				}
				break;
			case ANDFLAGS_COND:
				enterOuterAlt(_localctx, 7);
				{
				setState(723);
				andflags_cond();
				}
				break;
			case ORFLAGS_COND:
				enterOuterAlt(_localctx, 8);
				{
				setState(724);
				orflags_cond();
				}
				break;
			case ANDPROPERTIES_COND:
				enterOuterAlt(_localctx, 9);
				{
				setState(725);
				andproperties_cond();
				}
				break;
			case ORPROPERTIES_COND:
				enterOuterAlt(_localctx, 10);
				{
				setState(726);
				orproperties_cond();
				}
				break;
			case FLAGVALUE_COND:
				enterOuterAlt(_localctx, 11);
				{
				setState(727);
				flagvalue_cond();
				}
				break;
			case HAVEITEM_COND:
				enterOuterAlt(_localctx, 12);
				{
				setState(728);
				haveitem_cond();
				}
				break;
			case HAVEITEMS_COND:
				enterOuterAlt(_localctx, 13);
				{
				setState(729);
				haveitems_cond();
				}
				break;
			case EQUALS_COND:
				enterOuterAlt(_localctx, 14);
				{
				setState(730);
				equals_cond();
				}
				break;
			case GT_COND:
				enterOuterAlt(_localctx, 15);
				{
				setState(731);
				gt_cond();
				}
				break;
			case LT_COND:
				enterOuterAlt(_localctx, 16);
				{
				setState(732);
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
		enterRule(_localctx, 128, RULE_tell_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(TELL_EFF);
			setState(736);
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
		enterRule(_localctx, 130, RULE_goto_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(GOTO_EFF);
			setState(739);
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
		enterRule(_localctx, 132, RULE_setflag_eff);
		try {
			setState(748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				match(SETFLAG_EFF);
				setState(742);
				flag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				match(SETFLAG_EFF);
				setState(744);
				flag();
				setState(745);
				match(COMMA);
				setState(746);
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
		enterRule(_localctx, 134, RULE_remflag_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(REMFLAG_EFF);
			setState(751);
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
		enterRule(_localctx, 136, RULE_take_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(TAKE_EFF);
			setState(754);
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
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public TerminalNode IN_TAG() { return getToken(EditorGrammarParser.IN_TAG, 0); }
		public TerminalNode ON_TAG() { return getToken(EditorGrammarParser.ON_TAG, 0); }
		public TerminalNode UNDER_TAG() { return getToken(EditorGrammarParser.UNDER_TAG, 0); }
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
		enterRule(_localctx, 138, RULE_place_eff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(PLACE_EFF);
			setState(757);
			match(ID);
			setState(758);
			match(COMMA);
			setState(759);
			match(ID);
			setState(760);
			match(COMMA);
			setState(761);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN_TAG) | (1L << ON_TAG) | (1L << UNDER_TAG))) != 0)) ) {
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

	public static class Set_var_effContext extends ParserRuleContext {
		public TerminalNode SET_VAR_EFF() { return getToken(EditorGrammarParser.SET_VAR_EFF, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Alpha_numericContext alpha_numeric() {
			return getRuleContext(Alpha_numericContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(EditorGrammarParser.COMMA, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Set_var_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_var_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterSet_var_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitSet_var_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitSet_var_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_var_effContext set_var_eff() throws RecognitionException {
		Set_var_effContext _localctx = new Set_var_effContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_set_var_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(SET_VAR_EFF);
			setState(764);
			match(ID);
			setState(765);
			match(SEMICOLON);
			setState(766);
			alpha_numeric();
			setState(767);
			match(COMMA);
			setState(768);
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

	public static class Inc_var_effContext extends ParserRuleContext {
		public TerminalNode INC_VAR_EFF() { return getToken(EditorGrammarParser.INC_VAR_EFF, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Alpha_numericContext alpha_numeric() {
			return getRuleContext(Alpha_numericContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(EditorGrammarParser.COMMA, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Inc_var_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_var_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterInc_var_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitInc_var_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitInc_var_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inc_var_effContext inc_var_eff() throws RecognitionException {
		Inc_var_effContext _localctx = new Inc_var_effContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_inc_var_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(INC_VAR_EFF);
			setState(771);
			match(ID);
			setState(772);
			match(SEMICOLON);
			setState(773);
			alpha_numeric();
			setState(774);
			match(COMMA);
			setState(775);
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

	public static class Dec_var_effContext extends ParserRuleContext {
		public TerminalNode DEC_VAR_EFF() { return getToken(EditorGrammarParser.DEC_VAR_EFF, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Alpha_numericContext alpha_numeric() {
			return getRuleContext(Alpha_numericContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(EditorGrammarParser.COMMA, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Dec_var_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_var_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterDec_var_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitDec_var_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitDec_var_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_var_effContext dec_var_eff() throws RecognitionException {
		Dec_var_effContext _localctx = new Dec_var_effContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_dec_var_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(DEC_VAR_EFF);
			setState(778);
			match(ID);
			setState(779);
			match(SEMICOLON);
			setState(780);
			alpha_numeric();
			setState(781);
			match(COMMA);
			setState(782);
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
		public Set_var_effContext set_var_eff() {
			return getRuleContext(Set_var_effContext.class,0);
		}
		public Inc_var_effContext inc_var_eff() {
			return getRuleContext(Inc_var_effContext.class,0);
		}
		public Dec_var_effContext dec_var_eff() {
			return getRuleContext(Dec_var_effContext.class,0);
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
		enterRule(_localctx, 146, RULE_effect);
		try {
			setState(793);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TELL_EFF:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				tell_eff();
				}
				break;
			case GOTO_EFF:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				goto_eff();
				}
				break;
			case SETFLAG_EFF:
				enterOuterAlt(_localctx, 3);
				{
				setState(786);
				setflag_eff();
				}
				break;
			case REMFLAG_EFF:
				enterOuterAlt(_localctx, 4);
				{
				setState(787);
				remflag_eff();
				}
				break;
			case TAKE_EFF:
				enterOuterAlt(_localctx, 5);
				{
				setState(788);
				take_eff();
				}
				break;
			case PLACE_EFF:
				enterOuterAlt(_localctx, 6);
				{
				setState(789);
				place_eff();
				}
				break;
			case SET_VAR_EFF:
				enterOuterAlt(_localctx, 7);
				{
				setState(790);
				set_var_eff();
				}
				break;
			case INC_VAR_EFF:
				enterOuterAlt(_localctx, 8);
				{
				setState(791);
				inc_var_eff();
				}
				break;
			case DEC_VAR_EFF:
				enterOuterAlt(_localctx, 9);
				{
				setState(792);
				dec_var_eff();
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
		enterRule(_localctx, 148, RULE_game_grammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			room();
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECT_TAG) | (1L << ROOM_TAG) | (1L << ACTION_TAG) | (1L << FLAG_TAG))) != 0)) {
				{
				setState(800);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ROOM_TAG:
					{
					setState(796);
					room();
					}
					break;
				case OBJECT_TAG:
					{
					setState(797);
					object();
					}
					break;
				case ACTION_TAG:
					{
					setState(798);
					action();
					}
					break;
				case FLAG_TAG:
					{
					setState(799);
					global_flag();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(804);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3a\u0328\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\u00a2\n"+
		"\4\3\5\3\5\5\5\u00a6\n\5\3\6\3\6\3\7\3\7\3\7\5\7\u00ad\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00c5\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00cf"+
		"\n\16\3\17\3\17\3\17\3\17\7\17\u00d5\n\17\f\17\16\17\u00d8\13\17\3\17"+
		"\3\17\5\17\u00dc\n\17\3\20\3\20\3\20\3\20\7\20\u00e2\n\20\f\20\16\20\u00e5"+
		"\13\20\3\20\3\20\3\20\5\20\u00ea\n\20\3\21\3\21\3\21\3\21\7\21\u00f0\n"+
		"\21\f\21\16\21\u00f3\13\21\3\21\3\21\3\21\5\21\u00f8\n\21\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u00ff\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0106\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u010d\n\24\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0114\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u011b\n\26\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u0122\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u012d\n\30\f\30\16\30\u0130\13\30\3\30\3\30\3\30\3\30\5\30\u0136"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0141\n\31\f\31"+
		"\16\31\u0144\13\31\3\31\3\31\3\31\3\31\5\31\u014a\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0155\n\32\f\32\16\32\u0158\13\32"+
		"\3\32\3\32\3\32\3\32\5\32\u015e\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\7\33\u0169\n\33\f\33\16\33\u016c\13\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0172\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u017d"+
		"\n\34\f\34\16\34\u0180\13\34\3\34\3\34\3\34\3\34\5\34\u0186\n\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0191\n\35\f\35\16\35\u0194"+
		"\13\35\3\35\3\35\3\35\3\35\5\35\u019a\n\35\3\36\3\36\3\36\3\36\5\36\u01a0"+
		"\n\36\3\37\3\37\3\37\3\37\5\37\u01a6\n\37\3 \3 \3 \3 \5 \u01ac\n \3!\3"+
		"!\3!\3!\5!\u01b2\n!\3\"\3\"\3\"\3\"\5\"\u01b8\n\"\3#\3#\3#\3#\5#\u01be"+
		"\n#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\5&\u01cd\n&\3\'\3\'\3\'\3\'"+
		"\5\'\u01d3\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3"+
		",\3,\3,\3,\3,\3,\5,\u0204\n,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\5.\u0217\n.\3/\3/\3/\3/\3/\3\60\3\60\3\60\5\60\u0221\n\60\3"+
		"\61\3\61\3\61\3\61\7\61\u0227\n\61\f\61\16\61\u022a\13\61\3\62\3\62\3"+
		"\62\3\62\7\62\u0230\n\62\f\62\16\62\u0233\13\62\3\63\3\63\3\63\3\63\7"+
		"\63\u0239\n\63\f\63\16\63\u023c\13\63\3\64\3\64\3\64\3\64\7\64\u0242\n"+
		"\64\f\64\16\64\u0245\13\64\3\65\3\65\3\65\3\65\7\65\u024b\n\65\f\65\16"+
		"\65\u024e\13\65\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0256\n\66\f\66\16"+
		"\66\u0259\13\66\3\67\3\67\3\67\3\67\7\67\u025f\n\67\f\67\16\67\u0262\13"+
		"\67\38\38\38\38\78\u0268\n8\f8\168\u026b\138\39\39\39\39\39\39\79\u0273"+
		"\n9\f9\169\u0276\139\3:\3:\3:\3:\3:\3:\7:\u027e\n:\f:\16:\u0281\13:\3"+
		";\3;\3;\3;\3;\3<\3<\3<\3<\7<\u028c\n<\f<\16<\u028f\13<\3=\3=\3=\3=\7="+
		"\u0295\n=\f=\16=\u0298\13=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\5>\u02aa\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u02bc"+
		"\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u02ce\n@\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u02e0\nA\3B\3B\3B\3C\3C"+
		"\3C\3D\3D\3D\3D\3D\3D\3D\5D\u02ef\nD\3E\3E\3E\3F\3F\3F\3G\3G\3G\3G\3G"+
		"\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J"+
		"\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u031c\nK\3L\3L\3L\3L\3L\7L\u0323\nL\fL"+
		"\16L\u0326\13L\3L\2\2M\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\2\6\3\2!#\3\2\26\27\4"+
		"\2\35\37!!\3\2\35\37\2\u0333\2\u0098\3\2\2\2\4\u009a\3\2\2\2\6\u00a1\3"+
		"\2\2\2\b\u00a5\3\2\2\2\n\u00a7\3\2\2\2\f\u00ac\3\2\2\2\16\u00ae\3\2\2"+
		"\2\20\u00b4\3\2\2\2\22\u00b7\3\2\2\2\24\u00bb\3\2\2\2\26\u00c4\3\2\2\2"+
		"\30\u00c6\3\2\2\2\32\u00ce\3\2\2\2\34\u00db\3\2\2\2\36\u00e9\3\2\2\2 "+
		"\u00f7\3\2\2\2\"\u00fe\3\2\2\2$\u0105\3\2\2\2&\u010c\3\2\2\2(\u0113\3"+
		"\2\2\2*\u011a\3\2\2\2,\u0121\3\2\2\2.\u0135\3\2\2\2\60\u0149\3\2\2\2\62"+
		"\u015d\3\2\2\2\64\u0171\3\2\2\2\66\u0185\3\2\2\28\u0199\3\2\2\2:\u019f"+
		"\3\2\2\2<\u01a5\3\2\2\2>\u01ab\3\2\2\2@\u01b1\3\2\2\2B\u01b7\3\2\2\2D"+
		"\u01bd\3\2\2\2F\u01bf\3\2\2\2H\u01c3\3\2\2\2J\u01cc\3\2\2\2L\u01d2\3\2"+
		"\2\2N\u01d4\3\2\2\2P\u01e0\3\2\2\2R\u01ef\3\2\2\2T\u01f5\3\2\2\2V\u0203"+
		"\3\2\2\2X\u0205\3\2\2\2Z\u0216\3\2\2\2\\\u0218\3\2\2\2^\u0220\3\2\2\2"+
		"`\u0222\3\2\2\2b\u022b\3\2\2\2d\u0234\3\2\2\2f\u023d\3\2\2\2h\u0246\3"+
		"\2\2\2j\u024f\3\2\2\2l\u025a\3\2\2\2n\u0263\3\2\2\2p\u026c\3\2\2\2r\u0277"+
		"\3\2\2\2t\u0282\3\2\2\2v\u0287\3\2\2\2x\u0290\3\2\2\2z\u02a9\3\2\2\2|"+
		"\u02bb\3\2\2\2~\u02cd\3\2\2\2\u0080\u02df\3\2\2\2\u0082\u02e1\3\2\2\2"+
		"\u0084\u02e4\3\2\2\2\u0086\u02ee\3\2\2\2\u0088\u02f0\3\2\2\2\u008a\u02f3"+
		"\3\2\2\2\u008c\u02f6\3\2\2\2\u008e\u02fd\3\2\2\2\u0090\u0304\3\2\2\2\u0092"+
		"\u030b\3\2\2\2\u0094\u031b\3\2\2\2\u0096\u031d\3\2\2\2\u0098\u0099\t\2"+
		"\2\2\u0099\3\3\2\2\2\u009a\u009b\7\"\2\2\u009b\5\3\2\2\2\u009c\u009d\7"+
		"\"\2\2\u009d\u009e\7\20\2\2\u009e\u00a2\7\"\2\2\u009f\u00a0\7\20\2\2\u00a0"+
		"\u00a2\7\"\2\2\u00a1\u009c\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\7\3\2\2\2"+
		"\u00a3\u00a6\5\4\3\2\u00a4\u00a6\5\6\4\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4"+
		"\3\2\2\2\u00a6\t\3\2\2\2\u00a7\u00a8\t\3\2\2\u00a8\13\3\2\2\2\u00a9\u00ad"+
		"\5\b\5\2\u00aa\u00ad\7%\2\2\u00ab\u00ad\5\n\6\2\u00ac\u00a9\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\r\3\2\2\2\u00ae\u00af\7\13\2"+
		"\2\u00af\u00b0\5\2\2\2\u00b0\u00b1\7\3\2\2\u00b1\u00b2\5\f\7\2\u00b2\u00b3"+
		"\7\f\2\2\u00b3\17\3\2\2\2\u00b4\u00b5\7\16\2\2\u00b5\u00b6\5\2\2\2\u00b6"+
		"\21\3\2\2\2\u00b7\u00b8\7+\2\2\u00b8\u00b9\7&\2\2\u00b9\u00ba\7\4\2\2"+
		"\u00ba\23\3\2\2\2\u00bb\u00bc\7,\2\2\u00bc\u00bd\7&\2\2\u00bd\u00be\7"+
		"\4\2\2\u00be\25\3\2\2\2\u00bf\u00c0\7-\2\2\u00c0\u00c1\5\4\3\2\u00c1\u00c2"+
		"\7\4\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\27\3\2\2\2\u00c6\u00c7\7.\2\2\u00c7\u00c8\7%\2\2"+
		"\u00c8\u00c9\7\4\2\2\u00c9\31\3\2\2\2\u00ca\u00cb\7/\2\2\u00cb\u00cc\7"+
		"%\2\2\u00cc\u00cf\7\4\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\33\3\2\2\2\u00d0\u00d1\7\60\2\2\u00d1\u00d6\7%\2"+
		"\2\u00d2\u00d3\7\17\2\2\u00d3\u00d5\7%\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00dc\7\4\2\2\u00da\u00dc\3\2\2\2\u00db\u00d0\3\2"+
		"\2\2\u00db\u00da\3\2\2\2\u00dc\35\3\2\2\2\u00dd\u00de\7\61\2\2\u00de\u00e3"+
		"\5\20\t\2\u00df\u00e0\7\17\2\2\u00e0\u00e2\5\20\t\2\u00e1\u00df\3\2\2"+
		"\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\4\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\37\3\2\2"+
		"\2\u00eb\u00ec\7\63\2\2\u00ec\u00f1\5\16\b\2\u00ed\u00ee\7\17\2\2\u00ee"+
		"\u00f0\5\16\b\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\7\4\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00eb\3\2"+
		"\2\2\u00f7\u00f6\3\2\2\2\u00f8!\3\2\2\2\u00f9\u00fa\7\65\2\2\u00fa\u00fb"+
		"\7&\2\2\u00fb\u00fc\7\4\2\2\u00fc\u00ff\5.\30\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00f9\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff#\3\2\2\2\u0100\u0101\7\66\2\2"+
		"\u0101\u0102\7&\2\2\u0102\u0103\7\4\2\2\u0103\u0106\5\60\31\2\u0104\u0106"+
		"\3\2\2\2\u0105\u0100\3\2\2\2\u0105\u0104\3\2\2\2\u0106%\3\2\2\2\u0107"+
		"\u0108\7\67\2\2\u0108\u0109\7&\2\2\u0109\u010a\7\4\2\2\u010a\u010d\5\62"+
		"\32\2\u010b\u010d\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\'\3\2\2\2\u010e\u010f\78\2\2\u010f\u0110\7&\2\2\u0110\u0111\7\4\2\2\u0111"+
		"\u0114\5\64\33\2\u0112\u0114\3\2\2\2\u0113\u010e\3\2\2\2\u0113\u0112\3"+
		"\2\2\2\u0114)\3\2\2\2\u0115\u0116\79\2\2\u0116\u0117\7&\2\2\u0117\u0118"+
		"\7\4\2\2\u0118\u011b\5\66\34\2\u0119\u011b\3\2\2\2\u011a\u0115\3\2\2\2"+
		"\u011a\u0119\3\2\2\2\u011b+\3\2\2\2\u011c\u011d\7:\2\2\u011d\u011e\7&"+
		"\2\2\u011e\u011f\7\4\2\2\u011f\u0122\58\35\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011c\3\2\2\2\u0121\u0120\3\2\2\2\u0122-\3\2\2\2\u0123\u0124\7;\2\2\u0124"+
		"\u0125\5\20\t\2\u0125\u0126\7\25\2\2\u0126\u012e\5\4\3\2\u0127\u0128\7"+
		"\17\2\2\u0128\u0129\5\20\t\2\u0129\u012a\7\25\2\2\u012a\u012b\5\4\3\2"+
		"\u012b\u012d\3\2\2\2\u012c\u0127\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0132\7\4\2\2\u0132\u0133\5:\36\2\u0133\u0136\3\2\2\2\u0134\u0136\3\2"+
		"\2\2\u0135\u0123\3\2\2\2\u0135\u0134\3\2\2\2\u0136/\3\2\2\2\u0137\u0138"+
		"\7<\2\2\u0138\u0139\5\20\t\2\u0139\u013a\7\25\2\2\u013a\u0142\5\4\3\2"+
		"\u013b\u013c\7\17\2\2\u013c\u013d\5\20\t\2\u013d\u013e\7\25\2\2\u013e"+
		"\u013f\5\4\3\2\u013f\u0141\3\2\2\2\u0140\u013b\3\2\2\2\u0141\u0144\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0146\7\4\2\2\u0146\u0147\5<\37\2\u0147\u014a\3\2"+
		"\2\2\u0148\u014a\3\2\2\2\u0149\u0137\3\2\2\2\u0149\u0148\3\2\2\2\u014a"+
		"\61\3\2\2\2\u014b\u014c\7=\2\2\u014c\u014d\5\20\t\2\u014d\u014e\7\25\2"+
		"\2\u014e\u0156\5\4\3\2\u014f\u0150\7\17\2\2\u0150\u0151\5\20\t\2\u0151"+
		"\u0152\7\25\2\2\u0152\u0153\5\4\3\2\u0153\u0155\3\2\2\2\u0154\u014f\3"+
		"\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7\4\2\2\u015a\u015b\5>"+
		" \2\u015b\u015e\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u014b\3\2\2\2\u015d"+
		"\u015c\3\2\2\2\u015e\63\3\2\2\2\u015f\u0160\7>\2\2\u0160\u0161\5\20\t"+
		"\2\u0161\u0162\7\25\2\2\u0162\u016a\5\4\3\2\u0163\u0164\7\17\2\2\u0164"+
		"\u0165\5\20\t\2\u0165\u0166\7\25\2\2\u0166\u0167\5\4\3\2\u0167\u0169\3"+
		"\2\2\2\u0168\u0163\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7\4"+
		"\2\2\u016e\u016f\5@!\2\u016f\u0172\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u015f"+
		"\3\2\2\2\u0171\u0170\3\2\2\2\u0172\65\3\2\2\2\u0173\u0174\7?\2\2\u0174"+
		"\u0175\5\20\t\2\u0175\u0176\7\25\2\2\u0176\u017e\5\4\3\2\u0177\u0178\7"+
		"\17\2\2\u0178\u0179\5\20\t\2\u0179\u017a\7\25\2\2\u017a\u017b\5\4\3\2"+
		"\u017b\u017d\3\2\2\2\u017c\u0177\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181"+
		"\u0182\7\4\2\2\u0182\u0183\5B\"\2\u0183\u0186\3\2\2\2\u0184\u0186\3\2"+
		"\2\2\u0185\u0173\3\2\2\2\u0185\u0184\3\2\2\2\u0186\67\3\2\2\2\u0187\u0188"+
		"\7@\2\2\u0188\u0189\5\20\t\2\u0189\u018a\7\25\2\2\u018a\u0192\5\4\3\2"+
		"\u018b\u018c\7\17\2\2\u018c\u018d\5\20\t\2\u018d\u018e\7\25\2\2\u018e"+
		"\u018f\5\4\3\2\u018f\u0191\3\2\2\2\u0190\u018b\3\2\2\2\u0191\u0194\3\2"+
		"\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0196\7\4\2\2\u0196\u0197\5D#\2\u0197\u019a\3\2\2"+
		"\2\u0198\u019a\3\2\2\2\u0199\u0187\3\2\2\2\u0199\u0198\3\2\2\2\u019a9"+
		"\3\2\2\2\u019b\u019c\7A\2\2\u019c\u019d\7%\2\2\u019d\u01a0\7\4\2\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u019b\3\2\2\2\u019f\u019e\3\2\2\2\u01a0;\3\2\2\2"+
		"\u01a1\u01a2\7B\2\2\u01a2\u01a3\7%\2\2\u01a3\u01a6\7\4\2\2\u01a4\u01a6"+
		"\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6=\3\2\2\2\u01a7"+
		"\u01a8\7C\2\2\u01a8\u01a9\7%\2\2\u01a9\u01ac\7\4\2\2\u01aa\u01ac\3\2\2"+
		"\2\u01ab\u01a7\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac?\3\2\2\2\u01ad\u01ae"+
		"\7D\2\2\u01ae\u01af\7%\2\2\u01af\u01b2\7\4\2\2\u01b0\u01b2\3\2\2\2\u01b1"+
		"\u01ad\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2A\3\2\2\2\u01b3\u01b4\7E\2\2\u01b4"+
		"\u01b5\7%\2\2\u01b5\u01b8\7\4\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b3\3\2"+
		"\2\2\u01b7\u01b6\3\2\2\2\u01b8C\3\2\2\2\u01b9\u01ba\7F\2\2\u01ba\u01bb"+
		"\7%\2\2\u01bb\u01be\7\4\2\2\u01bc\u01be\3\2\2\2\u01bd\u01b9\3\2\2\2\u01bd"+
		"\u01bc\3\2\2\2\u01beE\3\2\2\2\u01bf\u01c0\7G\2\2\u01c0\u01c1\5V,\2\u01c1"+
		"\u01c2\7\4\2\2\u01c2G\3\2\2\2\u01c3\u01c4\7\62\2\2\u01c4\u01c5\5\20\t"+
		"\2\u01c5\u01c6\7\4\2\2\u01c6I\3\2\2\2\u01c7\u01c8\7\64\2\2\u01c8\u01c9"+
		"\5\4\3\2\u01c9\u01ca\7\4\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01c7\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cdK\3\2\2\2\u01ce\u01cf\7H\2\2\u01cf"+
		"\u01d0\7%\2\2\u01d0\u01d3\7\4\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01ce\3\2"+
		"\2\2\u01d2\u01d1\3\2\2\2\u01d3M\3\2\2\2\u01d4\u01d5\7\'\2\2\u01d5\u01d6"+
		"\7\t\2\2\u01d6\u01d7\5\22\n\2\u01d7\u01d8\5\24\13\2\u01d8\u01d9\5\26\f"+
		"\2\u01d9\u01da\5\30\r\2\u01da\u01db\5\32\16\2\u01db\u01dc\5\34\17\2\u01dc"+
		"\u01dd\5\36\20\2\u01dd\u01de\5 \21\2\u01de\u01df\7\n\2\2\u01dfO\3\2\2"+
		"\2\u01e0\u01e1\7(\2\2\u01e1\u01e2\7\t\2\2\u01e2\u01e3\5\22\n\2\u01e3\u01e4"+
		"\5\"\22\2\u01e4\u01e5\5$\23\2\u01e5\u01e6\5&\24\2\u01e6\u01e7\5(\25\2"+
		"\u01e7\u01e8\5*\26\2\u01e8\u01e9\5,\27\2\u01e9\u01ea\5\30\r\2\u01ea\u01eb"+
		"\5\32\16\2\u01eb\u01ec\5\34\17\2\u01ec\u01ed\5L\'\2\u01ed\u01ee\7\n\2"+
		"\2\u01eeQ\3\2\2\2\u01ef\u01f0\7)\2\2\u01f0\u01f1\7\t\2\2\u01f1\u01f2\5"+
		"\22\n\2\u01f2\u01f3\5F$\2\u01f3\u01f4\7\n\2\2\u01f4S\3\2\2\2\u01f5\u01f6"+
		"\7*\2\2\u01f6\u01f7\7\t\2\2\u01f7\u01f8\5H%\2\u01f8\u01f9\5J&\2\u01f9"+
		"\u01fa\7\n\2\2\u01faU\3\2\2\2\u01fb\u0204\5\\/\2\u01fc\u01fd\5\\/\2\u01fd"+
		"\u01fe\5V,\2\u01fe\u0204\3\2\2\2\u01ff\u0204\5X-\2\u0200\u0201\5X-\2\u0201"+
		"\u0202\5V,\2\u0202\u0204\3\2\2\2\u0203\u01fb\3\2\2\2\u0203\u01fc\3\2\2"+
		"\2\u0203\u01ff\3\2\2\2\u0203\u0200\3\2\2\2\u0204W\3\2\2\2\u0205\u0206"+
		"\7\33\2\2\u0206\u0207\7\7\2\2\u0207\u0208\5Z.\2\u0208\u0209\7\b\2\2\u0209"+
		"\u020a\7\t\2\2\u020a\u020b\5V,\2\u020b\u020c\7\n\2\2\u020cY\3\2\2\2\u020d"+
		"\u0217\5^\60\2\u020e\u020f\5^\60\2\u020f\u0210\7\30\2\2\u0210\u0211\5"+
		"Z.\2\u0211\u0217\3\2\2\2\u0212\u0213\5^\60\2\u0213\u0214\7\31\2\2\u0214"+
		"\u0215\5Z.\2\u0215\u0217\3\2\2\2\u0216\u020d\3\2\2\2\u0216\u020e\3\2\2"+
		"\2\u0216\u0212\3\2\2\2\u0217[\3\2\2\2\u0218\u0219\7\34\2\2\u0219\u021a"+
		"\7\7\2\2\u021a\u021b\5\u0094K\2\u021b\u021c\7\b\2\2\u021c]\3\2\2\2\u021d"+
		"\u0221\5\u0080A\2\u021e\u021f\7\32\2\2\u021f\u0221\5\u0080A\2\u0220\u021d"+
		"\3\2\2\2\u0220\u021e\3\2\2\2\u0221_\3\2\2\2\u0222\u0223\7I\2\2\u0223\u0228"+
		"\t\4\2\2\u0224\u0225\7\17\2\2\u0225\u0227\t\4\2\2\u0226\u0224\3\2\2\2"+
		"\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229a\3"+
		"\2\2\2\u022a\u0228\3\2\2\2\u022b\u022c\7J\2\2\u022c\u0231\t\4\2\2\u022d"+
		"\u022e\7\17\2\2\u022e\u0230\t\4\2\2\u022f\u022d\3\2\2\2\u0230\u0233\3"+
		"\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232c\3\2\2\2\u0233\u0231"+
		"\3\2\2\2\u0234\u0235\7K\2\2\u0235\u023a\7&\2\2\u0236\u0237\7\17\2\2\u0237"+
		"\u0239\7&\2\2\u0238\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2"+
		"\2\2\u023a\u023b\3\2\2\2\u023be\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023e"+
		"\7L\2\2\u023e\u0243\7&\2\2\u023f\u0240\7\17\2\2\u0240\u0242\7&\2\2\u0241"+
		"\u023f\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244g\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0247\7M\2\2\u0247\u024c"+
		"\7&\2\2\u0248\u0249\7\17\2\2\u0249\u024b\7&\2\2\u024a\u0248\3\2\2\2\u024b"+
		"\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024di\3\2\2\2"+
		"\u024e\u024c\3\2\2\2\u024f\u0250\7N\2\2\u0250\u0251\7&\2\2\u0251\u0252"+
		"\7\17\2\2\u0252\u0257\7&\2\2\u0253\u0254\7\17\2\2\u0254\u0256\7&\2\2\u0255"+
		"\u0253\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2"+
		"\2\2\u0258k\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\7O\2\2\u025b\u0260"+
		"\5\20\t\2\u025c\u025d\7\17\2\2\u025d\u025f\5\20\t\2\u025e\u025c\3\2\2"+
		"\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261m"+
		"\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0264\7P\2\2\u0264\u0269\5\20\t\2\u0265"+
		"\u0266\7\17\2\2\u0266\u0268\5\20\t\2\u0267\u0265\3\2\2\2\u0268\u026b\3"+
		"\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026ao\3\2\2\2\u026b\u0269"+
		"\3\2\2\2\u026c\u026d\7Q\2\2\u026d\u026e\7&\2\2\u026e\u026f\7\17\2\2\u026f"+
		"\u0274\5\20\t\2\u0270\u0271\7\17\2\2\u0271\u0273\5\20\t\2\u0272\u0270"+
		"\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"q\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0278\7R\2\2\u0278\u0279\7&\2\2\u0279"+
		"\u027a\7\17\2\2\u027a\u027f\5\20\t\2\u027b\u027c\7\17\2\2\u027c\u027e"+
		"\5\20\t\2\u027d\u027b\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2"+
		"\u027f\u0280\3\2\2\2\u0280s\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0283\7"+
		"S\2\2\u0283\u0284\5\20\t\2\u0284\u0285\7\17\2\2\u0285\u0286\5\4\3\2\u0286"+
		"u\3\2\2\2\u0287\u0288\7T\2\2\u0288\u028d\7&\2\2\u0289\u028a\7\17\2\2\u028a"+
		"\u028c\7&\2\2\u028b\u0289\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2"+
		"\2\2\u028d\u028e\3\2\2\2\u028ew\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0291"+
		"\7U\2\2\u0291\u0296\7&\2\2\u0292\u0293\7\17\2\2\u0293\u0295\7&\2\2\u0294"+
		"\u0292\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2"+
		"\2\2\u0297y\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029a\7V\2\2\u029a\u029b"+
		"\7&\2\2\u029b\u029c\7\3\2\2\u029c\u029d\5\2\2\2\u029d\u029e\7\17\2\2\u029e"+
		"\u029f\5\f\7\2\u029f\u02aa\3\2\2\2\u02a0\u02a1\7V\2\2\u02a1\u02a2\7&\2"+
		"\2\u02a2\u02a3\7\3\2\2\u02a3\u02a4\5\2\2\2\u02a4\u02a5\7\17\2\2\u02a5"+
		"\u02a6\7&\2\2\u02a6\u02a7\7\3\2\2\u02a7\u02a8\5\2\2\2\u02a8\u02aa\3\2"+
		"\2\2\u02a9\u0299\3\2\2\2\u02a9\u02a0\3\2\2\2\u02aa{\3\2\2\2\u02ab\u02ac"+
		"\7W\2\2\u02ac\u02ad\7&\2\2\u02ad\u02ae\7\3\2\2\u02ae\u02af\5\2\2\2\u02af"+
		"\u02b0\7\17\2\2\u02b0\u02b1\5\f\7\2\u02b1\u02bc\3\2\2\2\u02b2\u02b3\7"+
		"W\2\2\u02b3\u02b4\7&\2\2\u02b4\u02b5\7\3\2\2\u02b5\u02b6\5\2\2\2\u02b6"+
		"\u02b7\7\17\2\2\u02b7\u02b8\7&\2\2\u02b8\u02b9\7\3\2\2\u02b9\u02ba\5\2"+
		"\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02ab\3\2\2\2\u02bb\u02b2\3\2\2\2\u02bc"+
		"}\3\2\2\2\u02bd\u02be\7X\2\2\u02be\u02bf\7&\2\2\u02bf\u02c0\7\3\2\2\u02c0"+
		"\u02c1\5\2\2\2\u02c1\u02c2\7\17\2\2\u02c2\u02c3\5\f\7\2\u02c3\u02ce\3"+
		"\2\2\2\u02c4\u02c5\7X\2\2\u02c5\u02c6\7&\2\2\u02c6\u02c7\7\3\2\2\u02c7"+
		"\u02c8\5\2\2\2\u02c8\u02c9\7\17\2\2\u02c9\u02ca\7&\2\2\u02ca\u02cb\7\3"+
		"\2\2\u02cb\u02cc\5\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02bd\3\2\2\2\u02cd"+
		"\u02c4\3\2\2\2\u02ce\177\3\2\2\2\u02cf\u02e0\5`\61\2\u02d0\u02e0\5b\62"+
		"\2\u02d1\u02e0\5d\63\2\u02d2\u02e0\5f\64\2\u02d3\u02e0\5h\65\2\u02d4\u02e0"+
		"\5j\66\2\u02d5\u02e0\5l\67\2\u02d6\u02e0\5n8\2\u02d7\u02e0\5p9\2\u02d8"+
		"\u02e0\5r:\2\u02d9\u02e0\5t;\2\u02da\u02e0\5v<\2\u02db\u02e0\5x=\2\u02dc"+
		"\u02e0\5z>\2\u02dd\u02e0\5|?\2\u02de\u02e0\5~@\2\u02df\u02cf\3\2\2\2\u02df"+
		"\u02d0\3\2\2\2\u02df\u02d1\3\2\2\2\u02df\u02d2\3\2\2\2\u02df\u02d3\3\2"+
		"\2\2\u02df\u02d4\3\2\2\2\u02df\u02d5\3\2\2\2\u02df\u02d6\3\2\2\2\u02df"+
		"\u02d7\3\2\2\2\u02df\u02d8\3\2\2\2\u02df\u02d9\3\2\2\2\u02df\u02da\3\2"+
		"\2\2\u02df\u02db\3\2\2\2\u02df\u02dc\3\2\2\2\u02df\u02dd\3\2\2\2\u02df"+
		"\u02de\3\2\2\2\u02e0\u0081\3\2\2\2\u02e1\u02e2\7Y\2\2\u02e2\u02e3\7%\2"+
		"\2\u02e3\u0083\3\2\2\2\u02e4\u02e5\7Z\2\2\u02e5\u02e6\7&\2\2\u02e6\u0085"+
		"\3\2\2\2\u02e7\u02e8\7[\2\2\u02e8\u02ef\5\20\t\2\u02e9\u02ea\7[\2\2\u02ea"+
		"\u02eb\5\20\t\2\u02eb\u02ec\7\17\2\2\u02ec\u02ed\5\4\3\2\u02ed\u02ef\3"+
		"\2\2\2\u02ee\u02e7\3\2\2\2\u02ee\u02e9\3\2\2\2\u02ef\u0087\3\2\2\2\u02f0"+
		"\u02f1\7\\\2\2\u02f1\u02f2\5\20\t\2\u02f2\u0089\3\2\2\2\u02f3\u02f4\7"+
		"]\2\2\u02f4\u02f5\7&\2\2\u02f5\u008b\3\2\2\2\u02f6\u02f7\7^\2\2\u02f7"+
		"\u02f8\7&\2\2\u02f8\u02f9\7\17\2\2\u02f9\u02fa\7&\2\2\u02fa\u02fb\7\17"+
		"\2\2\u02fb\u02fc\t\5\2\2\u02fc\u008d\3\2\2\2\u02fd\u02fe\7_\2\2\u02fe"+
		"\u02ff\7&\2\2\u02ff\u0300\7\4\2\2\u0300\u0301\5\2\2\2\u0301\u0302\7\17"+
		"\2\2\u0302\u0303\5\f\7\2\u0303\u008f\3\2\2\2\u0304\u0305\7`\2\2\u0305"+
		"\u0306\7&\2\2\u0306\u0307\7\4\2\2\u0307\u0308\5\2\2\2\u0308\u0309\7\17"+
		"\2\2\u0309\u030a\5\f\7\2\u030a\u0091\3\2\2\2\u030b\u030c\7a\2\2\u030c"+
		"\u030d\7&\2\2\u030d\u030e\7\4\2\2\u030e\u030f\5\2\2\2\u030f\u0310\7\17"+
		"\2\2\u0310\u0311\5\f\7\2\u0311\u0093\3\2\2\2\u0312\u031c\5\u0082B\2\u0313"+
		"\u031c\5\u0084C\2\u0314\u031c\5\u0086D\2\u0315\u031c\5\u0088E\2\u0316"+
		"\u031c\5\u008aF\2\u0317\u031c\5\u008cG\2\u0318\u031c\5\u008eH\2\u0319"+
		"\u031c\5\u0090I\2\u031a\u031c\5\u0092J\2\u031b\u0312\3\2\2\2\u031b\u0313"+
		"\3\2\2\2\u031b\u0314\3\2\2\2\u031b\u0315\3\2\2\2\u031b\u0316\3\2\2\2\u031b"+
		"\u0317\3\2\2\2\u031b\u0318\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031a\3\2"+
		"\2\2\u031c\u0095\3\2\2\2\u031d\u0324\5P)\2\u031e\u0323\5P)\2\u031f\u0323"+
		"\5N(\2\u0320\u0323\5R*\2\u0321\u0323\5T+\2\u0322\u031e\3\2\2\2\u0322\u031f"+
		"\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0321\3\2\2\2\u0323\u0326\3\2\2\2\u0324"+
		"\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0097\3\2\2\2\u0326\u0324\3\2"+
		"\2\2>\u00a1\u00a5\u00ac\u00c4\u00ce\u00d6\u00db\u00e3\u00e9\u00f1\u00f7"+
		"\u00fe\u0105\u010c\u0113\u011a\u0121\u012e\u0135\u0142\u0149\u0156\u015d"+
		"\u016a\u0171\u017e\u0185\u0192\u0199\u019f\u01a5\u01ab\u01b1\u01b7\u01bd"+
		"\u01cc\u01d2\u0203\u0216\u0220\u0228\u0231\u023a\u0243\u024c\u0257\u0260"+
		"\u0269\u0274\u027f\u028d\u0296\u02a9\u02bb\u02cd\u02df\u02ee\u031b\u0322"+
		"\u0324";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}