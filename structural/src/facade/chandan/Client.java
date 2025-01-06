package facade.chandan;

public class Client {
    public static void main(String[] args) {
        System.out.println("Welcome, Chandan, to the Home Automation System!");

        // Creating the facade
        HomeAutomationFacade homeAutomation = new HomeAutomationFacade();

        // Simplified interactions through the facade
        homeAutomation.activatePartyMode(); // Activates everything
        System.out.println();

        // After the party
        homeAutomation.deactivatePartyMode(); // Deactivates everything
    }
}
