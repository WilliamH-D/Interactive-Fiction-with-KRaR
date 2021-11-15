// Generated from D:/Documents/University/Part II Project/Interactive Fiction with KRaR/src/ProcessInput\editorGrammar.g4 by ANTLR 4.9.2
package ProcessInput;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class editorGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALPHA", "NUMERIC", "ALPHANUMERIC", "WHITESPACE", "COLON", "SEMICOLON", 
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


	public editorGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "editorGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u01f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\6\2\177\n\2\r\2\16\2\u0080\3\3\6\3\u0084\n\3\r\3\16\3\u0085"+
		"\3\4\6\4\u0089\n\4\r\4\16\4\u008a\3\5\6\5\u008e\n\5\r\5\16\5\u008f\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00b9\n\25\3\26\3\26\5\26\u00bd"+
		"\n\26\3\27\3\27\7\27\u00c1\n\27\f\27\16\27\u00c4\13\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00d1\n\30\3\31\3\31\3\31"+
		"\5\31\u00d6\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u00dd\n\32\3\33\3\33\3"+
		"\33\3\33\5\33\u00e3\n\33\3\34\3\34\3\34\3\34\5\34\u00e9\n\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u015c\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\3"+
		"8\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		">\3>\3>\3>\3>\3>\2\2?\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?\3\2\7\4\2C\\c|\3\2\62;\5\2\62;C\\c|\5"+
		"\2\13\f\17\17\"\"\3\2$$\2\u0209\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3~\3\2\2\2\5\u0083\3\2\2\2\7"+
		"\u0088\3\2\2\2\t\u008d\3\2\2\2\13\u0093\3\2\2\2\r\u0095\3\2\2\2\17\u0097"+
		"\3\2\2\2\21\u0099\3\2\2\2\23\u009b\3\2\2\2\25\u009d\3\2\2\2\27\u009f\3"+
		"\2\2\2\31\u00a1\3\2\2\2\33\u00a3\3\2\2\2\35\u00a5\3\2\2\2\37\u00a7\3\2"+
		"\2\2!\u00a9\3\2\2\2#\u00ab\3\2\2\2%\u00ad\3\2\2\2\'\u00af\3\2\2\2)\u00b8"+
		"\3\2\2\2+\u00bc\3\2\2\2-\u00be\3\2\2\2/\u00d0\3\2\2\2\61\u00d5\3\2\2\2"+
		"\63\u00dc\3\2\2\2\65\u00e2\3\2\2\2\67\u00e8\3\2\2\29\u00ea\3\2\2\2;\u00ee"+
		"\3\2\2\2=\u00f1\3\2\2\2?\u00f7\3\2\2\2A\u0101\3\2\2\2C\u0109\3\2\2\2E"+
		"\u0113\3\2\2\2G\u011a\3\2\2\2I\u0120\3\2\2\2K\u0125\3\2\2\2M\u0130\3\2"+
		"\2\2O\u0137\3\2\2\2Q\u013e\3\2\2\2S\u0146\3\2\2\2U\u015b\3\2\2\2W\u015d"+
		"\3\2\2\2Y\u0166\3\2\2\2[\u016d\3\2\2\2]\u0174\3\2\2\2_\u017b\3\2\2\2a"+
		"\u0182\3\2\2\2c\u018d\3\2\2\2e\u0197\3\2\2\2g\u01a2\3\2\2\2i\u01ae\3\2"+
		"\2\2k\u01b7\3\2\2\2m\u01bc\3\2\2\2o\u01c1\3\2\2\2q\u01c8\3\2\2\2s\u01cf"+
		"\3\2\2\2u\u01d9\3\2\2\2w\u01e3\3\2\2\2y\u01ea\3\2\2\2{\u01f2\3\2\2\2}"+
		"\177\t\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\4\3\2\2\2\u0082\u0084\t\3\2\2\u0083\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\6\3\2\2\2\u0087"+
		"\u0089\t\4\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\b\3\2\2\2\u008c\u008e\t\5\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\b\5\2\2\u0092\n\3\2\2\2\u0093\u0094\7<\2\2"+
		"\u0094\f\3\2\2\2\u0095\u0096\7=\2\2\u0096\16\3\2\2\2\u0097\u0098\7]\2"+
		"\2\u0098\20\3\2\2\2\u0099\u009a\7_\2\2\u009a\22\3\2\2\2\u009b\u009c\7"+
		">\2\2\u009c\24\3\2\2\2\u009d\u009e\7@\2\2\u009e\26\3\2\2\2\u009f\u00a0"+
		"\7}\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7\177\2\2\u00a2\32\3\2\2\2\u00a3"+
		"\u00a4\7*\2\2\u00a4\34\3\2\2\2\u00a5\u00a6\7+\2\2\u00a6\36\3\2\2\2\u00a7"+
		"\u00a8\7$\2\2\u00a8 \3\2\2\2\u00a9\u00aa\7a\2\2\u00aa\"\3\2\2\2\u00ab"+
		"\u00ac\7.\2\2\u00ac$\3\2\2\2\u00ad\u00ae\7\60\2\2\u00ae&\3\2\2\2\u00af"+
		"\u00b0\5\5\3\2\u00b0(\3\2\2\2\u00b1\u00b2\5\5\3\2\u00b2\u00b3\5%\23\2"+
		"\u00b3\u00b4\5\5\3\2\u00b4\u00b9\3\2\2\2\u00b5\u00b6\5%\23\2\u00b6\u00b7"+
		"\5\5\3\2\u00b7\u00b9\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9"+
		"*\3\2\2\2\u00ba\u00bd\5\'\24\2\u00bb\u00bd\5)\25\2\u00bc\u00ba\3\2\2\2"+
		"\u00bc\u00bb\3\2\2\2\u00bd,\3\2\2\2\u00be\u00c2\5\37\20\2\u00bf\u00c1"+
		"\n\6\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\5\37"+
		"\20\2\u00c6.\3\2\2\2\u00c7\u00c8\7V\2\2\u00c8\u00c9\7T\2\2\u00c9\u00ca"+
		"\7W\2\2\u00ca\u00d1\7G\2\2\u00cb\u00cc\7H\2\2\u00cc\u00cd\7C\2\2\u00cd"+
		"\u00ce\7N\2\2\u00ce\u00cf\7U\2\2\u00cf\u00d1\7G\2\2\u00d0\u00c7\3\2\2"+
		"\2\u00d0\u00cb\3\2\2\2\u00d1\60\3\2\2\2\u00d2\u00d6\5+\26\2\u00d3\u00d6"+
		"\5-\27\2\u00d4\u00d6\5/\30\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\62\3\2\2\2\u00d7\u00d8\7C\2\2\u00d8\u00d9\7P\2\2"+
		"\u00d9\u00dd\7F\2\2\u00da\u00db\7(\2\2\u00db\u00dd\7(\2\2\u00dc\u00d7"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\64\3\2\2\2\u00de\u00df\7Q\2\2\u00df"+
		"\u00e3\7T\2\2\u00e0\u00e1\7~\2\2\u00e1\u00e3\7~\2\2\u00e2\u00de\3\2\2"+
		"\2\u00e2\u00e0\3\2\2\2\u00e3\66\3\2\2\2\u00e4\u00e5\7P\2\2\u00e5\u00e6"+
		"\7Q\2\2\u00e6\u00e9\7V\2\2\u00e7\u00e9\7#\2\2\u00e8\u00e4\3\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e98\3\2\2\2\u00ea\u00eb\5\23\n\2\u00eb\u00ec\5\7\4\2"+
		"\u00ec\u00ed\5\25\13\2\u00ed:\3\2\2\2\u00ee\u00ef\5!\21\2\u00ef\u00f0"+
		"\5\7\4\2\u00f0<\3\2\2\2\u00f1\u00f2\5\33\16\2\u00f2\u00f3\5\7\4\2\u00f3"+
		"\u00f4\5\13\6\2\u00f4\u00f5\5\61\31\2\u00f5\u00f6\5\35\17\2\u00f6>\3\2"+
		"\2\2\u00f7\u00f8\5\17\b\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7d\2\2\u00fa"+
		"\u00fb\7l\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7e\2\2\u00fd\u00fe\7v\2\2"+
		"\u00fe\u00ff\3\2\2\2\u00ff\u0100\5\21\t\2\u0100@\3\2\2\2\u0101\u0102\5"+
		"\17\b\2\u0102\u0103\7t\2\2\u0103\u0104\7q\2\2\u0104\u0105\7q\2\2\u0105"+
		"\u0106\7o\2\2\u0106\u0107\3\2\2\2\u0107\u0108\5\21\t\2\u0108B\3\2\2\2"+
		"\u0109\u010a\5\17\b\2\u010a\u010b\7c\2\2\u010b\u010c\7e\2\2\u010c\u010d"+
		"\7v\2\2\u010d\u010e\7k\2\2\u010e\u010f\7q\2\2\u010f\u0110\7p\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\5\21\t\2\u0112D\3\2\2\2\u0113\u0114\7a\2\2"+
		"\u0114\u0115\7E\2\2\u0115\u0116\7Q\2\2\u0116\u0117\7P\2\2\u0117\u0118"+
		"\7F\2\2\u0118\u0119\7a\2\2\u0119F\3\2\2\2\u011a\u011b\7a\2\2\u011b\u011c"+
		"\7G\2\2\u011c\u011d\7H\2\2\u011d\u011e\7H\2\2\u011e\u011f\7a\2\2\u011f"+
		"H\3\2\2\2\u0120\u0121\7K\2\2\u0121\u0122\7F\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\5\13\6\2\u0124J\3\2\2\2\u0125\u0126\7N\2\2\u0126\u0127\7Q\2\2\u0127"+
		"\u0128\7E\2\2\u0128\u0129\7C\2\2\u0129\u012a\7V\2\2\u012a\u012b\7K\2\2"+
		"\u012b\u012c\7Q\2\2\u012c\u012d\7P\2\2\u012d\u012e\3\2\2\2\u012e\u012f"+
		"\5\13\6\2\u012fL\3\2\2\2\u0130\u0131\7P\2\2\u0131\u0132\7C\2\2\u0132\u0133"+
		"\7O\2\2\u0133\u0134\7G\2\2\u0134\u0135\3\2\2\2\u0135\u0136\5\13\6\2\u0136"+
		"N\3\2\2\2\u0137\u0138\7F\2\2\u0138\u0139\7G\2\2\u0139\u013a\7U\2\2\u013a"+
		"\u013b\7E\2\2\u013b\u013c\3\2\2\2\u013c\u013d\5\13\6\2\u013dP\3\2\2\2"+
		"\u013e\u013f\7H\2\2\u013f\u0140\7N\2\2\u0140\u0141\7C\2\2\u0141\u0142"+
		"\7I\2\2\u0142\u0143\7U\2\2\u0143\u0144\3\2\2\2\u0144\u0145\5\13\6\2\u0145"+
		"R\3\2\2\2\u0146\u0147\7X\2\2\u0147\u0148\7C\2\2\u0148\u0149\7N\2\2\u0149"+
		"\u014a\7W\2\2\u014a\u014b\7G\2\2\u014b\u014c\7U\2\2\u014c\u014d\3\2\2"+
		"\2\u014d\u014e\5\13\6\2\u014eT\3\2\2\2\u014f\u0150\7P\2\2\u0150\u015c"+
		"\5\13\6\2\u0151\u0152\7U\2\2\u0152\u015c\5\13\6\2\u0153\u0154\7G\2\2\u0154"+
		"\u015c\5\13\6\2\u0155\u0156\7Y\2\2\u0156\u015c\5\13\6\2\u0157\u0158\7"+
		"W\2\2\u0158\u015c\5\13\6\2\u0159\u015a\7F\2\2\u015a\u015c\5\13\6\2\u015b"+
		"\u014f\3\2\2\2\u015b\u0151\3\2\2\2\u015b\u0153\3\2\2\2\u015b\u0155\3\2"+
		"\2\2\u015b\u0157\3\2\2\2\u015b\u0159\3\2\2\2\u015cV\3\2\2\2\u015d\u015e"+
		"\7C\2\2\u015e\u015f\7E\2\2\u015f\u0160\7V\2\2\u0160\u0161\7K\2\2\u0161"+
		"\u0162\7Q\2\2\u0162\u0163\7P\2\2\u0163\u0164\3\2\2\2\u0164\u0165\5\13"+
		"\6\2\u0165X\3\2\2\2\u0166\u0167\7R\2\2\u0167\u0168\7T\2\2\u0168\u0169"+
		"\7U\2\2\u0169\u016a\7C\2\2\u016a\u016b\3\2\2\2\u016b\u016c\5\13\6\2\u016c"+
		"Z\3\2\2\2\u016d\u016e\7R\2\2\u016e\u016f\7T\2\2\u016f\u0170\7U\2\2\u0170"+
		"\u0171\7Q\2\2\u0171\u0172\3\2\2\2\u0172\u0173\5\13\6\2\u0173\\\3\2\2\2"+
		"\u0174\u0175\7R\2\2\u0175\u0176\7T\2\2\u0176\u0177\7U\2\2\u0177\u0178"+
		"\7K\2\2\u0178\u0179\3\2\2\2\u0179\u017a\5\13\6\2\u017a^\3\2\2\2\u017b"+
		"\u017c\7J\2\2\u017c\u017d\7G\2\2\u017d\u017e\7T\2\2\u017e\u017f\7G\2\2"+
		"\u017f\u0180\3\2\2\2\u0180\u0181\5\13\6\2\u0181`\3\2\2\2\u0182\u0183\7"+
		"C\2\2\u0183\u0184\7P\2\2\u0184\u0185\7F\2\2\u0185\u0186\7H\2\2\u0186\u0187"+
		"\7N\2\2\u0187\u0188\7C\2\2\u0188\u0189\7I\2\2\u0189\u018a\7U\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\5\13\6\2\u018cb\3\2\2\2\u018d\u018e\7Q\2\2"+
		"\u018e\u018f\7T\2\2\u018f\u0190\7H\2\2\u0190\u0191\7N\2\2\u0191\u0192"+
		"\7C\2\2\u0192\u0193\7I\2\2\u0193\u0194\7U\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0196\5\13\6\2\u0196d\3\2\2\2\u0197\u0198\7J\2\2\u0198\u0199\7C\2\2\u0199"+
		"\u019a\7X\2\2\u019a\u019b\7G\2\2\u019b\u019c\7K\2\2\u019c\u019d\7V\2\2"+
		"\u019d\u019e\7G\2\2\u019e\u019f\7O\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1"+
		"\5\13\6\2\u01a1f\3\2\2\2\u01a2\u01a3\7J\2\2\u01a3\u01a4\7C\2\2\u01a4\u01a5"+
		"\7X\2\2\u01a5\u01a6\7G\2\2\u01a6\u01a7\7K\2\2\u01a7\u01a8\7V\2\2\u01a8"+
		"\u01a9\7G\2\2\u01a9\u01aa\7O\2\2\u01aa\u01ab\7U\2\2\u01ab\u01ac\3\2\2"+
		"\2\u01ac\u01ad\5\13\6\2\u01adh\3\2\2\2\u01ae\u01af\7G\2\2\u01af\u01b0"+
		"\7S\2\2\u01b0\u01b1\7W\2\2\u01b1\u01b2\7C\2\2\u01b2\u01b3\7N\2\2\u01b3"+
		"\u01b4\7U\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\5\13\6\2\u01b6j\3\2\2\2"+
		"\u01b7\u01b8\7I\2\2\u01b8\u01b9\7V\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb"+
		"\5\13\6\2\u01bbl\3\2\2\2\u01bc\u01bd\7N\2\2\u01bd\u01be\7V\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bf\u01c0\5\13\6\2\u01c0n\3\2\2\2\u01c1\u01c2\7V\2\2\u01c2"+
		"\u01c3\7G\2\2\u01c3\u01c4\7N\2\2\u01c4\u01c5\7N\2\2\u01c5\u01c6\3\2\2"+
		"\2\u01c6\u01c7\5\13\6\2\u01c7p\3\2\2\2\u01c8\u01c9\7I\2\2\u01c9\u01ca"+
		"\7Q\2\2\u01ca\u01cb\7V\2\2\u01cb\u01cc\7Q\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01ce\5\13\6\2\u01cer\3\2\2\2\u01cf\u01d0\7U\2\2\u01d0\u01d1\7G\2\2\u01d1"+
		"\u01d2\7V\2\2\u01d2\u01d3\7H\2\2\u01d3\u01d4\7N\2\2\u01d4\u01d5\7C\2\2"+
		"\u01d5\u01d6\7I\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\5\13\6\2\u01d8t\3"+
		"\2\2\2\u01d9\u01da\7T\2\2\u01da\u01db\7G\2\2\u01db\u01dc\7O\2\2\u01dc"+
		"\u01dd\7H\2\2\u01dd\u01de\7N\2\2\u01de\u01df\7C\2\2\u01df\u01e0\7I\2\2"+
		"\u01e0\u01e1\3\2\2\2\u01e1\u01e2\5\13\6\2\u01e2v\3\2\2\2\u01e3\u01e4\7"+
		"V\2\2\u01e4\u01e5\7C\2\2\u01e5\u01e6\7M\2\2\u01e6\u01e7\7G\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8\u01e9\5\13\6\2\u01e9x\3\2\2\2\u01ea\u01eb\7R\2\2\u01eb"+
		"\u01ec\7N\2\2\u01ec\u01ed\7C\2\2\u01ed\u01ee\7E\2\2\u01ee\u01ef\7G\2\2"+
		"\u01ef\u01f0\3\2\2\2\u01f0\u01f1\5\13\6\2\u01f1z\3\2\2\2\u01f2\u01f3\7"+
		"U\2\2\u01f3\u01f4\7G\2\2\u01f4\u01f5\7V\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f7\5\13\6\2\u01f7|\3\2\2\2\20\2\u0080\u0085\u008a\u008f\u00b8\u00bc"+
		"\u00c2\u00d0\u00d5\u00dc\u00e2\u00e8\u015b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}