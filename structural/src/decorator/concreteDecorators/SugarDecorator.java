package decorator.concreteDecorators;

import decorator.component.Coffee;
import decorator.decorators.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee SimpleCoffee) {
        super(SimpleCoffee);
    }

    @Override
    public double cost(){
        return    simpleCoffee.cost()+100;
    }

    @Override
    public String ingredients(){
        return simpleCoffee.ingredients()+ "Sugar";
    }
}

