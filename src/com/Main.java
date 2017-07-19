package com;

public class Main {

    public static void main(String[] args) {
        String subject = "I am an email subject";
        String body = "I am an email body";
        String recipient = "I am an email recipient";
        String smtpProvider = "I am an smtp Provider";
        EmailNotification emailNote = new EmailNotification(subject, body, recipient, smtpProvider);

        System.out.println("EmailNote");
        emailNote.transport();
        emailNote.writeStatus();
        emailNote.someMethod();

        System.out.println();

        subject = "I am a text subject";
        body = "I am a text body";
        recipient = "I am a text recipient";
        String smsProvider = "I am an SMS Provider";
        TextNotification textNote = new TextNotification(subject, body, recipient, smsProvider);

        System.out.println("TextNote");
        textNote.transport();
        textNote.writeStatus();

        System.out.println();

        try {
            Object emailNotificationClone = emailNote.clone();
            if (emailNotificationClone.equals(emailNote)){
                System.out.println("Notification Clone equals original notification");
            } else {
                System.out.println("Notification Clone does not equal original notification");
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
