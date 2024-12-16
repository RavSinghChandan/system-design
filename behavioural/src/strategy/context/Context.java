package strategy.context;

import strategy.strategy.Strategy;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
  public   void setStrategy(Strategy strategy){
        this.strategy=strategy;
    }
    public void executeStrategy(){
        strategy.execute();
    }
}
