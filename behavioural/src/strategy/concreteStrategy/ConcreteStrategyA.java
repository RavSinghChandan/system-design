package strategy.concreteStrategy;

import strategy.strategy.Strategy;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing Strategy A :) ");
    }
}
