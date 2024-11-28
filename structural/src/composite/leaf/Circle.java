package composite.leaf;

import composite.component.Graphic;

public class Circle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Draw method of Circle Class");
    }
}
