import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;



public class GramatykaTest {
    public static void main(String[] args)  {


        String input = " func ala{ \n" +
                "x = 4 \n" +
                        "for 5{ \n" +
                "write x \n" +
                "}\n" +
                        "write x\n" +
                        "}   \n" +
                "ala() \n" +
                "x = 3\n" +
                "if (x==3){\n" +
                "write x\n" +
                "}\n";

        GramatykaLexer lexer = new GramatykaLexer(CharStreams.fromString(input));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GramatykaParser parser = new GramatykaParser(tokens);

        ParseTree tree = parser.prog();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new LLVMActions(), tree);
    }
}
