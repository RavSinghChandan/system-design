package strategy.chandan;

public class Client {
    public static void main(String[] args) {
        // Create the context for your services
        AuraWithRav chandanServices = new AuraWithRav();

        // Create different strategies
        ServiceStrategy palmReading = new PalmReadingStrategy();
        ServiceStrategy vastuConsultation = new VastuConsultationStrategy();
        ServiceStrategy lifeAdvice = new LifeAdviceStrategy();

        // Dynamically switch strategies
        chandanServices.setStrategy(palmReading);
        chandanServices.performService(); // Output: Palm Reading Service

        chandanServices.setStrategy(vastuConsultation);
        chandanServices.performService(); // Output: Vastu Consultation Service

        chandanServices.setStrategy(lifeAdvice);
        chandanServices.performService(); // Output: Life Advice Service
    }
}
