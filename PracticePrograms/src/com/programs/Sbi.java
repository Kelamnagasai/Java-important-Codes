package com.programs;

public class Sbi extends Bank {
	
	public int getRateOfInterest() {
		return 5;
	}
	
}
	
        class Hdfc extends Bank{
		public int getRateOfInterest() {
			return 6;
		}
	}
	
	class Icc extends Bank{
		public int getRateOfInterest() {
			
			return 7;
			
		}
		
	

	public static void main(String[] args) {
		 Bank b = new Sbi();
		int insterst = b.getRateOfInterest();
		System.out.println("Rate of Interest : "+insterst);
		
		Bank b1 = new Hdfc();
		System.out.println("Rate of interest : "+b1.getRateOfInterest());
		
		Bank b2 = new Icc();
		System.out.println("Rate of interest : "+b2.getRateOfInterest());

	}
}

	

	


