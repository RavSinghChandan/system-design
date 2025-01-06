package memento.chandan;

public class Memento {

    private final String state; // Immutable snapshot of the state

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
