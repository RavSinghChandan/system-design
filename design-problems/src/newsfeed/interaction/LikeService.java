package newsfeed.interaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LikeService {
    private Map<Integer, List<Integer>> likes = new HashMap<>();

    public void addLike(int postId, int userId) {
        likes.computeIfAbsent(postId, k -> new ArrayList<>()).add(userId);
    }
}
