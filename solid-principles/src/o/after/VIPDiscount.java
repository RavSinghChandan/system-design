package o.after;

public class VIPDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.3;
    }
}
