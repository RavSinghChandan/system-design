package d.after;

// High-Level Module (Business Logic)
public class OrderService {
    private Database database;  // Dependency is injected through the constructor

    // Constructor Injection (Dependency Injection)
    public OrderService(Database database) {
        this.database = database;
    }

    public void placeOrder(String order) {
        database.connect();
        database.saveOrder(order);
        System.out.println("Order placed successfully!");
    }
}
