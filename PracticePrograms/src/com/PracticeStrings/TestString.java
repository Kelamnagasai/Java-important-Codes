package com.PracticeStrings;

public class TestString {

	public static void main(String[] args) {
//		String s1 = "Naga";
//		String s2 = "sai";
//		
//		System.out.println(s1.concat(s2));
		
//		String s1 = new String("arjun");
//		String s2 = new String("desai");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		
//		char[] c = {'N','a','g','a'};
//		System.out.println(c);
//		
//		int[] s4 = {10,20,30};
//		System.out.println(s4);
//		
//		String s8 = "das";
//		for(int i=0;i<s8.length();i++) {
//			char c1 = s8.charAt(i);
//			System.out.println(i);
//		}
		
		String s = "Nagasai";
		String s3 = "sai";
		System.out.println(s.codePointAt(0));
		System.out.println(s.codePointBefore(3));
		System.out.println(s.codePointCount(0, 3));
		
		System.out.println(s.compareTo(s3));
		System.out.println(s.compareToIgnoreCase(s3));
		
		String s1 = "Naga";
		String s2 = "sai";
		
	
		System.out.println(s1.concat(s2));
		
		
		//System.out.println(s1+s2);
		
		

	}

}
