package org.example.Head01_JavaProgrammingStart.example05;

public class BreakContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            if (i == 4) break;
            System.out.println(i);
        }
    }
}