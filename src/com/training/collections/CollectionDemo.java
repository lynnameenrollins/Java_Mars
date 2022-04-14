package com.training.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		//Set <Integer> values = new HashSet<>(); //declaring that all values will be integers
		System.out.println("--------------ARRAY LIST OF INT--------------------------------");
		List <Integer> values = new ArrayList<>();

		values.add(2);
		values.add(6);
		values.add(8);
		values.add(3);
		values.add(2);

		for(int num :  values) {
			System.out.println(num);
		}
		List <String> names = new ArrayList<>();
		System.out.println("--------------ARRAY LIST OF STRING--------------------------------");
		names.add("Tom");
		names.add("Sarah");
		names.add("Larry");
		names.add("Jerry");
		names.add("Peter");

		for(String name :  names) {
			System.out.println(name);
		}

		System.out.println("-----------LIST WITH OBJECT STUDENT-----------------------------------");
		Student stud1 = new Student("Sarah", 12, "B");
		Student stud2 = new Student("Marc", 14, "C");
		Student stud3 = new Student("Julie", 15, "B");
		Student stud4 = new Student("Becky", 23, "A");

		List<Student> studentList = new ArrayList<>();	
		studentList.add(stud1);
		studentList.add(stud2);	
		studentList.add(stud3);
		studentList.add(stud4);

		for (Student student: studentList) {
			System.out.println(student.getName());
		}
		System.out.println("------------MAP EXAMPLE----------------------------------");
		Map <String, Student>studentMap = new HashMap();
		studentMap.put("1", stud1);
		studentMap.put("2", stud2);
		studentMap.put("3", stud3);
		studentMap.put("4", stud4);
		

		for(Map.Entry<String, Student> entry: studentMap.entrySet()) {
			String key = entry.getKey();
			Student student = entry.getValue();
			System.out.println(key + ".  NAME: " +student.getName()+ " GRADE: " + student.getGrade());
		}

		System.out.println("------------STUDENT SET EXAMPLE- FIX DUPLICATE--------------------------------");
		
		Set <Student> studentSet = new HashSet<>();
		
		
		studentSet.add(stud1);
		studentSet.add(stud2);
		studentSet.add(stud3);
		studentSet.add(stud4);
		
		//Putting in a check to see if student already exists
		
		Student stud5 = new Student("Sarah", 12, "B");
		Student stud6 = new Student("Lisa", 15, "B");

		checkForNewStudent(stud5, studentSet);
		checkForNewStudent(stud6, studentSet);
		
		for (Student student: studentSet) {
			System.out.println(student.getName());
		}
		
		System.out.println("------------TREE SET SORTING--------------------------------");
			Set <String> names2 = new TreeSet<>();
			names2.add("Zak");
			names2.add("Bruce");
			names2.add("Adam");
			names2.add("Pete");
			
			for(String name: names2) {
				System.out.println(name);}
			}
	
			private static void checkForNewStudent(Student newStudent, Set<Student> studentSet) {
				int check = 0;
				System.out.println("In check for new student");
				
				for (Student student: studentSet) {
					if ((student.getName() == newStudent.getName()) && (student.getGrade() == newStudent.getGrade()) && (student.getRollNo() == newStudent.getRollNo()) ){
						System.out.println("Do not add student");
						check = 1;
					}		
				
			}
				if (check == 0) {
					studentSet.add(newStudent);
				}
	}

}