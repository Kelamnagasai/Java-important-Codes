package com.PracticeArrays;

public class MinumumaAndmaximum {

	public static void main(String[] args) {
		
		int[] numbers = {10,-5,34,23,10,-1,2,5}; //
		
		int min=numbers[0];//10,-5
		int max=numbers[0];//10,34
		
//		for(int n:numbers) {
//			if(n<min) {
//				min=n;
//			}else if(n>max) {
//				max=n;
//			}
//		
//		}
		
		
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<min) {
				min=numbers[i];
			}else if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		System.out.println("minimum element in the array : "+min);
		System.out.println("maximum element in the array : "+max);

	}

}
