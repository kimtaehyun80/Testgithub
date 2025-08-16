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
        // getter는 필드값에 접근해서 수정하기위한 메서드다. get은 값반환,set은 값설정
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
        // 오더 클레스에 오더객체생성를 생성하는데 오더 생성자에 ()값을 새로 입력해라, 각오더 클릭해보면 이해
        order.printOrderSummary();  //생성한 오더객체의 위에 프린트오더서머리 메서드를 호출 해라
    }
}
