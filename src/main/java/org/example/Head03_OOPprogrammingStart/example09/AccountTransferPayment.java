package org.example.Head03_OOPprogrammingStart.example09;

import org.example.Head03_OOPprogrammingStart.example01.CreditCardPayment;
import org.example.Head03_OOPprogrammingStart.example01.CryptoPayment;
import org.example.Head03_OOPprogrammingStart.example07.OrderService;
import org.example.Head03_OOPprogrammingStart.example08.PaymentService;
import org.example.Head03_OOPprogrammingStart.example08.UserAccount;

public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체 결제: " + amount + "원");
    }
}


