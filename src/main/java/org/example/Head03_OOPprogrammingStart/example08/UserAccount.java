package org.example.Head03_OOPprogrammingStart.example08;

public class UserAccount {
    private final String accountId;   // final: 한 번 설정되면 변경 불가
    private double balance;

    public UserAccount(String accountId) {
        if (accountId == null || accountId.isBlank()) {
            throw new IllegalArgumentException("계좌 ID는 필수입니다.");
            // 참일때 예외메소드인 IllegalArgumentException("계좌 ID는 필수입니다.")메세지 출력 실행
        }
        this.accountId = accountId;
        this.balance = 0;
    }

    // 읽기 전용 메서드 (getter), 외부에서 아이디와 잔액 확인만 가능
    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    // 쓰기 메서드: 내부 검증 포함
    // 입금로직
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("입금 금액은 0보다 커야 합니다.");
        }
        balance += amount;
    }

    // 출금로직
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("출금 금액은 0보다 커야 합니다.");
        }
        if (balance < amount) {
            throw new IllegalStateException("잔액 부족: 현재 잔액 = " + balance);
        }
        balance -= amount;
    }
}
