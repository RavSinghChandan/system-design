package newsfeed.interaction;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FollowerList {

    private Map<Integer, Set<Integer>> followers = new HashMap<>();

    public Set<Integer> getFollowers(int userId) {
        return followers.getOrDefault(userId, new HashSet<>());
    }
}
