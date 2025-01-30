package social.media.follow;

import java.util.*;

public class FollowService {
    private Map<String, Set<String>> userFollowers = new HashMap<>();
    private Map<String, Set<String>> userFollowing = new HashMap<>();

    public boolean followUser(String followerId, String followeeId) {
        userFollowers.computeIfAbsent(followeeId, k -> new HashSet<>()).add(followerId);
        userFollowing.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
        return true;
    }

    public Set<String> getFollowers(String userId) {
        return userFollowers.getOrDefault(userId, new HashSet<>());
    }

    public Set<String> getFollowing(String userId) {
        return userFollowing.getOrDefault(userId, new HashSet<>());
    }
}
