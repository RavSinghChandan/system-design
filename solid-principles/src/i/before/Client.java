package i.before;

public class Client {
    public static void main(String[] args) {
        Machine printer = new Printer();
        printer.print("Document 1");
        printer.scan("Document 1"); // This throws an exception as the printer doesn't support scanning

        Machine scanner = new Scanner();
        scanner.print("Document 2"); // This throws an exception as the scanner doesn't support printing
        scanner.scan("Document 2");
    }
}
