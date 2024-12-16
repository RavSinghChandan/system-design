package interpreter.terminalExpression;

import interpreter.abstractExpression.Expression;
import interpreter.context.Context;

import java.util.Enumeration;

public class TerminalExpression implements Expression {
    private String value;

    public TerminalExpression(String value){
        this.value=value;
    }

    @Override
    public boolean interpret(Context context) {
        return context.getData().contentEquals(value);
    }
}
