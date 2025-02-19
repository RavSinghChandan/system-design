package abstractFactory.notification;

public class AdvanceNotificationFactory implements NotificationFactory{
    @Override
    public NotificationService createEmailNotification() {
        return new EmailNotification();
    }

    @Override
    public NotificationService createSMSNotification() {
        return new SMSNotification();
    }

    @Override
    public NotificationService createPushNotification() {
        return new PushNotification();
    }
}
