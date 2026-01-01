package com.PracticePatterns;
import java.util.Scanner;
public class TestPattern {
	
	public static void reverseString(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		 System.out.println("Reversed String : "+rev);
		
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	String str = sc.nextLine();
	reverseString(str);
			
	sc.close();

	}

}
