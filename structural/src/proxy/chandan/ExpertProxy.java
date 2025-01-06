package proxy.chandan;

public class ExpertProxy implements Expert{

    private final Chandan realExpert;
    private final String authorizedUser = "PremiumClient";

    public ExpertProxy() {
        this.realExpert = new Chandan(); // Initialize the real subject
    }

    @Override
    public void provideService(String clientName) {
        if (isAuthorized(clientName)) {
            logAccess(clientName);
            realExpert.provideService(clientName);
        } else {
            System.out.println("Access Denied: Client '" + clientName + "' is not authorized to use Chandan's services.");
            System.out.println("-----------------------------------");
        }
    }

    private boolean isAuthorized(String clientName) {
        return authorizedUser.equals(clientName);
    }

    private void logAccess(String clientName) {
        System.out.println("Logging: Authorized access by client: " + clientName);
    }
}
