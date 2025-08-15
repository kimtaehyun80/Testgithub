package org.example.Head02_OOPprogrammingStart.example02;

class Order {
    String customer;
    String product;
    int quantity;
    int price;

    Order(String customer, String product, int quantity, int price) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    int getTotalPrice() {
        return quantity * price;
    }

    void printOrderSummary() {
        System.out.printf("%s 님이 주문한 %s %d권의 총액은 %d원입니다.\n",
                // %s문자열출력, %d정수형출력, %f실수형출력
                customer, product, quantity, getTotalPrice());
    }
}

public class OOPOrderManager {
    public static void main(String[] args) {
        Order order = new Order("Alice", "Book", 2, 15000);
        order.printOrderSummary();  //윗단에 보이드 프린트오더서머리를 입력해라라 는 class선언
    }
}
