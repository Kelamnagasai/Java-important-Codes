package com.AccentureCodes;

public class LargestElement {

	public static void main(String[] args) {
		int[] arr = {10,20,15,40,60};
		
		int max = arr[0];
		
		for(int a :arr) {
			if(a>arr[0]) {
				max=a;
				
			}
		}
		System.out.print(max);

	}

}
