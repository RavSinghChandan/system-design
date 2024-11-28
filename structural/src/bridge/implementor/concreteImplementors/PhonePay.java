package bridge.implementor.concreteImplementors;

import bridge.implementor.PaymentGateway;

public class PhonePay implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("PhonePay payment for amount : - "+amount);
    }
}
