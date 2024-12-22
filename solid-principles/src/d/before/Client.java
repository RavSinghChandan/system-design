package d.before;

public class Client {
    public static void main(String[] args) {
        // Creating an instance of OrderService (which internally creates an instance of MySQLDatabase)
        OrderService orderService = new OrderService();

        // Placing an order
        orderService.placeOrder("Order #1");
    }
}
