package com.programs;
class Fish{
	
}
public class Dog extends Fish {
	public void sound() {
		System.out.println("Dog barks Bow Bow");
	}

	public static void main(String[] args) {
		Dog a = new Dog();
		System.out.println("Main method started: ");
		a.sound();
		
		

	}

}
