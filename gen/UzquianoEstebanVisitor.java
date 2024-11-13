// Generated from /Users/loretouzquiano/Documents/UNIVERSIDAD/TERCER CURSO/Segundo Cuatrimestre/Procesadores de Lenguajes/PracticaComplementaria/PracticaComplementaria/src/UzquianoEsteban.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UzquianoEstebanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UzquianoEstebanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UzquianoEstebanParser#axioma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxioma(UzquianoEstebanParser.AxiomaContext ctx);
}