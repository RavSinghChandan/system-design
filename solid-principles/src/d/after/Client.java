package d.after;

public class Client {
    public static void main(String[] args) {
        // Creating instances of the concrete classes
        Database mySQLDatabase = new MySQLDatabase();
        OrderService orderService = new OrderService(mySQLDatabase);

        orderService.placeOrder("Order #1");

        // Switch to PostgreSQL without modifying OrderService
        Database postgreSQLDatabase = new PostgreSQLDatabase();
        orderService = new OrderService(postgreSQLDatabase);

        orderService.placeOrder("Order #2");
    }
}
