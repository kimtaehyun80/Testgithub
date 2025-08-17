package org.example.Head03_OOPprogrammingStart.example06;

public class InheritanceTest {
    public static void main(String[] args) {
        User u = new PersonalUser("U001", "Alice", "alice@example.com");
        //User타입 u변수를 만드는데 PersonalUser()매소드값을 할당해라. 부모클레스User 와 자식클레스PersonalUser 관계 일때 성립
        User w = new BusinessUser("w002", "Challi", "challi@intel.com", "Intel");
        u.printUserInfo();  // u변수에 부모클레스 변수인 printUserInfo()메서드를 호출해라
        w.printUserInfo();
    }
}
