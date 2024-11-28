package adapter.adapter;

import adapter.adaptee.PayPal;
import adapter.target.PaymentGateway;

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
