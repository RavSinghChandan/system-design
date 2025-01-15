package social.media;

import java.util.*;

public class PostService {

    private Map<String, Post> postDatabase = new HashMap<>();

    public Post createPost(String userId, String content) {
        String postId = UUID.randomUUID().toString();
        Post post = new Post(postId, userId, content, new ArrayList<>(), 0);
        postDatabase.put(postId, post);
        return post;
    }

    public Post likePost(String postId, String userId) {
        Post post = postDatabase.get(postId);
        post.addLike(userId);
        return post;
    }

    public Post addComment(String postId, String userId, String comment) {
        Post post = postDatabase.get(postId);
        post.addComment(new Comment(userId, comment));
        return post;
    }

    public List<Post> getUserPosts(String userId) {
        List<Post> userPosts = new ArrayList<>();
        for (Post post : postDatabase.values()) {
            if (post.getUserId().equals(userId)) {
                userPosts.add(post);
            }
        }
        return userPosts;
    }
}
