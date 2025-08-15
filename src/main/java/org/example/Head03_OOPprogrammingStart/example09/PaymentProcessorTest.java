package org.example.Head03_OOPprogrammingStart.example09;

import org.example.Head03_OOPprogrammingStart.example01.CreditCardPayment;
import org.example.Head03_OOPprogrammingStart.example01.CryptoPayment;
import org.example.Head03_OOPprogrammingStart.example07.OrderService;


public class PaymentProcessorTest {
    public static void main(String[] args) {
        org.example.Head03_OOPprogrammingStart.example01.Payment[] payments = new org.example.Head03_OOPprogrammingStart.example01.Payment[]
                {
                        new org.example.Head03_OOPprogrammingStart.example01.CreditCardPayment(),
                        new org.example.Head03_OOPprogrammingStart.example01.AccountTransferPayment(),
                        new CryptoPayment()
                };
        double[] paymentAmounts = new double[] {
                30000,
                70000,
                100000
        };
        OrderService service = new OrderService();
        for (org.example.Head03_OOPprogrammingStart.example01.Payment payment : payments) {
            if(payment instanceof CreditCardPayment) {
                service.processPayment(payment, paymentAmounts[0]);
            } else if(payment instanceof org.example.Head03_OOPprogrammingStart.example01.AccountTransferPayment) {
                service.processPayment(payment, paymentAmounts[1]);
            } else if(payment instanceof CryptoPayment) {
                service.processPayment(payment, paymentAmounts[2]);
            } else {
                service.processPayment(payment, 1000);
            }
        }

    }
}
