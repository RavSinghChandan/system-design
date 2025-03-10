package facade.com.library;

public class LibraryFacade {
    private BookSearch bookSearch;
    private BookBorrow bookBorrow;
    private BookReturn bookReturn;

    public LibraryFacade() {
        this.bookSearch = new BookSearch();
        this.bookBorrow = new BookBorrow();
        this.bookReturn = new BookReturn();
    }

    public void searchBook(String title) {
        bookSearch.searchBook(title);
    }

    public void borrowBook(String title) {
        bookSearch.searchBook(title); // Ensure book is available
        bookBorrow.borrowBook(title);
    }

    public void returnBook(String title) {
        bookReturn.returnBook(title);
    }
}
