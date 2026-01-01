package com.PracticeArrays;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int arr[] = {70,40,60,20,80,90,1};  //n-1=6-1=5
		
		System.out.println("Before sorting");
		for(int a :arr) {
			System.out.print(a+" ");
		}
		
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
					
				}
			
			}
			
			
			
		}
		
		System.out.println();
	
		System.out.println("after sorting");
		for(int a:arr) {
			System.out.print(a+" ");
		}


	}

}
