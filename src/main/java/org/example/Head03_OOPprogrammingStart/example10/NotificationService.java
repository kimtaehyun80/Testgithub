package org.example.Head03_OOPprogrammingStart.example10;

// 상위 모듈
public class NotificationService {
    private final NotificationSender sender;

    // 의존성 주입(생성자 주입) 통해, 구체 클래스 대신 인터페이스만 의존
    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }

    public void notify(String message) {
        sender.send(message);
    }
}
