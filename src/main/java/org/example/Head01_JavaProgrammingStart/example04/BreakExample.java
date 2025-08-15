package org.example.Head01_JavaProgrammingStart.example04;


public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;  //if조건 참일때까지 실행되다가 참일때 즉시종료
            System.out.println(i);
        }
    }
}