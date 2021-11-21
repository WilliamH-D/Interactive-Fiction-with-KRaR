package ProcessInput;

import ProcessInput.GrammarFiles.EditorGrammarLexer;
import ProcessInput.GrammarFiles.EditorGrammarParser;
import ProcessInput.GrammarFiles.EditorGrammarVisitor;
import SimpleEngine.*;
import SimpleEngine.Actions.*;
import SimpleEngine.Actions.Conditions.*;
import SimpleEngine.Actions.Effects.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.*;

public class StoryCompiler {

    private static StoryCompiler instance;

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
    Map<String, String> values;

    String flagName;
    int flagValue;


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

        GameState.setChildren();
    }

    private void resetVars() {
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

        flagName = null;
        flagValue = 0;
    }

    void compileRoom() {
        System.out.println();
        System.out.println("Compile Room:");
        System.out.println("ID: " + id);
        System.out.println("N: " + n);
        System.out.println("S: " + s);
        System.out.println("E: " + e);
        System.out.println("W: " + w);
        System.out.println("U: " + u);
        System.out.println("D: " + d);
        System.out.println("NAME: " + name);
        System.out.println("DESC: " + desc);

        GameRoom room = new GameRoom(id);
        room.setParent("ROOT");
        room.setNorth(n);
        room.setSouth(s);
        room.setEast(e);
        room.setWest(w);
        room.setUp(u);
        room.setDown(d);

        GameState.addGameObject(room);

        resetVars();
    }

    void compileObject() {
        System.out.println();
        System.out.println("Compile Object:");
        System.out.println("ID: " + id);
        System.out.println("LOCATION: " + location);
        System.out.println("NAME: " + name);
        System.out.println("DESC: " + desc);
        System.out.println("FLAGS: " + Arrays.toString(flags.toArray()));
        System.out.println("VALUES: ");
        values.forEach((key, value) -> System.out.println("\t" + key + ":" + value));

        GameObject obj = new GameObject(id);
        obj.setParent(location);
        obj.setName(name);
        obj.setDesc(desc);
        for (String flag : flags) {
            obj.setFlag(flag);
        }
        for (Map.Entry value : values.entrySet()) {
            obj.addVariable(value.getKey().toString(), value.getValue().toString());
        }

        GameState.addGameObject(obj);

        resetVars();
    }

    void compileAction() {
        List<ActionPart> actions = popLastActionBlock();
        System.out.println();
        System.out.println("Compile Action:");
        System.out.println("ID: " + id);
        System.out.println("ACTIONS: " + actions);

        GameAction action = new GameAction(id, actions);

        GameState.addAction(action);
        resetVars();
        resetActionVars();
    }

    void compileFlag() {
        System.out.println();
        System.out.println("Compile Flag:");
        System.out.println("FLAG: " + flagName);
        System.out.println("VALUE: " + flagValue);

        GameFlag flag = new GameFlag(flagName, flagValue);
        GameState.addFlag(flag);
        resetVars();
    }

    // Compile Action parts

    private List<Condition> conditions = new ArrayList<>();
    private Condition currConditionPart;
    private List<ConditionTest> tests = new ArrayList<>();
    private List<List<ActionPart>> action_blocks = new ArrayList<>();
    private boolean isNot = false;

    private void resetActionVars() {
        conditions = new ArrayList<>();
        currConditionPart = null;
        tests = new ArrayList<>();
        action_blocks = new ArrayList<>();
        isNot = false;
    }

    public void setIsNot() { isNot = true; }

    private Condition popLastCondition() {
        return conditions.remove(conditions.size()-1);
    }

    private List<ActionPart> popLastActionBlock() {
        return action_blocks.remove(action_blocks.size()-1);
    }

    private ConditionTest popLastTest() {
        return tests.remove(tests.size()-1);
    }

    private void addToLastActionBlock(ActionPart part) {
        if (action_blocks.size() == 0) {
            newActionBlock();
        }
        action_blocks.get(action_blocks.size()-1).add(part);
    }

    private void newActionBlock() {
        action_blocks.add(new ArrayList<>());
    }

    // Add new action block when iterating into new conditional (called as soon as new conditional visited)
    public void newConditional() {
        newActionBlock();
        currConditionPart = null;
    }

    public void addConditional() {
        conditions.add(currConditionPart);
    }

    public void compileConditional() {
        Condition cond = popLastCondition();
        List<ActionPart> actions = popLastActionBlock();
        System.out.println();
        System.out.println("Compiling Conditional:");
        System.out.println("CONDITION: " + cond);
        System.out.println("ACTIONS: " + actions);

        Conditional conditional = new Conditional(cond, actions);

        System.out.println("New Conditional: " + conditional);

        addToLastActionBlock(conditional);
    }

    public void compileConditions(boolean isAnd, boolean isOr) {
        ConditionTest test = popLastTest();
        if (!isAnd && !isOr) { isAnd = true; }

        System.out.println();
        System.out.println("Compiling Conditions:");
        System.out.println("FIRST TEST: " + test);
        System.out.println("CONTINUATION: " + currConditionPart);
        System.out.println("IsAND: " + isAnd);
        System.out.println("IsOR: " + isOr);

        Condition cond = new Condition(test, isAnd, isOr, currConditionPart);

        System.out.println("New Conditions: " + cond);

        currConditionPart = cond;
    }

    // CONDITIONS:

    private void setTest(ConditionTest cond) {
        if (isNot) {
            cond.setIsNot();
            isNot = false;
        }
        tests.add(cond);
    }

    public void compileAndFlagsCond(Set<String> flags) {
        System.out.println();
        System.out.println("Compiling AndFlagsCond:");
        System.out.println("FLAGS: " + flags.toString());

        setTest(new AndFlagsCond(flags));
    }

    public void compileEqualsCond(String lhs, String rhs, boolean bothVars) {
        System.out.println();
        System.out.println("Compiling EqualsCond:");
        System.out.println("LHS: " + lhs);
        System.out.println("RHS: " + lhs);
        System.out.println("BOTH VARS: " + bothVars);

        setTest(new EqualsCond(id, lhs, rhs, bothVars));
    }

    public void compileGTCond(String lhs, String rhs, boolean bothVars) {
        System.out.println();
        System.out.println("Compiling GTCond:");
        System.out.println("LHS: " + lhs);
        System.out.println("RHS: " + lhs);
        System.out.println("BOTH VARS: " + bothVars);

        setTest(new GTCond(id, lhs, rhs, bothVars));
    }

    public void compileHaveItemCond(Set<String> objs) {
        System.out.println();
        System.out.println("Compiling HaveItemCond:");
        System.out.println("OBJS: " + objs.toString());

        setTest(new HaveItemCond(objs));
    }

    public void compileHaveItemsCond(Set<String> objs) {
        System.out.println();
        System.out.println("Compiling HaveItemsCond:");
        System.out.println("OBJS: " + objs.toString());

        setTest(new HaveItemsCond(objs));
    }

    public void compileHereCond(Set<String> locs) {
        System.out.println();
        System.out.println("Compiling HereCond:");
        System.out.println("LOCATIONS: " + locs.toString());

        setTest(new HereCond(locs));
    }

    public void compileLTCond(String lhs, String rhs, boolean bothVars) {
        System.out.println();
        System.out.println("Compiling LTCond:");
        System.out.println("LHS: " + lhs);
        System.out.println("RHS: " + lhs);
        System.out.println("BOTH VARS: " + bothVars);

        setTest(new LTCond(id, lhs, rhs, bothVars));
    }

    public void compileOrFlagsCond(Set<String> flags) {
        System.out.println();
        System.out.println("Compiling OrFlagsCond:");
        System.out.println("FLAGS: " + flags.toString());

        setTest(new OrFlagsCond(flags));
    }

    public void compilePRSACond(Set<String> verbs) {
        System.out.println();
        System.out.println("Compiling PRSACond:");
        System.out.println("VERBS: " + verbs.toString());

        setTest(new PRSACond(verbs));
    }

    public void compilePRSICond(Set<String> objs) {
        System.out.println();
        System.out.println("Compiling PRSICond:");
        System.out.println("OBJS: " + objs.toString());

        setTest(new PRSICond(objs));
    }

    public void compilePRSOCond(Set<String> objs) {
        System.out.println();
        System.out.println("Compiling PRSOCond:");
        System.out.println("OBJS: " + objs.toString());

        setTest(new PRSOCond(objs));
    }

    // EFFECTS:

    public void compileGotoEff(String locID) {
        System.out.println();
        System.out.println("Compiling GotoEff:");
        System.out.println("LOCATION: " + locID);

        addToLastActionBlock(new GotoEff(locID));
    }

    public void compilePlaceEff(String objID, String locID) {
        System.out.println();
        System.out.println("Compiling PlaceEff:");
        System.out.println("ITEM: " + objID);
        System.out.println("LOCATION: " + locID);

        addToLastActionBlock(new PlaceEff(objID, locID));
    }

    public void compileRemFlagEff(String flagID) {
        System.out.println();
        System.out.println("Compiling RemFlagEff:");
        System.out.println("FLAG: " + flagID);

        addToLastActionBlock(new RemFlagEff(flagID));
    }

    public void compileSetEff(String var, String val) {
        System.out.println();
        System.out.println("Compiling SetEff:");
        System.out.println("VARIABLE: " + var);
        System.out.println("VALUE: " + val);

        addToLastActionBlock(new SetEff(id, var, val));
    }

    public void compileSetFlagEff(String flagID, int val) {
        System.out.println();
        System.out.println("Compiling SetFlagEff:");
        System.out.println("FLAG: " + flagID);
        System.out.println("VALUE: " + val);

        addToLastActionBlock(new SetFlagEff(flagID, val));
    }

    public void compileTakeEff(String objID) {
        System.out.println();
        System.out.println("Compiling TakeEff:");
        System.out.println("ITEM: " + objID);

        addToLastActionBlock(new TakeEff(objID));
    }

    public void compileTellEff(String text) {
        System.out.println();
        System.out.println("Compiling TellEff:");
        System.out.println("TEXT: " + text);

        addToLastActionBlock(new TellEff(text));
    }
}
