package d.after;

// Concrete Low-Level Module 2 (PostgreSQL Database)
public class PostgreSQLDatabase implements Database {
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }

    public void saveOrder(String order) {
        System.out.println("Saving order in PostgreSQL database: " + order);
    }
}
