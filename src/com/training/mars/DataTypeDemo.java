package com.training.mars;

public class DataTypeDemo {

	public static void main(String[] args) {
		
		//Two ways of declaring a string
		String firstName = new String("John");  // creating a string object, overloading (so that is why String literals were created)
		String secondName = new String("John");
		
		System.out.println(firstName.equals(secondName));
		System.out.println(firstName == secondName);
		
		//saves memory
		String name = "John"; // creating a string literal
		String myName = "John";  //This string will not be created again.  myName and name point to the same content
		
		System.out.println(name.equals(myName)); //compares content
		System.out.println(name ==myName); //compares references

		//strings are immutable
		name.concat(" Doe");
		
		System.out.println("New Name: " + name);
		
		String fullName = name.concat(" Smith");
		System.out.println("Full Name: " + fullName);
		
		int[] marks = new int[5];
		
		for (int i = 0; i<marks.length; i++){
			marks[i]=2*i + 40 ;//just to generate some marks
		}
		for (int i = 0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("----------------------------------------------");
		
		int[][] numbers = new int[3][]; //must give number of rows, but columns can be blank
		
		numbers[0]= new int [4]; //four columns in first row
		numbers[1] = new int[5]; //five columns in second row
		numbers[2] = new int[4]; //four columns in third row
		System.out.println("numbers.length " + numbers.length);
		for(int i=0; i< numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				numbers[i][j] = i* 4 + j;
			}
		}
		
		for(int i=0; i< numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
