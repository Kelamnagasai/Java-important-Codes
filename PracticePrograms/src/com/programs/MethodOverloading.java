package com.programs;

public class MethodOverloading {
	public void addition() {
		System.out.println("method with no args");
	}
	
	public void addition(int i) {
		System.out.println("Method with args");
	}
	
	public int addition(int a,int b) {
		int add = a+b;
		System.out.println("addition successfully completed : "+add);
		return add;
	
		
	}
	
	public void addition(float a, double b) {
		System.out.println("Addition with float and double values");
	}

	public static void main(String[] args) {
		MethodOverloading l = new MethodOverloading();
		System.out.println("main method started");
		l.addition();
		l.addition(10);
		l.addition(10,20);
		l.addition(1.5F,3213.5d);
		

	}

}
