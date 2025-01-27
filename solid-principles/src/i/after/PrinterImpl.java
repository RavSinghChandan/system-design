package i.after;

public class PrinterImpl implements Printer {

     @Override
    public void print(String content) {

         System.out.println("Printing: " + content);
    }
}
