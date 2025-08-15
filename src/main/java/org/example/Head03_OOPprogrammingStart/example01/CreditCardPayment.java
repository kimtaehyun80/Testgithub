package org.example.Head03_OOPprogrammingStart.example01;

public class CreditCardPayment implements Payment {
    //임플러먼트는 페이먼트를 상속
    @Override
    public void pay(double amount) {
        // 신용카드 결제에 필요한 로직
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }
}

