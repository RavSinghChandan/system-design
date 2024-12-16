package memento.memento;

public class Memento implements IMemento{
    private String state;
    public Memento(String state){
        this.state=state;
    }
    @Override
    public String getState() {
        return state;
    }
}
