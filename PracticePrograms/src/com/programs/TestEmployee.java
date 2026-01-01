package com.programs;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("main method started");
		Employee1 e = new Employee1();
		
		e.setempId(1);
		e.setfirstName("Nagasai");
		e.setlastName("kelam");
		e.setuserName("Nagasai kelam");
		
		
		
		System.out.println("EmpId : "+e.getempId());
		System.out.println("FirstName : "+e.getfirstName());
		System.out.println("LastName : "+e.getlastName());
		System.out.println("userName : "+e.getuserName());
		

	}

}
