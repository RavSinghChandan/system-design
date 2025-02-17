package newsfeed.interaction;

public class InteractionService {
    public void likePost(int userId, int postId) {
        System.out.println("User " + userId + " liked post " + postId);
    }

    public void commentOnPost(int userId, int postId, String comment) {
        System.out.println("User " + userId + " commented on post " + postId + ": " + comment);
    }
}
