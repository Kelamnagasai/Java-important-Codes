package com.AccentureCodes;
import java.util.Scanner;
public class VowelsCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine().toLowerCase();
		
		int vowelCount=0;
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vowelCount++;
				
			}
			
		}
		System.out.println("Vowels count : "+vowelCount);
		
		sc.close();
	}

}
