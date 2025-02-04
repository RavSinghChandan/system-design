package bookstore.order;

public class OrderStatus {
    private String status;

    public OrderStatus(String status) {
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Order Status: " + status);
    }
}
