package org.example.Head02_OOPprogrammingStart.example02;

class Student {
    String name;
    int mathScore;
    int engScore;

    Student(String name, int mathScore, int engScore) {
        this.name = name;    //외부내임값을 여기 내임에
        this.mathScore = mathScore;
        this.engScore = engScore;
    }

    double getAverage() {
//입력되는 평균값을 더블로 반환해라
        return (mathScore + engScore) / 2.0;
    }
}

public class OOPGradeManager {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 90, 95),
                new Student("Bob", 80, 75),
                new Student("Charlie", 85, 88)
        };

        for (Student student : students) {     //향샹된for문 (배열:컬렉션순회)한개씩 내용 꺼내와라
            System.out.printf("%s 평균: %.1f\n", student.name, student.getAverage());
            //student.getAverage() 학생객체 평균값 호출
        }
    }
}
