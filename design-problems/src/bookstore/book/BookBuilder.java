package bookstore.book;

public class BookBuilder {
    private String title;
    private String author;
    private double price;

    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public Book build() {
        return new Book(title, author, price);
    }
}