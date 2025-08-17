package org.example.Head03_OOPprogrammingStart.example08;

public class PaymentService {
    public void processPayment(UserAccount acc, double amount) {  // UserAccount에 직접접근 불가
        if (amount <= 0) {
            throw new IllegalArgumentException("결제 금액은 0보다 커야 합니다.");
        }
        // 그래서 acc변수 생성해서 금액amount를 값을갖는 변수(필드) processPayment 생성해서 내부에 접근
        acc.withdraw(amount);  // acc변수의 오직 withdraw(amount)매소드 호출만 통해서 잔액을 조정(출금)
        System.out.println("결제 완료. 잔액: " + acc.getBalance());
    }

    public void processRefund(UserAccount acc, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("환불 금액은 0보다 커야 합니다.");
        }
        acc.deposit(amount);  // acc변수의 오직 deposit(amount)매소드 호출만 통해서 잔액을 조정(입금)
        System.out.println("환불 완료. 잔액: " + acc.getBalance());
    }
}