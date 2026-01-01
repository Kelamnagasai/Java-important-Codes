package com.PracticeArrays;
import java.util.Scanner;
public class FindingIndexValue {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	
	
		int[] arr = {10,20,30,50,70};
		
		int index=-1;
		for(int i=0;i<=arr.length;i++) {
			arr[i]=n;
			index=i;
			break;
		}
		
		if(index != -1) {
			System.out.println("element found at index : "+index);
		}else {
			System.out.println("element not found");
		}
		sc.close();
		
	}

}
