package org.example.Head03_OOPprogrammingStart.example06;


//부모클레스 User 를 상속하는 자식클렉스 PersonalUser 생성
class PersonalUser extends User {
    private String PersonalEmail;  // 필드에 PersonalEmail객체 선언

    public PersonalUser(String id, String name, String PersonalEmail) {
        // 생성자 이름은 클렉스이름(=PersonalUser)과 동일하고 반환값은 없다, () 를 매개변수로 받는 생성자 PersonalUser를 만든다
        super(id, name);  //super는 부모클레스 생성자호출, 부모클레스의 id,name값 호출
        this.PersonalEmail = PersonalEmail;  //여기 자식클레스에 PersonalEmail객체에 외부 PersonalEmail값 을 할당해라
    }
    //오버라이드= 부모클레스 필드나 메서드 호출해서 재정의할때 사용
    @Override
    public void printUserInfo() {
        super.printUserInfo();  // 부모클레스 의 printUserInfo()매소드를 호출해라
        System.out.println("이메일: " + PersonalEmail);
    }
}
