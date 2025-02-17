package com.virtualclass.notification;

class EmailNotification implements Observer {
    private String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Email sent to " + email + ": " + message);
    }
}

