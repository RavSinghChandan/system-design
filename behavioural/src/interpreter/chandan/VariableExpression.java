package interpreter.chandan;

import java.util.Map;

public class VariableExpression implements Expression{
    private final String variable;

    public VariableExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return context.getOrDefault(variable, 0);
    }
}
