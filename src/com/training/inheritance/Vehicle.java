package com.training.inheritance;

public class Vehicle {
	
	 String brakeType;
	 String color ;
	 String model;
	 String make ;
	 int yearOfManufacture;
	 int speed = 140;
	 
	 public Vehicle() {
		 System.out.println("Vehicle constructor.");
	 }
	 public int getTopSpeed() {
		 speed = 140;
		 return speed;
		
	 }
	 

}
