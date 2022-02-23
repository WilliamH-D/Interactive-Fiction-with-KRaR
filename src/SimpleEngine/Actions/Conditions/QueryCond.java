package SimpleEngine.Actions.Conditions;

import EnhancedEngine.KnowledgeBase;
import SimpleEngine.Actions.ConditionTest;

import java.util.List;

public class QueryCond extends ConditionTest {

    private List<String> queries;
    private KnowledgeBase kb;

    public QueryCond(List<String> queries) {
        this.queries = queries;
        this.kb = KnowledgeBase.getInstance();
    }

    @Override
    public boolean satisfied() {
        logger.logDebug("Checking QueryCond: Check that all of the following queries are satisfied: " + queries);
        for (String q : queries) {
            if(!(kb.query(q).size() > 0)) {
                logger.logDebug("QueryCond not satisfied since query: " + q + " has no solutions");
                return false;
            }
        }
        logger.logDebug("QueryCond satisfied");
        return true;
    }

    @Override
    public String toString() {
        return "Query: " + queries;
    }

    public List<String> getQueries() {
        return queries;
    }
}
