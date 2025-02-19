package abstractFactory.notification;

public class Client {
    public static void main(String[] args) {

        BasicNotificationFactory basicNotificationFactory = new BasicNotificationFactory();
        basicNotificationFactory.createEmailNotification().sendNotification("Basic Email");
        basicNotificationFactory.createSMSNotification().sendNotification("Basic SMS");
        basicNotificationFactory.createPushNotification().sendNotification("Basic Push Notification");
        System.out.println("================================================================");
        AdvanceNotificationFactory advanceNotificationFactory = new AdvanceNotificationFactory();
        advanceNotificationFactory.createEmailNotification().sendNotification("Advance Email");
        advanceNotificationFactory.createSMSNotification().sendNotification("Advance SMS");
        advanceNotificationFactory.createPushNotification().sendNotification("Advance Push Notification");

    }
}
