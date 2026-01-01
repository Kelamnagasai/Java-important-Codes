package com.multithreading;

public class TestThread extends Thread{
	

	public static void main(String[] args) {
		System.out.println("Main method started ");
		System.out.println("Current Thread : "+Thread.currentThread());
		
		TestThread t = new TestThread();
		t.start();
		
		
		for(int i=0;i<=20;i++) {
			System.out.println("main");
		}
		System.out.println("Main method ended");

	}
	public void run() {
		System.out.println("show method called");
		System.out.println("currentThread"+Thread.currentThread());
		
		for(int i=0;i<=20;i++) {
			System.out.println("show");
		}
		System.out.println("show method ended");
	}

}
