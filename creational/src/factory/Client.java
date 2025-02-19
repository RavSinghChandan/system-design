package factory;

import factory.chandan.Chandan;
import factory.creator.Shape;
import factory.chandan.ChandanFactory;
import factory.factory.ShapeFactory;

public class Client {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("Circle");
        circle.draw();

        Shape rectangle = factory.getShape("Rectangle");
        rectangle.draw();

        Shape wrongShape = factory.getShape("Spelling Error");
        //wrongShape.draw();

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        ChandanFactory chandanFactory = new ChandanFactory();
        Chandan developer = chandanFactory.getChandan("Developer");
        developer.createChandan();

        Chandan devotee = chandanFactory.getChandan("Devotee");
        devotee.createChandan();

        Chandan farmer = chandanFactory.getChandan("Farmer");
        farmer.createChandan();

    }
}
