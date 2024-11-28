package adapter.target;

public interface PaymentGateway {
    public void processPayment(String accountNumber,double amount);
}
