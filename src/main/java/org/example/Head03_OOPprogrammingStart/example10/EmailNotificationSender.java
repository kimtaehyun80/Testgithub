package org.example.Head03_OOPprogrammingStart.example10;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("이메일 전송: " + message);
    }
}
