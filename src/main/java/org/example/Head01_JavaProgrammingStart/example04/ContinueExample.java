package org.example.Head01_JavaProgrammingStart.example04;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) continue;  //if조건이 참일때만 건너뛰어라<->break반복문은 조건참에 모두종료
            System.out.println(i);  // 홀수만 출력
        }
    }
}
