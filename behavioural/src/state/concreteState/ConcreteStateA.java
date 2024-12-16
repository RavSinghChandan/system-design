package state.concreteState;

import state.context.Context;
import state.state.State;

public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("State A is handling the request :) ");
        context.setState(new ConcreteStateB());
        System.out.println("Transition to the state B from state A");
    }
}
