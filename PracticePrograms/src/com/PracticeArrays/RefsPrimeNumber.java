package com.PracticeArrays;
import java.util.Scanner;
public class RefsPrimeNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	
	int[] arr = new int[n];
	System.out.println(arr.length);
	System.out.println("Read the elements "+ n +" times");
	
	
	for(int i=0;i<n;i++) {
	arr[i] = sc.nextInt();
	
	}
		
	for(int i=0;i<n;i++) {  //Reading elements from scanner
		boolean status = true;
		
		if(arr[i] <= 0 || arr[i] == 1) {
			status = false;
		}
		
		
		for(int j=2;i<=arr[i];j++) {
			
			if(i%j==0) {
			status = false;
			break;
			}
			
			if(status) {
				System.out.println(arr[i]);
			}
		}
		
	}
	
	

	sc.close();

	}

}
