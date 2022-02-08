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
		TRUE=20, FALSE=21, AND=22, OR=23, NOT=24, HIDDEN_KEY=25, COND_TAG=26, 
		EFFECT_TAG=27, IN_TAG=28, ON_TAG=29, UNDER_TAG=30, BLOCK_MESSAGE_TAG=31, 
		ALPHA=32, NUMERIC=33, ALPHANUMERIC=34, WHITESPACE=35, STRING=36, ID=37, 
		OBJECT_TAG=38, ROOM_TAG=39, ACTION_TAG=40, FLAG_TAG=41, ID_KEY=42, LOC_KEY=43, 
		LOC_TYPE_KEY=44, NAME_KEY=45, DESC_KEY=46, ALT_DESC_KEY=47, CONDS_KEY=48, 
		SYNS_KEY=49, PROPERTIES_KEY=50, FLAG_KEY=51, VALUES_KEY=52, VALUE_KEY=53, 
		NORTH_KEY=54, SOUTH_KEY=55, EAST_KEY=56, WEST_KEY=57, UP_KEY=58, DOWN_KEY=59, 
		NORTH_COND_KEY=60, SOUTH_COND_KEY=61, EAST_COND_KEY=62, WEST_COND_KEY=63, 
		UP_COND_KEY=64, DOWN_COND_KEY=65, NORTH_BLOCK_MESSAGE_KEY=66, SOUTH_BLOCK_MESSAGE_KEY=67, 
		EAST_BLOCK_MESSAGE_KEY=68, WEST_BLOCK_MESSAGE_KEY=69, UP_BLOCK_MESSAGE_KEY=70, 
		DOWN_BLOCK_MESSAGE_KEY=71, ACTION_KEY=72, DET_KEY=73, PRSA_COND=74, PRSA_AND_COND=75, 
		PRSO_COND=76, PRSI_COND=77, HERE_COND=78, INSCOPE_COND=79, ANDFLAGS_COND=80, 
		ORFLAGS_COND=81, ANDPROPERTIES_COND=82, ORPROPERTIES_COND=83, FLAGVALUE_COND=84, 
		HAVEITEM_COND=85, HAVEITEMS_COND=86, EQUALS_COND=87, GT_COND=88, LT_COND=89, 
		TELL_EFF=90, GOTO_EFF=91, SETFLAG_EFF=92, REMFLAG_EFF=93, TAKE_EFF=94, 
		PLACE_EFF=95, SET_VAR_EFF=96, INC_VAR_EFF=97, DEC_VAR_EFF=98;
	public static final int
		RULE_alpha_numeric = 0, RULE_num_int = 1, RULE_num_float = 2, RULE_number = 3, 
		RULE_bool = 4, RULE_var = 5, RULE_value = 6, RULE_flag = 7, RULE_id_entry = 8, 
		RULE_loc_entry = 9, RULE_loc_type_entry = 10, RULE_name_entry = 11, RULE_desc_entry = 12, 
		RULE_alt_desc_entry = 13, RULE_flag_conditions = 14, RULE_synonyms_entry = 15, 
		RULE_properties_entry = 16, RULE_values_entry = 17, RULE_north_entry = 18, 
		RULE_south_entry = 19, RULE_east_entry = 20, RULE_west_entry = 21, RULE_up_entry = 22, 
		RULE_down_entry = 23, RULE_north_cond = 24, RULE_south_cond = 25, RULE_east_cond = 26, 
		RULE_west_cond = 27, RULE_up_cond = 28, RULE_down_cond = 29, RULE_hidden = 30, 
		RULE_north_block_message = 31, RULE_south_block_message = 32, RULE_east_block_message = 33, 
		RULE_west_block_message = 34, RULE_up_block_message = 35, RULE_down_block_message = 36, 
		RULE_action_entry = 37, RULE_global_flag_entry = 38, RULE_flag_val_entry = 39, 
		RULE_det_entry = 40, RULE_object = 41, RULE_room = 42, RULE_action = 43, 
		RULE_global_flag = 44, RULE_action_block = 45, RULE_conditional = 46, 
		RULE_conditions = 47, RULE_effect_aux = 48, RULE_condition_aux = 49, RULE_prsa_cond = 50, 
		RULE_prsa_and_cond = 51, RULE_prso_cond = 52, RULE_prsi_cond = 53, RULE_here_cond = 54, 
		RULE_inscope_cond = 55, RULE_andflags_cond = 56, RULE_orflags_cond = 57, 
		RULE_andproperties_cond = 58, RULE_orproperties_cond = 59, RULE_flagvalue_cond = 60, 
		RULE_haveitem_cond = 61, RULE_haveitems_cond = 62, RULE_equals_cond = 63, 
		RULE_gt_cond = 64, RULE_lt_cond = 65, RULE_condition = 66, RULE_tell_eff = 67, 
		RULE_goto_eff = 68, RULE_setflag_eff = 69, RULE_remflag_eff = 70, RULE_take_eff = 71, 
		RULE_place_eff = 72, RULE_set_var_eff = 73, RULE_inc_var_eff = 74, RULE_dec_var_eff = 75, 
		RULE_effect = 76, RULE_game_grammar = 77;
	private static String[] makeRuleNames() {
		return new String[] {
			"alpha_numeric", "num_int", "num_float", "number", "bool", "var", "value", 
			"flag", "id_entry", "loc_entry", "loc_type_entry", "name_entry", "desc_entry", 
			"alt_desc_entry", "flag_conditions", "synonyms_entry", "properties_entry", 
			"values_entry", "north_entry", "south_entry", "east_entry", "west_entry", 
			"up_entry", "down_entry", "north_cond", "south_cond", "east_cond", "west_cond", 
			"up_cond", "down_cond", "hidden", "north_block_message", "south_block_message", 
			"east_block_message", "west_block_message", "up_block_message", "down_block_message", 
			"action_entry", "global_flag_entry", "flag_val_entry", "det_entry", "object", 
			"room", "action", "global_flag", "action_block", "conditional", "conditions", 
			"effect_aux", "condition_aux", "prsa_cond", "prsa_and_cond", "prso_cond", 
			"prsi_cond", "here_cond", "inscope_cond", "andflags_cond", "orflags_cond", 
			"andproperties_cond", "orproperties_cond", "flagvalue_cond", "haveitem_cond", 
			"haveitems_cond", "equals_cond", "gt_cond", "lt_cond", "condition", "tell_eff", 
			"goto_eff", "setflag_eff", "remflag_eff", "take_eff", "place_eff", "set_var_eff", 
			"inc_var_eff", "dec_var_eff", "effect", "game_grammar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'['", "']'", "'<'", "'>'", "'{'", "'}'", "'('", 
			"')'", "'\"'", "'_'", "','", "'.'", "'+'", "'-'", "'|'", "'&'", "'='", 
			"'TRUE'", "'FALSE'", null, null, "'!'", "'HIDDEN'", "'COND'", "'EFF'", 
			"'IN'", "'ON'", "'UNDER'", "'BLOCKMESSAGE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "SEMICOLON", "LB_SQUARE", "RB_SQUARE", "LB_SHARP", "RB_SHARP", 
			"LB_CURLY", "RB_CURLY", "LB_ROUND", "RB_ROUND", "QUOTES", "UNDERSCORE", 
			"COMMA", "DOT", "PLUS", "MINUS", "BAR", "ANDPERSAND", "EQUALS", "TRUE", 
			"FALSE", "AND", "OR", "NOT", "HIDDEN_KEY", "COND_TAG", "EFFECT_TAG", 
			"IN_TAG", "ON_TAG", "UNDER_TAG", "BLOCK_MESSAGE_TAG", "ALPHA", "NUMERIC", 
			"ALPHANUMERIC", "WHITESPACE", "STRING", "ID", "OBJECT_TAG", "ROOM_TAG", 
			"ACTION_TAG", "FLAG_TAG", "ID_KEY", "LOC_KEY", "LOC_TYPE_KEY", "NAME_KEY", 
			"DESC_KEY", "ALT_DESC_KEY", "CONDS_KEY", "SYNS_KEY", "PROPERTIES_KEY", 
			"FLAG_KEY", "VALUES_KEY", "VALUE_KEY", "NORTH_KEY", "SOUTH_KEY", "EAST_KEY", 
			"WEST_KEY", "UP_KEY", "DOWN_KEY", "NORTH_COND_KEY", "SOUTH_COND_KEY", 
			"EAST_COND_KEY", "WEST_COND_KEY", "UP_COND_KEY", "DOWN_COND_KEY", "NORTH_BLOCK_MESSAGE_KEY", 
			"SOUTH_BLOCK_MESSAGE_KEY", "EAST_BLOCK_MESSAGE_KEY", "WEST_BLOCK_MESSAGE_KEY", 
			"UP_BLOCK_MESSAGE_KEY", "DOWN_BLOCK_MESSAGE_KEY", "ACTION_KEY", "DET_KEY", 
			"PRSA_COND", "PRSA_AND_COND", "PRSO_COND", "PRSI_COND", "HERE_COND", 
			"INSCOPE_COND", "ANDFLAGS_COND", "ORFLAGS_COND", "ANDPROPERTIES_COND", 
			"ORPROPERTIES_COND", "FLAGVALUE_COND", "HAVEITEM_COND", "HAVEITEMS_COND", 
			"EQUALS_COND", "GT_COND", "LT_COND", "TELL_EFF", "GOTO_EFF", "SETFLAG_EFF", 
			"REMFLAG_EFF", "TAKE_EFF", "PLACE_EFF", "SET_VAR_EFF", "INC_VAR_EFF", 
			"DEC_VAR_EFF"
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
			setState(156);
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
			setState(158);
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
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(NUMERIC);
				setState(161);
				match(DOT);
				setState(162);
				match(NUMERIC);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(DOT);
				setState(164);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				num_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
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
			setState(171);
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
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
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
			setState(178);
			match(LB_ROUND);
			setState(179);
			alpha_numeric();
			setState(180);
			match(COLON);
			setState(181);
			var();
			setState(182);
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
			setState(184);
			match(UNDERSCORE);
			setState(185);
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
			setState(187);
			match(ID_KEY);
			setState(188);
			match(ID);
			setState(189);
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
			setState(191);
			match(LOC_KEY);
			setState(192);
			match(ID);
			setState(193);
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
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOC_TYPE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(LOC_TYPE_KEY);
				setState(196);
				num_int();
				setState(197);
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
			setState(202);
			match(NAME_KEY);
			setState(203);
			match(STRING);
			setState(204);
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
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESC_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(DESC_KEY);
				setState(207);
				match(STRING);
				setState(208);
				match(SEMICOLON);
				}
				break;
			case RB_CURLY:
			case ALT_DESC_KEY:
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

	public static class Alt_desc_entryContext extends ParserRuleContext {
		public TerminalNode ALT_DESC_KEY() { return getToken(EditorGrammarParser.ALT_DESC_KEY, 0); }
		public TerminalNode STRING() { return getToken(EditorGrammarParser.STRING, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(EditorGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(EditorGrammarParser.SEMICOLON, i);
		}
		public TerminalNode CONDS_KEY() { return getToken(EditorGrammarParser.CONDS_KEY, 0); }
		public Flag_conditionsContext flag_conditions() {
			return getRuleContext(Flag_conditionsContext.class,0);
		}
		public Alt_desc_entryContext alt_desc_entry() {
			return getRuleContext(Alt_desc_entryContext.class,0);
		}
		public Alt_desc_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_desc_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterAlt_desc_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitAlt_desc_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitAlt_desc_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alt_desc_entryContext alt_desc_entry() throws RecognitionException {
		Alt_desc_entryContext _localctx = new Alt_desc_entryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alt_desc_entry);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALT_DESC_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(ALT_DESC_KEY);
				setState(213);
				match(STRING);
				setState(214);
				match(SEMICOLON);
				setState(215);
				match(CONDS_KEY);
				setState(216);
				flag_conditions();
				setState(217);
				match(SEMICOLON);
				setState(218);
				alt_desc_entry();
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

	public static class Flag_conditionsContext extends ParserRuleContext {
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
		public Flag_conditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flag_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterFlag_conditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitFlag_conditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitFlag_conditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flag_conditionsContext flag_conditions() throws RecognitionException {
		Flag_conditionsContext _localctx = new Flag_conditionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_flag_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			flag();
			setState(224);
			match(EQUALS);
			setState(225);
			num_int();
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					match(COMMA);
					setState(227);
					flag();
					setState(228);
					match(EQUALS);
					setState(229);
					num_int();
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 30, RULE_synonyms_entry);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNS_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(SYNS_KEY);
				setState(237);
				match(STRING);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(238);
					match(COMMA);
					setState(239);
					match(STRING);
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245);
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
		enterRule(_localctx, 32, RULE_properties_entry);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROPERTIES_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(PROPERTIES_KEY);
				setState(250);
				flag();
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(251);
					match(COMMA);
					setState(252);
					flag();
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
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
		enterRule(_localctx, 34, RULE_values_entry);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(VALUES_KEY);
				setState(264);
				value();
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(265);
					match(COMMA);
					setState(266);
					value();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
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
		enterRule(_localctx, 36, RULE_north_entry);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORTH_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(NORTH_KEY);
				setState(278);
				match(ID);
				setState(279);
				match(SEMICOLON);
				setState(280);
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
		enterRule(_localctx, 38, RULE_south_entry);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOUTH_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(SOUTH_KEY);
				setState(285);
				match(ID);
				setState(286);
				match(SEMICOLON);
				setState(287);
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
		enterRule(_localctx, 40, RULE_east_entry);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EAST_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(EAST_KEY);
				setState(292);
				match(ID);
				setState(293);
				match(SEMICOLON);
				setState(294);
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
		enterRule(_localctx, 42, RULE_west_entry);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WEST_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(WEST_KEY);
				setState(299);
				match(ID);
				setState(300);
				match(SEMICOLON);
				setState(301);
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
		enterRule(_localctx, 44, RULE_up_entry);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(UP_KEY);
				setState(306);
				match(ID);
				setState(307);
				match(SEMICOLON);
				setState(308);
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
		enterRule(_localctx, 46, RULE_down_entry);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOWN_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(DOWN_KEY);
				setState(313);
				match(ID);
				setState(314);
				match(SEMICOLON);
				setState(315);
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
		public Flag_conditionsContext flag_conditions() {
			return getRuleContext(Flag_conditionsContext.class,0);
		}
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public North_block_messageContext north_block_message() {
			return getRuleContext(North_block_messageContext.class,0);
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
		enterRule(_localctx, 48, RULE_north_cond);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORTH_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(NORTH_COND_KEY);
				setState(320);
				flag_conditions();
				setState(321);
				hidden();
				setState(322);
				match(SEMICOLON);
				setState(323);
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
		public Flag_conditionsContext flag_conditions() {
			return getRuleContext(Flag_conditionsContext.class,0);
		}
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public South_block_messageContext south_block_message() {
			return getRuleContext(South_block_messageContext.class,0);
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
		enterRule(_localctx, 50, RULE_south_cond);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOUTH_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(SOUTH_COND_KEY);
				setState(329);
				flag_conditions();
				setState(330);
				hidden();
				setState(331);
				match(SEMICOLON);
				setState(332);
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
		public Flag_conditionsContext flag_conditions() {
			return getRuleContext(Flag_conditionsContext.class,0);
		}
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public East_block_messageContext east_block_message() {
			return getRuleContext(East_block_messageContext.class,0);
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
		enterRule(_localctx, 52, RULE_east_cond);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EAST_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(EAST_COND_KEY);
				setState(338);
				flag_conditions();
				setState(339);
				hidden();
				setState(340);
				match(SEMICOLON);
				setState(341);
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
		public Flag_conditionsContext flag_conditions() {
			return getRuleContext(Flag_conditionsContext.class,0);
		}
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public West_block_messageContext west_block_message() {
			return getRuleContext(West_block_messageContext.class,0);
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
		enterRule(_localctx, 54, RULE_west_cond);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WEST_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(WEST_COND_KEY);
				setState(347);
				flag_conditions();
				setState(348);
				hidden();
				setState(349);
				match(SEMICOLON);
				setState(350);
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
		public Flag_conditionsContext flag_conditions() {
			return getRuleContext(Flag_conditionsContext.class,0);
		}
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Up_block_messageContext up_block_message() {
			return getRuleContext(Up_block_messageContext.class,0);
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
		enterRule(_localctx, 56, RULE_up_cond);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(UP_COND_KEY);
				setState(356);
				flag_conditions();
				setState(357);
				hidden();
				setState(358);
				match(SEMICOLON);
				setState(359);
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
		public Flag_conditionsContext flag_conditions() {
			return getRuleContext(Flag_conditionsContext.class,0);
		}
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Down_block_messageContext down_block_message() {
			return getRuleContext(Down_block_messageContext.class,0);
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
		enterRule(_localctx, 58, RULE_down_cond);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOWN_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(DOWN_COND_KEY);
				setState(365);
				flag_conditions();
				setState(366);
				hidden();
				setState(367);
				match(SEMICOLON);
				setState(368);
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

	public static class HiddenContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(EditorGrammarParser.COMMA, 0); }
		public TerminalNode UNDERSCORE() { return getToken(EditorGrammarParser.UNDERSCORE, 0); }
		public TerminalNode HIDDEN_KEY() { return getToken(EditorGrammarParser.HIDDEN_KEY, 0); }
		public HiddenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hidden; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterHidden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitHidden(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitHidden(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HiddenContext hidden() throws RecognitionException {
		HiddenContext _localctx = new HiddenContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_hidden);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(COMMA);
				setState(374);
				match(UNDERSCORE);
				setState(375);
				match(HIDDEN_KEY);
				}
				break;
			case SEMICOLON:
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
		enterRule(_localctx, 62, RULE_north_block_message);
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORTH_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(NORTH_BLOCK_MESSAGE_KEY);
				setState(380);
				match(STRING);
				setState(381);
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
		enterRule(_localctx, 64, RULE_south_block_message);
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOUTH_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(SOUTH_BLOCK_MESSAGE_KEY);
				setState(386);
				match(STRING);
				setState(387);
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
		enterRule(_localctx, 66, RULE_east_block_message);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EAST_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(EAST_BLOCK_MESSAGE_KEY);
				setState(392);
				match(STRING);
				setState(393);
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
		enterRule(_localctx, 68, RULE_west_block_message);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WEST_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(WEST_BLOCK_MESSAGE_KEY);
				setState(398);
				match(STRING);
				setState(399);
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
		enterRule(_localctx, 70, RULE_up_block_message);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(UP_BLOCK_MESSAGE_KEY);
				setState(404);
				match(STRING);
				setState(405);
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
		enterRule(_localctx, 72, RULE_down_block_message);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOWN_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(DOWN_BLOCK_MESSAGE_KEY);
				setState(410);
				match(STRING);
				setState(411);
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
		enterRule(_localctx, 74, RULE_action_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(ACTION_KEY);
			setState(416);
			action_block();
			setState(417);
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
		enterRule(_localctx, 76, RULE_global_flag_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(FLAG_KEY);
			setState(420);
			flag();
			setState(421);
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
		enterRule(_localctx, 78, RULE_flag_val_entry);
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(VALUE_KEY);
				setState(424);
				num_int();
				setState(425);
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
		enterRule(_localctx, 80, RULE_det_entry);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DET_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(DET_KEY);
				setState(431);
				match(STRING);
				setState(432);
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
		public Alt_desc_entryContext alt_desc_entry() {
			return getRuleContext(Alt_desc_entryContext.class,0);
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
		enterRule(_localctx, 82, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(OBJECT_TAG);
			setState(437);
			match(LB_CURLY);
			setState(438);
			id_entry();
			setState(439);
			loc_entry();
			setState(440);
			loc_type_entry();
			setState(441);
			name_entry();
			setState(442);
			desc_entry();
			setState(443);
			alt_desc_entry();
			setState(444);
			synonyms_entry();
			setState(445);
			properties_entry();
			setState(446);
			values_entry();
			setState(447);
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
		public Alt_desc_entryContext alt_desc_entry() {
			return getRuleContext(Alt_desc_entryContext.class,0);
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
		enterRule(_localctx, 84, RULE_room);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(ROOM_TAG);
			setState(450);
			match(LB_CURLY);
			setState(451);
			id_entry();
			setState(452);
			north_entry();
			setState(453);
			south_entry();
			setState(454);
			east_entry();
			setState(455);
			west_entry();
			setState(456);
			up_entry();
			setState(457);
			down_entry();
			setState(458);
			name_entry();
			setState(459);
			desc_entry();
			setState(460);
			alt_desc_entry();
			setState(461);
			synonyms_entry();
			setState(462);
			det_entry();
			setState(463);
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
		enterRule(_localctx, 86, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(ACTION_TAG);
			setState(466);
			match(LB_CURLY);
			setState(467);
			id_entry();
			setState(468);
			action_entry();
			setState(469);
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
		enterRule(_localctx, 88, RULE_global_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(FLAG_TAG);
			setState(472);
			match(LB_CURLY);
			setState(473);
			global_flag_entry();
			setState(474);
			flag_val_entry();
			setState(475);
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
		enterRule(_localctx, 90, RULE_action_block);
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				effect_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				effect_aux();
				setState(479);
				action_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				conditional();
				setState(483);
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
		enterRule(_localctx, 92, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(COND_TAG);
			setState(488);
			match(LB_SHARP);
			setState(489);
			conditions();
			setState(490);
			match(RB_SHARP);
			setState(491);
			match(LB_CURLY);
			setState(492);
			action_block();
			setState(493);
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
		enterRule(_localctx, 94, RULE_conditions);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				condition_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				condition_aux();
				setState(497);
				match(AND);
				setState(498);
				conditions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				condition_aux();
				setState(501);
				match(OR);
				setState(502);
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
		enterRule(_localctx, 96, RULE_effect_aux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(EFFECT_TAG);
			setState(507);
			match(LB_SHARP);
			setState(508);
			effect();
			setState(509);
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
		enterRule(_localctx, 98, RULE_condition_aux);
		try {
			setState(514);
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
				setState(511);
				condition();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				match(NOT);
				setState(513);
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
		enterRule(_localctx, 100, RULE_prsa_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(PRSA_COND);
			setState(517);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN_TAG) | (1L << ON_TAG) | (1L << UNDER_TAG) | (1L << ALPHA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(518);
				match(COMMA);
				setState(519);
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
				setState(524);
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
		enterRule(_localctx, 102, RULE_prsa_and_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(PRSA_AND_COND);
			setState(526);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN_TAG) | (1L << ON_TAG) | (1L << UNDER_TAG) | (1L << ALPHA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(527);
				match(COMMA);
				setState(528);
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
				setState(533);
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
		enterRule(_localctx, 104, RULE_prso_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(PRSO_COND);
			setState(535);
			match(ID);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(536);
				match(COMMA);
				setState(537);
				match(ID);
				}
				}
				setState(542);
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
		enterRule(_localctx, 106, RULE_prsi_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(PRSI_COND);
			setState(544);
			match(ID);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(545);
				match(COMMA);
				setState(546);
				match(ID);
				}
				}
				setState(551);
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
		enterRule(_localctx, 108, RULE_here_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(HERE_COND);
			setState(553);
			match(ID);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(554);
				match(COMMA);
				setState(555);
				match(ID);
				}
				}
				setState(560);
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
		enterRule(_localctx, 110, RULE_inscope_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(INSCOPE_COND);
			setState(562);
			match(ID);
			setState(563);
			match(COMMA);
			setState(564);
			match(ID);
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(565);
				match(COMMA);
				setState(566);
				match(ID);
				}
				}
				setState(571);
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
		enterRule(_localctx, 112, RULE_andflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(ANDFLAGS_COND);
			setState(573);
			flag();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(574);
				match(COMMA);
				setState(575);
				flag();
				}
				}
				setState(580);
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
		enterRule(_localctx, 114, RULE_orflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(ORFLAGS_COND);
			setState(582);
			flag();
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(583);
				match(COMMA);
				setState(584);
				flag();
				}
				}
				setState(589);
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
		enterRule(_localctx, 116, RULE_andproperties_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(ANDPROPERTIES_COND);
			setState(591);
			match(ID);
			setState(592);
			match(COMMA);
			setState(593);
			flag();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(594);
				match(COMMA);
				setState(595);
				flag();
				}
				}
				setState(600);
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
		enterRule(_localctx, 118, RULE_orproperties_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(ORPROPERTIES_COND);
			setState(602);
			match(ID);
			setState(603);
			match(COMMA);
			setState(604);
			flag();
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(605);
				match(COMMA);
				setState(606);
				flag();
				}
				}
				setState(611);
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
		enterRule(_localctx, 120, RULE_flagvalue_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(FLAGVALUE_COND);
			setState(613);
			flag();
			setState(614);
			match(COMMA);
			setState(615);
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
		enterRule(_localctx, 122, RULE_haveitem_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(HAVEITEM_COND);
			setState(618);
			match(ID);
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(619);
				match(COMMA);
				setState(620);
				match(ID);
				}
				}
				setState(625);
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
		enterRule(_localctx, 124, RULE_haveitems_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(HAVEITEMS_COND);
			setState(627);
			match(ID);
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(628);
				match(COMMA);
				setState(629);
				match(ID);
				}
				}
				setState(634);
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
		enterRule(_localctx, 126, RULE_equals_cond);
		try {
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				match(EQUALS_COND);
				setState(636);
				match(ID);
				setState(637);
				match(COLON);
				setState(638);
				alpha_numeric();
				setState(639);
				match(COMMA);
				setState(640);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				match(EQUALS_COND);
				setState(643);
				match(ID);
				setState(644);
				match(COLON);
				setState(645);
				alpha_numeric();
				setState(646);
				match(COMMA);
				setState(647);
				match(ID);
				setState(648);
				match(COLON);
				setState(649);
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
		enterRule(_localctx, 128, RULE_gt_cond);
		try {
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				match(GT_COND);
				setState(654);
				match(ID);
				setState(655);
				match(COLON);
				setState(656);
				alpha_numeric();
				setState(657);
				match(COMMA);
				setState(658);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				match(GT_COND);
				setState(661);
				match(ID);
				setState(662);
				match(COLON);
				setState(663);
				alpha_numeric();
				setState(664);
				match(COMMA);
				setState(665);
				match(ID);
				setState(666);
				match(COLON);
				setState(667);
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
		enterRule(_localctx, 130, RULE_lt_cond);
		try {
			setState(687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				match(LT_COND);
				setState(672);
				match(ID);
				setState(673);
				match(COLON);
				setState(674);
				alpha_numeric();
				setState(675);
				match(COMMA);
				setState(676);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				match(LT_COND);
				setState(679);
				match(ID);
				setState(680);
				match(COLON);
				setState(681);
				alpha_numeric();
				setState(682);
				match(COMMA);
				setState(683);
				match(ID);
				setState(684);
				match(COLON);
				setState(685);
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
		enterRule(_localctx, 132, RULE_condition);
		try {
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRSA_COND:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				prsa_cond();
				}
				break;
			case PRSA_AND_COND:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				prsa_and_cond();
				}
				break;
			case PRSO_COND:
				enterOuterAlt(_localctx, 3);
				{
				setState(691);
				prso_cond();
				}
				break;
			case PRSI_COND:
				enterOuterAlt(_localctx, 4);
				{
				setState(692);
				prsi_cond();
				}
				break;
			case HERE_COND:
				enterOuterAlt(_localctx, 5);
				{
				setState(693);
				here_cond();
				}
				break;
			case INSCOPE_COND:
				enterOuterAlt(_localctx, 6);
				{
				setState(694);
				inscope_cond();
				}
				break;
			case ANDFLAGS_COND:
				enterOuterAlt(_localctx, 7);
				{
				setState(695);
				andflags_cond();
				}
				break;
			case ORFLAGS_COND:
				enterOuterAlt(_localctx, 8);
				{
				setState(696);
				orflags_cond();
				}
				break;
			case ANDPROPERTIES_COND:
				enterOuterAlt(_localctx, 9);
				{
				setState(697);
				andproperties_cond();
				}
				break;
			case ORPROPERTIES_COND:
				enterOuterAlt(_localctx, 10);
				{
				setState(698);
				orproperties_cond();
				}
				break;
			case FLAGVALUE_COND:
				enterOuterAlt(_localctx, 11);
				{
				setState(699);
				flagvalue_cond();
				}
				break;
			case HAVEITEM_COND:
				enterOuterAlt(_localctx, 12);
				{
				setState(700);
				haveitem_cond();
				}
				break;
			case HAVEITEMS_COND:
				enterOuterAlt(_localctx, 13);
				{
				setState(701);
				haveitems_cond();
				}
				break;
			case EQUALS_COND:
				enterOuterAlt(_localctx, 14);
				{
				setState(702);
				equals_cond();
				}
				break;
			case GT_COND:
				enterOuterAlt(_localctx, 15);
				{
				setState(703);
				gt_cond();
				}
				break;
			case LT_COND:
				enterOuterAlt(_localctx, 16);
				{
				setState(704);
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
		enterRule(_localctx, 134, RULE_tell_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(TELL_EFF);
			setState(708);
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
		enterRule(_localctx, 136, RULE_goto_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(GOTO_EFF);
			setState(711);
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
		enterRule(_localctx, 138, RULE_setflag_eff);
		try {
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				match(SETFLAG_EFF);
				setState(714);
				flag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				match(SETFLAG_EFF);
				setState(716);
				flag();
				setState(717);
				match(COMMA);
				setState(718);
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
		enterRule(_localctx, 140, RULE_remflag_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(REMFLAG_EFF);
			setState(723);
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
		enterRule(_localctx, 142, RULE_take_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(TAKE_EFF);
			setState(726);
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
		enterRule(_localctx, 144, RULE_place_eff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(PLACE_EFF);
			setState(729);
			match(ID);
			setState(730);
			match(COMMA);
			setState(731);
			match(ID);
			setState(732);
			match(COMMA);
			setState(733);
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
		enterRule(_localctx, 146, RULE_set_var_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(SET_VAR_EFF);
			setState(736);
			match(ID);
			setState(737);
			match(SEMICOLON);
			setState(738);
			alpha_numeric();
			setState(739);
			match(COMMA);
			setState(740);
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
		enterRule(_localctx, 148, RULE_inc_var_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(INC_VAR_EFF);
			setState(743);
			match(ID);
			setState(744);
			match(SEMICOLON);
			setState(745);
			alpha_numeric();
			setState(746);
			match(COMMA);
			setState(747);
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
		enterRule(_localctx, 150, RULE_dec_var_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(DEC_VAR_EFF);
			setState(750);
			match(ID);
			setState(751);
			match(SEMICOLON);
			setState(752);
			alpha_numeric();
			setState(753);
			match(COMMA);
			setState(754);
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
		enterRule(_localctx, 152, RULE_effect);
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TELL_EFF:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				tell_eff();
				}
				break;
			case GOTO_EFF:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				goto_eff();
				}
				break;
			case SETFLAG_EFF:
				enterOuterAlt(_localctx, 3);
				{
				setState(758);
				setflag_eff();
				}
				break;
			case REMFLAG_EFF:
				enterOuterAlt(_localctx, 4);
				{
				setState(759);
				remflag_eff();
				}
				break;
			case TAKE_EFF:
				enterOuterAlt(_localctx, 5);
				{
				setState(760);
				take_eff();
				}
				break;
			case PLACE_EFF:
				enterOuterAlt(_localctx, 6);
				{
				setState(761);
				place_eff();
				}
				break;
			case SET_VAR_EFF:
				enterOuterAlt(_localctx, 7);
				{
				setState(762);
				set_var_eff();
				}
				break;
			case INC_VAR_EFF:
				enterOuterAlt(_localctx, 8);
				{
				setState(763);
				inc_var_eff();
				}
				break;
			case DEC_VAR_EFF:
				enterOuterAlt(_localctx, 9);
				{
				setState(764);
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
		enterRule(_localctx, 154, RULE_game_grammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			room();
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECT_TAG) | (1L << ROOM_TAG) | (1L << ACTION_TAG) | (1L << FLAG_TAG))) != 0)) {
				{
				setState(772);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ROOM_TAG:
					{
					setState(768);
					room();
					}
					break;
				case OBJECT_TAG:
					{
					setState(769);
					object();
					}
					break;
				case ACTION_TAG:
					{
					setState(770);
					action();
					}
					break;
				case FLAG_TAG:
					{
					setState(771);
					global_flag();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(776);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3d\u030c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\u00a8\n\4\3\5\3\5\5\5\u00ac\n\5\3\6\3\6\3\7\3\7\3\7\5\7\u00b3"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00cb\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\5\16\u00d5\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00e0\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00ea\n\20\f"+
		"\20\16\20\u00ed\13\20\3\21\3\21\3\21\3\21\7\21\u00f3\n\21\f\21\16\21\u00f6"+
		"\13\21\3\21\3\21\5\21\u00fa\n\21\3\22\3\22\3\22\3\22\7\22\u0100\n\22\f"+
		"\22\16\22\u0103\13\22\3\22\3\22\3\22\5\22\u0108\n\22\3\23\3\23\3\23\3"+
		"\23\7\23\u010e\n\23\f\23\16\23\u0111\13\23\3\23\3\23\3\23\5\23\u0116\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\5\24\u011d\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0124\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u012b\n\26\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u0132\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0139\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0140\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0149\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0152\n"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u015b\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0164\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u016d\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0176\n\37\3"+
		" \3 \3 \3 \5 \u017c\n \3!\3!\3!\3!\5!\u0182\n!\3\"\3\"\3\"\3\"\5\"\u0188"+
		"\n\"\3#\3#\3#\3#\5#\u018e\n#\3$\3$\3$\3$\5$\u0194\n$\3%\3%\3%\3%\5%\u019a"+
		"\n%\3&\3&\3&\3&\5&\u01a0\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		")\5)\u01af\n)\3*\3*\3*\3*\5*\u01b5\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01e8\n/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\5\61\u01fb\n\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\5\63\u0205"+
		"\n\63\3\64\3\64\3\64\3\64\7\64\u020b\n\64\f\64\16\64\u020e\13\64\3\65"+
		"\3\65\3\65\3\65\7\65\u0214\n\65\f\65\16\65\u0217\13\65\3\66\3\66\3\66"+
		"\3\66\7\66\u021d\n\66\f\66\16\66\u0220\13\66\3\67\3\67\3\67\3\67\7\67"+
		"\u0226\n\67\f\67\16\67\u0229\13\67\38\38\38\38\78\u022f\n8\f8\168\u0232"+
		"\138\39\39\39\39\39\39\79\u023a\n9\f9\169\u023d\139\3:\3:\3:\3:\7:\u0243"+
		"\n:\f:\16:\u0246\13:\3;\3;\3;\3;\7;\u024c\n;\f;\16;\u024f\13;\3<\3<\3"+
		"<\3<\3<\3<\7<\u0257\n<\f<\16<\u025a\13<\3=\3=\3=\3=\3=\3=\7=\u0262\n="+
		"\f=\16=\u0265\13=\3>\3>\3>\3>\3>\3?\3?\3?\3?\7?\u0270\n?\f?\16?\u0273"+
		"\13?\3@\3@\3@\3@\7@\u0279\n@\f@\16@\u027c\13@\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\5A\u028e\nA\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\5B\u02a0\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\5C\u02b2\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D"+
		"\u02c4\nD\3E\3E\3E\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\5G\u02d3\nG\3H\3H\3H"+
		"\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L"+
		"\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0300\nN\3O\3O"+
		"\3O\3O\3O\7O\u0307\nO\fO\16O\u030a\13O\3O\2\2P\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\2\6\3\2\"$\3\2\26\27\4\2\36 \"\"\3\2\36 \2\u0311"+
		"\2\u009e\3\2\2\2\4\u00a0\3\2\2\2\6\u00a7\3\2\2\2\b\u00ab\3\2\2\2\n\u00ad"+
		"\3\2\2\2\f\u00b2\3\2\2\2\16\u00b4\3\2\2\2\20\u00ba\3\2\2\2\22\u00bd\3"+
		"\2\2\2\24\u00c1\3\2\2\2\26\u00ca\3\2\2\2\30\u00cc\3\2\2\2\32\u00d4\3\2"+
		"\2\2\34\u00df\3\2\2\2\36\u00e1\3\2\2\2 \u00f9\3\2\2\2\"\u0107\3\2\2\2"+
		"$\u0115\3\2\2\2&\u011c\3\2\2\2(\u0123\3\2\2\2*\u012a\3\2\2\2,\u0131\3"+
		"\2\2\2.\u0138\3\2\2\2\60\u013f\3\2\2\2\62\u0148\3\2\2\2\64\u0151\3\2\2"+
		"\2\66\u015a\3\2\2\28\u0163\3\2\2\2:\u016c\3\2\2\2<\u0175\3\2\2\2>\u017b"+
		"\3\2\2\2@\u0181\3\2\2\2B\u0187\3\2\2\2D\u018d\3\2\2\2F\u0193\3\2\2\2H"+
		"\u0199\3\2\2\2J\u019f\3\2\2\2L\u01a1\3\2\2\2N\u01a5\3\2\2\2P\u01ae\3\2"+
		"\2\2R\u01b4\3\2\2\2T\u01b6\3\2\2\2V\u01c3\3\2\2\2X\u01d3\3\2\2\2Z\u01d9"+
		"\3\2\2\2\\\u01e7\3\2\2\2^\u01e9\3\2\2\2`\u01fa\3\2\2\2b\u01fc\3\2\2\2"+
		"d\u0204\3\2\2\2f\u0206\3\2\2\2h\u020f\3\2\2\2j\u0218\3\2\2\2l\u0221\3"+
		"\2\2\2n\u022a\3\2\2\2p\u0233\3\2\2\2r\u023e\3\2\2\2t\u0247\3\2\2\2v\u0250"+
		"\3\2\2\2x\u025b\3\2\2\2z\u0266\3\2\2\2|\u026b\3\2\2\2~\u0274\3\2\2\2\u0080"+
		"\u028d\3\2\2\2\u0082\u029f\3\2\2\2\u0084\u02b1\3\2\2\2\u0086\u02c3\3\2"+
		"\2\2\u0088\u02c5\3\2\2\2\u008a\u02c8\3\2\2\2\u008c\u02d2\3\2\2\2\u008e"+
		"\u02d4\3\2\2\2\u0090\u02d7\3\2\2\2\u0092\u02da\3\2\2\2\u0094\u02e1\3\2"+
		"\2\2\u0096\u02e8\3\2\2\2\u0098\u02ef\3\2\2\2\u009a\u02ff\3\2\2\2\u009c"+
		"\u0301\3\2\2\2\u009e\u009f\t\2\2\2\u009f\3\3\2\2\2\u00a0\u00a1\7#\2\2"+
		"\u00a1\5\3\2\2\2\u00a2\u00a3\7#\2\2\u00a3\u00a4\7\20\2\2\u00a4\u00a8\7"+
		"#\2\2\u00a5\u00a6\7\20\2\2\u00a6\u00a8\7#\2\2\u00a7\u00a2\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\7\3\2\2\2\u00a9\u00ac\5\4\3\2\u00aa\u00ac\5\6\4\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\t\3\2\2\2\u00ad\u00ae\t"+
		"\3\2\2\u00ae\13\3\2\2\2\u00af\u00b3\5\b\5\2\u00b0\u00b3\7&\2\2\u00b1\u00b3"+
		"\5\n\6\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\r\3\2\2\2\u00b4\u00b5\7\13\2\2\u00b5\u00b6\5\2\2\2\u00b6\u00b7\7\3\2"+
		"\2\u00b7\u00b8\5\f\7\2\u00b8\u00b9\7\f\2\2\u00b9\17\3\2\2\2\u00ba\u00bb"+
		"\7\16\2\2\u00bb\u00bc\5\2\2\2\u00bc\21\3\2\2\2\u00bd\u00be\7,\2\2\u00be"+
		"\u00bf\7\'\2\2\u00bf\u00c0\7\4\2\2\u00c0\23\3\2\2\2\u00c1\u00c2\7-\2\2"+
		"\u00c2\u00c3\7\'\2\2\u00c3\u00c4\7\4\2\2\u00c4\25\3\2\2\2\u00c5\u00c6"+
		"\7.\2\2\u00c6\u00c7\5\4\3\2\u00c7\u00c8\7\4\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\27\3\2\2"+
		"\2\u00cc\u00cd\7/\2\2\u00cd\u00ce\7&\2\2\u00ce\u00cf\7\4\2\2\u00cf\31"+
		"\3\2\2\2\u00d0\u00d1\7\60\2\2\u00d1\u00d2\7&\2\2\u00d2\u00d5\7\4\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\33\3\2\2"+
		"\2\u00d6\u00d7\7\61\2\2\u00d7\u00d8\7&\2\2\u00d8\u00d9\7\4\2\2\u00d9\u00da"+
		"\7\62\2\2\u00da\u00db\5\36\20\2\u00db\u00dc\7\4\2\2\u00dc\u00dd\5\34\17"+
		"\2\u00dd\u00e0\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00de"+
		"\3\2\2\2\u00e0\35\3\2\2\2\u00e1\u00e2\5\20\t\2\u00e2\u00e3\7\25\2\2\u00e3"+
		"\u00eb\5\4\3\2\u00e4\u00e5\7\17\2\2\u00e5\u00e6\5\20\t\2\u00e6\u00e7\7"+
		"\25\2\2\u00e7\u00e8\5\4\3\2\u00e8\u00ea\3\2\2\2\u00e9\u00e4\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\37\3\2\2"+
		"\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\63\2\2\u00ef\u00f4\7&\2\2\u00f0\u00f1"+
		"\7\17\2\2\u00f1\u00f3\7&\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f7\u00fa\7\4\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00ee\3\2\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa!\3\2\2\2\u00fb\u00fc\7\64\2\2\u00fc\u0101\5\20\t"+
		"\2\u00fd\u00fe\7\17\2\2\u00fe\u0100\5\20\t\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\4\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0108\3\2\2\2\u0107\u00fb\3\2\2\2\u0107\u0106\3\2\2\2\u0108#\3\2\2\2"+
		"\u0109\u010a\7\66\2\2\u010a\u010f\5\16\b\2\u010b\u010c\7\17\2\2\u010c"+
		"\u010e\5\16\b\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3"+
		"\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0113\7\4\2\2\u0113\u0116\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0109\3\2"+
		"\2\2\u0115\u0114\3\2\2\2\u0116%\3\2\2\2\u0117\u0118\78\2\2\u0118\u0119"+
		"\7\'\2\2\u0119\u011a\7\4\2\2\u011a\u011d\5\62\32\2\u011b\u011d\3\2\2\2"+
		"\u011c\u0117\3\2\2\2\u011c\u011b\3\2\2\2\u011d\'\3\2\2\2\u011e\u011f\7"+
		"9\2\2\u011f\u0120\7\'\2\2\u0120\u0121\7\4\2\2\u0121\u0124\5\64\33\2\u0122"+
		"\u0124\3\2\2\2\u0123\u011e\3\2\2\2\u0123\u0122\3\2\2\2\u0124)\3\2\2\2"+
		"\u0125\u0126\7:\2\2\u0126\u0127\7\'\2\2\u0127\u0128\7\4\2\2\u0128\u012b"+
		"\5\66\34\2\u0129\u012b\3\2\2\2\u012a\u0125\3\2\2\2\u012a\u0129\3\2\2\2"+
		"\u012b+\3\2\2\2\u012c\u012d\7;\2\2\u012d\u012e\7\'\2\2\u012e\u012f\7\4"+
		"\2\2\u012f\u0132\58\35\2\u0130\u0132\3\2\2\2\u0131\u012c\3\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132-\3\2\2\2\u0133\u0134\7<\2\2\u0134\u0135\7\'\2\2\u0135"+
		"\u0136\7\4\2\2\u0136\u0139\5:\36\2\u0137\u0139\3\2\2\2\u0138\u0133\3\2"+
		"\2\2\u0138\u0137\3\2\2\2\u0139/\3\2\2\2\u013a\u013b\7=\2\2\u013b\u013c"+
		"\7\'\2\2\u013c\u013d\7\4\2\2\u013d\u0140\5<\37\2\u013e\u0140\3\2\2\2\u013f"+
		"\u013a\3\2\2\2\u013f\u013e\3\2\2\2\u0140\61\3\2\2\2\u0141\u0142\7>\2\2"+
		"\u0142\u0143\5\36\20\2\u0143\u0144\5> \2\u0144\u0145\7\4\2\2\u0145\u0146"+
		"\5@!\2\u0146\u0149\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0141\3\2\2\2\u0148"+
		"\u0147\3\2\2\2\u0149\63\3\2\2\2\u014a\u014b\7?\2\2\u014b\u014c\5\36\20"+
		"\2\u014c\u014d\5> \2\u014d\u014e\7\4\2\2\u014e\u014f\5B\"\2\u014f\u0152"+
		"\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014a\3\2\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\65\3\2\2\2\u0153\u0154\7@\2\2\u0154\u0155\5\36\20\2\u0155\u0156\5> \2"+
		"\u0156\u0157\7\4\2\2\u0157\u0158\5D#\2\u0158\u015b\3\2\2\2\u0159\u015b"+
		"\3\2\2\2\u015a\u0153\3\2\2\2\u015a\u0159\3\2\2\2\u015b\67\3\2\2\2\u015c"+
		"\u015d\7A\2\2\u015d\u015e\5\36\20\2\u015e\u015f\5> \2\u015f\u0160\7\4"+
		"\2\2\u0160\u0161\5F$\2\u0161\u0164\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u015c"+
		"\3\2\2\2\u0163\u0162\3\2\2\2\u01649\3\2\2\2\u0165\u0166\7B\2\2\u0166\u0167"+
		"\5\36\20\2\u0167\u0168\5> \2\u0168\u0169\7\4\2\2\u0169\u016a\5H%\2\u016a"+
		"\u016d\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u0165\3\2\2\2\u016c\u016b\3\2"+
		"\2\2\u016d;\3\2\2\2\u016e\u016f\7C\2\2\u016f\u0170\5\36\20\2\u0170\u0171"+
		"\5> \2\u0171\u0172\7\4\2\2\u0172\u0173\5J&\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0176\3\2\2\2\u0175\u016e\3\2\2\2\u0175\u0174\3\2\2\2\u0176=\3\2\2\2"+
		"\u0177\u0178\7\17\2\2\u0178\u0179\7\16\2\2\u0179\u017c\7\33\2\2\u017a"+
		"\u017c\3\2\2\2\u017b\u0177\3\2\2\2\u017b\u017a\3\2\2\2\u017c?\3\2\2\2"+
		"\u017d\u017e\7D\2\2\u017e\u017f\7&\2\2\u017f\u0182\7\4\2\2\u0180\u0182"+
		"\3\2\2\2\u0181\u017d\3\2\2\2\u0181\u0180\3\2\2\2\u0182A\3\2\2\2\u0183"+
		"\u0184\7E\2\2\u0184\u0185\7&\2\2\u0185\u0188\7\4\2\2\u0186\u0188\3\2\2"+
		"\2\u0187\u0183\3\2\2\2\u0187\u0186\3\2\2\2\u0188C\3\2\2\2\u0189\u018a"+
		"\7F\2\2\u018a\u018b\7&\2\2\u018b\u018e\7\4\2\2\u018c\u018e\3\2\2\2\u018d"+
		"\u0189\3\2\2\2\u018d\u018c\3\2\2\2\u018eE\3\2\2\2\u018f\u0190\7G\2\2\u0190"+
		"\u0191\7&\2\2\u0191\u0194\7\4\2\2\u0192\u0194\3\2\2\2\u0193\u018f\3\2"+
		"\2\2\u0193\u0192\3\2\2\2\u0194G\3\2\2\2\u0195\u0196\7H\2\2\u0196\u0197"+
		"\7&\2\2\u0197\u019a\7\4\2\2\u0198\u019a\3\2\2\2\u0199\u0195\3\2\2\2\u0199"+
		"\u0198\3\2\2\2\u019aI\3\2\2\2\u019b\u019c\7I\2\2\u019c\u019d\7&\2\2\u019d"+
		"\u01a0\7\4\2\2\u019e\u01a0\3\2\2\2\u019f\u019b\3\2\2\2\u019f\u019e\3\2"+
		"\2\2\u01a0K\3\2\2\2\u01a1\u01a2\7J\2\2\u01a2\u01a3\5\\/\2\u01a3\u01a4"+
		"\7\4\2\2\u01a4M\3\2\2\2\u01a5\u01a6\7\65\2\2\u01a6\u01a7\5\20\t\2\u01a7"+
		"\u01a8\7\4\2\2\u01a8O\3\2\2\2\u01a9\u01aa\7\67\2\2\u01aa\u01ab\5\4\3\2"+
		"\u01ab\u01ac\7\4\2\2\u01ac\u01af\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01a9"+
		"\3\2\2\2\u01ae\u01ad\3\2\2\2\u01afQ\3\2\2\2\u01b0\u01b1\7K\2\2\u01b1\u01b2"+
		"\7&\2\2\u01b2\u01b5\7\4\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b4"+
		"\u01b3\3\2\2\2\u01b5S\3\2\2\2\u01b6\u01b7\7(\2\2\u01b7\u01b8\7\t\2\2\u01b8"+
		"\u01b9\5\22\n\2\u01b9\u01ba\5\24\13\2\u01ba\u01bb\5\26\f\2\u01bb\u01bc"+
		"\5\30\r\2\u01bc\u01bd\5\32\16\2\u01bd\u01be\5\34\17\2\u01be\u01bf\5 \21"+
		"\2\u01bf\u01c0\5\"\22\2\u01c0\u01c1\5$\23\2\u01c1\u01c2\7\n\2\2\u01c2"+
		"U\3\2\2\2\u01c3\u01c4\7)\2\2\u01c4\u01c5\7\t\2\2\u01c5\u01c6\5\22\n\2"+
		"\u01c6\u01c7\5&\24\2\u01c7\u01c8\5(\25\2\u01c8\u01c9\5*\26\2\u01c9\u01ca"+
		"\5,\27\2\u01ca\u01cb\5.\30\2\u01cb\u01cc\5\60\31\2\u01cc\u01cd\5\30\r"+
		"\2\u01cd\u01ce\5\32\16\2\u01ce\u01cf\5\34\17\2\u01cf\u01d0\5 \21\2\u01d0"+
		"\u01d1\5R*\2\u01d1\u01d2\7\n\2\2\u01d2W\3\2\2\2\u01d3\u01d4\7*\2\2\u01d4"+
		"\u01d5\7\t\2\2\u01d5\u01d6\5\22\n\2\u01d6\u01d7\5L\'\2\u01d7\u01d8\7\n"+
		"\2\2\u01d8Y\3\2\2\2\u01d9\u01da\7+\2\2\u01da\u01db\7\t\2\2\u01db\u01dc"+
		"\5N(\2\u01dc\u01dd\5P)\2\u01dd\u01de\7\n\2\2\u01de[\3\2\2\2\u01df\u01e8"+
		"\5b\62\2\u01e0\u01e1\5b\62\2\u01e1\u01e2\5\\/\2\u01e2\u01e8\3\2\2\2\u01e3"+
		"\u01e8\5^\60\2\u01e4\u01e5\5^\60\2\u01e5\u01e6\5\\/\2\u01e6\u01e8\3\2"+
		"\2\2\u01e7\u01df\3\2\2\2\u01e7\u01e0\3\2\2\2\u01e7\u01e3\3\2\2\2\u01e7"+
		"\u01e4\3\2\2\2\u01e8]\3\2\2\2\u01e9\u01ea\7\34\2\2\u01ea\u01eb\7\7\2\2"+
		"\u01eb\u01ec\5`\61\2\u01ec\u01ed\7\b\2\2\u01ed\u01ee\7\t\2\2\u01ee\u01ef"+
		"\5\\/\2\u01ef\u01f0\7\n\2\2\u01f0_\3\2\2\2\u01f1\u01fb\5d\63\2\u01f2\u01f3"+
		"\5d\63\2\u01f3\u01f4\7\30\2\2\u01f4\u01f5\5`\61\2\u01f5\u01fb\3\2\2\2"+
		"\u01f6\u01f7\5d\63\2\u01f7\u01f8\7\31\2\2\u01f8\u01f9\5`\61\2\u01f9\u01fb"+
		"\3\2\2\2\u01fa\u01f1\3\2\2\2\u01fa\u01f2\3\2\2\2\u01fa\u01f6\3\2\2\2\u01fb"+
		"a\3\2\2\2\u01fc\u01fd\7\35\2\2\u01fd\u01fe\7\7\2\2\u01fe\u01ff\5\u009a"+
		"N\2\u01ff\u0200\7\b\2\2\u0200c\3\2\2\2\u0201\u0205\5\u0086D\2\u0202\u0203"+
		"\7\32\2\2\u0203\u0205\5\u0086D\2\u0204\u0201\3\2\2\2\u0204\u0202\3\2\2"+
		"\2\u0205e\3\2\2\2\u0206\u0207\7L\2\2\u0207\u020c\t\4\2\2\u0208\u0209\7"+
		"\17\2\2\u0209\u020b\t\4\2\2\u020a\u0208\3\2\2\2\u020b\u020e\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020dg\3\2\2\2\u020e\u020c\3\2\2\2"+
		"\u020f\u0210\7M\2\2\u0210\u0215\t\4\2\2\u0211\u0212\7\17\2\2\u0212\u0214"+
		"\t\4\2\2\u0213\u0211\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216i\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u0219\7N\2\2\u0219"+
		"\u021e\7\'\2\2\u021a\u021b\7\17\2\2\u021b\u021d\7\'\2\2\u021c\u021a\3"+
		"\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"k\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222\7O\2\2\u0222\u0227\7\'\2\2\u0223"+
		"\u0224\7\17\2\2\u0224\u0226\7\'\2\2\u0225\u0223\3\2\2\2\u0226\u0229\3"+
		"\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228m\3\2\2\2\u0229\u0227"+
		"\3\2\2\2\u022a\u022b\7P\2\2\u022b\u0230\7\'\2\2\u022c\u022d\7\17\2\2\u022d"+
		"\u022f\7\'\2\2\u022e\u022c\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0230\u0231\3\2\2\2\u0231o\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0234"+
		"\7Q\2\2\u0234\u0235\7\'\2\2\u0235\u0236\7\17\2\2\u0236\u023b\7\'\2\2\u0237"+
		"\u0238\7\17\2\2\u0238\u023a\7\'\2\2\u0239\u0237\3\2\2\2\u023a\u023d\3"+
		"\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023cq\3\2\2\2\u023d\u023b"+
		"\3\2\2\2\u023e\u023f\7R\2\2\u023f\u0244\5\20\t\2\u0240\u0241\7\17\2\2"+
		"\u0241\u0243\5\20\t\2\u0242\u0240\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245s\3\2\2\2\u0246\u0244\3\2\2\2\u0247"+
		"\u0248\7S\2\2\u0248\u024d\5\20\t\2\u0249\u024a\7\17\2\2\u024a\u024c\5"+
		"\20\t\2\u024b\u0249\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d"+
		"\u024e\3\2\2\2\u024eu\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0251\7T\2\2\u0251"+
		"\u0252\7\'\2\2\u0252\u0253\7\17\2\2\u0253\u0258\5\20\t\2\u0254\u0255\7"+
		"\17\2\2\u0255\u0257\5\20\t\2\u0256\u0254\3\2\2\2\u0257\u025a\3\2\2\2\u0258"+
		"\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259w\3\2\2\2\u025a\u0258\3\2\2\2"+
		"\u025b\u025c\7U\2\2\u025c\u025d\7\'\2\2\u025d\u025e\7\17\2\2\u025e\u0263"+
		"\5\20\t\2\u025f\u0260\7\17\2\2\u0260\u0262\5\20\t\2\u0261\u025f\3\2\2"+
		"\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264y"+
		"\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0267\7V\2\2\u0267\u0268\5\20\t\2\u0268"+
		"\u0269\7\17\2\2\u0269\u026a\5\4\3\2\u026a{\3\2\2\2\u026b\u026c\7W\2\2"+
		"\u026c\u0271\7\'\2\2\u026d\u026e\7\17\2\2\u026e\u0270\7\'\2\2\u026f\u026d"+
		"\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"}\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0275\7X\2\2\u0275\u027a\7\'\2\2\u0276"+
		"\u0277\7\17\2\2\u0277\u0279\7\'\2\2\u0278\u0276\3\2\2\2\u0279\u027c\3"+
		"\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\177\3\2\2\2\u027c"+
		"\u027a\3\2\2\2\u027d\u027e\7Y\2\2\u027e\u027f\7\'\2\2\u027f\u0280\7\3"+
		"\2\2\u0280\u0281\5\2\2\2\u0281\u0282\7\17\2\2\u0282\u0283\5\f\7\2\u0283"+
		"\u028e\3\2\2\2\u0284\u0285\7Y\2\2\u0285\u0286\7\'\2\2\u0286\u0287\7\3"+
		"\2\2\u0287\u0288\5\2\2\2\u0288\u0289\7\17\2\2\u0289\u028a\7\'\2\2\u028a"+
		"\u028b\7\3\2\2\u028b\u028c\5\2\2\2\u028c\u028e\3\2\2\2\u028d\u027d\3\2"+
		"\2\2\u028d\u0284\3\2\2\2\u028e\u0081\3\2\2\2\u028f\u0290\7Z\2\2\u0290"+
		"\u0291\7\'\2\2\u0291\u0292\7\3\2\2\u0292\u0293\5\2\2\2\u0293\u0294\7\17"+
		"\2\2\u0294\u0295\5\f\7\2\u0295\u02a0\3\2\2\2\u0296\u0297\7Z\2\2\u0297"+
		"\u0298\7\'\2\2\u0298\u0299\7\3\2\2\u0299\u029a\5\2\2\2\u029a\u029b\7\17"+
		"\2\2\u029b\u029c\7\'\2\2\u029c\u029d\7\3\2\2\u029d\u029e\5\2\2\2\u029e"+
		"\u02a0\3\2\2\2\u029f\u028f\3\2\2\2\u029f\u0296\3\2\2\2\u02a0\u0083\3\2"+
		"\2\2\u02a1\u02a2\7[\2\2\u02a2\u02a3\7\'\2\2\u02a3\u02a4\7\3\2\2\u02a4"+
		"\u02a5\5\2\2\2\u02a5\u02a6\7\17\2\2\u02a6\u02a7\5\f\7\2\u02a7\u02b2\3"+
		"\2\2\2\u02a8\u02a9\7[\2\2\u02a9\u02aa\7\'\2\2\u02aa\u02ab\7\3\2\2\u02ab"+
		"\u02ac\5\2\2\2\u02ac\u02ad\7\17\2\2\u02ad\u02ae\7\'\2\2\u02ae\u02af\7"+
		"\3\2\2\u02af\u02b0\5\2\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02a1\3\2\2\2\u02b1"+
		"\u02a8\3\2\2\2\u02b2\u0085\3\2\2\2\u02b3\u02c4\5f\64\2\u02b4\u02c4\5h"+
		"\65\2\u02b5\u02c4\5j\66\2\u02b6\u02c4\5l\67\2\u02b7\u02c4\5n8\2\u02b8"+
		"\u02c4\5p9\2\u02b9\u02c4\5r:\2\u02ba\u02c4\5t;\2\u02bb\u02c4\5v<\2\u02bc"+
		"\u02c4\5x=\2\u02bd\u02c4\5z>\2\u02be\u02c4\5|?\2\u02bf\u02c4\5~@\2\u02c0"+
		"\u02c4\5\u0080A\2\u02c1\u02c4\5\u0082B\2\u02c2\u02c4\5\u0084C\2\u02c3"+
		"\u02b3\3\2\2\2\u02c3\u02b4\3\2\2\2\u02c3\u02b5\3\2\2\2\u02c3\u02b6\3\2"+
		"\2\2\u02c3\u02b7\3\2\2\2\u02c3\u02b8\3\2\2\2\u02c3\u02b9\3\2\2\2\u02c3"+
		"\u02ba\3\2\2\2\u02c3\u02bb\3\2\2\2\u02c3\u02bc\3\2\2\2\u02c3\u02bd\3\2"+
		"\2\2\u02c3\u02be\3\2\2\2\u02c3\u02bf\3\2\2\2\u02c3\u02c0\3\2\2\2\u02c3"+
		"\u02c1\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c4\u0087\3\2\2\2\u02c5\u02c6\7\\"+
		"\2\2\u02c6\u02c7\7&\2\2\u02c7\u0089\3\2\2\2\u02c8\u02c9\7]\2\2\u02c9\u02ca"+
		"\7\'\2\2\u02ca\u008b\3\2\2\2\u02cb\u02cc\7^\2\2\u02cc\u02d3\5\20\t\2\u02cd"+
		"\u02ce\7^\2\2\u02ce\u02cf\5\20\t\2\u02cf\u02d0\7\17\2\2\u02d0\u02d1\5"+
		"\4\3\2\u02d1\u02d3\3\2\2\2\u02d2\u02cb\3\2\2\2\u02d2\u02cd\3\2\2\2\u02d3"+
		"\u008d\3\2\2\2\u02d4\u02d5\7_\2\2\u02d5\u02d6\5\20\t\2\u02d6\u008f\3\2"+
		"\2\2\u02d7\u02d8\7`\2\2\u02d8\u02d9\7\'\2\2\u02d9\u0091\3\2\2\2\u02da"+
		"\u02db\7a\2\2\u02db\u02dc\7\'\2\2\u02dc\u02dd\7\17\2\2\u02dd\u02de\7\'"+
		"\2\2\u02de\u02df\7\17\2\2\u02df\u02e0\t\5\2\2\u02e0\u0093\3\2\2\2\u02e1"+
		"\u02e2\7b\2\2\u02e2\u02e3\7\'\2\2\u02e3\u02e4\7\4\2\2\u02e4\u02e5\5\2"+
		"\2\2\u02e5\u02e6\7\17\2\2\u02e6\u02e7\5\f\7\2\u02e7\u0095\3\2\2\2\u02e8"+
		"\u02e9\7c\2\2\u02e9\u02ea\7\'\2\2\u02ea\u02eb\7\4\2\2\u02eb\u02ec\5\2"+
		"\2\2\u02ec\u02ed\7\17\2\2\u02ed\u02ee\5\f\7\2\u02ee\u0097\3\2\2\2\u02ef"+
		"\u02f0\7d\2\2\u02f0\u02f1\7\'\2\2\u02f1\u02f2\7\4\2\2\u02f2\u02f3\5\2"+
		"\2\2\u02f3\u02f4\7\17\2\2\u02f4\u02f5\5\f\7\2\u02f5\u0099\3\2\2\2\u02f6"+
		"\u0300\5\u0088E\2\u02f7\u0300\5\u008aF\2\u02f8\u0300\5\u008cG\2\u02f9"+
		"\u0300\5\u008eH\2\u02fa\u0300\5\u0090I\2\u02fb\u0300\5\u0092J\2\u02fc"+
		"\u0300\5\u0094K\2\u02fd\u0300\5\u0096L\2\u02fe\u0300\5\u0098M\2\u02ff"+
		"\u02f6\3\2\2\2\u02ff\u02f7\3\2\2\2\u02ff\u02f8\3\2\2\2\u02ff\u02f9\3\2"+
		"\2\2\u02ff\u02fa\3\2\2\2\u02ff\u02fb\3\2\2\2\u02ff\u02fc\3\2\2\2\u02ff"+
		"\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300\u009b\3\2\2\2\u0301\u0308\5V"+
		",\2\u0302\u0307\5V,\2\u0303\u0307\5T+\2\u0304\u0307\5X-\2\u0305\u0307"+
		"\5Z.\2\u0306\u0302\3\2\2\2\u0306\u0303\3\2\2\2\u0306\u0304\3\2\2\2\u0306"+
		"\u0305\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2"+
		"\2\2\u0309\u009d\3\2\2\2\u030a\u0308\3\2\2\2;\u00a7\u00ab\u00b2\u00ca"+
		"\u00d4\u00df\u00eb\u00f4\u00f9\u0101\u0107\u010f\u0115\u011c\u0123\u012a"+
		"\u0131\u0138\u013f\u0148\u0151\u015a\u0163\u016c\u0175\u017b\u0181\u0187"+
		"\u018d\u0193\u0199\u019f\u01ae\u01b4\u01e7\u01fa\u0204\u020c\u0215\u021e"+
		"\u0227\u0230\u023b\u0244\u024d\u0258\u0263\u0271\u027a\u028d\u029f\u02b1"+
		"\u02c3\u02d2\u02ff\u0306\u0308";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}