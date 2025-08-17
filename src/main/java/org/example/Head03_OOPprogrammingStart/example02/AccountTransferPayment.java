package org.example.Head03_OOPprogrammingStart.example02;

public class AccountTransferPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        validatePayment(amount);  //추상클레스의 validatePayment()매서드 호출, 결게금액(amount)이 유효한지 확인해라.
        System.out.println("계좌이체 결제 완료: " + amount + "원");
    }

    @Override
    public void cancel(double amount) {
        validateCancel(amount);  //추상클레스의 validatePayment()매서드 호출, 결게금액(amount)이 유효한지 확인해라.
        System.out.println("계좌이체 결제 취소: " + amount + "원");
    }
}
