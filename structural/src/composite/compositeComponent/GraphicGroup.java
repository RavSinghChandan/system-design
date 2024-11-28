package composite.compositeComponent;

import composite.component.Graphic;

import java.util.ArrayList;
import java.util.List;

public class GraphicGroup implements Graphic {

    List<Graphic> graphics = new ArrayList<>();

    public void addGraphics(Graphic graphic){
        System.out.println("Adding the Graphic into the GraphicGroup"+graphics.add(graphic));
    }
    public void removeGraphics(Graphic graphic){
        System.out.println("Removing the graphic from the GraphicGroup"+graphics.remove(graphic));
    }

    @Override
    public void draw() {
        System.out.println("Draw method of GraphicGroup ");
        for(Graphic graphic :graphics){
            graphic.draw();
        }
    }
}
