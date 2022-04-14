package com.training.inheritance;

public abstract class Account {
	
	//Any child class must declare this method.
	public abstract double getBalanceAmount(); //abstract method, only declaration.  Therefore this class must be abstract.
	
	public String accountType(){ //concrete method in an abstract class
		return "savings";
	}

}
