package com.programs;

public class TestBankAccount1 {

	public static void main(String[] args) {
		
		BankAccount1 b = new CurrentAccount();
		b.deposit(0);
		b.withdraw();
		
		
		BankAccount1 b1 = new SavingsAccount();
		b1.deposit(0);
		b1.withdraw();

	}

}
