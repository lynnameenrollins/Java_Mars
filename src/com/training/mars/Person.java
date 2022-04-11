package com.training.mars;

public class Person {

		private int height;  //instance variable
		private int weight; //instance variable
		
		
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

