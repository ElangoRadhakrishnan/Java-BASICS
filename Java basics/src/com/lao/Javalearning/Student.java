package com.lao.Javalearning;

public class Student {
	//Data
	Long Rollno= 13655587L;
	String StudentName= "Anil";
	//Function
	public void getStudent() {
		System.out.println("The Student Rollno is " + Rollno);
		System.out.println("The Student Name is "+ StudentName);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object
		Student stu = new Student();
		stu.getStudent();

	}

}
