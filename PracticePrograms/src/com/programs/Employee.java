package com.programs;

public class Employee {
	private String name;
	private int id;
	
	Employee(String name, int id){
		this.name=name;
		this.id = id;
	}
	
	void display() {
		System.out.println("Name of the employee :"+name);
		System.out.println("Id of the employee :"+id);
	}

}
