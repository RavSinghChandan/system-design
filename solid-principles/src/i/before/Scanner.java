package i.before;

public class Scanner implements Machine {
    @Override
    public void print(String content) {
        // Scanner doesn't need to print, so this is also unnecessary
        throw new UnsupportedOperationException("Scanner cannot print.");
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }
}