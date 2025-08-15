package org.example.Head01_JavaProgrammingStart.example07;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] animals = {"Cat", "Dog", "Bird"};
        for (String animal : animals) {  //String animal변수 사용해서 animals배열 요소 차례대로 순회
            System.out.println(animal);
        }
    }
}
