package newsfeed.post;

class Comment {
    private int commentId;
    private int userId;
    private String text;

    public Comment(int commentId, int userId, String text) {
        this.commentId = commentId;
        this.userId = userId;
        this.text = text;
    }
}