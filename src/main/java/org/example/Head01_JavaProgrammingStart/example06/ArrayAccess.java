package org.example.Head01_JavaProgrammingStart.example06;

public class ArrayAccess {
    public static void main(String[] args) {
        int[] scores = {88, 92, 76};
        System.out.println(scores[0]); // 88
        scores[1] = 95;  // 배열1번째 값92 대신 95로 대채, 92는 삭제 되지 않는다.
        System.out.println(scores[1]); // 95로 참조 되지만 92는 배열에 남아있다
    }
}
