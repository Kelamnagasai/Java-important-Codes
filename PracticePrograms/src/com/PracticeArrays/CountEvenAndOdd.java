package com.PracticeArrays;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		
		int[] numbers = {2,3,4,6,7,9,10};
		int evencount=0;
		int oddcount=0;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
			
		}
		System.out.println("count of even numbers : "+evencount);
		System.out.println("count of odd numbers : "+oddcount);

	}

}
