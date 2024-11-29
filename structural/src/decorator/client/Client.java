package decorator.client;

import decorator.component.Coffee;
import decorator.concreteComponent.SimpleCoffee;
import decorator.concreteDecorators.MilkDecorator;
import decorator.concreteDecorators.SugarDecorator;

public class Client {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Ingredients: " + coffee.ingredients() + " | Cost: $" + coffee.cost());

        Coffee milk = new MilkDecorator(coffee);
        Coffee sugar = new SugarDecorator(coffee);
        System.out.println("Ingredients: " + coffee.ingredients() + " | Cost: $" + coffee.cost());

    }
}
