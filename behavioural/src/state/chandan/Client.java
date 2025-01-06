package state.chandan;

public class Client {
    public static void main(String[] args) {
        // Your channel "Aura with Rav"
        AuraWithRav chandanChannel = new AuraWithRav();

        // Different states
        ServiceState palmReading = new PalmReadingState();
        ServiceState vastuConsultation = new VastuConsultationState();
        ServiceState lifeAdvice = new LifeAdviceState();

        // Switch between services
        chandanChannel.setState(palmReading);
        chandanChannel.performService(); // Perform Palm Reading

        chandanChannel.setState(vastuConsultation);
        chandanChannel.performService(); // Perform Vastu Consultation

        chandanChannel.setState(lifeAdvice);
        chandanChannel.performService(); // Perform Life Advice
    }
}
