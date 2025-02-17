package newsfeed.notification;

public class NotificationFacade {
    private EmailNotification emailNotification = new EmailNotification();
    private SMSNotification smsNotification = new SMSNotification();

    public void sendNotification(int userId, String message) {
        emailNotification.sendEmail(userId, message);
        smsNotification.sendSMS(userId, message);
    }
}
