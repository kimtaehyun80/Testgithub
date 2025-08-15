package org.example.Head01_JavaProgrammingStart.example04;

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 5;

        do {  //do는 최소한번은 실행
            System.out.println("i = " + i);  //여기까지 실행되고
            i++;    // 여기부턴 실행x
        } while (i < 5);
    }
}
