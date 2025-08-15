package org.example.Head03_OOPprogrammingStart.example02;

public class CreditCardPayment extends AbstractPayment {
    // extens는 앱스트렉트페이먼트 상속받아서 확장해라
    @Override
    public void pay(double amount) {
        validatePayment(amount);
        System.out.println("신용카드 결제 완료: " + amount + "원");
    }

    @Override
    public void cancel(double amount) {
        validateCancel(amount);
        System.out.println("신용카드 결제 취소: " + amount + "원");
    }
}

