package i.before;

public class Printer implements Machine {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String document) {
        // Printer does not need to implement scan, but we are forced to do it due to the large interface
        throw new UnsupportedOperationException("Printer cannot scan.");
    }
}
