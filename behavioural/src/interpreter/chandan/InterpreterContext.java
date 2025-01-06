package interpreter.chandan;

import java.util.HashMap;
import java.util.Map;

public class InterpreterContext {
    private final Map<String, Integer> variableMap;

    public InterpreterContext() {
        variableMap = new HashMap<>();
    }

    public void setVariable(String name, int value) {
        variableMap.put(name, value);
    }

    public int interpret(Expression expression) {
        return expression.interpret(variableMap);
    }

}
