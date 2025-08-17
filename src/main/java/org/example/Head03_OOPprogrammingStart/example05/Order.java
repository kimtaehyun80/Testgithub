package org.example.Head03_OOPprogrammingStart.example05;

// 추상클렉스 선언
public class Order {
    // 필드선언
    private String orderId;
    private Delivery delivery;  // Order클레스가 Delivery클레스의 delivery변수를 갖는기능을 Order클레스에 포함시켜(Has-A), 컴포지션
    // 생성자 생성
    public Order(String orderId, String trackingNumber, String carrier) {
        // 생성자 이름은 클렉스이름(=Order)과 동일하고 반환값은 없다, () 를 매개변수로 받는 생성자 Order를 만든다
        // String타입의 oderId,trackingNumber,carrier 3가지 객체를 매개변수로 받아라
        this.orderId = orderId;  // 현재 클레스에 ordeId필드에 외부 orderId값을 할당해라
        this.delivery = new Delivery(trackingNumber, carrier);
        // 현재 클레스에 delivery필드에, 새로운 Delivery(매개변수)객체 인자로 받도록 새로 정의함
    }

    //메서드생성
    public void startOrderDelivery() {
        if (delivery != null) {
            delivery.startDelivery();  // delivery클레스에 startDelivery()메서드를 호출해라
            // 객체.메소드()=자신의 메서드호출, 클레스.메소드()=클레스 메서드호출 이다
        } else {
            System.out.println("배송 정보가 없습니다.");
        }
    }
}

