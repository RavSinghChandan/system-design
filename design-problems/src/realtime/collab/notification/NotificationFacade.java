package realtime.collab.notification;

public class NotificationFacade {

    private NotificationService emailService = new EmailNotification();
    private NotificationService inAppService = new InAppNotification();

    public void notifyAll(String message) {
        emailService.notify(message);
        inAppService.notify(message);
    }
}
