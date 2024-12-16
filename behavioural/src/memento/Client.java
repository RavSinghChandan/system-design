package memento;

import memento.caretaker.Caretaker;
import memento.memento.IMemento;
import memento.originator.Originator;

public class Client{
    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // Saving state
        originator.setState("State #1");
        caretaker.saveMemento(originator.saveStateToMemento());

        // Change state
        originator.setState("State #2");

        // Set the memento to the originator
        originator.setMemento(caretaker.getMemento());

        // Restore saved state
        originator.restoreStateFromMemento();
    }
}
