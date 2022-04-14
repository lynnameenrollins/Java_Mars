package com.training.inheritance;

public class Car extends Vehicle{
	//all public properties of parent class are available
	
	static int noOfWheels;
	
	public Car() {
		super(); //this will be done even if super is not written
		System.out.println("Car constructor");
	}
	
	
	public void getValues() {
		brakeType= "Disc";
		 color = "Blue";
		 speed = 150;
		 System.out.println("Color: " + color + " BrakeType: " + brakeType + " Speed: " + speed);
		 getTopSpeed();
	}
	
	@Override	
	public int getTopSpeed() { //Method overridden
		return 200;
	}
		

	}


