package com.AccentureCodes;

public class FibonacciSequence {
	static int n=10;
	static int num1 =0;
	static int num2 =1;
	static int num3;

	public static void main(String[] args) {
	
	
	System.out.println("Fibonacci sequence upto "+n+" Values");
	System.out.println(num1);
	for(int i=1;i<n;i++) {
		System.out.println(num2);
		num3=num1+num2;
		num1=num2;
		num2=num3;	
		
		
	}
	  System.out.println("Reverse of Fibonacci sequence");
	  
	  for(int i=n;i>0;i--) {
		  System.out.println(num1);
		  num3 = num2-num1;
		  num2=num1;
		  num1=num3;
	  }
	}

}
