package com.training.collections;

import java.util.Objects;

public  class Student {
	private String name;
	private int RollNo;
	private String grade;
	
	public Student(String name, int rollNo, String grade) {
		super();
		this.name = name;
		RollNo = rollNo;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(RollNo, grade, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return RollNo == other.RollNo && Objects.equals(grade, other.grade) && Objects.equals(name, other.name);
		
//		@Overrride
//		public int compareTo(Student o) {
//			
//			return this.getName().compartTo(stud.getName());
//						
//		}
	}
	
	

}
