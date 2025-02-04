package bookstore.order;

// Order.java
public class Order {
    private int orderId;
    private String customer;
    private String status;

    public Order(int orderId, String customer, String status) {
        this.orderId = orderId;
        this.customer = customer;
        this.status = status;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId + ", Customer: " + customer + ", Status: " + status);
    }
}
