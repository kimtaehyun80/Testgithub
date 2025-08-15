package org.example.Head02_OOPprogrammingStart.examplr06;

class Player {
    private String name;
    private int health;

    Player(String name) {
        this.name = name;
        this.health = 100;
    }

    // 메시지를 받으면 실행되는 메서드
    void receiveDamage(int amount) {
        health -= amount;
        System.out.println(name + " received " + amount + " damage. Remaining health: " + health);
    }
}

public class MessageExample {
    public static void main(String[] args) {
        Player playerA = new Player("Alice");
        Player playerB = new Player("Bob");

        // playerA가 playerB에게 메시지 전달 → 피해를 요청
        playerB.receiveDamage(30);
    }
}
