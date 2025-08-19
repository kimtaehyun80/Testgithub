package org.example.Head04_JCF.example05;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Apple", "Cherry", "Banana");

        Set<String> uniqueFruits = fruits.stream()
                .collect(Collectors.toSet());  // otSet으로 중복문자열 수집(중복만 출력x,중복은 하나로

        System.out.println("Unique fruits: " + uniqueFruits);
    }
}

