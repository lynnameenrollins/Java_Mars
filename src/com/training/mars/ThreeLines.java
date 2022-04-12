package com.training.mars;

public class ThreeLines {

public static void main(String [] args) {
		pattern();
		pattern2();

	}


private static void pattern() {
	System.out.println("Pattern 1 Output");
	for(int i = 1; i<=3; i++) {
		for (int j =1; j <= i; j++) {
			System.out.print(j);
	
		}
		System.out.println();
	}
}
private static void pattern2() {
	System.out.println("Pattern 2 Output");
	int count = 1;
	for(int i = 1; i<=3; i++) {
		for (int j =1; j <= i; j++) {
			System.out.print(count);
			count++;
	
		}
		System.out.println();
	}
}
}



