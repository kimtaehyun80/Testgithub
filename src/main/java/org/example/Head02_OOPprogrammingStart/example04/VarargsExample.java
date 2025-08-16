package org.example.Head02_OOPprogrammingStart.example04;

public class VarargsExample {
    public static void main(String[] args) {
        Example ex = new Example();  // Example클레스에 새로운 이그젬플 객체 생성해서 ex변수에 할당해라
        ex.print(1, 2);  // fixed two ints 호출 , ex객체에 print메서드 호출해서 a b 값 전달
    }
}

class Example {
    void print(int a, int b) { System.out.println("fixed two ints"); }
    void print(int... nums) { System.out.println("varargs ints"); }
}

//print(1, 2) 호출 시, varargs보다 일반 메서드가 우선되어 fixed two ints 출력됨
