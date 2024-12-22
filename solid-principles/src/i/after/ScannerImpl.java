package i.after;

public class ScannerImpl implements Scanner {
    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }
}
