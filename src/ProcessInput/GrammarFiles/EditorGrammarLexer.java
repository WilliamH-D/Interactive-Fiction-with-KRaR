// Generated from D:/Documents/University/Part II Project/Interactive Fiction with KRaR/src/ProcessInput\EditorGrammar.g4 by ANTLR 4.9.2
package ProcessInput.GrammarFiles;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EditorGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COLON", "SEMICOLON", "LB_SQUARE", "RB_SQUARE", "LB_SHARP", "RB_SHARP", 
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


	public EditorGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EditorGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2V\u02ab\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\6\37\u00fb\n\37\r\37\16\37\u00fc\3 \6 "+
		"\u0100\n \r \16 \u0101\3!\6!\u0105\n!\r!\16!\u0106\3\"\6\"\u010a\n\"\r"+
		"\"\16\"\u010b\3\"\3\"\3#\3#\7#\u0112\n#\f#\16#\u0115\13#\3#\3#\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\39\39\39\39\39\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3"+
		"B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3"+
		"M\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3"+
		"S\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\2\2V\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9"+
		"V\3\2\7\4\2C\\c|\3\2\62;\5\2\62;C\\c|\5\2\13\f\17\17\"\"\3\2$$\2\u02af"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\3\u00ab\3\2\2\2\5\u00ad\3\2\2\2\7\u00af\3\2\2\2\t\u00b1\3\2\2"+
		"\2\13\u00b3\3\2\2\2\r\u00b5\3\2\2\2\17\u00b7\3\2\2\2\21\u00b9\3\2\2\2"+
		"\23\u00bb\3\2\2\2\25\u00bd\3\2\2\2\27\u00bf\3\2\2\2\31\u00c1\3\2\2\2\33"+
		"\u00c3\3\2\2\2\35\u00c5\3\2\2\2\37\u00c7\3\2\2\2!\u00c9\3\2\2\2#\u00cb"+
		"\3\2\2\2%\u00cd\3\2\2\2\'\u00cf\3\2\2\2)\u00d1\3\2\2\2+\u00d6\3\2\2\2"+
		"-\u00dc\3\2\2\2/\u00df\3\2\2\2\61\u00e2\3\2\2\2\63\u00e4\3\2\2\2\65\u00e9"+
		"\3\2\2\2\67\u00ed\3\2\2\29\u00f0\3\2\2\2;\u00f3\3\2\2\2=\u00fa\3\2\2\2"+
		"?\u00ff\3\2\2\2A\u0104\3\2\2\2C\u0109\3\2\2\2E\u010f\3\2\2\2G\u0118\3"+
		"\2\2\2I\u011c\3\2\2\2K\u0126\3\2\2\2M\u012e\3\2\2\2O\u0138\3\2\2\2Q\u0140"+
		"\3\2\2\2S\u0145\3\2\2\2U\u0150\3\2\2\2W\u015f\3\2\2\2Y\u0166\3\2\2\2["+
		"\u016d\3\2\2\2]\u0174\3\2\2\2_\u0181\3\2\2\2a\u0188\3\2\2\2c\u0191\3\2"+
		"\2\2e\u0199\3\2\2\2g\u019c\3\2\2\2i\u019f\3\2\2\2k\u01a2\3\2\2\2m\u01a5"+
		"\3\2\2\2o\u01a8\3\2\2\2q\u01ab\3\2\2\2s\u01b3\3\2\2\2u\u01bb\3\2\2\2w"+
		"\u01c3\3\2\2\2y\u01cb\3\2\2\2{\u01d3\3\2\2\2}\u01db\3\2\2\2\177\u01e4"+
		"\3\2\2\2\u0081\u01eb\3\2\2\2\u0083\u01f5\3\2\2\2\u0085\u01fc\3\2\2\2\u0087"+
		"\u0203\3\2\2\2\u0089\u020a\3\2\2\2\u008b\u0215\3\2\2\2\u008d\u021f\3\2"+
		"\2\2\u008f\u022f\3\2\2\2\u0091\u023e\3\2\2\2\u0093\u024a\3\2\2\2\u0095"+
		"\u0255\3\2\2\2\u0097\u0261\3\2\2\2\u0099\u026a\3\2\2\2\u009b\u026f\3\2"+
		"\2\2\u009d\u0274\3\2\2\2\u009f\u027b\3\2\2\2\u00a1\u0282\3\2\2\2\u00a3"+
		"\u028c\3\2\2\2\u00a5\u0296\3\2\2\2\u00a7\u029d\3\2\2\2\u00a9\u02a5\3\2"+
		"\2\2\u00ab\u00ac\7<\2\2\u00ac\4\3\2\2\2\u00ad\u00ae\7=\2\2\u00ae\6\3\2"+
		"\2\2\u00af\u00b0\7]\2\2\u00b0\b\3\2\2\2\u00b1\u00b2\7_\2\2\u00b2\n\3\2"+
		"\2\2\u00b3\u00b4\7>\2\2\u00b4\f\3\2\2\2\u00b5\u00b6\7@\2\2\u00b6\16\3"+
		"\2\2\2\u00b7\u00b8\7}\2\2\u00b8\20\3\2\2\2\u00b9\u00ba\7\177\2\2\u00ba"+
		"\22\3\2\2\2\u00bb\u00bc\7*\2\2\u00bc\24\3\2\2\2\u00bd\u00be\7+\2\2\u00be"+
		"\26\3\2\2\2\u00bf\u00c0\7$\2\2\u00c0\30\3\2\2\2\u00c1\u00c2\7a\2\2\u00c2"+
		"\32\3\2\2\2\u00c3\u00c4\7.\2\2\u00c4\34\3\2\2\2\u00c5\u00c6\7\60\2\2\u00c6"+
		"\36\3\2\2\2\u00c7\u00c8\7-\2\2\u00c8 \3\2\2\2\u00c9\u00ca\7/\2\2\u00ca"+
		"\"\3\2\2\2\u00cb\u00cc\7~\2\2\u00cc$\3\2\2\2\u00cd\u00ce\7(\2\2\u00ce"+
		"&\3\2\2\2\u00cf\u00d0\7?\2\2\u00d0(\3\2\2\2\u00d1\u00d2\7V\2\2\u00d2\u00d3"+
		"\7T\2\2\u00d3\u00d4\7W\2\2\u00d4\u00d5\7G\2\2\u00d5*\3\2\2\2\u00d6\u00d7"+
		"\7H\2\2\u00d7\u00d8\7C\2\2\u00d8\u00d9\7N\2\2\u00d9\u00da\7U\2\2\u00da"+
		"\u00db\7G\2\2\u00db,\3\2\2\2\u00dc\u00dd\5%\23\2\u00dd\u00de\5%\23\2\u00de"+
		".\3\2\2\2\u00df\u00e0\5#\22\2\u00e0\u00e1\5#\22\2\u00e1\60\3\2\2\2\u00e2"+
		"\u00e3\7#\2\2\u00e3\62\3\2\2\2\u00e4\u00e5\7E\2\2\u00e5\u00e6\7Q\2\2\u00e6"+
		"\u00e7\7P\2\2\u00e7\u00e8\7F\2\2\u00e8\64\3\2\2\2\u00e9\u00ea\7G\2\2\u00ea"+
		"\u00eb\7H\2\2\u00eb\u00ec\7H\2\2\u00ec\66\3\2\2\2\u00ed\u00ee\7K\2\2\u00ee"+
		"\u00ef\7P\2\2\u00ef8\3\2\2\2\u00f0\u00f1\7Q\2\2\u00f1\u00f2\7P\2\2\u00f2"+
		":\3\2\2\2\u00f3\u00f4\7W\2\2\u00f4\u00f5\7P\2\2\u00f5\u00f6\7F\2\2\u00f6"+
		"\u00f7\7G\2\2\u00f7\u00f8\7T\2\2\u00f8<\3\2\2\2\u00f9\u00fb\t\2\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd>\3\2\2\2\u00fe\u0100\t\3\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102@\3\2\2\2\u0103"+
		"\u0105\t\4\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107B\3\2\2\2\u0108\u010a\t\5\2\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\b\"\2\2\u010eD\3\2\2\2\u010f\u0113\5\27\f\2"+
		"\u0110\u0112\n\6\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0117\5\27\f\2\u0117F\3\2\2\2\u0118\u0119\5\13\6\2\u0119\u011a\5A!\2"+
		"\u011a\u011b\5\r\7\2\u011bH\3\2\2\2\u011c\u011d\5\7\4\2\u011d\u011e\7"+
		"q\2\2\u011e\u011f\7d\2\2\u011f\u0120\7l\2\2\u0120\u0121\7g\2\2\u0121\u0122"+
		"\7e\2\2\u0122\u0123\7v\2\2\u0123\u0124\3\2\2\2\u0124\u0125\5\t\5\2\u0125"+
		"J\3\2\2\2\u0126\u0127\5\7\4\2\u0127\u0128\7t\2\2\u0128\u0129\7q\2\2\u0129"+
		"\u012a\7q\2\2\u012a\u012b\7o\2\2\u012b\u012c\3\2\2\2\u012c\u012d\5\t\5"+
		"\2\u012dL\3\2\2\2\u012e\u012f\5\7\4\2\u012f\u0130\7c\2\2\u0130\u0131\7"+
		"e\2\2\u0131\u0132\7v\2\2\u0132\u0133\7k\2\2\u0133\u0134\7q\2\2\u0134\u0135"+
		"\7p\2\2\u0135\u0136\3\2\2\2\u0136\u0137\5\t\5\2\u0137N\3\2\2\2\u0138\u0139"+
		"\5\7\4\2\u0139\u013a\7h\2\2\u013a\u013b\7n\2\2\u013b\u013c\7c\2\2\u013c"+
		"\u013d\7i\2\2\u013d\u013e\3\2\2\2\u013e\u013f\5\t\5\2\u013fP\3\2\2\2\u0140"+
		"\u0141\7K\2\2\u0141\u0142\7F\2\2\u0142\u0143\3\2\2\2\u0143\u0144\5\3\2"+
		"\2\u0144R\3\2\2\2\u0145\u0146\7N\2\2\u0146\u0147\7Q\2\2\u0147\u0148\7"+
		"E\2\2\u0148\u0149\7C\2\2\u0149\u014a\7V\2\2\u014a\u014b\7K\2\2\u014b\u014c"+
		"\7Q\2\2\u014c\u014d\7P\2\2\u014d\u014e\3\2\2\2\u014e\u014f\5\3\2\2\u014f"+
		"T\3\2\2\2\u0150\u0151\7N\2\2\u0151\u0152\7Q\2\2\u0152\u0153\7E\2\2\u0153"+
		"\u0154\7C\2\2\u0154\u0155\7V\2\2\u0155\u0156\7K\2\2\u0156\u0157\7Q\2\2"+
		"\u0157\u0158\7P\2\2\u0158\u0159\7V\2\2\u0159\u015a\7[\2\2\u015a\u015b"+
		"\7R\2\2\u015b\u015c\7G\2\2\u015c\u015d\3\2\2\2\u015d\u015e\5\3\2\2\u015e"+
		"V\3\2\2\2\u015f\u0160\7P\2\2\u0160\u0161\7C\2\2\u0161\u0162\7O\2\2\u0162"+
		"\u0163\7G\2\2\u0163\u0164\3\2\2\2\u0164\u0165\5\3\2\2\u0165X\3\2\2\2\u0166"+
		"\u0167\7F\2\2\u0167\u0168\7G\2\2\u0168\u0169\7U\2\2\u0169\u016a\7E\2\2"+
		"\u016a\u016b\3\2\2\2\u016b\u016c\5\3\2\2\u016cZ\3\2\2\2\u016d\u016e\7"+
		"U\2\2\u016e\u016f\7[\2\2\u016f\u0170\7P\2\2\u0170\u0171\7U\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u0173\5\3\2\2\u0173\\\3\2\2\2\u0174\u0175\7R\2\2\u0175"+
		"\u0176\7T\2\2\u0176\u0177\7Q\2\2\u0177\u0178\7R\2\2\u0178\u0179\7G\2\2"+
		"\u0179\u017a\7T\2\2\u017a\u017b\7V\2\2\u017b\u017c\7K\2\2\u017c\u017d"+
		"\7G\2\2\u017d\u017e\7U\2\2\u017e\u017f\3\2\2\2\u017f\u0180\5\3\2\2\u0180"+
		"^\3\2\2\2\u0181\u0182\7H\2\2\u0182\u0183\7N\2\2\u0183\u0184\7C\2\2\u0184"+
		"\u0185\7I\2\2\u0185\u0186\3\2\2\2\u0186\u0187\5\3\2\2\u0187`\3\2\2\2\u0188"+
		"\u0189\7X\2\2\u0189\u018a\7C\2\2\u018a\u018b\7N\2\2\u018b\u018c\7W\2\2"+
		"\u018c\u018d\7G\2\2\u018d\u018e\7U\2\2\u018e\u018f\3\2\2\2\u018f\u0190"+
		"\5\3\2\2\u0190b\3\2\2\2\u0191\u0192\7X\2\2\u0192\u0193\7C\2\2\u0193\u0194"+
		"\7N\2\2\u0194\u0195\7W\2\2\u0195\u0196\7G\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\5\3\2\2\u0198d\3\2\2\2\u0199\u019a\7P\2\2\u019a\u019b\5\3\2\2\u019b"+
		"f\3\2\2\2\u019c\u019d\7U\2\2\u019d\u019e\5\3\2\2\u019eh\3\2\2\2\u019f"+
		"\u01a0\7G\2\2\u01a0\u01a1\5\3\2\2\u01a1j\3\2\2\2\u01a2\u01a3\7Y\2\2\u01a3"+
		"\u01a4\5\3\2\2\u01a4l\3\2\2\2\u01a5\u01a6\7W\2\2\u01a6\u01a7\5\3\2\2\u01a7"+
		"n\3\2\2\2\u01a8\u01a9\7F\2\2\u01a9\u01aa\5\3\2\2\u01aap\3\2\2\2\u01ab"+
		"\u01ac\7P\2\2\u01ac\u01ad\7E\2\2\u01ad\u01ae\7Q\2\2\u01ae\u01af\7P\2\2"+
		"\u01af\u01b0\7F\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\5\3\2\2\u01b2r\3\2"+
		"\2\2\u01b3\u01b4\7U\2\2\u01b4\u01b5\7E\2\2\u01b5\u01b6\7Q\2\2\u01b6\u01b7"+
		"\7P\2\2\u01b7\u01b8\7F\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\5\3\2\2\u01ba"+
		"t\3\2\2\2\u01bb\u01bc\7G\2\2\u01bc\u01bd\7E\2\2\u01bd\u01be\7Q\2\2\u01be"+
		"\u01bf\7P\2\2\u01bf\u01c0\7F\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\5\3\2"+
		"\2\u01c2v\3\2\2\2\u01c3\u01c4\7Y\2\2\u01c4\u01c5\7E\2\2\u01c5\u01c6\7"+
		"Q\2\2\u01c6\u01c7\7P\2\2\u01c7\u01c8\7F\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ca\5\3\2\2\u01cax\3\2\2\2\u01cb\u01cc\7W\2\2\u01cc\u01cd\7E\2\2\u01cd"+
		"\u01ce\7Q\2\2\u01ce\u01cf\7P\2\2\u01cf\u01d0\7F\2\2\u01d0\u01d1\3\2\2"+
		"\2\u01d1\u01d2\5\3\2\2\u01d2z\3\2\2\2\u01d3\u01d4\7F\2\2\u01d4\u01d5\7"+
		"E\2\2\u01d5\u01d6\7Q\2\2\u01d6\u01d7\7P\2\2\u01d7\u01d8\7F\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\5\3\2\2\u01da|\3\2\2\2\u01db\u01dc\7C\2\2\u01dc\u01dd"+
		"\7E\2\2\u01dd\u01de\7V\2\2\u01de\u01df\7K\2\2\u01df\u01e0\7Q\2\2\u01e0"+
		"\u01e1\7P\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\5\3\2\2\u01e3~\3\2\2\2\u01e4"+
		"\u01e5\7R\2\2\u01e5\u01e6\7T\2\2\u01e6\u01e7\7U\2\2\u01e7\u01e8\7C\2\2"+
		"\u01e8\u01e9\3\2\2\2\u01e9\u01ea\5\3\2\2\u01ea\u0080\3\2\2\2\u01eb\u01ec"+
		"\7R\2\2\u01ec\u01ed\7T\2\2\u01ed\u01ee\7U\2\2\u01ee\u01ef\7C\2\2\u01ef"+
		"\u01f0\7C\2\2\u01f0\u01f1\7p\2\2\u01f1\u01f2\7f\2\2\u01f2\u01f3\3\2\2"+
		"\2\u01f3\u01f4\5\3\2\2\u01f4\u0082\3\2\2\2\u01f5\u01f6\7R\2\2\u01f6\u01f7"+
		"\7T\2\2\u01f7\u01f8\7U\2\2\u01f8\u01f9\7Q\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fb\5\3\2\2\u01fb\u0084\3\2\2\2\u01fc\u01fd\7R\2\2\u01fd\u01fe\7T\2"+
		"\2\u01fe\u01ff\7U\2\2\u01ff\u0200\7K\2\2\u0200\u0201\3\2\2\2\u0201\u0202"+
		"\5\3\2\2\u0202\u0086\3\2\2\2\u0203\u0204\7J\2\2\u0204\u0205\7G\2\2\u0205"+
		"\u0206\7T\2\2\u0206\u0207\7G\2\2\u0207\u0208\3\2\2\2\u0208\u0209\5\3\2"+
		"\2\u0209\u0088\3\2\2\2\u020a\u020b\7C\2\2\u020b\u020c\7P\2\2\u020c\u020d"+
		"\7F\2\2\u020d\u020e\7H\2\2\u020e\u020f\7N\2\2\u020f\u0210\7C\2\2\u0210"+
		"\u0211\7I\2\2\u0211\u0212\7U\2\2\u0212\u0213\3\2\2\2\u0213\u0214\5\3\2"+
		"\2\u0214\u008a\3\2\2\2\u0215\u0216\7Q\2\2\u0216\u0217\7T\2\2\u0217\u0218"+
		"\7H\2\2\u0218\u0219\7N\2\2\u0219\u021a\7C\2\2\u021a\u021b\7I\2\2\u021b"+
		"\u021c\7U\2\2\u021c\u021d\3\2\2\2\u021d\u021e\5\3\2\2\u021e\u008c\3\2"+
		"\2\2\u021f\u0220\7C\2\2\u0220\u0221\7P\2\2\u0221\u0222\7F\2\2\u0222\u0223"+
		"\7R\2\2\u0223\u0224\7T\2\2\u0224\u0225\7Q\2\2\u0225\u0226\7R\2\2\u0226"+
		"\u0227\7G\2\2\u0227\u0228\7T\2\2\u0228\u0229\7V\2\2\u0229\u022a\7K\2\2"+
		"\u022a\u022b\7G\2\2\u022b\u022c\7U\2\2\u022c\u022d\3\2\2\2\u022d\u022e"+
		"\5\3\2\2\u022e\u008e\3\2\2\2\u022f\u0230\7Q\2\2\u0230\u0231\7T\2\2\u0231"+
		"\u0232\7R\2\2\u0232\u0233\7T\2\2\u0233\u0234\7Q\2\2\u0234\u0235\7R\2\2"+
		"\u0235\u0236\7G\2\2\u0236\u0237\7T\2\2\u0237\u0238\7V\2\2\u0238\u0239"+
		"\7K\2\2\u0239\u023a\7G\2\2\u023a\u023b\7U\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u023d\5\3\2\2\u023d\u0090\3\2\2\2\u023e\u023f\7H\2\2\u023f\u0240\7N\2"+
		"\2\u0240\u0241\7C\2\2\u0241\u0242\7I\2\2\u0242\u0243\7X\2\2\u0243\u0244"+
		"\7C\2\2\u0244\u0245\7N\2\2\u0245\u0246\7W\2\2\u0246\u0247\7G\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0249\5\3\2\2\u0249\u0092\3\2\2\2\u024a\u024b\7J"+
		"\2\2\u024b\u024c\7C\2\2\u024c\u024d\7X\2\2\u024d\u024e\7G\2\2\u024e\u024f"+
		"\7K\2\2\u024f\u0250\7V\2\2\u0250\u0251\7G\2\2\u0251\u0252\7O\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0254\5\3\2\2\u0254\u0094\3\2\2\2\u0255\u0256\7J"+
		"\2\2\u0256\u0257\7C\2\2\u0257\u0258\7X\2\2\u0258\u0259\7G\2\2\u0259\u025a"+
		"\7K\2\2\u025a\u025b\7V\2\2\u025b\u025c\7G\2\2\u025c\u025d\7O\2\2\u025d"+
		"\u025e\7U\2\2\u025e\u025f\3\2\2\2\u025f\u0260\5\3\2\2\u0260\u0096\3\2"+
		"\2\2\u0261\u0262\7G\2\2\u0262\u0263\7S\2\2\u0263\u0264\7W\2\2\u0264\u0265"+
		"\7C\2\2\u0265\u0266\7N\2\2\u0266\u0267\7U\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u0269\5\3\2\2\u0269\u0098\3\2\2\2\u026a\u026b\7I\2\2\u026b\u026c\7V\2"+
		"\2\u026c\u026d\3\2\2\2\u026d\u026e\5\3\2\2\u026e\u009a\3\2\2\2\u026f\u0270"+
		"\7N\2\2\u0270\u0271\7V\2\2\u0271\u0272\3\2\2\2\u0272\u0273\5\3\2\2\u0273"+
		"\u009c\3\2\2\2\u0274\u0275\7V\2\2\u0275\u0276\7G\2\2\u0276\u0277\7N\2"+
		"\2\u0277\u0278\7N\2\2\u0278\u0279\3\2\2\2\u0279\u027a\5\3\2\2\u027a\u009e"+
		"\3\2\2\2\u027b\u027c\7I\2\2\u027c\u027d\7Q\2\2\u027d\u027e\7V\2\2\u027e"+
		"\u027f\7Q\2\2\u027f\u0280\3\2\2\2\u0280\u0281\5\3\2\2\u0281\u00a0\3\2"+
		"\2\2\u0282\u0283\7U\2\2\u0283\u0284\7G\2\2\u0284\u0285\7V\2\2\u0285\u0286"+
		"\7H\2\2\u0286\u0287\7N\2\2\u0287\u0288\7C\2\2\u0288\u0289\7I\2\2\u0289"+
		"\u028a\3\2\2\2\u028a\u028b\5\3\2\2\u028b\u00a2\3\2\2\2\u028c\u028d\7T"+
		"\2\2\u028d\u028e\7G\2\2\u028e\u028f\7O\2\2\u028f\u0290\7H\2\2\u0290\u0291"+
		"\7N\2\2\u0291\u0292\7C\2\2\u0292\u0293\7I\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0295\5\3\2\2\u0295\u00a4\3\2\2\2\u0296\u0297\7V\2\2\u0297\u0298\7C\2"+
		"\2\u0298\u0299\7M\2\2\u0299\u029a\7G\2\2\u029a\u029b\3\2\2\2\u029b\u029c"+
		"\5\3\2\2\u029c\u00a6\3\2\2\2\u029d\u029e\7R\2\2\u029e\u029f\7N\2\2\u029f"+
		"\u02a0\7C\2\2\u02a0\u02a1\7E\2\2\u02a1\u02a2\7G\2\2\u02a2\u02a3\3\2\2"+
		"\2\u02a3\u02a4\5\3\2\2\u02a4\u00a8\3\2\2\2\u02a5\u02a6\7U\2\2\u02a6\u02a7"+
		"\7G\2\2\u02a7\u02a8\7V\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\5\3\2\2\u02aa"+
		"\u00aa\3\2\2\2\b\2\u00fc\u0101\u0106\u010b\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}