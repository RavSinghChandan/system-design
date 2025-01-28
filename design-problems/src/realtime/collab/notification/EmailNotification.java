package realtime.collab.notification;

public class EmailNotification extends NotificationService {
    @Override
    public void notify(String message) {
        System.out.println("Email notification: " + message);
    }
}