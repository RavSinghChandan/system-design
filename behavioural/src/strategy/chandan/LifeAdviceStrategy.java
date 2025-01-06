package strategy.chandan;

public class LifeAdviceStrategy implements ServiceStrategy{
    @Override
    public void performService() {
        System.out.println("Providing Life Advice: Helping you tackle challenges and shape your destiny.");
    }
}
