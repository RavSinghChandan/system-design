package social.media;

import java.util.*;

public class Post {

    private String postId;
    private String userId;
    private String content;
    private List<Comment> comments;
    private int likes;

    public Post(String postId, String userId, String content, List<Comment> comments, int likes) {
        this.postId = postId;
        this.userId = userId;
        this.content = content;
        this.comments = comments;
        this.likes = likes;
    }

    public String getPostId() {
        return postId;
    }

    public String getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public int getLikes() {
        return likes;
    }

    public void addLike(String userId) {
        likes++;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }
}
