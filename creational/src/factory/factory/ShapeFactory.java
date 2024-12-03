package factory.factory;

import factory.concreteCreator.Circle;
import factory.concreteCreator.Rectangle;
import factory.creator.Shape;

public class ShapeFactory {

    public Shape getShape(String shapeType){

        if(shapeType == null){
            return  null;
        }
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
