package abstractFactory.notification;

public class SMSNotification implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("SMSNotification"+message);
    }
}
