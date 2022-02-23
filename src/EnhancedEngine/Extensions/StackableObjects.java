package EnhancedEngine.Extensions;

import EnhancedEngine.EnhancedExecuteCommand;
import EnhancedEngine.Extension;
import EnhancedEngine.KnowledgeBase;
import Game.GameController;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class StackableObjects implements Extension {

    @Override
    public List<String> getClauses() {
        List<String> clauses = new ArrayList<>();
        clauses.add("stableStack([O],1,R) :- isRoom(R), isObject(O), isLocated(O,R,0), hasProperty(O, stable)");
        clauses.add("stableStack([H1|[H2|T]],M,R) :- isObject(H1), isLocated(H1,H2,1), hasProperty(H1, stable), stableStack([H2|T], N, R), M is N+1");

        clauses.add("stack([O],1,R) :- isRoom(R), isObject(O), isLocated(O,R,0)");
        clauses.add("stack([H1|[H2|T]],M,R) :- isObject(H1), isLocated(H1,H2,1), stableStack([H2|T], N, R), M is N+1");

        clauses.add("climbableStack(N,R) :- stableStack(_,N,R)");

        clauses.add(("notClimbableStackError(N,R) :- stack(_,N,R),not(climbableStack(N,R))"));
        return clauses;
    }

    @Override
    public boolean decodePRSAEnhanced(String correctedVerb) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<StackableObjects> c = StackableObjects.class;
        Method verbAction = c.getDeclaredMethod("cmd_" + correctedVerb.replace(' ', '_'));
        return (boolean)verbAction.invoke(null);
    }

    public static boolean cmd_climb() {
        return stackableObjectFailure();
    }

    public static boolean cmd_move() {
        return stackableObjectFailure();
    }

    private static boolean stackableObjectFailure() {
        if (!GameController.getPRSO().getId().equals("UP")) {
            return false;
        }

        String climbError = EnhancedExecuteCommand.failedQueryCondsContainsQuery("climbableStack(N,R)");
        if (climbError == null) {
            return false;
        }

        String s1 = climbError.split("\\(")[1];
        String n = s1.split(",")[0];
        String s2 = s1.split(",")[1];
        String r = s2.substring(0, s2.length()-1);

        String query = "notClimbableStackError(" + n + "," + r + ")";

        if (KnowledgeBase.getInstance().query(query).size() > 0) {
            System.out.println("One of the objects in your stack is unstable, there's no way you can climb this!");
            return true;
        }

        return false;
    }
}
