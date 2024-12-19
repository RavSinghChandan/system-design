package factory;

import factory.creator.Chandan;
import factory.creator.Shape;
import factory.factory.ChandanFactory;
import factory.factory.ShapeFactory;

public class Client {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();

        Shape wrongShape = shapeFactory.getShape("Spelling Error");
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
