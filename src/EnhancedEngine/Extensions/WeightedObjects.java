package EnhancedEngine.Extensions;

import EnhancedEngine.Extension;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class WeightedObjects implements Extension {
    @Override
    public List<String> getClauses() {
        List<String> clauses = new ArrayList<>();

        // totalWeight(O,W,X,Y) returns the weight (W) of object (O) when the object has items (X) inside of it, and items (Y) on top of it
        clauses.add("totalWeight(O,W,X,Y) :- selfWeight(O,W2), setof(X, isLocated(X,O,0), IN), setof(Y, isLocated(Y,O,1), ON), !, weightInObject(X,O,W3), weightOnObject(Y,O,W4), W is W2+W3+W4");
        clauses.add("totalWeight(O,W,X,[]) :- selfWeight(O,W2), setof(X, isLocated(X,O,0), IN), !, weightInObject(X,O,W3), W is W2+W3");
        clauses.add("totalWeight(O,W,[],Y) :- selfWeight(O,W2), setof(Y, isLocated(Y,O,1), ON), !, weightOnObject(Y,O,W3), W is W2+W3");
        clauses.add("totalWeight(O,W,[],[]) :- selfWeight(O,W)");
        clauses.add("selfWeight(O,W) :- hasVariable(O,weight,W)");
        clauses.add("selfWeight(O,0) :- isObject(O), not(hasVariable(O,weight,W))");

        // weightOnObject(L,O,W) returns the weight (W) of the sum of items (L) on top of object (O)
        clauses.add("weightOnObject(L,O,W) :- setof(X, isLocated(X,O,1), L), !, weightOnObjectAux(L,O,W)");
        clauses.add("weightOnObjectAux([H|T],O,W) :- notMember(H,T), isLocated(H,O,1), !, weightOnObjectAux(T,O,W3), totalWeight(H,W2,_,_), W is W2 + W3");
        clauses.add("weightOnObjectAux(_,O,0)");

        // weightInObject(L,O,W) returns the weight (W) of the sum of items (L) inside of object (O)
        clauses.add("weightInObject(L,O,W) :- setof(X, isLocated(X,O,0), L), !, weightInObjectAux(L,O,W)");
        clauses.add("weightInObjectAux([H|T],O,W) :- notMember(H,T), isLocated(H,O,0), !, weightInObjectAux(T,O,W3), totalWeight(H,W2,_,_), W is W2 + W3");
        clauses.add("weightInObjectAux(_,O,0)");

        clauses.add("weightOnObjectEquals(O,W) :- weightOnObject(_,O,W2), W2 = W");
        clauses.add("weightOnObjectAtLeast(O,W) :- weightOnObject(_,O,W2), W2 >= W");
        clauses.add("weightOnObjectAtMost(O,W) :- weightOnObject(_,O,W2), W2 =< W");
        return clauses;
    }

    @Override
    public boolean decodePRSAEnhanced(String correctedVerb) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return false;
    }
}
