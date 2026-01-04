package com.DSAProblems;

public class MaxMin {

	public static void main(String[] args) {
	int[] arr = {3,5,1,9,2};
	
	int max=arr[0];
	int min =arr[0];
	
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}else if(arr[i]<min) {
			min=arr[i];
		}
	}
	
	System.out.println("maximum element : "+max);
	System.out.println("minimum element : "+min);

	}

}
  