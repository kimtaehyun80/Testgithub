package org.example.Head01_JavaProgrammingStart.example08;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };  // 행열에서 행에 개수는 세로로 새고,열의 개수는 가로로 샌다.

        for (int i = 0; i < matrix.length; i++) {  // matrix.length=총 행의수=2개
            for (int j = 0; j < matrix[i].length; j++) {   // matrix[i].length=i번째 행요소 개수
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
