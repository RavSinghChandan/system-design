package flyweight.client;

import flyweight.concreteFlyweight.Circle;
import flyweight.flyweight.Shape;
import flyweight.flyweightFactory.ShapeFactory;

public class Client {
    public static void main(String[] args) {

        Shape circle1 =  ShapeFactory.getShape("Circle");
        circle1.draw(10,20,"Red");

        Shape circle2 = ShapeFactory.getShape("Circle");
        circle2.draw(20,30,"Blue");

        Shape circle3 = ShapeFactory.getShape("Circle");
        circle3.draw(40,50,"Green");

        System.out.println("Shape of circle1, circle2 and circle3 are same ");
    }
}
