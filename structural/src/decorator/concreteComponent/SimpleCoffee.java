package decorator.concreteComponent;

import decorator.component.Coffee;

public class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        System.out.println("Base Price is : - "+100);
        return 100;
    }

    @Override
    public String ingredients() {
        return "Coffee : ingredients : Simple Coffee";
    }
}
