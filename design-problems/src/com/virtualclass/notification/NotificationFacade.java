package com.virtualclass.notification;

// Facade Pattern: Simplifies notification handling
class NotificationFacade {

    private NotificationService notificationService = new NotificationService();

    public void addEmailNotification(String email) {
        notificationService.addObserver(new EmailNotification(email));
    }

    public void addSMSNotification(String phoneNumber) {
        notificationService.addObserver(new SMSNotification(phoneNumber));
    }

    public void sendNotification(String message) {
        notificationService.notifyAllObservers(message);
    }
}
