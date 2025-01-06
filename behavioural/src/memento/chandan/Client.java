package memento.chandan;

public class Client {
    public static void main(String[] args) {
        // Create Originator (Chandan)
        Originator chandan = new Originator();
        Caretaker caretaker = new Caretaker();

        // Chandan writes predictions
        chandan.setState("Prediction 1: You will have a great day!");
        caretaker.addMemento(chandan.saveToMemento()); // Save state

        chandan.setState("Prediction 2: Big success is coming your way!");
        caretaker.addMemento(chandan.saveToMemento()); // Save state

        chandan.setState("Prediction 3: Travel is in your future!");
        // No save here (we lose this if we restore)

        // Restore the second prediction
        chandan.restoreFromMemento(caretaker.getMemento(1));

        // Restore the first prediction
        chandan.restoreFromMemento(caretaker.getMemento(0));
    }
}
