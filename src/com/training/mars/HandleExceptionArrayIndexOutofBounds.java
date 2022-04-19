package com.training.mars;

import java.util.Scanner;

public class HandleExceptionArrayIndexOutofBounds {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int [] numberList = new int[10];
		
		for (int i = 0; i<10; i++) {
			System.out.println("Please enter a positive number:");

			numberList[i]= scanner.nextInt();
		}

		try {
			System.out.println("The 11th number is " + numberList[11]);
		}
	
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
