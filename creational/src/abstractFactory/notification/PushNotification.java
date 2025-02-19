package abstractFactory.notification;

public class PushNotification implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("PushNotification"+message);
    }
}
