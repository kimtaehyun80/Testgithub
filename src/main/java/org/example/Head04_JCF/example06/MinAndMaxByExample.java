package org.example.Head04_JCF.example06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinAndMaxByExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");

        Optional<String> minFruit = fruits.stream()
                .collect(Collectors.minBy(Comparator.naturalOrder()));
        Optional<String> maxFruit = fruits.stream()
                .collect(Collectors.maxBy(Comparator.naturalOrder()));

        System.out.println("Lexicographically smallest fruit: " + minFruit.orElse("None"));
        // orElse("None")는 '없으면 대체값 none로 제공하는 메소드'
        System.out.println("Lexicographically biggest fruit: " + maxFruit.orElse("None"));
    }
}

