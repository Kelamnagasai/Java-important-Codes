package com.PracticeStrings;
import java.util.Scanner;
public class Admin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String uname = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		
		if(uname.equalsIgnoreCase("Nagasai") && password.equals("Sai@1432")) {
			System.out.println("Welcome admin");
		}else {
			System.out.println("Invalid credntials");
		}
		
		sc.close();

	}

}
