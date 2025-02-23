package adapter.payment;

public class PaypalPayment implements PaymentGateway {

    private PayPal payPal;

    public PaypalPayment(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(String accountNumber, double amount) {
        payPal.makePayment(accountNumber,amount);
    }
}
