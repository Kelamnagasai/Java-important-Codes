package com.programs;

class LivingBeing{
	public void breath() {
		System.out.println("humans breath air");
	}
	
}

class Animals extends LivingBeing{
	public void eat() {
		System.out.println("Animal eats meat");
	}
	
}

public class Cat extends Animals{
	public void meow() {
		System.out.println("cat makes meow meow sound");
	}

	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		c.breath();
		c.eat();
	
		

	}

}
