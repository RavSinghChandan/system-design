package newsfeed.interaction;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FollowService {
    private Map<Integer, Set<Integer>> followers = new HashMap<>();

    public void followUser(int userId, int followeeId) {
        followers.computeIfAbsent(followeeId, k -> new HashSet<>()).add(userId);
    }
}
