package com.programs;
import java.util.Scanner;
public class TestBankAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount b = new BankAccount();
		b.setBalance(1000);

		System.out.println("Enter amount for deposit");
		int depositamount = sc.nextInt();
		b.deposit(depositamount);
		System.out.println("Available Balance : "+b.getBalance());
		
		System.out.println("Enter amount for withdraw");
		int withdrawamount = sc.nextInt();
		b.withdraw(withdrawamount);

		System.out.println("Remaining Balance : "+b.getBalance());
		
		sc.close();

	}
	

}
