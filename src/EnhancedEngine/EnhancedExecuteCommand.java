package EnhancedEngine;

import Game.GameController;
import Logging.DebugLogger;
import SimpleEngine.GameObject;
import alice.tuprolog.Var;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class EnhancedExecuteCommand {

    private static KnowledgeBase kb;
    private static DebugLogger logger;

    private static List<Extension> extensions = new ArrayList<>();
    private static List<String> failedQueryConds = new ArrayList<>();
    private static String skippedFailMessage;

    public static void initKB() {
        // Make sure the knowledge base is referenced
        if (kb == null) {
            kb = KnowledgeBase.getInstance();
        }
    }

    public static void addExtension(Extension extension) {
        extensions.add(extension);
    }

    public static void addFailedQueryCond(String query) {
        failedQueryConds.add(query);
    }

    public static void setSkippedFailMessage(String message) {
        skippedFailMessage = message;
    }

    public static void resetSkippedFailMessage() {
        skippedFailMessage = null;
    }

    // Assumes only 1 set of parenthesis in query
    public static String failedQueryCondsContainsQuery(String query) {
        String[] s1 = query.split("\\(");
        String functor = s1[0];
        String s2 = s1[1].substring(0, s1[1].length()-1);
        String[] params = s2.split(",");

        for (String q : failedQueryConds) {

            String[] q1 = q.split("\\(");
            String qfunctor = q1[0];
            if (!qfunctor.equals(functor)) { continue; }
            String q2 = q1[1].substring(0, q1[1].length()-1);
            String[] qparams = q2.split(",");

            if (qparams.length != params.length) { continue; }

            boolean match = true;
            for (int i = 0; i < qparams.length; i++) {
                if (qparams[i].charAt(0) == '_' || params[i].charAt(0) == '_'
                        || Character.isUpperCase(params[i].charAt(0)) || Character.isUpperCase(params[i].charAt(0))) {
                    continue;
                }
                if (!qparams[i].equals(params[i])) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return q;
            }
        }

        return null;
    }

    public static void resetFailedQueryConds() {
        failedQueryConds = new ArrayList<>();
    }

    public static boolean decodePRSAEnhanced(String correctedVerb) {

        if (logger == null) {
            logger = DebugLogger.getInstance();
        }

        if (correctedVerb == null) {
            return false; }

        try {
            Class<EnhancedExecuteCommand> c = EnhancedExecuteCommand.class;
            Method verbAction = c.getDeclaredMethod("cmd_" + correctedVerb.replace(' ', '_'));
            return (boolean)verbAction.invoke(null);
        }
        catch (Exception e) {
            // Try getting a result from one of the extensions
            for (Extension extension : extensions) {
                try {
                    boolean res =  extension.decodePRSAEnhanced(correctedVerb);
                    if (res) {
                        return true;
                    }
                }
                catch (Exception ignored) {
                }
            }

            if (skippedFailMessage != null) {
                System.out.println(skippedFailMessage);
                return true;
            }
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
        boolean[] failure = new boolean[]{false, false, false, false, false, false, false, false}; // [outOfScope(A), outOfScope(B), sameObject(A,B), capacity(B,_), tooBig(A,B), cantFit(A,B), targetClosed(B), already in]
        boolean atLeastOneFailure = false;

        if (kb.query("outOfScope(" + prsoID + ")").size() > 0) { failure[0] = true; atLeastOneFailure = true; }
        if (kb.query("outOfScope(" + prsiID + ")").size() > 0) { failure[1] = true; atLeastOneFailure = true; }
        if (kb.query("sameObject(" + prsoID + "," + prsiID + ")").size() > 0) { failure[2] = true; atLeastOneFailure = true; }
        if (kb.query(ContainerType.toLowerCase() + "(" + prsiID + ",_)").size() == 0) { failure[3] = true; atLeastOneFailure = true; }
        if (kb.query("tooBig" + ContainerType + "(" + prsoID + "," + prsiID + ")").size() > 0) { failure[4] = true; atLeastOneFailure = true; }
        if (kb.query("cantFit" + ContainerType + "(" + prsoID + "," + prsiID + ")").size() > 0) { failure[5] = true; atLeastOneFailure = true; }
        if (parentType == 0 && kb.query("targetClosed(" + prsiID + ")").size() > 0) { failure[6] = true; atLeastOneFailure = true; }
        if (kb.query("isLocated(" + prsoID + "," + prsiID + ",_)").size() > 0) { failure[7] = true; atLeastOneFailure = true; }

        if (failure[0]) { System.out.println("You do not have access to the " + prso.getName() + "."); }
        if (failure[1] && !failure[2]) { System.out.println("You do not have access to the " + prsi.getName() + "."); }
        if (failure[2]) { System.out.println("Why are you trying to put something " + failDescSubstitute + " itself?!"); }
        if (failure[7]) { System.out.print("The " + prso.getName() + " is already " + failDescSubstitute + " the " + prsi.getName() + "."); }
        if (failure[3]) { System.out.println("The " + prsi.getName() + " doesn't have anywhere to put the " + prso.getName() + " " + failDescSubstitute + " it."); }
        if (failure[4]) { System.out.println("The " + prso.getName() + " is too big to fit " + failDescSubstitute + " the " + prsi.getName() + "."); }
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
