package com.programs;

public class CurrentAccount extends BankAccount1 {
	
public void deposit(int amount) {
	System.out.println("Deposit amount is more than 50000");
		System.out.println("amount deposited in current account");
	}
	
	public void withdraw() {
		System.out.println("minimum withdrawl is 500");
		System.out.println("amount withdraw from current account");
	}

}
