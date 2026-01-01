package com.PracticeArrays;

public class ReverseArray {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		int[] numbers = {10,20,30,40,50}; // 0,1,2,3,4
		
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]);
		}
		
		
		System.out.println("Reverse Array");
		for(int i=numbers.length-1;i>=0;i--) {
			System.out.print(numbers[i] + " ");
		}
	}

}
