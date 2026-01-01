package com.PracticeArrays;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println(arr.length);
		
		System.out.println("Read the Elements "+n+" times");
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Representing the elements"); 
		for(int i=0;i<n;i++) {
			boolean status = true;
			
			if(arr[i]<=0 || arr[i]==1) {
				status = false;
			}
			
			for(int j=2;j<=arr[i]/2;j++) {
				if(arr[i]%j==0) {
					status = false;
					break;
				}
				
				
				}
			if(status) {
				System.out.println(arr[i]);//5
			}
		}
		
		sc.close();
	
	}
}
