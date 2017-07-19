package com;

public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        someMethod();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() {
        System.out.println("Recipient: " + recipient);
        System.out.println("smsProvider: " + smsProvider);
        System.out.println("LocalTime: " + super.getCreatedAt());
        System.out.println("Subject: " + super.getSubject());
        System.out.println("Body: " + super.getBody());
    }
}
