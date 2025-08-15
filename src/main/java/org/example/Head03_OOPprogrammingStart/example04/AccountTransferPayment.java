package org.example.Head03_OOPprogrammingStart.example04;

public class AccountTransferPayment extends AbstractPayment {
    //추상클레스 상속은 extends , 인터페이스 상속은 implements
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
    }

    @Override
    public void cancel(double amount) {
        System.out.println("계좌이체 결제 취소: " + amount + "원");
    }


}
