package EnhancedEngine.Extensions;

import EnhancedEngine.Extension;

import java.util.ArrayList;
import java.util.List;

public class StackableObjects implements Extension {

    @Override
    public List<String> getClauses() {
        List<String> clauses = new ArrayList<>();
        clauses.add("stableStack([O],1,R) :- isRoom(R), isObject(O), isLocated(O,R,0), hasProperty(O, stable)");
        clauses.add("stableStack([H1|[H2|T]],M,R) :- isObject(H1), isLocated(H1,H2,1), hasProperty(H1, stable), stableStack([H2|T], N, R), M is N+1");

        clauses.add("stack([O],1,R) :- isRoom(R), isObject(O), isLocated(O,R,0)");
        clauses.add("stack([H1|[H2|T]],N,R) :- isObject(H1), isLocated(H1,H2,1), stableStack([H2|T], N, R), M is N+1");

        clauses.add("climbableStack(N,R) :- stableStack(_,N,R)");
        return clauses;
    }
}
