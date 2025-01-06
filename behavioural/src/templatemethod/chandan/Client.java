package templatemethod.chandan;

public class Client {
    public static void main(String[] args) {
        // Create the services
        AuraServiceTemplate palmReading = new PalmReadingService();
        AuraServiceTemplate vastuConsultation = new VastuConsultationService();
        AuraServiceTemplate lifeAdvice = new LifeAdviceService();

        // Offer each service using the template method
        System.out.println("Palm Reading Service:");
        palmReading.offerService();  // Follows the template and provides specific service
        System.out.println();

        System.out.println("Vastu Consultation Service:");
        vastuConsultation.offerService();  // Follows the template and provides specific service
        System.out.println();

        System.out.println("Life Advice Service:");
        lifeAdvice.offerService();  // Follows the template and provides specific service
    }
}
