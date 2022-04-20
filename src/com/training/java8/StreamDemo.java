package com.training.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.training.collections.Student;
import com.training.mars.Employee;

public class StreamDemo {
	public static void main(String args [ ] ){
		List <Integer> numbers = Arrays.asList(2,5,7,9,3,6,10,4); //Creating a list of numbers
		
//		Stream<Integer> numbersStream = numbers.stream();  //Creating a stream on numbers collection
//		
//		Stream <Integer> squaredValue =numbersStream.map((a) -> a*a); //call intermediate map method on number stream
//		
//		List <Integer>updatedNumbers = squaredValue.collect(Collectors.toList());
//		System.out.println(updatedNumbers);
//		
		System.out.println(numbers);
		//in one line
		List<Integer> newNumbers =numbers.stream().map(a ->a*a).collect(Collectors.toList());
		System.out.println(newNumbers);
		
		//Primitive and corresponding class, for Autoboxing
//		int = Integer;
//		double = Double;
//		char = Character;
//		boolean = Boolean;
		
		List<Integer> sortedNumbers =numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNumbers);
		
		List<Integer> sortedsquareNumbers =numbers.stream().map(a ->a*a).sorted().collect(Collectors.toList());
		System.out.println(sortedsquareNumbers);
		
		List <Integer> evenNumbers = numbers.stream().filter(x->(x%2 ==0)).sorted().collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		//forEach is a loop, it is a consumer.
//		numbers.stream().filter(x->(x%2 ==0)).sorted().forEach(y-> System.out.println(y));
		
		//another way to write the above statement
		numbers.stream().filter(x->(x%2 ==0)).sorted().forEach(System.out:: println);
		
		//reduce will take all elements of collection and perfom an operation to return a single value
		//So this statement will add the even numbers
		int sumEven = numbers.stream().filter(x->(x%2 ==0)).reduce(0, (ans,y) -> ans +y);
		System.out.println("Sum of the even numbers is: " +sumEven);
		
		
		//For Strings
		List <String> strings = Arrays.asList("Peter", "Paul", "Mary"); //Creating a list of strings
		List<String> helloStrings =strings.stream().map(a->"Hello " + a).collect(Collectors.toList());
		System.out.println(helloStrings);
		List<String> sortedStrings =strings.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedStrings);

		strings.stream().map(a->  a + ", how are you?").forEach(System.out:: println);
		
	    List <String> pNames = strings.stream().filter(x-> x.contains("P")).sorted().collect(Collectors.toList());
	    System.out.println(pNames);
	    
	    String concatedOutput = strings.stream().filter(x-> x.contains("P")).reduce(" ", (ans, y)-> ans + y);

	    System.out.println(concatedOutput);
	    
	    List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
	    String result = letters
	    		  .stream()
	    		  .reduce(
	    		    "", (partialString, element) -> partialString.toUpperCase() + element.toUpperCase());
	    
	    System.out.println("Result: " + result);
	    
	    List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
	    int computedAges = ages.parallelStream().reduce(0, (a, b) -> a + b, Integer::sum);
	    System.out.println(computedAges);
	    
	    //for Employee class

	List<Employee> studentList = new ArrayList<>();	
	Employee emp1=  new Employee("Peter", "Pan", "CEO", 100000.00, 1234);
	Employee emp2=   new Employee("Harry", "Potter", "Wizard", 200000.00, 1238);
	Employee emp3=  new Employee("Hermione", "Granger", "Muggle", 250000.00, 1245) ;
	Employee emp4=  new Employee("John", "Rockefeller", "Manager", 70000.00, 2347);
	Employee emp5=  new Employee("John", "Goodman", "Technician", 50000.00, 2397);
	Employee emp6=  new Employee("Jennifer", "Smith", "Manager", 120001.00, 5347);

	List<Employee> empList = new ArrayList<>();	
	 empList.add(emp1);
	 empList.add(emp2);	
	 empList.add(emp3);
	 empList.add(emp4);
	 empList.add(emp5);
	 empList.add(emp6);
	 
	 System.out.println("----Employee Making over 100,000---");
	 List<Employee> empFilter100K =empList.stream().filter(x->x.getSalary()>100000).collect(Collectors.toList());
		for (Employee emp: empFilter100K) {
			System.out.println("Salary: $" +emp.getSalary() + "   " + emp.getFirstName() +" " +  emp.getLastName() );
		}
		
		System.out.println("----Employee Sorted by Salary---");
		List<Employee> sortedEmpbySalary =empList.stream().sorted(Comparator.comparingDouble(Employee:: getSalary)).collect(Collectors.toList());
		for (Employee Emp: sortedEmpbySalary) {
			System.out.println("Salary: $" +Emp.getSalary() + "   " + Emp.getFirstName() +" " +  Emp.getLastName() );
		}
		System.out.println("----Employee Sorted by Last Name---");
		List<Employee> sortedEmpbyLastName =empList.stream().sorted(Comparator.comparing(Employee:: getLastName)).collect(Collectors.toList());
		for (Employee Emp: sortedEmpbyLastName) {
			System.out.println(Emp.getLastName() + "  Salary: $" +Emp.getSalary());
		}
		System.out.println("----Employee Sorted by Empoyee Number---");
		List<Employee> sortedEmpbyEmpNumber =empList.stream().sorted(Comparator.comparingInt(Employee:: getEmpNumber)).collect(Collectors.toList());
		
		
		
		for (Employee Emp: sortedEmpbyEmpNumber) {
			System.out.println(Emp.getEmpNumber() + ": " + Emp.getLastName() + "  Salary: $" +Emp.getSalary());
		}
		
		System.out.println("----Using forEach on Employee to get salary over $150000---");
		empList.stream().filter(x->x.getSalary()>150000).forEach(emp -> System.out.println(emp.getLastName() + " Salary: $" + emp.getSalary()));
		
		int totalSalaries = empList.stream().reduce(0, (ans, emp)->ans + (int)emp.getSalary(), Integer:: sum);
		System.out.println("Total of all salaries: " + totalSalaries);
		
		double totalSalariesDouble = empList.stream().reduce(0.0, (ans, emp)->ans + emp.getSalary(), Double:: sum);
		System.out.println("Total of all salaries: " + totalSalariesDouble);


		List<String> capEmp =empList.stream().map(a -> "Hello " + a.getFirstName()+  ", Welcome to Mars! ").collect(Collectors.toList());
		System.out.println(capEmp);
		
		
		//Printing using forEach
		System.out.println("----Using Map and For Each to print a welcome message---");
		empList.stream().map(a -> "Hello " + a.getFirstName()+  ", Welcome to Mars! ").forEach(System.out:: println);
}
}


//Intermediate operation: map, filter, sorted
//Terminal operation: collect, forEach, reduce

//Demonstrate different stream operations in a collection of Strings