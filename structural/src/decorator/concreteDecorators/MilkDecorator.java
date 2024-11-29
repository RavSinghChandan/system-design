package decorator.concreteDecorators;

import decorator.component.Coffee;
import decorator.decorators.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee simpelCoffee) {
        super(simpelCoffee);
    }

    @Override
    public double cost(){
        return    simpleCoffee.cost()+200;
    }

    @Override
    public String ingredients(){
        return simpleCoffee.ingredients()+ "Milk";
    }
}
