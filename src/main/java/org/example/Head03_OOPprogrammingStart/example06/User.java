package org.example.Head03_OOPprogrammingStart.example06;


// 추상클레스 선언 (부모클레스)
class User {
    protected String userId;
    protected String name;

    public User(String userId, String name) {
        // 생성자 이름은 클렉스이름(=User)과 동일하고 반환값은 없다, () 를 매개변수로 받는 생성자 User를 만든다
        // String타입의 oderId,name 2가지 객체를 매개변수로 받아라
        this.userId = userId;  // 현재 클레스에 userId필드에 외부 userId값을 할당해라
        this.name = name;  // 현재 클레스에 name필드에 외부 name값을 할당해라
    }
    // printUserInfo()라는 매서드생성
    public void printUserInfo() {
        System.out.println("ID: " + userId + ", 이름: " + name);
    }
}
