package decorator.decorators;

import decorator.component.Coffee;

public abstract class CoffeeDecorator implements Coffee {
     protected Coffee simpleCoffee;

    public CoffeeDecorator(Coffee simpleCoffee) {
        this.simpleCoffee = simpleCoffee;
    }
    @Override
    public double cost(){
     return    simpleCoffee.cost();
    }
    @Override
    public String ingredients(){
        return simpleCoffee.ingredients();
    }
}
