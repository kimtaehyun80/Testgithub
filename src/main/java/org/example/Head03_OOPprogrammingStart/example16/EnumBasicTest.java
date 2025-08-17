package org.example.Head03_OOPprogrammingStart.example16;

public class EnumBasicTest {
    public enum Level {
        LOW, MEDIUM, HIGH
    }

    public static void main(String[] args) {
        for (Level lvl : Level.values()) {  // Level.values()는 Level이룸에 모든상수를 순회하는 lvl변수에 할당해라
            System.out.println(lvl + " ordinal=" + lvl.ordinal());
        }
        Level today = Level.MEDIUM;
        System.out.println("name(): " + today.name());
    }
}
// values(): enum 모든 값 배열 반환
// ordinal(): 선언 순서 기준 인덱스 (0부터)
// name(): 상수 이름 문자열 출력