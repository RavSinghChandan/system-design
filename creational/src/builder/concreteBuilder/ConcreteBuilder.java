package builder.concreteBuilder;

import builder.builder.Builder;
import builder.product.Product;

public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("Part A built by ConcreteBuilder");
    }

    @Override
    public void buildPartB() {
        product.setPartB("Part B built by ConcreteBuilder");
    }

    @Override
    public void buildPartC() {
        product.setPartC("Part C built by ConcreteBuilder");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
