package e.commerce.payment;

public class PaymentGateway implements  PaymentAdapter{
    @Override
    public void makePayment(Payment payment) {
        System.out.println("Payment processed through gateway: " + payment.getPaymentId());
    }
}
