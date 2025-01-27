package e.commerce.user;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private static UserService instance;

    private Map<String, User> users = new HashMap<>();

    private UserService() {
    }

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public void registerUser(User user) {
        users.put(user.getEmail(), user);
        System.out.println(user.getName() + " registered successfully.");
    }

    public User authenticateUser(String email) {
        return users.get(email);
    }
}