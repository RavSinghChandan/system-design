package newsfeed.client;
import newsfeed.feed.FeedService;
import newsfeed.interaction.InteractionService;
import newsfeed.notification.NotificationService;
import newsfeed.post.Post;
import newsfeed.post.PostBuilder;
import newsfeed.post.PostService;
import newsfeed.user.*;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        // Create User Service (Singleton)
        UserService userService = UserService.getInstance();

        // Register Users
        User user1 = UserFactory.createUser("regular", 1, "Chandan Kumar");
        User user2 = UserFactory.createUser("influencer", 2, "Sunny Deol");
        userService.registerUser(user1);
        userService.registerUser(user2);

        // Follow User
        userService.followUser(1, 2);

        // Create a Post
        Post post = new PostBuilder().setPostId(101).setUserId(1).setContent("I am your Big Fan ! Sunny Sir!").build();
        PostService postService = new PostService();
        postService.createPost(post);

        // Get a Post
        Post retrievedPost = postService.getPost(101);
        System.out.println("Retrieved Post: " + retrievedPost.getContent());

        // Generate Feed
        FeedService feedService = new FeedService();
        List<Post> feed = feedService.generateFeed(1);
        System.out.printf("Feed is : "+feed);
       // System.out.println("Generated Feed: " + feed.toString() + " posts");

        // Like and Comment on Post
        InteractionService interactionService = new InteractionService();
        interactionService.likePost(1,101);
        interactionService.commentOnPost(1, 101, "Nice post!");

        // Send Notification
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(2, "You have a new follower!");

    }
}
