package com.prowings.classinterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	
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

	        Map<Integer, Employee> highestSalaryById = new HashMap();

	        for (Employee employee : employees) {
	            int id = employee.getId();
	            if (!highestSalaryById.containsKey(id) || employee.getSalary() > highestSalaryById.get(id).getSalary()) {
	                highestSalaryById.put(id, employee);
	            }
	        }

	        System.out.println("Employees with the highest salary for each ID:");
	        for (Employee employee : highestSalaryById.values()) {
	            System.out.println("Name: " + employee.getName());
	            System.out.println("Salary: " + employee.getSalary());
	            System.out.println("ID: " + employee.getId());
	            System.out.println("-------------------------");
	        }
	    }
	}

	
	

