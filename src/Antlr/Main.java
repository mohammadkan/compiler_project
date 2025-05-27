package Antlr;
import AST.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
public class Main {
    public static void main(String[] args) throws IOException {

        // Important : to print Symbol table comment visit method in BaseVisitor
        // String source = "App-test.txt";
 //         String source = "test1.txt";
    //    String source = "test2.txt";
//        String source = "test3.txt";
//        String source = "test4.txt";
        String source = "testme.txt";

        CharStream charStream = fromFileName(source);
        int h=10;
        AngLexer lexer = new AngLexer(charStream);
        CommonTokenStream token = new CommonTokenStream((TokenSource) lexer);
        AngParser parser = new AngParser(token);
        ParseTree tree = parser.app();
         //this for AST
        BaseVisitor visitor = new BaseVisitor();
        App app = (App) visitor.visit(tree);

        System.out.println(app);
    }
}