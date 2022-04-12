package com.training.mars;

import java.util.Scanner;

public class BasicsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = scanner.nextInt();
		
		if (age<18) {
			System.out.println("Not eligible to vote");
	
		}
		else {
			System.out.println("Eligible to Vote!");
		}
		scanner.close();
	}
	
	
}


