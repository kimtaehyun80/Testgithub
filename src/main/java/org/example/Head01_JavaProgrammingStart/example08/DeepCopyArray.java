package org.example.Head01_JavaProgrammingStart.example08;

public class DeepCopyArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];  // 오리자날 과 카피는 복제됬지만 서로다른 메모리에 존제

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        copy[0] = 100;  // 카피에 0주소에 100값 변경해도, 오리지널0주소에는 변경x
        System.out.println(original[0]); // 1 (영향 없음)
    }
}
