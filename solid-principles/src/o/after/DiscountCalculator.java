package o.after;

public class DiscountCalculator {

    private DiscountStrategy discountStrategy;

    // Constructor allows us to inject any discount strategy dynamically
    public DiscountCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculate(double amount) {
        return discountStrategy.calculateDiscount(amount);
    }
}
