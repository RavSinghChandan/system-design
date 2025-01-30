package social.media;

import social.media.follow.FollowService;
import social.media.message.Message;
import social.media.message.MessageService;
import social.media.notification.NotificationService;
import social.media.post.Post;
import social.media.post.PostService;
import social.media.user.User;
import social.media.user.UserService;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Initialize services
        UserService userService = new UserService();
        PostService postService = new PostService();
        FollowService followService = new FollowService();
        NotificationService notificationService = new NotificationService();
        MessageService messageService = new MessageService();

        // Simulate User Registration
        User user1 = userService.registerUser("Chandan Kumar", "chandan@gmail.com", "chandan@321");
        User user2 = userService.registerUser("Rav Singh", "rav@yahoo.com", "rav@321");

        System.out.println("User1 Registered: " + user1.getUsername());
        System.out.println("User2 Registered: " + user2.getUsername());

        // Simulate Posting
        Post post1 = postService.createPost(user1.getUserId(), "This is Chandan's first post!");
        Post post2 = postService.createPost(user2.getUserId(), "This is Rav's first post!");

        System.out.println("User1's Post: " + post1.getContent());
        System.out.println("User2's Post: " + post2.getContent());

        // Simulate Following
        followService.followUser(user1.getUserId(), user2.getUserId());
        followService.followUser(user2.getUserId(), user1.getUserId());

        System.out.println("User1 follows: " + followService.getFollowing(user1.getUserId()));
        System.out.println("User2 follows: " + followService.getFollowing(user2.getUserId()));

        // Simulate Liking
        postService.likePost(post1.getPostId(), user2.getUserId());
        postService.likePost(post2.getPostId(), user1.getUserId());

        System.out.println("Post1 has " + post1.getLikes() + " likes.");
        System.out.println("Post2 has " + post2.getLikes() + " likes.");

        // Simulate Comments
        postService.addComment(post1.getPostId(), user2.getUserId(), "Great post, John!");
        postService.addComment(post2.getPostId(), user1.getUserId(), "Awesome post, Jane!");

        System.out.println("Post1 Comments: " + post1.getComments());
        System.out.println("Post2 Comments: " + post2.getComments());

        // Simulate Notifications
        notificationService.generateNotification(user1.getUserId(), "You have a new follower!");
        notificationService.generateNotification(user2.getUserId(), "You have a new like on your post!");

        System.out.println("User1 Notifications: " + notificationService.getNotifications(user1.getUserId()));
        System.out.println("User2 Notifications: " + notificationService.getNotifications(user2.getUserId()));

        // Simulate Messaging
        messageService.sendMessage(user1.getUserId(), user2.getUserId(), "Hey Jane, how are you?");
        messageService.sendMessage(user2.getUserId(), user1.getUserId(), "Hi John, I'm doing great!");

        System.out.println("Messages between User1 and User2: ");
        List<Message> messages = messageService.getMessages(user1.getUserId(), user2.getUserId());
        for (Message msg : messages) {
            System.out.println(msg.getSenderId() + " -> " + msg.getReceiverId() + ": " + msg.getContent());
        }
    }
}
