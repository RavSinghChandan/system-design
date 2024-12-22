package builder;

import builder.builder.Builder;
import builder.chandan.Chandan;
import builder.chandan.ConcreteChandanBuilder;
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
        System.out.println("=================Chandan ===========");

        builder.chandan.Builder builder1 = new ConcreteChandanBuilder();
        builder.chandan.Director director1 = new builder.chandan.Director(builder1);

        director1.construct();
        Chandan chandanProduct = builder1.getResult();
        System.out.println("Constructed Chandan as Product : " + chandanProduct);
    }
}
