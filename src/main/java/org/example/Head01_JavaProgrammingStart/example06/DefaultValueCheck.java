package org.example.Head01_JavaProgrammingStart.example06;

public class DefaultValueCheck {
    public static void main(String[] args) {
        boolean[] flags = new boolean[2];
        int[] numbers = new int[2];
        String[] strings = new String[2];
        System.out.println("flags[0] : " + flags[0]); // boolean 은 false
        System.out.println("numbers[0] : " + numbers[0]); // 정수 는 0
        System.out.println("strings[0] : " + strings[0]); // 참조문자열 은 null
    }
}

