package templatemethod.chandan;

public class LifeAdviceService extends AuraServiceTemplate{
    @Override
    protected void provideService() {
        System.out.println("I am giving you advice on how to improve your life based on your strengths.");
    }
}
