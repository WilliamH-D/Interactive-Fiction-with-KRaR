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
		EFFECT_TAG=27, QUERY_TAG=28, ELSE_TAG=29, IN_TAG=30, ON_TAG=31, UNDER_TAG=32, 
		BLOCK_MESSAGE_TAG=33, ALPHA=34, NUMERIC=35, ALPHANUMERIC=36, WHITESPACE=37, 
		STRING=38, ID=39, OBJECT_TAG=40, ROOM_TAG=41, ACTION_TAG=42, FLAG_TAG=43, 
		END_TAG=44, ID_KEY=45, LOC_KEY=46, LOC_TYPE_KEY=47, NAME_KEY=48, DESC_KEY=49, 
		ALT_DESC_KEY=50, CONDS_KEY=51, SYNS_KEY=52, PROPERTIES_KEY=53, FLAG_KEY=54, 
		VALUES_KEY=55, VALUE_KEY=56, NORTH_KEY=57, SOUTH_KEY=58, EAST_KEY=59, 
		WEST_KEY=60, UP_KEY=61, DOWN_KEY=62, NORTH_COND_KEY=63, SOUTH_COND_KEY=64, 
		EAST_COND_KEY=65, WEST_COND_KEY=66, UP_COND_KEY=67, DOWN_COND_KEY=68, 
		NORTH_BLOCK_MESSAGE_KEY=69, SOUTH_BLOCK_MESSAGE_KEY=70, EAST_BLOCK_MESSAGE_KEY=71, 
		WEST_BLOCK_MESSAGE_KEY=72, UP_BLOCK_MESSAGE_KEY=73, DOWN_BLOCK_MESSAGE_KEY=74, 
		ACTION_KEY=75, CHECK_KEY=76, DET_KEY=77, ARE_KEY=78, USE_KEY=79, PRSA_COND=80, 
		PRSA_AND_COND=81, PRSO_COND=82, PRSI_COND=83, HERE_COND=84, INSCOPE_COND=85, 
		ANDFLAGS_COND=86, ORFLAGS_COND=87, ANDPROPERTIES_COND=88, ORPROPERTIES_COND=89, 
		FLAGVALUE_COND=90, HAVEITEM_COND=91, HAVEITEMS_COND=92, EQUALS_COND=93, 
		GT_COND=94, LT_COND=95, TELL_EFF=96, GOTO_EFF=97, SETFLAG_EFF=98, REMFLAG_EFF=99, 
		TAKE_EFF=100, PLACE_EFF=101, SET_VAR_EFF=102, INC_VAR_EFF=103, DEC_VAR_EFF=104, 
		ADD_PROPERTY_EFF=105, REMOVE_PROPERTY_EFF=106, ADD_QUERY_EFF=107, REMOVE_QUERY_EFF=108;
	public static final int
		RULE_alpha_numeric = 0, RULE_num_int = 1, RULE_num_float = 2, RULE_number = 3, 
		RULE_bool = 4, RULE_var = 5, RULE_value = 6, RULE_flag = 7, RULE_id_entry = 8, 
		RULE_loc_entry = 9, RULE_loc_type_entry = 10, RULE_name_entry = 11, RULE_desc_entry = 12, 
		RULE_alt_desc_entry = 13, RULE_synonyms_entry = 14, RULE_properties_entry = 15, 
		RULE_values_entry = 16, RULE_north_entry = 17, RULE_south_entry = 18, 
		RULE_east_entry = 19, RULE_west_entry = 20, RULE_up_entry = 21, RULE_down_entry = 22, 
		RULE_action_entry = 23, RULE_global_flag_entry = 24, RULE_flag_val_entry = 25, 
		RULE_det_entry = 26, RULE_are_entry = 27, RULE_flag_conditions = 28, RULE_north_cond = 29, 
		RULE_south_cond = 30, RULE_east_cond = 31, RULE_west_cond = 32, RULE_up_cond = 33, 
		RULE_down_cond = 34, RULE_hidden = 35, RULE_north_block_message = 36, 
		RULE_south_block_message = 37, RULE_east_block_message = 38, RULE_west_block_message = 39, 
		RULE_up_block_message = 40, RULE_down_block_message = 41, RULE_use_packages = 42, 
		RULE_object = 43, RULE_room = 44, RULE_action = 45, RULE_global_flag = 46, 
		RULE_end = 47, RULE_action_block = 48, RULE_conditional = 49, RULE_conditions = 50, 
		RULE_condition_aux = 51, RULE_effect_aux = 52, RULE_prsa_cond = 53, RULE_prsa_and_cond = 54, 
		RULE_prso_cond = 55, RULE_prsi_cond = 56, RULE_here_cond = 57, RULE_inscope_cond = 58, 
		RULE_andflags_cond = 59, RULE_orflags_cond = 60, RULE_andproperties_cond = 61, 
		RULE_orproperties_cond = 62, RULE_flagvalue_cond = 63, RULE_haveitem_cond = 64, 
		RULE_haveitems_cond = 65, RULE_equals_cond = 66, RULE_gt_cond = 67, RULE_lt_cond = 68, 
		RULE_condition = 69, RULE_tell_eff = 70, RULE_goto_eff = 71, RULE_setflag_eff = 72, 
		RULE_remflag_eff = 73, RULE_take_eff = 74, RULE_place_eff = 75, RULE_set_var_eff = 76, 
		RULE_inc_var_eff = 77, RULE_dec_var_eff = 78, RULE_add_property_eff = 79, 
		RULE_remove_property_eff = 80, RULE_add_query_eff = 81, RULE_remove_query_eff = 82, 
		RULE_effect = 83, RULE_query_conditional = 84, RULE_queries = 85, RULE_query = 86, 
		RULE_functor = 87, RULE_parameters = 88, RULE_parameter = 89, RULE_check_entry = 90, 
		RULE_if_effects = 91, RULE_else_effects = 92, RULE_game_grammar = 93;
	private static String[] makeRuleNames() {
		return new String[] {
			"alpha_numeric", "num_int", "num_float", "number", "bool", "var", "value", 
			"flag", "id_entry", "loc_entry", "loc_type_entry", "name_entry", "desc_entry", 
			"alt_desc_entry", "synonyms_entry", "properties_entry", "values_entry", 
			"north_entry", "south_entry", "east_entry", "west_entry", "up_entry", 
			"down_entry", "action_entry", "global_flag_entry", "flag_val_entry", 
			"det_entry", "are_entry", "flag_conditions", "north_cond", "south_cond", 
			"east_cond", "west_cond", "up_cond", "down_cond", "hidden", "north_block_message", 
			"south_block_message", "east_block_message", "west_block_message", "up_block_message", 
			"down_block_message", "use_packages", "object", "room", "action", "global_flag", 
			"end", "action_block", "conditional", "conditions", "condition_aux", 
			"effect_aux", "prsa_cond", "prsa_and_cond", "prso_cond", "prsi_cond", 
			"here_cond", "inscope_cond", "andflags_cond", "orflags_cond", "andproperties_cond", 
			"orproperties_cond", "flagvalue_cond", "haveitem_cond", "haveitems_cond", 
			"equals_cond", "gt_cond", "lt_cond", "condition", "tell_eff", "goto_eff", 
			"setflag_eff", "remflag_eff", "take_eff", "place_eff", "set_var_eff", 
			"inc_var_eff", "dec_var_eff", "add_property_eff", "remove_property_eff", 
			"add_query_eff", "remove_query_eff", "effect", "query_conditional", "queries", 
			"query", "functor", "parameters", "parameter", "check_entry", "if_effects", 
			"else_effects", "game_grammar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'['", "']'", "'<'", "'>'", "'{'", "'}'", "'('", 
			"')'", "'\"'", "'_'", "','", "'.'", "'+'", "'-'", "'|'", "'&'", "'='", 
			"'TRUE'", "'FALSE'", null, null, "'!'", "'HIDDEN'", "'COND'", "'EFF'", 
			"'QUERY'", "'ELSE'", "'IN'", "'ON'", "'UNDER'", "'BLOCKMESSAGE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "SEMICOLON", "LB_SQUARE", "RB_SQUARE", "LB_SHARP", "RB_SHARP", 
			"LB_CURLY", "RB_CURLY", "LB_ROUND", "RB_ROUND", "QUOTES", "UNDERSCORE", 
			"COMMA", "DOT", "PLUS", "MINUS", "BAR", "ANDPERSAND", "EQUALS", "TRUE", 
			"FALSE", "AND", "OR", "NOT", "HIDDEN_KEY", "COND_TAG", "EFFECT_TAG", 
			"QUERY_TAG", "ELSE_TAG", "IN_TAG", "ON_TAG", "UNDER_TAG", "BLOCK_MESSAGE_TAG", 
			"ALPHA", "NUMERIC", "ALPHANUMERIC", "WHITESPACE", "STRING", "ID", "OBJECT_TAG", 
			"ROOM_TAG", "ACTION_TAG", "FLAG_TAG", "END_TAG", "ID_KEY", "LOC_KEY", 
			"LOC_TYPE_KEY", "NAME_KEY", "DESC_KEY", "ALT_DESC_KEY", "CONDS_KEY", 
			"SYNS_KEY", "PROPERTIES_KEY", "FLAG_KEY", "VALUES_KEY", "VALUE_KEY", 
			"NORTH_KEY", "SOUTH_KEY", "EAST_KEY", "WEST_KEY", "UP_KEY", "DOWN_KEY", 
			"NORTH_COND_KEY", "SOUTH_COND_KEY", "EAST_COND_KEY", "WEST_COND_KEY", 
			"UP_COND_KEY", "DOWN_COND_KEY", "NORTH_BLOCK_MESSAGE_KEY", "SOUTH_BLOCK_MESSAGE_KEY", 
			"EAST_BLOCK_MESSAGE_KEY", "WEST_BLOCK_MESSAGE_KEY", "UP_BLOCK_MESSAGE_KEY", 
			"DOWN_BLOCK_MESSAGE_KEY", "ACTION_KEY", "CHECK_KEY", "DET_KEY", "ARE_KEY", 
			"USE_KEY", "PRSA_COND", "PRSA_AND_COND", "PRSO_COND", "PRSI_COND", "HERE_COND", 
			"INSCOPE_COND", "ANDFLAGS_COND", "ORFLAGS_COND", "ANDPROPERTIES_COND", 
			"ORPROPERTIES_COND", "FLAGVALUE_COND", "HAVEITEM_COND", "HAVEITEMS_COND", 
			"EQUALS_COND", "GT_COND", "LT_COND", "TELL_EFF", "GOTO_EFF", "SETFLAG_EFF", 
			"REMFLAG_EFF", "TAKE_EFF", "PLACE_EFF", "SET_VAR_EFF", "INC_VAR_EFF", 
			"DEC_VAR_EFF", "ADD_PROPERTY_EFF", "REMOVE_PROPERTY_EFF", "ADD_QUERY_EFF", 
			"REMOVE_QUERY_EFF"
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
			setState(188);
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
			setState(190);
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
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(NUMERIC);
				setState(193);
				match(DOT);
				setState(194);
				match(NUMERIC);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(DOT);
				setState(196);
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
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				num_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
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
			setState(203);
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
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
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
			setState(210);
			match(LB_ROUND);
			setState(211);
			alpha_numeric();
			setState(212);
			match(COLON);
			setState(213);
			var();
			setState(214);
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
			setState(216);
			match(UNDERSCORE);
			setState(217);
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
			setState(219);
			match(ID_KEY);
			setState(220);
			match(ID);
			setState(221);
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
			setState(223);
			match(LOC_KEY);
			setState(224);
			match(ID);
			setState(225);
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
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOC_TYPE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(LOC_TYPE_KEY);
				setState(228);
				num_int();
				setState(229);
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
			setState(234);
			match(NAME_KEY);
			setState(235);
			match(STRING);
			setState(236);
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
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESC_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(DESC_KEY);
				setState(239);
				match(STRING);
				setState(240);
				match(SEMICOLON);
				}
				break;
			case RB_CURLY:
			case ALT_DESC_KEY:
			case SYNS_KEY:
			case PROPERTIES_KEY:
			case VALUES_KEY:
			case DET_KEY:
			case ARE_KEY:
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
		public Alt_desc_entryContext alt_desc_entry() {
			return getRuleContext(Alt_desc_entryContext.class,0);
		}
		public Flag_conditionsContext flag_conditions() {
			return getRuleContext(Flag_conditionsContext.class,0);
		}
		public Query_conditionalContext query_conditional() {
			return getRuleContext(Query_conditionalContext.class,0);
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
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALT_DESC_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(ALT_DESC_KEY);
				setState(245);
				match(STRING);
				setState(246);
				match(SEMICOLON);
				setState(247);
				match(CONDS_KEY);
				setState(250);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNDERSCORE:
					{
					setState(248);
					flag_conditions();
					}
					break;
				case QUERY_TAG:
					{
					setState(249);
					query_conditional();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(252);
				match(SEMICOLON);
				setState(253);
				alt_desc_entry();
				}
				break;
			case RB_CURLY:
			case SYNS_KEY:
			case PROPERTIES_KEY:
			case VALUES_KEY:
			case DET_KEY:
			case ARE_KEY:
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
		enterRule(_localctx, 28, RULE_synonyms_entry);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNS_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(SYNS_KEY);
				setState(259);
				match(STRING);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(260);
					match(COMMA);
					setState(261);
					match(STRING);
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
			case RB_CURLY:
			case PROPERTIES_KEY:
			case VALUES_KEY:
			case DET_KEY:
			case ARE_KEY:
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
		enterRule(_localctx, 30, RULE_properties_entry);
		int _la;
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROPERTIES_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(PROPERTIES_KEY);
				setState(272);
				flag();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(273);
					match(COMMA);
					setState(274);
					flag();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(280);
				match(SEMICOLON);
				}
				break;
			case RB_CURLY:
			case VALUES_KEY:
			case DET_KEY:
			case ARE_KEY:
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
		enterRule(_localctx, 32, RULE_values_entry);
		int _la;
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(VALUES_KEY);
				setState(286);
				value();
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(287);
					match(COMMA);
					setState(288);
					value();
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(294);
				match(SEMICOLON);
				}
				break;
			case RB_CURLY:
			case DET_KEY:
			case ARE_KEY:
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
		enterRule(_localctx, 34, RULE_north_entry);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORTH_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(NORTH_KEY);
				setState(300);
				match(ID);
				setState(301);
				match(SEMICOLON);
				setState(302);
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
		enterRule(_localctx, 36, RULE_south_entry);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOUTH_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(SOUTH_KEY);
				setState(307);
				match(ID);
				setState(308);
				match(SEMICOLON);
				setState(309);
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
		enterRule(_localctx, 38, RULE_east_entry);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EAST_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(EAST_KEY);
				setState(314);
				match(ID);
				setState(315);
				match(SEMICOLON);
				setState(316);
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
		enterRule(_localctx, 40, RULE_west_entry);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WEST_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(WEST_KEY);
				setState(321);
				match(ID);
				setState(322);
				match(SEMICOLON);
				setState(323);
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
		enterRule(_localctx, 42, RULE_up_entry);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(UP_KEY);
				setState(328);
				match(ID);
				setState(329);
				match(SEMICOLON);
				setState(330);
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
		enterRule(_localctx, 44, RULE_down_entry);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOWN_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(DOWN_KEY);
				setState(335);
				match(ID);
				setState(336);
				match(SEMICOLON);
				setState(337);
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
		enterRule(_localctx, 46, RULE_action_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(ACTION_KEY);
			setState(342);
			action_block();
			setState(343);
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
		enterRule(_localctx, 48, RULE_global_flag_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(FLAG_KEY);
			setState(346);
			flag();
			setState(347);
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
		enterRule(_localctx, 50, RULE_flag_val_entry);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(VALUE_KEY);
				setState(350);
				num_int();
				setState(351);
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
		enterRule(_localctx, 52, RULE_det_entry);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DET_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(DET_KEY);
				setState(357);
				match(STRING);
				setState(358);
				match(SEMICOLON);
				}
				break;
			case RB_CURLY:
			case ARE_KEY:
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

	public static class Are_entryContext extends ParserRuleContext {
		public TerminalNode ARE_KEY() { return getToken(EditorGrammarParser.ARE_KEY, 0); }
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public TerminalNode TRUE() { return getToken(EditorGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(EditorGrammarParser.FALSE, 0); }
		public Are_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_are_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterAre_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitAre_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitAre_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Are_entryContext are_entry() throws RecognitionException {
		Are_entryContext _localctx = new Are_entryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_are_entry);
		int _la;
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(ARE_KEY);
				setState(363);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(364);
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
		enterRule(_localctx, 56, RULE_flag_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			flag();
			setState(369);
			match(EQUALS);
			setState(370);
			num_int();
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(371);
					match(COMMA);
					setState(372);
					flag();
					setState(373);
					match(EQUALS);
					setState(374);
					num_int();
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class North_condContext extends ParserRuleContext {
		public TerminalNode NORTH_COND_KEY() { return getToken(EditorGrammarParser.NORTH_COND_KEY, 0); }
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public North_block_messageContext north_block_message() {
			return getRuleContext(North_block_messageContext.class,0);
		}
		public Flag_conditionsContext flag_conditions() {
			return getRuleContext(Flag_conditionsContext.class,0);
		}
		public Query_conditionalContext query_conditional() {
			return getRuleContext(Query_conditionalContext.class,0);
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
		enterRule(_localctx, 58, RULE_north_cond);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORTH_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(NORTH_COND_KEY);
				setState(384);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNDERSCORE:
					{
					setState(382);
					flag_conditions();
					}
					break;
				case QUERY_TAG:
					{
					setState(383);
					query_conditional();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(386);
				hidden();
				setState(387);
				match(SEMICOLON);
				setState(388);
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
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public South_block_messageContext south_block_message() {
			return getRuleContext(South_block_messageContext.class,0);
		}
		public Flag_conditionsContext flag_conditions() {
			return getRuleContext(Flag_conditionsContext.class,0);
		}
		public Query_conditionalContext query_conditional() {
			return getRuleContext(Query_conditionalContext.class,0);
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
		enterRule(_localctx, 60, RULE_south_cond);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOUTH_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(SOUTH_COND_KEY);
				setState(396);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNDERSCORE:
					{
					setState(394);
					flag_conditions();
					}
					break;
				case QUERY_TAG:
					{
					setState(395);
					query_conditional();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(398);
				hidden();
				setState(399);
				match(SEMICOLON);
				setState(400);
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
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public East_block_messageContext east_block_message() {
			return getRuleContext(East_block_messageContext.class,0);
		}
		public Flag_conditionsContext flag_conditions() {
			return getRuleContext(Flag_conditionsContext.class,0);
		}
		public Query_conditionalContext query_conditional() {
			return getRuleContext(Query_conditionalContext.class,0);
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
		enterRule(_localctx, 62, RULE_east_cond);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EAST_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(EAST_COND_KEY);
				setState(408);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNDERSCORE:
					{
					setState(406);
					flag_conditions();
					}
					break;
				case QUERY_TAG:
					{
					setState(407);
					query_conditional();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(410);
				hidden();
				setState(411);
				match(SEMICOLON);
				setState(412);
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
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public West_block_messageContext west_block_message() {
			return getRuleContext(West_block_messageContext.class,0);
		}
		public Flag_conditionsContext flag_conditions() {
			return getRuleContext(Flag_conditionsContext.class,0);
		}
		public Query_conditionalContext query_conditional() {
			return getRuleContext(Query_conditionalContext.class,0);
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
		enterRule(_localctx, 64, RULE_west_cond);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WEST_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(WEST_COND_KEY);
				setState(420);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNDERSCORE:
					{
					setState(418);
					flag_conditions();
					}
					break;
				case QUERY_TAG:
					{
					setState(419);
					query_conditional();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(422);
				hidden();
				setState(423);
				match(SEMICOLON);
				setState(424);
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
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Up_block_messageContext up_block_message() {
			return getRuleContext(Up_block_messageContext.class,0);
		}
		public Flag_conditionsContext flag_conditions() {
			return getRuleContext(Flag_conditionsContext.class,0);
		}
		public Query_conditionalContext query_conditional() {
			return getRuleContext(Query_conditionalContext.class,0);
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
		enterRule(_localctx, 66, RULE_up_cond);
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(UP_COND_KEY);
				setState(432);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNDERSCORE:
					{
					setState(430);
					flag_conditions();
					}
					break;
				case QUERY_TAG:
					{
					setState(431);
					query_conditional();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(434);
				hidden();
				setState(435);
				match(SEMICOLON);
				setState(436);
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
		public HiddenContext hidden() {
			return getRuleContext(HiddenContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public Down_block_messageContext down_block_message() {
			return getRuleContext(Down_block_messageContext.class,0);
		}
		public Flag_conditionsContext flag_conditions() {
			return getRuleContext(Flag_conditionsContext.class,0);
		}
		public Query_conditionalContext query_conditional() {
			return getRuleContext(Query_conditionalContext.class,0);
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
		enterRule(_localctx, 68, RULE_down_cond);
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOWN_COND_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(DOWN_COND_KEY);
				setState(444);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNDERSCORE:
					{
					setState(442);
					flag_conditions();
					}
					break;
				case QUERY_TAG:
					{
					setState(443);
					query_conditional();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(446);
				hidden();
				setState(447);
				match(SEMICOLON);
				setState(448);
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
		enterRule(_localctx, 70, RULE_hidden);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(COMMA);
				setState(454);
				match(UNDERSCORE);
				setState(455);
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
		enterRule(_localctx, 72, RULE_north_block_message);
		try {
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORTH_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(NORTH_BLOCK_MESSAGE_KEY);
				setState(460);
				match(STRING);
				setState(461);
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
		enterRule(_localctx, 74, RULE_south_block_message);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOUTH_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(SOUTH_BLOCK_MESSAGE_KEY);
				setState(466);
				match(STRING);
				setState(467);
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
		enterRule(_localctx, 76, RULE_east_block_message);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EAST_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(EAST_BLOCK_MESSAGE_KEY);
				setState(472);
				match(STRING);
				setState(473);
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
		enterRule(_localctx, 78, RULE_west_block_message);
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WEST_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(WEST_BLOCK_MESSAGE_KEY);
				setState(478);
				match(STRING);
				setState(479);
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
		enterRule(_localctx, 80, RULE_up_block_message);
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(UP_BLOCK_MESSAGE_KEY);
				setState(484);
				match(STRING);
				setState(485);
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
		enterRule(_localctx, 82, RULE_down_block_message);
		try {
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOWN_BLOCK_MESSAGE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				match(DOWN_BLOCK_MESSAGE_KEY);
				setState(490);
				match(STRING);
				setState(491);
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

	public static class Use_packagesContext extends ParserRuleContext {
		public TerminalNode USE_KEY() { return getToken(EditorGrammarParser.USE_KEY, 0); }
		public List<TerminalNode> ID() { return getTokens(EditorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EditorGrammarParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public Use_packagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_packages; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterUse_packages(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitUse_packages(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitUse_packages(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_packagesContext use_packages() throws RecognitionException {
		Use_packagesContext _localctx = new Use_packagesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_use_packages);
		int _la;
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				match(USE_KEY);
				setState(496);
				match(ID);
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(497);
					match(COMMA);
					setState(498);
					match(ID);
					}
					}
					setState(503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(504);
				match(SEMICOLON);
				}
				break;
			case ROOM_TAG:
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
		public Det_entryContext det_entry() {
			return getRuleContext(Det_entryContext.class,0);
		}
		public Are_entryContext are_entry() {
			return getRuleContext(Are_entryContext.class,0);
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
		enterRule(_localctx, 86, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(OBJECT_TAG);
			setState(509);
			match(LB_CURLY);
			setState(510);
			id_entry();
			setState(511);
			loc_entry();
			setState(512);
			loc_type_entry();
			setState(513);
			name_entry();
			setState(514);
			desc_entry();
			setState(515);
			alt_desc_entry();
			setState(516);
			synonyms_entry();
			setState(517);
			properties_entry();
			setState(518);
			values_entry();
			setState(519);
			det_entry();
			setState(520);
			are_entry();
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
		enterRule(_localctx, 88, RULE_room);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(ROOM_TAG);
			setState(524);
			match(LB_CURLY);
			setState(525);
			id_entry();
			setState(526);
			north_entry();
			setState(527);
			south_entry();
			setState(528);
			east_entry();
			setState(529);
			west_entry();
			setState(530);
			up_entry();
			setState(531);
			down_entry();
			setState(532);
			name_entry();
			setState(533);
			desc_entry();
			setState(534);
			alt_desc_entry();
			setState(535);
			synonyms_entry();
			setState(536);
			det_entry();
			setState(537);
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
		enterRule(_localctx, 90, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(ACTION_TAG);
			setState(540);
			match(LB_CURLY);
			setState(541);
			id_entry();
			setState(542);
			action_entry();
			setState(543);
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
		enterRule(_localctx, 92, RULE_global_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(FLAG_TAG);
			setState(546);
			match(LB_CURLY);
			setState(547);
			global_flag_entry();
			setState(548);
			flag_val_entry();
			setState(549);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode END_TAG() { return getToken(EditorGrammarParser.END_TAG, 0); }
		public TerminalNode LB_CURLY() { return getToken(EditorGrammarParser.LB_CURLY, 0); }
		public List<Check_entryContext> check_entry() {
			return getRuleContexts(Check_entryContext.class);
		}
		public Check_entryContext check_entry(int i) {
			return getRuleContext(Check_entryContext.class,i);
		}
		public TerminalNode RB_CURLY() { return getToken(EditorGrammarParser.RB_CURLY, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_end);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				match(END_TAG);
				setState(552);
				match(LB_CURLY);
				setState(553);
				check_entry();
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CHECK_KEY) {
					{
					{
					setState(554);
					check_entry();
					}
					}
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(560);
				match(RB_CURLY);
				}
				break;
			case EOF:
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
		enterRule(_localctx, 96, RULE_action_block);
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				effect_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				effect_aux();
				setState(567);
				action_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(570);
				conditional();
				setState(571);
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
		enterRule(_localctx, 98, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(COND_TAG);
			setState(576);
			match(LB_SHARP);
			setState(577);
			conditions();
			setState(578);
			match(RB_SHARP);
			setState(579);
			match(LB_CURLY);
			setState(580);
			action_block();
			setState(581);
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
		enterRule(_localctx, 100, RULE_conditions);
		try {
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				condition_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				condition_aux();
				setState(585);
				match(AND);
				setState(586);
				conditions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(588);
				condition_aux();
				setState(589);
				match(OR);
				setState(590);
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
		enterRule(_localctx, 102, RULE_condition_aux);
		try {
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUERY_TAG:
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
				setState(594);
				condition();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				match(NOT);
				setState(596);
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
		enterRule(_localctx, 104, RULE_effect_aux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(EFFECT_TAG);
			setState(600);
			match(LB_SHARP);
			setState(601);
			effect();
			setState(602);
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
		enterRule(_localctx, 106, RULE_prsa_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(PRSA_COND);
			setState(605);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN_TAG) | (1L << ON_TAG) | (1L << UNDER_TAG) | (1L << ALPHA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(606);
				match(COMMA);
				setState(607);
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
				setState(612);
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
		enterRule(_localctx, 108, RULE_prsa_and_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(PRSA_AND_COND);
			setState(614);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN_TAG) | (1L << ON_TAG) | (1L << UNDER_TAG) | (1L << ALPHA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(615);
				match(COMMA);
				setState(616);
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
				setState(621);
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
		enterRule(_localctx, 110, RULE_prso_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(PRSO_COND);
			setState(623);
			match(ID);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(624);
				match(COMMA);
				setState(625);
				match(ID);
				}
				}
				setState(630);
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
		enterRule(_localctx, 112, RULE_prsi_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(PRSI_COND);
			setState(632);
			match(ID);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(633);
				match(COMMA);
				setState(634);
				match(ID);
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
		enterRule(_localctx, 114, RULE_here_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(HERE_COND);
			setState(641);
			match(ID);
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(642);
				match(COMMA);
				setState(643);
				match(ID);
				}
				}
				setState(648);
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
		enterRule(_localctx, 116, RULE_inscope_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(INSCOPE_COND);
			setState(650);
			match(ID);
			setState(651);
			match(COMMA);
			setState(652);
			match(ID);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(653);
				match(COMMA);
				setState(654);
				match(ID);
				}
				}
				setState(659);
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
		enterRule(_localctx, 118, RULE_andflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(ANDFLAGS_COND);
			setState(661);
			flag();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(662);
				match(COMMA);
				setState(663);
				flag();
				}
				}
				setState(668);
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
		enterRule(_localctx, 120, RULE_orflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(ORFLAGS_COND);
			setState(670);
			flag();
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(671);
				match(COMMA);
				setState(672);
				flag();
				}
				}
				setState(677);
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
		enterRule(_localctx, 122, RULE_andproperties_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(ANDPROPERTIES_COND);
			setState(679);
			match(ID);
			setState(680);
			match(COMMA);
			setState(681);
			flag();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(682);
				match(COMMA);
				setState(683);
				flag();
				}
				}
				setState(688);
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
		enterRule(_localctx, 124, RULE_orproperties_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(ORPROPERTIES_COND);
			setState(690);
			match(ID);
			setState(691);
			match(COMMA);
			setState(692);
			flag();
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(693);
				match(COMMA);
				setState(694);
				flag();
				}
				}
				setState(699);
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
		enterRule(_localctx, 126, RULE_flagvalue_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(FLAGVALUE_COND);
			setState(701);
			flag();
			setState(702);
			match(COMMA);
			setState(703);
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
		enterRule(_localctx, 128, RULE_haveitem_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(HAVEITEM_COND);
			setState(706);
			match(ID);
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(707);
				match(COMMA);
				setState(708);
				match(ID);
				}
				}
				setState(713);
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
		enterRule(_localctx, 130, RULE_haveitems_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(HAVEITEMS_COND);
			setState(715);
			match(ID);
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(716);
				match(COMMA);
				setState(717);
				match(ID);
				}
				}
				setState(722);
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
		enterRule(_localctx, 132, RULE_equals_cond);
		try {
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				match(EQUALS_COND);
				setState(724);
				match(ID);
				setState(725);
				match(COLON);
				setState(726);
				alpha_numeric();
				setState(727);
				match(COMMA);
				setState(728);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				match(EQUALS_COND);
				setState(731);
				match(ID);
				setState(732);
				match(COLON);
				setState(733);
				alpha_numeric();
				setState(734);
				match(COMMA);
				setState(735);
				match(ID);
				setState(736);
				match(COLON);
				setState(737);
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
		enterRule(_localctx, 134, RULE_gt_cond);
		try {
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				match(GT_COND);
				setState(742);
				match(ID);
				setState(743);
				match(COLON);
				setState(744);
				alpha_numeric();
				setState(745);
				match(COMMA);
				setState(746);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				match(GT_COND);
				setState(749);
				match(ID);
				setState(750);
				match(COLON);
				setState(751);
				alpha_numeric();
				setState(752);
				match(COMMA);
				setState(753);
				match(ID);
				setState(754);
				match(COLON);
				setState(755);
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
		enterRule(_localctx, 136, RULE_lt_cond);
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				match(LT_COND);
				setState(760);
				match(ID);
				setState(761);
				match(COLON);
				setState(762);
				alpha_numeric();
				setState(763);
				match(COMMA);
				setState(764);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				match(LT_COND);
				setState(767);
				match(ID);
				setState(768);
				match(COLON);
				setState(769);
				alpha_numeric();
				setState(770);
				match(COMMA);
				setState(771);
				match(ID);
				setState(772);
				match(COLON);
				setState(773);
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
		public Query_conditionalContext query_conditional() {
			return getRuleContext(Query_conditionalContext.class,0);
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
		enterRule(_localctx, 138, RULE_condition);
		try {
			setState(794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRSA_COND:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				prsa_cond();
				}
				break;
			case PRSA_AND_COND:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				prsa_and_cond();
				}
				break;
			case PRSO_COND:
				enterOuterAlt(_localctx, 3);
				{
				setState(779);
				prso_cond();
				}
				break;
			case PRSI_COND:
				enterOuterAlt(_localctx, 4);
				{
				setState(780);
				prsi_cond();
				}
				break;
			case HERE_COND:
				enterOuterAlt(_localctx, 5);
				{
				setState(781);
				here_cond();
				}
				break;
			case INSCOPE_COND:
				enterOuterAlt(_localctx, 6);
				{
				setState(782);
				inscope_cond();
				}
				break;
			case ANDFLAGS_COND:
				enterOuterAlt(_localctx, 7);
				{
				setState(783);
				andflags_cond();
				}
				break;
			case ORFLAGS_COND:
				enterOuterAlt(_localctx, 8);
				{
				setState(784);
				orflags_cond();
				}
				break;
			case ANDPROPERTIES_COND:
				enterOuterAlt(_localctx, 9);
				{
				setState(785);
				andproperties_cond();
				}
				break;
			case ORPROPERTIES_COND:
				enterOuterAlt(_localctx, 10);
				{
				setState(786);
				orproperties_cond();
				}
				break;
			case FLAGVALUE_COND:
				enterOuterAlt(_localctx, 11);
				{
				setState(787);
				flagvalue_cond();
				}
				break;
			case HAVEITEM_COND:
				enterOuterAlt(_localctx, 12);
				{
				setState(788);
				haveitem_cond();
				}
				break;
			case HAVEITEMS_COND:
				enterOuterAlt(_localctx, 13);
				{
				setState(789);
				haveitems_cond();
				}
				break;
			case EQUALS_COND:
				enterOuterAlt(_localctx, 14);
				{
				setState(790);
				equals_cond();
				}
				break;
			case GT_COND:
				enterOuterAlt(_localctx, 15);
				{
				setState(791);
				gt_cond();
				}
				break;
			case LT_COND:
				enterOuterAlt(_localctx, 16);
				{
				setState(792);
				lt_cond();
				}
				break;
			case QUERY_TAG:
				enterOuterAlt(_localctx, 17);
				{
				setState(793);
				query_conditional();
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
		enterRule(_localctx, 140, RULE_tell_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(TELL_EFF);
			setState(797);
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
		enterRule(_localctx, 142, RULE_goto_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(GOTO_EFF);
			setState(800);
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
		enterRule(_localctx, 144, RULE_setflag_eff);
		try {
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				match(SETFLAG_EFF);
				setState(803);
				flag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				match(SETFLAG_EFF);
				setState(805);
				flag();
				setState(806);
				match(COMMA);
				setState(807);
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
		enterRule(_localctx, 146, RULE_remflag_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(REMFLAG_EFF);
			setState(812);
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
		enterRule(_localctx, 148, RULE_take_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(TAKE_EFF);
			setState(815);
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
		enterRule(_localctx, 150, RULE_place_eff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(PLACE_EFF);
			setState(818);
			match(ID);
			setState(819);
			match(COMMA);
			setState(820);
			match(ID);
			setState(821);
			match(COMMA);
			setState(822);
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
		enterRule(_localctx, 152, RULE_set_var_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(SET_VAR_EFF);
			setState(825);
			match(ID);
			setState(826);
			match(SEMICOLON);
			setState(827);
			alpha_numeric();
			setState(828);
			match(COMMA);
			setState(829);
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
		enterRule(_localctx, 154, RULE_inc_var_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(INC_VAR_EFF);
			setState(832);
			match(ID);
			setState(833);
			match(SEMICOLON);
			setState(834);
			alpha_numeric();
			setState(835);
			match(COMMA);
			setState(836);
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
		enterRule(_localctx, 156, RULE_dec_var_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(DEC_VAR_EFF);
			setState(839);
			match(ID);
			setState(840);
			match(SEMICOLON);
			setState(841);
			alpha_numeric();
			setState(842);
			match(COMMA);
			setState(843);
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

	public static class Add_property_effContext extends ParserRuleContext {
		public TerminalNode ADD_PROPERTY_EFF() { return getToken(EditorGrammarParser.ADD_PROPERTY_EFF, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(EditorGrammarParser.COMMA, 0); }
		public FlagContext flag() {
			return getRuleContext(FlagContext.class,0);
		}
		public Add_property_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_property_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterAdd_property_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitAdd_property_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitAdd_property_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_property_effContext add_property_eff() throws RecognitionException {
		Add_property_effContext _localctx = new Add_property_effContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_add_property_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(ADD_PROPERTY_EFF);
			setState(846);
			match(ID);
			setState(847);
			match(COMMA);
			setState(848);
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

	public static class Remove_property_effContext extends ParserRuleContext {
		public TerminalNode REMOVE_PROPERTY_EFF() { return getToken(EditorGrammarParser.REMOVE_PROPERTY_EFF, 0); }
		public TerminalNode ID() { return getToken(EditorGrammarParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(EditorGrammarParser.COMMA, 0); }
		public FlagContext flag() {
			return getRuleContext(FlagContext.class,0);
		}
		public Remove_property_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove_property_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterRemove_property_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitRemove_property_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitRemove_property_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Remove_property_effContext remove_property_eff() throws RecognitionException {
		Remove_property_effContext _localctx = new Remove_property_effContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_remove_property_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(REMOVE_PROPERTY_EFF);
			setState(851);
			match(ID);
			setState(852);
			match(COMMA);
			setState(853);
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

	public static class Add_query_effContext extends ParserRuleContext {
		public TerminalNode ADD_QUERY_EFF() { return getToken(EditorGrammarParser.ADD_QUERY_EFF, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public Add_query_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_query_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterAdd_query_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitAdd_query_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitAdd_query_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_query_effContext add_query_eff() throws RecognitionException {
		Add_query_effContext _localctx = new Add_query_effContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_add_query_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(ADD_QUERY_EFF);
			setState(856);
			query();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Remove_query_effContext extends ParserRuleContext {
		public TerminalNode REMOVE_QUERY_EFF() { return getToken(EditorGrammarParser.REMOVE_QUERY_EFF, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public Remove_query_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove_query_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterRemove_query_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitRemove_query_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitRemove_query_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Remove_query_effContext remove_query_eff() throws RecognitionException {
		Remove_query_effContext _localctx = new Remove_query_effContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_remove_query_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(REMOVE_QUERY_EFF);
			setState(859);
			query();
			}
		}
		catch (RecognitionException re) {
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
		public Add_property_effContext add_property_eff() {
			return getRuleContext(Add_property_effContext.class,0);
		}
		public Remove_property_effContext remove_property_eff() {
			return getRuleContext(Remove_property_effContext.class,0);
		}
		public Add_query_effContext add_query_eff() {
			return getRuleContext(Add_query_effContext.class,0);
		}
		public Remove_query_effContext remove_query_eff() {
			return getRuleContext(Remove_query_effContext.class,0);
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
		enterRule(_localctx, 166, RULE_effect);
		try {
			setState(874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TELL_EFF:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				tell_eff();
				}
				break;
			case GOTO_EFF:
				enterOuterAlt(_localctx, 2);
				{
				setState(862);
				goto_eff();
				}
				break;
			case SETFLAG_EFF:
				enterOuterAlt(_localctx, 3);
				{
				setState(863);
				setflag_eff();
				}
				break;
			case REMFLAG_EFF:
				enterOuterAlt(_localctx, 4);
				{
				setState(864);
				remflag_eff();
				}
				break;
			case TAKE_EFF:
				enterOuterAlt(_localctx, 5);
				{
				setState(865);
				take_eff();
				}
				break;
			case PLACE_EFF:
				enterOuterAlt(_localctx, 6);
				{
				setState(866);
				place_eff();
				}
				break;
			case SET_VAR_EFF:
				enterOuterAlt(_localctx, 7);
				{
				setState(867);
				set_var_eff();
				}
				break;
			case INC_VAR_EFF:
				enterOuterAlt(_localctx, 8);
				{
				setState(868);
				inc_var_eff();
				}
				break;
			case DEC_VAR_EFF:
				enterOuterAlt(_localctx, 9);
				{
				setState(869);
				dec_var_eff();
				}
				break;
			case ADD_PROPERTY_EFF:
				enterOuterAlt(_localctx, 10);
				{
				setState(870);
				add_property_eff();
				}
				break;
			case REMOVE_PROPERTY_EFF:
				enterOuterAlt(_localctx, 11);
				{
				setState(871);
				remove_property_eff();
				}
				break;
			case ADD_QUERY_EFF:
				enterOuterAlt(_localctx, 12);
				{
				setState(872);
				add_query_eff();
				}
				break;
			case REMOVE_QUERY_EFF:
				enterOuterAlt(_localctx, 13);
				{
				setState(873);
				remove_query_eff();
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

	public static class Query_conditionalContext extends ParserRuleContext {
		public TerminalNode QUERY_TAG() { return getToken(EditorGrammarParser.QUERY_TAG, 0); }
		public TerminalNode LB_SHARP() { return getToken(EditorGrammarParser.LB_SHARP, 0); }
		public QueriesContext queries() {
			return getRuleContext(QueriesContext.class,0);
		}
		public TerminalNode RB_SHARP() { return getToken(EditorGrammarParser.RB_SHARP, 0); }
		public Query_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterQuery_conditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitQuery_conditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitQuery_conditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_conditionalContext query_conditional() throws RecognitionException {
		Query_conditionalContext _localctx = new Query_conditionalContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_query_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(QUERY_TAG);
			setState(877);
			match(LB_SHARP);
			setState(878);
			queries();
			setState(879);
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

	public static class QueriesContext extends ParserRuleContext {
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public QueriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterQueries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitQueries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitQueries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueriesContext queries() throws RecognitionException {
		QueriesContext _localctx = new QueriesContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_queries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			query();
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(882);
				match(COMMA);
				setState(883);
				query();
				}
				}
				setState(888);
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

	public static class QueryContext extends ParserRuleContext {
		public FunctorContext functor() {
			return getRuleContext(FunctorContext.class,0);
		}
		public TerminalNode LB_ROUND() { return getToken(EditorGrammarParser.LB_ROUND, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RB_ROUND() { return getToken(EditorGrammarParser.RB_ROUND, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			functor();
			setState(890);
			match(LB_ROUND);
			setState(891);
			parameters();
			setState(892);
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

	public static class FunctorContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(EditorGrammarParser.ALPHA, 0); }
		public TerminalNode ALPHANUMERIC() { return getToken(EditorGrammarParser.ALPHANUMERIC, 0); }
		public FunctorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterFunctor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitFunctor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitFunctor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctorContext functor() throws RecognitionException {
		FunctorContext _localctx = new FunctorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_functor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			_la = _input.LA(1);
			if ( !(_la==ALPHA || _la==ALPHANUMERIC) ) {
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EditorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EditorGrammarParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			parameter();
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(897);
				match(COMMA);
				setState(898);
				parameter();
				}
				}
				setState(903);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(EditorGrammarParser.ALPHA, 0); }
		public TerminalNode ALPHANUMERIC() { return getToken(EditorGrammarParser.ALPHANUMERIC, 0); }
		public TerminalNode NUMERIC() { return getToken(EditorGrammarParser.NUMERIC, 0); }
		public TerminalNode LB_SQUARE() { return getToken(EditorGrammarParser.LB_SQUARE, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode RB_SQUARE() { return getToken(EditorGrammarParser.RB_SQUARE, 0); }
		public TerminalNode BAR() { return getToken(EditorGrammarParser.BAR, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_parameter);
		int _la;
		try {
			setState(915);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA:
			case ALPHANUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(904);
				_la = _input.LA(1);
				if ( !(_la==ALPHA || _la==ALPHANUMERIC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				match(NUMERIC);
				}
				break;
			case LB_SQUARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(906);
				match(LB_SQUARE);
				setState(907);
				parameter();
				setState(911);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BAR:
					{
					setState(908);
					match(BAR);
					setState(909);
					parameter();
					}
					break;
				case RB_SQUARE:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(913);
				match(RB_SQUARE);
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

	public static class Check_entryContext extends ParserRuleContext {
		public TerminalNode CHECK_KEY() { return getToken(EditorGrammarParser.CHECK_KEY, 0); }
		public Query_conditionalContext query_conditional() {
			return getRuleContext(Query_conditionalContext.class,0);
		}
		public List<TerminalNode> LB_CURLY() { return getTokens(EditorGrammarParser.LB_CURLY); }
		public TerminalNode LB_CURLY(int i) {
			return getToken(EditorGrammarParser.LB_CURLY, i);
		}
		public If_effectsContext if_effects() {
			return getRuleContext(If_effectsContext.class,0);
		}
		public List<TerminalNode> RB_CURLY() { return getTokens(EditorGrammarParser.RB_CURLY); }
		public TerminalNode RB_CURLY(int i) {
			return getToken(EditorGrammarParser.RB_CURLY, i);
		}
		public TerminalNode SEMICOLON() { return getToken(EditorGrammarParser.SEMICOLON, 0); }
		public TerminalNode ELSE_TAG() { return getToken(EditorGrammarParser.ELSE_TAG, 0); }
		public Else_effectsContext else_effects() {
			return getRuleContext(Else_effectsContext.class,0);
		}
		public Check_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterCheck_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitCheck_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitCheck_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Check_entryContext check_entry() throws RecognitionException {
		Check_entryContext _localctx = new Check_entryContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_check_entry);
		try {
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				match(CHECK_KEY);
				setState(918);
				query_conditional();
				setState(919);
				match(LB_CURLY);
				setState(920);
				if_effects();
				setState(921);
				match(RB_CURLY);
				setState(922);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
				match(CHECK_KEY);
				setState(925);
				query_conditional();
				setState(926);
				match(LB_CURLY);
				setState(927);
				if_effects();
				setState(928);
				match(RB_CURLY);
				setState(929);
				match(ELSE_TAG);
				setState(930);
				match(LB_CURLY);
				setState(931);
				else_effects();
				setState(932);
				match(RB_CURLY);
				setState(933);
				match(SEMICOLON);
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

	public static class If_effectsContext extends ParserRuleContext {
		public List<Effect_auxContext> effect_aux() {
			return getRuleContexts(Effect_auxContext.class);
		}
		public Effect_auxContext effect_aux(int i) {
			return getRuleContext(Effect_auxContext.class,i);
		}
		public If_effectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_effects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterIf_effects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitIf_effects(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitIf_effects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_effectsContext if_effects() throws RecognitionException {
		If_effectsContext _localctx = new If_effectsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_if_effects);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			effect_aux();
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EFFECT_TAG) {
				{
				{
				setState(938);
				effect_aux();
				}
				}
				setState(943);
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

	public static class Else_effectsContext extends ParserRuleContext {
		public List<Effect_auxContext> effect_aux() {
			return getRuleContexts(Effect_auxContext.class);
		}
		public Effect_auxContext effect_aux(int i) {
			return getRuleContext(Effect_auxContext.class,i);
		}
		public Else_effectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_effects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).enterElse_effects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EditorGrammarListener ) ((EditorGrammarListener)listener).exitElse_effects(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EditorGrammarVisitor ) return ((EditorGrammarVisitor<? extends T>)visitor).visitElse_effects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_effectsContext else_effects() throws RecognitionException {
		Else_effectsContext _localctx = new Else_effectsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_else_effects);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			effect_aux();
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EFFECT_TAG) {
				{
				{
				setState(945);
				effect_aux();
				}
				}
				setState(950);
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

	public static class Game_grammarContext extends ParserRuleContext {
		public Use_packagesContext use_packages() {
			return getRuleContext(Use_packagesContext.class,0);
		}
		public List<RoomContext> room() {
			return getRuleContexts(RoomContext.class);
		}
		public RoomContext room(int i) {
			return getRuleContext(RoomContext.class,i);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
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
		enterRule(_localctx, 186, RULE_game_grammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			use_packages();
			setState(952);
			room();
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECT_TAG) | (1L << ROOM_TAG) | (1L << ACTION_TAG) | (1L << FLAG_TAG))) != 0)) {
				{
				setState(957);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ROOM_TAG:
					{
					setState(953);
					room();
					}
					break;
				case OBJECT_TAG:
					{
					setState(954);
					object();
					}
					break;
				case ACTION_TAG:
					{
					setState(955);
					action();
					}
					break;
				case FLAG_TAG:
					{
					setState(956);
					global_flag();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(962);
			end();
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3n\u03c7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\u00c8\n\4\3\5\3\5\5\5\u00cc\n\5"+
		"\3\6\3\6\3\7\3\7\3\7\5\7\u00d3\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00eb\n\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00f5\n\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u00fd\n\17\3\17\3\17\3\17\3\17\5\17\u0103\n\17\3\20"+
		"\3\20\3\20\3\20\7\20\u0109\n\20\f\20\16\20\u010c\13\20\3\20\3\20\5\20"+
		"\u0110\n\20\3\21\3\21\3\21\3\21\7\21\u0116\n\21\f\21\16\21\u0119\13\21"+
		"\3\21\3\21\3\21\5\21\u011e\n\21\3\22\3\22\3\22\3\22\7\22\u0124\n\22\f"+
		"\22\16\22\u0127\13\22\3\22\3\22\3\22\5\22\u012c\n\22\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u0133\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u013a\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0141\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u0148"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u014f\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0156\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0165\n\33\3\34\3\34\3\34\3\34\5\34\u016b\n\34\3\35\3"+
		"\35\3\35\3\35\5\35\u0171\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u017b\n\36\f\36\16\36\u017e\13\36\3\37\3\37\3\37\5\37\u0183\n\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u018a\n\37\3 \3 \3 \5 \u018f\n \3 \3 \3"+
		" \3 \3 \5 \u0196\n \3!\3!\3!\5!\u019b\n!\3!\3!\3!\3!\3!\5!\u01a2\n!\3"+
		"\"\3\"\3\"\5\"\u01a7\n\"\3\"\3\"\3\"\3\"\3\"\5\"\u01ae\n\"\3#\3#\3#\5"+
		"#\u01b3\n#\3#\3#\3#\3#\3#\5#\u01ba\n#\3$\3$\3$\5$\u01bf\n$\3$\3$\3$\3"+
		"$\3$\5$\u01c6\n$\3%\3%\3%\3%\5%\u01cc\n%\3&\3&\3&\3&\5&\u01d2\n&\3\'\3"+
		"\'\3\'\3\'\5\'\u01d8\n\'\3(\3(\3(\3(\5(\u01de\n(\3)\3)\3)\3)\5)\u01e4"+
		"\n)\3*\3*\3*\3*\5*\u01ea\n*\3+\3+\3+\3+\5+\u01f0\n+\3,\3,\3,\3,\7,\u01f6"+
		"\n,\f,\16,\u01f9\13,\3,\3,\5,\u01fd\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u022e"+
		"\n\61\f\61\16\61\u0231\13\61\3\61\3\61\3\61\5\61\u0236\n\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0240\n\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0253"+
		"\n\64\3\65\3\65\3\65\5\65\u0258\n\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\7\67\u0263\n\67\f\67\16\67\u0266\13\67\38\38\38\38\78\u026c"+
		"\n8\f8\168\u026f\138\39\39\39\39\79\u0275\n9\f9\169\u0278\139\3:\3:\3"+
		":\3:\7:\u027e\n:\f:\16:\u0281\13:\3;\3;\3;\3;\7;\u0287\n;\f;\16;\u028a"+
		"\13;\3<\3<\3<\3<\3<\3<\7<\u0292\n<\f<\16<\u0295\13<\3=\3=\3=\3=\7=\u029b"+
		"\n=\f=\16=\u029e\13=\3>\3>\3>\3>\7>\u02a4\n>\f>\16>\u02a7\13>\3?\3?\3"+
		"?\3?\3?\3?\7?\u02af\n?\f?\16?\u02b2\13?\3@\3@\3@\3@\3@\3@\7@\u02ba\n@"+
		"\f@\16@\u02bd\13@\3A\3A\3A\3A\3A\3B\3B\3B\3B\7B\u02c8\nB\fB\16B\u02cb"+
		"\13B\3C\3C\3C\3C\7C\u02d1\nC\fC\16C\u02d4\13C\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\3D\5D\u02e6\nD\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\5E\u02f8\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\5F\u030a\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\5G\u031d\nG\3H\3H\3H\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\5J\u032c\nJ\3K\3K"+
		"\3K\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O"+
		"\3O\3O\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3S\3S\3S\3T"+
		"\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u036d\nU\3V\3V\3V\3V"+
		"\3V\3W\3W\3W\7W\u0377\nW\fW\16W\u037a\13W\3X\3X\3X\3X\3X\3Y\3Y\3Z\3Z\3"+
		"Z\7Z\u0386\nZ\fZ\16Z\u0389\13Z\3[\3[\3[\3[\3[\3[\3[\5[\u0392\n[\3[\3["+
		"\5[\u0396\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\5\\\u03aa\n\\\3]\3]\7]\u03ae\n]\f]\16]\u03b1\13]\3^\3^"+
		"\7^\u03b5\n^\f^\16^\u03b8\13^\3_\3_\3_\3_\3_\3_\7_\u03c0\n_\f_\16_\u03c3"+
		"\13_\3_\3_\3_\2\2`\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\2\7\3\2$&\3\2\26\27\4\2 \"$$\3\2 \"\4\2$$&&\2\u03d5"+
		"\2\u00be\3\2\2\2\4\u00c0\3\2\2\2\6\u00c7\3\2\2\2\b\u00cb\3\2\2\2\n\u00cd"+
		"\3\2\2\2\f\u00d2\3\2\2\2\16\u00d4\3\2\2\2\20\u00da\3\2\2\2\22\u00dd\3"+
		"\2\2\2\24\u00e1\3\2\2\2\26\u00ea\3\2\2\2\30\u00ec\3\2\2\2\32\u00f4\3\2"+
		"\2\2\34\u0102\3\2\2\2\36\u010f\3\2\2\2 \u011d\3\2\2\2\"\u012b\3\2\2\2"+
		"$\u0132\3\2\2\2&\u0139\3\2\2\2(\u0140\3\2\2\2*\u0147\3\2\2\2,\u014e\3"+
		"\2\2\2.\u0155\3\2\2\2\60\u0157\3\2\2\2\62\u015b\3\2\2\2\64\u0164\3\2\2"+
		"\2\66\u016a\3\2\2\28\u0170\3\2\2\2:\u0172\3\2\2\2<\u0189\3\2\2\2>\u0195"+
		"\3\2\2\2@\u01a1\3\2\2\2B\u01ad\3\2\2\2D\u01b9\3\2\2\2F\u01c5\3\2\2\2H"+
		"\u01cb\3\2\2\2J\u01d1\3\2\2\2L\u01d7\3\2\2\2N\u01dd\3\2\2\2P\u01e3\3\2"+
		"\2\2R\u01e9\3\2\2\2T\u01ef\3\2\2\2V\u01fc\3\2\2\2X\u01fe\3\2\2\2Z\u020d"+
		"\3\2\2\2\\\u021d\3\2\2\2^\u0223\3\2\2\2`\u0235\3\2\2\2b\u023f\3\2\2\2"+
		"d\u0241\3\2\2\2f\u0252\3\2\2\2h\u0257\3\2\2\2j\u0259\3\2\2\2l\u025e\3"+
		"\2\2\2n\u0267\3\2\2\2p\u0270\3\2\2\2r\u0279\3\2\2\2t\u0282\3\2\2\2v\u028b"+
		"\3\2\2\2x\u0296\3\2\2\2z\u029f\3\2\2\2|\u02a8\3\2\2\2~\u02b3\3\2\2\2\u0080"+
		"\u02be\3\2\2\2\u0082\u02c3\3\2\2\2\u0084\u02cc\3\2\2\2\u0086\u02e5\3\2"+
		"\2\2\u0088\u02f7\3\2\2\2\u008a\u0309\3\2\2\2\u008c\u031c\3\2\2\2\u008e"+
		"\u031e\3\2\2\2\u0090\u0321\3\2\2\2\u0092\u032b\3\2\2\2\u0094\u032d\3\2"+
		"\2\2\u0096\u0330\3\2\2\2\u0098\u0333\3\2\2\2\u009a\u033a\3\2\2\2\u009c"+
		"\u0341\3\2\2\2\u009e\u0348\3\2\2\2\u00a0\u034f\3\2\2\2\u00a2\u0354\3\2"+
		"\2\2\u00a4\u0359\3\2\2\2\u00a6\u035c\3\2\2\2\u00a8\u036c\3\2\2\2\u00aa"+
		"\u036e\3\2\2\2\u00ac\u0373\3\2\2\2\u00ae\u037b\3\2\2\2\u00b0\u0380\3\2"+
		"\2\2\u00b2\u0382\3\2\2\2\u00b4\u0395\3\2\2\2\u00b6\u03a9\3\2\2\2\u00b8"+
		"\u03ab\3\2\2\2\u00ba\u03b2\3\2\2\2\u00bc\u03b9\3\2\2\2\u00be\u00bf\t\2"+
		"\2\2\u00bf\3\3\2\2\2\u00c0\u00c1\7%\2\2\u00c1\5\3\2\2\2\u00c2\u00c3\7"+
		"%\2\2\u00c3\u00c4\7\20\2\2\u00c4\u00c8\7%\2\2\u00c5\u00c6\7\20\2\2\u00c6"+
		"\u00c8\7%\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\7\3\2\2\2"+
		"\u00c9\u00cc\5\4\3\2\u00ca\u00cc\5\6\4\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca"+
		"\3\2\2\2\u00cc\t\3\2\2\2\u00cd\u00ce\t\3\2\2\u00ce\13\3\2\2\2\u00cf\u00d3"+
		"\5\b\5\2\u00d0\u00d3\7(\2\2\u00d1\u00d3\5\n\6\2\u00d2\u00cf\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\r\3\2\2\2\u00d4\u00d5\7\13\2"+
		"\2\u00d5\u00d6\5\2\2\2\u00d6\u00d7\7\3\2\2\u00d7\u00d8\5\f\7\2\u00d8\u00d9"+
		"\7\f\2\2\u00d9\17\3\2\2\2\u00da\u00db\7\16\2\2\u00db\u00dc\5\2\2\2\u00dc"+
		"\21\3\2\2\2\u00dd\u00de\7/\2\2\u00de\u00df\7)\2\2\u00df\u00e0\7\4\2\2"+
		"\u00e0\23\3\2\2\2\u00e1\u00e2\7\60\2\2\u00e2\u00e3\7)\2\2\u00e3\u00e4"+
		"\7\4\2\2\u00e4\25\3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6\u00e7\5\4\3\2\u00e7"+
		"\u00e8\7\4\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e5\3\2"+
		"\2\2\u00ea\u00e9\3\2\2\2\u00eb\27\3\2\2\2\u00ec\u00ed\7\62\2\2\u00ed\u00ee"+
		"\7(\2\2\u00ee\u00ef\7\4\2\2\u00ef\31\3\2\2\2\u00f0\u00f1\7\63\2\2\u00f1"+
		"\u00f2\7(\2\2\u00f2\u00f5\7\4\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f0\3\2"+
		"\2\2\u00f4\u00f3\3\2\2\2\u00f5\33\3\2\2\2\u00f6\u00f7\7\64\2\2\u00f7\u00f8"+
		"\7(\2\2\u00f8\u00f9\7\4\2\2\u00f9\u00fc\7\65\2\2\u00fa\u00fd\5:\36\2\u00fb"+
		"\u00fd\5\u00aaV\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00ff\7\4\2\2\u00ff\u0100\5\34\17\2\u0100\u0103\3\2\2\2"+
		"\u0101\u0103\3\2\2\2\u0102\u00f6\3\2\2\2\u0102\u0101\3\2\2\2\u0103\35"+
		"\3\2\2\2\u0104\u0105\7\66\2\2\u0105\u010a\7(\2\2\u0106\u0107\7\17\2\2"+
		"\u0107\u0109\7(\2\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u0110\7\4\2\2\u010e\u0110\3\2\2\2\u010f\u0104\3\2\2\2\u010f\u010e\3\2"+
		"\2\2\u0110\37\3\2\2\2\u0111\u0112\7\67\2\2\u0112\u0117\5\20\t\2\u0113"+
		"\u0114\7\17\2\2\u0114\u0116\5\20\t\2\u0115\u0113\3\2\2\2\u0116\u0119\3"+
		"\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011b\7\4\2\2\u011b\u011e\3\2\2\2\u011c\u011e\3\2"+
		"\2\2\u011d\u0111\3\2\2\2\u011d\u011c\3\2\2\2\u011e!\3\2\2\2\u011f\u0120"+
		"\79\2\2\u0120\u0125\5\16\b\2\u0121\u0122\7\17\2\2\u0122\u0124\5\16\b\2"+
		"\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7\4\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u011f\3\2\2\2\u012b\u012a\3\2"+
		"\2\2\u012c#\3\2\2\2\u012d\u012e\7;\2\2\u012e\u012f\7)\2\2\u012f\u0130"+
		"\7\4\2\2\u0130\u0133\5<\37\2\u0131\u0133\3\2\2\2\u0132\u012d\3\2\2\2\u0132"+
		"\u0131\3\2\2\2\u0133%\3\2\2\2\u0134\u0135\7<\2\2\u0135\u0136\7)\2\2\u0136"+
		"\u0137\7\4\2\2\u0137\u013a\5> \2\u0138\u013a\3\2\2\2\u0139\u0134\3\2\2"+
		"\2\u0139\u0138\3\2\2\2\u013a\'\3\2\2\2\u013b\u013c\7=\2\2\u013c\u013d"+
		"\7)\2\2\u013d\u013e\7\4\2\2\u013e\u0141\5@!\2\u013f\u0141\3\2\2\2\u0140"+
		"\u013b\3\2\2\2\u0140\u013f\3\2\2\2\u0141)\3\2\2\2\u0142\u0143\7>\2\2\u0143"+
		"\u0144\7)\2\2\u0144\u0145\7\4\2\2\u0145\u0148\5B\"\2\u0146\u0148\3\2\2"+
		"\2\u0147\u0142\3\2\2\2\u0147\u0146\3\2\2\2\u0148+\3\2\2\2\u0149\u014a"+
		"\7?\2\2\u014a\u014b\7)\2\2\u014b\u014c\7\4\2\2\u014c\u014f\5D#\2\u014d"+
		"\u014f\3\2\2\2\u014e\u0149\3\2\2\2\u014e\u014d\3\2\2\2\u014f-\3\2\2\2"+
		"\u0150\u0151\7@\2\2\u0151\u0152\7)\2\2\u0152\u0153\7\4\2\2\u0153\u0156"+
		"\5F$\2\u0154\u0156\3\2\2\2\u0155\u0150\3\2\2\2\u0155\u0154\3\2\2\2\u0156"+
		"/\3\2\2\2\u0157\u0158\7M\2\2\u0158\u0159\5b\62\2\u0159\u015a\7\4\2\2\u015a"+
		"\61\3\2\2\2\u015b\u015c\78\2\2\u015c\u015d\5\20\t\2\u015d\u015e\7\4\2"+
		"\2\u015e\63\3\2\2\2\u015f\u0160\7:\2\2\u0160\u0161\5\4\3\2\u0161\u0162"+
		"\7\4\2\2\u0162\u0165\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u015f\3\2\2\2\u0164"+
		"\u0163\3\2\2\2\u0165\65\3\2\2\2\u0166\u0167\7O\2\2\u0167\u0168\7(\2\2"+
		"\u0168\u016b\7\4\2\2\u0169\u016b\3\2\2\2\u016a\u0166\3\2\2\2\u016a\u0169"+
		"\3\2\2\2\u016b\67\3\2\2\2\u016c\u016d\7P\2\2\u016d\u016e\t\3\2\2\u016e"+
		"\u0171\7\4\2\2\u016f\u0171\3\2\2\2\u0170\u016c\3\2\2\2\u0170\u016f\3\2"+
		"\2\2\u01719\3\2\2\2\u0172\u0173\5\20\t\2\u0173\u0174\7\25\2\2\u0174\u017c"+
		"\5\4\3\2\u0175\u0176\7\17\2\2\u0176\u0177\5\20\t\2\u0177\u0178\7\25\2"+
		"\2\u0178\u0179\5\4\3\2\u0179\u017b\3\2\2\2\u017a\u0175\3\2\2\2\u017b\u017e"+
		"\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d;\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0182\7A\2\2\u0180\u0183\5:\36\2\u0181\u0183\5\u00aa"+
		"V\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\5H%\2\u0185\u0186\7\4\2\2\u0186\u0187\5J&\2\u0187\u018a\3\2\2\2"+
		"\u0188\u018a\3\2\2\2\u0189\u017f\3\2\2\2\u0189\u0188\3\2\2\2\u018a=\3"+
		"\2\2\2\u018b\u018e\7B\2\2\u018c\u018f\5:\36\2\u018d\u018f\5\u00aaV\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\5H"+
		"%\2\u0191\u0192\7\4\2\2\u0192\u0193\5L\'\2\u0193\u0196\3\2\2\2\u0194\u0196"+
		"\3\2\2\2\u0195\u018b\3\2\2\2\u0195\u0194\3\2\2\2\u0196?\3\2\2\2\u0197"+
		"\u019a\7C\2\2\u0198\u019b\5:\36\2\u0199\u019b\5\u00aaV\2\u019a\u0198\3"+
		"\2\2\2\u019a\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\5H%\2\u019d"+
		"\u019e\7\4\2\2\u019e\u019f\5N(\2\u019f\u01a2\3\2\2\2\u01a0\u01a2\3\2\2"+
		"\2\u01a1\u0197\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2A\3\2\2\2\u01a3\u01a6"+
		"\7D\2\2\u01a4\u01a7\5:\36\2\u01a5\u01a7\5\u00aaV\2\u01a6\u01a4\3\2\2\2"+
		"\u01a6\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\5H%\2\u01a9\u01aa"+
		"\7\4\2\2\u01aa\u01ab\5P)\2\u01ab\u01ae\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad"+
		"\u01a3\3\2\2\2\u01ad\u01ac\3\2\2\2\u01aeC\3\2\2\2\u01af\u01b2\7E\2\2\u01b0"+
		"\u01b3\5:\36\2\u01b1\u01b3\5\u00aaV\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\5H%\2\u01b5\u01b6\7\4\2\2\u01b6"+
		"\u01b7\5R*\2\u01b7\u01ba\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01af\3\2\2"+
		"\2\u01b9\u01b8\3\2\2\2\u01baE\3\2\2\2\u01bb\u01be\7F\2\2\u01bc\u01bf\5"+
		":\36\2\u01bd\u01bf\5\u00aaV\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2"+
		"\u01bf\u01c0\3\2\2\2\u01c0\u01c1\5H%\2\u01c1\u01c2\7\4\2\2\u01c2\u01c3"+
		"\5T+\2\u01c3\u01c6\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01bb\3\2\2\2\u01c5"+
		"\u01c4\3\2\2\2\u01c6G\3\2\2\2\u01c7\u01c8\7\17\2\2\u01c8\u01c9\7\16\2"+
		"\2\u01c9\u01cc\7\33\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c7\3\2\2\2\u01cb"+
		"\u01ca\3\2\2\2\u01ccI\3\2\2\2\u01cd\u01ce\7G\2\2\u01ce\u01cf\7(\2\2\u01cf"+
		"\u01d2\7\4\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d1\u01d0\3\2"+
		"\2\2\u01d2K\3\2\2\2\u01d3\u01d4\7H\2\2\u01d4\u01d5\7(\2\2\u01d5\u01d8"+
		"\7\4\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d3\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8"+
		"M\3\2\2\2\u01d9\u01da\7I\2\2\u01da\u01db\7(\2\2\u01db\u01de\7\4\2\2\u01dc"+
		"\u01de\3\2\2\2\u01dd\u01d9\3\2\2\2\u01dd\u01dc\3\2\2\2\u01deO\3\2\2\2"+
		"\u01df\u01e0\7J\2\2\u01e0\u01e1\7(\2\2\u01e1\u01e4\7\4\2\2\u01e2\u01e4"+
		"\3\2\2\2\u01e3\u01df\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4Q\3\2\2\2\u01e5"+
		"\u01e6\7K\2\2\u01e6\u01e7\7(\2\2\u01e7\u01ea\7\4\2\2\u01e8\u01ea\3\2\2"+
		"\2\u01e9\u01e5\3\2\2\2\u01e9\u01e8\3\2\2\2\u01eaS\3\2\2\2\u01eb\u01ec"+
		"\7L\2\2\u01ec\u01ed\7(\2\2\u01ed\u01f0\7\4\2\2\u01ee\u01f0\3\2\2\2\u01ef"+
		"\u01eb\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0U\3\2\2\2\u01f1\u01f2\7Q\2\2\u01f2"+
		"\u01f7\7)\2\2\u01f3\u01f4\7\17\2\2\u01f4\u01f6\7)\2\2\u01f5\u01f3\3\2"+
		"\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\7\4\2\2\u01fb\u01fd\3\2"+
		"\2\2\u01fc\u01f1\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fdW\3\2\2\2\u01fe\u01ff"+
		"\7*\2\2\u01ff\u0200\7\t\2\2\u0200\u0201\5\22\n\2\u0201\u0202\5\24\13\2"+
		"\u0202\u0203\5\26\f\2\u0203\u0204\5\30\r\2\u0204\u0205\5\32\16\2\u0205"+
		"\u0206\5\34\17\2\u0206\u0207\5\36\20\2\u0207\u0208\5 \21\2\u0208\u0209"+
		"\5\"\22\2\u0209\u020a\5\66\34\2\u020a\u020b\58\35\2\u020b\u020c\7\n\2"+
		"\2\u020cY\3\2\2\2\u020d\u020e\7+\2\2\u020e\u020f\7\t\2\2\u020f\u0210\5"+
		"\22\n\2\u0210\u0211\5$\23\2\u0211\u0212\5&\24\2\u0212\u0213\5(\25\2\u0213"+
		"\u0214\5*\26\2\u0214\u0215\5,\27\2\u0215\u0216\5.\30\2\u0216\u0217\5\30"+
		"\r\2\u0217\u0218\5\32\16\2\u0218\u0219\5\34\17\2\u0219\u021a\5\36\20\2"+
		"\u021a\u021b\5\66\34\2\u021b\u021c\7\n\2\2\u021c[\3\2\2\2\u021d\u021e"+
		"\7,\2\2\u021e\u021f\7\t\2\2\u021f\u0220\5\22\n\2\u0220\u0221\5\60\31\2"+
		"\u0221\u0222\7\n\2\2\u0222]\3\2\2\2\u0223\u0224\7-\2\2\u0224\u0225\7\t"+
		"\2\2\u0225\u0226\5\62\32\2\u0226\u0227\5\64\33\2\u0227\u0228\7\n\2\2\u0228"+
		"_\3\2\2\2\u0229\u022a\7.\2\2\u022a\u022b\7\t\2\2\u022b\u022f\5\u00b6\\"+
		"\2\u022c\u022e\5\u00b6\\\2\u022d\u022c\3\2\2\2\u022e\u0231\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u022f\3\2"+
		"\2\2\u0232\u0233\7\n\2\2\u0233\u0236\3\2\2\2\u0234\u0236\3\2\2\2\u0235"+
		"\u0229\3\2\2\2\u0235\u0234\3\2\2\2\u0236a\3\2\2\2\u0237\u0240\5j\66\2"+
		"\u0238\u0239\5j\66\2\u0239\u023a\5b\62\2\u023a\u0240\3\2\2\2\u023b\u0240"+
		"\5d\63\2\u023c\u023d\5d\63\2\u023d\u023e\5b\62\2\u023e\u0240\3\2\2\2\u023f"+
		"\u0237\3\2\2\2\u023f\u0238\3\2\2\2\u023f\u023b\3\2\2\2\u023f\u023c\3\2"+
		"\2\2\u0240c\3\2\2\2\u0241\u0242\7\34\2\2\u0242\u0243\7\7\2\2\u0243\u0244"+
		"\5f\64\2\u0244\u0245\7\b\2\2\u0245\u0246\7\t\2\2\u0246\u0247\5b\62\2\u0247"+
		"\u0248\7\n\2\2\u0248e\3\2\2\2\u0249\u0253\5h\65\2\u024a\u024b\5h\65\2"+
		"\u024b\u024c\7\30\2\2\u024c\u024d\5f\64\2\u024d\u0253\3\2\2\2\u024e\u024f"+
		"\5h\65\2\u024f\u0250\7\31\2\2\u0250\u0251\5f\64\2\u0251\u0253\3\2\2\2"+
		"\u0252\u0249\3\2\2\2\u0252\u024a\3\2\2\2\u0252\u024e\3\2\2\2\u0253g\3"+
		"\2\2\2\u0254\u0258\5\u008cG\2\u0255\u0256\7\32\2\2\u0256\u0258\5\u008c"+
		"G\2\u0257\u0254\3\2\2\2\u0257\u0255\3\2\2\2\u0258i\3\2\2\2\u0259\u025a"+
		"\7\35\2\2\u025a\u025b\7\7\2\2\u025b\u025c\5\u00a8U\2\u025c\u025d\7\b\2"+
		"\2\u025dk\3\2\2\2\u025e\u025f\7R\2\2\u025f\u0264\t\4\2\2\u0260\u0261\7"+
		"\17\2\2\u0261\u0263\t\4\2\2\u0262\u0260\3\2\2\2\u0263\u0266\3\2\2\2\u0264"+
		"\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265m\3\2\2\2\u0266\u0264\3\2\2\2"+
		"\u0267\u0268\7S\2\2\u0268\u026d\t\4\2\2\u0269\u026a\7\17\2\2\u026a\u026c"+
		"\t\4\2\2\u026b\u0269\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026eo\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0271\7T\2\2\u0271"+
		"\u0276\7)\2\2\u0272\u0273\7\17\2\2\u0273\u0275\7)\2\2\u0274\u0272\3\2"+
		"\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"q\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027a\7U\2\2\u027a\u027f\7)\2\2\u027b"+
		"\u027c\7\17\2\2\u027c\u027e\7)\2\2\u027d\u027b\3\2\2\2\u027e\u0281\3\2"+
		"\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280s\3\2\2\2\u0281\u027f"+
		"\3\2\2\2\u0282\u0283\7V\2\2\u0283\u0288\7)\2\2\u0284\u0285\7\17\2\2\u0285"+
		"\u0287\7)\2\2\u0286\u0284\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2"+
		"\2\2\u0288\u0289\3\2\2\2\u0289u\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028c"+
		"\7W\2\2\u028c\u028d\7)\2\2\u028d\u028e\7\17\2\2\u028e\u0293\7)\2\2\u028f"+
		"\u0290\7\17\2\2\u0290\u0292\7)\2\2\u0291\u028f\3\2\2\2\u0292\u0295\3\2"+
		"\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294w\3\2\2\2\u0295\u0293"+
		"\3\2\2\2\u0296\u0297\7X\2\2\u0297\u029c\5\20\t\2\u0298\u0299\7\17\2\2"+
		"\u0299\u029b\5\20\t\2\u029a\u0298\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a"+
		"\3\2\2\2\u029c\u029d\3\2\2\2\u029dy\3\2\2\2\u029e\u029c\3\2\2\2\u029f"+
		"\u02a0\7Y\2\2\u02a0\u02a5\5\20\t\2\u02a1\u02a2\7\17\2\2\u02a2\u02a4\5"+
		"\20\t\2\u02a3\u02a1\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6{\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\7Z\2\2\u02a9"+
		"\u02aa\7)\2\2\u02aa\u02ab\7\17\2\2\u02ab\u02b0\5\20\t\2\u02ac\u02ad\7"+
		"\17\2\2\u02ad\u02af\5\20\t\2\u02ae\u02ac\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0"+
		"\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1}\3\2\2\2\u02b2\u02b0\3\2\2\2"+
		"\u02b3\u02b4\7[\2\2\u02b4\u02b5\7)\2\2\u02b5\u02b6\7\17\2\2\u02b6\u02bb"+
		"\5\20\t\2\u02b7\u02b8\7\17\2\2\u02b8\u02ba\5\20\t\2\u02b9\u02b7\3\2\2"+
		"\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\177"+
		"\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02bf\7\\\2\2\u02bf\u02c0\5\20\t\2"+
		"\u02c0\u02c1\7\17\2\2\u02c1\u02c2\5\4\3\2\u02c2\u0081\3\2\2\2\u02c3\u02c4"+
		"\7]\2\2\u02c4\u02c9\7)\2\2\u02c5\u02c6\7\17\2\2\u02c6\u02c8\7)\2\2\u02c7"+
		"\u02c5\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2"+
		"\2\2\u02ca\u0083\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02cd\7^\2\2\u02cd"+
		"\u02d2\7)\2\2\u02ce\u02cf\7\17\2\2\u02cf\u02d1\7)\2\2\u02d0\u02ce\3\2"+
		"\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3"+
		"\u0085\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d6\7_\2\2\u02d6\u02d7\7)\2"+
		"\2\u02d7\u02d8\7\3\2\2\u02d8\u02d9\5\2\2\2\u02d9\u02da\7\17\2\2\u02da"+
		"\u02db\5\f\7\2\u02db\u02e6\3\2\2\2\u02dc\u02dd\7_\2\2\u02dd\u02de\7)\2"+
		"\2\u02de\u02df\7\3\2\2\u02df\u02e0\5\2\2\2\u02e0\u02e1\7\17\2\2\u02e1"+
		"\u02e2\7)\2\2\u02e2\u02e3\7\3\2\2\u02e3\u02e4\5\2\2\2\u02e4\u02e6\3\2"+
		"\2\2\u02e5\u02d5\3\2\2\2\u02e5\u02dc\3\2\2\2\u02e6\u0087\3\2\2\2\u02e7"+
		"\u02e8\7`\2\2\u02e8\u02e9\7)\2\2\u02e9\u02ea\7\3\2\2\u02ea\u02eb\5\2\2"+
		"\2\u02eb\u02ec\7\17\2\2\u02ec\u02ed\5\f\7\2\u02ed\u02f8\3\2\2\2\u02ee"+
		"\u02ef\7`\2\2\u02ef\u02f0\7)\2\2\u02f0\u02f1\7\3\2\2\u02f1\u02f2\5\2\2"+
		"\2\u02f2\u02f3\7\17\2\2\u02f3\u02f4\7)\2\2\u02f4\u02f5\7\3\2\2\u02f5\u02f6"+
		"\5\2\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02e7\3\2\2\2\u02f7\u02ee\3\2\2\2\u02f8"+
		"\u0089\3\2\2\2\u02f9\u02fa\7a\2\2\u02fa\u02fb\7)\2\2\u02fb\u02fc\7\3\2"+
		"\2\u02fc\u02fd\5\2\2\2\u02fd\u02fe\7\17\2\2\u02fe\u02ff\5\f\7\2\u02ff"+
		"\u030a\3\2\2\2\u0300\u0301\7a\2\2\u0301\u0302\7)\2\2\u0302\u0303\7\3\2"+
		"\2\u0303\u0304\5\2\2\2\u0304\u0305\7\17\2\2\u0305\u0306\7)\2\2\u0306\u0307"+
		"\7\3\2\2\u0307\u0308\5\2\2\2\u0308\u030a\3\2\2\2\u0309\u02f9\3\2\2\2\u0309"+
		"\u0300\3\2\2\2\u030a\u008b\3\2\2\2\u030b\u031d\5l\67\2\u030c\u031d\5n"+
		"8\2\u030d\u031d\5p9\2\u030e\u031d\5r:\2\u030f\u031d\5t;\2\u0310\u031d"+
		"\5v<\2\u0311\u031d\5x=\2\u0312\u031d\5z>\2\u0313\u031d\5|?\2\u0314\u031d"+
		"\5~@\2\u0315\u031d\5\u0080A\2\u0316\u031d\5\u0082B\2\u0317\u031d\5\u0084"+
		"C\2\u0318\u031d\5\u0086D\2\u0319\u031d\5\u0088E\2\u031a\u031d\5\u008a"+
		"F\2\u031b\u031d\5\u00aaV\2\u031c\u030b\3\2\2\2\u031c\u030c\3\2\2\2\u031c"+
		"\u030d\3\2\2\2\u031c\u030e\3\2\2\2\u031c\u030f\3\2\2\2\u031c\u0310\3\2"+
		"\2\2\u031c\u0311\3\2\2\2\u031c\u0312\3\2\2\2\u031c\u0313\3\2\2\2\u031c"+
		"\u0314\3\2\2\2\u031c\u0315\3\2\2\2\u031c\u0316\3\2\2\2\u031c\u0317\3\2"+
		"\2\2\u031c\u0318\3\2\2\2\u031c\u0319\3\2\2\2\u031c\u031a\3\2\2\2\u031c"+
		"\u031b\3\2\2\2\u031d\u008d\3\2\2\2\u031e\u031f\7b\2\2\u031f\u0320\7(\2"+
		"\2\u0320\u008f\3\2\2\2\u0321\u0322\7c\2\2\u0322\u0323\7)\2\2\u0323\u0091"+
		"\3\2\2\2\u0324\u0325\7d\2\2\u0325\u032c\5\20\t\2\u0326\u0327\7d\2\2\u0327"+
		"\u0328\5\20\t\2\u0328\u0329\7\17\2\2\u0329\u032a\5\4\3\2\u032a\u032c\3"+
		"\2\2\2\u032b\u0324\3\2\2\2\u032b\u0326\3\2\2\2\u032c\u0093\3\2\2\2\u032d"+
		"\u032e\7e\2\2\u032e\u032f\5\20\t\2\u032f\u0095\3\2\2\2\u0330\u0331\7f"+
		"\2\2\u0331\u0332\7)\2\2\u0332\u0097\3\2\2\2\u0333\u0334\7g\2\2\u0334\u0335"+
		"\7)\2\2\u0335\u0336\7\17\2\2\u0336\u0337\7)\2\2\u0337\u0338\7\17\2\2\u0338"+
		"\u0339\t\5\2\2\u0339\u0099\3\2\2\2\u033a\u033b\7h\2\2\u033b\u033c\7)\2"+
		"\2\u033c\u033d\7\4\2\2\u033d\u033e\5\2\2\2\u033e\u033f\7\17\2\2\u033f"+
		"\u0340\5\f\7\2\u0340\u009b\3\2\2\2\u0341\u0342\7i\2\2\u0342\u0343\7)\2"+
		"\2\u0343\u0344\7\4\2\2\u0344\u0345\5\2\2\2\u0345\u0346\7\17\2\2\u0346"+
		"\u0347\5\f\7\2\u0347\u009d\3\2\2\2\u0348\u0349\7j\2\2\u0349\u034a\7)\2"+
		"\2\u034a\u034b\7\4\2\2\u034b\u034c\5\2\2\2\u034c\u034d\7\17\2\2\u034d"+
		"\u034e\5\f\7\2\u034e\u009f\3\2\2\2\u034f\u0350\7k\2\2\u0350\u0351\7)\2"+
		"\2\u0351\u0352\7\17\2\2\u0352\u0353\5\20\t\2\u0353\u00a1\3\2\2\2\u0354"+
		"\u0355\7l\2\2\u0355\u0356\7)\2\2\u0356\u0357\7\17\2\2\u0357\u0358\5\20"+
		"\t\2\u0358\u00a3\3\2\2\2\u0359\u035a\7m\2\2\u035a\u035b\5\u00aeX\2\u035b"+
		"\u00a5\3\2\2\2\u035c\u035d\7n\2\2\u035d\u035e\5\u00aeX\2\u035e\u00a7\3"+
		"\2\2\2\u035f\u036d\5\u008eH\2\u0360\u036d\5\u0090I\2\u0361\u036d\5\u0092"+
		"J\2\u0362\u036d\5\u0094K\2\u0363\u036d\5\u0096L\2\u0364\u036d\5\u0098"+
		"M\2\u0365\u036d\5\u009aN\2\u0366\u036d\5\u009cO\2\u0367\u036d\5\u009e"+
		"P\2\u0368\u036d\5\u00a0Q\2\u0369\u036d\5\u00a2R\2\u036a\u036d\5\u00a4"+
		"S\2\u036b\u036d\5\u00a6T\2\u036c\u035f\3\2\2\2\u036c\u0360\3\2\2\2\u036c"+
		"\u0361\3\2\2\2\u036c\u0362\3\2\2\2\u036c\u0363\3\2\2\2\u036c\u0364\3\2"+
		"\2\2\u036c\u0365\3\2\2\2\u036c\u0366\3\2\2\2\u036c\u0367\3\2\2\2\u036c"+
		"\u0368\3\2\2\2\u036c\u0369\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036b\3\2"+
		"\2\2\u036d\u00a9\3\2\2\2\u036e\u036f\7\36\2\2\u036f\u0370\7\7\2\2\u0370"+
		"\u0371\5\u00acW\2\u0371\u0372\7\b\2\2\u0372\u00ab\3\2\2\2\u0373\u0378"+
		"\5\u00aeX\2\u0374\u0375\7\17\2\2\u0375\u0377\5\u00aeX\2\u0376\u0374\3"+
		"\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379"+
		"\u00ad\3\2\2\2\u037a\u0378\3\2\2\2\u037b\u037c\5\u00b0Y\2\u037c\u037d"+
		"\7\13\2\2\u037d\u037e\5\u00b2Z\2\u037e\u037f\7\f\2\2\u037f\u00af\3\2\2"+
		"\2\u0380\u0381\t\6\2\2\u0381\u00b1\3\2\2\2\u0382\u0387\5\u00b4[\2\u0383"+
		"\u0384\7\17\2\2\u0384\u0386\5\u00b4[\2\u0385\u0383\3\2\2\2\u0386\u0389"+
		"\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u00b3\3\2\2\2\u0389"+
		"\u0387\3\2\2\2\u038a\u0396\t\6\2\2\u038b\u0396\7%\2\2\u038c\u038d\7\5"+
		"\2\2\u038d\u0391\5\u00b4[\2\u038e\u038f\7\23\2\2\u038f\u0392\5\u00b4["+
		"\2\u0390\u0392\3\2\2\2\u0391\u038e\3\2\2\2\u0391\u0390\3\2\2\2\u0392\u0393"+
		"\3\2\2\2\u0393\u0394\7\6\2\2\u0394\u0396\3\2\2\2\u0395\u038a\3\2\2\2\u0395"+
		"\u038b\3\2\2\2\u0395\u038c\3\2\2\2\u0396\u00b5\3\2\2\2\u0397\u0398\7N"+
		"\2\2\u0398\u0399\5\u00aaV\2\u0399\u039a\7\t\2\2\u039a\u039b\5\u00b8]\2"+
		"\u039b\u039c\7\n\2\2\u039c\u039d\7\4\2\2\u039d\u03aa\3\2\2\2\u039e\u039f"+
		"\7N\2\2\u039f\u03a0\5\u00aaV\2\u03a0\u03a1\7\t\2\2\u03a1\u03a2\5\u00b8"+
		"]\2\u03a2\u03a3\7\n\2\2\u03a3\u03a4\7\37\2\2\u03a4\u03a5\7\t\2\2\u03a5"+
		"\u03a6\5\u00ba^\2\u03a6\u03a7\7\n\2\2\u03a7\u03a8\7\4\2\2\u03a8\u03aa"+
		"\3\2\2\2\u03a9\u0397\3\2\2\2\u03a9\u039e\3\2\2\2\u03aa\u00b7\3\2\2\2\u03ab"+
		"\u03af\5j\66\2\u03ac\u03ae\5j\66\2\u03ad\u03ac\3\2\2\2\u03ae\u03b1\3\2"+
		"\2\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u00b9\3\2\2\2\u03b1"+
		"\u03af\3\2\2\2\u03b2\u03b6\5j\66\2\u03b3\u03b5\5j\66\2\u03b4\u03b3\3\2"+
		"\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7"+
		"\u00bb\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03ba\5V,\2\u03ba\u03c1\5Z.\2"+
		"\u03bb\u03c0\5Z.\2\u03bc\u03c0\5X-\2\u03bd\u03c0\5\\/\2\u03be\u03c0\5"+
		"^\60\2\u03bf\u03bb\3\2\2\2\u03bf\u03bc\3\2\2\2\u03bf\u03bd\3\2\2\2\u03bf"+
		"\u03be\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2"+
		"\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c4\u03c5\5`\61\2\u03c5"+
		"\u00bd\3\2\2\2N\u00c7\u00cb\u00d2\u00ea\u00f4\u00fc\u0102\u010a\u010f"+
		"\u0117\u011d\u0125\u012b\u0132\u0139\u0140\u0147\u014e\u0155\u0164\u016a"+
		"\u0170\u017c\u0182\u0189\u018e\u0195\u019a\u01a1\u01a6\u01ad\u01b2\u01b9"+
		"\u01be\u01c5\u01cb\u01d1\u01d7\u01dd\u01e3\u01e9\u01ef\u01f7\u01fc\u022f"+
		"\u0235\u023f\u0252\u0257\u0264\u026d\u0276\u027f\u0288\u0293\u029c\u02a5"+
		"\u02b0\u02bb\u02c9\u02d2\u02e5\u02f7\u0309\u031c\u032b\u036c\u0378\u0387"+
		"\u0391\u0395\u03a9\u03af\u03b6\u03bf\u03c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}