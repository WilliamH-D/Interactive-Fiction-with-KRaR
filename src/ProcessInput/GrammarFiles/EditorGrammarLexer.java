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
		COMMA=13, DOT=14, PLUS=15, MINUS=16, BAR=17, ANDPERSAND=18, TRUE=19, FALSE=20, 
		AND=21, OR=22, NOT=23, COND_TAG=24, EFFECT_TAG=25, ALPHA=26, NUMERIC=27, 
		ALPHANUMERIC=28, WHITESPACE=29, STRING=30, ID=31, OBJECT_TAG=32, ROOM_TAG=33, 
		ACTION_TAG=34, FLAG_TAG=35, ID_KEY=36, LOC_KEY=37, NAME_KEY=38, DESC_KEY=39, 
		FLAGS_KEY=40, FLAG_KEY=41, VALUES_KEY=42, VALUE_KEY=43, DIR_KEY=44, ACTION_KEY=45, 
		PRSA_COND=46, PRSO_COND=47, PRSI_COND=48, HERE_COND=49, ANDFLAGS_COND=50, 
		ORFLAGS_COND=51, FLAGVALUE_COND=52, HAVEITEM_COND=53, HAVEITEMS_COND=54, 
		EQUALS_COND=55, GT_COND=56, LT_COND=57, TELL_EFF=58, GOTO_EFF=59, SETFLAG_EFF=60, 
		REMFLAG_EFF=61, TAKE_EFF=62, PLACE_EFF=63, SET_EFF=64;
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
			"COMMA", "DOT", "PLUS", "MINUS", "BAR", "ANDPERSAND", "TRUE", "FALSE", 
			"AND", "OR", "NOT", "COND_TAG", "EFFECT_TAG", "ALPHA", "NUMERIC", "ALPHANUMERIC", 
			"WHITESPACE", "STRING", "ID", "OBJECT_TAG", "ROOM_TAG", "ACTION_TAG", 
			"FLAG_TAG", "ID_KEY", "LOC_KEY", "NAME_KEY", "DESC_KEY", "FLAGS_KEY", 
			"FLAG_KEY", "VALUES_KEY", "VALUE_KEY", "DIR_KEY", "ACTION_KEY", "PRSA_COND", 
			"PRSO_COND", "PRSI_COND", "HERE_COND", "ANDFLAGS_COND", "ORFLAGS_COND", 
			"FLAGVALUE_COND", "HAVEITEM_COND", "HAVEITEMS_COND", "EQUALS_COND", "GT_COND", 
			"LT_COND", "TELL_EFF", "GOTO_EFF", "SETFLAG_EFF", "REMFLAG_EFF", "TAKE_EFF", 
			"PLACE_EFF", "SET_EFF"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'['", "']'", "'<'", "'>'", "'{'", "'}'", "'('", 
			"')'", "'\"'", "'_'", "','", "'.'", "'+'", "'-'", "'|'", "'&'", "'TRUE'", 
			"'FALSE'", null, null, "'!'", "'COND'", "'EFF'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "SEMICOLON", "LB_SQUARE", "RB_SQUARE", "LB_SHARP", "RB_SHARP", 
			"LB_CURLY", "RB_CURLY", "LB_ROUND", "RB_ROUND", "QUOTES", "UNDERSCORE", 
			"COMMA", "DOT", "PLUS", "MINUS", "BAR", "ANDPERSAND", "TRUE", "FALSE", 
			"AND", "OR", "NOT", "COND_TAG", "EFFECT_TAG", "ALPHA", "NUMERIC", "ALPHANUMERIC", 
			"WHITESPACE", "STRING", "ID", "OBJECT_TAG", "ROOM_TAG", "ACTION_TAG", 
			"FLAG_TAG", "ID_KEY", "LOC_KEY", "NAME_KEY", "DESC_KEY", "FLAGS_KEY", 
			"FLAG_KEY", "VALUES_KEY", "VALUE_KEY", "DIR_KEY", "ACTION_KEY", "PRSA_COND", 
			"PRSO_COND", "PRSI_COND", "HERE_COND", "ANDFLAGS_COND", "ORFLAGS_COND", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u01fd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\6\33\u00c5\n\33\r\33"+
		"\16\33\u00c6\3\34\6\34\u00ca\n\34\r\34\16\34\u00cb\3\35\6\35\u00cf\n\35"+
		"\r\35\16\35\u00d0\3\36\6\36\u00d4\n\36\r\36\16\36\u00d5\3\36\3\36\3\37"+
		"\3\37\7\37\u00dc\n\37\f\37\16\37\u00df\13\37\3\37\3\37\3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0155"+
		"\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:"+
		"\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\2\2B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\3\2\7"+
		"\4\2C\\c|\3\2\62;\5\2\62;C\\c|\5\2\13\f\17\17\"\"\3\2$$\2\u0206\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2"+
		"\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\5\u0085"+
		"\3\2\2\2\7\u0087\3\2\2\2\t\u0089\3\2\2\2\13\u008b\3\2\2\2\r\u008d\3\2"+
		"\2\2\17\u008f\3\2\2\2\21\u0091\3\2\2\2\23\u0093\3\2\2\2\25\u0095\3\2\2"+
		"\2\27\u0097\3\2\2\2\31\u0099\3\2\2\2\33\u009b\3\2\2\2\35\u009d\3\2\2\2"+
		"\37\u009f\3\2\2\2!\u00a1\3\2\2\2#\u00a3\3\2\2\2%\u00a5\3\2\2\2\'\u00a7"+
		"\3\2\2\2)\u00ac\3\2\2\2+\u00b2\3\2\2\2-\u00b5\3\2\2\2/\u00b8\3\2\2\2\61"+
		"\u00ba\3\2\2\2\63\u00bf\3\2\2\2\65\u00c4\3\2\2\2\67\u00c9\3\2\2\29\u00ce"+
		"\3\2\2\2;\u00d3\3\2\2\2=\u00d9\3\2\2\2?\u00e2\3\2\2\2A\u00e6\3\2\2\2C"+
		"\u00f0\3\2\2\2E\u00f8\3\2\2\2G\u0102\3\2\2\2I\u010a\3\2\2\2K\u010f\3\2"+
		"\2\2M\u011a\3\2\2\2O\u0121\3\2\2\2Q\u0128\3\2\2\2S\u0130\3\2\2\2U\u0137"+
		"\3\2\2\2W\u0140\3\2\2\2Y\u0154\3\2\2\2[\u0156\3\2\2\2]\u015f\3\2\2\2_"+
		"\u0166\3\2\2\2a\u016d\3\2\2\2c\u0174\3\2\2\2e\u017b\3\2\2\2g\u0186\3\2"+
		"\2\2i\u0190\3\2\2\2k\u019c\3\2\2\2m\u01a7\3\2\2\2o\u01b3\3\2\2\2q\u01bc"+
		"\3\2\2\2s\u01c1\3\2\2\2u\u01c6\3\2\2\2w\u01cd\3\2\2\2y\u01d4\3\2\2\2{"+
		"\u01de\3\2\2\2}\u01e8\3\2\2\2\177\u01ef\3\2\2\2\u0081\u01f7\3\2\2\2\u0083"+
		"\u0084\7<\2\2\u0084\4\3\2\2\2\u0085\u0086\7=\2\2\u0086\6\3\2\2\2\u0087"+
		"\u0088\7]\2\2\u0088\b\3\2\2\2\u0089\u008a\7_\2\2\u008a\n\3\2\2\2\u008b"+
		"\u008c\7>\2\2\u008c\f\3\2\2\2\u008d\u008e\7@\2\2\u008e\16\3\2\2\2\u008f"+
		"\u0090\7}\2\2\u0090\20\3\2\2\2\u0091\u0092\7\177\2\2\u0092\22\3\2\2\2"+
		"\u0093\u0094\7*\2\2\u0094\24\3\2\2\2\u0095\u0096\7+\2\2\u0096\26\3\2\2"+
		"\2\u0097\u0098\7$\2\2\u0098\30\3\2\2\2\u0099\u009a\7a\2\2\u009a\32\3\2"+
		"\2\2\u009b\u009c\7.\2\2\u009c\34\3\2\2\2\u009d\u009e\7\60\2\2\u009e\36"+
		"\3\2\2\2\u009f\u00a0\7-\2\2\u00a0 \3\2\2\2\u00a1\u00a2\7/\2\2\u00a2\""+
		"\3\2\2\2\u00a3\u00a4\7~\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7(\2\2\u00a6&\3"+
		"\2\2\2\u00a7\u00a8\7V\2\2\u00a8\u00a9\7T\2\2\u00a9\u00aa\7W\2\2\u00aa"+
		"\u00ab\7G\2\2\u00ab(\3\2\2\2\u00ac\u00ad\7H\2\2\u00ad\u00ae\7C\2\2\u00ae"+
		"\u00af\7N\2\2\u00af\u00b0\7U\2\2\u00b0\u00b1\7G\2\2\u00b1*\3\2\2\2\u00b2"+
		"\u00b3\5%\23\2\u00b3\u00b4\5%\23\2\u00b4,\3\2\2\2\u00b5\u00b6\5#\22\2"+
		"\u00b6\u00b7\5#\22\2\u00b7.\3\2\2\2\u00b8\u00b9\7#\2\2\u00b9\60\3\2\2"+
		"\2\u00ba\u00bb\7E\2\2\u00bb\u00bc\7Q\2\2\u00bc\u00bd\7P\2\2\u00bd\u00be"+
		"\7F\2\2\u00be\62\3\2\2\2\u00bf\u00c0\7G\2\2\u00c0\u00c1\7H\2\2\u00c1\u00c2"+
		"\7H\2\2\u00c2\64\3\2\2\2\u00c3\u00c5\t\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\66\3\2\2"+
		"\2\u00c8\u00ca\t\3\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc8\3\2\2\2\u00cd\u00cf\t\4\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1:\3\2\2\2\u00d2\u00d4\t\5\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\b\36\2\2\u00d8<\3\2\2\2\u00d9\u00dd\5\27\f\2\u00da\u00dc\n\6\2"+
		"\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\5\27\f\2"+
		"\u00e1>\3\2\2\2\u00e2\u00e3\5\13\6\2\u00e3\u00e4\59\35\2\u00e4\u00e5\5"+
		"\r\7\2\u00e5@\3\2\2\2\u00e6\u00e7\5\7\4\2\u00e7\u00e8\7q\2\2\u00e8\u00e9"+
		"\7d\2\2\u00e9\u00ea\7l\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7e\2\2\u00ec"+
		"\u00ed\7v\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\5\t\5\2\u00efB\3\2\2\2\u00f0"+
		"\u00f1\5\7\4\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7q\2"+
		"\2\u00f4\u00f5\7o\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\5\t\5\2\u00f7D\3"+
		"\2\2\2\u00f8\u00f9\5\7\4\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7e\2\2\u00fb"+
		"\u00fc\7v\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7p\2\2"+
		"\u00ff\u0100\3\2\2\2\u0100\u0101\5\t\5\2\u0101F\3\2\2\2\u0102\u0103\5"+
		"\7\4\2\u0103\u0104\7h\2\2\u0104\u0105\7n\2\2\u0105\u0106\7c\2\2\u0106"+
		"\u0107\7i\2\2\u0107\u0108\3\2\2\2\u0108\u0109\5\t\5\2\u0109H\3\2\2\2\u010a"+
		"\u010b\7K\2\2\u010b\u010c\7F\2\2\u010c\u010d\3\2\2\2\u010d\u010e\5\3\2"+
		"\2\u010eJ\3\2\2\2\u010f\u0110\7N\2\2\u0110\u0111\7Q\2\2\u0111\u0112\7"+
		"E\2\2\u0112\u0113\7C\2\2\u0113\u0114\7V\2\2\u0114\u0115\7K\2\2\u0115\u0116"+
		"\7Q\2\2\u0116\u0117\7P\2\2\u0117\u0118\3\2\2\2\u0118\u0119\5\3\2\2\u0119"+
		"L\3\2\2\2\u011a\u011b\7P\2\2\u011b\u011c\7C\2\2\u011c\u011d\7O\2\2\u011d"+
		"\u011e\7G\2\2\u011e\u011f\3\2\2\2\u011f\u0120\5\3\2\2\u0120N\3\2\2\2\u0121"+
		"\u0122\7F\2\2\u0122\u0123\7G\2\2\u0123\u0124\7U\2\2\u0124\u0125\7E\2\2"+
		"\u0125\u0126\3\2\2\2\u0126\u0127\5\3\2\2\u0127P\3\2\2\2\u0128\u0129\7"+
		"H\2\2\u0129\u012a\7N\2\2\u012a\u012b\7C\2\2\u012b\u012c\7I\2\2\u012c\u012d"+
		"\7U\2\2\u012d\u012e\3\2\2\2\u012e\u012f\5\3\2\2\u012fR\3\2\2\2\u0130\u0131"+
		"\7H\2\2\u0131\u0132\7N\2\2\u0132\u0133\7C\2\2\u0133\u0134\7I\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\5\3\2\2\u0136T\3\2\2\2\u0137\u0138\7X\2\2\u0138"+
		"\u0139\7C\2\2\u0139\u013a\7N\2\2\u013a\u013b\7W\2\2\u013b\u013c\7G\2\2"+
		"\u013c\u013d\7U\2\2\u013d\u013e\3\2\2\2\u013e\u013f\5\3\2\2\u013fV\3\2"+
		"\2\2\u0140\u0141\7X\2\2\u0141\u0142\7C\2\2\u0142\u0143\7N\2\2\u0143\u0144"+
		"\7W\2\2\u0144\u0145\7G\2\2\u0145\u0146\3\2\2\2\u0146\u0147\5\3\2\2\u0147"+
		"X\3\2\2\2\u0148\u0149\7P\2\2\u0149\u0155\5\3\2\2\u014a\u014b\7U\2\2\u014b"+
		"\u0155\5\3\2\2\u014c\u014d\7G\2\2\u014d\u0155\5\3\2\2\u014e\u014f\7Y\2"+
		"\2\u014f\u0155\5\3\2\2\u0150\u0151\7W\2\2\u0151\u0155\5\3\2\2\u0152\u0153"+
		"\7F\2\2\u0153\u0155\5\3\2\2\u0154\u0148\3\2\2\2\u0154\u014a\3\2\2\2\u0154"+
		"\u014c\3\2\2\2\u0154\u014e\3\2\2\2\u0154\u0150\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0155Z\3\2\2\2\u0156\u0157\7C\2\2\u0157\u0158\7E\2\2\u0158\u0159"+
		"\7V\2\2\u0159\u015a\7K\2\2\u015a\u015b\7Q\2\2\u015b\u015c\7P\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015e\5\3\2\2\u015e\\\3\2\2\2\u015f\u0160\7R\2\2"+
		"\u0160\u0161\7T\2\2\u0161\u0162\7U\2\2\u0162\u0163\7C\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0165\5\3\2\2\u0165^\3\2\2\2\u0166\u0167\7R\2\2\u0167\u0168"+
		"\7T\2\2\u0168\u0169\7U\2\2\u0169\u016a\7Q\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016c\5\3\2\2\u016c`\3\2\2\2\u016d\u016e\7R\2\2\u016e\u016f\7T\2\2\u016f"+
		"\u0170\7U\2\2\u0170\u0171\7K\2\2\u0171\u0172\3\2\2\2\u0172\u0173\5\3\2"+
		"\2\u0173b\3\2\2\2\u0174\u0175\7J\2\2\u0175\u0176\7G\2\2\u0176\u0177\7"+
		"T\2\2\u0177\u0178\7G\2\2\u0178\u0179\3\2\2\2\u0179\u017a\5\3\2\2\u017a"+
		"d\3\2\2\2\u017b\u017c\7C\2\2\u017c\u017d\7P\2\2\u017d\u017e\7F\2\2\u017e"+
		"\u017f\7H\2\2\u017f\u0180\7N\2\2\u0180\u0181\7C\2\2\u0181\u0182\7I\2\2"+
		"\u0182\u0183\7U\2\2\u0183\u0184\3\2\2\2\u0184\u0185\5\3\2\2\u0185f\3\2"+
		"\2\2\u0186\u0187\7Q\2\2\u0187\u0188\7T\2\2\u0188\u0189\7H\2\2\u0189\u018a"+
		"\7N\2\2\u018a\u018b\7C\2\2\u018b\u018c\7I\2\2\u018c\u018d\7U\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\5\3\2\2\u018fh\3\2\2\2\u0190\u0191\7H\2\2\u0191"+
		"\u0192\7N\2\2\u0192\u0193\7C\2\2\u0193\u0194\7I\2\2\u0194\u0195\7X\2\2"+
		"\u0195\u0196\7C\2\2\u0196\u0197\7N\2\2\u0197\u0198\7W\2\2\u0198\u0199"+
		"\7G\2\2\u0199\u019a\3\2\2\2\u019a\u019b\5\3\2\2\u019bj\3\2\2\2\u019c\u019d"+
		"\7J\2\2\u019d\u019e\7C\2\2\u019e\u019f\7X\2\2\u019f\u01a0\7G\2\2\u01a0"+
		"\u01a1\7K\2\2\u01a1\u01a2\7V\2\2\u01a2\u01a3\7G\2\2\u01a3\u01a4\7O\2\2"+
		"\u01a4\u01a5\3\2\2\2\u01a5\u01a6\5\3\2\2\u01a6l\3\2\2\2\u01a7\u01a8\7"+
		"J\2\2\u01a8\u01a9\7C\2\2\u01a9\u01aa\7X\2\2\u01aa\u01ab\7G\2\2\u01ab\u01ac"+
		"\7K\2\2\u01ac\u01ad\7V\2\2\u01ad\u01ae\7G\2\2\u01ae\u01af\7O\2\2\u01af"+
		"\u01b0\7U\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\5\3\2\2\u01b2n\3\2\2\2\u01b3"+
		"\u01b4\7G\2\2\u01b4\u01b5\7S\2\2\u01b5\u01b6\7W\2\2\u01b6\u01b7\7C\2\2"+
		"\u01b7\u01b8\7N\2\2\u01b8\u01b9\7U\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb"+
		"\5\3\2\2\u01bbp\3\2\2\2\u01bc\u01bd\7I\2\2\u01bd\u01be\7V\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bf\u01c0\5\3\2\2\u01c0r\3\2\2\2\u01c1\u01c2\7N\2\2\u01c2\u01c3"+
		"\7V\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\5\3\2\2\u01c5t\3\2\2\2\u01c6\u01c7"+
		"\7V\2\2\u01c7\u01c8\7G\2\2\u01c8\u01c9\7N\2\2\u01c9\u01ca\7N\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01cc\5\3\2\2\u01ccv\3\2\2\2\u01cd\u01ce\7I\2\2\u01ce"+
		"\u01cf\7Q\2\2\u01cf\u01d0\7V\2\2\u01d0\u01d1\7Q\2\2\u01d1\u01d2\3\2\2"+
		"\2\u01d2\u01d3\5\3\2\2\u01d3x\3\2\2\2\u01d4\u01d5\7U\2\2\u01d5\u01d6\7"+
		"G\2\2\u01d6\u01d7\7V\2\2\u01d7\u01d8\7H\2\2\u01d8\u01d9\7N\2\2\u01d9\u01da"+
		"\7C\2\2\u01da\u01db\7I\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\5\3\2\2\u01dd"+
		"z\3\2\2\2\u01de\u01df\7T\2\2\u01df\u01e0\7G\2\2\u01e0\u01e1\7O\2\2\u01e1"+
		"\u01e2\7H\2\2\u01e2\u01e3\7N\2\2\u01e3\u01e4\7C\2\2\u01e4\u01e5\7I\2\2"+
		"\u01e5\u01e6\3\2\2\2\u01e6\u01e7\5\3\2\2\u01e7|\3\2\2\2\u01e8\u01e9\7"+
		"V\2\2\u01e9\u01ea\7C\2\2\u01ea\u01eb\7M\2\2\u01eb\u01ec\7G\2\2\u01ec\u01ed"+
		"\3\2\2\2\u01ed\u01ee\5\3\2\2\u01ee~\3\2\2\2\u01ef\u01f0\7R\2\2\u01f0\u01f1"+
		"\7N\2\2\u01f1\u01f2\7C\2\2\u01f2\u01f3\7E\2\2\u01f3\u01f4\7G\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f6\5\3\2\2\u01f6\u0080\3\2\2\2\u01f7\u01f8\7U"+
		"\2\2\u01f8\u01f9\7G\2\2\u01f9\u01fa\7V\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc"+
		"\5\3\2\2\u01fc\u0082\3\2\2\2\t\2\u00c6\u00cb\u00d0\u00d5\u00dd\u0154\3"+
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