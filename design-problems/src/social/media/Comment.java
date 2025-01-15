package social.media;

public class Comment {
    private String userId;
    private String content;

    public Comment(String userId, String content) {
        this.userId = userId;
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }
}
