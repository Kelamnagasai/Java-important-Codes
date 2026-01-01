package com.PracticeArrays;
import java.util.Scanner;
public class CountingPositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array elements");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter array elements ");
	
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int positivecount=0;
		int negativecount=0;
		int zerocount=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				positivecount++;
			}else if(arr[i]<0) {
				negativecount++;
			}else {
				zerocount++;
			}
		}
		
	System.out.println("positive numbers count: "+positivecount);
	System.out.println("negative numbers: "+negativecount);
	System.out.println("zero numbers count: "+zerocount);
		
		sc.close();

	}

}
