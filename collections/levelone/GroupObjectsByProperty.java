package com.bridgelabz.collections.levelone;

import java.util.*;

public class GroupObjectsByProperty {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR"),
                new Employee("David", "IT"),
                new Employee("Eve", "Finance")
        );

        HashMap<String, List<String>> map = new HashMap<>();

        for (Employee emp : employees) {
            String department = emp.getDepartment();
            String name = emp.getName();

            if (!map.containsKey(department)) {
                map.put(department, new ArrayList<>());
            }

            map.get(department).add(name);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}
