package com.PracticeStrings;
import java.util.Scanner;
public class ReverseAString {
	
	static String reverseString(String s1){
		String rs = "";
		for(int i=0;i<s1.length();i++) { 
			char c = s1.charAt(i);
			rs = c+rs;
		}
//		for(int i=s1.length()-1;i>=0;i--) {
//			char c1 = s1.charAt(i);
//			System.out.print(c1);
//		}
//		System.out.println();
		
		
		return rs;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = sc.nextLine();
		
		String rstr = reverseString(str);
		
		
		
		System.out.println("Reversed String is : "+rstr);
		
		if(str.equals(rstr)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
		
		sc.close();

	}

}
