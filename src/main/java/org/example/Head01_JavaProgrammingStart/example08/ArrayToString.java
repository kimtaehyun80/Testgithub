package org.example.Head01_JavaProgrammingStart.example08;

import java.util.Arrays;  // 자바프로그램 자체 유틸패키지 에 있는 Arrays 클레스를 가져와라

public class ArrayToString {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15};
        System.out.println(Arrays.toString(arr)); // [5, 10, 15]
        //Arrays.toString()는 ()배열의 주소가 아닌 실제 내용을 문자열로 출력 하라는 메서드
        //Arrays.toString()이 없다면 배열 주소값만 출력됨
    }
}
