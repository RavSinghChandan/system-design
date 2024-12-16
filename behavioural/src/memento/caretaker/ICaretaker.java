package memento.caretaker;

import memento.memento.IMemento;
import memento.memento.Memento;

public interface ICaretaker {
    void saveMemento(IMemento memento);
    IMemento getMemento();
}
