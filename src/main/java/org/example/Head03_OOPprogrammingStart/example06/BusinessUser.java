package org.example.Head03_OOPprogrammingStart.example06;


// 부모클렉스 상속해서 자식클레스 생성
class BusinessUser extends User {
    private String BusinessEmail;
    //필드 추가
    private String companyName;

    public BusinessUser(String id, String name, String BusinessEmail, String companyName) {
        super(id, name);
        this.BusinessEmail = BusinessEmail;  //여기 자식클레스에 BusinessEmail객체에 외부 BusinessEmail값 을 할당해라
        this.companyName = companyName;  //여기 자식클레스에 companyName객체에 외부 companyName값 을 할당해라
    }

    //오버라이드= 부모클레스 필드나 메서드 호출해서 재정의할때 사용
    @Override
    public void printUserInfo() {
        super.printUserInfo();  // 부모클레스 의 printUserInfo()매소드를 호출해라
        System.out.println("이메일: " + BusinessEmail);
        System.out.println("회사이름: " + companyName);
    }
}
