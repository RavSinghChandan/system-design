package e.commerce.payment;

public class PaymentService
{
    public void processPayment(Payment payment) {
        System.out.println("Processing payment: " + payment.getPaymentId() + " for amount: " + payment.getAmount());
    }
}
