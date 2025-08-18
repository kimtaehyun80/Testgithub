package org.example.Head04_JCF.example03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;  // 스트림패키지에 스트림 클레스 사용

public class FilterNumbersExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        // 익명 클래스를 사용한 Predicate
        Predicate<Integer> isEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        };

        Stream<Integer> stream = numbers.stream();
        Stream<Integer> evenStream = stream.filter(isEven); // filter() 중간 연산

        evenStream.forEach(num -> System.out.println("Even number: " + num)); // 최종 연산
    }
}
