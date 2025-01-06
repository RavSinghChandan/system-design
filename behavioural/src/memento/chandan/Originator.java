package memento.chandan;

// Originator: Chandan (Palm Reader)
public class Originator {

    private String state; // The current prediction or work

    // Set the state (write a prediction)
    public void setState(String state) {
        this.state = state;
        System.out.println("Originator: Setting state to " + state);
    }

    // Get the current state
    public String getState() {
        return state;
    }

    // Save the state to a Memento
    public Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(state);
    }

    // Restore state from a Memento
    public void restoreFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }
}
