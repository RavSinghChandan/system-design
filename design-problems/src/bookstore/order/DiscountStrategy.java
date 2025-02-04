package bookstore.order;

public interface DiscountStrategy {
    double applyDiscount(double price);
}
