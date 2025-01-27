package e.commerce.payment;

public class Payment {
    private String paymentId;
    private double amount;

    public Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }
}
