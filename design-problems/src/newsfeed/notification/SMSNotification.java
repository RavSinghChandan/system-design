package newsfeed.notification;

public class SMSNotification {
    public void sendSMS(int userId, String message) {
        System.out.println("SMS sent to user " + userId + ": " + message);
    }
}

