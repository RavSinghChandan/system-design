package interpreter.chandan;

public class Client {
    public static void main(String[] args) {
        // Context
        InterpreterContext context = new InterpreterContext();
        context.setVariable("experience", 10); // Chandan's experience
        context.setVariable("skills", 5);     // Chandan's skills

        // Expression: (experience + skills) * 2
        Expression experience = new VariableExpression("experience");
        Expression skills = new VariableExpression("skills");
        Expression addition = new AddExpression(experience, skills);
        Expression multiplication = new MultiplyExpression(addition, new NumberExpression(2));

        // Interpretation
        int result = context.interpret(multiplication);
        System.out.println("Result of interpreting the expression: (experience + skills) * 2 = " + result);
    }
}
