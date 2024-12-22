package d.before;

// High-Level Module (Business Logic)
public class OrderService {
    private MySQLDatabase mySQLDatabase;

    public OrderService() {
        mySQLDatabase = new MySQLDatabase(); // Direct dependency on MySQLDatabase
    }

    public void placeOrder(String order) {
        mySQLDatabase.connect();
        mySQLDatabase.saveOrder(order);
        System.out.println("Order placed successfully!");
    }
}
