package bookstore.book;

public class Category {
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public void displayCategory() {
        System.out.println("Category: " + name);
    }
}

