package org.example.Head03_OOPprogrammingStart.example16;

public class PaymentMethodDemo {
    public static void main(String[] args) {
        for (PaymentMethod method : PaymentMethod.values()) {
            System.out.println(method.name() + " => " + method.getDisplayName());
        }
    }
}
