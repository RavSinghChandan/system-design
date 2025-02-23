package adapter.payment;

public interface PaymentGateway {
    public void processPayment(String accountNumber,double amount);
}
