package d.after;

public class Client {
    public static void main(String[] args) {
        // Inject MySQLDatabase or PostgreSQLDatabase as needed
        Database myDatabase = new MySQLDatabase();
        // Database myDatabase = new PostgreSQLDatabase();

        UserService userService = new UserService(myDatabase);
        userService.performBusinessLogic();
    }
}
