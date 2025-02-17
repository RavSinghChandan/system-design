package newsfeed.interaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentService {
    private Map<Integer, List<String>> comments = new HashMap<>();

    public void addComment(int postId, String comment) {
        comments.computeIfAbsent(postId, k -> new ArrayList<>()).add(comment);
    }
}
