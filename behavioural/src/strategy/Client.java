package strategy;

import strategy.concreteStrategy.ConcreteStrategyA;
import strategy.concreteStrategy.ConcreteStrategyB;
import strategy.context.Context;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy();

        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
    }
}
