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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2n\u037e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\6#\u014a\n#\r#\16#\u014b\3$\6$\u014f\n$\r$\16$\u0150"+
		"\3%\6%\u0154\n%\r%\16%\u0155\3&\6&\u0159\n&\r&\16&\u015a\3&\3&\3\'\3\'"+
		"\7\'\u0161\n\'\f\'\16\'\u0164\13\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38"+
		"\38\39\39\39\39\39\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>"+
		"\3>\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D"+
		"\3D\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J"+
		"\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T"+
		"\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3b\3"+
		"b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\3"+
		"d\3d\3d\3e\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3g\3g\3g\3g\3g\3"+
		"g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3i\3i\3i\3i\3i\3j\3"+
		"j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3"+
		"k\3k\3k\3k\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3m\3m\3m\3m\3m\3m\3m\3m\3"+
		"m\3m\3m\2\2n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F"+
		"\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1"+
		"Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5"+
		"d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5l\u00d7m\u00d9"+
		"n\3\2\7\4\2C\\c|\3\2\62;\5\2\62;C\\c|\5\2\13\f\17\17\"\"\3\2$$\2\u0382"+
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
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd"+
		"\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2"+
		"\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\3\u00db\3\2\2\2\5\u00dd\3\2\2\2\7\u00df"+
		"\3\2\2\2\t\u00e1\3\2\2\2\13\u00e3\3\2\2\2\r\u00e5\3\2\2\2\17\u00e7\3\2"+
		"\2\2\21\u00e9\3\2\2\2\23\u00eb\3\2\2\2\25\u00ed\3\2\2\2\27\u00ef\3\2\2"+
		"\2\31\u00f1\3\2\2\2\33\u00f3\3\2\2\2\35\u00f5\3\2\2\2\37\u00f7\3\2\2\2"+
		"!\u00f9\3\2\2\2#\u00fb\3\2\2\2%\u00fd\3\2\2\2\'\u00ff\3\2\2\2)\u0101\3"+
		"\2\2\2+\u0106\3\2\2\2-\u010c\3\2\2\2/\u010f\3\2\2\2\61\u0112\3\2\2\2\63"+
		"\u0114\3\2\2\2\65\u011b\3\2\2\2\67\u0120\3\2\2\29\u0124\3\2\2\2;\u012a"+
		"\3\2\2\2=\u012f\3\2\2\2?\u0132\3\2\2\2A\u0135\3\2\2\2C\u013b\3\2\2\2E"+
		"\u0149\3\2\2\2G\u014e\3\2\2\2I\u0153\3\2\2\2K\u0158\3\2\2\2M\u015e\3\2"+
		"\2\2O\u0167\3\2\2\2Q\u016b\3\2\2\2S\u0175\3\2\2\2U\u017d\3\2\2\2W\u0187"+
		"\3\2\2\2Y\u018f\3\2\2\2[\u0196\3\2\2\2]\u019b\3\2\2\2_\u01a6\3\2\2\2a"+
		"\u01b5\3\2\2\2c\u01bc\3\2\2\2e\u01c3\3\2\2\2g\u01cd\3\2\2\2i\u01d5\3\2"+
		"\2\2k\u01dc\3\2\2\2m\u01e9\3\2\2\2o\u01f0\3\2\2\2q\u01f9\3\2\2\2s\u0201"+
		"\3\2\2\2u\u0204\3\2\2\2w\u0207\3\2\2\2y\u020a\3\2\2\2{\u020d\3\2\2\2}"+
		"\u0210\3\2\2\2\177\u0213\3\2\2\2\u0081\u0217\3\2\2\2\u0083\u021b\3\2\2"+
		"\2\u0085\u021f\3\2\2\2\u0087\u0223\3\2\2\2\u0089\u0227\3\2\2\2\u008b\u022b"+
		"\3\2\2\2\u008d\u022f\3\2\2\2\u008f\u0233\3\2\2\2\u0091\u0237\3\2\2\2\u0093"+
		"\u023b\3\2\2\2\u0095\u023f\3\2\2\2\u0097\u0243\3\2\2\2\u0099\u024c\3\2"+
		"\2\2\u009b\u0254\3\2\2\2\u009d\u025a\3\2\2\2\u009f\u0260\3\2\2\2\u00a1"+
		"\u0266\3\2\2\2\u00a3\u026d\3\2\2\2\u00a5\u0277\3\2\2\2\u00a7\u027e\3\2"+
		"\2\2\u00a9\u0285\3\2\2\2\u00ab\u028c\3\2\2\2\u00ad\u0296\3\2\2\2\u00af"+
		"\u02a1\3\2\2\2\u00b1\u02ab\3\2\2\2\u00b3\u02bb\3\2\2\2\u00b5\u02ca\3\2"+
		"\2\2\u00b7\u02d6\3\2\2\2\u00b9\u02e1\3\2\2\2\u00bb\u02ed\3\2\2\2\u00bd"+
		"\u02f6\3\2\2\2\u00bf\u02fb\3\2\2\2\u00c1\u0300\3\2\2\2\u00c3\u0307\3\2"+
		"\2\2\u00c5\u030e\3\2\2\2\u00c7\u0318\3\2\2\2\u00c9\u0322\3\2\2\2\u00cb"+
		"\u0329\3\2\2\2\u00cd\u0331\3\2\2\2\u00cf\u033a\3\2\2\2\u00d1\u0343\3\2"+
		"\2\2\u00d3\u034c\3\2\2\2\u00d5\u035a\3\2\2\2\u00d7\u0368\3\2\2\2\u00d9"+
		"\u0373\3\2\2\2\u00db\u00dc\7<\2\2\u00dc\4\3\2\2\2\u00dd\u00de\7=\2\2\u00de"+
		"\6\3\2\2\2\u00df\u00e0\7]\2\2\u00e0\b\3\2\2\2\u00e1\u00e2\7_\2\2\u00e2"+
		"\n\3\2\2\2\u00e3\u00e4\7>\2\2\u00e4\f\3\2\2\2\u00e5\u00e6\7@\2\2\u00e6"+
		"\16\3\2\2\2\u00e7\u00e8\7}\2\2\u00e8\20\3\2\2\2\u00e9\u00ea\7\177\2\2"+
		"\u00ea\22\3\2\2\2\u00eb\u00ec\7*\2\2\u00ec\24\3\2\2\2\u00ed\u00ee\7+\2"+
		"\2\u00ee\26\3\2\2\2\u00ef\u00f0\7$\2\2\u00f0\30\3\2\2\2\u00f1\u00f2\7"+
		"a\2\2\u00f2\32\3\2\2\2\u00f3\u00f4\7.\2\2\u00f4\34\3\2\2\2\u00f5\u00f6"+
		"\7\60\2\2\u00f6\36\3\2\2\2\u00f7\u00f8\7-\2\2\u00f8 \3\2\2\2\u00f9\u00fa"+
		"\7/\2\2\u00fa\"\3\2\2\2\u00fb\u00fc\7~\2\2\u00fc$\3\2\2\2\u00fd\u00fe"+
		"\7(\2\2\u00fe&\3\2\2\2\u00ff\u0100\7?\2\2\u0100(\3\2\2\2\u0101\u0102\7"+
		"V\2\2\u0102\u0103\7T\2\2\u0103\u0104\7W\2\2\u0104\u0105\7G\2\2\u0105*"+
		"\3\2\2\2\u0106\u0107\7H\2\2\u0107\u0108\7C\2\2\u0108\u0109\7N\2\2\u0109"+
		"\u010a\7U\2\2\u010a\u010b\7G\2\2\u010b,\3\2\2\2\u010c\u010d\5%\23\2\u010d"+
		"\u010e\5%\23\2\u010e.\3\2\2\2\u010f\u0110\5#\22\2\u0110\u0111\5#\22\2"+
		"\u0111\60\3\2\2\2\u0112\u0113\7#\2\2\u0113\62\3\2\2\2\u0114\u0115\7J\2"+
		"\2\u0115\u0116\7K\2\2\u0116\u0117\7F\2\2\u0117\u0118\7F\2\2\u0118\u0119"+
		"\7G\2\2\u0119\u011a\7P\2\2\u011a\64\3\2\2\2\u011b\u011c\7E\2\2\u011c\u011d"+
		"\7Q\2\2\u011d\u011e\7P\2\2\u011e\u011f\7F\2\2\u011f\66\3\2\2\2\u0120\u0121"+
		"\7G\2\2\u0121\u0122\7H\2\2\u0122\u0123\7H\2\2\u01238\3\2\2\2\u0124\u0125"+
		"\7S\2\2\u0125\u0126\7W\2\2\u0126\u0127\7G\2\2\u0127\u0128\7T\2\2\u0128"+
		"\u0129\7[\2\2\u0129:\3\2\2\2\u012a\u012b\7G\2\2\u012b\u012c\7N\2\2\u012c"+
		"\u012d\7U\2\2\u012d\u012e\7G\2\2\u012e<\3\2\2\2\u012f\u0130\7K\2\2\u0130"+
		"\u0131\7P\2\2\u0131>\3\2\2\2\u0132\u0133\7Q\2\2\u0133\u0134\7P\2\2\u0134"+
		"@\3\2\2\2\u0135\u0136\7W\2\2\u0136\u0137\7P\2\2\u0137\u0138\7F\2\2\u0138"+
		"\u0139\7G\2\2\u0139\u013a\7T\2\2\u013aB\3\2\2\2\u013b\u013c\7D\2\2\u013c"+
		"\u013d\7N\2\2\u013d\u013e\7Q\2\2\u013e\u013f\7E\2\2\u013f\u0140\7M\2\2"+
		"\u0140\u0141\7O\2\2\u0141\u0142\7G\2\2\u0142\u0143\7U\2\2\u0143\u0144"+
		"\7U\2\2\u0144\u0145\7C\2\2\u0145\u0146\7I\2\2\u0146\u0147\7G\2\2\u0147"+
		"D\3\2\2\2\u0148\u014a\t\2\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014cF\3\2\2\2\u014d\u014f\t"+
		"\3\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151H\3\2\2\2\u0152\u0154\t\4\2\2\u0153\u0152\3\2\2\2"+
		"\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156J\3"+
		"\2\2\2\u0157\u0159\t\5\2\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\b&"+
		"\2\2\u015dL\3\2\2\2\u015e\u0162\5\27\f\2\u015f\u0161\n\6\2\2\u0160\u015f"+
		"\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\5\27\f\2\u0166N\3\2\2\2"+
		"\u0167\u0168\5\13\6\2\u0168\u0169\5I%\2\u0169\u016a\5\r\7\2\u016aP\3\2"+
		"\2\2\u016b\u016c\5\7\4\2\u016c\u016d\7q\2\2\u016d\u016e\7d\2\2\u016e\u016f"+
		"\7l\2\2\u016f\u0170\7g\2\2\u0170\u0171\7e\2\2\u0171\u0172\7v\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0174\5\t\5\2\u0174R\3\2\2\2\u0175\u0176\5\7\4\2"+
		"\u0176\u0177\7t\2\2\u0177\u0178\7q\2\2\u0178\u0179\7q\2\2\u0179\u017a"+
		"\7o\2\2\u017a\u017b\3\2\2\2\u017b\u017c\5\t\5\2\u017cT\3\2\2\2\u017d\u017e"+
		"\5\7\4\2\u017e\u017f\7c\2\2\u017f\u0180\7e\2\2\u0180\u0181\7v\2\2\u0181"+
		"\u0182\7k\2\2\u0182\u0183\7q\2\2\u0183\u0184\7p\2\2\u0184\u0185\3\2\2"+
		"\2\u0185\u0186\5\t\5\2\u0186V\3\2\2\2\u0187\u0188\5\7\4\2\u0188\u0189"+
		"\7h\2\2\u0189\u018a\7n\2\2\u018a\u018b\7c\2\2\u018b\u018c\7i\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018e\5\t\5\2\u018eX\3\2\2\2\u018f\u0190\5\7\4\2"+
		"\u0190\u0191\7g\2\2\u0191\u0192\7p\2\2\u0192\u0193\7f\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0195\5\t\5\2\u0195Z\3\2\2\2\u0196\u0197\7K\2\2\u0197\u0198"+
		"\7F\2\2\u0198\u0199\3\2\2\2\u0199\u019a\5\3\2\2\u019a\\\3\2\2\2\u019b"+
		"\u019c\7N\2\2\u019c\u019d\7Q\2\2\u019d\u019e\7E\2\2\u019e\u019f\7C\2\2"+
		"\u019f\u01a0\7V\2\2\u01a0\u01a1\7K\2\2\u01a1\u01a2\7Q\2\2\u01a2\u01a3"+
		"\7P\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\5\3\2\2\u01a5^\3\2\2\2\u01a6\u01a7"+
		"\7N\2\2\u01a7\u01a8\7Q\2\2\u01a8\u01a9\7E\2\2\u01a9\u01aa\7C\2\2\u01aa"+
		"\u01ab\7V\2\2\u01ab\u01ac\7K\2\2\u01ac\u01ad\7Q\2\2\u01ad\u01ae\7P\2\2"+
		"\u01ae\u01af\7V\2\2\u01af\u01b0\7[\2\2\u01b0\u01b1\7R\2\2\u01b1\u01b2"+
		"\7G\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\5\3\2\2\u01b4`\3\2\2\2\u01b5\u01b6"+
		"\7P\2\2\u01b6\u01b7\7C\2\2\u01b7\u01b8\7O\2\2\u01b8\u01b9\7G\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bb\5\3\2\2\u01bbb\3\2\2\2\u01bc\u01bd\7F\2\2\u01bd"+
		"\u01be\7G\2\2\u01be\u01bf\7U\2\2\u01bf\u01c0\7E\2\2\u01c0\u01c1\3\2\2"+
		"\2\u01c1\u01c2\5\3\2\2\u01c2d\3\2\2\2\u01c3\u01c4\7C\2\2\u01c4\u01c5\7"+
		"N\2\2\u01c5\u01c6\7V\2\2\u01c6\u01c7\7F\2\2\u01c7\u01c8\7G\2\2\u01c8\u01c9"+
		"\7U\2\2\u01c9\u01ca\7E\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\5\3\2\2\u01cc"+
		"f\3\2\2\2\u01cd\u01ce\7E\2\2\u01ce\u01cf\7Q\2\2\u01cf\u01d0\7P\2\2\u01d0"+
		"\u01d1\7F\2\2\u01d1\u01d2\7U\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\5\3\2"+
		"\2\u01d4h\3\2\2\2\u01d5\u01d6\7U\2\2\u01d6\u01d7\7[\2\2\u01d7\u01d8\7"+
		"P\2\2\u01d8\u01d9\7U\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\5\3\2\2\u01db"+
		"j\3\2\2\2\u01dc\u01dd\7R\2\2\u01dd\u01de\7T\2\2\u01de\u01df\7Q\2\2\u01df"+
		"\u01e0\7R\2\2\u01e0\u01e1\7G\2\2\u01e1\u01e2\7T\2\2\u01e2\u01e3\7V\2\2"+
		"\u01e3\u01e4\7K\2\2\u01e4\u01e5\7G\2\2\u01e5\u01e6\7U\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7\u01e8\5\3\2\2\u01e8l\3\2\2\2\u01e9\u01ea\7H\2\2\u01ea\u01eb"+
		"\7N\2\2\u01eb\u01ec\7C\2\2\u01ec\u01ed\7I\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01ef\5\3\2\2\u01efn\3\2\2\2\u01f0\u01f1\7X\2\2\u01f1\u01f2\7C\2\2\u01f2"+
		"\u01f3\7N\2\2\u01f3\u01f4\7W\2\2\u01f4\u01f5\7G\2\2\u01f5\u01f6\7U\2\2"+
		"\u01f6\u01f7\3\2\2\2\u01f7\u01f8\5\3\2\2\u01f8p\3\2\2\2\u01f9\u01fa\7"+
		"X\2\2\u01fa\u01fb\7C\2\2\u01fb\u01fc\7N\2\2\u01fc\u01fd\7W\2\2\u01fd\u01fe"+
		"\7G\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\5\3\2\2\u0200r\3\2\2\2\u0201\u0202"+
		"\7P\2\2\u0202\u0203\5\3\2\2\u0203t\3\2\2\2\u0204\u0205\7U\2\2\u0205\u0206"+
		"\5\3\2\2\u0206v\3\2\2\2\u0207\u0208\7G\2\2\u0208\u0209\5\3\2\2\u0209x"+
		"\3\2\2\2\u020a\u020b\7Y\2\2\u020b\u020c\5\3\2\2\u020cz\3\2\2\2\u020d\u020e"+
		"\7W\2\2\u020e\u020f\5\3\2\2\u020f|\3\2\2\2\u0210\u0211\7F\2\2\u0211\u0212"+
		"\5\3\2\2\u0212~\3\2\2\2\u0213\u0214\7P\2\2\u0214\u0215\5\65\33\2\u0215"+
		"\u0216\5\3\2\2\u0216\u0080\3\2\2\2\u0217\u0218\7U\2\2\u0218\u0219\5\65"+
		"\33\2\u0219\u021a\5\3\2\2\u021a\u0082\3\2\2\2\u021b\u021c\7G\2\2\u021c"+
		"\u021d\5\65\33\2\u021d\u021e\5\3\2\2\u021e\u0084\3\2\2\2\u021f\u0220\7"+
		"Y\2\2\u0220\u0221\5\65\33\2\u0221\u0222\5\3\2\2\u0222\u0086\3\2\2\2\u0223"+
		"\u0224\7W\2\2\u0224\u0225\5\65\33\2\u0225\u0226\5\3\2\2\u0226\u0088\3"+
		"\2\2\2\u0227\u0228\7F\2\2\u0228\u0229\5\65\33\2\u0229\u022a\5\3\2\2\u022a"+
		"\u008a\3\2\2\2\u022b\u022c\7P\2\2\u022c\u022d\5C\"\2\u022d\u022e\5\3\2"+
		"\2\u022e\u008c\3\2\2\2\u022f\u0230\7U\2\2\u0230\u0231\5C\"\2\u0231\u0232"+
		"\5\3\2\2\u0232\u008e\3\2\2\2\u0233\u0234\7G\2\2\u0234\u0235\5C\"\2\u0235"+
		"\u0236\5\3\2\2\u0236\u0090\3\2\2\2\u0237\u0238\7Y\2\2\u0238\u0239\5C\""+
		"\2\u0239\u023a\5\3\2\2\u023a\u0092\3\2\2\2\u023b\u023c\7W\2\2\u023c\u023d"+
		"\5C\"\2\u023d\u023e\5\3\2\2\u023e\u0094\3\2\2\2\u023f\u0240\7F\2\2\u0240"+
		"\u0241\5C\"\2\u0241\u0242\5\3\2\2\u0242\u0096\3\2\2\2\u0243\u0244\7C\2"+
		"\2\u0244\u0245\7E\2\2\u0245\u0246\7V\2\2\u0246\u0247\7K\2\2\u0247\u0248"+
		"\7Q\2\2\u0248\u0249\7P\2\2\u0249\u024a\3\2\2\2\u024a\u024b\5\3\2\2\u024b"+
		"\u0098\3\2\2\2\u024c\u024d\7E\2\2\u024d\u024e\7J\2\2\u024e\u024f\7G\2"+
		"\2\u024f\u0250\7E\2\2\u0250\u0251\7M\2\2\u0251\u0252\3\2\2\2\u0252\u0253"+
		"\5\3\2\2\u0253\u009a\3\2\2\2\u0254\u0255\7F\2\2\u0255\u0256\7G\2\2\u0256"+
		"\u0257\7V\2\2\u0257\u0258\3\2\2\2\u0258\u0259\5\3\2\2\u0259\u009c\3\2"+
		"\2\2\u025a\u025b\7C\2\2\u025b\u025c\7T\2\2\u025c\u025d\7G\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u025f\5\3\2\2\u025f\u009e\3\2\2\2\u0260\u0261\7W\2\2\u0261"+
		"\u0262\7U\2\2\u0262\u0263\7G\2\2\u0263\u0264\3\2\2\2\u0264\u0265\5\3\2"+
		"\2\u0265\u00a0\3\2\2\2\u0266\u0267\7R\2\2\u0267\u0268\7T\2\2\u0268\u0269"+
		"\7U\2\2\u0269\u026a\7C\2\2\u026a\u026b\3\2\2\2\u026b\u026c\5\3\2\2\u026c"+
		"\u00a2\3\2\2\2\u026d\u026e\7R\2\2\u026e\u026f\7T\2\2\u026f\u0270\7U\2"+
		"\2\u0270\u0271\7C\2\2\u0271\u0272\7C\2\2\u0272\u0273\7P\2\2\u0273\u0274"+
		"\7F\2\2\u0274\u0275\3\2\2\2\u0275\u0276\5\3\2\2\u0276\u00a4\3\2\2\2\u0277"+
		"\u0278\7R\2\2\u0278\u0279\7T\2\2\u0279\u027a\7U\2\2\u027a\u027b\7Q\2\2"+
		"\u027b\u027c\3\2\2\2\u027c\u027d\5\3\2\2\u027d\u00a6\3\2\2\2\u027e\u027f"+
		"\7R\2\2\u027f\u0280\7T\2\2\u0280\u0281\7U\2\2\u0281\u0282\7K\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u0284\5\3\2\2\u0284\u00a8\3\2\2\2\u0285\u0286\7J"+
		"\2\2\u0286\u0287\7G\2\2\u0287\u0288\7T\2\2\u0288\u0289\7G\2\2\u0289\u028a"+
		"\3\2\2\2\u028a\u028b\5\3\2\2\u028b\u00aa\3\2\2\2\u028c\u028d\7K\2\2\u028d"+
		"\u028e\7P\2\2\u028e\u028f\7U\2\2\u028f\u0290\7E\2\2\u0290\u0291\7Q\2\2"+
		"\u0291\u0292\7R\2\2\u0292\u0293\7G\2\2\u0293\u0294\3\2\2\2\u0294\u0295"+
		"\5\3\2\2\u0295\u00ac\3\2\2\2\u0296\u0297\7C\2\2\u0297\u0298\7P\2\2\u0298"+
		"\u0299\7F\2\2\u0299\u029a\7H\2\2\u029a\u029b\7N\2\2\u029b\u029c\7C\2\2"+
		"\u029c\u029d\7I\2\2\u029d\u029e\7U\2\2\u029e\u029f\3\2\2\2\u029f\u02a0"+
		"\5\3\2\2\u02a0\u00ae\3\2\2\2\u02a1\u02a2\7Q\2\2\u02a2\u02a3\7T\2\2\u02a3"+
		"\u02a4\7H\2\2\u02a4\u02a5\7N\2\2\u02a5\u02a6\7C\2\2\u02a6\u02a7\7I\2\2"+
		"\u02a7\u02a8\7U\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\5\3\2\2\u02aa\u00b0"+
		"\3\2\2\2\u02ab\u02ac\7C\2\2\u02ac\u02ad\7P\2\2\u02ad\u02ae\7F\2\2\u02ae"+
		"\u02af\7R\2\2\u02af\u02b0\7T\2\2\u02b0\u02b1\7Q\2\2\u02b1\u02b2\7R\2\2"+
		"\u02b2\u02b3\7G\2\2\u02b3\u02b4\7T\2\2\u02b4\u02b5\7V\2\2\u02b5\u02b6"+
		"\7K\2\2\u02b6\u02b7\7G\2\2\u02b7\u02b8\7U\2\2\u02b8\u02b9\3\2\2\2\u02b9"+
		"\u02ba\5\3\2\2\u02ba\u00b2\3\2\2\2\u02bb\u02bc\7Q\2\2\u02bc\u02bd\7T\2"+
		"\2\u02bd\u02be\7R\2\2\u02be\u02bf\7T\2\2\u02bf\u02c0\7Q\2\2\u02c0\u02c1"+
		"\7R\2\2\u02c1\u02c2\7G\2\2\u02c2\u02c3\7T\2\2\u02c3\u02c4\7V\2\2\u02c4"+
		"\u02c5\7K\2\2\u02c5\u02c6\7G\2\2\u02c6\u02c7\7U\2\2\u02c7\u02c8\3\2\2"+
		"\2\u02c8\u02c9\5\3\2\2\u02c9\u00b4\3\2\2\2\u02ca\u02cb\7H\2\2\u02cb\u02cc"+
		"\7N\2\2\u02cc\u02cd\7C\2\2\u02cd\u02ce\7I\2\2\u02ce\u02cf\7X\2\2\u02cf"+
		"\u02d0\7C\2\2\u02d0\u02d1\7N\2\2\u02d1\u02d2\7W\2\2\u02d2\u02d3\7G\2\2"+
		"\u02d3\u02d4\3\2\2\2\u02d4\u02d5\5\3\2\2\u02d5\u00b6\3\2\2\2\u02d6\u02d7"+
		"\7J\2\2\u02d7\u02d8\7C\2\2\u02d8\u02d9\7X\2\2\u02d9\u02da\7G\2\2\u02da"+
		"\u02db\7K\2\2\u02db\u02dc\7V\2\2\u02dc\u02dd\7G\2\2\u02dd\u02de\7O\2\2"+
		"\u02de\u02df\3\2\2\2\u02df\u02e0\5\3\2\2\u02e0\u00b8\3\2\2\2\u02e1\u02e2"+
		"\7J\2\2\u02e2\u02e3\7C\2\2\u02e3\u02e4\7X\2\2\u02e4\u02e5\7G\2\2\u02e5"+
		"\u02e6\7K\2\2\u02e6\u02e7\7V\2\2\u02e7\u02e8\7G\2\2\u02e8\u02e9\7O\2\2"+
		"\u02e9\u02ea\7U\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\5\3\2\2\u02ec\u00ba"+
		"\3\2\2\2\u02ed\u02ee\7G\2\2\u02ee\u02ef\7S\2\2\u02ef\u02f0\7W\2\2\u02f0"+
		"\u02f1\7C\2\2\u02f1\u02f2\7N\2\2\u02f2\u02f3\7U\2\2\u02f3\u02f4\3\2\2"+
		"\2\u02f4\u02f5\5\3\2\2\u02f5\u00bc\3\2\2\2\u02f6\u02f7\7I\2\2\u02f7\u02f8"+
		"\7V\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\5\3\2\2\u02fa\u00be\3\2\2\2\u02fb"+
		"\u02fc\7N\2\2\u02fc\u02fd\7V\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\5\3\2"+
		"\2\u02ff\u00c0\3\2\2\2\u0300\u0301\7V\2\2\u0301\u0302\7G\2\2\u0302\u0303"+
		"\7N\2\2\u0303\u0304\7N\2\2\u0304\u0305\3\2\2\2\u0305\u0306\5\3\2\2\u0306"+
		"\u00c2\3\2\2\2\u0307\u0308\7I\2\2\u0308\u0309\7Q\2\2\u0309\u030a\7V\2"+
		"\2\u030a\u030b\7Q\2\2\u030b\u030c\3\2\2\2\u030c\u030d\5\3\2\2\u030d\u00c4"+
		"\3\2\2\2\u030e\u030f\7U\2\2\u030f\u0310\7G\2\2\u0310\u0311\7V\2\2\u0311"+
		"\u0312\7H\2\2\u0312\u0313\7N\2\2\u0313\u0314\7C\2\2\u0314\u0315\7I\2\2"+
		"\u0315\u0316\3\2\2\2\u0316\u0317\5\3\2\2\u0317\u00c6\3\2\2\2\u0318\u0319"+
		"\7T\2\2\u0319\u031a\7G\2\2\u031a\u031b\7O\2\2\u031b\u031c\7H\2\2\u031c"+
		"\u031d\7N\2\2\u031d\u031e\7C\2\2\u031e\u031f\7I\2\2\u031f\u0320\3\2\2"+
		"\2\u0320\u0321\5\3\2\2\u0321\u00c8\3\2\2\2\u0322\u0323\7V\2\2\u0323\u0324"+
		"\7C\2\2\u0324\u0325\7M\2\2\u0325\u0326\7G\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u0328\5\3\2\2\u0328\u00ca\3\2\2\2\u0329\u032a\7R\2\2\u032a\u032b\7N\2"+
		"\2\u032b\u032c\7C\2\2\u032c\u032d\7E\2\2\u032d\u032e\7G\2\2\u032e\u032f"+
		"\3\2\2\2\u032f\u0330\5\3\2\2\u0330\u00cc\3\2\2\2\u0331\u0332\7U\2\2\u0332"+
		"\u0333\7G\2\2\u0333\u0334\7V\2\2\u0334\u0335\7X\2\2\u0335\u0336\7C\2\2"+
		"\u0336\u0337\7T\2\2\u0337\u0338\3\2\2\2\u0338\u0339\5\3\2\2\u0339\u00ce"+
		"\3\2\2\2\u033a\u033b\7K\2\2\u033b\u033c\7P\2\2\u033c\u033d\7E\2\2\u033d"+
		"\u033e\7X\2\2\u033e\u033f\7C\2\2\u033f\u0340\7T\2\2\u0340\u0341\3\2\2"+
		"\2\u0341\u0342\5\3\2\2\u0342\u00d0\3\2\2\2\u0343\u0344\7F\2\2\u0344\u0345"+
		"\7G\2\2\u0345\u0346\7E\2\2\u0346\u0347\7X\2\2\u0347\u0348\7C\2\2\u0348"+
		"\u0349\7T\2\2\u0349\u034a\3\2\2\2\u034a\u034b\5\3\2\2\u034b\u00d2\3\2"+
		"\2\2\u034c\u034d\7C\2\2\u034d\u034e\7F\2\2\u034e\u034f\7F\2\2\u034f\u0350"+
		"\7R\2\2\u0350\u0351\7T\2\2\u0351\u0352\7Q\2\2\u0352\u0353\7R\2\2\u0353"+
		"\u0354\7G\2\2\u0354\u0355\7T\2\2\u0355\u0356\7V\2\2\u0356\u0357\7[\2\2"+
		"\u0357\u0358\3\2\2\2\u0358\u0359\5\3\2\2\u0359\u00d4\3\2\2\2\u035a\u035b"+
		"\7T\2\2\u035b\u035c\7G\2\2\u035c\u035d\7O\2\2\u035d\u035e\7R\2\2\u035e"+
		"\u035f\7T\2\2\u035f\u0360\7Q\2\2\u0360\u0361\7R\2\2\u0361\u0362\7G\2\2"+
		"\u0362\u0363\7T\2\2\u0363\u0364\7V\2\2\u0364\u0365\7[\2\2\u0365\u0366"+
		"\3\2\2\2\u0366\u0367\5\3\2\2\u0367\u00d6\3\2\2\2\u0368\u0369\7C\2\2\u0369"+
		"\u036a\7F\2\2\u036a\u036b\7F\2\2\u036b\u036c\7S\2\2\u036c\u036d\7W\2\2"+
		"\u036d\u036e\7G\2\2\u036e\u036f\7T\2\2\u036f\u0370\7[\2\2\u0370\u0371"+
		"\3\2\2\2\u0371\u0372\5\3\2\2\u0372\u00d8\3\2\2\2\u0373\u0374\7T\2\2\u0374"+
		"\u0375\7G\2\2\u0375\u0376\7O\2\2\u0376\u0377\7S\2\2\u0377\u0378\7W\2\2"+
		"\u0378\u0379\7G\2\2\u0379\u037a\7T\2\2\u037a\u037b\7[\2\2\u037b\u037c"+
		"\3\2\2\2\u037c\u037d\5\3\2\2\u037d\u00da\3\2\2\2\b\2\u014b\u0150\u0155"+
		"\u015a\u0162\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}