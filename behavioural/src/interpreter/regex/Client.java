package interpreter.regex;

public class Client {
    public static void main(String[] args) {
        Expression expr1 = new LiteralExpression("hello");
        Expression expr2 = new LiteralExpression("world");

        Expression orExpression = new OrExpression(expr1, expr2);
        Expression andExpression = new AndExpression(expr1, expr2);

        String testString1 = "hello everyone";
        String testString2 = "hello world!";
        String testString3 = "goodbye world";

        System.out.println("OR Expression Test:");
        System.out.println("Does 'hello everyone' match? " + orExpression.interpret(testString1));
        System.out.println("Does 'hello world!' match? " + orExpression.interpret(testString2));
        System.out.println("Does 'goodbye world' match? " + orExpression.interpret(testString3));

        System.out.println("\nAND Expression Test:");
        System.out.println("Does 'hello world!' match? " + andExpression.interpret(testString2));
        System.out.println("Does 'hello everyone' match? " + andExpression.interpret(testString1));

    }
}
