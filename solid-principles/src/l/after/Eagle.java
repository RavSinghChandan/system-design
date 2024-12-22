package l.after;

// Subclass (Eagle) that can fly
public class Eagle extends Bird implements Flyable {
    @Override
    public void makeSound() {
        System.out.println("Eagle is screeching!");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is soaring high!");
    }
}
