package com.programs;

public class Parent {
	
	public  int getRateOfInterest() {
		return 9;
	}
	
}
	
	class Child extends Parent{
		public  int getRateOfInterest() {
			return 10;
		}
	

	public  static void main(String[] args) {
		System.out.println("main method started:");
        Parent p = new Child();
		System.out.println(p.getRateOfInterest());
		

	}
}
	


