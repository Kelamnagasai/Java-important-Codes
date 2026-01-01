package com.PracticeStrings;

public class TestDemo {

	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = new String("Java");
		
		s1=s1.intern();
		System.out.println(s1==s2);//false
	}

}
