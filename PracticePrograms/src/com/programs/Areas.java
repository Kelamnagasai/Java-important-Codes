package com.programs;
import java.util.Scanner;
public class Areas {
	
	//Area of square
	public double getArea(float side) {
		return side*side;
	}
	
	//Area of rectangle
	public double getArea(long length,long breadth) {
		return length*breadth;
	}
	
	//Area of Circle
	public double getArea(double radius) {
		return Math.PI*radius*radius;
	}
	
	
	//Area of Triangle
	public double getArea(float base,double height) {
		return 0.5*base*height;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Areas a = new Areas();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side");
		float side = sc.nextFloat();
		double Arsq = a.getArea(side);
		System.out.println("Area of square : "+Arsq);
		
		System.out.println("Enter length");
		long length = sc.nextLong();
		System.out.println("Enter breadth");
		long breadth = sc.nextLong();
		double rct = a.getArea(length,breadth);
		System.out.println("Area of rectangle : "+rct);
		
		System.out.println("Enter radius");
		double radius = sc.nextDouble();
		double circle = a.getArea(radius);
		System.out.println("Area of circle is: "+circle);
		
		System.out.println("Enter base");
		float base = sc.nextFloat();
		System.out.println("Enter height");
		double height = sc.nextDouble();
		double trngle = a.getArea(base,height);
		System.out.println("Area of triangle : "+trngle);
		
		
	
		
	
		

	}

}
