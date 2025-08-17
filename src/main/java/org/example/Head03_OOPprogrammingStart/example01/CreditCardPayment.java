package org.example.Head03_OOPprogrammingStart.example01;

public class CreditCardPayment implements Payment {
    //임플러먼트는 페이먼트를 상속
    @Override
    // 오버라이드는 부모클레스 메서드를 자식클레스가 상속해서 동일시그니처(메서드이름,반환타입,매개변수목록)로 재정의하여 구현한다
    public void pay(double amount) {
        // 신용카드 결제에 필요한 로직
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }
}

