package newsfeed.notification;
 public class NotificationService {
    public void sendNotification(int userId, String message) {
        System.out.println("Sending notification to user " + userId + ": " + message);
    }
}