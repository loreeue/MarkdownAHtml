// Generated from /Users/loretouzquiano/Documents/UNIVERSIDAD/TERCER CURSO/Segundo Cuatrimestre/Procesadores de Lenguajes/PracticaComplementaria/PracticaComplementaria/src/UzquianoEsteban.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class UzquianoEstebanLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENC_PRIMER=1, ENC_SEGUNDO=2, ENC_TERCERO=3, ENC_CUARTO=4, ENC_QUINTO=5, 
		ENC_SEXTO=6, NEGRITA_ASTERISCOS=7, NEGRITA_GUIONES=8, CURSIVA_ASTERISCOS=9, 
		CURSIVA_GUIONES=10, CITAS=11, LINEAS=12, BLOQUES_CODIGO=13, URL_VALIDA=14, 
		URL_NOVALIDA=15, LISTA=16, TEXTO_NORMAL=17, TEXT_AVANZADO=18, TEXTO_URLS=19, 
		CABECERA=20, SEGMENTO_URL=21, SUBLIST=22, NEWLINE=23, RESTO=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ENC_PRIMER", "ENC_SEGUNDO", "ENC_TERCERO", "ENC_CUARTO", "ENC_QUINTO", 
			"ENC_SEXTO", "NEGRITA_ASTERISCOS", "NEGRITA_GUIONES", "CURSIVA_ASTERISCOS", 
			"CURSIVA_GUIONES", "CITAS", "LINEAS", "BLOQUES_CODIGO", "URL_VALIDA", 
			"URL_NOVALIDA", "LISTA", "TEXTO_NORMAL", "TEXT_AVANZADO", "TEXTO_URLS", 
			"CABECERA", "SEGMENTO_URL", "SUBLIST", "NEWLINE", "RESTO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ENC_PRIMER", "ENC_SEGUNDO", "ENC_TERCERO", "ENC_CUARTO", "ENC_QUINTO", 
			"ENC_SEXTO", "NEGRITA_ASTERISCOS", "NEGRITA_GUIONES", "CURSIVA_ASTERISCOS", 
			"CURSIVA_GUIONES", "CITAS", "LINEAS", "BLOQUES_CODIGO", "URL_VALIDA", 
			"URL_NOVALIDA", "LISTA", "TEXTO_NORMAL", "TEXT_AVANZADO", "TEXTO_URLS", 
			"CABECERA", "SEGMENTO_URL", "SUBLIST", "NEWLINE", "RESTO"
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


	public UzquianoEstebanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UzquianoEsteban.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			ENC_PRIMER_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			ENC_SEGUNDO_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			ENC_TERCERO_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			ENC_CUARTO_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			ENC_QUINTO_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			ENC_SEXTO_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			NEGRITA_ASTERISCOS_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			NEGRITA_GUIONES_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			CURSIVA_ASTERISCOS_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			CURSIVA_GUIONES_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			CITAS_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			LINEAS_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			BLOQUES_CODIGO_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			URL_VALIDA_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			URL_NOVALIDA_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			LISTA_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			TEXTO_NORMAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			TEXT_AVANZADO_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			TEXTO_URLS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ENC_PRIMER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("<H1>" + getText().substring(1).trim() + "</H1>");
			break;
		}
	}
	private void ENC_SEGUNDO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("<H2>" + getText().substring(2).trim() + "</H2>");
			break;
		}
	}
	private void ENC_TERCERO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("<H3>" + getText().substring(3).trim() + "</H3>");
			break;
		}
	}
	private void ENC_CUARTO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("<H4>" + getText().substring(4).trim() + "</H4>");
			break;
		}
	}
	private void ENC_QUINTO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println("<H5>" + getText().substring(5).trim() + "</H5>");
			break;
		}
	}
	private void ENC_SEXTO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println("<H6>" + getText().substring(6).trim() + "</H6>");
			break;
		}
	}
	private void NEGRITA_ASTERISCOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.println("<SPAN class=\"bold\">" + getText().replace("**", "").trim() + "</SPAN>");
			break;
		}
	}
	private void NEGRITA_GUIONES_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			System.out.println("<SPAN class=\"bold\">" + getText().replace("__", "").trim() + "</SPAN>");
			break;
		}
	}
	private void CURSIVA_ASTERISCOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.println("<SPAN class=\"ital\">" + getText().replace("*", "").trim() + "</SPAN>");
			break;
		}
	}
	private void CURSIVA_GUIONES_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			System.out.println("<SPAN class=\"ital\">" + getText().replace("_", "").trim() + "</SPAN>");
			break;
		}
	}
	private void CITAS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			System.out.println("<blockquote>" + getText().replace(">", "").trim() + "</blockquote>");
			break;
		}
	}
	private void LINEAS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			System.out.println("<HR/>");
			break;
		}
	}
	private void BLOQUES_CODIGO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			System.out.println("<code><pre>" + getText().trim().replace("~~~" ," ") + "</pre></code>");
			break;
		}
	}
	private void URL_VALIDA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:

			    String texto_enlace = getText().substring(getText().indexOf('[') + 1, getText().indexOf(']'));
			    String enlace = getText().substring(getText().indexOf('(') + 1, getText().indexOf(')'));
			    System.out.println("<A HREF=\"" + enlace + "\">" + texto_enlace + "</A>");

			break;
		}
	}
	private void URL_NOVALIDA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:

			    String texto_enlace = getText().substring(getText().indexOf('[') + 1, getText().indexOf(']'));
			    String enlace = getText().substring(getText().indexOf('(') + 1, getText().indexOf(')'));
			    System.out.println("<A HREF=\"" + enlace + "\">" + texto_enlace + "(URL aparentemente incorrecta)</A>");

			break;
		}
	}
	private void LISTA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:

			    String[] lista = getText().split("\r\n");
			    System.out.println("<UL>");
			    for (String items : lista) {
			        String it = items.replace("- ", "");
			        String[] lineas = it.split("\n");
			        for (String linea : lineas) {
			            System.out.println("<LI>" + linea + "</LI>");
			        }
			    }
			    System.out.println("</UL>");

			break;
		}
	}
	private void TEXTO_NORMAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			System.out.println(getText().trim());
			break;
		}
	}
	private void TEXT_AVANZADO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			System.out.println(getText().trim());
			break;
		}
	}
	private void TEXTO_URLS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			System.out.println(getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u0157\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u00005\u0001"+
		"\u0000\u0004\u00009\b\u0000\u000b\u0000\f\u0000:\u0001\u0000\u0003\u0000"+
		">\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001E\b\u0001\u000b\u0001\f\u0001F\u0001\u0001\u0004\u0001J\b"+
		"\u0001\u000b\u0001\f\u0001K\u0001\u0001\u0003\u0001O\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"W\b\u0002\u000b\u0002\f\u0002X\u0001\u0002\u0004\u0002\\\b\u0002\u000b"+
		"\u0002\f\u0002]\u0001\u0002\u0003\u0002a\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003"+
		"j\b\u0003\u000b\u0003\f\u0003k\u0001\u0003\u0004\u0003o\b\u0003\u000b"+
		"\u0003\f\u0003p\u0001\u0003\u0003\u0003t\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u0004~\b\u0004\u000b\u0004\f\u0004\u007f\u0001\u0004\u0004\u0004"+
		"\u0083\b\u0004\u000b\u0004\f\u0004\u0084\u0001\u0004\u0003\u0004\u0088"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u0093\b\u0005\u000b"+
		"\u0005\f\u0005\u0094\u0001\u0005\u0004\u0005\u0098\b\u0005\u000b\u0005"+
		"\f\u0005\u0099\u0001\u0005\u0003\u0005\u009d\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a9\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b5\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00bd\b\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c5\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00cc\b\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00d9\b\u000b\u0001\u000b\u0003\u000b\u00dc"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ea\b\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u00f9\b\r\n\r\f\r\u00fc\t\r\u0001\r\u0001\r"+
		"\u0003\r\u0100\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u010c\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0004\u000f\u0113\b\u000f\u000b\u000f\f\u000f\u0114\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0004\u0010\u011a\b\u0010\u000b\u0010\f\u0010\u011b"+
		"\u0001\u0010\u0003\u0010\u011f\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012\u0127\b\u0012\u000b\u0012"+
		"\f\u0012\u0128\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u013c\b\u0013\u0001\u0014\u0004\u0014\u013f\b\u0014\u000b"+
		"\u0014\f\u0014\u0140\u0001\u0015\u0001\u0015\u0004\u0015\u0145\b\u0015"+
		"\u000b\u0015\f\u0015\u0146\u0001\u0016\u0003\u0016\u014a\b\u0016\u0001"+
		"\u0016\u0004\u0016\u014d\b\u0016\u000b\u0016\f\u0016\u014e\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0004\u0017\u0154\b\u0017\u000b\u0017\f\u0017"+
		"\u0155\u0000\u0000\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0004\u0003\u0000  AZa"+
		"z\u0002\u0000\n\n\r\r\u0003\u000009AZaz\u0006\u0000##**-->>__~~\u017e"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u0003D\u0001\u0000"+
		"\u0000\u0000\u0005V\u0001\u0000\u0000\u0000\u0007i\u0001\u0000\u0000\u0000"+
		"\t}\u0001\u0000\u0000\u0000\u000b\u0092\u0001\u0000\u0000\u0000\r\u00a0"+
		"\u0001\u0000\u0000\u0000\u000f\u00ac\u0001\u0000\u0000\u0000\u0011\u00b8"+
		"\u0001\u0000\u0000\u0000\u0013\u00c0\u0001\u0000\u0000\u0000\u0015\u00c8"+
		"\u0001\u0000\u0000\u0000\u0017\u00d8\u0001\u0000\u0000\u0000\u0019\u00df"+
		"\u0001\u0000\u0000\u0000\u001b\u00ed\u0001\u0000\u0000\u0000\u001d\u0103"+
		"\u0001\u0000\u0000\u0000\u001f\u0112\u0001\u0000\u0000\u0000!\u0119\u0001"+
		"\u0000\u0000\u0000#\u0122\u0001\u0000\u0000\u0000%\u0126\u0001\u0000\u0000"+
		"\u0000\'\u013b\u0001\u0000\u0000\u0000)\u013e\u0001\u0000\u0000\u0000"+
		"+\u0142\u0001\u0000\u0000\u0000-\u014c\u0001\u0000\u0000\u0000/\u0153"+
		"\u0001\u0000\u0000\u000012\u0005#\u0000\u000024\u0005 \u0000\u000031\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u000079\u0007\u0000\u0000"+
		"\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<>\u0003"+
		"-\u0016\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?@\u0006\u0000\u0000\u0000@\u0002\u0001\u0000\u0000"+
		"\u0000AB\u0005#\u0000\u0000BC\u0005#\u0000\u0000CE\u0005 \u0000\u0000"+
		"DA\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HJ\u0007\u0000"+
		"\u0000\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000"+
		"MO\u0003-\u0016\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PQ\u0006\u0001\u0001\u0000Q\u0004\u0001\u0000"+
		"\u0000\u0000RS\u0005#\u0000\u0000ST\u0005#\u0000\u0000TU\u0005#\u0000"+
		"\u0000UW\u0005 \u0000\u0000VR\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000"+
		"\u0000\u0000Z\\\u0007\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^`\u0001\u0000\u0000\u0000_a\u0003-\u0016\u0000`_\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0006\u0002\u0002"+
		"\u0000c\u0006\u0001\u0000\u0000\u0000de\u0005#\u0000\u0000ef\u0005#\u0000"+
		"\u0000fg\u0005#\u0000\u0000gh\u0005#\u0000\u0000hj\u0005 \u0000\u0000"+
		"id\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mo\u0007\u0000"+
		"\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000"+
		"rt\u0003-\u0016\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000uv\u0006\u0003\u0003\u0000v\b\u0001\u0000\u0000"+
		"\u0000wx\u0005#\u0000\u0000xy\u0005#\u0000\u0000yz\u0005#\u0000\u0000"+
		"z{\u0005#\u0000\u0000{|\u0005#\u0000\u0000|~\u0005 \u0000\u0000}w\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000"+
		"\u0000\u0081\u0083\u0007\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000"+
		"\u0000\u0086\u0088\u0003-\u0016\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0006\u0004\u0004\u0000\u008a\n\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005#\u0000\u0000\u008c\u008d\u0005#\u0000\u0000\u008d\u008e\u0005"+
		"#\u0000\u0000\u008e\u008f\u0005#\u0000\u0000\u008f\u0090\u0005#\u0000"+
		"\u0000\u0090\u0091\u0005#\u0000\u0000\u0091\u0093\u0005 \u0000\u0000\u0092"+
		"\u008b\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0097\u0001\u0000\u0000\u0000\u0096\u0098\u0007\u0000\u0000\u0000\u0097"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u009c\u0001\u0000\u0000\u0000\u009b\u009d\u0003-\u0016\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0006\u0005\u0005\u0000\u009f\f\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0005*\u0000\u0000\u00a1\u00a2\u0005*\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003!\u0010\u0000"+
		"\u00a4\u00a5\u0005*\u0000\u0000\u00a5\u00a6\u0005*\u0000\u0000\u00a6\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a9\u0003-\u0016\u0000\u00a8\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0006\u0006\u0006\u0000\u00ab\u000e\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005_\u0000\u0000\u00ad\u00ae\u0005_\u0000"+
		"\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0003!\u0010\u0000"+
		"\u00b0\u00b1\u0005_\u0000\u0000\u00b1\u00b2\u0005_\u0000\u0000\u00b2\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b5\u0003-\u0016\u0000\u00b4\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0006\u0007\u0007\u0000\u00b7\u0010\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005*\u0000\u0000\u00b9\u00ba\u0003!\u0010"+
		"\u0000\u00ba\u00bc\u0005*\u0000\u0000\u00bb\u00bd\u0003-\u0016\u0000\u00bc"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0006\b\b\u0000\u00bf\u0012"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005_\u0000\u0000\u00c1\u00c2\u0003"+
		"!\u0010\u0000\u00c2\u00c4\u0005_\u0000\u0000\u00c3\u00c5\u0003-\u0016"+
		"\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0006\t\t\u0000"+
		"\u00c7\u0014\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005>\u0000\u0000\u00c9"+
		"\u00cb\u0003!\u0010\u0000\u00ca\u00cc\u0003-\u0016\u0000\u00cb\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0006\n\n\u0000\u00ce\u0016\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0005*\u0000\u0000\u00d0\u00d1\u0005*\u0000\u0000"+
		"\u00d1\u00d9\u0005*\u0000\u0000\u00d2\u00d3\u0005-\u0000\u0000\u00d3\u00d4"+
		"\u0005-\u0000\u0000\u00d4\u00d9\u0005-\u0000\u0000\u00d5\u00d6\u0005_"+
		"\u0000\u0000\u00d6\u00d7\u0005_\u0000\u0000\u00d7\u00d9\u0005_\u0000\u0000"+
		"\u00d8\u00cf\u0001\u0000\u0000\u0000\u00d8\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d5\u0001\u0000\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000"+
		"\u00da\u00dc\u0003-\u0016\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0006\u000b\u000b\u0000\u00de\u0018\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005~\u0000\u0000\u00e0\u00e1\u0005~\u0000\u0000\u00e1\u00e2\u0005"+
		"~\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003#\u0011"+
		"\u0000\u00e4\u00e5\u0005~\u0000\u0000\u00e5\u00e6\u0005~\u0000\u0000\u00e6"+
		"\u00e7\u0005~\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00ea"+
		"\u0003-\u0016\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0006"+
		"\f\f\u0000\u00ec\u001a\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005[\u0000"+
		"\u0000\u00ee\u00ef\u0003!\u0010\u0000\u00ef\u00f0\u0005]\u0000\u0000\u00f0"+
		"\u00f1\u0005(\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0003\'\u0013\u0000\u00f3\u00f4\u0003)\u0014\u0000\u00f4\u00f5\u0005"+
		".\u0000\u0000\u00f5\u00fa\u0003)\u0014\u0000\u00f6\u00f7\u0005.\u0000"+
		"\u0000\u00f7\u00f9\u0003)\u0014\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00ff\u0005)\u0000\u0000\u00fe"+
		"\u0100\u0003-\u0016\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0006\r\r\u0000\u0102\u001c\u0001\u0000\u0000\u0000\u0103\u0104\u0005"+
		"[\u0000\u0000\u0104\u0105\u0003!\u0010\u0000\u0105\u0106\u0005]\u0000"+
		"\u0000\u0106\u0107\u0005(\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0003%\u0012\u0000\u0109\u010b\u0005)\u0000\u0000\u010a\u010c"+
		"\u0003-\u0016\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0006"+
		"\u000e\u000e\u0000\u010e\u001e\u0001\u0000\u0000\u0000\u010f\u0110\u0003"+
		"+\u0015\u0000\u0110\u0111\u0003-\u0016\u0000\u0111\u0113\u0001\u0000\u0000"+
		"\u0000\u0112\u010f\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000"+
		"\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0006\u000f\u000f"+
		"\u0000\u0117 \u0001\u0000\u0000\u0000\u0118\u011a\u0007\u0000\u0000\u0000"+
		"\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011f\u0003-\u0016\u0000\u011e"+
		"\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0006\u0010\u0010\u0000\u0121"+
		"\"\u0001\u0000\u0000\u0000\u0122\u0123\u0003/\u0017\u0000\u0123\u0124"+
		"\u0006\u0011\u0011\u0000\u0124$\u0001\u0000\u0000\u0000\u0125\u0127\b"+
		"\u0001\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001"+
		"\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0006"+
		"\u0012\u0012\u0000\u012b&\u0001\u0000\u0000\u0000\u012c\u012d\u0005h\u0000"+
		"\u0000\u012d\u012e\u0005t\u0000\u0000\u012e\u012f\u0005t\u0000\u0000\u012f"+
		"\u0130\u0005p\u0000\u0000\u0130\u0131\u0005:\u0000\u0000\u0131\u0132\u0005"+
		"/\u0000\u0000\u0132\u013c\u0005/\u0000\u0000\u0133\u0134\u0005h\u0000"+
		"\u0000\u0134\u0135\u0005t\u0000\u0000\u0135\u0136\u0005t\u0000\u0000\u0136"+
		"\u0137\u0005p\u0000\u0000\u0137\u0138\u0005s\u0000\u0000\u0138\u0139\u0005"+
		":\u0000\u0000\u0139\u013a\u0005/\u0000\u0000\u013a\u013c\u0005/\u0000"+
		"\u0000\u013b\u012c\u0001\u0000\u0000\u0000\u013b\u0133\u0001\u0000\u0000"+
		"\u0000\u013c(\u0001\u0000\u0000\u0000\u013d\u013f\u0007\u0002\u0000\u0000"+
		"\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000"+
		"\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000"+
		"\u0141*\u0001\u0000\u0000\u0000\u0142\u0144\u0005-\u0000\u0000\u0143\u0145"+
		"\b\u0001\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001"+
		"\u0000\u0000\u0000\u0147,\u0001\u0000\u0000\u0000\u0148\u014a\u0005\r"+
		"\u0000\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014d\u0005\n\u0000"+
		"\u0000\u014c\u0149\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000"+
		"\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151\u0006\u0016\u0013"+
		"\u0000\u0151.\u0001\u0000\u0000\u0000\u0152\u0154\b\u0003\u0000\u0000"+
		"\u0153\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000"+
		"\u01560\u0001\u0000\u0000\u0000(\u00005:=FKNX]`kps\u007f\u0084\u0087\u0094"+
		"\u0099\u009c\u00a8\u00b4\u00bc\u00c4\u00cb\u00d8\u00db\u00e9\u00fa\u00ff"+
		"\u010b\u0114\u011b\u011e\u0128\u013b\u0140\u0146\u0149\u014e\u0155\u0014"+
		"\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0002\u0002\u0001\u0003\u0003"+
		"\u0001\u0004\u0004\u0001\u0005\u0005\u0001\u0006\u0006\u0001\u0007\u0007"+
		"\u0001\b\b\u0001\t\t\u0001\n\n\u0001\u000b\u000b\u0001\f\f\u0001\r\r\u0001"+
		"\u000e\u000e\u0001\u000f\u000f\u0001\u0010\u0010\u0001\u0011\u0011\u0001"+
		"\u0012\u0012\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}