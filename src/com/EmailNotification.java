package com;

public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        status = "I am the status for the Email Notification";
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        System.out.println("Recipient: " + recipient);
        System.out.println("smtpProvider: " + smtpProvider);
        System.out.println("LocalTime: " + super.getCreatedAt());
        System.out.println("Subject: " + super.getSubject());
        System.out.println("Body: " + super.getBody());
    }

    @Override
    public void someMethod() {
        super.someMethod();
        System.out.println("I am printing out some more text here");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }
}
