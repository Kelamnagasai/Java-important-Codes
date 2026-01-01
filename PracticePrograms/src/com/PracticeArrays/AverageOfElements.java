package com.PracticeArrays;

public class AverageOfElements {

	public static void main(String[] args) {
		
		int[] a = {20,40,60,30};
		
		int sum=0;
		double average;
		for(int a1 :a) {
			sum = (sum+a1);
			
		}
		average = (double)sum/a.length;//To get accurate value we use type casting
		
		System.out.println("Average of an array : "+average);

	}

}
