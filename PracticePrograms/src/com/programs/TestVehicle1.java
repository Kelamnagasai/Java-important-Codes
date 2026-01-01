package com.programs;

public class TestVehicle1 {

	public static void main(String[] args) {
		
		Vehicle1 v = new Car1();
		v.start();
		v.fuelType();
		
		Vehicle1 v1 = new Bike();
		v1.start();
		v1.fuelType();

	}

}
