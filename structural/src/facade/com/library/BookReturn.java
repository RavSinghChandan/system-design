package facade.com.library;

public class BookReturn {
    public void returnBook(String title) {
        System.out.println("Returning the book: " + title);
        // Simulating book return
        System.out.println("Book '" + title + "' has been returned.");
    }
}
