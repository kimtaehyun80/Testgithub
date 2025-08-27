package org.example.Head05_JG.example04;

import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        // BufferedReader로 텍스트 파일을 한 줄씩 읽는 예시
        // try-catch 예외처리구문 try블럭에 예외 코드적고 예외발생없으면 catch건너뛰고
        // try블럭에 예외 코드에서 예외발생시 catch블락중 일치하는 catch블락으로 이동
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // 한 줄씩 출력
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // BufferedWriter로 텍스트 파일에 한 줄씩 쓰는 예시
        // try-catch 예외처리구문 try블럭에 예외 코드적고 예외발생없으면 catch건너뛰고
        // try블럭에 예외 코드에서 예외발생시 catch블락중 일치하는 catch블락으로 이동
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Hello File I/O");
            bw.newLine(); // 줄바꿈
            bw.write("Using BufferedWriter for better performance");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

