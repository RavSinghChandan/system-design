package proxy.chandan;

public class Client {
    public static void main(String[] args) {
        System.out.println("Welcome to Chandan's Service Portal!");

        // Using Proxy to access Chandan's services
        Expert proxy = new ExpertProxy();

        // Authorized client
        proxy.provideService("PremiumClient");

        // Unauthorized client
        proxy.provideService("RegularClient");
    }
}
