package org.example.Head04_JCF.example03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapNamesExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Function<String, Integer> nameLength = new Function<String, Integer>() {
            // new 인터페이스() { ... } → 무조건 익명 클래스
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

                 names.stream()
                .map(nameLength)
                         // .map(nameLength)는 문자길이 생성,stream api 메소드
                .forEach(length -> System.out.println("Name length: " + length));
    }
}
