package d.after;

// Concrete Low-Level Module 1 (MySQL Database)
public class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }

    public void saveOrder(String order) {
        System.out.println("Saving order in MySQL database: " + order);
    }
}
