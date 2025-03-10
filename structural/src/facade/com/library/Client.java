package facade.com.library;

public class Client {
    public static void main(String[] args) {
        LibraryFacade library = new LibraryFacade();

        System.out.println("\n--- Searching Book ---");
        library.searchBook("Design Patterns in Java");

        System.out.println("\n--- Borrowing Book ---");
        library.borrowBook("Clean Code");

        System.out.println("\n--- Returning Book ---");
        library.returnBook("Clean Code");
    }
}
