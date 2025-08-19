package org.example.Head04_JCF.example06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReducingExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "Collector");

        // 모든 단어를 연결하며 " - " 구분자를 삽입
        String joined = words.stream()
                .collect(Collectors.reducing(
                        "",
                        (a, b) -> a.isEmpty() ? b : a + " - " + b
                ));
  //삼항연산자
        System.out.println("Joined: " + joined);
    }
}

