package EnhancedEngine;

import Game.GameController;
import Logging.DebugLogger;
import SimpleEngine.GameObject;
import SimpleEngine.GameState;
import alice.tuprolog.*;
import alice.tuprolog.Var;
import alice.tuprolog.exceptions.*;

import java.util.ArrayList;

public class KnowledgeBase {

    private static KnowledgeBase KB;
    private Prolog engine;
    private ArrayList<Term> clauses;
    private boolean dirty;
    private boolean debug;
    private DebugLogger logger;

    private KnowledgeBase() {
        this.engine = new Prolog();
        this.clauses = new ArrayList<>();
        this.dirty = false;
        this.debug = false;
        this.logger = DebugLogger.getInstance();
        addRules();
    }

    //Get the singleton instance
    public static KnowledgeBase getInstance() {
        if (KB == null) {
            KB = new KnowledgeBase();
        }
        return KB;
    }

    private void addRules() {
        addClause("isObject(" + GameController.getPlayer().getId().toLowerCase() + ")");
        addClause("capacity(" + GameController.getPlayer().getId().toLowerCase() + "," + Integer.MAX_VALUE + ")");
        addClause("capacityUsed(" + GameController.getPlayer().getId().toLowerCase() + ",0)");

        // Object is in scope (first arg is object, second arg is the scope of the object)
        addClause("inScope(A,B) :- isObject(A), isLocated(A,B), isLocated(" + GameController.getPlayer().getId() + ",B),!");
        addClause("inScope(A,C) :- isObject(A), isLocated(A,B), inScope(B,C)");

        // Put object in other object (put object A inside object B)
        addClause("putIn(A,B) :- inScope(A,C), inScope(B,C), A \\= B, volume(A,X), capacity(B,Y), capacityUsed(B,Z), Y2 is Y+1, X+Z<Y2");
        addClause("putInIgnoreScope(A,B) :- A \\= B, volume(A,X), capacity(B,Y), capacityUsed(B,Z), Y2 is Y+1, X+Z<Y2");

        // Put object on top of other object (put object A on top of object B)
        addClause("putOn(A,B) :- inScope(A,C), inScope(B,C), A \\= B, volume(A,X), surface(B,Y), surfaceUsed(B,Z), Y2 is Y+1, X+Z<Y2");
        addClause("putOnIgnoreScope(A,B) :- A \\= B, volume(A,X), surface(B,Y), surfaceUsed(B,Z), Y2 is Y+1, X+Z<Y2");

        // Put object below other object (put object A below object B)
        addClause("putBelow(A,B) :- inScope(A,C), inScope(B,C), A \\= B, volume(A,X), below(B,Y), belowUsed(B,Z), Y2 is Y+1, X+Z<Y2");
        addClause("putBelowIgnoreScope(A,B) :- A \\= B, volume(A,X), below(B,Y), belowUsed(B,Z), Y2 is Y+1, X+Z<Y2");
    }

    // Used for debugging with print statements
    public void setDebug(boolean d) {
        this.debug = d;
    }

    // List all of the clauses in the knowledge base
    public void printKB() {
        logger.logLine();
        logger.logRaw("Knowledge Base:");
        for (Term t : this.clauses) {
            logger.logRaw(t.toString());
        }
    }

    // Query from the knowledge base, print results to console with no returned objects
    public ArrayList<ArrayList<Var>> query(String q) {
        ArrayList<ArrayList<Var>> solutions = new ArrayList<>();
        try {
            replaceTheory();
            q = q.replaceAll("\\s", "");
            SolveInfo info = this.engine.solve(q + ".");
            if (this.debug) {
                logger.logLine();
                logger.logRaw("DEBUG: Querying: " + q);
            }
            while (info.isSuccess()) {
                if (this.debug) {
                    logger.logRaw("DEBUG: Solution: " + info.getSolution() +
                            " - bindings: " + info);
                }
                solutions.add((ArrayList<Var>) info.getBindingVars());
                if (this.engine.hasOpenAlternatives()) {
                    info = this.engine.solveNext();
                } else {
                    break;
                }
            }
        }
        catch (MalformedGoalException | NoSolutionException | NoMoreSolutionException ignored) { }
        return solutions;
    }

    // Add a new clause to the knowledge base
    public Term addClause(String clause) {
        if (this.debug) { logger.logLine(); }
        Term c = Term.createTerm(clause);
        if (!this.clauses.contains(c)) {
            this.clauses.add(c);
            this.dirty = true;
            if (this.debug) { logger.logRaw("DEBUG: Adding clause " + c); }
        }
        else if (this.debug) { logger.logRaw("DEBUG: Clause " + c + " already exists"); }
        return c;
    }

