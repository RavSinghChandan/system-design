package d.after;

// Concrete Low-Level Module 2 (PostgreSQL Database)
public class PostgreSQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }
}
