package instagram.user;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private static UserService instance;
    private Map<String, User> users = new HashMap<>();

    private UserService() {}

    public static synchronized UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public void registerUser(User user) {
        users.put(user.getEmail(), user);
    }

    public boolean authenticateUser(String email, String password) {
        return users.containsKey(email);
    }
}
