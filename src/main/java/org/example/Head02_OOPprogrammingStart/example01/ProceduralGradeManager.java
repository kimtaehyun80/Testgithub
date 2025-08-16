package org.example.Head02_OOPprogrammingStart.example01;

public class ProceduralGradeManager {
    public static void main(String[] args) {
        String[] studentNames = {"Alice", "Bob", "Charlie"};
        int[] mathScores = {90, 80, 85};
        int[] engScores = {95, 75, 88};

        for (int i = 0; i < studentNames.length; i++) {  //일차배열.length는 행길이,이차는 행개수
            int total = mathScores[i] + engScores[i];
            double average = total / 2.0;
            System.out.printf("%s 평균: %.1f\n", studentNames[i], average);
            // \n줄바꿈, \t일정간격뛰움, \"쌍따옴표출력, %s자리에<-studentNames[i]문자열 들어감
            // %.1f소수점첫자리표시
        }
    }
}
//요구사항: 학생들의 수학,영어 평균점수 출력해주세요.
//요구사항 늘어날때