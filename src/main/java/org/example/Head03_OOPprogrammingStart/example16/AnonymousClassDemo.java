package org.example.Head03_OOPprogrammingStart.example16;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        // 추상 클래스 익명 구현
        AbstractTask customTask = new AbstractTask() {
            @Override
            public void execute() {
                System.out.println("추상 클래스의 execute() 구현부");
            }
        };

        customTask.start();
        customTask.execute();
    }
}
