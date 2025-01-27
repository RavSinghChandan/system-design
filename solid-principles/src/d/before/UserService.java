package d.before;

// High-Level Module
public class UserService {

    private MySQLDatabase database;

    public UserService() {
        this.database = new MySQLDatabase(); // Direct dependency
    }

    public void performBusinessLogic() {
        database.connect();
        System.out.println("Performing business logic...");
    }
}
