package o.before;

public class DiscountCalculator {

    public double calculateDiscount(String customerType, double amount) {

        if (customerType.equals("Regular")) {
            return amount * 0.1;
        } else if (customerType.equals("Premium")) {
            return amount * 0.2;
        } else if (customerType.equals("VIP")) {
            return amount * 0.3;
        }
        return 0;
    }
}
