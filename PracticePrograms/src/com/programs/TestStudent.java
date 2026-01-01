package com.programs;

public class TestStudent {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("main method started");
		s.setName("sai");
		s.setMarks(99);
		s.setRoll(39);
		
	      System.out.println("Name : "+s.getName());
	      System.out.println("Marks : "+s.getMarks());
	      System.out.println("Roll : "+s.getRoll());
	}

}
