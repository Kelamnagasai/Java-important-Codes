package com.AccentureCodes;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		int temp=n;
		
		int rev=0;
		while(n!=0) {
			int digit = n%10;
			 rev= rev*10+digit;
			 n=n/10;
			
		}
		if(temp==rev) {
			System.out.println("it is a palindrome ");
		}else {
			System.out.println("It is not a palindrome");
		}
		sc.close();

	}

}
