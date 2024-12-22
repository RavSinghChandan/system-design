package d.before;

// Low-Level Module (Database Access)
public class MySQLDatabase {
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }

    public void saveOrder(String order) {
        System.out.println("Saving order in MySQL database: " + order);
    }
}
