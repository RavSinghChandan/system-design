package adapter.payment;

public class PaymentProcessor {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        PaypalPayment target = new PaypalPayment(payPal);
        target.processPayment("ravchadan15@gmail.com",100000);
    }
}
