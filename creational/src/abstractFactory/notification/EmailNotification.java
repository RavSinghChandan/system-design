package abstractFactory.notification;

public class EmailNotification implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("EmailNotification :"+message);
    }
}
