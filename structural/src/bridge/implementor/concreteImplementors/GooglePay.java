package bridge.implementor.concreteImplementors;

import bridge.implementor.PaymentGateway;

public class GooglePay implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("GooglePay payment for amount : - "+amount);
    }
}
