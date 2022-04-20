package com.training.mars;

public class Employee {
	private String firstName;
	private String lastName;
	private String title;
	private double salary;
	private int empNumber;
	
	public Employee(String firstName, String lastName, String title, double salary, int empNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.salary = salary;
		this.empNumber = empNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String displayEmployeeInfo() {  //instance method
		return "Employee: " + this.firstName + " " + this.lastName + " , " + this.title  + " makes $"+  this.salary + " per year.";
	}
	
}
