package state;

import state.concreteContext.ConcreteContext;
import state.concreteState.ConcreteStateA;
import state.context.Context;

public class Client {
    public static void main(String[] args) {
        // Initialize the context with the initial state
        Context context = new ConcreteContext(new ConcreteStateA());

        // Simulate requests
        context.request(); // State A handles, transitions to State B
        System.out.println("===========================================");

        context.request(); // State B handles, transitions to State A
        System.out.println("===========================================");

        context.request(); // State A handles, transitions to State B
        System.out.println("===========================================");

        context.request(); // State A handles, transitions to State B
        System.out.println("===========================================");

        context.request(); // State B handles, transitions to State A
        System.out.println("===========================================");

        context.request(); // State A handles, transitions to State B
        System.out.println("===========================================");

        context.request(); // State B handles, transitions to State A
        System.out.println("===========================================");

        context.request(); // State A handles, transitions to State B
        System.out.println("===========================================");

        context.request(); // State B handles, transitions to State A
        System.out.println("===========================================");

        context.request(); // State A handles, transitions to State B
        System.out.println("===========================================");

        context.request(); // State B handles, transitions to State A
    }
}
