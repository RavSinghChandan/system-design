package flyweight.flyweightFactory;

import flyweight.concreteFlyweight.Circle;
import flyweight.flyweight.Shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeType) {
        // Check if the shape already exists
        Shape shape = shapeMap.get(shapeType);
        if (shape == null) {
            // Create the shape if it doesn't exist
            if ("Circle".equalsIgnoreCase(shapeType)) {
                shape = new Circle("Circle"); // Create a new Circle object
                shapeMap.put(shapeType, shape);
                System.out.println("A Circle shape is created.");
            } else {
                System.out.println("Shape type not supported: " + shapeType);
                return null; // Return null for unsupported shapes
            }
        }
        return shape;
    }
}
