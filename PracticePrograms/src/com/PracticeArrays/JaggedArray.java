package com.PracticeArrays;

public class JaggedArray {

	public static void main(String[] args) {
		
		int[][] numbers = new int[2][]; //0,1  jagged array means array inside array
		
		
		numbers[0] =  new int[3];  //0,1,2
		
		numbers[1] = new int[4]; //0,1,2,3
		
		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		
		numbers[1][0] = 20;
		numbers[1][1] = 30;
		numbers[1][2]=  20;
		numbers[1][3] = 40;
		
		
//		for(int[] num:numbers) {
//			for(int n :num) {
//				System.out.print(n+" ");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;i<numbers[i].length;j++) {
				System.out.println(numbers[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
