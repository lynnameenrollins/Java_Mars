package com.training.inheritance;

public class InheritanceTest {

	public static void main(String[] args) {

		Car car1 = new Car();
		Vehicle car2 = new Car(); //Parent class reference can point to child class object
		Vehicle notCar = new Vehicle();
		
		car1.getValues();
		
		System.out.println((car2.getTopSpeed()));  //Dynamic polymorphism @runtime decides which method to call
		System.out.println((notCar.getTopSpeed()));
	}

}
