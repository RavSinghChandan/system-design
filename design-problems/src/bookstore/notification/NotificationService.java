package bookstore.notification;

public class NotificationService {
    public void sendNotification(Notification notification) {
        notification.send();
    }
}

