package ProcessInput;

import Logging.DebugLogger;
import EnhancedEngine.KnowledgeBase;
import Game.GameController;
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
    Set<String> nconds;
    String s;
    Set<String> sconds;
    String e;
    Set<String> econds;
    String w;
    Set<String> wconds;
    String u;
    Set<String> uconds;
    String d;
    Set<String> dconds;

    String name;
    String desc;

    Set<String> synonyms;

    String location; // Parent
    int locationType = 0;

    List<String> properties;
    Map<String, String> values;

    String flagName;
    int flagValue;

    KnowledgeBase kb;

    DebugLogger logger;

    boolean playerStartSet = false;


    private StoryCompiler() {
        properties = new ArrayList<>();
        values = new HashMap<>();
        kb = KnowledgeBase.getInstance();
        logger = DebugLogger.getInstance();
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
        kb.initVariablesAfterCompilation();
    }

    private void resetVars() {
        id = null;

        n = null;
        nconds = null;
        s = null;
        sconds = null;
        e = null;
        econds = null;
        w = null;
        wconds = null;
        u = null;
        uconds = null;
        d = null;
        dconds = null;

        name = null;
        desc = null;

        synonyms = null;

        location = null;
        locationType = 0;

        properties = new ArrayList<>();
        values = new HashMap<>();

        flagName = null;
        flagValue = 0;
    }

    void compileRoom() {
        logger.logLine();
        logger.logRaw("Compile Room:");
        logger.logRaw("ID: " + id);
        logger.logRaw("N: " + n);
        logger.logRaw("NCONDS: " + nconds);
        logger.logRaw("S: " + s);
        logger.logRaw("SCONDS: " + sconds);
        logger.logRaw("E: " + e);
        logger.logRaw("ECONDS: " + econds);
        logger.logRaw("W: " + w);
        logger.logRaw("WCONDS: " + wconds);
        logger.logRaw("U: " + u);
        logger.logRaw("UCONDS: " + uconds);
        logger.logRaw("D: " + d);
        logger.logRaw("DCONDS: " + dconds);
        logger.logRaw("NAME: " + name);
        logger.logRaw("DESC: " + desc);
        logger.logRaw("SYNS: " + synonyms);

        GameRoom room = new GameRoom(id);
        room.setParent("ROOT", 0);
        room.setNorth(n);
        room.setNConds(nconds);
        room.setSouth(s);
        room.setSConds(sconds);
        room.setEast(e);
        room.setEConds(econds);
        room.setWest(w);
        room.setWConds(wconds);
        room.setUp(u);
        room.setUConds(uconds);
        room.setDown(d);
        room.setDConds(dconds);
        room.setName(name);
        room.setDesc(desc);
        room.setSynonyms(synonyms);

        logger.logInfo("New Room: " + room);

        kb.addClause("isRoom(" + id.toLowerCase() + ")");

        GameState.addGameObject(room);

        if (!playerStartSet) {
            GameController.getPlayer().movePlayer(room);
            playerStartSet = true;
        }

        resetVars();
    }

    void compileObject() {
        logger.logLine();
        logger.logRaw("Compile Object:");
        logger.logRaw("ID: " + id);
        logger.logRaw("LOCATION: " + location);
        logger.logRaw("LOCATION TYPE: " + locationType);
        logger.logRaw("NAME: " + name);
        logger.logRaw("DESC: " + desc);
        logger.logRaw("SYNS: " + synonyms);
        logger.logRaw("FLAGS: " + Arrays.toString(properties.toArray()));
        logger.logRaw("VALUES: ");
        values.forEach((key, value) -> logger.logRaw("\t" + key + ":" + value));

        GameObject obj = new GameObject(id);
        obj.setParent(location, locationType);
        obj.setParentType(locationType);
        obj.setName(name);
        obj.setDesc(desc);
        obj.setSynonyms(synonyms);
        properties.forEach(obj::setProperty);

        int volume = 1;
        int capacity = 0;
        int surface = 0;
        int below = 0;
        for (Map.Entry value : values.entrySet()) {
            obj.addVariable(value.getKey().toString(), value.getValue().toString());
            switch (value.getKey().toString()) {
                case "volume":
                    volume = Integer.parseInt(value.getValue().toString());
                    break;
                case "capacity":
                    capacity = Integer.parseInt(value.getValue().toString());
                    obj.addVariable("capacityUsed", "0");
                    break;
                case "surface":
                    surface = Integer.parseInt(value.getValue().toString());
                    obj.addVariable("surfaceUsed", "0");
                    break;
                case "below":
                    below = Integer.parseInt(value.getValue().toString());
                    obj.addVariable("belowUsed", "0");
                    break;
            }
        }

        logger.logInfo("New Object: " + obj);

        kb.addClause("isObject(" + id.toLowerCase() + ")");
        kb.addClause("volume(" + id.toLowerCase() + "," + volume + ")");
        if (capacity > 0) {
            kb.addClause("capacity(" + id.toLowerCase() + "," + capacity + ")");
            kb.addClause("capacityUsed(" + id.toLowerCase() + ",0)");
        }
        if (surface > 0) {
            kb.addClause("surface(" + id.toLowerCase() + "," + surface + ")");
            kb.addClause("surfaceUsed(" + id.toLowerCase() + ",0)");
        }
        if (below > 0) {
            kb.addClause("below(" + id.toLowerCase() + "," + below + ")");
            kb.addClause("belowUsed(" + id.toLowerCase() + ",0)");
        }

        properties.forEach(property -> kb.addClause("hasProperty(" + id.toLowerCase() + "," + property.toLowerCase() + ")"));

        kb.addClause("isLocated(" + id.toLowerCase() + "," + location.toLowerCase() + "," + locationType + ")");

        GameState.addGameObject(obj);

        resetVars();
    }

    void compileAction() {
        List<ActionPart> actions = popLastActionBlock();
        logger.logLine();
        logger.logRaw("Compile Action:");
        logger.logRaw("ID: " + id);
        logger.logRaw("ACTIONS: " + actions);

        GameAction action = new GameAction(id, actions);

        GameState.addAction(action);
        resetVars();
        resetActionVars();
    }

    void compileFlag() {
        logger.logLine();
        logger.logRaw("Compile Flag:");
        logger.logRaw("FLAG: " + flagName);
        logger.logRaw("VALUE: " + flagValue);

        GameFlag flag = new GameFlag(flagName, flagValue);

        kb.addClause("flag(" + flagName.toLowerCase() + "," + flagValue + ")");

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

    public void setIsNot() {
        isNot = true; }

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
        logger.logLine();
        logger.logRaw("Compiling Conditional:");
        logger.logRaw("CONDITION: " + cond);
        logger.logRaw("ACTIONS: " + actions);

        Conditional conditional = new Conditional(cond, actions);

        logger.logInfo("New Conditional: " + conditional);

        addToLastActionBlock(conditional);
    }

    public void compileConditions(boolean isAnd, boolean isOr) {
        ConditionTest test = popLastTest();
        if (!isAnd && !isOr) { isAnd = true; }

        logger.logLine();
        logger.logRaw("Compiling Conditions:");
        logger.logRaw("TEST: " + test);
        logger.logRaw("TES IS NOT: " + test.not());
        logger.logRaw("CONTINUATION: " + currConditionPart);
        logger.logRaw("IsAND: " + isAnd);
        logger.logRaw("IsOR: " + isOr);

        Condition cond = new Condition(test, isAnd, isOr, currConditionPart);

        logger.logInfo("New Conditions: " + cond);

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
        logger.logLine();
        logger.logRaw("Compiling AndFlagsCond:");
        logger.logRaw("FLAGS: " + flags.toString());

        setTest(new AndFlagsCond(flags));
    }

    public void compileEqualsCond(String lhs, String rhs, boolean bothVars) {
        logger.logLine();
        logger.logRaw("Compiling EqualsCond:");
        logger.logRaw("LHS: " + lhs);
        logger.logRaw("RHS: " + lhs);
        logger.logRaw("BOTH VARS: " + bothVars);

        setTest(new EqualsCond(id, lhs, rhs, bothVars));
    }

    public void compileGTCond(String lhs, String rhs, boolean bothVars) {
        logger.logLine();
        logger.logRaw("Compiling GTCond:");
        logger.logRaw("LHS: " + lhs);
        logger.logRaw("RHS: " + lhs);
        logger.logRaw("BOTH VARS: " + bothVars);

        setTest(new GTCond(id, lhs, rhs, bothVars));
    }

    public void compileHaveItemCond(Set<String> objs) {
        logger.logLine();
        logger.logRaw("Compiling HaveItemCond:");
        logger.logRaw("OBJS: " + objs.toString());

        setTest(new HaveItemCond(objs));
    }

    public void compileHaveItemsCond(Set<String> objs) {
        logger.logLine();
        logger.logRaw("Compiling HaveItemsCond:");
        logger.logRaw("OBJS: " + objs.toString());

        setTest(new HaveItemsCond(objs));
    }

    public void compileHereCond(Set<String> locs) {
        logger.logLine();
        logger.logRaw("Compiling HereCond:");
        logger.logRaw("LOCATIONS: " + locs.toString());

        setTest(new HereCond(locs));
    }

    public void compileLTCond(String lhs, String rhs, boolean bothVars) {
        logger.logLine();
        logger.logRaw("Compiling LTCond:");
        logger.logRaw("LHS: " + lhs);
        logger.logRaw("RHS: " + lhs);
        logger.logRaw("BOTH VARS: " + bothVars);

        setTest(new LTCond(id, lhs, rhs, bothVars));
    }

    public void compileOrFlagsCond(Set<String> flags) {
        logger.logLine();
        logger.logRaw("Compiling OrFlagsCond:");
        logger.logRaw("FLAGS: " + flags.toString());

        setTest(new OrFlagsCond(flags));
    }

    public void compileFlagValue(String flag, int value) {
        logger.logLine();
        logger.logRaw("Compiling FlagValueCond:");
        logger.logRaw("FLAG: " + flag);
        logger.logRaw("VALUE: " + value);

        setTest(new FlagValueCond(flag, value));
    }

    public void compileOrPropertiesCond(String objID, Set<String> properties) {
        logger.logLine();
        logger.logRaw("Compiling OrPropertiesCond:");
        logger.logRaw("OBJECT: " + objID);
        logger.logRaw("PROPERTIES: " + properties.toString());

        setTest(new OrPropertiesCond(objID, properties));
    }

    public void compileAndPropertiesCond(String objID, Set<String> properties) {
        logger.logLine();
        logger.logRaw("Compiling AndPropertiesCond:");
        logger.logRaw("OBJECT: " + objID);
        logger.logRaw("PROPERTIES: " + properties.toString());

        setTest(new AndPropertiesCond(objID, properties));
    }

    public void compilePRSACond(Set<String> verbs) {
        logger.logLine();
        logger.logRaw("Compiling PRSACond:");
        logger.logRaw("VERBS: " + verbs.toString());

        setTest(new PRSACond(verbs));
    }

    public void compilePRSAAndCond(Set<String> verbs) {
        logger.logLine();
        logger.logRaw("Compiling PRSAAndCond:");
        logger.logRaw("VERBS: " + verbs.toString());

        setTest(new PRSAAndCond(verbs));
    }

    public void compilePRSICond(Set<String> objs) {
        logger.logLine();
        logger.logRaw("Compiling PRSICond:");
        logger.logRaw("OBJS: " + objs.toString());

        setTest(new PRSICond(objs));
    }

    public void compilePRSOCond(Set<String> objs) {
        logger.logLine();
        logger.logRaw("Compiling PRSOCond:");
        logger.logRaw("OBJS: " + objs.toString());

        setTest(new PRSOCond(objs));
    }

    // EFFECTS:

    public void compileGotoEff(String locID) {
        logger.logLine();
        logger.logRaw("Compiling GotoEff:");
        logger.logRaw("LOCATION: " + locID);

        addToLastActionBlock(new GotoEff(locID));
    }

    public void compilePlaceEff(String objID, String locID, int type) {
        logger.logLine();
        logger.logRaw("Compiling PlaceEff:");
        logger.logRaw("ITEM: " + objID);
        logger.logRaw("LOCATION: " + locID);
        logger.logRaw("LOCATION TYPE: " + type);

        addToLastActionBlock(new PlaceEff(objID, locID, type));
    }

    public void compileRemFlagEff(String flagID) {
        logger.logLine();
        logger.logRaw("Compiling RemFlagEff:");
        logger.logRaw("FLAG: " + flagID);

        addToLastActionBlock(new RemFlagEff(flagID));
    }

    public void compileSetEff(String var, String val) {
        logger.logLine();
        logger.logRaw("Compiling SetEff:");
        logger.logRaw("VARIABLE: " + var);
        logger.logRaw("VALUE: " + val);

        addToLastActionBlock(new SetEff(id, var, val));
    }

    public void compileSetFlagEff(String flagID, int val) {
        logger.logLine();
        logger.logRaw("Compiling SetFlagEff:");
        logger.logRaw("FLAG: " + flagID);
        logger.logRaw("VALUE: " + val);

        addToLastActionBlock(new SetFlagEff(flagID, val));
    }

    public void compileTakeEff(String objID) {
        logger.logLine();
        logger.logRaw("Compiling TakeEff:");
        logger.logRaw("ITEM: " + objID);

        addToLastActionBlock(new TakeEff(objID));
    }

    public void compileTellEff(String text) {
        logger.logLine();
        logger.logRaw("Compiling TellEff:");
        logger.logRaw("TEXT: " + text);

        addToLastActionBlock(new TellEff(text));
    }
}
