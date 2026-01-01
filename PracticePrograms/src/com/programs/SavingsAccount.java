package com.programs;

public class SavingsAccount extends BankAccount1{
	
	@Override
	public void deposit(int amount) {
		if(amount>5000) {
			System.out.println("amount deposited successfully");
		}else {
			System.out.println("amount is not enough for deposited");
		}
			}
	
	@Override
	public void withdraw() {
		
	}
	
	

}
