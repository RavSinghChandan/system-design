package facade.com.library;

public class BookBorrow {
    public void borrowBook(String title) {
        System.out.println("Borrowing the book: " + title);
        // Simulating book borrowed
        System.out.println("Book '" + title + "' has been borrowed.");
    }
}
