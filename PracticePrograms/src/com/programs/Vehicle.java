package com.programs;

public class Vehicle {
	int speed = 100;
	public void move() {
		System.out.println("vehicle is moving ");
		
	}
}
	
	
     class Car extends Vehicle{
		String brand = "Benz";
		
	public void showDetails() {
		System.out.println("speed is very good");
	}
		
	}
      class Main{
	public static void main(String[] args) {
	Car c  = new Car();
	System.out.println("Brand : "+c.brand);
	System.out.println("speed : "+c.speed);
	c.showDetails();
	
	

	}

}

