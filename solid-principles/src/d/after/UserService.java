package d.after;

public class UserService {

    private Database database;

    // Dependency is injected through the constructor
    public UserService(Database database) {
        this.database = database;
    }

    public void performBusinessLogic() {
        database.connect();
        System.out.println("Performing business logic...");
    }
}
