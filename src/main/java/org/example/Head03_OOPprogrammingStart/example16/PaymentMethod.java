package org.example.Head03_OOPprogrammingStart.example16;

public enum PaymentMethod {
    CREDIT_CARD("신용카드"),
    ACCOUNT_TRANSFER("계좌이체"),
    MOBILE_PAYMENT("모바일결제");

    private final String displayName;

    // 생성자: enum 상수마다 displayName 초기화
    PaymentMethod(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
