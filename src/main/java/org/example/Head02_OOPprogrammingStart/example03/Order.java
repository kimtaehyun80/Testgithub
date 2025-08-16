package org.example.Head02_OOPprogrammingStart.example03;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;
    //private은 클레스 내에서만 접금가능
    //products라는 이름의 리스트타입 선언이고 목록에 product객체들이 담겨있다.
    private boolean isPaid;

    // 기본 생성자
    public Order() {
        this.orderId = "NONE";
        this.products = new ArrayList<>();  //이 products객체에 뉴 어레이리스트를 할당해라
        this.isPaid = false;
    }

    // 오버로딩된 생성자
    public Order(String orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
        this.isPaid = false;
    }

    // this() 호출 예시
    public Order(String orderId) {
        this(orderId, new ArrayList<>());  // 현재 클레스에 다른생성자 호출 = this()
    }

    //getter 생성 법 실습
    public String getOrderId() {

        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean isPaid() {

        return isPaid;
    }
}