package com.programs;

public class FullTimeEmployee extends Employee{
	
	
	int salary;
	
     FullTimeEmployee(String name,int id,int salary) {
    	 super(name,id);
    	 this.salary=salary;
	}
     

	void display() {
		super.display();
		System.out.println("salary of the employee :"+salary);
	}

	
	public static void main(String[] args) {
	    Employee e = new FullTimeEmployee("Nagasai",39,15000);
		e.display();
		

	}

}
