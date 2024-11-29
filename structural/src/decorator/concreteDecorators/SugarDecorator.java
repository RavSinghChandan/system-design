package decorator.concreteDecorators;

import decorator.component.Coffee;
import decorator.decorators.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double cost(){
        return    decoratedCoffee.cost()+200;
    }
    public String ingredients(){
        return decoratedCoffee.ingredients()+ "Sugar";
    }
}

