package com.prowings.classinterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Java8 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("abc", 2000, 123),
            new Employee("abc", 5000, 123),
            new Employee("abc", 3000, 123),
            new Employee("abc", 8000, 123),
            new Employee("xyz", 4000, 124),  
            new Employee("xyz", 8000, 124),  
            new Employee("xyz", 6000, 124),                                                 
            new Employee("xyz", 7000, 124),  
            new Employee("xyz", 1000, 124),  
            new Employee("pqr", 4000, 125),  
            new Employee("pqr", 7000, 125),  
            new Employee("pqr", 5000, 125),  
            new Employee("pqr", 3000, 125),  
            new Employee("pqr", 2000, 125),  
            new Employee("pqr", 1000, 125)
        );

        // Get the highest salary by ID
        Map<Integer, Employee> highestSalaryById = getHighestSalaryById(employees);

        System.out.println("Employees with the highest salary for each ID:");
        highestSalaryById.values().forEach(employee -> {
            System.out.println("Name: " + employee.getName());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("ID: " + employee.getId());
            System.out.println("-------------------------");
        });
    }

    // Method to get the employee with the highest salary for each ID
    public static Map<Integer, Employee> getHighestSalaryById(List<Employee> employees) {
        return employees.stream()
                        .collect(Collectors.toMap(
                                 Employee::getId,
                                      e -> e,
                                      (e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2
            ));
    }
}

