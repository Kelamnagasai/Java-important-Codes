package com.PracticeArrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		int[] ages;//Declaration
		
		  ages = new int[5];//creation 0,1,2,3,4
		  
		  ages[0] = 20; //initialization
		  ages[1] = 29;
		  ages[2] = 30;
		  ages[3] = 40;
		  ages[4] = 50;
	
		  
		  System.out.println(ages[0]);
		 
		  
		  
		//  Representation with for loop
		  for(int i=0;i<5;i++) {
			  System.out.println(ages[i]);
		  }
	
		  
		  //Representation with for each loop
		  for(int age:ages) {
			  System.out.println(age);
		  }
		  
		  
		  
		
		

	}

}
