package bridge.client;

import bridge.implementor.concreteImplementors.GooglePay;
import bridge.implementor.concreteImplementors.PhonePay;
import bridge.refinedAbstraction.OnlinePayment;

public class Client {
    public static void main(String[] args) {
        OnlinePayment googlePay = new OnlinePayment(new GooglePay());
        googlePay.makePayment(1000);

        OnlinePayment phonePay = new OnlinePayment(new PhonePay());
        phonePay.makePayment(2000);
    }
}
