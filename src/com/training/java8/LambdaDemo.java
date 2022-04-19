package com.training.java8;

import java.util.function.Function;

public class LambdaDemo {

	public static void main(String[] args) {
	
		//assigning to functional interface
		//	MyFuncInterface method =	( a) ->{ return ( 5*a);};
		Function method = (a)  ->{ int b =   5+(int)a; return b;};
	
	int result = (int) method.apply(2);
	System.out.println(result);

	}

		
}
