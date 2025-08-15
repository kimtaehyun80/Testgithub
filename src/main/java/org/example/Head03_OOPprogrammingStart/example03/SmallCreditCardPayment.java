package org.example.Head03_OOPprogrammingStart.example03;

// 지나치게 세분화된 클래스
public class SmallCreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("소액(신용카드) 결제: " + amount + "원");
    }
}
