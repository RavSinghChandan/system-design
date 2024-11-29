package decorator.decorators;

import decorator.component.Coffee;

public abstract class CoffeeDecorator implements Coffee {
     protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    public double cost(){
     return    decoratedCoffee.cost();
    }
    public String ingredients(){
        return decoratedCoffee.ingredients();
    }
}
