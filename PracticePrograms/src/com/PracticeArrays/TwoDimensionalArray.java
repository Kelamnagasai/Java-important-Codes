package com.PracticeArrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int[][] a = new int[7][5]; //4*3=12
//		System.out.println(a.length);
//		System.out.println(a[0].length);
//		System.out.println(a[1].length);
//		System.out.println(a[2].length);
		
		//System.out.println(a);
		
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 20;
		a[1][1] = 30;
		a[1][2] = 30;
		a[2][0] = 40;
		a[2][1] = 50;
		a[2][2] = 30;
		a[3][0] = 70;
		a[3][1] = 80;
		a[3][2] = 30;
		
		
		
		
		//representation
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			
		}
		
	
	

	}

}
