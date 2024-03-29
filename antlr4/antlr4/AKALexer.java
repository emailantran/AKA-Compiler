// Generated from AKA.g4 by ANTLR 4.4

    package antlr4;
    import java.util.HashMap;
    import java.util.Map;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AKALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, NUMBER=20, BOOL=21, STRING=22, MAIN=23, DISPLAY=24, 
		IF=25, WHILE=26, ELSE=27, ELSEIF=28, GUARD=29, DEF=30, NOT=31, TRUE=32, 
		FALSE=33, AND=34, OR=35, NEWLINE=36, WS=37, DOUBLEQUOTE=38, STRINGWORD=39, 
		COMMENT=40, IDENTIFIER=41, INTEGER=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'"
	};
	public static final String[] ruleNames = {
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "NUMBER", "BOOL", "STRING", "MAIN", "DISPLAY", "IF", "WHILE", 
		"ELSE", "ELSEIF", "GUARD", "DEF", "NOT", "TRUE", "FALSE", "AND", "OR", 
		"NEWLINE", "WS", "DOUBLEQUOTE", "STRINGWORD", "COMMENT", "COMMENT_CHARACTER", 
		"STRING_CHAR", "IDENTIFIER", "INTEGER", "A", "B", "C", "D", "E", "F", 
		"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
		"U", "V", "W", "X", "Y", "Z"
	};


	public AKALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AKA.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u0175\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3"+
		"%\5%\u010f\n%\3%\3%\3%\3%\3&\6&\u0116\n&\r&\16&\u0117\3&\3&\3\'\3\'\3"+
		"(\3(\7(\u0120\n(\f(\16(\u0123\13(\3(\3(\3)\3)\7)\u0129\n)\f)\16)\u012c"+
		"\13)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\7,\u0138\n,\f,\16,\u013b\13,\3-\6-"+
		"\u013e\n-\r-\16-\u013f\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;"+
		"\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G"+
		"\3G\2\2H\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W+Y,[\2]\2_\2a\2c\2e\2g\2i\2k\2"+
		"m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089"+
		"\2\u008b\2\u008d\2\3\2\"\4\2\13\13\"\"\3\2&&\3\2$$\4\2C\\c|\5\2\62;C\\"+
		"c|\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2"+
		"JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4"+
		"\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{"+
		"{\4\2\\\\||\u015e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\3\u008f\3\2\2\2\5\u0091\3\2\2\2\7\u0093\3\2"+
		"\2\2\t\u0096\3\2\2\2\13\u0098\3\2\2\2\r\u009a\3\2\2\2\17\u009c\3\2\2\2"+
		"\21\u009f\3\2\2\2\23\u00a1\3\2\2\2\25\u00a3\3\2\2\2\27\u00a5\3\2\2\2\31"+
		"\u00a7\3\2\2\2\33\u00aa\3\2\2\2\35\u00ac\3\2\2\2\37\u00ae\3\2\2\2!\u00b0"+
		"\3\2\2\2#\u00b2\3\2\2\2%\u00b4\3\2\2\2\'\u00b6\3\2\2\2)\u00b8\3\2\2\2"+
		"+\u00bf\3\2\2\2-\u00c4\3\2\2\2/\u00cb\3\2\2\2\61\u00d0\3\2\2\2\63\u00d8"+
		"\3\2\2\2\65\u00db\3\2\2\2\67\u00e1\3\2\2\29\u00e6\3\2\2\2;\u00ed\3\2\2"+
		"\2=\u00f3\3\2\2\2?\u00f7\3\2\2\2A\u00fb\3\2\2\2C\u0100\3\2\2\2E\u0106"+
		"\3\2\2\2G\u010a\3\2\2\2I\u010e\3\2\2\2K\u0115\3\2\2\2M\u011b\3\2\2\2O"+
		"\u011d\3\2\2\2Q\u0126\3\2\2\2S\u0131\3\2\2\2U\u0133\3\2\2\2W\u0135\3\2"+
		"\2\2Y\u013d\3\2\2\2[\u0141\3\2\2\2]\u0143\3\2\2\2_\u0145\3\2\2\2a\u0147"+
		"\3\2\2\2c\u0149\3\2\2\2e\u014b\3\2\2\2g\u014d\3\2\2\2i\u014f\3\2\2\2k"+
		"\u0151\3\2\2\2m\u0153\3\2\2\2o\u0155\3\2\2\2q\u0157\3\2\2\2s\u0159\3\2"+
		"\2\2u\u015b\3\2\2\2w\u015d\3\2\2\2y\u015f\3\2\2\2{\u0161\3\2\2\2}\u0163"+
		"\3\2\2\2\177\u0165\3\2\2\2\u0081\u0167\3\2\2\2\u0083\u0169\3\2\2\2\u0085"+
		"\u016b\3\2\2\2\u0087\u016d\3\2\2\2\u0089\u016f\3\2\2\2\u008b\u0171\3\2"+
		"\2\2\u008d\u0173\3\2\2\2\u008f\u0090\7\61\2\2\u0090\4\3\2\2\2\u0091\u0092"+
		"\7<\2\2\u0092\6\3\2\2\2\u0093\u0094\7@\2\2\u0094\u0095\7?\2\2\u0095\b"+
		"\3\2\2\2\u0096\u0097\7=\2\2\u0097\n\3\2\2\2\u0098\u0099\7}\2\2\u0099\f"+
		"\3\2\2\2\u009a\u009b\7>\2\2\u009b\16\3\2\2\2\u009c\u009d\7?\2\2\u009d"+
		"\u009e\7?\2\2\u009e\20\3\2\2\2\u009f\u00a0\7?\2\2\u00a0\22\3\2\2\2\u00a1"+
		"\u00a2\7\177\2\2\u00a2\24\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4\26\3\2\2\2"+
		"\u00a5\u00a6\7\u0080\2\2\u00a6\30\3\2\2\2\u00a7\u00a8\7>\2\2\u00a8\u00a9"+
		"\7?\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7*\2\2\u00ab\34\3\2\2\2\u00ac\u00ad"+
		"\7+\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7,\2\2\u00af \3\2\2\2\u00b0\u00b1"+
		"\7-\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7.\2\2\u00b3$\3\2\2\2\u00b4\u00b5"+
		"\7/\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7\60\2\2\u00b7(\3\2\2\2\u00b8\u00b9"+
		"\5u;\2\u00b9\u00ba\5\u0083B\2\u00ba\u00bb\5s:\2\u00bb\u00bc\5]/\2\u00bc"+
		"\u00bd\5c\62\2\u00bd\u00be\5}?\2\u00be*\3\2\2\2\u00bf\u00c0\5]/\2\u00c0"+
		"\u00c1\5w<\2\u00c1\u00c2\5w<\2\u00c2\u00c3\5q9\2\u00c3,\3\2\2\2\u00c4"+
		"\u00c5\5\177@\2\u00c5\u00c6\5\u0081A\2\u00c6\u00c7\5}?\2\u00c7\u00c8\5"+
		"k\66\2\u00c8\u00c9\5u;\2\u00c9\u00ca\5g\64\2\u00ca.\3\2\2\2\u00cb\u00cc"+
		"\5s:\2\u00cc\u00cd\5[.\2\u00cd\u00ce\5k\66\2\u00ce\u00cf\5u;\2\u00cf\60"+
		"\3\2\2\2\u00d0\u00d1\5a\61\2\u00d1\u00d2\5k\66\2\u00d2\u00d3\5\177@\2"+
		"\u00d3\u00d4\5y=\2\u00d4\u00d5\5q9\2\u00d5\u00d6\5[.\2\u00d6\u00d7\5\u008b"+
		"F\2\u00d7\62\3\2\2\2\u00d8\u00d9\5k\66\2\u00d9\u00da\5e\63\2\u00da\64"+
		"\3\2\2\2\u00db\u00dc\5\u0087D\2\u00dc\u00dd\5i\65\2\u00dd\u00de\5k\66"+
		"\2\u00de\u00df\5q9\2\u00df\u00e0\5c\62\2\u00e0\66\3\2\2\2\u00e1\u00e2"+
		"\5c\62\2\u00e2\u00e3\5q9\2\u00e3\u00e4\5\177@\2\u00e4\u00e5\5c\62\2\u00e5"+
		"8\3\2\2\2\u00e6\u00e7\5c\62\2\u00e7\u00e8\5q9\2\u00e8\u00e9\5\177@\2\u00e9"+
		"\u00ea\5c\62\2\u00ea\u00eb\5k\66\2\u00eb\u00ec\5e\63\2\u00ec:\3\2\2\2"+
		"\u00ed\u00ee\5g\64\2\u00ee\u00ef\5\u0083B\2\u00ef\u00f0\5[.\2\u00f0\u00f1"+
		"\5}?\2\u00f1\u00f2\5a\61\2\u00f2<\3\2\2\2\u00f3\u00f4\5a\61\2\u00f4\u00f5"+
		"\5c\62\2\u00f5\u00f6\5e\63\2\u00f6>\3\2\2\2\u00f7\u00f8\5u;\2\u00f8\u00f9"+
		"\5w<\2\u00f9\u00fa\5\u0081A\2\u00fa@\3\2\2\2\u00fb\u00fc\5\u0081A\2\u00fc"+
		"\u00fd\5}?\2\u00fd\u00fe\5\u0083B\2\u00fe\u00ff\5c\62\2\u00ffB\3\2\2\2"+
		"\u0100\u0101\5e\63\2\u0101\u0102\5[.\2\u0102\u0103\5q9\2\u0103\u0104\5"+
		"\177@\2\u0104\u0105\5c\62\2\u0105D\3\2\2\2\u0106\u0107\5[.\2\u0107\u0108"+
		"\5u;\2\u0108\u0109\5a\61\2\u0109F\3\2\2\2\u010a\u010b\5w<\2\u010b\u010c"+
		"\5}?\2\u010cH\3\2\2\2\u010d\u010f\7\17\2\2\u010e\u010d\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\f\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\b%\2\2\u0113J\3\2\2\2\u0114\u0116\t\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011a\b&\2\2\u011aL\3\2\2\2\u011b\u011c\7$\2\2\u011cN\3\2\2"+
		"\2\u011d\u0121\5M\'\2\u011e\u0120\5U+\2\u011f\u011e\3\2\2\2\u0120\u0123"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\u0125\5M\'\2\u0125P\3\2\2\2\u0126\u012a\7&\2\2\u0127"+
		"\u0129\5S*\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2"+
		"\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e"+
		"\7&\2\2\u012e\u012f\3\2\2\2\u012f\u0130\b)\2\2\u0130R\3\2\2\2\u0131\u0132"+
		"\n\3\2\2\u0132T\3\2\2\2\u0133\u0134\n\4\2\2\u0134V\3\2\2\2\u0135\u0139"+
		"\t\5\2\2\u0136\u0138\t\6\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013aX\3\2\2\2\u013b\u0139\3\2\2\2"+
		"\u013c\u013e\t\7\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140Z\3\2\2\2\u0141\u0142\t\b\2\2\u0142"+
		"\\\3\2\2\2\u0143\u0144\t\t\2\2\u0144^\3\2\2\2\u0145\u0146\t\n\2\2\u0146"+
		"`\3\2\2\2\u0147\u0148\t\13\2\2\u0148b\3\2\2\2\u0149\u014a\t\f\2\2\u014a"+
		"d\3\2\2\2\u014b\u014c\t\r\2\2\u014cf\3\2\2\2\u014d\u014e\t\16\2\2\u014e"+
		"h\3\2\2\2\u014f\u0150\t\17\2\2\u0150j\3\2\2\2\u0151\u0152\t\20\2\2\u0152"+
		"l\3\2\2\2\u0153\u0154\t\21\2\2\u0154n\3\2\2\2\u0155\u0156\t\22\2\2\u0156"+
		"p\3\2\2\2\u0157\u0158\t\23\2\2\u0158r\3\2\2\2\u0159\u015a\t\24\2\2\u015a"+
		"t\3\2\2\2\u015b\u015c\t\25\2\2\u015cv\3\2\2\2\u015d\u015e\t\26\2\2\u015e"+
		"x\3\2\2\2\u015f\u0160\t\27\2\2\u0160z\3\2\2\2\u0161\u0162\t\30\2\2\u0162"+
		"|\3\2\2\2\u0163\u0164\t\31\2\2\u0164~\3\2\2\2\u0165\u0166\t\32\2\2\u0166"+
		"\u0080\3\2\2\2\u0167\u0168\t\33\2\2\u0168\u0082\3\2\2\2\u0169\u016a\t"+
		"\34\2\2\u016a\u0084\3\2\2\2\u016b\u016c\t\35\2\2\u016c\u0086\3\2\2\2\u016d"+
		"\u016e\t\36\2\2\u016e\u0088\3\2\2\2\u016f\u0170\t\37\2\2\u0170\u008a\3"+
		"\2\2\2\u0171\u0172\t \2\2\u0172\u008c\3\2\2\2\u0173\u0174\t!\2\2\u0174"+
		"\u008e\3\2\2\2\t\2\u010e\u0117\u0121\u012a\u0139\u013f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}