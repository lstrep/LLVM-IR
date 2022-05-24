import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;



public class GramatykaTest {
    public static void main(String[] args)  {


        String input =

                        " func funkcja{ \n" +
                        " x = 3 \n" +
                        " write x \n" +
                        " } \n" +
                        " x = 5 \n" +
                        "funkcja()\n"+
                        " write x \n" ;

        GramatykaLexer lexer = new GramatykaLexer(CharStreams.fromString(input));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GramatykaParser parser = new GramatykaParser(tokens);

        ParseTree tree = parser.prog();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new LLVMActions(), tree);
    }
}
