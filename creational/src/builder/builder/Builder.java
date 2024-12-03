package builder.builder;

import builder.product.Product;

public interface Builder {

    void buildPartA();
    void buildPartB();
    void buildPartC();
    Product getResult();
}
