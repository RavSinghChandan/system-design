package flyweight.concreteFlyweight;

import flyweight.flyweight.Shape;

public class Circle implements Shape {
     private String shapeType; // shared state of object

    public Circle(String shapeType) {
        this.shapeType = "Circle";
    }

    @Override
    public void draw(double x, double y, String color) {
        System.out.println("Creating the shape :- Circle with coordinates "+x+" and  "+y + " with color  "+color);
    }
}
