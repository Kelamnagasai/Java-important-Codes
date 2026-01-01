package com.PracticeArrays;

public class StringArrays {

	public static void main(String[] args) {
		
		String[][] names = new String[5][5];
		
		names[0][0] ="sai";
		names[0][1] = "arjun";
		
		names[1][0] = "abc";
		names[1][1] = "gdf";
		names[2][0] = "name";
		names[2][1] = "efg";
		
		names[3][0] = "tcs";
		names[3][1] = "info";
		
		names[4][0] = "wipro";
		names[4][1] = "afc";
		
		for(String[] name : names) {
		for(String n:name) {
				System.out.print(n+" ");
			}
		System.out.println();
		}
		

	}
}


