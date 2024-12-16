package state.context;

import state.state.State;

public interface Context {
    void setState(State state);
    void request();
}
