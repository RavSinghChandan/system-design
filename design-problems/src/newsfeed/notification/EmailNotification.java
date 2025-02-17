package newsfeed.notification;

public class EmailNotification {
    public void sendEmail(int userId, String message) {
        System.out.println("Email sent to user " + userId + ": " + message);
    }
}