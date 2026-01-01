package com.PracticeArrays;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("size of the array : "+arr.length);
		System.out.println("Enter array elements");
		
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean status = false;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				status = true;
				break;
			}
			for(int j=2;j<=arr[i];j++) {
				status = false;
				break;
			}
		}
		
		

	}

}
