package bridge.abstraction;

import bridge.implementor.PaymentGateway;

public abstract  class Payment {

    protected PaymentGateway paymentGateway;


    public Payment(PaymentGateway paymentGateway) {
        this.paymentGateway=paymentGateway;
    }
    public abstract void makePayment(double amount);
}
