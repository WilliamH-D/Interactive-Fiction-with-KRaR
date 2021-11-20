package ProcessInput;

import ProcessInput.GrammarFiles.EditorGrammarLexer;
import ProcessInput.GrammarFiles.EditorGrammarParser;
import ProcessInput.GrammarFiles.EditorGrammarVisitor;
import SimpleEngine.GameObject;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.*;

public class StoryCompiler {

    public static StoryCompiler instance;

    // ID
    String id;

    // Directions
    String n;
    String s;
    String e;
    String w;
    String u;
    String d;

    String name;
    String desc;

    String location; // Parent

    List<String> flags;
    Map<String, Object> values;

    private StoryCompiler() {
        flags = new ArrayList<>();
        values = new HashMap<>();
    }

    public static StoryCompiler get() {
        if (instance == null) {
            instance = new StoryCompiler();
        }
        return instance;
    }

    public void compile(String filename) throws IOException {
        CharStream charStream = CharStreams.fromFileName(filename);
        EditorGrammarLexer lexer = new EditorGrammarLexer(charStream);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        EditorGrammarParser parser = new EditorGrammarParser(cts);

        ParseTree parseTree = parser.game_grammar();
        EditorGrammarVisitor visitor = new GrammarVisitor();
        visitor.visit(parseTree);
    }

    public void resetVars() {
        id = null;

        n = null;
        s = null;
        e = null;
        w = null;
        u = null;
        d = null;

        name = null;
        desc = null;

        location = null;

        flags = new ArrayList<>();
        values = new HashMap<>();
    }

    public void compileRoom() {
        System.out.println();
        System.out.println("Compile Room:");
        System.out.println("ID: " + id);
        System.out.println("N:" + n);
        System.out.println("S:" + s);
        System.out.println("E:" + e);
        System.out.println("W:" + w);
        System.out.println("U:" + u);
        System.out.println("D:" + d);
        System.out.println("NAME:" + name);
        System.out.println("DESC: " + desc);

        resetVars();
    }

    public void compileObject() {
        System.out.println();
        System.out.println("Compile Object:");
        System.out.println("ID: " + id);
        System.out.println("LOCATION:" + location);
        System.out.println("NAME:" + name);
        System.out.println("DESC: " + desc);
        System.out.println("FLAGS: " + Arrays.toString(flags.toArray()));
        System.out.println("VALUES: ");
        values.forEach((key, value) -> System.out.println(key + ":" + value));

        GameObject obj = new GameObject(id.substring(1, id.length()-1));
        //obj.s

        resetVars();
    }

    public void compileAction() {
        System.out.println();
        System.out.println("Compile Action:");
        resetVars();
    }
}
