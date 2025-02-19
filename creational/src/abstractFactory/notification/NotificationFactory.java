package abstractFactory.notification;

public interface NotificationFactory {
    NotificationService createEmailNotification();
    NotificationService createSMSNotification();
    NotificationService createPushNotification();
}
