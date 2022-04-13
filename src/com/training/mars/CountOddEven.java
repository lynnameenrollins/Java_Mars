package com.training.mars;
import java.util.Scanner;
public class CountOddEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] numberList = new int[6];
		int countEven = 0;
		int countOdd = 0;
		
		for (int i = 0; i<6; i++) {
			System.out.println("Please enter a number:");
			numberList[i]= scanner.nextInt();
		}
		
		for (int i = 0; i< numberList.length; i++) {
			if (numberList[i] %2 == 0) {
				countEven++;
			}
			else {
				countOdd++;
			}
				
		}
		
		System.out.println("Count of Even numbers: " + countEven + "\nCount of Odd numbers: " + countOdd);

	}

}
