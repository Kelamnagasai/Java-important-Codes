package com.PracticeArrays;
import java.util.Scanner;
public class SpecificElementArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int[] a = {10,20,30,40,50};
		
		boolean status = false;
		for(int a1:a) {
			if(a1==n) {
			status = true;
			break;
			}
			
		}
		
		if(status) {
			System.out.println("Element is present in the array : "+n);
		}else {
			System.out.println("Element is not present in the array ");
		}
	
		
		sc.close();

	}

}
