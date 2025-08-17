package org.example.Head03_OOPprogrammingStart.example04;

public class Topic03ExampleMain {
    public static void main(String[] args) {
        Order o1 = new Order(new CreditCardPayment());  // Order클렉스 o1객체를 생성하는데,
        // 새로운 CreditCardPayment()객체를 인자로 받도록 새로 정의함
        o1.process(50000);  // o1객체에 Order클레스 process메서드 호출해서 50000만을 할당해라

        Order o2 = new Order(new AccountTransferPayment());  // Order클렉스 o2객체를 생성하는데,
        // 새로운 CreditCardPayment()객체를 인자로 받도록 새로 정의함
        o2.process(30000);  // o2객체에 Order클레스 process메서드 호출해서 30000만을 할당해라

        Order o3 = new Order(new CryptoPayment());  // Order클렉스 o3객체를 생성하는데,
        // 새로운 CryptoPayment()객체를 인자로 받도록 새로 정의함
        o3.process(100000);  // o3객체에 Order클레스 process메서드 호출해서 100000만을 할당해라
    }
}
