package com.training.mars;

public class MyClass {
	static int age; //if the variable is static and not local it does not need to be initialized
	public static void main(String args[])  {
		System.out.println("This is my first JAVA file");
		System.out.println("And here is another line of code");

		byte number = 12;

		System.out.println("Byte Value is" + number);
		
		int num1 = 8;
		int result = 0;
		String str = null;
		try {
			//result = num1/0; //runtime exception
			str.length();
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		catch(NullPointerException e) {
			System.out.println("String cannot be null.  " + e.getMessage());
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Generic Exception");
		}
		
		
		
		System.out.println("Result is " + result);
		short shortvalue = 48;
		int intvalue = 89;
		byte newByte = (byte)intvalue; //Explicit typecasting

		int newInt = shortvalue;  //implicit typecasting

		int charValue = 'A';

		System.out.println("Character value is  " + charValue);

		//int age = 27; //local variable should always be initialized
		System.out.println("Age of the person is " + age);

		Person p1 = new Person();
		p1.setHeight(170);
		p1.setWeight(80);

		System.out.println(p1.getPersonInfo());

		Person p2 = new Person();
		p2.setHeight(190);
		p2.setWeight(89);
		System.out.println(p2.getPersonInfo());

		Person p3 = new Person(165, 70);
		System.out.println(p3.getPersonInfo());

		Employee e1 = new Employee();
		e1.setFirstName("Peter");
		e1.setLastName("Pan");
		e1.setTitle("Resident Child");
		e1.setEmpNumber(1234);
		e1.setSalary(55000.00);

		System.out.println(e1.displayEmployeeInfo());
		
		try {
			if(p1.getWeight() > 75) {
			throw new MyException("Thrown Exception: Weight should be less than 75 in this category");
			}
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally block will always execute!!!");
		}

	}

}


//Description for class above
//Access specifiers: public - anyone can access, even outside application
//static lets you call method without the object
//void means that it returns nothing
//function can take an array of strings
//main gets called from jvm, main must always be declared as it is above, only thing you can change is the name of the string args[]

