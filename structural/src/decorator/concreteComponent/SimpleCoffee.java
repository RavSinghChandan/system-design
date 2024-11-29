package decorator.concreteComponent;

import decorator.component.Coffee;

public class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 100.5;
    }

    @Override
    public String ingredients() {
        return "Coffee : ingredients";
    }
}
