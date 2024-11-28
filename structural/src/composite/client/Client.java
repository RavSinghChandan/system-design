package composite.client;

import composite.component.Graphic;
import composite.compositeComponent.GraphicGroup;
import composite.leaf.Circle;
import composite.leaf.Rectangle;

public class Client {
    public static void main(String[] args) {
        Graphic circle1 = new Circle();
        Graphic circle2 = new Circle();

        Graphic rectangle1 = new Rectangle();
        Graphic rectangle2 = new Rectangle();

        GraphicGroup group1 = new GraphicGroup();
        GraphicGroup group2 = new GraphicGroup();

        group1.addGraphics(circle1);
        group1.addGraphics(rectangle1);

        group2.addGraphics(circle2);
        group2.addGraphics(rectangle2);

        GraphicGroup rootGroup = new GraphicGroup();
        rootGroup.addGraphics(group1);
        rootGroup.addGraphics(group2);

        rootGroup.draw();
    }
}
