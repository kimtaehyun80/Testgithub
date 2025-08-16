package org.example.Head01_JavaProgrammingStart.example08;

import java.util.Arrays;

public class ArrayToSort {
    public static void main(String[] args) {
        int[] data = {5, 2, 8};
        Arrays.sort(data);  // data배열을 오른차순으로 정렬하라는 메서드

        System.out.println(Arrays.toString(data)); // [2, 5, 8]
        // Arrays.toString(data)는 data배열의 실재내용을 문자열로 변환하라는 메서드
    }
}