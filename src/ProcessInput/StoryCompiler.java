package ProcessInput;

import EnhancedEngine.EndCheck;
import EnhancedEngine.Extension;
import EnhancedEngine.TurnEndChecks;
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
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class StoryCompiler {

    private static StoryCompiler instance;

    // ID
    String id;

    Stack<Set<String>> flagConds = new Stack<>();

    // Directions
    String n;
    Set<String> nconds;
    ConditionTest ndirQuery;
    boolean nHidden;
    String nblockMessage;
    String s;
    Set<String> sconds;
    ConditionTest sdirQuery;
    boolean sHidden;
    String sblockMessage;
    String e;
    Set<String> econds;
    ConditionTest edirQuery;
    boolean eHidden;
    String eblockMessage;
    String w;
    Set<String> wconds;
    ConditionTest wdirQuery;
    boolean wHidden;
    String wblockMessage;
    String u;
    Set<String> uconds;
    ConditionTest udirQuery;
    boolean uHidden;
    String ublockMessage;
    String d;
    Set<String> dconds;
    ConditionTest ddirQuery;
    boolean dHidden;
    String dblockMessage;


    String name;
    String desc;

    List<String> altDescs = new ArrayList<>();
    List<Set<String>> altDescConds = new ArrayList<>();

    Set<String> synonyms;

    private List<String> queries = new ArrayList<>();

    String det;
    boolean useAre = false;

    String location; // Parent
    int locationType = 0;

    List<String> properties;
    Map<String, String> values;

    String flagName;
    int flagValue;

    private KnowledgeBase kb;

    private DebugLogger logger;

    private boolean playerStartSet = false;

    private List<ActionPart> ifEffects;
    private List<ActionPart> elseEffects;


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

        flagConds = new Stack<>();

        n = null;
        nconds = null;
        ndirQuery = null;
        nHidden = false;
        nblockMessage = null;
        s = null;
        sconds = null;
        sdirQuery = null;
        sHidden = false;
        sblockMessage = null;
        e = null;
        econds = null;
        edirQuery = null;
        eHidden = false;
        eblockMessage = null;
        w = null;
        wconds = null;
        wdirQuery = null;
        wHidden = false;
        wblockMessage = null;
        u = null;
        uconds = null;
        udirQuery = null;
        uHidden = false;
        ublockMessage = null;
        d = null;
        dconds = null;
        ddirQuery = null;
        dHidden = false;
        dblockMessage = null;

        name = null;
        desc = null;
        altDescs = new ArrayList<>();
        altDescConds = new ArrayList<>();

        queries = new ArrayList<>();

        synonyms = null;

        location = null;
        locationType = 0;

        properties = new ArrayList<>();
        values = new HashMap<>();

        flagName = null;
        flagValue = 0;

        det = null;
        useAre = false;

        ifEffects = null;
        elseEffects = null;
    }

    void compilePackages(List<String> packages){
        for (String s : packages) {
            try {
                Class<?> c = Class.forName("EnhancedEngine.Extensions." + s);
                Constructor<?> constructor = c.getConstructor();
                Extension instance = (Extension) constructor.newInstance();
                List<String> clauses = instance.getClauses();
                for (String clause : clauses) {
                    kb.addClause(clause);
                }
                logger.logRaw("Compiled package: " + s);
            }
            catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
                e.printStackTrace();
                logger.logDebug("Failed to compile package: " + s);
            }
        }
    }

    void compileRoom() {
        logger.logLine();
        logger.logRaw("Compile Room:");
        logger.logRaw("ID: " + id);
        logger.logRaw("N: " + n);
        logger.logRaw("NCONDS: " + nconds);
        logger.logRaw("NQUERY: " + ndirQuery);
        logger.logRaw("NHIDDEN: " + nHidden);
        logger.logRaw("NBLOCKMESSAGE: " + nblockMessage);
        logger.logRaw("S: " + s);
        logger.logRaw("SCONDS: " + sconds);
        logger.logRaw("SQUERY: " + sdirQuery);
        logger.logRaw("SHIDDEN: " + sHidden);
        logger.logRaw("SBLOCKMESSAGE: " + sblockMessage);
        logger.logRaw("E: " + e);
        logger.logRaw("ECONDS: " + econds);
        logger.logRaw("EQUERY: " + edirQuery);
        logger.logRaw("EHIDDEN: " + eHidden);
        logger.logRaw("EBLOCKMESSAGE: " + eblockMessage);
        logger.logRaw("W: " + w);
        logger.logRaw("WCONDS: " + wconds);
        logger.logRaw("WQUERY: " + wdirQuery);
        logger.logRaw("WHIDDEN: " + wHidden);
        logger.logRaw("WBLOCKMESSAGE: " + wblockMessage);
        logger.logRaw("U: " + u);
        logger.logRaw("UCONDS: " + uconds);
        logger.logRaw("UQUERY: " + udirQuery);
        logger.logRaw("UHIDDEN: " + uHidden);
        logger.logRaw("UBLOCKMESSAGE: " + ublockMessage);
        logger.logRaw("D: " + d);
        logger.logRaw("DCONDS: " + dconds);
        logger.logRaw("DQUERY: " + ddirQuery);
        logger.logRaw("DHIDDEN: " + dHidden);
        logger.logRaw("DBLOCKMESSAGE: " + dblockMessage);
        logger.logRaw("NAME: " + name);
        logger.logRaw("DESC: " + desc);
        for (int i = 0; i < altDescs.size(); i++) {
            logger.logRaw("ALTDESC: " + altDescs.get(i));
            logger.logRaw("ALTDESCCONDS: " + altDescConds.get(i));
        }
        logger.logRaw("SYNS: " + synonyms);
        logger.logRaw("DET: " + det);

        GameRoom room = new GameRoom(id);
        room.setParent("ROOT", 0);
        room.setNorth(n);
        room.setNConds(nconds);
        room.setNQuery(ndirQuery);
        room.setNhidden(nHidden);
        room.setNorthBlockMessage(nblockMessage);
        room.setSouth(s);
        room.setSConds(sconds);
        room.setSQuery(sdirQuery);
        room.setShidden(sHidden);
        room.setSouthBlockMessage(sblockMessage);
        room.setEast(e);
        room.setEConds(econds);
        room.setEQuery(edirQuery);
        room.setEhidden(eHidden);
        room.setEastBlockMessage(eblockMessage);
        room.setWest(w);
        room.setWConds(wconds);
        room.setWQuery(wdirQuery);
        room.setWhidden(wHidden);
        room.setWestBlockMessage(wblockMessage);
        room.setUp(u);
        room.setUConds(uconds);
        room.setUQuery(udirQuery);
        room.setUhidden(uHidden);
        room.setUpBlockMessage(ublockMessage);
        room.setDown(d);
        room.setDConds(dconds);
        room.setDQuery(ddirQuery);
        room.setDhidden(dHidden);
        room.setDownBlockMessage(dblockMessage);
        room.setName(name);
        room.setDesc(desc);
        for (int i = 0; i < altDescs.size(); i++) {
            room.addAltDesc(altDescs.get(i), altDescConds.get(i));
        }
        room.setSynonyms(synonyms);
        room.setDet(det);

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
        logger.logRaw("DET: " + det);
        logger.logRaw("USE ARE: " + useAre);

        GameObject obj = new GameObject(id);
        obj.setParent(location, locationType);
        obj.setParentType(locationType);
        obj.setName(name);
        obj.setDesc(desc);
        for (int i = 0; i < altDescs.size(); i++) {
            obj.addAltDesc(altDescs.get(i), altDescConds.get(i));
        }
        obj.setSynonyms(synonyms);
        obj.setDet(det);
        obj.setUseAre(useAre);
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
        if (obj.hasProperty("_CLOSABLECONTAINER")) {
            obj.addVariable("isClosed", "true");
            kb.addClause("isClosed(" + id.toLowerCase() + ",true)");
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

        //properties.forEach(property -> kb.addClause("hasProperty(" + id.toLowerCase() + "," + property.toLowerCase() + ")"));

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

        kb.addClause("flag(" + flagName.substring(1).toLowerCase() + "," + flagValue + ")");

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

    void setIsNot() {
        isNot = true; }

    private Condition popLastCondition() {
        return conditions.remove(conditions.size()-1);
    }

    private List<ActionPart> popLastActionBlock() {
        return action_blocks.remove(action_blocks.size()-1);
    }

    public ConditionTest popLastTest() {
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
    void newConditional() {
        newActionBlock();
        currConditionPart = null;
    }

    void addConditional() {
        conditions.add(currConditionPart);
    }

    void compileConditional() {
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

    void compileConditions(boolean isAnd, boolean isOr) {
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

    void compileAndFlagsCond(Set<String> flags) {
        logger.logLine();
        logger.logRaw("Compiling AndFlagsCond:");
        logger.logRaw("FLAGS: " + flags.toString());

        setTest(new AndFlagsCond(flags));
    }

    void compileEqualsCond(String lobj, String robj, String lhs, String rhs, boolean bothVars) {
        logger.logLine();
        logger.logRaw("Compiling EqualsCond:");
        logger.logRaw("LEFT OBJ: " + lobj);
        logger.logRaw("RIGHT OBJ: " + robj);
        logger.logRaw("LHS: " + lhs);
        logger.logRaw("RHS: " + lhs);
        logger.logRaw("BOTH VARS: " + bothVars);

        setTest(new EqualsCond(lobj, robj, lhs, rhs, bothVars));
    }

    void compileGTCond(String lobj, String robj, String lhs, String rhs, boolean bothVars) {
        logger.logLine();
        logger.logRaw("Compiling GTCond:");
        logger.logRaw("LEFT OBJ: " + lobj);
        logger.logRaw("RIGHT OBJ: " + robj);
        logger.logRaw("LHS: " + lhs);
        logger.logRaw("RHS: " + lhs);
        logger.logRaw("BOTH VARS: " + bothVars);

        setTest(new GTCond(lobj, robj, lhs, rhs, bothVars));
    }

    void compileHaveItemCond(Set<String> objs) {
        logger.logLine();
        logger.logRaw("Compiling HaveItemCond:");
        logger.logRaw("OBJS: " + objs.toString());

        setTest(new HaveItemCond(objs));
    }

    void compileHaveItemsCond(Set<String> objs) {
        logger.logLine();
        logger.logRaw("Compiling HaveItemsCond:");
        logger.logRaw("OBJS: " + objs.toString());

        setTest(new HaveItemsCond(objs));
    }

    void compileHereCond(Set<String> locs) {
        logger.logLine();
        logger.logRaw("Compiling HereCond:");
        logger.logRaw("LOCATIONS: " + locs.toString());

        setTest(new HereCond(locs));
    }

    void compileInScopeCond(String obj, Set<String> locs) {
        logger.logLine();
        logger.logRaw("Compiling InScopeCond:");
        logger.logRaw("OBJ: " + obj);
        logger.logRaw("LOCATIONS: " + locs.toString());

        setTest(new InScopeCond(obj, locs));
    }

    void compileLTCond(String lobj, String robj, String lhs, String rhs, boolean bothVars) {
        logger.logLine();
        logger.logRaw("Compiling LTCond:");
        logger.logRaw("LEFT OBJ: " + lobj);
        logger.logRaw("RIGHT OBJ: " + robj);
        logger.logRaw("LHS: " + lhs);
        logger.logRaw("RHS: " + lhs);
        logger.logRaw("BOTH VARS: " + bothVars);

        setTest(new LTCond(lobj, robj, lhs, rhs, bothVars));
    }

    void compileOrFlagsCond(Set<String> flags) {
        logger.logLine();
        logger.logRaw("Compiling OrFlagsCond:");
        logger.logRaw("FLAGS: " + flags.toString());

        setTest(new OrFlagsCond(flags));
    }

    void compileFlagValue(String flag, int value) {
        logger.logLine();
        logger.logRaw("Compiling FlagValueCond:");
        logger.logRaw("FLAG: " + flag);
        logger.logRaw("VALUE: " + value);

        setTest(new FlagValueCond(flag, value));
    }

    void compileOrPropertiesCond(String objID, Set<String> properties) {
        logger.logLine();
        logger.logRaw("Compiling OrPropertiesCond:");
        logger.logRaw("OBJECT: " + objID);
        logger.logRaw("PROPERTIES: " + properties.toString());

        setTest(new OrPropertiesCond(objID, properties));
    }

    void compileAndPropertiesCond(String objID, Set<String> properties) {
        logger.logLine();
        logger.logRaw("Compiling AndPropertiesCond:");
        logger.logRaw("OBJECT: " + objID);
        logger.logRaw("PROPERTIES: " + properties.toString());

        setTest(new AndPropertiesCond(objID, properties));
    }

    void compilePRSACond(Set<String> verbs) {
        logger.logLine();
        logger.logRaw("Compiling PRSACond:");
        logger.logRaw("VERBS: " + verbs.toString());

        setTest(new PRSACond(verbs));
    }

    void compilePRSAAndCond(Set<String> verbs) {
        logger.logLine();
        logger.logRaw("Compiling PRSAAndCond:");
        logger.logRaw("VERBS: " + verbs.toString());

        setTest(new PRSAAndCond(verbs));
    }

    void compilePRSICond(Set<String> objs) {
        logger.logLine();
        logger.logRaw("Compiling PRSICond:");
        logger.logRaw("OBJS: " + objs.toString());

        setTest(new PRSICond(objs));
    }

    void compilePRSOCond(Set<String> objs) {
        logger.logLine();
        logger.logRaw("Compiling PRSOCond:");
        logger.logRaw("OBJS: " + objs.toString());

        setTest(new PRSOCond(objs));
    }

    void compileQueryCond() {
        logger.logLine();
        logger.logRaw("Compiling QueryCond:");
        logger.logRaw("Queries: " + queries.toString());

        setTest(new QueryCond(queries));
        queries = new ArrayList<>();
    }

    // EFFECTS:

     void compileGotoEff(String locID) {
        logger.logLine();
        logger.logRaw("Compiling GotoEff:");
        logger.logRaw("LOCATION: " + locID);

        addToLastActionBlock(new GotoEff(locID));
    }

    void compilePlaceEff(String objID, String locID, int type) {
        logger.logLine();
        logger.logRaw("Compiling PlaceEff:");
        logger.logRaw("ITEM: " + objID);
        logger.logRaw("LOCATION: " + locID);
        logger.logRaw("LOCATION TYPE: " + type);

        addToLastActionBlock(new PlaceEff(objID, locID, type));
    }

    void compileRemFlagEff(String flagID) {
        logger.logLine();
        logger.logRaw("Compiling RemFlagEff:");
        logger.logRaw("FLAG: " + flagID);

        addToLastActionBlock(new RemFlagEff(flagID));
    }

    void compileSetVarEff(String id, String var, String val) {
        logger.logLine();
        logger.logRaw("Compiling SetVarEff:");
        logger.logRaw("ID: " + id);
        logger.logRaw("VARIABLE: " + var);
        logger.logRaw("VALUE: " + val);

        addToLastActionBlock(new SetVarEff(id, var, val));
    }

    void compileIncVarEff(String id, String var, float val) {
        logger.logLine();
        logger.logRaw("Compiling SetVarEff:");
        logger.logRaw("ID: " + id);
        logger.logRaw("VARIABLE: " + var);
        logger.logRaw("VALUE: " + val);

        addToLastActionBlock(new IncVarEff(id, var, val));
    }

    void compileDecVarEff(String id, String var, float val) {
        logger.logLine();
        logger.logRaw("Compiling SetVarEff:");
        logger.logRaw("ID: " + id);
        logger.logRaw("VARIABLE: " + var);
        logger.logRaw("VALUE: " + val);

        addToLastActionBlock(new DecVarEff(id, var, val));
    }

    void compileSetFlagEff(String flagID, int val) {
        logger.logLine();
        logger.logRaw("Compiling SetFlagEff:");
        logger.logRaw("FLAG: " + flagID);
        logger.logRaw("VALUE: " + val);

        addToLastActionBlock(new SetFlagEff(flagID, val));
    }

    void compileTakeEff(String objID) {
        logger.logLine();
        logger.logRaw("Compiling TakeEff:");
        logger.logRaw("ITEM: " + objID);

        addToLastActionBlock(new TakeEff(objID));
    }

    void compileTellEff(String text) {
        logger.logLine();
        logger.logRaw("Compiling TellEff:");
        logger.logRaw("TEXT: " + text);

        addToLastActionBlock(new TellEff(text));
    }

    void compileAddPropertyEff(String id, String property) {
        logger.logLine();
        logger.logRaw("Compiling AddPropertyEff:");
        logger.logRaw("ITEM: " + id);
        logger.logRaw("PROPERTY: " + property);

        addToLastActionBlock(new AddPropertyEff(id, property));

    }

    void compileRemovePropertyEff(String id, String property) {
        logger.logLine();
        logger.logRaw("Compiling RemovePropertyEff:");
        logger.logRaw("ITEM: " + id);
        logger.logRaw("PROPERTY: " + property);

        addToLastActionBlock(new RemovePropertyEff(id, property));

    }

    void compileAddQueryEff() {
        // TODO - instantiate AddQueryEff
    }

    void compileRemoveQueryEff() {
        // TODO - instantiate RemQueryEff
    }

    void compileQuery(String query) {
        queries.add(query);
    }

    void compileCheckEntry() {
        EndCheck endCheck = new EndCheck(tests, ifEffects, elseEffects);
        TurnEndChecks.getInstance().addEndCheck(endCheck);

        logger.logLine();
        logger.logDebug("Compiling EncCheck:");
        logger.logDebug("Queries: " + tests.toString());
        logger.logDebug("ifEffects: " + ifEffects.toString());
        logger.logDebug("elseEffects: " + elseEffects.toString());

        tests = new ArrayList<>();
        ifEffects = null;
        elseEffects = null;
    }

    void compileIfEffects() {
        ifEffects = popLastActionBlock();
    }

    void compileElseEffects() {
        elseEffects = popLastActionBlock();
    }
}
