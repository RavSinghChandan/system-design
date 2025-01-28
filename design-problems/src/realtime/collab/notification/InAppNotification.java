package realtime.collab.notification;

public class InAppNotification extends NotificationService {
    @Override
    public void notify(String message) {
        System.out.println("In-app notification: " + message);
    }
}
