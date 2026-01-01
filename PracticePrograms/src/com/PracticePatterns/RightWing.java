package com.PracticePatterns;

public class RightWing {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int s=5;s>=i;s--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
