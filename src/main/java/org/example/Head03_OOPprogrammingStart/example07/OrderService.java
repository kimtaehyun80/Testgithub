package org.example.Head03_OOPprogrammingStart.example07;


import org.example.Head03_OOPprogrammingStart.example01.Payment;

public class OrderService {
    public void processPayment(Payment method, double amount) {
        method.pay(amount);
    }
}