package decorator.concreteDecorators;

import decorator.component.Coffee;
import decorator.decorators.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double cost(){
        return    decoratedCoffee.cost()+100;
    }
    public String ingredients(){
        return decoratedCoffee.ingredients()+ "Milk";
    }
}
