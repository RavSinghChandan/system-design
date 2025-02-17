package newsfeed.post;

public class PostBuilder {

    private int postId;
    private int userId;
    private String content;

    public PostBuilder setPostId(int postId) {
        this.postId = postId;
        return this;
    }

    public PostBuilder setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public PostBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    public Post build() {
        return new Post(postId, userId, content);
    }
}

