package org.example.Head03_OOPprogrammingStart.example03;

public class BigCreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("고액(신용카드) 결제: " + amount + "원");
    }
}
