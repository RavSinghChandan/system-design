package strategy.concreteStrategy;

import strategy.strategy.Strategy;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing Strategy B :) ");
    }
}
