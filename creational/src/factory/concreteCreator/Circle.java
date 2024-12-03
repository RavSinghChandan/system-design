package factory.concreteCreator;

import factory.creator.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle ()");
    }
}
