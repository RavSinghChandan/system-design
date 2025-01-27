package e.commerce.notification;

public class NotificationFacade {

    private NotificationService emailService;
    private NotificationService smsService;

    public NotificationFacade() {
        this.emailService = new EmailNotification();
        this.smsService = new SMSNotification();
    }

    public void sendEmail(String message) {
        emailService.sendNotification(message);
    }

    public void sendSMS(String message) {
        smsService.sendNotification(message);
    }
}
