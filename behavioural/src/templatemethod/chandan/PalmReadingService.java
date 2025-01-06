package templatemethod.chandan;

public class PalmReadingService extends AuraServiceTemplate {
    @Override
    protected void provideService() {
        System.out.println("I am reading your palm to reveal insights about your life path.");
    }
}
