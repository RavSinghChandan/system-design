package state.chandan;

public class AuraWithRav {
    private ServiceState currentState; // Current service Chandan is offering

    // Set the current state
    public void setState(ServiceState state) {
        this.currentState = state;
        System.out.println("Switching service...");
    }

    // Perform the current service
    public void performService() {
        if (currentState != null) {
            currentState.serve();
        } else {
            System.out.println("No service is currently active.");
        }
    }
}
