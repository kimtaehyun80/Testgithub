package org.example.Head04_JCF.example06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MultiLevelGrouping {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
                new Employee("Alice", "Manager", "HR"),
                new Employee("Bob", "Developer", "IT"),
                new Employee("Charlie", "Developer", "IT"),
                new Employee("David", "Manager", "Sales"),
                new Employee("Eve", "Developer", "Sales")
        );

        // 1차: position 기준 -> 2차: department 기준
        Map<String, Map<String, List<Employee>>> multiGroup =
                emps.stream().collect(
                        Collectors.groupingBy(
                                Employee::getPosition, //Employee클레스의::getPosition메소드참조
                                Collectors.groupingBy(Employee::getDepartment)
                        ));

        System.out.println(multiGroup);
    }
}

