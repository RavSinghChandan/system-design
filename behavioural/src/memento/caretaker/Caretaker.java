package memento.caretaker;

import memento.memento.IMemento;
import memento.memento.Memento;

public class Caretaker implements ICaretaker{
   private IMemento memento;
    @Override
    public void saveMemento(IMemento memento) {
        this.memento=memento;
    }

    @Override
    public IMemento getMemento() {
        return memento;
    }
}
