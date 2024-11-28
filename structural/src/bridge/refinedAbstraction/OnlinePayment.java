package bridge.refinedAbstraction;

import bridge.abstraction.Payment;
import bridge.implementor.PaymentGateway;

public class OnlinePayment extends Payment {
    public OnlinePayment(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
     public void makePayment(double amount){
         System.out.println("OnlinePayment( Refined Abstraction) makePayment method impl for amount :- S"+amount);
         paymentGateway.processPayment(amount);
     }
}
