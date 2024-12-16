package interpreter.abstractExpression;

import interpreter.context.Context;

public interface Expression {
     boolean interpret(Context context);
}
