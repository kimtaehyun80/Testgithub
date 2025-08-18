package org.example.Head04_JCF.example03;

import java.util.Arrays;
import java.util.List;

public class StreamBasicExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Jerry", "Kim", "Tommy");
// Arrays.asList()는 배열을 리스트 객체로 변환해라, 그리고 names객체에 할당해라
                 names.stream()                     // nsmes객체이 Stream 생성
                .filter(name -> name.startsWith("T"))
                         //중간연산1, 이름에서->t로시작하는 문자열을 필터해라
                .map(String::toUpperCase)
                         //중간연산2, 입력된 문자열을 대문자로 변환해라
                .forEach(System.out::println);
                 //최종연산, 컬렉션 각 항목을 System.out객체의println 메소드 호출해서출력

    }
}
