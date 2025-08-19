package org.example.Head04_JCF.example06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String position;    // 예: "Manager", "Developer"
    private String department;  // 예: "HR", "IT", "Sales"

    public Employee(String name, String position, String department) {
        this.name = name;
        this.position = position;
        this.department = department;
    }
    public String getPosition() { return position; }
    public String getDepartment() { return department; }
    @Override
    public String toString() {
        return name + "(" + position + ", " + department + ")";
    }
}

