package l.after;

public class Client {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        eagle.makeSound();  // Expected behavior for Eagle
        if (eagle instanceof Flyable) {
            ((Flyable) eagle).fly();  // Eagle can fly
        }

        Bird penguin = new Penguin();
        penguin.makeSound();  // Expected behavior for Penguin
        // Penguin can't fly, no fly() method, safe from breaking LSP
    }
}
