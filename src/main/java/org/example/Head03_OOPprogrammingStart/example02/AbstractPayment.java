package org.example.Head03_OOPprogrammingStart.example02;

public abstract class AbstractPayment {   // 추상클레스
    // 공통 검증 로직
    protected void validatePayment(double amount) {
        if (amount <= 0) {  // amount변수가 0이하일때 참이면 예외발생, illegalargumentexception()은 예외발생 클레스로()내용 보여줌
            throw new IllegalArgumentException("결제 금액이 유효하지 않습니다.");
        }
    }

    // 공통 취소 검증 로직
    protected void validateCancel(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("취소 금액이 유효하지 않습니다.");
        }
    }


    public abstract void pay(double amount);
    // pay라는 이름의 추상메서드 구현코드, abstract는 구현체 없이 추상클레스 나 인터페이스에만 정의 된다는것을 의미함.매개변수는 amount
    // 구현체(=main) 가 없기에 상속받은 하위클레스에서 반드시 구현 해야된다.
    public abstract void cancel(double amount);
    //cancel이라는 추상메서드이고 amount라는 매개변수를 갖는다.
}





