package o;

import o.after.DiscountCalculator;
import o.after.PremiumDiscount;
import o.after.RegularDiscount;
import o.after.VIPDiscount;

public class Client {
    public static void main(String[] args) {
        System.out.println("BEFORE :=================================================");
        o.before.DiscountCalculator discountCalculatorBefore = new o.before.DiscountCalculator();

        System.out.println("Regular Discount: " +  discountCalculatorBefore.calculateDiscount("Regular", 1000));
        System.out.println("Premium Discount: " +discountCalculatorBefore.calculateDiscount("Premium", 1000));
        System.out.println("VIP Discount: " + discountCalculatorBefore.calculateDiscount("VIP", 1000));

        System.out.println("AFTER : =================================================");
        DiscountCalculator regularCalculator = new DiscountCalculator(new RegularDiscount());
        DiscountCalculator premiumCalculator = new DiscountCalculator(new PremiumDiscount());
        DiscountCalculator vipCalculator = new DiscountCalculator(new VIPDiscount());

        System.out.println("Regular Discount: " + regularCalculator.calculate(1000));
        System.out.println("Premium Discount: " + premiumCalculator.calculate(1000));
        System.out.println("VIP Discount: " + vipCalculator.calculate(1000));


    }
}
