package state.concreteState;

import state.context.Context;
import state.state.State;

public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("State B is handling the request :)");
        context.setState(new ConcreteStateA());
        System.out.println("Transition to the state A from state B");
    }
}
