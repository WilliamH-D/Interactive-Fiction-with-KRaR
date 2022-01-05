package EnhancedEngine;

import Game.GameController;
import Logging.DebugLogger;
import SimpleEngine.GameObject;
import alice.tuprolog.Var;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class EnhancedExecuteCommand {

    private static KnowledgeBase kb;
    private static DebugLogger logger;

    public static void initKB() {
        // Make sure the knowledge base is referenced
        if (kb == null) {
            kb = KnowledgeBase.getInstance();
        }
    }

    public static boolean decodePRSAEnhanced(String correctedVerb) {

        if (logger == null) {
            logger = DebugLogger.getInstance();
        }

        if (correctedVerb == null || !getVerbs().contains(correctedVerb)) { return false; }

        try {
            Class<EnhancedExecuteCommand> c = EnhancedExecuteCommand.class;
            Method verbAction = c.getDeclaredMethod("cmd_" + correctedVerb.replace(' ', '_'));
            return (boolean)verbAction.invoke(null);
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
            return false;
        }
    }

    public static boolean cmd_place_in() {
        logger.logDebug("Trying to place in");
        return placeSomewhere("In", "Capacity", "inside of", 0);
    }

    public static boolean cmd_place_on() {
        logger.logDebug("Trying to place on");
        return placeSomewhere("On", "Surface", "on top of", 1);
    }

    public static boolean cmd_place_under() {
        logger.logDebug("Trying to place under");
        return placeSomewhere("Below", "Below", "under", 2);
    }

    private static boolean placeSomewhere(String putType, String ContainerType, String failDescSubstitute, int parentType) {
        GameObject prso = GameController.getPRSO();
        GameObject prsi = GameController.getPRSI();
        String prsoID = prso.getId().toLowerCase();
        String prsiID = prsi.getId().toLowerCase();
        ArrayList<ArrayList<Var>> result = kb.query("put" + putType + "(" + prsoID + "," + prsiID + ")");

        if (result.size() > 0) {
            // Solution exists, so carry out effects of putting PRSO into PRSI
            prso.placeItem(prsi, parentType);
            return true;
        }

        // Find out why query failed and present info to player
        boolean[] failure = new boolean[]{false, false, false, false, false, false, false}; // [outOfScope(A), outOfScope(B), sameObject(A,B), capacity(B,_), tooBig(A,B), cantFit(A,B), targetClosed(B)]
        boolean atLeastOneFailure = false;

        if (kb.query("outOfScope(" + prsoID + ")").size() > 0) { failure[0] = true; atLeastOneFailure = true; }
        if (kb.query("outOfScope(" + prsiID + ")").size() > 0) { failure[1] = true; atLeastOneFailure = true; }
        if (kb.query("sameObject(" + prsoID + "," + prsiID + ")").size() > 0) { failure[2] = true; atLeastOneFailure = true; }
        if (kb.query(ContainerType.toLowerCase() + "(" + prsiID + ",_)").size() == 0) { failure[3] = true; atLeastOneFailure = true; }
        if (kb.query("tooBig" + ContainerType + "(" + prsoID + "," + prsiID + ")").size() > 0) { failure[4] = true; atLeastOneFailure = true; }
        if (kb.query("cantFit" + ContainerType + "(" + prsoID + "," + prsiID + ")").size() > 0) { failure[5] = true; atLeastOneFailure = true; }
        if (parentType == 0 && kb.query("targetClosed(" + prsiID + ")").size() > 0) { failure[6] = true; atLeastOneFailure = true; }

        if (failure[0]) { System.out.println("You do not have access to the " + prso.getName() + "."); }
        if (failure[1] && !failure[2]) { System.out.println("You do not have access to the " + prsi.getName() + "."); }
        if (failure[2]) { System.out.println("Why are you trying to put something " + failDescSubstitute + " itself?!"); }
        if (failure[3]) { System.out.println("The " + prsi.getName() + " doesn't have anywhere to put the " + prso.getName() + " " + failDescSubstitute + " it."); }
        if (failure[4]) { System.out.println("The " + prso.getName() + " is too big to fit " + failDescSubstitute + " the" + prsi.getName() + "."); }
        if (failure[5] && !failure[4]) { System.out.println("There's not enough space " + failDescSubstitute + " the " + prsi.getName() + ", perhaps try making some space first."); }
        if (failure[6]) { System.out.println("You can't put anything in the " + prsi.getName() + " when it's closed."); }
        return atLeastOneFailure;
    }

    public static void enhanced_cmd_open() {
        String objID = GameController.getPRSO().getId().toLowerCase();
        kb.removeClause("isClosed(" + objID + ",true)");
        kb.addClause("isClosed(" + objID + ",false)");
    }

    public static void enhanced_cmd_close() {
        String objID = GameController.getPRSO().getId().toLowerCase();
        kb.removeClause("isClosed(" + objID + ",false)");
        kb.addClause("isClosed(" + objID + ",true)");
    }

    // Return a list of all of the general commands that can be executed in the case of
    private static ArrayList<String> getVerbs() {
        ArrayList<String> verbs = new ArrayList<>();
        Class<EnhancedExecuteCommand> execcmd = EnhancedExecuteCommand.class;
        for (Method m : execcmd.getMethods()) {
            String name = m.getName();
            if (name.length() > 4 && name.substring(0, 4).equals("cmd_")) {
                verbs.add(name.substring(4).replace('_', ' '));
            }
        }
        return verbs;
    }
}
