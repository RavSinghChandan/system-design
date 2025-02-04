package bookstore.notification;

// NotificationFacade.java
public class NotificationFacade {
    private Notification emailNotification;
    private Notification smsNotification;

    public NotificationFacade() {
        this.emailNotification = new EmailNotification();
        this.smsNotification = new SMSNotification();
    }

    public void sendAll() {
        emailNotification.send();
        smsNotification.send();
    }
}
