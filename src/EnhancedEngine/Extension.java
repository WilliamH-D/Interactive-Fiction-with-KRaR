package EnhancedEngine;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface Extension {

    List<String> getClauses();

    boolean decodePRSAEnhanced(String correctedVerb) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;
}
