package org.example.Head05_JG.example02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list.get(1)); // 출력: Banana
        list.remove(0);
        System.out.println(list); // 출력: [Banana]
        //  System.out.println(list.get(0));  바나나는 0번으로 이동
    }
}
