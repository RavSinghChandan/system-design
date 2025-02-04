package bookstore.payment;

public class PaymentService {
    public void makePayment(Payment payment) {
        payment.processPayment();
    }
}