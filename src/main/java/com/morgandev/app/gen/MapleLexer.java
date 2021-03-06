// Generated from C:/Users/Morgan/IdeaProjects/MapleAntlr/src/main/antlr/com/morgandev/maple/Maple\Maple.g4 by ANTLR 4.7.2
package com.morgandev.app.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MapleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, K_SELECT=27, K_INSERT=28, K_UPDATE=29, K_LEFT_JOIN=30, 
		K_RIGHT_JOIN=31, K_JOIN=32, K_WHERE=33, K_PK=34, K_AND=35, K_NOTBETWEEN=36, 
		K_BETWEEN=37, K_IF=38, K_ELSEIF=39, K_ELSE=40, K_IN=41, K_INNER=42, K_INTO=43, 
		K_IS=44, K_ISNULL=45, K_ISNOTNULL=46, K_ISNOT=47, K_NOTIN=48, K_NOTLIKE=49, 
		K_LIKE=50, K_LIMIT=51, K_NOT=52, K_NOTNULL=53, K_NULL=54, K_OF=55, K_ON=56, 
		K_OR=57, K_PRINT=58, K_WHEN=59, K_WITH=60, K_WITHOUT=61, IDENTIFIER=62, 
		NUMERIC_LITERAL=63, STRING_LITERAL=64, SINGLE_LINE_COMMENT=65, MULTILINE_COMMENT=66, 
		SPACES=67, UNEXPECTED_CHAR=68;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "K_SELECT", "K_INSERT", "K_UPDATE", "K_LEFT_JOIN", "K_RIGHT_JOIN", 
			"K_JOIN", "K_WHERE", "K_PK", "K_AND", "K_NOTBETWEEN", "K_BETWEEN", "K_IF", 
			"K_ELSEIF", "K_ELSE", "K_IN", "K_INNER", "K_INTO", "K_IS", "K_ISNULL", 
			"K_ISNOTNULL", "K_ISNOT", "K_NOTIN", "K_NOTLIKE", "K_LIKE", "K_LIMIT", 
			"K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_ON", "K_OR", "K_PRINT", "K_WHEN", 
			"K_WITH", "K_WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL", "STRING_LITERAL", 
			"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR", 
			"DIGIT", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
			"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "','", "')'", "'='", "'++'", "'--'", 
			"'+='", "'-='", "'.'", "'*'", "'/'", "'%'", "'+'", "'-'", "'=='", "'!='", 
			"'<'", "'<='", "'>'", "'>='", "':?'", "'<?'", "'?>'", "'->'", "'<-'", 
			"'<<-'", "'<<>'", "'<>>'", "'<>'", "'?'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "K_SELECT", "K_INSERT", "K_UPDATE", "K_LEFT_JOIN", 
			"K_RIGHT_JOIN", "K_JOIN", "K_WHERE", "K_PK", "K_AND", "K_NOTBETWEEN", 
			"K_BETWEEN", "K_IF", "K_ELSEIF", "K_ELSE", "K_IN", "K_INNER", "K_INTO", 
			"K_IS", "K_ISNULL", "K_ISNOTNULL", "K_ISNOT", "K_NOTIN", "K_NOTLIKE", 
			"K_LIKE", "K_LIMIT", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_ON", 
			"K_OR", "K_PRINT", "K_WHEN", "K_WITH", "K_WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL", 
			"STRING_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
			"UNEXPECTED_CHAR"
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


	public MapleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Maple.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u0270\b\1\4\2\t"+
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
		"`\t`\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\6"+
		"%\u0120\n%\r%\16%\u0121\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3.\3.\3.\6.\u0151\n.\r.\16.\u0152\3.\3.\3.\3.\3.\3/\3/\6"+
		"/\u015c\n/\r/\16/\u015d\3/\3/\3\60\3\60\3\60\6\60\u0165\n\60\r\60\16\60"+
		"\u0166\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\6\61\u0171\n\61\r\61\16"+
		"\61\u0172\3\61\3\61\3\61\3\62\3\62\3\62\3\62\6\62\u017c\n\62\r\62\16\62"+
		"\u017d\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\6\66\u0195\n\66\r\66\16\66\u0196"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\39\39\39\3"+
		":\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3?\3?\3?\3?\7?\u01c8\n?\f?\16?\u01cb\13?\3?\3?\3?\3?\3?\7?"+
		"\u01d2\n?\f?\16?\u01d5\13?\3?\3?\3?\7?\u01da\n?\f?\16?\u01dd\13?\5?\u01df"+
		"\n?\3@\6@\u01e2\n@\r@\16@\u01e3\3@\3@\7@\u01e8\n@\f@\16@\u01eb\13@\5@"+
		"\u01ed\n@\3@\3@\5@\u01f1\n@\3@\6@\u01f4\n@\r@\16@\u01f5\5@\u01f8\n@\3"+
		"@\3@\6@\u01fc\n@\r@\16@\u01fd\3@\3@\5@\u0202\n@\3@\6@\u0205\n@\r@\16@"+
		"\u0206\5@\u0209\n@\5@\u020b\n@\3A\3A\3A\3A\3A\3A\7A\u0213\nA\fA\16A\u0216"+
		"\13A\3A\3A\3B\3B\3B\3B\7B\u021e\nB\fB\16B\u0221\13B\3B\3B\3C\3C\3C\3C"+
		"\7C\u0229\nC\fC\16C\u022c\13C\3C\3C\3C\5C\u0231\nC\3C\3C\3D\3D\3D\3D\3"+
		"E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3"+
		"P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3"+
		"\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3\u022a\2a\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2"+
		"\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5"+
		"\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7"+
		"\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\3\2%\3\2$$\3\2bb\5\2C\\aac|\6\2\62"+
		";C\\aac|\4\2--//\4\2))^^\4\2\f\f\17\17\5\2\13\r\17\17\"\"\3\2\62;\4\2"+
		"CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4"+
		"\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTt"+
		"t\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2"+
		"\u0273\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u00c1\3\2\2\2\5"+
		"\u00c3\3\2\2\2\7\u00c5\3\2\2\2\t\u00c7\3\2\2\2\13\u00c9\3\2\2\2\r\u00cb"+
		"\3\2\2\2\17\u00cd\3\2\2\2\21\u00cf\3\2\2\2\23\u00d2\3\2\2\2\25\u00d5\3"+
		"\2\2\2\27\u00d8\3\2\2\2\31\u00db\3\2\2\2\33\u00dd\3\2\2\2\35\u00df\3\2"+
		"\2\2\37\u00e1\3\2\2\2!\u00e3\3\2\2\2#\u00e5\3\2\2\2%\u00e7\3\2\2\2\'\u00ea"+
		"\3\2\2\2)\u00ed\3\2\2\2+\u00ef\3\2\2\2-\u00f2\3\2\2\2/\u00f4\3\2\2\2\61"+
		"\u00f7\3\2\2\2\63\u00fa\3\2\2\2\65\u00fd\3\2\2\2\67\u0100\3\2\2\29\u0103"+
		"\3\2\2\2;\u0106\3\2\2\2=\u010a\3\2\2\2?\u010e\3\2\2\2A\u0112\3\2\2\2C"+
		"\u0115\3\2\2\2E\u0117\3\2\2\2G\u0119\3\2\2\2I\u011d\3\2\2\2K\u0125\3\2"+
		"\2\2M\u012d\3\2\2\2O\u0130\3\2\2\2Q\u0137\3\2\2\2S\u013c\3\2\2\2U\u013f"+
		"\3\2\2\2W\u0145\3\2\2\2Y\u014a\3\2\2\2[\u014d\3\2\2\2]\u0159\3\2\2\2_"+
		"\u0161\3\2\2\2a\u016c\3\2\2\2c\u0177\3\2\2\2e\u0181\3\2\2\2g\u0186\3\2"+
		"\2\2i\u018c\3\2\2\2k\u0190\3\2\2\2m\u019d\3\2\2\2o\u01a2\3\2\2\2q\u01a5"+
		"\3\2\2\2s\u01a8\3\2\2\2u\u01ab\3\2\2\2w\u01b1\3\2\2\2y\u01b6\3\2\2\2{"+
		"\u01bb\3\2\2\2}\u01de\3\2\2\2\177\u020a\3\2\2\2\u0081\u020c\3\2\2\2\u0083"+
		"\u0219\3\2\2\2\u0085\u0224\3\2\2\2\u0087\u0234\3\2\2\2\u0089\u0238\3\2"+
		"\2\2\u008b\u023a\3\2\2\2\u008d\u023c\3\2\2\2\u008f\u023e\3\2\2\2\u0091"+
		"\u0240\3\2\2\2\u0093\u0242\3\2\2\2\u0095\u0244\3\2\2\2\u0097\u0246\3\2"+
		"\2\2\u0099\u0248\3\2\2\2\u009b\u024a\3\2\2\2\u009d\u024c\3\2\2\2\u009f"+
		"\u024e\3\2\2\2\u00a1\u0250\3\2\2\2\u00a3\u0252\3\2\2\2\u00a5\u0254\3\2"+
		"\2\2\u00a7\u0256\3\2\2\2\u00a9\u0258\3\2\2\2\u00ab\u025a\3\2\2\2\u00ad"+
		"\u025c\3\2\2\2\u00af\u025e\3\2\2\2\u00b1\u0260\3\2\2\2\u00b3\u0262\3\2"+
		"\2\2\u00b5\u0264\3\2\2\2\u00b7\u0266\3\2\2\2\u00b9\u0268\3\2\2\2\u00bb"+
		"\u026a\3\2\2\2\u00bd\u026c\3\2\2\2\u00bf\u026e\3\2\2\2\u00c1\u00c2\7="+
		"\2\2\u00c2\4\3\2\2\2\u00c3\u00c4\7}\2\2\u00c4\6\3\2\2\2\u00c5\u00c6\7"+
		"\177\2\2\u00c6\b\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8\n\3\2\2\2\u00c9\u00ca"+
		"\7.\2\2\u00ca\f\3\2\2\2\u00cb\u00cc\7+\2\2\u00cc\16\3\2\2\2\u00cd\u00ce"+
		"\7?\2\2\u00ce\20\3\2\2\2\u00cf\u00d0\7-\2\2\u00d0\u00d1\7-\2\2\u00d1\22"+
		"\3\2\2\2\u00d2\u00d3\7/\2\2\u00d3\u00d4\7/\2\2\u00d4\24\3\2\2\2\u00d5"+
		"\u00d6\7-\2\2\u00d6\u00d7\7?\2\2\u00d7\26\3\2\2\2\u00d8\u00d9\7/\2\2\u00d9"+
		"\u00da\7?\2\2\u00da\30\3\2\2\2\u00db\u00dc\7\60\2\2\u00dc\32\3\2\2\2\u00dd"+
		"\u00de\7,\2\2\u00de\34\3\2\2\2\u00df\u00e0\7\61\2\2\u00e0\36\3\2\2\2\u00e1"+
		"\u00e2\7\'\2\2\u00e2 \3\2\2\2\u00e3\u00e4\7-\2\2\u00e4\"\3\2\2\2\u00e5"+
		"\u00e6\7/\2\2\u00e6$\3\2\2\2\u00e7\u00e8\7?\2\2\u00e8\u00e9\7?\2\2\u00e9"+
		"&\3\2\2\2\u00ea\u00eb\7#\2\2\u00eb\u00ec\7?\2\2\u00ec(\3\2\2\2\u00ed\u00ee"+
		"\7>\2\2\u00ee*\3\2\2\2\u00ef\u00f0\7>\2\2\u00f0\u00f1\7?\2\2\u00f1,\3"+
		"\2\2\2\u00f2\u00f3\7@\2\2\u00f3.\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6\60\3\2\2\2\u00f7\u00f8\7<\2\2\u00f8\u00f9\7A\2\2\u00f9\62"+
		"\3\2\2\2\u00fa\u00fb\7>\2\2\u00fb\u00fc\7A\2\2\u00fc\64\3\2\2\2\u00fd"+
		"\u00fe\7A\2\2\u00fe\u00ff\7@\2\2\u00ff\66\3\2\2\2\u0100\u0101\7/\2\2\u0101"+
		"\u0102\7@\2\2\u01028\3\2\2\2\u0103\u0104\7>\2\2\u0104\u0105\7/\2\2\u0105"+
		":\3\2\2\2\u0106\u0107\7>\2\2\u0107\u0108\7>\2\2\u0108\u0109\7/\2\2\u0109"+
		"<\3\2\2\2\u010a\u010b\7>\2\2\u010b\u010c\7>\2\2\u010c\u010d\7@\2\2\u010d"+
		">\3\2\2\2\u010e\u010f\7>\2\2\u010f\u0110\7@\2\2\u0110\u0111\7@\2\2\u0111"+
		"@\3\2\2\2\u0112\u0113\7>\2\2\u0113\u0114\7@\2\2\u0114B\3\2\2\2\u0115\u0116"+
		"\7A\2\2\u0116D\3\2\2\2\u0117\u0118\7&\2\2\u0118F\3\2\2\2\u0119\u011a\5"+
		"\u008dG\2\u011a\u011b\5\u00a7T\2\u011b\u011c\5\u0093J\2\u011cH\3\2\2\2"+
		"\u011d\u011f\5i\65\2\u011e\u0120\5\u0087D\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0124\5K&\2\u0124J\3\2\2\2\u0125\u0126\5\u008fH\2\u0126\u0127"+
		"\5\u0095K\2\u0127\u0128\5\u00b3Z\2\u0128\u0129\5\u00b9]\2\u0129\u012a"+
		"\5\u0095K\2\u012a\u012b\5\u0095K\2\u012b\u012c\5\u00a7T\2\u012cL\3\2\2"+
		"\2\u012d\u012e\5\u009dO\2\u012e\u012f\5\u0097L\2\u012fN\3\2\2\2\u0130"+
		"\u0131\5\u0095K\2\u0131\u0132\5\u00a3R\2\u0132\u0133\5\u00b1Y\2\u0133"+
		"\u0134\5\u0095K\2\u0134\u0135\5\u009dO\2\u0135\u0136\5\u0097L\2\u0136"+
		"P\3\2\2\2\u0137\u0138\5\u0095K\2\u0138\u0139\5\u00a3R\2\u0139\u013a\5"+
		"\u00b1Y\2\u013a\u013b\5\u0095K\2\u013bR\3\2\2\2\u013c\u013d\5\u009dO\2"+
		"\u013d\u013e\5\u00a7T\2\u013eT\3\2\2\2\u013f\u0140\5\u009dO\2\u0140\u0141"+
		"\5\u00a7T\2\u0141\u0142\5\u00a7T\2\u0142\u0143\5\u0095K\2\u0143\u0144"+
		"\5\u00afX\2\u0144V\3\2\2\2\u0145\u0146\5\u009dO\2\u0146\u0147\5\u00a7"+
		"T\2\u0147\u0148\5\u00b3Z\2\u0148\u0149\5\u00a9U\2\u0149X\3\2\2\2\u014a"+
		"\u014b\5\u009dO\2\u014b\u014c\5\u00b1Y\2\u014cZ\3\2\2\2\u014d\u014e\5"+
		"\u009dO\2\u014e\u0150\5\u00b1Y\2\u014f\u0151\5\u0087D\2\u0150\u014f\3"+
		"\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\5\u00a7T\2\u0155\u0156\5\u00b5[\2\u0156\u0157"+
		"\5\u00a3R\2\u0157\u0158\5\u00a3R\2\u0158\\\3\2\2\2\u0159\u015b\5_\60\2"+
		"\u015a\u015c\5\u0087D\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\5m"+
		"\67\2\u0160^\3\2\2\2\u0161\u0162\5\u009dO\2\u0162\u0164\5\u00b1Y\2\u0163"+
		"\u0165\5\u0087D\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\5\u00a7T"+
		"\2\u0169\u016a\5\u00a9U\2\u016a\u016b\5\u00b3Z\2\u016b`\3\2\2\2\u016c"+
		"\u016d\5\u00a7T\2\u016d\u016e\5\u00a9U\2\u016e\u0170\5\u00b3Z\2\u016f"+
		"\u0171\5\u0087D\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\5\u009dO"+
		"\2\u0175\u0176\5\u00a7T\2\u0176b\3\2\2\2\u0177\u0178\5\u00a7T\2\u0178"+
		"\u0179\5\u00a9U\2\u0179\u017b\5\u00b3Z\2\u017a\u017c\5\u0087D\2\u017b"+
		"\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u017f\3\2\2\2\u017f\u0180\5e\63\2\u0180d\3\2\2\2\u0181\u0182"+
		"\5\u00a3R\2\u0182\u0183\5\u009dO\2\u0183\u0184\5\u00a1Q\2\u0184\u0185"+
		"\5\u0095K\2\u0185f\3\2\2\2\u0186\u0187\5\u00a3R\2\u0187\u0188\5\u009d"+
		"O\2\u0188\u0189\5\u00a5S\2\u0189\u018a\5\u009dO\2\u018a\u018b\5\u00b3"+
		"Z\2\u018bh\3\2\2\2\u018c\u018d\5\u00a7T\2\u018d\u018e\5\u00a9U\2\u018e"+
		"\u018f\5\u00b3Z\2\u018fj\3\2\2\2\u0190\u0191\5\u00a7T\2\u0191\u0192\5"+
		"\u00a9U\2\u0192\u0194\5\u00b3Z\2\u0193\u0195\5\u0087D\2\u0194\u0193\3"+
		"\2\2\2\u0195\u0196\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u0199\5\u00a7T\2\u0199\u019a\5\u00b5[\2\u019a\u019b"+
		"\5\u00a3R\2\u019b\u019c\5\u00a3R\2\u019cl\3\2\2\2\u019d\u019e\5\u00a7"+
		"T\2\u019e\u019f\5\u00b5[\2\u019f\u01a0\5\u00a3R\2\u01a0\u01a1\5\u00a3"+
		"R\2\u01a1n\3\2\2\2\u01a2\u01a3\5\u00a9U\2\u01a3\u01a4\5\u0097L\2\u01a4"+
		"p\3\2\2\2\u01a5\u01a6\5\u00a9U\2\u01a6\u01a7\5\u00a7T\2\u01a7r\3\2\2\2"+
		"\u01a8\u01a9\5\u00a9U\2\u01a9\u01aa\5\u00afX\2\u01aat\3\2\2\2\u01ab\u01ac"+
		"\5\u00abV\2\u01ac\u01ad\5\u00afX\2\u01ad\u01ae\5\u009dO\2\u01ae\u01af"+
		"\5\u00a7T\2\u01af\u01b0\5\u00b3Z\2\u01b0v\3\2\2\2\u01b1\u01b2\5\u00b9"+
		"]\2\u01b2\u01b3\5\u009bN\2\u01b3\u01b4\5\u0095K\2\u01b4\u01b5\5\u00a7"+
		"T\2\u01b5x\3\2\2\2\u01b6\u01b7\5\u00b9]\2\u01b7\u01b8\5\u009dO\2\u01b8"+
		"\u01b9\5\u00b3Z\2\u01b9\u01ba\5\u009bN\2\u01baz\3\2\2\2\u01bb\u01bc\5"+
		"\u00b9]\2\u01bc\u01bd\5\u009dO\2\u01bd\u01be\5\u00b3Z\2\u01be\u01bf\5"+
		"\u009bN\2\u01bf\u01c0\5\u00a9U\2\u01c0\u01c1\5\u00b5[\2\u01c1\u01c2\5"+
		"\u00b3Z\2\u01c2|\3\2\2\2\u01c3\u01c9\7$\2\2\u01c4\u01c8\n\2\2\2\u01c5"+
		"\u01c6\7$\2\2\u01c6\u01c8\7$\2\2\u01c7\u01c4\3\2\2\2\u01c7\u01c5\3\2\2"+
		"\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc"+
		"\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01df\7$\2\2\u01cd\u01d3\7b\2\2\u01ce"+
		"\u01d2\n\3\2\2\u01cf\u01d0\7b\2\2\u01d0\u01d2\7b\2\2\u01d1\u01ce\3\2\2"+
		"\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01df\7b\2\2\u01d7"+
		"\u01db\t\4\2\2\u01d8\u01da\t\5\2\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2"+
		"\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01de\u01c3\3\2\2\2\u01de\u01cd\3\2\2\2\u01de\u01d7\3\2"+
		"\2\2\u01df~\3\2\2\2\u01e0\u01e2\5\u008bF\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01ec\3\2\2\2\u01e5"+
		"\u01e9\7\60\2\2\u01e6\u01e8\5\u008bF\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb"+
		"\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01ec\u01e5\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f7\3\2"+
		"\2\2\u01ee\u01f0\5\u0095K\2\u01ef\u01f1\t\6\2\2\u01f0\u01ef\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f4\5\u008bF\2\u01f3\u01f2"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f8\3\2\2\2\u01f7\u01ee\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u020b\3\2"+
		"\2\2\u01f9\u01fb\7\60\2\2\u01fa\u01fc\5\u008bF\2\u01fb\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0208\3\2"+
		"\2\2\u01ff\u0201\5\u0095K\2\u0200\u0202\t\6\2\2\u0201\u0200\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u0205\5\u008bF\2\u0204\u0203"+
		"\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0209\3\2\2\2\u0208\u01ff\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2"+
		"\2\2\u020a\u01e1\3\2\2\2\u020a\u01f9\3\2\2\2\u020b\u0080\3\2\2\2\u020c"+
		"\u0214\7)\2\2\u020d\u020e\7^\2\2\u020e\u0213\13\2\2\2\u020f\u0210\7)\2"+
		"\2\u0210\u0213\7)\2\2\u0211\u0213\n\7\2\2\u0212\u020d\3\2\2\2\u0212\u020f"+
		"\3\2\2\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0218\7)"+
		"\2\2\u0218\u0082\3\2\2\2\u0219\u021a\7/\2\2\u021a\u021b\7/\2\2\u021b\u021f"+
		"\3\2\2\2\u021c\u021e\n\b\2\2\u021d\u021c\3\2\2\2\u021e\u0221\3\2\2\2\u021f"+
		"\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\3\2\2\2\u0221\u021f\3\2"+
		"\2\2\u0222\u0223\bB\2\2\u0223\u0084\3\2\2\2\u0224\u0225\7\61\2\2\u0225"+
		"\u0226\7,\2\2\u0226\u022a\3\2\2\2\u0227\u0229\13\2\2\2\u0228\u0227\3\2"+
		"\2\2\u0229\u022c\3\2\2\2\u022a\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b"+
		"\u0230\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\7,\2\2\u022e\u0231\7\61"+
		"\2\2\u022f\u0231\7\2\2\3\u0230\u022d\3\2\2\2\u0230\u022f\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0233\bC\2\2\u0233\u0086\3\2\2\2\u0234\u0235\t\t"+
		"\2\2\u0235\u0236\3\2\2\2\u0236\u0237\bD\2\2\u0237\u0088\3\2\2\2\u0238"+
		"\u0239\13\2\2\2\u0239\u008a\3\2\2\2\u023a\u023b\t\n\2\2\u023b\u008c\3"+
		"\2\2\2\u023c\u023d\t\13\2\2\u023d\u008e\3\2\2\2\u023e\u023f\t\f\2\2\u023f"+
		"\u0090\3\2\2\2\u0240\u0241\t\r\2\2\u0241\u0092\3\2\2\2\u0242\u0243\t\16"+
		"\2\2\u0243\u0094\3\2\2\2\u0244\u0245\t\17\2\2\u0245\u0096\3\2\2\2\u0246"+
		"\u0247\t\20\2\2\u0247\u0098\3\2\2\2\u0248\u0249\t\21\2\2\u0249\u009a\3"+
		"\2\2\2\u024a\u024b\t\22\2\2\u024b\u009c\3\2\2\2\u024c\u024d\t\23\2\2\u024d"+
		"\u009e\3\2\2\2\u024e\u024f\t\24\2\2\u024f\u00a0\3\2\2\2\u0250\u0251\t"+
		"\25\2\2\u0251\u00a2\3\2\2\2\u0252\u0253\t\26\2\2\u0253\u00a4\3\2\2\2\u0254"+
		"\u0255\t\27\2\2\u0255\u00a6\3\2\2\2\u0256\u0257\t\30\2\2\u0257\u00a8\3"+
		"\2\2\2\u0258\u0259\t\31\2\2\u0259\u00aa\3\2\2\2\u025a\u025b\t\32\2\2\u025b"+
		"\u00ac\3\2\2\2\u025c\u025d\t\33\2\2\u025d\u00ae\3\2\2\2\u025e\u025f\t"+
		"\34\2\2\u025f\u00b0\3\2\2\2\u0260\u0261\t\35\2\2\u0261\u00b2\3\2\2\2\u0262"+
		"\u0263\t\36\2\2\u0263\u00b4\3\2\2\2\u0264\u0265\t\37\2\2\u0265\u00b6\3"+
		"\2\2\2\u0266\u0267\t \2\2\u0267\u00b8\3\2\2\2\u0268\u0269\t!\2\2\u0269"+
		"\u00ba\3\2\2\2\u026a\u026b\t\"\2\2\u026b\u00bc\3\2\2\2\u026c\u026d\t#"+
		"\2\2\u026d\u00be\3\2\2\2\u026e\u026f\t$\2\2\u026f\u00c0\3\2\2\2 \2\u0121"+
		"\u0152\u015d\u0166\u0172\u017d\u0196\u01c7\u01c9\u01d1\u01d3\u01db\u01de"+
		"\u01e3\u01e9\u01ec\u01f0\u01f5\u01f7\u01fd\u0201\u0206\u0208\u020a\u0212"+
		"\u0214\u021f\u022a\u0230\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}