    // Remove the input clause, as well as any unifying clauses if removeUni is set
    public void removeClause(Term clause, Boolean removeUni) {
        if (this.debug) { logger.logLine(); }
        boolean removedFlag = false;
        if (this.clauses.contains(clause)) {
            this.clauses.remove(clause);
            this.dirty = true;
            removedFlag = true;
            if (this.debug) { logger.logRaw("DEBUG: Removed clause " + clause); }
        }

        ArrayList<Term> toRemove = new ArrayList<>();
        if (removeUni) {
            Term backup = clause.copy();
            for (Term t : this.clauses) {
                if (clause.unify(this.engine, t)) {
                    toRemove.add(t);
                    clause = backup.copy();
                }
            }
            for (Term t : toRemove) {
                this.clauses.remove(t);
                if (this.debug) {
                    logger.logRaw("DEBUG: Removed clause " + t);
                }
                if (!removedFlag) {
                    removedFlag = true;
                }
            }
        }
        if (toRemove.size() > 0 && !this.dirty) { this.dirty = true; }
        else if (this.debug && !removedFlag) { logger.logRaw("DEBUG: Clause " + clause + " could not be removed"); }
    }

    // Remove all clauses that unify with the input from the knowledge base
    public void removeClause(String clause, Boolean removeUni) {
        removeClause(Term.createTerm(clause), removeUni);
    }

    // Remove only the clause that matches the input string
    public void removeClause(String clause) {
        removeClause(Term.createTerm(clause), false);
    }

    // Remove only the input clause
    public void removeClause(Term clause) {
        removeClause(clause, false);
    }

    // Reset the knowledge base with the current list of clauses
    private void replaceTheory() {
        if (this.dirty) {
            this.engine.setTheory(new Theory(new Struct(this.clauses)));
            this.dirty = false;
        }
    }

    // Set capacityUsed/surfaceUsed/belowUsed for objects that already have something in/on/below them
    public void initVariablesAfterCompilation() {
        ArrayList<ArrayList<Var>> objects = query("isObject(X)");
        for (ArrayList<Var> solution : objects) {
            String id = solution.get(0).getTerm().toString().toUpperCase();

            // Ignore player case
            if (id.equals("PLAYER")) {
                continue;
            }

            GameObject obj = GameState.getGameObject(id);

            //Ignore if parent doesn't exist
            if (obj.getParent() == null) {
                continue;
            }

            GameObject parent = GameState.getGameObject(obj.getParent());

            // Ignore if parent isn't an object or parent is player
            if (query("isObject(" + parent.getId().toLowerCase() + ")").size() == 0 || parent.equals(GameController.getPlayer())) {
                continue;
            }

            int state = obj.getParentType();

            try {
                switch (state) {
                    case 0:
                        int volume = Integer.parseInt(obj.getVariable("volume"));
                        int capacityUsed = Integer.parseInt(query("capacityUsed(" + parent.getId().toLowerCase() + ",X)").get(0).get(0).getTerm().toString());
                        int newCapacityUsed = capacityUsed + volume;
                        removeClause("capacityUsed(" + parent.getId().toLowerCase() + ",X)", true);
                        addClause("capacityUsed(" + parent.getId().toLowerCase() + "," + newCapacityUsed + ")");
                        break;
                    case 1:
                        volume = Integer.parseInt(obj.getVariable("volume"));
                        int surfaceUsed = Integer.parseInt(query("surfaceUsed(" + parent.getId().toLowerCase() + ",X)").get(0).get(0).getTerm().toString());
                        int newSurfaceUsed = surfaceUsed + volume;
                        removeClause("surfaceUsed(" + parent.getId().toLowerCase() + ",X)", true);
                        addClause("surfaceUsed(" + parent.getId().toLowerCase() + "," + newSurfaceUsed + ")");
                        break;
                    case 2:
                        volume = Integer.parseInt(obj.getVariable("volume"));
                        int belowUsed = Integer.parseInt(query("belowUsed(" + parent.getId().toLowerCase() + ",X)").get(0).get(0).getTerm().toString());
                        int newBelowUsed = belowUsed + volume;
                        removeClause("belowUsed(" + parent.getId().toLowerCase() + ",X)", true);
                        addClause("belowUsed(" + parent.getId().toLowerCase() + "," + newBelowUsed + ")");
                        break;
                }
            }
            catch (Exception e) {
                DebugLogger.getInstance().logError("Error initialising parent variables for " + obj.getId());
            }
        }
    }
}
