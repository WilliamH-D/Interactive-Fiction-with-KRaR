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
		IN_TAG=27, ON_TAG=28, UNDER_TAG=29, ALPHA=30, NUMERIC=31, ALPHANUMERIC=32, 
		WHITESPACE=33, STRING=34, ID=35, OBJECT_TAG=36, ROOM_TAG=37, ACTION_TAG=38, 
		FLAG_TAG=39, ID_KEY=40, LOC_KEY=41, LOC_TYPE_KEY=42, NAME_KEY=43, DESC_KEY=44, 
		SYNS_KEY=45, PROPERTIES_KEY=46, FLAG_KEY=47, VALUES_KEY=48, VALUE_KEY=49, 
		NORTH_KEY=50, SOUTH_KEY=51, EAST_KEY=52, WEST_KEY=53, UP_KEY=54, DOWN_KEY=55, 
		NORTH_COND_KEY=56, SOUTH_COND_KEY=57, EAST_COND_KEY=58, WEST_COND_KEY=59, 
		UP_COND_KEY=60, DOWN_COND_KEY=61, ACTION_KEY=62, PRSA_COND=63, PRSA_AND_COND=64, 
		PRSO_COND=65, PRSI_COND=66, HERE_COND=67, ANDFLAGS_COND=68, ORFLAGS_COND=69, 
		ANDPROPERTIES_COND=70, ORPROPERTIES_COND=71, FLAGVALUE_COND=72, HAVEITEM_COND=73, 
		HAVEITEMS_COND=74, EQUALS_COND=75, GT_COND=76, LT_COND=77, TELL_EFF=78, 
		GOTO_EFF=79, SETFLAG_EFF=80, REMFLAG_EFF=81, TAKE_EFF=82, PLACE_EFF=83, 
		SET_EFF=84;
	public static final int
		RULE_alpha_numeric = 0, RULE_num_int = 1, RULE_num_float = 2, RULE_number = 3, 
		RULE_bool = 4, RULE_var = 5, RULE_value = 6, RULE_flag = 7, RULE_id_entry = 8, 
		RULE_loc_entry = 9, RULE_loc_type_entry = 10, RULE_name_entry = 11, RULE_desc_entry = 12, 
		RULE_synonyms_entry = 13, RULE_properties_entry = 14, RULE_values_entry = 15, 
		RULE_north_entry = 16, RULE_south_entry = 17, RULE_east_entry = 18, RULE_west_entry = 19, 
		RULE_up_entry = 20, RULE_down_entry = 21, RULE_action_entry = 22, RULE_global_flag_entry = 23, 
		RULE_flag_val_entry = 24, RULE_object = 25, RULE_room = 26, RULE_action = 27, 
		RULE_global_flag = 28, RULE_action_block = 29, RULE_conditional = 30, 
		RULE_conditions = 31, RULE_effect_aux = 32, RULE_condition_aux = 33, RULE_prsa_cond = 34, 
		RULE_prsa_and_cond = 35, RULE_prso_cond = 36, RULE_prsi_cond = 37, RULE_here_cond = 38, 
		RULE_andflags_cond = 39, RULE_orflags_cond = 40, RULE_andproperties_cond = 41, 
		RULE_orproperties_cond = 42, RULE_flagvalue_cond = 43, RULE_haveitem_cond = 44, 
		RULE_haveitems_cond = 45, RULE_equals_cond = 46, RULE_gt_cond = 47, RULE_lt_cond = 48, 
		RULE_condition = 49, RULE_tell_eff = 50, RULE_goto_eff = 51, RULE_setflag_eff = 52, 
		RULE_remflag_eff = 53, RULE_take_eff = 54, RULE_place_eff = 55, RULE_set_eff = 56, 
		RULE_effect = 57, RULE_game_grammar = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"alpha_numeric", "num_int", "num_float", "number", "bool", "var", "value", 
			"flag", "id_entry", "loc_entry", "loc_type_entry", "name_entry", "desc_entry", 
			"synonyms_entry", "properties_entry", "values_entry", "north_entry", 
			"south_entry", "east_entry", "west_entry", "up_entry", "down_entry", 
			"action_entry", "global_flag_entry", "flag_val_entry", "object", "room", 
			"action", "global_flag", "action_block", "conditional", "conditions", 
			"effect_aux", "condition_aux", "prsa_cond", "prsa_and_cond", "prso_cond", 
			"prsi_cond", "here_cond", "andflags_cond", "orflags_cond", "andproperties_cond", 
			"orproperties_cond", "flagvalue_cond", "haveitem_cond", "haveitems_cond", 
			"equals_cond", "gt_cond", "lt_cond", "condition", "tell_eff", "goto_eff", 
			"setflag_eff", "remflag_eff", "take_eff", "place_eff", "set_eff", "effect", 
			"game_grammar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'['", "']'", "'<'", "'>'", "'{'", "'}'", "'('", 
			"')'", "'\"'", "'_'", "','", "'.'", "'+'", "'-'", "'|'", "'&'", "'='", 
			"'TRUE'", "'FALSE'", null, null, "'!'", "'COND'", "'EFF'", "'IN'", "'ON'", 
			"'UNDER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "SEMICOLON", "LB_SQUARE", "RB_SQUARE", "LB_SHARP", "RB_SHARP", 
			"LB_CURLY", "RB_CURLY", "LB_ROUND", "RB_ROUND", "QUOTES", "UNDERSCORE", 
			"COMMA", "DOT", "PLUS", "MINUS", "BAR", "ANDPERSAND", "EQUALS", "TRUE", 
			"FALSE", "AND", "OR", "NOT", "COND_TAG", "EFFECT_TAG", "IN_TAG", "ON_TAG", 
			"UNDER_TAG", "ALPHA", "NUMERIC", "ALPHANUMERIC", "WHITESPACE", "STRING", 
			"ID", "OBJECT_TAG", "ROOM_TAG", "ACTION_TAG", "FLAG_TAG", "ID_KEY", "LOC_KEY", 
			"LOC_TYPE_KEY", "NAME_KEY", "DESC_KEY", "SYNS_KEY", "PROPERTIES_KEY", 
			"FLAG_KEY", "VALUES_KEY", "VALUE_KEY", "NORTH_KEY", "SOUTH_KEY", "EAST_KEY", 
			"WEST_KEY", "UP_KEY", "DOWN_KEY", "NORTH_COND_KEY", "SOUTH_COND_KEY", 
			"EAST_COND_KEY", "WEST_COND_KEY", "UP_COND_KEY", "DOWN_COND_KEY", "ACTION_KEY", 
			"PRSA_COND", "PRSA_AND_COND", "PRSO_COND", "PRSI_COND", "HERE_COND", 
			"ANDFLAGS_COND", "ORFLAGS_COND", "ANDPROPERTIES_COND", "ORPROPERTIES_COND", 
			"FLAGVALUE_COND", "HAVEITEM_COND", "HAVEITEMS_COND", "EQUALS_COND", "GT_COND", 
			"LT_COND", "TELL_EFF", "GOTO_EFF", "SETFLAG_EFF", "REMFLAG_EFF", "TAKE_EFF", 
			"PLACE_EFF", "SET_EFF"
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
			setState(118);
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
			setState(120);
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
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(NUMERIC);
				setState(123);
				match(DOT);
				setState(124);
				match(NUMERIC);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(DOT);
				setState(126);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				num_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
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
			setState(133);
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
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
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
			setState(140);
			match(LB_ROUND);
			setState(141);
			alpha_numeric();
			setState(142);
			match(COLON);
			setState(143);
			var();
			setState(144);
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
			setState(146);
			match(UNDERSCORE);
			setState(147);
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
			setState(149);
			match(ID_KEY);
			setState(150);
			match(ID);
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
			setState(153);
			match(LOC_KEY);
			setState(154);
			match(ID);
			setState(155);
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
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOC_TYPE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(LOC_TYPE_KEY);
				setState(158);
				num_int();
				setState(159);
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
			setState(164);
			match(NAME_KEY);
			setState(165);
			match(STRING);
			setState(166);
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
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESC_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(DESC_KEY);
				setState(169);
				match(STRING);
				setState(170);
				match(SEMICOLON);
				}
				break;
			case RB_CURLY:
			case SYNS_KEY:
			case PROPERTIES_KEY:
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
		enterRule(_localctx, 26, RULE_synonyms_entry);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNS_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(SYNS_KEY);
				setState(175);
				match(STRING);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(176);
					match(COMMA);
					setState(177);
					match(STRING);
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(SEMICOLON);
				}
				break;
			case RB_CURLY:
			case PROPERTIES_KEY:
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
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROPERTIES_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(PROPERTIES_KEY);
				setState(188);
				flag();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(189);
					match(COMMA);
					setState(190);
					flag();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
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
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(VALUES_KEY);
				setState(202);
				value();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(203);
					match(COMMA);
					setState(204);
					value();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
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
		enterRule(_localctx, 32, RULE_north_entry);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORTH_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(NORTH_KEY);
				setState(216);
				match(ID);
				setState(217);
				match(SEMICOLON);
				setState(235);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NORTH_COND_KEY:
					{
					setState(218);
					match(NORTH_COND_KEY);
					setState(219);
					flag();
					setState(220);
					match(EQUALS);
					setState(221);
					num_int();
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(222);
						match(COMMA);
						setState(223);
						flag();
						setState(224);
						match(EQUALS);
						setState(225);
						num_int();
						}
						}
						setState(231);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(232);
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
		enterRule(_localctx, 34, RULE_south_entry);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOUTH_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(SOUTH_KEY);
				setState(241);
				match(ID);
				setState(242);
				match(SEMICOLON);
				setState(260);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SOUTH_COND_KEY:
					{
					setState(243);
					match(SOUTH_COND_KEY);
					setState(244);
					flag();
					setState(245);
					match(EQUALS);
					setState(246);
					num_int();
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(247);
						match(COMMA);
						setState(248);
						flag();
						setState(249);
						match(EQUALS);
						setState(250);
						num_int();
						}
						}
						setState(256);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(257);
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
		enterRule(_localctx, 36, RULE_east_entry);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EAST_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(EAST_KEY);
				setState(266);
				match(ID);
				setState(267);
				match(SEMICOLON);
				setState(285);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EAST_COND_KEY:
					{
					setState(268);
					match(EAST_COND_KEY);
					setState(269);
					flag();
					setState(270);
					match(EQUALS);
					setState(271);
					num_int();
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(272);
						match(COMMA);
						setState(273);
						flag();
						setState(274);
						match(EQUALS);
						setState(275);
						num_int();
						}
						}
						setState(281);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(282);
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
		enterRule(_localctx, 38, RULE_west_entry);
		int _la;
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WEST_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(WEST_KEY);
				setState(291);
				match(ID);
				setState(292);
				match(SEMICOLON);
				setState(310);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WEST_COND_KEY:
					{
					setState(293);
					match(WEST_COND_KEY);
					setState(294);
					flag();
					setState(295);
					match(EQUALS);
					setState(296);
					num_int();
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(297);
						match(COMMA);
						setState(298);
						flag();
						setState(299);
						match(EQUALS);
						setState(300);
						num_int();
						}
						}
						setState(306);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(307);
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
		enterRule(_localctx, 40, RULE_up_entry);
		int _la;
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(UP_KEY);
				setState(316);
				match(ID);
				setState(317);
				match(SEMICOLON);
				setState(335);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UP_COND_KEY:
					{
					setState(318);
					match(UP_COND_KEY);
					setState(319);
					flag();
					setState(320);
					match(EQUALS);
					setState(321);
					num_int();
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(322);
						match(COMMA);
						setState(323);
						flag();
						setState(324);
						match(EQUALS);
						setState(325);
						num_int();
						}
						}
						setState(331);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(332);
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
		enterRule(_localctx, 42, RULE_down_entry);
		int _la;
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOWN_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(DOWN_KEY);
				setState(341);
				match(ID);
				setState(342);
				match(SEMICOLON);
				setState(360);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOWN_COND_KEY:
					{
					setState(343);
					match(DOWN_COND_KEY);
					setState(344);
					flag();
					setState(345);
					match(EQUALS);
					setState(346);
					num_int();
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(347);
						match(COMMA);
						setState(348);
						flag();
						setState(349);
						match(EQUALS);
						setState(350);
						num_int();
						}
						}
						setState(356);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(357);
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
		enterRule(_localctx, 44, RULE_action_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(ACTION_KEY);
			setState(366);
			action_block();
			setState(367);
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
		enterRule(_localctx, 46, RULE_global_flag_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(FLAG_KEY);
			setState(370);
			flag();
			setState(371);
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
		enterRule(_localctx, 48, RULE_flag_val_entry);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(VALUE_KEY);
				setState(374);
				num_int();
				setState(375);
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
		enterRule(_localctx, 50, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(OBJECT_TAG);
			setState(381);
			match(LB_CURLY);
			setState(382);
			id_entry();
			setState(383);
			loc_entry();
			setState(384);
			loc_type_entry();
			setState(385);
			name_entry();
			setState(386);
			desc_entry();
			setState(387);
			synonyms_entry();
			setState(388);
			properties_entry();
			setState(389);
			values_entry();
			setState(390);
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
		enterRule(_localctx, 52, RULE_room);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(ROOM_TAG);
			setState(393);
			match(LB_CURLY);
			setState(394);
			id_entry();
			setState(395);
			north_entry();
			setState(396);
			south_entry();
			setState(397);
			east_entry();
			setState(398);
			west_entry();
			setState(399);
			up_entry();
			setState(400);
			down_entry();
			setState(401);
			name_entry();
			setState(402);
			desc_entry();
			setState(403);
			synonyms_entry();
			setState(404);
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
		enterRule(_localctx, 54, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(ACTION_TAG);
			setState(407);
			match(LB_CURLY);
			setState(408);
			id_entry();
			setState(409);
			action_entry();
			setState(410);
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
		enterRule(_localctx, 56, RULE_global_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(FLAG_TAG);
			setState(413);
			match(LB_CURLY);
			setState(414);
			global_flag_entry();
			setState(415);
			flag_val_entry();
			setState(416);
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
		enterRule(_localctx, 58, RULE_action_block);
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				effect_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				effect_aux();
				setState(420);
				action_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				conditional();
				setState(424);
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
		enterRule(_localctx, 60, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(COND_TAG);
			setState(429);
			match(LB_SHARP);
			setState(430);
			conditions();
			setState(431);
			match(RB_SHARP);
			setState(432);
			match(LB_CURLY);
			setState(433);
			action_block();
			setState(434);
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
		enterRule(_localctx, 62, RULE_conditions);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				condition_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				condition_aux();
				setState(438);
				match(AND);
				setState(439);
				conditions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				condition_aux();
				setState(442);
				match(OR);
				setState(443);
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
		enterRule(_localctx, 64, RULE_effect_aux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(EFFECT_TAG);
			setState(448);
			match(LB_SHARP);
			setState(449);
			effect();
			setState(450);
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
		enterRule(_localctx, 66, RULE_condition_aux);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRSA_COND:
			case PRSA_AND_COND:
			case PRSO_COND:
			case PRSI_COND:
			case HERE_COND:
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
				setState(452);
				condition();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(NOT);
				setState(454);
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
		enterRule(_localctx, 68, RULE_prsa_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(PRSA_COND);
			setState(458);
			match(ALPHA);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(459);
				match(COMMA);
				setState(460);
				match(ALPHA);
				}
				}
				setState(465);
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
		enterRule(_localctx, 70, RULE_prsa_and_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(PRSA_AND_COND);
			setState(467);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN_TAG) | (1L << ON_TAG) | (1L << UNDER_TAG) | (1L << ALPHA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(468);
				match(COMMA);
				setState(469);
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
				setState(474);
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
		enterRule(_localctx, 72, RULE_prso_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(PRSO_COND);
			setState(476);
			match(ID);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(477);
				match(COMMA);
				setState(478);
				match(ID);
				}
				}
				setState(483);
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
		enterRule(_localctx, 74, RULE_prsi_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(PRSI_COND);
			setState(485);
			match(ID);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(486);
				match(COMMA);
				setState(487);
				match(ID);
				}
				}
				setState(492);
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
		enterRule(_localctx, 76, RULE_here_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(HERE_COND);
			setState(494);
			match(ID);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(495);
				match(COMMA);
				setState(496);
				match(ID);
				}
				}
				setState(501);
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
		enterRule(_localctx, 78, RULE_andflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(ANDFLAGS_COND);
			setState(503);
			flag();
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(504);
				match(COMMA);
				setState(505);
				flag();
				}
				}
				setState(510);
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
		enterRule(_localctx, 80, RULE_orflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(ORFLAGS_COND);
			setState(512);
			flag();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(513);
				match(COMMA);
				setState(514);
				flag();
				}
				}
				setState(519);
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
		enterRule(_localctx, 82, RULE_andproperties_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(ANDPROPERTIES_COND);
			setState(521);
			match(ID);
			setState(522);
			match(COMMA);
			setState(523);
			flag();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(524);
				match(COMMA);
				setState(525);
				flag();
				}
				}
				setState(530);
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
		enterRule(_localctx, 84, RULE_orproperties_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(ORPROPERTIES_COND);
			setState(532);
			match(ID);
			setState(533);
			match(COMMA);
			setState(534);
			flag();
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(535);
				match(COMMA);
				setState(536);
				flag();
				}
				}
				setState(541);
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
		enterRule(_localctx, 86, RULE_flagvalue_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(FLAGVALUE_COND);
			setState(543);
			flag();
			setState(544);
			match(COMMA);
			setState(545);
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
		enterRule(_localctx, 88, RULE_haveitem_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(HAVEITEM_COND);
			setState(548);
			match(ID);
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(549);
				match(COMMA);
				setState(550);
				match(ID);
				}
				}
				setState(555);
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
		enterRule(_localctx, 90, RULE_haveitems_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(HAVEITEMS_COND);
			setState(557);
			match(ID);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(558);
				match(COMMA);
				setState(559);
				match(ID);
				}
				}
				setState(564);
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
		enterRule(_localctx, 92, RULE_equals_cond);
		try {
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(EQUALS_COND);
				setState(566);
				alpha_numeric();
				setState(567);
				match(COMMA);
				setState(568);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(EQUALS_COND);
				setState(571);
				alpha_numeric();
				setState(572);
				match(COMMA);
				setState(573);
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
		enterRule(_localctx, 94, RULE_gt_cond);
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				match(GT_COND);
				setState(578);
				alpha_numeric();
				setState(579);
				match(COMMA);
				setState(580);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				match(GT_COND);
				setState(583);
				alpha_numeric();
				setState(584);
				match(COMMA);
				setState(585);
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
		enterRule(_localctx, 96, RULE_lt_cond);
		try {
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				match(LT_COND);
				setState(590);
				alpha_numeric();
				setState(591);
				match(COMMA);
				setState(592);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				match(LT_COND);
				setState(595);
				alpha_numeric();
				setState(596);
				match(COMMA);
				setState(597);
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
		enterRule(_localctx, 98, RULE_condition);
		try {
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRSA_COND:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				prsa_cond();
				}
				break;
			case PRSA_AND_COND:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				prsa_and_cond();
				}
				break;
			case PRSO_COND:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				prso_cond();
				}
				break;
			case PRSI_COND:
				enterOuterAlt(_localctx, 4);
				{
				setState(604);
				prsi_cond();
				}
				break;
			case HERE_COND:
				enterOuterAlt(_localctx, 5);
				{
				setState(605);
				here_cond();
				}
				break;
			case ANDFLAGS_COND:
				enterOuterAlt(_localctx, 6);
				{
				setState(606);
				andflags_cond();
				}
				break;
			case ORFLAGS_COND:
				enterOuterAlt(_localctx, 7);
				{
				setState(607);
				orflags_cond();
				}
				break;
			case ANDPROPERTIES_COND:
				enterOuterAlt(_localctx, 8);
				{
				setState(608);
				andproperties_cond();
				}
				break;
			case ORPROPERTIES_COND:
				enterOuterAlt(_localctx, 9);
				{
				setState(609);
				orproperties_cond();
				}
				break;
			case FLAGVALUE_COND:
				enterOuterAlt(_localctx, 10);
				{
				setState(610);
				flagvalue_cond();
				}
				break;
			case HAVEITEM_COND:
				enterOuterAlt(_localctx, 11);
				{
				setState(611);
				haveitem_cond();
				}
				break;
			case HAVEITEMS_COND:
				enterOuterAlt(_localctx, 12);
				{
				setState(612);
				haveitems_cond();
				}
				break;
			case EQUALS_COND:
				enterOuterAlt(_localctx, 13);
				{
				setState(613);
				equals_cond();
				}
				break;
			case GT_COND:
				enterOuterAlt(_localctx, 14);
				{
				setState(614);
				gt_cond();
				}
				break;
			case LT_COND:
				enterOuterAlt(_localctx, 15);
				{
				setState(615);
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
		enterRule(_localctx, 100, RULE_tell_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(TELL_EFF);
			setState(619);
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
		enterRule(_localctx, 102, RULE_goto_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(GOTO_EFF);
			setState(622);
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
		enterRule(_localctx, 104, RULE_setflag_eff);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				match(SETFLAG_EFF);
				setState(625);
				flag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				match(SETFLAG_EFF);
				setState(627);
				flag();
				setState(628);
				match(COMMA);
				setState(629);
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
		enterRule(_localctx, 106, RULE_remflag_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(REMFLAG_EFF);
			setState(634);
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
		enterRule(_localctx, 108, RULE_take_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(TAKE_EFF);
			setState(637);
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
		enterRule(_localctx, 110, RULE_place_eff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(PLACE_EFF);
			setState(640);
			match(ID);
			setState(641);
			match(COMMA);
			setState(642);
			match(ID);
			setState(643);
			match(COMMA);
			setState(644);
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
		enterRule(_localctx, 112, RULE_set_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(SET_EFF);
			setState(647);
			alpha_numeric();
			setState(648);
			match(COMMA);
			setState(649);
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
		enterRule(_localctx, 114, RULE_effect);
		try {
			setState(658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TELL_EFF:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				tell_eff();
				}
				break;
			case GOTO_EFF:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				goto_eff();
				}
				break;
			case SETFLAG_EFF:
				enterOuterAlt(_localctx, 3);
				{
				setState(653);
				setflag_eff();
				}
				break;
			case REMFLAG_EFF:
				enterOuterAlt(_localctx, 4);
				{
				setState(654);
				remflag_eff();
				}
				break;
			case TAKE_EFF:
				enterOuterAlt(_localctx, 5);
				{
				setState(655);
				take_eff();
				}
				break;
			case PLACE_EFF:
				enterOuterAlt(_localctx, 6);
				{
				setState(656);
				place_eff();
				}
				break;
			case SET_EFF:
				enterOuterAlt(_localctx, 7);
				{
				setState(657);
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
		enterRule(_localctx, 116, RULE_game_grammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			room();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECT_TAG) | (1L << ROOM_TAG) | (1L << ACTION_TAG) | (1L << FLAG_TAG))) != 0)) {
				{
				setState(665);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ROOM_TAG:
					{
					setState(661);
					room();
					}
					break;
				case OBJECT_TAG:
					{
					setState(662);
					object();
					}
					break;
				case ACTION_TAG:
					{
					setState(663);
					action();
					}
					break;
				case FLAG_TAG:
					{
					setState(664);
					global_flag();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(669);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3V\u02a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\5\3\5\5\5\u0086\n\5\3\6"+
		"\3\6\3\7\3\7\3\7\5\7\u008d\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00a5\n\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00af\n\16\3\17\3\17\3\17\3\17\7"+
		"\17\u00b5\n\17\f\17\16\17\u00b8\13\17\3\17\3\17\5\17\u00bc\n\17\3\20\3"+
		"\20\3\20\3\20\7\20\u00c2\n\20\f\20\16\20\u00c5\13\20\3\20\3\20\3\20\5"+
		"\20\u00ca\n\20\3\21\3\21\3\21\3\21\7\21\u00d0\n\21\f\21\16\21\u00d3\13"+
		"\21\3\21\3\21\3\21\5\21\u00d8\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u00e6\n\22\f\22\16\22\u00e9\13\22\3\22"+
		"\3\22\3\22\5\22\u00ee\n\22\3\22\5\22\u00f1\n\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00ff\n\23\f\23\16\23\u0102"+
		"\13\23\3\23\3\23\3\23\5\23\u0107\n\23\3\23\5\23\u010a\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0118\n\24\f\24"+
		"\16\24\u011b\13\24\3\24\3\24\3\24\5\24\u0120\n\24\3\24\5\24\u0123\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0131"+
		"\n\25\f\25\16\25\u0134\13\25\3\25\3\25\3\25\5\25\u0139\n\25\3\25\5\25"+
		"\u013c\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u014a\n\26\f\26\16\26\u014d\13\26\3\26\3\26\3\26\5\26\u0152\n\26"+
		"\3\26\5\26\u0155\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u0163\n\27\f\27\16\27\u0166\13\27\3\27\3\27\3\27\5\27"+
		"\u016b\n\27\3\27\5\27\u016e\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\5\32\u017d\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u01ad\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01c0"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u01ca\n#\3$\3$\3$\3$\7$\u01d0\n$\f"+
		"$\16$\u01d3\13$\3%\3%\3%\3%\7%\u01d9\n%\f%\16%\u01dc\13%\3&\3&\3&\3&\7"+
		"&\u01e2\n&\f&\16&\u01e5\13&\3\'\3\'\3\'\3\'\7\'\u01eb\n\'\f\'\16\'\u01ee"+
		"\13\'\3(\3(\3(\3(\7(\u01f4\n(\f(\16(\u01f7\13(\3)\3)\3)\3)\7)\u01fd\n"+
		")\f)\16)\u0200\13)\3*\3*\3*\3*\7*\u0206\n*\f*\16*\u0209\13*\3+\3+\3+\3"+
		"+\3+\3+\7+\u0211\n+\f+\16+\u0214\13+\3,\3,\3,\3,\3,\3,\7,\u021c\n,\f,"+
		"\16,\u021f\13,\3-\3-\3-\3-\3-\3.\3.\3.\3.\7.\u022a\n.\f.\16.\u022d\13"+
		".\3/\3/\3/\3/\7/\u0233\n/\f/\16/\u0236\13/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\5\60\u0242\n\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u024e\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u025a\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u026b\n\63\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u027a\n\66\3\67\3\67"+
		"\3\67\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3"+
		";\5;\u0295\n;\3<\3<\3<\3<\3<\7<\u029c\n<\f<\16<\u029f\13<\3<\2\2=\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtv\2\6\3\2 \"\3\2\26\27\3\2\35 \3\2\35\37\2\u02b1\2"+
		"x\3\2\2\2\4z\3\2\2\2\6\u0081\3\2\2\2\b\u0085\3\2\2\2\n\u0087\3\2\2\2\f"+
		"\u008c\3\2\2\2\16\u008e\3\2\2\2\20\u0094\3\2\2\2\22\u0097\3\2\2\2\24\u009b"+
		"\3\2\2\2\26\u00a4\3\2\2\2\30\u00a6\3\2\2\2\32\u00ae\3\2\2\2\34\u00bb\3"+
		"\2\2\2\36\u00c9\3\2\2\2 \u00d7\3\2\2\2\"\u00f0\3\2\2\2$\u0109\3\2\2\2"+
		"&\u0122\3\2\2\2(\u013b\3\2\2\2*\u0154\3\2\2\2,\u016d\3\2\2\2.\u016f\3"+
		"\2\2\2\60\u0173\3\2\2\2\62\u017c\3\2\2\2\64\u017e\3\2\2\2\66\u018a\3\2"+
		"\2\28\u0198\3\2\2\2:\u019e\3\2\2\2<\u01ac\3\2\2\2>\u01ae\3\2\2\2@\u01bf"+
		"\3\2\2\2B\u01c1\3\2\2\2D\u01c9\3\2\2\2F\u01cb\3\2\2\2H\u01d4\3\2\2\2J"+
		"\u01dd\3\2\2\2L\u01e6\3\2\2\2N\u01ef\3\2\2\2P\u01f8\3\2\2\2R\u0201\3\2"+
		"\2\2T\u020a\3\2\2\2V\u0215\3\2\2\2X\u0220\3\2\2\2Z\u0225\3\2\2\2\\\u022e"+
		"\3\2\2\2^\u0241\3\2\2\2`\u024d\3\2\2\2b\u0259\3\2\2\2d\u026a\3\2\2\2f"+
		"\u026c\3\2\2\2h\u026f\3\2\2\2j\u0279\3\2\2\2l\u027b\3\2\2\2n\u027e\3\2"+
		"\2\2p\u0281\3\2\2\2r\u0288\3\2\2\2t\u0294\3\2\2\2v\u0296\3\2\2\2xy\t\2"+
		"\2\2y\3\3\2\2\2z{\7!\2\2{\5\3\2\2\2|}\7!\2\2}~\7\20\2\2~\u0082\7!\2\2"+
		"\177\u0080\7\20\2\2\u0080\u0082\7!\2\2\u0081|\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0082\7\3\2\2\2\u0083\u0086\5\4\3\2\u0084\u0086\5\6\4\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0084\3\2\2\2\u0086\t\3\2\2\2\u0087\u0088\t\3\2\2\u0088"+
		"\13\3\2\2\2\u0089\u008d\5\b\5\2\u008a\u008d\7$\2\2\u008b\u008d\5\n\6\2"+
		"\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\r\3"+
		"\2\2\2\u008e\u008f\7\13\2\2\u008f\u0090\5\2\2\2\u0090\u0091\7\3\2\2\u0091"+
		"\u0092\5\f\7\2\u0092\u0093\7\f\2\2\u0093\17\3\2\2\2\u0094\u0095\7\16\2"+
		"\2\u0095\u0096\5\2\2\2\u0096\21\3\2\2\2\u0097\u0098\7*\2\2\u0098\u0099"+
		"\7%\2\2\u0099\u009a\7\4\2\2\u009a\23\3\2\2\2\u009b\u009c\7+\2\2\u009c"+
		"\u009d\7%\2\2\u009d\u009e\7\4\2\2\u009e\25\3\2\2\2\u009f\u00a0\7,\2\2"+
		"\u00a0\u00a1\5\4\3\2\u00a1\u00a2\7\4\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a5"+
		"\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\27\3\2\2\2\u00a6"+
		"\u00a7\7-\2\2\u00a7\u00a8\7$\2\2\u00a8\u00a9\7\4\2\2\u00a9\31\3\2\2\2"+
		"\u00aa\u00ab\7.\2\2\u00ab\u00ac\7$\2\2\u00ac\u00af\7\4\2\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\33\3\2\2\2\u00b0"+
		"\u00b1\7/\2\2\u00b1\u00b6\7$\2\2\u00b2\u00b3\7\17\2\2\u00b3\u00b5\7$\2"+
		"\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\7\4\2\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00b0\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\35\3\2\2"+
		"\2\u00bd\u00be\7\60\2\2\u00be\u00c3\5\20\t\2\u00bf\u00c0\7\17\2\2\u00c0"+
		"\u00c2\5\20\t\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c7\7\4\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00bd\3\2"+
		"\2\2\u00c9\u00c8\3\2\2\2\u00ca\37\3\2\2\2\u00cb\u00cc\7\62\2\2\u00cc\u00d1"+
		"\5\16\b\2\u00cd\u00ce\7\17\2\2\u00ce\u00d0\5\16\b\2\u00cf\u00cd\3\2\2"+
		"\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\4\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00cb\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8!\3\2\2\2"+
		"\u00d9\u00da\7\64\2\2\u00da\u00db\7%\2\2\u00db\u00ed\7\4\2\2\u00dc\u00dd"+
		"\7:\2\2\u00dd\u00de\5\20\t\2\u00de\u00df\7\25\2\2\u00df\u00e7\5\4\3\2"+
		"\u00e0\u00e1\7\17\2\2\u00e1\u00e2\5\20\t\2\u00e2\u00e3\7\25\2\2\u00e3"+
		"\u00e4\5\4\3\2\u00e4\u00e6\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e6\u00e9\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00eb\7\4\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00dc\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00d9\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1#\3\2\2\2"+
		"\u00f2\u00f3\7\65\2\2\u00f3\u00f4\7%\2\2\u00f4\u0106\7\4\2\2\u00f5\u00f6"+
		"\7;\2\2\u00f6\u00f7\5\20\t\2\u00f7\u00f8\7\25\2\2\u00f8\u0100\5\4\3\2"+
		"\u00f9\u00fa\7\17\2\2\u00fa\u00fb\5\20\t\2\u00fb\u00fc\7\25\2\2\u00fc"+
		"\u00fd\5\4\3\2\u00fd\u00ff\3\2\2\2\u00fe\u00f9\3\2\2\2\u00ff\u0102\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0104\7\4\2\2\u0104\u0107\3\2\2\2\u0105\u0107\3\2"+
		"\2\2\u0106\u00f5\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u00f2\3\2\2\2\u0109\u0108\3\2\2\2\u010a%\3\2\2\2"+
		"\u010b\u010c\7\66\2\2\u010c\u010d\7%\2\2\u010d\u011f\7\4\2\2\u010e\u010f"+
		"\7<\2\2\u010f\u0110\5\20\t\2\u0110\u0111\7\25\2\2\u0111\u0119\5\4\3\2"+
		"\u0112\u0113\7\17\2\2\u0113\u0114\5\20\t\2\u0114\u0115\7\25\2\2\u0115"+
		"\u0116\5\4\3\2\u0116\u0118\3\2\2\2\u0117\u0112\3\2\2\2\u0118\u011b\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011c\u011d\7\4\2\2\u011d\u0120\3\2\2\2\u011e\u0120\3\2"+
		"\2\2\u011f\u010e\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u0123\3\2\2\2\u0122\u010b\3\2\2\2\u0122\u0121\3\2\2\2\u0123\'\3\2\2\2"+
		"\u0124\u0125\7\67\2\2\u0125\u0126\7%\2\2\u0126\u0138\7\4\2\2\u0127\u0128"+
		"\7=\2\2\u0128\u0129\5\20\t\2\u0129\u012a\7\25\2\2\u012a\u0132\5\4\3\2"+
		"\u012b\u012c\7\17\2\2\u012c\u012d\5\20\t\2\u012d\u012e\7\25\2\2\u012e"+
		"\u012f\5\4\3\2\u012f\u0131\3\2\2\2\u0130\u012b\3\2\2\2\u0131\u0134\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0136\7\4\2\2\u0136\u0139\3\2\2\2\u0137\u0139\3\2"+
		"\2\2\u0138\u0127\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u013c\3\2\2\2\u013b\u0124\3\2\2\2\u013b\u013a\3\2\2\2\u013c)\3\2\2\2"+
		"\u013d\u013e\78\2\2\u013e\u013f\7%\2\2\u013f\u0151\7\4\2\2\u0140\u0141"+
		"\7>\2\2\u0141\u0142\5\20\t\2\u0142\u0143\7\25\2\2\u0143\u014b\5\4\3\2"+
		"\u0144\u0145\7\17\2\2\u0145\u0146\5\20\t\2\u0146\u0147\7\25\2\2\u0147"+
		"\u0148\5\4\3\2\u0148\u014a\3\2\2\2\u0149\u0144\3\2\2\2\u014a\u014d\3\2"+
		"\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\7\4\2\2\u014f\u0152\3\2\2\2\u0150\u0152\3\2"+
		"\2\2\u0151\u0140\3\2\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0155\3\2\2\2\u0154\u013d\3\2\2\2\u0154\u0153\3\2\2\2\u0155+\3\2\2\2"+
		"\u0156\u0157\79\2\2\u0157\u0158\7%\2\2\u0158\u016a\7\4\2\2\u0159\u015a"+
		"\7?\2\2\u015a\u015b\5\20\t\2\u015b\u015c\7\25\2\2\u015c\u0164\5\4\3\2"+
		"\u015d\u015e\7\17\2\2\u015e\u015f\5\20\t\2\u015f\u0160\7\25\2\2\u0160"+
		"\u0161\5\4\3\2\u0161\u0163\3\2\2\2\u0162\u015d\3\2\2\2\u0163\u0166\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0167\u0168\7\4\2\2\u0168\u016b\3\2\2\2\u0169\u016b\3\2"+
		"\2\2\u016a\u0159\3\2\2\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016e\3\2\2\2\u016d\u0156\3\2\2\2\u016d\u016c\3\2\2\2\u016e-\3\2\2\2"+
		"\u016f\u0170\7@\2\2\u0170\u0171\5<\37\2\u0171\u0172\7\4\2\2\u0172/\3\2"+
		"\2\2\u0173\u0174\7\61\2\2\u0174\u0175\5\20\t\2\u0175\u0176\7\4\2\2\u0176"+
		"\61\3\2\2\2\u0177\u0178\7\63\2\2\u0178\u0179\5\4\3\2\u0179\u017a\7\4\2"+
		"\2\u017a\u017d\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u0177\3\2\2\2\u017c\u017b"+
		"\3\2\2\2\u017d\63\3\2\2\2\u017e\u017f\7&\2\2\u017f\u0180\7\t\2\2\u0180"+
		"\u0181\5\22\n\2\u0181\u0182\5\24\13\2\u0182\u0183\5\26\f\2\u0183\u0184"+
		"\5\30\r\2\u0184\u0185\5\32\16\2\u0185\u0186\5\34\17\2\u0186\u0187\5\36"+
		"\20\2\u0187\u0188\5 \21\2\u0188\u0189\7\n\2\2\u0189\65\3\2\2\2\u018a\u018b"+
		"\7\'\2\2\u018b\u018c\7\t\2\2\u018c\u018d\5\22\n\2\u018d\u018e\5\"\22\2"+
		"\u018e\u018f\5$\23\2\u018f\u0190\5&\24\2\u0190\u0191\5(\25\2\u0191\u0192"+
		"\5*\26\2\u0192\u0193\5,\27\2\u0193\u0194\5\30\r\2\u0194\u0195\5\32\16"+
		"\2\u0195\u0196\5\34\17\2\u0196\u0197\7\n\2\2\u0197\67\3\2\2\2\u0198\u0199"+
		"\7(\2\2\u0199\u019a\7\t\2\2\u019a\u019b\5\22\n\2\u019b\u019c\5.\30\2\u019c"+
		"\u019d\7\n\2\2\u019d9\3\2\2\2\u019e\u019f\7)\2\2\u019f\u01a0\7\t\2\2\u01a0"+
		"\u01a1\5\60\31\2\u01a1\u01a2\5\62\32\2\u01a2\u01a3\7\n\2\2\u01a3;\3\2"+
		"\2\2\u01a4\u01ad\5B\"\2\u01a5\u01a6\5B\"\2\u01a6\u01a7\5<\37\2\u01a7\u01ad"+
		"\3\2\2\2\u01a8\u01ad\5> \2\u01a9\u01aa\5> \2\u01aa\u01ab\5<\37\2\u01ab"+
		"\u01ad\3\2\2\2\u01ac\u01a4\3\2\2\2\u01ac\u01a5\3\2\2\2\u01ac\u01a8\3\2"+
		"\2\2\u01ac\u01a9\3\2\2\2\u01ad=\3\2\2\2\u01ae\u01af\7\33\2\2\u01af\u01b0"+
		"\7\7\2\2\u01b0\u01b1\5@!\2\u01b1\u01b2\7\b\2\2\u01b2\u01b3\7\t\2\2\u01b3"+
		"\u01b4\5<\37\2\u01b4\u01b5\7\n\2\2\u01b5?\3\2\2\2\u01b6\u01c0\5D#\2\u01b7"+
		"\u01b8\5D#\2\u01b8\u01b9\7\30\2\2\u01b9\u01ba\5@!\2\u01ba\u01c0\3\2\2"+
		"\2\u01bb\u01bc\5D#\2\u01bc\u01bd\7\31\2\2\u01bd\u01be\5@!\2\u01be\u01c0"+
		"\3\2\2\2\u01bf\u01b6\3\2\2\2\u01bf\u01b7\3\2\2\2\u01bf\u01bb\3\2\2\2\u01c0"+
		"A\3\2\2\2\u01c1\u01c2\7\34\2\2\u01c2\u01c3\7\7\2\2\u01c3\u01c4\5t;\2\u01c4"+
		"\u01c5\7\b\2\2\u01c5C\3\2\2\2\u01c6\u01ca\5d\63\2\u01c7\u01c8\7\32\2\2"+
		"\u01c8\u01ca\5d\63\2\u01c9\u01c6\3\2\2\2\u01c9\u01c7\3\2\2\2\u01caE\3"+
		"\2\2\2\u01cb\u01cc\7A\2\2\u01cc\u01d1\7 \2\2\u01cd\u01ce\7\17\2\2\u01ce"+
		"\u01d0\7 \2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2G\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5"+
		"\7B\2\2\u01d5\u01da\t\4\2\2\u01d6\u01d7\7\17\2\2\u01d7\u01d9\t\4\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2"+
		"\2\2\u01dbI\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\7C\2\2\u01de\u01e3"+
		"\7%\2\2\u01df\u01e0\7\17\2\2\u01e0\u01e2\7%\2\2\u01e1\u01df\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4K\3\2\2\2"+
		"\u01e5\u01e3\3\2\2\2\u01e6\u01e7\7D\2\2\u01e7\u01ec\7%\2\2\u01e8\u01e9"+
		"\7\17\2\2\u01e9\u01eb\7%\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01edM\3\2\2\2\u01ee\u01ec\3\2\2\2"+
		"\u01ef\u01f0\7E\2\2\u01f0\u01f5\7%\2\2\u01f1\u01f2\7\17\2\2\u01f2\u01f4"+
		"\7%\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6O\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\7F\2\2\u01f9"+
		"\u01fe\5\20\t\2\u01fa\u01fb\7\17\2\2\u01fb\u01fd\5\20\t\2\u01fc\u01fa"+
		"\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"Q\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0202\7G\2\2\u0202\u0207\5\20\t\2"+
		"\u0203\u0204\7\17\2\2\u0204\u0206\5\20\t\2\u0205\u0203\3\2\2\2\u0206\u0209"+
		"\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208S\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u020a\u020b\7H\2\2\u020b\u020c\7%\2\2\u020c\u020d\7\17"+
		"\2\2\u020d\u0212\5\20\t\2\u020e\u020f\7\17\2\2\u020f\u0211\5\20\t\2\u0210"+
		"\u020e\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213U\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216\7I\2\2\u0216\u0217"+
		"\7%\2\2\u0217\u0218\7\17\2\2\u0218\u021d\5\20\t\2\u0219\u021a\7\17\2\2"+
		"\u021a\u021c\5\20\t\2\u021b\u0219\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b"+
		"\3\2\2\2\u021d\u021e\3\2\2\2\u021eW\3\2\2\2\u021f\u021d\3\2\2\2\u0220"+
		"\u0221\7J\2\2\u0221\u0222\5\20\t\2\u0222\u0223\7\17\2\2\u0223\u0224\5"+
		"\4\3\2\u0224Y\3\2\2\2\u0225\u0226\7K\2\2\u0226\u022b\7%\2\2\u0227\u0228"+
		"\7\17\2\2\u0228\u022a\7%\2\2\u0229\u0227\3\2\2\2\u022a\u022d\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c[\3\2\2\2\u022d\u022b\3\2\2\2"+
		"\u022e\u022f\7L\2\2\u022f\u0234\7%\2\2\u0230\u0231\7\17\2\2\u0231\u0233"+
		"\7%\2\2\u0232\u0230\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235]\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u0238\7M\2\2\u0238"+
		"\u0239\5\2\2\2\u0239\u023a\7\17\2\2\u023a\u023b\5\f\7\2\u023b\u0242\3"+
		"\2\2\2\u023c\u023d\7M\2\2\u023d\u023e\5\2\2\2\u023e\u023f\7\17\2\2\u023f"+
		"\u0240\5\2\2\2\u0240\u0242\3\2\2\2\u0241\u0237\3\2\2\2\u0241\u023c\3\2"+
		"\2\2\u0242_\3\2\2\2\u0243\u0244\7N\2\2\u0244\u0245\5\2\2\2\u0245\u0246"+
		"\7\17\2\2\u0246\u0247\5\f\7\2\u0247\u024e\3\2\2\2\u0248\u0249\7N\2\2\u0249"+
		"\u024a\5\2\2\2\u024a\u024b\7\17\2\2\u024b\u024c\5\2\2\2\u024c\u024e\3"+
		"\2\2\2\u024d\u0243\3\2\2\2\u024d\u0248\3\2\2\2\u024ea\3\2\2\2\u024f\u0250"+
		"\7O\2\2\u0250\u0251\5\2\2\2\u0251\u0252\7\17\2\2\u0252\u0253\5\f\7\2\u0253"+
		"\u025a\3\2\2\2\u0254\u0255\7O\2\2\u0255\u0256\5\2\2\2\u0256\u0257\7\17"+
		"\2\2\u0257\u0258\5\2\2\2\u0258\u025a\3\2\2\2\u0259\u024f\3\2\2\2\u0259"+
		"\u0254\3\2\2\2\u025ac\3\2\2\2\u025b\u026b\5F$\2\u025c\u026b\5H%\2\u025d"+
		"\u026b\5J&\2\u025e\u026b\5L\'\2\u025f\u026b\5N(\2\u0260\u026b\5P)\2\u0261"+
		"\u026b\5R*\2\u0262\u026b\5T+\2\u0263\u026b\5V,\2\u0264\u026b\5X-\2\u0265"+
		"\u026b\5Z.\2\u0266\u026b\5\\/\2\u0267\u026b\5^\60\2\u0268\u026b\5`\61"+
		"\2\u0269\u026b\5b\62\2\u026a\u025b\3\2\2\2\u026a\u025c\3\2\2\2\u026a\u025d"+
		"\3\2\2\2\u026a\u025e\3\2\2\2\u026a\u025f\3\2\2\2\u026a\u0260\3\2\2\2\u026a"+
		"\u0261\3\2\2\2\u026a\u0262\3\2\2\2\u026a\u0263\3\2\2\2\u026a\u0264\3\2"+
		"\2\2\u026a\u0265\3\2\2\2\u026a\u0266\3\2\2\2\u026a\u0267\3\2\2\2\u026a"+
		"\u0268\3\2\2\2\u026a\u0269\3\2\2\2\u026be\3\2\2\2\u026c\u026d\7P\2\2\u026d"+
		"\u026e\7$\2\2\u026eg\3\2\2\2\u026f\u0270\7Q\2\2\u0270\u0271\7%\2\2\u0271"+
		"i\3\2\2\2\u0272\u0273\7R\2\2\u0273\u027a\5\20\t\2\u0274\u0275\7R\2\2\u0275"+
		"\u0276\5\20\t\2\u0276\u0277\7\17\2\2\u0277\u0278\5\4\3\2\u0278\u027a\3"+
		"\2\2\2\u0279\u0272\3\2\2\2\u0279\u0274\3\2\2\2\u027ak\3\2\2\2\u027b\u027c"+
		"\7S\2\2\u027c\u027d\5\20\t\2\u027dm\3\2\2\2\u027e\u027f\7T\2\2\u027f\u0280"+
		"\7%\2\2\u0280o\3\2\2\2\u0281\u0282\7U\2\2\u0282\u0283\7%\2\2\u0283\u0284"+
		"\7\17\2\2\u0284\u0285\7%\2\2\u0285\u0286\7\17\2\2\u0286\u0287\t\5\2\2"+
		"\u0287q\3\2\2\2\u0288\u0289\7V\2\2\u0289\u028a\5\2\2\2\u028a\u028b\7\17"+
		"\2\2\u028b\u028c\5\f\7\2\u028cs\3\2\2\2\u028d\u0295\5f\64\2\u028e\u0295"+
		"\5h\65\2\u028f\u0295\5j\66\2\u0290\u0295\5l\67\2\u0291\u0295\5n8\2\u0292"+
		"\u0295\5p9\2\u0293\u0295\5r:\2\u0294\u028d\3\2\2\2\u0294\u028e\3\2\2\2"+
		"\u0294\u028f\3\2\2\2\u0294\u0290\3\2\2\2\u0294\u0291\3\2\2\2\u0294\u0292"+
		"\3\2\2\2\u0294\u0293\3\2\2\2\u0295u\3\2\2\2\u0296\u029d\5\66\34\2\u0297"+
		"\u029c\5\66\34\2\u0298\u029c\5\64\33\2\u0299\u029c\58\35\2\u029a\u029c"+
		"\5:\36\2\u029b\u0297\3\2\2\2\u029b\u0298\3\2\2\2\u029b\u0299\3\2\2\2\u029b"+
		"\u029a\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2"+
		"\2\2\u029ew\3\2\2\2\u029f\u029d\3\2\2\2\66\u0081\u0085\u008c\u00a4\u00ae"+
		"\u00b6\u00bb\u00c3\u00c9\u00d1\u00d7\u00e7\u00ed\u00f0\u0100\u0106\u0109"+
		"\u0119\u011f\u0122\u0132\u0138\u013b\u014b\u0151\u0154\u0164\u016a\u016d"+
		"\u017c\u01ac\u01bf\u01c9\u01d1\u01da\u01e3\u01ec\u01f5\u01fe\u0207\u0212"+
		"\u021d\u022b\u0234\u0241\u024d\u0259\u026a\u0279\u0294\u029b\u029d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}