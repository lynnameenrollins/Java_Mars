package com.training.mars;
import java.util.Scanner;
public class SortIntArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numToSort;
		//allow user to specify how many integers to sort
		System.out.println("Input the number of integers to be sorted");
		numToSort = scanner.nextInt();

		// allow the user to input the integers
		int [] intArray = new int[numToSort];
		for (int i = 0; i< numToSort; i++) {
				System.out.println("Enter integer[" + i + "] to store: ");
				intArray[i] = scanner.nextInt();
		}
		
		//print out the original array
		System.out.println("---------------------------");
		System.out.print("Original array: { ");
		for (int i = 0; i< numToSort; i++) {
				System.out.print(+ intArray[i] + " ");
		}
		System.out.println("}");
	
		//sort the numbers
		for (int i = 0; i< numToSort; i++) {
			for (int j = i+1; j< numToSort; j++) {
					int temp = 0;
						if(intArray[i]> intArray[j]) {
							temp = intArray[i];
							intArray[i] = intArray[j];
							intArray[j] = temp;

						}
				}
		}
		
		//print out the sorted array
		System.out.println("---------------------------");
		System.out.print("Sorted array: { ");
		for (int i = 0; i< numToSort; i++) {
				System.out.print(+ intArray[i] + " ");
		}
		System.out.println("}");
	}
}
