package com.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	}
}

//Intermediate operation: map, filter, sorted
//Terminal operation: collect, forEach, reduce

//Demonstrate different stream operations in a collection of Strings