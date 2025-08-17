package org.example.Head03_OOPprogrammingStart.example04;

public class Order  {
    private AbstractPayment payment;
    //private은 해당 변수가 현재클레스 내에서만 접근가능하다, AbstractPayment는 추상클레스타입, payment는 변수

    public Order(AbstractPayment payment) {
        // 생성자 이름은 클렉스이름(=Order)과 동일하고 반환값은 없다, AbstractPayment payment 를 매개변수로 받는 생성자(Order)이다
        // AbstractPayment타입의 payment 객체를 매개변수로 받아라
        this.payment = payment;
        // 현재 객체에 payment필드에 외부 payment값을 할당해라
    }

    public void process(double amount) {
        //double타입 amount 라는 매개변수를 갖는 process 메서드를 선언
        payment.pay(amount);  // payment객체의 pay메서드를 호출해서 금액(amount)을 결제해라
    }
}
