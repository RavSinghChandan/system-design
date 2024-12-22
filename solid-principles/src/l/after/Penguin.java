package l.after;

// Subclass (Penguin) that can't fly, no fly() method
public class Penguin extends Bird {
    @Override
    public void makeSound() {
        System.out.println("Penguin is honking!");
    }
}
