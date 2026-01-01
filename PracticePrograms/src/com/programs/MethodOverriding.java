package com.programs;

public class MethodOverriding {
	MethodOverriding(int a,int b){
		System.out.println(a+b);
	}
	
	void display() {
		System.out.println("Addition is done");
	}

	
}

class Overriding extends MethodOverriding{
	
	Overriding(int c){
		super(10,20);
		System.out.println(c);
		
		
	}
	
	void display() {
		
		System.out.println("Addition for c is done :");
	
	}
	

	public static void main(String[] args) {
		System.out.println("Main method started");
		MethodOverriding o1 = new MethodOverriding(10,20);
		MethodOverriding o = new Overriding(5);
		o.display();
		
		

	}

}
