package composite.leaf;

import composite.component.Graphic;

public class Rectangle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Draw method of Rectangle Class ");
    }
}
