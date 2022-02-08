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
		LOC_TYPE_KEY=44, NAME_KEY=45, DESC_KEY=46, SYNS_KEY=47, PROPERTIES_KEY=48, 
		FLAG_KEY=49, VALUES_KEY=50, VALUE_KEY=51, NORTH_KEY=52, SOUTH_KEY=53, 
		EAST_KEY=54, WEST_KEY=55, UP_KEY=56, DOWN_KEY=57, NORTH_COND_KEY=58, SOUTH_COND_KEY=59, 
		EAST_COND_KEY=60, WEST_COND_KEY=61, UP_COND_KEY=62, DOWN_COND_KEY=63, 
		NORTH_BLOCK_MESSAGE_KEY=64, SOUTH_BLOCK_MESSAGE_KEY=65, EAST_BLOCK_MESSAGE_KEY=66, 
		WEST_BLOCK_MESSAGE_KEY=67, UP_BLOCK_MESSAGE_KEY=68, DOWN_BLOCK_MESSAGE_KEY=69, 
		ACTION_KEY=70, DET_KEY=71, PRSA_COND=72, PRSA_AND_COND=73, PRSO_COND=74, 
		PRSI_COND=75, HERE_COND=76, INSCOPE_COND=77, ANDFLAGS_COND=78, ORFLAGS_COND=79, 
		ANDPROPERTIES_COND=80, ORPROPERTIES_COND=81, FLAGVALUE_COND=82, HAVEITEM_COND=83, 
		HAVEITEMS_COND=84, EQUALS_COND=85, GT_COND=86, LT_COND=87, TELL_EFF=88, 
		GOTO_EFF=89, SETFLAG_EFF=90, REMFLAG_EFF=91, TAKE_EFF=92, PLACE_EFF=93, 
		SET_VAR_EFF=94, INC_VAR_EFF=95, DEC_VAR_EFF=96;
	public static final int
		RULE_alpha_numeric = 0, RULE_num_int = 1, RULE_num_float = 2, RULE_number = 3, 
		RULE_bool = 4, RULE_var = 5, RULE_value = 6, RULE_flag = 7, RULE_id_entry = 8, 
		RULE_loc_entry = 9, RULE_loc_type_entry = 10, RULE_name_entry = 11, RULE_desc_entry = 12, 
		RULE_synonyms_entry = 13, RULE_properties_entry = 14, RULE_values_entry = 15, 
		RULE_north_entry = 16, RULE_south_entry = 17, RULE_east_entry = 18, RULE_west_entry = 19, 
		RULE_up_entry = 20, RULE_down_entry = 21, RULE_north_cond = 22, RULE_south_cond = 23, 
		RULE_east_cond = 24, RULE_west_cond = 25, RULE_up_cond = 26, RULE_down_cond = 27, 
		RULE_hidden = 28, RULE_north_block_message = 29, RULE_south_block_message = 30, 
		RULE_east_block_message = 31, RULE_west_block_message = 32, RULE_up_block_message = 33, 
		RULE_down_block_message = 34, RULE_action_entry = 35, RULE_global_flag_entry = 36, 
		RULE_flag_val_entry = 37, RULE_det_entry = 38, RULE_object = 39, RULE_room = 40, 
		RULE_action = 41, RULE_global_flag = 42, RULE_action_block = 43, RULE_conditional = 44, 
		RULE_conditions = 45, RULE_effect_aux = 46, RULE_condition_aux = 47, RULE_prsa_cond = 48, 
		RULE_prsa_and_cond = 49, RULE_prso_cond = 50, RULE_prsi_cond = 51, RULE_here_cond = 52, 
		RULE_inscope_cond = 53, RULE_andflags_cond = 54, RULE_orflags_cond = 55, 
		RULE_andproperties_cond = 56, RULE_orproperties_cond = 57, RULE_flagvalue_cond = 58, 
		RULE_haveitem_cond = 59, RULE_haveitems_cond = 60, RULE_equals_cond = 61, 
		RULE_gt_cond = 62, RULE_lt_cond = 63, RULE_condition = 64, RULE_tell_eff = 65, 
		RULE_goto_eff = 66, RULE_setflag_eff = 67, RULE_remflag_eff = 68, RULE_take_eff = 69, 
		RULE_place_eff = 70, RULE_set_var_eff = 71, RULE_inc_var_eff = 72, RULE_dec_var_eff = 73, 
		RULE_effect = 74, RULE_game_grammar = 75;
	private static String[] makeRuleNames() {
		return new String[] {
			"alpha_numeric", "num_int", "num_float", "number", "bool", "var", "value", 
			"flag", "id_entry", "loc_entry", "loc_type_entry", "name_entry", "desc_entry", 
			"synonyms_entry", "properties_entry", "values_entry", "north_entry", 
			"south_entry", "east_entry", "west_entry", "up_entry", "down_entry", 
			"north_cond", "south_cond", "east_cond", "west_cond", "up_cond", "down_cond", 
			"hidden", "north_block_message", "south_block_message", "east_block_message", 
			"west_block_message", "up_block_message", "down_block_message", "action_entry", 
			"global_flag_entry", "flag_val_entry", "det_entry", "object", "room", 
			"action", "global_flag", "action_block", "conditional", "conditions", 
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
			"DESC_KEY", "SYNS_KEY", "PROPERTIES_KEY", "FLAG_KEY", "VALUES_KEY", "VALUE_KEY", 
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
			setState(152);
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
			setState(154);
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
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(NUMERIC);
				setState(157);
				match(DOT);
				setState(158);
				match(NUMERIC);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(DOT);
				setState(160);
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				num_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
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
			setState(167);
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
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
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
			setState(174);
			match(LB_ROUND);
			setState(175);
			alpha_numeric();
			setState(176);
			match(COLON);
			setState(177);
			var();
			setState(178);
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
			setState(180);
			match(UNDERSCORE);
			setState(181);
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
			setState(183);
			match(ID_KEY);
			setState(184);
			match(ID);
			setState(185);
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
			setState(187);
			match(LOC_KEY);
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
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOC_TYPE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(LOC_TYPE_KEY);
				setState(192);
				num_int();
				setState(193);
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
			setState(198);
			match(NAME_KEY);
			setState(199);
			match(STRING);
			setState(200);
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
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESC_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(DESC_KEY);
				setState(203);
				match(STRING);
				setState(204);
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
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNS_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(SYNS_KEY);
				setState(209);
				match(STRING);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(210);
					match(COMMA);
					setState(211);
					match(STRING);
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
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROPERTIES_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(PROPERTIES_KEY);
				setState(222);
				flag();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(223);
					match(COMMA);
					setState(224);
					flag();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(230);
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
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(VALUES_KEY);
				setState(236);
				value();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(237);
					match(COMMA);
					setState(238);
					value();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
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
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORTH_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(NORTH_KEY);
				setState(250);
				match(ID);
				setState(251);
				match(SEMICOLON);
				setState(252);
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
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOUTH_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(SOUTH_KEY);
				setState(257);
				match(ID);
				setState(258);
				match(SEMICOLON);
				setState(259);
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
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EAST_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(EAST_KEY);
				setState(264);
				match(ID);
				setState(265);
				match(SEMICOLON);
				setState(266);
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
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WEST_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(WEST_KEY);
				setState(271);
				match(ID);
				setState(272);
				match(SEMICOLON);
				setState(273);
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
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(UP_KEY);
				setState(278);
				match(ID);
				setState(279);
				match(SEMICOLON);
				setState(280);
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
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOWN_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(DOWN_KEY);
				setState(285);
				match(ID);
				setState(286);
				match(SEMICOLON);
				setState(287);
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
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
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
		try {
			int _alt;
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORTH_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(NORTH_COND_KEY);
				setState(292);
				flag();
				setState(293);
				match(EQUALS);
				setState(294);
				num_int();
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(295);
						match(COMMA);
						setState(296);
						flag();
						setState(297);
						match(EQUALS);
						setState(298);
						num_int();
						}
						} 
					}
					setState(304);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(305);
				hidden();
				setState(306);
				match(SEMICOLON);
				setState(307);
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
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
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
		try {
			int _alt;
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOUTH_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(SOUTH_COND_KEY);
				setState(313);
				flag();
				setState(314);
				match(EQUALS);
				setState(315);
				num_int();
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(316);
						match(COMMA);
						setState(317);
						flag();
						setState(318);
						match(EQUALS);
						setState(319);
						num_int();
						}
						} 
					}
					setState(325);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(326);
				hidden();
				setState(327);
				match(SEMICOLON);
				setState(328);
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
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
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
		try {
			int _alt;
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EAST_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(EAST_COND_KEY);
				setState(334);
				flag();
				setState(335);
				match(EQUALS);
				setState(336);
				num_int();
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(337);
						match(COMMA);
						setState(338);
						flag();
						setState(339);
						match(EQUALS);
						setState(340);
						num_int();
						}
						} 
					}
					setState(346);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(347);
				hidden();
				setState(348);
				match(SEMICOLON);
				setState(349);
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
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
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
		try {
			int _alt;
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WEST_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(WEST_COND_KEY);
				setState(355);
				flag();
				setState(356);
				match(EQUALS);
				setState(357);
				num_int();
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(358);
						match(COMMA);
						setState(359);
						flag();
						setState(360);
						match(EQUALS);
						setState(361);
						num_int();
						}
						} 
					}
					setState(367);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(368);
				hidden();
				setState(369);
				match(SEMICOLON);
				setState(370);
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
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
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
		try {
			int _alt;
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(UP_COND_KEY);
				setState(376);
				flag();
				setState(377);
				match(EQUALS);
				setState(378);
				num_int();
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(379);
						match(COMMA);
						setState(380);
						flag();
						setState(381);
						match(EQUALS);
						setState(382);
						num_int();
						}
						} 
					}
					setState(388);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(389);
				hidden();
				setState(390);
				match(SEMICOLON);
				setState(391);
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
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
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
		try {
			int _alt;
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOWN_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(DOWN_COND_KEY);
				setState(397);
				flag();
				setState(398);
				match(EQUALS);
				setState(399);
				num_int();
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(400);
						match(COMMA);
						setState(401);
						flag();
						setState(402);
						match(EQUALS);
						setState(403);
						num_int();
						}
						} 
					}
					setState(409);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(410);
				hidden();
				setState(411);
				match(SEMICOLON);
				setState(412);
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
		enterRule(_localctx, 56, RULE_hidden);
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(COMMA);
				setState(418);
				match(UNDERSCORE);
				setState(419);
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
		enterRule(_localctx, 58, RULE_north_block_message);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORTH_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(NORTH_BLOCK_MESSAGE_KEY);
				setState(424);
				match(STRING);
				setState(425);
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
		enterRule(_localctx, 60, RULE_south_block_message);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOUTH_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(SOUTH_BLOCK_MESSAGE_KEY);
				setState(430);
				match(STRING);
				setState(431);
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
		enterRule(_localctx, 62, RULE_east_block_message);
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EAST_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(EAST_BLOCK_MESSAGE_KEY);
				setState(436);
				match(STRING);
				setState(437);
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
		enterRule(_localctx, 64, RULE_west_block_message);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WEST_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(WEST_BLOCK_MESSAGE_KEY);
				setState(442);
				match(STRING);
				setState(443);
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
		enterRule(_localctx, 66, RULE_up_block_message);
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(UP_BLOCK_MESSAGE_KEY);
				setState(448);
				match(STRING);
				setState(449);
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
		enterRule(_localctx, 68, RULE_down_block_message);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOWN_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(DOWN_BLOCK_MESSAGE_KEY);
				setState(454);
				match(STRING);
				setState(455);
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
		enterRule(_localctx, 70, RULE_action_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(ACTION_KEY);
			setState(460);
			action_block();
			setState(461);
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
		enterRule(_localctx, 72, RULE_global_flag_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(FLAG_KEY);
			setState(464);
			flag();
			setState(465);
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
		enterRule(_localctx, 74, RULE_flag_val_entry);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(VALUE_KEY);
				setState(468);
				num_int();
				setState(469);
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
		enterRule(_localctx, 76, RULE_det_entry);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DET_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				match(DET_KEY);
				setState(475);
				match(STRING);
				setState(476);
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
		enterRule(_localctx, 78, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(OBJECT_TAG);
			setState(481);
			match(LB_CURLY);
			setState(482);
			id_entry();
			setState(483);
			loc_entry();
			setState(484);
			loc_type_entry();
			setState(485);
			name_entry();
			setState(486);
			desc_entry();
			setState(487);
			synonyms_entry();
			setState(488);
			properties_entry();
			setState(489);
			values_entry();
			setState(490);
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
		enterRule(_localctx, 80, RULE_room);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(ROOM_TAG);
			setState(493);
			match(LB_CURLY);
			setState(494);
			id_entry();
			setState(495);
			north_entry();
			setState(496);
			south_entry();
			setState(497);
			east_entry();
			setState(498);
			west_entry();
			setState(499);
			up_entry();
			setState(500);
			down_entry();
			setState(501);
			name_entry();
			setState(502);
			desc_entry();
			setState(503);
			synonyms_entry();
			setState(504);
			det_entry();
			setState(505);
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
		enterRule(_localctx, 82, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(ACTION_TAG);
			setState(508);
			match(LB_CURLY);
			setState(509);
			id_entry();
			setState(510);
			action_entry();
			setState(511);
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
		enterRule(_localctx, 84, RULE_global_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(FLAG_TAG);
			setState(514);
			match(LB_CURLY);
			setState(515);
			global_flag_entry();
			setState(516);
			flag_val_entry();
			setState(517);
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
		enterRule(_localctx, 86, RULE_action_block);
		try {
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				effect_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				effect_aux();
				setState(521);
				action_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(524);
				conditional();
				setState(525);
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
		enterRule(_localctx, 88, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(COND_TAG);
			setState(530);
			match(LB_SHARP);
			setState(531);
			conditions();
			setState(532);
			match(RB_SHARP);
			setState(533);
			match(LB_CURLY);
			setState(534);
			action_block();
			setState(535);
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
		enterRule(_localctx, 90, RULE_conditions);
		try {
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				condition_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				condition_aux();
				setState(539);
				match(AND);
				setState(540);
				conditions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				condition_aux();
				setState(543);
				match(OR);
				setState(544);
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
		enterRule(_localctx, 92, RULE_effect_aux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(EFFECT_TAG);
			setState(549);
			match(LB_SHARP);
			setState(550);
			effect();
			setState(551);
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
		enterRule(_localctx, 94, RULE_condition_aux);
		try {
			setState(556);
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
				setState(553);
				condition();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				match(NOT);
				setState(555);
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
		enterRule(_localctx, 96, RULE_prsa_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(PRSA_COND);
			setState(559);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN_TAG) | (1L << ON_TAG) | (1L << UNDER_TAG) | (1L << ALPHA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(560);
				match(COMMA);
				setState(561);
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
				setState(566);
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
		enterRule(_localctx, 98, RULE_prsa_and_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(PRSA_AND_COND);
			setState(568);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN_TAG) | (1L << ON_TAG) | (1L << UNDER_TAG) | (1L << ALPHA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(569);
				match(COMMA);
				setState(570);
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
				setState(575);
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
		enterRule(_localctx, 100, RULE_prso_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(PRSO_COND);
			setState(577);
			match(ID);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(578);
				match(COMMA);
				setState(579);
				match(ID);
				}
				}
				setState(584);
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
		enterRule(_localctx, 102, RULE_prsi_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(PRSI_COND);
			setState(586);
			match(ID);
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(587);
				match(COMMA);
				setState(588);
				match(ID);
				}
				}
				setState(593);
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
		enterRule(_localctx, 104, RULE_here_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(HERE_COND);
			setState(595);
			match(ID);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(596);
				match(COMMA);
				setState(597);
				match(ID);
				}
				}
				setState(602);
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
		enterRule(_localctx, 106, RULE_inscope_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(INSCOPE_COND);
			setState(604);
			match(ID);
			setState(605);
			match(COMMA);
			setState(606);
			match(ID);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(607);
				match(COMMA);
				setState(608);
				match(ID);
				}
				}
				setState(613);
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
		enterRule(_localctx, 108, RULE_andflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(ANDFLAGS_COND);
			setState(615);
			flag();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(616);
				match(COMMA);
				setState(617);
				flag();
				}
				}
				setState(622);
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
		enterRule(_localctx, 110, RULE_orflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(ORFLAGS_COND);
			setState(624);
			flag();
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(625);
				match(COMMA);
				setState(626);
				flag();
				}
				}
				setState(631);
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
		enterRule(_localctx, 112, RULE_andproperties_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(ANDPROPERTIES_COND);
			setState(633);
			match(ID);
			setState(634);
			match(COMMA);
			setState(635);
			flag();
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(636);
				match(COMMA);
				setState(637);
				flag();
				}
				}
				setState(642);
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
		enterRule(_localctx, 114, RULE_orproperties_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(ORPROPERTIES_COND);
			setState(644);
			match(ID);
			setState(645);
			match(COMMA);
			setState(646);
			flag();
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(647);
				match(COMMA);
				setState(648);
				flag();
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
		enterRule(_localctx, 116, RULE_flagvalue_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(FLAGVALUE_COND);
			setState(655);
			flag();
			setState(656);
			match(COMMA);
			setState(657);
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
		enterRule(_localctx, 118, RULE_haveitem_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(HAVEITEM_COND);
			setState(660);
			match(ID);
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(661);
				match(COMMA);
				setState(662);
				match(ID);
				}
				}
				setState(667);
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
		enterRule(_localctx, 120, RULE_haveitems_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(HAVEITEMS_COND);
			setState(669);
			match(ID);
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(670);
				match(COMMA);
				setState(671);
				match(ID);
				}
				}
				setState(676);
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
		enterRule(_localctx, 122, RULE_equals_cond);
		try {
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				match(EQUALS_COND);
				setState(678);
				match(ID);
				setState(679);
				match(COLON);
				setState(680);
				alpha_numeric();
				setState(681);
				match(COMMA);
				setState(682);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				match(EQUALS_COND);
				setState(685);
				match(ID);
				setState(686);
				match(COLON);
				setState(687);
				alpha_numeric();
				setState(688);
				match(COMMA);
				setState(689);
				match(ID);
				setState(690);
				match(COLON);
				setState(691);
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
		enterRule(_localctx, 124, RULE_gt_cond);
		try {
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				match(GT_COND);
				setState(696);
				match(ID);
				setState(697);
				match(COLON);
				setState(698);
				alpha_numeric();
				setState(699);
				match(COMMA);
				setState(700);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				match(GT_COND);
				setState(703);
				match(ID);
				setState(704);
				match(COLON);
				setState(705);
				alpha_numeric();
				setState(706);
				match(COMMA);
				setState(707);
				match(ID);
				setState(708);
				match(COLON);
				setState(709);
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
		enterRule(_localctx, 126, RULE_lt_cond);
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				match(LT_COND);
				setState(714);
				match(ID);
				setState(715);
				match(COLON);
				setState(716);
				alpha_numeric();
				setState(717);
				match(COMMA);
				setState(718);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				match(LT_COND);
				setState(721);
				match(ID);
				setState(722);
				match(COLON);
				setState(723);
				alpha_numeric();
				setState(724);
				match(COMMA);
				setState(725);
				match(ID);
				setState(726);
				match(COLON);
				setState(727);
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
		enterRule(_localctx, 128, RULE_condition);
		try {
			setState(747);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRSA_COND:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				prsa_cond();
				}
				break;
			case PRSA_AND_COND:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				prsa_and_cond();
				}
				break;
			case PRSO_COND:
				enterOuterAlt(_localctx, 3);
				{
				setState(733);
				prso_cond();
				}
				break;
			case PRSI_COND:
				enterOuterAlt(_localctx, 4);
				{
				setState(734);
				prsi_cond();
				}
				break;
			case HERE_COND:
				enterOuterAlt(_localctx, 5);
				{
				setState(735);
				here_cond();
				}
				break;
			case INSCOPE_COND:
				enterOuterAlt(_localctx, 6);
				{
				setState(736);
				inscope_cond();
				}
				break;
			case ANDFLAGS_COND:
				enterOuterAlt(_localctx, 7);
				{
				setState(737);
				andflags_cond();
				}
				break;
			case ORFLAGS_COND:
				enterOuterAlt(_localctx, 8);
				{
				setState(738);
				orflags_cond();
				}
				break;
			case ANDPROPERTIES_COND:
				enterOuterAlt(_localctx, 9);
				{
				setState(739);
				andproperties_cond();
				}
				break;
			case ORPROPERTIES_COND:
				enterOuterAlt(_localctx, 10);
				{
				setState(740);
				orproperties_cond();
				}
				break;
			case FLAGVALUE_COND:
				enterOuterAlt(_localctx, 11);
				{
				setState(741);
				flagvalue_cond();
				}
				break;
			case HAVEITEM_COND:
				enterOuterAlt(_localctx, 12);
				{
				setState(742);
				haveitem_cond();
				}
				break;
			case HAVEITEMS_COND:
				enterOuterAlt(_localctx, 13);
				{
				setState(743);
				haveitems_cond();
				}
				break;
			case EQUALS_COND:
				enterOuterAlt(_localctx, 14);
				{
				setState(744);
				equals_cond();
				}
				break;
			case GT_COND:
				enterOuterAlt(_localctx, 15);
				{
				setState(745);
				gt_cond();
				}
				break;
			case LT_COND:
				enterOuterAlt(_localctx, 16);
				{
				setState(746);
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
		enterRule(_localctx, 130, RULE_tell_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(TELL_EFF);
			setState(750);
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
		enterRule(_localctx, 132, RULE_goto_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(GOTO_EFF);
			setState(753);
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
		enterRule(_localctx, 134, RULE_setflag_eff);
		try {
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				match(SETFLAG_EFF);
				setState(756);
				flag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				match(SETFLAG_EFF);
				setState(758);
				flag();
				setState(759);
				match(COMMA);
				setState(760);
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
		enterRule(_localctx, 136, RULE_remflag_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(REMFLAG_EFF);
			setState(765);
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
		enterRule(_localctx, 138, RULE_take_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(TAKE_EFF);
			setState(768);
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
		enterRule(_localctx, 140, RULE_place_eff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(PLACE_EFF);
			setState(771);
			match(ID);
			setState(772);
			match(COMMA);
			setState(773);
			match(ID);
			setState(774);
			match(COMMA);
			setState(775);
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
		enterRule(_localctx, 142, RULE_set_var_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(SET_VAR_EFF);
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
		enterRule(_localctx, 144, RULE_inc_var_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(INC_VAR_EFF);
			setState(785);
			match(ID);
			setState(786);
			match(SEMICOLON);
			setState(787);
			alpha_numeric();
			setState(788);
			match(COMMA);
			setState(789);
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
		enterRule(_localctx, 146, RULE_dec_var_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(DEC_VAR_EFF);
			setState(792);
			match(ID);
			setState(793);
			match(SEMICOLON);
			setState(794);
			alpha_numeric();
			setState(795);
			match(COMMA);
			setState(796);
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
		enterRule(_localctx, 148, RULE_effect);
		try {
			setState(807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TELL_EFF:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				tell_eff();
				}
				break;
			case GOTO_EFF:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				goto_eff();
				}
				break;
			case SETFLAG_EFF:
				enterOuterAlt(_localctx, 3);
				{
				setState(800);
				setflag_eff();
				}
				break;
			case REMFLAG_EFF:
				enterOuterAlt(_localctx, 4);
				{
				setState(801);
				remflag_eff();
				}
				break;
			case TAKE_EFF:
				enterOuterAlt(_localctx, 5);
				{
				setState(802);
				take_eff();
				}
				break;
			case PLACE_EFF:
				enterOuterAlt(_localctx, 6);
				{
				setState(803);
				place_eff();
				}
				break;
			case SET_VAR_EFF:
				enterOuterAlt(_localctx, 7);
				{
				setState(804);
				set_var_eff();
				}
				break;
			case INC_VAR_EFF:
				enterOuterAlt(_localctx, 8);
				{
				setState(805);
				inc_var_eff();
				}
				break;
			case DEC_VAR_EFF:
				enterOuterAlt(_localctx, 9);
				{
				setState(806);
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
		enterRule(_localctx, 150, RULE_game_grammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			room();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECT_TAG) | (1L << ROOM_TAG) | (1L << ACTION_TAG) | (1L << FLAG_TAG))) != 0)) {
				{
				setState(814);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ROOM_TAG:
					{
					setState(810);
					room();
					}
					break;
				case OBJECT_TAG:
					{
					setState(811);
					object();
					}
					break;
				case ACTION_TAG:
					{
					setState(812);
					action();
					}
					break;
				case FLAG_TAG:
					{
					setState(813);
					global_flag();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(818);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3b\u0336\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\u00a4"+
		"\n\4\3\5\3\5\5\5\u00a8\n\5\3\6\3\6\3\7\3\7\3\7\5\7\u00af\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00c7\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00d1"+
		"\n\16\3\17\3\17\3\17\3\17\7\17\u00d7\n\17\f\17\16\17\u00da\13\17\3\17"+
		"\3\17\5\17\u00de\n\17\3\20\3\20\3\20\3\20\7\20\u00e4\n\20\f\20\16\20\u00e7"+
		"\13\20\3\20\3\20\3\20\5\20\u00ec\n\20\3\21\3\21\3\21\3\21\7\21\u00f2\n"+
		"\21\f\21\16\21\u00f5\13\21\3\21\3\21\3\21\5\21\u00fa\n\21\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u0101\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0108\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u010f\n\24\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0116\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u011d\n\26\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u0124\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u012f\n\30\f\30\16\30\u0132\13\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0139\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0144\n"+
		"\31\f\31\16\31\u0147\13\31\3\31\3\31\3\31\3\31\3\31\5\31\u014e\n\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0159\n\32\f\32\16\32"+
		"\u015c\13\32\3\32\3\32\3\32\3\32\3\32\5\32\u0163\n\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\7\33\u016e\n\33\f\33\16\33\u0171\13\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u0178\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\7\34\u0183\n\34\f\34\16\34\u0186\13\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u018d\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u0198\n\35\f\35\16\35\u019b\13\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u01a2\n\35\3\36\3\36\3\36\3\36\5\36\u01a8\n\36\3\37\3\37\3\37\3\37\5"+
		"\37\u01ae\n\37\3 \3 \3 \3 \5 \u01b4\n \3!\3!\3!\3!\5!\u01ba\n!\3\"\3\""+
		"\3\"\3\"\5\"\u01c0\n\"\3#\3#\3#\3#\5#\u01c6\n#\3$\3$\3$\3$\5$\u01cc\n"+
		"$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u01db\n\'\3(\3(\3(\3"+
		"(\5(\u01e1\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\5-\u0212\n-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\5/\u0225\n/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\5\61\u022f"+
		"\n\61\3\62\3\62\3\62\3\62\7\62\u0235\n\62\f\62\16\62\u0238\13\62\3\63"+
		"\3\63\3\63\3\63\7\63\u023e\n\63\f\63\16\63\u0241\13\63\3\64\3\64\3\64"+
		"\3\64\7\64\u0247\n\64\f\64\16\64\u024a\13\64\3\65\3\65\3\65\3\65\7\65"+
		"\u0250\n\65\f\65\16\65\u0253\13\65\3\66\3\66\3\66\3\66\7\66\u0259\n\66"+
		"\f\66\16\66\u025c\13\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0264\n\67"+
		"\f\67\16\67\u0267\13\67\38\38\38\38\78\u026d\n8\f8\168\u0270\138\39\3"+
		"9\39\39\79\u0276\n9\f9\169\u0279\139\3:\3:\3:\3:\3:\3:\7:\u0281\n:\f:"+
		"\16:\u0284\13:\3;\3;\3;\3;\3;\3;\7;\u028c\n;\f;\16;\u028f\13;\3<\3<\3"+
		"<\3<\3<\3=\3=\3=\3=\7=\u029a\n=\f=\16=\u029d\13=\3>\3>\3>\3>\7>\u02a3"+
		"\n>\f>\16>\u02a6\13>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5"+
		"?\u02b8\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u02ca\n"+
		"@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u02dc\nA\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u02ee\nB\3C\3C\3C\3D\3D\3"+
		"D\3E\3E\3E\3E\3E\3E\3E\5E\u02fd\nE\3F\3F\3F\3G\3G\3G\3H\3H\3H\3H\3H\3"+
		"H\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u032a\nL\3M\3M\3M\3M\3M\7M\u0331\nM\fM\16"+
		"M\u0334\13M\3M\2\2N\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\2\6\3\2\"$\3\2"+
		"\26\27\4\2\36 \"\"\3\2\36 \2\u0341\2\u009a\3\2\2\2\4\u009c\3\2\2\2\6\u00a3"+
		"\3\2\2\2\b\u00a7\3\2\2\2\n\u00a9\3\2\2\2\f\u00ae\3\2\2\2\16\u00b0\3\2"+
		"\2\2\20\u00b6\3\2\2\2\22\u00b9\3\2\2\2\24\u00bd\3\2\2\2\26\u00c6\3\2\2"+
		"\2\30\u00c8\3\2\2\2\32\u00d0\3\2\2\2\34\u00dd\3\2\2\2\36\u00eb\3\2\2\2"+
		" \u00f9\3\2\2\2\"\u0100\3\2\2\2$\u0107\3\2\2\2&\u010e\3\2\2\2(\u0115\3"+
		"\2\2\2*\u011c\3\2\2\2,\u0123\3\2\2\2.\u0138\3\2\2\2\60\u014d\3\2\2\2\62"+
		"\u0162\3\2\2\2\64\u0177\3\2\2\2\66\u018c\3\2\2\28\u01a1\3\2\2\2:\u01a7"+
		"\3\2\2\2<\u01ad\3\2\2\2>\u01b3\3\2\2\2@\u01b9\3\2\2\2B\u01bf\3\2\2\2D"+
		"\u01c5\3\2\2\2F\u01cb\3\2\2\2H\u01cd\3\2\2\2J\u01d1\3\2\2\2L\u01da\3\2"+
		"\2\2N\u01e0\3\2\2\2P\u01e2\3\2\2\2R\u01ee\3\2\2\2T\u01fd\3\2\2\2V\u0203"+
		"\3\2\2\2X\u0211\3\2\2\2Z\u0213\3\2\2\2\\\u0224\3\2\2\2^\u0226\3\2\2\2"+
		"`\u022e\3\2\2\2b\u0230\3\2\2\2d\u0239\3\2\2\2f\u0242\3\2\2\2h\u024b\3"+
		"\2\2\2j\u0254\3\2\2\2l\u025d\3\2\2\2n\u0268\3\2\2\2p\u0271\3\2\2\2r\u027a"+
		"\3\2\2\2t\u0285\3\2\2\2v\u0290\3\2\2\2x\u0295\3\2\2\2z\u029e\3\2\2\2|"+
		"\u02b7\3\2\2\2~\u02c9\3\2\2\2\u0080\u02db\3\2\2\2\u0082\u02ed\3\2\2\2"+
		"\u0084\u02ef\3\2\2\2\u0086\u02f2\3\2\2\2\u0088\u02fc\3\2\2\2\u008a\u02fe"+
		"\3\2\2\2\u008c\u0301\3\2\2\2\u008e\u0304\3\2\2\2\u0090\u030b\3\2\2\2\u0092"+
		"\u0312\3\2\2\2\u0094\u0319\3\2\2\2\u0096\u0329\3\2\2\2\u0098\u032b\3\2"+
		"\2\2\u009a\u009b\t\2\2\2\u009b\3\3\2\2\2\u009c\u009d\7#\2\2\u009d\5\3"+
		"\2\2\2\u009e\u009f\7#\2\2\u009f\u00a0\7\20\2\2\u00a0\u00a4\7#\2\2\u00a1"+
		"\u00a2\7\20\2\2\u00a2\u00a4\7#\2\2\u00a3\u009e\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\7\3\2\2\2\u00a5\u00a8\5\4\3\2\u00a6\u00a8\5\6\4\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\t\3\2\2\2\u00a9\u00aa\t\3\2\2\u00aa"+
		"\13\3\2\2\2\u00ab\u00af\5\b\5\2\u00ac\u00af\7&\2\2\u00ad\u00af\5\n\6\2"+
		"\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\r\3"+
		"\2\2\2\u00b0\u00b1\7\13\2\2\u00b1\u00b2\5\2\2\2\u00b2\u00b3\7\3\2\2\u00b3"+
		"\u00b4\5\f\7\2\u00b4\u00b5\7\f\2\2\u00b5\17\3\2\2\2\u00b6\u00b7\7\16\2"+
		"\2\u00b7\u00b8\5\2\2\2\u00b8\21\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba\u00bb"+
		"\7\'\2\2\u00bb\u00bc\7\4\2\2\u00bc\23\3\2\2\2\u00bd\u00be\7-\2\2\u00be"+
		"\u00bf\7\'\2\2\u00bf\u00c0\7\4\2\2\u00c0\25\3\2\2\2\u00c1\u00c2\7.\2\2"+
		"\u00c2\u00c3\5\4\3\2\u00c3\u00c4\7\4\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c7"+
		"\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\27\3\2\2\2\u00c8"+
		"\u00c9\7/\2\2\u00c9\u00ca\7&\2\2\u00ca\u00cb\7\4\2\2\u00cb\31\3\2\2\2"+
		"\u00cc\u00cd\7\60\2\2\u00cd\u00ce\7&\2\2\u00ce\u00d1\7\4\2\2\u00cf\u00d1"+
		"\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\33\3\2\2\2\u00d2"+
		"\u00d3\7\61\2\2\u00d3\u00d8\7&\2\2\u00d4\u00d5\7\17\2\2\u00d5\u00d7\7"+
		"&\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00de\7\4"+
		"\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d2\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\35\3\2\2\2\u00df\u00e0\7\62\2\2\u00e0\u00e5\5\20\t\2\u00e1\u00e2\7\17"+
		"\2\2\u00e2\u00e4\5\20\t\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00e9\7\4\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00df\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\37\3\2\2\2\u00ed\u00ee\7\64\2"+
		"\2\u00ee\u00f3\5\16\b\2\u00ef\u00f0\7\17\2\2\u00f0\u00f2\5\16\b\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\4\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00ed\3\2\2\2\u00f9\u00f8\3\2"+
		"\2\2\u00fa!\3\2\2\2\u00fb\u00fc\7\66\2\2\u00fc\u00fd\7\'\2\2\u00fd\u00fe"+
		"\7\4\2\2\u00fe\u0101\5.\30\2\u00ff\u0101\3\2\2\2\u0100\u00fb\3\2\2\2\u0100"+
		"\u00ff\3\2\2\2\u0101#\3\2\2\2\u0102\u0103\7\67\2\2\u0103\u0104\7\'\2\2"+
		"\u0104\u0105\7\4\2\2\u0105\u0108\5\60\31\2\u0106\u0108\3\2\2\2\u0107\u0102"+
		"\3\2\2\2\u0107\u0106\3\2\2\2\u0108%\3\2\2\2\u0109\u010a\78\2\2\u010a\u010b"+
		"\7\'\2\2\u010b\u010c\7\4\2\2\u010c\u010f\5\62\32\2\u010d\u010f\3\2\2\2"+
		"\u010e\u0109\3\2\2\2\u010e\u010d\3\2\2\2\u010f\'\3\2\2\2\u0110\u0111\7"+
		"9\2\2\u0111\u0112\7\'\2\2\u0112\u0113\7\4\2\2\u0113\u0116\5\64\33\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0110\3\2\2\2\u0115\u0114\3\2\2\2\u0116)\3\2\2\2"+
		"\u0117\u0118\7:\2\2\u0118\u0119\7\'\2\2\u0119\u011a\7\4\2\2\u011a\u011d"+
		"\5\66\34\2\u011b\u011d\3\2\2\2\u011c\u0117\3\2\2\2\u011c\u011b\3\2\2\2"+
		"\u011d+\3\2\2\2\u011e\u011f\7;\2\2\u011f\u0120\7\'\2\2\u0120\u0121\7\4"+
		"\2\2\u0121\u0124\58\35\2\u0122\u0124\3\2\2\2\u0123\u011e\3\2\2\2\u0123"+
		"\u0122\3\2\2\2\u0124-\3\2\2\2\u0125\u0126\7<\2\2\u0126\u0127\5\20\t\2"+
		"\u0127\u0128\7\25\2\2\u0128\u0130\5\4\3\2\u0129\u012a\7\17\2\2\u012a\u012b"+
		"\5\20\t\2\u012b\u012c\7\25\2\2\u012c\u012d\5\4\3\2\u012d\u012f\3\2\2\2"+
		"\u012e\u0129\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\5:\36\2\u0134"+
		"\u0135\7\4\2\2\u0135\u0136\5<\37\2\u0136\u0139\3\2\2\2\u0137\u0139\3\2"+
		"\2\2\u0138\u0125\3\2\2\2\u0138\u0137\3\2\2\2\u0139/\3\2\2\2\u013a\u013b"+
		"\7=\2\2\u013b\u013c\5\20\t\2\u013c\u013d\7\25\2\2\u013d\u0145\5\4\3\2"+
		"\u013e\u013f\7\17\2\2\u013f\u0140\5\20\t\2\u0140\u0141\7\25\2\2\u0141"+
		"\u0142\5\4\3\2\u0142\u0144\3\2\2\2\u0143\u013e\3\2\2\2\u0144\u0147\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0148\u0149\5:\36\2\u0149\u014a\7\4\2\2\u014a\u014b\5>"+
		" \2\u014b\u014e\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u013a\3\2\2\2\u014d"+
		"\u014c\3\2\2\2\u014e\61\3\2\2\2\u014f\u0150\7>\2\2\u0150\u0151\5\20\t"+
		"\2\u0151\u0152\7\25\2\2\u0152\u015a\5\4\3\2\u0153\u0154\7\17\2\2\u0154"+
		"\u0155\5\20\t\2\u0155\u0156\7\25\2\2\u0156\u0157\5\4\3\2\u0157\u0159\3"+
		"\2\2\2\u0158\u0153\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\5:"+
		"\36\2\u015e\u015f\7\4\2\2\u015f\u0160\5@!\2\u0160\u0163\3\2\2\2\u0161"+
		"\u0163\3\2\2\2\u0162\u014f\3\2\2\2\u0162\u0161\3\2\2\2\u0163\63\3\2\2"+
		"\2\u0164\u0165\7?\2\2\u0165\u0166\5\20\t\2\u0166\u0167\7\25\2\2\u0167"+
		"\u016f\5\4\3\2\u0168\u0169\7\17\2\2\u0169\u016a\5\20\t\2\u016a\u016b\7"+
		"\25\2\2\u016b\u016c\5\4\3\2\u016c\u016e\3\2\2\2\u016d\u0168\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0172\u0173\5:\36\2\u0173\u0174\7\4\2\2\u0174"+
		"\u0175\5B\"\2\u0175\u0178\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0164\3\2"+
		"\2\2\u0177\u0176\3\2\2\2\u0178\65\3\2\2\2\u0179\u017a\7@\2\2\u017a\u017b"+
		"\5\20\t\2\u017b\u017c\7\25\2\2\u017c\u0184\5\4\3\2\u017d\u017e\7\17\2"+
		"\2\u017e\u017f\5\20\t\2\u017f\u0180\7\25\2\2\u0180\u0181\5\4\3\2\u0181"+
		"\u0183\3\2\2\2\u0182\u017d\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187"+
		"\u0188\5:\36\2\u0188\u0189\7\4\2\2\u0189\u018a\5D#\2\u018a\u018d\3\2\2"+
		"\2\u018b\u018d\3\2\2\2\u018c\u0179\3\2\2\2\u018c\u018b\3\2\2\2\u018d\67"+
		"\3\2\2\2\u018e\u018f\7A\2\2\u018f\u0190\5\20\t\2\u0190\u0191\7\25\2\2"+
		"\u0191\u0199\5\4\3\2\u0192\u0193\7\17\2\2\u0193\u0194\5\20\t\2\u0194\u0195"+
		"\7\25\2\2\u0195\u0196\5\4\3\2\u0196\u0198\3\2\2\2\u0197\u0192\3\2\2\2"+
		"\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c"+
		"\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\5:\36\2\u019d\u019e\7\4\2\2\u019e"+
		"\u019f\5F$\2\u019f\u01a2\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u018e\3\2\2"+
		"\2\u01a1\u01a0\3\2\2\2\u01a29\3\2\2\2\u01a3\u01a4\7\17\2\2\u01a4\u01a5"+
		"\7\16\2\2\u01a5\u01a8\7\33\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a3\3\2\2\2"+
		"\u01a7\u01a6\3\2\2\2\u01a8;\3\2\2\2\u01a9\u01aa\7B\2\2\u01aa\u01ab\7&"+
		"\2\2\u01ab\u01ae\7\4\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01ae=\3\2\2\2\u01af\u01b0\7C\2\2\u01b0\u01b1\7&\2\2\u01b1"+
		"\u01b4\7\4\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b2\3\2"+
		"\2\2\u01b4?\3\2\2\2\u01b5\u01b6\7D\2\2\u01b6\u01b7\7&\2\2\u01b7\u01ba"+
		"\7\4\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b5\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba"+
		"A\3\2\2\2\u01bb\u01bc\7E\2\2\u01bc\u01bd\7&\2\2\u01bd\u01c0\7\4\2\2\u01be"+
		"\u01c0\3\2\2\2\u01bf\u01bb\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0C\3\2\2\2"+
		"\u01c1\u01c2\7F\2\2\u01c2\u01c3\7&\2\2\u01c3\u01c6\7\4\2\2\u01c4\u01c6"+
		"\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6E\3\2\2\2\u01c7"+
		"\u01c8\7G\2\2\u01c8\u01c9\7&\2\2\u01c9\u01cc\7\4\2\2\u01ca\u01cc\3\2\2"+
		"\2\u01cb\u01c7\3\2\2\2\u01cb\u01ca\3\2\2\2\u01ccG\3\2\2\2\u01cd\u01ce"+
		"\7H\2\2\u01ce\u01cf\5X-\2\u01cf\u01d0\7\4\2\2\u01d0I\3\2\2\2\u01d1\u01d2"+
		"\7\63\2\2\u01d2\u01d3\5\20\t\2\u01d3\u01d4\7\4\2\2\u01d4K\3\2\2\2\u01d5"+
		"\u01d6\7\65\2\2\u01d6\u01d7\5\4\3\2\u01d7\u01d8\7\4\2\2\u01d8\u01db\3"+
		"\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01d5\3\2\2\2\u01da\u01d9\3\2\2\2\u01db"+
		"M\3\2\2\2\u01dc\u01dd\7I\2\2\u01dd\u01de\7&\2\2\u01de\u01e1\7\4\2\2\u01df"+
		"\u01e1\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1O\3\2\2\2"+
		"\u01e2\u01e3\7(\2\2\u01e3\u01e4\7\t\2\2\u01e4\u01e5\5\22\n\2\u01e5\u01e6"+
		"\5\24\13\2\u01e6\u01e7\5\26\f\2\u01e7\u01e8\5\30\r\2\u01e8\u01e9\5\32"+
		"\16\2\u01e9\u01ea\5\34\17\2\u01ea\u01eb\5\36\20\2\u01eb\u01ec\5 \21\2"+
		"\u01ec\u01ed\7\n\2\2\u01edQ\3\2\2\2\u01ee\u01ef\7)\2\2\u01ef\u01f0\7\t"+
		"\2\2\u01f0\u01f1\5\22\n\2\u01f1\u01f2\5\"\22\2\u01f2\u01f3\5$\23\2\u01f3"+
		"\u01f4\5&\24\2\u01f4\u01f5\5(\25\2\u01f5\u01f6\5*\26\2\u01f6\u01f7\5,"+
		"\27\2\u01f7\u01f8\5\30\r\2\u01f8\u01f9\5\32\16\2\u01f9\u01fa\5\34\17\2"+
		"\u01fa\u01fb\5N(\2\u01fb\u01fc\7\n\2\2\u01fcS\3\2\2\2\u01fd\u01fe\7*\2"+
		"\2\u01fe\u01ff\7\t\2\2\u01ff\u0200\5\22\n\2\u0200\u0201\5H%\2\u0201\u0202"+
		"\7\n\2\2\u0202U\3\2\2\2\u0203\u0204\7+\2\2\u0204\u0205\7\t\2\2\u0205\u0206"+
		"\5J&\2\u0206\u0207\5L\'\2\u0207\u0208\7\n\2\2\u0208W\3\2\2\2\u0209\u0212"+
		"\5^\60\2\u020a\u020b\5^\60\2\u020b\u020c\5X-\2\u020c\u0212\3\2\2\2\u020d"+
		"\u0212\5Z.\2\u020e\u020f\5Z.\2\u020f\u0210\5X-\2\u0210\u0212\3\2\2\2\u0211"+
		"\u0209\3\2\2\2\u0211\u020a\3\2\2\2\u0211\u020d\3\2\2\2\u0211\u020e\3\2"+
		"\2\2\u0212Y\3\2\2\2\u0213\u0214\7\34\2\2\u0214\u0215\7\7\2\2\u0215\u0216"+
		"\5\\/\2\u0216\u0217\7\b\2\2\u0217\u0218\7\t\2\2\u0218\u0219\5X-\2\u0219"+
		"\u021a\7\n\2\2\u021a[\3\2\2\2\u021b\u0225\5`\61\2\u021c\u021d\5`\61\2"+
		"\u021d\u021e\7\30\2\2\u021e\u021f\5\\/\2\u021f\u0225\3\2\2\2\u0220\u0221"+
		"\5`\61\2\u0221\u0222\7\31\2\2\u0222\u0223\5\\/\2\u0223\u0225\3\2\2\2\u0224"+
		"\u021b\3\2\2\2\u0224\u021c\3\2\2\2\u0224\u0220\3\2\2\2\u0225]\3\2\2\2"+
		"\u0226\u0227\7\35\2\2\u0227\u0228\7\7\2\2\u0228\u0229\5\u0096L\2\u0229"+
		"\u022a\7\b\2\2\u022a_\3\2\2\2\u022b\u022f\5\u0082B\2\u022c\u022d\7\32"+
		"\2\2\u022d\u022f\5\u0082B\2\u022e\u022b\3\2\2\2\u022e\u022c\3\2\2\2\u022f"+
		"a\3\2\2\2\u0230\u0231\7J\2\2\u0231\u0236\t\4\2\2\u0232\u0233\7\17\2\2"+
		"\u0233\u0235\t\4\2\2\u0234\u0232\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237c\3\2\2\2\u0238\u0236\3\2\2\2\u0239"+
		"\u023a\7K\2\2\u023a\u023f\t\4\2\2\u023b\u023c\7\17\2\2\u023c\u023e\t\4"+
		"\2\2\u023d\u023b\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240e\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243\7L\2\2\u0243"+
		"\u0248\7\'\2\2\u0244\u0245\7\17\2\2\u0245\u0247\7\'\2\2\u0246\u0244\3"+
		"\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"g\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024c\7M\2\2\u024c\u0251\7\'\2\2\u024d"+
		"\u024e\7\17\2\2\u024e\u0250\7\'\2\2\u024f\u024d\3\2\2\2\u0250\u0253\3"+
		"\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252i\3\2\2\2\u0253\u0251"+
		"\3\2\2\2\u0254\u0255\7N\2\2\u0255\u025a\7\'\2\2\u0256\u0257\7\17\2\2\u0257"+
		"\u0259\7\'\2\2\u0258\u0256\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2"+
		"\2\2\u025a\u025b\3\2\2\2\u025bk\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025e"+
		"\7O\2\2\u025e\u025f\7\'\2\2\u025f\u0260\7\17\2\2\u0260\u0265\7\'\2\2\u0261"+
		"\u0262\7\17\2\2\u0262\u0264\7\'\2\2\u0263\u0261\3\2\2\2\u0264\u0267\3"+
		"\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266m\3\2\2\2\u0267\u0265"+
		"\3\2\2\2\u0268\u0269\7P\2\2\u0269\u026e\5\20\t\2\u026a\u026b\7\17\2\2"+
		"\u026b\u026d\5\20\t\2\u026c\u026a\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c"+
		"\3\2\2\2\u026e\u026f\3\2\2\2\u026fo\3\2\2\2\u0270\u026e\3\2\2\2\u0271"+
		"\u0272\7Q\2\2\u0272\u0277\5\20\t\2\u0273\u0274\7\17\2\2\u0274\u0276\5"+
		"\20\t\2\u0275\u0273\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278q\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027b\7R\2\2\u027b"+
		"\u027c\7\'\2\2\u027c\u027d\7\17\2\2\u027d\u0282\5\20\t\2\u027e\u027f\7"+
		"\17\2\2\u027f\u0281\5\20\t\2\u0280\u027e\3\2\2\2\u0281\u0284\3\2\2\2\u0282"+
		"\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283s\3\2\2\2\u0284\u0282\3\2\2\2"+
		"\u0285\u0286\7S\2\2\u0286\u0287\7\'\2\2\u0287\u0288\7\17\2\2\u0288\u028d"+
		"\5\20\t\2\u0289\u028a\7\17\2\2\u028a\u028c\5\20\t\2\u028b\u0289\3\2\2"+
		"\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028eu"+
		"\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0291\7T\2\2\u0291\u0292\5\20\t\2\u0292"+
		"\u0293\7\17\2\2\u0293\u0294\5\4\3\2\u0294w\3\2\2\2\u0295\u0296\7U\2\2"+
		"\u0296\u029b\7\'\2\2\u0297\u0298\7\17\2\2\u0298\u029a\7\'\2\2\u0299\u0297"+
		"\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c"+
		"y\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u029f\7V\2\2\u029f\u02a4\7\'\2\2\u02a0"+
		"\u02a1\7\17\2\2\u02a1\u02a3\7\'\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a6\3"+
		"\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5{\3\2\2\2\u02a6\u02a4"+
		"\3\2\2\2\u02a7\u02a8\7W\2\2\u02a8\u02a9\7\'\2\2\u02a9\u02aa\7\3\2\2\u02aa"+
		"\u02ab\5\2\2\2\u02ab\u02ac\7\17\2\2\u02ac\u02ad\5\f\7\2\u02ad\u02b8\3"+
		"\2\2\2\u02ae\u02af\7W\2\2\u02af\u02b0\7\'\2\2\u02b0\u02b1\7\3\2\2\u02b1"+
		"\u02b2\5\2\2\2\u02b2\u02b3\7\17\2\2\u02b3\u02b4\7\'\2\2\u02b4\u02b5\7"+
		"\3\2\2\u02b5\u02b6\5\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02a7\3\2\2\2\u02b7"+
		"\u02ae\3\2\2\2\u02b8}\3\2\2\2\u02b9\u02ba\7X\2\2\u02ba\u02bb\7\'\2\2\u02bb"+
		"\u02bc\7\3\2\2\u02bc\u02bd\5\2\2\2\u02bd\u02be\7\17\2\2\u02be\u02bf\5"+
		"\f\7\2\u02bf\u02ca\3\2\2\2\u02c0\u02c1\7X\2\2\u02c1\u02c2\7\'\2\2\u02c2"+
		"\u02c3\7\3\2\2\u02c3\u02c4\5\2\2\2\u02c4\u02c5\7\17\2\2\u02c5\u02c6\7"+
		"\'\2\2\u02c6\u02c7\7\3\2\2\u02c7\u02c8\5\2\2\2\u02c8\u02ca\3\2\2\2\u02c9"+
		"\u02b9\3\2\2\2\u02c9\u02c0\3\2\2\2\u02ca\177\3\2\2\2\u02cb\u02cc\7Y\2"+
		"\2\u02cc\u02cd\7\'\2\2\u02cd\u02ce\7\3\2\2\u02ce\u02cf\5\2\2\2\u02cf\u02d0"+
		"\7\17\2\2\u02d0\u02d1\5\f\7\2\u02d1\u02dc\3\2\2\2\u02d2\u02d3\7Y\2\2\u02d3"+
		"\u02d4\7\'\2\2\u02d4\u02d5\7\3\2\2\u02d5\u02d6\5\2\2\2\u02d6\u02d7\7\17"+
		"\2\2\u02d7\u02d8\7\'\2\2\u02d8\u02d9\7\3\2\2\u02d9\u02da\5\2\2\2\u02da"+
		"\u02dc\3\2\2\2\u02db\u02cb\3\2\2\2\u02db\u02d2\3\2\2\2\u02dc\u0081\3\2"+
		"\2\2\u02dd\u02ee\5b\62\2\u02de\u02ee\5d\63\2\u02df\u02ee\5f\64\2\u02e0"+
		"\u02ee\5h\65\2\u02e1\u02ee\5j\66\2\u02e2\u02ee\5l\67\2\u02e3\u02ee\5n"+
		"8\2\u02e4\u02ee\5p9\2\u02e5\u02ee\5r:\2\u02e6\u02ee\5t;\2\u02e7\u02ee"+
		"\5v<\2\u02e8\u02ee\5x=\2\u02e9\u02ee\5z>\2\u02ea\u02ee\5|?\2\u02eb\u02ee"+
		"\5~@\2\u02ec\u02ee\5\u0080A\2\u02ed\u02dd\3\2\2\2\u02ed\u02de\3\2\2\2"+
		"\u02ed\u02df\3\2\2\2\u02ed\u02e0\3\2\2\2\u02ed\u02e1\3\2\2\2\u02ed\u02e2"+
		"\3\2\2\2\u02ed\u02e3\3\2\2\2\u02ed\u02e4\3\2\2\2\u02ed\u02e5\3\2\2\2\u02ed"+
		"\u02e6\3\2\2\2\u02ed\u02e7\3\2\2\2\u02ed\u02e8\3\2\2\2\u02ed\u02e9\3\2"+
		"\2\2\u02ed\u02ea\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ec\3\2\2\2\u02ee"+
		"\u0083\3\2\2\2\u02ef\u02f0\7Z\2\2\u02f0\u02f1\7&\2\2\u02f1\u0085\3\2\2"+
		"\2\u02f2\u02f3\7[\2\2\u02f3\u02f4\7\'\2\2\u02f4\u0087\3\2\2\2\u02f5\u02f6"+
		"\7\\\2\2\u02f6\u02fd\5\20\t\2\u02f7\u02f8\7\\\2\2\u02f8\u02f9\5\20\t\2"+
		"\u02f9\u02fa\7\17\2\2\u02fa\u02fb\5\4\3\2\u02fb\u02fd\3\2\2\2\u02fc\u02f5"+
		"\3\2\2\2\u02fc\u02f7\3\2\2\2\u02fd\u0089\3\2\2\2\u02fe\u02ff\7]\2\2\u02ff"+
		"\u0300\5\20\t\2\u0300\u008b\3\2\2\2\u0301\u0302\7^\2\2\u0302\u0303\7\'"+
		"\2\2\u0303\u008d\3\2\2\2\u0304\u0305\7_\2\2\u0305\u0306\7\'\2\2\u0306"+
		"\u0307\7\17\2\2\u0307\u0308\7\'\2\2\u0308\u0309\7\17\2\2\u0309\u030a\t"+
		"\5\2\2\u030a\u008f\3\2\2\2\u030b\u030c\7`\2\2\u030c\u030d\7\'\2\2\u030d"+
		"\u030e\7\4\2\2\u030e\u030f\5\2\2\2\u030f\u0310\7\17\2\2\u0310\u0311\5"+
		"\f\7\2\u0311\u0091\3\2\2\2\u0312\u0313\7a\2\2\u0313\u0314\7\'\2\2\u0314"+
		"\u0315\7\4\2\2\u0315\u0316\5\2\2\2\u0316\u0317\7\17\2\2\u0317\u0318\5"+
		"\f\7\2\u0318\u0093\3\2\2\2\u0319\u031a\7b\2\2\u031a\u031b\7\'\2\2\u031b"+
		"\u031c\7\4\2\2\u031c\u031d\5\2\2\2\u031d\u031e\7\17\2\2\u031e\u031f\5"+
		"\f\7\2\u031f\u0095\3\2\2\2\u0320\u032a\5\u0084C\2\u0321\u032a\5\u0086"+
		"D\2\u0322\u032a\5\u0088E\2\u0323\u032a\5\u008aF\2\u0324\u032a\5\u008c"+
		"G\2\u0325\u032a\5\u008eH\2\u0326\u032a\5\u0090I\2\u0327\u032a\5\u0092"+
		"J\2\u0328\u032a\5\u0094K\2\u0329\u0320\3\2\2\2\u0329\u0321\3\2\2\2\u0329"+
		"\u0322\3\2\2\2\u0329\u0323\3\2\2\2\u0329\u0324\3\2\2\2\u0329\u0325\3\2"+
		"\2\2\u0329\u0326\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u0328\3\2\2\2\u032a"+
		"\u0097\3\2\2\2\u032b\u0332\5R*\2\u032c\u0331\5R*\2\u032d\u0331\5P)\2\u032e"+
		"\u0331\5T+\2\u032f\u0331\5V,\2\u0330\u032c\3\2\2\2\u0330\u032d\3\2\2\2"+
		"\u0330\u032e\3\2\2\2\u0330\u032f\3\2\2\2\u0331\u0334\3\2\2\2\u0332\u0330"+
		"\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0099\3\2\2\2\u0334\u0332\3\2\2\2?"+
		"\u00a3\u00a7\u00ae\u00c6\u00d0\u00d8\u00dd\u00e5\u00eb\u00f3\u00f9\u0100"+
		"\u0107\u010e\u0115\u011c\u0123\u0130\u0138\u0145\u014d\u015a\u0162\u016f"+
		"\u0177\u0184\u018c\u0199\u01a1\u01a7\u01ad\u01b3\u01b9\u01bf\u01c5\u01cb"+
		"\u01da\u01e0\u0211\u0224\u022e\u0236\u023f\u0248\u0251\u025a\u0265\u026e"+
		"\u0277\u0282\u028d\u029b\u02a4\u02b7\u02c9\u02db\u02ed\u02fc\u0329\u0330"+
		"\u0332";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}