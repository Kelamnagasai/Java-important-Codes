package com.PracticeArrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		int[] numbers = {80,23,45,78,89};
		
		int totalsum = 0;
		double average = 0;
		
		//for loop
//		for(int i=0;i<numbers.length;i++) {
//			totalsum = totalsum+numbers[i];
//		}
		
		for(int number:numbers) {
			totalsum+=number;
		}
		
		//average = totalsum/numbers.length;
		
		for(int num:numbers) {
			average=totalsum/numbers.length;
		}
		
		
		System.out.println(totalsum);
		System.out.println(average);

	}

}
