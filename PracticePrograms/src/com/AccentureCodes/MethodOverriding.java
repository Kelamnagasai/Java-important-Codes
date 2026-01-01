package com.AccentureCodes;

public class MethodOverriding {
	public  void addition(int a,int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
}
 class demo extends MethodOverriding{
	 
	 public  void addition(double a,double b) {
		 double sum = a+b;
		 System.out.println("sum of numbers : "+sum);
	 }
 }
	 
 class MainTypeCode{
	public static void main(String[] args) {
		MethodOverriding m = new demo();
		m.addition(10,20);

	}
}

 
