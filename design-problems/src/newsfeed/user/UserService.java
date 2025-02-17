package newsfeed.user;

import java.util.*;

public class UserService {

    private static UserService instance;
    private Map<Integer, User> users = new HashMap<>();

    private UserService() {}

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public void registerUser(User user) {
        users.put(user.getUserId(), user);
        System.out.println("User registered: " + user.getName());
    }

    public void followUser(int userId, int followeeId) {
        User user = users.get(userId);
        User followee = users.get(followeeId);
        if (user != null && followee != null) {
            user.setFollowing(followee.getFollowing());
            System.out.println(user.getName() + " followed " + followee.getName());
        }
    }
}
