package interpreter;

import interpreter.abstractExpression.Expression;
import interpreter.context.Context;
import interpreter.expression.AndExpression;
import interpreter.expression.OrExpression;
import interpreter.terminalExpression.TerminalExpression;

public class Client {
    public static void main(String[] args) {
        // Context
        Context context = new Context("Java Design Patterns Behavioral");

        // Terminal Expressions
        Expression java = new TerminalExpression("Java");
        Expression patterns = new TerminalExpression("Patterns");

        // Non-Terminal Expressions
        Expression andExpression = new AndExpression(java, patterns);
        Expression orExpression = new OrExpression(java, new TerminalExpression("Python"));

        // Client
        System.out.println("Does context contain both 'Java' and 'Patterns'? " + andExpression.interpret(context));
        System.out.println("Does context contain either 'Java' or 'Python'? " + orExpression.interpret(context));
    }
}
