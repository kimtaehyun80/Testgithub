package org.example.Head01_JavaProgrammingStart.example03;

public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {  //경우에 맞을때 실행
            case 1:
                System.out.println("월요일");
                break; //경우에 맞으면 실행하고 모든작업완료
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            default:
                System.out.println("기타 요일");
        }
    }
}
