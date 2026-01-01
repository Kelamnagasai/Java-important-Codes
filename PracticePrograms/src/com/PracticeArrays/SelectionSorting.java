package com.PracticeArrays;

public class SelectionSorting {

	public static void main(String[] args) {
		
		int arr[] = {40,30,10,20,50,5,3};
		
		//we have to find the minimum value in the array for this we take min
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			int min=i; //0 1 2 5 6
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			
			//now we have to do sorting for this we need 
			temp=arr[i];
			arr[i] = arr[min];
			arr[min]=temp;
			
		}
		
		System.out.println("after sorting");
		for(int a : arr) {
			System.out.print(a+" ");
		}

	}

}
