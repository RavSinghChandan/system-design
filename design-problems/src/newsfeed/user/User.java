package newsfeed.user;

import java.util.HashSet;
import java.util.Set;

public class User {

    private int userId;
    private String name;
    private Set<Integer> following;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.following = new HashSet<>();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Set<Integer> getFollowing() {
        return following;
    }

    public void setFollowing(Set<Integer> following) {
        this.following = following;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
