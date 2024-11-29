package decorator.decorators;

import decorator.component.Coffee;

public abstract class CoffeeDecorator implements Coffee {
     protected Coffee simpleCoffee;

    public CoffeeDecorator(Coffee simpleCoffee) {
        this.simpleCoffee = simpleCoffee;
    }

    public double cost(){
     return    simpleCoffee.cost();
    }
    public String ingredients(){
        return simpleCoffee.ingredients();
    }
}
