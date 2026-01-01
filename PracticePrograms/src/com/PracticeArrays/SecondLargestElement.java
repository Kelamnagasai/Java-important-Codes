package com.PracticeArrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50};
		
		int sum=0;
		int average=0;
		for(int number : numbers) {
			sum = sum+number;
			average=sum/numbers.length;
		}
		
		System.out.println(sum);
		System.out.println(average);
		
		

	}

}
