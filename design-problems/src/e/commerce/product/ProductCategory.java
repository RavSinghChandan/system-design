package e.commerce.product;

public class ProductCategory extends Category {

    private final String name;

    public ProductCategory(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Category: " + name);
    }
}
