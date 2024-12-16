package state.concreteContext;

import state.context.Context;
import state.state.State;

public class ConcreteContext implements Context {
    private State currentState;
    public ConcreteContext(State currentState){
        this.currentState = currentState;
    }
    @Override
    public void setState(State state) {
        this.currentState= state;
    }

    @Override
    public void request() {
        currentState.handle(this);
    }
}
