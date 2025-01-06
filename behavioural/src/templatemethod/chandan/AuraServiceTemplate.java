package templatemethod.chandan;

public abstract class AuraServiceTemplate {

    // Template method that outlines the steps to offer a service
    public final void offerService() {
        greetCustomer();  // Common step: Greet the customer
        explainService(); // Common step: Explain the service
        provideService(); // This is where the service is specific
        closeService();   // Common step: Close the service
    }

    // Common steps (same for every service)
    private void greetCustomer() {
        System.out.println("Welcome to Aura with Rav! We're here to guide you.");
    }

    private void explainService() {
        System.out.println("Let me explain what we can do today...");
    }

    private void closeService() {
        System.out.println("Thank you for visiting Aura with Rav. Have a blessed day!");
    }

    // Specific step that can be different for each service
    protected abstract void provideService();  // This method will be defined in subclasses

}
