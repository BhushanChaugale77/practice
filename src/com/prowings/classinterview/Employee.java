package com.prowings.classinterview;

public class Employee {
	
	    String name;
	    double salary;
	    int id;

	    
	    
	    public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(String name, double salary, int id) {
	        this.name = name;
	        this.salary = salary;
	        this.id = id;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

	  
	    
	    
	}

	

