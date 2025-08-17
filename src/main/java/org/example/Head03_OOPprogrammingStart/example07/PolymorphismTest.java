package org.example.Head03_OOPprogrammingStart.example07;


import org.example.Head03_OOPprogrammingStart.example01.AccountTransferPayment;
import org.example.Head03_OOPprogrammingStart.example01.CreditCardPayment;
import org.example.Head03_OOPprogrammingStart.example01.CryptoPayment;
import org.example.Head03_OOPprogrammingStart.example01.Payment;

public class PolymorphismTest {
    public static void main(String[] args) {
        Payment[] payments = new Payment[]
                {
                        new CreditCardPayment(),
                        new AccountTransferPayment(),
                        new CryptoPayment()
                };
        double[] paymentAmounts = new double[] {
                30000,
                70000,
                100000
        };
        OrderService service = new OrderService();
        for(Payment payment : payments) {  // Payment타입 (payment배열=반복변수), :는 ~에서, payments컬렉션(위뉴카드,계좌,크립토)순회
            if(payment instanceof CreditCardPayment) {  // 'a instanceof b'는 상속관계 인지 참이면 실행, 거짓이면 패스
                service.processPayment(payment, paymentAmounts[0]);  // service변수의 processPayment() 매서드호출
            } else if(payment instanceof AccountTransferPayment) {
                service.processPayment(payment, paymentAmounts[1]);  // 매개변수는 payment객채와 paymentAmounts[]배열을 갖는다.
            } else if(payment instanceof CryptoPayment) {
                service.processPayment(payment, paymentAmounts[2]);
            } else {
                service.processPayment(payment, 1000);
            }
        }

    }
}