package com.programs;

public class Shape {
	int area;
	int length = 2;
	int bredth = 4;
	
	public int area() {
		area= length*bredth;
		return 0;
	}
}
	
	
	class Rectangle extends Shape{
		
		public int area(int length,int bredth) {
			this.length=length;
			this.bredth=bredth;
			return length* bredth;
		}
		
	}
	
	class Square extends Rectangle{
		public int areaSquare(int side) {
			int areaSquare = side*side;
			return areaSquare;
			
		}
		
	

	public static void main(String[] args) {
		Shape s = new Rectangle();
		int ar = s.area();
		System.out.println(ar);
		

	}
}


