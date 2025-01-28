package realtime.collab.user;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private Map<String, User> users = new HashMap<>();

    public void addUser(String role, String name, String email) {
        User user = RoleFactory.createUser(role, name, email);
        users.put(email, user);
    }

    public User getUser(String email) {
        return users.get(email);
    }
}
