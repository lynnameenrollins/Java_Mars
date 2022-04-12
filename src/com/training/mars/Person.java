package com.training.mars;

public class Person {

		private int height;  //instance variable
		private int weight; //instance variable
		
		//if we do not write a construct, java will use a default one 
		public Person() {
			System.out.println("Person object getting created ...");
		}
		
		//we can overload the constructor
		public Person(int height, int weight) {
			this.height = height;
			this.weight = weight;
		}
		public int getHeight() {
			return height;
		}


		public void setHeight(int height) {
			this.height = height;
		}


		public int getWeight() {
			return weight;
		}


		public void setWeight(int weight) {
			this.weight = weight;
		}


		public String getPersonInfo() {  //instance method
			return "Person's height is: " + this.height  + " and weight is: " + this.weight;
		}
	}

