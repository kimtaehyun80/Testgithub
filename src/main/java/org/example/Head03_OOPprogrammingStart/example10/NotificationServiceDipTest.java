package org.example.Head03_OOPprogrammingStart.example10;

import org.example.Head03_OOPprogrammingStart.example01.CreditCardPayment;
import org.example.Head03_OOPprogrammingStart.example01.CryptoPayment;
import org.example.Head03_OOPprogrammingStart.example07.OrderService;


public class NotificationServiceDipTest {
    public static void main(String[] args) {
        NotificationSender[] notificationSenders = new NotificationSender[]{
                new EmailNotificationSender(),
                new SmsNotificationSender()
        };
        for (NotificationSender notificationSender : notificationSenders) {
            NotificationService notificationService = new NotificationService(notificationSender);
            notificationService.notify("Hello World");
        }
    }
}