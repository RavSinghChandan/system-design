package e.commerce.product;

import java.util.ArrayList;
import java.util.List;

public abstract class Category {

    private String name;
    private List<Product> products;

    public Category() {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public abstract void display();
}