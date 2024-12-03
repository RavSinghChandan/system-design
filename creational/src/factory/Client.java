package factory;

import factory.creator.Shape;
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
    }
}
