package com.programs;
import java.util.Scanner;
public class Factorial {
	
	public static void factorial(int n){
		int fact = 1;
		for(int i=n;i>=1;i--) {
			 fact = fact*i;
			
		}
		
		System.out.println("Factorial of a Number is : "+fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		  factorial(n);

	}

}
