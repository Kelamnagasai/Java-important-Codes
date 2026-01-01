package com.AccentureCodes;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int[] arr = {10,20,30};
		
		int sum=0;
		for(int a:arr) {
			sum=sum+a;
		}
		System.out.println(sum);
	}

}
