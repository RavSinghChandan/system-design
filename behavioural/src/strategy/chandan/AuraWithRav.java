package strategy.chandan;

public class AuraWithRav {

    private ServiceStrategy currentStrategy; // Holds the active strategy

    // Set the current strategy dynamically
    public void setStrategy(ServiceStrategy strategy) {
        this.currentStrategy = strategy;
        System.out.println("Strategy has been updated.");
    }

    // Perform the service using the selected strategy
    public void performService() {
        if (currentStrategy != null) {
            currentStrategy.performService();
        } else {
            System.out.println("No strategy is selected. Please choose a service first.");
        }
    }
}
