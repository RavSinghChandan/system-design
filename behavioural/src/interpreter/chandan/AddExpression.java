package interpreter.chandan;

import java.util.Map;

public class AddExpression implements Expression{
    private final Expression leftExpression;
    private final Expression rightExpression;

    public AddExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}
