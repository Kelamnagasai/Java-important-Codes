package com.PracticeArrays;

import com.programs.A;

public class TwoArraysInThirdArray {

	public static void main(String[] args) {
		
		int[] a1 = {10,20,30};
		
		int[] a2 = {40,50,60};
		
		int[] a3 = new int[a1.length+a2.length];
		
		
	       int a1Length = a1.length;
	       
	       int a2Length = a2.length;
	       
	       for(int i=0;i<a1.length;i++) {
	    	   a3[i] = a1[i];
	    	 
	       }
	       
	       for(int i=0;i<a2.length;i++) {
	    	   a3[a1.length+i] = a2[i];
	       }
	       
	       for(int a : a3) {
	    	   System.out.print(a+" ");
	       }
	

	}

}
