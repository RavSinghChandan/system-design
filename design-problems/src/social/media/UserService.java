package social.media;

import java.util.*;

public class UserService {

    private Map<String, User> userDatabase = new HashMap<>();

    public User registerUser(String username, String email, String password) {
        String userId = UUID.randomUUID().toString();
        User user = new User(userId, username, email, password);
        userDatabase.put(userId, user);
        return user;
    }

    public boolean authenticateUser(String email, String password) {
        for (User user : userDatabase.values()) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public User getUserProfile(String userId) {
        return userDatabase.get(userId);
    }
}
