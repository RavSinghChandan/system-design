package builder;

import builder.builder.Builder;
import builder.concreteBuilder.ConcreteBuilder;
import builder.director.Director;
import builder.product.Product;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        director.construct();
        Product product = builder.getResult();

        System.out.println("Constructed Product: " + product);
    }
}
