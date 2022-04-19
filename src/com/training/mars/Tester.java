package com.training.mars;

public class Tester {
	
	static int x = 4;
	int y = 9;
	
	public Tester() {
		System.out.println(this.x);
		printVariables();
	}

	public static void printVariables() {
		System.out.print(x);
		System.out.print(y); // cannot access a non static variable from a static method
	}
	
	public static void main(String... args)
	{
		new Tester();
	}
}
