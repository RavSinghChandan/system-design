package memento.originator;

import memento.memento.IMemento;
import memento.memento.Memento;

public class Originator {
    private String state;
    private IMemento memento;

    public Originator() {
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }

    public void setState(String state) {
        this.state = state;
    }

    public IMemento saveStateToMemento() {
        System.out.println("Saving state: " + state);
        return new Memento(state);
    }

    public void restoreStateFromMemento() {
        if (memento != null) {
            this.state = memento.getState();
            System.out.println("Restored state to: " + state);
        } else {
            System.out.println("Memento is not set, cannot restore state.");
        }
    }
}
