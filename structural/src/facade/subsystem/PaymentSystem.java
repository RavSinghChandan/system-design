package facade.subsystem;

public class PaymentSystem {
    public boolean processPayment(String paymentMethod, double amount) {
        System.out.println("Processing " + paymentMethod + " payment of amount: $" + amount);
        // Simulate payment processing (Assume payment is successful)
        return true;
    }
}
