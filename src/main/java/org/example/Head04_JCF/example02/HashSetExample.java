package org.example.Head04_JCF.example02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();  //set인터페이스

        // 요소 추가
        countries.add("Korea");
        countries.add("Japan");
        countries.add("China");
        countries.add("Korea");  // 중복된 요소 시도

        System.out.println("After add: " + countries);

        // 요소 포함 여부 확인
        System.out.println("Contains 'Japan'? " + countries.contains("Japan"));

        // 요소 제거
        countries.remove("China");
        System.out.println("After remove 'China': " + countries);

        // 개수 확인
        System.out.println("Set size: " + countries.size());

        // 전체 제거
        countries.clear();
        System.out.println("After clear: " + countries);
    }
}
