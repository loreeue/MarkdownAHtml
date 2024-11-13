import java.io.*;
import org.antlr.v4.runtime.*;

public class UzquianoEsteban {
    public static void main(String[] args) {
        try{
            CharStream input = CharStreams.fromFileName(args[0]);
            System.out.println("<!DOCTYPE html>");
            System.out.println("<html>");
            System.out.println("<head>");
            System.out.println("\t<title>MarkDown2HTML</title>");
            System.out.println("<style>");
            System.out.println("\t.bold {font-weight: bold;}");
            System.out.println("\t.ital {font-style:\titalic;}");
            System.out.println("</style>");
            System.out.println("</head>");
            System.out.println("<body>");
            System.out.println("");
            UzquianoEstebanLexer analex = new UzquianoEstebanLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);
            UzquianoEstebanParser anasint = new UzquianoEstebanParser(tokens);
            anasint.axioma();
            System.out.println("");
            System.out.println("</body>");
            System.out.println("</html>");
        } catch (org.antlr.v4.runtime.RecognitionException e) {
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
            System.err.println("RUN " + e.getMessage());
        }
    }
}