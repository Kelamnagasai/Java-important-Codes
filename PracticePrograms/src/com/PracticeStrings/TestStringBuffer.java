package com.PracticeStrings;
import java.util.Scanner;
public class TestStringBuffer {
	
	public String reverseString(String s1) {
		String rev = "";
		for(int i=0;i<s1.length();i++) {
			char c = s1.charAt(i);
			rev = c+rev;
		}
		
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		TestStringBuffer ts = new TestStringBuffer();
		String rstr = ts.reverseString(str);
		System.out.println("Reversed String is : "+rstr);
		
		sc.close();
	}

}
