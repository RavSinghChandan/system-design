package e.commerce.product;

import java.util.ArrayList;
import java.util.List;

public class CompositeCategory extends Category {

    private final String name;
    private final List<Category> subcategories = new ArrayList<>();

    public CompositeCategory(String name) {
        super();
        this.name = name;
    }

    public void addCategory(Category category) {
        subcategories.add(category);
    }

    @Override
    public void display() {
        System.out.println("Composite Category: " + name);
        for (Category category : subcategories) {
            category.display();
        }
    }
}
