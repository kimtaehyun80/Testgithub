package org.example.Head04_JCF.example06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

class Employee2 {
    private String name;
    private String dept;
    private int salary;

    public Employee2(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public String getDept() { return dept; }
    public int getSalary() { return salary; }
    public String toString() {
        return name + "(" + dept + ", " + salary + ")";
    }
}
