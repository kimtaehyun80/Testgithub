package org.example.Head01_JavaProgrammingStart.example04;

public class WhileExample {
    public static void main(String[] args) {
        int count = 0;

        while (count < 3) {
            System.out.println("count = " + count);
            count++;  // 연산자가 하나 이기에 ++count 와 결과는 동일
        }
    }
}
