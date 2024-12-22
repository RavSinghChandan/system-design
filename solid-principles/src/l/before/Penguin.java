package l.before;

public class Penguin extends Bird{
    @Override
    public void fly() {
        // Penguin can't fly, this would break the expected behavior of the base class
        throw new UnsupportedOperationException("Penguin can't fly!");
    }
}
