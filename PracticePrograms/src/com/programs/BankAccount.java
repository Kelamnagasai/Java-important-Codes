package com.programs;
public class BankAccount {
	private int balance;
	 
	 
	
	public void deposit(int amount){
		if(amount>0) {
			balance += amount;
			System.out.println(amount+" Deposited successfully");
		}else {
			System.out.println("Deposit amount must be greater than 0");
		}
		
	}
	
	public void withdraw(int amount) {
		if(amount>100 && amount <= balance) {
			balance -= amount;
			
			System.out.println(amount+"Rs withdrawn successfully");
		}else {
			System.out.println("withdraw is not possible due to insufficient balance");
		}
	}
	
	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public int getBalance(){
		return balance;
	}

}
