package l.before;

public class Client {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        eagle.fly();  // Expected to work fine

        Bird penguin = new Penguin();
        penguin.fly();  // Breaks LSP, throws exception!
    }
}
