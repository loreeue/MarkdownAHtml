// Generated from /Users/loretouzquiano/Documents/UNIVERSIDAD/TERCER CURSO/Segundo Cuatrimestre/Procesadores de Lenguajes/PracticaComplementaria/PracticaComplementaria/src/UzquianoEsteban.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class UzquianoEstebanParser extends Parser {
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
	public static final int
		RULE_axioma = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"axioma"
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

	@Override
	public String getGrammarFileName() { return "UzquianoEsteban.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UzquianoEstebanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AxiomaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(UzquianoEstebanParser.EOF, 0); }
		public List<TerminalNode> ENC_PRIMER() { return getTokens(UzquianoEstebanParser.ENC_PRIMER); }
		public TerminalNode ENC_PRIMER(int i) {
			return getToken(UzquianoEstebanParser.ENC_PRIMER, i);
		}
		public List<TerminalNode> ENC_SEGUNDO() { return getTokens(UzquianoEstebanParser.ENC_SEGUNDO); }
		public TerminalNode ENC_SEGUNDO(int i) {
			return getToken(UzquianoEstebanParser.ENC_SEGUNDO, i);
		}
		public List<TerminalNode> ENC_TERCERO() { return getTokens(UzquianoEstebanParser.ENC_TERCERO); }
		public TerminalNode ENC_TERCERO(int i) {
			return getToken(UzquianoEstebanParser.ENC_TERCERO, i);
		}
		public List<TerminalNode> ENC_CUARTO() { return getTokens(UzquianoEstebanParser.ENC_CUARTO); }
		public TerminalNode ENC_CUARTO(int i) {
			return getToken(UzquianoEstebanParser.ENC_CUARTO, i);
		}
		public List<TerminalNode> ENC_QUINTO() { return getTokens(UzquianoEstebanParser.ENC_QUINTO); }
		public TerminalNode ENC_QUINTO(int i) {
			return getToken(UzquianoEstebanParser.ENC_QUINTO, i);
		}
		public List<TerminalNode> ENC_SEXTO() { return getTokens(UzquianoEstebanParser.ENC_SEXTO); }
		public TerminalNode ENC_SEXTO(int i) {
			return getToken(UzquianoEstebanParser.ENC_SEXTO, i);
		}
		public List<TerminalNode> NEGRITA_ASTERISCOS() { return getTokens(UzquianoEstebanParser.NEGRITA_ASTERISCOS); }
		public TerminalNode NEGRITA_ASTERISCOS(int i) {
			return getToken(UzquianoEstebanParser.NEGRITA_ASTERISCOS, i);
		}
		public List<TerminalNode> NEGRITA_GUIONES() { return getTokens(UzquianoEstebanParser.NEGRITA_GUIONES); }
		public TerminalNode NEGRITA_GUIONES(int i) {
			return getToken(UzquianoEstebanParser.NEGRITA_GUIONES, i);
		}
		public List<TerminalNode> CURSIVA_ASTERISCOS() { return getTokens(UzquianoEstebanParser.CURSIVA_ASTERISCOS); }
		public TerminalNode CURSIVA_ASTERISCOS(int i) {
			return getToken(UzquianoEstebanParser.CURSIVA_ASTERISCOS, i);
		}
		public List<TerminalNode> CURSIVA_GUIONES() { return getTokens(UzquianoEstebanParser.CURSIVA_GUIONES); }
		public TerminalNode CURSIVA_GUIONES(int i) {
			return getToken(UzquianoEstebanParser.CURSIVA_GUIONES, i);
		}
		public List<TerminalNode> CITAS() { return getTokens(UzquianoEstebanParser.CITAS); }
		public TerminalNode CITAS(int i) {
			return getToken(UzquianoEstebanParser.CITAS, i);
		}
		public List<TerminalNode> LINEAS() { return getTokens(UzquianoEstebanParser.LINEAS); }
		public TerminalNode LINEAS(int i) {
			return getToken(UzquianoEstebanParser.LINEAS, i);
		}
		public List<TerminalNode> BLOQUES_CODIGO() { return getTokens(UzquianoEstebanParser.BLOQUES_CODIGO); }
		public TerminalNode BLOQUES_CODIGO(int i) {
			return getToken(UzquianoEstebanParser.BLOQUES_CODIGO, i);
		}
		public List<TerminalNode> URL_VALIDA() { return getTokens(UzquianoEstebanParser.URL_VALIDA); }
		public TerminalNode URL_VALIDA(int i) {
			return getToken(UzquianoEstebanParser.URL_VALIDA, i);
		}
		public List<TerminalNode> URL_NOVALIDA() { return getTokens(UzquianoEstebanParser.URL_NOVALIDA); }
		public TerminalNode URL_NOVALIDA(int i) {
			return getToken(UzquianoEstebanParser.URL_NOVALIDA, i);
		}
		public List<TerminalNode> LISTA() { return getTokens(UzquianoEstebanParser.LISTA); }
		public TerminalNode LISTA(int i) {
			return getToken(UzquianoEstebanParser.LISTA, i);
		}
		public List<TerminalNode> TEXTO_NORMAL() { return getTokens(UzquianoEstebanParser.TEXTO_NORMAL); }
		public TerminalNode TEXTO_NORMAL(int i) {
			return getToken(UzquianoEstebanParser.TEXTO_NORMAL, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(UzquianoEstebanParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(UzquianoEstebanParser.NEWLINE, i);
		}
		public AxiomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axioma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UzquianoEstebanListener ) ((UzquianoEstebanListener)listener).enterAxioma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UzquianoEstebanListener ) ((UzquianoEstebanListener)listener).exitAxioma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UzquianoEstebanVisitor ) return ((UzquianoEstebanVisitor<? extends T>)visitor).visitAxioma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxiomaContext axioma() throws RecognitionException {
		AxiomaContext _localctx = new AxiomaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_axioma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8650750L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(5); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8650750L) != 0) );
			setState(7);
			match(EOF);
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
		"\u0004\u0001\u0018\n\u0002\u0000\u0007\u0000\u0001\u0000\u0004\u0000\u0004"+
		"\b\u0000\u000b\u0000\f\u0000\u0005\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0000\u0000\u0001\u0000\u0000\u0001\u0002\u0000\u0001\u0011\u0017\u0017"+
		"\t\u0000\u0003\u0001\u0000\u0000\u0000\u0002\u0004\u0007\u0000\u0000\u0000"+
		"\u0003\u0002\u0001\u0000\u0000\u0000\u0004\u0005\u0001\u0000\u0000\u0000"+
		"\u0005\u0003\u0001\u0000\u0000\u0000\u0005\u0006\u0001\u0000\u0000\u0000"+
		"\u0006\u0007\u0001\u0000\u0000\u0000\u0007\b\u0005\u0000\u0000\u0001\b"+
		"\u0001\u0001\u0000\u0000\u0000\u0001\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}