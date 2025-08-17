package org.example.Head03_OOPprogrammingStart.example05;

public class Delivery {
    private String trackingNumber;  // 변수(필드)trackingNumber선언
    private String carrier;

    // Delivery생성자 생성 해서 ()값 매개변수를 갖도록 선언
    public Delivery(String trackingNumber, String carrier) {
        this.trackingNumber = trackingNumber;  // 현재 클레스 trackingNumber필드에 외부 trackingNumber값을 할당해라
        this.carrier = carrier;  // 현재 클레스 carrier필드에 외부 carrier값을 할당해라
    }

    // startDelivery 메서드 생성
    public void startDelivery() {
        System.out.println("배송 시작 - 운송장 번호: " + trackingNumber);
    }
}

