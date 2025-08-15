package org.example.Head01_JavaProgrammingStart.example04;

public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {  //선언초기화 후 조건 참 일때 내부for로,거짓이면 종료
            for (int j = 1; j <= 2; j++) {  //선언초기화 내부gor문에서 계속실행 거짓나오면 외부for으로
                System.out.println("i=" + i + ", j=" + j);  // 내부for문은 재방문시 선언초기화 적용됨
            }
        }
    }
}
