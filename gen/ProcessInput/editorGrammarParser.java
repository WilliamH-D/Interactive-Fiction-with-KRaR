// Generated from D:/Documents/University/Part II Project/Interactive Fiction with KRaR/src/ProcessInput\editorGrammar.g4 by ANTLR 4.9.2
package ProcessInput;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class editorGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALPHA=1, NUMERIC=2, ALPHANUMERIC=3, WHITESPACE=4, COLON=5, SEMICOLON=6, 
		LB_SQUARE=7, RB_SQUARE=8, LB_SHARP=9, RB_SHARP=10, LB_CURLY=11, RB_CURLY=12, 
		LB_ROUND=13, RB_ROUND=14, QUOTES=15, UNDERSCORE=16, COMMA=17, DOT=18, 
		INT=19, FLOAT=20, NUMBER=21, STRING=22, BOOL=23, VAR=24, AND=25, OR=26, 
		NOT=27, ID=28, FLAG=29, VALUE=30, OBJECT_TAG=31, ROOM_TAG=32, ACTION_TAG=33, 
		COND_TAG=34, EFFECT_TAG=35, ID_KEY=36, LOC_KEY=37, NAME_KEY=38, DESC_KEY=39, 
		FLAGS_KEY=40, VALUES_KEY=41, DIR_KEY=42, ACTION_KEY=43, PRSA_COND=44, 
		PRSO_COND=45, PRSI_COND=46, HERE_COND=47, ANDFLAGS_COND=48, ORFLAGS_COND=49, 
		HAVEITEM_COND=50, HAVEITEMS_COND=51, EQUALS_COND=52, GT_COND=53, LT_COND=54, 
		TELL_EFF=55, GOTO_EFF=56, SETFLAG_EFF=57, REMFLAG_EFF=58, TAKE_EFF=59, 
		PLACE_EFF=60, SET_EFF=61;
	public static final int
		RULE_id_entry = 0, RULE_loc_entry = 1, RULE_name_entry = 2, RULE_desc_entry = 3, 
		RULE_flags_entry = 4, RULE_values_entry = 5, RULE_dir_entry = 6, RULE_action_entry = 7, 
		RULE_value = 8, RULE_object = 9, RULE_room = 10, RULE_action = 11, RULE_action_block = 12, 
		RULE_conditional = 13, RULE_conditions = 14, RULE_effects = 15, RULE_effect_aux = 16, 
		RULE_condition_aux = 17, RULE_prsa_cond = 18, RULE_prso_cond = 19, RULE_prsi_cond = 20, 
		RULE_here_cond = 21, RULE_andflags_cond = 22, RULE_orflags_cond = 23, 
		RULE_haveitem_cond = 24, RULE_haveitems_cond = 25, RULE_equals_cond = 26, 
		RULE_gt_cond = 27, RULE_lt_cond = 28, RULE_condition = 29, RULE_tell_eff = 30, 
		RULE_goto_eff = 31, RULE_setflag_eff = 32, RULE_remflag_eff = 33, RULE_take_eff = 34, 
		RULE_place_eff = 35, RULE_set_eff = 36, RULE_effect = 37, RULE_game_grammar = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"id_entry", "loc_entry", "name_entry", "desc_entry", "flags_entry", "values_entry", 
			"dir_entry", "action_entry", "value", "object", "room", "action", "action_block", 
			"conditional", "conditions", "effects", "effect_aux", "condition_aux", 
			"prsa_cond", "prso_cond", "prsi_cond", "here_cond", "andflags_cond", 
			"orflags_cond", "haveitem_cond", "haveitems_cond", "equals_cond", "gt_cond", 
			"lt_cond", "condition", "tell_eff", "goto_eff", "setflag_eff", "remflag_eff", 
			"take_eff", "place_eff", "set_eff", "effect", "game_grammar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "':'", "';'", "'['", "']'", "'<'", "'>'", 
			"'{'", "'}'", "'('", "')'", "'\"'", "'_'", "','", "'.'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'_COND_'", "'_EFF_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALPHA", "NUMERIC", "ALPHANUMERIC", "WHITESPACE", "COLON", "SEMICOLON", 
			"LB_SQUARE", "RB_SQUARE", "LB_SHARP", "RB_SHARP", "LB_CURLY", "RB_CURLY", 
			"LB_ROUND", "RB_ROUND", "QUOTES", "UNDERSCORE", "COMMA", "DOT", "INT", 
			"FLOAT", "NUMBER", "STRING", "BOOL", "VAR", "AND", "OR", "NOT", "ID", 
			"FLAG", "VALUE", "OBJECT_TAG", "ROOM_TAG", "ACTION_TAG", "COND_TAG", 
			"EFFECT_TAG", "ID_KEY", "LOC_KEY", "NAME_KEY", "DESC_KEY", "FLAGS_KEY", 
			"VALUES_KEY", "DIR_KEY", "ACTION_KEY", "PRSA_COND", "PRSO_COND", "PRSI_COND", 
			"HERE_COND", "ANDFLAGS_COND", "ORFLAGS_COND", "HAVEITEM_COND", "HAVEITEMS_COND", 
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
	public String getGrammarFileName() { return "editorGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public editorGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Id_entryContext extends ParserRuleContext {
		public TerminalNode ID_KEY() { return getToken(editorGrammarParser.ID_KEY, 0); }
		public TerminalNode ID() { return getToken(editorGrammarParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(editorGrammarParser.SEMICOLON, 0); }
		public Id_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterId_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitId_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitId_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_entryContext id_entry() throws RecognitionException {
		Id_entryContext _localctx = new Id_entryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_id_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID_KEY);
			setState(79);
			match(ID);
			setState(80);
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
		public TerminalNode LOC_KEY() { return getToken(editorGrammarParser.LOC_KEY, 0); }
		public TerminalNode ID() { return getToken(editorGrammarParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(editorGrammarParser.SEMICOLON, 0); }
		public Loc_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loc_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterLoc_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitLoc_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitLoc_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loc_entryContext loc_entry() throws RecognitionException {
		Loc_entryContext _localctx = new Loc_entryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_loc_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(LOC_KEY);
			setState(83);
			match(ID);
			setState(84);
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
		public TerminalNode NAME_KEY() { return getToken(editorGrammarParser.NAME_KEY, 0); }
		public TerminalNode STRING() { return getToken(editorGrammarParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(editorGrammarParser.SEMICOLON, 0); }
		public Name_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterName_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitName_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitName_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_entryContext name_entry() throws RecognitionException {
		Name_entryContext _localctx = new Name_entryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_name_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(NAME_KEY);
			setState(87);
			match(STRING);
			setState(88);
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
		public TerminalNode DESC_KEY() { return getToken(editorGrammarParser.DESC_KEY, 0); }
		public TerminalNode STRING() { return getToken(editorGrammarParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(editorGrammarParser.SEMICOLON, 0); }
		public Desc_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterDesc_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitDesc_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitDesc_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Desc_entryContext desc_entry() throws RecognitionException {
		Desc_entryContext _localctx = new Desc_entryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_desc_entry);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESC_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(DESC_KEY);
				setState(91);
				match(STRING);
				setState(92);
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
		public TerminalNode FLAGS_KEY() { return getToken(editorGrammarParser.FLAGS_KEY, 0); }
		public List<TerminalNode> FLAG() { return getTokens(editorGrammarParser.FLAG); }
		public TerminalNode FLAG(int i) {
			return getToken(editorGrammarParser.FLAG, i);
		}
		public TerminalNode SEMICOLON() { return getToken(editorGrammarParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(editorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(editorGrammarParser.COMMA, i);
		}
		public Flags_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flags_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterFlags_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitFlags_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitFlags_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flags_entryContext flags_entry() throws RecognitionException {
		Flags_entryContext _localctx = new Flags_entryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_flags_entry);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLAGS_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(FLAGS_KEY);
				setState(97);
				match(FLAG);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(98);
					match(COMMA);
					setState(99);
					match(FLAG);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
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
		public TerminalNode VALUES_KEY() { return getToken(editorGrammarParser.VALUES_KEY, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(editorGrammarParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(editorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(editorGrammarParser.COMMA, i);
		}
		public Values_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterValues_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitValues_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitValues_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Values_entryContext values_entry() throws RecognitionException {
		Values_entryContext _localctx = new Values_entryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_values_entry);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(VALUES_KEY);
				setState(110);
				value();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(111);
					match(COMMA);
					setState(112);
					value();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
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
		public List<TerminalNode> DIR_KEY() { return getTokens(editorGrammarParser.DIR_KEY); }
		public TerminalNode DIR_KEY(int i) {
			return getToken(editorGrammarParser.DIR_KEY, i);
		}
		public List<TerminalNode> ID() { return getTokens(editorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(editorGrammarParser.ID, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(editorGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(editorGrammarParser.SEMICOLON, i);
		}
		public Dir_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dir_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterDir_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitDir_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitDir_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dir_entryContext dir_entry() throws RecognitionException {
		Dir_entryContext _localctx = new Dir_entryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dir_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(DIR_KEY);
			setState(124);
			match(ID);
			setState(125);
			match(SEMICOLON);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIR_KEY) {
				{
				{
				setState(126);
				match(DIR_KEY);
				setState(127);
				match(ID);
				setState(128);
				match(SEMICOLON);
				}
				}
				setState(133);
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
		public TerminalNode ACTION_KEY() { return getToken(editorGrammarParser.ACTION_KEY, 0); }
		public Action_blockContext action_block() {
			return getRuleContext(Action_blockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(editorGrammarParser.SEMICOLON, 0); }
		public Action_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterAction_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitAction_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitAction_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_entryContext action_entry() throws RecognitionException {
		Action_entryContext _localctx = new Action_entryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_action_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ACTION_KEY);
			setState(135);
			action_block();
			setState(136);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode LB_ROUND() { return getToken(editorGrammarParser.LB_ROUND, 0); }
		public TerminalNode ALPHANUMERIC() { return getToken(editorGrammarParser.ALPHANUMERIC, 0); }
		public TerminalNode COLON() { return getToken(editorGrammarParser.COLON, 0); }
		public TerminalNode VAR() { return getToken(editorGrammarParser.VAR, 0); }
		public TerminalNode RB_ROUND() { return getToken(editorGrammarParser.RB_ROUND, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(LB_ROUND);
			setState(139);
			match(ALPHANUMERIC);
			setState(140);
			match(COLON);
			setState(141);
			match(VAR);
			setState(142);
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

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode OBJECT_TAG() { return getToken(editorGrammarParser.OBJECT_TAG, 0); }
		public TerminalNode LB_CURLY() { return getToken(editorGrammarParser.LB_CURLY, 0); }
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
		public TerminalNode RB_CURLY() { return getToken(editorGrammarParser.RB_CURLY, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(OBJECT_TAG);
			setState(145);
			match(LB_CURLY);
			setState(146);
			id_entry();
			setState(147);
			loc_entry();
			setState(148);
			name_entry();
			setState(149);
			desc_entry();
			setState(150);
			flags_entry();
			setState(151);
			values_entry();
			setState(152);
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
		public TerminalNode ROOM_TAG() { return getToken(editorGrammarParser.ROOM_TAG, 0); }
		public TerminalNode LB_CURLY() { return getToken(editorGrammarParser.LB_CURLY, 0); }
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
		public TerminalNode RB_CURLY() { return getToken(editorGrammarParser.RB_CURLY, 0); }
		public RoomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_room; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterRoom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitRoom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitRoom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomContext room() throws RecognitionException {
		RoomContext _localctx = new RoomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_room);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(ROOM_TAG);
			setState(155);
			match(LB_CURLY);
			setState(156);
			id_entry();
			setState(157);
			dir_entry();
			setState(158);
			name_entry();
			setState(159);
			desc_entry();
			setState(160);
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
		public TerminalNode ACTION_TAG() { return getToken(editorGrammarParser.ACTION_TAG, 0); }
		public TerminalNode LB_CURLY() { return getToken(editorGrammarParser.LB_CURLY, 0); }
		public Id_entryContext id_entry() {
			return getRuleContext(Id_entryContext.class,0);
		}
		public Action_entryContext action_entry() {
			return getRuleContext(Action_entryContext.class,0);
		}
		public TerminalNode RB_CURLY() { return getToken(editorGrammarParser.RB_CURLY, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ACTION_TAG);
			setState(163);
			match(LB_CURLY);
			setState(164);
			id_entry();
			setState(165);
			action_entry();
			setState(166);
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
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterAction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitAction_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitAction_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_blockContext action_block() throws RecognitionException {
		Action_blockContext _localctx = new Action_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_action_block);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				effects();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				effects();
				setState(170);
				action_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				conditional();
				setState(174);
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
		public TerminalNode COND_TAG() { return getToken(editorGrammarParser.COND_TAG, 0); }
		public TerminalNode LB_SHARP() { return getToken(editorGrammarParser.LB_SHARP, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode RB_SHARP() { return getToken(editorGrammarParser.RB_SHARP, 0); }
		public TerminalNode LB_CURLY() { return getToken(editorGrammarParser.LB_CURLY, 0); }
		public Action_blockContext action_block() {
			return getRuleContext(Action_blockContext.class,0);
		}
		public TerminalNode RB_CURLY() { return getToken(editorGrammarParser.RB_CURLY, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(COND_TAG);
			setState(179);
			match(LB_SHARP);
			setState(180);
			conditions();
			setState(181);
			match(RB_SHARP);
			setState(182);
			match(LB_CURLY);
			setState(183);
			action_block();
			setState(184);
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
		public TerminalNode AND() { return getToken(editorGrammarParser.AND, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode OR() { return getToken(editorGrammarParser.OR, 0); }
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditions);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				condition_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				condition_aux();
				setState(188);
				match(AND);
				setState(189);
				conditions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				condition_aux();
				setState(192);
				match(OR);
				setState(193);
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
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterEffects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitEffects(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitEffects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectsContext effects() throws RecognitionException {
		EffectsContext _localctx = new EffectsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_effects);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				effect_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				effect_aux();
				setState(199);
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
		public TerminalNode EFFECT_TAG() { return getToken(editorGrammarParser.EFFECT_TAG, 0); }
		public TerminalNode LB_SHARP() { return getToken(editorGrammarParser.LB_SHARP, 0); }
		public EffectContext effect() {
			return getRuleContext(EffectContext.class,0);
		}
		public TerminalNode RB_SHARP() { return getToken(editorGrammarParser.RB_SHARP, 0); }
		public Effect_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterEffect_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitEffect_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitEffect_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Effect_auxContext effect_aux() throws RecognitionException {
		Effect_auxContext _localctx = new Effect_auxContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_effect_aux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(EFFECT_TAG);
			setState(204);
			match(LB_SHARP);
			setState(205);
			effect();
			setState(206);
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
		public TerminalNode NOT() { return getToken(editorGrammarParser.NOT, 0); }
		public Condition_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterCondition_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitCondition_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitCondition_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_auxContext condition_aux() throws RecognitionException {
		Condition_auxContext _localctx = new Condition_auxContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition_aux);
		try {
			setState(211);
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
				setState(208);
				condition();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(NOT);
				setState(210);
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
		public TerminalNode PRSA_COND() { return getToken(editorGrammarParser.PRSA_COND, 0); }
		public List<TerminalNode> ALPHA() { return getTokens(editorGrammarParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(editorGrammarParser.ALPHA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(editorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(editorGrammarParser.COMMA, i);
		}
		public Prsa_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prsa_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterPrsa_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitPrsa_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitPrsa_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prsa_condContext prsa_cond() throws RecognitionException {
		Prsa_condContext _localctx = new Prsa_condContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_prsa_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(PRSA_COND);
			setState(214);
			match(ALPHA);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(215);
				match(COMMA);
				setState(216);
				match(ALPHA);
				}
				}
				setState(221);
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
		public TerminalNode PRSO_COND() { return getToken(editorGrammarParser.PRSO_COND, 0); }
		public List<TerminalNode> ID() { return getTokens(editorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(editorGrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(editorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(editorGrammarParser.COMMA, i);
		}
		public Prso_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prso_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterPrso_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitPrso_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitPrso_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prso_condContext prso_cond() throws RecognitionException {
		Prso_condContext _localctx = new Prso_condContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_prso_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(PRSO_COND);
			setState(223);
			match(ID);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(224);
				match(COMMA);
				setState(225);
				match(ID);
				}
				}
				setState(230);
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
		public TerminalNode PRSI_COND() { return getToken(editorGrammarParser.PRSI_COND, 0); }
		public List<TerminalNode> ID() { return getTokens(editorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(editorGrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(editorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(editorGrammarParser.COMMA, i);
		}
		public Prsi_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prsi_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterPrsi_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitPrsi_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitPrsi_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prsi_condContext prsi_cond() throws RecognitionException {
		Prsi_condContext _localctx = new Prsi_condContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_prsi_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(PRSI_COND);
			setState(232);
			match(ID);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(233);
				match(COMMA);
				setState(234);
				match(ID);
				}
				}
				setState(239);
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
		public TerminalNode HERE_COND() { return getToken(editorGrammarParser.HERE_COND, 0); }
		public List<TerminalNode> ID() { return getTokens(editorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(editorGrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(editorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(editorGrammarParser.COMMA, i);
		}
		public Here_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_here_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterHere_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitHere_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitHere_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Here_condContext here_cond() throws RecognitionException {
		Here_condContext _localctx = new Here_condContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_here_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(HERE_COND);
			setState(241);
			match(ID);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				match(ID);
				}
				}
				setState(248);
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
		public TerminalNode ANDFLAGS_COND() { return getToken(editorGrammarParser.ANDFLAGS_COND, 0); }
		public List<TerminalNode> FLAG() { return getTokens(editorGrammarParser.FLAG); }
		public TerminalNode FLAG(int i) {
			return getToken(editorGrammarParser.FLAG, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(editorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(editorGrammarParser.COMMA, i);
		}
		public Andflags_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andflags_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterAndflags_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitAndflags_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitAndflags_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Andflags_condContext andflags_cond() throws RecognitionException {
		Andflags_condContext _localctx = new Andflags_condContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_andflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ANDFLAGS_COND);
			setState(250);
			match(FLAG);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(251);
				match(COMMA);
				setState(252);
				match(FLAG);
				}
				}
				setState(257);
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
		public TerminalNode ORFLAGS_COND() { return getToken(editorGrammarParser.ORFLAGS_COND, 0); }
		public List<TerminalNode> FLAG() { return getTokens(editorGrammarParser.FLAG); }
		public TerminalNode FLAG(int i) {
			return getToken(editorGrammarParser.FLAG, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(editorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(editorGrammarParser.COMMA, i);
		}
		public Orflags_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orflags_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterOrflags_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitOrflags_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitOrflags_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orflags_condContext orflags_cond() throws RecognitionException {
		Orflags_condContext _localctx = new Orflags_condContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_orflags_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ORFLAGS_COND);
			setState(259);
			match(FLAG);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(260);
				match(COMMA);
				setState(261);
				match(FLAG);
				}
				}
				setState(266);
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
		public TerminalNode HAVEITEM_COND() { return getToken(editorGrammarParser.HAVEITEM_COND, 0); }
		public List<TerminalNode> ID() { return getTokens(editorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(editorGrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(editorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(editorGrammarParser.COMMA, i);
		}
		public Haveitem_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haveitem_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterHaveitem_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitHaveitem_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitHaveitem_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Haveitem_condContext haveitem_cond() throws RecognitionException {
		Haveitem_condContext _localctx = new Haveitem_condContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_haveitem_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(HAVEITEM_COND);
			setState(268);
			match(ID);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(269);
				match(COMMA);
				setState(270);
				match(ID);
				}
				}
				setState(275);
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
		public TerminalNode HAVEITEMS_COND() { return getToken(editorGrammarParser.HAVEITEMS_COND, 0); }
		public List<TerminalNode> ID() { return getTokens(editorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(editorGrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(editorGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(editorGrammarParser.COMMA, i);
		}
		public Haveitems_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haveitems_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterHaveitems_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitHaveitems_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitHaveitems_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Haveitems_condContext haveitems_cond() throws RecognitionException {
		Haveitems_condContext _localctx = new Haveitems_condContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_haveitems_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(HAVEITEMS_COND);
			setState(277);
			match(ID);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(278);
				match(COMMA);
				setState(279);
				match(ID);
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

	public static class Equals_condContext extends ParserRuleContext {
		public TerminalNode EQUALS_COND() { return getToken(editorGrammarParser.EQUALS_COND, 0); }
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(editorGrammarParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(editorGrammarParser.ALPHANUMERIC, i);
		}
		public TerminalNode COMMA() { return getToken(editorGrammarParser.COMMA, 0); }
		public TerminalNode VALUE() { return getToken(editorGrammarParser.VALUE, 0); }
		public Equals_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterEquals_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitEquals_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitEquals_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equals_condContext equals_cond() throws RecognitionException {
		Equals_condContext _localctx = new Equals_condContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_equals_cond);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(EQUALS_COND);
				setState(286);
				match(ALPHANUMERIC);
				setState(287);
				match(COMMA);
				setState(288);
				match(VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(EQUALS_COND);
				setState(290);
				match(ALPHANUMERIC);
				setState(291);
				match(COMMA);
				setState(292);
				match(ALPHANUMERIC);
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
		public TerminalNode GT_COND() { return getToken(editorGrammarParser.GT_COND, 0); }
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(editorGrammarParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(editorGrammarParser.ALPHANUMERIC, i);
		}
		public TerminalNode COMMA() { return getToken(editorGrammarParser.COMMA, 0); }
		public TerminalNode VALUE() { return getToken(editorGrammarParser.VALUE, 0); }
		public Gt_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gt_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterGt_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitGt_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitGt_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gt_condContext gt_cond() throws RecognitionException {
		Gt_condContext _localctx = new Gt_condContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_gt_cond);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(GT_COND);
				setState(296);
				match(ALPHANUMERIC);
				setState(297);
				match(COMMA);
				setState(298);
				match(VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(GT_COND);
				setState(300);
				match(ALPHANUMERIC);
				setState(301);
				match(COMMA);
				setState(302);
				match(ALPHANUMERIC);
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
		public TerminalNode LT_COND() { return getToken(editorGrammarParser.LT_COND, 0); }
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(editorGrammarParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(editorGrammarParser.ALPHANUMERIC, i);
		}
		public TerminalNode COMMA() { return getToken(editorGrammarParser.COMMA, 0); }
		public TerminalNode VALUE() { return getToken(editorGrammarParser.VALUE, 0); }
		public Lt_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lt_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterLt_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitLt_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitLt_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lt_condContext lt_cond() throws RecognitionException {
		Lt_condContext _localctx = new Lt_condContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lt_cond);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(LT_COND);
				setState(306);
				match(ALPHANUMERIC);
				setState(307);
				match(COMMA);
				setState(308);
				match(VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(LT_COND);
				setState(310);
				match(ALPHANUMERIC);
				setState(311);
				match(COMMA);
				setState(312);
				match(ALPHANUMERIC);
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
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condition);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRSA_COND:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				prsa_cond();
				}
				break;
			case PRSO_COND:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				prso_cond();
				}
				break;
			case PRSI_COND:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				prsi_cond();
				}
				break;
			case HERE_COND:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				here_cond();
				}
				break;
			case ANDFLAGS_COND:
				enterOuterAlt(_localctx, 5);
				{
				setState(319);
				andflags_cond();
				}
				break;
			case ORFLAGS_COND:
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				orflags_cond();
				}
				break;
			case HAVEITEM_COND:
				enterOuterAlt(_localctx, 7);
				{
				setState(321);
				haveitem_cond();
				}
				break;
			case HAVEITEMS_COND:
				enterOuterAlt(_localctx, 8);
				{
				setState(322);
				haveitems_cond();
				}
				break;
			case EQUALS_COND:
				enterOuterAlt(_localctx, 9);
				{
				setState(323);
				equals_cond();
				}
				break;
			case GT_COND:
				enterOuterAlt(_localctx, 10);
				{
				setState(324);
				gt_cond();
				}
				break;
			case LT_COND:
				enterOuterAlt(_localctx, 11);
				{
				setState(325);
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
		public TerminalNode TELL_EFF() { return getToken(editorGrammarParser.TELL_EFF, 0); }
		public TerminalNode STRING() { return getToken(editorGrammarParser.STRING, 0); }
		public Tell_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tell_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterTell_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitTell_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitTell_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tell_effContext tell_eff() throws RecognitionException {
		Tell_effContext _localctx = new Tell_effContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tell_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(TELL_EFF);
			setState(329);
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
		public TerminalNode GOTO_EFF() { return getToken(editorGrammarParser.GOTO_EFF, 0); }
		public TerminalNode ID() { return getToken(editorGrammarParser.ID, 0); }
		public Goto_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterGoto_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitGoto_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitGoto_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Goto_effContext goto_eff() throws RecognitionException {
		Goto_effContext _localctx = new Goto_effContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_goto_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(GOTO_EFF);
			setState(332);
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
		public TerminalNode SETFLAG_EFF() { return getToken(editorGrammarParser.SETFLAG_EFF, 0); }
		public TerminalNode FLAG() { return getToken(editorGrammarParser.FLAG, 0); }
		public Setflag_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setflag_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterSetflag_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitSetflag_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitSetflag_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setflag_effContext setflag_eff() throws RecognitionException {
		Setflag_effContext _localctx = new Setflag_effContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_setflag_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(SETFLAG_EFF);
			setState(335);
			match(FLAG);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode REMFLAG_EFF() { return getToken(editorGrammarParser.REMFLAG_EFF, 0); }
		public TerminalNode FLAG() { return getToken(editorGrammarParser.FLAG, 0); }
		public Remflag_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remflag_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterRemflag_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitRemflag_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitRemflag_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Remflag_effContext remflag_eff() throws RecognitionException {
		Remflag_effContext _localctx = new Remflag_effContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_remflag_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(REMFLAG_EFF);
			setState(338);
			match(FLAG);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode TAKE_EFF() { return getToken(editorGrammarParser.TAKE_EFF, 0); }
		public TerminalNode ID() { return getToken(editorGrammarParser.ID, 0); }
		public Take_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_take_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterTake_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitTake_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitTake_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Take_effContext take_eff() throws RecognitionException {
		Take_effContext _localctx = new Take_effContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_take_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(TAKE_EFF);
			setState(341);
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
		public TerminalNode PLACE_EFF() { return getToken(editorGrammarParser.PLACE_EFF, 0); }
		public List<TerminalNode> ID() { return getTokens(editorGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(editorGrammarParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(editorGrammarParser.COMMA, 0); }
		public Place_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_place_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterPlace_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitPlace_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitPlace_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Place_effContext place_eff() throws RecognitionException {
		Place_effContext _localctx = new Place_effContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_place_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(PLACE_EFF);
			setState(344);
			match(ID);
			setState(345);
			match(COMMA);
			setState(346);
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
		public TerminalNode SET_EFF() { return getToken(editorGrammarParser.SET_EFF, 0); }
		public TerminalNode ALPHANUMERIC() { return getToken(editorGrammarParser.ALPHANUMERIC, 0); }
		public TerminalNode COMMA() { return getToken(editorGrammarParser.COMMA, 0); }
		public TerminalNode VAR() { return getToken(editorGrammarParser.VAR, 0); }
		public Set_effContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_eff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterSet_eff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitSet_eff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitSet_eff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_effContext set_eff() throws RecognitionException {
		Set_effContext _localctx = new Set_effContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_set_eff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(SET_EFF);
			setState(349);
			match(ALPHANUMERIC);
			setState(350);
			match(COMMA);
			setState(351);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectContext effect() throws RecognitionException {
		EffectContext _localctx = new EffectContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_effect);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TELL_EFF:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				tell_eff();
				}
				break;
			case GOTO_EFF:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				goto_eff();
				}
				break;
			case SETFLAG_EFF:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				setflag_eff();
				}
				break;
			case REMFLAG_EFF:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				remflag_eff();
				}
				break;
			case TAKE_EFF:
				enterOuterAlt(_localctx, 5);
				{
				setState(357);
				take_eff();
				}
				break;
			case PLACE_EFF:
				enterOuterAlt(_localctx, 6);
				{
				setState(358);
				place_eff();
				}
				break;
			case SET_EFF:
				enterOuterAlt(_localctx, 7);
				{
				setState(359);
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
		public Game_grammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_game_grammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).enterGame_grammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof editorGrammarListener ) ((editorGrammarListener)listener).exitGame_grammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof editorGrammarVisitor ) return ((editorGrammarVisitor<? extends T>)visitor).visitGame_grammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Game_grammarContext game_grammar() throws RecognitionException {
		Game_grammarContext _localctx = new Game_grammarContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_game_grammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			room();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECT_TAG) | (1L << ROOM_TAG) | (1L << ACTION_TAG))) != 0)) {
				{
				setState(366);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ROOM_TAG:
					{
					setState(363);
					room();
					}
					break;
				case OBJECT_TAG:
					{
					setState(364);
					object();
					}
					break;
				case ACTION_TAG:
					{
					setState(365);
					action();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(370);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u0176\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5a\n\5\3\6\3\6\3\6\3\6"+
		"\7\6g\n\6\f\6\16\6j\13\6\3\6\3\6\5\6n\n\6\3\7\3\7\3\7\3\7\7\7t\n\7\f\7"+
		"\16\7w\13\7\3\7\3\7\3\7\5\7|\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0084\n\b"+
		"\f\b\16\b\u0087\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00b3\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00c6\n\20\3\21\3\21\3\21\3\21\5\21\u00cc"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00d6\n\23\3\24\3\24"+
		"\3\24\3\24\7\24\u00dc\n\24\f\24\16\24\u00df\13\24\3\25\3\25\3\25\3\25"+
		"\7\25\u00e5\n\25\f\25\16\25\u00e8\13\25\3\26\3\26\3\26\3\26\7\26\u00ee"+
		"\n\26\f\26\16\26\u00f1\13\26\3\27\3\27\3\27\3\27\7\27\u00f7\n\27\f\27"+
		"\16\27\u00fa\13\27\3\30\3\30\3\30\3\30\7\30\u0100\n\30\f\30\16\30\u0103"+
		"\13\30\3\31\3\31\3\31\3\31\7\31\u0109\n\31\f\31\16\31\u010c\13\31\3\32"+
		"\3\32\3\32\3\32\7\32\u0112\n\32\f\32\16\32\u0115\13\32\3\33\3\33\3\33"+
		"\3\33\7\33\u011b\n\33\f\33\16\33\u011e\13\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0128\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0132\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u013c\n"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0149"+
		"\n\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u016b\n\'\3(\3(\3(\3(\7"+
		"(\u0171\n(\f(\16(\u0174\13(\3(\2\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\2\2\u0179\2P\3\2\2\2\4T\3\2\2\2"+
		"\6X\3\2\2\2\b`\3\2\2\2\nm\3\2\2\2\f{\3\2\2\2\16}\3\2\2\2\20\u0088\3\2"+
		"\2\2\22\u008c\3\2\2\2\24\u0092\3\2\2\2\26\u009c\3\2\2\2\30\u00a4\3\2\2"+
		"\2\32\u00b2\3\2\2\2\34\u00b4\3\2\2\2\36\u00c5\3\2\2\2 \u00cb\3\2\2\2\""+
		"\u00cd\3\2\2\2$\u00d5\3\2\2\2&\u00d7\3\2\2\2(\u00e0\3\2\2\2*\u00e9\3\2"+
		"\2\2,\u00f2\3\2\2\2.\u00fb\3\2\2\2\60\u0104\3\2\2\2\62\u010d\3\2\2\2\64"+
		"\u0116\3\2\2\2\66\u0127\3\2\2\28\u0131\3\2\2\2:\u013b\3\2\2\2<\u0148\3"+
		"\2\2\2>\u014a\3\2\2\2@\u014d\3\2\2\2B\u0150\3\2\2\2D\u0153\3\2\2\2F\u0156"+
		"\3\2\2\2H\u0159\3\2\2\2J\u015e\3\2\2\2L\u016a\3\2\2\2N\u016c\3\2\2\2P"+
		"Q\7&\2\2QR\7\36\2\2RS\7\b\2\2S\3\3\2\2\2TU\7\'\2\2UV\7\36\2\2VW\7\b\2"+
		"\2W\5\3\2\2\2XY\7(\2\2YZ\7\30\2\2Z[\7\b\2\2[\7\3\2\2\2\\]\7)\2\2]^\7\30"+
		"\2\2^a\7\b\2\2_a\3\2\2\2`\\\3\2\2\2`_\3\2\2\2a\t\3\2\2\2bc\7*\2\2ch\7"+
		"\37\2\2de\7\23\2\2eg\7\37\2\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2"+
		"ik\3\2\2\2jh\3\2\2\2kn\7\b\2\2ln\3\2\2\2mb\3\2\2\2ml\3\2\2\2n\13\3\2\2"+
		"\2op\7+\2\2pu\5\22\n\2qr\7\23\2\2rt\5\22\n\2sq\3\2\2\2tw\3\2\2\2us\3\2"+
		"\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\b\2\2y|\3\2\2\2z|\3\2\2\2{o\3\2"+
		"\2\2{z\3\2\2\2|\r\3\2\2\2}~\7,\2\2~\177\7\36\2\2\177\u0085\7\b\2\2\u0080"+
		"\u0081\7,\2\2\u0081\u0082\7\36\2\2\u0082\u0084\7\b\2\2\u0083\u0080\3\2"+
		"\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\17\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7-\2\2\u0089\u008a\5\32\16"+
		"\2\u008a\u008b\7\b\2\2\u008b\21\3\2\2\2\u008c\u008d\7\17\2\2\u008d\u008e"+
		"\7\5\2\2\u008e\u008f\7\7\2\2\u008f\u0090\7\32\2\2\u0090\u0091\7\20\2\2"+
		"\u0091\23\3\2\2\2\u0092\u0093\7!\2\2\u0093\u0094\7\r\2\2\u0094\u0095\5"+
		"\2\2\2\u0095\u0096\5\4\3\2\u0096\u0097\5\6\4\2\u0097\u0098\5\b\5\2\u0098"+
		"\u0099\5\n\6\2\u0099\u009a\5\f\7\2\u009a\u009b\7\16\2\2\u009b\25\3\2\2"+
		"\2\u009c\u009d\7\"\2\2\u009d\u009e\7\r\2\2\u009e\u009f\5\2\2\2\u009f\u00a0"+
		"\5\16\b\2\u00a0\u00a1\5\6\4\2\u00a1\u00a2\5\b\5\2\u00a2\u00a3\7\16\2\2"+
		"\u00a3\27\3\2\2\2\u00a4\u00a5\7#\2\2\u00a5\u00a6\7\r\2\2\u00a6\u00a7\5"+
		"\2\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00a9\7\16\2\2\u00a9\31\3\2\2\2\u00aa"+
		"\u00b3\5 \21\2\u00ab\u00ac\5 \21\2\u00ac\u00ad\5\32\16\2\u00ad\u00b3\3"+
		"\2\2\2\u00ae\u00b3\5\34\17\2\u00af\u00b0\5\34\17\2\u00b0\u00b1\5\32\16"+
		"\2\u00b1\u00b3\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00ae"+
		"\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\33\3\2\2\2\u00b4\u00b5\7$\2\2\u00b5"+
		"\u00b6\7\13\2\2\u00b6\u00b7\5\36\20\2\u00b7\u00b8\7\f\2\2\u00b8\u00b9"+
		"\7\r\2\2\u00b9\u00ba\5\32\16\2\u00ba\u00bb\7\16\2\2\u00bb\35\3\2\2\2\u00bc"+
		"\u00c6\5$\23\2\u00bd\u00be\5$\23\2\u00be\u00bf\7\33\2\2\u00bf\u00c0\5"+
		"\36\20\2\u00c0\u00c6\3\2\2\2\u00c1\u00c2\5$\23\2\u00c2\u00c3\7\34\2\2"+
		"\u00c3\u00c4\5\36\20\2\u00c4\u00c6\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00bd"+
		"\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\37\3\2\2\2\u00c7\u00cc\5\"\22\2\u00c8"+
		"\u00c9\5\"\22\2\u00c9\u00ca\5 \21\2\u00ca\u00cc\3\2\2\2\u00cb\u00c7\3"+
		"\2\2\2\u00cb\u00c8\3\2\2\2\u00cc!\3\2\2\2\u00cd\u00ce\7%\2\2\u00ce\u00cf"+
		"\7\13\2\2\u00cf\u00d0\5L\'\2\u00d0\u00d1\7\f\2\2\u00d1#\3\2\2\2\u00d2"+
		"\u00d6\5<\37\2\u00d3\u00d4\7\35\2\2\u00d4\u00d6\5<\37\2\u00d5\u00d2\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d6%\3\2\2\2\u00d7\u00d8\7.\2\2\u00d8\u00dd"+
		"\7\3\2\2\u00d9\u00da\7\23\2\2\u00da\u00dc\7\3\2\2\u00db\u00d9\3\2\2\2"+
		"\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\'\3"+
		"\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7/\2\2\u00e1\u00e6\7\36\2\2\u00e2"+
		"\u00e3\7\23\2\2\u00e3\u00e5\7\36\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3"+
		"\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7)\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ea\7\60\2\2\u00ea\u00ef\7\36\2\2\u00eb\u00ec\7\23\2"+
		"\2\u00ec\u00ee\7\36\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0+\3\2\2\2\u00f1\u00ef\3\2\2\2"+
		"\u00f2\u00f3\7\61\2\2\u00f3\u00f8\7\36\2\2\u00f4\u00f5\7\23\2\2\u00f5"+
		"\u00f7\7\36\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9-\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc"+
		"\7\62\2\2\u00fc\u0101\7\37\2\2\u00fd\u00fe\7\23\2\2\u00fe\u0100\7\37\2"+
		"\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102/\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\63\2\2\u0105"+
		"\u010a\7\37\2\2\u0106\u0107\7\23\2\2\u0107\u0109\7\37\2\2\u0108\u0106"+
		"\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\61\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\64\2\2\u010e\u0113\7\36"+
		"\2\2\u010f\u0110\7\23\2\2\u0110\u0112\7\36\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\63\3\2\2"+
		"\2\u0115\u0113\3\2\2\2\u0116\u0117\7\65\2\2\u0117\u011c\7\36\2\2\u0118"+
		"\u0119\7\23\2\2\u0119\u011b\7\36\2\2\u011a\u0118\3\2\2\2\u011b\u011e\3"+
		"\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\65\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0120\7\66\2\2\u0120\u0121\7\5\2\2\u0121\u0122\7"+
		"\23\2\2\u0122\u0128\7 \2\2\u0123\u0124\7\66\2\2\u0124\u0125\7\5\2\2\u0125"+
		"\u0126\7\23\2\2\u0126\u0128\7\5\2\2\u0127\u011f\3\2\2\2\u0127\u0123\3"+
		"\2\2\2\u0128\67\3\2\2\2\u0129\u012a\7\67\2\2\u012a\u012b\7\5\2\2\u012b"+
		"\u012c\7\23\2\2\u012c\u0132\7 \2\2\u012d\u012e\7\67\2\2\u012e\u012f\7"+
		"\5\2\2\u012f\u0130\7\23\2\2\u0130\u0132\7\5\2\2\u0131\u0129\3\2\2\2\u0131"+
		"\u012d\3\2\2\2\u01329\3\2\2\2\u0133\u0134\78\2\2\u0134\u0135\7\5\2\2\u0135"+
		"\u0136\7\23\2\2\u0136\u013c\7 \2\2\u0137\u0138\78\2\2\u0138\u0139\7\5"+
		"\2\2\u0139\u013a\7\23\2\2\u013a\u013c\7\5\2\2\u013b\u0133\3\2\2\2\u013b"+
		"\u0137\3\2\2\2\u013c;\3\2\2\2\u013d\u0149\5&\24\2\u013e\u0149\5(\25\2"+
		"\u013f\u0149\5*\26\2\u0140\u0149\5,\27\2\u0141\u0149\5.\30\2\u0142\u0149"+
		"\5\60\31\2\u0143\u0149\5\62\32\2\u0144\u0149\5\64\33\2\u0145\u0149\5\66"+
		"\34\2\u0146\u0149\58\35\2\u0147\u0149\5:\36\2\u0148\u013d\3\2\2\2\u0148"+
		"\u013e\3\2\2\2\u0148\u013f\3\2\2\2\u0148\u0140\3\2\2\2\u0148\u0141\3\2"+
		"\2\2\u0148\u0142\3\2\2\2\u0148\u0143\3\2\2\2\u0148\u0144\3\2\2\2\u0148"+
		"\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149=\3\2\2\2"+
		"\u014a\u014b\79\2\2\u014b\u014c\7\30\2\2\u014c?\3\2\2\2\u014d\u014e\7"+
		":\2\2\u014e\u014f\7\36\2\2\u014fA\3\2\2\2\u0150\u0151\7;\2\2\u0151\u0152"+
		"\7\37\2\2\u0152C\3\2\2\2\u0153\u0154\7<\2\2\u0154\u0155\7\37\2\2\u0155"+
		"E\3\2\2\2\u0156\u0157\7=\2\2\u0157\u0158\7\36\2\2\u0158G\3\2\2\2\u0159"+
		"\u015a\7>\2\2\u015a\u015b\7\36\2\2\u015b\u015c\7\23\2\2\u015c\u015d\7"+
		"\36\2\2\u015dI\3\2\2\2\u015e\u015f\7?\2\2\u015f\u0160\7\5\2\2\u0160\u0161"+
		"\7\23\2\2\u0161\u0162\7\32\2\2\u0162K\3\2\2\2\u0163\u016b\5> \2\u0164"+
		"\u016b\5@!\2\u0165\u016b\5B\"\2\u0166\u016b\5D#\2\u0167\u016b\5F$\2\u0168"+
		"\u016b\5H%\2\u0169\u016b\5J&\2\u016a\u0163\3\2\2\2\u016a\u0164\3\2\2\2"+
		"\u016a\u0165\3\2\2\2\u016a\u0166\3\2\2\2\u016a\u0167\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016a\u0169\3\2\2\2\u016bM\3\2\2\2\u016c\u0172\5\26\f\2\u016d"+
		"\u0171\5\26\f\2\u016e\u0171\5\24\13\2\u016f\u0171\5\30\r\2\u0170\u016d"+
		"\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173O\3\2\2\2\u0174\u0172\3\2\2\2"+
		"\33`hmu{\u0085\u00b2\u00c5\u00cb\u00d5\u00dd\u00e6\u00ef\u00f8\u0101\u010a"+
		"\u0113\u011c\u0127\u0131\u013b\u0148\u016a\u0170\u0172";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}