package org.example.Head03_OOPprogrammingStart.example06;

public class InheritanceTest {
    public static void main(String[] args) {
        User u = new PersonalUser("U001", "Alice", "alice@example.com");
        User w = new BusinessUser("w002", "Challi", "challi@intel.com", "Intel");
        u.printUserInfo();
        w.printUserInfo();
    }
}
