package com.PracticeStrings;

public class DefiningStrings {

	public static void main(String[] args) {
		String s1 = "Nagasai"; // 1 object is created in string constant pool 
		
		String s2 = new String("arjun");//2 objects is created one is in scp and another in heap 
	
		String s3 = new String("Nagasai");//one object is created in heap memory because already above sting literal 1 object is created in scp
		
		String s4 = "Java"+"Fullstack";
		
		s4 = "vcube javafullstack";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
