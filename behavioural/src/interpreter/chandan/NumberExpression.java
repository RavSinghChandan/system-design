package interpreter.chandan;

import java.util.Map;

public class NumberExpression implements Expression{
    private final int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return number;
    }
}
