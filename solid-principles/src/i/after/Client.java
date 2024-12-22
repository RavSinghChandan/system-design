package i.after;

public class Client {
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();
        printer.print("Document 1");

        Scanner scanner = new ScannerImpl();
        scanner.scan("Document 2");
    }
}
