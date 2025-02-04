package bookstore.payment;

public class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Processing payment of: " + amount);
    }
}
