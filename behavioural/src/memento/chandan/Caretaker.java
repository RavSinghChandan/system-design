package memento.chandan;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private final List<Memento> mementoList = new ArrayList<>();

    // Add a Memento to the list
    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    // Retrieve a Memento from the list
    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}
