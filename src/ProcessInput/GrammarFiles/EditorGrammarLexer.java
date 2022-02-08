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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2d\u0312\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\6!\u012b\n!\r!\16!\u012c"+
		"\3\"\6\"\u0130\n\"\r\"\16\"\u0131\3#\6#\u0135\n#\r#\16#\u0136\3$\6$\u013a"+
		"\n$\r$\16$\u013b\3$\3$\3%\3%\7%\u0142\n%\f%\16%\u0145\13%\3%\3%\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3"+
		"<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3B\3"+
		"B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3"+
		"H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3"+
		"K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3"+
		"N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3"+
		"S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3"+
		"T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3"+
		"V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\3c\2\2d\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3"+
		"S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7"+
		"]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\3\2\7\4\2C\\c|\3\2"+
		"\62;\5\2\62;C\\c|\5\2\13\f\17\17\"\"\3\2$$\2\u0316\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd"+
		"\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2"+
		"\2\3\u00c7\3\2\2\2\5\u00c9\3\2\2\2\7\u00cb\3\2\2\2\t\u00cd\3\2\2\2\13"+
		"\u00cf\3\2\2\2\r\u00d1\3\2\2\2\17\u00d3\3\2\2\2\21\u00d5\3\2\2\2\23\u00d7"+
		"\3\2\2\2\25\u00d9\3\2\2\2\27\u00db\3\2\2\2\31\u00dd\3\2\2\2\33\u00df\3"+
		"\2\2\2\35\u00e1\3\2\2\2\37\u00e3\3\2\2\2!\u00e5\3\2\2\2#\u00e7\3\2\2\2"+
		"%\u00e9\3\2\2\2\'\u00eb\3\2\2\2)\u00ed\3\2\2\2+\u00f2\3\2\2\2-\u00f8\3"+
		"\2\2\2/\u00fb\3\2\2\2\61\u00fe\3\2\2\2\63\u0100\3\2\2\2\65\u0107\3\2\2"+
		"\2\67\u010c\3\2\2\29\u0110\3\2\2\2;\u0113\3\2\2\2=\u0116\3\2\2\2?\u011c"+
		"\3\2\2\2A\u012a\3\2\2\2C\u012f\3\2\2\2E\u0134\3\2\2\2G\u0139\3\2\2\2I"+
		"\u013f\3\2\2\2K\u0148\3\2\2\2M\u014c\3\2\2\2O\u0156\3\2\2\2Q\u015e\3\2"+
		"\2\2S\u0168\3\2\2\2U\u0170\3\2\2\2W\u0175\3\2\2\2Y\u0180\3\2\2\2[\u018f"+
		"\3\2\2\2]\u0196\3\2\2\2_\u019d\3\2\2\2a\u01a7\3\2\2\2c\u01af\3\2\2\2e"+
		"\u01b6\3\2\2\2g\u01c3\3\2\2\2i\u01ca\3\2\2\2k\u01d3\3\2\2\2m\u01db\3\2"+
		"\2\2o\u01de\3\2\2\2q\u01e1\3\2\2\2s\u01e4\3\2\2\2u\u01e7\3\2\2\2w\u01ea"+
		"\3\2\2\2y\u01ed\3\2\2\2{\u01f1\3\2\2\2}\u01f5\3\2\2\2\177\u01f9\3\2\2"+
		"\2\u0081\u01fd\3\2\2\2\u0083\u0201\3\2\2\2\u0085\u0205\3\2\2\2\u0087\u0209"+
		"\3\2\2\2\u0089\u020d\3\2\2\2\u008b\u0211\3\2\2\2\u008d\u0215\3\2\2\2\u008f"+
		"\u0219\3\2\2\2\u0091\u021d\3\2\2\2\u0093\u0226\3\2\2\2\u0095\u022c\3\2"+
		"\2\2\u0097\u0233\3\2\2\2\u0099\u023d\3\2\2\2\u009b\u0244\3\2\2\2\u009d"+
		"\u024b\3\2\2\2\u009f\u0252\3\2\2\2\u00a1\u025c\3\2\2\2\u00a3\u0267\3\2"+
		"\2\2\u00a5\u0271\3\2\2\2\u00a7\u0281\3\2\2\2\u00a9\u0290\3\2\2\2\u00ab"+
		"\u029c\3\2\2\2\u00ad\u02a7\3\2\2\2\u00af\u02b3\3\2\2\2\u00b1\u02bc\3\2"+
		"\2\2\u00b3\u02c1\3\2\2\2\u00b5\u02c6\3\2\2\2\u00b7\u02cd\3\2\2\2\u00b9"+
		"\u02d4\3\2\2\2\u00bb\u02de\3\2\2\2\u00bd\u02e8\3\2\2\2\u00bf\u02ef\3\2"+
		"\2\2\u00c1\u02f7\3\2\2\2\u00c3\u0300\3\2\2\2\u00c5\u0309\3\2\2\2\u00c7"+
		"\u00c8\7<\2\2\u00c8\4\3\2\2\2\u00c9\u00ca\7=\2\2\u00ca\6\3\2\2\2\u00cb"+
		"\u00cc\7]\2\2\u00cc\b\3\2\2\2\u00cd\u00ce\7_\2\2\u00ce\n\3\2\2\2\u00cf"+
		"\u00d0\7>\2\2\u00d0\f\3\2\2\2\u00d1\u00d2\7@\2\2\u00d2\16\3\2\2\2\u00d3"+
		"\u00d4\7}\2\2\u00d4\20\3\2\2\2\u00d5\u00d6\7\177\2\2\u00d6\22\3\2\2\2"+
		"\u00d7\u00d8\7*\2\2\u00d8\24\3\2\2\2\u00d9\u00da\7+\2\2\u00da\26\3\2\2"+
		"\2\u00db\u00dc\7$\2\2\u00dc\30\3\2\2\2\u00dd\u00de\7a\2\2\u00de\32\3\2"+
		"\2\2\u00df\u00e0\7.\2\2\u00e0\34\3\2\2\2\u00e1\u00e2\7\60\2\2\u00e2\36"+
		"\3\2\2\2\u00e3\u00e4\7-\2\2\u00e4 \3\2\2\2\u00e5\u00e6\7/\2\2\u00e6\""+
		"\3\2\2\2\u00e7\u00e8\7~\2\2\u00e8$\3\2\2\2\u00e9\u00ea\7(\2\2\u00ea&\3"+
		"\2\2\2\u00eb\u00ec\7?\2\2\u00ec(\3\2\2\2\u00ed\u00ee\7V\2\2\u00ee\u00ef"+
		"\7T\2\2\u00ef\u00f0\7W\2\2\u00f0\u00f1\7G\2\2\u00f1*\3\2\2\2\u00f2\u00f3"+
		"\7H\2\2\u00f3\u00f4\7C\2\2\u00f4\u00f5\7N\2\2\u00f5\u00f6\7U\2\2\u00f6"+
		"\u00f7\7G\2\2\u00f7,\3\2\2\2\u00f8\u00f9\5%\23\2\u00f9\u00fa\5%\23\2\u00fa"+
		".\3\2\2\2\u00fb\u00fc\5#\22\2\u00fc\u00fd\5#\22\2\u00fd\60\3\2\2\2\u00fe"+
		"\u00ff\7#\2\2\u00ff\62\3\2\2\2\u0100\u0101\7J\2\2\u0101\u0102\7K\2\2\u0102"+
		"\u0103\7F\2\2\u0103\u0104\7F\2\2\u0104\u0105\7G\2\2\u0105\u0106\7P\2\2"+
		"\u0106\64\3\2\2\2\u0107\u0108\7E\2\2\u0108\u0109\7Q\2\2\u0109\u010a\7"+
		"P\2\2\u010a\u010b\7F\2\2\u010b\66\3\2\2\2\u010c\u010d\7G\2\2\u010d\u010e"+
		"\7H\2\2\u010e\u010f\7H\2\2\u010f8\3\2\2\2\u0110\u0111\7K\2\2\u0111\u0112"+
		"\7P\2\2\u0112:\3\2\2\2\u0113\u0114\7Q\2\2\u0114\u0115\7P\2\2\u0115<\3"+
		"\2\2\2\u0116\u0117\7W\2\2\u0117\u0118\7P\2\2\u0118\u0119\7F\2\2\u0119"+
		"\u011a\7G\2\2\u011a\u011b\7T\2\2\u011b>\3\2\2\2\u011c\u011d\7D\2\2\u011d"+
		"\u011e\7N\2\2\u011e\u011f\7Q\2\2\u011f\u0120\7E\2\2\u0120\u0121\7M\2\2"+
		"\u0121\u0122\7O\2\2\u0122\u0123\7G\2\2\u0123\u0124\7U\2\2\u0124\u0125"+
		"\7U\2\2\u0125\u0126\7C\2\2\u0126\u0127\7I\2\2\u0127\u0128\7G\2\2\u0128"+
		"@\3\2\2\2\u0129\u012b\t\2\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2"+
		"\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012dB\3\2\2\2\u012e\u0130\t"+
		"\3\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132D\3\2\2\2\u0133\u0135\t\4\2\2\u0134\u0133\3\2\2\2"+
		"\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137F\3"+
		"\2\2\2\u0138\u013a\t\5\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b$"+
		"\2\2\u013eH\3\2\2\2\u013f\u0143\5\27\f\2\u0140\u0142\n\6\2\2\u0141\u0140"+
		"\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\5\27\f\2\u0147J\3\2\2\2"+
		"\u0148\u0149\5\13\6\2\u0149\u014a\5E#\2\u014a\u014b\5\r\7\2\u014bL\3\2"+
		"\2\2\u014c\u014d\5\7\4\2\u014d\u014e\7q\2\2\u014e\u014f\7d\2\2\u014f\u0150"+
		"\7l\2\2\u0150\u0151\7g\2\2\u0151\u0152\7e\2\2\u0152\u0153\7v\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\5\t\5\2\u0155N\3\2\2\2\u0156\u0157\5\7\4\2"+
		"\u0157\u0158\7t\2\2\u0158\u0159\7q\2\2\u0159\u015a\7q\2\2\u015a\u015b"+
		"\7o\2\2\u015b\u015c\3\2\2\2\u015c\u015d\5\t\5\2\u015dP\3\2\2\2\u015e\u015f"+
		"\5\7\4\2\u015f\u0160\7c\2\2\u0160\u0161\7e\2\2\u0161\u0162\7v\2\2\u0162"+
		"\u0163\7k\2\2\u0163\u0164\7q\2\2\u0164\u0165\7p\2\2\u0165\u0166\3\2\2"+
		"\2\u0166\u0167\5\t\5\2\u0167R\3\2\2\2\u0168\u0169\5\7\4\2\u0169\u016a"+
		"\7h\2\2\u016a\u016b\7n\2\2\u016b\u016c\7c\2\2\u016c\u016d\7i\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\5\t\5\2\u016fT\3\2\2\2\u0170\u0171\7K\2\2\u0171"+
		"\u0172\7F\2\2\u0172\u0173\3\2\2\2\u0173\u0174\5\3\2\2\u0174V\3\2\2\2\u0175"+
		"\u0176\7N\2\2\u0176\u0177\7Q\2\2\u0177\u0178\7E\2\2\u0178\u0179\7C\2\2"+
		"\u0179\u017a\7V\2\2\u017a\u017b\7K\2\2\u017b\u017c\7Q\2\2\u017c\u017d"+
		"\7P\2\2\u017d\u017e\3\2\2\2\u017e\u017f\5\3\2\2\u017fX\3\2\2\2\u0180\u0181"+
		"\7N\2\2\u0181\u0182\7Q\2\2\u0182\u0183\7E\2\2\u0183\u0184\7C\2\2\u0184"+
		"\u0185\7V\2\2\u0185\u0186\7K\2\2\u0186\u0187\7Q\2\2\u0187\u0188\7P\2\2"+
		"\u0188\u0189\7V\2\2\u0189\u018a\7[\2\2\u018a\u018b\7R\2\2\u018b\u018c"+
		"\7G\2\2\u018c\u018d\3\2\2\2\u018d\u018e\5\3\2\2\u018eZ\3\2\2\2\u018f\u0190"+
		"\7P\2\2\u0190\u0191\7C\2\2\u0191\u0192\7O\2\2\u0192\u0193\7G\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\5\3\2\2\u0195\\\3\2\2\2\u0196\u0197\7F\2\2"+
		"\u0197\u0198\7G\2\2\u0198\u0199\7U\2\2\u0199\u019a\7E\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u019c\5\3\2\2\u019c^\3\2\2\2\u019d\u019e\7C\2\2\u019e\u019f"+
		"\7N\2\2\u019f\u01a0\7V\2\2\u01a0\u01a1\7F\2\2\u01a1\u01a2\7G\2\2\u01a2"+
		"\u01a3\7U\2\2\u01a3\u01a4\7E\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\5\3\2"+
		"\2\u01a6`\3\2\2\2\u01a7\u01a8\7E\2\2\u01a8\u01a9\7Q\2\2\u01a9\u01aa\7"+
		"P\2\2\u01aa\u01ab\7F\2\2\u01ab\u01ac\7U\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ae\5\3\2\2\u01aeb\3\2\2\2\u01af\u01b0\7U\2\2\u01b0\u01b1\7[\2\2\u01b1"+
		"\u01b2\7P\2\2\u01b2\u01b3\7U\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\5\3\2"+
		"\2\u01b5d\3\2\2\2\u01b6\u01b7\7R\2\2\u01b7\u01b8\7T\2\2\u01b8\u01b9\7"+
		"Q\2\2\u01b9\u01ba\7R\2\2\u01ba\u01bb\7G\2\2\u01bb\u01bc\7T\2\2\u01bc\u01bd"+
		"\7V\2\2\u01bd\u01be\7K\2\2\u01be\u01bf\7G\2\2\u01bf\u01c0\7U\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c2\5\3\2\2\u01c2f\3\2\2\2\u01c3\u01c4\7H\2\2\u01c4"+
		"\u01c5\7N\2\2\u01c5\u01c6\7C\2\2\u01c6\u01c7\7I\2\2\u01c7\u01c8\3\2\2"+
		"\2\u01c8\u01c9\5\3\2\2\u01c9h\3\2\2\2\u01ca\u01cb\7X\2\2\u01cb\u01cc\7"+
		"C\2\2\u01cc\u01cd\7N\2\2\u01cd\u01ce\7W\2\2\u01ce\u01cf\7G\2\2\u01cf\u01d0"+
		"\7U\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\5\3\2\2\u01d2j\3\2\2\2\u01d3\u01d4"+
		"\7X\2\2\u01d4\u01d5\7C\2\2\u01d5\u01d6\7N\2\2\u01d6\u01d7\7W\2\2\u01d7"+
		"\u01d8\7G\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\5\3\2\2\u01dal\3\2\2\2\u01db"+
		"\u01dc\7P\2\2\u01dc\u01dd\5\3\2\2\u01ddn\3\2\2\2\u01de\u01df\7U\2\2\u01df"+
		"\u01e0\5\3\2\2\u01e0p\3\2\2\2\u01e1\u01e2\7G\2\2\u01e2\u01e3\5\3\2\2\u01e3"+
		"r\3\2\2\2\u01e4\u01e5\7Y\2\2\u01e5\u01e6\5\3\2\2\u01e6t\3\2\2\2\u01e7"+
		"\u01e8\7W\2\2\u01e8\u01e9\5\3\2\2\u01e9v\3\2\2\2\u01ea\u01eb\7F\2\2\u01eb"+
		"\u01ec\5\3\2\2\u01ecx\3\2\2\2\u01ed\u01ee\7P\2\2\u01ee\u01ef\5\65\33\2"+
		"\u01ef\u01f0\5\3\2\2\u01f0z\3\2\2\2\u01f1\u01f2\7U\2\2\u01f2\u01f3\5\65"+
		"\33\2\u01f3\u01f4\5\3\2\2\u01f4|\3\2\2\2\u01f5\u01f6\7G\2\2\u01f6\u01f7"+
		"\5\65\33\2\u01f7\u01f8\5\3\2\2\u01f8~\3\2\2\2\u01f9\u01fa\7Y\2\2\u01fa"+
		"\u01fb\5\65\33\2\u01fb\u01fc\5\3\2\2\u01fc\u0080\3\2\2\2\u01fd\u01fe\7"+
		"W\2\2\u01fe\u01ff\5\65\33\2\u01ff\u0200\5\3\2\2\u0200\u0082\3\2\2\2\u0201"+
		"\u0202\7F\2\2\u0202\u0203\5\65\33\2\u0203\u0204\5\3\2\2\u0204\u0084\3"+
		"\2\2\2\u0205\u0206\7P\2\2\u0206\u0207\5? \2\u0207\u0208\5\3\2\2\u0208"+
		"\u0086\3\2\2\2\u0209\u020a\7U\2\2\u020a\u020b\5? \2\u020b\u020c\5\3\2"+
		"\2\u020c\u0088\3\2\2\2\u020d\u020e\7G\2\2\u020e\u020f\5? \2\u020f\u0210"+
		"\5\3\2\2\u0210\u008a\3\2\2\2\u0211\u0212\7Y\2\2\u0212\u0213\5? \2\u0213"+
		"\u0214\5\3\2\2\u0214\u008c\3\2\2\2\u0215\u0216\7W\2\2\u0216\u0217\5? "+
		"\2\u0217\u0218\5\3\2\2\u0218\u008e\3\2\2\2\u0219\u021a\7F\2\2\u021a\u021b"+
		"\5? \2\u021b\u021c\5\3\2\2\u021c\u0090\3\2\2\2\u021d\u021e\7C\2\2\u021e"+
		"\u021f\7E\2\2\u021f\u0220\7V\2\2\u0220\u0221\7K\2\2\u0221\u0222\7Q\2\2"+
		"\u0222\u0223\7P\2\2\u0223\u0224\3\2\2\2\u0224\u0225\5\3\2\2\u0225\u0092"+
		"\3\2\2\2\u0226\u0227\7F\2\2\u0227\u0228\7G\2\2\u0228\u0229\7V\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u022b\5\3\2\2\u022b\u0094\3\2\2\2\u022c\u022d\7R"+
		"\2\2\u022d\u022e\7T\2\2\u022e\u022f\7U\2\2\u022f\u0230\7C\2\2\u0230\u0231"+
		"\3\2\2\2\u0231\u0232\5\3\2\2\u0232\u0096\3\2\2\2\u0233\u0234\7R\2\2\u0234"+
		"\u0235\7T\2\2\u0235\u0236\7U\2\2\u0236\u0237\7C\2\2\u0237\u0238\7C\2\2"+
		"\u0238\u0239\7p\2\2\u0239\u023a\7f\2\2\u023a\u023b\3\2\2\2\u023b\u023c"+
		"\5\3\2\2\u023c\u0098\3\2\2\2\u023d\u023e\7R\2\2\u023e\u023f\7T\2\2\u023f"+
		"\u0240\7U\2\2\u0240\u0241\7Q\2\2\u0241\u0242\3\2\2\2\u0242\u0243\5\3\2"+
		"\2\u0243\u009a\3\2\2\2\u0244\u0245\7R\2\2\u0245\u0246\7T\2\2\u0246\u0247"+
		"\7U\2\2\u0247\u0248\7K\2\2\u0248\u0249\3\2\2\2\u0249\u024a\5\3\2\2\u024a"+
		"\u009c\3\2\2\2\u024b\u024c\7J\2\2\u024c\u024d\7G\2\2\u024d\u024e\7T\2"+
		"\2\u024e\u024f\7G\2\2\u024f\u0250\3\2\2\2\u0250\u0251\5\3\2\2\u0251\u009e"+
		"\3\2\2\2\u0252\u0253\7K\2\2\u0253\u0254\7P\2\2\u0254\u0255\7U\2\2\u0255"+
		"\u0256\7E\2\2\u0256\u0257\7Q\2\2\u0257\u0258\7R\2\2\u0258\u0259\7G\2\2"+
		"\u0259\u025a\3\2\2\2\u025a\u025b\5\3\2\2\u025b\u00a0\3\2\2\2\u025c\u025d"+
		"\7C\2\2\u025d\u025e\7P\2\2\u025e\u025f\7F\2\2\u025f\u0260\7H\2\2\u0260"+
		"\u0261\7N\2\2\u0261\u0262\7C\2\2\u0262\u0263\7I\2\2\u0263\u0264\7U\2\2"+
		"\u0264\u0265\3\2\2\2\u0265\u0266\5\3\2\2\u0266\u00a2\3\2\2\2\u0267\u0268"+
		"\7Q\2\2\u0268\u0269\7T\2\2\u0269\u026a\7H\2\2\u026a\u026b\7N\2\2\u026b"+
		"\u026c\7C\2\2\u026c\u026d\7I\2\2\u026d\u026e\7U\2\2\u026e\u026f\3\2\2"+
		"\2\u026f\u0270\5\3\2\2\u0270\u00a4\3\2\2\2\u0271\u0272\7C\2\2\u0272\u0273"+
		"\7P\2\2\u0273\u0274\7F\2\2\u0274\u0275\7R\2\2\u0275\u0276\7T\2\2\u0276"+
		"\u0277\7Q\2\2\u0277\u0278\7R\2\2\u0278\u0279\7G\2\2\u0279\u027a\7T\2\2"+
		"\u027a\u027b\7V\2\2\u027b\u027c\7K\2\2\u027c\u027d\7G\2\2\u027d\u027e"+
		"\7U\2\2\u027e\u027f\3\2\2\2\u027f\u0280\5\3\2\2\u0280\u00a6\3\2\2\2\u0281"+
		"\u0282\7Q\2\2\u0282\u0283\7T\2\2\u0283\u0284\7R\2\2\u0284\u0285\7T\2\2"+
		"\u0285\u0286\7Q\2\2\u0286\u0287\7R\2\2\u0287\u0288\7G\2\2\u0288\u0289"+
		"\7T\2\2\u0289\u028a\7V\2\2\u028a\u028b\7K\2\2\u028b\u028c\7G\2\2\u028c"+
		"\u028d\7U\2\2\u028d\u028e\3\2\2\2\u028e\u028f\5\3\2\2\u028f\u00a8\3\2"+
		"\2\2\u0290\u0291\7H\2\2\u0291\u0292\7N\2\2\u0292\u0293\7C\2\2\u0293\u0294"+
		"\7I\2\2\u0294\u0295\7X\2\2\u0295\u0296\7C\2\2\u0296\u0297\7N\2\2\u0297"+
		"\u0298\7W\2\2\u0298\u0299\7G\2\2\u0299\u029a\3\2\2\2\u029a\u029b\5\3\2"+
		"\2\u029b\u00aa\3\2\2\2\u029c\u029d\7J\2\2\u029d\u029e\7C\2\2\u029e\u029f"+
		"\7X\2\2\u029f\u02a0\7G\2\2\u02a0\u02a1\7K\2\2\u02a1\u02a2\7V\2\2\u02a2"+
		"\u02a3\7G\2\2\u02a3\u02a4\7O\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\5\3\2"+
		"\2\u02a6\u00ac\3\2\2\2\u02a7\u02a8\7J\2\2\u02a8\u02a9\7C\2\2\u02a9\u02aa"+
		"\7X\2\2\u02aa\u02ab\7G\2\2\u02ab\u02ac\7K\2\2\u02ac\u02ad\7V\2\2\u02ad"+
		"\u02ae\7G\2\2\u02ae\u02af\7O\2\2\u02af\u02b0\7U\2\2\u02b0\u02b1\3\2\2"+
		"\2\u02b1\u02b2\5\3\2\2\u02b2\u00ae\3\2\2\2\u02b3\u02b4\7G\2\2\u02b4\u02b5"+
		"\7S\2\2\u02b5\u02b6\7W\2\2\u02b6\u02b7\7C\2\2\u02b7\u02b8\7N\2\2\u02b8"+
		"\u02b9\7U\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\5\3\2\2\u02bb\u00b0\3\2"+
		"\2\2\u02bc\u02bd\7I\2\2\u02bd\u02be\7V\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0"+
		"\5\3\2\2\u02c0\u00b2\3\2\2\2\u02c1\u02c2\7N\2\2\u02c2\u02c3\7V\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02c5\5\3\2\2\u02c5\u00b4\3\2\2\2\u02c6\u02c7\7V"+
		"\2\2\u02c7\u02c8\7G\2\2\u02c8\u02c9\7N\2\2\u02c9\u02ca\7N\2\2\u02ca\u02cb"+
		"\3\2\2\2\u02cb\u02cc\5\3\2\2\u02cc\u00b6\3\2\2\2\u02cd\u02ce\7I\2\2\u02ce"+
		"\u02cf\7Q\2\2\u02cf\u02d0\7V\2\2\u02d0\u02d1\7Q\2\2\u02d1\u02d2\3\2\2"+
		"\2\u02d2\u02d3\5\3\2\2\u02d3\u00b8\3\2\2\2\u02d4\u02d5\7U\2\2\u02d5\u02d6"+
		"\7G\2\2\u02d6\u02d7\7V\2\2\u02d7\u02d8\7H\2\2\u02d8\u02d9\7N\2\2\u02d9"+
		"\u02da\7C\2\2\u02da\u02db\7I\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\5\3\2"+
		"\2\u02dd\u00ba\3\2\2\2\u02de\u02df\7T\2\2\u02df\u02e0\7G\2\2\u02e0\u02e1"+
		"\7O\2\2\u02e1\u02e2\7H\2\2\u02e2\u02e3\7N\2\2\u02e3\u02e4\7C\2\2\u02e4"+
		"\u02e5\7I\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\5\3\2\2\u02e7\u00bc\3\2"+
		"\2\2\u02e8\u02e9\7V\2\2\u02e9\u02ea\7C\2\2\u02ea\u02eb\7M\2\2\u02eb\u02ec"+
		"\7G\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\5\3\2\2\u02ee\u00be\3\2\2\2\u02ef"+
		"\u02f0\7R\2\2\u02f0\u02f1\7N\2\2\u02f1\u02f2\7C\2\2\u02f2\u02f3\7E\2\2"+
		"\u02f3\u02f4\7G\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\5\3\2\2\u02f6\u00c0"+
		"\3\2\2\2\u02f7\u02f8\7U\2\2\u02f8\u02f9\7G\2\2\u02f9\u02fa\7V\2\2\u02fa"+
		"\u02fb\7X\2\2\u02fb\u02fc\7C\2\2\u02fc\u02fd\7T\2\2\u02fd\u02fe\3\2\2"+
		"\2\u02fe\u02ff\5\3\2\2\u02ff\u00c2\3\2\2\2\u0300\u0301\7K\2\2\u0301\u0302"+
		"\7P\2\2\u0302\u0303\7E\2\2\u0303\u0304\7X\2\2\u0304\u0305\7C\2\2\u0305"+
		"\u0306\7T\2\2\u0306\u0307\3\2\2\2\u0307\u0308\5\3\2\2\u0308\u00c4\3\2"+
		"\2\2\u0309\u030a\7F\2\2\u030a\u030b\7G\2\2\u030b\u030c\7E\2\2\u030c\u030d"+
		"\7X\2\2\u030d\u030e\7C\2\2\u030e\u030f\7T\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0311\5\3\2\2\u0311\u00c6\3\2\2\2\b\2\u012c\u0131\u0136\u013b\u0143\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}