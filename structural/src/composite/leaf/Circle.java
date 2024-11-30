package composite.leaf;

import composite.component.Graphic;
import flyweight.flyweight.Shape;

public class Circle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Draw method of Circle Class");
    }

}
