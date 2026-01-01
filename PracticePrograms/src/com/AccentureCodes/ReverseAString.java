package com.AccentureCodes;

public class ReverseAString {

	public static void main(String[] args) {
		String rev="";
		String str= "madam";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			rev = c+rev;
		}
		System.out.println(rev);
		
		if(rev.equals(str)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a palindrome");
		}

	}

}
